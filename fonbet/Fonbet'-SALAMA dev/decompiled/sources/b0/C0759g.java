package b0;

import a.AbstractC0603a;
import f6.C1116i;
import i6.InterfaceC1287d;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function1;

/* renamed from: b0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0759g extends AbstractC1362i implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f10043a;

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(InterfaceC1287d interfaceC1287d) {
        return new C0759g(1, interfaceC1287d);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C0759g c0759g = (C0759g) create((InterfaceC1287d) obj);
        C1116i c1116i = C1116i.f13008a;
        c0759g.invokeSuspend(c1116i);
        return c1116i;
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        j6.a aVar = j6.a.f14642a;
        int i7 = this.f10043a;
        if (i7 == 0) {
            AbstractC0603a.p0(obj);
            this.f10043a = 1;
            throw null;
        }
        if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC0603a.p0(obj);
        return C1116i.f13008a;
    }
}
