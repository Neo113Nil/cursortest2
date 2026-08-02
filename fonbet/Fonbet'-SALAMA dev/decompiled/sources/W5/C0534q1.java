package W5;

import U5.AbstractC0438e;
import U5.AbstractC0457y;
import U5.EnumC0446m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import w1.C1726n0;

/* renamed from: W5.q1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0534q1 extends U5.N {

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC0438e f7315f;

    /* renamed from: g, reason: collision with root package name */
    public AbstractC0457y f7316g;

    /* renamed from: h, reason: collision with root package name */
    public EnumC0446m f7317h = EnumC0446m.f6553d;

    public C0534q1(AbstractC0438e abstractC0438e) {
        this.f7315f = abstractC0438e;
    }

    @Override // U5.N
    public final U5.l0 a(U5.K k7) {
        Boolean bool;
        List list = k7.f6430a;
        if (list.isEmpty()) {
            U5.l0 g3 = U5.l0.f6544n.g("NameResolver returned no usable address. addrs=" + list + ", attrs=" + k7.f6431b);
            c(g3);
            return g3;
        }
        Object obj = k7.f6432c;
        if ((obj instanceof C0528o1) && (bool = ((C0528o1) obj).f7302a) != null && bool.booleanValue()) {
            ArrayList arrayList = new ArrayList(list);
            Collections.shuffle(arrayList, new Random());
            list = arrayList;
        }
        AbstractC0457y abstractC0457y = this.f7316g;
        if (abstractC0457y == null) {
            android.support.v4.media.session.t E7 = C1726n0.E();
            E7.x0(list);
            C1726n0 T6 = E7.T();
            AbstractC0438e abstractC0438e = this.f7315f;
            AbstractC0457y g7 = abstractC0438e.g(T6);
            g7.o(new C0525n1(this, g7));
            this.f7316g = g7;
            EnumC0446m enumC0446m = EnumC0446m.f6550a;
            C0531p1 c0531p1 = new C0531p1(U5.J.b(g7, null));
            this.f7317h = enumC0446m;
            abstractC0438e.r(enumC0446m, c0531p1);
            g7.l();
        } else {
            abstractC0457y.p(list);
        }
        return U5.l0.f6536e;
    }

    @Override // U5.N
    public final void c(U5.l0 l0Var) {
        AbstractC0457y abstractC0457y = this.f7316g;
        if (abstractC0457y != null) {
            abstractC0457y.m();
            this.f7316g = null;
        }
        EnumC0446m enumC0446m = EnumC0446m.f6552c;
        C0531p1 c0531p1 = new C0531p1(U5.J.a(l0Var));
        this.f7317h = enumC0446m;
        this.f7315f.r(enumC0446m, c0531p1);
    }

    @Override // U5.N
    public final void e() {
        AbstractC0457y abstractC0457y = this.f7316g;
        if (abstractC0457y != null) {
            abstractC0457y.l();
        }
    }

    @Override // U5.N
    public final void f() {
        AbstractC0457y abstractC0457y = this.f7316g;
        if (abstractC0457y != null) {
            abstractC0457y.m();
        }
    }
}
