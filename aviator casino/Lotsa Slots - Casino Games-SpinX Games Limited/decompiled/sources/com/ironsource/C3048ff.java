package com.ironsource;

/* renamed from: com.ironsource.ff, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3048ff implements com.ironsource.M8, com.ironsource.M8.a {

    /* renamed from: a, reason: collision with root package name */
    private java.util.Map<java.lang.String, com.ironsource.C3372y> f6265a = new java.util.LinkedHashMap();
    private final com.ironsource.C3188nc b = new com.ironsource.C3188nc();
    private final java.util.concurrent.locks.ReadWriteLock c = new java.util.concurrent.locks.ReentrantReadWriteLock();

    /* renamed from: com.ironsource.ff$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6266a;

        static {
            int[] iArr = new int[com.ironsource.EnumC3030ef.values().length];
            try {
                iArr[com.ironsource.EnumC3030ef.CurrentlyLoadedAdsAndFullHistory.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.ironsource.EnumC3030ef.CurrentlyLoadedAds.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.ironsource.EnumC3030ef.Off.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            f6266a = iArr;
        }
    }

    private final void b() {
        com.ironsource.C3012df configuration = com.ironsource.sdk.controller.FeaturesManager.getInstance().getSessionHistoryConfig();
        com.ironsource.C3188nc c3188nc = this.b;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(configuration, "configuration");
        c3188nc.a(a(configuration));
        this.b.a(a());
    }

    @Override // com.ironsource.M8.a
    public void a(com.ironsource.AbstractC3066gf historyRecord) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(historyRecord, "historyRecord");
        this.c.writeLock().lock();
        try {
            com.ironsource.P a2 = historyRecord.a();
            java.lang.String valueOf = java.lang.String.valueOf(a2 != null ? a2.b() : null);
            java.util.Map<java.lang.String, com.ironsource.C3372y> map = this.f6265a;
            com.ironsource.C3372y c3372y = map.get(valueOf);
            if (c3372y == null) {
                c3372y = new com.ironsource.C3372y();
                map.put(valueOf, c3372y);
            }
            c3372y.a(historyRecord.a(new com.ironsource.C3173mf()));
            this.c.writeLock().unlock();
            b();
        } catch (java.lang.Throwable th) {
            this.c.writeLock().unlock();
            throw th;
        }
    }

    @Override // com.ironsource.M8
    public org.json.JSONObject a(com.ironsource.EnumC3227pf mode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mode, "mode");
        this.c.readLock().lock();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            for (java.util.Map.Entry<java.lang.String, com.ironsource.C3372y> entry : this.f6265a.entrySet()) {
                java.lang.String key = entry.getKey();
                org.json.JSONObject a2 = entry.getValue().a(mode);
                if (a2.length() > 0) {
                    jSONObject.put(key, a2);
                }
            }
            return jSONObject;
        } finally {
            this.c.readLock().unlock();
        }
    }

    @Override // com.ironsource.M8
    public int a(com.ironsource.mediationsdk.IronSource.a adFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        this.c.readLock().lock();
        try {
            com.ironsource.C3372y c3372y = this.f6265a.get(adFormat.toString());
            return c3372y != null ? c3372y.a() : 0;
        } finally {
            this.c.readLock().unlock();
        }
    }

    @Override // com.ironsource.M8
    public java.util.List<java.lang.String> a() {
        this.c.readLock().lock();
        try {
            java.util.Map<java.lang.String, com.ironsource.C3372y> map = this.f6265a;
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (java.util.Map.Entry<java.lang.String, com.ironsource.C3372y> entry : map.entrySet()) {
                if (entry.getValue().b()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return kotlin.collections.CollectionsKt.toList(linkedHashMap.keySet());
        } finally {
            this.c.readLock().unlock();
        }
    }

    @Override // com.ironsource.M8
    public java.util.Map<java.lang.String, org.json.JSONObject> a(com.ironsource.C3012df configuration) {
        java.util.Map<java.lang.String, org.json.JSONObject> mutableMapOf;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.c.readLock().lock();
        try {
            int i = com.ironsource.C3048ff.a.f6266a[configuration.a().ordinal()];
            if (i == 1) {
                mutableMapOf = kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to(com.ironsource.M6.B1, a(com.ironsource.EnumC3227pf.FullHistory)), kotlin.TuplesKt.to(com.ironsource.M6.C1, a(com.ironsource.EnumC3227pf.CurrentlyLoadedAds)));
            } else if (i == 2) {
                mutableMapOf = kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to(com.ironsource.M6.C1, a(com.ironsource.EnumC3227pf.CurrentlyLoadedAds)));
            } else {
                if (i != 3) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                mutableMapOf = kotlin.collections.MapsKt.emptyMap();
            }
            return mutableMapOf;
        } finally {
            this.c.readLock().unlock();
        }
    }
}
