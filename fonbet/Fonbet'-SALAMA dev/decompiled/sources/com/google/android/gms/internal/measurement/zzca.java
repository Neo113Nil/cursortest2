package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.Map;
import o3.InterfaceC1506a;

/* loaded from: classes.dex */
public final class zzca extends zzbm implements zzcc {
    public zzca(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void beginAdUnitExposure(String str, long j) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeLong(j);
        zzc(23, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbo.zze(zza, bundle);
        zzc(9, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void clearMeasurementEnabled(long j) {
        Parcel zza = zza();
        zza.writeLong(j);
        zzc(43, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void endAdUnitExposure(String str, long j) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeLong(j);
        zzc(24, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void generateEventId(zzcf zzcfVar) {
        Parcel zza = zza();
        zzbo.zzf(zza, zzcfVar);
        zzc(22, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getAppInstanceId(zzcf zzcfVar) {
        Parcel zza = zza();
        zzbo.zzf(zza, zzcfVar);
        zzc(20, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getCachedAppInstanceId(zzcf zzcfVar) {
        Parcel zza = zza();
        zzbo.zzf(zza, zzcfVar);
        zzc(19, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getConditionalUserProperties(String str, String str2, zzcf zzcfVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbo.zzf(zza, zzcfVar);
        zzc(10, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getCurrentScreenClass(zzcf zzcfVar) {
        Parcel zza = zza();
        zzbo.zzf(zza, zzcfVar);
        zzc(17, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getCurrentScreenName(zzcf zzcfVar) {
        Parcel zza = zza();
        zzbo.zzf(zza, zzcfVar);
        zzc(16, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getGmpAppId(zzcf zzcfVar) {
        Parcel zza = zza();
        zzbo.zzf(zza, zzcfVar);
        zzc(21, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getMaxUserProperties(String str, zzcf zzcfVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zzbo.zzf(zza, zzcfVar);
        zzc(6, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getTestFlag(zzcf zzcfVar, int i7) {
        Parcel zza = zza();
        zzbo.zzf(zza, zzcfVar);
        zza.writeInt(i7);
        zzc(38, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void getUserProperties(String str, String str2, boolean z4, zzcf zzcfVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbo.zzd(zza, z4);
        zzbo.zzf(zza, zzcfVar);
        zzc(5, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void initForTests(Map map) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void initialize(InterfaceC1506a interfaceC1506a, zzcl zzclVar, long j) {
        Parcel zza = zza();
        zzbo.zzf(zza, interfaceC1506a);
        zzbo.zze(zza, zzclVar);
        zza.writeLong(j);
        zzc(1, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void isDataCollectionEnabled(zzcf zzcfVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void logEvent(String str, String str2, Bundle bundle, boolean z4, boolean z7, long j) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbo.zze(zza, bundle);
        zzbo.zzd(zza, z4);
        zzbo.zzd(zza, z7);
        zza.writeLong(j);
        zzc(2, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void logEventAndBundle(String str, String str2, Bundle bundle, zzcf zzcfVar, long j) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void logHealthData(int i7, String str, InterfaceC1506a interfaceC1506a, InterfaceC1506a interfaceC1506a2, InterfaceC1506a interfaceC1506a3) {
        Parcel zza = zza();
        zza.writeInt(5);
        zza.writeString(str);
        zzbo.zzf(zza, interfaceC1506a);
        zzbo.zzf(zza, interfaceC1506a2);
        zzbo.zzf(zza, interfaceC1506a3);
        zzc(33, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void onActivityCreated(InterfaceC1506a interfaceC1506a, Bundle bundle, long j) {
        Parcel zza = zza();
        zzbo.zzf(zza, interfaceC1506a);
        zzbo.zze(zza, bundle);
        zza.writeLong(j);
        zzc(27, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void onActivityDestroyed(InterfaceC1506a interfaceC1506a, long j) {
        Parcel zza = zza();
        zzbo.zzf(zza, interfaceC1506a);
        zza.writeLong(j);
        zzc(28, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void onActivityPaused(InterfaceC1506a interfaceC1506a, long j) {
        Parcel zza = zza();
        zzbo.zzf(zza, interfaceC1506a);
        zza.writeLong(j);
        zzc(29, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void onActivityResumed(InterfaceC1506a interfaceC1506a, long j) {
        Parcel zza = zza();
        zzbo.zzf(zza, interfaceC1506a);
        zza.writeLong(j);
        zzc(30, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void onActivitySaveInstanceState(InterfaceC1506a interfaceC1506a, zzcf zzcfVar, long j) {
        Parcel zza = zza();
        zzbo.zzf(zza, interfaceC1506a);
        zzbo.zzf(zza, zzcfVar);
        zza.writeLong(j);
        zzc(31, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void onActivityStarted(InterfaceC1506a interfaceC1506a, long j) {
        Parcel zza = zza();
        zzbo.zzf(zza, interfaceC1506a);
        zza.writeLong(j);
        zzc(25, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void onActivityStopped(InterfaceC1506a interfaceC1506a, long j) {
        Parcel zza = zza();
        zzbo.zzf(zza, interfaceC1506a);
        zza.writeLong(j);
        zzc(26, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void performAction(Bundle bundle, zzcf zzcfVar, long j) {
        Parcel zza = zza();
        zzbo.zze(zza, bundle);
        zzbo.zzf(zza, zzcfVar);
        zza.writeLong(j);
        zzc(32, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void registerOnMeasurementEventListener(zzci zzciVar) {
        Parcel zza = zza();
        zzbo.zzf(zza, zzciVar);
        zzc(35, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void resetAnalyticsData(long j) {
        Parcel zza = zza();
        zza.writeLong(j);
        zzc(12, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel zza = zza();
        zzbo.zze(zza, bundle);
        zza.writeLong(j);
        zzc(8, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setConsent(Bundle bundle, long j) {
        Parcel zza = zza();
        zzbo.zze(zza, bundle);
        zza.writeLong(j);
        zzc(44, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setConsentThirdParty(Bundle bundle, long j) {
        Parcel zza = zza();
        zzbo.zze(zza, bundle);
        zza.writeLong(j);
        zzc(45, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setCurrentScreen(InterfaceC1506a interfaceC1506a, String str, String str2, long j) {
        Parcel zza = zza();
        zzbo.zzf(zza, interfaceC1506a);
        zza.writeString(str);
        zza.writeString(str2);
        zza.writeLong(j);
        zzc(15, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setDataCollectionEnabled(boolean z4) {
        Parcel zza = zza();
        zzbo.zzd(zza, z4);
        zzc(39, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setDefaultEventParameters(Bundle bundle) {
        Parcel zza = zza();
        zzbo.zze(zza, bundle);
        zzc(42, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setEventInterceptor(zzci zzciVar) {
        Parcel zza = zza();
        zzbo.zzf(zza, zzciVar);
        zzc(34, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setInstanceIdProvider(zzck zzckVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setMeasurementEnabled(boolean z4, long j) {
        Parcel zza = zza();
        zzbo.zzd(zza, z4);
        zza.writeLong(j);
        zzc(11, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setMinimumSessionDuration(long j) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setSessionTimeoutDuration(long j) {
        Parcel zza = zza();
        zza.writeLong(j);
        zzc(14, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setUserId(String str, long j) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeLong(j);
        zzc(7, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void setUserProperty(String str, String str2, InterfaceC1506a interfaceC1506a, boolean z4, long j) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbo.zzf(zza, interfaceC1506a);
        zzbo.zzd(zza, z4);
        zza.writeLong(j);
        zzc(4, zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public final void unregisterOnMeasurementEventListener(zzci zzciVar) {
        Parcel zza = zza();
        zzbo.zzf(zza, zzciVar);
        zzc(36, zza);
    }
}
