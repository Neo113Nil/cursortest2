package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public final class ContextFormatter implements LazyKeeper {
    public final BounceCreator reduceScope;

    public ContextFormatter(BounceCreator bounceCreator) {
        this.reduceScope = bounceCreator;
    }

    @Override // com.goldenboot.saga.zone.LazyKeeper
    public BounceCreator growPayload() {
        return this.reduceScope;
    }

    @Override // com.goldenboot.saga.zone.LazyKeeper
    public boolean popBlueprint() {
        return false;
    }

    public String toString() {
        return super.toString();
    }
}
