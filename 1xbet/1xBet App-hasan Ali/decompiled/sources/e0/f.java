package e0;

import A.s;
import b0.o;
import e2.C1930k;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.w;
import r3.AbstractC2349a;
import t3.AbstractC2425d;
import x0.InterfaceC2637x;
import z0.A0;
import z0.AbstractC2749f;
import z0.InterfaceC2764v;

/* loaded from: classes.dex */
public final class f extends o implements A0, InterfaceC2764v {

    /* renamed from: A, reason: collision with root package name */
    public long f16898A;

    /* renamed from: y, reason: collision with root package name */
    public f f16899y;

    /* renamed from: z, reason: collision with root package name */
    public f f16900z;

    public final void A0(C1930k c1930k) {
        f fVar = this.f16900z;
        if (fVar != null) {
            fVar.A0(c1930k);
        }
        f fVar2 = this.f16899y;
        if (fVar2 != null) {
            fVar2.A0(c1930k);
        }
        this.f16899y = null;
    }

    public final void B0(C1930k c1930k) {
        A0 a02;
        f fVar;
        f fVar2 = this.f16899y;
        if (fVar2 == null || !AbstractC2349a.j(fVar2, AbstractC2425d.x(c1930k))) {
            if (this.f7162k.f7175x) {
                w wVar = new w();
                AbstractC2749f.z(this, new s(wVar, this, c1930k, 6));
                a02 = (A0) wVar.f17624k;
            } else {
                a02 = null;
            }
            fVar = (f) a02;
        } else {
            fVar = fVar2;
        }
        if (fVar != null && fVar2 == null) {
            fVar.z0(c1930k);
            fVar.B0(c1930k);
            f fVar3 = this.f16900z;
            if (fVar3 != null) {
                fVar3.A0(c1930k);
            }
        } else if (fVar == null && fVar2 != null) {
            f fVar4 = this.f16900z;
            if (fVar4 != null) {
                fVar4.z0(c1930k);
                fVar4.B0(c1930k);
            }
            fVar2.A0(c1930k);
        } else if (!l.a(fVar, fVar2)) {
            if (fVar != null) {
                fVar.z0(c1930k);
                fVar.B0(c1930k);
            }
            if (fVar2 != null) {
                fVar2.A0(c1930k);
            }
        } else if (fVar != null) {
            fVar.B0(c1930k);
        } else {
            f fVar5 = this.f16900z;
            if (fVar5 != null) {
                fVar5.B0(c1930k);
            }
        }
        this.f16899y = fVar;
    }

    public final void C0(C1930k c1930k) {
        f fVar = this.f16900z;
        if (fVar != null) {
            fVar.C0(c1930k);
            return;
        }
        f fVar2 = this.f16899y;
        if (fVar2 != null) {
            fVar2.C0(c1930k);
        }
    }

    @Override // z0.A0
    public final Object o() {
        return d.f16895a;
    }

    @Override // b0.o
    public final void q0() {
        this.f16900z = null;
        this.f16899y = null;
    }

    @Override // z0.InterfaceC2764v
    public final void s(long j5) {
        this.f16898A = j5;
    }

    @Override // z0.InterfaceC2764v
    public final /* synthetic */ void u(InterfaceC2637x interfaceC2637x) {
    }

    public final boolean y0(C1930k c1930k) {
        f fVar = this.f16899y;
        if (fVar != null) {
            return fVar.y0(c1930k);
        }
        f fVar2 = this.f16900z;
        if (fVar2 != null) {
            return fVar2.y0(c1930k);
        }
        return false;
    }

    public final void z0(C1930k c1930k) {
        f fVar = this.f16900z;
        if (fVar != null) {
            fVar.z0(c1930k);
            return;
        }
        f fVar2 = this.f16899y;
        if (fVar2 != null) {
            fVar2.z0(c1930k);
        }
    }
}
