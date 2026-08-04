package androidx.recyclerview.widget;

import A1.AbstractC0021h;
import C0.C;
import C0.n;
import C0.u;
import C0.v;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends u {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f9673h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p036e6.c f9674i;
    public final AbstractC0021h j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f9675k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f9676l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f9677m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f9678n = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SavedState f9679o = null;

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f9680a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f9681b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f9682c;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            parcel.writeInt(this.f9680a);
            parcel.writeInt(this.f9681b);
            parcel.writeInt(this.f9682c ? 1 : 0);
        }
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i7, int i8) {
        this.f9673h = 1;
        this.f9675k = false;
        n nVar = new n(0);
        nVar.f1304b = -1;
        nVar.f1305c = Integer.MIN_VALUE;
        nVar.f1306d = false;
        nVar.f1307e = false;
        n nVarW = u.w(context, attributeSet, i7, i8);
        int i9 = nVarW.f1304b;
        if (i9 != 0 && i9 != 1) {
            throw new IllegalArgumentException(k.d(i9, "invalid orientation:"));
        }
        a(null);
        if (i9 != this.f9673h || this.j == null) {
            this.j = AbstractC0021h.c(this, i9);
            this.f9673h = i9;
            H();
        }
        boolean z4 = nVarW.f1306d;
        a(null);
        if (z4 != this.f9675k) {
            this.f9675k = z4;
            H();
        }
        Q(nVarW.f1307e);
    }

    @Override // C0.u
    public final void A(AccessibilityEvent accessibilityEvent) {
        super.A(accessibilityEvent);
        if (p() > 0) {
            View viewP = P(0, p(), false);
            if (viewP != null) {
                ((v) viewP.getLayoutParams()).getClass();
                throw null;
            }
            accessibilityEvent.setFromIndex(-1);
            View viewP2 = P(p() - 1, -1, false);
            if (viewP2 == null) {
                accessibilityEvent.setToIndex(-1);
            } else {
                ((v) viewP2.getLayoutParams()).getClass();
                throw null;
            }
        }
    }

    @Override // C0.u
    public final void B(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f9679o = (SavedState) parcelable;
            H();
        }
    }

    @Override // C0.u
    public final Parcelable C() {
        SavedState savedState = this.f9679o;
        if (savedState != null) {
            SavedState savedState2 = new SavedState();
            savedState2.f9680a = savedState.f9680a;
            savedState2.f9681b = savedState.f9681b;
            savedState2.f9682c = savedState.f9682c;
            return savedState2;
        }
        SavedState savedState3 = new SavedState();
        if (p() <= 0) {
            savedState3.f9680a = -1;
            return savedState3;
        }
        M();
        boolean z4 = this.f9676l;
        savedState3.f9682c = z4;
        if (!z4) {
            u.v(o(z4 ? p() - 1 : 0));
            throw null;
        }
        View viewO = o(z4 ? 0 : p() - 1);
        savedState3.f9681b = this.j.g() - this.j.d(viewO);
        u.v(viewO);
        throw null;
    }

    public final int J(C c3) {
        if (p() == 0) {
            return 0;
        }
        M();
        AbstractC0021h abstractC0021h = this.j;
        boolean z4 = !this.f9678n;
        return p097n3.a.k(c3, abstractC0021h, O(z4), N(z4), this, this.f9678n);
    }

    public final void K(C c3) {
        if (p() == 0) {
            return;
        }
        M();
        boolean z4 = !this.f9678n;
        View viewO = O(z4);
        View viewN = N(z4);
        if (p() == 0 || c3.a() == 0 || viewO == null || viewN == null) {
            return;
        }
        ((v) viewO.getLayoutParams()).getClass();
        throw null;
    }

    public final int L(C c3) {
        if (p() == 0) {
            return 0;
        }
        M();
        AbstractC0021h abstractC0021h = this.j;
        boolean z4 = !this.f9678n;
        return p097n3.a.l(c3, abstractC0021h, O(z4), N(z4), this, this.f9678n);
    }

    public final void M() {
        if (this.f9674i == null) {
            this.f9674i = new p036e6.c(2);
        }
    }

    public final View N(boolean z4) {
        return this.f9676l ? P(0, p(), z4) : P(p() - 1, -1, z4);
    }

    public final View O(boolean z4) {
        return this.f9676l ? P(p() - 1, -1, z4) : P(0, p(), z4);
    }

    public final View P(int i7, int i8, boolean z4) {
        M();
        int i9 = z4 ? 24579 : 320;
        return this.f9673h == 0 ? this.f1316c.P(i7, i8, i9, 320) : this.f1317d.P(i7, i8, i9, 320);
    }

    public void Q(boolean z4) {
        a(null);
        if (this.f9677m == z4) {
            return;
        }
        this.f9677m = z4;
        H();
    }

    @Override // C0.u
    public final void a(String str) {
        RecyclerView recyclerView;
        if (this.f9679o != null || (recyclerView = this.f1315b) == null) {
            return;
        }
        recyclerView.b(str);
    }

    @Override // C0.u
    public final boolean b() {
        return this.f9673h == 0;
    }

    @Override // C0.u
    public final boolean c() {
        return this.f9673h == 1;
    }

    @Override // C0.u
    public final int f(C c3) {
        return J(c3);
    }

    @Override // C0.u
    public final void g(C c3) {
        K(c3);
    }

    @Override // C0.u
    public final int h(C c3) {
        return L(c3);
    }

    @Override // C0.u
    public final int i(C c3) {
        return J(c3);
    }

    @Override // C0.u
    public final void j(C c3) {
        K(c3);
    }

    @Override // C0.u
    public final int k(C c3) {
        return L(c3);
    }

    @Override // C0.u
    public v l() {
        return new v(-2, -2);
    }

    @Override // C0.u
    public final boolean y() {
        return true;
    }

    @Override // C0.u
    public final void z(RecyclerView recyclerView) {
    }
}
