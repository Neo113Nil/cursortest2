package b2;

import B.K;
import android.content.res.ColorStateList;
import android.graphics.Paint;

/* loaded from: classes.dex */
public final class i extends l {

    /* renamed from: d, reason: collision with root package name */
    public K f7234d;

    /* renamed from: e, reason: collision with root package name */
    public float f7235e;
    public K f;

    /* renamed from: g, reason: collision with root package name */
    public float f7236g;

    /* renamed from: h, reason: collision with root package name */
    public float f7237h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f7238j;

    /* renamed from: k, reason: collision with root package name */
    public float f7239k;

    /* renamed from: l, reason: collision with root package name */
    public Paint.Cap f7240l;

    /* renamed from: m, reason: collision with root package name */
    public Paint.Join f7241m;

    /* renamed from: n, reason: collision with root package name */
    public float f7242n;

    @Override // b2.k
    public final boolean a() {
        return this.f.h() || this.f7234d.h();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // b2.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int[] iArr) {
        boolean z3;
        K k5;
        K k6 = this.f;
        boolean z5 = false;
        if (k6.h()) {
            ColorStateList colorStateList = (ColorStateList) k6.f639d;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != k6.f637b) {
                k6.f637b = colorForState;
                z3 = true;
                k5 = this.f7234d;
                if (k5.h()) {
                    ColorStateList colorStateList2 = (ColorStateList) k5.f639d;
                    int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
                    if (colorForState2 != k5.f637b) {
                        k5.f637b = colorForState2;
                        z5 = true;
                    }
                }
                return z3 | z5;
            }
        }
        z3 = false;
        k5 = this.f7234d;
        if (k5.h()) {
        }
        return z3 | z5;
    }

    public float getFillAlpha() {
        return this.f7237h;
    }

    public int getFillColor() {
        return this.f.f637b;
    }

    public float getStrokeAlpha() {
        return this.f7236g;
    }

    public int getStrokeColor() {
        return this.f7234d.f637b;
    }

    public float getStrokeWidth() {
        return this.f7235e;
    }

    public float getTrimPathEnd() {
        return this.f7238j;
    }

    public float getTrimPathOffset() {
        return this.f7239k;
    }

    public float getTrimPathStart() {
        return this.i;
    }

    public void setFillAlpha(float f) {
        this.f7237h = f;
    }

    public void setFillColor(int i) {
        this.f.f637b = i;
    }

    public void setStrokeAlpha(float f) {
        this.f7236g = f;
    }

    public void setStrokeColor(int i) {
        this.f7234d.f637b = i;
    }

    public void setStrokeWidth(float f) {
        this.f7235e = f;
    }

    public void setTrimPathEnd(float f) {
        this.f7238j = f;
    }

    public void setTrimPathOffset(float f) {
        this.f7239k = f;
    }

    public void setTrimPathStart(float f) {
        this.i = f;
    }
}
