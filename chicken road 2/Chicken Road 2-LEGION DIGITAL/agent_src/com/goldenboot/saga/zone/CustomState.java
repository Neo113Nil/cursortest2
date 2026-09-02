package com.goldenboot.saga.zone;

import com.goldenboot.saga.zone.LongPressArbitrator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public abstract class CustomState {
    public static final CustomState detachStream;
    public static final ActivityMutator evictLayout = new ActivityMutator(null);
    public static final CustomState growPayload;
    public static final LongPressArbitrator injectMetric;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator {
        public /* synthetic */ ActivityMutator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public ActivityMutator() {
        }
    }

    static {
        CustomState windowAnnouncer;
        try {
            Class.forName("java.nio.file.Files");
            windowAnnouncer = new FragmentSerializer();
        } catch (ClassNotFoundException unused) {
            windowAnnouncer = new WindowAnnouncer();
        }
        growPayload = windowAnnouncer;
        LongPressArbitrator.ActivityMutator activityMutator = LongPressArbitrator.notifyMessage;
        String property = System.getProperty("java.io.tmpdir");
        Intrinsics.checkNotNullExpressionValue(property, "getProperty(\"java.io.tmpdir\")");
        injectMetric = LongPressArbitrator.ActivityMutator.releaseHeader(activityMutator, property, false, 1, null);
        ClassLoader classLoader = TriggerBlock.class.getClassLoader();
        Intrinsics.checkNotNullExpressionValue(classLoader, "ResourceFileSystem::class.java.classLoader");
        detachStream = new TriggerBlock(classLoader, false);
    }

    public abstract SequenceStep applyTask(LongPressArbitrator longPressArbitrator);

    public abstract void clipOrigin(LongPressArbitrator longPressArbitrator, boolean z);

    public abstract RipplePipeline connectJob(LongPressArbitrator longPressArbitrator);

    public abstract void detachStream(LongPressArbitrator longPressArbitrator, boolean z);

    public abstract SequenceStep drawField(LongPressArbitrator longPressArbitrator, boolean z, boolean z2);

    public abstract void evictLayout(LongPressArbitrator longPressArbitrator, LongPressArbitrator longPressArbitrator2);

    public final boolean flushSample(LongPressArbitrator path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return BounceHandler.growPayload(this, path);
    }

    public final void growPayload(LongPressArbitrator dir, boolean z) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        BounceHandler.evictLayout(this, dir, z);
    }

    public final void injectMetric(LongPressArbitrator dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        detachStream(dir, false);
    }

    public final SequenceStep popBlueprint(LongPressArbitrator file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return drawField(file, false, false);
    }

    public final void releaseHeader(LongPressArbitrator path) {
        Intrinsics.checkNotNullParameter(path, "path");
        clipOrigin(path, false);
    }

    public abstract LabelTransformer updateTimer(LongPressArbitrator longPressArbitrator);
}
