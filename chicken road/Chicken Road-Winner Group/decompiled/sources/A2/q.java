package A2;

import g2.InterfaceC0322f;
import w2.C1240t;
import w2.InterfaceC1230i;
import w2.P;
import w2.Z;

/* loaded from: classes.dex */
public final class q extends kotlin.jvm.internal.k implements o2.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f116e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(n nVar) {
        super(2);
        this.f116e = nVar;
    }

    @Override // o2.p
    public final Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        InterfaceC0322f interfaceC0322f = (InterfaceC0322f) obj2;
        g2.g key = interfaceC0322f.getKey();
        InterfaceC0322f k3 = this.f116e.f111e.k(key);
        if (key != C1240t.f10525b) {
            return Integer.valueOf(interfaceC0322f != k3 ? Integer.MIN_VALUE : intValue + 1);
        }
        P p3 = (P) k3;
        P p4 = (P) interfaceC0322f;
        while (true) {
            if (p4 != null) {
                if (p4 == p3 || !(p4 instanceof B2.s)) {
                    break;
                }
                InterfaceC1230i interfaceC1230i = (InterfaceC1230i) Z.f10493b.get((Z) p4);
                p4 = interfaceC1230i != null ? interfaceC1230i.getParent() : null;
            } else {
                p4 = null;
                break;
            }
        }
        if (p4 == p3) {
            if (p3 != null) {
                intValue++;
            }
            return Integer.valueOf(intValue);
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + p4 + ", expected child of " + p3 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
