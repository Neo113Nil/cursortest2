package Pe0;

import De.C2862e;
import Le0.w;
import android.graphics.PointF;
import ce0.InterfaceC5817a;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.maplibre.android.geometry.LatLng;
import org.maplibre.android.maps.MapLibreMap;
import org.maplibre.android.maps.Style;
import org.maplibre.geojson.Feature;
import te0.C9867b;
import ue0.InterfaceC10046c;
import we0.u;

/* loaded from: classes3.dex */
public abstract class b extends Ne0.b implements Ne0.f {

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final w f22322j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final MapLibreMap f22323k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final Pe0.a f22324l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final HashMap<String, c> f22325m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final TreeMap<Long, r> f22326n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final a f22327o;

    protected final class a implements MapLibreMap.OnMapClickListener, m {
        public a() {
        }

        private final u f(n nVar) {
            b bVar = b.this;
            u uVar = (u) b.B(bVar).get(b.G(nVar));
            if (uVar == null) {
                return null;
            }
            Style u11 = bVar.f22323k.u();
            if (u11 != null) {
                u11.h(nVar.c());
            }
            uVar.d().getClass();
            return uVar;
        }

        @Override // Pe0.m
        public final void a(@NotNull n symbol) {
            Function0<Unit> i11;
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            b bVar = b.this;
            u uVar = (u) b.B(bVar).get(b.G(symbol));
            if (uVar != null && (i11 = uVar.i()) != null) {
                i11.invoke();
            }
            b.E(bVar, b.G(symbol), b.D(bVar, symbol.f()));
        }

        @Override // Pe0.m
        public final boolean b(@NotNull n symbol, @NotNull PointF tapPointF) {
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(tapPointF, "tapPointF");
            return f(symbol) != null;
        }

        @Override // Pe0.m
        public final void c(@NotNull n symbol) {
            Function1<we0.m, Unit> h11;
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            b bVar = b.this;
            u uVar = (u) b.B(bVar).get(b.G(symbol));
            if (uVar != null && (h11 = uVar.h()) != null) {
                h11.invoke(b.D(bVar, symbol.f()));
            }
            b.E(bVar, b.G(symbol), b.D(bVar, symbol.f()));
        }

        @Override // Pe0.m
        public final void d(@NotNull n symbol) {
            Function0<Unit> g10;
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            b bVar = b.this;
            u uVar = (u) b.B(bVar).get(b.G(symbol));
            if (uVar != null && (g10 = uVar.g()) != null) {
                g10.invoke();
            }
            b.E(bVar, b.G(symbol), b.D(bVar, symbol.f()));
        }

