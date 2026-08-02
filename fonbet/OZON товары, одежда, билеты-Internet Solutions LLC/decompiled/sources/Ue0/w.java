package Ue0;

import com.yandex.mapkit.map.PolygonMapObject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final we0.v f27713a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final PolygonMapObject f27714b;

    public w(@NotNull we0.v model, @NotNull PolygonMapObject yandexPolygonObject) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(yandexPolygonObject, "yandexPolygonObject");
        this.f27713a = model;
        this.f27714b = yandexPolygonObject;
    }

    public static w a(w wVar, we0.v model) {
        Intrinsics.checkNotNullParameter(model, "model");
        PolygonMapObject yandexPolygonObject = wVar.f27714b;
        Intrinsics.checkNotNullParameter(yandexPolygonObject, "yandexPolygonObject");
        return new w(model, yandexPolygonObject);
    }

    @NotNull
    public final we0.v b() {
        return this.f27713a;
    }

    @NotNull
    public final PolygonMapObject c() {
        return this.f27714b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Intrinsics.d(this.f27713a, wVar.f27713a) && Intrinsics.d(this.f27714b, wVar.f27714b);
    }

    public final int hashCode() {
        return this.f27714b.hashCode() + (this.f27713a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "YandexPolygon(model=" + this.f27713a + ", yandexPolygonObject=" + this.f27714b + ")";
    }
}
