package Qe0;

import Le0.w;
import Sc.InterfaceC3999a;
import Yf.d;
import android.annotation.SuppressLint;
import android.graphics.PointF;
import android.view.MotionEvent;
import com.google.gson.JsonElement;
import eg.AbstractC6362a;
import eg.o;
import eg.s;
import eg.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.maplibre.android.geometry.LatLng;
import org.maplibre.android.maps.MapLibreMap;
import org.maplibre.android.maps.Projection;
import org.maplibre.geojson.Feature;
import org.maplibre.geojson.Geometry;
import org.maplibre.geojson.Point;

@InterfaceC3999a
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes3.dex */
public final class b implements d.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final MapLibreMap f23357a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Yf.a f23358b;

    /* renamed from: c, reason: collision with root package name */
    private final int f23359c;

    /* renamed from: d, reason: collision with root package name */
    private final int f23360d;

    /* renamed from: e, reason: collision with root package name */
    private final int f23361e;

    /* renamed from: f, reason: collision with root package name */
    private final int f23362f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final LinkedList f23363g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final HashMap<String, eg.c<?, ?, ?, ?, ?, ?>> f23364h;

    /* renamed from: i, reason: collision with root package name */
    private AbstractC6362a<Geometry> f23365i;

    /* renamed from: j, reason: collision with root package name */
    private eg.c<?, ?, ?, ?, ?, ?> f23366j;

    public b(w mapView, MapLibreMap mapLibreMap, Yf.a androidGesturesManager) {
        int scrollX = mapView.getScrollX();
        int scrollY = mapView.getScrollY();
        int measuredWidth = mapView.getMeasuredWidth();
        int measuredHeight = mapView.getMeasuredHeight();
        Intrinsics.checkNotNullParameter(mapView, "mapView");
        Intrinsics.checkNotNullParameter(mapLibreMap, "mapLibreMap");
        Intrinsics.checkNotNullParameter(androidGesturesManager, "androidGesturesManager");
        this.f23357a = mapLibreMap;
        this.f23358b = androidGesturesManager;
        this.f23359c = scrollX;
        this.f23360d = scrollY;
        this.f23361e = measuredWidth;
        this.f23362f = measuredHeight;
        this.f23363g = new LinkedList();
        this.f23364h = new HashMap<>();
        androidGesturesManager.h(this);
        mapView.i(new BK.a(this, 1));
    }

    public static boolean d(b bVar, MotionEvent motionEvent) {
        AbstractC6362a<Geometry> abstractC6362a = bVar.f23365i;
        bVar.f23358b.g(motionEvent);
        return (bVar.f23365i == null && abstractC6362a == null) ? false : true;
    }

    private static List f(eg.c cVar) {
        if (!(cVar instanceof a)) {
            return K.f71697a;
        }
        ArrayList n11 = ((a) cVar).n();
        if (n11 == null) {
            n11 = null;
        }
        return n11 == null ? K.f71697a : n11;
    }

    private final void i(AbstractC6362a<?> abstractC6362a, eg.c<?, ?, ?, ?, ?, ?> cVar) {
        if (abstractC6362a != null && cVar != null) {
            Iterator it = f(cVar).iterator();
            while (it.hasNext()) {
                ((o) it.next()).a(abstractC6362a);
            }
        }
        this.f23365i = null;
        this.f23366j = null;
    }

    @Override // Yf.d.a
    public final boolean a(@NotNull Yf.d detector) {
        JsonElement property;
        boolean z11;
        Intrinsics.checkNotNullParameter(detector, "detector");
        Iterator it = this.f23363g.iterator();
        while (true) {
            boolean z12 = false;
            if (!it.hasNext()) {
                return false;
            }
            eg.c<?, ?, ?, ?, ?, ?> cVar = (eg.c) it.next();
            if (detector.j() == 1) {
                PointF i11 = detector.i();
                Intrinsics.checkNotNullExpressionValue(i11, "getFocalPoint(...)");
                List<Feature> O11 = this.f23357a.O(i11, cVar.o());
                Intrinsics.checkNotNullExpressionValue(O11, "queryRenderedFeatures(...)");
                AbstractC6362a<Geometry> abstractC6362a = null;
                if (cVar instanceof a) {
                    Iterator<Feature> it2 = O11.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        s b11 = ((a) cVar).l().b(it2.next().getProperty("id").getAsLong());
                        if (b11 != null) {
                            List<o> f7 = f(cVar);
                            if (!(f7 instanceof Collection) || !f7.isEmpty()) {
                                for (o oVar : f7) {
                                    if (!(oVar instanceof j ? ((j) oVar).d(b11, i11) : true)) {
                                        z11 = false;
                                        break;
                                    }
                                }
                            }
                            z11 = true;
                            if (z11) {
                                abstractC6362a = b11;
                                break;
                            }
                        }
                    }
                } else {
                    Feature feature = (Feature) C7714v.M(O11);
                    Long valueOf = (feature == null || (property = feature.getProperty("id")) == null) ? null : Long.valueOf(property.getAsLong());
                    if (valueOf != null) {
                        abstractC6362a = (AbstractC6362a) cVar.l().b(valueOf.longValue());
                    }
                }
                if (abstractC6362a == null) {
                    continue;
                } else {
                    if (abstractC6362a.e()) {
                        Iterator it3 = f(cVar).iterator();
                        while (it3.hasNext()) {
                            ((o) it3.next()).b(abstractC6362a);
                        }
                        this.f23365i = abstractC6362a;
                        this.f23366j = cVar;
                        z12 = true;
                    }
                    if (z12) {
                        return true;
                    }
                }
            }
        }
    }

    @Override // Yf.d.a
    public final void b(@NotNull Yf.d detector) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        i(this.f23365i, this.f23366j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r7.e() == false) goto L8;
     */
    @Override // Yf.d.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(@NotNull Yf.d detector, float f7, float f11) {
        List f12;
        Intrinsics.checkNotNullParameter(detector, "detector");
        if (this.f23365i != null) {
            if (detector.j() <= 1) {
                AbstractC6362a<Geometry> abstractC6362a = this.f23365i;
                Intrinsics.f(abstractC6362a);
            }
            i(this.f23365i, this.f23366j);
            return true;
        }
        if (this.f23365i == null) {
            return false;
        }
        Yf.c v11 = detector.v();
        float b11 = v11.b();
        float f13 = this.f23359c;
        float c11 = v11.c();
        float f14 = this.f23360d;
        PointF pointF = new PointF(b11 - f13, c11 - f14);
        float f15 = pointF.x;
        if (f15 >= 0.0f) {
            float f16 = pointF.y;
            if (f16 >= 0.0f && f15 <= this.f23361e && f16 <= this.f23362f) {
                Projection t2 = this.f23357a.t();
                Intrinsics.checkNotNullExpressionValue(t2, "getProjection(...)");
                LatLng b12 = t2.b(new PointF(v11.b() - f13, v11.c() - f14));
                Intrinsics.checkNotNullExpressionValue(b12, "fromScreenLocation(...)");
                Point fromLngLat = (b12.getLatitude() > 85.05112877980659d || b12.getLatitude() < -85.05112877980659d) ? null : Point.fromLngLat(b12.getLongitude(), b12.getLatitude());
                if (fromLngLat == null) {
                    return false;
                }
                AbstractC6362a<Geometry> abstractC6362a2 = this.f23365i;
                if (abstractC6362a2 != null) {
                    abstractC6362a2.h(fromLngLat);
                }
                eg.c<?, ?, ?, ?, ?, ?> cVar = this.f23366j;
                if (cVar != null) {
                    cVar.v();
                }
                eg.c<?, ?, ?, ?, ?, ?> cVar2 = this.f23366j;
                if (cVar2 != null && (f12 = f(cVar2)) != null) {
                    Iterator it = f12.iterator();
                    while (it.hasNext()) {
                        ((o) it.next()).c(this.f23365i);
                    }
                }
                return true;
            }
        }
        i(this.f23365i, this.f23366j);
        return true;
    }

    public final void e(@NotNull a annotationManager) {
        Intrinsics.checkNotNullParameter(annotationManager, "annotationManager");
        String m11 = annotationManager.m();
        HashMap<String, eg.c<?, ?, ?, ?, ?, ?>> hashMap = this.f23364h;
        LinkedList linkedList = this.f23363g;
        if (m11 != null) {
            linkedList.add(C7714v.S(hashMap.get(annotationManager.m()), linkedList) + 1, annotationManager);
        } else if (annotationManager.k() != null) {
            linkedList.add(C7714v.S(hashMap.get(annotationManager.k()), linkedList), annotationManager);
        } else {
            linkedList.add(0, annotationManager);
        }
        hashMap.put(annotationManager.o(), annotationManager);
    }

    public final void g(s sVar) {
        AbstractC6362a<Geometry> abstractC6362a = this.f23365i;
        if (sVar == abstractC6362a) {
            i(abstractC6362a, this.f23366j);
        }
    }

    public final void h(@NotNull u annotationManager) {
        Intrinsics.checkNotNullParameter(annotationManager, "annotationManager");
        this.f23363g.remove(annotationManager);
        this.f23364h.remove(annotationManager.o());
    }
}
