package v;

import A0.C0060u;
import z0.AbstractC2749f;
import z0.InterfaceC2754k;

/* loaded from: classes.dex */
public final class O extends b0.o implements InterfaceC2754k, z0.i0 {

    /* renamed from: y, reason: collision with root package name */
    public B.w f20174y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f20175z;

    @Override // z0.i0
    public final void E() {
        kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
        AbstractC2749f.s(this, new C0060u(12, wVar, this));
        B.w wVar2 = (B.w) wVar.f17624k;
        if (this.f20175z) {
            B.w wVar3 = this.f20174y;
            if (wVar3 != null) {
                wVar3.b();
            }
            if (wVar2 != null) {
                wVar2.a();
            } else {
                wVar2 = null;
            }
            this.f20174y = wVar2;
        }
    }

    @Override // b0.o
    public final boolean l0() {
        return false;
    }

    @Override // b0.o
    public final void s0() {
        B.w wVar = this.f20174y;
        if (wVar != null) {
            wVar.b();
        }
        this.f20174y = null;
    }
}
