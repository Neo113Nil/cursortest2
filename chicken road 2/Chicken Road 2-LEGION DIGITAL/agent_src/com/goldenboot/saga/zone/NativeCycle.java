package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class NativeCycle {
    public static final StartupBuffer evictLayout = RippleQueue.flushSample(0.0f, 0.0f, null, 7, null);

    public static final MorphCreator evictLayout(long j, ScrollArbitrator scrollArbitrator, String str, TouchRecord touchRecord, NotificationFence notificationFence, int i, int i2) {
        if ((i2 & 2) != 0) {
            scrollArbitrator = evictLayout;
        }
        ScrollArbitrator scrollArbitrator2 = scrollArbitrator;
        if ((i2 & 4) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        if ((i2 & 8) != 0) {
            touchRecord = null;
        }
        TouchRecord touchRecord2 = touchRecord;
        if (MorphPatch.bindBody()) {
            MorphPatch.formatPosition(-451899108, i, -1, "androidx.compose.animation.animateColorAsState (SingleValueAnimation.kt:61)");
        }
        boolean formatPosition = notificationFence.formatPosition(ContainerSource.injectConstraint(j));
        Object clipOrigin = notificationFence.clipOrigin();
        if (formatPosition || clipOrigin == NotificationFence.evictLayout.evictLayout()) {
            clipOrigin = (GestureInitializer) PaddingProvider.evictLayout(ContainerSource.INSTANCE).invoke(ContainerSource.injectConstraint(j));
            notificationFence.bindBody(clipOrigin);
        }
        int i3 = i << 6;
        MorphCreator detachStream = TooltipReceiver.detachStream(ContainerSource.serializeOffset(j), (GestureInitializer) clipOrigin, scrollArbitrator2, null, str2, touchRecord2, notificationFence, (i & 14) | ((i << 3) & 896) | (57344 & i3) | (i3 & 458752), 8);
        if (MorphPatch.bindBody()) {
            MorphPatch.startResource();
        }
        return detachStream;
    }
}
