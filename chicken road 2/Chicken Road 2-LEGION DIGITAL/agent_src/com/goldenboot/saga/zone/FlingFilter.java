package com.goldenboot.saga.zone;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public final class FlingFilter implements DrawerBroadcaster {
    public static final FlingFilter evictLayout = new FlingFilter();
    public static final ScaleMutator growPayload = TimelineStatus.evictLayout;

    @Override // com.goldenboot.saga.zone.DrawerBroadcaster, com.goldenboot.saga.zone.InterpolatorBeacon
    public ScaleMutator evictLayout() {
        return growPayload;
    }

    @Override // com.goldenboot.saga.zone.InterpolatorBeacon
    /* renamed from: releaseHeader, reason: merged with bridge method [inline-methods] */
    public void injectMetric(RemoteEmitter encoder, Void value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        throw new BreadcrumbHandler("'kotlin.Nothing' cannot be serialized");
    }
}
