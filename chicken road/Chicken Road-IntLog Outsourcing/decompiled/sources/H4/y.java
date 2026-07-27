package H4;

import D4.C0021v;
import D4.InterfaceC0010j;
import D4.X;
import D4.g0;
import k4.InterfaceC1221g;
import k4.InterfaceC1222h;
import t4.InterfaceC1445p;

/* loaded from: classes.dex */
public final class y extends kotlin.jvm.internal.j implements InterfaceC1445p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v f1210e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(v vVar) {
        super(2);
        this.f1210e = vVar;
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        InterfaceC1221g interfaceC1221g = (InterfaceC1221g) obj2;
        InterfaceC1222h key = interfaceC1221g.getKey();
        InterfaceC1221g o2 = this.f1210e.f1204b.o(key);
        if (key != C0021v.f545b) {
            return Integer.valueOf(interfaceC1221g != o2 ? Integer.MIN_VALUE : intValue + 1);
        }
        X x5 = (X) o2;
        X x6 = (X) interfaceC1221g;
        while (true) {
            if (x6 != null) {
                if (x6 == x5 || !(x6 instanceof I4.t)) {
                    break;
                }
                InterfaceC0010j interfaceC0010j = (InterfaceC0010j) g0.f514b.get((g0) x6);
                x6 = interfaceC0010j != null ? interfaceC0010j.getParent() : null;
            } else {
                x6 = null;
                break;
            }
        }
        if (x6 == x5) {
            if (x5 != null) {
                intValue++;
            }
            return Integer.valueOf(intValue);
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + x6 + ", expected child of " + x5 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
