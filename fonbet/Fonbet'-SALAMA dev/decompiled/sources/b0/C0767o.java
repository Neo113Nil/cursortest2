package b0;

import a.AbstractC0603a;
import f6.C1116i;
import i6.InterfaceC1287d;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;

/* renamed from: b0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0767o extends AbstractC1362i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f10085a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O f10086b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0767o(O o7, InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
        this.f10086b = o7;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        return new C0767o(this.f10086b, interfaceC1287d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0767o) create((G6.h) obj, (InterfaceC1287d) obj2)).invokeSuspend(C1116i.f13008a);
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        j6.a aVar = j6.a.f14642a;
        int i7 = this.f10085a;
        if (i7 == 0) {
            AbstractC0603a.p0(obj);
            this.f10085a = 1;
            if (O.d(this.f10086b, this) == aVar) {
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
