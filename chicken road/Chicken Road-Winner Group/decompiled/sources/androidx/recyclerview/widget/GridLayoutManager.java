package androidx.recyclerview.widget;

import B0.c;
import J1.i;
import U.A;
import U.C0072l;
import U.D;
import U.u;
import U.v;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: p, reason: collision with root package name */
    public final int f2360p;

    /* renamed from: q, reason: collision with root package name */
    public final i f2361q;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i3, int i4) {
        super(context, attributeSet, i3, i4);
        this.f2360p = -1;
        new SparseIntArray();
        new SparseIntArray();
        i iVar = new i(23);
        this.f2361q = iVar;
        new Rect();
        int i5 = u.w(context, attributeSet, i3, i4).f1574c;
        if (i5 == this.f2360p) {
            return;
        }
        if (i5 < 1) {
            throw new IllegalArgumentException(c.h(i5, "Span count should be at least 1. Provided "));
        }
        this.f2360p = i5;
        ((SparseIntArray) iVar.f729b).clear();
        H();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void Q(boolean z3) {
        if (z3) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.Q(false);
    }

    public final int R(A a3, D d3, int i3) {
        boolean z3 = d3.f1485c;
        i iVar = this.f2361q;
        if (!z3) {
            int i4 = this.f2360p;
            iVar.getClass();
            return i.v(i3, i4);
        }
        RecyclerView recyclerView = (RecyclerView) a3.f;
        D d4 = recyclerView.f2393U;
        if (i3 < 0 || i3 >= d4.a()) {
            throw new IndexOutOfBoundsException("invalid position " + i3 + ". State item count is " + d4.a() + recyclerView.h());
        }
        int y = !d4.f1485c ? i3 : recyclerView.f2400c.y(i3, 0);
        if (y != -1) {
            int i5 = this.f2360p;
            iVar.getClass();
            return i.v(y, i5);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i3);
        return 0;
    }

    @Override // U.u
    public final boolean d(v vVar) {
        return vVar instanceof C0072l;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, U.u
    public final v l() {
        return this.f2362h == 0 ? new C0072l(-2, -1) : new C0072l(-1, -2);
    }

    @Override // U.u
    public final v m(Context context, AttributeSet attributeSet) {
        return new C0072l(context, attributeSet);
    }

    @Override // U.u
    public final v n(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0072l((ViewGroup.MarginLayoutParams) layoutParams) : new C0072l(layoutParams);
    }

    @Override // U.u
    public final int q(A a3, D d3) {
        if (this.f2362h == 1) {
            return this.f2360p;
        }
        if (d3.a() < 1) {
            return 0;
        }
        return R(a3, d3, d3.a() - 1) + 1;
    }

    @Override // U.u
    public final int x(A a3, D d3) {
        if (this.f2362h == 0) {
            return this.f2360p;
        }
        if (d3.a() < 1) {
            return 0;
        }
        return R(a3, d3, d3.a() - 1) + 1;
    }
}
