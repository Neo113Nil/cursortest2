package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public interface ToastBinder {
    void applyTask();

    void clear();

    default void clipOrigin(IconExporter iconExporter, Object obj) {
        iconExporter.invoke(evictLayout(), obj);
    }

    void detachStream(Object obj);

    Object evictLayout();

    void growPayload(int i, int i2);

    void injectMetric(int i, Object obj);

    void popBlueprint(int i, Object obj);

    default void releaseHeader() {
        Object evictLayout = evictLayout();
        MarginBootstrapper marginBootstrapper = evictLayout instanceof MarginBootstrapper ? (MarginBootstrapper) evictLayout : null;
        if (marginBootstrapper != null) {
            marginBootstrapper.attachConfig();
        }
    }

    void updateTimer(int i, int i2, int i3);

    default void drawField() {
    }

    default void flushSample() {
    }
}
