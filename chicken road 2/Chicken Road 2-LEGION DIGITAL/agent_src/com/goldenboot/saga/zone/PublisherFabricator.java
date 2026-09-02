package com.goldenboot.saga.zone;

import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001a\u0010\u0004\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/goldenboot/saga/zone/BackgroundCollection;", "evictLayout", "Lcom/goldenboot/saga/zone/BackgroundCollection;", "()Lcom/goldenboot/saga/zone/BackgroundCollection;", "DefaultDensity", "ui-graphics_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PublisherFabricator {
    private static final BackgroundCollection evictLayout = EmbeddedProbe.evictLayout(1.0f, 1.0f);

    public static final BackgroundCollection evictLayout() {
        return evictLayout;
    }
}
