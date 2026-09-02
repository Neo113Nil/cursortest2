package com.goldenboot.saga.zone;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class ElevationComposer {
    public static final DrawerBroadcaster evictLayout(AccentSequence accentSequence) {
        Intrinsics.checkNotNullParameter(accentSequence, "<this>");
        DrawerBroadcaster growPayload = EmitterInitializer.growPayload(accentSequence);
        if (growPayload != null) {
            return growPayload;
        }
        ScopeDrain.releaseHeader(accentSequence);
        throw new ShadowBroadcaster();
    }

    public static final DrawerBroadcaster growPayload(AccentSequence accentSequence) {
        Intrinsics.checkNotNullParameter(accentSequence, "<this>");
        DrawerBroadcaster growPayload = VibrationRestore.growPayload(accentSequence);
        return growPayload == null ? ProducerToggle.evictLayout(accentSequence) : growPayload;
    }
}
