package Ue0;

import com.yandex.mapkit.geometry.LinearRing;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polygon;
import com.yandex.mapkit.map.PolygonMapObject;
import com.yandex.mapkit.mapview.MapView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ye0.InterfaceC10889a;

/* loaded from: classes3.dex */
public final class x implements InterfaceC10889a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final MapView f27715a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f27716b;

    public x(@NotNull MapView mapView) {
        Intrinsics.checkNotNullParameter(mapView, "mapView");
        this.f27715a = mapView;
        this.f27716b = new LinkedHashMap();
    }

    @NotNull
    public static Polygon d(@NotNull we0.v mapPolygon) {
        Intrinsics.checkNotNullParameter(mapPolygon, "mapPolygon");
        List<we0.m> d11 = mapPolygon.d();
        ArrayList arrayList = new ArrayList(C7714v.z(d11, 10));
        for (we0.m mVar : d11) {
            arrayList.add(new Point(mVar.getLatitude(), mVar.getLongitude()));
        }
        LinearRing linearRing = new LinearRing(arrayList);
        List<List<we0.m>> a11 = mapPolygon.a();
        ArrayList arrayList2 = new ArrayList(C7714v.z(a11, 10));
        Iterator<T> it = a11.iterator();
        while (it.hasNext()) {
            List<we0.m> list = (List) it.next();
            ArrayList arrayList3 = new ArrayList(C7714v.z(list, 10));
            for (we0.m mVar2 : list) {
                arrayList3.add(new Point(mVar2.getLatitude(), mVar2.getLongitude()));
            }
            arrayList2.add(new LinearRing(arrayList3));
        }
        return new Polygon(linearRing, arrayList2);
    }

    @Override // ye0.InterfaceC10889a
    @NotNull
    public final ArrayList a() {
        Collection values = this.f27716b.values();
        ArrayList arrayList = new ArrayList(C7714v.z(values, 10));
        Iterator it = values.iterator();
        while (it.hasNext()) {
            arrayList.add(((w) it.next()).b());
        }
        return arrayList;
    }

    @Override // ye0.InterfaceC10889a
    public final void b(@NotNull String id2) {
        PolygonMapObject c11;
        Intrinsics.checkNotNullParameter(id2, "id");
        LinkedHashMap linkedHashMap = this.f27716b;
        w wVar = (w) linkedHashMap.get(id2);
        if (wVar == null || (c11 = wVar.c()) == null) {
            return;
        }
        this.f27715a.getMap().getMapObjects().remove(c11);
        linkedHashMap.remove(id2);
    }

    @Override // ye0.InterfaceC10889a
    public final void c(@NotNull we0.v polygon) {
        Intrinsics.checkNotNullParameter(polygon, "polygon");
        LinkedHashMap linkedHashMap = this.f27716b;
        w wVar = (w) linkedHashMap.get(polygon.c());
        if (wVar != null) {
            PolygonMapObject c11 = wVar.c();
            c11.setStrokeColor(polygon.e());
            c11.setStrokeWidth(polygon.f());
            c11.setFillColor(polygon.b());
            c11.setZIndex(0.0f);
            c11.setGeometry(d(polygon));
            linkedHashMap.put(polygon.c(), w.a(wVar, polygon));
            return;
        }
        PolygonMapObject addPolygon = this.f27715a.getMap().getMapObjects().addPolygon(d(polygon));
        Intrinsics.checkNotNullExpressionValue(addPolygon, "addPolygon(...)");
        w wVar2 = new w(polygon, addPolygon);
        PolygonMapObject c12 = wVar2.c();
        c12.setStrokeColor(polygon.e());
        c12.setStrokeWidth(polygon.f());
        c12.setFillColor(polygon.b());
        c12.setZIndex(0.0f);
        linkedHashMap.put(polygon.c(), wVar2);
    }
}
