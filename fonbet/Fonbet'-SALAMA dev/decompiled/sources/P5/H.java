package P5;

import a.AbstractC0603a;
import f6.C1116i;
import i6.InterfaceC1287d;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class H extends AbstractC1362i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5612a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L f5613b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5614c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f5615d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(L l7, String str, String str2, InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
        this.f5613b = l7;
        this.f5614c = str;
        this.f5615d = str2;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        return new H(this.f5613b, this.f5614c, this.f5615d, interfaceC1287d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((H) create((D6.C) obj, (InterfaceC1287d) obj2)).invokeSuspend(C1116i.f13008a);
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        j6.a aVar = j6.a.f14642a;
        int i7 = this.f5612a;
        if (i7 == 0) {
            AbstractC0603a.p0(obj);
            this.f5612a = 1;
            if (L.a(this.f5613b, this.f5614c, this.f5615d, this) == aVar) {
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
