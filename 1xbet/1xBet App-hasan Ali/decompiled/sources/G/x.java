package G;

import E.Z;
import I.O;
import P.AbstractC0329z;
import P.C0305m0;
import z0.InterfaceC2754k;
import z0.InterfaceC2755l;
import z0.InterfaceC2758o;
import z0.e0;

/* loaded from: classes.dex */
public final class x extends b0.o implements InterfaceC2754k, InterfaceC2758o, InterfaceC2755l {

    /* renamed from: A, reason: collision with root package name */
    public O f1754A;

    /* renamed from: B, reason: collision with root package name */
    public final C0305m0 f1755B = AbstractC0329z.t(null);

    /* renamed from: y, reason: collision with root package name */
    public C0129f f1756y;

    /* renamed from: z, reason: collision with root package name */
    public Z f1757z;

    public x(C0129f c0129f, Z z3, O o5) {
        this.f1756y = c0129f;
        this.f1757z = z3;
        this.f1754A = o5;
    }

    @Override // z0.InterfaceC2758o
    public final void T(e0 e0Var) {
        this.f1755B.setValue(e0Var);
    }

    @Override // b0.o
    public final void o0() {
        C0129f c0129f = this.f1756y;
        if (c0129f.f1728a != null) {
            throw new IllegalStateException("Expected textInputModifierNode to be null");
        }
        c0129f.f1728a = this;
    }

    @Override // b0.o
    public final void q0() {
        this.f1756y.k(this);
    }
}
