package b0;

import a.AbstractC0603a;
import f6.C1116i;
import i6.InterfaceC1287d;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class g0 extends AbstractC1362i implements Function2 {
    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        return new g0(2, interfaceC1287d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        g0 g0Var = (g0) create((G6.h) obj, (InterfaceC1287d) obj2);
        C1116i c1116i = C1116i.f13008a;
        g0Var.invokeSuspend(c1116i);
        return c1116i;
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        j6.a aVar = j6.a.f14642a;
        AbstractC0603a.p0(obj);
        return C1116i.f13008a;
    }
}
