package com.goldenboot.saga.zone;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class CarouselStage {
    public InputFacilitator detachStream;
    public final androidx.compose.animation.StylusConverter evictLayout;
    public final androidx.compose.animation.ScopedMigration growPayload;
    public final SheetMux injectMetric;

    public CarouselStage(androidx.compose.animation.StylusConverter stylusConverter, androidx.compose.animation.ScopedMigration scopedMigration, float f, InputFacilitator inputFacilitator) {
        this.evictLayout = stylusConverter;
        this.growPayload = scopedMigration;
        this.injectMetric = RailMaintainer.evictLayout(f);
        this.detachStream = inputFacilitator;
    }

    public final float detachStream() {
        return this.injectMetric.growPayload();
    }

    public final androidx.compose.animation.ScopedMigration evictLayout() {
        return this.growPayload;
    }

    public final InputFacilitator growPayload() {
        return this.detachStream;
    }

    public final androidx.compose.animation.StylusConverter injectMetric() {
        return this.evictLayout;
    }

    public /* synthetic */ CarouselStage(androidx.compose.animation.StylusConverter stylusConverter, androidx.compose.animation.ScopedMigration scopedMigration, float f, InputFacilitator inputFacilitator, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(stylusConverter, scopedMigration, (i & 4) != 0 ? 0.0f : f, (i & 8) != 0 ? androidx.compose.animation.ActivityMutator.injectMetric(false, null, 3, null) : inputFacilitator);
    }
}
