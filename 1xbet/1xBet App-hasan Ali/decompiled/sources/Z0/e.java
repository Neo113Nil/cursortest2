package Z0;

import X3.w;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import n.AbstractC2107A;
import x0.InterfaceC2632s;
import x0.O;
import x0.P;
import x0.Q;
import z0.C2731G;

/* loaded from: classes.dex */
public final class e implements O {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6269a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f6270b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6271c;

    public /* synthetic */ e(ViewGroup viewGroup, Object obj, int i) {
        this.f6269a = i;
        this.f6270b = viewGroup;
        this.f6271c = obj;
    }

    @Override // x0.O
    public final int a(InterfaceC2632s interfaceC2632s, List list, int i) {
        switch (this.f6269a) {
            case 0:
                q qVar = (q) this.f6270b;
                ViewGroup.LayoutParams layoutParams = qVar.getLayoutParams();
                kotlin.jvm.internal.l.c(layoutParams);
                qVar.measure(j.k(qVar, 0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
                return qVar.getMeasuredHeight();
            default:
                return AbstractC2107A.h(this, interfaceC2632s, list, i);
        }
    }

    @Override // x0.O
    public final int b(InterfaceC2632s interfaceC2632s, List list, int i) {
        switch (this.f6269a) {
            case 0:
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                q qVar = (q) this.f6270b;
                ViewGroup.LayoutParams layoutParams = qVar.getLayoutParams();
                kotlin.jvm.internal.l.c(layoutParams);
                qVar.measure(makeMeasureSpec, j.k(qVar, 0, i, layoutParams.height));
                return qVar.getMeasuredWidth();
            default:
                return AbstractC2107A.k(this, interfaceC2632s, list, i);
        }
    }

    @Override // x0.O
    public final P c(Q q5, List list, long j5) {
        switch (this.f6269a) {
            case 0:
                q qVar = (q) this.f6270b;
                int childCount = qVar.getChildCount();
                w wVar = w.f6091k;
                if (childCount == 0) {
                    return q5.i(W0.a.j(j5), W0.a.i(j5), wVar, b.f6260n);
                }
                if (W0.a.j(j5) != 0) {
                    qVar.getChildAt(0).setMinimumWidth(W0.a.j(j5));
                }
                if (W0.a.i(j5) != 0) {
                    qVar.getChildAt(0).setMinimumHeight(W0.a.i(j5));
                }
                int j6 = W0.a.j(j5);
                int h3 = W0.a.h(j5);
                ViewGroup.LayoutParams layoutParams = qVar.getLayoutParams();
                kotlin.jvm.internal.l.c(layoutParams);
                int k5 = j.k(qVar, j6, h3, layoutParams.width);
                int i = W0.a.i(j5);
                int g5 = W0.a.g(j5);
                ViewGroup.LayoutParams layoutParams2 = qVar.getLayoutParams();
                kotlin.jvm.internal.l.c(layoutParams2);
                qVar.measure(k5, j.k(qVar, i, g5, layoutParams2.height));
                return q5.i(qVar.getMeasuredWidth(), qVar.getMeasuredHeight(), wVar, new c(qVar, (C2731G) this.f6271c, 1));
            default:
                ((a1.w) this.f6270b).setParentLayoutDirection((W0.m) this.f6271c);
                return q5.i(0, 0, w.f6091k, a1.c.f6383o);
        }
    }

    @Override // x0.O
    public final int h(InterfaceC2632s interfaceC2632s, List list, int i) {
        switch (this.f6269a) {
            case 0:
                q qVar = (q) this.f6270b;
                ViewGroup.LayoutParams layoutParams = qVar.getLayoutParams();
                kotlin.jvm.internal.l.c(layoutParams);
                qVar.measure(j.k(qVar, 0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
                return qVar.getMeasuredHeight();
            default:
                return AbstractC2107A.b(this, interfaceC2632s, list, i);
        }
    }

    @Override // x0.O
    public final int j(InterfaceC2632s interfaceC2632s, List list, int i) {
        switch (this.f6269a) {
            case 0:
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                q qVar = (q) this.f6270b;
                ViewGroup.LayoutParams layoutParams = qVar.getLayoutParams();
                kotlin.jvm.internal.l.c(layoutParams);
                qVar.measure(makeMeasureSpec, j.k(qVar, 0, i, layoutParams.height));
                return qVar.getMeasuredWidth();
            default:
                return AbstractC2107A.e(this, interfaceC2632s, list, i);
        }
    }
}
