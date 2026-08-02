package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class IIlIIllIll extends android.view.animation.Animation {
    public final float IlIllIlIIl;
    public final float IllIIIIllI;
    public final float IllIIIllII;
    public final float lIlIIIIlIl;
    public final float llIIIlllll;
    public final float llIIlIlIIl;

    public IIlIIllIll(float f, float f2, float f3, float f4, boolean z) {
        this.llIIlIlIIl = f;
        this.IlIllIlIIl = f2;
        if (z) {
            this.IllIIIllII = (f3 - f4) * 0.5f;
            this.llIIIlllll = (f4 - f3) * 0.5f;
        } else {
            this.IllIIIllII = 0.0f;
            this.llIIIlllll = 0.0f;
        }
        if (z) {
            this.IllIIIIllI = f4 * 0.5f;
            this.lIlIIIIlIl = f3 * 0.5f;
        } else {
            this.IllIIIIllI = f3 * 0.5f;
            this.lIlIIIIlIl = f4 * 0.5f;
        }
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, android.view.animation.Transformation transformation) {
        transformation.getMatrix().preTranslate(this.IllIIIllII, this.llIIIlllll);
        android.graphics.Matrix matrix = transformation.getMatrix();
        float f2 = this.llIIlIlIIl;
        matrix.preRotate(((this.IlIllIlIIl - f2) * f) + f2, this.IllIIIIllI, this.lIlIIIIlIl);
    }
}
