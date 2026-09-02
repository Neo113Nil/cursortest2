package com.goldenboot.saga.zone;

import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public final class ThemeMapper extends SharedBus implements DrawerBroadcaster {
    public static final ThemeMapper injectMetric = new ThemeMapper();

    public ThemeMapper() {
        super(TriggerMaker.drawScope(FloatCompanionObject.INSTANCE));
    }

    @Override // com.goldenboot.saga.zone.ClipboardState
    /* renamed from: flushSample, reason: merged with bridge method [inline-methods] */
    public int releaseHeader(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr.length;
    }

    @Override // com.goldenboot.saga.zone.SharedBus
    /* renamed from: updateTimer, reason: merged with bridge method [inline-methods] */
    public void clipOrigin(ClickLauncher encoder, float[] content, int i) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.peekRevision(evictLayout(), i2, content[i2]);
        }
    }
}
