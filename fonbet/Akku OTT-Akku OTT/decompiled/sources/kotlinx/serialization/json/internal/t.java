package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t {
    public static final void a(kotlinx.serialization.json.b json, u sb, kotlinx.serialization.k serializer, Object obj) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(sb, "writer");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        H mode = H.c;
        kotlinx.serialization.json.q[] modeReuseCache = new kotlinx.serialization.json.q[H.j.size()];
        Intrinsics.checkNotNullParameter(sb, "output");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(modeReuseCache, "modeReuseCache");
        Intrinsics.checkNotNullParameter(sb, "sb");
        Intrinsics.checkNotNullParameter(json, "json");
        new D(new C1182f(sb), json, mode, modeReuseCache).encodeSerializableValue(serializer, obj);
    }
}
