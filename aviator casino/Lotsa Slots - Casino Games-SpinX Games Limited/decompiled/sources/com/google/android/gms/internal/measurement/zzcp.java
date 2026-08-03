package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzcp extends com.google.android.gms.internal.measurement.zzbl implements com.google.android.gms.internal.measurement.zzcr {
    zzcp(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void beginAdUnitExposure(java.lang.String str, long j) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        zza.writeLong(j);
        zzc(23, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void clearConditionalUserProperty(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        com.google.android.gms.internal.measurement.zzbn.zzc(zza, bundle);
        zzc(9, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void clearMeasurementEnabled(long j) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void endAdUnitExposure(java.lang.String str, long j) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        zza.writeLong(j);
        zzc(24, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void generateEventId(com.google.android.gms.internal.measurement.zzcu zzcuVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzd(zza, zzcuVar);
        zzc(22, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void getAppInstanceId(com.google.android.gms.internal.measurement.zzcu zzcuVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzd(zza, zzcuVar);
        zzc(20, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void getCachedAppInstanceId(com.google.android.gms.internal.measurement.zzcu zzcuVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzd(zza, zzcuVar);
        zzc(19, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void getConditionalUserProperties(java.lang.String str, java.lang.String str2, com.google.android.gms.internal.measurement.zzcu zzcuVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        com.google.android.gms.internal.measurement.zzbn.zzd(zza, zzcuVar);
        zzc(10, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void getCurrentScreenClass(com.google.android.gms.internal.measurement.zzcu zzcuVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzd(zza, zzcuVar);
        zzc(17, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void getCurrentScreenName(com.google.android.gms.internal.measurement.zzcu zzcuVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzd(zza, zzcuVar);
        zzc(16, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void getGmpAppId(com.google.android.gms.internal.measurement.zzcu zzcuVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzd(zza, zzcuVar);
        zzc(21, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void getMaxUserProperties(java.lang.String str, com.google.android.gms.internal.measurement.zzcu zzcuVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        com.google.android.gms.internal.measurement.zzbn.zzd(zza, zzcuVar);
        zzc(6, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void getSessionId(com.google.android.gms.internal.measurement.zzcu zzcuVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzd(zza, zzcuVar);
        zzc(46, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void getTestFlag(com.google.android.gms.internal.measurement.zzcu zzcuVar, int i) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzd(zza, zzcuVar);
        zza.writeInt(i);
        zzc(38, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void getUserProperties(java.lang.String str, java.lang.String str2, boolean z, com.google.android.gms.internal.measurement.zzcu zzcuVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        int i = com.google.android.gms.internal.measurement.zzbn.zza;
        zza.writeInt(z ? 1 : 0);
        com.google.android.gms.internal.measurement.zzbn.zzd(zza, zzcuVar);
        zzc(5, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void initForTests(java.util.Map map) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void initialize(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.measurement.zzdd zzddVar, long j) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzd(zza, iObjectWrapper);
        com.google.android.gms.internal.measurement.zzbn.zzc(zza, zzddVar);
        zza.writeLong(j);
        zzc(1, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void isDataCollectionEnabled(com.google.android.gms.internal.measurement.zzcu zzcuVar) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void logEvent(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z, boolean z2, long j) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        com.google.android.gms.internal.measurement.zzbn.zzc(zza, bundle);
        zza.writeInt(z ? 1 : 0);
        zza.writeInt(z2 ? 1 : 0);
        zza.writeLong(j);
        zzc(2, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void logEventAndBundle(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, com.google.android.gms.internal.measurement.zzcu zzcuVar, long j) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void logHealthData(int i, java.lang.String str, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper2, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper3) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeInt(5);
        zza.writeString(str);
        com.google.android.gms.internal.measurement.zzbn.zzd(zza, iObjectWrapper);
        com.google.android.gms.internal.measurement.zzbn.zzd(zza, iObjectWrapper2);
        com.google.android.gms.internal.measurement.zzbn.zzd(zza, iObjectWrapper3);
        zzc(33, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void onActivityCreated(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, android.os.Bundle bundle, long j) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void onActivityCreatedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf zzdfVar, android.os.Bundle bundle, long j) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(zza, zzdfVar);
        com.google.android.gms.internal.measurement.zzbn.zzc(zza, bundle);
        zza.writeLong(j);
        zzc(53, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void onActivityDestroyed(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, long j) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void onActivityDestroyedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf zzdfVar, long j) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(zza, zzdfVar);
        zza.writeLong(j);
        zzc(54, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void onActivityPaused(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, long j) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void onActivityPausedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf zzdfVar, long j) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(zza, zzdfVar);
        zza.writeLong(j);
        zzc(55, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void onActivityResumed(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, long j) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void onActivityResumedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf zzdfVar, long j) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(zza, zzdfVar);
        zza.writeLong(j);
        zzc(56, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void onActivitySaveInstanceState(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.measurement.zzcu zzcuVar, long j) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void onActivitySaveInstanceStateByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf zzdfVar, com.google.android.gms.internal.measurement.zzcu zzcuVar, long j) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(zza, zzdfVar);
        com.google.android.gms.internal.measurement.zzbn.zzd(zza, zzcuVar);
        zza.writeLong(j);
        zzc(57, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void onActivityStarted(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, long j) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void onActivityStartedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf zzdfVar, long j) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(zza, zzdfVar);
        zza.writeLong(j);
        zzc(51, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void onActivityStopped(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, long j) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void onActivityStoppedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf zzdfVar, long j) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(zza, zzdfVar);
        zza.writeLong(j);
        zzc(52, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void performAction(android.os.Bundle bundle, com.google.android.gms.internal.measurement.zzcu zzcuVar, long j) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(zza, bundle);
        com.google.android.gms.internal.measurement.zzbn.zzd(zza, zzcuVar);
        zza.writeLong(j);
        zzc(32, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void registerOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzda zzdaVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzd(zza, zzdaVar);
        zzc(35, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void resetAnalyticsData(long j) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeLong(j);
        zzc(12, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void retrieveAndUploadBatches(com.google.android.gms.internal.measurement.zzcx zzcxVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzd(zza, zzcxVar);
        zzc(58, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void setConditionalUserProperty(android.os.Bundle bundle, long j) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(zza, bundle);
        zza.writeLong(j);
        zzc(8, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void setConsent(android.os.Bundle bundle, long j) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void setConsentThirdParty(android.os.Bundle bundle, long j) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(zza, bundle);
        zza.writeLong(j);
        zzc(45, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void setCurrentScreen(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, java.lang.String str, java.lang.String str2, long j) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf zzdfVar, java.lang.String str, java.lang.String str2, long j) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(zza, zzdfVar);
        zza.writeString(str);
        zza.writeString(str2);
        zza.writeLong(j);
        zzc(50, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void setDataCollectionEnabled(boolean z) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        int i = com.google.android.gms.internal.measurement.zzbn.zza;
        zza.writeInt(z ? 1 : 0);
        zzc(39, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void setDefaultEventParameters(android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(zza, bundle);
        zzc(42, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void setEventInterceptor(com.google.android.gms.internal.measurement.zzda zzdaVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzd(zza, zzdaVar);
        zzc(34, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void setInstanceIdProvider(com.google.android.gms.internal.measurement.zzdc zzdcVar) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void setMeasurementEnabled(boolean z, long j) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        int i = com.google.android.gms.internal.measurement.zzbn.zza;
        zza.writeInt(z ? 1 : 0);
        zza.writeLong(j);
        zzc(11, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void setMinimumSessionDuration(long j) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void setSessionTimeoutDuration(long j) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeLong(j);
        zzc(14, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void setSgtmDebugInfo(android.content.Intent intent) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(zza, intent);
        zzc(48, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void setUserId(java.lang.String str, long j) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        zza.writeLong(j);
        zzc(7, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void setUserProperty(java.lang.String str, java.lang.String str2, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, boolean z, long j) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        com.google.android.gms.internal.measurement.zzbn.zzd(zza, iObjectWrapper);
        zza.writeInt(z ? 1 : 0);
        zza.writeLong(j);
        zzc(4, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void unregisterOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzda zzdaVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzd(zza, zzdaVar);
        zzc(36, zza);
    }
}
