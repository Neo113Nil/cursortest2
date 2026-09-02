package com.goldenboot.saga.zone;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public abstract class LabelMeter {

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator implements CompatCache {
        public final /* synthetic */ IconExporter evictLayout;

        public ActivityMutator(IconExporter iconExporter) {
            this.evictLayout = iconExporter;
        }

        @Override // com.goldenboot.saga.zone.CompatCache
        public Iterator iterator() {
            return LabelMeter.evictLayout(this.evictLayout);
        }
    }

    public static Iterator evictLayout(IconExporter block) {
        Intrinsics.checkNotNullParameter(block, "block");
        ToolbarGuard toolbarGuard = new ToolbarGuard();
        toolbarGuard.clipOrigin(ChipExporter.evictLayout(block, toolbarGuard, toolbarGuard));
        return toolbarGuard;
    }

    public static CompatCache growPayload(IconExporter block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return new ActivityMutator(block);
    }
}
