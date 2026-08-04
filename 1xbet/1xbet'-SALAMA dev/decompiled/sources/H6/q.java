package H6;

import D6.B;
import D6.InterfaceC0118e0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends t6.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f3453a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(n nVar) {
        super(2);
        this.f3453a = nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        p065i6.g gVar = (p065i6.g) obj2;
        p065i6.h key = gVar.getKey();
        p065i6.g gVar2 = this.f3453a.f3447b.get(key);
        if (key != B.f1775b) {
            return Integer.valueOf(gVar != gVar2 ? Integer.MIN_VALUE : iIntValue + 1);
        }
        InterfaceC0118e0 interfaceC0118e0 = (InterfaceC0118e0) gVar2;
        InterfaceC0118e0 parent = (InterfaceC0118e0) gVar;
        while (true) {
            if (parent != null) {
                if (parent == interfaceC0118e0 || !(parent instanceof I6.t)) {
                    break;
                }
                parent = parent.getParent();
            } else {
                parent = null;
                break;
            }
        }
        if (parent == interfaceC0118e0) {
            if (interfaceC0118e0 != null) {
                iIntValue++;
            }
            return Integer.valueOf(iIntValue);
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + parent + ", expected child of " + interfaceC0118e0 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
