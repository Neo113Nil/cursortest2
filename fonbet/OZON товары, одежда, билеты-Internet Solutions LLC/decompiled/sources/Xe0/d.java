package Xe0;

import Ae.C2399j;
import Ae.C2408n0;
import De.C2862e;
import De.s;
import android.graphics.PointF;
import com.yandex.mapkit.mapview.MapView;
import com.yandex.mapkit.user_location.UserLocationLayer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import oe0.o;
import org.jetbrains.annotations.NotNull;
import pe0.AbstractC8905a;
import pe0.C8914j;
import we0.m;
import we0.p;
import xe.B0;
import xe.C10720e0;
import xe.H0;

/* loaded from: classes3.dex */
public final class d extends AbstractC8905a<f> {

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final MapView f34423l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final Xe0.a f34424m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f34425n;

    /* renamed from: o, reason: collision with root package name */
    private long f34426o;

    /* renamed from: p, reason: collision with root package name */
    private B0 f34427p;

    static final class a extends AbstractC7737t implements Function1<Boolean, Unit> {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            bool.getClass();
            d dVar = d.this;
            dVar.f34425n = true;
            dVar.r(dVar.c().a().b().getValue().booleanValue());
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(o locationProvider, C2862e coroutineScope, f userLocationRenderer, C8914j components, MapView mapView) {
        super(coroutineScope, locationProvider, userLocationRenderer, components);
        Xe0.a dummyLocationManager = new Xe0.a();
        Intrinsics.checkNotNullParameter(locationProvider, "locationProvider");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(userLocationRenderer, "userLocationRenderer");
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(mapView, "mapView");
        Intrinsics.checkNotNullParameter(dummyLocationManager, "dummyLocationManager");
        this.f34423l = mapView;
        this.f34424m = dummyLocationManager;
        userLocationRenderer.w(new b(1, this, d.class, "activateCameraForTrackingLocation", "activateCameraForTrackingLocation(Lru/ozon/mapsdk/common/model/LatLng;)V", 0));
        C2408n0 c2408n0 = new C2408n0(components.a().b(), new c(2, this, d.class, "switchFollowMode", "switchFollowMode(Z)V", 4));
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.f34427p = C2399j.C(C2399j.B(c2408n0, s.f6650a.x()), coroutineScope);
    }

    public static final /* synthetic */ Unit l(d dVar, boolean z11) {
        dVar.r(z11);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(m mVar) {
        c().a().c(mVar, new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(boolean z11) {
        if (z11 && this.f34425n) {
            MapView mapView = this.f34423l;
            PointF pointF = new PointF(mapView.getWidth() / 2.0f, mapView.getHeight() / 2.0f);
            UserLocationLayer v11 = f().v();
            if (v11 != null) {
                v11.setAnchor(pointF, pointF);
            }
        } else {
            UserLocationLayer v12 = f().v();
            if (v12 != null) {
                v12.resetAnchor();
            }
        }
        this.f34425n = false;
    }

    @Override // pe0.AbstractC8905a
    public final void b() {
        super.b();
        B0 b02 = this.f34427p;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        this.f34427p = null;
    }

    @Override // pe0.AbstractC8905a
    protected final void g(@NotNull p locationInfo) {
        Intrinsics.checkNotNullParameter(locationInfo, "locationInfo");
        this.f34424m.c(locationInfo, this.f34426o);
    }

    @Override // pe0.AbstractC8905a
    protected final void j() {
        this.f34426o = System.currentTimeMillis();
        super.j();
    }

    @Override // pe0.AbstractC8905a
    protected final void k() {
        super.k();
        this.f34424m.b();
    }
}
