package Pe0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import we0.u;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.libre.placemark.customSymbol.LibreCustomSymbolAsyncPlacemarkController$insertPlacemarksInternalWithRes$2", f = "LibreCustomSymbolAsyncPlacemarkController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class h extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ d f22374d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ u f22375e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ long f22376f;

    static final class a extends AbstractC7737t implements Function1<ru.ozon.mapsdk.libre.placemark.view.b<?>, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f22377b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j11) {
            super(1);
            this.f22377b = j11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ru.ozon.mapsdk.libre.placemark.view.b<?> bVar) {
            ru.ozon.mapsdk.libre.placemark.view.b<?> marker = bVar;
            Intrinsics.checkNotNullParameter(marker, "marker");
            long j11 = this.f22377b;
            if (j11 != 0) {
                marker.m(j11);
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(d dVar, u uVar, long j11, kotlin.coroutines.d<? super h> dVar2) {
        super(2, dVar2);
        this.f22374d = dVar;
        this.f22375e = uVar;
        this.f22376f = j11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new h(this.f22374d, this.f22375e, this.f22376f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((h) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        a aVar2 = new a(this.f22376f);
        this.f22374d.x(this.f22375e, true, aVar2);
        return Unit.f71690a;
    }
}
