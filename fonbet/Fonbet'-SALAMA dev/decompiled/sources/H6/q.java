package H6;

import D6.B;
import D6.InterfaceC0118e0;
import i6.InterfaceC1290g;
import i6.InterfaceC1291h;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class q extends t6.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f3453a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(n nVar) {
        super(2);
        this.f3453a = nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        InterfaceC1290g interfaceC1290g = (InterfaceC1290g) obj2;
        InterfaceC1291h key = interfaceC1290g.getKey();
        InterfaceC1290g interfaceC1290g2 = this.f3453a.f3447b.get(key);
        if (key != B.f1775b) {
            return Integer.valueOf(interfaceC1290g != interfaceC1290g2 ? Integer.MIN_VALUE : intValue + 1);
        }
        InterfaceC0118e0 interfaceC0118e0 = (InterfaceC0118e0) interfaceC1290g2;
        InterfaceC0118e0 interfaceC0118e02 = (InterfaceC0118e0) interfaceC1290g;
        while (true) {
            if (interfaceC0118e02 != null) {
                if (interfaceC0118e02 == interfaceC0118e0 || !(interfaceC0118e02 instanceof I6.t)) {
                    break;
                }
                interfaceC0118e02 = interfaceC0118e02.getParent();
            } else {
                interfaceC0118e02 = null;
                break;
            }
        }
        if (interfaceC0118e02 == interfaceC0118e0) {
            if (interfaceC0118e0 != null) {
                intValue++;
            }
            return Integer.valueOf(intValue);
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + interfaceC0118e02 + ", expected child of " + interfaceC0118e0 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
