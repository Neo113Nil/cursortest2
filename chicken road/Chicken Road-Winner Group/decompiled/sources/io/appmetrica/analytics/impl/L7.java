package io.appmetrica.analytics.impl;

import android.location.Location;
import io.appmetrica.analytics.AppMetricaConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class L7 implements Oc {

    /* renamed from: a, reason: collision with root package name */
    public Location f6213a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f6214b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f6215c;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f6217e;

    /* renamed from: h, reason: collision with root package name */
    public boolean f6219h;

    /* renamed from: i, reason: collision with root package name */
    public String f6220i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f6222k;

    /* renamed from: l, reason: collision with root package name */
    public Bi f6223l;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f6216d = Boolean.FALSE;
    public final LinkedHashMap f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f6218g = new LinkedHashMap();

    /* renamed from: j, reason: collision with root package name */
    public List<String> f6221j = new ArrayList();

    @Override // io.appmetrica.analytics.impl.Oc
    public final void a(boolean z3) {
        Boolean valueOf = Boolean.valueOf(z3);
        this.f6214b = valueOf;
        Bi bi = this.f6223l;
        if (bi != null) {
            bi.a(valueOf, this.f6217e, this.f6215c, this.f6216d);
        }
    }

    @Override // io.appmetrica.analytics.impl.Oc
    public final void clearAppEnvironment() {
        this.f6219h = true;
        this.f.clear();
    }

    public final C0635l0 j() {
        return new C0635l0(this.f6221j, this.f6219h);
    }

    public final Location k() {
        return this.f6213a;
    }

    public final Boolean l() {
        return this.f6215c;
    }

    public final Boolean m() {
        return this.f6217e;
    }

    public final Boolean n() {
        return this.f6214b;
    }

    public final boolean o() {
        return this.f6219h;
    }

    @Override // io.appmetrica.analytics.impl.Oc
    public final void putAppEnvironmentValue(String str, String str2) {
        this.f.put(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Oc
    public final void setDataSendingEnabled(boolean z3) {
        Boolean valueOf = Boolean.valueOf(z3);
        this.f6217e = valueOf;
        Bi bi = this.f6223l;
        if (bi != null) {
            bi.a(this.f6214b, valueOf, this.f6215c, this.f6216d);
        }
    }

    @Override // io.appmetrica.analytics.impl.Oc
    public final void setUserProfileID(String str) {
        this.f6220i = str;
    }

    @Override // io.appmetrica.analytics.impl.Oc
    public final void a(boolean z3, boolean z4) {
        boolean z5 = this.f6215c == null;
        boolean booleanValue = this.f6216d.booleanValue();
        if (z4 || z5 || !booleanValue) {
            this.f6215c = Boolean.valueOf(z3);
            Boolean valueOf = Boolean.valueOf(z4);
            this.f6216d = valueOf;
            Bi bi = this.f6223l;
            if (bi != null) {
                bi.a(this.f6214b, this.f6217e, this.f6215c, valueOf);
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Oc
    public final void a(Location location) {
        this.f6213a = location;
    }

    @Override // io.appmetrica.analytics.impl.Oc
    public final void a(String str, String str2) {
        this.f6218g.put(str, str2);
    }

    public final AppMetricaConfig a(AppMetricaConfig appMetricaConfig) {
        if (this.f6222k) {
            return appMetricaConfig;
        }
        AppMetricaConfig.Builder newConfigBuilder = AppMetricaConfig.newConfigBuilder(appMetricaConfig.apiKey);
        newConfigBuilder.withDeviceType(appMetricaConfig.deviceType);
        newConfigBuilder.withPreloadInfo(appMetricaConfig.preloadInfo);
        newConfigBuilder.withLocation(appMetricaConfig.location);
        if (AbstractC0711no.a(appMetricaConfig.appVersion)) {
            newConfigBuilder.withAppVersion(appMetricaConfig.appVersion);
        }
        if (AbstractC0711no.a(appMetricaConfig.dispatchPeriodSeconds)) {
            newConfigBuilder.withDispatchPeriodSeconds(appMetricaConfig.dispatchPeriodSeconds.intValue());
        }
        if (AbstractC0711no.a(appMetricaConfig.appBuildNumber)) {
            newConfigBuilder.withAppBuildNumber(appMetricaConfig.appBuildNumber.intValue());
        }
        if (AbstractC0711no.a(appMetricaConfig.maxReportsCount)) {
            newConfigBuilder.withMaxReportsCount(appMetricaConfig.maxReportsCount.intValue());
        }
        if (AbstractC0711no.a(appMetricaConfig.logs) && appMetricaConfig.logs.booleanValue()) {
            newConfigBuilder.withLogs();
        }
        if (AbstractC0711no.a(appMetricaConfig.sessionTimeout)) {
            newConfigBuilder.withSessionTimeout(appMetricaConfig.sessionTimeout.intValue());
        }
        if (AbstractC0711no.a(appMetricaConfig.sessionsAutoTrackingEnabled)) {
            newConfigBuilder.withSessionsAutoTrackingEnabled(appMetricaConfig.sessionsAutoTrackingEnabled.booleanValue());
        }
        if (AbstractC0711no.a(appMetricaConfig.crashReporting)) {
            newConfigBuilder.withCrashReporting(appMetricaConfig.crashReporting.booleanValue());
        }
        if (AbstractC0711no.a(appMetricaConfig.nativeCrashReporting)) {
            newConfigBuilder.withNativeCrashReporting(appMetricaConfig.nativeCrashReporting.booleanValue());
        }
        if (AbstractC0711no.a(appMetricaConfig.locationTracking)) {
            newConfigBuilder.withLocationTracking(appMetricaConfig.locationTracking.booleanValue());
        }
        if (AbstractC0711no.a(appMetricaConfig.advIdentifiersTracking)) {
            newConfigBuilder.withAdvIdentifiersTracking(appMetricaConfig.advIdentifiersTracking.booleanValue());
        }
        if (AbstractC0711no.a(appMetricaConfig.firstActivationAsUpdate)) {
            newConfigBuilder.handleFirstActivationAsUpdate(appMetricaConfig.firstActivationAsUpdate.booleanValue());
        }
        if (AbstractC0711no.a(appMetricaConfig.dataSendingEnabled)) {
            newConfigBuilder.withDataSendingEnabled(appMetricaConfig.dataSendingEnabled.booleanValue());
        }
        if (AbstractC0711no.a(appMetricaConfig.anrMonitoring)) {
            newConfigBuilder.withAnrMonitoring(appMetricaConfig.anrMonitoring.booleanValue());
        }
        if (AbstractC0711no.a(appMetricaConfig.anrMonitoringTimeout)) {
            newConfigBuilder.withAnrMonitoringTimeout(appMetricaConfig.anrMonitoringTimeout.intValue());
        }
        if (AbstractC0711no.a(appMetricaConfig.maxReportsInDatabaseCount)) {
            newConfigBuilder.withMaxReportsInDatabaseCount(appMetricaConfig.maxReportsInDatabaseCount.intValue());
        }
        if (AbstractC0711no.a(appMetricaConfig.crashTransformer)) {
            newConfigBuilder.withCrashTransformer(appMetricaConfig.crashTransformer);
        }
        if (AbstractC0711no.a(appMetricaConfig.userProfileID)) {
            newConfigBuilder.withUserProfileID(appMetricaConfig.userProfileID);
        }
        if (AbstractC0711no.a(appMetricaConfig.revenueAutoTrackingEnabled)) {
            newConfigBuilder.withRevenueAutoTrackingEnabled(appMetricaConfig.revenueAutoTrackingEnabled.booleanValue());
        }
        if (AbstractC0711no.a(appMetricaConfig.appOpenTrackingEnabled)) {
            newConfigBuilder.withAppOpenTrackingEnabled(appMetricaConfig.appOpenTrackingEnabled.booleanValue());
        }
        if (AbstractC0711no.a((Object) appMetricaConfig.customHosts)) {
            newConfigBuilder.withCustomHosts(appMetricaConfig.customHosts);
        }
        LinkedHashMap linkedHashMap = this.f;
        if (!AbstractC0711no.a((Map) linkedHashMap)) {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                newConfigBuilder.withAppEnvironmentValue((String) entry.getKey(), (String) entry.getValue());
            }
        }
        Map<String, String> map = appMetricaConfig.appEnvironment;
        if (!AbstractC0711no.a((Map) map)) {
            for (Map.Entry<String, String> entry2 : map.entrySet()) {
                newConfigBuilder.withAppEnvironmentValue(entry2.getKey(), entry2.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = this.f6218g;
        if (!AbstractC0711no.a((Map) linkedHashMap2)) {
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                newConfigBuilder.withErrorEnvironmentValue((String) entry3.getKey(), (String) entry3.getValue());
            }
        }
        Map<String, String> map2 = appMetricaConfig.errorEnvironment;
        if (!AbstractC0711no.a((Map) map2)) {
            for (Map.Entry<String, String> entry4 : map2.entrySet()) {
                newConfigBuilder.withErrorEnvironmentValue(entry4.getKey(), entry4.getValue());
            }
        }
        Map<String, Object> map3 = appMetricaConfig.additionalConfig;
        if (!AbstractC0711no.a((Map) map3)) {
            for (Map.Entry<String, Object> entry5 : map3.entrySet()) {
                newConfigBuilder.withAdditionalConfig(entry5.getKey(), entry5.getValue());
            }
        }
        Boolean bool = this.f6214b;
        if (appMetricaConfig.locationTracking == null && AbstractC0711no.a(bool)) {
            newConfigBuilder.withLocationTracking(bool.booleanValue());
        }
        Location location = this.f6213a;
        if (appMetricaConfig.location == null && AbstractC0711no.a(location)) {
            newConfigBuilder.withLocation(location);
        }
        Boolean bool2 = this.f6217e;
        if (appMetricaConfig.dataSendingEnabled == null && AbstractC0711no.a(bool2)) {
            newConfigBuilder.withDataSendingEnabled(bool2.booleanValue());
        }
        if (!AbstractC0711no.a(appMetricaConfig.userProfileID) && AbstractC0711no.a(this.f6220i)) {
            newConfigBuilder.withUserProfileID(this.f6220i);
        }
        Boolean bool3 = this.f6215c;
        if (appMetricaConfig.advIdentifiersTracking == null && AbstractC0711no.a(bool3)) {
            newConfigBuilder.withAdvIdentifiersTracking(bool3.booleanValue());
        }
        this.f6222k = true;
        this.f6213a = null;
        this.f6214b = null;
        this.f6215c = null;
        this.f6216d = Boolean.FALSE;
        this.f6217e = null;
        this.f.clear();
        this.f6218g.clear();
        this.f6219h = false;
        this.f6220i = null;
        return newConfigBuilder.build();
    }

    @Override // io.appmetrica.analytics.impl.Oc
    public final void a(String str) {
        this.f6221j.add(str);
    }

    public final void a(Bi bi) {
        Boolean bool = this.f6214b;
        if (bool != null || this.f6217e != null || this.f6215c != null) {
            bi.a(bool, this.f6217e, this.f6215c, this.f6216d);
        }
        this.f6223l = bi;
    }
}
