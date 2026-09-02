package com.goldenboot.saga.zone;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public abstract class TouchNormalizer {
    public static final InterpolatorBeacon evictLayout(CardFetcher cardFetcher, RemoteEmitter encoder, Object value) {
        Intrinsics.checkNotNullParameter(cardFetcher, "<this>");
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        InterpolatorBeacon releaseHeader = cardFetcher.releaseHeader(encoder, value);
        if (releaseHeader != null) {
            return releaseHeader;
        }
        StyleBackup.evictLayout(Reflection.getOrCreateKotlinClass(value.getClass()), cardFetcher.clipOrigin());
        throw new ShadowBroadcaster();
    }
}
