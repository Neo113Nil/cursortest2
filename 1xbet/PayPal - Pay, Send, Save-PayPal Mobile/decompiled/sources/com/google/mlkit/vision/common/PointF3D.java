package com.google.mlkit.vision.common;

/* loaded from: classes9.dex */
public abstract class PointF3D {
    public abstract float getX();

    public abstract float getY();

    public abstract float getZ();

    public static com.google.mlkit.vision.common.PointF3D from(float f, float f2, float f3) {
        return new com.google.mlkit.vision.common.zza(f, f2, f3);
    }
}
