package b0;

import a.AbstractC0603a;
import f6.C1116i;
import i6.InterfaceC1287d;
import k6.AbstractC1362i;

/* loaded from: classes.dex */
public final class r extends AbstractC1362i implements s6.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10090a = 1;

    /* renamed from: b, reason: collision with root package name */
    public int f10091b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f10092c;

    public /* synthetic */ r(int i7, InterfaceC1287d interfaceC1287d) {
        super(i7, interfaceC1287d);
    }

    @Override // s6.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f10090a) {
            case 0:
                return new r((O) this.f10092c, (InterfaceC1287d) obj3).invokeSuspend(C1116i.f13008a);
            default:
                ((Boolean) obj2).getClass();
                r rVar = new r(3, (InterfaceC1287d) obj3);
                rVar.f10092c = (Q) obj;
                return rVar.invokeSuspend(C1116i.f13008a);
        }
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        switch (this.f10090a) {
            case 0:
                j6.a aVar = j6.a.f14642a;
                int i7 = this.f10091b;
                if (i7 == 0) {
                    AbstractC0603a.p0(obj);
                    this.f10091b = 1;
                    if (O.b((O) this.f10092c, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0603a.p0(obj);
                }
                return C1116i.f13008a;
            default:
                j6.a aVar2 = j6.a.f14642a;
                int i8 = this.f10091b;
                if (i8 == 0) {
                    AbstractC0603a.p0(obj);
                    Q q7 = (Q) this.f10092c;
                    this.f10091b = 1;
                    q7.getClass();
                    obj = Q.a(q7, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0603a.p0(obj);
                }
                return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(O o7, InterfaceC1287d interfaceC1287d) {
        super(3, interfaceC1287d);
        this.f10092c = o7;
    }
}
