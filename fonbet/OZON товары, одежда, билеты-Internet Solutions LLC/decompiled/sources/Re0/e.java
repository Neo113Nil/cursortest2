package Re0;

import Ae.C2399j;
import Ae.I0;
import Ae.InterfaceC2395h;
import Ae.M0;
import De.C2862e;
import De.s;
import Le0.w;
import Re0.f;
import Sc.o;
import android.content.Context;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.maplibre.android.camera.CameraPosition;
import org.maplibre.android.geometry.LatLng;
import org.maplibre.android.maps.MapLibreMap;
import org.maplibre.android.maps.Projection;
import we0.C10551g;
import we0.EnumC10550f;
import we0.InterfaceC10542A;
import we0.h;
import we0.m;
import we0.u;
import we0.z;
import xe.B0;
import xe.C10720e0;
import xe.H0;
import xe.N;
import xe.X0;
import xe0.j;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final w f25047a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final MapLibreMap f25048b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h<h> f25049c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final j f25050d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function1<u, Unit> f25051e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C2862e f25052f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final HashMap<String, ru.ozon.mapsdk.libre.placemark.view.b<?>> f25053g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final M0<h> f25054h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f25055i;

    public e(@NotNull w map, @NotNull MapLibreMap mapLibreMap, @NotNull InterfaceC2395h cameraPositionUpdateFlow, @NotNull j selectionSynchronizer, @NotNull Function1 processClickedMapPlacemarkCallback) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(mapLibreMap, "mapLibreMap");
        Intrinsics.checkNotNullParameter(cameraPositionUpdateFlow, "cameraPositionUpdateFlow");
        Intrinsics.checkNotNullParameter(selectionSynchronizer, "selectionSynchronizer");
        Intrinsics.checkNotNullParameter(processClickedMapPlacemarkCallback, "processClickedMapPlacemarkCallback");
        this.f25047a = map;
        this.f25048b = mapLibreMap;
        this.f25049c = cameraPositionUpdateFlow;
        this.f25050d = selectionSynchronizer;
        this.f25051e = processClickedMapPlacemarkCallback;
        B0 b11 = X0.b();
        C10720e0 c10720e0 = C10720e0.f105451a;
        C2862e a11 = N.a(CoroutineContext.Element.a.d(s.f6650a, (H0) b11));
        this.f25052f = a11;
        this.f25053g = new HashMap<>();
        int i11 = I0.f818a;
        I0 d11 = I0.a.d();
        CameraPosition k11 = mapLibreMap.k();
        Intrinsics.checkNotNullExpressionValue(k11, "getCameraPosition(...)");
        LatLng latLng = k11.target;
        double latitude = latLng != null ? latLng.getLatitude() : 0.0d;
        LatLng latLng2 = k11.target;
        this.f25054h = C2399j.M(cameraPositionUpdateFlow, a11, d11, new h(new C10551g(new m(latitude, latLng2 != null ? latLng2.getLongitude() : 0.0d), (float) k11.zoom, (float) k11.bearing, (float) k11.tilt), true, EnumC10550f.APPLICATION));
    }

    private final ru.ozon.mapsdk.libre.placemark.view.b<?> c(u uVar) {
        z c11 = this.f25050d.c(uVar);
        InterfaceC10542A d11 = c11.d();
        boolean z11 = d11 instanceof InterfaceC10542A.a;
        MapLibreMap mapLibreMap = this.f25048b;
        Function1<u, Unit> placemarkClickListener = this.f25051e;
        w wVar = this.f25047a;
        if (z11) {
            Context context = wVar.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            u a11 = u.a(uVar, null, c11, null, null, 1021);
            a11.m(uVar.b());
            Projection t2 = mapLibreMap.t();
            Intrinsics.checkNotNullExpressionValue(t2, "getProjection(...)");
            return new a(context, a11, t2, (InterfaceC10542A.a) d11, placemarkClickListener);
        }
        if (d11 instanceof InterfaceC10542A.b) {
            Context context2 = wVar.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            u mapPlacemark = u.a(uVar, null, c11, null, null, 1021);
            mapPlacemark.m(uVar.b());
            InterfaceC10542A.b content = (InterfaceC10542A.b) d11;
            Projection projection = mapLibreMap.t();
            Intrinsics.checkNotNullExpressionValue(projection, "getProjection(...)");
            Intrinsics.checkNotNullParameter(context2, "context");
            Intrinsics.checkNotNullParameter(mapPlacemark, "mapPlacemark");
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(projection, "projection");
            Intrinsics.checkNotNullParameter(placemarkClickListener, "placemarkClickListener");
            return new f(f.a.a(context2, f.a.b(content.a().invoke())), mapPlacemark, projection, placemarkClickListener);
        }
        if (!(d11 instanceof InterfaceC10542A.c)) {
            if (Intrinsics.d(d11, InterfaceC10542A.d.f104404a)) {
                return null;
            }
            throw new o();
        }
        Context context3 = wVar.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        u mapPlacemark2 = u.a(uVar, null, c11, null, null, 1021);
        mapPlacemark2.m(uVar.b());
        InterfaceC10542A.c content2 = (InterfaceC10542A.c) d11;
        Projection projection2 = mapLibreMap.t();
        Intrinsics.checkNotNullExpressionValue(projection2, "getProjection(...)");
        Intrinsics.checkNotNullParameter(context3, "context");
        Intrinsics.checkNotNullParameter(mapPlacemark2, "mapPlacemark");
        Intrinsics.checkNotNullParameter(content2, "content");
        Intrinsics.checkNotNullParameter(projection2, "projection");
        Intrinsics.checkNotNullParameter(placemarkClickListener, "placemarkClickListener");
        return new f(f.a.a(context3, content2.a()), mapPlacemark2, projection2, placemarkClickListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View] */
    public final void a(@NotNull u placemark, @NotNull Function1<? super ru.ozon.mapsdk.libre.placemark.view.b<?>, Unit> onMarkerAdded, @NotNull Function1<? super ru.ozon.mapsdk.libre.placemark.view.b<?>, Unit> onMarkerUpdated) {
        Intrinsics.checkNotNullParameter(placemark, "placemark");
        Intrinsics.checkNotNullParameter(onMarkerAdded, "onMarkerAdded");
        Intrinsics.checkNotNullParameter(onMarkerUpdated, "onMarkerUpdated");
        boolean z11 = this.f25055i;
        w wVar = this.f25047a;
        if (!z11) {
            wVar.setMotionEventSplittingEnabled(false);
            this.f25055i = true;
        }
        if (wVar.isDestroyed()) {
            return;
        }
        HashMap<String, ru.ozon.mapsdk.libre.placemark.view.b<?>> hashMap = this.f25053g;
        ru.ozon.mapsdk.libre.placemark.view.b<?> bVar = hashMap.get(placemark.e());
        M0<h> m02 = this.f25054h;
        C2862e c2862e = this.f25052f;
        if (bVar == null) {
            ru.ozon.mapsdk.libre.placemark.view.b<?> c11 = c(placemark);
            if (c11 == null) {
                return;
            }
            c11.k(m02, c2862e);
            String e11 = placemark.e();
            wVar.addView(c11.j());
            hashMap.put(e11, c11);
            onMarkerAdded.invoke(c11);
            return;
        }
        if (Intrinsics.d(bVar.i().d().d(), placemark.d().d())) {
            bVar.q(placemark);
        } else {
            f(bVar);
            ru.ozon.mapsdk.libre.placemark.view.b<?> c12 = c(placemark);
            if (c12 == null) {
                return;
            }
            c12.k(m02, c2862e);
            String e12 = placemark.e();
            wVar.addView(c12.j());
            hashMap.put(e12, c12);
        }
        onMarkerUpdated.invoke(bVar);
    }

    public final boolean b(@NotNull String placemarkId) {
        Intrinsics.checkNotNullParameter(placemarkId, "placemarkId");
        return this.f25053g.containsKey(placemarkId);
    }

    public final void d() {
        HashMap<String, ru.ozon.mapsdk.libre.placemark.view.b<?>> hashMap = this.f25053g;
        Collection<ru.ozon.mapsdk.libre.placemark.view.b<?>> values = hashMap.values();
        Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            ((ru.ozon.mapsdk.libre.placemark.view.b) it.next()).l();
        }
        hashMap.clear();
        this.f25047a.setMotionEventSplittingEnabled(true);
    }

    public final ru.ozon.mapsdk.libre.placemark.view.b<?> e(@NotNull String placemarkId) {
        Intrinsics.checkNotNullParameter(placemarkId, "placemarkId");
        return this.f25053g.remove(placemarkId);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View] */
    public final void f(@NotNull ru.ozon.mapsdk.libre.placemark.view.b<?> libreMarker) {
        Intrinsics.checkNotNullParameter(libreMarker, "libreMarker");
        libreMarker.l();
        this.f25047a.removeView(libreMarker.j());
    }
}
