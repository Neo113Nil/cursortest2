package Qj0;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import ru.ozon.tracker.performance.model.TraceEntity;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.performance.TraceControllerImpl$sendEventsWithoutBackoff$2", f = "TraceController.kt", l = {227}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class g0 extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    Y f23644d;

    /* renamed from: e, reason: collision with root package name */
    Iterator f23645e;

    /* renamed from: f, reason: collision with root package name */
    int f23646f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Y f23647g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ List<TraceEntity> f23648h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g0(Y y11, List<TraceEntity> list, kotlin.coroutines.d<? super g0> dVar) {
        super(2, dVar);
        this.f23647g = y11;
        this.f23648h = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new g0(this.f23647g, this.f23648h, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((g0) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Y y11;
        Iterator it;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f23646f;
        if (i11 == 0) {
            Sc.s.b(obj);
            List<TraceEntity> list = this.f23648h;
            Y y12 = this.f23647g;
            y11 = y12;
            it = C7714v.y(list, y12.f23551b.q()).iterator();
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f23645e;
            y11 = this.f23644d;
            Sc.s.b(obj);
        }
        while (it.hasNext()) {
            List list2 = (List) it.next();
            this.f23644d = y11;
            this.f23645e = it;
            this.f23646f = 1;
            if (Y.y(y11, list2, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f71690a;
    }
}
