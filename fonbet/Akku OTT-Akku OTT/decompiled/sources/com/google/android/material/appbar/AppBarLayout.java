package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import androidx.window.embedding.SplitRule;
import com.google.android.material.shape.g;
import com.google.android.material.shape.h;
import com.haryanvi.netstream.R;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes4.dex */
public final class AppBarLayout extends LinearLayout implements CoordinatorLayout.AttachedBehavior {
    public int a;
    public int b;
    public int c;
    public boolean d;
    public int e;
    public boolean f;
    public boolean i;

    @Nullable
    public WeakReference<View> j;
    public int[] k;
    public Behavior l;

    public static class BaseBehavior<T extends AppBarLayout> extends com.google.android.material.appbar.c<T> {
        public int j;
        public int k;
        public ValueAnimator l;
        public a m;

        @Nullable
        public WeakReference<View> n;

        public static class a extends AbsSavedState {
            public static final Parcelable.Creator<a> CREATOR = new C0120a();
            public boolean a;
            public boolean b;
            public int c;
            public float d;
            public boolean e;

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a$a, reason: collision with other inner class name */
            public class C0120a implements Parcelable.ClassLoaderCreator<a> {
                @Override // android.os.Parcelable.ClassLoaderCreator
                @NonNull
                public final a createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                    return new a(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                @NonNull
                public final Object[] newArray(int i) {
                    return new a[i];
                }

                @Override // android.os.Parcelable.Creator
                @Nullable
                public final Object createFromParcel(@NonNull Parcel parcel) {
                    return new a(parcel, null);
                }
            }

            public a(@NonNull Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.a = parcel.readByte() != 0;
                this.b = parcel.readByte() != 0;
                this.c = parcel.readInt();
                this.d = parcel.readFloat();
                this.e = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public final void writeToParcel(@NonNull Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.c);
                parcel.writeFloat(this.d);
                parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
            }
        }

        public BaseBehavior() {
        }

