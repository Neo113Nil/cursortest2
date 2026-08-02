package Pe0;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.libre.placemark.customSymbol.LibreCustomSymbolAsyncPlacemarkController$removePlacemarksInternalById$3$2", f = "LibreCustomSymbolAsyncPlacemarkController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class k extends kotlin.coroutines.jvm.internal.j implements Function2<List<? extends n>, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f22393d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ r f22394e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ d f22395f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(r rVar, d dVar, kotlin.coroutines.d<? super k> dVar2) {
        super(2, dVar2);
        this.f22394e = rVar;
        this.f22395f = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        k kVar = new k(this.f22394e, this.f22395f, dVar);
        kVar.f22393d = obj;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends n> list, kotlin.coroutines.d<? super Unit> dVar) {
        return ((k) create(list, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        List<n> list = (List) this.f22393d;
        for (n nVar : list) {
            d dVar = this.f22395f;
            dVar.i().l(nVar.c());
            dVar.F().f(nVar);
        }
        this.f22394e.n(list);
        return Unit.f71690a;
    }
}
