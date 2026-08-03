package com.ironsource;

/* loaded from: classes5.dex */
public final class T implements com.ironsource.Q, com.ironsource.Q.a {

    /* renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.locks.ReadWriteLock f5968a;
    private final java.util.Map<java.lang.String, com.ironsource.P> b;

    /* JADX WARN: Multi-variable type inference failed */
    public T() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.Q
    public com.ironsource.P a(java.lang.String adId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adId, "adId");
        this.f5968a.readLock().lock();
        try {
            return this.b.get(adId);
        } finally {
            this.f5968a.readLock().unlock();
        }
    }

    public T(java.util.concurrent.locks.ReadWriteLock readWriteLock) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readWriteLock, "readWriteLock");
        this.f5968a = readWriteLock;
        this.b = new java.util.LinkedHashMap();
    }

    @Override // com.ironsource.Q
    public java.util.List<com.ironsource.P> a() {
        this.f5968a.readLock().lock();
        java.util.List<com.ironsource.P> list = kotlin.collections.CollectionsKt.toList(this.b.values());
        this.f5968a.readLock().unlock();
        return list;
    }

    public /* synthetic */ T(java.util.concurrent.locks.ReadWriteLock readWriteLock, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new java.util.concurrent.locks.ReentrantReadWriteLock() : readWriteLock);
    }

    @Override // com.ironsource.Q.a
    public void a(com.ironsource.P adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f5968a.writeLock().lock();
        try {
            if (this.b.get(adInfo.c()) == null) {
                this.b.put(adInfo.c(), adInfo);
            }
        } finally {
            this.f5968a.writeLock().unlock();
        }
    }

    @Override // com.ironsource.Q.a
    public void a(org.json.JSONObject json, com.ironsource.EnumC3194o0 adStatus, java.lang.String adId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "json");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adStatus, "adStatus");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adId, "adId");
        this.f5968a.writeLock().lock();
        try {
            com.ironsource.P p = this.b.get(adId);
            if (p == null) {
                return;
            }
            java.lang.String bundleId = json.optString("bundleId");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bundleId, "bundleId");
            if (bundleId.length() > 0) {
                p.a(bundleId);
            }
            java.lang.String dynamicDemandSourceId = json.optString("dynamicDemandSource");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dynamicDemandSourceId, "dynamicDemandSourceId");
            if (dynamicDemandSourceId.length() > 0) {
                p.a(com.ironsource.R7.b.a(dynamicDemandSourceId));
            }
            p.a(adStatus);
        } finally {
            this.f5968a.writeLock().unlock();
        }
    }

    @Override // com.ironsource.Q.a
    public void a(com.ironsource.EnumC3194o0 adStatus, java.lang.String adId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adStatus, "adStatus");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adId, "adId");
        this.f5968a.writeLock().lock();
        try {
            com.ironsource.P p = this.b.get(adId);
            if (p == null) {
                return;
            }
            p.a(adStatus);
            p.a(java.lang.System.currentTimeMillis() / 1000.0d);
        } finally {
            this.f5968a.writeLock().unlock();
        }
    }
}
