package com.goldenboot.saga.zone;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class DialogInterpreter {
    public static final DialogInterpreter detachStream;
    public static final ActivityMutator injectMetric;
    public final float evictLayout;
    public final float growPayload;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator {
        public /* synthetic */ ActivityMutator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public ActivityMutator() {
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        injectMetric = new ActivityMutator(defaultConstructorMarker);
        float f = 0.0f;
        detachStream = new DialogInterpreter(f, f, 3, defaultConstructorMarker);
    }

    public DialogInterpreter(float f, float f2) {
        this.evictLayout = f;
        this.growPayload = f2;
    }

    public final float evictLayout() {
        return this.evictLayout;
    }

    public final float growPayload() {
        return this.growPayload;
    }

    public /* synthetic */ DialogInterpreter(float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2);
    }
}
