package n4;

import A1.x0;
import i4.C1265b;
import i4.C1266c;
import n1.C1450e;

/* renamed from: n4.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC1475i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15424a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15425b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15426c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f15427d;

    public /* synthetic */ RunnableC1475i(Object obj, C1266c c1266c, C1265b c1265b, int i7) {
        this.f15424a = i7;
        this.f15427d = obj;
        this.f15425b = c1266c;
        this.f15426c = c1265b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15424a) {
            case 0:
                ((B1.m) this.f15427d).m((C1266c) this.f15425b, false, (C1265b) this.f15426c);
                break;
            case 1:
                ((C1478l) this.f15427d).f15439b.m((C1266c) this.f15425b, false, (C1265b) this.f15426c);
                break;
            default:
                x0 x0Var = (x0) this.f15426c;
                C1450e c1450e = ((C1479m) x0Var.f613b).f15450d;
                s4.h hVar = (s4.h) this.f15427d;
                v4.r rVar = (v4.r) c1450e.f15308b;
                C1473g c1473g = hVar.f16172a;
                v4.r g3 = rVar.g(c1473g);
                if (!g3.isEmpty()) {
                    C1479m c1479m = (C1479m) x0Var.f613b;
                    c1479m.m(c1479m.f15458m.g(c1473g, g3));
                    ((M) this.f15425b).d(null);
                    break;
                }
                break;
        }
    }

    public RunnableC1475i(x0 x0Var, s4.h hVar, M m7) {
        this.f15424a = 2;
        this.f15426c = x0Var;
        this.f15427d = hVar;
        this.f15425b = m7;
    }
}
