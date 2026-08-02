package Qj0;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mi0.InterfaceC8339i;
import ru.ozon.tracker.model.SendPerfEventsTraceEntity;
import ru.ozon.tracker.performance.model.TraceEntity;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.performance.TraceControllerImpl$sendTraces$2", f = "TraceController.kt", l = {280}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class h0 extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    SendPerfEventsTraceEntity f23649d;

    /* renamed from: e, reason: collision with root package name */
    int f23650e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Y f23651f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ List<TraceEntity> f23652g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h0(Y y11, List<TraceEntity> list, kotlin.coroutines.d<? super h0> dVar) {
        super(2, dVar);
        this.f23651f = y11;
        this.f23652g = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new h0(this.f23651f, this.f23652g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((h0) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ru.ozon.tracker.performance.d dVar;
        SendPerfEventsTraceEntity sendPerfEventsTraceEntity;
        InterfaceC8339i interfaceC8339i;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f23650e;
        Y y11 = this.f23651f;
        if (i11 == 0) {
            Sc.s.b(obj);
            dVar = y11.f23550a;
            dVar.getClass();
            List<TraceEntity> traces = this.f23652g;
            Intrinsics.checkNotNullParameter(traces, "traces");
            SendPerfEventsTraceEntity sendPerfEventsTraceEntity2 = new SendPerfEventsTraceEntity(traces);
            l0 l0Var = y11.f23552c;
            this.f23649d = sendPerfEventsTraceEntity2;
            this.f23650e = 1;
            if (l0Var.c(sendPerfEventsTraceEntity2, this) == aVar) {
                return aVar;
            }
            sendPerfEventsTraceEntity = sendPerfEventsTraceEntity2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sendPerfEventsTraceEntity = this.f23649d;
            Sc.s.b(obj);
        }
        interfaceC8339i = y11.f23554e;
        interfaceC8339i.a(sendPerfEventsTraceEntity.getEvents());
        return Unit.f71690a;
    }
}
