package Le0;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import android.graphics.Point;
import android.graphics.PointF;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import me0.InterfaceC8137a;
import org.jetbrains.annotations.NotNull;
import org.maplibre.android.geometry.LatLng;
import org.maplibre.android.maps.MapLibreMap;

/* renamed from: Le0.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3593j implements InterfaceC8137a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final MapLibreMap f16956a;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.libre.LibreGesturesController$onMapClickFlow$1", f = "LibreGesturesController.kt", l = {24}, m = "invokeSuspend")
    /* renamed from: Le0.j$a */
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<ze.u<? super we0.m>, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f16957d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f16958e;

        /* renamed from: Le0.j$a$a, reason: collision with other inner class name */
        static final class C0329a extends AbstractC7737t implements Function0<Unit> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C3593j f16960b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C3592i f16961c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0329a(C3593j c3593j, C3592i c3592i) {
                super(0);
                this.f16960b = c3593j;
                this.f16961c = c3592i;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                this.f16960b.f16956a.S(this.f16961c);
                return Unit.f71690a;
            }
        }

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = C3593j.this.new a(dVar);
            aVar.f16958e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ze.u<? super we0.m> uVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(uVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [Le0.i, org.maplibre.android.maps.MapLibreMap$OnMapClickListener] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f16957d;
            if (i11 == 0) {
                Sc.s.b(obj);
                final ze.u uVar = (ze.u) this.f16958e;
                final C3593j c3593j = C3593j.this;
                ?? r12 = new MapLibreMap.OnMapClickListener() { // from class: Le0.i
                    @Override // org.maplibre.android.maps.MapLibreMap.OnMapClickListener
                    public final boolean e(LatLng latLng) {
                        Intrinsics.f(latLng);
                        c3593j.getClass();
                        ze.u.this.b(new we0.m(latLng.getLatitude(), latLng.getLongitude()));
                        return false;
                    }
                };
                c3593j.f16956a.e(r12);
                C0329a c0329a = new C0329a(c3593j, r12);
                this.f16957d = 1;
                if (ze.s.a(uVar, c0329a, this) == aVar) {
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.libre.LibreGesturesController$onMapLongClickFlow$1", f = "LibreGesturesController.kt", l = {DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER}, m = "invokeSuspend")
    /* renamed from: Le0.j$b */
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<ze.u<? super we0.m>, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f16962d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f16963e;

        /* renamed from: Le0.j$b$a */
        static final class a extends AbstractC7737t implements Function0<Unit> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C3593j f16965b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ k f16966c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C3593j c3593j, k kVar) {
                super(0);
                this.f16965b = c3593j;
                this.f16966c = kVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                this.f16965b.f16956a.T(this.f16966c);
                return Unit.f71690a;
            }
        }

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = C3593j.this.new b(dVar);
            bVar.f16963e = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ze.u<? super we0.m> uVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(uVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [Le0.k, org.maplibre.android.maps.MapLibreMap$OnMapLongClickListener] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f16962d;
            if (i11 == 0) {
                Sc.s.b(obj);
                final ze.u uVar = (ze.u) this.f16963e;
                final C3593j c3593j = C3593j.this;
                ?? r12 = new MapLibreMap.OnMapLongClickListener() { // from class: Le0.k
                    @Override // org.maplibre.android.maps.MapLibreMap.OnMapLongClickListener
                    public final boolean a(LatLng latLng) {
                        Intrinsics.f(latLng);
                        c3593j.getClass();
                        ze.u.this.b(new we0.m(latLng.getLatitude(), latLng.getLongitude()));
                        return false;
                    }
                };
                c3593j.f16956a.f(r12);
                a aVar2 = new a(c3593j, r12);
                this.f16962d = 1;
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

    public C3593j(@NotNull MapLibreMap mapboxMap) {
        Intrinsics.checkNotNullParameter(mapboxMap, "mapboxMap");
        this.f16956a = mapboxMap;
    }

    @Override // me0.InterfaceC8137a
    public final void a(boolean z11) {
        this.f16956a.w().C(z11);
    }

    @Override // me0.InterfaceC8137a
    public final void b(boolean z11) {
        this.f16956a.w().E(z11);
    }

    @Override // me0.InterfaceC8137a
    public final void c(boolean z11) {
        this.f16956a.w().D(z11);
    }

    @Override // me0.InterfaceC8137a
    public final void d(boolean z11) {
        this.f16956a.w().G(z11);
    }

    @Override // me0.InterfaceC8137a
    @NotNull
    public final InterfaceC2395h<we0.m> e() {
        return C2399j.e(new a(null));
    }

    @Override // me0.InterfaceC8137a
    @NotNull
    public final InterfaceC2395h<we0.m> f() {
        return C2399j.e(new b(null));
    }

    @Override // me0.InterfaceC8137a
    public final void setZoomFocusPoint(Point point) {
        this.f16956a.w().A(point != null ? new PointF(point.x, point.y) : null);
    }
}
