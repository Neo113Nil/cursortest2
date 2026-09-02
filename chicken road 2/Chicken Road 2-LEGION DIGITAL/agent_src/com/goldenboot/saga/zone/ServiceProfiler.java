package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public interface ServiceProfiler {
    public static final ActivityMutator evictLayout = ActivityMutator.evictLayout;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator {
        public static final /* synthetic */ ActivityMutator evictLayout = new ActivityMutator();

        public final StackSyncer evictLayout(long j, boolean z) {
            StackSyncer stackSyncer;
            StackSyncer stackSyncer2;
            StackSyncer stackSyncer3;
            if (!z) {
                stackSyncer = CompatNotifier.detachStream;
                return stackSyncer;
            }
            if (BoxSaver.attachConfig(j) > 0.5d) {
                stackSyncer3 = CompatNotifier.growPayload;
                return stackSyncer3;
            }
            stackSyncer2 = CompatNotifier.injectMetric;
            return stackSyncer2;
        }

        public final long growPayload(long j, boolean z) {
            return (z || ((double) BoxSaver.attachConfig(j)) >= 0.5d) ? j : ContainerSource.INSTANCE.gatherAdapter();
        }
    }

    StackSyncer evictLayout(NotificationFence notificationFence, int i);

    long growPayload(NotificationFence notificationFence, int i);
}
