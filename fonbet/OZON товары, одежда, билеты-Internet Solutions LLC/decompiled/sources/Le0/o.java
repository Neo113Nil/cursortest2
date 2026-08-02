package Le0;

import Ae.M0;
import Je0.d;
import Sc.InterfaceC4008j;
import We.E;
import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.ViewConfiguration;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import be0.C5656a;
import ce0.InterfaceC5817a;
import cg.C5828b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import ei0.InterfaceC6369b;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import me0.InterfaceC8137a;
import ne0.InterfaceC8585d;
import org.jetbrains.annotations.NotNull;
import org.maplibre.android.MapLibre;
import org.maplibre.android.camera.CameraPosition;
import org.maplibre.android.maps.MapLibreMap;
import org.maplibre.android.maps.MapLibreMapOptions;
import org.maplibre.android.maps.OnMapReadyCallback;
import org.maplibre.android.maps.Style;
import org.maplibre.android.offline.OfflineManager;
import org.maplibre.android.style.layers.TransitionOptions;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;
import ru.ozon.mapsdk.common.geoproxy.data.model.VectorData;
import ru.ozon.mapsdk.common.geoproxy.model.GeoProxyConfig;
import te0.C9867b;
import ue0.InterfaceC10046c;
import ve0.AbstractC10313a;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.C10749t0;
import xe.H0;
import xe.L0;
import xe.M;
import xe0.InterfaceC10766e;
import xe0.InterfaceC10767f;
import xe0.InterfaceC10768g;
import ye0.InterfaceC10889a;
import ze0.InterfaceC11117a;

/* loaded from: classes3.dex */
public final class o extends AbstractC10313a {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Context f16973b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final GeoProviderConfig f16974c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final M0<we0.x> f16975d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final we0.w f16976e;

    /* renamed from: f, reason: collision with root package name */
    private final float f16977f;

    /* renamed from: g, reason: collision with root package name */
    private final VectorData f16978g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final xe0.j f16979h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private a f16980i;

    /* renamed from: j, reason: collision with root package name */
    private B0 f16981j;

    /* renamed from: k, reason: collision with root package name */
    private MapLibreMap f16982k;

    /* renamed from: l, reason: collision with root package name */
    private C5656a f16983l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f16984m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f16985n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final Object f16986o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final Object f16987p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final Object f16988q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final Object f16989r;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private final Object f16990s;

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private final Object f16991t;

    /* renamed from: u, reason: collision with root package name */
    @NotNull
    private final Object f16992u;

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    private final Object f16993v;

    /* renamed from: w, reason: collision with root package name */
    @NotNull
    private final Object f16994w;

    /* renamed from: x, reason: collision with root package name */
    @NotNull
    private final Object f16995x;

    /* renamed from: y, reason: collision with root package name */
    @NotNull
    private final Object f16996y;

    /* renamed from: z, reason: collision with root package name */
    @NotNull
    private final Object f16997z;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a NONE;
        public static final a RASTER;
        public static final a VECTOR;

