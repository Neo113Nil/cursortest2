package Le0;

import Ae.C0;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.E0;
import Ae.O0;
import Ae.x0;
import De.C2862e;
import Le0.C3588e;
import ce0.InterfaceC5817a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import fd.InterfaceC6511n;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.maplibre.android.camera.CameraPosition;
import org.maplibre.android.geometry.LatLngBounds;
import org.maplibre.android.maps.MapLibreMap;
import we0.C10551g;
import we0.EnumC10550f;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.H0;
import xe.L0;
import xe.M;
import xe.N;
import xe.X0;

/* renamed from: Le0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3588e implements InterfaceC5817a, M {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final MapLibreMap f16911a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f16912b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2862e f16913c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C0 f16914d;

    /* renamed from: e, reason: collision with root package name */
    private B0 f16915e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C0 f16916f;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.libre.LibreCameraController$1", f = "LibreCameraController.kt", l = {132}, m = "invokeSuspend")
    /* renamed from: Le0.e$a */
    public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f16917d;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.libre.LibreCameraController$1$1$1", f = "LibreCameraController.kt", l = {66}, m = "invokeSuspend")
        /* renamed from: Le0.e$a$a, reason: collision with other inner class name */
        static final class C0325a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f16919d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C3588e f16920e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ we0.h f16921f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0325a(C3588e c3588e, we0.h hVar, kotlin.coroutines.d<? super C0325a> dVar) {
                super(2, dVar);
                this.f16920e = c3588e;
                this.f16921f = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C0325a(this.f16920e, this.f16921f, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0325a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f16919d;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    C0 c02 = this.f16920e.f16914d;
                    this.f16919d = 1;
                    if (c02.emit(this.f16921f, this) == aVar) {
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

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.libre.LibreCameraController$1$2$1", f = "LibreCameraController.kt", l = {78}, m = "invokeSuspend")
        /* renamed from: Le0.e$a$b */
        static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f16922d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ x0<C10551g> f16923e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C3588e f16924f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(x0<C10551g> x0Var, C3588e c3588e, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f16923e = x0Var;
                this.f16924f = c3588e;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new b(this.f16923e, this.f16924f, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f16922d;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    C10551g currentPosition = this.f16924f.getCurrentPosition();
                    this.f16922d = 1;
                    if (this.f16923e.emit(currentPosition, this) == aVar) {
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

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.libre.LibreCameraController$1$2$2", f = "LibreCameraController.kt", l = {82}, m = "invokeSuspend")
        /* renamed from: Le0.e$a$c */
        static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f16925d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C3588e f16926e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ we0.h f16927f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(C3588e c3588e, we0.h hVar, kotlin.coroutines.d<? super c> dVar) {
                super(2, dVar);
                this.f16926e = c3588e;
                this.f16927f = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new c(this.f16926e, this.f16927f, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f16925d;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    C0 c02 = this.f16926e.f16914d;
                    this.f16925d = 1;
                    if (c02.emit(this.f16927f, this) == aVar) {
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

        /* renamed from: Le0.e$a$d */
        public static final class d implements MapLibreMap.OnMoveListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C3588e f16928a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ x0<C10551g> f16929b;

            @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.libre.LibreCameraController$1$3$onMove$1", f = "LibreCameraController.kt", l = {93}, m = "invokeSuspend")
            /* renamed from: Le0.e$a$d$a, reason: collision with other inner class name */
            static final class C0326a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

                /* renamed from: d, reason: collision with root package name */
                int f16930d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ x0<C10551g> f16931e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ C3588e f16932f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0326a(x0<C10551g> x0Var, C3588e c3588e, kotlin.coroutines.d<? super C0326a> dVar) {
                    super(2, dVar);
                    this.f16931e = x0Var;
                    this.f16932f = c3588e;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new C0326a(this.f16931e, this.f16932f, dVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                    return ((C0326a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    int i11 = this.f16930d;
                    if (i11 == 0) {
                        Sc.s.b(obj);
                        C10551g currentPosition = this.f16932f.getCurrentPosition();
                        this.f16930d = 1;
                        if (this.f16931e.emit(currentPosition, this) == aVar) {
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

            @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.libre.LibreCameraController$1$3$onMoveEnd$1", f = "LibreCameraController.kt", l = {97}, m = "invokeSuspend")
            /* renamed from: Le0.e$a$d$b */
            static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

                /* renamed from: d, reason: collision with root package name */
                int f16933d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ x0<C10551g> f16934e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ C3588e f16935f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(x0<C10551g> x0Var, C3588e c3588e, kotlin.coroutines.d<? super b> dVar) {
                    super(2, dVar);
                    this.f16934e = x0Var;
                    this.f16935f = c3588e;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new b(this.f16934e, this.f16935f, dVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                    return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    int i11 = this.f16933d;
                    if (i11 == 0) {
                        Sc.s.b(obj);
                        C10551g currentPosition = this.f16935f.getCurrentPosition();
                        this.f16933d = 1;
                        if (this.f16934e.emit(currentPosition, this) == aVar) {
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

            d(C3588e c3588e, x0<C10551g> x0Var) {
                this.f16928a = c3588e;
                this.f16929b = x0Var;
            }

            @Override // org.maplibre.android.maps.MapLibreMap.OnMoveListener
            public final void a(Yf.d detector) {
                Intrinsics.checkNotNullParameter(detector, "detector");
            }

            @Override // org.maplibre.android.maps.MapLibreMap.OnMoveListener
            public final void b(Yf.d detector) {
                Intrinsics.checkNotNullParameter(detector, "detector");
                C3588e c3588e = this.f16928a;
                C10727i.c(c3588e.f16913c, null, null, new b(this.f16929b, c3588e, null), 3);
            }

            @Override // org.maplibre.android.maps.MapLibreMap.OnMoveListener
            public final void c(Yf.d detector) {
                Intrinsics.checkNotNullParameter(detector, "detector");
                C3588e c3588e = this.f16928a;
                C10727i.c(c3588e.f16913c, null, null, new C0326a(this.f16929b, c3588e, null), 3);
            }
        }

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.libre.LibreCameraController$1$4$1", f = "LibreCameraController.kt", l = {105}, m = "invokeSuspend")
        /* renamed from: Le0.e$a$e, reason: collision with other inner class name */
        static final class C0327e extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f16936d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ x0<C10551g> f16937e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C3588e f16938f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0327e(x0<C10551g> x0Var, C3588e c3588e, kotlin.coroutines.d<? super C0327e> dVar) {
                super(2, dVar);
                this.f16937e = x0Var;
                this.f16938f = c3588e;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C0327e(this.f16937e, this.f16938f, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0327e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f16936d;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    C10551g currentPosition = this.f16938f.getCurrentPosition();
                    this.f16936d = 1;
                    if (this.f16937e.emit(currentPosition, this) == aVar) {
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

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.libre.LibreCameraController$1$5$1", f = "LibreCameraController.kt", l = {109}, m = "invokeSuspend")
        /* renamed from: Le0.e$a$f */
        static final class f extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f16939d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ x0<C10551g> f16940e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C3588e f16941f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(x0<C10551g> x0Var, C3588e c3588e, kotlin.coroutines.d<? super f> dVar) {
                super(2, dVar);
                this.f16940e = x0Var;
                this.f16941f = c3588e;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new f(this.f16940e, this.f16941f, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f16939d;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    C10551g currentPosition = this.f16941f.getCurrentPosition();
                    this.f16939d = 1;
                    if (this.f16940e.emit(currentPosition, this) == aVar) {
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

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.libre.LibreCameraController$1$6", f = "LibreCameraController.kt", l = {}, m = "invokeSuspend")
        /* renamed from: Le0.e$a$g */
        static final class g extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n<C10551g, C10551g, kotlin.coroutines.d<? super Pair<? extends C10551g, ? extends C10551g>>, Object> {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ C10551g f16942d;

            /* renamed from: e, reason: collision with root package name */
            /* synthetic */ C10551g f16943e;

            @Override // fd.InterfaceC6511n
            public final Object invoke(C10551g c10551g, C10551g c10551g2, kotlin.coroutines.d<? super Pair<? extends C10551g, ? extends C10551g>> dVar) {
                g gVar = new g(3, dVar);
                gVar.f16942d = c10551g;
                gVar.f16943e = c10551g2;
                return gVar.invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                Sc.s.b(obj);
                return new Pair(this.f16942d, this.f16943e);
            }
        }

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.libre.LibreCameraController$1$7", f = "LibreCameraController.kt", l = {UserVerificationMethods.USER_VERIFY_PATTERN}, m = "invokeSuspend")
        /* renamed from: Le0.e$a$h */
        static final class h extends kotlin.coroutines.jvm.internal.j implements Function2<Pair<? extends C10551g, ? extends C10551g>, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f16944d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Function0<B0> f16945e;

            @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.libre.LibreCameraController$1$7$1", f = "LibreCameraController.kt", l = {}, m = "invokeSuspend")
            /* renamed from: Le0.e$a$h$a, reason: collision with other inner class name */
            static final class C0328a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ Function0<B0> f16946d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0328a(Function0<? extends B0> function0, kotlin.coroutines.d<? super C0328a> dVar) {
                    super(2, dVar);
                    this.f16946d = function0;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new C0328a(this.f16946d, dVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                    return ((C0328a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    Sc.s.b(obj);
                    this.f16946d.invoke();
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            h(Function0<? extends B0> function0, kotlin.coroutines.d<? super h> dVar) {
                super(2, dVar);
                this.f16945e = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new h(this.f16945e, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Pair<? extends C10551g, ? extends C10551g> pair, kotlin.coroutines.d<? super Unit> dVar) {
                return ((h) create(pair, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f16944d;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    C10720e0 c10720e0 = C10720e0.f105451a;
                    L0 x11 = De.s.f6650a.x();
                    C0328a c0328a = new C0328a(this.f16945e, null);
                    this.f16944d = 1;
                    if (C10727i.f(x11, c0328a, this) == aVar) {
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

        /* renamed from: Le0.e$a$i */
        static final class i extends AbstractC7737t implements Function0<B0> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C3588e f16947b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.M<we0.h> f16948c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            i(C3588e c3588e, kotlin.jvm.internal.M<we0.h> m11) {
                super(0);
                this.f16947b = c3588e;
                this.f16948c = m11;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [T, we0.h] */
            @Override // kotlin.jvm.functions.Function0
            public final B0 invoke() {
                EnumC10550f enumC10550f;
                C3588e c3588e = this.f16947b;
                C10551g currentPosition = c3588e.getCurrentPosition();
                kotlin.jvm.internal.M<we0.h> m11 = this.f16948c;
                we0.h hVar = m11.f71787a;
                if (hVar == null || (enumC10550f = hVar.b()) == null) {
                    enumC10550f = EnumC10550f.USER_ACTION;
                }
                ?? hVar2 = new we0.h(currentPosition, true, enumC10550f);
                m11.f71787a = hVar2;
                return C10727i.c(c3588e.f16913c, null, null, new C3589f(c3588e, hVar2, null), 3);
            }
        }

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C3588e.this.new a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v1, types: [Le0.b] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f16917d;
            if (i11 == 0) {
                Sc.s.b(obj);
                final kotlin.jvm.internal.M m11 = new kotlin.jvm.internal.M();
                final x0 a11 = O0.a(null);
                final x0 a12 = O0.a(null);
                final C3588e c3588e = C3588e.this;
                c3588e.f16911a.d(new MapLibreMap.OnCameraMoveStartedListener() { // from class: Le0.a
                    /* JADX WARN: Type inference failed for: r0v0, types: [T, we0.h] */
                    @Override // org.maplibre.android.maps.MapLibreMap.OnCameraMoveStartedListener
                    public final void onCameraMoveStarted(int i12) {
                        C3588e c3588e2 = C3588e.this;
                        ?? hVar = new we0.h(c3588e2.getCurrentPosition(), false, i12 == 1 ? EnumC10550f.USER_ACTION : EnumC10550f.APPLICATION);
                        m11.f71787a = hVar;
                        C10727i.c(c3588e2.f16913c, null, null, new C3588e.a.C0325a(c3588e2, hVar, null), 3);
                    }
                });
                c3588e.f16911a.c(new MapLibreMap.OnCameraMoveListener() { // from class: Le0.b
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v0, types: [T, we0.h] */
                    @Override // org.maplibre.android.maps.MapLibreMap.OnCameraMoveListener
                    public final void onCameraMove() {
                        EnumC10550f enumC10550f;
                        C3588e c3588e2 = C3588e.this;
                        C10551g currentPosition = c3588e2.getCurrentPosition();
                        kotlin.jvm.internal.M m12 = m11;
                        we0.h hVar = (we0.h) m12.f71787a;
                        if (hVar == null || (enumC10550f = hVar.b()) == null) {
                            enumC10550f = EnumC10550f.USER_ACTION;
                        }
                        ?? hVar2 = new we0.h(currentPosition, false, enumC10550f);
                        C10551g a13 = hVar2.a();
                        we0.h hVar3 = (we0.h) m12.f71787a;
                        if (Intrinsics.d(a13, hVar3 != null ? hVar3.a() : null)) {
                            C10727i.c(c3588e2.f16913c, null, null, new C3588e.a.b(a11, c3588e2, null), 3);
                        }
                        m12.f71787a = hVar2;
                        C10727i.c(c3588e2.f16913c, null, null, new C3588e.a.c(c3588e2, hVar2, null), 3);
                    }
                });
                c3588e.f16911a.g(new d(c3588e, a11));
                c3588e.f16911a.b(new MapLibreMap.OnCameraMoveCanceledListener() { // from class: Le0.c
                    @Override // org.maplibre.android.maps.MapLibreMap.OnCameraMoveCanceledListener
                    public final void onCameraMoveCanceled() {
                        C3588e c3588e2 = C3588e.this;
                        C10727i.c(c3588e2.f16913c, null, null, new C3588e.a.C0327e(a12, c3588e2, null), 3);
                    }
                });
                c3588e.f16911a.a(new MapLibreMap.OnCameraIdleListener() { // from class: Le0.d
                    @Override // org.maplibre.android.maps.MapLibreMap.OnCameraIdleListener
                    public final void onCameraIdle() {
                        C3588e c3588e2 = C3588e.this;
                        C10727i.c(c3588e2.f16913c, null, null, new C3588e.a.f(a12, c3588e2, null), 3);
                    }
                });
                C2408n0 c2408n0 = new C2408n0(C2399j.l(new Be.q(a11, a12, new g(3, null)), 200L), new h(new i(c3588e, m11), null));
                this.f16917d = 1;
                if (C2399j.g(c2408n0, this) == aVar) {
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

    /* renamed from: Le0.e$b */
    public static final class b implements MapLibreMap.CancelableCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<Boolean, Unit> f16949a;

        /* JADX WARN: Multi-variable type inference failed */
        b(Function1<? super Boolean, Unit> function1) {
            this.f16949a = function1;
        }

        public final void a() {
            Function1<Boolean, Unit> function1 = this.f16949a;
            if (function1 != null) {
                function1.invoke(Boolean.FALSE);
            }
        }

        public final void b() {
            Function1<Boolean, Unit> function1 = this.f16949a;
            if (function1 != null) {
                function1.invoke(Boolean.TRUE);
            }
        }
    }

    public C3588e(@NotNull MapLibreMap mapLibreMap) {
        Intrinsics.checkNotNullParameter(mapLibreMap, "mapLibreMap");
        this.f16911a = mapLibreMap;
        CoroutineContext d11 = CoroutineContext.Element.a.d(C10720e0.a(), (H0) X0.b());
        this.f16912b = d11;
        C2862e a11 = N.a(d11);
        this.f16913c = a11;
        C0 b11 = E0.b(0, 0, null, 7);
        this.f16914d = b11;
        this.f16915e = C10727i.c(a11, null, null, new a(null), 3);
        this.f16916f = b11;
    }

    @Override // ce0.InterfaceC5817a
    public final void a(@NotNull we0.j value) {
        Intrinsics.checkNotNullParameter(value, "value");
        MapLibreMap mapLibreMap = this.f16911a;
        CameraPosition k11 = mapLibreMap.k();
        Intrinsics.checkNotNullExpressionValue(k11, "getCameraPosition(...)");
        CameraPosition.a aVar = new CameraPosition.a();
        aVar.d(k11.target);
        aVar.e(k11.tilt);
        aVar.a(k11.bearing);
        aVar.f(k11.zoom);
        aVar.c(new double[]{value.f(), value.h(), value.g(), value.e()});
        mapLibreMap.B(org.maplibre.android.camera.a.a(aVar.b()));
    }

    @Override // ce0.InterfaceC5817a
    public final void b(@NotNull C10551g position, float f7, Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(position, "position");
        this.f16911a.i(new C3590g(position), (int) (f7 * 1000), new b(function1));
    }

    @Override // ce0.InterfaceC5817a
    @NotNull
    public final C10551g c(@NotNull we0.n bounds) {
        LatLngBounds c11;
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        try {
            LatLngBounds.Companion companion = LatLngBounds.INSTANCE;
            double latitude = bounds.a().getLatitude();
            double longitude = bounds.a().getLongitude();
            double latitude2 = bounds.b().getLatitude();
            double longitude2 = bounds.b().getLongitude();
            companion.getClass();
            c11 = LatLngBounds.Companion.c(latitude, longitude, latitude2, longitude2);
        } catch (Exception unused) {
            LatLngBounds.Companion companion2 = LatLngBounds.INSTANCE;
            double max = Math.max(bounds.a().getLatitude(), bounds.b().getLatitude());
            double max2 = Math.max(bounds.a().getLongitude(), bounds.b().getLongitude());
            double min = Math.min(bounds.a().getLatitude(), bounds.b().getLatitude());
            double min2 = Math.min(bounds.a().getLongitude(), bounds.b().getLongitude());
            companion2.getClass();
            c11 = LatLngBounds.Companion.c(max, max2, min, min2);
        }
        CameraPosition j11 = this.f16911a.j(c11);
        return j11 != null ? C3591h.a(j11) : getCurrentPosition();
    }

    @Override // ce0.InterfaceC5817a
    @NotNull
    public final we0.j d() {
        double[] dArr = this.f16911a.k().padding;
        return dArr != null ? new we0.j((int) dArr[0], (int) dArr[1], (int) dArr[2], (int) dArr[3]) : new we0.j(0, 0, 0, 0);
    }

    @Override // ce0.InterfaceC5817a
    @NotNull
    public final C0 e() {
        return this.f16916f;
    }

    @Override // ce0.InterfaceC5817a
    public final void f(@NotNull C10551g position) {
        Intrinsics.checkNotNullParameter(position, "position");
        this.f16911a.B(new C3590g(position));
    }

    @Override // xe.M
    @NotNull
    public final CoroutineContext getCoroutineContext() {
        return this.f16912b;
    }

    @Override // ce0.InterfaceC5817a
    @NotNull
    public final C10551g getCurrentPosition() {
        CameraPosition k11 = this.f16911a.k();
        Intrinsics.checkNotNullExpressionValue(k11, "getCameraPosition(...)");
        return C3591h.a(k11);
    }

    @Override // ce0.InterfaceC5817a
    @NotNull
    public final we0.i getVisibleArea() {
        Xf.b e11 = this.f16911a.t().e();
        Intrinsics.checkNotNullExpressionValue(e11, "getVisibleRegion(...)");
        return C3591h.b(e11);
    }

    public final void j() {
        B0 b02 = this.f16915e;
        if (b02 != null) {
            ((H0) b02).j(null);
            Unit unit = Unit.f71690a;
        }
    }
}
