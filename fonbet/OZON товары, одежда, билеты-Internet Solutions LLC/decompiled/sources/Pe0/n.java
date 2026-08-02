package Pe0;

import android.graphics.PointF;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.maplibre.android.geometry.LatLng;
import org.maplibre.geojson.Feature;
import org.maplibre.geojson.Point;

/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final long f22399a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final LatLng f22400b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f22401c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f22402d;

    /* renamed from: e, reason: collision with root package name */
    private final float f22403e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final PointF f22404f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final String f22405g;

    /* renamed from: h, reason: collision with root package name */
    private final float f22406h;

    /* renamed from: i, reason: collision with root package name */
    private final float f22407i;

    /* renamed from: j, reason: collision with root package name */
    private final float f22408j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f22409k;

    public n(long j11, @NotNull LatLng latLng, @NotNull String iconImage, Object obj, float f7, @NotNull PointF iconOffset, @NotNull String iconAnchor, float f11, float f12, float f13, boolean z11) {
        Intrinsics.checkNotNullParameter(latLng, "latLng");
        Intrinsics.checkNotNullParameter(iconImage, "iconImage");
        Intrinsics.checkNotNullParameter(iconOffset, "iconOffset");
        Intrinsics.checkNotNullParameter(iconAnchor, "iconAnchor");
        this.f22399a = j11;
        this.f22400b = latLng;
        this.f22401c = iconImage;
        this.f22402d = obj;
        this.f22403e = f7;
        this.f22404f = iconOffset;
        this.f22405g = iconAnchor;
        this.f22406h = f11;
        this.f22407i = f12;
        this.f22408j = f13;
        this.f22409k = z11;
    }

    public static n a(n nVar, LatLng latLng, String str, String str2, float f7, PointF pointF, String str3, float f11, float f12, float f13, boolean z11, int i11) {
        long j11 = nVar.f22399a;
        if ((i11 & 2) != 0) {
            latLng = nVar.f22400b;
        }
        LatLng latLng2 = latLng;
        String iconImage = (i11 & 4) != 0 ? nVar.f22401c : str;
        Object obj = (i11 & 8) != 0 ? nVar.f22402d : str2;
        float f14 = (i11 & 16) != 0 ? nVar.f22403e : f7;
        PointF iconOffset = (i11 & 32) != 0 ? nVar.f22404f : pointF;
        String iconAnchor = (i11 & 64) != 0 ? nVar.f22405g : str3;
        float f15 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? nVar.f22406h : f11;
        float f16 = (i11 & 256) != 0 ? nVar.f22407i : f12;
        float f17 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? nVar.f22408j : f13;
        boolean z12 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? nVar.f22409k : z11;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(latLng2, "latLng");
        Intrinsics.checkNotNullParameter(iconImage, "iconImage");
        Intrinsics.checkNotNullParameter(iconOffset, "iconOffset");
        Intrinsics.checkNotNullParameter(iconAnchor, "iconAnchor");
        return new n(j11, latLng2, iconImage, obj, f14, iconOffset, iconAnchor, f15, f16, f17, z12);
    }

    public final Object b() {
        return this.f22402d;
    }

    @NotNull
    public final String c() {
        return this.f22401c;
    }

    public final float d() {
        return this.f22403e;
    }

    public final long e() {
        return this.f22399a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f22399a == nVar.f22399a && Intrinsics.d(this.f22400b, nVar.f22400b) && Intrinsics.d(this.f22401c, nVar.f22401c) && Intrinsics.d(this.f22402d, nVar.f22402d) && Float.compare(this.f22403e, nVar.f22403e) == 0 && Intrinsics.d(this.f22404f, nVar.f22404f) && Intrinsics.d(this.f22405g, nVar.f22405g) && Float.compare(this.f22406h, nVar.f22406h) == 0 && Float.compare(this.f22407i, nVar.f22407i) == 0 && Float.compare(this.f22408j, nVar.f22408j) == 0 && this.f22409k == nVar.f22409k;
    }

    @NotNull
    public final LatLng f() {
        return this.f22400b;
    }

    public final boolean g() {
        return this.f22409k;
    }

    @NotNull
    public final Feature h() {
        LatLng latLng = this.f22400b;
        Point fromLngLat = Point.fromLngLat(latLng.getLongitude(), latLng.getLatitude());
        Intrinsics.checkNotNullExpressionValue(fromLngLat, "fromLngLat(...)");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("symbol-id", Long.valueOf(this.f22399a));
        jsonObject.addProperty("icon-image", this.f22401c);
        jsonObject.addProperty("icon-size", Float.valueOf(this.f22403e));
        JsonArray jsonArray = new JsonArray();
        PointF pointF = this.f22404f;
        jsonArray.add(Float.valueOf(pointF.x));
        jsonArray.add(Float.valueOf(pointF.y));
        Unit unit = Unit.f71690a;
        jsonObject.add("icon-offset", jsonArray);
        jsonObject.addProperty("icon-anchor", this.f22405g);
        jsonObject.addProperty("icon-rotate", Float.valueOf(this.f22406h));
        jsonObject.addProperty("icon-opacity", Float.valueOf(this.f22407i));
        jsonObject.addProperty("symbol-sort-key", Float.valueOf(this.f22408j));
        Feature fromGeometry = Feature.fromGeometry(fromLngLat, jsonObject);
        Intrinsics.checkNotNullExpressionValue(fromGeometry, "fromGeometry(...)");
        return fromGeometry;
    }

    public final int hashCode() {
        int a11 = G.g.a((this.f22400b.hashCode() + (Long.hashCode(this.f22399a) * 31)) * 31, 31, this.f22401c);
        Object obj = this.f22402d;
        return Boolean.hashCode(this.f22409k) + Pk0.b.a(this.f22408j, Pk0.b.a(this.f22407i, Pk0.b.a(this.f22406h, G.g.a((this.f22404f.hashCode() + Pk0.b.a(this.f22403e, (a11 + (obj == null ? 0 : obj.hashCode())) * 31, 31)) * 31, 31, this.f22405g), 31), 31), 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Symbol(id=");
        sb2.append(this.f22399a);
        sb2.append(", latLng=");
        sb2.append(this.f22400b);
        sb2.append(", iconImage=");
        sb2.append(this.f22401c);
        sb2.append(", data=");
        sb2.append(this.f22402d);
        sb2.append(", iconSize=");
        sb2.append(this.f22403e);
        sb2.append(", iconOffset=");
        sb2.append(this.f22404f);
        sb2.append(", iconAnchor=");
        sb2.append(this.f22405g);
        sb2.append(", iconRotate=");
        sb2.append(this.f22406h);
        sb2.append(", iconOpacity=");
        sb2.append(this.f22407i);
        sb2.append(", symbolSortKey=");
        sb2.append(this.f22408j);
        sb2.append(", isDraggable=");
        return Pk0.a.a(")", sb2, this.f22409k);
    }
}
