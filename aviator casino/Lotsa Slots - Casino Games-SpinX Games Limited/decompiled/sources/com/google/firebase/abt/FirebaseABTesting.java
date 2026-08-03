package com.google.firebase.abt;

/* loaded from: classes3.dex */
public class FirebaseABTesting {
    static final java.lang.String ABT_PREFERENCES = "com.google.firebase.abt";
    static final java.lang.String ORIGIN_LAST_KNOWN_START_TIME_KEY_FORMAT = "%s_lastKnownExperimentStartTime";
    private final com.google.firebase.inject.Provider<com.google.firebase.analytics.connector.AnalyticsConnector> analyticsConnector;
    private java.lang.Integer maxUserProperties = null;
    private final java.lang.String originService;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface OriginService {
        public static final java.lang.String INAPP_MESSAGING = "fiam";
        public static final java.lang.String REMOTE_CONFIG = "frc";
    }

    public FirebaseABTesting(android.content.Context context, com.google.firebase.inject.Provider<com.google.firebase.analytics.connector.AnalyticsConnector> provider, java.lang.String str) {
        this.analyticsConnector = provider;
        this.originService = str;
    }

    public void replaceAllExperiments(java.util.List<java.util.Map<java.lang.String, java.lang.String>> list) throws com.google.firebase.abt.AbtException {
        throwAbtExceptionIfAnalyticsIsNull();
        if (list == null) {
            throw new java.lang.IllegalArgumentException("The replacementExperiments list is null.");
        }
        replaceAllExperimentsWith(convertMapsToExperimentInfos(list));
    }

    public void removeAllExperiments() throws com.google.firebase.abt.AbtException {
        throwAbtExceptionIfAnalyticsIsNull();
        removeExperiments(getAllExperimentsInAnalytics());
    }

    public java.util.List<com.google.firebase.abt.AbtExperimentInfo> getAllExperiments() throws com.google.firebase.abt.AbtException {
        throwAbtExceptionIfAnalyticsIsNull();
        java.util.List<com.google.firebase.analytics.connector.AnalyticsConnector.ConditionalUserProperty> allExperimentsInAnalytics = getAllExperimentsInAnalytics();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<com.google.firebase.analytics.connector.AnalyticsConnector.ConditionalUserProperty> it = allExperimentsInAnalytics.iterator();
        while (it.hasNext()) {
            arrayList.add(com.google.firebase.abt.AbtExperimentInfo.fromConditionalUserProperty(it.next()));
        }
        return arrayList;
    }

    public void reportActiveExperiment(com.google.firebase.abt.AbtExperimentInfo abtExperimentInfo) throws com.google.firebase.abt.AbtException {
        throwAbtExceptionIfAnalyticsIsNull();
        com.google.firebase.abt.AbtExperimentInfo.validateAbtExperimentInfo(abtExperimentInfo);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Map<java.lang.String, java.lang.String> stringMap = abtExperimentInfo.toStringMap();
        stringMap.remove("triggerEvent");
        arrayList.add(com.google.firebase.abt.AbtExperimentInfo.fromMap(stringMap));
        addExperiments(arrayList);
    }

    public void validateRunningExperiments(java.util.List<com.google.firebase.abt.AbtExperimentInfo> list) throws com.google.firebase.abt.AbtException {
        throwAbtExceptionIfAnalyticsIsNull();
        removeExperiments(getExperimentsToRemove(getAllExperiments(), list));
    }

    private void replaceAllExperimentsWith(java.util.List<com.google.firebase.abt.AbtExperimentInfo> list) throws com.google.firebase.abt.AbtException {
        if (list.isEmpty()) {
            removeAllExperiments();
            return;
        }
        java.util.List<com.google.firebase.abt.AbtExperimentInfo> allExperiments = getAllExperiments();
        removeExperiments(getExperimentsToRemove(allExperiments, list));
        addExperiments(getExperimentsToAdd(list, allExperiments));
    }

    private java.util.ArrayList<com.google.firebase.analytics.connector.AnalyticsConnector.ConditionalUserProperty> getExperimentsToRemove(java.util.List<com.google.firebase.abt.AbtExperimentInfo> list, java.util.List<com.google.firebase.abt.AbtExperimentInfo> list2) {
        java.util.ArrayList<com.google.firebase.analytics.connector.AnalyticsConnector.ConditionalUserProperty> arrayList = new java.util.ArrayList<>();
        for (com.google.firebase.abt.AbtExperimentInfo abtExperimentInfo : list) {
            if (!experimentsListContainsExperiment(list2, abtExperimentInfo)) {
                arrayList.add(abtExperimentInfo.toConditionalUserProperty(this.originService));
            }
        }
        return arrayList;
    }

