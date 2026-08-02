package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.animation.PathInterpolatorCompat;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.ViewDragHelper;
import com.google.android.material.internal.l;
import com.google.android.material.internal.m;
import com.google.android.material.shape.g;
import com.google.android.material.shape.k;
import com.haryanvi.netstream.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    public final BottomSheetBehavior<V>.e A;

    @Nullable
    public final ValueAnimator B;
    public final int C;
    public int D;
    public int E;
    public final float F;
    public int G;
    public final float H;
    public boolean I;
    public boolean J;
    public final boolean K;
    public int L;

    @Nullable
    public ViewDragHelper M;
    public boolean N;
    public int O;
    public boolean P;
    public final float Q;
    public int R;
    public int S;
    public int T;

    @Nullable
    public WeakReference<V> U;

    @Nullable
    public WeakReference<View> V;

    @NonNull
    public final ArrayList<c> W;

    @Nullable
    public VelocityTracker X;
    public int Y;
    public int Z;
    public final int a;
    public boolean a0;
    public boolean b;

    @Nullable
    public HashMap b0;
    public final float c;

    @VisibleForTesting
    public final SparseIntArray c0;
    public final int d;
    public final b d0;
    public int e;
    public boolean f;
    public int g;
    public final int h;
    public final g i;

    @Nullable
    public final ColorStateList j;
    public final int k;
    public final int l;
    public int m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public int v;
    public int w;
    public final boolean x;
    public final k y;
    public boolean z;

    public class a implements Runnable {
        public final /* synthetic */ View a;
        public final /* synthetic */ int b;

        public a(View view, int i) {
            this.a = view;
            this.b = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BottomSheetBehavior.this.n(this.a, this.b, false);
        }
    }

    public class b extends ViewDragHelper.Callback {
        public b() {
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int clampViewPositionHorizontal(@NonNull View view, int i, int i2) {
            return view.getLeft();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int clampViewPositionVertical(@NonNull View view, int i, int i2) {
            return MathUtils.clamp(i, BottomSheetBehavior.this.g(), getViewVerticalDragRange(view));
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int getViewVerticalDragRange(@NonNull View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.I ? bottomSheetBehavior.T : bottomSheetBehavior.G;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewDragStateChanged(int i) {
            if (i == 1) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.K) {
                    bottomSheetBehavior.l(1);
                }
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewPositionChanged(@NonNull View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.d(i2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
        
            if (r7 > r4.E) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x006c, code lost:
        
            if (java.lang.Math.abs(r6.getTop() - r4.g()) < java.lang.Math.abs(r6.getTop() - r4.E)) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00b7, code lost:
        
            if (java.lang.Math.abs(r7 - r4.D) < java.lang.Math.abs(r7 - r4.G)) goto L6;
         */
        @Override // androidx.customview.widget.ViewDragHelper.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onViewReleased(@NonNull View view, float f, float f2) {
            int i = 6;
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (f2 < 0.0f) {
                if (!bottomSheetBehavior.b) {
                    int top = view.getTop();
                    System.currentTimeMillis();
                    bottomSheetBehavior.getClass();
                }
                i = 3;
            } else if (bottomSheetBehavior.I && bottomSheetBehavior.m(view, f2)) {
                if (Math.abs(f) >= Math.abs(f2) || f2 <= bottomSheetBehavior.d) {
                    if (view.getTop() <= (bottomSheetBehavior.g() + bottomSheetBehavior.T) / 2) {
                        if (!bottomSheetBehavior.b) {
                        }
                        i = 3;
                    }
                }
                i = 5;
            } else if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                int top2 = view.getTop();
                if (!bottomSheetBehavior.b) {
                    int i2 = bottomSheetBehavior.E;
                    if (top2 < i2) {
                        if (top2 >= Math.abs(top2 - bottomSheetBehavior.G)) {
                            bottomSheetBehavior.getClass();
                        }
                        i = 3;
                    } else {
                        if (Math.abs(top2 - i2) < Math.abs(top2 - bottomSheetBehavior.G)) {
                            bottomSheetBehavior.getClass();
                        }
                        i = 4;
                    }
                }
            } else {
                if (!bottomSheetBehavior.b) {
                    int top3 = view.getTop();
                    if (Math.abs(top3 - bottomSheetBehavior.E) < Math.abs(top3 - bottomSheetBehavior.G)) {
                        bottomSheetBehavior.getClass();
                    }
                }
                i = 4;
            }
            bottomSheetBehavior.getClass();
            bottomSheetBehavior.n(view, i, true);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final boolean tryCaptureView(@NonNull View view, int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.L;
            if (i2 == 1 || bottomSheetBehavior.a0) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.Y == i) {
                WeakReference<View> weakReference = bottomSheetBehavior.V;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            System.currentTimeMillis();
            WeakReference<V> weakReference2 = bottomSheetBehavior.U;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    public static abstract class c {
        public abstract void a();

        public abstract void b();
    }

    public class e {
        public int a;
        public boolean b;
        public final a c = new a();

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                e eVar = e.this;
                eVar.b = false;
                ViewDragHelper viewDragHelper = BottomSheetBehavior.this.M;
                if (viewDragHelper != null && viewDragHelper.continueSettling(true)) {
                    eVar.a(eVar.a);
                    return;
                }
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.L == 2) {
                    bottomSheetBehavior.l(eVar.a);
                }
            }
        }

        public e() {
        }

        public final void a(int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            WeakReference<V> weakReference = bottomSheetBehavior.U;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.a = i;
            if (this.b) {
                return;
            }
            ViewCompat.postOnAnimation(bottomSheetBehavior.U.get(), this.c);
            this.b = true;
        }
    }

    public BottomSheetBehavior() {
        this.a = 0;
        this.b = true;
        this.k = -1;
        this.l = -1;
        this.A = new e();
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = 4;
        this.Q = 0.1f;
        this.W = new ArrayList<>();
        this.Z = -1;
        this.c0 = new SparseIntArray();
        this.d0 = new b();
    }

    @Nullable
    @VisibleForTesting
    public static View e(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (ViewCompat.isNestedScrollingEnabled(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View e2 = e(viewGroup.getChildAt(i));
            if (e2 != null) {
                return e2;
            }
        }
        return null;
    }

    public static int f(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    public final void a() {
        int c2 = c();
        if (this.b) {
            this.G = Math.max(this.T - c2, this.D);
        } else {
            this.G = this.T - c2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float b() {
        WeakReference<V> weakReference;
        WindowInsets rootWindowInsets;
        RoundedCorner roundedCorner;
        float f;
        RoundedCorner roundedCorner2;
        int radius;
        int radius2;
        float f2 = 0.0f;
        if (this.i != null && (weakReference = this.U) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            V v = this.U.get();
            if (i() && (rootWindowInsets = v.getRootWindowInsets()) != null) {
                g gVar = this.i;
                float a2 = gVar.a.a.e.a(gVar.h());
                roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    radius2 = roundedCorner.getRadius();
                    float f3 = radius2;
                    if (f3 > 0.0f && a2 > 0.0f) {
                        f = f3 / a2;
                        g gVar2 = this.i;
                        float a3 = gVar2.a.a.f.a(gVar2.h());
                        roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                        if (roundedCorner2 != null) {
                            radius = roundedCorner2.getRadius();
                            float f4 = radius;
                            if (f4 > 0.0f && a3 > 0.0f) {
                                f2 = f4 / a3;
                            }
                        }
                        return Math.max(f, f2);
                    }
                }
                f = 0.0f;
                g gVar22 = this.i;
                float a32 = gVar22.a.a.f.a(gVar22.h());
                roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                }
                return Math.max(f, f2);
            }
        }
        return 0.0f;
    }

    public final int c() {
        int i;
        return this.f ? Math.min(Math.max(this.g, this.T - ((this.S * 9) / 16)), this.R) + this.v : (this.n || this.o || (i = this.m) <= 0) ? this.e + this.v : Math.max(this.e, i + this.h);
    }

    public final void d(int i) {
        if (this.U.get() != null) {
            ArrayList<c> arrayList = this.W;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.G;
            if (i <= i2 && i2 != g()) {
                g();
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                arrayList.get(i3).a();
            }
        }
    }

    public final int g() {
        if (this.b) {
            return this.D;
        }
        return Math.max(this.C, this.r ? 0 : this.w);
    }

    public final int h(int i) {
        if (i == 3) {
            return g();
        }
        if (i == 4) {
            return this.G;
        }
        if (i == 5) {
            return this.T;
        }
        if (i == 6) {
            return this.E;
        }
        throw new IllegalArgumentException(android.support.v4.media.a.a(i, "Invalid state to get top offset: "));
    }

    public final boolean i() {
        WeakReference<V> weakReference = this.U;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            this.U.get().getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final void j(int i) {
        if (i == -1) {
            if (this.f) {
                return;
            } else {
                this.f = true;
            }
        } else {
            if (!this.f && this.e == i) {
                return;
            }
            this.f = false;
            this.e = Math.max(0, i);
        }
        r();
    }

    public final void k(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(androidx.concurrent.futures.a.a(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (this.I || i != 5) {
            int i2 = (i == 6 && this.b && h(i) <= this.D) ? 3 : i;
            WeakReference<V> weakReference = this.U;
            if (weakReference == null || weakReference.get() == null) {
                l(i);
                return;
            }
            V v = this.U.get();
            a aVar = new a(v, i2);
            ViewParent parent = v.getParent();
            if (parent != null && parent.isLayoutRequested() && ViewCompat.isAttachedToWindow(v)) {
                v.post(aVar);
            } else {
                aVar.run();
            }
        }
    }

    public final void l(int i) {
        if (this.L == i) {
            return;
        }
        this.L = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z = this.I;
        }
        WeakReference<V> weakReference = this.U;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        int i2 = 0;
        if (i == 3) {
            q(true);
        } else if (i == 6 || i == 5 || i == 4) {
            q(false);
        }
        p(i, true);
        while (true) {
            ArrayList<c> arrayList = this.W;
            if (i2 >= arrayList.size()) {
                o();
                return;
            } else {
                arrayList.get(i2).b();
                i2++;
            }
        }
    }

    public final boolean m(@NonNull View view, float f) {
        if (this.J) {
            return true;
        }
        if (view.getTop() < this.G) {
            return false;
        }
        return Math.abs(((f * this.Q) + ((float) view.getTop())) - ((float) this.G)) / ((float) c()) > 0.5f;
    }

    public final void n(View view, int i, boolean z) {
        int h = h(i);
        ViewDragHelper viewDragHelper = this.M;
        if (viewDragHelper == null || (!z ? viewDragHelper.smoothSlideViewTo(view, view.getLeft(), h) : viewDragHelper.settleCapturedViewAt(view.getLeft(), h))) {
            l(i);
            return;
        }
        l(2);
        p(i, true);
        this.A.a(i);
    }

    public final void o() {
        V v;
        WeakReference<V> weakReference = this.U;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        ViewCompat.removeAccessibilityAction(v, 524288);
        ViewCompat.removeAccessibilityAction(v, 262144);
        ViewCompat.removeAccessibilityAction(v, 1048576);
        SparseIntArray sparseIntArray = this.c0;
        int i = sparseIntArray.get(0, -1);
        if (i != -1) {
            ViewCompat.removeAccessibilityAction(v, i);
            sparseIntArray.delete(0);
        }
        if (!this.b && this.L != 6) {
            sparseIntArray.put(0, ViewCompat.addAccessibilityAction(v, v.getResources().getString(R.string.bottomsheet_action_expand_halfway), new com.google.android.material.bottomsheet.c(this, 6)));
        }
        if (this.I && this.L != 5) {
            ViewCompat.replaceAccessibilityAction(v, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS, null, new com.google.android.material.bottomsheet.c(this, 5));
        }
        int i2 = this.L;
        if (i2 == 3) {
            ViewCompat.replaceAccessibilityAction(v, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_COLLAPSE, null, new com.google.android.material.bottomsheet.c(this, this.b ? 4 : 6));
            return;
        }
        if (i2 == 4) {
            ViewCompat.replaceAccessibilityAction(v, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_EXPAND, null, new com.google.android.material.bottomsheet.c(this, this.b ? 3 : 6));
        } else {
            if (i2 != 6) {
                return;
            }
            ViewCompat.replaceAccessibilityAction(v, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_COLLAPSE, null, new com.google.android.material.bottomsheet.c(this, 4));
            ViewCompat.replaceAccessibilityAction(v, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_EXPAND, null, new com.google.android.material.bottomsheet.c(this, 3));
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onAttachedToLayoutParams(@NonNull CoordinatorLayout.LayoutParams layoutParams) {
        super.onAttachedToLayoutParams(layoutParams);
        this.U = null;
        this.M = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.U = null;
        this.M = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        int i;
        ViewDragHelper viewDragHelper;
        if (!v.isShown() || !this.K) {
            this.N = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.Y = -1;
            this.Z = -1;
            VelocityTracker velocityTracker = this.X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.X = null;
            }
        }
        if (this.X == null) {
            this.X = VelocityTracker.obtain();
        }
        this.X.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.Z = (int) motionEvent.getY();
            if (this.L != 2) {
                WeakReference<View> weakReference = this.V;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.isPointInChildBounds(view, x, this.Z)) {
                    this.Y = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.a0 = true;
                }
            }
            this.N = this.Y == -1 && !coordinatorLayout.isPointInChildBounds(v, x, this.Z);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.a0 = false;
            this.Y = -1;
            if (this.N) {
                this.N = false;
                return false;
            }
        }
        if (this.N || (viewDragHelper = this.M) == null || !viewDragHelper.shouldInterceptTouchEvent(motionEvent)) {
            WeakReference<View> weakReference2 = this.V;
            View view2 = weakReference2 != null ? weakReference2.get() : null;
            if (actionMasked != 2 || view2 == null || this.N || this.L == 1 || coordinatorLayout.isPointInChildBounds(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.M == null || (i = this.Z) == -1 || Math.abs(i - motionEvent.getY()) <= this.M.getTouchSlop()) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
        if (ViewCompat.getFitsSystemWindows(coordinatorLayout) && !ViewCompat.getFitsSystemWindows(v)) {
            v.setFitsSystemWindows(true);
        }
        int i2 = 0;
        if (this.U == null) {
            this.g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            boolean z = (Build.VERSION.SDK_INT < 29 || this.n || this.f) ? false : true;
            if (this.o || this.p || this.q || this.s || this.t || this.u || z) {
                com.google.android.material.bottomsheet.b bVar = new com.google.android.material.bottomsheet.b(this, z);
                int paddingStart = ViewCompat.getPaddingStart(v);
                v.getPaddingTop();
                int paddingEnd = ViewCompat.getPaddingEnd(v);
                int paddingBottom = v.getPaddingBottom();
                m.a aVar = new m.a();
                aVar.a = paddingStart;
                aVar.b = paddingEnd;
                aVar.c = paddingBottom;
                ViewCompat.setOnApplyWindowInsetsListener(v, new com.google.android.material.internal.k(bVar, aVar));
                if (ViewCompat.isAttachedToWindow(v)) {
                    ViewCompat.requestApplyInsets(v);
                } else {
                    v.addOnAttachStateChangeListener(new l());
                }
            }
            ViewCompat.setWindowInsetsAnimationCallback(v, new com.google.android.material.bottomsheet.d(v));
            this.U = new WeakReference<>(v);
            Context context = v.getContext();
            com.google.android.material.motion.a.d(context, R.attr.motionEasingStandardDecelerateInterpolator, PathInterpolatorCompat.create(0.0f, 0.0f, 0.0f, 1.0f));
            com.google.android.material.motion.a.c(context, R.attr.motionDurationMedium2, 300);
            com.google.android.material.motion.a.c(context, R.attr.motionDurationShort3, 150);
            com.google.android.material.motion.a.c(context, R.attr.motionDurationShort2, 100);
            Resources resources = v.getResources();
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
            g gVar = this.i;
            if (gVar != null) {
                ViewCompat.setBackground(v, gVar);
                float f = this.H;
                if (f == -1.0f) {
                    f = ViewCompat.getElevation(v);
                }
                this.i.k(f);
            } else {
                ColorStateList colorStateList = this.j;
                if (colorStateList != null) {
                    ViewCompat.setBackgroundTintList(v, colorStateList);
                }
            }
            o();
            if (ViewCompat.getImportantForAccessibility(v) == 0) {
                ViewCompat.setImportantForAccessibility(v, 1);
            }
        }
        if (this.M == null) {
            this.M = ViewDragHelper.create(coordinatorLayout, this.d0);
        }
        int top = v.getTop();
        coordinatorLayout.onLayoutChild(v, i);
        this.S = coordinatorLayout.getWidth();
        this.T = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.R = height;
        int i3 = this.T;
        int i4 = i3 - height;
        int i5 = this.w;
        if (i4 < i5) {
            if (this.r) {
                int i6 = this.l;
                if (i6 != -1) {
                    i3 = Math.min(i3, i6);
                }
                this.R = i3;
            } else {
                int i7 = i3 - i5;
                int i8 = this.l;
                if (i8 != -1) {
                    i7 = Math.min(i7, i8);
                }
                this.R = i7;
            }
        }
        this.D = Math.max(0, this.T - this.R);
        this.E = (int) ((1.0f - this.F) * this.T);
        a();
        int i9 = this.L;
        if (i9 == 3) {
            ViewCompat.offsetTopAndBottom(v, g());
        } else if (i9 == 6) {
            ViewCompat.offsetTopAndBottom(v, this.E);
        } else if (this.I && i9 == 5) {
            ViewCompat.offsetTopAndBottom(v, this.T);
        } else if (i9 == 4) {
            ViewCompat.offsetTopAndBottom(v, this.G);
        } else if (i9 == 1 || i9 == 2) {
            ViewCompat.offsetTopAndBottom(v, top - v.getTop());
        }
        p(this.L, false);
        this.V = new WeakReference<>(e(v));
        while (true) {
            ArrayList<c> arrayList = this.W;
            if (i2 >= arrayList.size()) {
                return true;
            }
            arrayList.get(i2).getClass();
            i2++;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        v.measure(f(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.k, marginLayoutParams.width), f(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, this.l, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onNestedPreFling(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, float f, float f2) {
        WeakReference<View> weakReference = this.V;
        return weakReference != null && view == weakReference.get() && (this.L != 3 || super.onNestedPreFling(coordinatorLayout, v, view, f, f2));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, @NonNull int[] iArr, int i3) {
        if (i3 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.V;
        if (view != (weakReference != null ? weakReference.get() : null)) {
            return;
        }
        int top = v.getTop();
        int i4 = top - i2;
        if (i2 > 0) {
            if (i4 < g()) {
                int g = top - g();
                iArr[1] = g;
                ViewCompat.offsetTopAndBottom(v, -g);
                l(3);
            } else {
                if (!this.K) {
                    return;
                }
                iArr[1] = i2;
                ViewCompat.offsetTopAndBottom(v, -i2);
                l(1);
            }
        } else if (i2 < 0 && !view.canScrollVertically(-1)) {
            int i5 = this.G;
            if (i4 > i5 && !this.I) {
                int i6 = top - i5;
                iArr[1] = i6;
                ViewCompat.offsetTopAndBottom(v, -i6);
                l(4);
            } else {
                if (!this.K) {
                    return;
                }
                iArr[1] = i2;
                ViewCompat.offsetTopAndBottom(v, -i2);
                l(1);
            }
        }
        d(v.getTop());
        this.O = i2;
        this.P = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, int i3, int i4, int i5, @NonNull int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull Parcelable parcelable) {
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v, dVar.getSuperState());
        int i = this.a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.e = dVar.b;
            }
            if (i == -1 || (i & 2) == 2) {
                this.b = dVar.c;
            }
            if (i == -1 || (i & 4) == 4) {
                this.I = dVar.d;
            }
            if (i == -1 || (i & 8) == 8) {
                this.J = dVar.e;
            }
        }
        int i2 = dVar.a;
        if (i2 == 1 || i2 == 2) {
            this.L = 4;
        } else {
            this.L = i2;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @NonNull
    public final Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v) {
        return new d(super.onSaveInstanceState(coordinatorLayout, v), (BottomSheetBehavior<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i, int i2) {
        this.O = 0;
        this.P = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r4.getTop() <= r2.E) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        if (java.lang.Math.abs(r3 - r2.D) < java.lang.Math.abs(r3 - r2.G)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0080, code lost:
    
        if (r3 < java.lang.Math.abs(r3 - r2.G)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
    
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.G)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ac, code lost:
    
        if (java.lang.Math.abs(r3 - r2.E) < java.lang.Math.abs(r3 - r2.G)) goto L50;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onStopNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i) {
        float yVelocity;
        int i2 = 3;
        if (v.getTop() == g()) {
            l(3);
            return;
        }
        WeakReference<View> weakReference = this.V;
        if (weakReference != null && view == weakReference.get() && this.P) {
            if (this.O > 0) {
                if (!this.b) {
                }
                n(v, i2, false);
                this.P = false;
            }
            if (this.I) {
                VelocityTracker velocityTracker = this.X;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.c);
                    yVelocity = this.X.getYVelocity(this.Y);
                }
                if (m(v, yVelocity)) {
                    i2 = 5;
                    n(v, i2, false);
                    this.P = false;
                }
            }
            if (this.O == 0) {
                int top = v.getTop();
                if (!this.b) {
                    int i3 = this.E;
                    if (top < i3) {
                    }
                    i2 = 6;
                }
            } else {
                if (!this.b) {
                    int top2 = v.getTop();
                }
                i2 = 4;
            }
            n(v, i2, false);
            this.P = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.L;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        ViewDragHelper viewDragHelper = this.M;
        if (viewDragHelper != null && (this.K || i == 1)) {
            viewDragHelper.processTouchEvent(motionEvent);
        }
        if (actionMasked == 0) {
            this.Y = -1;
            this.Z = -1;
            VelocityTracker velocityTracker = this.X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.X = null;
            }
        }
        if (this.X == null) {
            this.X = VelocityTracker.obtain();
        }
        this.X.addMovement(motionEvent);
        if (this.M != null && ((this.K || this.L == 1) && actionMasked == 2 && !this.N && Math.abs(this.Z - motionEvent.getY()) > this.M.getTouchSlop())) {
            this.M.captureChildView(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.N;
    }

    public final void p(int i, boolean z) {
        g gVar;
        if (i == 2) {
            return;
        }
        boolean z2 = this.L == 3 && (this.x || i());
        if (this.z == z2 || (gVar = this.i) == null) {
            return;
        }
        this.z = z2;
        ValueAnimator valueAnimator = this.B;
        if (z && valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            } else {
                valueAnimator.setFloatValues(gVar.a.i, z2 ? b() : 1.0f);
                valueAnimator.start();
                return;
            }
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        float b2 = this.z ? b() : 1.0f;
        g.b bVar = gVar.a;
        if (bVar.i != b2) {
            bVar.i = b2;
            gVar.e = true;
            gVar.invalidateSelf();
        }
    }

    public final void q(boolean z) {
        WeakReference<V> weakReference = this.U;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.b0 != null) {
                    return;
                } else {
                    this.b0 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.U.get() && z) {
                    this.b0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.b0 = null;
        }
    }

    public final void r() {
        V v;
        if (this.U != null) {
            a();
            if (this.L != 4 || (v = this.U.get()) == null) {
                return;
            }
            v.requestLayout();
        }
    }

    public static class d extends AbsSavedState {
        public static final Parcelable.Creator<d> CREATOR = new a();
        public final int a;
        public final int b;
        public final boolean c;
        public final boolean d;
        public final boolean e;

        public class a implements Parcelable.ClassLoaderCreator<d> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public final d createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new d(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public final Object[] newArray(int i) {
                return new d[i];
            }

            @Override // android.os.Parcelable.Creator
            @Nullable
            public final Object createFromParcel(@NonNull Parcel parcel) {
                return new d(parcel, (ClassLoader) null);
            }
        }

        public d(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = parcel.readInt();
            this.b = parcel.readInt();
            this.c = parcel.readInt() == 1;
            this.d = parcel.readInt() == 1;
            this.e = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c ? 1 : 0);
            parcel.writeInt(this.d ? 1 : 0);
            parcel.writeInt(this.e ? 1 : 0);
        }

        public d(Parcelable parcelable, @NonNull BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.a = bottomSheetBehavior.L;
            this.b = bottomSheetBehavior.e;
            this.c = bottomSheetBehavior.b;
            this.d = bottomSheetBehavior.I;
            this.e = bottomSheetBehavior.J;
        }
    }

    public BottomSheetBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        this.a = 0;
        this.b = true;
        this.k = -1;
        this.l = -1;
        this.A = new e();
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = 4;
        this.Q = 0.1f;
        this.W = new ArrayList<>();
        this.Z = -1;
        this.c0 = new SparseIntArray();
        this.d0 = new b();
        this.h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.material.a.b);
        if (obtainStyledAttributes.hasValue(3)) {
            this.j = com.google.android.material.resources.c.a(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(21)) {
            this.y = k.b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
        }
        k kVar = this.y;
        if (kVar != null) {
            g gVar = new g(kVar);
            this.i = gVar;
            gVar.j(context);
            ColorStateList colorStateList = this.j;
            if (colorStateList != null) {
                this.i.l(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.i.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(b(), 1.0f);
        this.B = ofFloat;
        ofFloat.setDuration(500L);
        this.B.addUpdateListener(new com.google.android.material.bottomsheet.a(this));
        this.H = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.k = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.l = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue != null && (i = peekValue.data) == -1) {
            j(i);
        } else {
            j(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        boolean z = obtainStyledAttributes.getBoolean(8, false);
        if (this.I != z) {
            this.I = z;
            if (!z && this.L == 5) {
                k(4);
            }
            o();
        }
        this.n = obtainStyledAttributes.getBoolean(13, false);
        boolean z2 = obtainStyledAttributes.getBoolean(6, true);
        if (this.b != z2) {
            this.b = z2;
            if (this.U != null) {
                a();
            }
            l((this.b && this.L == 6) ? 3 : this.L);
            p(this.L, true);
            o();
        }
        this.J = obtainStyledAttributes.getBoolean(12, false);
        this.K = obtainStyledAttributes.getBoolean(4, true);
        this.a = obtainStyledAttributes.getInt(10, 0);
        float f = obtainStyledAttributes.getFloat(7, 0.5f);
        if (f > 0.0f && f < 1.0f) {
            this.F = f;
            if (this.U != null) {
                this.E = (int) ((1.0f - f) * this.T);
            }
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
            if (peekValue2 != null && peekValue2.type == 16) {
                int i2 = peekValue2.data;
                if (i2 >= 0) {
                    this.C = i2;
                    p(this.L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset >= 0) {
                    this.C = dimensionPixelOffset;
                    p(this.L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.d = obtainStyledAttributes.getInt(11, 500);
            this.o = obtainStyledAttributes.getBoolean(17, false);
            this.p = obtainStyledAttributes.getBoolean(18, false);
            this.q = obtainStyledAttributes.getBoolean(19, false);
            this.r = obtainStyledAttributes.getBoolean(20, true);
            this.s = obtainStyledAttributes.getBoolean(14, false);
            this.t = obtainStyledAttributes.getBoolean(15, false);
            this.u = obtainStyledAttributes.getBoolean(16, false);
            this.x = obtainStyledAttributes.getBoolean(23, true);
            obtainStyledAttributes.recycle();
            this.c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }
}
