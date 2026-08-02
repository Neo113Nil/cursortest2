package com.google.android.gms.internal.mlkit_vision_common;

/* loaded from: classes8.dex */
public final class zzmu {
    public static void zza(com.google.android.gms.internal.mlkit_vision_common.zzmj zzmjVar, int i, int i2, long j, int i3, int i4, int i5, int i6) {
        zzmjVar.zzc(zzc(i, i2, j, i3, i4, i5, i6), com.google.android.gms.internal.mlkit_vision_common.zziv.INPUT_IMAGE_CONSTRUCTION);
    }

    public static void zzb(com.google.android.gms.internal.mlkit_vision_common.zzmj zzmjVar, int i, int i2, long j, int i3, int i4, int i5, int i6) {
        zzmjVar.zzc(zzc(i, i2, j, i3, i4, i5, i6), com.google.android.gms.internal.mlkit_vision_common.zziv.ODML_IMAGE);
    }

    private static com.google.android.gms.internal.mlkit_vision_common.zzmt zzc(int i, int i2, long j, int i3, int i4, int i5, int i6) {
        return new com.google.android.gms.internal.mlkit_vision_common.zzmt(i, i2, i5, i3, i4, android.os.SystemClock.elapsedRealtime() - j, i6);
    }
}
