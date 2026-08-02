package b0;

import a.AbstractC0603a;
import f6.C1116i;
import i6.InterfaceC1287d;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class H extends AbstractC1362i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f9937a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC1362i f9938b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0756d f9939c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public H(Function2 function2, C0756d c0756d, InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
        this.f9938b = (AbstractC1362i) function2;
        this.f9939c = c0756d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [k6.i, kotlin.jvm.functions.Function2] */
    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        return new H(this.f9938b, this.f9939c, interfaceC1287d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((H) create((D6.C) obj, (InterfaceC1287d) obj2)).invokeSuspend(C1116i.f13008a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [k6.i, kotlin.jvm.functions.Function2] */
    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        j6.a aVar = j6.a.f14642a;
        int i7 = this.f9937a;
        if (i7 == 0) {
            AbstractC0603a.p0(obj);
            Object obj2 = this.f9939c.f10021b;
            this.f9937a = 1;
            obj = this.f9938b.invoke(obj2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0603a.p0(obj);
        }
        return obj;
    }
}
