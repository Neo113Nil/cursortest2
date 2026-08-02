package Tb0;

import Ae.B0;
import Ae.InterfaceC2397i;
import Kb0.K;
import Sc.C4005g;
import Sc.s;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xb0.InterfaceC10696a;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.limb.plugin.OzonIdPlugin$subscribeToNetworkCookieEvents$1", f = "OzonIdPlugin.kt", l = {184}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class f extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f26987d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Tb0.a f26988e;

    static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Tb0.a f26989a;

        a(Tb0.a aVar) {
            this.f26989a = aVar;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(Object obj, kotlin.coroutines.d dVar) {
            Fb0.f fVar;
            Object invoke;
            Cb0.g gVar = (Cb0.g) obj;
            Tb0.a aVar = this.f26989a;
            fVar = aVar.f26977b;
            InterfaceC6511n<Cb0.g, InterfaceC10696a, kotlin.coroutines.d<? super Unit>, Object> networkCookieEventListener = fVar.getNetworkCookieEventListener();
            return (networkCookieEventListener == null || (invoke = networkCookieEventListener.invoke(gVar, aVar, dVar)) != Wc.a.COROUTINE_SUSPENDED) ? Unit.f71690a : invoke;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(Tb0.a aVar, kotlin.coroutines.d<? super f> dVar) {
        super(2, dVar);
        this.f26988e = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new f(this.f26988e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f26987d;
        if (i11 == 0) {
            s.b(obj);
            K k11 = Tb0.a.f26975d;
            if (k11 == null) {
                throw new Lb0.a();
            }
            B0<Cb0.g> events = k11.L().getValue().getEvents();
            a aVar2 = new a(this.f26988e);
            this.f26987d = 1;
            if (events.collect(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        throw new C4005g();
    }
}
