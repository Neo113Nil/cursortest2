package com.microblink.blinkid.metadata;

/* loaded from: classes10.dex */
public abstract class DisplayableObject {
    public final android.graphics.Matrix llIIlIlIIl;

    public DisplayableObject(float[] fArr) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        this.llIIlIlIIl = matrix;
        matrix.setValues(fArr);
    }

    public final android.graphics.Matrix getTransformMatrix() {
        return this.llIIlIlIIl;
    }
}
