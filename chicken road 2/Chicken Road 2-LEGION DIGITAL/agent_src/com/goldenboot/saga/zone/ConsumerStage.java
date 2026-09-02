package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public abstract class ConsumerStage {
    public static final ListNormalizer evictLayout(DrawableSynthesizer drawableSynthesizer) {
        return new ShadowMolder(drawableSynthesizer);
    }

    public static /* synthetic */ ListNormalizer growPayload(DrawableSynthesizer drawableSynthesizer, int i, Object obj) {
        if ((i & 1) != 0) {
            drawableSynthesizer = null;
        }
        return evictLayout(drawableSynthesizer);
    }

    public static final boolean injectMetric(ListNormalizer listNormalizer, Object obj) {
        Throwable detachStream = AttrSemaphore.detachStream(obj);
        return detachStream == null ? listNormalizer.filterPayload(obj) : listNormalizer.releaseHeader(detachStream);
    }
}
