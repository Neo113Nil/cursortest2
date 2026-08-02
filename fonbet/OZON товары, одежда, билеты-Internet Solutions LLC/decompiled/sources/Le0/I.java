package Le0;

import Ae.C0;
import Le0.I;
import android.content.Context;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.maplibre.android.maps.MapLibreMap;
import org.maplibre.android.maps.MapView;
import org.maplibre.android.maps.Style;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;
import ru.ozon.mapsdk.common.geoproxy.data.model.VectorData;
import te0.C9867b;
import ue0.InterfaceC10046c;
import xe.C10720e0;
import xe.C10727i;
import xe.L0;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.libre.LibreTilesController$changeTheme$2", f = "LibreTilesController.kt", l = {123, UserVerificationMethods.USER_VERIFY_PATTERN, 139}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class I extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f16879d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f16880e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ B f16881f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f16882g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ VectorData f16883h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ GeoProviderConfig f16884i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ we0.y f16885j;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.libre.LibreTilesController$changeTheme$2$1", f = "LibreTilesController.kt", l = {}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ B f16886d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f16887e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ we0.y f16888f;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.libre.LibreTilesController$changeTheme$2$1$1$1", f = "LibreTilesController.kt", l = {142}, m = "invokeSuspend")
        /* renamed from: Le0.I$a$a, reason: collision with other inner class name */
        static final class C0324a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f16889d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ B f16890e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ we0.y f16891f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0324a(B b11, we0.y yVar, kotlin.coroutines.d<? super C0324a> dVar) {
                super(2, dVar);
                this.f16890e = b11;
                this.f16891f = yVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C0324a(this.f16890e, this.f16891f, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0324a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                C0 c02;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f16889d;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    c02 = this.f16890e.f16862i;
                    this.f16889d = 1;
                    if (c02.emit(this.f16891f, this) == aVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(B b11, String str, we0.y yVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f16886d = b11;
            this.f16887e = str;
            this.f16888f = yVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f16886d, this.f16887e, this.f16888f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            MapLibreMap mapLibreMap;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            final B b11 = this.f16886d;
            mapLibreMap = b11.f16860g;
            Style.Builder builder = new Style.Builder();
            builder.e(this.f16887e);
            final we0.y yVar = this.f16888f;
            mapLibreMap.X(builder, new Style.OnStyleLoaded() { // from class: Le0.H
                @Override // org.maplibre.android.maps.Style.OnStyleLoaded
                public final void a(Style style) {
                    B b12 = B.this;
                    we0.y yVar2 = yVar;
                    b12.f16861h = yVar2;
                    C10727i.c(b12.d(), null, null, new I.a.C0324a(b12, yVar2, null), 3);
                    Intrinsics.f(style);
                    v.a(style);
                }
            });
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.libre.LibreTilesController$changeTheme$2$2", f = "LibreTilesController.kt", l = {148}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f16892d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ B f16893e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(B b11, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f16893e = b11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f16893e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C0 c02;
            we0.y yVar;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f16892d;
            if (i11 == 0) {
                Sc.s.b(obj);
                B b11 = this.f16893e;
                c02 = b11.f16862i;
                yVar = b11.f16861h;
                this.f16892d = 1;
                if (c02.emit(yVar, this) == aVar) {
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.libre.LibreTilesController$changeTheme$2$newStyleForSelectedTheme$1$1", f = "LibreTilesController.kt", l = {135}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f16894d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ B f16895e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(B b11, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f16895e = b11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new c(this.f16895e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C0 c02;
            we0.y yVar;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f16894d;
            if (i11 == 0) {
                Sc.s.b(obj);
                B b11 = this.f16895e;
                c02 = b11.f16862i;
                yVar = b11.f16861h;
                this.f16894d = 1;
                if (c02.emit(yVar, this) == aVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    I(B b11, String str, VectorData vectorData, GeoProviderConfig geoProviderConfig, we0.y yVar, kotlin.coroutines.d<? super I> dVar) {
        super(2, dVar);
        this.f16881f = b11;
        this.f16882g = str;
        this.f16883h = vectorData;
        this.f16884i = geoProviderConfig;
        this.f16885j = yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        I i11 = new I(this.f16881f, this.f16882g, this.f16883h, this.f16884i, this.f16885j, dVar);
        i11.f16880e = obj;
        return i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((I) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x010e, code lost:
    
        if (xe.C10727i.f(r1, r2, r18) != r7) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00cc A[Catch: Exception -> 0x0023, TryCatch #0 {Exception -> 0x0023, blocks: (B:7:0x001e, B:14:0x0032, B:16:0x00c6, B:18:0x00cc, B:20:0x00f9, B:24:0x003d, B:26:0x0087, B:29:0x0090, B:31:0x009b, B:36:0x004c, B:38:0x0057), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009b A[Catch: Exception -> 0x0023, TryCatch #0 {Exception -> 0x0023, blocks: (B:7:0x001e, B:14:0x0032, B:16:0x00c6, B:18:0x00cc, B:20:0x00f9, B:24:0x003d, B:26:0x0087, B:29:0x0090, B:31:0x009b, B:36:0x004c, B:38:0x0057), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c9  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        M m11;
        MapView mapView;
        M m12;
        Object f7;
        ae0.q i11;
        String str;
        MapView mapView2;
        Object f11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i12 = this.f16879d;
        we0.y yVar = this.f16885j;
        GeoProviderConfig geoProviderConfig = this.f16884i;
        VectorData vectorData = this.f16883h;
        B b11 = this.f16881f;
        try {
        } catch (Exception e11) {
            C9867b c9867b = C9867b.f99466a;
            C9867b.f(Nk.a.b("Error while change theme ", e11.getMessage()), e11, InterfaceC10046c.a.ERROR);
            C10727i.c(b11.d(), null, null, new b(b11, null), 3);
        }
        if (i12 == 0) {
            Sc.s.b(obj);
            m11 = (M) this.f16880e;
            ie0.g.f66321a.getClass();
            ae0.q i13 = ie0.g.i();
            if (i13 != null) {
                mapView = b11.f16859f;
                Context applicationContext = mapView.getContext().getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                String str2 = this.f16882g;
                String tileUrl = vectorData.getTileUrl();
                String locale = geoProviderConfig.getLocale();
                this.f16880e = m11;
                this.f16879d = 1;
                m12 = m11;
                f7 = i13.f(applicationContext, str2, tileUrl, locale, this);
                if (f7 == aVar) {
                    return aVar;
                }
            } else {
                ie0.g.f66321a.getClass();
                i11 = ie0.g.i();
                if (i11 == null) {
                    mapView2 = b11.f16859f;
                    Context applicationContext2 = mapView2.getContext().getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
                    String styleUrl = vectorData.getStyleUrl();
                    String tileUrl2 = vectorData.getTileUrl();
                    String locale2 = geoProviderConfig.getLocale();
                    this.f16880e = m11;
                    this.f16879d = 2;
                    f11 = i11.f(applicationContext2, styleUrl, tileUrl2, locale2, this);
                    if (f11 == aVar) {
                        return aVar;
                    }
                    str = (String) f11;
                    if (str == null) {
                    }
                    C10720e0 c10720e0 = C10720e0.f105451a;
                    L0 x11 = De.s.f6650a.x();
                    a aVar2 = new a(b11, str, yVar, null);
                    this.f16880e = null;
                    this.f16879d = 3;
                } else {
                    str = null;
                    if (str == null) {
                    }
                    C10720e0 c10720e02 = C10720e0.f105451a;
                    L0 x112 = De.s.f6650a.x();
                    a aVar22 = new a(b11, str, yVar, null);
                    this.f16880e = null;
                    this.f16879d = 3;
                }
            }
        } else if (i12 == 1) {
            M m13 = (M) this.f16880e;
            Sc.s.b(obj);
            m12 = m13;
            f7 = obj;
        } else {
            if (i12 != 2) {
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                return Unit.f71690a;
            }
            Sc.s.b(obj);
            f11 = obj;
            str = (String) f11;
            if (str == null) {
                String str3 = this.f16882g;
                C9867b c9867b2 = C9867b.f99466a;
                C9867b.g("Failed load style:" + str3 + " from cache for theme:" + yVar, InterfaceC10046c.a.ERROR, 4);
                C10727i.c(b11.d(), null, null, new c(b11, null), 3);
                return Unit.f71690a;
            }
            C10720e0 c10720e022 = C10720e0.f105451a;
            L0 x1122 = De.s.f6650a.x();
            a aVar222 = new a(b11, str, yVar, null);
            this.f16880e = null;
            this.f16879d = 3;
        }
        str = (String) f7;
        if (str == null) {
            m11 = m12;
            ie0.g.f66321a.getClass();
            i11 = ie0.g.i();
            if (i11 == null) {
            }
        }
        C10720e0 c10720e0222 = C10720e0.f105451a;
        L0 x11222 = De.s.f6650a.x();
        a aVar2222 = new a(b11, str, yVar, null);
        this.f16880e = null;
        this.f16879d = 3;
    }
}
