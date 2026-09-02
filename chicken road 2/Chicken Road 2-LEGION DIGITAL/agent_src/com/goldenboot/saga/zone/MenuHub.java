package com.goldenboot.saga.zone;

import com.goldenboot.saga.zone.IconCreator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public abstract class MenuHub implements ScaleMutator {
    public final ScaleMutator evictLayout;
    public final int growPayload;

    public /* synthetic */ MenuHub(ScaleMutator scaleMutator, DefaultConstructorMarker defaultConstructorMarker) {
        this(scaleMutator);
    }

    @Override // com.goldenboot.saga.zone.ScaleMutator
    public ScaleMutator clipOrigin(int i) {
        if (i >= 0) {
            return this.evictLayout;
        }
        throw new IllegalArgumentException(("Illegal index " + i + ", " + evictLayout() + " expects only non-negative indices").toString());
    }

    @Override // com.goldenboot.saga.zone.ScaleMutator
    public int detachStream() {
        return this.growPayload;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MenuHub)) {
            return false;
        }
        MenuHub menuHub = (MenuHub) obj;
        return Intrinsics.areEqual(this.evictLayout, menuHub.evictLayout) && Intrinsics.areEqual(evictLayout(), menuHub.evictLayout());
    }

    @Override // com.goldenboot.saga.zone.ScaleMutator
    public boolean flushSample(int i) {
        if (i >= 0) {
            return false;
        }
        throw new IllegalArgumentException(("Illegal index " + i + ", " + evictLayout() + " expects only non-negative indices").toString());
    }

    public int hashCode() {
        return (this.evictLayout.hashCode() * 31) + evictLayout().hashCode();
    }

    @Override // com.goldenboot.saga.zone.ScaleMutator
    public TextValidator injectMetric() {
        return IconCreator.BounceHandler.evictLayout;
    }

    @Override // com.goldenboot.saga.zone.ScaleMutator
    public String releaseHeader(int i) {
        return String.valueOf(i);
    }

    public String toString() {
        return evictLayout() + '(' + this.evictLayout + ')';
    }

    public MenuHub(ScaleMutator scaleMutator) {
        this.evictLayout = scaleMutator;
        this.growPayload = 1;
    }
}
