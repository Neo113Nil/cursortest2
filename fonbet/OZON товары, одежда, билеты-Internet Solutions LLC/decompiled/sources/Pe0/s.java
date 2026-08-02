package Pe0;

import android.graphics.PointF;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.maplibre.android.geometry.LatLng;

/* loaded from: classes3.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final LatLng f22436a;

    /* renamed from: b, reason: collision with root package name */
    private final String f22437b;

    /* renamed from: c, reason: collision with root package name */
    private final String f22438c;

    /* renamed from: d, reason: collision with root package name */
    private final Float f22439d;

    /* renamed from: e, reason: collision with root package name */
    private final PointF f22440e;

    /* renamed from: f, reason: collision with root package name */
    private final String f22441f;

    /* renamed from: g, reason: collision with root package name */
    private final Float f22442g;

    /* renamed from: h, reason: collision with root package name */
    private final Float f22443h;

    /* renamed from: i, reason: collision with root package name */
    private final Float f22444i;

    /* renamed from: j, reason: collision with root package name */
    private final Boolean f22445j;

    public s(@NotNull LatLng latLng, String str, String str2, Float f7, PointF pointF, String str3, Float f11, Float f12, Float f13, Boolean bool) {
        Intrinsics.checkNotNullParameter(latLng, "latLng");
        this.f22436a = latLng;
        this.f22437b = str;
        this.f22438c = str2;
        this.f22439d = f7;
        this.f22440e = pointF;
        this.f22441f = str3;
        this.f22442g = f11;
        this.f22443h = f12;
        this.f22444i = f13;
        this.f22445j = bool;
    }

    public static s b(s sVar, Float f7) {
        LatLng latLng = sVar.f22436a;
        String str = sVar.f22437b;
        String str2 = sVar.f22438c;
        PointF pointF = sVar.f22440e;
        String str3 = sVar.f22441f;
        Float f11 = sVar.f22442g;
        Float f12 = sVar.f22443h;
        Float f13 = sVar.f22444i;
        Boolean bool = sVar.f22445j;
        sVar.getClass();
        Intrinsics.checkNotNullParameter(latLng, "latLng");
        return new s(latLng, str, str2, f7, pointF, str3, f11, f12, f13, bool);
    }

    @NotNull
    public final n a(long j11) {
        String str = this.f22438c;
        Intrinsics.f(str);
        return new n(j11, this.f22436a, str, this.f22437b, this.f22439d.floatValue(), this.f22440e, this.f22441f, this.f22442g.floatValue(), this.f22443h.floatValue(), this.f22444i.floatValue(), this.f22445j.booleanValue());
    }

    public final Float c() {
        return this.f22439d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f22436a.equals(sVar.f22436a) && Intrinsics.d(this.f22437b, sVar.f22437b) && Intrinsics.d(this.f22438c, sVar.f22438c) && this.f22439d.equals(sVar.f22439d) && this.f22440e.equals(sVar.f22440e) && this.f22441f.equals(sVar.f22441f) && this.f22442g.equals(sVar.f22442g) && this.f22443h.equals(sVar.f22443h) && this.f22444i.equals(sVar.f22444i) && this.f22445j.equals(sVar.f22445j);
    }

    public final int hashCode() {
        int hashCode = this.f22436a.hashCode() * 31;
        String str = this.f22437b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f22438c;
        return this.f22445j.hashCode() + ((this.f22444i.hashCode() + ((this.f22443h.hashCode() + ((this.f22442g.hashCode() + G.g.a((this.f22440e.hashCode() + ((this.f22439d.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.f22441f)) * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SymbolOptions(latLng=");
        sb2.append(this.f22436a);
        sb2.append(", data=");
        sb2.append((Object) this.f22437b);
        sb2.append(", iconImage=");
        sb2.append(this.f22438c);
        sb2.append(", iconSize=");
        sb2.append(this.f22439d);
        sb2.append(", iconOffset=");
        sb2.append(this.f22440e);
        sb2.append(", iconAnchor=");
        sb2.append(this.f22441f);
        sb2.append(", iconRotate=");
        sb2.append(this.f22442g);
        sb2.append(", iconOpacity=");
        sb2.append(this.f22443h);
        sb2.append(", symbolSortKey=");
        sb2.append(this.f22444i);
        sb2.append(", isDraggable=");
        return D3.g.d(sb2, this.f22445j, ")");
    }
}
