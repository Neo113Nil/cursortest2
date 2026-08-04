package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.Map;
import p105o3.a;

/* JADX INFO: loaded from: classes.dex */
public final class zzca extends zzbm implements zzcc {
    public zzca(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void beginAdUnitExposure(String str, long j) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeLong(j);
        zzc(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbo.zze(parcelZza, bundle);
        zzc(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void clearMeasurementEnabled(long j) {
        Parcel parcelZza = zza();
        parcelZza.writeLong(j);
        zzc(43, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void endAdUnitExposure(String str, long j) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeLong(j);
        zzc(24, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void generateEventId(zzcf zzcfVar) {
        Parcel parcelZza = zza();
        zzbo.zzf(parcelZza, zzcfVar);
        zzc(22, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getAppInstanceId(zzcf zzcfVar) {
        Parcel parcelZza = zza();
        zzbo.zzf(parcelZza, zzcfVar);
        zzc(20, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getCachedAppInstanceId(zzcf zzcfVar) {
        Parcel parcelZza = zza();
        zzbo.zzf(parcelZza, zzcfVar);
        zzc(19, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getConditionalUserProperties(String str, String str2, zzcf zzcfVar) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbo.zzf(parcelZza, zzcfVar);
        zzc(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getCurrentScreenClass(zzcf zzcfVar) {
        Parcel parcelZza = zza();
        zzbo.zzf(parcelZza, zzcfVar);
        zzc(17, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getCurrentScreenName(zzcf zzcfVar) {
        Parcel parcelZza = zza();
        zzbo.zzf(parcelZza, zzcfVar);
        zzc(16, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getGmpAppId(zzcf zzcfVar) {
        Parcel parcelZza = zza();
        zzbo.zzf(parcelZza, zzcfVar);
        zzc(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getMaxUserProperties(String str, zzcf zzcfVar) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzbo.zzf(parcelZza, zzcfVar);
        zzc(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getTestFlag(zzcf zzcfVar, int i7) {
        Parcel parcelZza = zza();
        zzbo.zzf(parcelZza, zzcfVar);
        parcelZza.writeInt(i7);
        zzc(38, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getUserProperties(String str, String str2, boolean z4, zzcf zzcfVar) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbo.zzd(parcelZza, z4);
        zzbo.zzf(parcelZza, zzcfVar);
        zzc(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void initForTests(Map map) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void initialize(a aVar, zzcl zzclVar, long j) {
        Parcel parcelZza = zza();
        zzbo.zzf(parcelZza, aVar);
        zzbo.zze(parcelZza, zzclVar);
        parcelZza.writeLong(j);
        zzc(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void isDataCollectionEnabled(zzcf zzcfVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void logEvent(String str, String str2, Bundle bundle, boolean z4, boolean z7, long j) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbo.zze(parcelZza, bundle);
        zzbo.zzd(parcelZza, z4);
        zzbo.zzd(parcelZza, z7);
        parcelZza.writeLong(j);
        zzc(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void logEventAndBundle(String str, String str2, Bundle bundle, zzcf zzcfVar, long j) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void logHealthData(int i7, String str, a aVar, a aVar2, a aVar3) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(5);
        parcelZza.writeString(str);
        zzbo.zzf(parcelZza, aVar);
        zzbo.zzf(parcelZza, aVar2);
        zzbo.zzf(parcelZza, aVar3);
        zzc(33, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void onActivityCreated(a aVar, Bundle bundle, long j) {
        Parcel parcelZza = zza();
        zzbo.zzf(parcelZza, aVar);
        zzbo.zze(parcelZza, bundle);
        parcelZza.writeLong(j);
        zzc(27, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void onActivityDestroyed(a aVar, long j) {
        Parcel parcelZza = zza();
        zzbo.zzf(parcelZza, aVar);
        parcelZza.writeLong(j);
        zzc(28, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void onActivityPaused(a aVar, long j) {
        Parcel parcelZza = zza();
        zzbo.zzf(parcelZza, aVar);
        parcelZza.writeLong(j);
        zzc(29, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void onActivityResumed(a aVar, long j) {
        Parcel parcelZza = zza();
        zzbo.zzf(parcelZza, aVar);
        parcelZza.writeLong(j);
        zzc(30, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void onActivitySaveInstanceState(a aVar, zzcf zzcfVar, long j) {
        Parcel parcelZza = zza();
        zzbo.zzf(parcelZza, aVar);
        zzbo.zzf(parcelZza, zzcfVar);
        parcelZza.writeLong(j);
        zzc(31, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void onActivityStarted(a aVar, long j) {
        Parcel parcelZza = zza();
        zzbo.zzf(parcelZza, aVar);
        parcelZza.writeLong(j);
        zzc(25, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void onActivityStopped(a aVar, long j) {
        Parcel parcelZza = zza();
        zzbo.zzf(parcelZza, aVar);
        parcelZza.writeLong(j);
        zzc(26, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void performAction(Bundle bundle, zzcf zzcfVar, long j) {
        Parcel parcelZza = zza();
        zzbo.zze(parcelZza, bundle);
        zzbo.zzf(parcelZza, zzcfVar);
        parcelZza.writeLong(j);
        zzc(32, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void registerOnMeasurementEventListener(zzci zzciVar) {
        Parcel parcelZza = zza();
        zzbo.zzf(parcelZza, zzciVar);
        zzc(35, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void resetAnalyticsData(long j) {
        Parcel parcelZza = zza();
        parcelZza.writeLong(j);
        zzc(12, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel parcelZza = zza();
        zzbo.zze(parcelZza, bundle);
        parcelZza.writeLong(j);
        zzc(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setConsent(Bundle bundle, long j) {
        Parcel parcelZza = zza();
        zzbo.zze(parcelZza, bundle);
        parcelZza.writeLong(j);
        zzc(44, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setConsentThirdParty(Bundle bundle, long j) {
        Parcel parcelZza = zza();
        zzbo.zze(parcelZza, bundle);
        parcelZza.writeLong(j);
        zzc(45, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setCurrentScreen(a aVar, String str, String str2, long j) {
        Parcel parcelZza = zza();
        zzbo.zzf(parcelZza, aVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        parcelZza.writeLong(j);
        zzc(15, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setDataCollectionEnabled(boolean z4) {
        Parcel parcelZza = zza();
        zzbo.zzd(parcelZza, z4);
        zzc(39, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setDefaultEventParameters(Bundle bundle) {
        Parcel parcelZza = zza();
        zzbo.zze(parcelZza, bundle);
        zzc(42, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setEventInterceptor(zzci zzciVar) {
        Parcel parcelZza = zza();
        zzbo.zzf(parcelZza, zzciVar);
        zzc(34, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setInstanceIdProvider(zzck zzckVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setMeasurementEnabled(boolean z4, long j) {
        Parcel parcelZza = zza();
        zzbo.zzd(parcelZza, z4);
        parcelZza.writeLong(j);
        zzc(11, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setMinimumSessionDuration(long j) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setSessionTimeoutDuration(long j) {
        Parcel parcelZza = zza();
        parcelZza.writeLong(j);
        zzc(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setUserId(String str, long j) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeLong(j);
        zzc(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setUserProperty(String str, String str2, a aVar, boolean z4, long j) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbo.zzf(parcelZza, aVar);
        zzbo.zzd(parcelZza, z4);
        parcelZza.writeLong(j);
        zzc(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void unregisterOnMeasurementEventListener(zzci zzciVar) {
        Parcel parcelZza = zza();
        zzbo.zzf(parcelZza, zzciVar);
        zzc(36, parcelZza);
    }
}
