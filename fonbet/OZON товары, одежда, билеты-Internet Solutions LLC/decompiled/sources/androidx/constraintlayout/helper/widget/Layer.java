package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import androidx.constraintlayout.widget.i;
import m2.e;

/* loaded from: classes8.dex */
public class Layer extends b {

    /* renamed from: a, reason: collision with root package name */
    private float f41202a;

    /* renamed from: b, reason: collision with root package name */
    private float f41203b;

    /* renamed from: c, reason: collision with root package name */
    private float f41204c;

    /* renamed from: d, reason: collision with root package name */
    ConstraintLayout f41205d;

    /* renamed from: e, reason: collision with root package name */
    private float f41206e;

    /* renamed from: f, reason: collision with root package name */
    private float f41207f;

    /* renamed from: g, reason: collision with root package name */
    protected float f41208g;

    /* renamed from: h, reason: collision with root package name */
    protected float f41209h;

    /* renamed from: i, reason: collision with root package name */
    protected float f41210i;

    /* renamed from: j, reason: collision with root package name */
    protected float f41211j;

    /* renamed from: k, reason: collision with root package name */
    protected float f41212k;

    /* renamed from: l, reason: collision with root package name */
    protected float f41213l;

    /* renamed from: m, reason: collision with root package name */
    boolean f41214m;

    /* renamed from: n, reason: collision with root package name */
    View[] f41215n;

    /* renamed from: o, reason: collision with root package name */
    private float f41216o;

    /* renamed from: p, reason: collision with root package name */
    private float f41217p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f41218q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f41219r;

    public Layer(Context context) {
        super(context);
        this.f41202a = Float.NaN;
        this.f41203b = Float.NaN;
        this.f41204c = Float.NaN;
        this.f41206e = 1.0f;
        this.f41207f = 1.0f;
        this.f41208g = Float.NaN;
        this.f41209h = Float.NaN;
        this.f41210i = Float.NaN;
        this.f41211j = Float.NaN;
        this.f41212k = Float.NaN;
        this.f41213l = Float.NaN;
        this.f41214m = true;
        this.f41215n = null;
        this.f41216o = 0.0f;
        this.f41217p = 0.0f;
    }

    private void b() {
        int i11;
        if (this.f41205d == null || (i11 = this.mCount) == 0) {
            return;
        }
        View[] viewArr = this.f41215n;
        if (viewArr == null || viewArr.length != i11) {
            this.f41215n = new View[i11];
        }
        for (int i12 = 0; i12 < this.mCount; i12++) {
            this.f41215n[i12] = this.f41205d.getViewById(this.mIds[i12]);
        }
    }

    private void c() {
        if (this.f41205d == null) {
            return;
        }
        if (this.f41215n == null) {
            b();
        }
        a();
        double radians = Float.isNaN(this.f41204c) ? 0.0d : Math.toRadians(this.f41204c);
        float sin = (float) Math.sin(radians);
        float cos = (float) Math.cos(radians);
        float f7 = this.f41206e;
        float f11 = f7 * cos;
        float f12 = this.f41207f;
        float f13 = (-f12) * sin;
        float f14 = f7 * sin;
        float f15 = f12 * cos;
        for (int i11 = 0; i11 < this.mCount; i11++) {
            View view = this.f41215n[i11];
            int right = (view.getRight() + view.getLeft()) / 2;
            int bottom = (view.getBottom() + view.getTop()) / 2;
            float f16 = right - this.f41208g;
            float f17 = bottom - this.f41209h;
            float f18 = (((f13 * f17) + (f11 * f16)) - f16) + this.f41216o;
            float f19 = (((f15 * f17) + (f16 * f14)) - f17) + this.f41217p;
            view.setTranslationX(f18);
            view.setTranslationY(f19);
            view.setScaleY(this.f41207f);
            view.setScaleX(this.f41206e);
            if (!Float.isNaN(this.f41204c)) {
                view.setRotation(this.f41204c);
            }
        }
    }

