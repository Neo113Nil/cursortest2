package T00;

import T7.P;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f26439a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, Integer> f26440b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, Object> f26441c;

    public b(Integer num, Map<String, Integer> map, Map<String, ? extends Object> map2) {
        this.f26439a = num;
        this.f26440b = map;
        this.f26441c = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f26439a, bVar.f26439a) && Intrinsics.d(this.f26440b, bVar.f26440b) && Intrinsics.d(this.f26441c, bVar.f26441c);
    }

    public final int hashCode() {
        Integer num = this.f26439a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Map<String, Integer> map = this.f26440b;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, Object> map2 = this.f26441c;
        return hashCode2 + (map2 != null ? map2.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Experiments(abGroup=");
        sb2.append(this.f26439a);
        sb2.append(", experiments=");
        sb2.append(this.f26440b);
        sb2.append(", config=");
        return P.f(sb2, this.f26441c, ")");
    }
}
