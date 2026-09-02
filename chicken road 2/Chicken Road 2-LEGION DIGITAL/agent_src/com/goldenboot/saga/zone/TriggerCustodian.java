package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class TriggerCustodian {
    public static final CachedEvent evictLayout = new TimelineStack(0.4f, 0.0f, 0.2f, 1.0f);
    public static final CachedEvent growPayload = new TimelineStack(0.0f, 0.0f, 0.2f, 1.0f);
    public static final CachedEvent injectMetric = new TimelineStack(0.4f, 0.0f, 1.0f, 1.0f);
    public static final CachedEvent detachStream = new CachedEvent() { // from class: com.goldenboot.saga.zone.TypographyPhase
        @Override // com.goldenboot.saga.zone.CachedEvent
        public final float evictLayout(float f) {
            float growPayload2;
            growPayload2 = TriggerCustodian.growPayload(f);
            return growPayload2;
        }
    };

    public static final CachedEvent detachStream() {
        return detachStream;
    }

    public static final CachedEvent injectMetric() {
        return evictLayout;
    }

    public static final float growPayload(float f) {
        return f;
    }
}
