package Ql0;

import Sc.r;
import Sc.s;
import Sl0.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;
import yl0.C10923h;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.domain.component.PushAvailabilityComponentImpl$checkPushAvailability$$inlined$wrapInTask$1$1", f = "PushAvailabilityComponentImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C10923h.a f23799d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f23800e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(C10923h.a aVar, kotlin.coroutines.d dVar, c cVar) {
        super(2, dVar);
        this.f23799d = aVar;
        this.f23800e = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new b(this.f23799d, dVar, this.f23800e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return new b(this.f23799d, dVar, this.f23800e).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        c cVar = this.f23800e;
        boolean a12 = cVar.f23802b.a();
        Za.d dVar = cVar.f23803c;
        if (a12) {
            dVar.info("Push is available");
            r.Companion companion = r.INSTANCE;
            a11 = Unit.f71690a;
        } else {
            dVar.info("Push is unavailable");
            r.Companion companion2 = r.INSTANCE;
            a11 = s.a(new a.b("Push is unavailable, need to install host app"));
        }
        boolean z11 = a11 instanceof r.b;
        C10923h.a aVar2 = this.f23799d;
        if (!z11) {
            aVar2.b(a11);
        }
        Throwable b11 = r.b(a11);
        if (b11 != null) {
            aVar2.a(b11);
        }
        return Unit.f71690a;
    }
}
