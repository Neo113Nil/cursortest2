package Jf0;

import Ae.C2399j;
import Jf0.a;
import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.internal.debugMenu.screen.domainReachability.data.DomainReachabilityRepository$configParamsFlow$2$2", f = "DomainReachabilityRepository.kt", l = {67}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class d extends j implements Function2<M, kotlin.coroutines.d<? super Lf0.f>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f14725d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ a.d f14726e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(a.d dVar, kotlin.coroutines.d dVar2) {
        super(2, dVar2);
        this.f14726e = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new d(this.f14726e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Lf0.f> dVar) {
        return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f14725d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return obj;
        }
        s.b(obj);
        this.f14725d = 1;
        Object u11 = C2399j.u(this.f14726e, this);
        return u11 == aVar ? aVar : u11;
    }
}
