package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class l implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    static final ThreadLocal<l> f44975e = new ThreadLocal<>();

    /* renamed from: f, reason: collision with root package name */
    static Comparator<c> f44976f = new a();

    /* renamed from: b, reason: collision with root package name */
    long f44978b;

    /* renamed from: c, reason: collision with root package name */
    long f44979c;

    /* renamed from: a, reason: collision with root package name */
    ArrayList<RecyclerView> f44977a = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    private ArrayList<c> f44980d = new ArrayList<>();

    static class a implements Comparator<c> {
        @Override // java.util.Comparator
        public final int compare(c cVar, c cVar2) {
            c cVar3 = cVar;
            c cVar4 = cVar2;
            RecyclerView recyclerView = cVar3.f44988d;
            if ((recyclerView == null) == (cVar4.f44988d == null)) {
                boolean z11 = cVar3.f44985a;
                if (z11 == cVar4.f44985a) {
                    int i11 = cVar4.f44986b - cVar3.f44986b;
                    if (i11 != 0) {
                        return i11;
                    }
                    int i12 = cVar3.f44987c - cVar4.f44987c;
                    if (i12 != 0) {
                        return i12;
                    }
                    return 0;
                }
                if (z11) {
                    return -1;
                }
            } else if (recyclerView != null) {
                return -1;
            }
            return 1;
        }
    }

    @SuppressLint({"VisibleForTests"})
    static class b implements RecyclerView.o.c {

        /* renamed from: a, reason: collision with root package name */
        int f44981a;

        /* renamed from: b, reason: collision with root package name */
        int f44982b;

        /* renamed from: c, reason: collision with root package name */
        int[] f44983c;

        /* renamed from: d, reason: collision with root package name */
        int f44984d;

        @Override // androidx.recyclerview.widget.RecyclerView.o.c
        public final void a(int i11, int i12) {
            if (i11 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i12 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i13 = this.f44984d;
            int i14 = i13 * 2;
            int[] iArr = this.f44983c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f44983c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i14 >= iArr.length) {
                int[] iArr3 = new int[i13 * 4];
                this.f44983c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f44983c;
            iArr4[i14] = i11;
            iArr4[i14 + 1] = i12;
            this.f44984d++;
        }

        final void b(RecyclerView recyclerView, boolean z11) {
            this.f44984d = 0;
            int[] iArr = this.f44983c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.o oVar = recyclerView.mLayout;
            if (recyclerView.mAdapter == null || oVar == null || !oVar.isItemPrefetchEnabled()) {
                return;
            }
            if (z11) {
                if (!recyclerView.mAdapterHelper.h()) {
                    oVar.collectInitialPrefetchPositions(recyclerView.mAdapter.getItemCount(), this);
                }
            } else if (!recyclerView.hasPendingAdapterUpdates()) {
                oVar.collectAdjacentPrefetchPositions(this.f44981a, this.f44982b, recyclerView.mState, this);
            }
            int i11 = this.f44984d;
            if (i11 > oVar.mPrefetchMaxCountObserved) {
                oVar.mPrefetchMaxCountObserved = i11;
                oVar.mPrefetchMaxObservedInInitialPrefetch = z11;
                recyclerView.mRecycler.r();
            }
        }
    }

    /* loaded from: classes8.dex */
    static class c {

        /* renamed from: a, reason: collision with root package name */
        public boolean f44985a;

        /* renamed from: b, reason: collision with root package name */
        public int f44986b;

        /* renamed from: c, reason: collision with root package name */
        public int f44987c;

        /* renamed from: d, reason: collision with root package name */
        public RecyclerView f44988d;

        /* renamed from: e, reason: collision with root package name */
        public int f44989e;

        c() {
        }

        public final void a() {
            this.f44985a = false;
            this.f44986b = 0;
            this.f44987c = 0;
            this.f44988d = null;
            this.f44989e = 0;
        }
    }

    l() {
    }

    private static RecyclerView.C c(RecyclerView recyclerView, int i11, long j11) {
        int h11 = recyclerView.mChildHelper.h();
        for (int i12 = 0; i12 < h11; i12++) {
            RecyclerView.C childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.g(i12));
            if (childViewHolderInt.mPosition == i11 && !childViewHolderInt.isInvalid()) {
                return null;
            }
        }
        RecyclerView.v vVar = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView.C p11 = vVar.p(i11, j11);
            if (p11 != null) {
                if (!p11.isBound() || p11.isInvalid()) {
                    vVar.a(p11, false);
                } else {
                    vVar.k(p11.itemView);
                }
            }
            recyclerView.onExitLayoutOrScroll(false);
            return p11;
        } catch (Throwable th2) {
            recyclerView.onExitLayoutOrScroll(false);
            throw th2;
        }
    }

    final void a(RecyclerView recyclerView, int i11, int i12) {
        if (recyclerView.isAttachedToWindow() && this.f44978b == 0) {
            this.f44978b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        b bVar = recyclerView.mPrefetchRegistry;
        bVar.f44981a = i11;
        bVar.f44982b = i12;
    }

    final void b(long j11) {
        c cVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        c cVar2;
        ArrayList<RecyclerView> arrayList = this.f44977a;
        int size = arrayList.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView recyclerView3 = arrayList.get(i12);
            if (recyclerView3.getWindowVisibility() == 0) {
                recyclerView3.mPrefetchRegistry.b(recyclerView3, false);
                i11 += recyclerView3.mPrefetchRegistry.f44984d;
            }
        }
        ArrayList<c> arrayList2 = this.f44980d;
        arrayList2.ensureCapacity(i11);
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            RecyclerView recyclerView4 = arrayList.get(i14);
            if (recyclerView4.getWindowVisibility() == 0) {
                b bVar = recyclerView4.mPrefetchRegistry;
                int abs = Math.abs(bVar.f44982b) + Math.abs(bVar.f44981a);
                for (int i15 = 0; i15 < bVar.f44984d * 2; i15 += 2) {
                    if (i13 >= arrayList2.size()) {
                        cVar2 = new c();
                        arrayList2.add(cVar2);
                    } else {
                        cVar2 = arrayList2.get(i13);
                    }
                    int[] iArr = bVar.f44983c;
                    int i16 = iArr[i15 + 1];
                    cVar2.f44985a = i16 <= abs;
                    cVar2.f44986b = abs;
                    cVar2.f44987c = i16;
                    cVar2.f44988d = recyclerView4;
                    cVar2.f44989e = iArr[i15];
                    i13++;
                }
            }
        }
        Collections.sort(arrayList2, f44976f);
        for (int i17 = 0; i17 < arrayList2.size() && (recyclerView = (cVar = arrayList2.get(i17)).f44988d) != null; i17++) {
            RecyclerView.C c11 = c(recyclerView, cVar.f44989e, cVar.f44985a ? Long.MAX_VALUE : j11);
            if (c11 != null && c11.mNestedRecyclerView != null && c11.isBound() && !c11.isInvalid() && (recyclerView2 = c11.mNestedRecyclerView.get()) != null) {
                if (recyclerView2.mDataSetHasChangedAfterLayout && recyclerView2.mChildHelper.h() != 0) {
                    recyclerView2.removeAndRecycleViews();
                }
                b bVar2 = recyclerView2.mPrefetchRegistry;
                bVar2.b(recyclerView2, true);
                if (bVar2.f44984d != 0) {
                    RecyclerView.A a11 = recyclerView2.mState;
                    RecyclerView.g gVar = recyclerView2.mAdapter;
                    a11.f44715d = 1;
                    a11.f44716e = gVar.getItemCount();
                    a11.f44718g = false;
                    a11.f44719h = false;
                    a11.f44720i = false;
                    for (int i18 = 0; i18 < bVar2.f44984d * 2; i18 += 2) {
                        c(recyclerView2, bVar2.f44983c[i18], j11);
                    }
                }
            }
            cVar.a();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList<RecyclerView> arrayList = this.f44977a;
        try {
            if (arrayList.isEmpty()) {
                return;
            }
            int size = arrayList.size();
            long j11 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                RecyclerView recyclerView = arrayList.get(i11);
                if (recyclerView.getWindowVisibility() == 0) {
                    j11 = Math.max(recyclerView.getDrawingTime(), j11);
                }
            }
            if (j11 == 0) {
                return;
            }
            b(TimeUnit.MILLISECONDS.toNanos(j11) + this.f44979c);
        } finally {
            this.f44978b = 0L;
        }
    }
}
