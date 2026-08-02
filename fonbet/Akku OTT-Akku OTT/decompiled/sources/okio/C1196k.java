package okio;

import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* renamed from: okio.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1196k {
    public final boolean a;
    public final boolean b;
    public final C c;
    public final Long d;
    public final Long e;
    public final Long f;
    public final Long g;
    public final Map<KClass<?>, Object> h;

    public C1196k(boolean z, boolean z2, C c, Long l, Long l2, Long l3, Long l4, Map<KClass<?>, ? extends Object> extras) {
        Intrinsics.checkNotNullParameter(extras, "extras");
        this.a = z;
        this.b = z2;
        this.c = c;
        this.d = l;
        this.e = l2;
        this.f = l3;
        this.g = l4;
        this.h = MapsKt.toMap(extras);
    }

    public final String toString() {
        String joinToString$default;
        ArrayList arrayList = new ArrayList();
        if (this.a) {
            arrayList.add("isRegularFile");
        }
        if (this.b) {
            arrayList.add("isDirectory");
        }
        Long l = this.d;
        if (l != null) {
            arrayList.add("byteCount=" + l);
        }
        Long l2 = this.e;
        if (l2 != null) {
            arrayList.add("createdAt=" + l2);
        }
        Long l3 = this.f;
        if (l3 != null) {
            arrayList.add("lastModifiedAt=" + l3);
        }
        Long l4 = this.g;
        if (l4 != null) {
            arrayList.add("lastAccessedAt=" + l4);
        }
        Map<KClass<?>, Object> map = this.h;
        if (!map.isEmpty()) {
            arrayList.add("extras=" + map);
        }
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, ", ", "FileMetadata(", ")", 0, null, null, 56, null);
        return joinToString$default;
    }

    public /* synthetic */ C1196k(boolean z, boolean z2, C c, Long l, Long l2, Long l3, Long l4) {
        this(z, z2, c, l, l2, l3, l4, MapsKt.emptyMap());
    }
}
