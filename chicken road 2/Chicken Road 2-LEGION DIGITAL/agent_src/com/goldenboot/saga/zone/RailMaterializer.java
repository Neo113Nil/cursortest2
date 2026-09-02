package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class RailMaterializer extends ItemGovernor {
    public final boolean applyTask;
    public final long connectJob;
    public final TouchRecord drawField;
    public final ItemGovernor flushSample;
    public final ItemGovernor peekRevision;
    public TouchRecord popBlueprint;
    public final boolean updateTimer;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RailMaterializer(ItemGovernor itemGovernor, TouchRecord touchRecord, boolean z, boolean z2) {
        super(r0, BridgeAdministrator.resetDelta.evictLayout(), null);
        long j;
        SaveFilter saveFilter;
        TouchRecord flushSample;
        TouchRecord attachCallback;
        j = WaveBenchmark.growPayload;
        this.flushSample = itemGovernor;
        this.updateTimer = z;
        this.applyTask = z2;
        if (itemGovernor == null || (flushSample = itemGovernor.flushSample()) == null) {
            saveFilter = WaveBenchmark.drawField;
            flushSample = saveFilter.flushSample();
        }
        attachCallback = WaveBenchmark.attachCallback(touchRecord, flushSample, z);
        this.popBlueprint = attachCallback;
        this.connectJob = FlexFence.evictLayout();
        this.peekRevision = this;
    }

    @Override // com.goldenboot.saga.zone.ItemGovernor
    public long applyTask() {
        return findTask().applyTask();
    }

    @Override // com.goldenboot.saga.zone.ItemGovernor
    public BridgeAdministrator clipOrigin() {
        return findTask().clipOrigin();
    }

    @Override // com.goldenboot.saga.zone.ItemGovernor
    public ItemGovernor decodePath(TouchRecord touchRecord) {
        ItemGovernor queryModel;
        TouchRecord prepareTask = WaveBenchmark.prepareTask(touchRecord, flushSample(), false, 4, null);
        if (this.updateTimer) {
            return findTask().decodePath(prepareTask);
        }
        queryModel = WaveBenchmark.queryModel(findTask().decodePath(null), prepareTask, true);
        return queryModel;
    }

    @Override // com.goldenboot.saga.zone.ItemGovernor
    public void detachStream() {
        ItemGovernor itemGovernor;
        inflateAdapter(true);
        if (!this.applyTask || (itemGovernor = this.flushSample) == null) {
            return;
        }
        itemGovernor.detachStream();
    }

    @Override // com.goldenboot.saga.zone.ItemGovernor
    public TouchRecord drawField() {
        return this.drawField;
    }

    public final ItemGovernor findTask() {
        SaveFilter saveFilter;
        ItemGovernor itemGovernor = this.flushSample;
        if (itemGovernor != null) {
            return itemGovernor;
        }
        saveFilter = WaveBenchmark.drawField;
        return saveFilter;
    }

    @Override // com.goldenboot.saga.zone.ItemGovernor
    /* renamed from: flattenPackage, reason: merged with bridge method [inline-methods] */
    public Void peekRevision(ItemGovernor itemGovernor) {
        AlarmGuard.growPayload();
        throw new ShadowBroadcaster();
    }

    @Override // com.goldenboot.saga.zone.ItemGovernor
    /* renamed from: injectConstraint, reason: merged with bridge method [inline-methods] */
    public Void serializeOffset(ItemGovernor itemGovernor) {
        AlarmGuard.growPayload();
        throw new ShadowBroadcaster();
    }

    @Override // com.goldenboot.saga.zone.ItemGovernor
    /* renamed from: mergeLocale, reason: merged with bridge method [inline-methods] */
    public TouchRecord flushSample() {
        return this.popBlueprint;
    }

    @Override // com.goldenboot.saga.zone.ItemGovernor
    public void notifyMessage(BorderHook borderHook) {
        findTask().notifyMessage(borderHook);
    }

    @Override // com.goldenboot.saga.zone.ItemGovernor
    public void reduceScope() {
        findTask().reduceScope();
    }

    public void storeCharset(TouchRecord touchRecord) {
        this.popBlueprint = touchRecord;
    }

    public final long syncScope() {
        return this.connectJob;
    }

    @Override // com.goldenboot.saga.zone.ItemGovernor
    public boolean updateTimer() {
        return findTask().updateTimer();
    }
}
