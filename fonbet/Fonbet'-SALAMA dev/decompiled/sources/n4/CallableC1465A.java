package n4;

import java.util.HashMap;
import java.util.concurrent.Callable;
import p4.InterfaceC1538a;

/* renamed from: n4.A, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class CallableC1465A implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15354a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1473g f15355b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ D f15356c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f15357d;

    public CallableC1465A(D d7, C1473g c1473g, v4.r rVar) {
        this.f15356c = d7;
        this.f15355b = c1473g;
        this.f15357d = rVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f15354a) {
            case 0:
                D d7 = this.f15356c;
                InterfaceC1538a interfaceC1538a = d7.f15365g;
                C1473g c1473g = this.f15355b;
                s4.h a2 = s4.h.a(c1473g);
                v4.r rVar = (v4.r) this.f15357d;
                interfaceC1538a.v(a2, rVar);
                return D.a(d7, new o4.e(o4.d.f15606e, c1473g, rVar));
            default:
                C1468b A7 = C1468b.A((HashMap) this.f15357d);
                D d8 = this.f15356c;
                InterfaceC1538a interfaceC1538a2 = d8.f15365g;
                C1473g c1473g2 = this.f15355b;
                interfaceC1538a2.b(c1473g2, A7);
                return D.a(d8, new o4.c(o4.d.f15606e, c1473g2, A7));
        }
    }

    public CallableC1465A(D d7, HashMap hashMap, C1473g c1473g) {
        this.f15356c = d7;
        this.f15357d = hashMap;
        this.f15355b = c1473g;
    }
}
