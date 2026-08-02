package T00;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, String> f26489a;

    public l(Map<String, String> map) {
        this.f26489a = map;
    }

    public final Map<String, String> a() {
        return this.f26489a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!l.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type ru.ozon.composer.network.decode.model.TrackingTokenAliases");
        return Intrinsics.d(this.f26489a, ((l) obj).f26489a);
    }

    public final int hashCode() {
        Map<String, String> map = this.f26489a;
        if (map != null) {
            return map.hashCode();
        }
        return 0;
    }
}
