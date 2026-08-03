package io.appmetrica.analytics;

/* loaded from: classes.dex */
public class AppMetricaConfig {
    public final java.util.Map<java.lang.String, java.lang.Object> additionalConfig;
    public final java.lang.Boolean advIdentifiersTracking;
    public final java.lang.Boolean anrMonitoring;
    public final java.lang.Integer anrMonitoringTimeout;
    public final java.lang.String apiKey;
    public final java.lang.Integer appBuildNumber;
    public final java.util.Map<java.lang.String, java.lang.String> appEnvironment;
    public final java.lang.Boolean appOpenTrackingEnabled;
    public final java.lang.String appVersion;
    public final java.lang.Boolean crashReporting;
    public final io.appmetrica.analytics.ICrashTransformer crashTransformer;
    public final java.util.List<java.lang.String> customHosts;
    public final java.lang.Boolean dataSendingEnabled;
    public final java.lang.String deviceType;
    public final java.lang.Integer dispatchPeriodSeconds;
    public final java.util.Map<java.lang.String, java.lang.String> errorEnvironment;
    public final java.lang.Boolean firstActivationAsUpdate;
    public final android.location.Location location;
    public final java.lang.Boolean locationTracking;
    public final java.lang.Boolean logs;
    public final java.lang.Integer maxReportsCount;
    public final java.lang.Integer maxReportsInDatabaseCount;
    public final java.lang.Boolean nativeCrashReporting;
    public final io.appmetrica.analytics.PreloadInfo preloadInfo;
    public final java.lang.Boolean revenueAutoTrackingEnabled;
    public final java.lang.Integer sessionTimeout;
    public final java.lang.Boolean sessionsAutoTrackingEnabled;
    public final java.lang.String userProfileID;

    public static class Builder {

        /* renamed from: D, reason: collision with root package name */
        private static final io.appmetrica.analytics.impl.En f3340D = new io.appmetrica.analytics.impl.En(new io.appmetrica.analytics.impl.C0395h0());

        /* renamed from: A, reason: collision with root package name */
        private java.lang.Integer f3341A;

        /* renamed from: B, reason: collision with root package name */
        private java.util.List f3342B;

        /* renamed from: C, reason: collision with root package name */
        private final java.util.HashMap f3343C;

        /* renamed from: a, reason: collision with root package name */
        private final io.appmetrica.analytics.impl.C0555n5 f3344a;

        /* renamed from: b, reason: collision with root package name */
        private final java.lang.String f3345b;

        /* renamed from: c, reason: collision with root package name */
        private java.lang.String f3346c;

        /* renamed from: d, reason: collision with root package name */
        private java.lang.Integer f3347d;

        /* renamed from: e, reason: collision with root package name */
        private java.lang.Boolean f3348e;

        /* renamed from: f, reason: collision with root package name */
        private java.lang.Boolean f3349f;

        /* renamed from: g, reason: collision with root package name */
        private android.location.Location f3350g;

        /* renamed from: h, reason: collision with root package name */
        private java.lang.Boolean f3351h;

        /* renamed from: i, reason: collision with root package name */
        private java.lang.Boolean f3352i;

        /* renamed from: j, reason: collision with root package name */
        private java.lang.Boolean f3353j;

        /* renamed from: k, reason: collision with root package name */
        private io.appmetrica.analytics.PreloadInfo f3354k;

        /* renamed from: l, reason: collision with root package name */
        private java.lang.Boolean f3355l;

        /* renamed from: m, reason: collision with root package name */
        private java.lang.Boolean f3356m;

        /* renamed from: n, reason: collision with root package name */
        private java.lang.Integer f3357n;

        /* renamed from: o, reason: collision with root package name */
        private final java.util.LinkedHashMap f3358o;

        /* renamed from: p, reason: collision with root package name */
        private java.lang.String f3359p;

        /* renamed from: q, reason: collision with root package name */
        private java.lang.Boolean f3360q;

        /* renamed from: r, reason: collision with root package name */
        private java.lang.Boolean f3361r;

        /* renamed from: s, reason: collision with root package name */
        private java.lang.Boolean f3362s;
        private java.lang.String t;

        /* renamed from: u, reason: collision with root package name */
        private java.lang.Integer f3363u;

        /* renamed from: v, reason: collision with root package name */
        private java.lang.Integer f3364v;

        /* renamed from: w, reason: collision with root package name */
        private java.lang.Integer f3365w;

