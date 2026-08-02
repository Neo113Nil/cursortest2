package androidx.recyclerview.widget;

import Am.C2438a;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import y2.q;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: a, reason: collision with root package name */
    boolean f44678a;

    /* renamed from: b, reason: collision with root package name */
    int f44679b;

    /* renamed from: c, reason: collision with root package name */
    int[] f44680c;

    /* renamed from: d, reason: collision with root package name */
    View[] f44681d;

    /* renamed from: e, reason: collision with root package name */
    final SparseIntArray f44682e;

    /* renamed from: f, reason: collision with root package name */
    final SparseIntArray f44683f;

    /* renamed from: g, reason: collision with root package name */
    c f44684g;

    /* renamed from: h, reason: collision with root package name */
    final Rect f44685h;

    public static final class a extends c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int getSpanIndex(int i11, int i12) {
            return i11 % i12;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int getSpanSize(int i11) {
            return 1;
        }
    }

    public static class b extends RecyclerView.p {

        /* renamed from: e, reason: collision with root package name */
        int f44686e;

        /* renamed from: f, reason: collision with root package name */
        int f44687f;

        public b(int i11, int i12) {
            super(i11, i12);
            this.f44686e = -1;
            this.f44687f = 0;
        }

        public final int c() {
            return this.f44686e;
        }

        public final int d() {
            return this.f44687f;
        }
    }

    public static abstract class c {
        final SparseIntArray mSpanIndexCache = new SparseIntArray();
        final SparseIntArray mSpanGroupIndexCache = new SparseIntArray();
        private boolean mCacheSpanIndices = false;
        private boolean mCacheSpanGroupIndices = false;

        static int findFirstKeyLessThan(SparseIntArray sparseIntArray, int i11) {
            int size = sparseIntArray.size() - 1;
            int i12 = 0;
            while (i12 <= size) {
                int i13 = (i12 + size) >>> 1;
                if (sparseIntArray.keyAt(i13) < i11) {
                    i12 = i13 + 1;
                } else {
                    size = i13 - 1;
                }
            }
            int i14 = i12 - 1;
            if (i14 < 0 || i14 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i14);
        }

        int getCachedSpanGroupIndex(int i11, int i12) {
            if (!this.mCacheSpanGroupIndices) {
                return getSpanGroupIndex(i11, i12);
            }
            int i13 = this.mSpanGroupIndexCache.get(i11, -1);
            if (i13 != -1) {
                return i13;
            }
            int spanGroupIndex = getSpanGroupIndex(i11, i12);
            this.mSpanGroupIndexCache.put(i11, spanGroupIndex);
            return spanGroupIndex;
        }

        int getCachedSpanIndex(int i11, int i12) {
            if (!this.mCacheSpanIndices) {
                return getSpanIndex(i11, i12);
            }
            int i13 = this.mSpanIndexCache.get(i11, -1);
            if (i13 != -1) {
                return i13;
            }
            int spanIndex = getSpanIndex(i11, i12);
            this.mSpanIndexCache.put(i11, spanIndex);
            return spanIndex;
        }

        public int getSpanGroupIndex(int i11, int i12) {
            int i13;
            int i14;
            int i15;
            int findFirstKeyLessThan;
            if (!this.mCacheSpanGroupIndices || (findFirstKeyLessThan = findFirstKeyLessThan(this.mSpanGroupIndexCache, i11)) == -1) {
                i13 = 0;
                i14 = 0;
                i15 = 0;
            } else {
                i14 = this.mSpanGroupIndexCache.get(findFirstKeyLessThan);
                i15 = findFirstKeyLessThan + 1;
                i13 = getSpanSize(findFirstKeyLessThan) + getCachedSpanIndex(findFirstKeyLessThan, i12);
                if (i13 == i12) {
                    i14++;
                    i13 = 0;
                }
            }
            int spanSize = getSpanSize(i11);
            while (i15 < i11) {
                int spanSize2 = getSpanSize(i15);
                i13 += spanSize2;
                if (i13 == i12) {
                    i14++;
                    i13 = 0;
                } else if (i13 > i12) {
                    i14++;
                    i13 = spanSize2;
                }
                i15++;
            }
            return i13 + spanSize > i12 ? i14 + 1 : i14;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x002b -> B:10:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002d -> B:10:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x002f -> B:10:0x0030). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int getSpanIndex(int i11, int i12) {
            int i13;
            int i14;
            int spanSize = getSpanSize(i11);
            if (spanSize == i12) {
                return 0;
            }
            if (!this.mCacheSpanIndices || (i13 = findFirstKeyLessThan(this.mSpanIndexCache, i11)) < 0) {
                i13 = 0;
                i14 = 0;
                if (i13 >= i11) {
                    int spanSize2 = getSpanSize(i13);
                    i14 += spanSize2;
                    if (i14 == i12) {
                        i14 = 0;
                    } else if (i14 > i12) {
                        i14 = spanSize2;
                    }
                    i13++;
                    if (i13 >= i11) {
                        if (spanSize + i14 <= i12) {
                            return i14;
                        }
                        return 0;
                    }
                }
            } else {
                i14 = getSpanSize(i13) + this.mSpanIndexCache.get(i13);
                i13++;
                if (i13 >= i11) {
                }
            }
        }

        public abstract int getSpanSize(int i11);

        public void invalidateSpanGroupIndexCache() {
            this.mSpanGroupIndexCache.clear();
        }

        public void invalidateSpanIndexCache() {
            this.mSpanIndexCache.clear();
        }

        public void setSpanGroupIndexCacheEnabled(boolean z11) {
            if (!z11) {
                this.mSpanGroupIndexCache.clear();
            }
            this.mCacheSpanGroupIndices = z11;
        }

        public void setSpanIndexCacheEnabled(boolean z11) {
            if (!z11) {
                this.mSpanGroupIndexCache.clear();
            }
            this.mCacheSpanIndices = z11;
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        this.f44678a = false;
        this.f44679b = -1;
        this.f44682e = new SparseIntArray();
        this.f44683f = new SparseIntArray();
        this.f44684g = new a();
        this.f44685h = new Rect();
        m(RecyclerView.o.getProperties(context, attributeSet, i11, i12).f44744b);
    }

    private void d(int i11) {
        int i12;
        int[] iArr = this.f44680c;
        int i13 = this.f44679b;
        if (iArr == null || iArr.length != i13 + 1 || iArr[iArr.length - 1] != i11) {
            iArr = new int[i13 + 1];
        }
        int i14 = 0;
        iArr[0] = 0;
        int i15 = i11 / i13;
        int i16 = i11 % i13;
        int i17 = 0;
        for (int i18 = 1; i18 <= i13; i18++) {
            i14 += i16;
            if (i14 <= 0 || i13 - i14 >= i16) {
                i12 = i15;
            } else {
                i12 = i15 + 1;
                i14 -= i13;
            }
            i17 += i12;
            iArr[i18] = i17;
        }
        this.f44680c = iArr;
    }

    private void e() {
        View[] viewArr = this.f44681d;
        if (viewArr == null || viewArr.length != this.f44679b) {
            this.f44681d = new View[this.f44679b];
        }
    }

    private int h(int i11, RecyclerView.v vVar, RecyclerView.A a11) {
        if (!a11.f44718g) {
            return this.f44684g.getCachedSpanGroupIndex(i11, this.f44679b);
        }
        int d11 = vVar.d(i11);
        if (d11 != -1) {
            return this.f44684g.getCachedSpanGroupIndex(d11, this.f44679b);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i11);
        return 0;
    }

    private int i(int i11, RecyclerView.v vVar, RecyclerView.A a11) {
        if (!a11.f44718g) {
            return this.f44684g.getCachedSpanIndex(i11, this.f44679b);
        }
        int i12 = this.f44683f.get(i11, -1);
        if (i12 != -1) {
            return i12;
        }
        int d11 = vVar.d(i11);
        if (d11 != -1) {
            return this.f44684g.getCachedSpanIndex(d11, this.f44679b);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i11);
        return 0;
    }

    private int j(int i11, RecyclerView.v vVar, RecyclerView.A a11) {
        if (!a11.f44718g) {
            return this.f44684g.getSpanSize(i11);
        }
        int i12 = this.f44682e.get(i11, -1);
        if (i12 != -1) {
            return i12;
        }
        int d11 = vVar.d(i11);
        if (d11 != -1) {
            return this.f44684g.getSpanSize(d11);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i11);
        return 1;
    }

    private void l(View view, int i11, boolean z11) {
        int i12;
        int i13;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f44748b;
        int i14 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i15 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int f7 = f(bVar.f44686e, bVar.f44687f);
        if (this.mOrientation == 1) {
            i13 = RecyclerView.o.getChildMeasureSpec(f7, i11, i15, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            i12 = RecyclerView.o.getChildMeasureSpec(this.mOrientationHelper.o(), getHeightMode(), i14, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int childMeasureSpec = RecyclerView.o.getChildMeasureSpec(f7, i11, i14, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int childMeasureSpec2 = RecyclerView.o.getChildMeasureSpec(this.mOrientationHelper.o(), getWidthMode(), i15, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            i12 = childMeasureSpec;
            i13 = childMeasureSpec2;
        }
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        if (z11 ? shouldReMeasureChild(view, i13, i12, pVar) : shouldMeasureChild(view, i13, i12, pVar)) {
            view.measure(i13, i12);
        }
    }

    private void o() {
        int height;
        int paddingTop;
        if (getOrientation() == 1) {
            height = getWidth() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        d(height - paddingTop);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean checkLayoutParams(RecyclerView.p pVar) {
        return pVar instanceof b;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    final void collectPrefetchPositionsForLayoutState(RecyclerView.A a11, LinearLayoutManager.c cVar, RecyclerView.o.c cVar2) {
        int i11;
        int i12 = this.f44679b;
        for (int i13 = 0; i13 < this.f44679b && (i11 = cVar.f44700d) >= 0 && i11 < a11.b() && i12 > 0; i13++) {
            int i14 = cVar.f44700d;
            cVar2.a(i14, Math.max(0, cVar.f44703g));
            i12 -= this.f44684g.getSpanSize(i14);
            cVar.f44700d += cVar.f44701e;
        }
    }

    final int f(int i11, int i12) {
        if (this.mOrientation != 1 || !isLayoutRTL()) {
            int[] iArr = this.f44680c;
            return iArr[i12 + i11] - iArr[i11];
        }
        int[] iArr2 = this.f44680c;
        int i13 = this.f44679b;
        return iArr2[i13 - i11] - iArr2[(i13 - i11) - i12];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    final View findReferenceChild(RecyclerView.v vVar, RecyclerView.A a11, int i11, int i12, int i13) {
        ensureLayoutState();
        int n11 = this.mOrientationHelper.n();
        int i14 = this.mOrientationHelper.i();
        int i15 = i12 > i11 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i11 != i12) {
            View childAt = getChildAt(i11);
            int position = getPosition(childAt);
            if (position >= 0 && position < i13 && i(position, vVar, a11) == 0) {
                if (((RecyclerView.p) childAt.getLayoutParams()).f44747a.isRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.mOrientationHelper.g(childAt) < i14 && this.mOrientationHelper.d(childAt) >= n11) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i11 += i15;
        }
        return view != null ? view : view2;
    }

    public final int g() {
        return this.f44679b;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final RecyclerView.p generateDefaultLayoutParams() {
        return this.mOrientation == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final RecyclerView.p generateLayoutParams(Context context, AttributeSet attributeSet) {
        b bVar = new b(context, attributeSet);
        bVar.f44686e = -1;
        bVar.f44687f = 0;
        return bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int getColumnCountForAccessibility(RecyclerView.v vVar, RecyclerView.A a11) {
        if (this.mOrientation == 1) {
            return this.f44679b;
        }
        if (a11.b() < 1) {
            return 0;
        }
        return h(a11.b() - 1, vVar, a11) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int getRowCountForAccessibility(RecyclerView.v vVar, RecyclerView.A a11) {
        if (this.mOrientation == 0) {
            return this.f44679b;
        }
        if (a11.b() < 1) {
            return 0;
        }
        return h(a11.b() - 1, vVar, a11) + 1;
    }

    public final c k() {
        return this.f44684g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x008c, code lost:
    
        r21.f44694b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008e, code lost:
    
        return;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void layoutChunk(RecyclerView.v vVar, RecyclerView.A a11, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int childMeasureSpec;
        int i18;
        boolean z11;
        int i19;
        View b11;
        int m11 = this.mOrientationHelper.m();
        boolean z12 = m11 != 1073741824;
        int i21 = getChildCount() > 0 ? this.f44680c[this.f44679b] : 0;
        if (z12) {
            o();
        }
        boolean z13 = cVar.f44701e == 1;
        int i22 = this.f44679b;
        if (!z13) {
            i22 = i(cVar.f44700d, vVar, a11) + j(cVar.f44700d, vVar, a11);
        }
        int i23 = 0;
        while (i23 < this.f44679b && (i19 = cVar.f44700d) >= 0 && i19 < a11.b() && i22 > 0) {
            int i24 = cVar.f44700d;
            int j11 = j(i24, vVar, a11);
            if (j11 > this.f44679b) {
                throw new IllegalArgumentException(K00.b.e(this.f44679b, " spans.", C2438a.a("Item at position ", i24, " requires ", " spans but GridLayoutManager has only ", j11)));
            }
            i22 -= j11;
            if (i22 < 0 || (b11 = cVar.b(vVar)) == null) {
                break;
            }
            this.f44681d[i23] = b11;
            i23++;
        }
        if (z13) {
            i13 = 1;
            i12 = i23;
            i11 = 0;
        } else {
            i11 = i23 - 1;
            i12 = -1;
            i13 = -1;
        }
        int i25 = 0;
        while (i11 != i12) {
            View view = this.f44681d[i11];
            b bVar2 = (b) view.getLayoutParams();
            int j12 = j(getPosition(view), vVar, a11);
            bVar2.f44687f = j12;
            bVar2.f44686e = i25;
            i25 += j12;
            i11 += i13;
        }
        float f7 = 0.0f;
        int i26 = 0;
        for (int i27 = 0; i27 < i23; i27++) {
            View view2 = this.f44681d[i27];
            if (cVar.f44707k != null) {
                z11 = false;
                if (z13) {
                    addDisappearingView(view2);
                } else {
                    addDisappearingView(view2, 0);
                }
            } else if (z13) {
                addView(view2);
                z11 = false;
            } else {
                z11 = false;
                addView(view2, 0);
            }
            calculateItemDecorationsForChild(view2, this.f44685h);
            l(view2, m11, z11);
            int e11 = this.mOrientationHelper.e(view2);
            if (e11 > i26) {
                i26 = e11;
            }
            float f11 = (this.mOrientationHelper.f(view2) * 1.0f) / ((b) view2.getLayoutParams()).f44687f;
            if (f11 > f7) {
                f7 = f11;
            }
        }
        if (z12) {
            d(Math.max(Math.round(f7 * this.f44679b), i21));
            i26 = 0;
            for (int i28 = 0; i28 < i23; i28++) {
                View view3 = this.f44681d[i28];
                l(view3, 1073741824, true);
                int e12 = this.mOrientationHelper.e(view3);
                if (e12 > i26) {
                    i26 = e12;
                }
            }
        }
        for (int i29 = 0; i29 < i23; i29++) {
            View view4 = this.f44681d[i29];
            if (this.mOrientationHelper.e(view4) != i26) {
                b bVar3 = (b) view4.getLayoutParams();
                Rect rect = bVar3.f44748b;
                int i31 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar3).topMargin + ((ViewGroup.MarginLayoutParams) bVar3).bottomMargin;
                int i32 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar3).leftMargin + ((ViewGroup.MarginLayoutParams) bVar3).rightMargin;
                int f12 = f(bVar3.f44686e, bVar3.f44687f);
                if (this.mOrientation == 1) {
                    i18 = RecyclerView.o.getChildMeasureSpec(f12, 1073741824, i32, ((ViewGroup.MarginLayoutParams) bVar3).width, false);
                    childMeasureSpec = View.MeasureSpec.makeMeasureSpec(i26 - i31, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i26 - i32, 1073741824);
                    childMeasureSpec = RecyclerView.o.getChildMeasureSpec(f12, 1073741824, i31, ((ViewGroup.MarginLayoutParams) bVar3).height, false);
                    i18 = makeMeasureSpec;
                }
                if (shouldReMeasureChild(view4, i18, childMeasureSpec, (RecyclerView.p) view4.getLayoutParams())) {
                    view4.measure(i18, childMeasureSpec);
                }
            }
        }
        bVar.f44693a = i26;
        if (this.mOrientation == 1) {
            if (cVar.f44702f == -1) {
                int i33 = cVar.f44698b;
                i17 = i33 - i26;
                i16 = i33;
            } else {
                i17 = cVar.f44698b;
                i16 = i17 + i26;
            }
            i15 = 0;
            i14 = 0;
        } else {
            if (cVar.f44702f == -1) {
                int i34 = cVar.f44698b;
                i15 = i34 - i26;
                i14 = i34;
            } else {
                int i35 = cVar.f44698b;
                i14 = i35 + i26;
                i15 = i35;
            }
            i16 = 0;
            i17 = 0;
        }
        for (int i36 = 0; i36 < i23; i36++) {
            View view5 = this.f44681d[i36];
            b bVar4 = (b) view5.getLayoutParams();
            if (this.mOrientation != 1) {
                i17 = getPaddingTop() + this.f44680c[bVar4.f44686e];
                i16 = this.mOrientationHelper.f(view5) + i17;
            } else if (isLayoutRTL()) {
                i14 = this.f44680c[this.f44679b - bVar4.f44686e] + getPaddingLeft();
                i15 = i14 - this.mOrientationHelper.f(view5);
            } else {
                i15 = getPaddingLeft() + this.f44680c[bVar4.f44686e];
                i14 = this.mOrientationHelper.f(view5) + i15;
            }
            int i37 = i16;
            int i38 = i14;
            int i39 = i17;
            layoutDecoratedWithMargins(view5, i15, i39, i38, i37);
            i17 = i39;
            i14 = i38;
            i16 = i37;
            if (bVar4.f44747a.isRemoved() || bVar4.f44747a.isUpdated()) {
                bVar.f44695c = true;
            }
            bVar.f44696d = view5.hasFocusable() | bVar.f44696d;
        }
        Arrays.fill(this.f44681d, (Object) null);
    }

    public final void m(int i11) {
        if (i11 == this.f44679b) {
            return;
        }
        this.f44678a = true;
        if (i11 < 1) {
            throw new IllegalArgumentException(Ej.b.a(i11, "Span count should be at least 1. Provided "));
        }
        this.f44679b = i11;
        this.f44684g.invalidateSpanIndexCache();
        requestLayout();
    }

    public final void n(c cVar) {
        this.f44684g = cVar;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    final void onAnchorReady(RecyclerView.v vVar, RecyclerView.A a11, LinearLayoutManager.a aVar, int i11) {
        super.onAnchorReady(vVar, a11, aVar, i11);
        o();
        if (a11.b() > 0 && !a11.f44718g) {
            boolean z11 = i11 == 1;
            int i12 = i(aVar.f44689b, vVar, a11);
            if (z11) {
                while (i12 > 0) {
                    int i13 = aVar.f44689b;
                    if (i13 <= 0) {
                        break;
                    }
                    int i14 = i13 - 1;
                    aVar.f44689b = i14;
                    i12 = i(i14, vVar, a11);
                }
            } else {
                int b11 = a11.b() - 1;
                int i15 = aVar.f44689b;
                while (i15 < b11) {
                    int i16 = i15 + 1;
                    int i17 = i(i16, vVar, a11);
                    if (i17 <= i12) {
                        break;
                    }
                    i15 = i16;
                    i12 = i17;
                }
                aVar.f44689b = i15;
            }
        }
        e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d3, code lost:
    
        if (r13 == (r2 > r15)) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f3, code lost:
    
        if (r13 == (r2 > r4)) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0111  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View onFocusSearchFailed(View view, int i11, RecyclerView.v vVar, RecyclerView.A a11) {
        int childCount;
        int i12;
        int i13;
        View view2;
        View view3;
        View view4;
        int i14;
        int i15;
        int i16;
        RecyclerView.v vVar2 = vVar;
        RecyclerView.A a12 = a11;
        View findContainingItemView = findContainingItemView(view);
        View view5 = null;
        if (findContainingItemView == null) {
            return null;
        }
        b bVar = (b) findContainingItemView.getLayoutParams();
        int i17 = bVar.f44686e;
        int i18 = bVar.f44687f + i17;
        if (super.onFocusSearchFailed(view, i11, vVar, a11) == null) {
            return null;
        }
        if ((convertFocusDirectionToLayoutDirection(i11) == 1) != this.mShouldReverseLayout) {
            i13 = getChildCount() - 1;
            childCount = -1;
            i12 = -1;
        } else {
            childCount = getChildCount();
            i12 = 1;
            i13 = 0;
        }
        boolean z11 = this.mOrientation == 1 && isLayoutRTL();
        int h11 = h(i13, vVar2, a12);
        int i19 = -1;
        int i21 = -1;
        int i22 = 0;
        int i23 = 0;
        int i24 = i13;
        View view6 = null;
        while (i24 != childCount) {
            int h12 = h(i24, vVar2, a12);
            View childAt = getChildAt(i24);
            if (childAt == findContainingItemView) {
                break;
            }
            if (!childAt.hasFocusable() || h12 == h11) {
                b bVar2 = (b) childAt.getLayoutParams();
                int i25 = bVar2.f44686e;
                view2 = findContainingItemView;
                int i26 = bVar2.f44687f + i25;
                if (childAt.hasFocusable() && i25 == i17 && i26 == i18) {
                    return childAt;
                }
                if (!(childAt.hasFocusable() && view5 == null) && (childAt.hasFocusable() || view6 != null)) {
                    view3 = view5;
                    int min = Math.min(i26, i18) - Math.max(i25, i17);
                    if (childAt.hasFocusable()) {
                        if (min <= i22) {
                            if (min == i22) {
                            }
                        }
                    } else if (view3 == null) {
                        view4 = view6;
                        i14 = i22;
                        if (isViewPartiallyVisible(childAt, false, true)) {
                            i15 = i23;
                            if (min > i15) {
                                i16 = i21;
                            } else {
                                if (min == i15) {
                                    i16 = i21;
                                } else {
                                    i16 = i21;
                                }
                                i21 = i16;
                                i23 = i15;
                                view6 = view4;
                                i22 = i14;
                                view5 = view3;
                                i24 += i12;
                                vVar2 = vVar;
                                a12 = a11;
                                findContainingItemView = view2;
                            }
                            if (childAt.hasFocusable()) {
                                int i27 = bVar2.f44686e;
                                i23 = Math.min(i26, i18) - Math.max(i25, i17);
                                view6 = childAt;
                                i21 = i27;
                                i22 = i14;
                                view5 = view3;
                                i24 += i12;
                                vVar2 = vVar;
                                a12 = a11;
                                findContainingItemView = view2;
                            } else {
                                i21 = i16;
                                i23 = i15;
                                i19 = bVar2.f44686e;
                                view6 = view4;
                                view5 = childAt;
                                i22 = Math.min(i26, i18) - Math.max(i25, i17);
                                i24 += i12;
                                vVar2 = vVar;
                                a12 = a11;
                                findContainingItemView = view2;
                            }
                        }
                        i16 = i21;
                        i15 = i23;
                        i21 = i16;
                        i23 = i15;
                        view6 = view4;
                        i22 = i14;
                        view5 = view3;
                        i24 += i12;
                        vVar2 = vVar;
                        a12 = a11;
                        findContainingItemView = view2;
                    }
                } else {
                    view3 = view5;
                }
                view4 = view6;
                i14 = i22;
                i16 = i21;
                i15 = i23;
                if (childAt.hasFocusable()) {
                }
            } else {
                if (view5 != null) {
                    break;
                }
                view2 = findContainingItemView;
                view3 = view5;
            }
            view4 = view6;
            i14 = i22;
            i16 = i21;
            i15 = i23;
            i21 = i16;
            i23 = i15;
            view6 = view4;
            i22 = i14;
            view5 = view3;
            i24 += i12;
            vVar2 = vVar;
            a12 = a11;
            findContainingItemView = view2;
        }
        View view7 = view5;
        return view7 != null ? view7 : view6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onInitializeAccessibilityNodeInfoForItem(RecyclerView.v vVar, RecyclerView.A a11, View view, y2.q qVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, qVar);
            return;
        }
        b bVar = (b) layoutParams;
        int h11 = h(bVar.f44747a.getLayoutPosition(), vVar, a11);
        if (this.mOrientation == 0) {
            qVar.N(q.f.f(bVar.f44686e, bVar.f44687f, h11, 1, false, false));
        } else {
            qVar.N(q.f.f(h11, 1, bVar.f44686e, bVar.f44687f, false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onItemsAdded(RecyclerView recyclerView, int i11, int i12) {
        this.f44684g.invalidateSpanIndexCache();
        this.f44684g.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onItemsChanged(RecyclerView recyclerView) {
        this.f44684g.invalidateSpanIndexCache();
        this.f44684g.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onItemsMoved(RecyclerView recyclerView, int i11, int i12, int i13) {
        this.f44684g.invalidateSpanIndexCache();
        this.f44684g.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onItemsRemoved(RecyclerView recyclerView, int i11, int i12) {
        this.f44684g.invalidateSpanIndexCache();
        this.f44684g.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onItemsUpdated(RecyclerView recyclerView, int i11, int i12, Object obj) {
        this.f44684g.invalidateSpanIndexCache();
        this.f44684g.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public void onLayoutChildren(RecyclerView.v vVar, RecyclerView.A a11) {
        boolean z11 = a11.f44718g;
        SparseIntArray sparseIntArray = this.f44683f;
        SparseIntArray sparseIntArray2 = this.f44682e;
        if (z11) {
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                b bVar = (b) getChildAt(i11).getLayoutParams();
                int layoutPosition = bVar.f44747a.getLayoutPosition();
                sparseIntArray2.put(layoutPosition, bVar.f44687f);
                sparseIntArray.put(layoutPosition, bVar.f44686e);
            }
        }
        super.onLayoutChildren(vVar, a11);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public void onLayoutCompleted(RecyclerView.A a11) {
        super.onLayoutCompleted(a11);
        this.f44678a = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final int scrollHorizontallyBy(int i11, RecyclerView.v vVar, RecyclerView.A a11) {
        o();
        e();
        return super.scrollHorizontallyBy(i11, vVar, a11);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int scrollVerticallyBy(int i11, RecyclerView.v vVar, RecyclerView.A a11) {
        o();
        e();
        return super.scrollVerticallyBy(i11, vVar, a11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void setMeasuredDimension(Rect rect, int i11, int i12) {
        int chooseSize;
        int chooseSize2;
        if (this.f44680c == null) {
            super.setMeasuredDimension(rect, i11, i12);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.mOrientation == 1) {
            chooseSize2 = RecyclerView.o.chooseSize(i12, rect.height() + paddingBottom, getMinimumHeight());
            int[] iArr = this.f44680c;
            chooseSize = RecyclerView.o.chooseSize(i11, iArr[iArr.length - 1] + paddingRight, getMinimumWidth());
        } else {
            chooseSize = RecyclerView.o.chooseSize(i11, rect.width() + paddingRight, getMinimumWidth());
            int[] iArr2 = this.f44680c;
            chooseSize2 = RecyclerView.o.chooseSize(i12, iArr2[iArr2.length - 1] + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(chooseSize, chooseSize2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void setStackFromEnd(boolean z11) {
        if (z11) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.setStackFromEnd(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && !this.f44678a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final RecyclerView.p generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            b bVar = new b((ViewGroup.MarginLayoutParams) layoutParams);
            bVar.f44686e = -1;
            bVar.f44687f = 0;
            return bVar;
        }
        b bVar2 = new b(layoutParams);
        bVar2.f44686e = -1;
        bVar2.f44687f = 0;
        return bVar2;
    }

    public GridLayoutManager(Context context, int i11) {
        super(context);
        this.f44678a = false;
        this.f44679b = -1;
        this.f44682e = new SparseIntArray();
        this.f44683f = new SparseIntArray();
        this.f44684g = new a();
        this.f44685h = new Rect();
        m(i11);
    }

    public GridLayoutManager(Context context, int i11, int i12) {
        super(context, i12, false);
        this.f44678a = false;
        this.f44679b = -1;
        this.f44682e = new SparseIntArray();
        this.f44683f = new SparseIntArray();
        this.f44684g = new a();
        this.f44685h = new Rect();
        m(i11);
    }
}
