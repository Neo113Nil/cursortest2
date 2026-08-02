package H6;

import a.AbstractC0603a;
import f6.C1116i;
import i6.InterfaceC1287d;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class g extends AbstractC1362i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f3437a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3438b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f3439c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
        this.f3439c = hVar;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        g gVar = new g(this.f3439c, interfaceC1287d);
        gVar.f3438b = obj;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((G6.h) obj, (InterfaceC1287d) obj2)).invokeSuspend(C1116i.f13008a);
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        j6.a aVar = j6.a.f14642a;
        int i7 = this.f3437a;
        C1116i c1116i = C1116i.f13008a;
        if (i7 == 0) {
            AbstractC0603a.p0(obj);
            G6.h hVar = (G6.h) this.f3438b;
            this.f3437a = 1;
            Object r7 = this.f3439c.f3440d.r(hVar, this);
            if (r7 != aVar) {
                r7 = c1116i;
            }
            if (r7 == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0603a.p0(obj);
        }
        return c1116i;
    }
}
