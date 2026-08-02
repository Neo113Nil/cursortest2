package com.google.android.gms.internal.mlkit_vision_common;

/* loaded from: classes8.dex */
public final class zzmw {
    private static com.google.android.gms.internal.mlkit_vision_common.zzmw zza;

    public static final boolean zzb() {
        return com.google.android.gms.internal.mlkit_vision_common.zzmv.zza("mlkit-dev-profiling");
    }

    public static com.google.android.gms.internal.mlkit_vision_common.zzmw zza() {
        com.google.android.gms.internal.mlkit_vision_common.zzmw zzmwVar;
        synchronized (com.google.android.gms.internal.mlkit_vision_common.zzmw.class) {
            if (zza == null) {
                zza = new com.google.android.gms.internal.mlkit_vision_common.zzmw();
            }
            zzmwVar = zza;
        }
        return zzmwVar;
    }

    private zzmw() {
    }
}
