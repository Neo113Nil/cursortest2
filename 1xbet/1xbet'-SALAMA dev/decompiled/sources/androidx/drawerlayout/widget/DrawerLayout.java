package androidx.drawerlayout.widget;

import C0.F;
import P.I;
import P.U;
import V.h;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p031e1.k;
import p038f0.b;
import p038f0.c;
import p038f0.d;

/* JADX INFO: loaded from: classes.dex */
public class DrawerLayout extends ViewGroup {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final int[] f9269R = {R.attr.colorPrimaryDark};

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final int[] f9270S = {R.attr.layout_gravity};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f9271A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f9272B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f9273C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f9274D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f9275E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f9276F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f9277G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f9278H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public ArrayList f9279I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public float f9280J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public float f9281K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public Drawable f9282L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public WindowInsets f9283M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f9284N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final ArrayList f9285O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public Rect f9286P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public Matrix f9287Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f9288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f9291d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f9292e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p004a0.a f9293f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final p004a0.a f9294x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final d f9295y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final d f9296z;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f9297c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f9298d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f9299e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f9300f;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f9301x;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f9297c = 0;
            this.f9297c = parcel.readInt();
            this.f9298d = parcel.readInt();
            this.f9299e = parcel.readInt();
            this.f9300f = parcel.readInt();
            this.f9301x = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeInt(this.f9297c);
            parcel.writeInt(this.f9298d);
            parcel.writeInt(this.f9299e);
            parcel.writeInt(this.f9300f);
            parcel.writeInt(this.f9301x);
        }
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        new h(1);
        this.f9290c = -1728053248;
        this.f9292e = new Paint();
        this.f9273C = true;
        this.f9274D = 3;
        this.f9275E = 3;
        this.f9276F = 3;
        this.f9277G = 3;
        setDescendantFocusability(262144);
        float f7 = getResources().getDisplayMetrics().density;
        this.f9289b = (int) ((64.0f * f7) + 0.5f);
        float f8 = 400.0f * f7;
        d dVar = new d(this, 3);
        this.f9295y = dVar;
        d dVar2 = new d(this, 5);
        this.f9296z = dVar2;
        p004a0.a aVarI = p004a0.a.i(this, 1.0f, dVar);
        this.f9293f = aVarI;
        aVarI.f7943q = 1;
        aVarI.f7940n = f8;
        dVar.f12769l = aVarI;
        p004a0.a aVarI2 = p004a0.a.i(this, 1.0f, dVar2);
        this.f9294x = aVarI2;
        aVarI2.f7943q = 2;
        aVarI2.f7940n = f8;
        dVar2.f12769l = aVarI2;
        setFocusableInTouchMode(true);
        WeakHashMap weakHashMap = U.f5037a;
        setImportantForAccessibility(1);
        U.h(this, new F(this));
        setMotionEventSplittingEnabled(false);
        if (getFitsSystemWindows()) {
            setOnApplyWindowInsetsListener(new p038f0.a());
            setSystemUiVisibility(1280);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f9269R);
            try {
                this.f9282L = typedArrayObtainStyledAttributes.getDrawable(0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.f9288a = f7 * 10.0f;
        this.f9285O = new ArrayList();
    }

    public static boolean i(View view) {
        return ((c) view.getLayoutParams()).f12764a == 0;
    }

    public static boolean j(View view) {
        int i7 = ((c) view.getLayoutParams()).f12764a;
        WeakHashMap weakHashMap = U.f5037a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i7, view.getLayoutDirection());
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    public final boolean a(View view, int i7) {
        return (h(view) & i7) == i7;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i7, int i8) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        int i9 = 0;
        boolean z4 = false;
        while (true) {
            ArrayList arrayList2 = this.f9285O;
            if (i9 >= childCount) {
                if (!z4) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        View view = (View) arrayList2.get(i10);
                        if (view.getVisibility() == 0) {
                            view.addFocusables(arrayList, i7, i8);
                        }
                    }
                }
                arrayList2.clear();
                return;
            }
            View childAt = getChildAt(i9);
            if (!j(childAt)) {
                arrayList2.add(childAt);
            } else {
                if (!j(childAt)) {
                    throw new IllegalArgumentException("View " + childAt + " is not a drawer");
                }
                if ((((c) childAt.getLayoutParams()).f12767d & 1) == 1) {
                    childAt.addFocusables(arrayList, i7, i8);
                    z4 = true;
                }
            }
            i9++;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i7, layoutParams);
        if (e() != null || j(view)) {
            WeakHashMap weakHashMap = U.f5037a;
            view.setImportantForAccessibility(4);
        } else {
            WeakHashMap weakHashMap2 = U.f5037a;
            view.setImportantForAccessibility(1);
        }
    }

    public final void b(View view) {
        if (!j(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        c cVar = (c) view.getLayoutParams();
        if (this.f9273C) {
            cVar.f12765b = 0.0f;
            cVar.f12767d = 0;
        } else {
            cVar.f12767d |= 4;
            if (a(view, 3)) {
                this.f9293f.v(view, -view.getWidth(), view.getTop());
            } else {
                this.f9294x.v(view, getWidth(), view.getTop());
            }
        }
        invalidate();
    }

    public final void c(boolean z4) {
        int childCount = getChildCount();
        boolean zV = false;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            c cVar = (c) childAt.getLayoutParams();
            if (j(childAt) && (!z4 || cVar.f12766c)) {
                zV |= a(childAt, 3) ? this.f9293f.v(childAt, -childAt.getWidth(), childAt.getTop()) : this.f9294x.v(childAt, getWidth(), childAt.getTop());
                cVar.f12766c = false;
            }
        }
        d dVar = this.f9295y;
        dVar.f12771n.removeCallbacks(dVar.f12770m);
        d dVar2 = this.f9296z;
        dVar2.f12771n.removeCallbacks(dVar2.f12770m);
        if (zV) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof c) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i7 = 0; i7 < childCount; i7++) {
            fMax = Math.max(fMax, ((c) getChildAt(i7).getLayoutParams()).f12765b);
        }
        this.f9291d = fMax;
        boolean zH = this.f9293f.h();
        boolean zH2 = this.f9294x.h();
        if (zH || zH2) {
            WeakHashMap weakHashMap = U.f5037a;
            postInvalidateOnAnimation();
        }
    }

    public final View d(int i7) {
        WeakHashMap weakHashMap = U.f5037a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i7, getLayoutDirection()) & 7;
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if ((h(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean zDispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f9291d <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x4 = motionEvent.getX();
        float y4 = motionEvent.getY();
        for (int i7 = childCount - 1; i7 >= 0; i7--) {
            View childAt = getChildAt(i7);
            if (this.f9286P == null) {
                this.f9286P = new Rect();
            }
            childAt.getHitRect(this.f9286P);
            if (this.f9286P.contains((int) x4, (int) y4) && !i(childAt)) {
                if (childAt.getMatrix().isIdentity()) {
                    float scrollX = getScrollX() - childAt.getLeft();
                    float scrollY = getScrollY() - childAt.getTop();
                    motionEvent.offsetLocation(scrollX, scrollY);
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
                    motionEvent.offsetLocation(-scrollX, -scrollY);
                } else {
                    float scrollX2 = getScrollX() - childAt.getLeft();
                    float scrollY2 = getScrollY() - childAt.getTop();
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.offsetLocation(scrollX2, scrollY2);
                    Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        if (this.f9287Q == null) {
                            this.f9287Q = new Matrix();
                        }
                        matrix.invert(this.f9287Q);
                        motionEventObtain.transform(this.f9287Q);
                    }
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (zDispatchGenericMotionEvent) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        Drawable background;
        int height = getHeight();
        boolean zI = i(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i7 = 0;
        if (zI) {
            int childCount = getChildCount();
            int i8 = 0;
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = getChildAt(i9);
                if (childAt != view && childAt.getVisibility() == 0 && (background = childAt.getBackground()) != null && background.getOpacity() == -1 && j(childAt) && childAt.getHeight() >= height) {
                    if (a(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i8) {
                            i8 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i8, 0, width, getHeight());
            i7 = i8;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(iSave);
        float f7 = this.f9291d;
        if (f7 > 0.0f && zI) {
            int i10 = this.f9290c;
            Paint paint = this.f9292e;
            paint.setColor((((int) ((((-16777216) & i10) >>> 24) * f7)) << 24) | (i10 & 16777215));
            canvas.drawRect(i7, 0.0f, width, getHeight(), paint);
        }
        return zDrawChild;
    }

    public final View e() {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if ((((c) childAt.getLayoutParams()).f12767d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    public final View f() {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (j(childAt)) {
                if (!j(childAt)) {
                    throw new IllegalArgumentException("View " + childAt + " is not a drawer");
                }
                if (((c) childAt.getLayoutParams()).f12765b > 0.0f) {
                    return childAt;
                }
            }
        }
        return null;
    }

    public final int g(View view) {
        if (!j(view)) {
            throw new IllegalArgumentException("View " + view + " is not a drawer");
        }
        int i7 = ((c) view.getLayoutParams()).f12764a;
        WeakHashMap weakHashMap = U.f5037a;
        int layoutDirection = getLayoutDirection();
        if (i7 == 3) {
            int i8 = this.f9274D;
            if (i8 != 3) {
                return i8;
            }
            int i9 = layoutDirection == 0 ? this.f9276F : this.f9277G;
            if (i9 != 3) {
                return i9;
            }
        } else if (i7 == 5) {
            int i10 = this.f9275E;
            if (i10 != 3) {
                return i10;
            }
            int i11 = layoutDirection == 0 ? this.f9277G : this.f9276F;
            if (i11 != 3) {
                return i11;
            }
        } else if (i7 == 8388611) {
            int i12 = this.f9276F;
            if (i12 != 3) {
                return i12;
            }
            int i13 = layoutDirection == 0 ? this.f9274D : this.f9275E;
            if (i13 != 3) {
                return i13;
            }
        } else if (i7 == 8388613) {
            int i14 = this.f9277G;
            if (i14 != 3) {
                return i14;
            }
            int i15 = layoutDirection == 0 ? this.f9275E : this.f9274D;
            if (i15 != 3) {
                return i15;
            }
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        c cVar = new c(-1, -1);
        cVar.f12764a = 0;
        return cVar;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof c) {
            c cVar = (c) layoutParams;
            c cVar2 = new c(cVar);
            cVar2.f12764a = 0;
            cVar2.f12764a = cVar.f12764a;
            return cVar2;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            c cVar3 = new c((ViewGroup.MarginLayoutParams) layoutParams);
            cVar3.f12764a = 0;
            return cVar3;
        }
        c cVar4 = new c(layoutParams);
        cVar4.f12764a = 0;
        return cVar4;
    }

    public float getDrawerElevation() {
        return this.f9288a;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f9282L;
    }

    public final int h(View view) {
        int i7 = ((c) view.getLayoutParams()).f12764a;
        WeakHashMap weakHashMap = U.f5037a;
        return Gravity.getAbsoluteGravity(i7, getLayoutDirection());
    }

    public final void k(View view) {
        if (!j(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        c cVar = (c) view.getLayoutParams();
        if (this.f9273C) {
            cVar.f12765b = 1.0f;
            cVar.f12767d = 1;
            n(view, true);
        } else {
            cVar.f12767d |= 2;
            if (a(view, 3)) {
                this.f9293f.v(view, 0, view.getTop());
            } else {
                this.f9294x.v(view, getWidth() - view.getWidth(), view.getTop());
            }
        }
        invalidate();
    }

    public final void l(int i7, int i8) {
        View viewD;
        WeakHashMap weakHashMap = U.f5037a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i8, getLayoutDirection());
        if (i8 == 3) {
            this.f9274D = i7;
        } else if (i8 == 5) {
            this.f9275E = i7;
        } else if (i8 == 8388611) {
            this.f9276F = i7;
        } else if (i8 == 8388613) {
            this.f9277G = i7;
        }
        if (i7 != 0) {
            (absoluteGravity == 3 ? this.f9293f : this.f9294x).b();
        }
        if (i7 != 1) {
            if (i7 == 2 && (viewD = d(absoluteGravity)) != null) {
                k(viewD);
                return;
            }
            return;
        }
        View viewD2 = d(absoluteGravity);
        if (viewD2 != null) {
            b(viewD2);
        }
    }

    public final void m(View view, float f7) {
        int size;
        c cVar = (c) view.getLayoutParams();
        if (f7 == cVar.f12765b) {
            return;
        }
        cVar.f12765b = f7;
        ArrayList arrayList = this.f9279I;
        if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
            throw k.c(this.f9279I, size);
        }
    }

    public final void n(View view, boolean z4) {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if ((z4 || j(childAt)) && !(z4 && childAt == view)) {
                WeakHashMap weakHashMap = U.f5037a;
                childAt.setImportantForAccessibility(4);
            } else {
                WeakHashMap weakHashMap2 = U.f5037a;
                childAt.setImportantForAccessibility(1);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f9273C = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f9273C = true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f9284N || this.f9282L == null) {
            return;
        }
        WindowInsets windowInsets = this.f9283M;
        int systemWindowInsetTop = windowInsets != null ? windowInsets.getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.f9282L.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.f9282L.draw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005e  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        View viewJ;
        int actionMasked = motionEvent.getActionMasked();
        p004a0.a aVar = this.f9293f;
        boolean zU = aVar.u(motionEvent) | this.f9294x.u(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                c(true);
                this.f9278H = false;
            } else if (actionMasked == 2) {
                int length = aVar.f7931d.length;
                for (int i7 = 0; i7 < length; i7++) {
                    if ((aVar.f7937k & (1 << i7)) != 0) {
                        float f7 = aVar.f7933f[i7] - aVar.f7931d[i7];
                        float f8 = aVar.f7934g[i7] - aVar.f7932e[i7];
                        float f9 = (f8 * f8) + (f7 * f7);
                        int i8 = aVar.f7929b;
                        if (f9 > i8 * i8) {
                            d dVar = this.f9295y;
                            dVar.f12771n.removeCallbacks(dVar.f12770m);
                            d dVar2 = this.f9296z;
                            dVar2.f12771n.removeCallbacks(dVar2.f12770m);
                            break;
                        }
                    }
                }
            } else if (actionMasked == 3) {
                c(true);
                this.f9278H = false;
            }
            z4 = false;
        } else {
            float x4 = motionEvent.getX();
            float y4 = motionEvent.getY();
            this.f9280J = x4;
            this.f9281K = y4;
            z4 = this.f9291d > 0.0f && (viewJ = aVar.j((int) x4, (int) y4)) != null && i(viewJ);
            this.f9278H = false;
        }
        if (zU || z4) {
            return true;
        }
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            if (((c) getChildAt(i9).getLayoutParams()).f12766c) {
                return true;
            }
        }
        return this.f9278H;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        if (i7 != 4 || f() == null) {
            return super.onKeyDown(i7, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i7, KeyEvent keyEvent) {
        if (i7 != 4) {
            return super.onKeyUp(i7, keyEvent);
        }
        View viewF = f();
        if (viewF != null && g(viewF) == 0) {
            c(false);
        }
        return viewF != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i7, int i8, int i9, int i10) {
        float f7;
        int i11;
        boolean z7 = true;
        this.f9272B = true;
        int i12 = i9 - i7;
        int childCount = getChildCount();
        int i13 = 0;
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (i(childAt)) {
                    int i14 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
                    childAt.layout(i14, ((ViewGroup.MarginLayoutParams) cVar).topMargin, childAt.getMeasuredWidth() + i14, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) cVar).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a(childAt, 3)) {
                        float f8 = measuredWidth;
                        i11 = (-measuredWidth) + ((int) (cVar.f12765b * f8));
                        f7 = (measuredWidth + i11) / f8;
                    } else {
                        float f9 = measuredWidth;
                        int i15 = i12 - ((int) (cVar.f12765b * f9));
                        f7 = (i12 - i15) / f9;
                        i11 = i15;
                    }
                    boolean z8 = f7 != cVar.f12765b ? z7 : false;
                    int i16 = cVar.f12764a & 112;
                    if (i16 == 16) {
                        int i17 = i10 - i8;
                        int i18 = (i17 - measuredHeight) / 2;
                        int i19 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
                        if (i18 < i19) {
                            i18 = i19;
                        } else {
                            int i20 = i18 + measuredHeight;
                            int i21 = i17 - ((ViewGroup.MarginLayoutParams) cVar).bottomMargin;
                            if (i20 > i21) {
                                i18 = i21 - measuredHeight;
                            }
                        }
                        childAt.layout(i11, i18, measuredWidth + i11, measuredHeight + i18);
                    } else if (i16 != 80) {
                        int i22 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
                        childAt.layout(i11, i22, measuredWidth + i11, measuredHeight + i22);
                    } else {
                        int i23 = i10 - i8;
                        childAt.layout(i11, (i23 - ((ViewGroup.MarginLayoutParams) cVar).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i11, i23 - ((ViewGroup.MarginLayoutParams) cVar).bottomMargin);
                    }
                    if (z8) {
                        m(childAt, f7);
                    }
                    int i24 = cVar.f12765b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i24) {
                        childAt.setVisibility(i24);
                    }
                }
            }
            i13++;
            z7 = true;
        }
        this.f9272B = false;
        this.f9273C = false;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0041  */
    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        boolean z4;
        String hexString;
        int i9 = 3;
        int mode = View.MeasureSpec.getMode(i7);
        int mode2 = View.MeasureSpec.getMode(i8);
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i8);
        char c3 = 0;
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode != Integer.MIN_VALUE && mode == 0) {
                size = 300;
            }
            if (mode2 != Integer.MIN_VALUE && mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        if (this.f9283M != null) {
            WeakHashMap weakHashMap = U.f5037a;
            if (getFitsSystemWindows()) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        WeakHashMap weakHashMap2 = U.f5037a;
        int layoutDirection = getLayoutDirection();
        int childCount = getChildCount();
        int i10 = 0;
        boolean z7 = false;
        boolean z8 = false;
        while (i10 < childCount) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (z4) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(cVar.f12764a, layoutDirection);
                    if (childAt.getFitsSystemWindows()) {
                        WindowInsets windowInsetsReplaceSystemWindowInsets = this.f9283M;
                        if (absoluteGravity == i9) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsetsReplaceSystemWindowInsets);
                    } else {
                        WindowInsets windowInsetsReplaceSystemWindowInsets2 = this.f9283M;
                        if (absoluteGravity == 3) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) cVar).leftMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) cVar).topMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) cVar).rightMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) cVar).bottomMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (i(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) cVar).leftMargin) - ((ViewGroup.MarginLayoutParams) cVar).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) cVar).topMargin) - ((ViewGroup.MarginLayoutParams) cVar).bottomMargin, 1073741824));
                } else {
                    if (!j(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i10 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    float fI = I.i(childAt);
                    float f7 = this.f9288a;
                    if (fI != f7) {
                        I.s(childAt, f7);
                    }
                    int iH = h(childAt);
                    int i11 = iH & 7;
                    boolean z9 = i11 == 3;
                    if ((z9 && z7) || (!z9 && z8)) {
                        StringBuilder sb = new StringBuilder("Child drawer has absolute gravity ");
                        if ((iH & 3) != 3) {
                            hexString = (iH & 5) == 5 ? "RIGHT" : Integer.toHexString(i11);
                        } else {
                            hexString = "LEFT";
                        }
                        throw new IllegalStateException(k.i(sb, hexString, " but this DrawerLayout already has a drawer view along that edge"));
                    }
                    if (z9) {
                        z7 = true;
                    } else {
                        z8 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i7, this.f9289b + ((ViewGroup.MarginLayoutParams) cVar).leftMargin + ((ViewGroup.MarginLayoutParams) cVar).rightMargin, ((ViewGroup.MarginLayoutParams) cVar).width), ViewGroup.getChildMeasureSpec(i8, ((ViewGroup.MarginLayoutParams) cVar).topMargin + ((ViewGroup.MarginLayoutParams) cVar).bottomMargin, ((ViewGroup.MarginLayoutParams) cVar).height));
                }
                i10++;
                i9 = 3;
                c3 = 0;
            }
            i10++;
            i9 = 3;
            c3 = 0;
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        View viewD;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f9102a);
        int i7 = savedState.f9297c;
        if (i7 != 0 && (viewD = d(i7)) != null) {
            k(viewD);
        }
        int i8 = savedState.f9298d;
        if (i8 != 3) {
            l(i8, 3);
        }
        int i9 = savedState.f9299e;
        if (i9 != 3) {
            l(i9, 5);
        }
        int i10 = savedState.f9300f;
        if (i10 != 3) {
            l(i10, 8388611);
        }
        int i11 = savedState.f9301x;
        if (i11 != 3) {
            l(i11, 8388613);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i7) {
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f9297c = 0;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            c cVar = (c) getChildAt(i7).getLayoutParams();
            int i8 = cVar.f12767d;
            boolean z4 = i8 == 1;
            boolean z7 = i8 == 2;
            if (z4 || z7) {
                savedState.f9297c = cVar.f12764a;
                break;
            }
        }
        savedState.f9298d = this.f9274D;
        savedState.f9299e = this.f9275E;
        savedState.f9300f = this.f9276F;
        savedState.f9301x = this.f9277G;
        return savedState;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0054  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        View viewE;
        p004a0.a aVar = this.f9293f;
        aVar.n(motionEvent);
        this.f9294x.n(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            float x4 = motionEvent.getX();
            float y4 = motionEvent.getY();
            this.f9280J = x4;
            this.f9281K = y4;
            this.f9278H = false;
        } else if (action == 1) {
            float x7 = motionEvent.getX();
            float y5 = motionEvent.getY();
            View viewJ = aVar.j((int) x7, (int) y5);
            if (viewJ != null && i(viewJ)) {
                float f7 = x7 - this.f9280J;
                float f8 = y5 - this.f9281K;
                int i7 = aVar.f7929b;
                z4 = (f8 * f8) + (f7 * f7) >= ((float) (i7 * i7)) || (viewE = e()) == null || g(viewE) == 2;
            }
            c(z4);
        } else if (action == 3) {
            c(true);
            this.f9278H = false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        super.requestDisallowInterceptTouchEvent(z4);
        if (z4) {
            c(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f9272B) {
            return;
        }
        super.requestLayout();
    }

    public void setDrawerElevation(float f7) {
        this.f9288a = f7;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (j(childAt)) {
                float f8 = this.f9288a;
                WeakHashMap weakHashMap = U.f5037a;
                I.s(childAt, f8);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(b bVar) {
        if (bVar != null) {
            if (this.f9279I == null) {
                this.f9279I = new ArrayList();
            }
            this.f9279I.add(bVar);
        }
    }

    public void setDrawerLockMode(int i7) {
        l(i7, 3);
        l(i7, 5);
    }

    public void setScrimColor(int i7) {
        this.f9290c = i7;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f9282L = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i7) {
        this.f9282L = new ColorDrawable(i7);
        invalidate();
    }

    public void setStatusBarBackground(int i7) {
        this.f9282L = i7 != 0 ? G.h.getDrawable(getContext(), i7) : null;
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        c cVar = new c(context, attributeSet);
        cVar.f12764a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f9270S);
        cVar.f12764a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return cVar;
    }
}
