package E80;

import java.util.ArrayList;
import java.util.Iterator;
import org.maplibre.geojson.Geometry;
import org.maplibre.geojson.GeometryCollection;
import org.maplibre.geojson.LineString;
import org.maplibre.geojson.MultiLineString;
import org.maplibre.geojson.MultiPoint;
import org.maplibre.geojson.MultiPolygon;
import org.maplibre.geojson.Point;
import org.maplibre.geojson.Polygon;
import v5.C10234h;

/* loaded from: classes3.dex */
public final class c implements C10234h.b {
    public static double[] d(Geometry geometry) {
        if (geometry instanceof Point) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Point) geometry);
            return e(arrayList);
        }
        if (geometry instanceof MultiPoint) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(((MultiPoint) geometry).coordinates());
            return e(arrayList2);
        }
        if (geometry instanceof LineString) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(((LineString) geometry).coordinates());
            return e(arrayList3);
        }
        if (geometry instanceof MultiLineString) {
            MultiLineString multiLineString = (MultiLineString) geometry;
            ArrayList arrayList4 = new ArrayList();
            for (int i11 = 0; i11 < multiLineString.coordinates().size(); i11++) {
                arrayList4.addAll(multiLineString.coordinates().get(i11));
            }
            return e(arrayList4);
        }
        if (geometry instanceof Polygon) {
            Polygon polygon = (Polygon) geometry;
            ArrayList arrayList5 = new ArrayList();
            for (int i12 = 0; i12 < polygon.coordinates().size(); i12++) {
                for (int i13 = 0; i13 < polygon.coordinates().get(i12).size(); i13++) {
                    arrayList5.add(polygon.coordinates().get(i12).get(i13));
                }
            }
            return e(arrayList5);
        }
        if (geometry instanceof MultiPolygon) {
            MultiPolygon multiPolygon = (MultiPolygon) geometry;
            ArrayList arrayList6 = new ArrayList();
            for (int i14 = 0; i14 < multiPolygon.coordinates().size(); i14++) {
                for (int i15 = 0; i15 < multiPolygon.coordinates().get(i14).size(); i15++) {
                    for (int i16 = 0; i16 < multiPolygon.coordinates().get(i14).get(i15).size(); i16++) {
                        arrayList6.add(multiPolygon.coordinates().get(i14).get(i15).get(i16));
                    }
                }
            }
            return e(arrayList6);
        }
        if (!(geometry instanceof GeometryCollection)) {
            throw new RuntimeException("Unknown geometry class: " + geometry.getClass());
        }
        ArrayList arrayList7 = new ArrayList();
        Iterator<Geometry> it = ((GeometryCollection) geometry).geometries().iterator();
        while (it.hasNext()) {
            double[] d11 = d(it.next());
            arrayList7.add(Point.fromLngLat(d11[0], d11[1]));
            arrayList7.add(Point.fromLngLat(d11[2], d11[1]));
            arrayList7.add(Point.fromLngLat(d11[2], d11[3]));
            arrayList7.add(Point.fromLngLat(d11[0], d11[3]));
        }
        MultiPoint fromLngLats = MultiPoint.fromLngLats(arrayList7);
        ArrayList arrayList8 = new ArrayList();
        arrayList8.addAll(fromLngLats.coordinates());
        return e(arrayList8);
    }

    private static double[] e(ArrayList arrayList) {
        double[] dArr = {Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY};
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Point point = (Point) it.next();
            if (dArr[0] > point.longitude()) {
                dArr[0] = point.longitude();
            }
            if (dArr[1] > point.latitude()) {
                dArr[1] = point.latitude();
            }
            if (dArr[2] < point.longitude()) {
                dArr[2] = point.longitude();
            }
            if (dArr[3] < point.latitude()) {
                dArr[3] = point.latitude();
            }
        }
        return dArr;
    }
}
