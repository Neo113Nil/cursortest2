package Pe0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.libre.placemark.customSymbol.LibreCustomSymbolAsyncPlacemarkController$getSymbolManagerAsync$2", f = "LibreCustomSymbolAsyncPlacemarkController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class f extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super r>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ d f22358d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Long f22359e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(d dVar, Long l11, kotlin.coroutines.d<? super f> dVar2) {
        super(2, dVar2);
        this.f22358d = dVar;
        this.f22359e = l11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new f(this.f22358d, this.f22359e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super r> dVar) {
        return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        return this.f22358d.H(this.f22359e);
    }
}
