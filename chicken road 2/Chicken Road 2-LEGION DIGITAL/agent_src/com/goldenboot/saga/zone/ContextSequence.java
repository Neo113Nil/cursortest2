package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class ContextSequence extends androidx.compose.animation.StylusConverter {
    public final RippleDetector injectMetric;

    public ContextSequence(RippleDetector rippleDetector) {
        super(null);
        this.injectMetric = rippleDetector;
    }

    @Override // androidx.compose.animation.StylusConverter
    public RippleDetector growPayload() {
        return this.injectMetric;
    }
}
