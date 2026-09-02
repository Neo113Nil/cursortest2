package com.goldenboot.saga.zone;

import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u0013\u0010\u0007\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\u0003¨\u0006\b"}, d2 = {"Lcom/goldenboot/saga/zone/KeyframeCreator;", "Lcom/goldenboot/saga/zone/DpadBuilder;", "detachStream", "(Lcom/goldenboot/saga/zone/KeyframeCreator;)V", "evictLayout", "injectMetric", "growPayload", "releaseHeader", "ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ViewExtractor {
    public static final void detachStream(KeyframeCreator keyframeCreator) {
        LayoutConstructor.purgeNode(keyframeCreator).reduceScope();
    }

    public static final void evictLayout(KeyframeCreator keyframeCreator) {
        LayoutConstructor.notifyMessage(keyframeCreator, AlphaScheduler.growPayload(2)).escapeMetadata();
    }

    public static final void growPayload(KeyframeCreator keyframeCreator) {
        LayoutConstructor.purgeNode(keyframeCreator).queryDescriptor();
    }

    public static final void injectMetric(KeyframeCreator keyframeCreator) {
        ContentRepository.convertFrame(LayoutConstructor.purgeNode(keyframeCreator), false, 1, null);
    }

    public static final void releaseHeader(KeyframeCreator keyframeCreator) {
        ContentRepository.unwrapView(LayoutConstructor.purgeNode(keyframeCreator), false, false, false, 7, null);
    }
}
