package com.goldenboot.saga.zone;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class BadgeBus implements CanvasFence {
    public final TouchRecord evictLayout;

    public BadgeBus(TouchRecord touchRecord) {
        this.evictLayout = touchRecord;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BadgeBus) && Intrinsics.areEqual(this.evictLayout, ((BadgeBus) obj).evictLayout);
    }

    @Override // com.goldenboot.saga.zone.CanvasFence
    public Object evictLayout(PulseBootstrapper pulseBootstrapper) {
        return this.evictLayout.invoke(pulseBootstrapper);
    }

    public final TouchRecord growPayload() {
        return this.evictLayout;
    }

    public int hashCode() {
        return this.evictLayout.hashCode();
    }

    public String toString() {
        return "ComputedValueHolder(compute=" + this.evictLayout + ')';
    }
}
