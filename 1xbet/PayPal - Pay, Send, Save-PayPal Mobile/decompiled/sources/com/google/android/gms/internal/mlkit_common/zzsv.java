package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes8.dex */
public final class zzsv {
    private static com.google.android.gms.internal.mlkit_common.zzsv zza;

    public static void zzb() {
        com.google.android.gms.internal.mlkit_common.zzsu.zza();
    }

    public static com.google.android.gms.internal.mlkit_common.zzsv zza() {
        com.google.android.gms.internal.mlkit_common.zzsv zzsvVar;
        synchronized (com.google.android.gms.internal.mlkit_common.zzsv.class) {
            if (zza == null) {
                zza = new com.google.android.gms.internal.mlkit_common.zzsv();
            }
            zzsvVar = zza;
        }
        return zzsvVar;
    }

    private zzsv() {
    }
}
