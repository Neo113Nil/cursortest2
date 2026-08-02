package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzru {
    static void zza(com.google.android.libraries.places.internal.zzrv zzrvVar) {
        zzc(zzrvVar);
        android.os.Trace.beginSection(zzrvVar.zzd());
        java.lang.String zze = zzrvVar.zze();
        if (zze.length() > 127) {
            zze = zze.substring(0, 127);
        }
        android.os.Trace.beginSection(zze);
    }

    static void zzb(com.google.android.libraries.places.internal.zzrv zzrvVar) {
        zzc(zzrvVar);
        android.os.Trace.endSection();
        android.os.Trace.endSection();
    }

    private static boolean zzc(com.google.android.libraries.places.internal.zzrv zzrvVar) {
        return zzrvVar.zza() != java.lang.Thread.currentThread();
    }
}
