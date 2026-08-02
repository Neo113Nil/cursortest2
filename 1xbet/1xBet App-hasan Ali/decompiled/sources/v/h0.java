package v;

import b4.EnumC0510a;
import h0.C1988b;
import x.C2601q0;
import x.C2604s0;
import z0.C2733I;

/* loaded from: classes.dex */
public final class h0 implements U, k0 {

    /* renamed from: k, reason: collision with root package name */
    public static final h0 f20247k = new h0();

    /* renamed from: l, reason: collision with root package name */
    public static final h0 f20248l = new h0();

    @Override // v.k0
    public long a(long j5, int i, t0.F f) {
        f.getClass();
        C2604s0 c2604s0 = (C2604s0) f.f19446m;
        return new C1988b(C2604s0.a(c2604s0, c2604s0.f20869h, j5, c2604s0.f20868g)).f17191a;
    }

    @Override // v.U
    public void b(C2733I c2733i) {
        c2733i.a();
    }

    @Override // v.k0
    public boolean c() {
        return false;
    }

    @Override // v.k0
    public b0.p d() {
        return b0.m.f7161k;
    }

    @Override // v.k0
    public Object e(long j5, C2601q0 c2601q0, a4.c cVar) {
        C2601q0 c2601q02 = new C2601q0(c2601q0.f20856n, cVar);
        c2601q02.f20855m = j5;
        W3.o oVar = W3.o.f6046a;
        Object invokeSuspend = c2601q02.invokeSuspend(oVar);
        return invokeSuspend == EnumC0510a.f7289k ? invokeSuspend : oVar;
    }
}
