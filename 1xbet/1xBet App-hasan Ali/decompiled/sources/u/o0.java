package u;

import P.AbstractC0329z;
import P.C0305m0;

/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final A0 f19890a;

    /* renamed from: b, reason: collision with root package name */
    public final C0305m0 f19891b = AbstractC0329z.t(null);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t0 f19892c;

    public o0(t0 t0Var, A0 a02, String str) {
        this.f19892c = t0Var;
        this.f19890a = a02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final n0 a(i4.c cVar, i4.c cVar2) {
        C0305m0 c0305m0 = this.f19891b;
        n0 n0Var = (n0) c0305m0.getValue();
        t0 t0Var = this.f19892c;
        if (n0Var == null) {
            Object c5 = cVar2.c(t0Var.f19937a.e());
            Object c6 = cVar2.c(t0Var.f19937a.e());
            A0 a02 = this.f19890a;
            AbstractC2470q abstractC2470q = (AbstractC2470q) a02.f19643a.c(c6);
            abstractC2470q.d();
            r0 r0Var = new r0(t0Var, c5, abstractC2470q, a02);
            n0Var = new n0(this, r0Var, cVar, cVar2);
            c0305m0.setValue(n0Var);
            t0Var.i.add(r0Var);
        }
        n0Var.f19885m = (kotlin.jvm.internal.m) cVar2;
        n0Var.f19884l = (kotlin.jvm.internal.m) cVar;
        n0Var.b(t0Var.f());
        return n0Var;
    }
}
