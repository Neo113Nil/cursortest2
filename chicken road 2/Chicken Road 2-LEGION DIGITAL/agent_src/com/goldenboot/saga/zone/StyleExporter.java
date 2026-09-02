package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class StyleExporter implements NotificationArranger {
    public final TrackballWatcher evictLayout;

    public StyleExporter(BackgroundCollection backgroundCollection) {
        this.evictLayout = new TrackballWatcher(AttrCheckpoint.evictLayout(), backgroundCollection);
    }

    public final float clipOrigin(float f) {
        return this.evictLayout.growPayload(f) * Math.signum(f);
    }

    @Override // com.goldenboot.saga.zone.NotificationArranger
    public float detachStream(float f, float f2) {
        return f + clipOrigin(f2);
    }

    @Override // com.goldenboot.saga.zone.NotificationArranger
    public float evictLayout() {
        return 0.0f;
    }

    @Override // com.goldenboot.saga.zone.NotificationArranger
    public float growPayload(long j, float f, float f2) {
        return this.evictLayout.detachStream(f2).growPayload(j / 1000000);
    }

    @Override // com.goldenboot.saga.zone.NotificationArranger
    public long injectMetric(float f, float f2) {
        return this.evictLayout.injectMetric(f2) * 1000000;
    }

    @Override // com.goldenboot.saga.zone.NotificationArranger
    public float releaseHeader(long j, float f, float f2) {
        return f + this.evictLayout.detachStream(f2).evictLayout(j / 1000000);
    }
}
