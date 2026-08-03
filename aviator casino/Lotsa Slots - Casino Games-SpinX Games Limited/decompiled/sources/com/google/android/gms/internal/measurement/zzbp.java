package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public abstract class zzbp extends com.google.android.gms.internal.measurement.zzbm implements com.google.android.gms.internal.measurement.zzbq {
    public static com.google.android.gms.internal.measurement.zzbq zzb(android.os.IBinder iBinder) {
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        return queryLocalInterface instanceof com.google.android.gms.internal.measurement.zzbq ? (com.google.android.gms.internal.measurement.zzbq) queryLocalInterface : new com.google.android.gms.internal.measurement.zzbo(iBinder);
    }
}
