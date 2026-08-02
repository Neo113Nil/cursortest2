package Fe;

import Ae.C2399j;
import Ae.InterfaceC2397i;
import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;
import xe.N;
import ze.w;

@kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.reactive.PublisherAsFlow$collectSlowPath$2", f = "ReactiveFlow.kt", l = {83}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class c extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f9424d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f9425e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ InterfaceC2397i<Object> f9426f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ b<Object> f9427g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(InterfaceC2397i<Object> interfaceC2397i, b<Object> bVar, kotlin.coroutines.d<? super c> dVar) {
        super(2, dVar);
        this.f9426f = interfaceC2397i;
        this.f9427g = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        c cVar = new c(this.f9426f, this.f9427g, dVar);
        cVar.f9425e = obj;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f9424d;
        if (i11 == 0) {
            s.b(obj);
            M m11 = (M) this.f9425e;
            b<Object> bVar = this.f9427g;
            w<Object> g10 = bVar.g(N.g(m11, bVar.f3579a));
            this.f9424d = 1;
            if (C2399j.s(this.f9426f, g10, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }
}
