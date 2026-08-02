package n4;

import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.Callable;
import p4.InterfaceC1538a;

/* loaded from: classes2.dex */
public final class t implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15476a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E f15477b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1473g f15478c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ D f15479d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f15480e;

    public /* synthetic */ t(D d7, E e7, C1473g c1473g, Object obj, int i7) {
        this.f15476a = i7;
        this.f15479d = d7;
        this.f15477b = e7;
        this.f15478c = c1473g;
        this.f15480e = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f15476a) {
            case 0:
                E e7 = this.f15477b;
                D d7 = this.f15479d;
                s4.h hVar = (s4.h) d7.f15361c.get(e7);
                if (hVar == null) {
                    break;
                } else {
                    C1473g c1473g = this.f15478c;
                    C1473g D7 = C1473g.D(hVar.f16172a, c1473g);
                    C1468b A7 = C1468b.A((HashMap) this.f15480e);
                    d7.f15365g.b(c1473g, A7);
                    break;
                }
            default:
                D d8 = this.f15479d;
                s4.h hVar2 = (s4.h) d8.f15361c.get(this.f15477b);
                if (hVar2 == null) {
                    break;
                } else {
                    C1473g c1473g2 = hVar2.f16172a;
                    C1473g c1473g3 = this.f15478c;
                    C1473g D8 = C1473g.D(c1473g2, c1473g3);
                    s4.h a2 = D8.isEmpty() ? hVar2 : s4.h.a(c1473g3);
                    InterfaceC1538a interfaceC1538a = d8.f15365g;
                    v4.r rVar = (v4.r) this.f15480e;
                    interfaceC1538a.v(a2, rVar);
                    break;
                }
        }
        return Collections.emptyList();
    }
}
