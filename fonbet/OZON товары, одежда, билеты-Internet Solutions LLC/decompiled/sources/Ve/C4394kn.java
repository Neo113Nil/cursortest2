package Ve;

import android.text.TextUtils;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.kn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4394kn extends androidx.recyclerview.widget.s {

    /* renamed from: a, reason: collision with root package name */
    public final int f31457a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f31458b;

    /* renamed from: c, reason: collision with root package name */
    public int f31459c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f31460d;

    /* renamed from: e, reason: collision with root package name */
    public final float f31461e;

    /* renamed from: f, reason: collision with root package name */
    public final int f31462f;

    /* renamed from: g, reason: collision with root package name */
    public final float f31463g;

    /* renamed from: h, reason: collision with root package name */
    public androidx.recyclerview.widget.w f31464h;

    /* renamed from: i, reason: collision with root package name */
    public androidx.recyclerview.widget.w f31465i;

    /* renamed from: j, reason: collision with root package name */
    public final Jl f31466j;

    /* renamed from: k, reason: collision with root package name */
    public RecyclerView f31467k;

    /* renamed from: l, reason: collision with root package name */
    public final Km f31468l;

    public C4394kn(Jl snapListener) {
        Intrinsics.checkNotNullParameter(snapListener, "snapListener");
        this.f31461e = 100.0f;
        this.f31462f = -1;
        this.f31463g = -1.0f;
        this.f31468l = new Km(this);
        this.f31457a = 8388611;
        this.f31466j = snapListener;
    }

    public final View a(RecyclerView.o oVar, androidx.recyclerview.widget.w wVar, int i11, boolean z11) {
        View view = null;
        if (oVar.getChildCount() != 0 && (oVar instanceof LinearLayoutManager)) {
            boolean z12 = true;
            if (z11) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) oVar;
                boolean reverseLayout = linearLayoutManager.getReverseLayout();
                int i12 = this.f31457a;
                if (!reverseLayout) {
                }
            }
            int o11 = oVar.getClipToPadding() ? (wVar.o() / 2) + wVar.n() : wVar.h() / 2;
            boolean z13 = (i11 == 8388611 && !this.f31458b) || (i11 == 8388613 && this.f31458b);
            if ((i11 != 8388611 || !this.f31458b) && (i11 != 8388613 || this.f31458b)) {
                z12 = false;
            }
            int childCount = ((LinearLayoutManager) oVar).getChildCount();
            int i13 = Integer.MAX_VALUE;
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = oVar.getChildAt(i14);
                int abs = z13 ? Math.abs(wVar.g(childAt)) : z12 ? Math.abs(wVar.d(childAt) - wVar.h()) : Math.abs(((wVar.e(childAt) / 2) + wVar.g(childAt)) - o11);
                if (abs < i13) {
                    view = childAt;
                    i13 = abs;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.D
    public final void attachToRecyclerView(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f31467k;
        Km km = this.f31468l;
        if (recyclerView2 != null) {
            recyclerView2.removeOnScrollListener(km);
        }
        if (recyclerView != null) {
            recyclerView.setOnFlingListener(null);
            int i11 = this.f31457a;
            if (i11 == 8388611 || i11 == 8388613) {
                this.f31458b = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
            }
            recyclerView.addOnScrollListener(km);
            this.f31467k = recyclerView;
        } else {
            this.f31467k = null;
        }
        super.attachToRecyclerView(recyclerView);
    }

    public final View b(RecyclerView.o lm2, boolean z11) {
        View a11;
        Intrinsics.checkNotNullParameter(lm2, "lm");
        int i11 = this.f31457a;
        if (i11 != 17) {
            if (i11 == 48) {
                androidx.recyclerview.widget.w verticalHelper = getVerticalHelper(lm2);
                Intrinsics.f(verticalHelper);
                a11 = a(lm2, verticalHelper, 8388611, z11);
            } else if (i11 == 80) {
                androidx.recyclerview.widget.w verticalHelper2 = getVerticalHelper(lm2);
                Intrinsics.f(verticalHelper2);
                a11 = a(lm2, verticalHelper2, 8388613, z11);
            } else if (i11 == 8388611) {
                androidx.recyclerview.widget.w horizontalHelper = getHorizontalHelper(lm2);
                Intrinsics.f(horizontalHelper);
                a11 = a(lm2, horizontalHelper, 8388611, z11);
            } else if (i11 != 8388613) {
                a11 = null;
            } else {
                androidx.recyclerview.widget.w horizontalHelper2 = getHorizontalHelper(lm2);
                Intrinsics.f(horizontalHelper2);
                a11 = a(lm2, horizontalHelper2, 8388613, z11);
            }
        } else if (lm2.canScrollHorizontally()) {
            androidx.recyclerview.widget.w horizontalHelper3 = getHorizontalHelper(lm2);
            Intrinsics.f(horizontalHelper3);
            a11 = a(lm2, horizontalHelper3, 17, z11);
        } else {
            androidx.recyclerview.widget.w verticalHelper3 = getVerticalHelper(lm2);
            Intrinsics.f(verticalHelper3);
            a11 = a(lm2, verticalHelper3, 17, z11);
        }
        if (a11 == null) {
            this.f31459c = -1;
            return a11;
        }
        RecyclerView recyclerView = this.f31467k;
        Intrinsics.f(recyclerView);
        this.f31459c = recyclerView.getChildAdapterPosition(a11);
        return a11;
    }

    @Override // androidx.recyclerview.widget.s, androidx.recyclerview.widget.D
    public final int[] calculateDistanceToFinalSnap(RecyclerView.o layoutManager, View targetView) {
        Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
        Intrinsics.checkNotNullParameter(targetView, "targetView");
        int i11 = this.f31457a;
        if (i11 == 17) {
            int[] calculateDistanceToFinalSnap = super.calculateDistanceToFinalSnap(layoutManager, targetView);
            Intrinsics.f(calculateDistanceToFinalSnap);
            return calculateDistanceToFinalSnap;
        }
        int[] iArr = new int[2];
        if (layoutManager instanceof LinearLayoutManager) {
            if (layoutManager.canScrollHorizontally()) {
                boolean z11 = this.f31458b;
                if (!(z11 && i11 == 8388613) && (z11 || i11 != 8388611)) {
                    androidx.recyclerview.widget.w horizontalHelper = getHorizontalHelper(layoutManager);
                    Intrinsics.f(horizontalHelper);
                    int d11 = horizontalHelper.d(targetView);
                    iArr[0] = d11 >= horizontalHelper.h() - ((horizontalHelper.h() - horizontalHelper.i()) / 2) ? horizontalHelper.d(targetView) - horizontalHelper.h() : d11 - horizontalHelper.i();
                    return iArr;
                }
                androidx.recyclerview.widget.w horizontalHelper2 = getHorizontalHelper(layoutManager);
                Intrinsics.f(horizontalHelper2);
                int g10 = horizontalHelper2.g(targetView);
                if (g10 >= horizontalHelper2.n() / 2) {
                    g10 -= horizontalHelper2.n();
                }
                iArr[0] = g10;
                return iArr;
            }
            if (layoutManager.canScrollVertically()) {
                if (i11 == 48) {
                    androidx.recyclerview.widget.w verticalHelper = getVerticalHelper(layoutManager);
                    Intrinsics.f(verticalHelper);
                    int g11 = verticalHelper.g(targetView);
                    if (g11 >= verticalHelper.n() / 2) {
                        g11 -= verticalHelper.n();
                    }
                    iArr[1] = g11;
                    return iArr;
                }
                androidx.recyclerview.widget.w verticalHelper2 = getVerticalHelper(layoutManager);
                Intrinsics.f(verticalHelper2);
                int d12 = verticalHelper2.d(targetView);
                iArr[1] = d12 >= verticalHelper2.h() - ((verticalHelper2.h() - verticalHelper2.i()) / 2) ? verticalHelper2.d(targetView) - verticalHelper2.h() : d12 - verticalHelper2.i();
            }
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r2 != (-1)) goto L16;
     */
    @Override // androidx.recyclerview.widget.D
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[] calculateScrollDistance(int i11, int i12) {
        int width;
        if (this.f31467k != null && (this.f31464h != null || this.f31465i != null)) {
            int i13 = this.f31462f;
            float f7 = this.f31463g;
            if (i13 != -1 || f7 != -1.0f) {
                RecyclerView recyclerView = this.f31467k;
                Intrinsics.f(recyclerView);
                Scroller scroller = new Scroller(recyclerView.getContext(), new DecelerateInterpolator());
                if (f7 != -1.0f) {
                    if (this.f31464h != null) {
                        RecyclerView recyclerView2 = this.f31467k;
                        Intrinsics.f(recyclerView2);
                        width = recyclerView2.getHeight();
                    } else {
                        if (this.f31465i != null) {
                            RecyclerView recyclerView3 = this.f31467k;
                            Intrinsics.f(recyclerView3);
                            width = recyclerView3.getWidth();
                        }
                        i13 = Integer.MAX_VALUE;
                    }
                    i13 = (int) (width * f7);
                }
                int i14 = i13;
                int i15 = -i14;
                scroller.fling(0, 0, i11, i12, i15, i14, i15, i14);
                return new int[]{scroller.getFinalX(), scroller.getFinalY()};
            }
        }
        int[] calculateScrollDistance = super.calculateScrollDistance(i11, i12);
        Intrinsics.checkNotNullExpressionValue(calculateScrollDistance, "super.calculateScrollDis…nce(velocityX, velocityY)");
        return calculateScrollDistance;
    }

    @Override // androidx.recyclerview.widget.D
    public final RecyclerView.z createScroller(RecyclerView.o layoutManager) {
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
        if (!(layoutManager instanceof RecyclerView.z.b) || (recyclerView = this.f31467k) == null) {
            return null;
        }
        return new C4422lm(this, recyclerView.getContext());
    }

    @Override // androidx.recyclerview.widget.s, androidx.recyclerview.widget.D
    public final View findSnapView(RecyclerView.o lm2) {
        Intrinsics.checkNotNullParameter(lm2, "lm");
        return b(lm2, true);
    }

    public final androidx.recyclerview.widget.w getHorizontalHelper(RecyclerView.o oVar) {
        androidx.recyclerview.widget.w wVar = this.f31465i;
        if (wVar == null || wVar.k() != oVar) {
            this.f31465i = androidx.recyclerview.widget.w.a(oVar);
        }
        return this.f31465i;
    }

    public final androidx.recyclerview.widget.w getVerticalHelper(RecyclerView.o oVar) {
        androidx.recyclerview.widget.w wVar = this.f31464h;
        if (wVar == null || wVar.k() != oVar) {
            this.f31464h = androidx.recyclerview.widget.w.c(oVar);
        }
        return this.f31464h;
    }
}