    protected final void a() {
        if (this.f41205d == null) {
            return;
        }
        if (this.f41214m || Float.isNaN(this.f41208g) || Float.isNaN(this.f41209h)) {
            if (!Float.isNaN(this.f41202a) && !Float.isNaN(this.f41203b)) {
                this.f41209h = this.f41203b;
                this.f41208g = this.f41202a;
                return;
            }
            View[] views = getViews(this.f41205d);
            int left = views[0].getLeft();
            int top = views[0].getTop();
            int right = views[0].getRight();
            int bottom = views[0].getBottom();
            for (int i11 = 0; i11 < this.mCount; i11++) {
                View view = views[i11];
                left = Math.min(left, view.getLeft());
                top = Math.min(top, view.getTop());
                right = Math.max(right, view.getRight());
                bottom = Math.max(bottom, view.getBottom());
            }
            this.f41210i = right;
            this.f41211j = bottom;
            this.f41212k = left;
            this.f41213l = top;
            if (Float.isNaN(this.f41202a)) {
                this.f41208g = (left + right) / 2;
            } else {
                this.f41208g = this.f41202a;
            }
            if (Float.isNaN(this.f41203b)) {
                this.f41209h = (top + bottom) / 2;
            } else {
                this.f41209h = this.f41203b;
            }
        }
    }

    @Override // androidx.constraintlayout.widget.b
    protected final void applyLayoutFeaturesInConstraintSet(ConstraintLayout constraintLayout) {
        applyLayoutFeatures(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.b
    protected final void init(AttributeSet attributeSet) {
        super.init(attributeSet);
        this.mUseViewMeasure = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f41845b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == 6) {
                    this.f41218q = true;
                } else if (index == 22) {
                    this.f41219r = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.b, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f41205d = (ConstraintLayout) getParent();
        if (this.f41218q || this.f41219r) {
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i11 = 0; i11 < this.mCount; i11++) {
                View viewById = this.f41205d.getViewById(this.mIds[i11]);
                if (viewById != null) {
                    if (this.f41218q) {
                        viewById.setVisibility(visibility);
                    }
                    if (this.f41219r && elevation > 0.0f) {
                        viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void setElevation(float f7) {
        super.setElevation(f7);
        applyLayoutFeatures();
    }

    @Override // android.view.View
    public final void setPivotX(float f7) {
        this.f41202a = f7;
        c();
    }

    @Override // android.view.View
    public final void setPivotY(float f7) {
        this.f41203b = f7;
        c();
    }

    @Override // android.view.View
    public final void setRotation(float f7) {
        this.f41204c = f7;
        c();
    }

    @Override // android.view.View
    public final void setScaleX(float f7) {
        this.f41206e = f7;
        c();
    }

    @Override // android.view.View
    public final void setScaleY(float f7) {
        this.f41207f = f7;
        c();
    }

    @Override // android.view.View
    public final void setTranslationX(float f7) {
        this.f41216o = f7;
        c();
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        this.f41217p = f7;
        c();
    }

    @Override // android.view.View
    public final void setVisibility(int i11) {
        super.setVisibility(i11);
        applyLayoutFeatures();
    }

    @Override // androidx.constraintlayout.widget.b
    public final void updatePostLayout(ConstraintLayout constraintLayout) {
        b();
        this.f41208g = Float.NaN;
        this.f41209h = Float.NaN;
        e a11 = ((ConstraintLayout.b) getLayoutParams()).a();
        a11.T0(0);
        a11.z0(0);
        a();
        layout(((int) this.f41212k) - getPaddingLeft(), ((int) this.f41213l) - getPaddingTop(), getPaddingRight() + ((int) this.f41210i), getPaddingBottom() + ((int) this.f41211j));
        c();
    }

    @Override // androidx.constraintlayout.widget.b
    public final void updatePreDraw(ConstraintLayout constraintLayout) {
        this.f41205d = constraintLayout;
        float rotation = getRotation();
        if (rotation != 0.0f) {
            this.f41204c = rotation;
        } else {
            if (Float.isNaN(this.f41204c)) {
                return;
            }
            this.f41204c = rotation;
        }
    }

    public Layer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41202a = Float.NaN;
        this.f41203b = Float.NaN;
        this.f41204c = Float.NaN;
        this.f41206e = 1.0f;
        this.f41207f = 1.0f;
        this.f41208g = Float.NaN;
        this.f41209h = Float.NaN;
        this.f41210i = Float.NaN;
        this.f41211j = Float.NaN;
        this.f41212k = Float.NaN;
        this.f41213l = Float.NaN;
        this.f41214m = true;
        this.f41215n = null;
        this.f41216o = 0.0f;
        this.f41217p = 0.0f;
    }
}
