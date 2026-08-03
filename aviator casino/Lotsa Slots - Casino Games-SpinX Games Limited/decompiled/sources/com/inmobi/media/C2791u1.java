package com.inmobi.media;

/* renamed from: com.inmobi.media.u1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2791u1 extends android.view.animation.Animation {
    public final float b;
    public final float c;
    public android.graphics.Camera e;

    /* renamed from: a, reason: collision with root package name */
    public final float f5476a = 90.0f;
    public final boolean d = true;

    public C2791u1(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, android.view.animation.Transformation t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "t");
        float f2 = ((this.f5476a - 0.0f) * f) + 0.0f;
        float f3 = this.b;
        float f4 = this.c;
        android.graphics.Camera camera = this.e;
        android.graphics.Matrix matrix = t.getMatrix();
        if (camera != null) {
            camera.save();
            if (this.d) {
                camera.translate(0.0f, 0.0f, f * 0.0f);
            } else {
                camera.translate(0.0f, 0.0f, (1.0f - f) * 0.0f);
            }
            camera.rotateX(f2);
            camera.getMatrix(matrix);
            camera.restore();
        }
        matrix.preTranslate(-f3, -f4);
        matrix.postTranslate(f3, f4);
    }

    @Override // android.view.animation.Animation
    public final void initialize(int i, int i2, int i3, int i4) {
        super.initialize(i, i2, i3, i4);
        this.e = new android.graphics.Camera();
    }
}
