package androidx.recyclerview.widget;

import C0.A;
import C0.C;
import C0.C0094m;
import C0.u;
import C0.v;
import W5.AbstractC0486a1;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import e1.k;
import v0.AbstractC1663a;
import w1.C1719l1;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: p, reason: collision with root package name */
    public final int f9671p;

    /* renamed from: q, reason: collision with root package name */
    public final C1719l1 f9672q;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
        this.f9671p = -1;
        new SparseIntArray();
        new SparseIntArray();
        C1719l1 c1719l1 = new C1719l1(1);
        this.f9672q = c1719l1;
        new Rect();
        int i9 = u.w(context, attributeSet, i7, i8).f1305c;
        if (i9 == this.f9671p) {
            return;
        }
        if (i9 < 1) {
            throw new IllegalArgumentException(k.d(i9, "Span count should be at least 1. Provided "));
        }
        this.f9671p = i9;
        ((SparseIntArray) c1719l1.f17771a).clear();
        H();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void Q(boolean z4) {
        if (z4) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.Q(false);
    }

    public final int R(A a2, C c3, int i7) {
        boolean z4 = c3.f1220c;
        C1719l1 c1719l1 = this.f9672q;
        if (!z4) {
            int i8 = this.f9671p;
            c1719l1.getClass();
            return C1719l1.y(i7, i8);
        }
        RecyclerView recyclerView = (RecyclerView) a2.f1217x;
        if (i7 < 0 || i7 >= recyclerView.f9729o0.a()) {
            StringBuilder j = AbstractC0486a1.j(i7, "invalid position ", ". State item count is ");
            j.append(recyclerView.f9729o0.a());
            j.append(recyclerView.h());
            throw new IndexOutOfBoundsException(j.toString());
        }
        int I7 = !recyclerView.f9729o0.f1220c ? i7 : recyclerView.f9714c.I(i7, 0);
        if (I7 == -1) {
            AbstractC1663a.j(i7, "Cannot find span size for pre layout position. ", "GridLayoutManager");
            return 0;
        }
        int i9 = this.f9671p;
        c1719l1.getClass();
        return C1719l1.y(I7, i9);
    }

    @Override // C0.u
    public final boolean d(v vVar) {
        return vVar instanceof C0094m;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, C0.u
    public final v l() {
        return this.f9673h == 0 ? new C0094m(-2, -1) : new C0094m(-1, -2);
    }

    @Override // C0.u
    public final v m(Context context, AttributeSet attributeSet) {
        return new C0094m(context, attributeSet);
    }

    @Override // C0.u
    public final v n(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0094m((ViewGroup.MarginLayoutParams) layoutParams) : new C0094m(layoutParams);
    }

    @Override // C0.u
    public final int q(A a2, C c3) {
        if (this.f9673h == 1) {
            return this.f9671p;
        }
        if (c3.a() < 1) {
            return 0;
        }
        return R(a2, c3, c3.a() - 1) + 1;
    }

    @Override // C0.u
    public final int x(A a2, C c3) {
        if (this.f9673h == 0) {
            return this.f9671p;
        }
        if (c3.a() < 1) {
            return 0;
        }
        return R(a2, c3, c3.a() - 1) + 1;
    }
}
