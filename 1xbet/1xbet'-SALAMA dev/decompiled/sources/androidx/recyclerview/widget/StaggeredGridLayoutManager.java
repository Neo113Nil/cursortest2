package androidx.recyclerview.widget;

import A1.AbstractC0021h;
import B1.l;
import C0.A;
import C0.C;
import C0.H;
import C0.I;
import C0.J;
import C0.RunnableC0085d;
import C0.n;
import C0.u;
import C0.v;
import P.U;
import android.content.Context;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends u {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f9743h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final J[] f9744i;
    public final AbstractC0021h j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AbstractC0021h f9745k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f9746l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f9747m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f9748n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final I f9749o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f9750p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public SavedState f9751q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f9752r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final RunnableC0085d f9753s;

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new d();

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public boolean f9758A;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f9759a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f9760b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f9761c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int[] f9762d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f9763e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int[] f9764f;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public ArrayList f9765x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public boolean f9766y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public boolean f9767z;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            parcel.writeInt(this.f9759a);
            parcel.writeInt(this.f9760b);
            parcel.writeInt(this.f9761c);
            if (this.f9761c > 0) {
                parcel.writeIntArray(this.f9762d);
            }
            parcel.writeInt(this.f9763e);
            if (this.f9763e > 0) {
                parcel.writeIntArray(this.f9764f);
            }
            parcel.writeInt(this.f9766y ? 1 : 0);
            parcel.writeInt(this.f9767z ? 1 : 0);
            parcel.writeInt(this.f9758A ? 1 : 0);
            parcel.writeList(this.f9765x);
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i7, int i8) {
        this.f9743h = -1;
        this.f9747m = false;
        I i9 = new I();
        this.f9749o = i9;
        this.f9750p = 2;
        new Rect();
        this.f9752r = true;
        this.f9753s = new RunnableC0085d(this, 2);
        n nVarW = u.w(context, attributeSet, i7, i8);
        int i10 = nVarW.f1304b;
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        a(null);
        if (i10 != this.f9746l) {
            this.f9746l = i10;
            AbstractC0021h abstractC0021h = this.j;
            this.j = this.f9745k;
            this.f9745k = abstractC0021h;
            H();
        }
        int i11 = nVarW.f1305c;
        a(null);
        if (i11 != this.f9743h) {
            i9.f1233a = null;
            H();
            this.f9743h = i11;
            new BitSet(this.f9743h);
            this.f9744i = new J[this.f9743h];
            for (int i12 = 0; i12 < this.f9743h; i12++) {
                this.f9744i[i12] = new J(this, i12);
            }
            H();
        }
        boolean z4 = nVarW.f1306d;
        a(null);
        SavedState savedState = this.f9751q;
        if (savedState != null && savedState.f9766y != z4) {
            savedState.f9766y = z4;
        }
        this.f9747m = z4;
        H();
        l lVar = new l();
        lVar.f1011b = 0;
        lVar.f1012c = 0;
        this.j = AbstractC0021h.c(this, this.f9746l);
        this.f9745k = AbstractC0021h.c(this, 1 - this.f9746l);
    }

    @Override // C0.u
    public final void A(AccessibilityEvent accessibilityEvent) {
        super.A(accessibilityEvent);
        if (p() > 0) {
            View viewO = O(false);
            View viewN = N(false);
            if (viewO == null || viewN == null) {
                return;
            }
            ((v) viewO.getLayoutParams()).getClass();
            throw null;
        }
    }

    @Override // C0.u
    public final void B(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f9751q = (SavedState) parcelable;
            H();
        }
    }

    @Override // C0.u
    public final Parcelable C() {
        SavedState savedState = this.f9751q;
        if (savedState != null) {
            SavedState savedState2 = new SavedState();
            savedState2.f9761c = savedState.f9761c;
            savedState2.f9759a = savedState.f9759a;
            savedState2.f9760b = savedState.f9760b;
            savedState2.f9762d = savedState.f9762d;
            savedState2.f9763e = savedState.f9763e;
            savedState2.f9764f = savedState.f9764f;
            savedState2.f9766y = savedState.f9766y;
            savedState2.f9767z = savedState.f9767z;
            savedState2.f9758A = savedState.f9758A;
            savedState2.f9765x = savedState.f9765x;
            return savedState2;
        }
        SavedState savedState3 = new SavedState();
        savedState3.f9766y = this.f9747m;
        savedState3.f9767z = false;
        savedState3.f9758A = false;
        savedState3.f9763e = 0;
        if (p() > 0) {
            P();
            savedState3.f9759a = 0;
            View viewN = this.f9748n ? N(true) : O(true);
            if (viewN != null) {
                ((v) viewN.getLayoutParams()).getClass();
                throw null;
            }
            savedState3.f9760b = -1;
            int i7 = this.f9743h;
            savedState3.f9761c = i7;
            savedState3.f9762d = new int[i7];
            for (int i8 = 0; i8 < this.f9743h; i8++) {
                J j = this.f9744i[i8];
                int iH = j.f1234a;
                if (iH == Integer.MIN_VALUE) {
                    if (((ArrayList) j.f1237d).size() == 0) {
                        iH = Integer.MIN_VALUE;
                    } else {
                        View view = (View) ((ArrayList) j.f1237d).get(0);
                        H h6 = (H) view.getLayoutParams();
                        j.f1234a = ((StaggeredGridLayoutManager) j.f1238e).j.e(view);
                        h6.getClass();
                        iH = j.f1234a;
                    }
                }
                if (iH != Integer.MIN_VALUE) {
                    iH -= this.j.h();
                }
                savedState3.f9762d[i8] = iH;
            }
        } else {
            savedState3.f9759a = -1;
            savedState3.f9760b = -1;
            savedState3.f9761c = 0;
        }
        return savedState3;
    }

    @Override // C0.u
    public final void D(int i7) {
        if (i7 == 0) {
            J();
        }
    }

    public final boolean J() {
        int i7 = this.f9743h;
        boolean z4 = this.f9748n;
        if (p() == 0 || this.f9750p == 0 || !this.f1318e) {
            return false;
        }
        if (z4) {
            Q();
            P();
        } else {
            P();
            Q();
        }
        int iP = p();
        int i8 = iP - 1;
        new BitSet(i7).set(0, i7, true);
        if (this.f9746l == 1) {
            RecyclerView recyclerView = this.f1315b;
            WeakHashMap weakHashMap = U.f5037a;
            if (recyclerView.getLayoutDirection() != 1) {
            }
        }
        if (z4) {
            iP = -1;
        } else {
            i8 = 0;
        }
        if (i8 == iP) {
            return false;
        }
        ((H) o(i8).getLayoutParams()).getClass();
        throw null;
    }

    public final int K(C c3) {
        if (p() == 0) {
            return 0;
        }
        AbstractC0021h abstractC0021h = this.j;
        boolean z4 = !this.f9752r;
        return p097n3.a.k(c3, abstractC0021h, O(z4), N(z4), this, this.f9752r);
    }

    public final void L(C c3) {
        if (p() == 0) {
            return;
        }
        boolean z4 = !this.f9752r;
        View viewO = O(z4);
        View viewN = N(z4);
        if (p() == 0 || c3.a() == 0 || viewO == null || viewN == null) {
            return;
        }
        ((v) viewO.getLayoutParams()).getClass();
        throw null;
    }

    public final int M(C c3) {
        if (p() == 0) {
            return 0;
        }
        AbstractC0021h abstractC0021h = this.j;
        boolean z4 = !this.f9752r;
        return p097n3.a.l(c3, abstractC0021h, O(z4), N(z4), this, this.f9752r);
    }

    public final View N(boolean z4) {
        int iH = this.j.h();
        int iG = this.j.g();
        View view = null;
        for (int iP = p() - 1; iP >= 0; iP--) {
            View viewO = o(iP);
            int iE = this.j.e(viewO);
            int iD = this.j.d(viewO);
            if (iD > iH && iE < iG) {
                if (iD <= iG || !z4) {
                    return viewO;
                }
                if (view == null) {
                    view = viewO;
                }
            }
        }
        return view;
    }

    public final View O(boolean z4) {
        int iH = this.j.h();
        int iG = this.j.g();
        int iP = p();
        View view = null;
        for (int i7 = 0; i7 < iP; i7++) {
            View viewO = o(i7);
            int iE = this.j.e(viewO);
            if (this.j.d(viewO) > iH && iE < iG) {
                if (iE >= iH || !z4) {
                    return viewO;
                }
                if (view == null) {
                    view = viewO;
                }
            }
        }
        return view;
    }

    public final void P() {
        if (p() == 0) {
            return;
        }
        u.v(o(0));
        throw null;
    }

    public final void Q() {
        int iP = p();
        if (iP == 0) {
            return;
        }
        u.v(o(iP - 1));
        throw null;
    }

    @Override // C0.u
    public final void a(String str) {
        RecyclerView recyclerView;
        if (this.f9751q != null || (recyclerView = this.f1315b) == null) {
            return;
        }
        recyclerView.b(str);
    }

    @Override // C0.u
    public final boolean b() {
        return this.f9746l == 0;
    }

    @Override // C0.u
    public final boolean c() {
        return this.f9746l == 1;
    }

    @Override // C0.u
    public final boolean d(v vVar) {
        return vVar instanceof H;
    }

    @Override // C0.u
    public final int f(C c3) {
        return K(c3);
    }

    @Override // C0.u
    public final void g(C c3) {
        L(c3);
    }

    @Override // C0.u
    public final int h(C c3) {
        return M(c3);
    }

    @Override // C0.u
    public final int i(C c3) {
        return K(c3);
    }

    @Override // C0.u
    public final void j(C c3) {
        L(c3);
    }

    @Override // C0.u
    public final int k(C c3) {
        return M(c3);
    }

    @Override // C0.u
    public final v l() {
        return this.f9746l == 0 ? new H(-2, -1) : new H(-1, -2);
    }

    @Override // C0.u
    public final v m(Context context, AttributeSet attributeSet) {
        return new H(context, attributeSet);
    }

    @Override // C0.u
    public final v n(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new H((ViewGroup.MarginLayoutParams) layoutParams) : new H(layoutParams);
    }

    @Override // C0.u
    public final int q(A a2, C c3) {
        if (this.f9746l == 1) {
            return this.f9743h;
        }
        super.q(a2, c3);
        return 1;
    }

    @Override // C0.u
    public final int x(A a2, C c3) {
        if (this.f9746l == 0) {
            return this.f9743h;
        }
        super.x(a2, c3);
        return 1;
    }

    @Override // C0.u
    public final boolean y() {
        return this.f9750p != 0;
    }

    @Override // C0.u
    public final void z(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f1315b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f9753s);
        }
        for (int i7 = 0; i7 < this.f9743h; i7++) {
            J j = this.f9744i[i7];
            ((ArrayList) j.f1237d).clear();
            j.f1234a = Integer.MIN_VALUE;
            j.f1235b = Integer.MIN_VALUE;
        }
        recyclerView.requestLayout();
    }
}
