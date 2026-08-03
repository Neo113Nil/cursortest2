package com.facebook.internal;

/* compiled from: FeatureManager.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007H\u0007J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0004H\u0007J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002J\b\u0010\u0014\u001a\u00020\nH\u0002J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u0007H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R \u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/facebook/internal/FeatureManager;", "", "()V", "FEATURE_MANAGER_STORE", "", "featureMapping", "", "Lcom/facebook/internal/FeatureManager$Feature;", "", "checkFeature", "", "feature", "callback", "Lcom/facebook/internal/FeatureManager$Callback;", "defaultStatus", "", "disableFeature", "getFeature", "className", "getGKStatus", "initializeFeatureMapping", "isEnabled", "Callback", "Feature", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class FeatureManager {
    private static final java.lang.String FEATURE_MANAGER_STORE = "com.facebook.internal.FEATURE_MANAGER";
    public static final com.facebook.internal.FeatureManager INSTANCE = new com.facebook.internal.FeatureManager();
    private static final java.util.Map<com.facebook.internal.FeatureManager.Feature, java.lang.String[]> featureMapping = new java.util.HashMap();

    /* compiled from: FeatureManager.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/facebook/internal/FeatureManager$Callback;", "", "onCompleted", "", "enabled", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface Callback {
        void onCompleted(boolean enabled);
    }

    /* compiled from: FeatureManager.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.facebook.internal.FeatureManager.Feature.valuesCustom().length];
            iArr[com.facebook.internal.FeatureManager.Feature.RestrictiveDataFiltering.ordinal()] = 1;
            iArr[com.facebook.internal.FeatureManager.Feature.Instrument.ordinal()] = 2;
            iArr[com.facebook.internal.FeatureManager.Feature.CrashReport.ordinal()] = 3;
            iArr[com.facebook.internal.FeatureManager.Feature.CrashShield.ordinal()] = 4;
            iArr[com.facebook.internal.FeatureManager.Feature.ThreadCheck.ordinal()] = 5;
            iArr[com.facebook.internal.FeatureManager.Feature.ErrorReport.ordinal()] = 6;
            iArr[com.facebook.internal.FeatureManager.Feature.AnrReport.ordinal()] = 7;
            iArr[com.facebook.internal.FeatureManager.Feature.AAM.ordinal()] = 8;
            iArr[com.facebook.internal.FeatureManager.Feature.CloudBridge.ordinal()] = 9;
            iArr[com.facebook.internal.FeatureManager.Feature.PrivacyProtection.ordinal()] = 10;
            iArr[com.facebook.internal.FeatureManager.Feature.SuggestedEvents.ordinal()] = 11;
            iArr[com.facebook.internal.FeatureManager.Feature.IntelligentIntegrity.ordinal()] = 12;
            iArr[com.facebook.internal.FeatureManager.Feature.ModelRequest.ordinal()] = 13;
            iArr[com.facebook.internal.FeatureManager.Feature.EventDeactivation.ordinal()] = 14;
            iArr[com.facebook.internal.FeatureManager.Feature.OnDeviceEventProcessing.ordinal()] = 15;
            iArr[com.facebook.internal.FeatureManager.Feature.OnDevicePostInstallEventProcessing.ordinal()] = 16;
            iArr[com.facebook.internal.FeatureManager.Feature.IapLogging.ordinal()] = 17;
            iArr[com.facebook.internal.FeatureManager.Feature.IapLoggingLib2.ordinal()] = 18;
            iArr[com.facebook.internal.FeatureManager.Feature.ProtectedMode.ordinal()] = 19;
            iArr[com.facebook.internal.FeatureManager.Feature.MACARuleMatching.ordinal()] = 20;
            iArr[com.facebook.internal.FeatureManager.Feature.BlocklistEvents.ordinal()] = 21;
            iArr[com.facebook.internal.FeatureManager.Feature.FilterRedactedEvents.ordinal()] = 22;
            iArr[com.facebook.internal.FeatureManager.Feature.FilterSensitiveParams.ordinal()] = 23;
            iArr[com.facebook.internal.FeatureManager.Feature.ChromeCustomTabsPrefetching.ordinal()] = 24;
            iArr[com.facebook.internal.FeatureManager.Feature.Monitoring.ordinal()] = 25;
            iArr[com.facebook.internal.FeatureManager.Feature.IgnoreAppSwitchToLoggedOut.ordinal()] = 26;
            iArr[com.facebook.internal.FeatureManager.Feature.BypassAppSwitch.ordinal()] = 27;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private FeatureManager() {
    }

    @kotlin.jvm.JvmStatic
    public static final void checkFeature(final com.facebook.internal.FeatureManager.Feature feature, final com.facebook.internal.FeatureManager.Callback callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(feature, "feature");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        com.facebook.internal.FetchedAppGateKeepersManager fetchedAppGateKeepersManager = com.facebook.internal.FetchedAppGateKeepersManager.INSTANCE;
        com.facebook.internal.FetchedAppGateKeepersManager.loadAppGateKeepersAsync(new com.facebook.internal.FetchedAppGateKeepersManager.Callback() { // from class: com.facebook.internal.FeatureManager$checkFeature$1
            @Override // com.facebook.internal.FetchedAppGateKeepersManager.Callback
            public void onCompleted() {
                com.facebook.internal.FeatureManager.Callback callback2 = com.facebook.internal.FeatureManager.Callback.this;
                com.facebook.internal.FeatureManager featureManager = com.facebook.internal.FeatureManager.INSTANCE;
                callback2.onCompleted(com.facebook.internal.FeatureManager.isEnabled(feature));
            }
        });
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isEnabled(com.facebook.internal.FeatureManager.Feature feature) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(feature, "feature");
        if (com.facebook.internal.FeatureManager.Feature.Unknown == feature) {
            return false;
        }
        if (com.facebook.internal.FeatureManager.Feature.Core == feature) {
            return true;
        }
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        android.content.Context applicationContext = com.facebook.FacebookSdk.getApplicationContext();
        com.facebook.internal.FeatureManager featureManager = INSTANCE;
        java.lang.String string = applicationContext.getSharedPreferences(FEATURE_MANAGER_STORE, 0).getString(feature.toKey(), null);
        if (string != null) {
            com.facebook.FacebookSdk facebookSdk2 = com.facebook.FacebookSdk.INSTANCE;
            if (kotlin.jvm.internal.Intrinsics.areEqual(string, com.facebook.FacebookSdk.getSdkVersion())) {
                return false;
            }
        }
        com.facebook.internal.FeatureManager.Feature parent = feature.getParent();
        if (parent == feature) {
            return featureManager.getGKStatus(feature);
        }
        return isEnabled(parent) && featureManager.getGKStatus(feature);
    }

    @kotlin.jvm.JvmStatic
    public static final void disableFeature(com.facebook.internal.FeatureManager.Feature feature) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(feature, "feature");
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        android.content.SharedPreferences.Editor edit = com.facebook.FacebookSdk.getApplicationContext().getSharedPreferences(FEATURE_MANAGER_STORE, 0).edit();
        java.lang.String key = feature.toKey();
        com.facebook.FacebookSdk facebookSdk2 = com.facebook.FacebookSdk.INSTANCE;
        edit.putString(key, com.facebook.FacebookSdk.getSdkVersion()).apply();
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.internal.FeatureManager.Feature getFeature(java.lang.String className) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(className, "className");
        INSTANCE.initializeFeatureMapping();
        for (java.util.Map.Entry<com.facebook.internal.FeatureManager.Feature, java.lang.String[]> entry : featureMapping.entrySet()) {
            com.facebook.internal.FeatureManager.Feature key = entry.getKey();
            java.lang.String[] value = entry.getValue();
            int length = value.length;
            int i = 0;
            while (i < length) {
                java.lang.String str = value[i];
                i++;
                if (kotlin.text.StringsKt.startsWith$default(className, str, false, 2, (java.lang.Object) null)) {
                    return key;
                }
            }
        }
        return com.facebook.internal.FeatureManager.Feature.Unknown;
    }

    private final synchronized void initializeFeatureMapping() {
        java.util.Map<com.facebook.internal.FeatureManager.Feature, java.lang.String[]> map = featureMapping;
        if (map.isEmpty()) {
            map.put(com.facebook.internal.FeatureManager.Feature.AAM, new java.lang.String[]{"com.facebook.appevents.aam."});
            map.put(com.facebook.internal.FeatureManager.Feature.CodelessEvents, new java.lang.String[]{"com.facebook.appevents.codeless."});
            map.put(com.facebook.internal.FeatureManager.Feature.CloudBridge, new java.lang.String[]{"com.facebook.appevents.cloudbridge."});
            map.put(com.facebook.internal.FeatureManager.Feature.ErrorReport, new java.lang.String[]{"com.facebook.internal.instrument.errorreport."});
            map.put(com.facebook.internal.FeatureManager.Feature.AnrReport, new java.lang.String[]{"com.facebook.internal.instrument.anrreport."});
            map.put(com.facebook.internal.FeatureManager.Feature.PrivacyProtection, new java.lang.String[]{"com.facebook.appevents.ml."});
            map.put(com.facebook.internal.FeatureManager.Feature.SuggestedEvents, new java.lang.String[]{"com.facebook.appevents.suggestedevents."});
            map.put(com.facebook.internal.FeatureManager.Feature.RestrictiveDataFiltering, new java.lang.String[]{"com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager"});
            map.put(com.facebook.internal.FeatureManager.Feature.IntelligentIntegrity, new java.lang.String[]{"com.facebook.appevents.integrity.IntegrityManager"});
            map.put(com.facebook.internal.FeatureManager.Feature.ProtectedMode, new java.lang.String[]{"com.facebook.appevents.integrity.ProtectedModeManager"});
            map.put(com.facebook.internal.FeatureManager.Feature.MACARuleMatching, new java.lang.String[]{"com.facebook.appevents.integrity.MACARuleMatchingManager"});
            map.put(com.facebook.internal.FeatureManager.Feature.BlocklistEvents, new java.lang.String[]{"com.facebook.appevents.integrity.BlocklistEventsManager"});
            map.put(com.facebook.internal.FeatureManager.Feature.FilterRedactedEvents, new java.lang.String[]{"com.facebook.appevents.integrity.RedactedEventsManager"});
            map.put(com.facebook.internal.FeatureManager.Feature.FilterSensitiveParams, new java.lang.String[]{"com.facebook.appevents.integrity.SensitiveParamsManager"});
            map.put(com.facebook.internal.FeatureManager.Feature.EventDeactivation, new java.lang.String[]{"com.facebook.appevents.eventdeactivation."});
            map.put(com.facebook.internal.FeatureManager.Feature.OnDeviceEventProcessing, new java.lang.String[]{"com.facebook.appevents.ondeviceprocessing."});
            map.put(com.facebook.internal.FeatureManager.Feature.IapLogging, new java.lang.String[]{"com.facebook.appevents.iap."});
            map.put(com.facebook.internal.FeatureManager.Feature.Monitoring, new java.lang.String[]{"com.facebook.internal.logging.monitor"});
        }
    }

    private final boolean getGKStatus(com.facebook.internal.FeatureManager.Feature feature) {
        boolean defaultStatus = defaultStatus(feature);
        com.facebook.internal.FetchedAppGateKeepersManager fetchedAppGateKeepersManager = com.facebook.internal.FetchedAppGateKeepersManager.INSTANCE;
        java.lang.String key = feature.toKey();
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        return com.facebook.internal.FetchedAppGateKeepersManager.getGateKeeperForKey(key, com.facebook.FacebookSdk.getApplicationId(), defaultStatus);
    }

    private final boolean defaultStatus(com.facebook.internal.FeatureManager.Feature feature) {
        switch (com.facebook.internal.FeatureManager.WhenMappings.$EnumSwitchMapping$0[feature.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
                return false;
            default:
                return true;
        }
    }

    /* compiled from: FeatureManager.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b'\b\u0086\u0001\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001/B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\b\u001a\u00020\tJ\b\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.¨\u00060"}, d2 = {"Lcom/facebook/internal/FeatureManager$Feature;", "", "code", "", "(Ljava/lang/String;II)V", "parent", "getParent", "()Lcom/facebook/internal/FeatureManager$Feature;", "toKey", "", "toString", com.facebook.internal.AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN, "Core", "AppEvents", "CodelessEvents", "CloudBridge", "RestrictiveDataFiltering", "AAM", "PrivacyProtection", "SuggestedEvents", "IntelligentIntegrity", "ModelRequest", "ProtectedMode", "MACARuleMatching", "BlocklistEvents", "FilterRedactedEvents", "FilterSensitiveParams", "EventDeactivation", "OnDeviceEventProcessing", "OnDevicePostInstallEventProcessing", "IapLogging", "IapLoggingLib2", "Instrument", "CrashReport", "CrashShield", "ThreadCheck", "ErrorReport", "AnrReport", "Monitoring", "ServiceUpdateCompliance", "Megatron", "Elora", "Login", "ChromeCustomTabsPrefetching", "IgnoreAppSwitchToLoggedOut", "BypassAppSwitch", "Share", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum Feature {
        Unknown(-1),
        Core(0),
        AppEvents(65536),
        CodelessEvents(65792),
        CloudBridge(67584),
        RestrictiveDataFiltering(66048),
        AAM(66304),
        PrivacyProtection(66560),
        SuggestedEvents(66561),
        IntelligentIntegrity(66562),
        ModelRequest(66563),
        ProtectedMode(66564),
        MACARuleMatching(66565),
        BlocklistEvents(66566),
        FilterRedactedEvents(66567),
        FilterSensitiveParams(66568),
        EventDeactivation(66816),
        OnDeviceEventProcessing(67072),
        OnDevicePostInstallEventProcessing(67073),
        IapLogging(67328),
        IapLoggingLib2(67329),
        Instrument(131072),
        CrashReport(131328),
        CrashShield(131329),
        ThreadCheck(131330),
        ErrorReport(131584),
        AnrReport(131840),
        Monitoring(androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE),
        ServiceUpdateCompliance(196864),
        Megatron(262144),
        Elora(327680),
        Login(16777216),
        ChromeCustomTabsPrefetching(android.R.attr.theme),
        IgnoreAppSwitchToLoggedOut(android.R.id.background),
        BypassAppSwitch(android.R.style.Animation),
        Share(33554432);


        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.facebook.internal.FeatureManager.Feature.Companion INSTANCE = new com.facebook.internal.FeatureManager.Feature.Companion(null);
        private final int code;

        /* compiled from: FeatureManager.kt */
        @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[com.facebook.internal.FeatureManager.Feature.valuesCustom().length];
                iArr[com.facebook.internal.FeatureManager.Feature.Core.ordinal()] = 1;
                iArr[com.facebook.internal.FeatureManager.Feature.AppEvents.ordinal()] = 2;
                iArr[com.facebook.internal.FeatureManager.Feature.CodelessEvents.ordinal()] = 3;
                iArr[com.facebook.internal.FeatureManager.Feature.RestrictiveDataFiltering.ordinal()] = 4;
                iArr[com.facebook.internal.FeatureManager.Feature.Instrument.ordinal()] = 5;
                iArr[com.facebook.internal.FeatureManager.Feature.CrashReport.ordinal()] = 6;
                iArr[com.facebook.internal.FeatureManager.Feature.CrashShield.ordinal()] = 7;
                iArr[com.facebook.internal.FeatureManager.Feature.ThreadCheck.ordinal()] = 8;
                iArr[com.facebook.internal.FeatureManager.Feature.ErrorReport.ordinal()] = 9;
                iArr[com.facebook.internal.FeatureManager.Feature.AnrReport.ordinal()] = 10;
                iArr[com.facebook.internal.FeatureManager.Feature.AAM.ordinal()] = 11;
                iArr[com.facebook.internal.FeatureManager.Feature.CloudBridge.ordinal()] = 12;
                iArr[com.facebook.internal.FeatureManager.Feature.PrivacyProtection.ordinal()] = 13;
                iArr[com.facebook.internal.FeatureManager.Feature.SuggestedEvents.ordinal()] = 14;
                iArr[com.facebook.internal.FeatureManager.Feature.IntelligentIntegrity.ordinal()] = 15;
                iArr[com.facebook.internal.FeatureManager.Feature.ProtectedMode.ordinal()] = 16;
                iArr[com.facebook.internal.FeatureManager.Feature.MACARuleMatching.ordinal()] = 17;
                iArr[com.facebook.internal.FeatureManager.Feature.BlocklistEvents.ordinal()] = 18;
                iArr[com.facebook.internal.FeatureManager.Feature.FilterRedactedEvents.ordinal()] = 19;
                iArr[com.facebook.internal.FeatureManager.Feature.FilterSensitiveParams.ordinal()] = 20;
                iArr[com.facebook.internal.FeatureManager.Feature.ModelRequest.ordinal()] = 21;
                iArr[com.facebook.internal.FeatureManager.Feature.EventDeactivation.ordinal()] = 22;
                iArr[com.facebook.internal.FeatureManager.Feature.OnDeviceEventProcessing.ordinal()] = 23;
                iArr[com.facebook.internal.FeatureManager.Feature.OnDevicePostInstallEventProcessing.ordinal()] = 24;
                iArr[com.facebook.internal.FeatureManager.Feature.IapLogging.ordinal()] = 25;
                iArr[com.facebook.internal.FeatureManager.Feature.IapLoggingLib2.ordinal()] = 26;
                iArr[com.facebook.internal.FeatureManager.Feature.Monitoring.ordinal()] = 27;
                iArr[com.facebook.internal.FeatureManager.Feature.Megatron.ordinal()] = 28;
                iArr[com.facebook.internal.FeatureManager.Feature.Elora.ordinal()] = 29;
                iArr[com.facebook.internal.FeatureManager.Feature.ServiceUpdateCompliance.ordinal()] = 30;
                iArr[com.facebook.internal.FeatureManager.Feature.Login.ordinal()] = 31;
                iArr[com.facebook.internal.FeatureManager.Feature.ChromeCustomTabsPrefetching.ordinal()] = 32;
                iArr[com.facebook.internal.FeatureManager.Feature.IgnoreAppSwitchToLoggedOut.ordinal()] = 33;
                iArr[com.facebook.internal.FeatureManager.Feature.BypassAppSwitch.ordinal()] = 34;
                iArr[com.facebook.internal.FeatureManager.Feature.Share.ordinal()] = 35;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        Feature(int i) {
            this.code = i;
        }

        @Override // java.lang.Enum
        public java.lang.String toString() {
            switch (com.facebook.internal.FeatureManager.Feature.WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
                case 1:
                    return "CoreKit";
                case 2:
                    return "AppEvents";
                case 3:
                    return "CodelessEvents";
                case 4:
                    return "RestrictiveDataFiltering";
                case 5:
                    return "Instrument";
                case 6:
                    return "CrashReport";
                case 7:
                    return "CrashShield";
                case 8:
                    return "ThreadCheck";
                case 9:
                    return "ErrorReport";
                case 10:
                    return "AnrReport";
                case 11:
                    return "AAM";
                case 12:
                    return "AppEventsCloudbridge";
                case 13:
                    return "PrivacyProtection";
                case 14:
                    return "SuggestedEvents";
                case 15:
                    return "IntelligentIntegrity";
                case 16:
                    return "ProtectedMode";
                case 17:
                    return "MACARuleMatching";
                case 18:
                    return "BlocklistEvents";
                case 19:
                    return "FilterRedactedEvents";
                case 20:
                    return "FilterSensitiveParams";
                case 21:
                    return "ModelRequest";
                case 22:
                    return "EventDeactivation";
                case 23:
                    return "OnDeviceEventProcessing";
                case 24:
                    return "OnDevicePostInstallEventProcessing";
                case 25:
                    return "IAPLogging";
                case 26:
                    return "IAPLoggingLib2";
                case 27:
                    return "Monitoring";
                case 28:
                    return "Megatron";
                case 29:
                    return "Elora";
                case 30:
                    return "ServiceUpdateCompliance";
                case 31:
                    return "LoginKit";
                case 32:
                    return "ChromeCustomTabsPrefetching";
                case 33:
                    return "IgnoreAppSwitchToLoggedOut";
                case 34:
                    return "BypassAppSwitch";
                case 35:
                    return "ShareKit";
                default:
                    return "unknown";
            }
        }

        public final java.lang.String toKey() {
            return kotlin.jvm.internal.Intrinsics.stringPlus("FBSDKFeature", this);
        }

        public final com.facebook.internal.FeatureManager.Feature getParent() {
            int i = this.code;
            if ((i & 255) > 0) {
                return INSTANCE.fromInt(i & androidx.core.view.InputDeviceCompat.SOURCE_ANY);
            }
            if ((65280 & i) > 0) {
                return INSTANCE.fromInt(i & androidx.core.internal.view.SupportMenu.CATEGORY_MASK);
            }
            if ((16711680 & i) > 0) {
                return INSTANCE.fromInt(i & androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
            }
            return INSTANCE.fromInt(0);
        }

        /* compiled from: FeatureManager.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/facebook/internal/FeatureManager$Feature$Companion;", "", "()V", "fromInt", "Lcom/facebook/internal/FeatureManager$Feature;", "code", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final com.facebook.internal.FeatureManager.Feature fromInt(int code) {
                com.facebook.internal.FeatureManager.Feature[] valuesCustom = com.facebook.internal.FeatureManager.Feature.valuesCustom();
                int length = valuesCustom.length;
                int i = 0;
                while (i < length) {
                    com.facebook.internal.FeatureManager.Feature feature = valuesCustom[i];
                    i++;
                    if (feature.code == code) {
                        return feature;
                    }
                }
                return com.facebook.internal.FeatureManager.Feature.Unknown;
            }
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static com.facebook.internal.FeatureManager.Feature[] valuesCustom() {
            com.facebook.internal.FeatureManager.Feature[] valuesCustom = values();
            return (com.facebook.internal.FeatureManager.Feature[]) java.util.Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }
}
