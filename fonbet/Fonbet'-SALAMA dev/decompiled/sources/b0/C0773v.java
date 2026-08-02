package b0;

import a.AbstractC0603a;
import f6.C1116i;
import i6.InterfaceC1287d;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function1;

/* renamed from: b0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0773v extends AbstractC1362i implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f10105a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F f10106b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0773v(F f7, InterfaceC1287d interfaceC1287d) {
        super(1, interfaceC1287d);
        this.f10106b = f7;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(InterfaceC1287d interfaceC1287d) {
        return new C0773v(this.f10106b, interfaceC1287d);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0773v) create((InterfaceC1287d) obj)).invokeSuspend(C1116i.f13008a);
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        j6.a aVar = j6.a.f14642a;
        int i7 = this.f10105a;
        if (i7 == 0) {
            AbstractC0603a.p0(obj);
            this.f10105a = 1;
            obj = this.f10106b.invoke(this);
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
