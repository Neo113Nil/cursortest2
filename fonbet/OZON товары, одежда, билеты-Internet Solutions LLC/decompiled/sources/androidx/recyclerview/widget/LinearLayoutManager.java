package androidx.recyclerview.widget;

import B4.V;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import java.util.List;

/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.o implements m.i, RecyclerView.z.b {
    static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    final a mAnchorInfo;
    private int mInitialPrefetchItemCount;
    private boolean mLastStackFromEnd;
    private final b mLayoutChunkResult;
    private c mLayoutState;
    int mOrientation;
    w mOrientationHelper;
    d mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private int[] mReusableIntPair;
    private boolean mReverseLayout;
    boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        w f44688a;

        /* renamed from: b, reason: collision with root package name */
        int f44689b;

        /* renamed from: c, reason: collision with root package name */
        int f44690c;

        /* renamed from: d, reason: collision with root package name */
        boolean f44691d;

        /* renamed from: e, reason: collision with root package name */
        boolean f44692e;

        a() {
            d();
        }

        final void a() {
            this.f44690c = this.f44691d ? this.f44688a.i() : this.f44688a.n();
        }

        public final void b(int i11, View view) {
            if (this.f44691d) {
                this.f44690c = this.f44688a.p() + this.f44688a.d(view);
            } else {
                this.f44690c = this.f44688a.g(view);
            }
            this.f44689b = i11;
        }

        public final void c(int i11, View view) {
            int p11 = this.f44688a.p();
            if (p11 >= 0) {
                b(i11, view);
                return;
            }
            this.f44689b = i11;
            if (!this.f44691d) {
                int g10 = this.f44688a.g(view);
                int n11 = g10 - this.f44688a.n();
                this.f44690c = g10;
                if (n11 > 0) {
                    int i12 = (this.f44688a.i() - Math.min(0, (this.f44688a.i() - p11) - this.f44688a.d(view))) - (this.f44688a.e(view) + g10);
                    if (i12 < 0) {
                        this.f44690c -= Math.min(n11, -i12);
                        return;
                    }
                    return;
                }
                return;
            }
            int i13 = (this.f44688a.i() - p11) - this.f44688a.d(view);
            this.f44690c = this.f44688a.i() - i13;
            if (i13 > 0) {
                int e11 = this.f44690c - this.f44688a.e(view);
                int n12 = this.f44688a.n();
                int min = e11 - (Math.min(this.f44688a.g(view) - n12, 0) + n12);
                if (min < 0) {
                    this.f44690c = Math.min(i13, -min) + this.f44690c;
                }
            }
        }

        final void d() {
            this.f44689b = -1;
            this.f44690c = LinearLayoutManager.INVALID_OFFSET;
            this.f44691d = false;
            this.f44692e = false;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AnchorInfo{mPosition=");
            sb2.append(this.f44689b);
            sb2.append(", mCoordinate=");
            sb2.append(this.f44690c);
            sb2.append(", mLayoutFromEnd=");
            sb2.append(this.f44691d);
            sb2.append(", mValid=");
            return V.d(sb2, this.f44692e, '}');
        }
    }

    protected static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f44693a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f44694b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f44695c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f44696d;
    }

    static class c {

        /* renamed from: a, reason: collision with root package name */
        boolean f44697a;

        /* renamed from: b, reason: collision with root package name */
        int f44698b;

        /* renamed from: c, reason: collision with root package name */
        int f44699c;

        /* renamed from: d, reason: collision with root package name */
        int f44700d;

        /* renamed from: e, reason: collision with root package name */
        int f44701e;

        /* renamed from: f, reason: collision with root package name */
        int f44702f;

        /* renamed from: g, reason: collision with root package name */
        int f44703g;

        /* renamed from: h, reason: collision with root package name */
        int f44704h;

        /* renamed from: i, reason: collision with root package name */
        int f44705i;

        /* renamed from: j, reason: collision with root package name */
        int f44706j;

        /* renamed from: k, reason: collision with root package name */
        List<RecyclerView.C> f44707k;

        /* renamed from: l, reason: collision with root package name */
        boolean f44708l;

        public final void a(View view) {
            int layoutPosition;
            int size = this.f44707k.size();
            View view2 = null;
            int i11 = Integer.MAX_VALUE;
            for (int i12 = 0; i12 < size; i12++) {
                View view3 = this.f44707k.get(i12).itemView;
                RecyclerView.p pVar = (RecyclerView.p) view3.getLayoutParams();
                if (view3 != view && !pVar.f44747a.isRemoved() && (layoutPosition = (pVar.f44747a.getLayoutPosition() - this.f44700d) * this.f44701e) >= 0 && layoutPosition < i11) {
                    view2 = view3;
                    if (layoutPosition == 0) {
                        break;
                    } else {
                        i11 = layoutPosition;
                    }
                }
            }
            if (view2 == null) {
                this.f44700d = -1;
            } else {
                this.f44700d = ((RecyclerView.p) view2.getLayoutParams()).f44747a.getLayoutPosition();
            }
        }

        final View b(RecyclerView.v vVar) {
            List<RecyclerView.C> list = this.f44707k;
            if (list == null) {
                View g10 = vVar.g(this.f44700d);
                this.f44700d += this.f44701e;
                return g10;
            }
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = this.f44707k.get(i11).itemView;
                RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
                if (!pVar.f44747a.isRemoved() && this.f44700d == pVar.f44747a.getLayoutPosition()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        int f44709a;

        /* renamed from: b, reason: collision with root package name */
        int f44710b;

        /* renamed from: c, reason: collision with root package name */
        boolean f44711c;

        static class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                d dVar = new d();
                dVar.f44709a = parcel.readInt();
                dVar.f44710b = parcel.readInt();
                dVar.f44711c = parcel.readInt() == 1;
                return dVar;
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i11) {
                return new d[i11];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            parcel.writeInt(this.f44709a);
            parcel.writeInt(this.f44710b);
            parcel.writeInt(this.f44711c ? 1 : 0);
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    private int computeScrollExtent(RecyclerView.A a11) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return B.a(a11, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    private int computeScrollOffset(RecyclerView.A a11) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return B.b(a11, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    private int computeScrollRange(RecyclerView.A a11) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return B.c(a11, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    private View findFirstPartiallyOrCompletelyInvisibleChild() {
        return findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount());
    }

    private View findFirstReferenceChild(RecyclerView.v vVar, RecyclerView.A a11) {
        return findReferenceChild(vVar, a11, 0, getChildCount(), a11.b());
    }

    private View findLastPartiallyOrCompletelyInvisibleChild() {
        return findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1);
    }

    private View findLastReferenceChild(RecyclerView.v vVar, RecyclerView.A a11) {
        return findReferenceChild(vVar, a11, getChildCount() - 1, -1, a11.b());
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToEnd() {
        return this.mShouldReverseLayout ? findFirstPartiallyOrCompletelyInvisibleChild() : findLastPartiallyOrCompletelyInvisibleChild();
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToStart() {
        return this.mShouldReverseLayout ? findLastPartiallyOrCompletelyInvisibleChild() : findFirstPartiallyOrCompletelyInvisibleChild();
    }

    private View findReferenceChildClosestToEnd(RecyclerView.v vVar, RecyclerView.A a11) {
        return this.mShouldReverseLayout ? findFirstReferenceChild(vVar, a11) : findLastReferenceChild(vVar, a11);
    }

    private View findReferenceChildClosestToStart(RecyclerView.v vVar, RecyclerView.A a11) {
        return this.mShouldReverseLayout ? findLastReferenceChild(vVar, a11) : findFirstReferenceChild(vVar, a11);
    }

    private int fixLayoutEndGap(int i11, RecyclerView.v vVar, RecyclerView.A a11, boolean z11) {
        int i12;
        int i13 = this.mOrientationHelper.i() - i11;
        if (i13 <= 0) {
            return 0;
        }
        int i14 = -scrollBy(-i13, vVar, a11);
        int i15 = i11 + i14;
        if (!z11 || (i12 = this.mOrientationHelper.i() - i15) <= 0) {
            return i14;
        }
        this.mOrientationHelper.s(i12);
        return i12 + i14;
    }

    private int fixLayoutStartGap(int i11, RecyclerView.v vVar, RecyclerView.A a11, boolean z11) {
        int n11;
        int n12 = i11 - this.mOrientationHelper.n();
        if (n12 <= 0) {
            return 0;
        }
        int i12 = -scrollBy(n12, vVar, a11);
        int i13 = i11 + i12;
        if (!z11 || (n11 = i13 - this.mOrientationHelper.n()) <= 0) {
            return i12;
        }
        this.mOrientationHelper.s(-n11);
        return i12 - n11;
    }

    private View getChildClosestToEnd() {
        return getChildAt(this.mShouldReverseLayout ? 0 : getChildCount() - 1);
    }

    private View getChildClosestToStart() {
        return getChildAt(this.mShouldReverseLayout ? getChildCount() - 1 : 0);
    }

    private void layoutForPredictiveAnimations(RecyclerView.v vVar, RecyclerView.A a11, int i11, int i12) {
        if (!a11.f44722k || getChildCount() == 0 || a11.f44718g || !supportsPredictiveItemAnimations()) {
            return;
        }
        List<RecyclerView.C> f7 = vVar.f();
        int size = f7.size();
        int position = getPosition(getChildAt(0));
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            RecyclerView.C c11 = f7.get(i15);
            if (!c11.isRemoved()) {
                if ((c11.getLayoutPosition() < position) != this.mShouldReverseLayout) {
                    i13 += this.mOrientationHelper.e(c11.itemView);
                } else {
                    i14 += this.mOrientationHelper.e(c11.itemView);
                }
            }
        }
        this.mLayoutState.f44707k = f7;
        if (i13 > 0) {
            updateLayoutStateToFillStart(getPosition(getChildClosestToStart()), i11);
            c cVar = this.mLayoutState;
            cVar.f44704h = i13;
            cVar.f44699c = 0;
            cVar.a(null);
            fill(vVar, this.mLayoutState, a11, false);
        }
        if (i14 > 0) {
            updateLayoutStateToFillEnd(getPosition(getChildClosestToEnd()), i12);
            c cVar2 = this.mLayoutState;
            cVar2.f44704h = i14;
            cVar2.f44699c = 0;
            cVar2.a(null);
            fill(vVar, this.mLayoutState, a11, false);
        }
        this.mLayoutState.f44707k = null;
    }

    private void logChildren() {
        Log.d(TAG, "internal representation of views on the screen");
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            Log.d(TAG, "item " + getPosition(childAt) + ", coord:" + this.mOrientationHelper.g(childAt));
        }
        Log.d(TAG, "==============");
    }

    private void recycleByLayoutState(RecyclerView.v vVar, c cVar) {
        if (!cVar.f44697a || cVar.f44708l) {
            return;
        }
        int i11 = cVar.f44703g;
        int i12 = cVar.f44705i;
        if (cVar.f44702f == -1) {
            recycleViewsFromEnd(vVar, i11, i12);
        } else {
            recycleViewsFromStart(vVar, i11, i12);
        }
    }

    private void recycleChildren(RecyclerView.v vVar, int i11, int i12) {
        if (i11 == i12) {
            return;
        }
        if (i12 <= i11) {
            while (i11 > i12) {
                removeAndRecycleViewAt(i11, vVar);
                i11--;
            }
        } else {
            for (int i13 = i12 - 1; i13 >= i11; i13--) {
                removeAndRecycleViewAt(i13, vVar);
            }
        }
    }

    private void recycleViewsFromEnd(RecyclerView.v vVar, int i11, int i12) {
        int childCount = getChildCount();
        if (i11 < 0) {
            return;
        }
        int h11 = (this.mOrientationHelper.h() - i11) + i12;
        if (this.mShouldReverseLayout) {
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                if (this.mOrientationHelper.g(childAt) < h11 || this.mOrientationHelper.r(childAt) < h11) {
                    recycleChildren(vVar, 0, i13);
                    return;
                }
            }
            return;
        }
        int i14 = childCount - 1;
        for (int i15 = i14; i15 >= 0; i15--) {
            View childAt2 = getChildAt(i15);
            if (this.mOrientationHelper.g(childAt2) < h11 || this.mOrientationHelper.r(childAt2) < h11) {
                recycleChildren(vVar, i14, i15);
                return;
            }
        }
    }

    private void recycleViewsFromStart(RecyclerView.v vVar, int i11, int i12) {
        if (i11 < 0) {
            return;
        }
        int i13 = i11 - i12;
        int childCount = getChildCount();
        if (!this.mShouldReverseLayout) {
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = getChildAt(i14);
                if (this.mOrientationHelper.d(childAt) > i13 || this.mOrientationHelper.q(childAt) > i13) {
                    recycleChildren(vVar, 0, i14);
                    return;
                }
            }
            return;
        }
        int i15 = childCount - 1;
        for (int i16 = i15; i16 >= 0; i16--) {
            View childAt2 = getChildAt(i16);
            if (this.mOrientationHelper.d(childAt2) > i13 || this.mOrientationHelper.q(childAt2) > i13) {
                recycleChildren(vVar, i15, i16);
                return;
            }
        }
    }

    private void resolveShouldLayoutReverse() {
        if (this.mOrientation == 1 || !isLayoutRTL()) {
            this.mShouldReverseLayout = this.mReverseLayout;
        } else {
            this.mShouldReverseLayout = !this.mReverseLayout;
        }
    }

    private boolean updateAnchorFromChildren(RecyclerView.v vVar, RecyclerView.A a11, a aVar) {
        if (getChildCount() == 0) {
            return false;
        }
        View focusedChild = getFocusedChild();
        if (focusedChild != null) {
            aVar.getClass();
            RecyclerView.p pVar = (RecyclerView.p) focusedChild.getLayoutParams();
            if (!pVar.f44747a.isRemoved() && pVar.f44747a.getLayoutPosition() >= 0 && pVar.f44747a.getLayoutPosition() < a11.b()) {
                aVar.c(getPosition(focusedChild), focusedChild);
                return true;
            }
        }
        if (this.mLastStackFromEnd != this.mStackFromEnd) {
            return false;
        }
        View findReferenceChildClosestToEnd = aVar.f44691d ? findReferenceChildClosestToEnd(vVar, a11) : findReferenceChildClosestToStart(vVar, a11);
        if (findReferenceChildClosestToEnd == null) {
            return false;
        }
        aVar.b(getPosition(findReferenceChildClosestToEnd), findReferenceChildClosestToEnd);
        if (!a11.f44718g && supportsPredictiveItemAnimations() && (this.mOrientationHelper.g(findReferenceChildClosestToEnd) >= this.mOrientationHelper.i() || this.mOrientationHelper.d(findReferenceChildClosestToEnd) < this.mOrientationHelper.n())) {
            aVar.f44690c = aVar.f44691d ? this.mOrientationHelper.i() : this.mOrientationHelper.n();
        }
        return true;
    }

    private boolean updateAnchorFromPendingData(RecyclerView.A a11, a aVar) {
        int i11;
        if (!a11.f44718g && (i11 = this.mPendingScrollPosition) != -1) {
            if (i11 >= 0 && i11 < a11.b()) {
                int i12 = this.mPendingScrollPosition;
                aVar.f44689b = i12;
                d dVar = this.mPendingSavedState;
                if (dVar != null && dVar.f44709a >= 0) {
                    boolean z11 = dVar.f44711c;
                    aVar.f44691d = z11;
                    if (z11) {
                        aVar.f44690c = this.mOrientationHelper.i() - this.mPendingSavedState.f44710b;
                        return true;
                    }
                    aVar.f44690c = this.mOrientationHelper.n() + this.mPendingSavedState.f44710b;
                    return true;
                }
                if (this.mPendingScrollPositionOffset != Integer.MIN_VALUE) {
                    boolean z12 = this.mShouldReverseLayout;
                    aVar.f44691d = z12;
                    if (z12) {
                        aVar.f44690c = this.mOrientationHelper.i() - this.mPendingScrollPositionOffset;
                        return true;
                    }
                    aVar.f44690c = this.mOrientationHelper.n() + this.mPendingScrollPositionOffset;
                    return true;
                }
                View findViewByPosition = findViewByPosition(i12);
                if (findViewByPosition == null) {
                    if (getChildCount() > 0) {
                        aVar.f44691d = (this.mPendingScrollPosition < getPosition(getChildAt(0))) == this.mShouldReverseLayout;
                    }
                    aVar.a();
                    return true;
                }
                if (this.mOrientationHelper.e(findViewByPosition) > this.mOrientationHelper.o()) {
                    aVar.a();
                    return true;
                }
                if (this.mOrientationHelper.g(findViewByPosition) - this.mOrientationHelper.n() < 0) {
                    aVar.f44690c = this.mOrientationHelper.n();
                    aVar.f44691d = false;
                    return true;
                }
                if (this.mOrientationHelper.i() - this.mOrientationHelper.d(findViewByPosition) >= 0) {
                    aVar.f44690c = aVar.f44691d ? this.mOrientationHelper.p() + this.mOrientationHelper.d(findViewByPosition) : this.mOrientationHelper.g(findViewByPosition);
                    return true;
                }
                aVar.f44690c = this.mOrientationHelper.i();
                aVar.f44691d = true;
                return true;
            }
            this.mPendingScrollPosition = -1;
            this.mPendingScrollPositionOffset = INVALID_OFFSET;
        }
        return false;
    }

    private void updateAnchorInfoForLayout(RecyclerView.v vVar, RecyclerView.A a11, a aVar) {
        if (updateAnchorFromPendingData(a11, aVar) || updateAnchorFromChildren(vVar, a11, aVar)) {
            return;
        }
        aVar.a();
        aVar.f44689b = this.mStackFromEnd ? a11.b() - 1 : 0;
    }

    private void updateLayoutState(int i11, int i12, boolean z11, RecyclerView.A a11) {
        int n11;
        this.mLayoutState.f44708l = resolveIsInfinite();
        this.mLayoutState.f44702f = i11;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(a11, iArr);
        int max = Math.max(0, this.mReusableIntPair[0]);
        int max2 = Math.max(0, this.mReusableIntPair[1]);
        boolean z12 = i11 == 1;
        c cVar = this.mLayoutState;
        int i13 = z12 ? max2 : max;
        cVar.f44704h = i13;
        if (!z12) {
            max = max2;
        }
        cVar.f44705i = max;
        if (z12) {
            cVar.f44704h = this.mOrientationHelper.j() + i13;
            View childClosestToEnd = getChildClosestToEnd();
            c cVar2 = this.mLayoutState;
            cVar2.f44701e = this.mShouldReverseLayout ? -1 : 1;
            int position = getPosition(childClosestToEnd);
            c cVar3 = this.mLayoutState;
            cVar2.f44700d = position + cVar3.f44701e;
            cVar3.f44698b = this.mOrientationHelper.d(childClosestToEnd);
            n11 = this.mOrientationHelper.d(childClosestToEnd) - this.mOrientationHelper.i();
        } else {
            View childClosestToStart = getChildClosestToStart();
            c cVar4 = this.mLayoutState;
            cVar4.f44704h = this.mOrientationHelper.n() + cVar4.f44704h;
            c cVar5 = this.mLayoutState;
            cVar5.f44701e = this.mShouldReverseLayout ? 1 : -1;
            int position2 = getPosition(childClosestToStart);
            c cVar6 = this.mLayoutState;
            cVar5.f44700d = position2 + cVar6.f44701e;
            cVar6.f44698b = this.mOrientationHelper.g(childClosestToStart);
            n11 = (-this.mOrientationHelper.g(childClosestToStart)) + this.mOrientationHelper.n();
        }
        c cVar7 = this.mLayoutState;
        cVar7.f44699c = i12;
        if (z11) {
            cVar7.f44699c = i12 - n11;
        }
        cVar7.f44703g = n11;
    }

    private void updateLayoutStateToFillEnd(a aVar) {
        updateLayoutStateToFillEnd(aVar.f44689b, aVar.f44690c);
    }

    private void updateLayoutStateToFillStart(a aVar) {
        updateLayoutStateToFillStart(aVar.f44689b, aVar.f44690c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    protected void calculateExtraLayoutSpace(@NonNull RecyclerView.A a11, @NonNull int[] iArr) {
        int i11;
        int extraLayoutSpace = getExtraLayoutSpace(a11);
        if (this.mLayoutState.f44702f == -1) {
            i11 = 0;
        } else {
            i11 = extraLayoutSpace;
            extraLayoutSpace = 0;
        }
        iArr[0] = extraLayoutSpace;
        iArr[1] = i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void collectAdjacentPrefetchPositions(int i11, int i12, RecyclerView.A a11, RecyclerView.o.c cVar) {
        if (this.mOrientation != 0) {
            i11 = i12;
        }
        if (getChildCount() == 0 || i11 == 0) {
            return;
        }
        ensureLayoutState();
        updateLayoutState(i11 > 0 ? 1 : -1, Math.abs(i11), true, a11);
        collectPrefetchPositionsForLayoutState(a11, this.mLayoutState, cVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void collectInitialPrefetchPositions(int i11, RecyclerView.o.c cVar) {
        boolean z11;
        int i12;
        d dVar = this.mPendingSavedState;
        if (dVar == null || (i12 = dVar.f44709a) < 0) {
            resolveShouldLayoutReverse();
            z11 = this.mShouldReverseLayout;
            i12 = this.mPendingScrollPosition;
            if (i12 == -1) {
                i12 = z11 ? i11 - 1 : 0;
            }
        } else {
            z11 = dVar.f44711c;
        }
        int i13 = z11 ? -1 : 1;
        for (int i14 = 0; i14 < this.mInitialPrefetchItemCount && i12 >= 0 && i12 < i11; i14++) {
            cVar.a(i12, 0);
            i12 += i13;
        }
    }

    void collectPrefetchPositionsForLayoutState(RecyclerView.A a11, c cVar, RecyclerView.o.c cVar2) {
        int i11 = cVar.f44700d;
        if (i11 < 0 || i11 >= a11.b()) {
            return;
        }
        cVar2.a(i11, Math.max(0, cVar.f44703g));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int computeHorizontalScrollExtent(RecyclerView.A a11) {
        return computeScrollExtent(a11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int computeHorizontalScrollOffset(RecyclerView.A a11) {
        return computeScrollOffset(a11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int computeHorizontalScrollRange(RecyclerView.A a11) {
        return computeScrollRange(a11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z.b
    public PointF computeScrollVectorForPosition(int i11) {
        if (getChildCount() == 0) {
            return null;
        }
        int i12 = (i11 < getPosition(getChildAt(0))) != this.mShouldReverseLayout ? -1 : 1;
        return this.mOrientation == 0 ? new PointF(i12, 0.0f) : new PointF(0.0f, i12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int computeVerticalScrollExtent(RecyclerView.A a11) {
        return computeScrollExtent(a11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int computeVerticalScrollOffset(RecyclerView.A a11) {
        return computeScrollOffset(a11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int computeVerticalScrollRange(RecyclerView.A a11) {
        return computeScrollRange(a11);
    }

    int convertFocusDirectionToLayoutDirection(int i11) {
        if (i11 == 1) {
            return (this.mOrientation != 1 && isLayoutRTL()) ? 1 : -1;
        }
        if (i11 == 2) {
            return (this.mOrientation != 1 && isLayoutRTL()) ? -1 : 1;
        }
        if (i11 == 17) {
            if (this.mOrientation == 0) {
                return -1;
            }
            return INVALID_OFFSET;
        }
        if (i11 == 33) {
            if (this.mOrientation == 1) {
                return -1;
            }
            return INVALID_OFFSET;
        }
        if (i11 == 66) {
            if (this.mOrientation == 0) {
                return 1;
            }
            return INVALID_OFFSET;
        }
        if (i11 == 130 && this.mOrientation == 1) {
            return 1;
        }
        return INVALID_OFFSET;
    }

    c createLayoutState() {
        c cVar = new c();
        cVar.f44697a = true;
        cVar.f44704h = 0;
        cVar.f44705i = 0;
        cVar.f44707k = null;
        return cVar;
    }

    void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = createLayoutState();
        }
    }

    int fill(RecyclerView.v vVar, c cVar, RecyclerView.A a11, boolean z11) {
        int i11;
        int i12 = cVar.f44699c;
        int i13 = cVar.f44703g;
        if (i13 != Integer.MIN_VALUE) {
            if (i12 < 0) {
                cVar.f44703g = i13 + i12;
            }
            recycleByLayoutState(vVar, cVar);
        }
        int i14 = cVar.f44699c + cVar.f44704h;
        b bVar = this.mLayoutChunkResult;
        while (true) {
            if ((!cVar.f44708l && i14 <= 0) || (i11 = cVar.f44700d) < 0 || i11 >= a11.b()) {
                break;
            }
            bVar.f44693a = 0;
            bVar.f44694b = false;
            bVar.f44695c = false;
            bVar.f44696d = false;
            layoutChunk(vVar, a11, cVar, bVar);
            if (!bVar.f44694b) {
                int i15 = cVar.f44698b;
                int i16 = bVar.f44693a;
                cVar.f44698b = (cVar.f44702f * i16) + i15;
                if (!bVar.f44695c || cVar.f44707k != null || !a11.f44718g) {
                    cVar.f44699c -= i16;
                    i14 -= i16;
                }
                int i17 = cVar.f44703g;
                if (i17 != Integer.MIN_VALUE) {
                    int i18 = i17 + i16;
                    cVar.f44703g = i18;
                    int i19 = cVar.f44699c;
                    if (i19 < 0) {
                        cVar.f44703g = i18 + i19;
                    }
                    recycleByLayoutState(vVar, cVar);
                }
                if (z11 && bVar.f44696d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i12 - cVar.f44699c;
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(0, getChildCount(), true, false);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    View findFirstVisibleChildClosestToEnd(boolean z11, boolean z12) {
        return this.mShouldReverseLayout ? findOneVisibleChild(0, getChildCount(), z11, z12) : findOneVisibleChild(getChildCount() - 1, -1, z11, z12);
    }

    View findFirstVisibleChildClosestToStart(boolean z11, boolean z12) {
        return this.mShouldReverseLayout ? findOneVisibleChild(getChildCount() - 1, -1, z11, z12) : findOneVisibleChild(0, getChildCount(), z11, z12);
    }

    public int findFirstVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(0, getChildCount(), false, true);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, true, false);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public int findLastVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, false, true);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    View findOnePartiallyOrCompletelyInvisibleChild(int i11, int i12) {
        int i13;
        int i14;
        ensureLayoutState();
        if (i12 <= i11 && i12 >= i11) {
            return getChildAt(i11);
        }
        if (this.mOrientationHelper.g(getChildAt(i11)) < this.mOrientationHelper.n()) {
            i13 = 16644;
            i14 = 16388;
        } else {
            i13 = 4161;
            i14 = 4097;
        }
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.a(i11, i12, i13, i14) : this.mVerticalBoundCheck.a(i11, i12, i13, i14);
    }

    View findOneVisibleChild(int i11, int i12, boolean z11, boolean z12) {
        ensureLayoutState();
        int i13 = z11 ? 24579 : 320;
        int i14 = z12 ? 320 : 0;
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.a(i11, i12, i13, i14) : this.mVerticalBoundCheck.a(i11, i12, i13, i14);
    }

    View findReferenceChild(RecyclerView.v vVar, RecyclerView.A a11, int i11, int i12, int i13) {
        ensureLayoutState();
        int n11 = this.mOrientationHelper.n();
        int i14 = this.mOrientationHelper.i();
        int i15 = i12 > i11 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i11 != i12) {
            View childAt = getChildAt(i11);
            int position = getPosition(childAt);
            if (position >= 0 && position < i13) {
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

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View findViewByPosition(int i11) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i11 - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i11) {
                return childAt;
            }
        }
        return super.findViewByPosition(i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p generateDefaultLayoutParams() {
        return new RecyclerView.p(-2, -2);
    }

    @Deprecated
    protected int getExtraLayoutSpace(RecyclerView.A a11) {
        if (a11.c()) {
            return this.mOrientationHelper.o();
        }
        return 0;
    }

    public int getInitialPrefetchItemCount() {
        return this.mInitialPrefetchItemCount;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public boolean getStackFromEnd() {
        return this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    protected boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    void layoutChunk(RecyclerView.v vVar, RecyclerView.A a11, c cVar, b bVar) {
        int i11;
        int i12;
        int i13;
        int i14;
        int paddingLeft;
        int f7;
        int i15;
        int i16;
        View b11 = cVar.b(vVar);
        if (b11 == null) {
            bVar.f44694b = true;
            return;
        }
        RecyclerView.p pVar = (RecyclerView.p) b11.getLayoutParams();
        if (cVar.f44707k == null) {
            if (this.mShouldReverseLayout == (cVar.f44702f == -1)) {
                addView(b11);
            } else {
                addView(b11, 0);
            }
        } else {
            if (this.mShouldReverseLayout == (cVar.f44702f == -1)) {
                addDisappearingView(b11);
            } else {
                addDisappearingView(b11, 0);
            }
        }
        measureChildWithMargins(b11, 0, 0);
        bVar.f44693a = this.mOrientationHelper.e(b11);
        if (this.mOrientation == 1) {
            if (isLayoutRTL()) {
                f7 = getWidth() - getPaddingRight();
                paddingLeft = f7 - this.mOrientationHelper.f(b11);
            } else {
                paddingLeft = getPaddingLeft();
                f7 = this.mOrientationHelper.f(b11) + paddingLeft;
            }
            if (cVar.f44702f == -1) {
                i16 = cVar.f44698b;
                i15 = i16 - bVar.f44693a;
            } else {
                i15 = cVar.f44698b;
                i16 = bVar.f44693a + i15;
            }
            int i17 = paddingLeft;
            i14 = i15;
            i13 = i17;
            i12 = i16;
            i11 = f7;
        } else {
            int paddingTop = getPaddingTop();
            int f11 = this.mOrientationHelper.f(b11) + paddingTop;
            if (cVar.f44702f == -1) {
                int i18 = cVar.f44698b;
                i13 = i18 - bVar.f44693a;
                i11 = i18;
                i12 = f11;
            } else {
                int i19 = cVar.f44698b;
                i11 = bVar.f44693a + i19;
                i12 = f11;
                i13 = i19;
            }
            i14 = paddingTop;
        }
        layoutDecoratedWithMargins(b11, i13, i14, i11, i12);
        if (pVar.f44747a.isRemoved() || pVar.f44747a.isUpdated()) {
            bVar.f44695c = true;
        }
        bVar.f44696d = b11.hasFocusable();
    }

    void onAnchorReady(RecyclerView.v vVar, RecyclerView.A a11, a aVar, int i11) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.v vVar) {
        super.onDetachedFromWindow(recyclerView, vVar);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(vVar);
            vVar.c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View onFocusSearchFailed(View view, int i11, RecyclerView.v vVar, RecyclerView.A a11) {
        int convertFocusDirectionToLayoutDirection;
        resolveShouldLayoutReverse();
        if (getChildCount() == 0 || (convertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i11)) == Integer.MIN_VALUE) {
            return null;
        }
        ensureLayoutState();
        updateLayoutState(convertFocusDirectionToLayoutDirection, (int) (this.mOrientationHelper.o() * MAX_SCROLL_FACTOR), false, a11);
        c cVar = this.mLayoutState;
        cVar.f44703g = INVALID_OFFSET;
        cVar.f44697a = false;
        fill(vVar, cVar, a11, true);
        View findPartiallyOrCompletelyInvisibleChildClosestToStart = convertFocusDirectionToLayoutDirection == -1 ? findPartiallyOrCompletelyInvisibleChildClosestToStart() : findPartiallyOrCompletelyInvisibleChildClosestToEnd();
        View childClosestToStart = convertFocusDirectionToLayoutDirection == -1 ? getChildClosestToStart() : getChildClosestToEnd();
        if (!childClosestToStart.hasFocusable()) {
            return findPartiallyOrCompletelyInvisibleChildClosestToStart;
        }
        if (findPartiallyOrCompletelyInvisibleChildClosestToStart == null) {
            return null;
        }
        return childClosestToStart;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onLayoutChildren(RecyclerView.v vVar, RecyclerView.A a11) {
        int i11;
        int i12;
        int i13;
        int i14;
        int fixLayoutEndGap;
        int i15;
        View findViewByPosition;
        int g10;
        int i16;
        int i17;
        int i18 = -1;
        if (!(this.mPendingSavedState == null && this.mPendingScrollPosition == -1) && a11.b() == 0) {
            removeAndRecycleAllViews(vVar);
            return;
        }
        d dVar = this.mPendingSavedState;
        if (dVar != null && (i17 = dVar.f44709a) >= 0) {
            this.mPendingScrollPosition = i17;
        }
        ensureLayoutState();
        this.mLayoutState.f44697a = false;
        resolveShouldLayoutReverse();
        View focusedChild = getFocusedChild();
        a aVar = this.mAnchorInfo;
        if (!aVar.f44692e || this.mPendingScrollPosition != -1 || this.mPendingSavedState != null) {
            aVar.d();
            a aVar2 = this.mAnchorInfo;
            aVar2.f44691d = this.mShouldReverseLayout ^ this.mStackFromEnd;
            updateAnchorInfoForLayout(vVar, a11, aVar2);
            this.mAnchorInfo.f44692e = true;
        } else if (focusedChild != null && (this.mOrientationHelper.g(focusedChild) >= this.mOrientationHelper.i() || this.mOrientationHelper.d(focusedChild) <= this.mOrientationHelper.n())) {
            this.mAnchorInfo.c(getPosition(focusedChild), focusedChild);
        }
        c cVar = this.mLayoutState;
        cVar.f44702f = cVar.f44706j >= 0 ? 1 : -1;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(a11, iArr);
        int n11 = this.mOrientationHelper.n() + Math.max(0, this.mReusableIntPair[0]);
        int j11 = this.mOrientationHelper.j() + Math.max(0, this.mReusableIntPair[1]);
        if (a11.f44718g && (i15 = this.mPendingScrollPosition) != -1 && this.mPendingScrollPositionOffset != Integer.MIN_VALUE && (findViewByPosition = findViewByPosition(i15)) != null) {
            if (this.mShouldReverseLayout) {
                i16 = this.mOrientationHelper.i() - this.mOrientationHelper.d(findViewByPosition);
                g10 = this.mPendingScrollPositionOffset;
            } else {
                g10 = this.mOrientationHelper.g(findViewByPosition) - this.mOrientationHelper.n();
                i16 = this.mPendingScrollPositionOffset;
            }
            int i19 = i16 - g10;
            if (i19 > 0) {
                n11 += i19;
            } else {
                j11 -= i19;
            }
        }
        a aVar3 = this.mAnchorInfo;
        if (!aVar3.f44691d ? !this.mShouldReverseLayout : this.mShouldReverseLayout) {
            i18 = 1;
        }
        onAnchorReady(vVar, a11, aVar3, i18);
        detachAndScrapAttachedViews(vVar);
        this.mLayoutState.f44708l = resolveIsInfinite();
        this.mLayoutState.getClass();
        this.mLayoutState.f44705i = 0;
        a aVar4 = this.mAnchorInfo;
        if (aVar4.f44691d) {
            updateLayoutStateToFillStart(aVar4);
            c cVar2 = this.mLayoutState;
            cVar2.f44704h = n11;
            fill(vVar, cVar2, a11, false);
            c cVar3 = this.mLayoutState;
            i12 = cVar3.f44698b;
            int i21 = cVar3.f44700d;
            int i22 = cVar3.f44699c;
            if (i22 > 0) {
                j11 += i22;
            }
            updateLayoutStateToFillEnd(this.mAnchorInfo);
            c cVar4 = this.mLayoutState;
            cVar4.f44704h = j11;
            cVar4.f44700d += cVar4.f44701e;
            fill(vVar, cVar4, a11, false);
            c cVar5 = this.mLayoutState;
            i11 = cVar5.f44698b;
            int i23 = cVar5.f44699c;
            if (i23 > 0) {
                updateLayoutStateToFillStart(i21, i12);
                c cVar6 = this.mLayoutState;
                cVar6.f44704h = i23;
                fill(vVar, cVar6, a11, false);
                i12 = this.mLayoutState.f44698b;
            }
        } else {
            updateLayoutStateToFillEnd(aVar4);
            c cVar7 = this.mLayoutState;
            cVar7.f44704h = j11;
            fill(vVar, cVar7, a11, false);
            c cVar8 = this.mLayoutState;
            i11 = cVar8.f44698b;
            int i24 = cVar8.f44700d;
            int i25 = cVar8.f44699c;
            if (i25 > 0) {
                n11 += i25;
            }
            updateLayoutStateToFillStart(this.mAnchorInfo);
            c cVar9 = this.mLayoutState;
            cVar9.f44704h = n11;
            cVar9.f44700d += cVar9.f44701e;
            fill(vVar, cVar9, a11, false);
            c cVar10 = this.mLayoutState;
            int i26 = cVar10.f44698b;
            int i27 = cVar10.f44699c;
            if (i27 > 0) {
                updateLayoutStateToFillEnd(i24, i11);
                c cVar11 = this.mLayoutState;
                cVar11.f44704h = i27;
                fill(vVar, cVar11, a11, false);
                i11 = this.mLayoutState.f44698b;
            }
            i12 = i26;
        }
        if (getChildCount() > 0) {
            if (this.mShouldReverseLayout ^ this.mStackFromEnd) {
                int fixLayoutEndGap2 = fixLayoutEndGap(i11, vVar, a11, true);
                i13 = i12 + fixLayoutEndGap2;
                i14 = i11 + fixLayoutEndGap2;
                fixLayoutEndGap = fixLayoutStartGap(i13, vVar, a11, false);
            } else {
                int fixLayoutStartGap = fixLayoutStartGap(i12, vVar, a11, true);
                i13 = i12 + fixLayoutStartGap;
                i14 = i11 + fixLayoutStartGap;
                fixLayoutEndGap = fixLayoutEndGap(i14, vVar, a11, false);
            }
            i12 = i13 + fixLayoutEndGap;
            i11 = i14 + fixLayoutEndGap;
        }
        layoutForPredictiveAnimations(vVar, a11, i12, i11);
        if (a11.f44718g) {
            this.mAnchorInfo.d();
        } else {
            this.mOrientationHelper.t();
        }
        this.mLastStackFromEnd = this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onLayoutCompleted(RecyclerView.A a11) {
        super.onLayoutCompleted(a11);
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = INVALID_OFFSET;
        this.mAnchorInfo.d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof d) {
            this.mPendingSavedState = (d) parcelable;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public Parcelable onSaveInstanceState() {
        d dVar = this.mPendingSavedState;
        if (dVar != null) {
            d dVar2 = new d();
            dVar2.f44709a = dVar.f44709a;
            dVar2.f44710b = dVar.f44710b;
            dVar2.f44711c = dVar.f44711c;
            return dVar2;
        }
        d dVar3 = new d();
        if (getChildCount() <= 0) {
            dVar3.f44709a = -1;
            return dVar3;
        }
        ensureLayoutState();
        boolean z11 = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
        dVar3.f44711c = z11;
        if (z11) {
            View childClosestToEnd = getChildClosestToEnd();
            dVar3.f44710b = this.mOrientationHelper.i() - this.mOrientationHelper.d(childClosestToEnd);
            dVar3.f44709a = getPosition(childClosestToEnd);
            return dVar3;
        }
        View childClosestToStart = getChildClosestToStart();
        dVar3.f44709a = getPosition(childClosestToStart);
        dVar3.f44710b = this.mOrientationHelper.g(childClosestToStart) - this.mOrientationHelper.n();
        return dVar3;
    }

    @Override // androidx.recyclerview.widget.m.i
    public void prepareForDrop(@NonNull View view, @NonNull View view2, int i11, int i12) {
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        ensureLayoutState();
        resolveShouldLayoutReverse();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        char c11 = position < position2 ? (char) 1 : (char) 65535;
        if (this.mShouldReverseLayout) {
            if (c11 == 1) {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.i() - (this.mOrientationHelper.e(view) + this.mOrientationHelper.g(view2)));
                return;
            } else {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.i() - this.mOrientationHelper.d(view2));
                return;
            }
        }
        if (c11 == 65535) {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.g(view2));
        } else {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.d(view2) - this.mOrientationHelper.e(view));
        }
    }

    boolean resolveIsInfinite() {
        return this.mOrientationHelper.l() == 0 && this.mOrientationHelper.h() == 0;
    }

    int scrollBy(int i11, RecyclerView.v vVar, RecyclerView.A a11) {
        if (getChildCount() == 0 || i11 == 0) {
            return 0;
        }
        ensureLayoutState();
        this.mLayoutState.f44697a = true;
        int i12 = i11 > 0 ? 1 : -1;
        int abs = Math.abs(i11);
        updateLayoutState(i12, abs, true, a11);
        c cVar = this.mLayoutState;
        int fill = cVar.f44703g + fill(vVar, cVar, a11, false);
        if (fill < 0) {
            return 0;
        }
        if (abs > fill) {
            i11 = i12 * fill;
        }
        this.mOrientationHelper.s(-i11);
        this.mLayoutState.f44706j = i11;
        return i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int scrollHorizontallyBy(int i11, RecyclerView.v vVar, RecyclerView.A a11) {
        if (this.mOrientation == 1) {
            return 0;
        }
        return scrollBy(i11, vVar, a11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void scrollToPosition(int i11) {
        this.mPendingScrollPosition = i11;
        this.mPendingScrollPositionOffset = INVALID_OFFSET;
        d dVar = this.mPendingSavedState;
        if (dVar != null) {
            dVar.f44709a = -1;
        }
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i11, int i12) {
        this.mPendingScrollPosition = i11;
        this.mPendingScrollPositionOffset = i12;
        d dVar = this.mPendingSavedState;
        if (dVar != null) {
            dVar.f44709a = -1;
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int scrollVerticallyBy(int i11, RecyclerView.v vVar, RecyclerView.A a11) {
        if (this.mOrientation == 0) {
            return 0;
        }
        return scrollBy(i11, vVar, a11);
    }

    public void setInitialPrefetchItemCount(int i11) {
        this.mInitialPrefetchItemCount = i11;
    }

    public void setOrientation(int i11) {
        if (i11 != 0 && i11 != 1) {
            throw new IllegalArgumentException(Ej.b.a(i11, "invalid orientation:"));
        }
        assertNotInLayoutOrScroll(null);
        if (i11 != this.mOrientation || this.mOrientationHelper == null) {
            w b11 = w.b(this, i11);
            this.mOrientationHelper = b11;
            this.mAnchorInfo.f44688a = b11;
            this.mOrientation = i11;
            requestLayout();
        }
    }

    public void setRecycleChildrenOnDetach(boolean z11) {
        this.mRecycleChildrenOnDetach = z11;
    }

    public void setReverseLayout(boolean z11) {
        assertNotInLayoutOrScroll(null);
        if (z11 == this.mReverseLayout) {
            return;
        }
        this.mReverseLayout = z11;
        requestLayout();
    }

    public void setSmoothScrollbarEnabled(boolean z11) {
        this.mSmoothScrollbarEnabled = z11;
    }

    public void setStackFromEnd(boolean z11) {
        assertNotInLayoutOrScroll(null);
        if (this.mStackFromEnd == z11) {
            return;
        }
        this.mStackFromEnd = z11;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    boolean shouldMeasureTwice() {
        return (getHeightMode() == 1073741824 || getWidthMode() == 1073741824 || !hasFlexibleChildInBothOrientations()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.A a11, int i11) {
        r rVar = new r(recyclerView.getContext());
        rVar.setTargetPosition(i11);
        startSmoothScroll(rVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && this.mLastStackFromEnd == this.mStackFromEnd;
    }

    void validateChildOrder() {
        Log.d(TAG, "validating child count " + getChildCount());
        if (getChildCount() < 1) {
            return;
        }
        int position = getPosition(getChildAt(0));
        int g10 = this.mOrientationHelper.g(getChildAt(0));
        if (this.mShouldReverseLayout) {
            for (int i11 = 1; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                int position2 = getPosition(childAt);
                int g11 = this.mOrientationHelper.g(childAt);
                if (position2 < position) {
                    logChildren();
                    StringBuilder sb2 = new StringBuilder("detected invalid position. loc invalid? ");
                    sb2.append(g11 < g10);
                    throw new RuntimeException(sb2.toString());
                }
                if (g11 > g10) {
                    logChildren();
                    throw new RuntimeException("detected invalid location");
                }
            }
            return;
        }
        for (int i12 = 1; i12 < getChildCount(); i12++) {
            View childAt2 = getChildAt(i12);
            int position3 = getPosition(childAt2);
            int g12 = this.mOrientationHelper.g(childAt2);
            if (position3 < position) {
                logChildren();
                StringBuilder sb3 = new StringBuilder("detected invalid position. loc invalid? ");
                sb3.append(g12 < g10);
                throw new RuntimeException(sb3.toString());
            }
            if (g12 < g10) {
                logChildren();
                throw new RuntimeException("detected invalid location");
            }
        }
    }

    public LinearLayoutManager(Context context, int i11, boolean z11) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = INVALID_OFFSET;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new a();
        this.mLayoutChunkResult = new b();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        setOrientation(i11);
        setReverseLayout(z11);
    }

    private void updateLayoutStateToFillEnd(int i11, int i12) {
        this.mLayoutState.f44699c = this.mOrientationHelper.i() - i12;
        c cVar = this.mLayoutState;
        cVar.f44701e = this.mShouldReverseLayout ? -1 : 1;
        cVar.f44700d = i11;
        cVar.f44702f = 1;
        cVar.f44698b = i12;
        cVar.f44703g = INVALID_OFFSET;
    }

    private void updateLayoutStateToFillStart(int i11, int i12) {
        this.mLayoutState.f44699c = i12 - this.mOrientationHelper.n();
        c cVar = this.mLayoutState;
        cVar.f44700d = i11;
        cVar.f44701e = this.mShouldReverseLayout ? 1 : -1;
        cVar.f44702f = -1;
        cVar.f44698b = i12;
        cVar.f44703g = INVALID_OFFSET;
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i11, int i12) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = INVALID_OFFSET;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new a();
        this.mLayoutChunkResult = new b();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        RecyclerView.o.d properties = RecyclerView.o.getProperties(context, attributeSet, i11, i12);
        setOrientation(properties.f44743a);
        setReverseLayout(properties.f44745c);
        setStackFromEnd(properties.f44746d);
    }
}
