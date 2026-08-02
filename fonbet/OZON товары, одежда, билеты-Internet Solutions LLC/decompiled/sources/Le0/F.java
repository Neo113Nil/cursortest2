package Le0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.maplibre.android.maps.MapLibreMap;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.libre.LibreTilesController$cameraMovementStateFlow$1", f = "LibreTilesController.kt", l = {91}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class F extends kotlin.coroutines.jvm.internal.j implements Function2<ze.u<? super Boolean>, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f16868d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f16869e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ MapLibreMap f16870f;

    static final class a extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MapLibreMap f16871b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C f16872c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ D f16873d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ E f16874e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(MapLibreMap mapLibreMap, C c11, D d11, E e11) {
            super(0);
            this.f16871b = mapLibreMap;
            this.f16872c = c11;
            this.f16873d = d11;
            this.f16874e = e11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MapLibreMap mapLibreMap = this.f16871b;
            mapLibreMap.R(this.f16872c);
            mapLibreMap.P(this.f16873d);
            mapLibreMap.Q(this.f16874e);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    F(MapLibreMap mapLibreMap, kotlin.coroutines.d<? super F> dVar) {
        super(2, dVar);
        this.f16870f = mapLibreMap;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        F f7 = new F(this.f16870f, dVar);
        f7.f16869e = obj;
        return f7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ze.u<? super Boolean> uVar, kotlin.coroutines.d<? super Unit> dVar) {
        return ((F) create(uVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [Le0.C, org.maplibre.android.maps.MapLibreMap$OnCameraMoveStartedListener] */
    /* JADX WARN: Type inference failed for: r3v0, types: [Le0.D, org.maplibre.android.maps.MapLibreMap$OnCameraIdleListener] */
    /* JADX WARN: Type inference failed for: r4v0, types: [Le0.E, org.maplibre.android.maps.MapLibreMap$OnCameraMoveCanceledListener] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f16868d;
        if (i11 == 0) {
            Sc.s.b(obj);
            final ze.u uVar = (ze.u) this.f16869e;
            ?? r12 = new MapLibreMap.OnCameraMoveStartedListener() { // from class: Le0.C
                @Override // org.maplibre.android.maps.MapLibreMap.OnCameraMoveStartedListener
                public final void onCameraMoveStarted(int i12) {
                    ze.u.this.b(Boolean.FALSE);
                }
            };
            ?? r32 = new MapLibreMap.OnCameraIdleListener() { // from class: Le0.D
                @Override // org.maplibre.android.maps.MapLibreMap.OnCameraIdleListener
                public final void onCameraIdle() {
                    ze.u.this.b(Boolean.TRUE);
                }
            };
            ?? r42 = new MapLibreMap.OnCameraMoveCanceledListener() { // from class: Le0.E
                @Override // org.maplibre.android.maps.MapLibreMap.OnCameraMoveCanceledListener
                public final void onCameraMoveCanceled() {
                    ze.u.this.b(Boolean.TRUE);
                }
            };
            MapLibreMap mapLibreMap = this.f16870f;
            mapLibreMap.d(r12);
            mapLibreMap.a(r32);
            mapLibreMap.b(r42);
            a aVar2 = new a(mapLibreMap, r12, r32, r42);
            this.f16868d = 1;
            if (ze.s.a(uVar, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}
