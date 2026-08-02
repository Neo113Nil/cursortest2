package Xe0;

import Ae.C0;
import De.C2862e;
import Sc.o;
import Sc.s;
import android.content.Context;
import android.view.View;
import com.yandex.mapkit.MapKit;
import com.yandex.mapkit.MapKitFactory;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.layers.ObjectEvent;
import com.yandex.mapkit.map.Callback;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.mapkit.map.PlacemarkAnimation;
import com.yandex.mapkit.map.PlacemarkMapObject;
import com.yandex.mapkit.map.RotationType;
import com.yandex.mapkit.mapview.MapView;
import com.yandex.mapkit.user_location.UserLocationLayer;
import com.yandex.mapkit.user_location.UserLocationObjectListener;
import com.yandex.mapkit.user_location.UserLocationTapListener;
import com.yandex.mapkit.user_location.UserLocationView;
import com.yandex.runtime.image.ImageProvider;
import com.yandex.runtime.ui_view.ViewProvider;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import se0.AbstractC9672a;
import we0.InterfaceC10542A;
import we0.InterfaceC10545a;
import we0.m;
import we0.p;
import we0.u;
import we0.z;
import xe.C10727i;
import xe.M;

/* loaded from: classes3.dex */
public final class f extends AbstractC9672a implements UserLocationObjectListener, UserLocationTapListener {

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final MapView f34433g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final Ve0.a f34434h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final C2862e f34435i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final MapKit f34436j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final AbstractC9672a.b f34437k;

    /* renamed from: l, reason: collision with root package name */
    private UserLocationLayer f34438l;

    /* renamed from: m, reason: collision with root package name */
    private Function1<? super m, Unit> f34439m;

    /* renamed from: n, reason: collision with root package name */
    private UserLocationView f34440n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private AbstractC7737t f34441o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private a f34442p;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a INITIALIZED;
        public static final a INITIALIZING;
        public static final a NOT_INITIALIZED;

        static {
            a aVar = new a("NOT_INITIALIZED", 0);
            NOT_INITIALIZED = aVar;
            a aVar2 = new a("INITIALIZING", 1);
            INITIALIZING = aVar2;
            a aVar3 = new a("INITIALIZED", 2);
            INITIALIZED = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            $VALUES = aVarArr;
            $ENTRIES = Xc.b.a(aVarArr);
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    private static final class b extends AbstractC9672a.b {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private se0.b f34443c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final u f34444d;

        static final class a extends AbstractC7737t implements Function0<View> {
            a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final View invoke() {
                return b.this.e();
            }
        }

        public b(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.f34443c = new se0.b(context);
            u uVar = new u(new m(0.0d, 0.0d), new z(new InterfaceC10542A.b(new a()), null, false, false, 0.0f, 0.0f, 0.0f, 254), null, "USER_PLACEMARK_PIN_ID", null, 1012);
            uVar.m("userLocationIcon");
            this.f34444d = uVar;
        }

        @Override // se0.AbstractC9672a.b
        public final void d(Object obj) {
            this.f34444d.m(obj);
        }

        @NotNull
        public final se0.b e() {
            return this.f34443c;
        }

        @NotNull
        public final u f() {
            return this.f34444d;
        }
    }

    static final class c extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ u f34447c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(u uVar) {
            super(0);
            this.f34447c = uVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            f.this.h(this.f34447c);
            return Unit.f71690a;
        }
    }

