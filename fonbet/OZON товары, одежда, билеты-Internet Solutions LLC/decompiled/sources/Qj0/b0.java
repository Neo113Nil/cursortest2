package Qj0;

import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.tracker.performance.model.TraceEntity;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.performance.TraceControllerImpl$collectAndSendEvents$2", f = "TraceController.kt", l = {520, 185}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class b0 extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    Je.d f23610d;

    /* renamed from: e, reason: collision with root package name */
    Y f23611e;

    /* renamed from: f, reason: collision with root package name */
    List f23612f;

    /* renamed from: g, reason: collision with root package name */
    int f23613g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ Y f23614h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ List<TraceEntity> f23615i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b0(Y y11, List<TraceEntity> list, kotlin.coroutines.d<? super b0> dVar) {
        super(2, dVar);
        this.f23614h = y11;
        this.f23615i = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new b0(this.f23614h, this.f23615i, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((b0) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b1, code lost:
    
        if (Qj0.Y.w(r4, r1, r8) == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Je.d dVar;
        List<TraceEntity> list;
        Y y11;
        LinkedBlockingQueue linkedBlockingQueue;
        LinkedBlockingQueue linkedBlockingQueue2;
        List list2;
        LinkedBlockingQueue linkedBlockingQueue3;
        List list3;
        List list4;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f23613g;
        Y y12 = this.f23614h;
        try {
            if (i11 == 0) {
                Sc.s.b(obj);
                dVar = y12.f23560k;
                this.f23610d = dVar;
                this.f23611e = y12;
                list = this.f23615i;
                this.f23612f = list;
                this.f23613g = 1;
                if (dVar.a(this) != aVar) {
                    y11 = y12;
                }
                return aVar;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                return Unit.f71690a;
            }
            list = this.f23612f;
            y11 = this.f23611e;
            dVar = this.f23610d;
            Sc.s.b(obj);
            linkedBlockingQueue = y11.f23561l;
            linkedBlockingQueue.addAll(list);
            linkedBlockingQueue2 = y11.f23561l;
            if (linkedBlockingQueue2.size() < y11.f23551b.q()) {
                return Unit.f71690a;
            }
            int q11 = y11.f23551b.q();
            list2 = y11.f23562m;
            Tc.b builder = new Tc.b(q11 + list2.size());
            linkedBlockingQueue3 = y11.f23561l;
            linkedBlockingQueue3.drainTo(builder, y11.f23551b.q());
            list3 = y11.f23562m;
            Intrinsics.checkNotNullExpressionValue(list3, "access$getFailedTraces$p(...)");
            builder.addAll(list3);
            list4 = y11.f23562m;
            list4.clear();
            Intrinsics.checkNotNullParameter(builder, "builder");
            Tc.b B11 = builder.B();
            dVar.c(null);
            this.f23610d = null;
            this.f23611e = null;
            this.f23612f = null;
            this.f23613g = 2;
        } finally {
            dVar.c(null);
        }
    }
}
