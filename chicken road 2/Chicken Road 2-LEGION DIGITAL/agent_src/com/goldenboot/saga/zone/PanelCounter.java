package com.goldenboot.saga.zone;

import android.os.Bundle;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class PanelCounter {
    public static final boolean clipOrigin(Bundle bundle) {
        return bundle.isEmpty();
    }

    public static final Bundle detachStream(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return bundle.getBundle(key);
    }

    public static Bundle evictLayout(Bundle source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return source;
    }

    public static final Map flushSample(Bundle bundle) {
        Map detachStream = BridgeBridge.detachStream(bundle.size());
        for (String str : bundle.keySet()) {
            Intrinsics.checkNotNull(str);
            detachStream.put(str, bundle.get(str));
        }
        return BridgeBridge.growPayload(detachStream);
    }

    public static final boolean growPayload(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return bundle.containsKey(key);
    }

    public static final Bundle injectMetric(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle bundle2 = bundle.getBundle(key);
        if (bundle2 != null) {
            return bundle2;
        }
        AttrRouter.evictLayout(key);
        throw new ShadowBroadcaster();
    }

    public static final List releaseHeader(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return bundle.getStringArrayList(key);
    }
}
