package Ue0;

import Ae.C0;
import Ae.E0;
import De.C2862e;
import android.content.Context;
import android.graphics.Rect;
import ce0.InterfaceC5817a;
import com.yandex.mapkit.Animation;
import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.ScreenRect;
import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.geometry.Geometry;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.CameraListener;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.map.CameraUpdateReason;
import com.yandex.mapkit.map.Map;
import com.yandex.mapkit.map.MapWindow;
import com.yandex.mapkit.map.VisibleRegion;
import com.yandex.mapkit.mapview.MapView;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import we0.C10551g;
import we0.EnumC10550f;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.H0;
import xe.M;
import xe.N;
import xe.X0;

/* loaded from: classes3.dex */
public final class c implements InterfaceC5817a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final MapView f27645a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f27646b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2862e f27647c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C0 f27648d;

    /* renamed from: e, reason: collision with root package name */
    private B0 f27649e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Ue0.b f27650f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C0 f27651g;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27652a;

        static {
            int[] iArr = new int[CameraUpdateReason.values().length];
            try {
                iArr[CameraUpdateReason.GESTURES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CameraUpdateReason.APPLICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f27652a = iArr;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.yandex.YandexCameraController$listener$1$1", f = "YandexCameraController.kt", l = {56}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f27653d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ we0.h f27655f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(we0.h hVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f27655f = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return c.this.new b(this.f27655f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f27653d;
            if (i11 == 0) {
                Sc.s.b(obj);
                C0 c02 = c.this.f27648d;
                this.f27653d = 1;
                if (c02.emit(this.f27655f, this) == aVar) {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [Ue0.b, com.yandex.mapkit.map.CameraListener] */
    public c(@NotNull Context context, @NotNull MapView mapView) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mapView, "mapView");
        this.f27645a = mapView;
        B0 b11 = X0.b();
        C10720e0 c10720e0 = C10720e0.f105451a;
        CoroutineContext d11 = CoroutineContext.Element.a.d(De.s.f6650a.x(), (H0) b11);
        this.f27646b = d11;
        this.f27647c = N.a(d11);
        C0 b12 = E0.b(0, 0, null, 7);
        this.f27648d = b12;
        ?? r02 = new CameraListener() { // from class: Ue0.b
            @Override // com.yandex.mapkit.map.CameraListener
            public final void onCameraPositionChanged(Map map, CameraPosition cameraPosition, CameraUpdateReason cameraUpdateReason, boolean z11) {
                c.g(c.this, map, cameraPosition, cameraUpdateReason, z11);
            }
        };
        this.f27650f = r02;
        this.f27651g = b12;
        new Animation(Animation.Type.SMOOTH, 0.3f);
        mapView.getMap().addCameraListener(r02);
    }

    public static void g(c cVar, Map map, CameraPosition camPos, CameraUpdateReason updateReason, boolean z11) {
        EnumC10550f enumC10550f;
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(camPos, "camPos");
        Intrinsics.checkNotNullParameter(updateReason, "updateReason");
        cVar.getClass();
        C10551g k11 = k(camPos);
        int i11 = a.f27652a[updateReason.ordinal()];
        if (i11 == 1) {
            enumC10550f = EnumC10550f.USER_ACTION;
        } else {
            if (i11 != 2) {
                throw new Sc.o();
            }
            enumC10550f = EnumC10550f.APPLICATION;
        }
        cVar.f27649e = C10727i.c(cVar.f27647c, null, null, cVar.new b(new we0.h(k11, z11, enumC10550f), null), 3);
    }

    private static double j(double d11) {
        double d12 = 180;
        double d13 = 360;
        return ((((d11 + d12) % d13) + d13) % d13) - d12;
    }

    private static C10551g k(CameraPosition cameraPosition) {
        Point target = cameraPosition.getTarget();
        Intrinsics.checkNotNullExpressionValue(target, "getTarget(...)");
        return new C10551g(new we0.m(target.getLatitude(), target.getLongitude()), cameraPosition.getZoom(), cameraPosition.getAzimuth(), cameraPosition.getTilt());
    }

    @Override // ce0.InterfaceC5817a
    public final void a(@NotNull we0.j padding) {
        ScreenRect screenRect;
        Intrinsics.checkNotNullParameter(padding, "value");
        MapView mapView = this.f27645a;
        MapWindow mapWindow = mapView.getMapWindow();
        if (padding.i()) {
            screenRect = null;
        } else {
            int width = mapView.getWidth();
            int height = mapView.getHeight();
            Intrinsics.checkNotNullParameter(padding, "padding");
            Rect rect = new Rect(padding.f(), padding.h(), width - padding.g(), height - padding.e());
            screenRect = new ScreenRect(new ScreenPoint(rect.left, rect.top), new ScreenPoint(rect.right, rect.bottom));
        }
        mapWindow.setFocusRect(screenRect);
    }

    @Override // ce0.InterfaceC5817a
    public final void b(@NotNull C10551g position, float f7, Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(position, "position");
        we0.m c11 = position.c();
        this.f27645a.getMap().move(new CameraPosition(new Point(c11.getLatitude(), c11.getLongitude()), position.e(), position.b(), position.d()), new Animation(Animation.Type.SMOOTH, f7), new C4066a(function1, 0));
    }

    @Override // ce0.InterfaceC5817a
    @NotNull
    public final C10551g c(@NotNull we0.n bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Map map = this.f27645a.getMap();
        we0.m b11 = bounds.b();
        Point point = new Point(b11.getLatitude(), b11.getLongitude());
        we0.m a11 = bounds.a();
        Geometry fromBoundingBox = Geometry.fromBoundingBox(new BoundingBox(point, new Point(a11.getLatitude(), a11.getLongitude())));
        Intrinsics.checkNotNullExpressionValue(fromBoundingBox, "fromBoundingBox(...)");
        CameraPosition cameraPosition = map.cameraPosition(fromBoundingBox);
        Intrinsics.checkNotNullExpressionValue(cameraPosition, "cameraPosition(...)");
        return k(cameraPosition);
    }

    @Override // ce0.InterfaceC5817a
    @NotNull
    public final we0.j d() {
        MapView mapView = this.f27645a;
        ScreenRect focusRect = mapView.getMapWindow().getFocusRect();
        if (focusRect == null) {
            return new we0.j(0, 0, 0, 0);
        }
        int width = mapView.getWidth();
        int height = mapView.getHeight();
        Rect focusRect2 = new Rect((int) focusRect.getTopLeft().getX(), (int) focusRect.getTopLeft().getY(), (int) focusRect.getBottomRight().getX(), (int) focusRect.getBottomRight().getY());
        Intrinsics.checkNotNullParameter(focusRect2, "focusRect");
        return new we0.j(focusRect2.left, focusRect2.top, width - focusRect2.right, height - focusRect2.bottom);
    }

    @Override // ce0.InterfaceC5817a
    @NotNull
    public final C0 e() {
        return this.f27651g;
    }

    @Override // ce0.InterfaceC5817a
    public final void f(@NotNull C10551g position) {
        Intrinsics.checkNotNullParameter(position, "position");
        we0.m c11 = position.c();
        this.f27645a.getMap().move(new CameraPosition(new Point(c11.getLatitude(), c11.getLongitude()), position.e(), position.b(), position.d()));
    }

    @Override // ce0.InterfaceC5817a
    @NotNull
    public final C10551g getCurrentPosition() {
        CameraPosition cameraPosition = this.f27645a.getMap().getCameraPosition();
        Intrinsics.checkNotNullExpressionValue(cameraPosition, "getCameraPosition(...)");
        return k(cameraPosition);
    }

    @Override // ce0.InterfaceC5817a
    @NotNull
    public final we0.i getVisibleArea() {
        VisibleRegion visibleRegion = this.f27645a.getMap().getVisibleRegion();
        Intrinsics.checkNotNullExpressionValue(visibleRegion, "getVisibleRegion(...)");
        Point topLeft = visibleRegion.getTopLeft();
        we0.m mVar = new we0.m(topLeft.getLatitude(), j(topLeft.getLongitude()));
        Point topRight = visibleRegion.getTopRight();
        we0.m mVar2 = new we0.m(topRight.getLatitude(), j(topRight.getLongitude()));
        Point bottomRight = visibleRegion.getBottomRight();
        we0.m mVar3 = new we0.m(bottomRight.getLatitude(), j(bottomRight.getLongitude()));
        Point bottomLeft = visibleRegion.getBottomLeft();
        return new we0.i(mVar, mVar2, mVar3, new we0.m(bottomLeft.getLatitude(), j(bottomLeft.getLongitude())));
    }

    public final void i() {
        B0 b02 = this.f27649e;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        this.f27645a.getMap().removeCameraListener(this.f27650f);
    }
}
