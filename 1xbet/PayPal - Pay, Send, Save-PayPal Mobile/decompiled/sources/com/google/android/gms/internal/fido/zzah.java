package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
final class zzah {
    private static final java.lang.Object zza = new java.lang.Object();
    private static volatile boolean zzb = false;
    private static volatile com.google.android.gms.internal.fido.zzag zzc = null;
    private static volatile boolean zzd = false;
    private static volatile com.google.android.gms.internal.fido.zzag zze;

    static void zzb() {
        if (zze == null) {
            zze = new com.google.android.gms.internal.fido.zzag(null);
        }
    }

    static void zzc() {
        if (zzc == null) {
            zzc = new com.google.android.gms.internal.fido.zzag(null);
        }
    }

    static boolean zzd() {
        synchronized (zza) {
        }
        return false;
    }

    static void zza() {
        zzd = true;
    }
}
