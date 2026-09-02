package D1;

/* loaded from: classes.dex */
public final class q extends kotlin.jvm.internal.j implements s1.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ D1.n f249e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(D1.n nVar) {
        super(2);
        this.f249e = nVar;
    }

    @Override // s1.p
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        k1.g gVar = (k1.g) obj2;
        k1.h key = gVar.getKey();
        k1.g m2 = this.f249e.f243e.m(key);
        if (key != z1.C1066t.f8592b) {
            return java.lang.Integer.valueOf(gVar != m2 ? Integer.MIN_VALUE : intValue + 1);
        }
        z1.P p2 = (z1.P) m2;
        z1.P p3 = (z1.P) gVar;
        while (true) {
            if (p3 != null) {
                if (p3 == p2 || !(p3 instanceof E1.t)) {
                    break;
                }
                z1.InterfaceC1056i interfaceC1056i = (z1.InterfaceC1056i) z1.Z.f8556b.get((z1.Z) p3);
                p3 = interfaceC1056i != null ? interfaceC1056i.getParent() : null;
            } else {
                p3 = null;
                break;
            }
        }
        if (p3 == p2) {
            if (p2 != null) {
                intValue++;
            }
            return java.lang.Integer.valueOf(intValue);
        }
        throw new java.lang.IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + p3 + ", expected child of " + p2 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
