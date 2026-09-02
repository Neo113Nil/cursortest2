package com.goldenboot.saga.zone;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class WrapperQueue {

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator {
        public final String evictLayout;

        public ActivityMutator(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.evictLayout = name;
        }

        public boolean equals(Object obj) {
            if (obj instanceof ActivityMutator) {
                return Intrinsics.areEqual(this.evictLayout, ((ActivityMutator) obj).evictLayout);
            }
            return false;
        }

        public final String evictLayout() {
            return this.evictLayout;
        }

        public int hashCode() {
            return this.evictLayout.hashCode();
        }

        public String toString() {
            return this.evictLayout;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class BounceHandler {
    }

    public final WrapperQueue detachStream() {
        return new AttrSignal(AttrConductor.drawRequest(evictLayout()), true);
    }

    public abstract Map evictLayout();

    public abstract Object growPayload(ActivityMutator activityMutator);

    public final AttrSignal injectMetric() {
        return new AttrSignal(AttrConductor.drawRequest(evictLayout()), false);
    }
}
