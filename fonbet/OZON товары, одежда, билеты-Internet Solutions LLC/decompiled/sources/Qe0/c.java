package Qe0;

import De.C2862e;
import Le0.w;
import Oe0.d;
import Sc.InterfaceC3999a;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.animation.LinearInterpolator;
import ce0.InterfaceC5817a;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import eg.s;
import eg.u;
import eg.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import org.jetbrains.annotations.NotNull;
import org.maplibre.android.geometry.LatLng;
import org.maplibre.android.maps.MapLibreMap;
import org.maplibre.android.maps.Style;
import org.maplibre.android.style.layers.SymbolLayer;
import org.maplibre.geojson.Feature;
import te0.C9867b;
import ue0.InterfaceC10046c;
import we0.InterfaceC10542A;
import we0.m;
import we0.z;

@InterfaceC3999a
/* loaded from: classes3.dex */
public final class c extends Ne0.b implements Ne0.f {

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final w f23367j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final MapLibreMap f23368k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final Qe0.b f23369l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final Oe0.d f23370m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final TreeMap<Long, u> f23371n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final HashMap<String, C0470c> f23372o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final a f23373p;

    private final class a implements MapLibreMap.OnMapClickListener, j {
        public a() {
        }

        private final we0.u f(s sVar) {
            c cVar = c.this;
            we0.u uVar = (we0.u) c.C(cVar).get(c.B(cVar, sVar));
            if (uVar == null) {
                return null;
            }
            Style u11 = cVar.f23368k.u();
            if (u11 != null) {
                u11.h(sVar.j());
            }
            uVar.d().getClass();
            return uVar;
        }

        @Override // eg.o
        public final void a(s sVar) {
            Function0<Unit> g10;
            s symbol = sVar;
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            c cVar = c.this;
            we0.u uVar = (we0.u) c.C(cVar).get(c.B(cVar, symbol));
            if (uVar != null && (g10 = uVar.g()) != null) {
                g10.invoke();
            }
            String B11 = c.B(cVar, symbol);
            LatLng l11 = symbol.l();
            Intrinsics.checkNotNullExpressionValue(l11, "getLatLng(...)");
            c.F(cVar, B11, c.E(cVar, l11));
        }

        @Override // eg.o
        public final void b(s sVar) {
            Function0<Unit> i11;
            s symbol = sVar;
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            c cVar = c.this;
            we0.u uVar = (we0.u) c.C(cVar).get(c.B(cVar, symbol));
            if (uVar != null && (i11 = uVar.i()) != null) {
                i11.invoke();
            }
            String B11 = c.B(cVar, symbol);
            LatLng l11 = symbol.l();
            Intrinsics.checkNotNullExpressionValue(l11, "getLatLng(...)");
            c.F(cVar, B11, c.E(cVar, l11));
        }

        @Override // eg.o
        public final void c(s sVar) {
            Function1<m, Unit> h11;
            s symbol = sVar;
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            c cVar = c.this;
            we0.u uVar = (we0.u) c.C(cVar).get(c.B(cVar, symbol));
            if (uVar != null && (h11 = uVar.h()) != null) {
                LatLng l11 = symbol.l();
                Intrinsics.checkNotNullExpressionValue(l11, "getLatLng(...)");
                h11.invoke(c.E(cVar, l11));
            }
            String B11 = c.B(cVar, symbol);
            LatLng l12 = symbol.l();
            Intrinsics.checkNotNullExpressionValue(l12, "getLatLng(...)");
            c.F(cVar, B11, c.E(cVar, l12));
        }

        @Override // Qe0.j
        public final boolean d(@NotNull s symbol, @NotNull PointF tapPointF) {
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(tapPointF, "tapPointF");
            return f(symbol) != null;
        }

