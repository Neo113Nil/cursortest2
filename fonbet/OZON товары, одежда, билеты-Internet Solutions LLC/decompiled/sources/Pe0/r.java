package Pe0;

import De.C2862e;
import Le0.w;
import fg.C6561a;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.maplibre.android.maps.MapLibreMap;
import org.maplibre.android.maps.MapView;
import org.maplibre.android.maps.Style;
import org.maplibre.android.style.layers.SymbolLayer;
import org.maplibre.android.style.sources.GeoJsonSource;
import org.maplibre.geojson.Feature;
import org.maplibre.geojson.FeatureCollection;
import xe.C10720e0;
import xe.C10727i;
import xe.M;
import xe.N;
import xe.X0;

/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final MapLibreMap f22415a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private Style f22416b;

    /* renamed from: c, reason: collision with root package name */
    private final String f22417c;

    /* renamed from: d, reason: collision with root package name */
    private final String f22418d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f22419e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final o f22420f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final org.maplibre.android.style.sources.a f22421g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final String f22422h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final String f22423i;

    /* renamed from: j, reason: collision with root package name */
    private m f22424j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final AbstractMap f22425k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final C2862e f22426l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final AbstractMap f22427m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final Object f22428n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final Object f22429o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final AtomicLong f22430p;

    /* renamed from: q, reason: collision with root package name */
    private GeoJsonSource f22431q;

    /* renamed from: r, reason: collision with root package name */
    private SymbolLayer f22432r;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private AtomicBoolean f22433s;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.libre.placemark.customSymbol.SymbolManager$schedulePendingFlush$1", f = "SymbolManager.kt", l = {}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ FeatureCollection f22435e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(FeatureCollection featureCollection, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f22435e = featureCollection;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return r.this.new a(this.f22435e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            r rVar = r.this;
            if (!rVar.f22433s.get() && rVar.f22416b.n()) {
                GeoJsonSource geoJsonSource = rVar.f22431q;
                if (geoJsonSource == null) {
                    Intrinsics.n("source");
                    throw null;
                }
                geoJsonSource.b(this.f22435e);
            }
            return Unit.f71690a;
        }
    }

    public r(w mapView, MapLibreMap mapLibreMap, Style style, String str, String str2, boolean z11) {
        Object newKeySet;
        Object obj;
        o symbolElementProvider = new o();
        org.maplibre.android.style.sources.a geoJsonOptionsGeoJsonOptions = new org.maplibre.android.style.sources.a();
        geoJsonOptionsGeoJsonOptions.put("buffer", 32);
        geoJsonOptionsGeoJsonOptions.put("maxzoom", 14);
        Intrinsics.checkNotNullParameter(mapView, "mapView");
        Intrinsics.checkNotNullParameter(mapLibreMap, "mapLibreMap");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(symbolElementProvider, "symbolElementProvider");
        Intrinsics.checkNotNullParameter(geoJsonOptionsGeoJsonOptions, "geoJsonOptionsGeoJsonOptions");
        this.f22415a = mapLibreMap;
        this.f22416b = style;
        this.f22417c = str;
        this.f22418d = str2;
        this.f22419e = z11;
        this.f22420f = symbolElementProvider;
        this.f22421g = geoJsonOptionsGeoJsonOptions;
        this.f22422h = symbolElementProvider.b();
        this.f22423i = symbolElementProvider.d();
        this.f22425k = !z11 ? new LinkedHashMap(64) : new ConcurrentHashMap(64);
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.f22426l = N.a(De.s.f6650a.x().plus(X0.b()));
        this.f22427m = !z11 ? new HashMap(64) : new ConcurrentHashMap(64);
        if (z11) {
            newKeySet = ConcurrentHashMap.newKeySet(16);
            Intrinsics.checkNotNullExpressionValue(newKeySet, "newKeySet(...)");
        } else {
            newKeySet = new HashSet(16);
        }
        this.f22428n = newKeySet;
        if (z11) {
            ConcurrentHashMap.KeySetView newKeySet2 = ConcurrentHashMap.newKeySet(16);
            Intrinsics.checkNotNullExpressionValue(newKeySet2, "newKeySet(...)");
            obj = newKeySet2;
        } else {
            obj = new HashSet(16);
        }
        this.f22429o = obj;
        this.f22430p = new AtomicLong(0L);
        this.f22433s = new AtomicBoolean(false);
        l(geoJsonOptionsGeoJsonOptions);
        mapView.addOnDidFinishLoadingStyleListener(new MapView.OnDidFinishLoadingStyleListener() { // from class: Pe0.p
            @Override // org.maplibre.android.maps.MapView.OnDidFinishLoadingStyleListener
            public final void j() {
                r.a(r.this);
            }
        });
    }

    public static void a(final r rVar) {
        rVar.f22415a.v(new Style.OnStyleLoaded() { // from class: Pe0.q
            @Override // org.maplibre.android.maps.Style.OnStyleLoaded
            public final void a(Style style) {
                r.b(r.this, style);
            }
        });
    }

    public static void b(r rVar, Style loadedStyle) {
        Intrinsics.checkNotNullParameter(loadedStyle, "loadedStyle");
        rVar.f22416b = loadedStyle;
        rVar.l(rVar.f22421g);
    }

    private final void l(org.maplibre.android.style.sources.a aVar) {
        o oVar = this.f22420f;
        this.f22431q = oVar.c(aVar);
        SymbolLayer a11 = oVar.a();
        org.maplibre.android.style.layers.a aVar2 = new org.maplibre.android.style.layers.a("icon-image", C6561a.b("icon-image"));
        org.maplibre.android.style.layers.a aVar3 = new org.maplibre.android.style.layers.a("icon-size", C6561a.b("icon-size"));
        org.maplibre.android.style.layers.a aVar4 = new org.maplibre.android.style.layers.a("icon-offset", C6561a.b("icon-offset"));
        org.maplibre.android.style.layers.a aVar5 = new org.maplibre.android.style.layers.a("icon-anchor", C6561a.b("icon-anchor"));
        org.maplibre.android.style.layers.a aVar6 = new org.maplibre.android.style.layers.a("icon-rotate", C6561a.b("icon-rotate"));
        org.maplibre.android.style.layers.b bVar = new org.maplibre.android.style.layers.b("icon-opacity", C6561a.b("icon-opacity"));
        Boolean bool = Boolean.TRUE;
        a11.i(aVar2, aVar3, aVar4, aVar5, aVar6, bVar, new org.maplibre.android.style.layers.a("icon-allow-overlap", bool), new org.maplibre.android.style.layers.a("icon-ignore-placement", bool), new org.maplibre.android.style.layers.a("symbol-sort-key", C6561a.b("symbol-sort-key")), new org.maplibre.android.style.layers.a("symbol-z-order", "auto"));
        Intrinsics.checkNotNullExpressionValue(a11, "withProperties(...)");
        this.f22432r = a11;
        Style style = this.f22416b;
        GeoJsonSource geoJsonSource = this.f22431q;
        if (geoJsonSource == null) {
            Intrinsics.n("source");
            throw null;
        }
        style.f(geoJsonSource);
        String str = this.f22417c;
        String str2 = this.f22418d;
        if (str2 != null && str != null) {
            throw new IllegalArgumentException("At most one of belowLayerId and aboveLayerId can be set, not both!");
        }
        if (str2 != null) {
            Style style2 = this.f22416b;
            SymbolLayer symbolLayer = this.f22432r;
            if (symbolLayer == null) {
                Intrinsics.n("layer");
                throw null;
            }
            style2.e(symbolLayer, str2);
        } else if (str != null) {
            Style style3 = this.f22416b;
            SymbolLayer symbolLayer2 = this.f22432r;
            if (symbolLayer2 == null) {
                Intrinsics.n("layer");
                throw null;
            }
            style3.d(symbolLayer2, str);
        } else {
            Style style4 = this.f22416b;
            SymbolLayer symbolLayer3 = this.f22432r;
            if (symbolLayer3 == null) {
                Intrinsics.n("layer");
                throw null;
            }
            style4.c(symbolLayer3);
        }
        o(true);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Set] */
    private final void o(boolean z11) {
        AbstractMap abstractMap;
        AbstractMap abstractMap2;
        FeatureCollection fromFeatures;
        AtomicBoolean atomicBoolean = this.f22433s;
        if (atomicBoolean.get()) {
            return;
        }
        ?? r12 = this.f22429o;
        ?? r22 = this.f22428n;
        if (!z11 && r22.isEmpty() && r12.isEmpty()) {
            fromFeatures = null;
        } else {
            Iterator it = r22.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                abstractMap = this.f22427m;
                abstractMap2 = this.f22425k;
                if (!hasNext) {
                    break;
                }
                long longValue = ((Number) it.next()).longValue();
                n nVar = (n) abstractMap2.get(Long.valueOf(longValue));
                if (nVar != null) {
                    abstractMap.put(Long.valueOf(longValue), nVar.h());
                }
            }
            r22.clear();
            r12.clear();
            ArrayList arrayList = new ArrayList();
            Iterator it2 = abstractMap2.keySet().iterator();
            while (it2.hasNext()) {
                Feature feature = (Feature) abstractMap.get(Long.valueOf(((Number) it2.next()).longValue()));
                if (feature != null) {
                    arrayList.add(feature);
                }
            }
            fromFeatures = FeatureCollection.fromFeatures(arrayList);
        }
        if (fromFeatures == null) {
            return;
        }
        if (this.f22419e) {
            C10727i.c(this.f22426l, null, null, new a(fromFeatures, null), 3);
        } else {
            if (atomicBoolean.get() || !this.f22416b.n()) {
                return;
            }
            GeoJsonSource geoJsonSource = this.f22431q;
            if (geoJsonSource != null) {
                geoJsonSource.b(fromFeatures);
            } else {
                Intrinsics.n("source");
                throw null;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Set] */
    @NotNull
    public final List f(@NotNull ArrayList optionsList) {
        List list;
        Intrinsics.checkNotNullParameter(optionsList, "optionsList");
        if (this.f22433s.get()) {
            list = K.f71697a;
        } else {
            ArrayList arrayList = new ArrayList(C7714v.z(optionsList, 10));
            Iterator it = optionsList.iterator();
            while (it.hasNext()) {
                n a11 = ((s) it.next()).a(this.f22430p.incrementAndGet());
                this.f22425k.put(Long.valueOf(a11.e()), a11);
                this.f22428n.add(Long.valueOf(a11.e()));
                arrayList.add(a11);
            }
            list = arrayList;
        }
        o(false);
        return list;
    }

    public final String g() {
        return this.f22417c;
    }

    public final String h() {
        return this.f22418d;
    }

    public final m i() {
        return this.f22424j;
    }

    @NotNull
    public final String j() {
        return this.f22422h;
    }

    public final n k(long j11) {
        return (n) this.f22425k.get(Long.valueOf(j11));
    }

    public final void m() {
        this.f22433s.set(true);
        if (this.f22416b.n()) {
            this.f22416b.q(this.f22422h);
            this.f22416b.s(this.f22423i);
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.Set] */
    public final void n(@NotNull Collection<n> removedSymbols) {
        Intrinsics.checkNotNullParameter(removedSymbols, "removedSymbols");
        if (!this.f22433s.get()) {
            for (n nVar : removedSymbols) {
                if (((n) this.f22425k.remove(Long.valueOf(nVar.e()))) != null) {
                    this.f22428n.remove(Long.valueOf(nVar.e()));
                    this.f22427m.remove(Long.valueOf(nVar.e()));
                    this.f22429o.add(Long.valueOf(nVar.e()));
                }
            }
        }
        o(false);
    }

    public final void p(m mVar) {
        this.f22424j = mVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Set] */
    public final void q(@NotNull n updatedSymbol) {
        Intrinsics.checkNotNullParameter(updatedSymbol, "updatedSymbol");
        if (!this.f22433s.get()) {
            this.f22425k.put(Long.valueOf(updatedSymbol.e()), updatedSymbol);
            this.f22428n.add(Long.valueOf(updatedSymbol.e()));
        }
        o(false);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Set] */
    public final void r(@NotNull ArrayList updatedSymbols) {
        Intrinsics.checkNotNullParameter(updatedSymbols, "updatedSymbols");
        if (!this.f22433s.get()) {
            Iterator it = updatedSymbols.iterator();
            while (it.hasNext()) {
                n nVar = (n) it.next();
                this.f22425k.put(Long.valueOf(nVar.e()), nVar);
                this.f22428n.add(Long.valueOf(nVar.e()));
            }
        }
        o(false);
    }
}
