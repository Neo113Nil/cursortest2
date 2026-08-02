package Qj0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import retrofit2.Response;
import ru.ozon.tracker.model.SendPerfEventsTraceEntity;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.performance.TraceRepositoryImpl$sendPerfMetrics$2", f = "TraceRepository.kt", l = {85, 87}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class o0 extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f23692d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ p0 f23693e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ SendPerfEventsTraceEntity f23694f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o0(p0 p0Var, SendPerfEventsTraceEntity sendPerfEventsTraceEntity, kotlin.coroutines.d<? super o0> dVar) {
        super(2, dVar);
        this.f23693e = p0Var;
        this.f23694f = sendPerfEventsTraceEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new o0(this.f23693e, this.f23694f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((o0) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
    
        if (r6 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        if (r6 == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar;
        fi0.x xVar;
        Response response;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f23692d;
        if (i11 == 0) {
            Sc.s.b(obj);
            p0 p0Var = this.f23693e;
            aVar = p0Var.f23695a;
            Mj0.h hVar = (Mj0.h) aVar.get();
            xVar = p0Var.f23698d;
            boolean c11 = xVar.D().c();
            SendPerfEventsTraceEntity sendPerfEventsTraceEntity = this.f23694f;
            if (c11) {
                this.f23692d = 1;
                obj = hVar.sendPerfMetricsV3(sendPerfEventsTraceEntity, this);
            } else {
                this.f23692d = 2;
                obj = hVar.sendPerfMetricsV2(sendPerfEventsTraceEntity, this);
            }
            return aVar2;
        }
        if (i11 == 1) {
            Sc.s.b(obj);
            response = (Response) obj;
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
            response = (Response) obj;
        }
        if (response.isSuccessful()) {
            return Unit.f71690a;
        }
        Pj0.a.a(response);
        throw null;
    }
}