        /* renamed from: x, reason: collision with root package name */
        private final java.util.LinkedHashMap f3366x;

        /* renamed from: y, reason: collision with root package name */
        private io.appmetrica.analytics.ICrashTransformer f3367y;

        /* renamed from: z, reason: collision with root package name */
        private java.lang.Boolean f3368z;

        public /* synthetic */ Builder(java.lang.String str, int i2) {
            this(str);
        }

        public io.appmetrica.analytics.AppMetricaConfig build() {
            return new io.appmetrica.analytics.AppMetricaConfig(this, 0);
        }

        public io.appmetrica.analytics.AppMetricaConfig.Builder handleFirstActivationAsUpdate(boolean z2) {
            this.f3355l = java.lang.Boolean.valueOf(z2);
            return this;
        }

        public io.appmetrica.analytics.AppMetricaConfig.Builder withAdditionalConfig(java.lang.String str, java.lang.Object obj) {
            this.f3343C.put(str, obj);
            return this;
        }

        public io.appmetrica.analytics.AppMetricaConfig.Builder withAdvIdentifiersTracking(boolean z2) {
            this.f3352i = java.lang.Boolean.valueOf(z2);
            return this;
        }

        public io.appmetrica.analytics.AppMetricaConfig.Builder withAnrMonitoring(boolean z2) {
            this.f3368z = java.lang.Boolean.valueOf(z2);
            return this;
        }

        public io.appmetrica.analytics.AppMetricaConfig.Builder withAnrMonitoringTimeout(int i2) {
            this.f3341A = java.lang.Integer.valueOf(i2);
            return this;
        }