    static final class d extends AbstractC7737t implements Function0<Unit> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            PlacemarkMapObject pin;
            PlacemarkAnimation useAnimation;
            PlacemarkMapObject arrow;
            PlacemarkAnimation useAnimation2;
            f fVar = f.this;
            UserLocationView userLocationView = fVar.f34440n;
            if (userLocationView != null && (arrow = userLocationView.getArrow()) != null && (useAnimation2 = arrow.useAnimation()) != null) {
                useAnimation2.play();
            }
            UserLocationView userLocationView2 = fVar.f34440n;
            if (userLocationView2 != null && (pin = userLocationView2.getPin()) != null && (useAnimation = pin.useAnimation()) != null) {
                useAnimation.play();
            }
            return Unit.f71690a;
        }
    }

    static final class e extends AbstractC7737t implements Function0<Unit> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            PlacemarkMapObject pin;
            PlacemarkAnimation useAnimation;
            PlacemarkMapObject arrow;
            PlacemarkAnimation useAnimation2;
            f fVar = f.this;
            UserLocationView userLocationView = fVar.f34440n;
            if (userLocationView != null && (arrow = userLocationView.getArrow()) != null && (useAnimation2 = arrow.useAnimation()) != null) {
                useAnimation2.stop();
            }
            UserLocationView userLocationView2 = fVar.f34440n;
            if (userLocationView2 != null && (pin = userLocationView2.getPin()) != null && (useAnimation = pin.useAnimation()) != null) {
                useAnimation.stop();
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.yandex.userLocation.YandexUserLocationRenderer$onUserLocationObjectTap$1", f = "YandexUserLocationRenderer.kt", l = {88}, m = "invokeSuspend")
    /* renamed from: Xe0.f$f, reason: collision with other inner class name */
    static final class C0622f extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f34450d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Point f34452f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0622f(Point point, kotlin.coroutines.d<? super C0622f> dVar) {
            super(2, dVar);
            this.f34452f = point;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return f.this.new C0622f(this.f34452f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C0622f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f34450d;
            if (i11 == 0) {
                s.b(obj);
                C0 g10 = f.this.g();
                Point point = this.f34452f;
                m mVar = new m(point.getLatitude(), point.getLongitude());
                this.f34450d = 1;
                if (g10.emit(mVar, this) == aVar) {
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

    static final class g extends AbstractC7737t implements Function0<Unit> {
        g(boolean z11) {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            f fVar = f.this;
            fVar.b(fVar.d());
            return Unit.f71690a;
        }
    }

    public f(MapView mapView, Ve0.a yandexAnimationLoader, C2862e coroutineScope) {
        MapKit mapKit = MapKitFactory.getInstance();
        Intrinsics.checkNotNullParameter(mapView, "mapView");
        Intrinsics.checkNotNullParameter(yandexAnimationLoader, "yandexAnimationLoader");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(mapKit, "mapKit");
        this.f34433g = mapView;
        this.f34434h = yandexAnimationLoader;
        this.f34435i = coroutineScope;
        this.f34436j = mapKit;
        Context context = mapView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f34437k = new b(context);
        this.f34441o = Xe0.g.f34454b;
        this.f34442p = a.NOT_INITIALIZED;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void u(Function0<Unit> function0) {
        this.f34441o = (AbstractC7737t) function0;
        this.f34442p = a.INITIALIZING;
        UserLocationLayer createUserLocationLayer = this.f34436j.createUserLocationLayer(this.f34433g.getMapWindow());
        this.f34438l = createUserLocationLayer;
        if (createUserLocationLayer != null) {
            createUserLocationLayer.resetAnchor();
            createUserLocationLayer.setObjectListener(this);
            createUserLocationLayer.setTapListener(this);
            createUserLocationLayer.setAutoZoomEnabled(false);
        }
    }

    private final void x(final PlacemarkMapObject placemarkMapObject, final u uVar) {
        final IconStyle iconStyle = new IconStyle();
        iconStyle.setAnchor(uVar.d().e());
        iconStyle.setFlat(Boolean.valueOf(uVar.d().g()));
        iconStyle.setRotationType(uVar.d().g() ? RotationType.ROTATE : RotationType.NO_ROTATION);
        if (uVar.d().d() instanceof InterfaceC10542A.a) {
            ((InterfaceC10542A.a) uVar.d().d()).getClass();
            iconStyle.setScale(Float.valueOf(1.0f));
        }
        placemarkMapObject.setDraggable(false);
        placemarkMapObject.setZIndex(uVar.d().f());
        placemarkMapObject.setDirection(uVar.d().c());
        placemarkMapObject.setUserData(uVar.k());
        placemarkMapObject.setIconStyle(iconStyle);
        Callback callback = new Callback() { // from class: Xe0.e
            @Override // com.yandex.mapkit.map.Callback
            public final void onTaskFinished() {
                u uVar2 = uVar;
                boolean z11 = uVar2.d().h() && this.i();
                PlacemarkMapObject placemarkMapObject2 = PlacemarkMapObject.this;
                placemarkMapObject2.setVisible(z11);
                placemarkMapObject2.setOpacity(uVar2.d().b());
                placemarkMapObject2.setIconStyle(iconStyle);
            }
        };
        InterfaceC10542A d11 = uVar.d().d();
        if (Intrinsics.d(d11, InterfaceC10542A.d.f104404a)) {
            return;
        }
        if (d11 instanceof InterfaceC10542A.c) {
            placemarkMapObject.setIcon(ImageProvider.fromBitmap(((InterfaceC10542A.c) uVar.d().d()).a(), true, ((InterfaceC10542A.c) uVar.d().d()).b()), iconStyle, callback);
            return;
        }
        if (d11 instanceof InterfaceC10542A.b) {
            placemarkMapObject.setView(new ViewProvider(((InterfaceC10542A.b) uVar.d().d()).a().invoke()), iconStyle, callback);
            return;
        }
        if (!(d11 instanceof InterfaceC10542A.a)) {
            throw new o();
        }
        PlacemarkAnimation useAnimation = placemarkMapObject.useAnimation();
        useAnimation.setIcon(this.f34434h.c(((InterfaceC10542A.a) uVar.d().d()).a()), iconStyle, callback);
        Intrinsics.checkNotNullExpressionValue(useAnimation, "apply(...)");
        if ((!d().c() || j()) && ((InterfaceC10542A.a) uVar.d().d()).a().c()) {
            useAnimation.play();
        }
    }

    @Override // se0.AbstractC9672a, se0.c
    public final void a(@NotNull p location) {
        Intrinsics.checkNotNullParameter(location, "location");
        super.a(location);
    }

    @Override // se0.AbstractC9672a
    @NotNull
    protected final AbstractC9672a.b e() {
        return this.f34437k;
    }

    @Override // se0.AbstractC9672a
    public final void h(@NotNull u placemark) {
        PlacemarkMapObject arrow;
        PlacemarkMapObject pin;
        Intrinsics.checkNotNullParameter(placemark, "placemark");
        a aVar = this.f34442p;
        if (aVar == a.INITIALIZING) {
            return;
        }
        if (this.f34438l == null) {
            u(new c(placemark));
            return;
        }
        if (aVar != a.INITIALIZED) {
            return;
        }
        UserLocationView userLocationView = this.f34440n;
        if (userLocationView != null && (pin = userLocationView.getPin()) != null) {
            x(pin, placemark);
        }
        UserLocationView userLocationView2 = this.f34440n;
        if (userLocationView2 != null && (arrow = userLocationView2.getArrow()) != null) {
            x(arrow, placemark);
        }
        if (placemark.d().d() instanceof InterfaceC10542A.a) {
            InterfaceC10545a a11 = ((InterfaceC10542A.a) placemark.d().d()).a();
            a11.a(new d());
            a11.b(new e());
        }
    }

    @Override // se0.AbstractC9672a
    protected final void m(@NotNull AbstractC9672a.b userMode) {
        Intrinsics.checkNotNullParameter(userMode, "userMode");
        if (userMode instanceof b) {
            b bVar = (b) userMode;
            se0.b e11 = bVar.e();
            p c11 = c();
            e11.a(c11 != null ? c11.d() : null);
            l(bVar.f());
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
    @Override // com.yandex.mapkit.user_location.UserLocationObjectListener
    public final void onObjectAdded(@NotNull UserLocationView userLocation) {
        Intrinsics.checkNotNullParameter(userLocation, "userLocation");
        this.f34440n = userLocation;
        if (userLocation != null) {
            userLocation.getPin().setOpacity(0.0f);
            userLocation.getArrow().setOpacity(0.0f);
        }
        userLocation.getAccuracyCircle().setFillColor(0);
        this.f34442p = a.INITIALIZED;
        this.f34441o.invoke();
    }

    @Override // com.yandex.mapkit.user_location.UserLocationObjectListener
    public final void onObjectRemoved(@NotNull UserLocationView p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
    }

    @Override // com.yandex.mapkit.user_location.UserLocationObjectListener
    public final void onObjectUpdated(@NotNull UserLocationView userLocation, @NotNull ObjectEvent p12) {
        Intrinsics.checkNotNullParameter(userLocation, "userLocation");
        Intrinsics.checkNotNullParameter(p12, "p1");
        this.f34440n = userLocation;
        userLocation.getAccuracyCircle().setFillColor(0);
    }

    @Override // com.yandex.mapkit.user_location.UserLocationTapListener
    public final void onUserLocationObjectTap(@NotNull Point point) {
        Intrinsics.checkNotNullParameter(point, "point");
        C10727i.c(this.f34435i, null, null, new C0622f(point, null), 3);
    }

    @Override // se0.AbstractC9672a
    protected final void q(boolean z11) {
        if (this.f34438l == null) {
            u(new g(z11));
        } else {
            b(d());
        }
        UserLocationLayer userLocationLayer = this.f34438l;
        if (userLocationLayer != null) {
            userLocationLayer.setVisible(z11);
        }
    }

    public final UserLocationLayer v() {
        return this.f34438l;
    }

    public final void w(Function1<? super m, Unit> function1) {
        this.f34439m = function1;
    }
}
