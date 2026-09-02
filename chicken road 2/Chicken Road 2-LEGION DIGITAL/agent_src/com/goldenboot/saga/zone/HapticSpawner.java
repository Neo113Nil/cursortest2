package com.goldenboot.saga.zone;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class HapticSpawner {
    public static final ActivityMutator evictLayout = new ActivityMutator(null);
    public static final int growPayload = detachStream(0);
    public static final int injectMetric = detachStream(1);
    public static final int detachStream = detachStream(2);

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator {
        public /* synthetic */ ActivityMutator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int evictLayout() {
            return HapticSpawner.growPayload;
        }

        public final int growPayload() {
            return HapticSpawner.injectMetric;
        }

        public final int injectMetric() {
            return HapticSpawner.detachStream;
        }

        public ActivityMutator() {
        }
    }

    public static int detachStream(int i) {
        return i;
    }
}
