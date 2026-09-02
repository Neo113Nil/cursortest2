package com.goldenboot.saga.zone;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class WatcherAdministrator {
    public static final WatcherAdministrator injectMetric = new WatcherAdministrator();
    public final ConcurrentMap growPayload = new ConcurrentHashMap();
    public final CellAssembler evictLayout = new PrimarySensor();

    public static WatcherAdministrator evictLayout() {
        return injectMetric;
    }

    public ColorRestore detachStream(Object obj) {
        return injectMetric(obj.getClass());
    }

    public ColorRestore growPayload(Class cls, ColorRestore colorRestore) {
        ProxyTask.growPayload(cls, "messageType");
        ProxyTask.growPayload(colorRestore, "schema");
        return (ColorRestore) this.growPayload.putIfAbsent(cls, colorRestore);
    }

    public ColorRestore injectMetric(Class cls) {
        ColorRestore growPayload;
        ProxyTask.growPayload(cls, "messageType");
        ColorRestore colorRestore = (ColorRestore) this.growPayload.get(cls);
        return (colorRestore != null || (growPayload = growPayload(cls, (colorRestore = this.evictLayout.evictLayout(cls)))) == null) ? colorRestore : growPayload;
    }
}