        @Override // org.maplibre.android.maps.MapLibreMap.OnMapClickListener
        public final boolean e(@NotNull LatLng point) {
            u f7;
            Intrinsics.checkNotNullParameter(point, "point");
            b bVar = b.this;
            PointF g10 = bVar.f22323k.t().g(point);
            Intrinsics.checkNotNullExpressionValue(g10, "toScreenLocation(...)");
            Iterator it = bVar.f22326n.entrySet().iterator();
            while (it.hasNext()) {
                r rVar = (r) ((Map.Entry) it.next()).getValue();
                List<Feature> O11 = bVar.f22323k.O(g10, rVar.j());
                Intrinsics.checkNotNullExpressionValue(O11, "queryRenderedFeatures(...)");
                Iterator<Feature> it2 = O11.iterator();
                while (it2.hasNext()) {
                    n k11 = rVar.k(it2.next().getProperty("symbol-id").getAsLong());
                    if (k11 != null && (f7 = f(k11)) != null) {
                        bVar.u(f7);
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: Pe0.b$b, reason: collision with other inner class name */
    protected static final class C0442b {

        /* renamed from: a, reason: collision with root package name */
        private final String f22329a;

        /* renamed from: b, reason: collision with root package name */
        private final String f22330b;

        public C0442b(String str, String str2) {
            this.f22329a = str;
            this.f22330b = str2;
        }

        public final String a() {
            return this.f22330b;
        }

        public final String b() {
            return this.f22329a;
        }
    }

    protected static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final long f22331a;

        /* renamed from: b, reason: collision with root package name */
        private final long f22332b;

        public c(long j11, long j12) {
            this.f22331a = j11;
            this.f22332b = j12;
        }

        public final long a() {
            return this.f22331a;
        }

        public final long b() {
            return this.f22332b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull w map, @NotNull MapLibreMap mapLibreMap, @NotNull Pe0.a draggableSymbolController, @NotNull InterfaceC5817a cameraController, @NotNull C2862e coroutineScope, boolean z11, @NotNull xe0.j pinSelectSynchronizer) {
        super(coroutineScope, map, cameraController, mapLibreMap, pinSelectSynchronizer, z11);
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(mapLibreMap, "mapLibreMap");
        Intrinsics.checkNotNullParameter(draggableSymbolController, "draggableSymbolController");
        Intrinsics.checkNotNullParameter(cameraController, "cameraController");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(pinSelectSynchronizer, "pinSelectSynchronizer");
        this.f22322j = map;
        this.f22323k = mapLibreMap;
        this.f22324l = draggableSymbolController;
        this.f22325m = new HashMap<>();
        this.f22326n = new TreeMap<>(new Pe0.c());
        this.f22327o = new a();
    }

    public static final /* synthetic */ ConcurrentHashMap B(b bVar) {
        return (ConcurrentHashMap) bVar.w();
    }

    public static final we0.m D(b bVar, LatLng latLng) {
        bVar.getClass();
        return new we0.m(latLng.getLatitude(), latLng.getLongitude());
    }

    public static final void E(b bVar, String str, we0.m mVar) {
        u uVar = (u) ((ConcurrentHashMap) bVar.w()).get(str);
        if (uVar != null) {
            ((ConcurrentHashMap) bVar.w()).put(str, u.a(uVar, mVar, null, null, null, 1022));
        }
    }

    @NotNull
    protected static String G(@NotNull n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        Object b11 = nVar.b();
        Intrinsics.g(b11, "null cannot be cast to non-null type kotlin.String");
        return (String) b11;
    }

    @NotNull
    protected final Pe0.a F() {
        return this.f22324l;
    }

    @NotNull
    protected final r H(Long l11) {
        C0442b c0442b;
        long longValue = l11.longValue();
        TreeMap<Long, r> treeMap = this.f22326n;
        r rVar = treeMap.get(Long.valueOf(longValue));
        if (rVar != null) {
            return rVar;
        }
        if (!treeMap.isEmpty()) {
            Iterator<Map.Entry<Long, r>> it = treeMap.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    Set<Map.Entry<Long, r>> entrySet = treeMap.entrySet();
                    Intrinsics.checkNotNullExpressionValue(entrySet, "<get-entries>(...)");
                    c0442b = new C0442b(((r) ((Map.Entry) C7714v.W(entrySet)).getValue()).j(), null);
                    break;
                }
                Map.Entry<Long, r> next = it.next();
                long longValue2 = next.getKey().longValue();
                r value = next.getValue();
                if (longValue > longValue2) {
                    c0442b = new C0442b(null, value.j());
                    break;
                }
            }
        } else {
            c0442b = new C0442b(null, null);
        }
        MapLibreMap mapLibreMap = this.f22323k;
        Style style = mapLibreMap.u();
        Intrinsics.f(style);
        String b11 = c0442b.b();
        String a11 = c0442b.a();
        w mapView = this.f22322j;
        Intrinsics.checkNotNullParameter(mapView, "mapView");
        Intrinsics.checkNotNullParameter(mapLibreMap, "mapLibreMap");
        Intrinsics.checkNotNullParameter(style, "style");
        r rVar2 = new r(mapView, mapLibreMap, style, a11, b11, true);
        rVar2.p(this.f22327o);
        treeMap.put(Long.valueOf(longValue), rVar2);
        this.f22324l.e(rVar2);
        return rVar2;
    }

    @NotNull
    protected final HashMap<String, c> I() {
        return this.f22325m;
    }

    protected void J(boolean z11) {
        this.f22323k.e(this.f22327o);
        if (z11) {
            H(10L);
        }
    }

    @Override // xe0.InterfaceC10766e
    public u getPlacemarkById(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        try {
            return (u) ((ConcurrentHashMap) w()).get(id2);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // Ne0.b, xe0.AbstractC10765d
    public void t() {
        super.t();
        this.f22323k.S(this.f22327o);
        if (this.f22322j.isDestroyed()) {
            return;
        }
        ((d) this).i().d(0L);
        try {
            Collection<r> values = this.f22326n.values();
            Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
            for (r rVar : values) {
                rVar.m();
                this.f22324l.g(rVar);
            }
        } catch (Throwable th2) {
            C9867b c9867b = C9867b.f99466a;
            C9867b.f("error in onDestroy PlacemarkController", th2, InterfaceC10046c.a.ERROR);
        }
    }
}
