package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import androidx.core.util.Preconditions;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.i;
import com.haryanvi.netstream.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes4.dex */
public class CarouselLayoutManager extends RecyclerView.LayoutManager implements com.google.android.material.carousel.b, RecyclerView.SmoothScroller.ScrollVectorProvider {

    @VisibleForTesting
    public int a;

    @VisibleForTesting
    public int b;

    @VisibleForTesting
    public int c;
    public final c d;

    @NonNull
    public final l e;

    @Nullable
    public j f;

    @Nullable
    public i g;
    public int h;

    @Nullable
    public HashMap i;
    public f j;
    public final View.OnLayoutChangeListener k;
    public int l;
    public int m;
    public final int n;

    public class a extends LinearSmoothScroller {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public final int calculateDxToMakeVisible(View view, int i) {
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            if (carouselLayoutManager.f == null || !carouselLayoutManager.m()) {
                return 0;
            }
            int position = carouselLayoutManager.getPosition(view);
            return (int) (carouselLayoutManager.a - carouselLayoutManager.j(position, carouselLayoutManager.i(position)));
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public final int calculateDyToMakeVisible(View view, int i) {
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            if (carouselLayoutManager.f == null || carouselLayoutManager.m()) {
                return 0;
            }
            int position = carouselLayoutManager.getPosition(view);
            return (int) (carouselLayoutManager.a - carouselLayoutManager.j(position, carouselLayoutManager.i(position)));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
        @Nullable
        public final PointF computeScrollVectorForPosition(int i) {
            return CarouselLayoutManager.this.computeScrollVectorForPosition(i);
        }
    }

    public static final class b {
        public final View a;
        public final float b;
        public final float c;
        public final d d;

        public b(View view, float f, float f2, d dVar) {
            this.a = view;
            this.b = f;
            this.c = f2;
            this.d = dVar;
        }
    }

    public static class c extends RecyclerView.ItemDecoration {
        public final Paint a;
        public List<i.b> b;

