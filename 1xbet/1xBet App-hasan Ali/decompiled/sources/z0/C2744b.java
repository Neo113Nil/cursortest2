package z0;

import i4.InterfaceC2015a;
import z.AbstractC2695T;
import z.C2689M;
import z.C2699a;
import z.C2719u;
import z.C2723y;
import z.InterfaceC2692P;

/* renamed from: z0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2744b extends kotlin.jvm.internal.m implements InterfaceC2015a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f21761l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C2746c f21762m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2744b(C2746c c2746c, int i) {
        super(0);
        this.f21761l = i;
        this.f21762m = c2746c;
    }

    @Override // i4.InterfaceC2015a
    public final Object invoke() {
        switch (this.f21761l) {
            case 0:
                this.f21762m.A0();
                break;
            default:
                C2746c c2746c = this.f21762m;
                b0.n nVar = c2746c.f21764y;
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer", nVar);
                C2723y c2723y = (C2723y) nVar;
                c2723y.getClass();
                InterfaceC2692P interfaceC2692P = (InterfaceC2692P) c2746c.J(AbstractC2695T.f21516a);
                C2699a c2699a = c2723y.f21578k;
                c2723y.f21579l.setValue(new C2719u(c2699a, interfaceC2692P));
                c2723y.f21580m.setValue(new C2689M(interfaceC2692P, c2699a));
                break;
        }
        return W3.o.f6046a;
    }
}
