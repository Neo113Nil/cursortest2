package com.goldenboot.saga.zone;

import com.goldenboot.saga.zone.DimenMeter;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public final class RailChunk implements DrawerBroadcaster {
    public static final RailChunk evictLayout = new RailChunk();
    public static final ScaleMutator growPayload = new PatternBucket("kotlin.Long", DimenMeter.ScopedMigration.evictLayout);

    @Override // com.goldenboot.saga.zone.DrawerBroadcaster, com.goldenboot.saga.zone.InterpolatorBeacon
    public ScaleMutator evictLayout() {
        return growPayload;
    }

    @Override // com.goldenboot.saga.zone.InterpolatorBeacon
    public /* bridge */ /* synthetic */ void injectMetric(RemoteEmitter remoteEmitter, Object obj) {
        releaseHeader(remoteEmitter, ((Number) obj).longValue());
    }

    public void releaseHeader(RemoteEmitter encoder, long j) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.drawRequest(j);
    }
}
