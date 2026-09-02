package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public interface LabelSyncer {
    static /* synthetic */ androidx.compose.ui.RemoteCallback growPayload(LabelSyncer labelSyncer, androidx.compose.ui.RemoteCallback remoteCallback, float f, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: weight");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return labelSyncer.evictLayout(remoteCallback, f, z);
    }

    androidx.compose.ui.RemoteCallback evictLayout(androidx.compose.ui.RemoteCallback remoteCallback, float f, boolean z);
}
