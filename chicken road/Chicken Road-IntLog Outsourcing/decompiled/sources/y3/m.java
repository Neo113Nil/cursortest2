package y3;

import java.io.UncheckedIOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class m implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public static final K4.i f12422a;

    static {
        AtomicInteger atomicInteger = g.f12395n;
        f12422a = new K4.i(2, false);
    }

    public final void A(C1568b c1568b, String str, g gVar) {
        if (str == null || str.isEmpty()) {
            return;
        }
        if (gVar.f12396a) {
            S(c1568b, str, gVar.e(), gVar);
        } else {
            T(c1568b, (byte[]) gVar.c(byte[].class));
        }
    }

    public abstract void C(C1568b c1568b, boolean z);

    public abstract void D(C1568b c1568b, byte[] bArr);

    public abstract void E(C1568b c1568b, double d6);

    public abstract void F();

    public abstract void G();

    public abstract void H();

    public abstract void I(C1568b c1568b, C1567a c1567a);

    public abstract void J(C1568b c1568b, int i2);

    public abstract void K(C1568b c1568b, long j2);

    public abstract void L(C1568b c1568b, long j2);

    public abstract void M(String str, byte[] bArr);

    public abstract void N(C1568b c1568b, String str);

    public void O(C1568b c1568b, String str, g gVar) {
        N(c1568b, str);
    }

    public abstract void P(C1568b c1568b, int i2);

    public abstract void Q(C1568b c1568b);

    public abstract void R(C1568b c1568b, int i2);

    public abstract void S(C1568b c1568b, String str, int i2, g gVar);

    public abstract void T(C1568b c1568b, byte[] bArr);

    public abstract void U(C1568b c1568b, String str);

    public void V(C1568b c1568b, String str, g gVar) {
        U(c1568b, str);
    }

    public abstract void W(C1568b c1568b, int i2);

    public final void a(C1568b c1568b, AbstractC1571e abstractC1571e) {
        P(c1568b, abstractC1571e.a());
        abstractC1571e.c(this);
        F();
    }

    public final void b(C1568b c1568b, Q2.g gVar, g gVar2) {
        A3.a aVar = A3.a.f39b;
        P(c1568b, gVar2.e());
        aVar.c(this, gVar, gVar2);
        F();
    }

    public final void c(C1568b c1568b, Object obj, Object obj2, n nVar, g gVar) {
        P(c1568b, gVar.e());
        nVar.b(this, obj, obj2, gVar);
        F();
    }

    public abstract void g(C1568b c1568b, List list);

    public abstract void o(C1568b c1568b, AbstractC1571e[] abstractC1571eArr);

    public abstract void p(C1568b c1568b, List list, o oVar, g gVar);

    public final void q(C1568b c1568b, Map map, n nVar, g gVar, K4.i iVar) {
        Q(c1568b);
        if (!map.isEmpty()) {
            l lVar = (l) gVar.d(iVar, new D3.h(8));
            lVar.f12418a = c1568b;
            lVar.f12419b = this;
            lVar.f12420c = nVar;
            lVar.f12421d = gVar;
            try {
                map.forEach(lVar);
            } catch (UncheckedIOException e3) {
                throw e3.getCause();
            }
        }
        G();
    }

    public final void y(C1568b c1568b, byte[] bArr) {
        if (bArr.length == 0) {
            return;
        }
        T(c1568b, bArr);
    }
}
