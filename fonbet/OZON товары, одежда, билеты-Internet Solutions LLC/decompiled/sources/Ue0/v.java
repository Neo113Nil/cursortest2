package Ue0;

import com.yandex.mapkit.map.MapObjectDragListener;
import com.yandex.mapkit.map.MapObjectTapListener;
import com.yandex.mapkit.map.PlacemarkMapObject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final we0.u f27709a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final PlacemarkMapObject f27710b;

    /* renamed from: c, reason: collision with root package name */
    private We0.a f27711c;

    /* renamed from: d, reason: collision with root package name */
    private We0.c f27712d;

    public v(@NotNull we0.u model, @NotNull PlacemarkMapObject yandexMarker, We0.a aVar, We0.c cVar) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(yandexMarker, "yandexMarker");
        this.f27709a = model;
        this.f27710b = yandexMarker;
        this.f27711c = aVar;
        this.f27712d = cVar;
    }

    public static v a(v vVar, we0.u model) {
        PlacemarkMapObject yandexMarker = vVar.f27710b;
        We0.a aVar = vVar.f27711c;
        We0.c cVar = vVar.f27712d;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(yandexMarker, "yandexMarker");
        return new v(model, yandexMarker, aVar, cVar);
    }

    public final MapObjectDragListener b() {
        return this.f27712d;
    }

    @NotNull
    public final we0.u c() {
        return this.f27709a;
    }

    public final MapObjectTapListener d() {
        return this.f27711c;
    }

    @NotNull
    public final PlacemarkMapObject e() {
        return this.f27710b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Intrinsics.d(this.f27709a, vVar.f27709a) && this.f27710b.equals(vVar.f27710b) && Intrinsics.d(this.f27711c, vVar.f27711c) && Intrinsics.d(this.f27712d, vVar.f27712d);
    }

    public final void f(We0.c cVar) {
        this.f27712d = cVar;
    }

    public final void g(We0.a aVar) {
        this.f27711c = aVar;
    }

    public final int hashCode() {
        int hashCode = (this.f27710b.hashCode() + (this.f27709a.hashCode() * 31)) * 31;
        We0.a aVar = this.f27711c;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        We0.c cVar = this.f27712d;
        return hashCode2 + (cVar != null ? cVar.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "YandexPlacemark(model=" + this.f27709a + ", yandexMarker=" + this.f27710b + ", tapListener=" + this.f27711c + ", dragListener=" + this.f27712d + ")";
    }
}
