package P5;

import a.AbstractC0603a;
import f6.C1116i;
import i6.InterfaceC1287d;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class E extends AbstractC1362i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5601a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L f5602b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5603c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f5604d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(L l7, String str, String str2, InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
        this.f5602b = l7;
        this.f5603c = str;
        this.f5604d = str2;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        return new E(this.f5602b, this.f5603c, this.f5604d, interfaceC1287d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((E) create((D6.C) obj, (InterfaceC1287d) obj2)).invokeSuspend(C1116i.f13008a);
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        j6.a aVar = j6.a.f14642a;
        int i7 = this.f5601a;
        if (i7 == 0) {
            AbstractC0603a.p0(obj);
            this.f5601a = 1;
            if (L.a(this.f5602b, this.f5603c, this.f5604d, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0603a.p0(obj);
        }
        return C1116i.f13008a;
    }
}
