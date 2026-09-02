package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public abstract class TransitionThrottle extends ScaleCounter implements DrawableSynthesizer, ServiceRegulator, ProgressValve {
    public final LongPressGateway connectPatch;

    public TransitionThrottle(LongPressGateway longPressGateway, boolean z, boolean z2) {
        super(z2);
        if (z) {
            growCallback((DrawableSynthesizer) longPressGateway.evictLayout(DrawableSynthesizer.popBlueprint));
        }
        this.connectPatch = longPressGateway.growPayload(this);
    }

    @Override // com.goldenboot.saga.zone.ScaleCounter
    public final void acquireArchive(Object obj) {
        if (!(obj instanceof JoystickLauncher)) {
            observeNode(obj);
        } else {
            JoystickLauncher joystickLauncher = (JoystickLauncher) obj;
            closeComponent(joystickLauncher.evictLayout, joystickLauncher.evictLayout());
        }
    }

    @Override // com.goldenboot.saga.zone.ScaleCounter
    public String cancelArchive() {
        return ToolbarCycle.evictLayout(this) + " was cancelled";
    }

    public void closeSource(Object obj) {
        findTask(obj);
    }

    @Override // com.goldenboot.saga.zone.ServiceRegulator
    public final LongPressGateway getContext() {
        return this.connectPatch;
    }

    @Override // com.goldenboot.saga.zone.ProgressValve
    public LongPressGateway getCoroutineContext() {
        return this.connectPatch;
    }

    @Override // com.goldenboot.saga.zone.ScaleCounter
    public final void peekDescriptor(Throwable th) {
        InterpolatorNode.evictLayout(this.connectPatch, th);
    }

    @Override // com.goldenboot.saga.zone.ScaleCounter, com.goldenboot.saga.zone.DrawableSynthesizer
    public boolean popBlueprint() {
        return super.popBlueprint();
    }

    @Override // com.goldenboot.saga.zone.ServiceRegulator
    public final void resumeWith(Object obj) {
        Object commitKey = commitKey(LayerFetcher.growPayload(obj));
        if (commitKey == SequenceCurator.growPayload) {
            return;
        }
        closeSource(commitKey);
    }

    @Override // com.goldenboot.saga.zone.ScaleCounter
    public String subscribeEvent() {
        String flushSample = ListenerCustodian.flushSample(this.connectPatch);
        if (flushSample == null) {
            return super.subscribeEvent();
        }
        return '\"' + flushSample + "\":" + super.subscribeEvent();
    }

    public final void trimState(EmitterSpawner emitterSpawner, Object obj, IconExporter iconExporter) {
        emitterSpawner.releaseHeader(iconExporter, obj, this);
    }

    public void observeNode(Object obj) {
    }

    public void closeComponent(Throwable th, boolean z) {
    }
}
