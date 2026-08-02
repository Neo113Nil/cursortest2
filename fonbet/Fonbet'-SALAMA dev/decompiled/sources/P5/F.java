package P5;

import a.AbstractC0603a;
import f6.C1116i;
import i6.InterfaceC1287d;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class F extends AbstractC1362i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5605a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0.e f5606b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ double f5607c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(e0.e eVar, double d7, InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
        this.f5606b = eVar;
        this.f5607c = d7;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        F f7 = new F(this.f5606b, this.f5607c, interfaceC1287d);
        f7.f5605a = obj;
        return f7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        F f7 = (F) create((e0.b) obj, (InterfaceC1287d) obj2);
        C1116i c1116i = C1116i.f13008a;
        f7.invokeSuspend(c1116i);
        return c1116i;
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        j6.a aVar = j6.a.f14642a;
        AbstractC0603a.p0(obj);
        ((e0.b) this.f5605a).d(this.f5606b, new Double(this.f5607c));
        return C1116i.f13008a;
    }
}
