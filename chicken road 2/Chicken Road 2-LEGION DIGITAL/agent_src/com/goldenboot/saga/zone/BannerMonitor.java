package com.goldenboot.saga.zone;

import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class BannerMonitor {
    public static final SelectionHub evictLayout = CellAllocator.updateTimer(null, ActivityMutator.reduceScope, 1, null);

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator extends Lambda implements ElevationNode {
        public static final ActivityMutator reduceScope = new ActivityMutator();

        public ActivityMutator() {
            super(0);
        }

        public final ProducerSnapshot evictLayout() {
            return null;
        }

        @Override // com.goldenboot.saga.zone.ElevationNode
        public /* bridge */ /* synthetic */ Object invoke() {
            evictLayout();
            return null;
        }
    }

    public static final SelectionHub evictLayout() {
        return evictLayout;
    }
}
