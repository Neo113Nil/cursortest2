package x;

import P.e1;
import i4.InterfaceC2015a;
import k0.C2023c;
import u.C2475w;
import z0.AbstractC2749f;

/* renamed from: x.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2559E extends kotlin.jvm.internal.m implements InterfaceC2015a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f20622l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C2589k0 f20623m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2559E(C2589k0 c2589k0, int i) {
        super(0);
        this.f20622l = i;
        this.f20623m = c2589k0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        if (r0 != false) goto L13;
     */
    @Override // i4.InterfaceC2015a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        boolean z3;
        boolean z5;
        switch (this.f20622l) {
            case 0:
                r4.c cVar = this.f20623m.f20803E;
                if (cVar != null) {
                    cVar.q(r.f20857a);
                }
                return W3.o.f6046a;
            case 1:
                C2604s0 c2604s0 = this.f20623m.f20810N;
                if (!c2604s0.f20863a.b()) {
                    v.k0 k0Var = c2604s0.f20864b;
                    z3 = false;
                    if (k0Var == null) {
                        z5 = false;
                        break;
                    } else {
                        z5 = k0Var.c();
                        break;
                    }
                }
                z3 = true;
                return Boolean.valueOf(!z3);
            default:
                e1 e1Var = A0.I0.f287h;
                C2589k0 c2589k0 = this.f20623m;
                c2589k0.f20809M.f20822a = new C2475w(new C2023c((W0.c) AbstractC2749f.i(c2589k0, e1Var)));
                return W3.o.f6046a;
        }
    }
}
