package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;
import o3.InterfaceC1506a;

/* loaded from: classes.dex */
public interface zzcc extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j);

    void endAdUnitExposure(String str, long j);

    void generateEventId(zzcf zzcfVar);

    void getAppInstanceId(zzcf zzcfVar);

    void getCachedAppInstanceId(zzcf zzcfVar);

    void getConditionalUserProperties(String str, String str2, zzcf zzcfVar);

    void getCurrentScreenClass(zzcf zzcfVar);

    void getCurrentScreenName(zzcf zzcfVar);

    void getGmpAppId(zzcf zzcfVar);

    void getMaxUserProperties(String str, zzcf zzcfVar);

    void getTestFlag(zzcf zzcfVar, int i7);

    void getUserProperties(String str, String str2, boolean z4, zzcf zzcfVar);

    void initForTests(Map map);

    void initialize(InterfaceC1506a interfaceC1506a, zzcl zzclVar, long j);

    void isDataCollectionEnabled(zzcf zzcfVar);

    void logEvent(String str, String str2, Bundle bundle, boolean z4, boolean z7, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, zzcf zzcfVar, long j);

    void logHealthData(int i7, String str, InterfaceC1506a interfaceC1506a, InterfaceC1506a interfaceC1506a2, InterfaceC1506a interfaceC1506a3);

    void onActivityCreated(InterfaceC1506a interfaceC1506a, Bundle bundle, long j);

    void onActivityDestroyed(InterfaceC1506a interfaceC1506a, long j);

    void onActivityPaused(InterfaceC1506a interfaceC1506a, long j);

    void onActivityResumed(InterfaceC1506a interfaceC1506a, long j);

    void onActivitySaveInstanceState(InterfaceC1506a interfaceC1506a, zzcf zzcfVar, long j);

    void onActivityStarted(InterfaceC1506a interfaceC1506a, long j);

    void onActivityStopped(InterfaceC1506a interfaceC1506a, long j);

    void performAction(Bundle bundle, zzcf zzcfVar, long j);

    void registerOnMeasurementEventListener(zzci zzciVar);

    void resetAnalyticsData(long j);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setConsent(Bundle bundle, long j);

    void setConsentThirdParty(Bundle bundle, long j);

    void setCurrentScreen(InterfaceC1506a interfaceC1506a, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z4);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(zzci zzciVar);

    void setInstanceIdProvider(zzck zzckVar);

    void setMeasurementEnabled(boolean z4, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, InterfaceC1506a interfaceC1506a, boolean z4, long j);

    void unregisterOnMeasurementEventListener(zzci zzciVar);
}
