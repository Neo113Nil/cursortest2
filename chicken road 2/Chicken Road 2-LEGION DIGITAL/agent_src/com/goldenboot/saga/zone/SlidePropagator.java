package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public final class SlidePropagator extends ConsumerMaker {
    public final IconExporter reduceScope;

    public SlidePropagator(IconExporter iconExporter) {
        this.reduceScope = iconExporter;
    }

    @Override // com.goldenboot.saga.zone.ConsumerMaker
    public Object clipOrigin(TriggerModerator triggerModerator, ServiceRegulator serviceRegulator) {
        Object invoke = this.reduceScope.invoke(triggerModerator, serviceRegulator);
        return invoke == RotateReceiver.releaseHeader() ? invoke : DpadBuilder.evictLayout;
    }
}
