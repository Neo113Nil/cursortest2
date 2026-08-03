package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzji {
    private static com.google.android.gms.internal.measurement.zzjh zza;

    public static synchronized void zza(com.google.android.gms.internal.measurement.zzjh zzjhVar) {
        synchronized (com.google.android.gms.internal.measurement.zzji.class) {
            if (zza != null) {
                throw new java.lang.IllegalStateException("init() already called");
            }
            zza = zzjhVar;
        }
    }

    public static synchronized com.google.android.gms.internal.measurement.zzjh zzb() {
        com.google.android.gms.internal.measurement.zzjh zzjhVar;
        synchronized (com.google.android.gms.internal.measurement.zzji.class) {
            if (zza == null) {
                zza(new com.google.android.gms.internal.measurement.zzjl());
            }
            zzjhVar = zza;
        }
        return zzjhVar;
    }
}
