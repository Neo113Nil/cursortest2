package com.goldenboot.saga.zone;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class CursorHandler {
    public static final ServerBuilder evictLayout = new ServerBuilder(0);

    public static final ServerBuilder detachStream(int i, Object obj, int i2, Object obj2, int i3, Object obj3) {
        ServerBuilder serverBuilder = new ServerBuilder(0, 1, null);
        serverBuilder.attachConfig(i, obj);
        serverBuilder.attachConfig(i2, obj2);
        serverBuilder.attachConfig(i3, obj3);
        return serverBuilder;
    }

    public static final FramePresenter evictLayout() {
        ServerBuilder serverBuilder = evictLayout;
        Intrinsics.checkNotNull(serverBuilder, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.emptyIntObjectMap>");
        return serverBuilder;
    }

    public static final FramePresenter growPayload() {
        ServerBuilder serverBuilder = evictLayout;
        Intrinsics.checkNotNull(serverBuilder, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        return serverBuilder;
    }

    public static final ServerBuilder injectMetric() {
        return new ServerBuilder(0, 1, null);
    }
}
