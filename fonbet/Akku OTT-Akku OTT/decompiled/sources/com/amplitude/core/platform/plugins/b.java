package com.amplitude.core.platform.plugins;

import com.amplitude.core.events.e;
import com.amplitude.core.platform.k;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b implements k {
    public static final a Companion = new a();
    public final k.a a = k.a.b;

    public static final class a {
    }

    @Override // com.amplitude.core.platform.k
    public final void b(com.amplitude.core.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
    }

    @Override // com.amplitude.core.platform.k
    public final void c(com.amplitude.core.b amplitude) {
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        super.c(amplitude);
    }

    @Override // com.amplitude.core.platform.k
    public final com.amplitude.core.events.a f(com.amplitude.core.events.a event) {
        Object obj;
        Intrinsics.checkNotNullParameter(event, "event");
        Map map = event.L;
        if (map != null && (obj = map.get("ampli")) != null) {
            try {
                Object obj2 = ((Map) obj).get("ingestionMetadata");
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                Map map2 = (Map) obj2;
                event.E = new e((String) map2.get("sourceName"), (String) map2.get("sourceVersion"));
            } catch (Throwable unused) {
            }
        }
        return event;
    }

    @Override // com.amplitude.core.platform.k
    public final k.a getType() {
        return this.a;
    }
}
