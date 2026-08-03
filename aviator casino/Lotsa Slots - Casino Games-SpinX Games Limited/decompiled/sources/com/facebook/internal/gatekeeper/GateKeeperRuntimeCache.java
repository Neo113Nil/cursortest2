package com.facebook.internal.gatekeeper;

/* compiled from: GateKeeperRuntimeCache.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t2\f\b\u0002\u0010\n\u001a\u00060\u0005j\u0002`\u0006J\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00072\f\b\u0002\u0010\n\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\f\u001a\u00020\u0005J$\u0010\r\u001a\u00020\u000e2\f\b\u0002\u0010\n\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eJ\u0014\u0010\u0010\u001a\u00020\u00112\f\b\u0002\u0010\n\u001a\u00060\u0005j\u0002`\u0006J\u001c\u0010\u0012\u001a\u00020\u00112\f\b\u0002\u0010\n\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0013\u001a\u00020\u0007J$\u0010\u0014\u001a\u00020\u00112\f\b\u0002\u0010\n\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u000eJ\"\u0010\u0016\u001a\u00020\u00112\f\b\u0002\u0010\n\u001a\u00060\u0005j\u0002`\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\tR*\u0010\u0003\u001a\u001e\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/facebook/internal/gatekeeper/GateKeeperRuntimeCache;", "", "()V", "gateKeepers", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/facebook/internal/gatekeeper/AppID;", "Lcom/facebook/internal/gatekeeper/GateKeeper;", "dumpGateKeepers", "", com.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.APP_ID, "getGateKeeper", "name", "getGateKeeperValue", "", "defaultValue", "resetCache", "", "setGateKeeper", "gateKeeper", "setGateKeeperValue", "value", "setGateKeepers", "gateKeeperList", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class GateKeeperRuntimeCache {
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.ConcurrentHashMap<java.lang.String, com.facebook.internal.gatekeeper.GateKeeper>> gateKeepers = new java.util.concurrent.ConcurrentHashMap<>();

    public static /* synthetic */ void setGateKeepers$default(com.facebook.internal.gatekeeper.GateKeeperRuntimeCache gateKeeperRuntimeCache, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            str = com.facebook.FacebookSdk.getApplicationId();
        }
        gateKeeperRuntimeCache.setGateKeepers(str, list);
    }

    public final void setGateKeepers(java.lang.String appId, java.util.List<com.facebook.internal.gatekeeper.GateKeeper> gateKeeperList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appId, "appId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gateKeeperList, "gateKeeperList");
        java.util.concurrent.ConcurrentHashMap<java.lang.String, com.facebook.internal.gatekeeper.GateKeeper> concurrentHashMap = new java.util.concurrent.ConcurrentHashMap<>();
        for (com.facebook.internal.gatekeeper.GateKeeper gateKeeper : gateKeeperList) {
            concurrentHashMap.put(gateKeeper.getName(), gateKeeper);
        }
        this.gateKeepers.put(appId, concurrentHashMap);
    }

    public static /* synthetic */ java.util.List dumpGateKeepers$default(com.facebook.internal.gatekeeper.GateKeeperRuntimeCache gateKeeperRuntimeCache, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            str = com.facebook.FacebookSdk.getApplicationId();
        }
        return gateKeeperRuntimeCache.dumpGateKeepers(str);
    }

    public final java.util.List<com.facebook.internal.gatekeeper.GateKeeper> dumpGateKeepers(java.lang.String appId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appId, "appId");
        java.util.concurrent.ConcurrentHashMap<java.lang.String, com.facebook.internal.gatekeeper.GateKeeper> concurrentHashMap = this.gateKeepers.get(appId);
        if (concurrentHashMap == null) {
            return null;
        }
        java.util.concurrent.ConcurrentHashMap<java.lang.String, com.facebook.internal.gatekeeper.GateKeeper> concurrentHashMap2 = concurrentHashMap;
        java.util.ArrayList arrayList = new java.util.ArrayList(concurrentHashMap2.size());
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.facebook.internal.gatekeeper.GateKeeper>> it = concurrentHashMap2.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue());
        }
        return arrayList;
    }

    public static /* synthetic */ boolean getGateKeeperValue$default(com.facebook.internal.gatekeeper.GateKeeperRuntimeCache gateKeeperRuntimeCache, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            str = com.facebook.FacebookSdk.getApplicationId();
        }
        return gateKeeperRuntimeCache.getGateKeeperValue(str, str2, z);
    }

    public final boolean getGateKeeperValue(java.lang.String appId, java.lang.String name, boolean defaultValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appId, "appId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        com.facebook.internal.gatekeeper.GateKeeper gateKeeper = getGateKeeper(appId, name);
        return gateKeeper == null ? defaultValue : gateKeeper.getValue();
    }

    public static /* synthetic */ void setGateKeeperValue$default(com.facebook.internal.gatekeeper.GateKeeperRuntimeCache gateKeeperRuntimeCache, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            str = com.facebook.FacebookSdk.getApplicationId();
        }
        gateKeeperRuntimeCache.setGateKeeperValue(str, str2, z);
    }

    public final void setGateKeeperValue(java.lang.String appId, java.lang.String name, boolean value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appId, "appId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        setGateKeeper(appId, new com.facebook.internal.gatekeeper.GateKeeper(name, value));
    }

    public static /* synthetic */ com.facebook.internal.gatekeeper.GateKeeper getGateKeeper$default(com.facebook.internal.gatekeeper.GateKeeperRuntimeCache gateKeeperRuntimeCache, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            str = com.facebook.FacebookSdk.getApplicationId();
        }
        return gateKeeperRuntimeCache.getGateKeeper(str, str2);
    }

    public final com.facebook.internal.gatekeeper.GateKeeper getGateKeeper(java.lang.String appId, java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appId, "appId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        java.util.concurrent.ConcurrentHashMap<java.lang.String, com.facebook.internal.gatekeeper.GateKeeper> concurrentHashMap = this.gateKeepers.get(appId);
        if (concurrentHashMap == null) {
            return null;
        }
        return concurrentHashMap.get(name);
    }

    public static /* synthetic */ void setGateKeeper$default(com.facebook.internal.gatekeeper.GateKeeperRuntimeCache gateKeeperRuntimeCache, java.lang.String str, com.facebook.internal.gatekeeper.GateKeeper gateKeeper, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            str = com.facebook.FacebookSdk.getApplicationId();
        }
        gateKeeperRuntimeCache.setGateKeeper(str, gateKeeper);
    }

    public final void setGateKeeper(java.lang.String appId, com.facebook.internal.gatekeeper.GateKeeper gateKeeper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appId, "appId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gateKeeper, "gateKeeper");
        if (!this.gateKeepers.containsKey(appId)) {
            this.gateKeepers.put(appId, new java.util.concurrent.ConcurrentHashMap<>());
        }
        java.util.concurrent.ConcurrentHashMap<java.lang.String, com.facebook.internal.gatekeeper.GateKeeper> concurrentHashMap = this.gateKeepers.get(appId);
        if (concurrentHashMap == null) {
            return;
        }
        concurrentHashMap.put(gateKeeper.getName(), gateKeeper);
    }

    public static /* synthetic */ void resetCache$default(com.facebook.internal.gatekeeper.GateKeeperRuntimeCache gateKeeperRuntimeCache, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            str = com.facebook.FacebookSdk.getApplicationId();
        }
        gateKeeperRuntimeCache.resetCache(str);
    }

    public final void resetCache(java.lang.String appId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appId, "appId");
        this.gateKeepers.remove(appId);
    }
}
