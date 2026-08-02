package We0;

import Ue0.v;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.MapObject;
import com.yandex.mapkit.map.MapObjectDragListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import we0.m;
import we0.u;

/* loaded from: classes3.dex */
public final class c implements MapObjectDragListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ v f33828a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f33829b;

    c(v vVar, f fVar) {
        this.f33828a = vVar;
        this.f33829b = fVar;
    }

    @Override // com.yandex.mapkit.map.MapObjectDragListener
    public final void onMapObjectDrag(MapObject mapObject, Point point) {
        Intrinsics.checkNotNullParameter(mapObject, "mapObject");
        Intrinsics.checkNotNullParameter(point, "point");
        m mVar = new m(point.getLatitude(), point.getLongitude());
        v vVar = this.f33828a;
        this.f33829b.insertPlacemark(u.a(vVar.c(), mVar, null, null, null, 1022));
        Function1<m, Unit> h11 = vVar.c().h();
        if (h11 != null) {
            h11.invoke(mVar);
        }
    }

    @Override // com.yandex.mapkit.map.MapObjectDragListener
    public final void onMapObjectDragEnd(MapObject p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        Function0<Unit> g10 = this.f33828a.c().g();
        if (g10 != null) {
            g10.invoke();
        }
    }

    @Override // com.yandex.mapkit.map.MapObjectDragListener
    public final void onMapObjectDragStart(MapObject p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        Function0<Unit> i11 = this.f33828a.c().i();
        if (i11 != null) {
            i11.invoke();
        }
    }
}
