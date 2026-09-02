package com.goldenboot.saga.zone;

import com.goldenboot.saga.zone.ServerLogger;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public interface VibrationShaper {
    void onSupportActionModeFinished(ServerLogger serverLogger);

    void onSupportActionModeStarted(ServerLogger serverLogger);

    ServerLogger onWindowStartingSupportActionMode(ServerLogger.ActivityMutator activityMutator);
}
