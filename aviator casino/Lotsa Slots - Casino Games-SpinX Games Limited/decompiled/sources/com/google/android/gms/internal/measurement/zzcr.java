package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* loaded from: classes4.dex */
public interface zzcr extends android.os.IInterface {
    void beginAdUnitExposure(java.lang.String str, long j) throws android.os.RemoteException;

    void clearConditionalUserProperty(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) throws android.os.RemoteException;

    void clearMeasurementEnabled(long j) throws android.os.RemoteException;

    void endAdUnitExposure(java.lang.String str, long j) throws android.os.RemoteException;

    void generateEventId(com.google.android.gms.internal.measurement.zzcu zzcuVar) throws android.os.RemoteException;

    void getAppInstanceId(com.google.android.gms.internal.measurement.zzcu zzcuVar) throws android.os.RemoteException;

    void getCachedAppInstanceId(com.google.android.gms.internal.measurement.zzcu zzcuVar) throws android.os.RemoteException;

    void getConditionalUserProperties(java.lang.String str, java.lang.String str2, com.google.android.gms.internal.measurement.zzcu zzcuVar) throws android.os.RemoteException;

    void getCurrentScreenClass(com.google.android.gms.internal.measurement.zzcu zzcuVar) throws android.os.RemoteException;

    void getCurrentScreenName(com.google.android.gms.internal.measurement.zzcu zzcuVar) throws android.os.RemoteException;

    void getGmpAppId(com.google.android.gms.internal.measurement.zzcu zzcuVar) throws android.os.RemoteException;

    void getMaxUserProperties(java.lang.String str, com.google.android.gms.internal.measurement.zzcu zzcuVar) throws android.os.RemoteException;

    void getSessionId(com.google.android.gms.internal.measurement.zzcu zzcuVar) throws android.os.RemoteException;

    void getTestFlag(com.google.android.gms.internal.measurement.zzcu zzcuVar, int i) throws android.os.RemoteException;

    void getUserProperties(java.lang.String str, java.lang.String str2, boolean z, com.google.android.gms.internal.measurement.zzcu zzcuVar) throws android.os.RemoteException;

    void initForTests(java.util.Map map) throws android.os.RemoteException;

    void initialize(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.measurement.zzdd zzddVar, long j) throws android.os.RemoteException;

    void isDataCollectionEnabled(com.google.android.gms.internal.measurement.zzcu zzcuVar) throws android.os.RemoteException;

    void logEvent(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z, boolean z2, long j) throws android.os.RemoteException;

    void logEventAndBundle(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, com.google.android.gms.internal.measurement.zzcu zzcuVar, long j) throws android.os.RemoteException;

    void logHealthData(int i, java.lang.String str, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper2, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper3) throws android.os.RemoteException;

    void onActivityCreated(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, android.os.Bundle bundle, long j) throws android.os.RemoteException;

    void onActivityCreatedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf zzdfVar, android.os.Bundle bundle, long j) throws android.os.RemoteException;

    void onActivityDestroyed(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, long j) throws android.os.RemoteException;

    void onActivityDestroyedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf zzdfVar, long j) throws android.os.RemoteException;

    void onActivityPaused(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, long j) throws android.os.RemoteException;

    void onActivityPausedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf zzdfVar, long j) throws android.os.RemoteException;

    void onActivityResumed(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, long j) throws android.os.RemoteException;

    void onActivityResumedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf zzdfVar, long j) throws android.os.RemoteException;

    void onActivitySaveInstanceState(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.measurement.zzcu zzcuVar, long j) throws android.os.RemoteException;

    void onActivitySaveInstanceStateByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf zzdfVar, com.google.android.gms.internal.measurement.zzcu zzcuVar, long j) throws android.os.RemoteException;

    void onActivityStarted(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, long j) throws android.os.RemoteException;

    void onActivityStartedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf zzdfVar, long j) throws android.os.RemoteException;

    void onActivityStopped(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, long j) throws android.os.RemoteException;

    void onActivityStoppedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf zzdfVar, long j) throws android.os.RemoteException;

    void performAction(android.os.Bundle bundle, com.google.android.gms.internal.measurement.zzcu zzcuVar, long j) throws android.os.RemoteException;

    void registerOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzda zzdaVar) throws android.os.RemoteException;

    void resetAnalyticsData(long j) throws android.os.RemoteException;

    void retrieveAndUploadBatches(com.google.android.gms.internal.measurement.zzcx zzcxVar) throws android.os.RemoteException;

    void setConditionalUserProperty(android.os.Bundle bundle, long j) throws android.os.RemoteException;

    void setConsent(android.os.Bundle bundle, long j) throws android.os.RemoteException;

    void setConsentThirdParty(android.os.Bundle bundle, long j) throws android.os.RemoteException;

    void setCurrentScreen(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, java.lang.String str, java.lang.String str2, long j) throws android.os.RemoteException;

    void setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf zzdfVar, java.lang.String str, java.lang.String str2, long j) throws android.os.RemoteException;

    void setDataCollectionEnabled(boolean z) throws android.os.RemoteException;

    void setDefaultEventParameters(android.os.Bundle bundle) throws android.os.RemoteException;

    void setEventInterceptor(com.google.android.gms.internal.measurement.zzda zzdaVar) throws android.os.RemoteException;

    void setInstanceIdProvider(com.google.android.gms.internal.measurement.zzdc zzdcVar) throws android.os.RemoteException;

    void setMeasurementEnabled(boolean z, long j) throws android.os.RemoteException;

    void setMinimumSessionDuration(long j) throws android.os.RemoteException;

    void setSessionTimeoutDuration(long j) throws android.os.RemoteException;

    void setSgtmDebugInfo(android.content.Intent intent) throws android.os.RemoteException;

    void setUserId(java.lang.String str, long j) throws android.os.RemoteException;

    void setUserProperty(java.lang.String str, java.lang.String str2, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, boolean z, long j) throws android.os.RemoteException;

    void unregisterOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzda zzdaVar) throws android.os.RemoteException;
}
