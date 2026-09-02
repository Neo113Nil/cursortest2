package com.goldenboot.saga.zone;

import com.goldenboot.saga.zone.WrapperQueue;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class ChannelActivator {
    public static final WrapperQueue.ActivityMutator clipOrigin(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new WrapperQueue.ActivityMutator(name);
    }

    public static final WrapperQueue.ActivityMutator detachStream(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new WrapperQueue.ActivityMutator(name);
    }

    public static final WrapperQueue.ActivityMutator evictLayout(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new WrapperQueue.ActivityMutator(name);
    }

    public static final WrapperQueue.ActivityMutator flushSample(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new WrapperQueue.ActivityMutator(name);
    }

    public static final WrapperQueue.ActivityMutator growPayload(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new WrapperQueue.ActivityMutator(name);
    }

    public static final WrapperQueue.ActivityMutator injectMetric(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new WrapperQueue.ActivityMutator(name);
    }

    public static final WrapperQueue.ActivityMutator releaseHeader(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new WrapperQueue.ActivityMutator(name);
    }

    public static final WrapperQueue.ActivityMutator updateTimer(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new WrapperQueue.ActivityMutator(name);
    }
}
