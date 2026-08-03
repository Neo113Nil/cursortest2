package com.fyber.inneractive.sdk.external;

/* loaded from: classes3.dex */
public class InneractiveAdSpotManager {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f3650a = new java.util.concurrent.ConcurrentHashMap();

    public static void destroy() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = get().f3650a;
        java.util.Iterator it = concurrentHashMap.keySet().iterator();
        while (it.hasNext()) {
            com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot = (com.fyber.inneractive.sdk.external.InneractiveAdSpot) concurrentHashMap.get((java.lang.String) it.next());
            if (inneractiveAdSpot != null) {
                inneractiveAdSpot.destroy();
            }
        }
        concurrentHashMap.clear();
    }

    public static com.fyber.inneractive.sdk.external.InneractiveAdSpotManager get() {
        return com.fyber.inneractive.sdk.external.e.f3661a;
    }

    public void bindSpot(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot) {
        this.f3650a.put(inneractiveAdSpot.getLocalUniqueId(), inneractiveAdSpot);
    }

    public com.fyber.inneractive.sdk.external.InneractiveAdSpot createSpot() {
        com.fyber.inneractive.sdk.flow.h0 h0Var = new com.fyber.inneractive.sdk.flow.h0();
        this.f3650a.put(h0Var.f3703a, h0Var);
        return h0Var;
    }

    public com.fyber.inneractive.sdk.external.InneractiveAdSpot getSpot(java.lang.String str) {
        return (com.fyber.inneractive.sdk.external.InneractiveAdSpot) this.f3650a.get(str);
    }

    public void removeSpot(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f3650a;
        if (concurrentHashMap != null) {
            concurrentHashMap.remove(inneractiveAdSpot.getLocalUniqueId());
        }
    }
}
