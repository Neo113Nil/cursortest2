package H6;

import a.AbstractC0603a;
import f6.C1116i;
import i6.InterfaceC1287d;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class t extends AbstractC1362i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f3457a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3458b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ G6.h f3459c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(G6.h hVar, InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
        this.f3459c = hVar;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        t tVar = new t(this.f3459c, interfaceC1287d);
        tVar.f3458b = obj;
        return tVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create(obj, (InterfaceC1287d) obj2)).invokeSuspend(C1116i.f13008a);
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        j6.a aVar = j6.a.f14642a;
        int i7 = this.f3457a;
        if (i7 == 0) {
            AbstractC0603a.p0(obj);
            Object obj2 = this.f3458b;
            this.f3457a = 1;
            if (this.f3459c.c(obj2, this) == aVar) {
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
