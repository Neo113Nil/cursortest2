package b0;

import a.AbstractC0603a;
import f6.C1116i;
import i6.InterfaceC1287d;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class G extends AbstractC1362i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f9935a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O f9936b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(O o7, InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
        this.f9936b = o7;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        return new G(this.f9936b, interfaceC1287d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((G) create((D6.C) obj, (InterfaceC1287d) obj2)).invokeSuspend(C1116i.f13008a);
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        j6.a aVar = j6.a.f14642a;
        int i7 = this.f9935a;
        O o7 = this.f9936b;
        try {
            if (i7 == 0) {
                AbstractC0603a.p0(obj);
                if (o7.f9971h.p() instanceof Z) {
                    return o7.f9971h.p();
                }
                this.f9935a = 1;
                if (o7.h(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0603a.p0(obj);
                    return (i0) obj;
                }
                AbstractC0603a.p0(obj);
            }
            this.f9935a = 2;
            obj = O.e(o7, false, this);
            if (obj == aVar) {
                return aVar;
            }
            return (i0) obj;
        } catch (Throwable th) {
            return new b0(th, -1);
        }
    }
}
