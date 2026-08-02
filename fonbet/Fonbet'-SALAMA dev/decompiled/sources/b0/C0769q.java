package b0;

import a.AbstractC0603a;
import f6.C1116i;
import i6.InterfaceC1287d;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;

/* renamed from: b0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0769q extends AbstractC1362i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f10088a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f10089b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0769q(i0 i0Var, InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
        this.f10089b = i0Var;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        C0769q c0769q = new C0769q(this.f10089b, interfaceC1287d);
        c0769q.f10088a = obj;
        return c0769q;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0769q) create((i0) obj, (InterfaceC1287d) obj2)).invokeSuspend(C1116i.f13008a);
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        j6.a aVar = j6.a.f14642a;
        AbstractC0603a.p0(obj);
        i0 i0Var = (i0) this.f10088a;
        return Boolean.valueOf((i0Var instanceof C0756d) && i0Var.f10053a <= this.f10089b.f10053a);
    }
}
