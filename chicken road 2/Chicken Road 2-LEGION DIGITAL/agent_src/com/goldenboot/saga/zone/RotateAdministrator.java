package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class RotateAdministrator {
    public final EndpointSource evictLayout;
    public final TimelineInitializer growPayload;

    public RotateAdministrator(EndpointSource endpointSource, TimelineInitializer timelineInitializer) {
        this.evictLayout = endpointSource;
        this.growPayload = timelineInitializer;
    }

    public String toString() {
        return "AnimationResult(endReason=" + this.growPayload + ", endState=" + this.evictLayout + ')';
    }
}
