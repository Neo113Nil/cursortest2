package com.google.mlkit.vision.common;

/* loaded from: classes9.dex */
public class Triangle<T> {
    private final com.google.android.gms.internal.mlkit_vision_common.zzp zza;

    public Triangle(T t, T t2, T t3) {
        this.zza = com.google.android.gms.internal.mlkit_vision_common.zzp.zzj(t, t2, t3);
    }

    public java.util.List<T> getAllPoints() {
        return this.zza;
    }
}