        public io.appmetrica.analytics.AppMetricaConfig.Builder withAppBuildNumber(int i2) {
            if (i2 < 0) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, "Invalid %1$s. %1$s should be positive.", "App Build Number"));
            }
            this.f3363u = java.lang.Integer.valueOf(i2);
            return this;
        }

        public io.appmetrica.analytics.AppMetricaConfig.Builder withAppEnvironmentValue(java.lang.String str, java.lang.String str2) {
            this.f3366x.put(str, str2);
            return this;
        }

        public io.appmetrica.analytics.AppMetricaConfig.Builder withAppOpenTrackingEnabled(boolean z2) {
            this.f3362s = java.lang.Boolean.valueOf(z2);
            return this;
        }

        public io.appmetrica.analytics.AppMetricaConfig.Builder withAppVersion(java.lang.String str) {
            this.f3346c = str;
            return this;
        }

        public io.appmetrica.analytics.AppMetricaConfig.Builder withCrashReporting(boolean z2) {
            this.f3348e = java.lang.Boolean.valueOf(z2);
            return this;
        }

        public io.appmetrica.analytics.AppMetricaConfig.Builder withCrashTransformer(io.appmetrica.analytics.ICrashTransformer iCrashTransformer) {
            this.f3367y = iCrashTransformer;
            return this;
        }

        public io.appmetrica.analytics.AppMetricaConfig.Builder withCustomHosts(java.util.List<java.lang.String> list) {
            this.f3342B = io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.unmodifiableListCopy(list);
            return this;
        }

        public io.appmetrica.analytics.AppMetricaConfig.Builder withDataSendingEnabled(boolean z2) {
            this.f3356m = java.lang.Boolean.valueOf(z2);
            return this;
        }

        public io.appmetrica.analytics.AppMetricaConfig.Builder withDeviceType(java.lang.String str) {
            this.t = str;
            if (!io.appmetrica.analytics.PredefinedDeviceTypes.ALL_VALUES.contains(str)) {
                io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger.getAnonymousInstance().info("PredefinedDeviceTypes does not contain value for `deviceType = %s`. It may cause events to not appear in AppMetrica reports.", str);
            }
            return this;
        }

        public io.appmetrica.analytics.AppMetricaConfig.Builder withDispatchPeriodSeconds(int i2) {
            this.f3364v = java.lang.Integer.valueOf(i2);
            return this;
        }

        public io.appmetrica.analytics.AppMetricaConfig.Builder withErrorEnvironmentValue(java.lang.String str, java.lang.String str2) {
            this.f3358o.put(str, str2);
            return this;
        }

        public io.appmetrica.analytics.AppMetricaConfig.Builder withLocation(android.location.Location location) {
            this.f3350g = location;
            return this;
        }

        public io.appmetrica.analytics.AppMetricaConfig.Builder withLocationTracking(boolean z2) {
            this.f3351h = java.lang.Boolean.valueOf(z2);
            return this;
        }

        public io.appmetrica.analytics.AppMetricaConfig.Builder withLogs() {
            this.f3353j = java.lang.Boolean.TRUE;
            return this;
        }

        public io.appmetrica.analytics.AppMetricaConfig.Builder withMaxReportsCount(int i2) {
            this.f3365w = java.lang.Integer.valueOf(i2);
            return this;
        }

        public io.appmetrica.analytics.AppMetricaConfig.Builder withMaxReportsInDatabaseCount(int i2) {
            this.f3357n = java.lang.Integer.valueOf(this.f3344a.a(i2));
            return this;
        }

        public io.appmetrica.analytics.AppMetricaConfig.Builder withNativeCrashReporting(boolean z2) {
            this.f3349f = java.lang.Boolean.valueOf(z2);
            return this;
        }

        public io.appmetrica.analytics.AppMetricaConfig.Builder withPreloadInfo(io.appmetrica.analytics.PreloadInfo preloadInfo) {
            this.f3354k = preloadInfo;
            return this;
        }

        public io.appmetrica.analytics.AppMetricaConfig.Builder withRevenueAutoTrackingEnabled(boolean z2) {
            this.f3360q = java.lang.Boolean.valueOf(z2);
            return this;
        }

        public io.appmetrica.analytics.AppMetricaConfig.Builder withSessionTimeout(int i2) {
            this.f3347d = java.lang.Integer.valueOf(i2);
            return this;
        }

        public io.appmetrica.analytics.AppMetricaConfig.Builder withSessionsAutoTrackingEnabled(boolean z2) {
            this.f3361r = java.lang.Boolean.valueOf(z2);
            return this;
        }

        public io.appmetrica.analytics.AppMetricaConfig.Builder withUserProfileID(java.lang.String str) {
            this.f3359p = str;
            return this;
        }

        private Builder(java.lang.String str) {
            this.f3358o = new java.util.LinkedHashMap();
            this.f3366x = new java.util.LinkedHashMap();
            this.f3343C = new java.util.HashMap();
            f3340D.a(str);
            this.f3344a = new io.appmetrica.analytics.impl.C0555n5(str);
            this.f3345b = str;
        }
    }

    public /* synthetic */ AppMetricaConfig(io.appmetrica.analytics.AppMetricaConfig.Builder builder, int i2) {
        this(builder);
    }

    public static io.appmetrica.analytics.AppMetricaConfig fromJson(java.lang.String str) {
        io.appmetrica.analytics.AppMetricaConfig.Builder a2 = new io.appmetrica.analytics.impl.G3().a(str);
        if (a2 == null) {
            return null;
        }
        return a2.build();
    }

    public static io.appmetrica.analytics.AppMetricaConfig.Builder newConfigBuilder(java.lang.String str) {
        return new io.appmetrica.analytics.AppMetricaConfig.Builder(str, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00fd A[Catch: all -> 0x011d, TryCatch #1 {all -> 0x011d, blocks: (B:3:0x0005, B:7:0x0058, B:10:0x0092, B:13:0x00e8, B:15:0x00fd, B:18:0x010b, B:19:0x0106, B:20:0x010e, B:24:0x00e3, B:25:0x008d), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e3 A[Catch: all -> 0x011d, TryCatch #1 {all -> 0x011d, blocks: (B:3:0x0005, B:7:0x0058, B:10:0x0092, B:13:0x00e8, B:15:0x00fd, B:18:0x010b, B:19:0x0106, B:20:0x010e, B:24:0x00e3, B:25:0x008d), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008d A[Catch: all -> 0x011d, TryCatch #1 {all -> 0x011d, blocks: (B:3:0x0005, B:7:0x0058, B:10:0x0092, B:13:0x00e8, B:15:0x00fd, B:18:0x010b, B:19:0x0106, B:20:0x010e, B:24:0x00e3, B:25:0x008d), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String toJson() {
        java.lang.String jSONObject;
        java.util.List<java.lang.String> list;
        new io.appmetrica.analytics.impl.C7();
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("apikey", this.apiKey);
            jSONObject2.put("app_version", this.appVersion);
            jSONObject2.put("session_timeout", this.sessionTimeout);
            jSONObject2.put("location", io.appmetrica.analytics.impl.G3.a(this.location));
            io.appmetrica.analytics.PreloadInfo preloadInfo = this.preloadInfo;
            org.json.JSONArray jSONArray = null;
            if (preloadInfo != null) {
                try {
                    org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                    jSONObject3.put("trackid", preloadInfo.getTrackingId());
                    java.util.Map<java.lang.String, java.lang.String> additionalParams = preloadInfo.getAdditionalParams();
                    jSONObject3.put("params", additionalParams == null ? null : new org.json.JSONObject(additionalParams));
                    jSONObject = jSONObject3.toString();
                } catch (java.lang.Throwable unused) {
                }
                jSONObject2.put("preload_info", jSONObject);
                jSONObject2.put("logs", this.logs);
                jSONObject2.put("crash_enabled", this.crashReporting);
                jSONObject2.put("crash_native_enabled", this.nativeCrashReporting);
                jSONObject2.put("location_enabled", this.locationTracking);
                jSONObject2.put("adv_identifiers_tracking", this.advIdentifiersTracking);
                jSONObject2.put("max_reports_in_db_count", this.maxReportsInDatabaseCount);
                java.util.Map<java.lang.String, java.lang.String> map = this.errorEnvironment;
                jSONObject2.put("error_environment", map != null ? null : new org.json.JSONObject(map));
                jSONObject2.put("first_activation_as_update", this.firstActivationAsUpdate);
                jSONObject2.put("data_sending_enabled", this.dataSendingEnabled);
                jSONObject2.put("user_profile_id", this.userProfileID);
                jSONObject2.put("revenue_auto_tracking_enabled", this.revenueAutoTrackingEnabled);
                jSONObject2.put("sessions_auto_tracking_enabled", this.sessionsAutoTrackingEnabled);
                jSONObject2.put("app_open_tracking_enabled", this.appOpenTrackingEnabled);
                jSONObject2.put(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.DEVICE_TYPE, this.deviceType);
                jSONObject2.put(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.APP_VERSION_CODE, this.appBuildNumber);
                jSONObject2.put("dispatch_period_seconds", this.dispatchPeriodSeconds);
                jSONObject2.put("max_reports_count", this.maxReportsCount);
                java.util.Map<java.lang.String, java.lang.String> map2 = this.appEnvironment;
                jSONObject2.put("app_environment", map2 != null ? null : new org.json.JSONObject(map2));
                jSONObject2.put("anr_monitoring", this.anrMonitoring);
                jSONObject2.put("anr_monitoring_timeout", this.anrMonitoringTimeout);
                list = this.customHosts;
                if (list != null) {
                    if (!io.appmetrica.analytics.impl.AbstractC0522lo.a((java.util.Collection) list)) {
                        jSONArray = new org.json.JSONArray((java.util.Collection) list);
                    }
                    jSONObject2.put("customHosts", jSONArray);
                }
                jSONObject2.put("additional_config", new org.json.JSONObject());
                return jSONObject2.toString();
            }
            jSONObject = null;
            jSONObject2.put("preload_info", jSONObject);
            jSONObject2.put("logs", this.logs);
            jSONObject2.put("crash_enabled", this.crashReporting);
            jSONObject2.put("crash_native_enabled", this.nativeCrashReporting);
            jSONObject2.put("location_enabled", this.locationTracking);
            jSONObject2.put("adv_identifiers_tracking", this.advIdentifiersTracking);
            jSONObject2.put("max_reports_in_db_count", this.maxReportsInDatabaseCount);
            java.util.Map<java.lang.String, java.lang.String> map3 = this.errorEnvironment;
            jSONObject2.put("error_environment", map3 != null ? null : new org.json.JSONObject(map3));
            jSONObject2.put("first_activation_as_update", this.firstActivationAsUpdate);
            jSONObject2.put("data_sending_enabled", this.dataSendingEnabled);
            jSONObject2.put("user_profile_id", this.userProfileID);
            jSONObject2.put("revenue_auto_tracking_enabled", this.revenueAutoTrackingEnabled);
            jSONObject2.put("sessions_auto_tracking_enabled", this.sessionsAutoTrackingEnabled);
            jSONObject2.put("app_open_tracking_enabled", this.appOpenTrackingEnabled);
            jSONObject2.put(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.DEVICE_TYPE, this.deviceType);
            jSONObject2.put(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.APP_VERSION_CODE, this.appBuildNumber);
            jSONObject2.put("dispatch_period_seconds", this.dispatchPeriodSeconds);
            jSONObject2.put("max_reports_count", this.maxReportsCount);
            java.util.Map<java.lang.String, java.lang.String> map22 = this.appEnvironment;
            jSONObject2.put("app_environment", map22 != null ? null : new org.json.JSONObject(map22));
            jSONObject2.put("anr_monitoring", this.anrMonitoring);
            jSONObject2.put("anr_monitoring_timeout", this.anrMonitoringTimeout);
            list = this.customHosts;
            if (list != null) {
            }
            jSONObject2.put("additional_config", new org.json.JSONObject());
            return jSONObject2.toString();
        } catch (java.lang.Throwable unused2) {
            return "";
        }
    }

    private AppMetricaConfig(io.appmetrica.analytics.AppMetricaConfig.Builder builder) {
        this.apiKey = builder.f3345b;
        this.appVersion = builder.f3346c;
        this.sessionTimeout = builder.f3347d;
        this.crashReporting = builder.f3348e;
        this.nativeCrashReporting = builder.f3349f;
        this.location = builder.f3350g;
        this.locationTracking = builder.f3351h;
        this.advIdentifiersTracking = builder.f3352i;
        this.logs = builder.f3353j;
        this.preloadInfo = builder.f3354k;
        this.firstActivationAsUpdate = builder.f3355l;
        this.dataSendingEnabled = builder.f3356m;
        this.maxReportsInDatabaseCount = builder.f3357n;
        this.errorEnvironment = io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.unmodifiableSameOrderMapCopy(builder.f3358o);
        this.userProfileID = builder.f3359p;
        this.revenueAutoTrackingEnabled = builder.f3360q;
        this.sessionsAutoTrackingEnabled = builder.f3361r;
        this.appOpenTrackingEnabled = builder.f3362s;
        this.deviceType = builder.t;
        this.appBuildNumber = builder.f3363u;
        this.dispatchPeriodSeconds = builder.f3364v;
        this.maxReportsCount = builder.f3365w;
        this.appEnvironment = io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.unmodifiableSameOrderMapCopy(builder.f3366x);
        this.crashTransformer = builder.f3367y;
        this.anrMonitoring = builder.f3368z;
        this.anrMonitoringTimeout = builder.f3341A;
        this.customHosts = builder.f3342B;
        this.additionalConfig = io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.unmodifiableSameOrderMapCopy(builder.f3343C);
    }

    public AppMetricaConfig(io.appmetrica.analytics.AppMetricaConfig appMetricaConfig) {
        this.apiKey = appMetricaConfig.apiKey;
        this.appVersion = appMetricaConfig.appVersion;
        this.sessionTimeout = appMetricaConfig.sessionTimeout;
        this.crashReporting = appMetricaConfig.crashReporting;
        this.nativeCrashReporting = appMetricaConfig.nativeCrashReporting;
        this.location = appMetricaConfig.location;
        this.locationTracking = appMetricaConfig.locationTracking;
        this.advIdentifiersTracking = appMetricaConfig.advIdentifiersTracking;
        this.logs = appMetricaConfig.logs;
        this.preloadInfo = appMetricaConfig.preloadInfo;
        this.firstActivationAsUpdate = appMetricaConfig.firstActivationAsUpdate;
        this.dataSendingEnabled = appMetricaConfig.dataSendingEnabled;
        this.maxReportsInDatabaseCount = appMetricaConfig.maxReportsInDatabaseCount;
        this.errorEnvironment = appMetricaConfig.errorEnvironment;
        this.userProfileID = appMetricaConfig.userProfileID;
        this.revenueAutoTrackingEnabled = appMetricaConfig.revenueAutoTrackingEnabled;
        this.sessionsAutoTrackingEnabled = appMetricaConfig.sessionsAutoTrackingEnabled;
        this.appOpenTrackingEnabled = appMetricaConfig.appOpenTrackingEnabled;
        this.deviceType = appMetricaConfig.deviceType;
        this.appBuildNumber = appMetricaConfig.appBuildNumber;
        this.dispatchPeriodSeconds = appMetricaConfig.dispatchPeriodSeconds;
        this.maxReportsCount = appMetricaConfig.maxReportsCount;
        this.appEnvironment = appMetricaConfig.appEnvironment;
        this.crashTransformer = appMetricaConfig.crashTransformer;
        this.anrMonitoring = appMetricaConfig.anrMonitoring;
        this.anrMonitoringTimeout = appMetricaConfig.anrMonitoringTimeout;
        this.customHosts = appMetricaConfig.customHosts;
        this.additionalConfig = appMetricaConfig.additionalConfig;
    }
}
