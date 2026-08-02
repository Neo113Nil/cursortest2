package Bf0;

import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.time.b;
import ve.EnumC10311b;
import vf0.C10315a;
import xe.M;
import xe.Y;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.domain.whitelisting.WhitelistingStatusProviderImpl$pingExtraDomainsOnStart$1", f = "WhitelistingStatusProviderImpl.kt", l = {251}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class j extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f3738d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C10315a f3739e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ o f3740f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(C10315a c10315a, o oVar, kotlin.coroutines.d<? super j> dVar) {
        super(2, dVar);
        this.f3739e = c10315a;
        this.f3740f = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new j(this.f3739e, this.f3740f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((j) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f3738d;
        C10315a c10315a = this.f3739e;
        if (i11 == 0) {
            s.b(obj);
            b.Companion companion = kotlin.time.b.INSTANCE;
            long g10 = kotlin.time.c.g(c10315a.a(), EnumC10311b.MILLISECONDS);
            this.f3738d = 1;
            if (Y.c(g10, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        o oVar = this.f3740f;
        o.a(oVar, c10315a);
        oVar.f3765h = true;
        return Unit.f71690a;
    }
}
