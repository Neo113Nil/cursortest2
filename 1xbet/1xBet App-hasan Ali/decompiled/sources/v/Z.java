package v;

import h0.C1988b;
import i4.InterfaceC2015a;
import x0.InterfaceC2637x;

/* loaded from: classes.dex */
public final class Z extends kotlin.jvm.internal.m implements InterfaceC2015a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f20188l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b0 f20189m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Z(b0 b0Var, int i) {
        super(0);
        this.f20188l = i;
        this.f20189m = b0Var;
    }

    @Override // i4.InterfaceC2015a
    public final Object invoke() {
        switch (this.f20188l) {
            case 0:
                InterfaceC2637x interfaceC2637x = (InterfaceC2637x) this.f20189m.f20202E.getValue();
                return new C1988b(interfaceC2637x != null ? interfaceC2637x.J(0L) : 9205357640488583168L);
            case 1:
                return new C1988b(this.f20189m.f20204G);
            default:
                this.f20189m.A0();
                return W3.o.f6046a;
        }
    }
}
