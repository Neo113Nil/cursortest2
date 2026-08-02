package I0;

import D6.C;
import G6.s;
import G6.u;
import a.AbstractC0603a;
import android.app.Activity;
import f6.C1116i;
import i6.InterfaceC1287d;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;
import w1.V0;

/* loaded from: classes.dex */
public final class b extends AbstractC1362i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f3488a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f3489b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Activity f3490c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Activity activity, InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
        this.f3489b = cVar;
        this.f3490c = activity;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        return new b(this.f3489b, this.f3490c, interfaceC1287d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((C) obj, (InterfaceC1287d) obj2)).invokeSuspend(C1116i.f13008a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [G6.f] */
    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        j6.a aVar = j6.a.f14642a;
        int i7 = this.f3488a;
        if (i7 == 0) {
            AbstractC0603a.p0(obj);
            c cVar = this.f3489b;
            V0 v02 = new V0(15, cVar.f3491a.a(this.f3490c), cVar, false);
            if (!(v02 instanceof u)) {
                v02 = new G6.f(v02);
            }
            s sVar = new s(cVar, 1);
            this.f3488a = 1;
            if (v02.r(sVar, this) == aVar) {
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
