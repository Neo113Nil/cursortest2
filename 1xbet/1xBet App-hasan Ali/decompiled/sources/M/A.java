package M;

import L.C0214b;
import L.C0216d;
import i4.InterfaceC2015a;
import u.z0;
import y.C2654j;
import z0.AbstractC2749f;

/* loaded from: classes.dex */
public final class A extends kotlin.jvm.internal.m implements InterfaceC2015a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f3128l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ B f3129m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A(B b3, int i) {
        super(0);
        this.f3128l = i;
        this.f3129m = b3;
    }

    @Override // i4.InterfaceC2015a
    public final Object invoke() {
        int i = 0;
        B b3 = this.f3129m;
        switch (this.f3128l) {
            case 0:
                return g0.f3338a;
            default:
                if (((f0) AbstractC2749f.i(b3, h0.f3345b)) == null) {
                    L.w wVar = b3.f3134E;
                    if (wVar != null) {
                        b3.z0(wVar);
                    }
                } else if (b3.f3134E == null) {
                    C0254z c0254z = new C0254z(i, b3);
                    A a5 = new A(b3, i);
                    z0 z0Var = L.u.f2978a;
                    boolean z3 = L.A.f2896a;
                    C2654j c2654j = b3.f3130A;
                    boolean z5 = b3.f3131B;
                    float f = b3.f3132C;
                    L.w c0216d = z3 ? new C0216d(c2654j, z5, f, c0254z, a5) : new C0214b(c2654j, z5, f, c0254z, a5);
                    b3.y0(c0216d);
                    b3.f3134E = c0216d;
                }
                return W3.o.f6046a;
        }
    }
}
