package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public final class InterpolatorResolver implements LazyKeeper {
    public final boolean reduceScope;

    public InterpolatorResolver(boolean z) {
        this.reduceScope = z;
    }

    @Override // com.goldenboot.saga.zone.LazyKeeper
    public BounceCreator growPayload() {
        return null;
    }

    @Override // com.goldenboot.saga.zone.LazyKeeper
    public boolean popBlueprint() {
        return this.reduceScope;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(popBlueprint() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
