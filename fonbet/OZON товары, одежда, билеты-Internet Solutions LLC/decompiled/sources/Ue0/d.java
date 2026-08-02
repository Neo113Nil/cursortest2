package Ue0;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.GestureFocusPointMode;
import com.yandex.mapkit.map.InputListener;
import com.yandex.mapkit.map.Map;
import com.yandex.mapkit.mapview.MapView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import me0.InterfaceC8137a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class d implements InterfaceC8137a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final MapView f27656a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC2395h<we0.m> f27657b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC2395h<we0.m> f27658c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private AbstractC7737t f27659d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private AbstractC7737t f27660e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final c f27661f;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.yandex.YandexGesturesController$1", f = "YandexGesturesController.kt", l = {47}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<ze.u<? super we0.m>, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f27662d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f27663e;

        /* renamed from: Ue0.d$a$a, reason: collision with other inner class name */
        static final class C0560a extends AbstractC7737t implements Function1<Point, Unit> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ze.u<we0.m> f27665b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0560a(ze.u<? super we0.m> uVar) {
                super(1);
                this.f27665b = uVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Point point) {
                Point it = point;
                Intrinsics.checkNotNullParameter(it, "it");
                this.f27665b.b(new we0.m(it.getLatitude(), it.getLongitude()));
                return Unit.f71690a;
            }
        }

        static final class b extends AbstractC7737t implements Function0<Unit> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f27666b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(d dVar) {
                super(0);
                this.f27666b = dVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                d.j(this.f27666b, Ue0.e.f27675b);
                return Unit.f71690a;
            }
        }

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = d.this.new a(dVar);
            aVar.f27663e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ze.u<? super we0.m> uVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(uVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f27662d;
            if (i11 == 0) {
                Sc.s.b(obj);
                ze.u uVar = (ze.u) this.f27663e;
                C0560a c0560a = new C0560a(uVar);
                d dVar = d.this;
                d.j(dVar, c0560a);
                b bVar = new b(dVar);
                this.f27662d = 1;
                if (ze.s.a(uVar, bVar, this) == aVar) {
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.yandex.YandexGesturesController$2", f = "YandexGesturesController.kt", l = {61}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<ze.u<? super we0.m>, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f27667d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f27668e;

        static final class a extends AbstractC7737t implements Function1<Point, Unit> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ze.u<we0.m> f27670b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(ze.u<? super we0.m> uVar) {
                super(1);
                this.f27670b = uVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Point point) {
                Point it = point;
                Intrinsics.checkNotNullParameter(it, "it");
                this.f27670b.b(new we0.m(it.getLatitude(), it.getLongitude()));
                return Unit.f71690a;
            }
        }

        /* renamed from: Ue0.d$b$b, reason: collision with other inner class name */
        static final class C0561b extends AbstractC7737t implements Function0<Unit> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f27671b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0561b(d dVar) {
                super(0);
                this.f27671b = dVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                d.i(this.f27671b, f.f27676b);
                return Unit.f71690a;
            }
        }

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = d.this.new b(dVar);
            bVar.f27668e = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ze.u<? super we0.m> uVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(uVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f27667d;
            if (i11 == 0) {
                Sc.s.b(obj);
                ze.u uVar = (ze.u) this.f27668e;
                a aVar2 = new a(uVar);
                d dVar = d.this;
                d.i(dVar, aVar2);
                C0561b c0561b = new C0561b(dVar);
                this.f27667d = 1;
                if (ze.s.a(uVar, c0561b, this) == aVar) {
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

    public static final class c implements InputListener {
        c() {
        }

        @Override // com.yandex.mapkit.map.InputListener
        public final void onMapLongTap(Map p02, Point p12) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            Intrinsics.checkNotNullParameter(p12, "p1");
            d.this.f27660e.invoke(p12);
        }

        @Override // com.yandex.mapkit.map.InputListener
        public final void onMapTap(Map p02, Point p12) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            Intrinsics.checkNotNullParameter(p12, "p1");
            d.this.f27659d.invoke(p12);
        }
    }

    /* renamed from: Ue0.d$d, reason: collision with other inner class name */
    static final class C0562d extends AbstractC7737t implements Function1<Point, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final C0562d f27673b = new C0562d(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Point point) {
            Point it = point;
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.f71690a;
        }
    }

    static final class e extends AbstractC7737t implements Function1<Point, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f27674b = new e(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Point point) {
            Point it = point;
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.f71690a;
        }
    }

    public d(@NotNull MapView mapView) {
        Intrinsics.checkNotNullParameter(mapView, "mapView");
        this.f27656a = mapView;
        this.f27659d = e.f27674b;
        this.f27660e = C0562d.f27673b;
        c cVar = new c();
        this.f27661f = cVar;
        InterfaceC2395h<we0.m> e11 = C2399j.e(new a(null));
        Intrinsics.checkNotNullParameter(e11, "<set-?>");
        this.f27657b = e11;
        InterfaceC2395h<we0.m> e12 = C2399j.e(new b(null));
        Intrinsics.checkNotNullParameter(e12, "<set-?>");
        this.f27658c = e12;
        mapView.getMap().addInputListener(cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ void i(d dVar, Function1 function1) {
        dVar.f27660e = (AbstractC7737t) function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ void j(d dVar, Function1 function1) {
        dVar.f27659d = (AbstractC7737t) function1;
    }

    @Override // me0.InterfaceC8137a
    public final void a(boolean z11) {
        this.f27656a.getMap().setRotateGesturesEnabled(z11);
    }

    @Override // me0.InterfaceC8137a
    public final void b(boolean z11) {
        this.f27656a.getMap().setTiltGesturesEnabled(z11);
    }

    @Override // me0.InterfaceC8137a
    public final void c(boolean z11) {
        this.f27656a.getMap().setScrollGesturesEnabled(z11);
    }

    @Override // me0.InterfaceC8137a
    public final void d(boolean z11) {
        this.f27656a.getMap().setZoomGesturesEnabled(z11);
    }

    @Override // me0.InterfaceC8137a
    @NotNull
    public final InterfaceC2395h<we0.m> e() {
        InterfaceC2395h<we0.m> interfaceC2395h = this.f27657b;
        if (interfaceC2395h != null) {
            return interfaceC2395h;
        }
        Intrinsics.n("onMapClickFlow");
        throw null;
    }

    @Override // me0.InterfaceC8137a
    @NotNull
    public final InterfaceC2395h<we0.m> f() {
        InterfaceC2395h<we0.m> interfaceC2395h = this.f27658c;
        if (interfaceC2395h != null) {
            return interfaceC2395h;
        }
        Intrinsics.n("onMapLongClickFlow");
        throw null;
    }

    public final void k() {
        this.f27656a.getMap().removeInputListener(this.f27661f);
    }

    @Override // me0.InterfaceC8137a
    public final void setZoomFocusPoint(android.graphics.Point point) {
        MapView mapView = this.f27656a;
        mapView.getMapWindow().setGestureFocusPoint(point != null ? new ScreenPoint(point.x, point.y) : null);
        mapView.getMapWindow().setGestureFocusPointMode(GestureFocusPointMode.AFFECTS_ALL_GESTURES);
    }
}
