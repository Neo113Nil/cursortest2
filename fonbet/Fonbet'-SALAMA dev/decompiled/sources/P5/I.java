package P5;

import a.AbstractC0603a;
import f6.C1116i;
import i6.InterfaceC1287d;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class I extends AbstractC1362i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5616a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0.e f5617b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f5618c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(e0.e eVar, long j, InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
        this.f5617b = eVar;
        this.f5618c = j;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        I i7 = new I(this.f5617b, this.f5618c, interfaceC1287d);
        i7.f5616a = obj;
        return i7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        I i7 = (I) create((e0.b) obj, (InterfaceC1287d) obj2);
        C1116i c1116i = C1116i.f13008a;
        i7.invokeSuspend(c1116i);
        return c1116i;
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        j6.a aVar = j6.a.f14642a;
        AbstractC0603a.p0(obj);
        ((e0.b) this.f5616a).d(this.f5617b, new Long(this.f5618c));
        return C1116i.f13008a;
    }
}
