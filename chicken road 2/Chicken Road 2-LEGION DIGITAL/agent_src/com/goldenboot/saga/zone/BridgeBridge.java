package com.goldenboot.saga.zone;

import java.util.Collections;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public abstract class BridgeBridge extends PinchGuardian {
    public static final Map clipOrigin(AlarmFacilitator pair) {
        Intrinsics.checkNotNullParameter(pair, "pair");
        Map singletonMap = Collections.singletonMap(pair.injectMetric(), pair.detachStream());
        Intrinsics.checkNotNullExpressionValue(singletonMap, "singletonMap(...)");
        return singletonMap;
    }

    public static Map detachStream(int i) {
        return new StartupGateway(i);
    }

    public static final Map flushSample(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        Intrinsics.checkNotNullExpressionValue(singletonMap, "with(...)");
        return singletonMap;
    }

    public static Map growPayload(Map builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        return ((StartupGateway) builder).drawRequest();
    }

    public static Map injectMetric() {
        return new StartupGateway();
    }

    public static int releaseHeader(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }
}
