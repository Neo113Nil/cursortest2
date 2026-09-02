package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class ColumnDownloader implements SwipeDownloader {
    @Override // com.goldenboot.saga.zone.SwipeDownloader
    public final int bindBody(ProducerRecovery producerRecovery, FrameRevision frameRevision, int i) {
        return frameRevision.applyData(i);
    }

    @Override // com.goldenboot.saga.zone.SwipeDownloader
    public final int handleFooter(ProducerRecovery producerRecovery, FrameRevision frameRevision, int i) {
        return frameRevision.prepareCount(i);
    }

    @Override // com.goldenboot.saga.zone.SwipeDownloader
    public final int resumeSignature(ProducerRecovery producerRecovery, FrameRevision frameRevision, int i) {
        return frameRevision.protectChannel(i);
    }

    @Override // com.goldenboot.saga.zone.SwipeDownloader
    public final int storeCharset(ProducerRecovery producerRecovery, FrameRevision frameRevision, int i) {
        return frameRevision.attachCallback(i);
    }
}
