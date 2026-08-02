package b0;

import a.AbstractC0603a;
import f6.C1116i;
import i6.InterfaceC1287d;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class L extends AbstractC1362i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f9950a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f9951b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ O f9952c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(O o7, InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
        this.f9952c = o7;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        L l7 = new L(this.f9952c, interfaceC1287d);
        l7.f9951b = obj;
        return l7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((L) create((a0) obj, (InterfaceC1287d) obj2)).invokeSuspend(C1116i.f13008a);
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        j6.a aVar = j6.a.f14642a;
        int i7 = this.f9950a;
        if (i7 == 0) {
            AbstractC0603a.p0(obj);
            a0 a0Var = (a0) this.f9951b;
            this.f9950a = 1;
            if (O.c(this.f9952c, a0Var, this) == aVar) {
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
