package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public class BoxFetcher extends TransitionThrottle implements TapPump {
    public final ServiceRegulator attachConfig;

    public BoxFetcher(LongPressGateway longPressGateway, ServiceRegulator serviceRegulator) {
        super(longPressGateway, true, true);
        this.attachConfig = serviceRegulator;
    }

    @Override // com.goldenboot.saga.zone.TransitionThrottle
    public void closeSource(Object obj) {
        ServiceRegulator serviceRegulator = this.attachConfig;
        serviceRegulator.resumeWith(LayerFetcher.evictLayout(obj, serviceRegulator));
    }

    @Override // com.goldenboot.saga.zone.ScaleCounter
    public final boolean commitBounds() {
        return true;
    }

    @Override // com.goldenboot.saga.zone.ScaleCounter
    public void findTask(Object obj) {
        ObserverWrapper.growPayload(ChipExporter.injectMetric(this.attachConfig), LayerFetcher.evictLayout(obj, this.attachConfig));
    }

    @Override // com.goldenboot.saga.zone.TapPump
    public final TapPump getCallerFrame() {
        ServiceRegulator serviceRegulator = this.attachConfig;
        if (serviceRegulator instanceof TapPump) {
            return (TapPump) serviceRegulator;
        }
        return null;
    }
}