        @Override // org.maplibre.android.maps.MapLibreMap.OnMapClickListener
        public final boolean e(@NotNull LatLng point) {
            we0.u f7;
            Intrinsics.checkNotNullParameter(point, "point");
            c cVar = c.this;
            PointF g10 = cVar.f23368k.t().g(point);
            Intrinsics.checkNotNullExpressionValue(g10, "toScreenLocation(...)");
            Iterator it = cVar.f23371n.entrySet().iterator();
            while (it.hasNext()) {
                u uVar = (u) ((Map.Entry) it.next()).getValue();
                List<Feature> O11 = cVar.f23368k.O(g10, uVar.o());
                Intrinsics.checkNotNullExpressionValue(O11, "queryRenderedFeatures(...)");
                Iterator<Feature> it2 = O11.iterator();
                while (it2.hasNext()) {
                    s b11 = uVar.l().b(it2.next().getProperty("id").getAsLong());
                    if (b11 != null && (f7 = f(b11)) != null) {
                        cVar.u(f7);
                        return true;
                    }
                }
            }
            return false;
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f23375a;

        /* renamed from: b, reason: collision with root package name */
        private final String f23376b;

        public b(String str, String str2) {
            this.f23375a = str;
            this.f23376b = str2;
        }

        public final String a() {
            return this.f23376b;
        }

        public final String b() {
            return this.f23375a;
        }
    }

    /* renamed from: Qe0.c$c, reason: collision with other inner class name */
    private static final class C0470c {

        /* renamed from: a, reason: collision with root package name */
        private final long f23377a;

        /* renamed from: b, reason: collision with root package name */
        private final long f23378b;

        public C0470c(long j11, long j12) {
            this.f23377a = j11;
            this.f23378b = j12;
        }

        public final long a() {
            return this.f23377a;
        }

        public final long b() {
            return this.f23378b;
        }
    }

    static final class d extends AbstractC7737t implements Function1<List<? extends s>, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ u f23379b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f23380c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(u uVar, c cVar) {
            super(1);
            this.f23379b = uVar;
            this.f23380c = cVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<? extends s> list) {
            List<? extends s> symbols = list;
            Intrinsics.checkNotNullParameter(symbols, "symbols");
            for (s sVar : symbols) {
                Oe0.d i11 = this.f23380c.i();
                String j11 = sVar.j();
                Intrinsics.checkNotNullExpressionValue(j11, "getIconImage(...)");
                i11.l(j11);
            }
            this.f23379b.i(symbols);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull w mapView, @NotNull MapLibreMap mapLibreMap, @NotNull Qe0.b draggableAnnotationController, @NotNull InterfaceC5817a cameraController, @NotNull C2862e coroutineScope, boolean z11, boolean z12, boolean z13, @NotNull xe0.j pinSelectSynchronizer) {
        super(coroutineScope, mapView, cameraController, mapLibreMap, pinSelectSynchronizer, z11);
        Oe0.d hVar;
        Intrinsics.checkNotNullParameter(mapView, "map");
        Intrinsics.checkNotNullParameter(mapLibreMap, "mapLibreMap");
        Intrinsics.checkNotNullParameter(draggableAnnotationController, "draggableAnnotationController");
        Intrinsics.checkNotNullParameter(cameraController, "cameraController");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(pinSelectSynchronizer, "pinSelectSynchronizer");
        this.f23367j = mapView;
        this.f23368k = mapLibreMap;
        this.f23369l = draggableAnnotationController;
        Intrinsics.checkNotNullParameter(mapLibreMap, "mapLibreMap");
        Intrinsics.checkNotNullParameter(mapView, "mapView");
        Intrinsics.checkNotNullParameter(pinSelectSynchronizer, "pinSelectSynchronizer");
        if (z12) {
            Intrinsics.checkNotNullParameter(mapLibreMap, "mapLibreMap");
            Intrinsics.checkNotNullParameter(mapView, "mapView");
            Intrinsics.checkNotNullParameter(pinSelectSynchronizer, "pinSelectSynchronizer");
            hVar = new Oe0.b(true, mapLibreMap, mapView, pinSelectSynchronizer, false);
        } else {
            hVar = new Oe0.h(mapLibreMap, mapView, pinSelectSynchronizer, false);
        }
        this.f23370m = hVar;
        this.f23371n = new TreeMap<>(new i());
        this.f23372o = new HashMap<>();
        a aVar = new a();
        this.f23373p = aVar;
        mapLibreMap.e(aVar);
        if (z13) {
            G(10L);
        }
    }

    public static final String B(c cVar, s sVar) {
        String asString;
        cVar.getClass();
        JsonElement a11 = sVar.a();
        JsonPrimitive jsonPrimitive = a11 instanceof JsonPrimitive ? (JsonPrimitive) a11 : null;
        return (jsonPrimitive == null || (asString = jsonPrimitive.getAsString()) == null) ? "" : asString;
    }

    public static final /* synthetic */ HashMap C(c cVar) {
        return (HashMap) cVar.w();
    }

    public static final m E(c cVar, LatLng latLng) {
        cVar.getClass();
        return new m(latLng.getLatitude(), latLng.getLongitude());
    }

