package Pe0;

import Le0.w;
import Yf.d;
import android.annotation.SuppressLint;
import android.graphics.PointF;
import android.view.MotionEvent;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.maplibre.android.geometry.LatLng;
import org.maplibre.android.maps.MapLibreMap;
import org.maplibre.android.maps.Projection;
import org.maplibre.geojson.Feature;
import org.maplibre.geojson.Point;

@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes3.dex */
public final class a implements d.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final MapLibreMap f22312a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Yf.a f22313b;

    /* renamed from: c, reason: collision with root package name */
    private final int f22314c;

    /* renamed from: d, reason: collision with root package name */
    private final int f22315d;

    /* renamed from: e, reason: collision with root package name */
    private final int f22316e;

    /* renamed from: f, reason: collision with root package name */
    private final int f22317f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final LinkedList f22318g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final HashMap<String, r> f22319h;

    /* renamed from: i, reason: collision with root package name */
    private n f22320i;

    /* renamed from: j, reason: collision with root package name */
    private r f22321j;

    public a(w mapView, MapLibreMap mapLibreMap, Yf.a androidGesturesManager) {
        int scrollX = mapView.getScrollX();
        int scrollY = mapView.getScrollY();
        int measuredWidth = mapView.getMeasuredWidth();
        int measuredHeight = mapView.getMeasuredHeight();
        Intrinsics.checkNotNullParameter(mapView, "mapView");
        Intrinsics.checkNotNullParameter(mapLibreMap, "mapLibreMap");
        Intrinsics.checkNotNullParameter(androidGesturesManager, "androidGesturesManager");
        this.f22312a = mapLibreMap;
        this.f22313b = androidGesturesManager;
        this.f22314c = scrollX;
        this.f22315d = scrollY;
        this.f22316e = measuredWidth;
        this.f22317f = measuredHeight;
        this.f22318g = new LinkedList();
        this.f22319h = new HashMap<>();
        androidGesturesManager.h(this);
        mapView.i(new FY.c(this, 1));
    }

    public static boolean d(a aVar, MotionEvent motionEvent) {
        n nVar = aVar.f22320i;
        aVar.f22313b.g(motionEvent);
        return (aVar.f22320i == null && nVar == null) ? false : true;
    }

    private final void h(n nVar, r rVar) {
        m i11;
        if (nVar != null && rVar != null && (i11 = rVar.i()) != null) {
            i11.d(nVar);
        }
        this.f22320i = null;
        this.f22321j = null;
    }

    @Override // Yf.d.a
    public final boolean a(@NotNull Yf.d detector) {
        n nVar;
        Intrinsics.checkNotNullParameter(detector, "detector");
        Iterator it = this.f22318g.iterator();
        while (true) {
            boolean z11 = false;
            if (!it.hasNext()) {
                return false;
            }
            r rVar = (r) it.next();
            if (detector.j() == 1) {
                PointF i11 = detector.i();
                Intrinsics.checkNotNullExpressionValue(i11, "getFocalPoint(...)");
                List<Feature> O11 = this.f22312a.O(i11, rVar.j());
                Intrinsics.checkNotNullExpressionValue(O11, "queryRenderedFeatures(...)");
                Iterator<Feature> it2 = O11.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        nVar = null;
                        break;
                    }
                    nVar = rVar.k(it2.next().getProperty("symbol-id").getAsLong());
                    if (nVar != null) {
                        m i12 = rVar.i();
                        if (i12 != null ? i12.b(nVar, i11) : true) {
                            break;
                        }
                    }
                }
                if (nVar == null) {
                    continue;
                } else {
                    if (nVar.g()) {
                        m i13 = rVar.i();
                        if (i13 != null) {
                            i13.a(nVar);
                        }
                        this.f22320i = nVar;
                        this.f22321j = rVar;
                        z11 = true;
                    }
                    if (z11) {
                        return true;
                    }
                }
            }
        }
    }

    @Override // Yf.d.a
    public final void b(@NotNull Yf.d detector) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        h(this.f22320i, this.f22321j);
    }

    @Override // Yf.d.a
    public final boolean c(@NotNull Yf.d detector, float f7, float f11) {
        m i11;
        Intrinsics.checkNotNullParameter(detector, "detector");
        n nVar = this.f22320i;
        if (nVar != null && (detector.j() > 1 || !nVar.g())) {
            h(nVar, this.f22321j);
            return true;
        }
        if (nVar == null) {
            return false;
        }
        Yf.c v11 = detector.v();
        float b11 = v11.b();
        float f12 = this.f22314c;
        float c11 = v11.c();
        float f13 = this.f22315d;
        PointF pointF = new PointF(b11 - f12, c11 - f13);
        float f14 = pointF.x;
        if (f14 >= 0.0f) {
            float f15 = pointF.y;
            if (f15 >= 0.0f && f14 <= this.f22316e && f15 <= this.f22317f) {
                Projection t2 = this.f22312a.t();
                Intrinsics.checkNotNullExpressionValue(t2, "getProjection(...)");
                LatLng b12 = t2.b(new PointF(v11.b() - f12, v11.c() - f13));
                Intrinsics.checkNotNullExpressionValue(b12, "fromScreenLocation(...)");
                Point fromLngLat = (b12.getLatitude() > 85.05112877980659d || b12.getLatitude() < -85.05112877980659d) ? null : Point.fromLngLat(b12.getLongitude(), b12.getLatitude());
                if (fromLngLat == null) {
                    return false;
                }
                n a11 = n.a(nVar, new LatLng(fromLngLat.latitude(), fromLngLat.longitude()), null, null, 0.0f, null, null, 0.0f, 0.0f, 0.0f, false, 2045);
                this.f22320i = a11;
                r rVar = this.f22321j;
                if (rVar != null) {
                    rVar.q(a11);
                }
                r rVar2 = this.f22321j;
                if (rVar2 != null && (i11 = rVar2.i()) != null) {
                    i11.c(a11);
                }
                return true;
            }
        }
        h(nVar, this.f22321j);
        return true;
    }

    public final void e(@NotNull r symbolManager) {
        Intrinsics.checkNotNullParameter(symbolManager, "symbolManager");
        String h11 = symbolManager.h();
        HashMap<String, r> hashMap = this.f22319h;
        LinkedList linkedList = this.f22318g;
        if (h11 != null) {
            linkedList.add(C7714v.S(hashMap.get(symbolManager.h()), linkedList) + 1, symbolManager);
        } else if (symbolManager.g() != null) {
            linkedList.add(C7714v.S(hashMap.get(symbolManager.g()), linkedList), symbolManager);
        } else {
            linkedList.add(0, symbolManager);
        }
        hashMap.put(symbolManager.j(), symbolManager);
    }

    public final void f(n nVar) {
        n nVar2 = this.f22320i;
        if (nVar == nVar2) {
            h(nVar2, this.f22321j);
        }
    }

    public final void g(@NotNull r symbolManager) {
        Intrinsics.checkNotNullParameter(symbolManager, "symbolManager");
        this.f22318g.remove(symbolManager);
        this.f22319h.remove(symbolManager.j());
    }
}
