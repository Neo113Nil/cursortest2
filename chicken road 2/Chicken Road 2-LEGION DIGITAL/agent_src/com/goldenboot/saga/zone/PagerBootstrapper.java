package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class PagerBootstrapper {
    public static final BridgeBuffer evictLayout = new ItemSyncer();
    public static final BridgeBuffer growPayload = injectMetric();

    public static BridgeBuffer evictLayout() {
        BridgeBuffer bridgeBuffer = growPayload;
        if (bridgeBuffer != null) {
            return bridgeBuffer;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static BridgeBuffer growPayload() {
        return evictLayout;
    }

    public static BridgeBuffer injectMetric() {
        try {
            return (BridgeBuffer) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
