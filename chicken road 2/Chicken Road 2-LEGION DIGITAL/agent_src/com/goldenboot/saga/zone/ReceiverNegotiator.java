package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class ReceiverNegotiator {
    public static final ServerScheduler evictLayout = new ServerScheduler(15, 0, TriggerCustodian.detachStream(), 2, null);

    public static final PopupTunnel clipOrigin(boolean z, float f, long j, NotificationFence notificationFence, int i, int i2) {
        boolean z2 = true;
        if ((i2 & 1) != 0) {
            z = true;
        }
        if ((i2 & 2) != 0) {
            f = InsetsEdge.INSTANCE.releaseHeader();
        }
        if ((i2 & 4) != 0) {
            j = ContainerSource.INSTANCE.purgeNode();
        }
        if (MorphPatch.bindBody()) {
            MorphPatch.formatPosition(1635163520, i, -1, "androidx.compose.material.ripple.rememberRipple (Ripple.kt:146)");
        }
        MorphCreator notifyMessage = BounceReader.notifyMessage(ContainerSource.serializeOffset(j), notificationFence, (i >> 6) & 14);
        boolean z3 = (((i & 14) ^ 6) > 4 && notificationFence.injectMetric(z)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !notificationFence.flushSample(f)) && (i & 48) != 32) {
            z2 = false;
        }
        boolean z4 = z3 | z2;
        Object clipOrigin = notificationFence.clipOrigin();
        if (z4 || clipOrigin == NotificationFence.evictLayout.evictLayout()) {
            clipOrigin = new CoreRollback(z, f, notifyMessage, null);
            notificationFence.bindBody(clipOrigin);
        }
        CoreRollback coreRollback = (CoreRollback) clipOrigin;
        if (MorphPatch.bindBody()) {
            MorphPatch.startResource();
        }
        return coreRollback;
    }

    public static final ScrollArbitrator detachStream(StepperDiff stepperDiff) {
        return stepperDiff instanceof PatternLoader ? evictLayout : stepperDiff instanceof AnimOrchestrator ? new ServerScheduler(45, 0, TriggerCustodian.detachStream(), 2, null) : stepperDiff instanceof PaletteBeacon ? new ServerScheduler(45, 0, TriggerCustodian.detachStream(), 2, null) : evictLayout;
    }

    public static final CachedDeserializer injectMetric(PanelBlock panelBlock, boolean z, float f, EndpointSwitch endpointSwitch, ElevationNode elevationNode) {
        return HeaderHolder.detachStream(panelBlock, z, f, endpointSwitch, elevationNode);
    }

    public static final ScrollArbitrator releaseHeader(StepperDiff stepperDiff) {
        return stepperDiff instanceof PatternLoader ? evictLayout : stepperDiff instanceof AnimOrchestrator ? evictLayout : stepperDiff instanceof PaletteBeacon ? new ServerScheduler(150, 0, TriggerCustodian.detachStream(), 2, null) : evictLayout;
    }
}
