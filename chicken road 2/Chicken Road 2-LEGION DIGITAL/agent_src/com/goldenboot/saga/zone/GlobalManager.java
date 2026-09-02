package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class GlobalManager {
    public static final DoubleTapCommand evictLayout(OwnerFormatter ownerFormatter, boolean z, NotificationFence notificationFence, int i) {
        if (MorphPatch.bindBody()) {
            MorphPatch.formatPosition(596174919, i, -1, "androidx.compose.foundation.lazy.rememberLazyListSemanticState (LazyListSemantics.kt:26)");
        }
        boolean z2 = ((((i & 14) ^ 6) > 4 && notificationFence.formatPosition(ownerFormatter)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && notificationFence.injectMetric(z)) || (i & 48) == 32);
        Object clipOrigin = notificationFence.clipOrigin();
        if (z2 || clipOrigin == NotificationFence.evictLayout.evictLayout()) {
            clipOrigin = CursorBroadcaster.evictLayout(ownerFormatter, z);
            notificationFence.bindBody(clipOrigin);
        }
        DoubleTapCommand doubleTapCommand = (DoubleTapCommand) clipOrigin;
        if (MorphPatch.bindBody()) {
            MorphPatch.startResource();
        }
        return doubleTapCommand;
    }
}
