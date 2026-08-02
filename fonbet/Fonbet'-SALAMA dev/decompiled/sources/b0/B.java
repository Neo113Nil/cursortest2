package b0;

import a.AbstractC0603a;
import f6.C1111d;
import f6.C1116i;
import i6.InterfaceC1287d;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class B extends AbstractC1362i implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public Throwable f9908a;

    /* renamed from: b, reason: collision with root package name */
    public int f9909b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ O f9910c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(O o7, InterfaceC1287d interfaceC1287d) {
        super(1, interfaceC1287d);
        this.f9910c = o7;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(InterfaceC1287d interfaceC1287d) {
        return new B(this.f9910c, interfaceC1287d);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((B) create((InterfaceC1287d) obj)).invokeSuspend(C1116i.f13008a);
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        i0 i0Var;
        j6.a aVar = j6.a.f14642a;
        int i7 = this.f9909b;
        O o7 = this.f9910c;
        try {
        } catch (Throwable th2) {
            h0 g3 = o7.g();
            this.f9908a = th2;
            this.f9909b = 2;
            Integer a2 = g3.a();
            if (a2 == aVar) {
                return aVar;
            }
            th = th2;
            obj = a2;
        }
        if (i7 == 0) {
            AbstractC0603a.p0(obj);
            this.f9909b = 1;
            obj = O.f(o7, true, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = this.f9908a;
                AbstractC0603a.p0(obj);
                i0Var = new b0(th, ((Number) obj).intValue());
                return new C1111d(i0Var, Boolean.TRUE);
            }
            AbstractC0603a.p0(obj);
        }
        i0Var = (i0) obj;
        return new C1111d(i0Var, Boolean.TRUE);
    }
}
