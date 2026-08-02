package Qj0;

import Je.InterfaceC3394a;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.tracker.process.lifecycle.ApplicationLifecycleState;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.performance.TraceControllerImpl$syncSendAllPerfEvents$2", f = "TraceController.kt", l = {520, 422, 424}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class i0 extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    Object f23656d;

    /* renamed from: e, reason: collision with root package name */
    Y f23657e;

    /* renamed from: f, reason: collision with root package name */
    int f23658f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Y f23659g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ ApplicationLifecycleState f23660h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ Function1<Integer, Unit> f23661i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    i0(Y y11, ApplicationLifecycleState applicationLifecycleState, Function1<? super Integer, Unit> function1, kotlin.coroutines.d<? super i0> dVar) {
        super(2, dVar);
        this.f23659g = y11;
        this.f23660h = applicationLifecycleState;
        this.f23661i = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new i0(this.f23659g, this.f23660h, this.f23661i, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((i0) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x009c, code lost:
    
        if (Qj0.Y.w(r5, r10, r9) == r0) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00b5  */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Je.d dVar;
        InterfaceC3394a interfaceC3394a;
        Y y11;
        LinkedBlockingQueue linkedBlockingQueue;
        List list;
        LinkedBlockingQueue linkedBlockingQueue2;
        List list2;
        Tc.b B11;
        LinkedBlockingQueue linkedBlockingQueue3;
        List list3;
        List list4;
        Function1<Integer, Unit> function1;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f23658f;
        Y y12 = this.f23659g;
        try {
            if (i11 == 0) {
                Sc.s.b(obj);
                dVar = y12.f23560k;
                this.f23656d = dVar;
                this.f23657e = y12;
                this.f23658f = 1;
                if (dVar.a(this) != aVar) {
                    interfaceC3394a = dVar;
                    y11 = y12;
                }
                return aVar;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list4 = (List) this.f23656d;
                    Sc.s.b(obj);
                    function1 = this.f23661i;
                    if (function1 != null) {
                        return null;
                    }
                    function1.invoke(new Integer(list4.size()));
                    return Unit.f71690a;
                }
                ?? r12 = (List) this.f23656d;
                Sc.s.b(obj);
                B11 = r12;
                int size = B11.size();
                this.f23656d = B11;
                this.f23658f = 3;
                if (Y.r(y12, this.f23660h, size, this) != aVar) {
                    list4 = B11;
                    function1 = this.f23661i;
                    if (function1 != null) {
                    }
                }
                return aVar;
            }
            y11 = this.f23657e;
            interfaceC3394a = (InterfaceC3394a) this.f23656d;
            Sc.s.b(obj);
            linkedBlockingQueue = y11.f23561l;
            int size2 = linkedBlockingQueue.size();
            list = y11.f23562m;
            Tc.b builder = new Tc.b(size2 + list.size());
            linkedBlockingQueue2 = y11.f23561l;
            linkedBlockingQueue2.drainTo(builder);
            list2 = y11.f23562m;
            Intrinsics.checkNotNullExpressionValue(list2, "access$getFailedTraces$p(...)");
            builder.addAll(list2);
            Intrinsics.checkNotNullParameter(builder, "builder");
            B11 = builder.B();
            linkedBlockingQueue3 = y11.f23561l;
            linkedBlockingQueue3.clear();
            list3 = y11.f23562m;
            list3.clear();
            interfaceC3394a.c(null);
            this.f23656d = B11;
            this.f23657e = null;
            this.f23658f = 2;
        } catch (Throwable th2) {
            interfaceC3394a.c(null);
            throw th2;
        }
    }
}
