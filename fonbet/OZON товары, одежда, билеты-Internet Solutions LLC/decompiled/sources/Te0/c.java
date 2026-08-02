package Te0;

import Ae.C0;
import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import we0.m;
import we0.u;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.libre.userlocation.LibreUserLocationRenderer$subscribeForPlacemarkClicks$1", f = "LibreUserLocationRenderer.kt", l = {70}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class c extends j implements Function2<u, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f27144d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f27145e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ b f27146f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(b bVar, kotlin.coroutines.d<? super c> dVar) {
        super(2, dVar);
        this.f27146f = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        c cVar = new c(this.f27146f, dVar);
        cVar.f27145e = obj;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(u uVar, kotlin.coroutines.d<? super Unit> dVar) {
        return ((c) create(uVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        C0 g10;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f27144d;
        if (i11 == 0) {
            s.b(obj);
            u uVar = (u) this.f27145e;
            g10 = this.f27146f.g();
            m c11 = uVar.c();
            this.f27144d = 1;
            if (g10.emit(c11, this) == aVar) {
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
