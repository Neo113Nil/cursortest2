package com.google.android.gms.internal.mlkit_vision_common;

/* loaded from: classes8.dex */
public final class zzms {
    private static com.google.android.gms.internal.mlkit_vision_common.zzmr zza;

    public static com.google.android.gms.internal.mlkit_vision_common.zzmj zza(com.google.android.gms.internal.mlkit_vision_common.zzme zzmeVar) {
        com.google.android.gms.internal.mlkit_vision_common.zzmj zzmjVar;
        synchronized (com.google.android.gms.internal.mlkit_vision_common.zzms.class) {
            if (zza == null) {
                zza = new com.google.android.gms.internal.mlkit_vision_common.zzmr(null);
            }
            zzmjVar = (com.google.android.gms.internal.mlkit_vision_common.zzmj) zza.get(zzmeVar);
        }
        return zzmjVar;
    }

    public static com.google.android.gms.internal.mlkit_vision_common.zzmj zzb(java.lang.String str) {
        com.google.android.gms.internal.mlkit_vision_common.zzmj zza2;
        synchronized (com.google.android.gms.internal.mlkit_vision_common.zzms.class) {
            zza2 = zza(com.google.android.gms.internal.mlkit_vision_common.zzme.zzd("vision-common").zzd());
        }
        return zza2;
    }
}