    private java.util.ArrayList<com.google.firebase.abt.AbtExperimentInfo> getExperimentsToAdd(java.util.List<com.google.firebase.abt.AbtExperimentInfo> list, java.util.List<com.google.firebase.abt.AbtExperimentInfo> list2) {
        java.util.ArrayList<com.google.firebase.abt.AbtExperimentInfo> arrayList = new java.util.ArrayList<>();
        for (com.google.firebase.abt.AbtExperimentInfo abtExperimentInfo : list) {
            if (!experimentsListContainsExperiment(list2, abtExperimentInfo)) {
                arrayList.add(abtExperimentInfo);
            }
        }
        return arrayList;
    }

    private boolean experimentsListContainsExperiment(java.util.List<com.google.firebase.abt.AbtExperimentInfo> list, com.google.firebase.abt.AbtExperimentInfo abtExperimentInfo) {
        java.lang.String experimentId = abtExperimentInfo.getExperimentId();
        java.lang.String variantId = abtExperimentInfo.getVariantId();
        for (com.google.firebase.abt.AbtExperimentInfo abtExperimentInfo2 : list) {
            if (abtExperimentInfo2.getExperimentId().equals(experimentId) && abtExperimentInfo2.getVariantId().equals(variantId)) {
                return true;
            }
        }
        return false;
    }

    private void addExperiments(java.util.List<com.google.firebase.abt.AbtExperimentInfo> list) {
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque(getAllExperimentsInAnalytics());
        int maxUserPropertiesInAnalytics = getMaxUserPropertiesInAnalytics();
        for (com.google.firebase.abt.AbtExperimentInfo abtExperimentInfo : list) {
            while (arrayDeque.size() >= maxUserPropertiesInAnalytics) {
                removeExperimentFromAnalytics(((com.google.firebase.analytics.connector.AnalyticsConnector.ConditionalUserProperty) arrayDeque.pollFirst()).name);
            }
            com.google.firebase.analytics.connector.AnalyticsConnector.ConditionalUserProperty conditionalUserProperty = abtExperimentInfo.toConditionalUserProperty(this.originService);
            addExperimentToAnalytics(conditionalUserProperty);
            arrayDeque.offer(conditionalUserProperty);
        }
    }

    private void removeExperiments(java.util.Collection<com.google.firebase.analytics.connector.AnalyticsConnector.ConditionalUserProperty> collection) {
        java.util.Iterator<com.google.firebase.analytics.connector.AnalyticsConnector.ConditionalUserProperty> it = collection.iterator();
        while (it.hasNext()) {
            removeExperimentFromAnalytics(it.next().name);
        }
    }

    private static java.util.List<com.google.firebase.abt.AbtExperimentInfo> convertMapsToExperimentInfos(java.util.List<java.util.Map<java.lang.String, java.lang.String>> list) throws com.google.firebase.abt.AbtException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.util.Map<java.lang.String, java.lang.String>> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(com.google.firebase.abt.AbtExperimentInfo.fromMap(it.next()));
        }
        return arrayList;
    }

    private void addExperimentToAnalytics(com.google.firebase.analytics.connector.AnalyticsConnector.ConditionalUserProperty conditionalUserProperty) {
        this.analyticsConnector.get().setConditionalUserProperty(conditionalUserProperty);
    }

    private void throwAbtExceptionIfAnalyticsIsNull() throws com.google.firebase.abt.AbtException {
        if (this.analyticsConnector.get() == null) {
            throw new com.google.firebase.abt.AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }

    private void removeExperimentFromAnalytics(java.lang.String str) {
        this.analyticsConnector.get().clearConditionalUserProperty(str, null, null);
    }

    private int getMaxUserPropertiesInAnalytics() {
        if (this.maxUserProperties == null) {
            this.maxUserProperties = java.lang.Integer.valueOf(this.analyticsConnector.get().getMaxUserProperties(this.originService));
        }
        return this.maxUserProperties.intValue();
    }

    private java.util.List<com.google.firebase.analytics.connector.AnalyticsConnector.ConditionalUserProperty> getAllExperimentsInAnalytics() {
        return this.analyticsConnector.get().getConditionalUserProperties(this.originService, "");
    }
}
