package P5;

import a.AbstractC0603a;
import f6.C1116i;
import i6.InterfaceC1287d;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;

/* renamed from: P5.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0399k extends AbstractC1362i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5659a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0.e f5660b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5661c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0399k(e0.e eVar, String str, InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
        this.f5660b = eVar;
        this.f5661c = str;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        C0399k c0399k = new C0399k(this.f5660b, this.f5661c, interfaceC1287d);
        c0399k.f5659a = obj;
        return c0399k;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C0399k c0399k = (C0399k) create((e0.b) obj, (InterfaceC1287d) obj2);
        C1116i c1116i = C1116i.f13008a;
        c0399k.invokeSuspend(c1116i);
        return c1116i;
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        j6.a aVar = j6.a.f14642a;
        AbstractC0603a.p0(obj);
        ((e0.b) this.f5659a).d(this.f5660b, this.f5661c);
        return C1116i.f13008a;
    }
}
