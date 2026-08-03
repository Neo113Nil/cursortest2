package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Ol implements io.appmetrica.analytics.impl.Pl {

    /* renamed from: k, reason: collision with root package name */
    public static final java.util.Map f4786k = java.util.Collections.unmodifiableMap(new io.appmetrica.analytics.impl.Ll());

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f4787a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0801wi f4788b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Wl f4789c;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f4790d;

    /* renamed from: e, reason: collision with root package name */
    public io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger f4791e;

    /* renamed from: f, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Ml f4792f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Object f4793g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.WeakHashMap f4794h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.HashMap f4795i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4796j;

    public Ol(android.content.Context context, io.appmetrica.analytics.impl.C0801wi c0801wi, io.appmetrica.analytics.impl.Ve ve, android.os.Handler handler) {
        this(c0801wi, new io.appmetrica.analytics.impl.Wl(context, ve), handler);
    }

    public final void a(io.appmetrica.analytics.StartupParamsCallback startupParamsCallback, java.util.List<java.lang.String> list, java.util.Map<java.lang.String, java.lang.String> map) {
        synchronized (this.f4793g) {
            try {
                io.appmetrica.analytics.impl.Wl wl = this.f4789c;
                wl.getClass();
                if (!io.appmetrica.analytics.impl.AbstractC0522lo.a((java.util.Map) map) && !io.appmetrica.analytics.impl.AbstractC0522lo.a(map, wl.f5234e)) {
                    wl.f5234e = new java.util.HashMap(map);
                    wl.f5236g = true;
                    wl.c();
                }
                a(startupParamsCallback, list);
                if (this.f4789c.a((java.util.List) list)) {
                    a(list, new io.appmetrica.analytics.impl.Nl(this, startupParamsCallback), map, true);
                } else {
                    a(new android.os.Bundle(), startupParamsCallback);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00b4 A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:4:0x0063, B:6:0x0071, B:9:0x0085, B:11:0x00b4, B:12:0x00bb, B:14:0x00c1, B:15:0x00c8, B:17:0x00dd, B:19:0x00e8, B:20:0x00f4, B:26:0x00e2, B:27:0x0082), top: B:3:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00c1 A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:4:0x0063, B:6:0x0071, B:9:0x0085, B:11:0x00b4, B:12:0x00bb, B:14:0x00c1, B:15:0x00c8, B:17:0x00dd, B:19:0x00e8, B:20:0x00f4, B:26:0x00e2, B:27:0x0082), top: B:3:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00dd A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:4:0x0063, B:6:0x0071, B:9:0x0085, B:11:0x00b4, B:12:0x00bb, B:14:0x00c1, B:15:0x00c8, B:17:0x00dd, B:19:0x00e8, B:20:0x00f4, B:26:0x00e2, B:27:0x0082), top: B:3:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e8 A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:4:0x0063, B:6:0x0071, B:9:0x0085, B:11:0x00b4, B:12:0x00bb, B:14:0x00c1, B:15:0x00c8, B:17:0x00dd, B:19:0x00e8, B:20:0x00f4, B:26:0x00e2, B:27:0x0082), top: B:3:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e2 A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:4:0x0063, B:6:0x0071, B:9:0x0085, B:11:0x00b4, B:12:0x00bb, B:14:0x00c1, B:15:0x00c8, B:17:0x00dd, B:19:0x00e8, B:20:0x00f4, B:26:0x00e2, B:27:0x0082), top: B:3:0x0063 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(android.os.Bundle bundle) {
        java.util.HashMap hashMap;
        java.util.HashMap a2;
        io.appmetrica.analytics.internal.IdentifiersResult a3 = io.appmetrica.analytics.impl.S3.a(bundle, "Uuid");
        io.appmetrica.analytics.internal.IdentifiersResult a4 = io.appmetrica.analytics.impl.S3.a(bundle, "DeviceId");
        io.appmetrica.analytics.internal.IdentifiersResult a5 = io.appmetrica.analytics.impl.S3.a(bundle, "DeviceIdHash");
        io.appmetrica.analytics.internal.IdentifiersResult a6 = io.appmetrica.analytics.impl.S3.a(bundle, "AdUrlReport");
        io.appmetrica.analytics.internal.IdentifiersResult a7 = io.appmetrica.analytics.impl.S3.a(bundle, "AdUrlGet");
        io.appmetrica.analytics.internal.IdentifiersResult a8 = io.appmetrica.analytics.impl.S3.a(bundle, "Clids");
        io.appmetrica.analytics.internal.IdentifiersResult a9 = io.appmetrica.analytics.impl.S3.a(bundle, "RequestClids");
        io.appmetrica.analytics.internal.IdentifiersResult a10 = io.appmetrica.analytics.impl.S3.a(bundle, "GAID");
        io.appmetrica.analytics.internal.IdentifiersResult a11 = io.appmetrica.analytics.impl.S3.a(bundle, "HOAID");
        io.appmetrica.analytics.internal.IdentifiersResult a12 = io.appmetrica.analytics.impl.S3.a(bundle, "YANDEX_ADV_ID");
        io.appmetrica.analytics.internal.IdentifiersResult a13 = io.appmetrica.analytics.impl.S3.a(bundle, "CUSTOM_SDK_HOSTS");
        long j2 = bundle.getLong("ServerTimeOffset");
        long j3 = bundle.getLong("NextStartupTime");
        io.appmetrica.analytics.impl.V9 a14 = io.appmetrica.analytics.impl.S3.a(bundle);
        android.os.Bundle bundle2 = bundle.getBundle("module_configs");
        io.appmetrica.analytics.impl.Wl wl = this.f4789c;
        synchronized (wl) {
            try {
                io.appmetrica.analytics.internal.IdentifiersResult identifiersResult = (io.appmetrica.analytics.internal.IdentifiersResult) wl.f5231b.get(io.appmetrica.analytics.StartupParamsCallback.APPMETRICA_UUID);
                if (identifiersResult != null) {
                    io.appmetrica.analytics.impl.C0626po c0626po = wl.f5244o;
                    java.lang.String str = identifiersResult.id;
                    c0626po.getClass();
                    if (io.appmetrica.analytics.impl.C0626po.a(str)) {
                        wl.a(io.appmetrica.analytics.StartupParamsCallback.APPMETRICA_DEVICE_ID, a4);
                        wl.a(io.appmetrica.analytics.StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, a5);
                        wl.f5231b.put("appmetrica_google_adv_id", a10);
                        wl.f5231b.put("appmetrica_huawei_oaid", a11);
                        wl.f5231b.put("appmetrica_yandex_adv_id", a12);
                        wl.f5241l.a(a13);
                        wl.f5242m.a(a14);
                        if (!io.appmetrica.analytics.impl.Wl.a(a7)) {
                            wl.f5231b.put("appmetrica_get_ad_url", a7);
                        }
                        if (!io.appmetrica.analytics.impl.Wl.a(a6)) {
                            wl.f5231b.put("appmetrica_report_ad_url", a6);
                        }
                        wl.f5235f = j2;
                        io.appmetrica.analytics.impl.C3 c3 = wl.f5240k;
                        hashMap = wl.f5234e;
                        a2 = io.appmetrica.analytics.impl.AbstractC0380gb.a(a9.id);
                        c3.getClass();
                        if (!io.appmetrica.analytics.impl.AbstractC0522lo.a((java.util.Map) hashMap) ? io.appmetrica.analytics.impl.AbstractC0522lo.a((java.util.Map) a2) : hashMap.equals(a2)) {
                            wl.f5231b.put("appmetrica_clids", a8);
                            wl.f5236g = false;
                        }
                        wl.f5237h = j3;
                        wl.c();
                    }
                }
                wl.c(a3);
                wl.a(io.appmetrica.analytics.StartupParamsCallback.APPMETRICA_DEVICE_ID, a4);
                wl.a(io.appmetrica.analytics.StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, a5);
                wl.f5231b.put("appmetrica_google_adv_id", a10);
                wl.f5231b.put("appmetrica_huawei_oaid", a11);
                wl.f5231b.put("appmetrica_yandex_adv_id", a12);
                wl.f5241l.a(a13);
                wl.f5242m.a(a14);
                if (!io.appmetrica.analytics.impl.Wl.a(a7)) {
                }
                if (!io.appmetrica.analytics.impl.Wl.a(a6)) {
                }
                wl.f5235f = j2;
                io.appmetrica.analytics.impl.C3 c32 = wl.f5240k;
                hashMap = wl.f5234e;
                a2 = io.appmetrica.analytics.impl.AbstractC0380gb.a(a9.id);
                c32.getClass();
                if (!io.appmetrica.analytics.impl.AbstractC0522lo.a((java.util.Map) hashMap) ? io.appmetrica.analytics.impl.AbstractC0522lo.a((java.util.Map) a2) : hashMap.equals(a2)) {
                }
                wl.f5237h = j3;
                wl.c();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        io.appmetrica.analytics.impl.C0244b4.l().m().a(bundle2, new io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers(a3.id, a4.id, a5.id));
        h();
    }

    public final io.appmetrica.analytics.impl.A6 c() {
        return this.f4792f;
    }

    public final java.lang.String d() {
        io.appmetrica.analytics.internal.IdentifiersResult identifiersResult = (io.appmetrica.analytics.internal.IdentifiersResult) this.f4789c.f5231b.get(io.appmetrica.analytics.StartupParamsCallback.APPMETRICA_DEVICE_ID);
        if (identifiersResult == null) {
            return null;
        }
        return identifiersResult.id;
    }

    public final io.appmetrica.analytics.impl.X9 e() {
        io.appmetrica.analytics.impl.V9 v9;
        io.appmetrica.analytics.impl.Wl wl = this.f4789c;
        io.appmetrica.analytics.impl.S9 s9 = wl.f5243n;
        io.appmetrica.analytics.impl.T9 t9 = wl.f5242m;
        synchronized (t9) {
            v9 = t9.f5011b;
        }
        s9.getClass();
        java.lang.Boolean bool = v9.f5134a;
        return new io.appmetrica.analytics.impl.X9();
    }

    public final long f() {
        return this.f4789c.f5235f;
    }

    public final java.lang.String g() {
        io.appmetrica.analytics.internal.IdentifiersResult identifiersResult = (io.appmetrica.analytics.internal.IdentifiersResult) this.f4789c.f5231b.get(io.appmetrica.analytics.StartupParamsCallback.APPMETRICA_UUID);
        if (identifiersResult == null) {
            return null;
        }
        return identifiersResult.id;
    }

    public final void h() {
        java.util.WeakHashMap weakHashMap = new java.util.WeakHashMap();
        for (java.util.Map.Entry entry : this.f4794h.entrySet()) {
            java.util.List list = (java.util.List) entry.getValue();
            if (this.f4789c.a((java.util.Collection) list)) {
                weakHashMap.put((io.appmetrica.analytics.StartupParamsCallback) entry.getKey(), list);
            }
        }
        java.util.Iterator it = weakHashMap.entrySet().iterator();
        while (it.hasNext()) {
            io.appmetrica.analytics.StartupParamsCallback startupParamsCallback = (io.appmetrica.analytics.StartupParamsCallback) ((java.util.Map.Entry) it.next()).getKey();
            if (startupParamsCallback != null) {
                a(new android.os.Bundle(), startupParamsCallback);
            }
        }
        weakHashMap.clear();
    }

    public final void i() {
        synchronized (this.f4793g) {
            try {
                if (this.f4796j) {
                    if (this.f4789c.b()) {
                    }
                }
                this.f4796j = true;
                a(this.f4787a, this.f4792f, this.f4795i, false);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public Ol(io.appmetrica.analytics.impl.C0801wi c0801wi, io.appmetrica.analytics.impl.Wl wl, android.os.Handler handler) {
        this.f4787a = java.util.Arrays.asList(io.appmetrica.analytics.StartupParamsCallback.APPMETRICA_UUID, io.appmetrica.analytics.StartupParamsCallback.APPMETRICA_DEVICE_ID, io.appmetrica.analytics.StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, "appmetrica_get_ad_url", "appmetrica_report_ad_url", "appmetrica_clids");
        this.f4793g = new java.lang.Object();
        this.f4794h = new java.util.WeakHashMap();
        this.f4796j = false;
        this.f4788b = c0801wi;
        this.f4789c = wl;
        this.f4790d = handler;
        this.f4792f = new io.appmetrica.analytics.impl.Ml(this);
    }

    public final void a(android.os.Bundle bundle) {
        b(bundle, null);
    }

    public final void a(io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger publicLogger) {
        this.f4791e = publicLogger;
    }

    public final void a(java.util.List list, io.appmetrica.analytics.impl.A6 a6, java.util.Map map, boolean z2) {
        io.appmetrica.analytics.impl.B6 b6 = new io.appmetrica.analytics.impl.B6(this.f4790d, a6);
        io.appmetrica.analytics.impl.C0801wi c0801wi = this.f4788b;
        c0801wi.getClass();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("io.appmetrica.analytics.impl.IdentifiersData", new io.appmetrica.analytics.impl.Xa(b6, list, map, z2));
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_UNDEFINED;
        io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger anonymousInstance = io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger.getAnonymousInstance();
        java.util.Set set = io.appmetrica.analytics.impl.AbstractC0792w9.f7005a;
        io.appmetrica.analytics.impl.M3 m3 = new io.appmetrica.analytics.impl.M3("", "", 1536, 0, anonymousInstance);
        m3.f4825m = bundle;
        io.appmetrica.analytics.impl.F4 f4 = c0801wi.f7025a;
        c0801wi.a(io.appmetrica.analytics.impl.C0801wi.a(m3, f4), f4, 1, (java.util.Map) null);
    }

    public final void a(java.util.Map<java.lang.String, java.lang.String> map) {
        if (io.appmetrica.analytics.impl.AbstractC0522lo.a((java.util.Map) map)) {
            return;
        }
        synchronized (this.f4793g) {
            try {
                java.util.HashMap b2 = io.appmetrica.analytics.impl.Fm.b(map);
                this.f4795i = b2;
                this.f4788b.a(b2);
                io.appmetrica.analytics.impl.Wl wl = this.f4789c;
                wl.getClass();
                if (!io.appmetrica.analytics.impl.AbstractC0522lo.a((java.util.Map) b2) && !io.appmetrica.analytics.impl.AbstractC0522lo.a(b2, wl.f5234e)) {
                    wl.f5234e = new java.util.HashMap(b2);
                    wl.f5236g = true;
                    wl.c();
                }
            } finally {
            }
        }
    }

    public final void a(java.lang.String str) {
        synchronized (this.f4793g) {
            this.f4788b.a(str);
        }
    }

    public final void a(android.os.Bundle bundle, io.appmetrica.analytics.StartupParamsCallback startupParamsCallback) {
        io.appmetrica.analytics.impl.Jl jl;
        if (this.f4794h.containsKey(startupParamsCallback)) {
            java.util.List list = (java.util.List) this.f4794h.get(startupParamsCallback);
            if (this.f4789c.a((java.util.Collection) list)) {
                startupParamsCallback.onReceive(a(list));
            } else {
                io.appmetrica.analytics.StartupParamsCallback.Reason reason = null;
                if (bundle.containsKey("startup_error_key_code")) {
                    int i2 = bundle.getInt("startup_error_key_code");
                    jl = io.appmetrica.analytics.impl.Jl.UNKNOWN;
                    if (i2 == 1) {
                        jl = io.appmetrica.analytics.impl.Jl.NETWORK;
                    } else if (i2 == 2) {
                        jl = io.appmetrica.analytics.impl.Jl.PARSE;
                    }
                } else {
                    jl = null;
                }
                if (jl == null) {
                    if (!this.f4789c.a()) {
                        io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger publicLogger = this.f4791e;
                        if (publicLogger != null) {
                            publicLogger.warning("Clids error. Passed clids: %s, and clids from server are empty.", this.f4795i);
                        }
                        reason = new io.appmetrica.analytics.StartupParamsCallback.Reason("INCONSISTENT_CLIDS");
                    } else {
                        jl = io.appmetrica.analytics.impl.Jl.UNKNOWN;
                    }
                }
                if (reason == null) {
                    reason = (io.appmetrica.analytics.StartupParamsCallback.Reason) io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.getOrDefault(f4786k, jl, io.appmetrica.analytics.StartupParamsCallback.Reason.UNKNOWN);
                }
                startupParamsCallback.onRequestError(reason, a(list));
            }
            this.f4794h.remove(startupParamsCallback);
            if (this.f4794h.isEmpty()) {
                io.appmetrica.analytics.impl.C0602p0 c0602p0 = this.f4788b.f7028d;
                synchronized (c0602p0.f6616f) {
                    c0602p0.f6613c = false;
                    c0602p0.c();
                }
            }
        }
    }

    public final void b(android.os.Bundle bundle, io.appmetrica.analytics.StartupParamsCallback startupParamsCallback) {
        synchronized (this.f4793g) {
            try {
                b(bundle);
                h();
                if (startupParamsCallback != null) {
                    a(bundle, startupParamsCallback);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void b(java.util.List<java.lang.String> list) {
        synchronized (this.f4793g) {
            try {
                java.util.List list2 = this.f4789c.f5233d;
                if (io.appmetrica.analytics.impl.AbstractC0522lo.a((java.util.Collection) list)) {
                    if (!io.appmetrica.analytics.impl.AbstractC0522lo.a((java.util.Collection) list2)) {
                        io.appmetrica.analytics.impl.Wl wl = this.f4789c;
                        wl.f5233d = null;
                        wl.f5238i.a((java.util.List<java.lang.String>) null);
                        this.f4788b.a((java.util.List) null);
                    }
                } else if (!io.appmetrica.analytics.impl.AbstractC0522lo.a(list, list2)) {
                    io.appmetrica.analytics.impl.Wl wl2 = this.f4789c;
                    wl2.f5233d = list;
                    wl2.f5238i.a(list);
                    this.f4788b.a(list);
                } else {
                    this.f4788b.a(list2);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final io.appmetrica.analytics.StartupParamsCallback.Result a(java.util.List list) {
        java.util.HashMap hashMap = new java.util.HashMap();
        io.appmetrica.analytics.impl.Wl wl = this.f4789c;
        synchronized (wl) {
            try {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    java.lang.String str = (java.lang.String) it.next();
                    io.appmetrica.analytics.internal.IdentifiersResult identifiersResult = (io.appmetrica.analytics.internal.IdentifiersResult) wl.f5231b.get(str);
                    if (identifiersResult != null) {
                        hashMap.put(str, wl.f5232c.a(identifiersResult));
                    }
                }
                wl.f5241l.a(list, hashMap);
                wl.f5242m.a(list, hashMap);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return new io.appmetrica.analytics.StartupParamsCallback.Result(hashMap);
    }

    public final void b(java.lang.String str) {
        synchronized (this.f4793g) {
            this.f4788b.b(str);
        }
    }

    public final java.util.Map<java.lang.String, java.lang.String> b() {
        io.appmetrica.analytics.internal.IdentifiersResult identifiersResult = (io.appmetrica.analytics.internal.IdentifiersResult) this.f4789c.f5231b.get("appmetrica_clids");
        java.lang.String str = identifiersResult == null ? null : identifiersResult.id;
        if (!android.text.TextUtils.isEmpty(str)) {
            return io.appmetrica.analytics.impl.AbstractC0380gb.a(str);
        }
        return this.f4795i;
    }

    public final void a(io.appmetrica.analytics.StartupParamsCallback startupParamsCallback, java.util.List list) {
        if (this.f4794h.isEmpty()) {
            io.appmetrica.analytics.impl.C0602p0 c0602p0 = this.f4788b.f7028d;
            synchronized (c0602p0.f6616f) {
                c0602p0.f6613c = true;
                c0602p0.b();
            }
        }
        this.f4794h.put(startupParamsCallback, list);
    }

    public final io.appmetrica.analytics.AdvIdentifiersResult a() {
        io.appmetrica.analytics.impl.Wl wl = this.f4789c;
        io.appmetrica.analytics.impl.P p2 = wl.f5239j;
        io.appmetrica.analytics.internal.IdentifiersResult identifiersResult = (io.appmetrica.analytics.internal.IdentifiersResult) wl.f5231b.get("appmetrica_google_adv_id");
        io.appmetrica.analytics.internal.IdentifiersResult identifiersResult2 = (io.appmetrica.analytics.internal.IdentifiersResult) wl.f5231b.get("appmetrica_huawei_oaid");
        io.appmetrica.analytics.internal.IdentifiersResult identifiersResult3 = (io.appmetrica.analytics.internal.IdentifiersResult) wl.f5231b.get("appmetrica_yandex_adv_id");
        p2.getClass();
        return new io.appmetrica.analytics.AdvIdentifiersResult(io.appmetrica.analytics.impl.P.a(identifiersResult), io.appmetrica.analytics.impl.P.a(identifiersResult2), io.appmetrica.analytics.impl.P.a(identifiersResult3));
    }
}