        public static View j(BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (((CoordinatorLayout.LayoutParams) childAt.getLayoutParams()).getBehavior() instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0092  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x009f  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x005f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static void o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, int i, int i2, boolean z) {
            View view;
            boolean z2;
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    view = null;
                    break;
                }
                view = appBarLayout.getChildAt(i3);
                if (abs >= view.getTop() && abs <= view.getBottom()) {
                    break;
                } else {
                    i3++;
                }
            }
            boolean z3 = true;
            if (view != null) {
                int i4 = ((c) view.getLayoutParams()).a;
                if ((i4 & 1) != 0) {
                    int minimumHeight = ViewCompat.getMinimumHeight(view);
                    if (i2 <= 0 || (i4 & 12) == 0 ? !((i4 & 2) == 0 || (-i) < view.getBottom() - minimumHeight) : (-i) >= view.getBottom() - minimumHeight) {
                        z2 = true;
                        if (appBarLayout.i == z2) {
                            appBarLayout.i = z2;
                            appBarLayout.refreshDrawableState();
                            appBarLayout.getBackground();
                        } else {
                            z3 = false;
                        }
                        if (!z) {
                            if (z3) {
                                List<View> dependents = coordinatorLayout.getDependents(appBarLayout);
                                int size = dependents.size();
                                for (int i5 = 0; i5 < size; i5++) {
                                    CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) dependents.get(i5).getLayoutParams()).getBehavior();
                                    if (behavior instanceof ScrollingViewBehavior) {
                                        if (((ScrollingViewBehavior) behavior).f == 0) {
                                            return;
                                        }
                                    }
                                }
                                return;
                            }
                            return;
                        }
                        if (appBarLayout.getBackground() != null) {
                            appBarLayout.getBackground().jumpToCurrentState();
                        }
                        if (appBarLayout.getForeground() != null) {
                            appBarLayout.getForeground().jumpToCurrentState();
                        }
                        if (appBarLayout.getStateListAnimator() == null) {
                            appBarLayout.getStateListAnimator().jumpToCurrentState();
                            return;
                        }
                        return;
                    }
                }
            }
            z2 = false;
            if (appBarLayout.i == z2) {
            }
            if (!z) {
            }
            if (appBarLayout.getBackground() != null) {
            }
            if (appBarLayout.getForeground() != null) {
            }
            if (appBarLayout.getStateListAnimator() == null) {
            }
        }

        @Override // com.google.android.material.appbar.e
        public final int b() {
            return a() + this.j;
        }

        @Override // com.google.android.material.appbar.c
        public final boolean d(View view) {
            WeakReference<View> weakReference = this.n;
            if (weakReference == null) {
                return true;
            }
            View view2 = weakReference.get();
            return (view2 == null || !view2.isShown() || view2.canScrollVertically(-1)) ? false : true;
        }

        @Override // com.google.android.material.appbar.c
        public final int e(@NonNull View view) {
            return -((AppBarLayout) view).d();
        }

        @Override // com.google.android.material.appbar.c
        public final int f(@NonNull View view) {
            return ((AppBarLayout) view).f();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.appbar.c
        public final void g(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view) {
            n(coordinatorLayout, (AppBarLayout) view);
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0142  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0147  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0149  */
        @Override // com.google.android.material.appbar.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int h(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i, int i2, int i3) {
            int i4;
            boolean z;
            int i5;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int b = b();
            int i6 = 0;
            if (i2 == 0 || b < i2 || b > i3) {
                this.j = 0;
            } else {
                int clamp = MathUtils.clamp(i, i2, i3);
                if (b != clamp) {
                    if (appBarLayout.d) {
                        int abs = Math.abs(clamp);
                        int childCount = appBarLayout.getChildCount();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= childCount) {
                                break;
                            }
                            View childAt = appBarLayout.getChildAt(i7);
                            c cVar = (c) childAt.getLayoutParams();
                            Interpolator interpolator = cVar.c;
                            if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                                i7++;
                            } else if (interpolator != null) {
                                int i8 = cVar.a;
                                if ((i8 & 1) != 0) {
                                    i5 = childAt.getHeight() + ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin;
                                    if ((i8 & 2) != 0) {
                                        i5 -= ViewCompat.getMinimumHeight(childAt);
                                    }
                                } else {
                                    i5 = 0;
                                }
                                ViewCompat.getFitsSystemWindows(childAt);
                                if (i5 > 0) {
                                    float f = i5;
                                    i4 = (childAt.getTop() + Math.round(interpolator.getInterpolation((abs - childAt.getTop()) / f) * f)) * Integer.signum(clamp);
                                }
                            }
                        }
                    }
                    i4 = clamp;
                    f fVar = this.a;
                    int i9 = 1;
                    if (fVar == null) {
                        this.b = i4;
                    } else if (fVar.d != i4) {
                        fVar.d = i4;
                        fVar.a();
                        z = true;
                        int i10 = b - clamp;
                        this.j = clamp - i4;
                        if (z) {
                            int i11 = 0;
                            while (i11 < appBarLayout.getChildCount()) {
                                c cVar2 = (c) appBarLayout.getChildAt(i11).getLayoutParams();
                                b bVar = cVar2.b;
                                if (bVar != null && (cVar2.a & i9) != 0) {
                                    View childAt2 = appBarLayout.getChildAt(i11);
                                    float a2 = a();
                                    Rect rect = bVar.b;
                                    Rect rect2 = bVar.a;
                                    childAt2.getDrawingRect(rect2);
                                    appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect2);
                                    rect2.offset(0, 0);
                                    float abs2 = rect2.top - Math.abs(a2);
                                    if (abs2 <= 0.0f) {
                                        float clamp2 = 1.0f - MathUtils.clamp(Math.abs(abs2 / rect2.height()), 0.0f, 1.0f);
                                        float height = (-abs2) - ((rect2.height() * 0.3f) * (1.0f - (clamp2 * clamp2)));
                                        childAt2.setTranslationY(height);
                                        childAt2.getDrawingRect(rect);
                                        rect.offset(0, (int) (-height));
                                        if (height >= rect.height()) {
                                            childAt2.setVisibility(4);
                                        } else {
                                            childAt2.setVisibility(0);
                                        }
                                        ViewCompat.setClipBounds(childAt2, rect);
                                    } else {
                                        ViewCompat.setClipBounds(childAt2, null);
                                        childAt2.setTranslationY(0.0f);
                                        childAt2.setVisibility(0);
                                    }
                                }
                                i11++;
                                i9 = 1;
                            }
                        }
                        if (!z && appBarLayout.d) {
                            coordinatorLayout.dispatchDependentViewsChanged(appBarLayout);
                        }
                        a();
                        if (!appBarLayout.willNotDraw()) {
                            ViewCompat.postInvalidateOnAnimation(appBarLayout);
                        }
                        o(coordinatorLayout, appBarLayout, clamp, clamp >= b ? -1 : 1, false);
                        i6 = i10;
                    }
                    z = false;
                    int i102 = b - clamp;
                    this.j = clamp - i4;
                    if (z) {
                    }
                    if (!z) {
                        coordinatorLayout.dispatchDependentViewsChanged(appBarLayout);
                    }
                    a();
                    if (!appBarLayout.willNotDraw()) {
                    }
                    o(coordinatorLayout, appBarLayout, clamp, clamp >= b ? -1 : 1, false);
                    i6 = i102;
                }
            }
            if (!ViewCompat.hasAccessibilityDelegate(coordinatorLayout)) {
                ViewCompat.setAccessibilityDelegate(coordinatorLayout, new com.google.android.material.appbar.b(coordinatorLayout, this, appBarLayout));
            }
            return i6;
        }

        public final void k(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(b() - i);
            float abs2 = Math.abs(0.0f);
            int round = abs2 > 0.0f ? Math.round((abs / abs2) * 1000.0f) * 3 : (int) (((abs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int b = b();
            if (b == i) {
                ValueAnimator valueAnimator = this.l;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.l.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.l;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.l = valueAnimator3;
                valueAnimator3.setInterpolator(com.google.android.material.animation.a.e);
                this.l.addUpdateListener(new com.google.android.material.appbar.a(coordinatorLayout, this, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.l.setDuration(Math.min(round, SplitRule.SPLIT_MIN_DIMENSION_DP_DEFAULT));
            this.l.setIntValues(b, i);
            this.l.start();
        }

        public final void l(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, int i, int[] iArr) {
            AppBarLayout appBarLayout2;
            int i2;
            int i3;
            if (i != 0) {
                if (i < 0) {
                    i2 = -appBarLayout.f();
                    i3 = appBarLayout.c() + i2;
                } else {
                    i2 = -appBarLayout.f();
                    i3 = 0;
                }
                int i4 = i2;
                int i5 = i3;
                if (i4 != i5) {
                    appBarLayout2 = appBarLayout;
                    iArr[1] = h(coordinatorLayout, appBarLayout2, b() - i, i4, i5);
                    appBarLayout2.getClass();
                }
            }
            appBarLayout2 = appBarLayout;
            appBarLayout2.getClass();
        }

        @Nullable
        public final a m(@Nullable Parcelable parcelable, @NonNull T t) {
            int a2 = a();
            int childCount = t.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + a2;
                if (childAt.getTop() + a2 <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbsSavedState.EMPTY_STATE;
                    }
                    a aVar = new a(parcelable);
                    boolean z = a2 == 0;
                    aVar.b = z;
                    aVar.a = !z && (-a2) >= t.f();
                    aVar.c = i;
                    aVar.e = bottom == ViewCompat.getMinimumHeight(childAt);
                    aVar.d = bottom / childAt.getHeight();
                    return aVar;
                }
            }
            return null;
        }

        public final void n(CoordinatorLayout coordinatorLayout, @NonNull T t) {
            t.getClass();
            int paddingTop = t.getPaddingTop();
            int b = b() - paddingTop;
            int childCount = t.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = t.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                c cVar = (c) childAt.getLayoutParams();
                if ((cVar.a & 32) == 32) {
                    top -= ((LinearLayout.LayoutParams) cVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) cVar).bottomMargin;
                }
                int i2 = -b;
                if (top <= i2 && bottom >= i2) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                View childAt2 = t.getChildAt(i);
                c cVar2 = (c) childAt2.getLayoutParams();
                int i3 = cVar2.a;
                if ((i3 & 17) == 17) {
                    int i4 = -childAt2.getTop();
                    int i5 = -childAt2.getBottom();
                    if (i == 0 && ViewCompat.getFitsSystemWindows(t)) {
                        ViewCompat.getFitsSystemWindows(childAt2);
                    }
                    if ((i3 & 2) == 2) {
                        i5 += ViewCompat.getMinimumHeight(childAt2);
                    } else if ((i3 & 5) == 5) {
                        int minimumHeight = ViewCompat.getMinimumHeight(childAt2) + i5;
                        if (b < minimumHeight) {
                            i4 = minimumHeight;
                        } else {
                            i5 = minimumHeight;
                        }
                    }
                    if ((i3 & 32) == 32) {
                        i4 += ((LinearLayout.LayoutParams) cVar2).topMargin;
                        i5 -= ((LinearLayout.LayoutParams) cVar2).bottomMargin;
                    }
                    if (b < (i5 + i4) / 2) {
                        i4 = i5;
                    }
                    k(coordinatorLayout, t, MathUtils.clamp(i4 + paddingTop, -t.f(), 0));
                }
            }
        }

        @Override // com.google.android.material.appbar.e, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.onLayoutChild(coordinatorLayout, appBarLayout, i);
            int i2 = appBarLayout.e;
            a aVar = this.m;
            if (aVar == null || (i2 & 8) != 0) {
                if (i2 != 0) {
                    boolean z = (i2 & 4) != 0;
                    if ((i2 & 2) != 0) {
                        int i3 = -appBarLayout.f();
                        if (z) {
                            k(coordinatorLayout, appBarLayout, i3);
                        } else {
                            i(coordinatorLayout, appBarLayout, i3);
                        }
                    } else if ((i2 & 1) != 0) {
                        if (z) {
                            k(coordinatorLayout, appBarLayout, 0);
                        } else {
                            i(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (aVar.a) {
                i(coordinatorLayout, appBarLayout, -appBarLayout.f());
            } else if (aVar.b) {
                i(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(aVar.c);
                i(coordinatorLayout, appBarLayout, (this.m.e ? ViewCompat.getMinimumHeight(childAt) : Math.round(childAt.getHeight() * this.m.d)) + (-childAt.getBottom()));
            }
            appBarLayout.e = 0;
            this.m = null;
            int clamp = MathUtils.clamp(a(), -appBarLayout.f(), 0);
            f fVar = this.a;
            if (fVar == null) {
                this.b = clamp;
            } else if (fVar.d != clamp) {
                fVar.d = clamp;
                fVar.a();
            }
            o(coordinatorLayout, appBarLayout, a(), 0, true);
            a();
            if (!appBarLayout.willNotDraw()) {
                ViewCompat.postInvalidateOnAnimation(appBarLayout);
            }
            if (!ViewCompat.hasAccessibilityDelegate(coordinatorLayout)) {
                ViewCompat.setAccessibilityDelegate(coordinatorLayout, new com.google.android.material.appbar.b(coordinatorLayout, this, appBarLayout));
            }
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i, int i2, int i3, int i4) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) appBarLayout.getLayoutParams())).height != -2) {
                return super.onMeasureChild(coordinatorLayout, appBarLayout, i, i2, i3, i4);
            }
            coordinatorLayout.onMeasureChild(appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final /* bridge */ /* synthetic */ void onNestedPreScroll(CoordinatorLayout coordinatorLayout, @NonNull View view, View view2, int i, int i2, int[] iArr, int i3) {
            l(coordinatorLayout, (AppBarLayout) view, i2, iArr);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void onNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i4 < 0) {
                int i6 = -appBarLayout.d();
                coordinatorLayout2 = coordinatorLayout;
                iArr[1] = h(coordinatorLayout2, appBarLayout, b() - i4, i6, 0);
            } else {
                coordinatorLayout2 = coordinatorLayout;
            }
            if (i4 != 0 || ViewCompat.hasAccessibilityDelegate(coordinatorLayout2)) {
                return;
            }
            ViewCompat.setAccessibilityDelegate(coordinatorLayout2, new com.google.android.material.appbar.b(coordinatorLayout2, this, appBarLayout));
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void onRestoreInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, Parcelable parcelable) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (!(parcelable instanceof a)) {
                super.onRestoreInstanceState(coordinatorLayout, appBarLayout, parcelable);
                this.m = null;
            } else {
                a aVar = (a) parcelable;
                this.m = aVar;
                super.onRestoreInstanceState(coordinatorLayout, appBarLayout, aVar.getSuperState());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final Parcelable onSaveInstanceState(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            Parcelable onSaveInstanceState = super.onSaveInstanceState(coordinatorLayout, appBarLayout);
            a m = m(onSaveInstanceState, appBarLayout);
            return m == null ? onSaveInstanceState : m;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2, View view3, int i, int i2) {
            boolean z;
            ValueAnimator valueAnimator;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if ((i & 2) != 0) {
                appBarLayout.getClass();
                if (appBarLayout.f() != 0 && coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()) {
                    z = true;
                    if (z && (valueAnimator = this.l) != null) {
                        valueAnimator.cancel();
                    }
                    this.n = null;
                    this.k = i2;
                    return z;
                }
            }
            z = false;
            if (z) {
                valueAnimator.cancel();
            }
            this.n = null;
            this.k = i2;
            return z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void onStopNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.k == 0 || i == 1) {
                n(coordinatorLayout, appBarLayout);
            }
            this.n = new WeakReference<>(view2);
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends d {
        public ScrollingViewBehavior() {
        }

        @Override // com.google.android.material.appbar.d
        @Nullable
        public final AppBarLayout d(@NonNull List list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // com.google.android.material.appbar.d
        public final float e(View view) {
            int i;
            if (!(view instanceof AppBarLayout)) {
                return 0.0f;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int f = appBarLayout.f();
            int c = appBarLayout.c();
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) appBarLayout.getLayoutParams()).getBehavior();
            int b = behavior instanceof BaseBehavior ? ((BaseBehavior) behavior).b() : 0;
            if ((c == 0 || f + b > c) && (i = f - c) != 0) {
                return (b / i) + 1.0f;
            }
            return 0.0f;
        }

        @Override // com.google.android.material.appbar.d
        public final int f(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).f() : view.getMeasuredHeight();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onDependentViewChanged(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
            int clamp;
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) view2.getLayoutParams()).getBehavior();
            if (behavior instanceof BaseBehavior) {
                int bottom = (view2.getBottom() - view.getTop()) + ((BaseBehavior) behavior).j + this.e;
                if (this.f == 0) {
                    clamp = 0;
                } else {
                    float e = e(view2);
                    int i = this.f;
                    clamp = MathUtils.clamp((int) (e * i), 0, i);
                }
                ViewCompat.offsetTopAndBottom(view, bottom - clamp);
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void onDependentViewRemoved(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
            if (view2 instanceof AppBarLayout) {
                ViewCompat.setAccessibilityDelegate(coordinatorLayout, null);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean onRequestChildRectangleOnScreen(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull Rect rect, boolean z) {
            AppBarLayout appBarLayout;
            List<View> dependencies = coordinatorLayout.getDependencies(view);
            int size = dependencies.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    appBarLayout = null;
                    break;
                }
                View view2 = dependencies.get(i);
                if (view2 instanceof AppBarLayout) {
                    appBarLayout = (AppBarLayout) view2;
                    break;
                }
                i++;
            }
            if (appBarLayout != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect3 = this.c;
                rect3.set(0, 0, width, height);
                if (!rect3.contains(rect2)) {
                    appBarLayout.e = (z ? 0 : 4) | 10;
                    appBarLayout.requestLayout();
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.material.a.v);
            this.f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    public static abstract class a {
    }

    public static class b extends a {
        public final Rect a = new Rect();
        public final Rect b = new Rect();
    }

    public static class c extends LinearLayout.LayoutParams {
        public int a;
        public b b;
        public Interpolator c;
    }

    public static c b(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            c cVar = new c((LinearLayout.LayoutParams) layoutParams);
            cVar.a = 1;
            return cVar;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            c cVar2 = new c((ViewGroup.MarginLayoutParams) layoutParams);
            cVar2.a = 1;
            return cVar2;
        }
        c cVar3 = new c(layoutParams);
        cVar3.a = 1;
        return cVar3;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        c cVar = new c(context, attributeSet);
        cVar.a = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.material.a.a);
        cVar.a = obtainStyledAttributes.getInt(1, 0);
        cVar.b = obtainStyledAttributes.getInt(0, 0) != 1 ? null : new b();
        if (obtainStyledAttributes.hasValue(2)) {
            cVar.c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(2, 0));
        }
        obtainStyledAttributes.recycle();
        return cVar;
    }

    public final int c() {
        int i;
        int minimumHeight;
        int i2 = this.b;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = cVar.a;
                if ((i4 & 5) != 5) {
                    if (i3 > 0) {
                        break;
                    }
                } else {
                    int i5 = ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin;
                    if ((i4 & 8) != 0) {
                        minimumHeight = ViewCompat.getMinimumHeight(childAt);
                    } else if ((i4 & 2) != 0) {
                        minimumHeight = measuredHeight - ViewCompat.getMinimumHeight(childAt);
                    } else {
                        i = i5 + measuredHeight;
                        if (childCount == 0 && ViewCompat.getFitsSystemWindows(childAt)) {
                            i = Math.min(i, measuredHeight);
                        }
                        i3 += i;
                    }
                    i = minimumHeight + i5;
                    if (childCount == 0) {
                        i = Math.min(i, measuredHeight);
                    }
                    i3 += i;
                }
            }
        }
        int max = Math.max(0, i3);
        this.b = max;
        return max;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    public final int d() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin + childAt.getMeasuredHeight();
                int i4 = cVar.a;
                if ((i4 & 1) == 0) {
                    break;
                }
                i3 += measuredHeight;
                if ((i4 & 2) != 0) {
                    i3 -= ViewCompat.getMinimumHeight(childAt);
                    break;
                }
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.c = max;
        return max;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        getDrawableState();
    }

    public final int e() {
        int minimumHeight = ViewCompat.getMinimumHeight(this);
        if (minimumHeight != 0) {
            return minimumHeight * 2;
        }
        int childCount = getChildCount();
        int minimumHeight2 = childCount >= 1 ? ViewCompat.getMinimumHeight(getChildAt(childCount - 1)) : 0;
        return minimumHeight2 != 0 ? minimumHeight2 * 2 : getHeight() / 3;
    }

    public final int f() {
        int i = this.a;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = cVar.a;
                if ((i4 & 1) == 0) {
                    break;
                }
                i3 += measuredHeight + ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin;
                if (i2 == 0) {
                    ViewCompat.getFitsSystemWindows(childAt);
                }
                if ((i4 & 2) != 0) {
                    i3 -= ViewCompat.getMinimumHeight(childAt);
                    break;
                }
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.a = max;
        return max;
    }

    public final void g() {
        BaseBehavior.a m = (this.a == -1 || this.e != 0) ? null : this.l.m(AbsSavedState.EMPTY_STATE, this);
        this.a = -1;
        this.b = -1;
        this.c = -1;
        if (m != null) {
            Behavior behavior = this.l;
            if (behavior.m != null) {
                return;
            }
            behavior.m = m;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        c cVar = new c(-1, -2);
        cVar.a = 1;
        return cVar;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @NonNull
    public final CoordinatorLayout.Behavior<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.l = behavior;
        return behavior;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof g) {
            h.b(this, (g) background);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        if (this.k == null) {
            this.k = new int[4];
        }
        int[] iArr = this.k;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.f;
        iArr[0] = z ? R.attr.state_liftable : -2130969688;
        iArr[1] = (z && this.i) ? R.attr.state_lifted : -2130969689;
        iArr[2] = z ? R.attr.state_collapsible : -2130969684;
        iArr[3] = (z && this.i) ? R.attr.state_collapsed : -2130969683;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference<View> weakReference = this.j;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.j = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (ViewCompat.getFitsSystemWindows(this) && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !ViewCompat.getFitsSystemWindows(childAt)) {
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    ViewCompat.offsetTopAndBottom(getChildAt(childCount), 0);
                }
            }
        }
        g();
        this.d = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            }
            if (((c) getChildAt(i5).getLayoutParams()).c != null) {
                this.d = true;
                break;
            }
            i5++;
        }
        int childCount3 = getChildCount();
        int i6 = 0;
        while (true) {
            if (i6 >= childCount3) {
                z2 = false;
                break;
            }
            int i7 = ((c) getChildAt(i6).getLayoutParams()).a;
            if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                break;
            } else {
                i6++;
            }
        }
        if (this.f != z2) {
            this.f = z2;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && ViewCompat.getFitsSystemWindows(this) && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !ViewCompat.getFitsSystemWindows(childAt)) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    measuredHeight = MathUtils.clamp(getMeasuredHeight(), 0, View.MeasureSpec.getSize(i2));
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        g();
    }

    @Override // android.view.View
    @RequiresApi(21)
    public final void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof g) {
            ((g) background).k(f);
        }
    }

    @Override // android.widget.LinearLayout
    public final void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(@NonNull Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        c cVar = new c(-1, -2);
        cVar.a = 1;
        return cVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }
}
