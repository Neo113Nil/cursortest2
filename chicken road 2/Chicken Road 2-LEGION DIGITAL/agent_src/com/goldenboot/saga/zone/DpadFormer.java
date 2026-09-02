package com.goldenboot.saga.zone;

import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/goldenboot/saga/zone/DpadFormer;", "Lcom/goldenboot/saga/zone/CachedDeserializer;", "Lcom/goldenboot/saga/zone/PublisherSegment;", "Lcom/goldenboot/saga/zone/DpadBuilder;", "unlockMessage", "(Lcom/goldenboot/saga/zone/PublisherSegment;)V", "observeView", "()V", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface DpadFormer extends CachedDeserializer {
    void unlockMessage(PublisherSegment publisherSegment);

    default void observeView() {
    }
}
