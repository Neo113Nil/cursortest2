package b0;

import D6.C0136t;
import a.AbstractC0603a;
import f6.C1116i;
import i6.InterfaceC1287d;
import java.util.concurrent.atomic.AtomicInteger;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;
import w1.C1719l1;

/* loaded from: classes.dex */
public final class J extends AbstractC1362i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f9945a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f9946b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ O f9947c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC1362i f9948d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public J(O o7, Function2 function2, InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
        this.f9947c = o7;
        this.f9948d = (AbstractC1362i) function2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [k6.i, kotlin.jvm.functions.Function2] */
    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        J j = new J(this.f9947c, this.f9948d, interfaceC1287d);
        j.f9946b = obj;
        return j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((J) create((D6.C) obj, (InterfaceC1287d) obj2)).invokeSuspend(C1116i.f13008a);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [k6.i, kotlin.jvm.functions.Function2] */
    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        j6.a aVar = j6.a.f14642a;
        int i7 = this.f9945a;
        if (i7 == 0) {
            AbstractC0603a.p0(obj);
            D6.C c3 = (D6.C) this.f9946b;
            C0136t a2 = D6.E.a();
            O o7 = this.f9947c;
            a0 a0Var = new a0(this.f9948d, a2, o7.f9971h.p(), c3.c());
            k1.g gVar = o7.f9974l;
            Object e7 = ((F6.b) gVar.f14676c).e(a0Var);
            if (e7 instanceof F6.g) {
                F6.g gVar2 = e7 instanceof F6.g ? (F6.g) e7 : null;
                Throwable th = gVar2 != null ? gVar2.f2821a : null;
                if (th == null) {
                    throw new A1.Z("Channel was closed normally");
                }
                throw th;
            }
            if (e7 instanceof F6.h) {
                throw new IllegalStateException("Check failed.");
            }
            if (((AtomicInteger) ((C1719l1) gVar.f14677d).f17771a).getAndIncrement() == 0) {
                D6.E.p((D6.C) gVar.f14674a, new d0(gVar, null));
            }
            this.f9945a = 1;
            obj = a2.j(this);
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
