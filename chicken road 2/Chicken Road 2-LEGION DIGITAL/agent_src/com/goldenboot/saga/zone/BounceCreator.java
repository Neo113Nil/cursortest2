package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public final class BounceCreator extends ComponentSlot implements LazyKeeper {
    @Override // com.goldenboot.saga.zone.LazyKeeper
    public boolean popBlueprint() {
        return true;
    }

    @Override // com.goldenboot.saga.zone.SingletonInitializer
    public String toString() {
        return super.toString();
    }

    @Override // com.goldenboot.saga.zone.LazyKeeper
    public BounceCreator growPayload() {
        return this;
    }
}
