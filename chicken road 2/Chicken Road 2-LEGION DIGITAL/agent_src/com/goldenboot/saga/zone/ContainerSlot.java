package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public interface ContainerSlot {
    public static final ActivityMutator evictLayout = ActivityMutator.evictLayout;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator {
        public static final /* synthetic */ ActivityMutator evictLayout = new ActivityMutator();
        public static final ScrollArbitrator growPayload = RippleQueue.flushSample(0.0f, 0.0f, null, 7, null);
        public static final ContainerSlot injectMetric = new C0100ActivityMutator();

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        /* renamed from: com.goldenboot.saga.zone.ContainerSlot$ActivityMutator$ActivityMutator, reason: collision with other inner class name */
        public static final class C0100ActivityMutator implements ContainerSlot {
        }

        public final float evictLayout(float f, float f2, float f3) {
            float f4 = f2 + f;
            if (f >= 0.0f && f4 <= f3) {
                return 0.0f;
            }
            if (f < 0.0f && f4 > f3) {
                return 0.0f;
            }
            float f5 = f4 - f3;
            return Math.abs(f) < Math.abs(f5) ? f : f5;
        }

        public final ContainerSlot growPayload() {
            return injectMetric;
        }

        public final ScrollArbitrator injectMetric() {
            return growPayload;
        }
    }

    default float evictLayout(float f, float f2, float f3) {
        return evictLayout.evictLayout(f, f2, f3);
    }

    default ScrollArbitrator growPayload() {
        return evictLayout.injectMetric();
    }
}
