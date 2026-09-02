package com.goldenboot.saga.zone;

import com.goldenboot.saga.zone.PressOrchestrator;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class TextSynthesizer implements PressOrchestrator.ActivityMutator {
    public final TouchRecord evictLayout;
    public final TouchRecord growPayload;
    public final BoxSteward injectMetric;

    public TextSynthesizer(TouchRecord touchRecord, TouchRecord touchRecord2, BoxSteward boxSteward) {
        this.evictLayout = touchRecord;
        this.growPayload = touchRecord2;
        this.injectMetric = boxSteward;
    }

    @Override // com.goldenboot.saga.zone.PressOrchestrator.ActivityMutator
    public TouchRecord evictLayout() {
        return this.growPayload;
    }

    @Override // com.goldenboot.saga.zone.PressOrchestrator.ActivityMutator
    public TouchRecord getKey() {
        return this.evictLayout;
    }

    public final BoxSteward growPayload() {
        return this.injectMetric;
    }
}
