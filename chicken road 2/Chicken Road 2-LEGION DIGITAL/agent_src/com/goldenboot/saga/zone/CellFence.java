package com.goldenboot.saga.zone;

import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/RemoteCallback;", "", "degrees", "evictLayout", "(Landroidx/compose/ui/RemoteCallback;F)Landroidx/compose/ui/RemoteCallback;", "ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CellFence {
    public static final androidx.compose.ui.RemoteCallback evictLayout(androidx.compose.ui.RemoteCallback remoteCallback, float f) {
        return f == 0.0f ? remoteCallback : androidx.compose.ui.graphics.StylusConverter.flushSample(remoteCallback, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 0, null, 524031, null);
    }
}