        static {
            a aVar = new a("VECTOR", 0);
            VECTOR = aVar;
            a aVar2 = new a("RASTER", 1);
            RASTER = aVar2;
            a aVar3 = new a("NONE", 2);
            NONE = aVar3;
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

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16998a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f16999b;

        static {
            int[] iArr = new int[we0.r.values().length];
            try {
                iArr[we0.r.LEFT_TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[we0.r.RIGHT_TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[we0.r.LEFT_BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[we0.r.RIGHT_BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f16998a = iArr;
            int[] iArr2 = new int[a.values().length];
            try {
                iArr2[a.VECTOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[a.RASTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[a.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            f16999b = iArr2;
        }
    }

    static final class c extends AbstractC7737t implements Function0<C3588e> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3588e invoke() {
            MapLibreMap mapLibreMap = o.this.f16982k;
            if (mapLibreMap != null) {
                return new C3588e(mapLibreMap);
            }
            Intrinsics.n("mapLibreMap");
            throw null;
        }
    }

    static final class d extends AbstractC7737t implements Function0<ee0.j> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ee0.j invoke() {
            o oVar = o.this;
            return new ee0.j(new fe0.i(o.w(oVar), oVar.g(), oVar.f16975d, new ee0.i(new Le0.p(oVar)), oVar.i()));
        }
    }

    static final class e extends AbstractC7737t implements Function0<RelativeLayout> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final RelativeLayout invoke() {
            o oVar = o.this;
            RelativeLayout relativeLayout = new RelativeLayout(oVar.f16973b);
            relativeLayout.addView(oVar.B(), -1, -1);
            Context context = relativeLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            oVar.f16983l = new C5656a(context, oVar.f16974c);
            C5656a c5656a = oVar.f16983l;
            if (c5656a == null) {
                Intrinsics.n("copyrightWidget");
                throw null;
            }
            relativeLayout.addView(c5656a);
            oVar.setLogoConfig(new we0.q((we0.r) null, 3));
            return relativeLayout;
        }
    }

    static final class f extends AbstractC7737t implements Function0<Ne0.a> {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Ne0.a invoke() {
            o oVar = o.this;
            w B11 = oVar.B();
            MapLibreMap mapLibreMap = oVar.f16982k;
            if (mapLibreMap != null) {
                return new Ne0.a(B11, mapLibreMap);
            }
            Intrinsics.n("mapLibreMap");
            throw null;
        }
    }

    static final class g extends AbstractC7737t implements Function0<C3593j> {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3593j invoke() {
            MapLibreMap mapLibreMap = o.this.f16982k;
            if (mapLibreMap != null) {
                return new C3593j(mapLibreMap);
            }
            Intrinsics.n("mapLibreMap");
            throw null;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.libre.LibreMapController$initMapView$2$1$1", f = "LibreMapController.kt", l = {124, 125}, m = "invokeSuspend")
    static final class h extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f17005d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ w f17007f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ MapLibreMap f17008g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ AbstractC7737t f17009h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.libre.LibreMapController$initMapView$2$1$1$1", f = "LibreMapController.kt", l = {}, m = "invokeSuspend")
        static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ o f17010d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ w f17011e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ MapLibreMap f17012f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Style.Builder f17013g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ AbstractC7737t f17014h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(o oVar, w wVar, MapLibreMap mapLibreMap, Style.Builder builder, Function0<Unit> function0, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f17010d = oVar;
                this.f17011e = wVar;
                this.f17012f = mapLibreMap;
                this.f17013g = builder;
                this.f17014h = (AbstractC7737t) function0;
            }

            /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                ?? r52 = this.f17014h;
                return new a(this.f17010d, this.f17011e, this.f17012f, this.f17013g, r52, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                Sc.s.b(obj);
                final o oVar = this.f17010d;
                Ne0.a o11 = o.o(oVar);
                Context context = this.f17011e.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                o11.a(context);
                final ?? r12 = this.f17014h;
                final MapLibreMap mapLibreMap = this.f17012f;
                mapLibreMap.X(this.f17013g, new Style.OnStyleLoaded(mapLibreMap, r12) { // from class: Le0.t

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ MapLibreMap f17036b;

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ AbstractC7737t f17037c;

                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        this.f17037c = (AbstractC7737t) r12;
                    }

                    /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
                    @Override // org.maplibre.android.maps.Style.OnStyleLoaded
                    public final void a(Style style) {
                        o oVar2 = o.this;
                        o.z(oVar2);
                        v.a(style);
                        CameraPosition p11 = o.p(oVar2);
                        MapLibreMap mapLibreMap2 = this.f17036b;
                        mapLibreMap2.getClass();
                        mapLibreMap2.B(org.maplibre.android.camera.a.a(p11));
                        this.f17037c.invoke();
                    }
                });
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(w wVar, MapLibreMap mapLibreMap, Function0<Unit> function0, kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
            this.f17007f = wVar;
            this.f17008g = mapLibreMap;
            this.f17009h = (AbstractC7737t) function0;
        }

        /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return o.this.new h(this.f17007f, this.f17008g, this.f17009h, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((h) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x005c, code lost:
        
            if (xe.C10727i.f(r11, r3, r10) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x005e, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
        
            if (r11 == r0) goto L15;
         */
        /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f17005d;
            if (i11 == 0) {
                Sc.s.b(obj);
                Context applicationContext = this.f17007f.getContext().getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                o oVar = o.this;
                VectorData vectorData = oVar.f16978g;
                this.f17005d = 1;
                obj = o.k(oVar, applicationContext, vectorData, this);
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                    return Unit.f71690a;
                }
                Sc.s.b(obj);
            }
            Style.Builder builder = (Style.Builder) obj;
            C10720e0 c10720e0 = C10720e0.f105451a;
            L0 x11 = De.s.f6650a.x();
            ?? r82 = this.f17009h;
            a aVar2 = new a(o.this, this.f17007f, this.f17008g, builder, r82, null);
            this.f17005d = 2;
        }
    }

    static final class i extends AbstractC7737t implements Function0<Le0.l> {
        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Le0.l invoke() {
            o oVar = o.this;
            w B11 = oVar.B();
            MapLibreMap mapLibreMap = oVar.f16982k;
            if (mapLibreMap == null) {
                Intrinsics.n("mapLibreMap");
                throw null;
            }
            return new Le0.l(mapLibreMap, o.w(oVar).a(), oVar.C(), oVar.g(), B11, oVar.i());
        }
    }

    static final class j extends AbstractC7737t implements Function0<w> {
        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final w invoke() {
            o oVar = o.this;
            MapLibre.getInstance(oVar.f16973b, null, org.maplibre.android.f.MapLibre);
            float f7 = oVar.f16973b.getResources().getDisplayMetrics().density;
            Context context = oVar.f16973b;
            MapLibreMapOptions mapLibreMapOptions = new MapLibreMapOptions();
            mapLibreMapOptions.f0();
            mapLibreMapOptions.e0(f7);
            mapLibreMapOptions.a(o.p(oVar));
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(mapLibreMapOptions, "mapLibreMapOptions");
            return new w(context, mapLibreMapOptions);
        }
    }

    static final class k extends AbstractC7737t implements Function0<InterfaceC10766e> {
        k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final InterfaceC10766e invoke() {
            return o.w(o.this).a();
        }
    }

    static final class l extends AbstractC7737t implements Function0<Ne0.d> {
        l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Ne0.d invoke() {
            o oVar = o.this;
            w B11 = oVar.B();
            MapLibreMap mapLibreMap = oVar.f16982k;
            if (mapLibreMap != null) {
                return new Ne0.d(B11, mapLibreMap, oVar.g(), oVar.f16976e.getLibreSettings().getLibrePlacemarkImplementation(), o.o(oVar), oVar.f16979h, oVar.i());
            }
            Intrinsics.n("mapLibreMap");
            throw null;
        }
    }

    static final class m extends AbstractC7737t implements Function0<xe0.h> {
        m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final xe0.h invoke() {
            return new xe0.h(new WeakReference(o.this.f16979h));
        }
    }

    static final class n extends AbstractC7737t implements Function0<Se0.a> {
        n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Se0.a invoke() {
            o oVar = o.this;
            w B11 = oVar.B();
            MapLibreMap mapLibreMap = oVar.f16982k;
            if (mapLibreMap != null) {
                return new Se0.a(B11, mapLibreMap);
            }
            Intrinsics.n("mapLibreMap");
            throw null;
        }
    }

    /* renamed from: Le0.o$o, reason: collision with other inner class name */
    static final class C0330o extends AbstractC7737t implements Function0<x> {
        C0330o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final x invoke() {
            o oVar = o.this;
            w map = oVar.B();
            MapLibreMap mapLibreMap = oVar.f16982k;
            if (mapLibreMap == null) {
                Intrinsics.n("mapLibreMap");
                throw null;
            }
            Intrinsics.checkNotNullParameter(map, "map");
            Intrinsics.checkNotNullParameter(mapLibreMap, "mapLibreMap");
            x xVar = new x();
            Style u11 = mapLibreMap.u();
            Intrinsics.f(u11);
            new eg.l(map, mapLibreMap, u11, "org.maplibre.annotations.points").w();
            new LinkedHashMap();
            new LinkedHashMap();
            return xVar;
        }
    }

    static final class p extends AbstractC7737t implements Function0<y> {
        p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final y invoke() {
            MapLibreMap mapboxMap = o.this.f16982k;
            if (mapboxMap != null) {
                Intrinsics.checkNotNullParameter(mapboxMap, "mapboxMap");
                return new y();
            }
            Intrinsics.n("mapLibreMap");
            throw null;
        }
    }

    static final class q extends AbstractC7737t implements Function0<B> {
        q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final B invoke() {
            o oVar = o.this;
            w B11 = oVar.B();
            MapLibreMap mapLibreMap = oVar.f16982k;
            if (mapLibreMap != null) {
                return new B(B11, mapLibreMap);
            }
            Intrinsics.n("mapLibreMap");
            throw null;
        }
    }

    public o(@NotNull Context context, @NotNull GeoProviderConfig initParams, @NotNull M0<we0.x> mapState, @NotNull we0.w mapSettings) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initParams, "initParams");
        Intrinsics.checkNotNullParameter(mapState, "mapState");
        Intrinsics.checkNotNullParameter(mapSettings, "mapSettings");
        this.f16973b = context;
        this.f16974c = initParams;
        this.f16975d = mapState;
        this.f16976e = mapSettings;
        this.f16977f = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f16978g = initParams.parseVector();
        this.f16979h = new xe0.j(0);
        this.f16980i = a.NONE;
        this.f16984m = Sc.k.b(new e());
        this.f16985n = Sc.k.b(new j());
        Sc.n nVar = Sc.n.NONE;
        this.f16986o = Sc.k.a(nVar, new c());
        this.f16987p = Sc.k.a(nVar, new g());
        this.f16988q = Sc.k.a(nVar, new i());
        this.f16989r = Sc.k.a(nVar, new p());
        this.f16990s = Sc.k.a(nVar, new k());
        this.f16991t = Sc.k.a(nVar, new d());
        this.f16992u = Sc.k.a(nVar, new n());
        this.f16993v = Sc.k.a(nVar, new C0330o());
        this.f16994w = Sc.k.a(nVar, new q());
        this.f16995x = Sc.k.a(nVar, new m());
        this.f16996y = Sc.k.a(nVar, new l());
        this.f16997z = Sc.k.a(nVar, new f());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void j(o oVar, w wVar, Function0 function0, MapLibreMap libreMap) {
        Je0.c cVar;
        InterfaceC6369b ozonTracker;
        Je0.c cVar2;
        VectorData vectorData;
        kotlin.time.b m10getTileLifeTimeFghU774;
        Long tileCacheSize;
        OfflineManager offlineManager;
        OfflineManager offlineManager2;
        We.E f7;
        Intrinsics.checkNotNullParameter(libreMap, "libreMap");
        oVar.f16982k = libreMap;
        ie0.g.f66321a.getClass();
        if (ie0.g.c() != null) {
            cVar = Je0.c.f14654d;
            if (cVar != null) {
                cVar2 = Je0.c.f14654d;
            } else {
                GeoProxyConfig c11 = ie0.g.c();
                if (c11 == null || (ozonTracker = c11.getOzonTracker()) == null) {
                    d.a.a();
                } else {
                    Je0.c.f14654d = new Je0.c(ozonTracker);
                    cVar2 = Je0.c.f14654d;
                }
            }
            if (cVar2 != null) {
                cVar2.c(oVar.h().getTilesLoadingFlow());
            }
            libreMap.w().B(false);
            libreMap.w().z(false);
            libreMap.w().y(false);
            libreMap.l().b().w(oVar.f16977f);
            oVar.setLogoConfig(new we0.q((we0.r) null, 3));
            vectorData = oVar.f16978g;
            m10getTileLifeTimeFghU774 = oVar.f16976e.getLibreSettings().m10getTileLifeTimeFghU774();
            if (vectorData != null && (f7 = ie0.g.f()) != null) {
                E.a aVar = new E.a(f7);
                aVar.a(new Me0.a(vectorData.getClearTileUrl(), vectorData.getTileUrlWithArgs(), m10getTileLifeTimeFghU774));
                aVar.a(new Je0.o());
                C5828b.a(new We.E(aVar));
            }
            tileCacheSize = oVar.f16976e.getLibreSettings().getTileCacheSize();
            if (tileCacheSize != null) {
                long g10 = kotlin.ranges.h.g(tileCacheSize.longValue(), 50L, 500L);
                long j11 = UserVerificationMethods.USER_VERIFY_ALL;
                long j12 = g10 * j11 * j11;
                OfflineManager.a aVar2 = OfflineManager.f79966c;
                Context context = oVar.f16973b;
                synchronized (aVar2) {
                    try {
                        Intrinsics.checkNotNullParameter(context, "context");
                        offlineManager = OfflineManager.f79967d;
                        if (offlineManager == null) {
                            OfflineManager.f79967d = new OfflineManager(context);
                        }
                        offlineManager2 = OfflineManager.f79967d;
                        Intrinsics.f(offlineManager2);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                offlineManager2.e(j12, new Le0.q(g10));
            }
            oVar.B().addOnDidFinishRenderingMapListener(new u(System.currentTimeMillis(), oVar, oVar.f16974c));
            C10749t0 c10749t0 = C10749t0.f105499a;
            C10720e0 c10720e0 = C10720e0.f105451a;
            oVar.f16981j = C10727i.c(c10749t0, He.b.f10879b, null, oVar.new h(wVar, libreMap, function0, null), 2);
        }
        Je0.c.f14654d = null;
        cVar2 = null;
        if (cVar2 != null) {
        }
        libreMap.w().B(false);
        libreMap.w().z(false);
        libreMap.w().y(false);
        libreMap.l().b().w(oVar.f16977f);
        oVar.setLogoConfig(new we0.q((we0.r) null, 3));
        vectorData = oVar.f16978g;
        m10getTileLifeTimeFghU774 = oVar.f16976e.getLibreSettings().m10getTileLifeTimeFghU774();
        if (vectorData != null) {
            E.a aVar3 = new E.a(f7);
            aVar3.a(new Me0.a(vectorData.getClearTileUrl(), vectorData.getTileUrlWithArgs(), m10getTileLifeTimeFghU774));
            aVar3.a(new Je0.o());
            C5828b.a(new We.E(aVar3));
        }
        tileCacheSize = oVar.f16976e.getLibreSettings().getTileCacheSize();
        if (tileCacheSize != null) {
        }
        oVar.B().addOnDidFinishRenderingMapListener(new u(System.currentTimeMillis(), oVar, oVar.f16974c));
        C10749t0 c10749t02 = C10749t0.f105499a;
        C10720e0 c10720e02 = C10720e0.f105451a;
        oVar.f16981j = C10727i.c(c10749t02, He.b.f10879b, null, oVar.new h(wVar, libreMap, function0, null), 2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|8|(1:(1:(1:(2:13|14)(2:18|19))(4:20|21|22|(1:24)(2:25|26)))(7:27|28|29|30|31|(2:33|(3:35|(2:37|38)|22))(1:39)|(0)(0)))(3:45|(9:47|48|49|(1:68)(1:53)|(4:55|56|57|(2:59|(1:61)(5:62|30|31|(0)(0)|(0)(0)))(1:63))|67|31|(0)(0)|(0)(0))(2:69|(2:71|14))|38)|15|16))|74|6|7|8|(0)(0)|15|16|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0049, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x004a, code lost:
    
        r11 = r0;
        r10 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00fc A[Catch: Exception -> 0x0049, TryCatch #1 {Exception -> 0x0049, blocks: (B:21:0x0044, B:22:0x00f5, B:24:0x00fc, B:25:0x0100, B:26:0x0107, B:28:0x0057, B:33:0x00cb, B:35:0x00d6), top: B:8:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0100 A[Catch: Exception -> 0x0049, TryCatch #1 {Exception -> 0x0049, blocks: (B:21:0x0044, B:22:0x00f5, B:24:0x00fc, B:25:0x0100, B:26:0x0107, B:28:0x0057, B:33:0x00cb, B:35:0x00d6), top: B:8:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cb A[Catch: Exception -> 0x0049, TRY_ENTER, TryCatch #1 {Exception -> 0x0049, blocks: (B:21:0x0044, B:22:0x00f5, B:24:0x00fc, B:25:0x0100, B:26:0x0107, B:28:0x0057, B:33:0x00cb, B:35:0x00d6), top: B:8:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x005f  */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, org.maplibre.android.maps.Style$Builder] */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object, org.maplibre.android.maps.Style$Builder] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object k(o oVar, Context context, VectorData vectorData, kotlin.coroutines.jvm.internal.c cVar) {
        r rVar;
        int i11;
        Exception exc;
        ?? r102;
        ?? builder;
        Style.Builder builder2;
        String str;
        Object obj;
        o oVar2;
        o oVar3;
        Style.Builder builder3;
        Style.Builder builder4;
        oVar.getClass();
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i12 = rVar.f17032j;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                rVar.f17032j = i12 - LinearLayoutManager.INVALID_OFFSET;
                r rVar2 = rVar;
                Object obj2 = rVar2.f17030h;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = rVar2.f17032j;
                String str2 = null;
                if (i11 != 0) {
                    Sc.s.b(obj2);
                    builder = new Style.Builder();
                    if (vectorData != null) {
                        oVar.f16980i = a.VECTOR;
                        try {
                            Map<String, String> styleUrls = vectorData.getStyleUrls();
                            if (styleUrls == null || !vectorData.isSupportThemes()) {
                                styleUrls = null;
                            }
                            if (styleUrls != null) {
                                String orDefault = styleUrls.getOrDefault("light", vectorData.getClearTileUrl());
                                try {
                                    ie0.g.f66321a.getClass();
                                    ae0.q i13 = ie0.g.i();
                                    if (i13 != null) {
                                        String clearTileUrl = vectorData.getClearTileUrl();
                                        String locale = oVar.f16974c.getLocale();
                                        rVar2.f17026d = oVar;
                                        rVar2.f17027e = context;
                                        rVar2.f17028f = vectorData;
                                        rVar2.f17029g = builder;
                                        rVar2.f17032j = 1;
                                        Object f7 = i13.f(context, orDefault, clearTileUrl, locale, rVar2);
                                        if (f7 != aVar) {
                                            obj = f7;
                                            context = context;
                                            oVar3 = oVar;
                                            str = (String) obj;
                                            oVar2 = oVar3;
                                            Context context2 = context;
                                            o oVar4 = oVar2;
                                            Style.Builder builder5 = builder;
                                            if (str == null) {
                                            }
                                            if (str2 != null) {
                                            }
                                        }
                                    }
                                } catch (Exception e11) {
                                    exc = e11;
                                    o oVar5 = builder;
                                    C9867b c9867b = C9867b.f99466a;
                                    C9867b.f(Nk.a.b("Error while generating style, ", exc.getMessage()), exc, InterfaceC10046c.a.ERROR);
                                    Unit unit = Unit.f71690a;
                                    r102 = oVar5;
                                    r102.i(new TransitionOptions(0L, 0L, false));
                                    return r102;
                                }
                            }
                            str = null;
                            oVar2 = oVar;
                            Context context22 = context;
                            o oVar42 = oVar2;
                            Style.Builder builder52 = builder;
                            if (str == null) {
                            }
                            if (str2 != null) {
                            }
                        } catch (Exception e12) {
                            exc = e12;
                        }
                    } else {
                        oVar.f16980i = a.RASTER;
                        C10720e0 c10720e0 = C10720e0.f105451a;
                        L0 x11 = De.s.f6650a.x();
                        s sVar = new s(oVar, builder, null);
                        rVar2.f17026d = builder;
                        rVar2.f17032j = 3;
                        Object f11 = C10727i.f(x11, sVar, rVar2);
                        if (f11 != aVar) {
                            obj2 = f11;
                            builder2 = builder;
                            Intrinsics.f(obj2);
                            r102 = builder2;
                        }
                    }
                    return aVar;
                }
                if (i11 == 1) {
                    Style.Builder builder6 = rVar2.f17029g;
                    vectorData = rVar2.f17028f;
                    context = rVar2.f17027e;
                    o oVar6 = (o) rVar2.f17026d;
                    Sc.s.b(obj2);
                    builder = builder6;
                    oVar3 = oVar6;
                    obj = obj2;
                    str = (String) obj;
                    oVar2 = oVar3;
                    Context context222 = context;
                    o oVar422 = oVar2;
                    Style.Builder builder522 = builder;
                    if (str == null) {
                        ie0.g.f66321a.getClass();
                        ae0.q i14 = ie0.g.i();
                        builder3 = builder522;
                        if (i14 != null) {
                            String styleUrl = vectorData.getStyleUrl();
                            String clearTileUrl2 = vectorData.getClearTileUrl();
                            String locale2 = oVar422.f16974c.getLocale();
                            rVar2.f17026d = builder522;
                            rVar2.f17027e = null;
                            rVar2.f17028f = null;
                            rVar2.f17029g = null;
                            rVar2.f17032j = 2;
                            obj2 = i14.f(context222, styleUrl, clearTileUrl2, locale2, rVar2);
                            builder4 = builder522;
                            if (obj2 == aVar) {
                                return aVar;
                            }
                            str2 = (String) obj2;
                            builder3 = builder4;
                        }
                    } else {
                        str2 = str;
                        builder3 = builder522;
                    }
                    if (str2 != null) {
                    }
                } else if (i11 == 2) {
                    Style.Builder builder7 = (Style.Builder) rVar2.f17026d;
                    Sc.s.b(obj2);
                    builder4 = builder7;
                    str2 = (String) obj2;
                    builder3 = builder4;
                    if (str2 != null) {
                        throw new Exception("Cannot get style file");
                    }
                    builder3.e(str2);
                    r102 = builder3;
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Style.Builder builder8 = (Style.Builder) rVar2.f17026d;
                    Sc.s.b(obj2);
                    builder2 = builder8;
                    Intrinsics.f(obj2);
                    r102 = builder2;
                }
                r102.i(new TransitionOptions(0L, 0L, false));
                return r102;
            }
        }
        rVar = new r(oVar, cVar);
        r rVar22 = rVar;
        Object obj22 = rVar22.f17030h;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = rVar22.f17032j;
        String str22 = null;
        if (i11 != 0) {
        }
        r102.i(new TransitionOptions(0L, 0L, false));
        return r102;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Sc.j, java.lang.Object] */
    public static final Ne0.a o(o oVar) {
        return (Ne0.a) oVar.f16997z.getValue();
    }

    public static final CameraPosition p(o oVar) {
        oVar.f16976e.getInitCameraConfig();
        return CameraPosition.f79608a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Sc.j, java.lang.Object] */
    public static final InterfaceC10767f w(o oVar) {
        return (InterfaceC10767f) oVar.f16996y.getValue();
    }

    public static final void z(o oVar) {
        Pair pair;
        int i11 = b.f16999b[oVar.f16980i.ordinal()];
        if (i11 == 1) {
            VectorData vectorData = oVar.f16978g;
            pair = new Pair(vectorData != null ? Double.valueOf(vectorData.getMinZoom()) : null, vectorData != null ? Double.valueOf(vectorData.getMaxZoom()) : null);
        } else if (i11 != 2) {
            if (i11 != 3) {
                throw new Sc.o();
            }
            return;
        } else {
            GeoProviderConfig geoProviderConfig = oVar.f16974c;
            pair = new Pair(geoProviderConfig.getMinZoom(), geoProviderConfig.getMaxZoom());
        }
        Double d11 = (Double) pair.a();
        Double d12 = (Double) pair.b();
        if (d12 != null) {
            double doubleValue = d12.doubleValue();
            MapLibreMap mapLibreMap = oVar.f16982k;
            if (mapLibreMap == null) {
                Intrinsics.n("mapLibreMap");
                throw null;
            }
            Intrinsics.checkNotNullParameter(mapLibreMap, "mapLibreMap");
            mapLibreMap.V(Math.max(doubleValue - 1, mapLibreMap.p()));
        }
        if (d11 != null) {
            double doubleValue2 = d11.doubleValue();
            MapLibreMap mapLibreMap2 = oVar.f16982k;
            if (mapLibreMap2 == null) {
                Intrinsics.n("mapLibreMap");
                throw null;
            }
            Intrinsics.checkNotNullParameter(mapLibreMap2, "mapLibreMap");
            mapLibreMap2.W(Math.min(doubleValue2 - 1, mapLibreMap2.o()));
        }
    }

    @Override // ve0.b
    @NotNull
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final RelativeLayout getContentView() {
        return (RelativeLayout) this.f16984m.getValue();
    }

    @NotNull
    public final w B() {
        return (w) this.f16985n.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @NotNull
    public final InterfaceC11117a C() {
        return (InterfaceC11117a) this.f16989r.getValue();
    }

    @Override // be0.b
    public final void a(@NotNull final Function0<Unit> onMapReady) {
        Intrinsics.checkNotNullParameter(onMapReady, "onMapReady");
        B().onCreate(null);
        final w B11 = B();
        B11.getMapAsync(new OnMapReadyCallback(B11, onMapReady) { // from class: Le0.n

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f16971b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ AbstractC7737t f16972c;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.f16972c = (AbstractC7737t) onMapReady;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
            @Override // org.maplibre.android.maps.OnMapReadyCallback
            public final void d(MapLibreMap mapLibreMap) {
                o.j(o.this, this.f16971b, this.f16972c, mapLibreMap);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // ve0.b
    @NotNull
    public final InterfaceC10766e b() {
        return (InterfaceC10766e) this.f16990s.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // ve0.b
    @NotNull
    public final InterfaceC8585d c() {
        return (InterfaceC8585d) this.f16988q.getValue();
    }

    @Override // ve0.b
    public final void clear() {
        w B11 = B();
        B11.clearAnimation();
        b().clear();
        ye0.b.a(e());
        if (Build.VERSION.SDK_INT >= 31) {
            B11.clearViewTranslationCallback();
        }
        B0 b02 = this.f16981j;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // ve0.b
    @NotNull
    public final InterfaceC8137a d() {
        return (InterfaceC8137a) this.f16987p.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Sc.j, java.lang.Object] */
    @Override // ve0.b
    public final void dispose() {
        clear();
        InterfaceC8585d c11 = c();
        Intrinsics.g(c11, "null cannot be cast to non-null type ru.ozon.mapsdk.libre.LibreLocationController");
        ((Le0.l) c11).b();
        InterfaceC10768g interfaceC10768g = (InterfaceC10768g) this.f16995x.getValue();
        Intrinsics.g(interfaceC10768g, "null cannot be cast to non-null type ru.ozon.mapsdk.common.placemarkscontroller.PlacemarkSelectionControllerImpl");
        ((xe0.h) interfaceC10768g).a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // ve0.b
    @NotNull
    public final InterfaceC10889a e() {
        return (InterfaceC10889a) this.f16992u.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // ve0.b
    @NotNull
    public final de0.e f() {
        return (de0.e) this.f16991t.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // ve0.b
    @NotNull
    public final InterfaceC5817a g() {
        return (InterfaceC5817a) this.f16986o.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // ve0.b
    @NotNull
    public final Ie0.c h() {
        return (Ie0.c) this.f16994w.getValue();
    }

    @Override // ve0.AbstractC10313a, ve0.b
    public final void onDestroy() {
        super.onDestroy();
        dispose();
        de0.e f7 = f();
        Intrinsics.g(f7, "null cannot be cast to non-null type ru.ozon.mapsdk.common.clustercontroller.implementation.PlacemarkClusterizersControllerImpl");
        ((ee0.j) f7).d();
        InterfaceC5817a g10 = g();
        Intrinsics.g(g10, "null cannot be cast to non-null type ru.ozon.mapsdk.libre.LibreCameraController");
        ((C3588e) g10).j();
        InterfaceC10766e b11 = b();
        Ne0.b bVar = b11 instanceof Ne0.b ? (Ne0.b) b11 : null;
        if (bVar != null) {
            bVar.t();
        }
        Ie0.c h11 = h();
        Ie0.a aVar = h11 instanceof Ie0.a ? (Ie0.a) h11 : null;
        if (aVar != null) {
            aVar.g();
        }
        getContentView().removeAllViews();
        B().onDestroy();
    }

    @Override // ve0.b
    public final void onPause() {
        B().onPause();
    }

    @Override // ve0.b
    public final void onResume() {
        B().onResume();
    }

    @Override // ve0.b
    public final void onStart() {
        B().onStart();
    }

    @Override // ve0.b
    public final void onStop() {
        B().onStop();
    }

    @Override // ve0.b
    public final void setLogoConfig(@NotNull we0.q logoConfig) {
        Throwable th2;
        Intrinsics.checkNotNullParameter(logoConfig, "logoConfig");
        C5656a c5656a = this.f16983l;
        if (c5656a == null) {
            Intrinsics.n("copyrightWidget");
            throw null;
        }
        DisplayMetrics displayMetrics = c5656a.getContext().getResources().getDisplayMetrics();
        int i11 = displayMetrics.widthPixels;
        int i12 = displayMetrics.heightPixels;
        float f7 = displayMetrics.density;
        int floatValue = (int) (logoConfig.a().e().floatValue() * f7);
        int floatValue2 = (int) (logoConfig.a().f().floatValue() * f7);
        Integer h11 = c5656a.h();
        Pair pair = new Pair(Integer.valueOf(kotlin.ranges.h.e(floatValue, 0, i11 - (h11 != null ? h11.intValue() : c5656a.getMeasuredWidth()))), Integer.valueOf(kotlin.ranges.h.e(floatValue2, 0, i12 - c5656a.g())));
        int intValue = ((Number) pair.a()).intValue();
        int intValue2 = ((Number) pair.b()).intValue();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        we0.r b11 = logoConfig.b();
        int[] iArr = b.f16998a;
        int i13 = iArr[b11.ordinal()];
        int i14 = 3;
        if (i13 != 1) {
            th2 = null;
            if (i13 == 2) {
                layoutParams.addRule(10);
                layoutParams.addRule(11);
                C5656a c5656a2 = this.f16983l;
                if (c5656a2 == null) {
                    Intrinsics.n("copyrightWidget");
                    throw null;
                }
                c5656a2.setPadding(0, intValue2, intValue, 0);
            } else if (i13 == 3) {
                layoutParams.addRule(12);
                layoutParams.addRule(9);
                C5656a c5656a3 = this.f16983l;
                if (c5656a3 == null) {
                    Intrinsics.n("copyrightWidget");
                    throw null;
                }
                c5656a3.setPadding(intValue, 0, 0, intValue2);
            } else {
                if (i13 != 4) {
                    throw new Sc.o();
                }
                layoutParams.addRule(12);
                layoutParams.addRule(11);
                C5656a c5656a4 = this.f16983l;
                if (c5656a4 == null) {
                    Intrinsics.n("copyrightWidget");
                    throw null;
                }
                c5656a4.setPadding(0, 0, intValue, intValue2);
            }
        } else {
            th2 = null;
            layoutParams.addRule(10);
            layoutParams.addRule(9);
            C5656a c5656a5 = this.f16983l;
            if (c5656a5 == null) {
                Intrinsics.n("copyrightWidget");
                throw null;
            }
            c5656a5.setPadding(intValue, intValue2, 0, 0);
        }
        C5656a c5656a6 = this.f16983l;
        if (c5656a6 == null) {
            Intrinsics.n("copyrightWidget");
            throw th2;
        }
        c5656a6.setLayoutParams(layoutParams);
        C5656a c5656a7 = this.f16983l;
        if (c5656a7 == null) {
            Intrinsics.n("copyrightWidget");
            throw th2;
        }
        c5656a7.j(logoConfig);
        C5656a c5656a8 = this.f16983l;
        if (c5656a8 == null) {
            Intrinsics.n("copyrightWidget");
            throw th2;
        }
        int i15 = iArr[logoConfig.b().ordinal()];
        if (i15 != 1) {
            if (i15 != 2) {
                if (i15 != 3) {
                    if (i15 != 4) {
                        throw new Sc.o();
                    }
                }
            }
            i14 = 5;
        }
        c5656a8.setGravity(i14);
    }
}
