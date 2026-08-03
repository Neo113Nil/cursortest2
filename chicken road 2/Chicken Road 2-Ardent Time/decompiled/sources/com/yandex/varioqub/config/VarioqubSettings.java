package com.yandex.varioqub.config;

/* loaded from: classes.dex */
public final class VarioqubSettings {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f2637a;

    /* renamed from: b, reason: collision with root package name */
    private final java.lang.String f2638b;

    /* renamed from: c, reason: collision with root package name */
    private final long f2639c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f2640d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f2641e;

    /* renamed from: f, reason: collision with root package name */
    private final java.util.Map f2642f;

    /* renamed from: g, reason: collision with root package name */
    private final java.lang.String f2643g;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final java.lang.String f2644a;

        /* renamed from: b, reason: collision with root package name */
        private java.lang.String f2645b;

        /* renamed from: e, reason: collision with root package name */
        private boolean f2648e;

        /* renamed from: c, reason: collision with root package name */
        private final java.util.HashMap f2646c = new java.util.HashMap();

        /* renamed from: d, reason: collision with root package name */
        private long f2647d = 43200;

        /* renamed from: f, reason: collision with root package name */
        private boolean f2649f = true;

        public Builder(java.lang.String str) {
            this.f2644a = str;
            if (str.length() <= 0) {
                throw new java.lang.IllegalArgumentException("ClientId must not be empty");
            }
        }

        public final com.yandex.varioqub.config.VarioqubSettings build() {
            return new com.yandex.varioqub.config.VarioqubSettings(this.f2644a, this.f2645b, this.f2647d, this.f2648e, this.f2649f, i1.AbstractC0202u.L(this.f2646c), null);
        }

        public final com.yandex.varioqub.config.VarioqubSettings.Builder withActivateEvent(boolean z2) {
            this.f2649f = z2;
            return this;
        }

        public final com.yandex.varioqub.config.VarioqubSettings.Builder withClientFeature(java.lang.String str, java.lang.String str2) {
            this.f2646c.put(str, str2);
            return this;
        }

        public final com.yandex.varioqub.config.VarioqubSettings.Builder withLogs() {
            this.f2648e = true;
            return this;
        }

        public final com.yandex.varioqub.config.VarioqubSettings.Builder withThrottleInterval(long j2) {
            if (j2 <= 0) {
                throw new java.lang.IllegalArgumentException("Fetch timeout must be a positive number");
            }
            this.f2647d = j2;
            return this;
        }

        public final com.yandex.varioqub.config.VarioqubSettings.Builder withUrl(java.lang.String str) {
            this.f2645b = str;
            return this;
        }
    }

    public /* synthetic */ VarioqubSettings(java.lang.String str, java.lang.String str2, long j2, boolean z2, boolean z3, java.util.Map map, kotlin.jvm.internal.e eVar) {
        this(str, str2, j2, z2, z3, map);
    }

    public final void clearClientFeatures$config_release() {
        this.f2642f.clear();
        java.lang.String str = this.f2643g;
        if (com.yandex.varioqub.config.impl.C.f2658a) {
            android.util.Log.d("Varioqub/" + str, "Client features was cleaned");
        }
    }

    public final boolean getActivateEvent$config_release() {
        return this.f2641e;
    }

    public final java.util.Map<java.lang.String, java.lang.String> getClientFeatures$config_release() {
        return i1.AbstractC0202u.K(this.f2642f);
    }

    public final java.lang.String getClientId$config_release() {
        return this.f2637a;
    }

    public final long getFetchThrottleIntervalSec$config_release() {
        return this.f2639c;
    }

    public final boolean getLogs$config_release() {
        return this.f2640d;
    }

    public final java.lang.String getUrl$config_release() {
        return this.f2638b;
    }

    public final void putClientFeature$config_release(java.lang.String str, java.lang.String str2) {
        java.lang.String str3 = (java.lang.String) this.f2642f.put(str, str2);
        if (str3 != null) {
            java.lang.String str4 = this.f2643g;
            java.lang.String str5 = "Client feature with key - " + str + " and value - " + str3 + " was replaced with new value - " + str2;
            if (com.yandex.varioqub.config.impl.C.f2658a) {
                android.util.Log.d("Varioqub/" + str4, str5);
            }
        }
    }

    private VarioqubSettings(java.lang.String str, java.lang.String str2, long j2, boolean z2, boolean z3, java.util.Map map) {
        this.f2637a = str;
        this.f2638b = str2;
        this.f2639c = j2;
        this.f2640d = z2;
        this.f2641e = z3;
        this.f2642f = map;
        this.f2643g = "VarioqubSettings";
    }
}
