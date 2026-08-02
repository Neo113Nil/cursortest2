package androidx.constraintlayout.helper.widget;

import B.c;
import B.q;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import v.C1654e;

/* loaded from: classes.dex */
public class Layer extends ConstraintHelper {

    /* renamed from: A, reason: collision with root package name */
    public float f8794A;

    /* renamed from: B, reason: collision with root package name */
    public float f8795B;

    /* renamed from: C, reason: collision with root package name */
    public ConstraintLayout f8796C;

    /* renamed from: D, reason: collision with root package name */
    public float f8797D;

    /* renamed from: E, reason: collision with root package name */
    public float f8798E;

    /* renamed from: F, reason: collision with root package name */
    public float f8799F;

    /* renamed from: G, reason: collision with root package name */
    public float f8800G;

    /* renamed from: H, reason: collision with root package name */
    public float f8801H;

    /* renamed from: I, reason: collision with root package name */
    public float f8802I;

    /* renamed from: J, reason: collision with root package name */
    public float f8803J;

    /* renamed from: K, reason: collision with root package name */
    public float f8804K;

    /* renamed from: L, reason: collision with root package name */
    public final boolean f8805L;

    /* renamed from: M, reason: collision with root package name */
    public View[] f8806M;

    /* renamed from: N, reason: collision with root package name */
    public float f8807N;

    /* renamed from: O, reason: collision with root package name */
    public float f8808O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f8809P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f8810Q;

    /* renamed from: z, reason: collision with root package name */
    public float f8811z;

    public Layer(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f8811z = Float.NaN;
        this.f8794A = Float.NaN;
        this.f8795B = Float.NaN;
        this.f8797D = 1.0f;
        this.f8798E = 1.0f;
        this.f8799F = Float.NaN;
        this.f8800G = Float.NaN;
        this.f8801H = Float.NaN;
        this.f8802I = Float.NaN;
        this.f8803J = Float.NaN;
        this.f8804K = Float.NaN;
        this.f8805L = true;
        this.f8806M = null;
        this.f8807N = 0.0f;
        this.f8808O = 0.0f;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void g(ConstraintLayout constraintLayout) {
        f(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void k(AttributeSet attributeSet) {
        super.k(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q.f932c);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = obtainStyledAttributes.getIndex(i7);
                if (index == 6) {
                    this.f8809P = true;
                } else if (index == 22) {
                    this.f8810Q = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void n() {
        s();
        this.f8799F = Float.NaN;
        this.f8800G = Float.NaN;
        C1654e c1654e = ((c) getLayoutParams()).f758q0;
        c1654e.P(0);
        c1654e.M(0);
        r();
        layout(((int) this.f8803J) - getPaddingLeft(), ((int) this.f8804K) - getPaddingTop(), getPaddingRight() + ((int) this.f8801H), getPaddingBottom() + ((int) this.f8802I));
        t();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void o(ConstraintLayout constraintLayout) {
        this.f8796C = constraintLayout;
        float rotation = getRotation();
        if (rotation != 0.0f) {
            this.f8795B = rotation;
        } else {
            if (Float.isNaN(this.f8795B)) {
                return;
            }
            this.f8795B = rotation;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f8796C = (ConstraintLayout) getParent();
        if (this.f8809P || this.f8810Q) {
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i7 = 0; i7 < this.f8991b; i7++) {
                View b7 = this.f8796C.b(this.f8990a[i7]);
                if (b7 != null) {
                    if (this.f8809P) {
                        b7.setVisibility(visibility);
                    }
                    if (this.f8810Q && elevation > 0.0f) {
                        b7.setTranslationZ(b7.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    public final void r() {
        if (this.f8796C == null) {
            return;
        }
        if (this.f8805L || Float.isNaN(this.f8799F) || Float.isNaN(this.f8800G)) {
            if (!Float.isNaN(this.f8811z) && !Float.isNaN(this.f8794A)) {
                this.f8800G = this.f8794A;
                this.f8799F = this.f8811z;
                return;
            }
            View[] j = j(this.f8796C);
            int left = j[0].getLeft();
            int top = j[0].getTop();
            int right = j[0].getRight();
            int bottom = j[0].getBottom();
            for (int i7 = 0; i7 < this.f8991b; i7++) {
                View view = j[i7];
                left = Math.min(left, view.getLeft());
                top = Math.min(top, view.getTop());
                right = Math.max(right, view.getRight());
                bottom = Math.max(bottom, view.getBottom());
            }
            this.f8801H = right;
            this.f8802I = bottom;
            this.f8803J = left;
            this.f8804K = top;
            if (Float.isNaN(this.f8811z)) {
                this.f8799F = (left + right) / 2;
            } else {
                this.f8799F = this.f8811z;
            }
            if (Float.isNaN(this.f8794A)) {
                this.f8800G = (top + bottom) / 2;
            } else {
                this.f8800G = this.f8794A;
            }
        }
    }

    public final void s() {
        int i7;
        if (this.f8796C == null || (i7 = this.f8991b) == 0) {
            return;
        }
        View[] viewArr = this.f8806M;
        if (viewArr == null || viewArr.length != i7) {
            this.f8806M = new View[i7];
        }
        for (int i8 = 0; i8 < this.f8991b; i8++) {
            this.f8806M[i8] = this.f8796C.b(this.f8990a[i8]);
        }
    }

    @Override // android.view.View
    public void setElevation(float f7) {
        super.setElevation(f7);
        e();
    }

    @Override // android.view.View
    public void setPivotX(float f7) {
        this.f8811z = f7;
        t();
    }

    @Override // android.view.View
    public void setPivotY(float f7) {
        this.f8794A = f7;
        t();
    }

    @Override // android.view.View
    public void setRotation(float f7) {
        this.f8795B = f7;
        t();
    }

    @Override // android.view.View
    public void setScaleX(float f7) {
        this.f8797D = f7;
        t();
    }

    @Override // android.view.View
    public void setScaleY(float f7) {
        this.f8798E = f7;
        t();
    }

    @Override // android.view.View
    public void setTranslationX(float f7) {
        this.f8807N = f7;
        t();
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        this.f8808O = f7;
        t();
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        e();
    }

    public final void t() {
        if (this.f8796C == null) {
            return;
        }
        if (this.f8806M == null) {
            s();
        }
        r();
        double radians = Float.isNaN(this.f8795B) ? 0.0d : Math.toRadians(this.f8795B);
        float sin = (float) Math.sin(radians);
        float cos = (float) Math.cos(radians);
        float f7 = this.f8797D;
        float f8 = f7 * cos;
        float f9 = this.f8798E;
        float f10 = (-f9) * sin;
        float f11 = f7 * sin;
        float f12 = f9 * cos;
        for (int i7 = 0; i7 < this.f8991b; i7++) {
            View view = this.f8806M[i7];
            int right = (view.getRight() + view.getLeft()) / 2;
            int bottom = (view.getBottom() + view.getTop()) / 2;
            float f13 = right - this.f8799F;
            float f14 = bottom - this.f8800G;
            float f15 = (((f10 * f14) + (f8 * f13)) - f13) + this.f8807N;
            float f16 = (((f12 * f14) + (f13 * f11)) - f14) + this.f8808O;
            view.setTranslationX(f15);
            view.setTranslationY(f16);
            view.setScaleY(this.f8798E);
            view.setScaleX(this.f8797D);
            if (!Float.isNaN(this.f8795B)) {
                view.setRotation(this.f8795B);
            }
        }
    }
}
