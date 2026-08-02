package androidx.slidingpanelayout.widget;

import D6.E;
import D6.Z;
import D6.z0;
import I0.b;
import I0.d;
import I0.e;
import I0.f;
import P.J;
import P.U;
import P.q0;
import X0.c;
import X0.g;
import X0.h;
import a0.C0604a;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.customview.view.AbsSavedState;
import e1.k;
import e3.C1023h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class SlidingPaneLayout extends ViewGroup {

    /* renamed from: O, reason: collision with root package name */
    public static final boolean f9772O;

    /* renamed from: A, reason: collision with root package name */
    public boolean f9773A;

    /* renamed from: B, reason: collision with root package name */
    public int f9774B;

    /* renamed from: C, reason: collision with root package name */
    public float f9775C;

    /* renamed from: D, reason: collision with root package name */
    public float f9776D;

    /* renamed from: E, reason: collision with root package name */
    public final CopyOnWriteArrayList f9777E;

    /* renamed from: F, reason: collision with root package name */
    public final C0604a f9778F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f9779G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f9780H;

    /* renamed from: I, reason: collision with root package name */
    public final Rect f9781I;

    /* renamed from: J, reason: collision with root package name */
    public final ArrayList f9782J;

    /* renamed from: K, reason: collision with root package name */
    public int f9783K;

    /* renamed from: L, reason: collision with root package name */
    public c f9784L;

    /* renamed from: M, reason: collision with root package name */
    public final C1023h f9785M;

    /* renamed from: N, reason: collision with root package name */
    public I0.c f9786N;

    /* renamed from: a, reason: collision with root package name */
    public int f9787a;

    /* renamed from: b, reason: collision with root package name */
    public int f9788b;

    /* renamed from: c, reason: collision with root package name */
    public Drawable f9789c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f9790d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9791e;

    /* renamed from: f, reason: collision with root package name */
    public View f9792f;

    /* renamed from: x, reason: collision with root package name */
    public float f9793x;

    /* renamed from: y, reason: collision with root package name */
    public float f9794y;

    /* renamed from: z, reason: collision with root package name */
    public int f9795z;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public boolean f9796c;

        /* renamed from: d, reason: collision with root package name */
        public int f9797d;

        public SavedState(Parcel parcel) {
            super(parcel, null);
            this.f9796c = parcel.readInt() != 0;
            this.f9797d = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeInt(this.f9796c ? 1 : 0);
            parcel.writeInt(this.f9797d);
        }
    }

    static {
        f9772O = Build.VERSION.SDK_INT >= 29;
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f9787a = 0;
        this.f9793x = 1.0f;
        this.f9777E = new CopyOnWriteArrayList();
        this.f9780H = true;
        this.f9781I = new Rect();
        this.f9782J = new ArrayList();
        this.f9785M = new C1023h(this);
        float f7 = context.getResources().getDisplayMetrics().density;
        setWillNotDraw(false);
        U.h(this, new d(this));
        setImportantForAccessibility(1);
        C0604a i8 = C0604a.i(this, 0.5f, new e(this));
        this.f9778F = i8;
        i8.f7940n = f7 * 400.0f;
        h.f7445k.getClass();
        setFoldingFeatureObserver(new I0.c(g.a(context), G.h.getMainExecutor(context)));
    }

    private I.c getSystemGestureInsets() {
        if (f9772O) {
            WeakHashMap weakHashMap = U.f5037a;
            q0 a2 = J.a(this);
            if (a2 != null) {
                return a2.f5101a.g();
            }
        }
        return null;
    }

    private void setFoldingFeatureObserver(I0.c cVar) {
        this.f9786N = cVar;
        cVar.getClass();
        C1023h c1023h = this.f9785M;
        t6.h.e(c1023h, "onFoldingFeatureChangeListener");
        cVar.f3494d = c1023h;
    }

    public final boolean a(View view) {
        if (view == null) {
            return false;
        }
        return this.f9791e && ((f) view.getLayoutParams()).f3501c && this.f9793x > 0.0f;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() != 1) {
            super.addView(view, i7, layoutParams);
            return;
        }
        I0.h hVar = new I0.h(view.getContext());
        hVar.addView(view);
        super.addView(hVar, i7, layoutParams);
    }

    public final boolean b() {
        WeakHashMap weakHashMap = U.f5037a;
        return getLayoutDirection() == 1;
    }

    public final boolean c() {
        return !this.f9791e || this.f9793x == 0.0f;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        C0604a c0604a = this.f9778F;
        if (c0604a.h()) {
            if (!this.f9791e) {
                c0604a.a();
            } else {
                WeakHashMap weakHashMap = U.f5037a;
                postInvalidateOnAnimation();
            }
        }
    }

    public final void d(float f7) {
        boolean b7 = b();
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt != this.f9792f) {
                float f8 = 1.0f - this.f9794y;
                int i8 = this.f9774B;
                this.f9794y = f7;
                int i9 = ((int) (f8 * i8)) - ((int) ((1.0f - f7) * i8));
                if (b7) {
                    i9 = -i9;
                }
                childAt.offsetLeftAndRight(i9);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i7;
        int i8;
        super.draw(canvas);
        Drawable drawable = b() ? this.f9790d : this.f9789c;
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt == null || drawable == null) {
            return;
        }
        int top = childAt.getTop();
        int bottom = childAt.getBottom();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (b()) {
            i8 = childAt.getRight();
            i7 = intrinsicWidth + i8;
        } else {
            int left = childAt.getLeft();
            int i9 = left - intrinsicWidth;
            i7 = left;
            i8 = i9;
        }
        drawable.setBounds(i8, top, i7, bottom);
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean b7 = b() ^ c();
        C0604a c0604a = this.f9778F;
        if (b7) {
            c0604a.f7943q = 1;
            I.c systemGestureInsets = getSystemGestureInsets();
            if (systemGestureInsets != null) {
                c0604a.f7941o = Math.max(c0604a.f7942p, systemGestureInsets.f3462a);
            }
        } else {
            c0604a.f7943q = 2;
            I.c systemGestureInsets2 = getSystemGestureInsets();
            if (systemGestureInsets2 != null) {
                c0604a.f7941o = Math.max(c0604a.f7942p, systemGestureInsets2.f3464c);
            }
        }
        f fVar = (f) view.getLayoutParams();
        int save = canvas.save();
        if (this.f9791e && !fVar.f3500b && this.f9792f != null) {
            Rect rect = this.f9781I;
            canvas.getClipBounds(rect);
            if (b()) {
                rect.left = Math.max(rect.left, this.f9792f.getRight());
            } else {
                rect.right = Math.min(rect.right, this.f9792f.getLeft());
            }
            canvas.clipRect(rect);
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        return drawChild;
    }

    public final boolean e(float f7) {
        int paddingLeft;
        if (!this.f9791e) {
            return false;
        }
        boolean b7 = b();
        f fVar = (f) this.f9792f.getLayoutParams();
        if (b7) {
            int paddingRight = getPaddingRight() + ((ViewGroup.MarginLayoutParams) fVar).rightMargin;
            paddingLeft = (int) (getWidth() - (((f7 * this.f9795z) + paddingRight) + this.f9792f.getWidth()));
        } else {
            paddingLeft = (int) ((f7 * this.f9795z) + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin);
        }
        View view = this.f9792f;
        if (!this.f9778F.v(view, paddingLeft, view.getTop())) {
            return false;
        }
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
        WeakHashMap weakHashMap = U.f5037a;
        postInvalidateOnAnimation();
        return true;
    }

    public final void f(View view) {
        int i7;
        int i8;
        int i9;
        int i10;
        View childAt;
        boolean z4;
        View view2 = view;
        boolean b7 = b();
        int width = b7 ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = b7 ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !view.isOpaque()) {
            i7 = 0;
            i8 = 0;
            i9 = 0;
            i10 = 0;
        } else {
            i7 = view.getLeft();
            i8 = view.getRight();
            i9 = view.getTop();
            i10 = view.getBottom();
        }
        int childCount = getChildCount();
        int i11 = 0;
        while (i11 < childCount && (childAt = getChildAt(i11)) != view2) {
            if (childAt.getVisibility() == 8) {
                z4 = b7;
            } else {
                z4 = b7;
                childAt.setVisibility((Math.max(b7 ? paddingLeft : width, childAt.getLeft()) < i7 || Math.max(paddingTop, childAt.getTop()) < i9 || Math.min(b7 ? width : paddingLeft, childAt.getRight()) > i8 || Math.min(height, childAt.getBottom()) > i10) ? 0 : 4);
            }
            i11++;
            view2 = view;
            b7 = z4;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        f fVar = new f(-1, -1);
        fVar.f3499a = 0.0f;
        return fVar;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            f fVar = new f((ViewGroup.MarginLayoutParams) layoutParams);
            fVar.f3499a = 0.0f;
            return fVar;
        }
        f fVar2 = new f(layoutParams);
        fVar2.f3499a = 0.0f;
        return fVar2;
    }

    @Deprecated
    public int getCoveredFadeColor() {
        return this.f9788b;
    }

    public final int getLockMode() {
        return this.f9783K;
    }

    public int getParallaxDistance() {
        return this.f9774B;
    }

    @Deprecated
    public int getSliderFadeColor() {
        return this.f9787a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        Activity activity;
        super.onAttachedToWindow();
        this.f9780H = true;
        if (this.f9786N != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity != null) {
                I0.c cVar = this.f9786N;
                cVar.getClass();
                z0 z0Var = cVar.f3493c;
                if (z0Var != null) {
                    z0Var.cancel(null);
                }
                cVar.f3493c = E.p(E.b(new Z(cVar.f3492b)), new b(cVar, activity, null));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        z0 z0Var;
        super.onDetachedFromWindow();
        this.f9780H = true;
        I0.c cVar = this.f9786N;
        if (cVar != null && (z0Var = cVar.f3493c) != null) {
            z0Var.cancel(null);
        }
        ArrayList arrayList = this.f9782J;
        if (arrayList.size() > 0) {
            throw k.c(arrayList, 0);
        }
        arrayList.clear();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        boolean z7 = this.f9791e;
        C0604a c0604a = this.f9778F;
        if (!z7 && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            int x4 = (int) motionEvent.getX();
            int y4 = (int) motionEvent.getY();
            c0604a.getClass();
            this.f9779G = C0604a.m(childAt, x4, y4);
        }
        if (!this.f9791e || (this.f9773A && actionMasked != 0)) {
            c0604a.b();
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (actionMasked == 3 || actionMasked == 1) {
            c0604a.b();
            return false;
        }
        if (actionMasked == 0) {
            this.f9773A = false;
            float x7 = motionEvent.getX();
            float y5 = motionEvent.getY();
            this.f9775C = x7;
            this.f9776D = y5;
            c0604a.getClass();
            if (C0604a.m(this.f9792f, (int) x7, (int) y5) && a(this.f9792f)) {
                z4 = true;
                return c0604a.u(motionEvent) || z4;
            }
        } else if (actionMasked == 2) {
            float x8 = motionEvent.getX();
            float y7 = motionEvent.getY();
            float abs = Math.abs(x8 - this.f9775C);
            float abs2 = Math.abs(y7 - this.f9776D);
            if (abs > c0604a.f7929b && abs2 > abs) {
                c0604a.b();
                this.f9773A = true;
                return false;
            }
        }
        z4 = false;
        if (c0604a.u(motionEvent)) {
            return true;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i7, int i8, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean b7 = b();
        int i17 = i9 - i7;
        int paddingRight = b7 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = b7 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f9780H) {
            this.f9793x = (this.f9791e && this.f9779G) ? 0.0f : 1.0f;
        }
        int i18 = paddingRight;
        int i19 = 0;
        while (i19 < childCount) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() == 8) {
                i11 = i18;
            } else {
                f fVar = (f) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (fVar.f3500b) {
                    int i20 = i17 - paddingLeft;
                    int min = (Math.min(paddingRight, i20) - i18) - (((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                    this.f9795z = min;
                    int i21 = b7 ? ((ViewGroup.MarginLayoutParams) fVar).rightMargin : ((ViewGroup.MarginLayoutParams) fVar).leftMargin;
                    fVar.f3501c = (measuredWidth / 2) + ((i18 + i21) + min) > i20;
                    float f7 = min;
                    int i22 = (int) (this.f9793x * f7);
                    i11 = i21 + i22 + i18;
                    this.f9793x = i22 / f7;
                    i12 = 0;
                } else if (!this.f9791e || (i13 = this.f9774B) == 0) {
                    i11 = paddingRight;
                    i12 = 0;
                } else {
                    i12 = (int) ((1.0f - this.f9793x) * i13);
                    i11 = paddingRight;
                }
                if (b7) {
                    i15 = (i17 - i11) + i12;
                    i14 = i15 - measuredWidth;
                } else {
                    i14 = i11 - i12;
                    i15 = i14 + measuredWidth;
                }
                childAt.layout(i14, paddingTop, i15, childAt.getMeasuredHeight() + paddingTop);
                c cVar = this.f9784L;
                if (cVar != null) {
                    U0.b bVar = cVar.f7433a;
                    int b8 = bVar.b();
                    int a2 = bVar.a();
                    X0.b bVar2 = X0.b.f7426e;
                    if ((b8 > a2 ? X0.b.f7427f : bVar2) == bVar2 && this.f9784L.a()) {
                        i16 = this.f9784L.f7433a.c().width();
                        paddingRight = Math.abs(i16) + childAt.getWidth() + paddingRight;
                    }
                }
                i16 = 0;
                paddingRight = Math.abs(i16) + childAt.getWidth() + paddingRight;
            }
            i19++;
            i18 = i11;
        }
        if (this.f9780H) {
            if (this.f9791e && this.f9774B != 0) {
                d(this.f9793x);
            }
            f(this.f9792f);
        }
        this.f9780H = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x0194, code lost:
    
        if (r5 == 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0083, code lost:
    
        if (((android.view.ViewGroup.MarginLayoutParams) r9).width == 0) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0265  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v21 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i7, int i8) {
        int paddingTop;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int makeMeasureSpec;
        ArrayList arrayList;
        C0604a c0604a;
        int i14;
        int i15;
        int i16;
        int minimumWidth;
        int makeMeasureSpec2;
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        int mode2 = View.MeasureSpec.getMode(i8);
        int size2 = View.MeasureSpec.getSize(i8);
        ?? r7 = 0;
        if (mode2 != Integer.MIN_VALUE) {
            i9 = mode2 != 1073741824 ? 0 : (size2 - getPaddingTop()) - getPaddingBottom();
            paddingTop = i9;
        } else {
            paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
            i9 = 0;
        }
        int max = Math.max((size - getPaddingLeft()) - getPaddingRight(), 0);
        int childCount = getChildCount();
        if (childCount > 2) {
            Log.e("SlidingPaneLayout", "onMeasure: More than two child views are not supported.");
        }
        this.f9792f = null;
        int i17 = 0;
        boolean z4 = false;
        int i18 = max;
        float f7 = 0.0f;
        while (true) {
            i10 = 8;
            if (i17 >= childCount) {
                break;
            }
            View childAt = getChildAt(i17);
            f fVar = (f) childAt.getLayoutParams();
            if (childAt.getVisibility() == 8) {
                fVar.f3501c = r7;
            } else {
                float f8 = fVar.f3499a;
                if (f8 > 0.0f) {
                    f7 += f8;
                }
                int max2 = Math.max(max - (((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin), (int) r7);
                int i19 = ((ViewGroup.MarginLayoutParams) fVar).width;
                if (i19 == -2) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(max2, mode == 0 ? mode : Integer.MIN_VALUE);
                } else {
                    makeMeasureSpec2 = i19 == -1 ? View.MeasureSpec.makeMeasureSpec(max2, mode) : View.MeasureSpec.makeMeasureSpec(i19, 1073741824);
                }
                childAt.measure(makeMeasureSpec2, ViewGroup.getChildMeasureSpec(i8, getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) fVar).height));
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredHeight > i9) {
                    if (mode2 == Integer.MIN_VALUE) {
                        i9 = Math.min(measuredHeight, paddingTop);
                    } else if (mode2 == 0) {
                        i9 = measuredHeight;
                    }
                }
                i18 -= measuredWidth;
                if (i17 != 0) {
                    boolean z7 = i18 < 0;
                    fVar.f3500b = z7;
                    z4 |= z7;
                    if (z7) {
                        this.f9792f = childAt;
                    }
                }
            }
            i17++;
            r7 = 0;
        }
        if (z4 || f7 > 0.0f) {
            int i20 = 0;
            while (i20 < childCount) {
                View childAt2 = getChildAt(i20);
                if (childAt2.getVisibility() == i10) {
                    i13 = i18;
                } else {
                    f fVar2 = (f) childAt2.getLayoutParams();
                    int i21 = ((ViewGroup.MarginLayoutParams) fVar2).width;
                    float f9 = fVar2.f3499a;
                    int measuredWidth2 = (i21 != 0 || f9 <= 0.0f) ? childAt2.getMeasuredWidth() : 0;
                    if (z4) {
                        i11 = max - (((ViewGroup.MarginLayoutParams) fVar2).leftMargin + ((ViewGroup.MarginLayoutParams) fVar2).rightMargin);
                        i12 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
                    } else if (f9 > 0.0f) {
                        i11 = measuredWidth2 + ((int) ((f9 * Math.max(0, i18)) / f7));
                        i12 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
                    } else {
                        i11 = measuredWidth2;
                        i12 = 0;
                    }
                    int paddingBottom = getPaddingBottom() + getPaddingTop();
                    f fVar3 = (f) childAt2.getLayoutParams();
                    i13 = i18;
                    if (((ViewGroup.MarginLayoutParams) fVar3).width == 0 && fVar3.f3499a > 0.0f) {
                        makeMeasureSpec = ViewGroup.getChildMeasureSpec(i8, paddingBottom, ((ViewGroup.MarginLayoutParams) fVar3).height);
                        if (measuredWidth2 != i11) {
                            childAt2.measure(i12, makeMeasureSpec);
                            int measuredHeight2 = childAt2.getMeasuredHeight();
                            if (measuredHeight2 > i9) {
                                if (mode2 == Integer.MIN_VALUE) {
                                    measuredHeight2 = Math.min(measuredHeight2, paddingTop);
                                }
                                i9 = measuredHeight2;
                            }
                        }
                    }
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                    if (measuredWidth2 != i11) {
                    }
                }
                i20++;
                i18 = i13;
                i10 = 8;
            }
        }
        c cVar = this.f9784L;
        if (cVar != null && cVar.a() && this.f9784L.f7433a.c().left != 0 && this.f9784L.f7433a.c().top == 0) {
            c cVar2 = this.f9784L;
            int[] iArr = new int[2];
            getLocationInWindow(iArr);
            int i22 = iArr[0];
            Rect rect = new Rect(i22, iArr[1], getWidth() + i22, getWidth() + iArr[1]);
            Rect rect2 = new Rect(cVar2.f7433a.c());
            boolean intersect = rect2.intersect(rect);
            if (!(rect2.width() == 0 && rect2.height() == 0) && intersect) {
                rect2.offset(-iArr[0], -iArr[1]);
            } else {
                rect2 = null;
            }
            if (rect2 != null) {
                Rect rect3 = new Rect(getPaddingLeft(), getPaddingTop(), Math.max(getPaddingLeft(), rect2.left), getHeight() - getPaddingBottom());
                int width = getWidth() - getPaddingRight();
                arrayList = new ArrayList(Arrays.asList(rect3, new Rect(Math.min(width, rect2.right), getPaddingTop(), width, getHeight() - getPaddingBottom())));
                if (arrayList != null && !z4) {
                    i14 = 0;
                    while (i14 < childCount) {
                        View childAt3 = getChildAt(i14);
                        if (childAt3.getVisibility() != 8) {
                            Rect rect4 = (Rect) arrayList.get(i14);
                            f fVar4 = (f) childAt3.getLayoutParams();
                            int i23 = ((ViewGroup.MarginLayoutParams) fVar4).leftMargin + ((ViewGroup.MarginLayoutParams) fVar4).rightMargin;
                            int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(childAt3.getMeasuredHeight(), 1073741824);
                            childAt3.measure(View.MeasureSpec.makeMeasureSpec(rect4.width(), Integer.MIN_VALUE), makeMeasureSpec3);
                            if ((childAt3.getMeasuredWidthAndState() & 16777216) != 1) {
                                boolean z8 = childAt3 instanceof I0.h;
                                if (z8) {
                                    View childAt4 = ((I0.h) childAt3).getChildAt(0);
                                    WeakHashMap weakHashMap = U.f5037a;
                                    minimumWidth = childAt4.getMinimumWidth();
                                } else {
                                    WeakHashMap weakHashMap2 = U.f5037a;
                                    minimumWidth = childAt3.getMinimumWidth();
                                }
                                if (minimumWidth != 0) {
                                    i15 = rect4.width() < (z8 ? ((I0.h) childAt3).getChildAt(0).getMinimumWidth() : childAt3.getMinimumWidth()) ? 1073741824 : 1073741824;
                                }
                                childAt3.measure(View.MeasureSpec.makeMeasureSpec(rect4.width(), 1073741824), makeMeasureSpec3);
                            }
                            childAt3.measure(View.MeasureSpec.makeMeasureSpec(max - i23, i15), makeMeasureSpec3);
                            if (i14 != 0) {
                                i16 = 1;
                                fVar4.f3500b = true;
                                this.f9792f = childAt3;
                                z4 = true;
                                i14 += i16;
                            }
                        }
                        i16 = 1;
                        i14 += i16;
                    }
                }
                boolean z9 = z4;
                setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + i9);
                this.f9791e = z9;
                c0604a = this.f9778F;
                if (c0604a.f7928a != 0 || z9) {
                }
                c0604a.a();
                return;
            }
        }
        arrayList = null;
        if (arrayList != null) {
            i14 = 0;
            while (i14 < childCount) {
            }
        }
        boolean z92 = z4;
        setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + i9);
        this.f9791e = z92;
        c0604a = this.f9778F;
        if (c0604a.f7928a != 0) {
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f9102a);
        if (savedState.f9796c) {
            if (!this.f9791e) {
                this.f9779G = true;
            }
            if (this.f9780H || e(0.0f)) {
                this.f9779G = true;
            }
        } else {
            if (!this.f9791e) {
                this.f9779G = false;
            }
            if (this.f9780H || e(1.0f)) {
                this.f9779G = false;
            }
        }
        this.f9779G = savedState.f9796c;
        setLockMode(savedState.f9797d);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f9796c = this.f9791e ? c() : this.f9779G;
        savedState.f9797d = this.f9783K;
        return savedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        if (i7 != i9) {
            this.f9780H = true;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f9791e) {
            return super.onTouchEvent(motionEvent);
        }
        C0604a c0604a = this.f9778F;
        c0604a.n(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x4 = motionEvent.getX();
            float y4 = motionEvent.getY();
            this.f9775C = x4;
            this.f9776D = y4;
        } else if (actionMasked == 1 && a(this.f9792f)) {
            float x7 = motionEvent.getX();
            float y5 = motionEvent.getY();
            float f7 = x7 - this.f9775C;
            float f8 = y5 - this.f9776D;
            int i7 = c0604a.f7929b;
            if ((f8 * f8) + (f7 * f7) < i7 * i7 && C0604a.m(this.f9792f, (int) x7, (int) y5)) {
                if (!this.f9791e) {
                    this.f9779G = false;
                }
                if (this.f9780H || e(1.0f)) {
                    this.f9779G = false;
                }
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (view.getParent() instanceof I0.h) {
            super.removeView((View) view.getParent());
        } else {
            super.removeView(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (isInTouchMode() || this.f9791e) {
            return;
        }
        this.f9779G = view == this.f9792f;
    }

    @Deprecated
    public void setCoveredFadeColor(int i7) {
        this.f9788b = i7;
    }

    public final void setLockMode(int i7) {
        this.f9783K = i7;
    }

    @Deprecated
    public void setPanelSlideListener(I0.g gVar) {
        if (gVar != null) {
            this.f9777E.add(gVar);
        }
    }

    public void setParallaxDistance(int i7) {
        this.f9774B = i7;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(Drawable drawable) {
        this.f9789c = drawable;
    }

    public void setShadowDrawableRight(Drawable drawable) {
        this.f9790d = drawable;
    }

    @Deprecated
    public void setShadowResource(int i7) {
        setShadowDrawableLeft(getResources().getDrawable(i7));
    }

    public void setShadowResourceLeft(int i7) {
        setShadowDrawableLeft(G.h.getDrawable(getContext(), i7));
    }

    public void setShadowResourceRight(int i7) {
        setShadowDrawableRight(G.h.getDrawable(getContext(), i7));
    }

    @Deprecated
    public void setSliderFadeColor(int i7) {
        this.f9787a = i7;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        f fVar = new f(context, attributeSet);
        fVar.f3499a = 0.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.f3498d);
        fVar.f3499a = obtainStyledAttributes.getFloat(0, 0.0f);
        obtainStyledAttributes.recycle();
        return fVar;
    }
}
