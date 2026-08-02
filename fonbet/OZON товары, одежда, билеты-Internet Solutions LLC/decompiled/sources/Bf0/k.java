package Bf0;

import Ae.C2399j;
import Ae.M0;
import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import vf0.C10315a;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.domain.whitelisting.WhitelistingStatusProviderImpl$startCollectingIsWhitelisting$1", f = "WhitelistingStatusProviderImpl.kt", l = {100}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class k extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f3741d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ o f3742e;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.domain.whitelisting.WhitelistingStatusProviderImpl$startCollectingIsWhitelisting$1$1", f = "WhitelistingStatusProviderImpl.kt", l = {101}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<C10315a, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f3743d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f3744e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ o f3745f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(o oVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f3745f = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f3745f, dVar);
            aVar.f3744e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(C10315a c10315a, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(c10315a, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f3743d;
            if (i11 == 0) {
                s.b(obj);
                C10315a c10315a = (C10315a) this.f3744e;
                this.f3743d = 1;
                if (o.h(this.f3745f, c10315a, this) == aVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(o oVar, kotlin.coroutines.d<? super k> dVar) {
        super(2, dVar);
        this.f3742e = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new k(this.f3742e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((k) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Bf0.a aVar;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f3741d;
        if (i11 == 0) {
            s.b(obj);
            o oVar = this.f3742e;
            aVar = oVar.f3758a;
            M0<C10315a> b11 = aVar.b();
            a aVar3 = new a(oVar, null);
            this.f3741d = 1;
            if (C2399j.h(b11, aVar3, this) == aVar2) {
                return aVar2;
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
