package Se0;

import B4.V;
import B90.C2618u;
import Le0.w;
import eg.f;
import eg.h;
import eg.i;
import eg.j;
import eg.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.maplibre.android.maps.MapLibreMap;
import org.maplibre.android.maps.Style;
import org.maplibre.android.style.layers.Layer;
import org.maplibre.geojson.LineString;
import org.maplibre.geojson.Point;
import org.maplibre.geojson.Polygon;
import we0.m;
import we0.v;
import ye0.InterfaceC10889a;

/* loaded from: classes3.dex */
public final class a implements InterfaceC10889a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final w f26182a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final MapLibreMap f26183b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f26184c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f26185d;

    /* renamed from: Se0.a$a, reason: collision with other inner class name */
    public static final class C0520a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final h f26186a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final l f26187b;

        public C0520a(@NotNull h fill, @NotNull l line) {
            Intrinsics.checkNotNullParameter(fill, "fill");
            Intrinsics.checkNotNullParameter(line, "line");
            this.f26186a = fill;
            this.f26187b = line;
        }

        @NotNull
        public final h a() {
            return this.f26186a;
        }

        @NotNull
        public final l b() {
            return this.f26187b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0520a)) {
                return false;
            }
            C0520a c0520a = (C0520a) obj;
            return Intrinsics.d(this.f26186a, c0520a.f26186a) && Intrinsics.d(this.f26187b, c0520a.f26187b);
        }

        public final int hashCode() {
            return this.f26187b.hashCode() + (this.f26186a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "Managers(fill=" + this.f26186a + ", line=" + this.f26187b + ")";
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final v f26188a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final f f26189b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final ArrayList f26190c;

        /* renamed from: d, reason: collision with root package name */
        private final float f26191d;

        public b(@NotNull v polygon, @NotNull f fill, @NotNull ArrayList line, float f7) {
            Intrinsics.checkNotNullParameter(polygon, "polygon");
            Intrinsics.checkNotNullParameter(fill, "fill");
            Intrinsics.checkNotNullParameter(line, "line");
            this.f26188a = polygon;
            this.f26189b = fill;
            this.f26190c = line;
            this.f26191d = f7;
        }

        @NotNull
        public final f a() {
            return this.f26189b;
        }

        @NotNull
        public final List<j> b() {
            return this.f26190c;
        }

        @NotNull
        public final v c() {
            return this.f26188a;
        }

        public final float d() {
            return this.f26191d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f26188a.equals(bVar.f26188a) && this.f26189b.equals(bVar.f26189b) && this.f26190c.equals(bVar.f26190c) && Float.compare(this.f26191d, bVar.f26191d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f26191d) + C2618u.b(this.f26190c, (this.f26189b.hashCode() + (this.f26188a.hashCode() * 31)) * 31, 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PolygonAnnotations(polygon=");
            sb2.append(this.f26188a);
            sb2.append(", fill=");
            sb2.append(this.f26189b);
            sb2.append(", line=");
            sb2.append(this.f26190c);
            sb2.append(", zIndex=");
            return V.b(this.f26191d, ")", sb2);
        }
    }

    public a(@NotNull w mapView, @NotNull MapLibreMap mapLibreMap) {
        Intrinsics.checkNotNullParameter(mapView, "mapView");
        Intrinsics.checkNotNullParameter(mapLibreMap, "mapLibreMap");
        this.f26182a = mapView;
        this.f26183b = mapLibreMap;
        this.f26184c = new LinkedHashMap();
        this.f26185d = new LinkedHashMap();
    }

    private final void d() {
        Object obj;
        Style u11 = this.f26183b.u();
        if (u11 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.f26184c;
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(((C0520a) ((Map.Entry) it.next()).getValue()).b().o());
        }
        List<Layer> k11 = u11.k();
        Intrinsics.checkNotNullExpressionValue(k11, "getLayers(...)");
        Iterator<T> it2 = k11.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            Layer layer = (Layer) obj;
            String b11 = layer.b();
            Intrinsics.checkNotNullExpressionValue(b11, "getId(...)");
            if (kotlin.text.h.t(b11, "mapbox-android-line-layer", false) && !arrayList.contains(layer.b())) {
                break;
            }
        }
        Layer layer2 = (Layer) obj;
        String b12 = layer2 != null ? layer2.b() : null;
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        Collection<C0520a> values = new TreeMap(linkedHashMap).values();
        Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
        for (C0520a c0520a : values) {
            Iterator it3 = C7714v.b0(c0520a.a().o(), c0520a.b().o()).iterator();
            while (it3.hasNext()) {
                Layer i11 = u11.i((String) it3.next());
                if (i11 != null) {
                    u11.r(i11);
                    u11.e(i11, b12 == null ? "org.maplibre.annotations.points" : b12);
                }
            }
        }
    }

    private static LineString e(List list) {
        List<m> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        for (m mVar : list2) {
            arrayList.add(Point.fromLngLat(mVar.getLongitude(), mVar.getLatitude()));
        }
        if (!arrayList.isEmpty() && !Intrinsics.d(C7714v.K(arrayList), C7714v.X(arrayList))) {
            arrayList = C7714v.q0(C7714v.K(arrayList), arrayList);
        }
        LineString fromLngLats = LineString.fromLngLats(arrayList);
        Intrinsics.checkNotNullExpressionValue(fromLngLats, "fromLngLats(...)");
        return fromLngLats;
    }

    @Override // ye0.InterfaceC10889a
    @NotNull
    public final ArrayList a() {
        Collection values = this.f26185d.values();
        ArrayList arrayList = new ArrayList(C7714v.z(values, 10));
        Iterator it = values.iterator();
        while (it.hasNext()) {
            arrayList.add(((b) it.next()).c());
        }
        return arrayList;
    }

    @Override // ye0.InterfaceC10889a
    public final void b(@NotNull String id2) {
        C0520a c0520a;
        Intrinsics.checkNotNullParameter(id2, "id");
        b bVar = (b) this.f26185d.remove(id2);
        if (bVar == null || (c0520a = (C0520a) this.f26184c.get(Float.valueOf(bVar.d()))) == null) {
            return;
        }
        c0520a.a().h(bVar.a());
        Iterator<T> it = bVar.b().iterator();
        while (it.hasNext()) {
            c0520a.b().h((j) it.next());
        }
        d();
    }

    @Override // ye0.InterfaceC10889a
    public final void c(@NotNull v polygon) {
        Intrinsics.checkNotNullParameter(polygon, "polygon");
        b(polygon.c());
        LinkedHashMap linkedHashMap = this.f26184c;
        Float valueOf = Float.valueOf(0.0f);
        Object obj = linkedHashMap.get(valueOf);
        if (obj == null) {
            w mapView = this.f26182a;
            Intrinsics.checkNotNullParameter(mapView, "mapView");
            MapLibreMap mapLibreMap = this.f26183b;
            Intrinsics.checkNotNullParameter(mapLibreMap, "mapLibreMap");
            Style u11 = mapLibreMap.u();
            Intrinsics.f(u11);
            h hVar = new h(mapView, mapLibreMap, u11);
            l lVar = new l(mapView, mapLibreMap, u11, null);
            lVar.w();
            obj = new C0520a(hVar, lVar);
            linkedHashMap.put(valueOf, obj);
        }
        C0520a c0520a = (C0520a) obj;
        i iVar = new i();
        LineString e11 = e(polygon.d());
        List<List<m>> a11 = polygon.a();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : a11) {
            if (((List) obj2).size() >= 3) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(e((List) it.next()));
        }
        LineString[] lineStringArr = (LineString[]) arrayList2.toArray(new LineString[0]);
        Polygon fromOuterInner = Polygon.fromOuterInner(e11, (LineString[]) Arrays.copyOf(lineStringArr, lineStringArr.length));
        Intrinsics.checkNotNullExpressionValue(fromOuterInner, "fromOuterInner(...)");
        iVar.c(fromOuterInner);
        iVar.b(org.maplibre.android.utils.b.a(polygon.b()));
        f f7 = c0520a.a().f(iVar);
        Tc.b builder = C7714v.B();
        builder.add(e(polygon.d()));
        List<List<m>> a12 = polygon.a();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : a12) {
            if (((List) obj3).size() >= 3) {
                arrayList3.add(obj3);
            }
        }
        ArrayList arrayList4 = new ArrayList(C7714v.z(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(e((List) it2.next()));
        }
        builder.addAll(C7714v.U0(arrayList4));
        Intrinsics.checkNotNullParameter(builder, "builder");
        Tc.b B11 = builder.B();
        ArrayList arrayList5 = new ArrayList(C7714v.z(B11, 10));
        ListIterator listIterator = B11.listIterator(0);
        while (listIterator.hasNext()) {
            LineString lineString = (LineString) listIterator.next();
            eg.m mVar = new eg.m();
            mVar.b(lineString);
            mVar.c(org.maplibre.android.utils.b.a(polygon.e()));
            mVar.d(Float.valueOf(polygon.f() + 0.5f));
            j f11 = c0520a.b().f(mVar);
            f11.j();
            arrayList5.add(f11);
        }
        this.f26185d.put(polygon.c(), new b(polygon, f7, arrayList5, 0.0f));
        d();
    }
}
