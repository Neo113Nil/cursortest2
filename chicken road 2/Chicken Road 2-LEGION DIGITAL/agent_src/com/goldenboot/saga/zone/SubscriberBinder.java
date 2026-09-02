package com.goldenboot.saga.zone;

import kotlin.jvm.internal.LongCompanionObject;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public interface SubscriberBinder {
    public static final ActivityMutator evictLayout = ActivityMutator.evictLayout;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator {
        public static final /* synthetic */ ActivityMutator evictLayout = new ActivityMutator();
        public static final SubscriberBinder growPayload = new SpacerMolder();
        public static final SubscriberBinder injectMetric = new ObserverResolver();

        public static /* synthetic */ SubscriberBinder growPayload(ActivityMutator activityMutator, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = 0;
            }
            if ((i & 2) != 0) {
                j2 = LongCompanionObject.MAX_VALUE;
            }
            return activityMutator.evictLayout(j, j2);
        }

        public final SubscriberBinder detachStream() {
            return injectMetric;
        }

        public final SubscriberBinder evictLayout(long j, long j2) {
            return new TapModerator(j, j2);
        }

        public final SubscriberBinder injectMetric() {
            return growPayload;
        }
    }

    CursorKeeper evictLayout(AccentFactory accentFactory);
}
