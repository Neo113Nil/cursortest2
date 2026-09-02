package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class ImageEvent {
    public void evictLayout(Object obj) {
        growPayload(obj, null);
    }

    public abstract void growPayload(Object obj, ProducerLogger producerLogger);

    public abstract void injectMetric();
}
