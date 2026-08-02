package P5;

import a.AbstractC0603a;
import f6.C1116i;
import i6.InterfaceC1287d;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class C extends AbstractC1362i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5594a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0.e f5595b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f5596c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(e0.e eVar, boolean z4, InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
        this.f5595b = eVar;
        this.f5596c = z4;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        C c3 = new C(this.f5595b, this.f5596c, interfaceC1287d);
        c3.f5594a = obj;
        return c3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C c3 = (C) create((e0.b) obj, (InterfaceC1287d) obj2);
        C1116i c1116i = C1116i.f13008a;
        c3.invokeSuspend(c1116i);
        return c1116i;
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        j6.a aVar = j6.a.f14642a;
        AbstractC0603a.p0(obj);
        ((e0.b) this.f5594a).d(this.f5595b, Boolean.valueOf(this.f5596c));
        return C1116i.f13008a;
    }
}
