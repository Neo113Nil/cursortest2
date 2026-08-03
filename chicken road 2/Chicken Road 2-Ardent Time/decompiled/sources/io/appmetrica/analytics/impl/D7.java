package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class D7 implements io.appmetrica.analytics.impl.Hc {

    /* renamed from: a, reason: collision with root package name */
    public android.location.Location f4190a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Boolean f4191b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.Boolean f4192c;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Boolean f4194e;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4197h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f4198i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4200k;

    /* renamed from: l, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0801wi f4201l;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Boolean f4193d = java.lang.Boolean.FALSE;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedHashMap f4195f = new java.util.LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedHashMap f4196g = new java.util.LinkedHashMap();

    /* renamed from: j, reason: collision with root package name */
    public java.util.List<java.lang.String> f4199j = new java.util.ArrayList();

    @Override // io.appmetrica.analytics.impl.Hc
    public final void a(boolean z2) {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z2);
        this.f4191b = valueOf;
        io.appmetrica.analytics.impl.C0801wi c0801wi = this.f4201l;
        if (c0801wi != null) {
            c0801wi.a(valueOf, this.f4194e, this.f4192c, this.f4193d);
        }
    }

    @Override // io.appmetrica.analytics.impl.Hc
    public final void clearAppEnvironment() {
        this.f4197h = true;
        this.f4195f.clear();
    }

    public final io.appmetrica.analytics.impl.C0498l0 j() {
        return new io.appmetrica.analytics.impl.C0498l0(this.f4199j, this.f4197h);
    }

    public final android.location.Location k() {
        return this.f4190a;
    }

    public final java.lang.Boolean l() {
        return this.f4192c;
    }

    public final java.lang.Boolean m() {
        return this.f4194e;
    }

    public final java.lang.Boolean n() {
        return this.f4191b;
    }

    public final boolean o() {
        return this.f4197h;
    }

    @Override // io.appmetrica.analytics.impl.Hc
    public final void putAppEnvironmentValue(java.lang.String str, java.lang.String str2) {
        this.f4195f.put(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Hc
    public final void setDataSendingEnabled(boolean z2) {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z2);
        this.f4194e = valueOf;
        io.appmetrica.analytics.impl.C0801wi c0801wi = this.f4201l;
        if (c0801wi != null) {
            c0801wi.a(this.f4191b, valueOf, this.f4192c, this.f4193d);
        }
    }

    @Override // io.appmetrica.analytics.impl.Hc
    public final void setUserProfileID(java.lang.String str) {
        this.f4198i = str;
    }

    @Override // io.appmetrica.analytics.impl.Hc
    public final void a(boolean z2, boolean z3) {
        boolean z4 = this.f4192c == null;
        boolean booleanValue = this.f4193d.booleanValue();
        if (z3 || z4 || !booleanValue) {
            this.f4192c = java.lang.Boolean.valueOf(z2);
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z3);
            this.f4193d = valueOf;
            io.appmetrica.analytics.impl.C0801wi c0801wi = this.f4201l;
            if (c0801wi != null) {
                c0801wi.a(this.f4191b, this.f4194e, this.f4192c, valueOf);
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Hc
    public final void a(android.location.Location location) {
        this.f4190a = location;
    }

    @Override // io.appmetrica.analytics.impl.Hc
    public final void a(java.lang.String str, java.lang.String str2) {
        this.f4196g.put(str, str2);
    }

    public final io.appmetrica.analytics.AppMetricaConfig a(io.appmetrica.analytics.AppMetricaConfig appMetricaConfig) {
        if (this.f4200k) {
            return appMetricaConfig;
        }
        io.appmetrica.analytics.AppMetricaConfig.Builder newConfigBuilder = io.appmetrica.analytics.AppMetricaConfig.newConfigBuilder(appMetricaConfig.apiKey);
        newConfigBuilder.withDeviceType(appMetricaConfig.deviceType);
        newConfigBuilder.withPreloadInfo(appMetricaConfig.preloadInfo);
        newConfigBuilder.withLocation(appMetricaConfig.location);
        if (io.appmetrica.analytics.impl.AbstractC0522lo.a(appMetricaConfig.appVersion)) {
            newConfigBuilder.withAppVersion(appMetricaConfig.appVersion);
        }
        if (io.appmetrica.analytics.impl.AbstractC0522lo.a(appMetricaConfig.dispatchPeriodSeconds)) {
            newConfigBuilder.withDispatchPeriodSeconds(appMetricaConfig.dispatchPeriodSeconds.intValue());
        }
        if (io.appmetrica.analytics.impl.AbstractC0522lo.a(appMetricaConfig.appBuildNumber)) {
            newConfigBuilder.withAppBuildNumber(appMetricaConfig.appBuildNumber.intValue());
        }
        if (io.appmetrica.analytics.impl.AbstractC0522lo.a(appMetricaConfig.maxReportsCount)) {
            newConfigBuilder.withMaxReportsCount(appMetricaConfig.maxReportsCount.intValue());
        }
        if (io.appmetrica.analytics.impl.AbstractC0522lo.a(appMetricaConfig.logs) && appMetricaConfig.logs.booleanValue()) {
            newConfigBuilder.withLogs();
        }
        if (io.appmetrica.analytics.impl.AbstractC0522lo.a(appMetricaConfig.sessionTimeout)) {
            newConfigBuilder.withSessionTimeout(appMetricaConfig.sessionTimeout.intValue());
        }
        if (io.appmetrica.analytics.impl.AbstractC0522lo.a(appMetricaConfig.sessionsAutoTrackingEnabled)) {
            newConfigBuilder.withSessionsAutoTrackingEnabled(appMetricaConfig.sessionsAutoTrackingEnabled.booleanValue());
        }
        if (io.appmetrica.analytics.impl.AbstractC0522lo.a(appMetricaConfig.crashReporting)) {
            newConfigBuilder.withCrashReporting(appMetricaConfig.crashReporting.booleanValue());
        }
        if (io.appmetrica.analytics.impl.AbstractC0522lo.a(appMetricaConfig.nativeCrashReporting)) {
            newConfigBuilder.withNativeCrashReporting(appMetricaConfig.nativeCrashReporting.booleanValue());
        }
        if (io.appmetrica.analytics.impl.AbstractC0522lo.a(appMetricaConfig.locationTracking)) {
            newConfigBuilder.withLocationTracking(appMetricaConfig.locationTracking.booleanValue());
        }
        if (io.appmetrica.analytics.impl.AbstractC0522lo.a(appMetricaConfig.advIdentifiersTracking)) {
            newConfigBuilder.withAdvIdentifiersTracking(appMetricaConfig.advIdentifiersTracking.booleanValue());
        }
        if (io.appmetrica.analytics.impl.AbstractC0522lo.a(appMetricaConfig.firstActivationAsUpdate)) {
            newConfigBuilder.handleFirstActivationAsUpdate(appMetricaConfig.firstActivationAsUpdate.booleanValue());
        }
        if (io.appmetrica.analytics.impl.AbstractC0522lo.a(appMetricaConfig.dataSendingEnabled)) {
            newConfigBuilder.withDataSendingEnabled(appMetricaConfig.dataSendingEnabled.booleanValue());
        }
        if (io.appmetrica.analytics.impl.AbstractC0522lo.a(appMetricaConfig.anrMonitoring)) {
            newConfigBuilder.withAnrMonitoring(appMetricaConfig.anrMonitoring.booleanValue());
        }
        if (io.appmetrica.analytics.impl.AbstractC0522lo.a(appMetricaConfig.anrMonitoringTimeout)) {
            newConfigBuilder.withAnrMonitoringTimeout(appMetricaConfig.anrMonitoringTimeout.intValue());
        }
        if (io.appmetrica.analytics.impl.AbstractC0522lo.a(appMetricaConfig.maxReportsInDatabaseCount)) {
            newConfigBuilder.withMaxReportsInDatabaseCount(appMetricaConfig.maxReportsInDatabaseCount.intValue());
        }
        if (io.appmetrica.analytics.impl.AbstractC0522lo.a(appMetricaConfig.crashTransformer)) {
            newConfigBuilder.withCrashTransformer(appMetricaConfig.crashTransformer);
        }
        if (io.appmetrica.analytics.impl.AbstractC0522lo.a(appMetricaConfig.userProfileID)) {
            newConfigBuilder.withUserProfileID(appMetricaConfig.userProfileID);
        }
        if (io.appmetrica.analytics.impl.AbstractC0522lo.a(appMetricaConfig.revenueAutoTrackingEnabled)) {
            newConfigBuilder.withRevenueAutoTrackingEnabled(appMetricaConfig.revenueAutoTrackingEnabled.booleanValue());
        }
        if (io.appmetrica.analytics.impl.AbstractC0522lo.a(appMetricaConfig.appOpenTrackingEnabled)) {
            newConfigBuilder.withAppOpenTrackingEnabled(appMetricaConfig.appOpenTrackingEnabled.booleanValue());
        }
        if (io.appmetrica.analytics.impl.AbstractC0522lo.a((java.lang.Object) appMetricaConfig.customHosts)) {
            newConfigBuilder.withCustomHosts(appMetricaConfig.customHosts);
        }
        java.util.LinkedHashMap linkedHashMap = this.f4195f;
        if (!io.appmetrica.analytics.impl.AbstractC0522lo.a((java.util.Map) linkedHashMap)) {
            for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
                newConfigBuilder.withAppEnvironmentValue((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
            }
        }
        java.util.Map<java.lang.String, java.lang.String> map = appMetricaConfig.appEnvironment;
        if (!io.appmetrica.analytics.impl.AbstractC0522lo.a((java.util.Map) map)) {
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry2 : map.entrySet()) {
                newConfigBuilder.withAppEnvironmentValue(entry2.getKey(), entry2.getValue());
            }
        }
        java.util.LinkedHashMap linkedHashMap2 = this.f4196g;
        if (!io.appmetrica.analytics.impl.AbstractC0522lo.a((java.util.Map) linkedHashMap2)) {
            for (java.util.Map.Entry entry3 : linkedHashMap2.entrySet()) {
                newConfigBuilder.withErrorEnvironmentValue((java.lang.String) entry3.getKey(), (java.lang.String) entry3.getValue());
            }
        }
        java.util.Map<java.lang.String, java.lang.String> map2 = appMetricaConfig.errorEnvironment;
        if (!io.appmetrica.analytics.impl.AbstractC0522lo.a((java.util.Map) map2)) {
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry4 : map2.entrySet()) {
                newConfigBuilder.withErrorEnvironmentValue(entry4.getKey(), entry4.getValue());
            }
        }
        java.util.Map<java.lang.String, java.lang.Object> map3 = appMetricaConfig.additionalConfig;
        if (!io.appmetrica.analytics.impl.AbstractC0522lo.a((java.util.Map) map3)) {
            for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry5 : map3.entrySet()) {
                newConfigBuilder.withAdditionalConfig(entry5.getKey(), entry5.getValue());
            }
        }
        java.lang.Boolean bool = this.f4191b;
        if (appMetricaConfig.locationTracking == null && io.appmetrica.analytics.impl.AbstractC0522lo.a(bool)) {
            newConfigBuilder.withLocationTracking(bool.booleanValue());
        }
        android.location.Location location = this.f4190a;
        if (appMetricaConfig.location == null && io.appmetrica.analytics.impl.AbstractC0522lo.a(location)) {
            newConfigBuilder.withLocation(location);
        }
        java.lang.Boolean bool2 = this.f4194e;
        if (appMetricaConfig.dataSendingEnabled == null && io.appmetrica.analytics.impl.AbstractC0522lo.a(bool2)) {
            newConfigBuilder.withDataSendingEnabled(bool2.booleanValue());
        }
        if (!io.appmetrica.analytics.impl.AbstractC0522lo.a(appMetricaConfig.userProfileID) && io.appmetrica.analytics.impl.AbstractC0522lo.a(this.f4198i)) {
            newConfigBuilder.withUserProfileID(this.f4198i);
        }
        java.lang.Boolean bool3 = this.f4192c;
        if (appMetricaConfig.advIdentifiersTracking == null && io.appmetrica.analytics.impl.AbstractC0522lo.a(bool3)) {
            newConfigBuilder.withAdvIdentifiersTracking(bool3.booleanValue());
        }
        this.f4200k = true;
        this.f4190a = null;
        this.f4191b = null;
        this.f4192c = null;
        this.f4193d = java.lang.Boolean.FALSE;
        this.f4194e = null;
        this.f4195f.clear();
        this.f4196g.clear();
        this.f4197h = false;
        this.f4198i = null;
        return newConfigBuilder.build();
    }

    @Override // io.appmetrica.analytics.impl.Hc
    public final void a(java.lang.String str) {
        this.f4199j.add(str);
    }

    public final void a(io.appmetrica.analytics.impl.C0801wi c0801wi) {
        java.lang.Boolean bool = this.f4191b;
        if (bool != null || this.f4194e != null || this.f4192c != null) {
            c0801wi.a(bool, this.f4194e, this.f4192c, this.f4193d);
        }
        this.f4201l = c0801wi;
    }
}
