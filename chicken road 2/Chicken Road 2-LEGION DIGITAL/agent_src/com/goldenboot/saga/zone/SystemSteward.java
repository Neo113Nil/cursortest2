package com.goldenboot.saga.zone;

import androidx.compose.foundation.layout.LayoutWeightElement;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class SystemSteward implements LabelSyncer {
    public static final SystemSteward evictLayout = new SystemSteward();

    @Override // com.goldenboot.saga.zone.LabelSyncer
    public androidx.compose.ui.RemoteCallback evictLayout(androidx.compose.ui.RemoteCallback remoteCallback, float f, boolean z) {
        if (f > 0.0d) {
            return remoteCallback.serializeOffset(new LayoutWeightElement(CellEntry.flushSample(f, Float.MAX_VALUE), z));
        }
        throw new IllegalArgumentException(("invalid weight " + f + "; must be greater than zero").toString());
    }
}
