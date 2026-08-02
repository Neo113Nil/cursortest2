package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.runtime.u;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.core.view.animation.PathInterpolatorCompat;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.ViewDragHelper;
import com.google.android.material.shape.k;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.haryanvi.netstream.R;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes4.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    public d a;

    @Nullable
    public final com.google.android.material.shape.g b;

    @Nullable
    public final ColorStateList c;
    public final k d;
    public final SideSheetBehavior<V>.c e;
    public final float f;
    public final boolean g;
    public int h;

    @Nullable
    public ViewDragHelper i;
    public boolean j;
    public final float k;
    public int l;
    public int m;
    public int n;
    public int o;

    @Nullable
    public WeakReference<V> p;

    @Nullable
    public WeakReference<View> q;

    @IdRes
    public final int r;

    @Nullable
    public VelocityTracker s;
    public int t;

    @NonNull
    public final LinkedHashSet u;
    public final a v;

    public class a extends ViewDragHelper.Callback {
        public a() {
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int clampViewPositionHorizontal(@NonNull View view, int i, int i2) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            return MathUtils.clamp(i, sideSheetBehavior.a.f(), sideSheetBehavior.a.e());
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int clampViewPositionVertical(@NonNull View view, int i, int i2) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int getViewHorizontalDragRange(@NonNull View view) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            return sideSheetBehavior.l + sideSheetBehavior.o;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewDragStateChanged(int i) {
            if (i == 1) {
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                if (sideSheetBehavior.g) {
                    sideSheetBehavior.a(1);
                }
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewPositionChanged(@NonNull View view, int i, int i2, int i3, int i4) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            WeakReference<View> weakReference = sideSheetBehavior.q;
            View view2 = weakReference != null ? weakReference.get() : null;
            if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                sideSheetBehavior.a.n(marginLayoutParams, view.getLeft(), view.getRight());
                view2.setLayoutParams(marginLayoutParams);
            }
            LinkedHashSet linkedHashSet = sideSheetBehavior.u;
            if (linkedHashSet.isEmpty()) {
                return;
            }
            sideSheetBehavior.a.b(i);
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ((com.google.android.material.sidesheet.c) it.next()).b();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
        
            if (java.lang.Math.abs(r4 - r0.a.c()) < java.lang.Math.abs(r4 - r0.a.d())) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
        
            if (r0.a.k(r3) == false) goto L19;
         */
        @Override // androidx.customview.widget.ViewDragHelper.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onViewReleased(@NonNull View view, float f, float f2) {
            int i;
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            if (!sideSheetBehavior.a.j(f)) {
                if (sideSheetBehavior.a.m(view, f)) {
                    if (!sideSheetBehavior.a.l(f, f2)) {
                    }
                    i = 5;
                } else {
                    if (f == 0.0f || Math.abs(f) <= Math.abs(f2)) {
                        int left = view.getLeft();
                    }
                    i = 5;
                }
                sideSheetBehavior.c(view, i, true);
            }
            i = 3;
            sideSheetBehavior.c(view, i, true);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final boolean tryCaptureView(@NonNull View view, int i) {
            WeakReference<V> weakReference;
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            return (sideSheetBehavior.h == 1 || (weakReference = sideSheetBehavior.p) == null || weakReference.get() != view) ? false : true;
        }
    }

    public class c {
        public int a;
        public boolean b;
        public final g c = new Runnable() { // from class: com.google.android.material.sidesheet.g
            @Override // java.lang.Runnable
            public final void run() {
                SideSheetBehavior.c cVar = SideSheetBehavior.c.this;
                cVar.b = false;
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                ViewDragHelper viewDragHelper = sideSheetBehavior.i;
                if (viewDragHelper != null && viewDragHelper.continueSettling(true)) {
                    cVar.a(cVar.a);
                } else if (sideSheetBehavior.h == 2) {
                    sideSheetBehavior.a(cVar.a);
                }
            }
        };

        /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.material.sidesheet.g] */
        public c() {
        }

        public final void a(int i) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            WeakReference<V> weakReference = sideSheetBehavior.p;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.a = i;
            if (this.b) {
                return;
            }
            ViewCompat.postOnAnimation(sideSheetBehavior.p.get(), this.c);
            this.b = true;
        }
    }

    public SideSheetBehavior() {
        this.e = new c();
        this.g = true;
        this.h = 5;
        this.k = 0.1f;
        this.r = -1;
        this.u = new LinkedHashSet();
        this.v = new a();
    }

    public final void a(int i) {
        V v;
        if (this.h == i) {
            return;
        }
        this.h = i;
        WeakReference<V> weakReference = this.p;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        int i2 = this.h == 5 ? 4 : 0;
        if (v.getVisibility() != i2) {
            v.setVisibility(i2);
        }
        Iterator it = this.u.iterator();
        while (it.hasNext()) {
            ((com.google.android.material.sidesheet.c) it.next()).a();
        }
        d();
    }

    public final boolean b() {
        if (this.i != null) {
            return this.g || this.h == 1;
        }
        return false;
    }

    public final void c(View view, int i, boolean z) {
        int c2;
        if (i == 3) {
            c2 = this.a.c();
        } else {
            if (i != 5) {
                throw new IllegalArgumentException(android.support.v4.media.a.a(i, "Invalid state to get outer edge offset: "));
            }
            c2 = this.a.d();
        }
        ViewDragHelper viewDragHelper = this.i;
        if (viewDragHelper == null || (!z ? viewDragHelper.smoothSlideViewTo(view, c2, view.getTop()) : viewDragHelper.settleCapturedViewAt(c2, view.getTop()))) {
            a(i);
        } else {
            a(2);
            this.e.a(i);
        }
    }

    public final void d() {
        V v;
        WeakReference<V> weakReference = this.p;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        ViewCompat.removeAccessibilityAction(v, 262144);
        ViewCompat.removeAccessibilityAction(v, 1048576);
        final int i = 5;
        if (this.h != 5) {
            ViewCompat.replaceAccessibilityAction(v, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS, null, new AccessibilityViewCommand() { // from class: com.google.android.material.sidesheet.e
                @Override // androidx.core.view.accessibility.AccessibilityViewCommand
                public final boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
                    final int i2 = i;
                    if (i2 == 1 || i2 == 2) {
                        throw new IllegalArgumentException(androidx.concurrent.futures.a.a(new StringBuilder("STATE_"), i2 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
                    }
                    final SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                    Reference reference = sideSheetBehavior.p;
                    if (reference == null || reference.get() == null) {
                        sideSheetBehavior.a(i2);
                        return true;
                    }
                    View view2 = (View) sideSheetBehavior.p.get();
                    Runnable runnable = new Runnable() { // from class: com.google.android.material.sidesheet.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            SideSheetBehavior sideSheetBehavior2 = SideSheetBehavior.this;
                            View view3 = (View) sideSheetBehavior2.p.get();
                            if (view3 != null) {
                                sideSheetBehavior2.c(view3, i2, false);
                            }
                        }
                    };
                    ViewParent parent = view2.getParent();
                    if (parent != null && parent.isLayoutRequested() && ViewCompat.isAttachedToWindow(view2)) {
                        view2.post(runnable);
                        return true;
                    }
                    runnable.run();
                    return true;
                }
            });
        }
        final int i2 = 3;
        if (this.h != 3) {
            ViewCompat.replaceAccessibilityAction(v, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_EXPAND, null, new AccessibilityViewCommand() { // from class: com.google.android.material.sidesheet.e
                @Override // androidx.core.view.accessibility.AccessibilityViewCommand
                public final boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
                    final int i22 = i2;
                    if (i22 == 1 || i22 == 2) {
                        throw new IllegalArgumentException(androidx.concurrent.futures.a.a(new StringBuilder("STATE_"), i22 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
                    }
                    final SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                    Reference reference = sideSheetBehavior.p;
                    if (reference == null || reference.get() == null) {
                        sideSheetBehavior.a(i22);
                        return true;
                    }
                    View view2 = (View) sideSheetBehavior.p.get();
                    Runnable runnable = new Runnable() { // from class: com.google.android.material.sidesheet.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            SideSheetBehavior sideSheetBehavior2 = SideSheetBehavior.this;
                            View view3 = (View) sideSheetBehavior2.p.get();
                            if (view3 != null) {
                                sideSheetBehavior2.c(view3, i22, false);
                            }
                        }
                    };
                    ViewParent parent = view2.getParent();
                    if (parent != null && parent.isLayoutRequested() && ViewCompat.isAttachedToWindow(view2)) {
                        view2.post(runnable);
                        return true;
                    }
                    runnable.run();
                    return true;
                }
            });
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onAttachedToLayoutParams(@NonNull CoordinatorLayout.LayoutParams layoutParams) {
        super.onAttachedToLayoutParams(layoutParams);
        this.p = null;
        this.i = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.p = null;
        this.i = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        ViewDragHelper viewDragHelper;
        VelocityTracker velocityTracker;
        if ((!v.isShown() && ViewCompat.getAccessibilityPaneTitle(v) == null) || !this.g) {
            this.j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.s) != null) {
            velocityTracker.recycle();
            this.s = null;
        }
        if (this.s == null) {
            this.s = VelocityTracker.obtain();
        }
        this.s.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.t = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.j) {
            this.j = false;
            return false;
        }
        return (this.j || (viewDragHelper = this.i) == null || !viewDragHelper.shouldInterceptTouchEvent(motionEvent)) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
        V v2;
        V v3;
        int i2;
        View findViewById;
        if (ViewCompat.getFitsSystemWindows(coordinatorLayout) && !ViewCompat.getFitsSystemWindows(v)) {
            v.setFitsSystemWindows(true);
        }
        int i3 = 0;
        if (this.p == null) {
            this.p = new WeakReference<>(v);
            Context context = v.getContext();
            com.google.android.material.motion.a.d(context, R.attr.motionEasingStandardDecelerateInterpolator, PathInterpolatorCompat.create(0.0f, 0.0f, 0.0f, 1.0f));
            com.google.android.material.motion.a.c(context, R.attr.motionDurationMedium2, 300);
            com.google.android.material.motion.a.c(context, R.attr.motionDurationShort3, 150);
            com.google.android.material.motion.a.c(context, R.attr.motionDurationShort2, 100);
            Resources resources = v.getResources();
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
            com.google.android.material.shape.g gVar = this.b;
            if (gVar != null) {
                ViewCompat.setBackground(v, gVar);
                float f = this.f;
                if (f == -1.0f) {
                    f = ViewCompat.getElevation(v);
                }
                this.b.k(f);
            } else {
                ColorStateList colorStateList = this.c;
                if (colorStateList != null) {
                    ViewCompat.setBackgroundTintList(v, colorStateList);
                }
            }
            int i4 = this.h == 5 ? 4 : 0;
            if (v.getVisibility() != i4) {
                v.setVisibility(i4);
            }
            d();
            if (ViewCompat.getImportantForAccessibility(v) == 0) {
                ViewCompat.setImportantForAccessibility(v, 1);
            }
            if (ViewCompat.getAccessibilityPaneTitle(v) == null) {
                ViewCompat.setAccessibilityPaneTitle(v, v.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i5 = GravityCompat.getAbsoluteGravity(((CoordinatorLayout.LayoutParams) v.getLayoutParams()).gravity, i) == 3 ? 1 : 0;
        d dVar = this.a;
        if (dVar == null || dVar.i() != i5) {
            CoordinatorLayout.LayoutParams layoutParams = null;
            k kVar = this.d;
            if (i5 == 0) {
                this.a = new com.google.android.material.sidesheet.b(this);
                if (kVar != null) {
                    WeakReference<V> weakReference = this.p;
                    if (weakReference != null && (v3 = weakReference.get()) != null && (v3.getLayoutParams() instanceof CoordinatorLayout.LayoutParams)) {
                        layoutParams = (CoordinatorLayout.LayoutParams) v3.getLayoutParams();
                    }
                    if (layoutParams == null || ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin <= 0) {
                        k.a e = kVar.e();
                        e.f = new com.google.android.material.shape.a(0.0f);
                        e.g = new com.google.android.material.shape.a(0.0f);
                        k a2 = e.a();
                        com.google.android.material.shape.g gVar2 = this.b;
                        if (gVar2 != null) {
                            gVar2.b(a2);
                        }
                    }
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalArgumentException(u.a(i5, "Invalid sheet edge position value: ", ". Must be 0 or 1."));
                }
                this.a = new com.google.android.material.sidesheet.a(this);
                if (kVar != null) {
                    WeakReference<V> weakReference2 = this.p;
                    if (weakReference2 != null && (v2 = weakReference2.get()) != null && (v2.getLayoutParams() instanceof CoordinatorLayout.LayoutParams)) {
                        layoutParams = (CoordinatorLayout.LayoutParams) v2.getLayoutParams();
                    }
                    if (layoutParams == null || ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin <= 0) {
                        k.a e2 = kVar.e();
                        e2.e = new com.google.android.material.shape.a(0.0f);
                        e2.h = new com.google.android.material.shape.a(0.0f);
                        k a3 = e2.a();
                        com.google.android.material.shape.g gVar3 = this.b;
                        if (gVar3 != null) {
                            gVar3.b(a3);
                        }
                    }
                }
            }
        }
        if (this.i == null) {
            this.i = ViewDragHelper.create(coordinatorLayout, this.v);
        }
        int g = this.a.g(v);
        coordinatorLayout.onLayoutChild(v, i);
        this.m = coordinatorLayout.getWidth();
        this.n = this.a.h(coordinatorLayout);
        this.l = v.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        this.o = marginLayoutParams != null ? this.a.a(marginLayoutParams) : 0;
        int i6 = this.h;
        if (i6 == 1 || i6 == 2) {
            i3 = g - this.a.g(v);
        } else if (i6 != 3) {
            if (i6 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.h);
            }
            i3 = this.a.d();
        }
        ViewCompat.offsetLeftAndRight(v, i3);
        if (this.q == null && (i2 = this.r) != -1 && (findViewById = coordinatorLayout.findViewById(i2)) != null) {
            this.q = new WeakReference<>(findViewById);
        }
        for (com.google.android.material.sidesheet.c cVar : this.u) {
            if (cVar instanceof h) {
                ((h) cVar).getClass();
            }
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        v.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull Parcelable parcelable) {
        b bVar = (b) parcelable;
        if (bVar.getSuperState() != null) {
            super.onRestoreInstanceState(coordinatorLayout, v, bVar.getSuperState());
        }
        int i = bVar.a;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.h = i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @NonNull
    public final Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v) {
        return new b(super.onSaveInstanceState(coordinatorLayout, v), (SideSheetBehavior<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.h == 1 && actionMasked == 0) {
            return true;
        }
        if (b()) {
            this.i.processTouchEvent(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.s) != null) {
            velocityTracker.recycle();
            this.s = null;
        }
        if (this.s == null) {
            this.s = VelocityTracker.obtain();
        }
        this.s.addMovement(motionEvent);
        if (b() && actionMasked == 2 && !this.j && b() && Math.abs(this.t - motionEvent.getX()) > this.i.getTouchSlop()) {
            this.i.captureChildView(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.j;
    }

    public static class b extends AbsSavedState {
        public static final Parcelable.Creator<b> CREATOR = new a();
        public final int a;

        public class a implements Parcelable.ClassLoaderCreator<b> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public final b createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public final Object[] newArray(int i) {
                return new b[i];
            }

            @Override // android.os.Parcelable.Creator
            @Nullable
            public final Object createFromParcel(@NonNull Parcel parcel) {
                return new b(parcel, (ClassLoader) null);
            }
        }

        public b(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
        }

        public b(Parcelable parcelable, @NonNull SideSheetBehavior<?> sideSheetBehavior) {
            super(parcelable);
            this.a = sideSheetBehavior.h;
        }
    }

    public SideSheetBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new c();
        this.g = true;
        this.h = 5;
        this.k = 0.1f;
        this.r = -1;
        this.u = new LinkedHashSet();
        this.v = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.material.a.x);
        if (obtainStyledAttributes.hasValue(3)) {
            this.c = com.google.android.material.resources.c.a(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.d = k.b(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.r = resourceId;
            WeakReference<View> weakReference = this.q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.q = null;
            WeakReference<V> weakReference2 = this.p;
            if (weakReference2 != null) {
                V v = weakReference2.get();
                if (resourceId != -1 && ViewCompat.isLaidOut(v)) {
                    v.requestLayout();
                }
            }
        }
        k kVar = this.d;
        if (kVar != null) {
            com.google.android.material.shape.g gVar = new com.google.android.material.shape.g(kVar);
            this.b = gVar;
            gVar.j(context);
            ColorStateList colorStateList = this.c;
            if (colorStateList != null) {
                this.b.l(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.b.setTint(typedValue.data);
            }
        }
        this.f = obtainStyledAttributes.getDimension(2, -1.0f);
        this.g = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
