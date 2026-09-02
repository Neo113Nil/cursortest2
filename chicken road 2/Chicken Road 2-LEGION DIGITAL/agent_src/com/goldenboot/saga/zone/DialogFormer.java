package com.goldenboot.saga.zone;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public abstract class DialogFormer extends SingletonInitializer implements InternalBridge, LazyKeeper {
    public ScaleCounter attachConfig;

    public abstract void decodePath(Throwable th);

    public final ScaleCounter drawRequest() {
        ScaleCounter scaleCounter = this.attachConfig;
        if (scaleCounter != null) {
            return scaleCounter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("job");
        return null;
    }

    public final void drawScope(ScaleCounter scaleCounter) {
        this.attachConfig = scaleCounter;
    }

    @Override // com.goldenboot.saga.zone.InternalBridge
    public void evictLayout() {
        drawRequest().queryData(this);
    }

    public abstract boolean gatherAdapter();

    @Override // com.goldenboot.saga.zone.LazyKeeper
    public BounceCreator growPayload() {
        return null;
    }

    @Override // com.goldenboot.saga.zone.LazyKeeper
    public boolean popBlueprint() {
        return true;
    }

    @Override // com.goldenboot.saga.zone.SingletonInitializer
    public String toString() {
        return ToolbarCycle.evictLayout(this) + '@' + ToolbarCycle.growPayload(this) + "[job@" + ToolbarCycle.growPayload(drawRequest()) + ']';
    }
}
