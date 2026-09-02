package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract /* synthetic */ class ThemeReceiver {
    public static final NativeSyncer evictLayout = new NativeSyncer();
    public static final NativeSyncer growPayload = new NativeSyncer();

    public static final MorphCreator detachStream(BounceFacilitator bounceFacilitator, ElevationNode elevationNode) {
        return new SetupWriter(elevationNode, bounceFacilitator);
    }

    public static final PluginScheduler growPayload() {
        NativeSyncer nativeSyncer = growPayload;
        PluginScheduler pluginScheduler = (PluginScheduler) nativeSyncer.evictLayout();
        if (pluginScheduler != null) {
            return pluginScheduler;
        }
        PluginScheduler pluginScheduler2 = new PluginScheduler(new AlarmInteractor[0], 0);
        nativeSyncer.growPayload(pluginScheduler2);
        return pluginScheduler2;
    }

    public static final MorphCreator injectMetric(ElevationNode elevationNode) {
        return new SetupWriter(elevationNode, null);
    }
}
