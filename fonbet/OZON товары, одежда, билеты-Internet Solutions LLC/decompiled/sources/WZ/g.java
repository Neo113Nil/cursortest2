package WZ;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, Object> f33358a;

    /* renamed from: b, reason: collision with root package name */
    private final f f33359b;

    public g(Map<String, ? extends Object> map, f fVar) {
        this.f33358a = map;
        this.f33359b = fVar;
    }

    public static g a(g gVar, Map map, f fVar, int i11) {
        if ((i11 & 1) != 0) {
            map = gVar.f33358a;
        }
        if ((i11 & 2) != 0) {
            fVar = gVar.f33359b;
        }
        gVar.getClass();
        return new g(map, fVar);
    }

    public final Map<String, Object> b() {
        return this.f33358a;
    }

    public final f c() {
        return this.f33359b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f33358a, gVar.f33358a) && Intrinsics.d(this.f33359b, gVar.f33359b);
    }

    public final int hashCode() {
        Map<String, Object> map = this.f33358a;
        int hashCode = (map == null ? 0 : map.hashCode()) * 31;
        f fVar = this.f33359b;
        return hashCode + (fVar != null ? fVar.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "CustomizedEventParams(custom=" + this.f33358a + ", customizedAnalyticsScreenParams=" + this.f33359b + ")";
    }
}
