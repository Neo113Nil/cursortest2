package C;

import A.n;
import b0.o;
import b4.EnumC0510a;
import c4.AbstractC0542c;
import h0.C1989c;
import i4.InterfaceC2015a;
import p4.AbstractC2282w;
import x.C2588k;
import x0.InterfaceC2637x;
import z0.A0;
import z0.AbstractC2749f;
import z0.InterfaceC2764v;
import z0.e0;

/* loaded from: classes.dex */
public final class i extends o implements a, InterfaceC2764v, A0 {

    /* renamed from: A, reason: collision with root package name */
    public static final j3.i f797A = new j3.i(2);

    /* renamed from: y, reason: collision with root package name */
    public C2588k f798y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f799z;

    public static final C1989c y0(i iVar, e0 e0Var, InterfaceC2015a interfaceC2015a) {
        C1989c c1989c;
        if (iVar.f7175x && iVar.f799z) {
            e0 u5 = AbstractC2749f.u(iVar);
            if (!e0Var.I0().f7175x) {
                e0Var = null;
            }
            if (e0Var != null && (c1989c = (C1989c) interfaceC2015a.invoke()) != null) {
                C1989c s2 = u5.s(e0Var, false);
                return c1989c.g((Float.floatToRawIntBits(s2.f17194b) & 4294967295L) | (Float.floatToRawIntBits(s2.f17193a) << 32));
            }
        }
        return null;
    }

    @Override // C.a
    public final Object A(e0 e0Var, InterfaceC2015a interfaceC2015a, AbstractC0542c abstractC0542c) {
        Object e3 = AbstractC2282w.e(new h(this, e0Var, interfaceC2015a, new n(this, e0Var, interfaceC2015a), null), abstractC0542c);
        return e3 == EnumC0510a.f7289k ? e3 : W3.o.f6046a;
    }

    @Override // b0.o
    public final boolean l0() {
        return false;
    }

    @Override // z0.A0
    public final Object o() {
        return f797A;
    }

    @Override // z0.InterfaceC2764v
    public final /* synthetic */ void s(long j5) {
    }

    @Override // z0.InterfaceC2764v
    public final void u(InterfaceC2637x interfaceC2637x) {
        this.f799z = true;
    }
}
