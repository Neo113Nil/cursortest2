package com.google.mlkit.vision.common;

/* loaded from: classes9.dex */
final class zzb {
    private final android.media.Image zza;

    final android.media.Image.Plane[] zzb() {
        return this.zza.getPlanes();
    }

    final android.media.Image zza() {
        return this.zza;
    }

    zzb(android.media.Image image) {
        this.zza = image;
    }
}
