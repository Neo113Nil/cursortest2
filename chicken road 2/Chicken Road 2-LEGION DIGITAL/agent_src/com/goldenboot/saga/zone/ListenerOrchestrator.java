package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class ListenerOrchestrator extends TextMeter {
    public final SlotDispatcher growPayload;
    public final SlotDispatcher injectMetric;

    public ListenerOrchestrator(Object obj) {
        super(null);
        this.growPayload = StylusDetector.releaseHeader(obj, null, 2, null);
        this.injectMetric = StylusDetector.releaseHeader(obj, null, 2, null);
    }

    @Override // com.goldenboot.saga.zone.TextMeter
    public void detachStream(Object obj) {
        this.growPayload.setValue(obj);
    }

    @Override // com.goldenboot.saga.zone.TextMeter
    public Object evictLayout() {
        return this.growPayload.getValue();
    }

    @Override // com.goldenboot.saga.zone.TextMeter
    public Object growPayload() {
        return this.injectMetric.getValue();
    }

    @Override // com.goldenboot.saga.zone.TextMeter
    public void flushSample() {
    }

    @Override // com.goldenboot.saga.zone.TextMeter
    public void clipOrigin(PluginStreamer pluginStreamer) {
    }
}
