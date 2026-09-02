package com.goldenboot.saga.zone;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public abstract class ShapeMulticaster {
    public static final BounceHandler evictLayout = new BounceHandler(null);
    public static final ShapeMulticaster growPayload = new ActivityMutator();

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class BounceHandler {
        public /* synthetic */ BounceHandler(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public BounceHandler() {
        }
    }

    public abstract void evictLayout();

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator extends ShapeMulticaster {
        @Override // com.goldenboot.saga.zone.ShapeMulticaster
        public void evictLayout() {
        }
    }
}
