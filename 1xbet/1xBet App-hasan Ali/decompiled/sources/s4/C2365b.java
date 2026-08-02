package s4;

import b4.EnumC0510a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p4.AbstractC2282w;
import p4.InterfaceC2280u;

/* renamed from: s4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2365b extends t4.g {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f19255p = AtomicIntegerFieldUpdater.newUpdater(C2365b.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;

    /* renamed from: n, reason: collision with root package name */
    public final r4.c f19256n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f19257o;

    public /* synthetic */ C2365b(r4.c cVar, boolean z3) {
        this(cVar, z3, a4.i.f6649k, -3, r4.a.f19106k);
    }

    @Override // s4.InterfaceC2368e
    public final Object a(InterfaceC2369f interfaceC2369f, a4.c cVar) {
        W3.o oVar = W3.o.f6046a;
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        if (this.f19605l == -3) {
            boolean z3 = this.f19257o;
            if (z3 && f19255p.getAndSet(this, 1) != 0) {
                throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
            }
            Object f = C.f(interfaceC2369f, this.f19256n, z3, cVar);
            if (f == enumC0510a) {
                return f;
            }
        } else {
            Object e3 = AbstractC2282w.e(new t4.e(interfaceC2369f, this, null), cVar);
            if (e3 != enumC0510a) {
                e3 = oVar;
            }
            if (e3 == enumC0510a) {
                return e3;
            }
        }
        return oVar;
    }

    @Override // t4.g
    public final String c() {
        return "channel=" + this.f19256n;
    }

    @Override // t4.g
    public final Object d(r4.o oVar, t4.f fVar) {
        Object f = C.f(new t4.w(oVar), this.f19256n, this.f19257o, fVar);
        return f == EnumC0510a.f7289k ? f : W3.o.f6046a;
    }

    @Override // t4.g
    public final t4.g e(a4.h hVar, int i, r4.a aVar) {
        return new C2365b(this.f19256n, this.f19257o, hVar, i, aVar);
    }

    @Override // t4.g
    public final InterfaceC2368e f() {
        return new C2365b(this.f19256n, this.f19257o);
    }

    @Override // t4.g
    public final r4.p g(InterfaceC2280u interfaceC2280u) {
        if (!this.f19257o || f19255p.getAndSet(this, 1) == 0) {
            return this.f19605l == -3 ? this.f19256n : super.g(interfaceC2280u);
        }
        throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
    }

    public C2365b(r4.c cVar, boolean z3, a4.h hVar, int i, r4.a aVar) {
        super(hVar, i, aVar);
        this.f19256n = cVar;
        this.f19257o = z3;
        this.consumed$volatile = 0;
    }
}
