package com.goldenboot.saga.zone;

import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lcom/goldenboot/saga/zone/PublisherMigration;", "Lcom/goldenboot/saga/zone/CachedDeserializer;", "Lcom/goldenboot/saga/zone/PagerReducer;", "coordinates", "Lcom/goldenboot/saga/zone/DpadBuilder;", "parseAsset", "(Lcom/goldenboot/saga/zone/PagerReducer;)V", "Lcom/goldenboot/saga/zone/ScaleSaver;", "size", "injectConstraint", "(J)V", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface PublisherMigration extends CachedDeserializer {
    default void injectConstraint(long size) {
    }

    default void parseAsset(PagerReducer coordinates) {
    }
}