        public c() {
            Paint paint = new Paint();
            this.a = paint;
            this.b = Collections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public final void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
            Canvas canvas2;
            super.onDrawOver(canvas, recyclerView, state);
            float dimension = recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width);
            Paint paint = this.a;
            paint.setStrokeWidth(dimension);
            for (i.b bVar : this.b) {
                paint.setColor(ColorUtils.blendARGB(-65281, -16776961, bVar.c));
                if (((CarouselLayoutManager) recyclerView.getLayoutManager()).m()) {
                    canvas2 = canvas;
                    canvas2.drawLine(bVar.b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).j.i(), bVar.b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).j.d(), paint);
                } else {
                    float f = ((CarouselLayoutManager) recyclerView.getLayoutManager()).j.f();
                    float f2 = bVar.b;
                    float g = ((CarouselLayoutManager) recyclerView.getLayoutManager()).j.g();
                    float f3 = bVar.b;
                    canvas2 = canvas;
                    canvas2.drawLine(f, f2, g, f3, paint);
                }
                canvas = canvas2;
            }
        }
    }

    public static class d {
        public final i.b a;
        public final i.b b;

        public d(i.b bVar, i.b bVar2) {
            Preconditions.checkArgument(bVar.a <= bVar2.a);
            this.a = bVar;
            this.b = bVar2;
        }
    }

    public CarouselLayoutManager() {
        l lVar = new l();
        this.d = new c();
        this.h = 0;
        this.k = new View.OnLayoutChangeListener() { // from class: com.google.android.material.carousel.c
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
                    return;
                }
                view.post(new androidx.core.widget.b(CarouselLayoutManager.this, 4));
            }
        };
        this.m = -1;
        this.n = 0;
        this.e = lVar;
        s();
        setOrientation(0);
    }

    public static d l(List<i.b> list, float f, boolean z) {
        float f2 = Float.MAX_VALUE;
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        float f3 = -3.4028235E38f;
        float f4 = Float.MAX_VALUE;
        float f5 = Float.MAX_VALUE;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i.b bVar = list.get(i5);
            float f6 = z ? bVar.b : bVar.a;
            float abs = Math.abs(f6 - f);
            if (f6 <= f && abs <= f2) {
                i = i5;
                f2 = abs;
            }
            if (f6 > f && abs <= f4) {
                i3 = i5;
                f4 = abs;
            }
            if (f6 <= f5) {
                i2 = i5;
                f5 = f6;
            }
            if (f6 > f3) {
                i4 = i5;
                f3 = f6;
            }
        }
        if (i == -1) {
            i = i2;
        }
        if (i3 == -1) {
            i3 = i4;
        }
        return new d(list.get(i), list.get(i3));
    }

    public final void a(View view, int i, b bVar) {
        float f = this.g.a / 2.0f;
        addView(view, i);
        float f2 = bVar.c;
        this.j.j(view, (int) (f2 - f), (int) (f2 + f));
        u(view, bVar.b, bVar.d);
    }

    public final float b(float f, float f2) {
        return n() ? f - f2 : f + f2;
    }

    public final void c(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        float f = f(i);
        while (i < state.getItemCount()) {
            b q = q(recycler, f, i);
            d dVar = q.d;
            float f2 = q.c;
            if (o(f2, dVar)) {
                return;
            }
            f = b(f, this.g.a);
            if (!p(f2, dVar)) {
                a(q.a, -1, q);
            }
            i++;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollHorizontally() {
        return m();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollVertically() {
        return !m();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollExtent(@NonNull RecyclerView.State state) {
        if (getChildCount() == 0 || this.f == null || getItemCount() <= 1) {
            return 0;
        }
        return (int) (getWidth() * (this.f.a.a / computeHorizontalScrollRange(state)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollOffset(@NonNull RecyclerView.State state) {
        return this.a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollRange(@NonNull RecyclerView.State state) {
        return this.c - this.b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    @Nullable
    public final PointF computeScrollVectorForPosition(int i) {
        if (this.f == null) {
            return null;
        }
        int j = j(i, i(i)) - this.a;
        return m() ? new PointF(j, 0.0f) : new PointF(0.0f, j);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollExtent(@NonNull RecyclerView.State state) {
        if (getChildCount() == 0 || this.f == null || getItemCount() <= 1) {
            return 0;
        }
        return (int) (getHeight() * (this.f.a.a / computeVerticalScrollRange(state)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollOffset(@NonNull RecyclerView.State state) {
        return this.a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollRange(@NonNull RecyclerView.State state) {
        return this.c - this.b;
    }

    public final void d(RecyclerView.Recycler recycler, int i) {
        float f = f(i);
        while (i >= 0) {
            b q = q(recycler, f, i);
            d dVar = q.d;
            float f2 = q.c;
            if (p(f2, dVar)) {
                return;
            }
            float f3 = this.g.a;
            f = n() ? f + f3 : f - f3;
            if (!o(f2, dVar)) {
                a(q.a, 0, q);
            }
            i--;
        }
    }

    public final float e(View view, float f, d dVar) {
        i.b bVar = dVar.a;
        float f2 = bVar.b;
        i.b bVar2 = dVar.b;
        float f3 = bVar2.b;
        float f4 = bVar.a;
        float f5 = bVar2.a;
        float b2 = com.google.android.material.animation.a.b(f2, f3, f4, f5, f);
        if (bVar2 != this.g.b() && bVar != this.g.d()) {
            return b2;
        }
        return (((1.0f - bVar2.c) + (this.j.b((RecyclerView.LayoutParams) view.getLayoutParams()) / this.g.a)) * (f - f5)) + b2;
    }

    public final float f(int i) {
        return b(this.j.h() - this.a, this.g.a * i);
    }

    public final void g(RecyclerView.Recycler recycler, RecyclerView.State state) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            Rect rect = new Rect();
            super.getDecoratedBoundsWithMargins(childAt, rect);
            float centerX = m() ? rect.centerX() : rect.centerY();
            if (!p(centerX, l(this.g.b, centerX, true))) {
                break;
            } else {
                removeAndRecycleView(childAt, recycler);
            }
        }
        while (getChildCount() - 1 >= 0) {
            View childAt2 = getChildAt(getChildCount() - 1);
            Rect rect2 = new Rect();
            super.getDecoratedBoundsWithMargins(childAt2, rect2);
            float centerX2 = m() ? rect2.centerX() : rect2.centerY();
            if (!o(centerX2, l(this.g.b, centerX2, true))) {
                break;
            } else {
                removeAndRecycleView(childAt2, recycler);
            }
        }
        if (getChildCount() == 0) {
            d(recycler, this.h - 1);
            c(this.h, recycler, state);
        } else {
            int position = getPosition(getChildAt(0));
            int position2 = getPosition(getChildAt(getChildCount() - 1));
            d(recycler, position - 1);
            c(position2 + 1, recycler, state);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void getDecoratedBoundsWithMargins(@NonNull View view, @NonNull Rect rect) {
        super.getDecoratedBoundsWithMargins(view, rect);
        float centerY = rect.centerY();
        if (m()) {
            centerY = rect.centerX();
        }
        d l = l(this.g.b, centerY, true);
        i.b bVar = l.a;
        float f = bVar.d;
        i.b bVar2 = l.b;
        float b2 = com.google.android.material.animation.a.b(f, bVar2.d, bVar.b, bVar2.b, centerY);
        float width = m() ? (rect.width() - b2) / 2.0f : 0.0f;
        float height = m() ? 0.0f : (rect.height() - b2) / 2.0f;
        rect.set((int) (rect.left + width), (int) (rect.top + height), (int) (rect.right - width), (int) (rect.bottom - height));
    }

    public final int h() {
        return m() ? getWidth() : getHeight();
    }

    public final i i(int i) {
        i iVar;
        HashMap hashMap = this.i;
        return (hashMap == null || (iVar = (i) hashMap.get(Integer.valueOf(MathUtils.clamp(i, 0, Math.max(0, getItemCount() + (-1)))))) == null) ? this.f.a : iVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean isAutoMeasureEnabled() {
        return true;
    }

    public final int j(int i, i iVar) {
        if (!n()) {
            return (int) ((iVar.a / 2.0f) + ((i * iVar.a) - iVar.a().a));
        }
        float h = h() - iVar.c().a;
        float f = iVar.a;
        return (int) ((h - (i * f)) - (f / 2.0f));
    }

    public final int k(int i, @NonNull i iVar) {
        int i2 = Integer.MAX_VALUE;
        for (i.b bVar : iVar.b.subList(iVar.c, iVar.d + 1)) {
            float f = iVar.a;
            float f2 = (f / 2.0f) + (i * f);
            int h = (n() ? (int) ((h() - bVar.a) - f2) : (int) (f2 - bVar.a)) - this.a;
            if (Math.abs(i2) > Math.abs(h)) {
                i2 = h;
            }
        }
        return i2;
    }

    public final boolean m() {
        return this.j.a == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void measureChildWithMargins(@NonNull View view, int i, int i2) {
        if (!(view instanceof k)) {
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        Rect rect = new Rect();
        calculateItemDecorationsForChild(view, rect);
        int i3 = rect.left + rect.right + i;
        int i4 = rect.top + rect.bottom + i2;
        j jVar = this.f;
        view.measure(RecyclerView.LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + i3, (int) ((jVar == null || this.j.a != 0) ? ((ViewGroup.MarginLayoutParams) layoutParams).width : jVar.a.a), m()), RecyclerView.LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + i4, (int) ((jVar == null || this.j.a != 1) ? ((ViewGroup.MarginLayoutParams) layoutParams).height : jVar.a.a), canScrollVertically()));
    }

    public final boolean n() {
        return m() && getLayoutDirection() == 1;
    }

    public final boolean o(float f, d dVar) {
        i.b bVar = dVar.a;
        float f2 = bVar.d;
        i.b bVar2 = dVar.b;
        float b2 = com.google.android.material.animation.a.b(f2, bVar2.d, bVar.b, bVar2.b, f) / 2.0f;
        float f3 = n() ? f + b2 : f - b2;
        return n() ? f3 < 0.0f : f3 > ((float) h());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        Context context = recyclerView.getContext();
        l lVar = this.e;
        float f = lVar.a;
        if (f <= 0.0f) {
            f = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        lVar.a = f;
        float f2 = lVar.b;
        if (f2 <= 0.0f) {
            f2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        lVar.b = f2;
        s();
        recyclerView.addOnLayoutChangeListener(this.k);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        recyclerView.removeOnLayoutChangeListener(this.k);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0027, code lost:
    
        if (r8 != 1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0031, code lost:
    
        if (n() != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0035, code lost:
    
        if (r8 == 1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x003e, code lost:
    
        if (n() != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View onFocusSearchFailed(@NonNull View view, int i, @NonNull RecyclerView.Recycler recycler, @NonNull RecyclerView.State state) {
        char c2;
        if (getChildCount() == 0) {
            return null;
        }
        int i2 = this.j.a;
        if (i != 1) {
            if (i != 2) {
                if (i == 17) {
                    if (i2 == 0) {
                    }
                    c2 = 0;
                } else if (i != 33) {
                    if (i != 66) {
                        if (i == 130) {
                        }
                        c2 = 0;
                    } else {
                        if (i2 == 0) {
                        }
                        c2 = 0;
                    }
                }
                if (c2 == 0) {
                    return null;
                }
                if (c2 == 65535) {
                    if (getPosition(view) == 0) {
                        return null;
                    }
                    int position = getPosition(getChildAt(0)) - 1;
                    if (position >= 0 && position < getItemCount()) {
                        b q = q(recycler, f(position), position);
                        a(q.a, 0, q);
                    }
                    return getChildAt(n() ? getChildCount() - 1 : 0);
                }
                if (getPosition(view) == getItemCount() - 1) {
                    return null;
                }
                int position2 = getPosition(getChildAt(getChildCount() - 1)) + 1;
                if (position2 >= 0 && position2 < getItemCount()) {
                    b q2 = q(recycler, f(position2), position2);
                    a(q2.a, -1, q2);
                }
                return getChildAt(n() ? 0 : getChildCount() - 1);
            }
            c2 = 1;
            if (c2 == 0) {
            }
        }
        c2 = 65535;
        if (c2 == 0) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(getPosition(getChildAt(0)));
            accessibilityEvent.setToIndex(getPosition(getChildAt(getChildCount() - 1)));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsAdded(@NonNull RecyclerView recyclerView, int i, int i2) {
        super.onItemsAdded(recyclerView, i, i2);
        w();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsRemoved(@NonNull RecyclerView recyclerView, int i, int i2) {
        super.onItemsRemoved(recyclerView, i, i2);
        w();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (state.getItemCount() <= 0 || h() <= 0.0f) {
            removeAndRecycleAllViews(recycler);
            this.h = 0;
            return;
        }
        boolean n = n();
        int i = 1;
        boolean z = this.f == null;
        if (z) {
            r(recycler);
        }
        j jVar = this.f;
        boolean n2 = n();
        i a2 = n2 ? jVar.a() : jVar.c();
        float f = (n2 ? a2.c() : a2.a()).a;
        float f2 = a2.a / 2.0f;
        int h = (int) (this.j.h() - (n() ? f + f2 : f - f2));
        j jVar2 = this.f;
        boolean n3 = n();
        i c2 = n3 ? jVar2.c() : jVar2.a();
        i.b a3 = n3 ? c2.a() : c2.c();
        int itemCount = (int) (((((state.getItemCount() - 1) * c2.a) * (n3 ? -1.0f : 1.0f)) - (a3.a - this.j.h())) + (this.j.e() - a3.a) + (n3 ? -a3.g : a3.h));
        int min = n3 ? Math.min(0, itemCount) : Math.max(0, itemCount);
        this.b = n ? min : h;
        if (n) {
            min = h;
        }
        this.c = min;
        if (z) {
            this.a = h;
            j jVar3 = this.f;
            int itemCount2 = getItemCount();
            int i2 = this.b;
            int i3 = this.c;
            boolean n4 = n();
            List<i> list = jVar3.b;
            List<i> list2 = jVar3.c;
            float f3 = jVar3.a.a;
            HashMap hashMap = new HashMap();
            int i4 = 0;
            int i5 = 0;
            while (true) {
                if (i4 >= itemCount2) {
                    break;
                }
                int i6 = n4 ? (itemCount2 - i4) - i : i4;
                int i7 = i;
                if (i6 * f3 * (n4 ? -1 : i7) > i3 - jVar3.g || i4 >= itemCount2 - list2.size()) {
                    hashMap.put(Integer.valueOf(i6), list2.get(MathUtils.clamp(i5, 0, list2.size() - 1)));
                    i5++;
                }
                i4++;
                i = i7;
            }
            int i8 = i;
            int i9 = 0;
            for (int i10 = itemCount2 - 1; i10 >= 0; i10--) {
                int i11 = n4 ? (itemCount2 - i10) - 1 : i10;
                if (i11 * f3 * (n4 ? -1 : i8) < i2 + jVar3.f || i10 < list.size()) {
                    hashMap.put(Integer.valueOf(i11), list.get(MathUtils.clamp(i9, 0, list.size() - 1)));
                    i9++;
                }
            }
            this.i = hashMap;
            int i12 = this.m;
            if (i12 != -1) {
                this.a = j(i12, i(i12));
            }
        }
        int i13 = this.a;
        int i14 = this.b;
        int i15 = this.c;
        this.a = (i13 < i14 ? i14 - i13 : i13 > i15 ? i15 - i13 : 0) + i13;
        this.h = MathUtils.clamp(this.h, 0, state.getItemCount());
        v(this.f);
        detachAndScrapAttachedViews(recycler);
        g(recycler, state);
        this.l = getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        if (getChildCount() == 0) {
            this.h = 0;
        } else {
            this.h = getPosition(getChildAt(0));
        }
    }

    public final boolean p(float f, d dVar) {
        i.b bVar = dVar.a;
        float f2 = bVar.d;
        i.b bVar2 = dVar.b;
        float b2 = b(f, com.google.android.material.animation.a.b(f2, bVar2.d, bVar.b, bVar2.b, f) / 2.0f);
        return n() ? b2 > ((float) h()) : b2 < 0.0f;
    }

    public final b q(RecyclerView.Recycler recycler, float f, int i) {
        View viewForPosition = recycler.getViewForPosition(i);
        measureChildWithMargins(viewForPosition, 0, 0);
        float b2 = b(f, this.g.a / 2.0f);
        d l = l(this.g.b, b2, false);
        return new b(viewForPosition, b2, e(viewForPosition, b2, l), l);
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x05c2, code lost:
    
        if (r7 == r10) goto L196;
     */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x056f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(RecyclerView.Recycler recycler) {
        float f;
        int i;
        int[] iArr;
        i d2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f2;
        int i7;
        i iVar;
        int i8;
        boolean z;
        int size;
        int height;
        List<i.b> list;
        int i9;
        i.b bVar;
        i.b bVar2;
        int i10;
        int i11;
        View viewForPosition = recycler.getViewForPosition(0);
        measureChildWithMargins(viewForPosition, 0, 0);
        l lVar = this.e;
        lVar.getClass();
        float height2 = getHeight();
        if (m()) {
            height2 = getWidth();
        }
        float f3 = height2;
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) viewForPosition.getLayoutParams();
        float f4 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        float measuredHeight = viewForPosition.getMeasuredHeight();
        if (m()) {
            f4 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            measuredHeight = viewForPosition.getMeasuredWidth();
        }
        float f5 = f4;
        float f6 = lVar.a + f5;
        float max = Math.max(lVar.b + f5, f6);
        float min = Math.min(measuredHeight + f5, f3);
        float clamp = MathUtils.clamp((measuredHeight / 3.0f) + f5, f6 + f5, max + f5);
        float f7 = (min + clamp) / 2.0f;
        int[] iArr2 = f3 < f6 * 2.0f ? new int[]{0} : l.d;
        int i12 = this.n;
        int[] iArr3 = l.e;
        if (i12 == 1) {
            int length = iArr2.length;
            f = 2.0f;
            int[] iArr4 = new int[length];
            i = 1;
            for (int i13 = 0; i13 < length; i13++) {
                iArr4[i13] = iArr2[i13] * 2;
            }
            int[] iArr5 = new int[2];
            for (int i14 = 0; i14 < 2; i14++) {
                iArr5[i14] = iArr3[i14] * 2;
            }
            iArr = iArr5;
            iArr2 = iArr4;
        } else {
            f = 2.0f;
            i = 1;
            iArr = iArr3;
        }
        int i15 = Integer.MIN_VALUE;
        for (int i16 : iArr) {
            if (i16 > i15) {
                i15 = i16;
            }
        }
        float f8 = f3 - (i15 * f7);
        int length2 = iArr2.length;
        int i17 = Integer.MIN_VALUE;
        int i18 = 0;
        while (i18 < length2) {
            float f9 = f8;
            int i19 = iArr2[i18];
            if (i19 > i17) {
                i17 = i19;
            }
            i18++;
            f8 = f9;
        }
        int max2 = (int) Math.max(1.0d, Math.floor((f8 - (i17 * max)) / min));
        int ceil = (int) Math.ceil(f3 / min);
        int i20 = (ceil - max2) + 1;
        int[] iArr6 = new int[i20];
        for (int i21 = 0; i21 < i20; i21++) {
            iArr6[i21] = ceil - i21;
        }
        com.google.android.material.carousel.a a2 = com.google.android.material.carousel.a.a(f3, clamp, f6, max, iArr2, f7, iArr, min, iArr6);
        int i22 = a2.c;
        int i23 = a2.g;
        lVar.c = i22 + a2.d + i23;
        int itemCount = getItemCount();
        int i24 = a2.c;
        int i25 = a2.d;
        int i26 = ((i24 + i25) + i23) - itemCount;
        boolean z2 = i26 > 0 && (i24 > 0 || i25 > i);
        while (i26 > 0) {
            int i27 = a2.c;
            if (i27 > 0) {
                a2.c = i27 - 1;
            } else {
                int i28 = a2.d;
                if (i28 > 1) {
                    a2.d = i28 - 1;
                }
            }
            i26--;
        }
        if (z2) {
            a2 = com.google.android.material.carousel.a.a(f3, clamp, f6, max, new int[]{a2.c}, f7, new int[]{a2.d}, min, new int[]{i23});
        }
        Context context = viewForPosition.getContext();
        if (this.n == 1) {
            float min2 = Math.min(context.getResources().getDimension(R.dimen.m3_carousel_gone_size) + f5, a2.f);
            float f10 = min2 / f;
            float f11 = 0.0f - f10;
            float b2 = h.b(0.0f, a2.b, a2.c);
            float c2 = h.c(0.0f, h.a(b2, a2.b, (int) Math.floor(a2.c / f)), a2.b, a2.c);
            float b3 = h.b(c2, a2.e, a2.d);
            float c3 = h.c(c2, h.a(b3, a2.e, (int) Math.floor(a2.d / f)), a2.e, a2.d);
            float f12 = a2.f;
            int i29 = a2.g;
            float b4 = h.b(c3, f12, i29);
            float c4 = h.c(c3, h.a(b4, a2.f, i29), a2.f, i29);
            float b5 = h.b(c4, a2.e, a2.d);
            float b6 = h.b(h.c(c4, h.a(b5, a2.e, (int) Math.ceil(a2.d / f)), a2.e, a2.d), a2.b, a2.c);
            float f13 = f10 + f3;
            float a3 = g.a(min2, a2.f, f5);
            float a4 = g.a(a2.b, a2.f, f5);
            float a5 = g.a(a2.e, a2.f, f5);
            i.a aVar = new i.a(a2.f, f3);
            aVar.a(f11, a3, min2, false, true);
            if (a2.c > 0) {
                aVar.c(b2, a4, a2.b, (int) Math.floor(r8 / f), false);
            }
            if (a2.d > 0) {
                aVar.c(b3, a5, a2.e, (int) Math.floor(r8 / f), false);
            }
            aVar.c(b4, 0.0f, a2.f, a2.g, true);
            if (a2.d > 0) {
                aVar.c(b5, a5, a2.e, (int) Math.ceil(r8 / f), false);
            }
            if (a2.c > 0) {
                aVar.c(b6, a4, a2.b, (int) Math.ceil(r4 / f), false);
            }
            aVar.a(f13, a3, min2, false, true);
            d2 = aVar.d();
        } else {
            float min3 = Math.min(context.getResources().getDimension(R.dimen.m3_carousel_gone_size) + f5, a2.f);
            float f14 = min3 / f;
            float f15 = 0.0f - f14;
            float f16 = a2.f;
            int i30 = a2.g;
            float b7 = h.b(0.0f, f16, i30);
            float c5 = h.c(0.0f, h.a(b7, a2.f, i30), a2.f, i30);
            float b8 = h.b(c5, a2.e, a2.d);
            float b9 = h.b(h.c(c5, b8, a2.e, a2.d), a2.b, a2.c);
            float f17 = f14 + f3;
            float a6 = g.a(min3, a2.f, f5);
            float a7 = g.a(a2.b, a2.f, f5);
            float a8 = g.a(a2.e, a2.f, f5);
            i.a aVar2 = new i.a(a2.f, f3);
            aVar2.a(f15, a6, min3, false, true);
            aVar2.c(b7, 0.0f, a2.f, a2.g, true);
            if (a2.d > 0) {
                aVar2.a(b8, a8, a2.e, false, false);
            }
            int i31 = a2.c;
            if (i31 > 0) {
                aVar2.c(b9, a7, a2.b, i31, false);
            }
            aVar2.a(f17, a6, min3, false, true);
            d2 = aVar2.d();
        }
        if (n()) {
            float h = h();
            i.a aVar3 = new i.a(d2.a, h);
            float f18 = (h - d2.d().b) - (d2.d().d / f);
            List<i.b> list2 = d2.b;
            int size2 = list2.size() - 1;
            while (size2 >= 0) {
                i.b bVar3 = list2.get(size2);
                float f19 = bVar3.d;
                aVar3.a((f19 / f) + f18, bVar3.c, f19, size2 >= d2.c && size2 <= d2.d, bVar3.e);
                f18 += bVar3.d;
                size2--;
            }
            d2 = aVar3.d();
        }
        i iVar2 = d2;
        List<i.b> list3 = iVar2.b;
        if (getChildCount() > 0) {
            RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) getChildAt(0).getLayoutParams();
            if (this.j.a == 0) {
                i10 = ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin;
                i11 = ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
            } else {
                i10 = ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
                i11 = ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
            }
            i2 = i11 + i10;
        } else {
            i2 = 0;
        }
        float f20 = i2;
        if (getClipToPadding()) {
            i3 = 0;
        } else {
            this.e.getClass();
            i3 = this.j.a == 1 ? getPaddingTop() : getPaddingLeft();
        }
        float f21 = i3;
        if (getClipToPadding()) {
            i4 = 0;
        } else {
            this.e.getClass();
            i4 = this.j.a == 1 ? getPaddingBottom() : getPaddingRight();
        }
        float f22 = i4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(iVar2);
        int i32 = 0;
        while (true) {
            i5 = iVar2.d;
            i6 = iVar2.c;
            if (i32 >= list3.size()) {
                i32 = -1;
                break;
            } else if (!list3.get(i32).e) {
                break;
            } else {
                i32++;
            }
        }
        float width = m() ? getWidth() : getHeight();
        if (iVar2.a().b - (iVar2.a().d / f) >= 0.0f) {
            i.b a9 = iVar2.a();
            f2 = 0.0f;
            int i33 = 0;
            while (true) {
                if (i33 >= list3.size()) {
                    bVar2 = null;
                    break;
                }
                bVar2 = list3.get(i33);
                if (!bVar2.e) {
                    break;
                } else {
                    i33++;
                }
            }
            if (a9 == bVar2) {
                if (f21 > f2) {
                    arrayList.add(j.f(iVar2, f21, width, true, f20));
                }
                i7 = i6;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(iVar2);
                size = list3.size() - 1;
                while (true) {
                    if (size < 0) {
                        size = -1;
                        break;
                    } else if (!list3.get(size).e) {
                        break;
                    } else {
                        size--;
                    }
                }
                float width2 = m() ? getWidth() : getHeight();
                height = getHeight();
                if (m()) {
                    height = getWidth();
                }
                if ((iVar2.c().d / f) + iVar2.c().b <= height) {
                    i.b c6 = iVar2.c();
                    int size3 = list3.size() - 1;
                    while (true) {
                        if (size3 < 0) {
                            bVar = null;
                            break;
                        }
                        bVar = list3.get(size3);
                        if (!bVar.e) {
                            break;
                        } else {
                            size3--;
                        }
                    }
                }
                if (size != -1) {
                    int i34 = size - i5;
                    float f23 = iVar2.b().b - (iVar2.b().d / f);
                    if (i34 > 0 || iVar2.c().f <= f2) {
                        float f24 = f2;
                        int i35 = 0;
                        while (i35 < i34) {
                            i iVar3 = (i) androidx.constraintlayout.motion.widget.a.a(1, arrayList2);
                            int i36 = i34;
                            int i37 = size - i35;
                            f24 += list3.get(i37).f;
                            int i38 = i37 + 1;
                            float f25 = f23;
                            if (i38 < list3.size()) {
                                float f26 = list3.get(i38).c;
                                int i39 = iVar3.c - 1;
                                while (true) {
                                    if (i39 < 0) {
                                        list = list3;
                                        i39 = 0;
                                        break;
                                    } else {
                                        list = list3;
                                        if (f26 == iVar3.b.get(i39).c) {
                                            break;
                                        }
                                        i39--;
                                        list3 = list;
                                    }
                                }
                                i9 = i39 + 1;
                            } else {
                                list = list3;
                                i9 = 0;
                            }
                            int i40 = size;
                            i e = j.e(iVar3, i40, i9, f25 - f24, i7 + i35 + 1, i5 + i35 + 1, width2);
                            if (i35 == i36 - 1 && f22 > f2) {
                                e = j.f(e, f22, width2, false, f20);
                            }
                            arrayList2.add(e);
                            i35++;
                            i34 = i36;
                            size = i40;
                            f23 = f25;
                            list3 = list;
                        }
                    } else {
                        arrayList2.add(j.e(iVar2, 0, 0, f23 - iVar2.c().f, iVar2.c, iVar2.d, width2));
                    }
                    this.f = new j(iVar2, arrayList, arrayList2);
                }
                if (f22 > f2) {
                    arrayList2.add(j.f(iVar2, f22, width2, false, f20));
                }
                this.f = new j(iVar2, arrayList, arrayList2);
            }
        } else {
            f2 = 0.0f;
        }
        if (i32 != -1) {
            int i41 = i6 - i32;
            float f27 = iVar2.b().b - (iVar2.b().d / f);
            if (i41 > 0 || iVar2.a().f <= f2) {
                i7 = i6;
                float f28 = f2;
                int i42 = 0;
                while (i42 < i41) {
                    i iVar4 = (i) androidx.constraintlayout.motion.widget.a.a(1, arrayList);
                    int i43 = i32;
                    int i44 = i43 + i42;
                    int size4 = list3.size() - 1;
                    f28 += list3.get(i44).f;
                    int i45 = i44 - 1;
                    if (i45 >= 0) {
                        float f29 = list3.get(i45).c;
                        int i46 = iVar4.d;
                        List<i.b> list4 = iVar4.b;
                        iVar = iVar4;
                        i8 = i41;
                        int i47 = i46;
                        while (true) {
                            if (i47 >= list4.size()) {
                                z = true;
                                i47 = list4.size() - 1;
                                break;
                            } else {
                                if (f29 == list4.get(i47).c) {
                                    z = true;
                                    break;
                                }
                                i47++;
                            }
                        }
                        size4 = i47 - 1;
                    } else {
                        iVar = iVar4;
                        i8 = i41;
                        z = true;
                    }
                    i e2 = j.e(iVar, i43, size4, f27 + f28, (i7 - i42) - 1, (i5 - i42) - 1, width);
                    if (i42 == i8 - 1 && f21 > f2) {
                        e2 = j.f(e2, f21, width, z, f20);
                    }
                    arrayList.add(e2);
                    i42++;
                    i32 = i43;
                    i41 = i8;
                }
            } else {
                i7 = i6;
                arrayList.add(j.e(iVar2, 0, 0, f27 + iVar2.a().f, iVar2.c, iVar2.d, width));
            }
            ArrayList arrayList22 = new ArrayList();
            arrayList22.add(iVar2);
            size = list3.size() - 1;
            while (true) {
                if (size < 0) {
                }
                size--;
            }
            float width22 = m() ? getWidth() : getHeight();
            height = getHeight();
            if (m()) {
            }
            if ((iVar2.c().d / f) + iVar2.c().b <= height) {
            }
            if (size != -1) {
            }
            if (f22 > f2) {
            }
            this.f = new j(iVar2, arrayList, arrayList22);
        }
        if (f21 > f2) {
        }
        i7 = i6;
        ArrayList arrayList222 = new ArrayList();
        arrayList222.add(iVar2);
        size = list3.size() - 1;
        while (true) {
            if (size < 0) {
            }
            size--;
        }
        float width222 = m() ? getWidth() : getHeight();
        height = getHeight();
        if (m()) {
        }
        if ((iVar2.c().d / f) + iVar2.c().b <= height) {
        }
        if (size != -1) {
        }
        if (f22 > f2) {
        }
        this.f = new j(iVar2, arrayList, arrayList222);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z, boolean z2) {
        int k;
        if (this.f == null || (k = k(getPosition(view), i(getPosition(view)))) == 0) {
            return false;
        }
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = i + k;
        if (i4 < i2) {
            k = i2 - i;
        } else if (i4 > i3) {
            k = i3 - i;
        }
        int k2 = k(getPosition(view), this.f.b(i + k, i2, i3));
        if (m()) {
            recyclerView.scrollBy(k2, 0);
            return true;
        }
        recyclerView.scrollBy(0, k2);
        return true;
    }

    public final void s() {
        this.f = null;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (m()) {
            return t(i, recycler, state);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void scrollToPosition(int i) {
        this.m = i;
        if (this.f == null) {
            return;
        }
        this.a = j(i, i(i));
        this.h = MathUtils.clamp(i, 0, Math.max(0, getItemCount() - 1));
        v(this.f);
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (canScrollVertically()) {
            return t(i, recycler, state);
        }
        return 0;
    }

    public final void setOrientation(int i) {
        f eVar;
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(i, "invalid orientation:"));
        }
        assertNotInLayoutOrScroll(null);
        f fVar = this.j;
        if (fVar == null || i != fVar.a) {
            if (i == 0) {
                eVar = new e(this);
            } else {
                if (i != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                eVar = new com.google.android.material.carousel.d(this);
            }
            this.j = eVar;
            s();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        a aVar = new a(recyclerView.getContext());
        aVar.setTargetPosition(i);
        startSmoothScroll(aVar);
    }

    public final int t(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        if (this.f == null) {
            r(recycler);
        }
        int i2 = this.a;
        int i3 = this.b;
        int i4 = this.c;
        int i5 = i2 + i;
        if (i5 < i3) {
            i = i3 - i2;
        } else if (i5 > i4) {
            i = i4 - i2;
        }
        this.a = i2 + i;
        v(this.f);
        float f = this.g.a / 2.0f;
        float f2 = f(getPosition(getChildAt(0)));
        Rect rect = new Rect();
        float f3 = n() ? this.g.c().b : this.g.a().b;
        float f4 = Float.MAX_VALUE;
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            View childAt = getChildAt(i6);
            float b2 = b(f2, f);
            d l = l(this.g.b, b2, false);
            float e = e(childAt, b2, l);
            super.getDecoratedBoundsWithMargins(childAt, rect);
            u(childAt, b2, l);
            this.j.l(childAt, rect, f, e);
            float abs = Math.abs(f3 - e);
            if (abs < f4) {
                this.m = getPosition(childAt);
                f4 = abs;
            }
            f2 = b(f2, this.g.a);
        }
        g(recycler, state);
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u(View view, float f, d dVar) {
        if (view instanceof k) {
            i.b bVar = dVar.a;
            float f2 = bVar.c;
            i.b bVar2 = dVar.b;
            float b2 = com.google.android.material.animation.a.b(f2, bVar2.c, bVar.a, bVar2.a, f);
            float height = view.getHeight();
            float width = view.getWidth();
            RectF c2 = this.j.c(height, width, com.google.android.material.animation.a.b(0.0f, height / 2.0f, 0.0f, 1.0f, b2), com.google.android.material.animation.a.b(0.0f, width / 2.0f, 0.0f, 1.0f, b2));
            float e = e(view, f, dVar);
            RectF rectF = new RectF(e - (c2.width() / 2.0f), e - (c2.height() / 2.0f), (c2.width() / 2.0f) + e, (c2.height() / 2.0f) + e);
            RectF rectF2 = new RectF(this.j.f(), this.j.i(), this.j.g(), this.j.d());
            this.e.getClass();
            this.j.a(c2, rectF, rectF2);
            this.j.k(c2, rectF, rectF2);
            ((k) view).a();
        }
    }

    public final void v(@NonNull j jVar) {
        int i = this.c;
        int i2 = this.b;
        if (i <= i2) {
            this.g = n() ? jVar.a() : jVar.c();
        } else {
            this.g = jVar.b(this.a, i2, i);
        }
        List<i.b> list = this.g.b;
        c cVar = this.d;
        cVar.getClass();
        cVar.b = Collections.unmodifiableList(list);
    }

    public final void w() {
        int itemCount = getItemCount();
        int i = this.l;
        if (itemCount == i || this.f == null) {
            return;
        }
        l lVar = this.e;
        if ((i < lVar.c && getItemCount() >= lVar.c) || (i >= lVar.c && getItemCount() < lVar.c)) {
            s();
        }
        this.l = itemCount;
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.d = new c();
        this.h = 0;
        this.k = new View.OnLayoutChangeListener() { // from class: com.google.android.material.carousel.c
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i22, int i32, int i4, int i5, int i6, int i7, int i8) {
                if (i3 == i5 && i22 == i6 && i32 == i7 && i4 == i8) {
                    return;
                }
                view.post(new androidx.core.widget.b(CarouselLayoutManager.this, 4));
            }
        };
        this.m = -1;
        this.n = 0;
        this.e = new l();
        s();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.material.a.c);
            this.n = obtainStyledAttributes.getInt(0, 0);
            s();
            setOrientation(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
        }
    }
}
