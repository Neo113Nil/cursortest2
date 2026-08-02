package We0;

import De.C2862e;
import Sc.o;
import Ue0.v;
import ce0.InterfaceC5817a;
import com.yandex.mapkit.Animation;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.Callback;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.mapkit.map.MapObject;
import com.yandex.mapkit.map.MapObjectCollection;
import com.yandex.mapkit.map.MapObjectTapListener;
import com.yandex.mapkit.map.PlacemarkAnimation;
import com.yandex.mapkit.map.PlacemarkMapObject;
import com.yandex.mapkit.map.RootMapObjectCollection;
import com.yandex.mapkit.map.RotationType;
import com.yandex.runtime.image.ImageProvider;
import com.yandex.runtime.ui_view.ViewProvider;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import we0.InterfaceC10542A;
import we0.InterfaceC10545a;
import we0.m;
import we0.u;
import we0.z;
import xe0.AbstractC10765d;
import xe0.j;

/* loaded from: classes3.dex */
public final class f extends AbstractC10765d {

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final RootMapObjectCollection f33832h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final Ve0.a f33833i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final j f33834j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final HashMap<String, v> f33835k;

    static final class a extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Pair<PlacemarkMapObject, PlacemarkAnimation> f33836b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Pair<? extends PlacemarkMapObject, ? extends PlacemarkAnimation> pair) {
            super(0);
            this.f33836b = pair;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f33836b.f().play();
            return Unit.f71690a;
        }
    }

    static final class b extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Pair<PlacemarkMapObject, PlacemarkAnimation> f33837b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Pair<? extends PlacemarkMapObject, ? extends PlacemarkAnimation> pair) {
            super(0);
            this.f33837b = pair;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f33837b.f().stop();
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@NotNull RootMapObjectCollection mapObjects, @NotNull Ve0.a yandexAnimationLoader, @NotNull j pinSelectSynchronizer, boolean z11, @NotNull InterfaceC5817a cameraController, @NotNull C2862e coroutineScope) {
        super(z11, pinSelectSynchronizer, cameraController, coroutineScope);
        Intrinsics.checkNotNullParameter(mapObjects, "mapObjects");
        Intrinsics.checkNotNullParameter(yandexAnimationLoader, "yandexAnimationLoader");
        Intrinsics.checkNotNullParameter(pinSelectSynchronizer, "pinSelectSynchronizer");
        Intrinsics.checkNotNullParameter(cameraController, "cameraController");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f33832h = mapObjects;
        this.f33833i = yandexAnimationLoader;
        this.f33834j = pinSelectSynchronizer;
        this.f33835k = new HashMap<>();
    }

    private static IconStyle v(u uVar) {
        RotationType rotationType = uVar.d().g() ? RotationType.ROTATE : RotationType.NO_ROTATION;
        uVar.d().getClass();
        InterfaceC10542A d11 = uVar.d().d();
        return new IconStyle(uVar.d().e(), rotationType, uVar.getZIndex(), Boolean.valueOf(uVar.d().g()), Boolean.valueOf(uVar.d().h()), (d11 instanceof InterfaceC10542A.a ? (InterfaceC10542A.a) d11 : null) != null ? Float.valueOf(1.0f) : null, null);
    }

    private static void w(PlacemarkMapObject placemarkMapObject, u uVar) {
        placemarkMapObject.setOpacity(uVar.d().b());
        placemarkMapObject.setDraggable(false);
        placemarkMapObject.setDirection(uVar.d().c());
        placemarkMapObject.setUserData(uVar.k());
        placemarkMapObject.setZIndex(uVar.d().f());
        placemarkMapObject.setVisible(uVar.d().h());
    }

    private final void x(v vVar, u uVar, boolean z11) {
        u c11 = vVar.c();
        Point geometry = vVar.e().getGeometry();
        Intrinsics.checkNotNullExpressionValue(geometry, "getGeometry(...)");
        m c12 = uVar.c();
        if (geometry.getLongitude() != c12.getLongitude() || geometry.getLatitude() != c12.getLatitude()) {
            PlacemarkMapObject e11 = vVar.e();
            m c13 = uVar.c();
            e11.setGeometry(new Point(c13.getLatitude(), c13.getLongitude()));
        }
        if (!Intrinsics.d(c11.d().d(), uVar.d().d()) || z11) {
            InterfaceC10542A d11 = uVar.d().d();
            if (!Intrinsics.d(d11, InterfaceC10542A.d.f104404a)) {
                if (d11 instanceof InterfaceC10542A.c) {
                    vVar.e().setIcon(ImageProvider.fromBitmap(((InterfaceC10542A.c) uVar.d().d()).a(), true, ((InterfaceC10542A.c) uVar.d().d()).b()), v(uVar));
                } else if (d11 instanceof InterfaceC10542A.b) {
                    vVar.e().setView(new ViewProvider(((InterfaceC10542A.b) uVar.d().d()).a().invoke()), v(uVar));
                } else {
                    if (!(d11 instanceof InterfaceC10542A.a)) {
                        throw new o();
                    }
                    PlacemarkMapObject e12 = vVar.e();
                    InterfaceC10545a a11 = ((InterfaceC10542A.a) uVar.d().d()).a();
                    IconStyle v11 = v(uVar);
                    PlacemarkAnimation useAnimation = e12.useAnimation();
                    useAnimation.setIcon(this.f33833i.c(a11), v11);
                    Intrinsics.checkNotNullExpressionValue(useAnimation, "apply(...)");
                    useAnimation.play();
                    Pair pair = new Pair(e12, useAnimation);
                    InterfaceC10545a a12 = ((InterfaceC10542A.a) uVar.d().d()).a();
                    a12.a(new a(pair));
                    a12.b(new b(pair));
                }
            }
        }
        w(vVar.e(), uVar);
    }

    @Override // xe0.InterfaceC10766e
    @NotNull
    public final List<u> a() {
        Collection<v> values = this.f33835k.values();
        Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
        Collection<v> collection = values;
        ArrayList arrayList = new ArrayList(C7714v.z(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((v) it.next()).c());
        }
        return arrayList;
    }

    @Override // xe0.InterfaceC10766e
    public final void b(long j11, @NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        HashMap<String, v> hashMap = this.f33835k;
        v vVar = hashMap.get(id2);
        if (vVar == null) {
            return;
        }
        hashMap.remove(vVar.c().e());
        vVar.e().setDragListener(null);
        MapObjectTapListener d11 = vVar.d();
        if (d11 != null) {
            vVar.e().removeTapListener(d11);
        }
        if (vVar.b() != null) {
            vVar.e().setDragListener(null);
        }
        vVar.f(null);
        vVar.g(null);
        RootMapObjectCollection rootMapObjectCollection = this.f33832h;
        if (j11 == 0) {
            rootMapObjectCollection.remove(vVar.e());
            return;
        }
        final WeakReference weakReference = new WeakReference(rootMapObjectCollection);
        final WeakReference weakReference2 = new WeakReference(vVar.e());
        vVar.e().setVisible(false, new Animation(Animation.Type.SMOOTH, j11 / 1000.0f), new Callback() { // from class: We0.b
            @Override // com.yandex.mapkit.map.Callback
            public final void onTaskFinished() {
                MapObjectCollection mapObjectCollection;
                PlacemarkMapObject placemarkMapObject = (PlacemarkMapObject) weakReference2.get();
                if (placemarkMapObject == null || (mapObjectCollection = (MapObjectCollection) weakReference.get()) == null) {
                    return;
                }
                mapObjectCollection.remove(placemarkMapObject);
            }
        });
        vVar.e().useAnimation().play();
    }

    @Override // xe0.InterfaceC10766e
    public final void c(long j11, @NotNull List placemarks) {
        Intrinsics.checkNotNullParameter(placemarks, "placemarks");
        Iterator it = placemarks.iterator();
        while (it.hasNext()) {
            m((u) it.next(), j11);
        }
    }

    @Override // xe0.InterfaceC10766e
    public final u getPlacemarkById(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        try {
            v vVar = this.f33835k.get(id2);
            if (vVar != null) {
                return vVar.c();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    @Override // xe0.InterfaceC10766e
    public final void j(long j11, @NotNull List ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        Iterator it = ids.iterator();
        while (it.hasNext()) {
            b(j11, (String) it.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [We0.a, com.yandex.mapkit.map.MapObjectTapListener] */
    @Override // xe0.InterfaceC10766e
    public final void m(@NotNull u placemark, long j11) {
        PlacemarkMapObject placemarkMapObject;
        Intrinsics.checkNotNullParameter(placemark, "placemark");
        HashMap<String, v> hashMap = this.f33835k;
        v vVar = hashMap.get(placemark.e());
        if (vVar != null) {
            x(vVar, placemark, false);
            hashMap.put(placemark.e(), v.a(vVar, placemark));
            return;
        }
        m c11 = placemark.c();
        Point point = new Point(c11.getLatitude(), c11.getLongitude());
        z c12 = this.f33834j.c(placemark);
        InterfaceC10542A d11 = c12.d();
        boolean z11 = d11 instanceof InterfaceC10542A.d;
        RootMapObjectCollection rootMapObjectCollection = this.f33832h;
        if (z11) {
            placemarkMapObject = rootMapObjectCollection.addPlacemark(point);
        } else if (d11 instanceof InterfaceC10542A.c) {
            placemarkMapObject = rootMapObjectCollection.addPlacemark(point, ImageProvider.fromBitmap(((InterfaceC10542A.c) c12.d()).a(), true, ((InterfaceC10542A.c) c12.d()).b()), v(placemark));
        } else if (d11 instanceof InterfaceC10542A.b) {
            placemarkMapObject = rootMapObjectCollection.addPlacemark(point, new ViewProvider(((InterfaceC10542A.b) c12.d()).a().invoke()), v(placemark));
        } else {
            if (!(d11 instanceof InterfaceC10542A.a)) {
                throw new o();
            }
            PlacemarkMapObject addPlacemark = rootMapObjectCollection.addPlacemark(point);
            Intrinsics.checkNotNullExpressionValue(addPlacemark, "addPlacemark(...)");
            InterfaceC10545a a11 = ((InterfaceC10542A.a) c12.d()).a();
            IconStyle v11 = v(placemark);
            PlacemarkAnimation useAnimation = addPlacemark.useAnimation();
            useAnimation.setIcon(this.f33833i.c(a11), v11);
            Intrinsics.checkNotNullExpressionValue(useAnimation, "apply(...)");
            useAnimation.play();
            Pair pair = new Pair(addPlacemark, useAnimation);
            InterfaceC10545a a12 = ((InterfaceC10542A.a) c12.d()).a();
            a12.a(new d(pair));
            a12.b(new e(pair));
            placemarkMapObject = (PlacemarkMapObject) pair.e();
        }
        Intrinsics.f(placemarkMapObject);
        final v vVar2 = new v(placemark, placemarkMapObject, null, null);
        ?? r52 = new MapObjectTapListener() { // from class: We0.a
            @Override // com.yandex.mapkit.map.MapObjectTapListener
            public final boolean onMapObjectTap(MapObject mapObject, Point point2) {
                Intrinsics.checkNotNullParameter(mapObject, "<unused var>");
                Intrinsics.checkNotNullParameter(point2, "<unused var>");
                this.u(vVar2.c());
                return true;
            }
        };
        vVar2.e().addTapListener(r52);
        vVar2.g(r52);
        c cVar = new c(vVar2, this);
        vVar2.e().setDragListener(cVar);
        vVar2.f(cVar);
        w(vVar2.e(), placemark);
        if (j11 != 0) {
            placemarkMapObject.setVisible(false);
            placemarkMapObject.setVisible(true, new Animation(Animation.Type.SMOOTH, j11 / 1000.0f), null);
            placemarkMapObject.useAnimation().play();
        }
        hashMap.put(placemark.e(), vVar2);
    }

    @Override // xe0.AbstractC10765d
    public final void s(@NotNull String id2, @NotNull z displayOptions) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(displayOptions, "displayOptions");
        v vVar = this.f33835k.get(id2);
        if (vVar == null) {
            return;
        }
        x(vVar, u.a(vVar.c(), null, displayOptions, null, null, 1021), true);
    }
}
