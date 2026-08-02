package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes8.dex */
public final class zzss {
    private static com.google.android.gms.internal.mlkit_common.zzsr zza;

    public static com.google.android.gms.internal.mlkit_common.zzsh zza(com.google.android.gms.internal.mlkit_common.zzsb zzsbVar) {
        com.google.android.gms.internal.mlkit_common.zzsh zzshVar;
        synchronized (com.google.android.gms.internal.mlkit_common.zzss.class) {
            if (zza == null) {
                zza = new com.google.android.gms.internal.mlkit_common.zzsr(null);
            }
            zzshVar = (com.google.android.gms.internal.mlkit_common.zzsh) zza.get(zzsbVar);
        }
        return zzshVar;
    }

    public static com.google.android.gms.internal.mlkit_common.zzsh zzb(java.lang.String str) {
        com.google.android.gms.internal.mlkit_common.zzsh zza2;
        synchronized (com.google.android.gms.internal.mlkit_common.zzss.class) {
            zza2 = zza(com.google.android.gms.internal.mlkit_common.zzsb.zzd("common").zzd());
        }
        return zza2;
    }
}