    public static final void F(c cVar, String str, m mVar) {
        we0.u uVar = (we0.u) ((HashMap) cVar.w()).get(str);
        if (uVar != null) {
            ((HashMap) cVar.w()).put(str, we0.u.a(uVar, mVar, null, null, null, 1022));
        }
    }

    private final u G(Long l11) {
        b bVar;
        SymbolLayer symbolLayer;
        long longValue = l11.longValue();
        Long valueOf = Long.valueOf(longValue);
        TreeMap<Long, u> treeMap = this.f23371n;
        u uVar = treeMap.get(valueOf);
        if (uVar != null) {
            return uVar;
        }
        if (!treeMap.isEmpty()) {
            Iterator<Map.Entry<Long, u>> it = treeMap.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    Set<Map.Entry<Long, u>> entrySet = treeMap.entrySet();
                    Intrinsics.checkNotNullExpressionValue(entrySet, "<get-entries>(...)");
                    bVar = new b(((u) ((Map.Entry) C7714v.W(entrySet)).getValue()).o(), null);
                    break;
                }
                Map.Entry<Long, u> next = it.next();
                long longValue2 = next.getKey().longValue();
                u value = next.getValue();
                if (longValue > longValue2) {
                    bVar = new b(null, value.o());
                    break;
                }
            }
        } else {
            bVar = new b(null, null);
        }
        MapLibreMap mapLibreMap = this.f23368k;
        Style style = mapLibreMap.u();
        Intrinsics.f(style);
        String b11 = bVar.b();
        String a11 = bVar.a();
        w map = this.f23367j;
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(mapLibreMap, "mapLibreMap");
        Intrinsics.checkNotNullParameter(style, "style");
        Qe0.b draggableAnnotationController = this.f23369l;
        Intrinsics.checkNotNullParameter(draggableAnnotationController, "draggableAnnotationController");
        Qe0.a aVar = new Qe0.a(map, mapLibreMap, style, b11, a11, draggableAnnotationController);
        aVar.w();
        aVar.x();
        aVar.y();
        aVar.z();
        Style u11 = mapLibreMap.u();
        if (u11 != null && (symbolLayer = (SymbolLayer) u11.j(aVar.o())) != null) {
            symbolLayer.i(new org.maplibre.android.style.layers.a("symbol-z-order", "auto"));
        }
        aVar.A(this.f23373p);
        treeMap.put(Long.valueOf(longValue), aVar);
        this.f23369l.e(aVar);
        return aVar;
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [T, java.util.ArrayList] */
    static void H(c cVar, ArrayList arrayList, long j11, long j12, int i11) {
        HashMap<String, C0470c> hashMap;
        float f7;
        String str;
        C0470c c0470c;
        s sVar;
        long j13 = (i11 & 4) != 0 ? 10L : j12;
        boolean z11 = (i11 & 8) != 0;
        cVar.getClass();
        HashMap hashMap2 = new HashMap(arrayList.size());
        HashMap hashMap3 = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hashMap = cVar.f23372o;
            if (!hasNext) {
                break;
            }
            Pair pair = (Pair) it.next();
            we0.u uVar = (we0.u) pair.a();
            d.C0411d c0411d = (d.C0411d) pair.b();
            if (uVar.d().d() instanceof InterfaceC10542A.a) {
                cVar.x(uVar, true, new h(j11));
            } else {
                C0470c c0470c2 = hashMap.get(uVar.e());
                if (c0470c2 != null) {
                    c0470c = c0470c2;
                    sVar = cVar.G(Long.valueOf(c0470c2.b())).l().b(c0470c.a());
                } else {
                    c0470c = c0470c2;
                    sVar = null;
                }
                if (z11) {
                    ((HashMap) cVar.w()).put(uVar.e(), uVar);
                }
                if (sVar != null) {
                    Long valueOf = Long.valueOf(c0470c.b());
                    Object obj = hashMap2.get(valueOf);
                    if (obj == null) {
                        obj = new ArrayList();
                        hashMap2.put(valueOf, obj);
                    }
                    ArrayList arrayList2 = (ArrayList) obj;
                    sVar.s(uVar.f());
                    sVar.f(new JsonPrimitive(uVar.e()));
                    sVar.g(false);
                    sVar.r(uVar.d().h() ? Float.valueOf(1.0f) : Float.valueOf(0.0f));
                    sVar.p(Float.valueOf(uVar.d().b()));
                    sVar.q(Float.valueOf(uVar.d().c()));
                    sVar.t(uVar.getZIndex());
                    sVar.n(c0411d.d());
                    sVar.m(d.C0411d.a(uVar.d().e()));
                    PointF contentAnchor = uVar.d().e();
                    Intrinsics.checkNotNullParameter(contentAnchor, "contentAnchor");
                    Float[] c11 = c0411d.c(contentAnchor);
                    sVar.o(new PointF(c11[0].floatValue(), c11[1].floatValue()));
                    arrayList2.add(sVar);
                } else {
                    Long valueOf2 = Long.valueOf(j13);
                    Object obj2 = hashMap3.get(valueOf2);
                    if (obj2 == null) {
                        obj2 = new ArrayList();
                        hashMap3.put(valueOf2, obj2);
                    }
                    ArrayList arrayList3 = (ArrayList) obj2;
                    v vVar = new v();
                    vVar.j(uVar.f());
                    vVar.b(new JsonPrimitive(uVar.e()));
                    vVar.c(false);
                    vVar.i(Float.valueOf(uVar.d().h() ? 1.0f : 0.0f));
                    vVar.g(Float.valueOf(uVar.d().b()));
                    vVar.h(Float.valueOf(uVar.d().c()));
                    vVar.k(uVar.getZIndex());
                    vVar.e(c0411d.d());
                    vVar.d(d.C0411d.a(uVar.d().e()));
                    vVar.f(c0411d.c(uVar.d().e()));
                    Intrinsics.checkNotNullExpressionValue(vVar, "withIconOffset(...)");
                    arrayList3.add(vVar);
                }
            }
        }
        for (Map.Entry entry : hashMap2.entrySet()) {
            cVar.G(Long.valueOf(((Number) entry.getKey()).longValue())).u((ArrayList) entry.getValue());
        }
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            long longValue = ((Number) entry2.getKey()).longValue();
            ArrayList arrayList4 = (ArrayList) entry2.getValue();
            u G11 = cVar.G(Long.valueOf(longValue));
            ?? g10 = G11.g(arrayList4);
            Iterator it2 = g10.iterator();
            while (it2.hasNext()) {
                s sVar2 = (s) it2.next();
                Intrinsics.f(sVar2);
                JsonElement a11 = sVar2.a();
                JsonPrimitive jsonPrimitive = a11 instanceof JsonPrimitive ? (JsonPrimitive) a11 : null;
                if (jsonPrimitive == null || (str = jsonPrimitive.getAsString()) == null) {
                    str = "";
                }
                hashMap.put(str, new C0470c(sVar2.b(), longValue));
                f7 = f7;
            }
            float f11 = f7;
            if (j11 != 0 && !g10.isEmpty() && !g10.isEmpty()) {
                Iterator it3 = g10.iterator();
                if (!it3.hasNext()) {
                    throw new NoSuchElementException();
                }
                Object next = it3.next();
                if (it3.hasNext()) {
                    Float k11 = ((s) next).k();
                    do {
                        Object next2 = it3.next();
                        Float k12 = ((s) next2).k();
                        if (k11.compareTo(k12) < 0) {
                            next = next2;
                            k11 = k12;
                        }
                    } while (it3.hasNext());
                }
                float floatValue = ((s) next).k().floatValue();
                M m11 = new M();
                m11.f71787a = g10;
                if (!g10.isEmpty()) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, floatValue);
                    ofFloat.setDuration(j11);
                    ofFloat.setInterpolator(new LinearInterpolator());
                    ofFloat.addUpdateListener(new Qe0.d(m11, G11));
                    ofFloat.addListener(new e(m11));
                    ofFloat.start();
                    f7 = f11;
                }
            }
            f7 = f11;
        }
    }

    @Override // xe0.InterfaceC10766e
    public final void b(long j11, @NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        j(j11, C7714v.a0(id2));
    }

    @Override // xe0.InterfaceC10766e
    public final void c(long j11, @NotNull List placemarks) {
        Intrinsics.checkNotNullParameter(placemarks, "placemarks");
        H(this, this.f23370m.h(placemarks), j11, 0L, 12);
    }

    @Override // xe0.AbstractC10765d, xe0.InterfaceC10766e
    public final void g(long j11, @NotNull List placemarks, long j12) {
        Intrinsics.checkNotNullParameter(placemarks, "placemarks");
        H(this, this.f23370m.h(placemarks), j11, j12, 8);
    }

    @Override // xe0.InterfaceC10766e
    public final we0.u getPlacemarkById(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        try {
            return (we0.u) ((HashMap) w()).get(id2);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // Ne0.f
    @NotNull
    public final Oe0.d i() {
        return this.f23370m;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [T, java.lang.Iterable, java.util.ArrayList, java.util.List] */
    @Override // xe0.InterfaceC10766e
    public final void j(long j11, @NotNull List ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        HashMap hashMap = new HashMap(ids.size());
        Iterator it = ids.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (v().b(str)) {
                z(j11, str);
            } else {
                HashMap<String, C0470c> hashMap2 = this.f23372o;
                C0470c c0470c = hashMap2.get(str);
                if (c0470c != null) {
                    ((HashMap) w()).remove(str);
                    hashMap2.remove(str);
                    s b11 = G(Long.valueOf(c0470c.b())).l().b(c0470c.a());
                    if (b11 != null) {
                        Long valueOf = Long.valueOf(c0470c.b());
                        Object obj = hashMap.get(valueOf);
                        if (obj == null) {
                            obj = new ArrayList();
                            hashMap.put(valueOf, obj);
                        }
                        ((ArrayList) obj).add(b11);
                    }
                }
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            long longValue = ((Number) entry.getKey()).longValue();
            ?? r12 = (ArrayList) entry.getValue();
            u G11 = G(Long.valueOf(longValue));
            if (j11 == 0 || hashMap.isEmpty()) {
                Iterator it2 = r12.iterator();
                while (it2.hasNext()) {
                    String j12 = ((s) it2.next()).j();
                    Intrinsics.checkNotNullExpressionValue(j12, "getIconImage(...)");
                    this.f23370m.l(j12);
                }
                G11.i(r12);
            } else {
                d dVar = new d(G11, this);
                if (r12.isEmpty()) {
                    continue;
                } else {
                    Iterator it3 = r12.iterator();
                    if (!it3.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    Object next = it3.next();
                    if (it3.hasNext()) {
                        Float k11 = ((s) next).k();
                        do {
                            Object next2 = it3.next();
                            Float k12 = ((s) next2).k();
                            if (k11.compareTo(k12) < 0) {
                                next = next2;
                                k11 = k12;
                            }
                        } while (it3.hasNext());
                    }
                    float floatValue = ((s) next).k().floatValue();
                    M m11 = new M();
                    m11.f71787a = r12;
                    if (!r12.isEmpty()) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(floatValue, 0.0f);
                        ofFloat.setDuration(j11);
                        ofFloat.setInterpolator(new LinearInterpolator());
                        ofFloat.addUpdateListener(new f(m11, G11));
                        ofFloat.addListener(new g(dVar, m11));
                        ofFloat.start();
                    }
                }
            }
        }
    }

    @Override // xe0.InterfaceC10766e
    public final void m(@NotNull we0.u placemark, long j11) {
        Intrinsics.checkNotNullParameter(placemark, "placemark");
        H(this, this.f23370m.h(C7714v.a0(placemark)), j11, 0L, 12);
    }

    @Override // Ne0.f
    public final void o(long j11, @NotNull ArrayList placemarks) {
        Intrinsics.checkNotNullParameter(placemarks, "placemarks");
        H(this, placemarks, j11, 0L, 12);
    }

    @Override // xe0.AbstractC10765d
    public final void s(@NotNull String id2, @NotNull z displayOptions) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(displayOptions, "displayOptions");
        we0.u uVar = (we0.u) ((HashMap) w()).get(id2);
        if (uVar != null) {
            H(this, this.f23370m.h(C7714v.a0(we0.u.a(uVar, null, displayOptions, null, null, 1021))), 0L, 0L, 4);
        }
    }

    @Override // Ne0.b, xe0.AbstractC10765d
    public final void t() {
        super.t();
        this.f23368k.S(this.f23373p);
        if (this.f23367j.isDestroyed()) {
            return;
        }
        this.f23370m.d(0L);
        try {
            Collection<u> values = this.f23371n.values();
            Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
            for (u uVar : values) {
                uVar.r();
                this.f23369l.h(uVar);
            }
        } catch (Throwable th2) {
            C9867b c9867b = C9867b.f99466a;
            C9867b.f("error in onDestroy PlacemarkController", th2, InterfaceC10046c.a.ERROR);
        }
    }
}
