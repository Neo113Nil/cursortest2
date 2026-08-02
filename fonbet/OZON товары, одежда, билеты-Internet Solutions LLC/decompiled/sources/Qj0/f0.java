package Qj0;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.performance.TraceControllerImpl$sendEventsWithBackOff$2", f = "TraceController.kt", l = {236}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class f0 extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    Y f23637d;

    /* renamed from: e, reason: collision with root package name */
    Iterator f23638e;

    /* renamed from: f, reason: collision with root package name */
    int f23639f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Y f23640g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ Tc.b f23641h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f0(Y y11, Tc.b bVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f23640g = y11;
        this.f23641h = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new f0(this.f23640g, this.f23641h, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((f0) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        Y y11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f23639f;
        if (i11 == 0) {
            Sc.s.b(obj);
            Y y12 = this.f23640g;
            it = C7714v.y(this.f23641h, y12.f23551b.q()).iterator();
            y11 = y12;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f23638e;
            y11 = this.f23637d;
            Sc.s.b(obj);
        }
        while (it.hasNext()) {
            List list = (List) it.next();
            this.f23637d = y11;
            this.f23638e = it;
            this.f23639f = 1;
            if (Y.v(y11, list, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f71690a;
    }
}
