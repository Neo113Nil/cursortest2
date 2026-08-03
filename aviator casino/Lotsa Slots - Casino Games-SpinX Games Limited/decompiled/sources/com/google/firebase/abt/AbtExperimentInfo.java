package com.google.firebase.abt;

/* loaded from: classes3.dex */
public class AbtExperimentInfo {
    static final java.lang.String EXPERIMENT_ID_KEY = "experimentId";
    static final java.lang.String TRIGGER_EVENT_KEY = "triggerEvent";
    static final java.lang.String VARIANT_ID_KEY = "variantId";
    private final java.lang.String experimentId;
    private final java.util.Date experimentStartTime;
    private final long timeToLiveInMillis;
    private final java.lang.String triggerEventName;
    private final long triggerTimeoutInMillis;
    private final java.lang.String variantId;
    static final java.lang.String EXPERIMENT_START_TIME_KEY = "experimentStartTime";
    static final java.lang.String TIME_TO_LIVE_KEY = "timeToLiveMillis";
    static final java.lang.String TRIGGER_TIMEOUT_KEY = "triggerTimeoutMillis";
    private static final java.lang.String[] ALL_REQUIRED_KEYS = {"experimentId", EXPERIMENT_START_TIME_KEY, TIME_TO_LIVE_KEY, TRIGGER_TIMEOUT_KEY, "variantId"};
    static final java.text.DateFormat protoTimestampStringParser = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", java.util.Locale.US);

    public AbtExperimentInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Date date, long j, long j2) {
        this.experimentId = str;
        this.variantId = str2;
        this.triggerEventName = str3;
        this.experimentStartTime = date;
        this.triggerTimeoutInMillis = j;
        this.timeToLiveInMillis = j2;
    }

    static com.google.firebase.abt.AbtExperimentInfo fromMap(java.util.Map<java.lang.String, java.lang.String> map) throws com.google.firebase.abt.AbtException {
        java.lang.String str;
        validateExperimentInfoMap(map);
        try {
            java.util.Date parse = protoTimestampStringParser.parse(map.get(EXPERIMENT_START_TIME_KEY));
            long parseLong = java.lang.Long.parseLong(map.get(TRIGGER_TIMEOUT_KEY));
            long parseLong2 = java.lang.Long.parseLong(map.get(TIME_TO_LIVE_KEY));
            java.lang.String str2 = map.get("experimentId");
            java.lang.String str3 = map.get("variantId");
            if (map.containsKey(TRIGGER_EVENT_KEY)) {
                str = map.get(TRIGGER_EVENT_KEY);
            } else {
                str = "";
            }
            return new com.google.firebase.abt.AbtExperimentInfo(str2, str3, str, parse, parseLong, parseLong2);
        } catch (java.lang.NumberFormatException e) {
            throw new com.google.firebase.abt.AbtException("Could not process experiment: one of the durations could not be converted into a long.", e);
        } catch (java.text.ParseException e2) {
            throw new com.google.firebase.abt.AbtException("Could not process experiment: parsing experiment start time failed.", e2);
        }
    }

    java.lang.String getExperimentId() {
        return this.experimentId;
    }

    java.lang.String getVariantId() {
        return this.variantId;
    }

    java.lang.String getTriggerEventName() {
        return this.triggerEventName;
    }

    long getStartTimeInMillisSinceEpoch() {
        return this.experimentStartTime.getTime();
    }

    long getTriggerTimeoutInMillis() {
        return this.triggerTimeoutInMillis;
    }

    long getTimeToLiveInMillis() {
        return this.timeToLiveInMillis;
    }

    private static void validateExperimentInfoMap(java.util.Map<java.lang.String, java.lang.String> map) throws com.google.firebase.abt.AbtException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : ALL_REQUIRED_KEYS) {
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new com.google.firebase.abt.AbtException(java.lang.String.format("The following keys are missing from the experiment info map: %s", arrayList));
        }
    }

    static void validateAbtExperimentInfo(com.google.firebase.abt.AbtExperimentInfo abtExperimentInfo) throws com.google.firebase.abt.AbtException {
        validateExperimentInfoMap(abtExperimentInfo.toStringMap());
    }

    java.util.Map<java.lang.String, java.lang.String> toStringMap() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("experimentId", this.experimentId);
        hashMap.put("variantId", this.variantId);
        hashMap.put(TRIGGER_EVENT_KEY, this.triggerEventName);
        hashMap.put(EXPERIMENT_START_TIME_KEY, protoTimestampStringParser.format(this.experimentStartTime));
        hashMap.put(TRIGGER_TIMEOUT_KEY, java.lang.Long.toString(this.triggerTimeoutInMillis));
        hashMap.put(TIME_TO_LIVE_KEY, java.lang.Long.toString(this.timeToLiveInMillis));
        return hashMap;
    }

    com.google.firebase.analytics.connector.AnalyticsConnector.ConditionalUserProperty toConditionalUserProperty(java.lang.String str) {
        com.google.firebase.analytics.connector.AnalyticsConnector.ConditionalUserProperty conditionalUserProperty = new com.google.firebase.analytics.connector.AnalyticsConnector.ConditionalUserProperty();
        conditionalUserProperty.origin = str;
        conditionalUserProperty.creationTimestamp = getStartTimeInMillisSinceEpoch();
        conditionalUserProperty.name = this.experimentId;
        conditionalUserProperty.value = this.variantId;
        conditionalUserProperty.triggerEventName = android.text.TextUtils.isEmpty(this.triggerEventName) ? null : this.triggerEventName;
        conditionalUserProperty.triggerTimeout = this.triggerTimeoutInMillis;
        conditionalUserProperty.timeToLive = this.timeToLiveInMillis;
        return conditionalUserProperty;
    }

    static com.google.firebase.abt.AbtExperimentInfo fromConditionalUserProperty(com.google.firebase.analytics.connector.AnalyticsConnector.ConditionalUserProperty conditionalUserProperty) {
        java.lang.String str;
        if (conditionalUserProperty.triggerEventName == null) {
            str = "";
        } else {
            str = conditionalUserProperty.triggerEventName;
        }
        return new com.google.firebase.abt.AbtExperimentInfo(conditionalUserProperty.name, java.lang.String.valueOf(conditionalUserProperty.value), str, new java.util.Date(conditionalUserProperty.creationTimestamp), conditionalUserProperty.triggerTimeout, conditionalUserProperty.timeToLive);
    }
}
