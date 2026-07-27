package androidx.recyclerview.widget;

import T4.l;
import V0.j;
import W.B;
import W.C0167l;
import W.t;
import W.u;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import b2.AbstractC0279e;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: p, reason: collision with root package name */
    public final int f4617p;

    /* renamed from: q, reason: collision with root package name */
    public final j f4618q;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.f4617p = -1;
        new SparseIntArray();
        new SparseIntArray();
        j jVar = new j(1);
        this.f4618q = jVar;
        new Rect();
        int i6 = t.w(context, attributeSet, i2, i3).f3355c;
        if (i6 == this.f4617p) {
            return;
        }
        if (i6 < 1) {
            throw new IllegalArgumentException(AbstractC0279e.d(i6, "Span count should be at least 1. Provided "));
        }
        this.f4617p = i6;
        ((SparseIntArray) jVar.f3212b).clear();
        H();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void Q(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.Q(false);
    }

    public final int R(l lVar, B b6, int i2) {
        boolean z = b6.f3260c;
        j jVar = this.f4618q;
        if (!z) {
            int i3 = this.f4617p;
            jVar.getClass();
            return j.I(i2, i3);
        }
        RecyclerView recyclerView = (RecyclerView) lVar.f2906f;
        if (i2 < 0 || i2 >= recyclerView.f4655e0.a()) {
            StringBuilder i6 = AbstractC0279e.i(i2, "invalid position ", ". State item count is ");
            i6.append(recyclerView.f4655e0.a());
            i6.append(recyclerView.h());
            throw new IndexOutOfBoundsException(i6.toString());
        }
        int C2 = !recyclerView.f4655e0.f3260c ? i2 : recyclerView.f4650c.C(i2, 0);
        if (C2 != -1) {
            int i7 = this.f4617p;
            jVar.getClass();
            return j.I(C2, i7);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i2);
        return 0;
    }

    @Override // W.t
    public final boolean d(u uVar) {
        return uVar instanceof C0167l;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, W.t
    public final u l() {
        return this.f4619h == 0 ? new C0167l(-2, -1) : new C0167l(-1, -2);
    }

    @Override // W.t
    public final u m(Context context, AttributeSet attributeSet) {
        return new C0167l(context, attributeSet);
    }

    @Override // W.t
    public final u n(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0167l((ViewGroup.MarginLayoutParams) layoutParams) : new C0167l(layoutParams);
    }

    @Override // W.t
    public final int q(l lVar, B b6) {
        if (this.f4619h == 1) {
            return this.f4617p;
        }
        if (b6.a() < 1) {
            return 0;
        }
        return R(lVar, b6, b6.a() - 1) + 1;
    }

    @Override // W.t
    public final int x(l lVar, B b6) {
        if (this.f4619h == 0) {
            return this.f4617p;
        }
        if (b6.a() < 1) {
            return 0;
        }
        return R(lVar, b6, b6.a() - 1) + 1;
    }
}
