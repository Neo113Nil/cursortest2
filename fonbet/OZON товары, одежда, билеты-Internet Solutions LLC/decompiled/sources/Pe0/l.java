package Pe0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.libre.placemark.customSymbol.LibreCustomSymbolAsyncPlacemarkController$removePlacemarksInternalById$isViewRemoved$1", f = "LibreCustomSymbolAsyncPlacemarkController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class l extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Boolean>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ d f22396d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f22397e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ long f22398f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(d dVar, String str, long j11, kotlin.coroutines.d<? super l> dVar2) {
        super(2, dVar2);
        this.f22396d = dVar;
        this.f22397e = str;
        this.f22398f = j11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new l(this.f22396d, this.f22397e, this.f22398f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Boolean> dVar) {
        return ((l) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Re0.e v11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        d dVar = this.f22396d;
        v11 = dVar.v();
        String str = this.f22397e;
        boolean b11 = v11.b(str);
        if (b11) {
            dVar.z(this.f22398f, str);
        }
        return Boolean.valueOf(b11);
    }
}
