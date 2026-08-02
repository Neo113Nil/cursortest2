package Pe0;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.libre.placemark.customSymbol.LibreCustomSymbolAsyncPlacemarkController$fadeSymbols$1", f = "LibreCustomSymbolAsyncPlacemarkController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class e extends kotlin.coroutines.jvm.internal.j implements Function2<List<? extends n>, kotlin.coroutines.d<? super Unit>, Object> {
    e() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new e(2, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends n> list, kotlin.coroutines.d<? super Unit> dVar) {
        return ((e) create(list, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        return Unit.f71690a;
    }
}
