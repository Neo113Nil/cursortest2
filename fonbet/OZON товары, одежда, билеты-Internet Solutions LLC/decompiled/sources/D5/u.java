package D5;

import E5.a;
import J5.t;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class u implements c, a.InterfaceC0168a {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f6075a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f6076b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final t.a f6077c;

    /* renamed from: d, reason: collision with root package name */
    private final E5.d f6078d;

    /* renamed from: e, reason: collision with root package name */
    private final E5.d f6079e;

    /* renamed from: f, reason: collision with root package name */
    private final E5.d f6080f;

    public u(K5.b bVar, J5.t tVar) {
        tVar.getClass();
        this.f6075a = tVar.f();
        this.f6077c = tVar.e();
        E5.a<Float, Float> h11 = tVar.d().h();
        this.f6078d = (E5.d) h11;
        E5.a<Float, Float> h12 = tVar.b().h();
        this.f6079e = (E5.d) h12;
        E5.a<Float, Float> h13 = tVar.c().h();
        this.f6080f = (E5.d) h13;
        bVar.i(h11);
        bVar.i(h12);
        bVar.i(h13);
        h11.a(this);
        h12.a(this);
        h13.a(this);
    }

    final void c(a.InterfaceC0168a interfaceC0168a) {
        this.f6076b.add(interfaceC0168a);
    }

    public final E5.d d() {
        return this.f6079e;
    }

    @Override // E5.a.InterfaceC0168a
    public final void f() {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f6076b;
            if (i11 >= arrayList.size()) {
                return;
            }
            ((a.InterfaceC0168a) arrayList.get(i11)).f();
            i11++;
        }
    }

    @Override // D5.c
    public final void g(List<c> list, List<c> list2) {
    }

    public final E5.d h() {
        return this.f6080f;
    }

    public final E5.d i() {
        return this.f6078d;
    }

    final t.a j() {
        return this.f6077c;
    }

    public final boolean k() {
        return this.f6075a;
    }
}
