package com.goldenboot.saga.zone;

import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public final class RailDemux extends SharedBus implements DrawerBroadcaster {
    public static final RailDemux injectMetric = new RailDemux();

    public RailDemux() {
        super(TriggerMaker.drawRequest(ByteCompanionObject.INSTANCE));
    }

    @Override // com.goldenboot.saga.zone.ClipboardState
    /* renamed from: flushSample, reason: merged with bridge method [inline-methods] */
    public int releaseHeader(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return bArr.length;
    }

    @Override // com.goldenboot.saga.zone.SharedBus
    /* renamed from: updateTimer, reason: merged with bridge method [inline-methods] */
    public void clipOrigin(ClickLauncher encoder, byte[] content, int i) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.updateTimer(evictLayout(), i2, content[i2]);
        }
    }
}
