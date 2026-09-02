package com.goldenboot.saga.zone;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public abstract class SpacerDetector {
    public static final LocalEdge growPayload(Object obj) {
        if (obj == PipelineExtractor.evictLayout) {
            throw new IllegalStateException("Does not contain segment");
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        return (LocalEdge) obj;
    }

    public static final boolean injectMetric(Object obj) {
        return obj == PipelineExtractor.evictLayout;
    }

    public static Object evictLayout(Object obj) {
        return obj;
    }
}
