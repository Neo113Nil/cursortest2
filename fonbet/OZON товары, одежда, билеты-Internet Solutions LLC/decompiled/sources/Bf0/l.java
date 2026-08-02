package Bf0;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.domain.whitelisting.WhitelistingStatusProviderImpl$startCollectingIsWhitelisting$2", f = "WhitelistingStatusProviderImpl.kt", l = {107}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class l extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f3746d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ o f3747e;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.domain.whitelisting.WhitelistingStatusProviderImpl$startCollectingIsWhitelisting$2$1", f = "WhitelistingStatusProviderImpl.kt", l = {}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<Boolean, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ boolean f3748d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ o f3749e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(o oVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f3749e = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f3749e, dVar);
            aVar.f3748d = ((Boolean) obj).booleanValue();
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Boolean bool, kotlin.coroutines.d<? super Unit> dVar) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((a) create(bool2, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            o.i(this.f3749e, this.f3748d);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(o oVar, kotlin.coroutines.d<? super l> dVar) {
        super(2, dVar);
        this.f3747e = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new l(this.f3747e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((l) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f3746d;
        if (i11 == 0) {
            s.b(obj);
            o oVar = this.f3747e;
            InterfaceC2395h o11 = C2399j.o(oVar.t());
            a aVar2 = new a(oVar, null);
            this.f3746d = 1;
            if (C2399j.h(o11, aVar2, this) == aVar) {
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
