package Ue0;

import Ae.O0;
import Ae.x0;
import Ie0.a;
import Je0.d;
import Sc.InterfaceC4008j;
import com.yandex.mapkit.map.CameraListener;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.map.CameraUpdateReason;
import com.yandex.mapkit.map.Map;
import com.yandex.mapkit.map.MapLoadStatistics;
import com.yandex.mapkit.map.MapLoadedListener;
import com.yandex.mapkit.mapview.MapView;
import ei0.InterfaceC6369b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;
import ru.ozon.mapsdk.common.geoproxy.model.GeoProxyConfig;
import xe.C10727i;
import xe.M;

/* loaded from: classes3.dex */
public final class A extends Ie0.a {

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final MapView f27627f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f27628g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final x0<we0.y> f27629h;

    /* renamed from: i, reason: collision with root package name */
    private Long f27630i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f27631j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final b f27632k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final a f27633l;

    public static final class a implements CameraListener {
        a() {
        }

        @Override // com.yandex.mapkit.map.CameraListener
        public final void onCameraPositionChanged(Map map, CameraPosition cameraPosition, CameraUpdateReason cameraUpdateReason, boolean z11) {
            Intrinsics.checkNotNullParameter(map, "map");
            Intrinsics.checkNotNullParameter(cameraPosition, "cameraPosition");
            Intrinsics.checkNotNullParameter(cameraUpdateReason, "cameraUpdateReason");
            A a11 = A.this;
            a11.f27631j = !z11;
            a11.h(a.EnumC0243a.LOADING);
        }
    }

    public static final class b implements MapLoadedListener {
        b() {
        }

        @Override // com.yandex.mapkit.map.MapLoadedListener
        public final void onMapLoaded(MapLoadStatistics loadStatistics) {
            Intrinsics.checkNotNullParameter(loadStatistics, "loadStatistics");
            A a11 = A.this;
            if (!a11.f27631j) {
                a11.h(a.EnumC0243a.LOADED);
            }
            a11.f27627f.getMap().setMapLoadedListener(this);
        }
    }

    static final class c extends AbstractC7737t implements Function0<Je0.c> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f27636b = new c(0);

        @Override // kotlin.jvm.functions.Function0
        public final Je0.c invoke() {
            Je0.c cVar;
            InterfaceC6369b ozonTracker;
            Je0.c cVar2;
            Je0.c cVar3;
            ie0.g.f66321a.getClass();
            if (ie0.g.c() == null) {
                Je0.c.f14654d = null;
                return null;
            }
            cVar = Je0.c.f14654d;
            if (cVar != null) {
                cVar3 = Je0.c.f14654d;
                return cVar3;
            }
            GeoProxyConfig c11 = ie0.g.c();
            if (c11 == null || (ozonTracker = c11.getOzonTracker()) == null) {
                d.a.a();
                return null;
            }
            Je0.c.f14654d = new Je0.c(ozonTracker);
            cVar2 = Je0.c.f14654d;
            return cVar2;
        }
    }

    public static final class d implements MapLoadedListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ GeoProviderConfig f27638b;

        d(GeoProviderConfig geoProviderConfig) {
            this.f27638b = geoProviderConfig;
        }

        @Override // com.yandex.mapkit.map.MapLoadedListener
        public final void onMapLoaded(MapLoadStatistics p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            long currentTimeMillis = System.currentTimeMillis();
            A a11 = A.this;
            a11.f27627f.getMap().setMapLoadedListener(a11.f27632k);
            Je0.c j11 = A.j(a11);
            if (j11 != null) {
                Je0.e eVar = Je0.e.VECTOR_MAP_RENDERED;
                Long l11 = a11.f27630i;
                Je0.c.d(j11, this.f27638b, eVar, null, l11 != null ? Long.valueOf(currentTimeMillis - l11.longValue()) : null, null, null, 112);
            }
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.yandex.YandexTilesController$theme$1", f = "YandexTilesController.kt", l = {33}, m = "invokeSuspend")
    static final class e extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f27639d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ we0.y f27641f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(we0.y yVar, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f27641f = yVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return A.this.new e(this.f27641f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f27639d;
            if (i11 == 0) {
                Sc.s.b(obj);
                x0 x0Var = A.this.f27629h;
                this.f27639d = 1;
                if (x0Var.emit(this.f27641f, this) == aVar) {
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

    public A(@NotNull MapView mapView, @NotNull GeoProviderConfig config) {
        Intrinsics.checkNotNullParameter(mapView, "mapView");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f27627f = mapView;
        this.f27628g = Sc.k.b(c.f27636b);
        this.f27629h = O0.a(a());
        d dVar = new d(config);
        this.f27632k = new b();
        a aVar = new a();
        this.f27633l = aVar;
        this.f27630i = Long.valueOf(System.currentTimeMillis());
        Map map = mapView.getMap();
        map.setMapLoadedListener(dVar);
        map.addCameraListener(aVar);
    }

    public static final Je0.c j(A a11) {
        return (Je0.c) a11.f27628g.getValue();
    }

    @Override // Ie0.c
    @NotNull
    public final we0.y a() {
        boolean isNightModeEnabled = this.f27627f.getMap().isNightModeEnabled();
        if (isNightModeEnabled) {
            return we0.y.DARK;
        }
        if (isNightModeEnabled) {
            throw new Sc.o();
        }
        return we0.y.LIGHT;
    }

    @Override // Ie0.c
    public final void b(@NotNull we0.y value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f27627f.getMap().setNightModeEnabled(value == we0.y.DARK);
        C10727i.c(d(), null, null, new e(value, null), 3);
    }

    @Override // Ie0.a
    public final void g() {
        this.f27627f.getMap().removeCameraListener(this.f27633l);
        super.g();
    }
}
