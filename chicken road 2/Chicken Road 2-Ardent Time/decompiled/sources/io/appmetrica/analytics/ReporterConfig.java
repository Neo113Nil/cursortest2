package io.appmetrica.analytics;

/* loaded from: classes.dex */
public class ReporterConfig {
    public final java.util.Map<java.lang.String, java.lang.Object> additionalConfig;
    public final java.lang.String apiKey;
    public final java.util.Map<java.lang.String, java.lang.String> appEnvironment;
    public final java.lang.Boolean dataSendingEnabled;
    public final java.lang.Integer dispatchPeriodSeconds;
    public final java.lang.Boolean logs;
    public final java.lang.Integer maxReportsCount;
    public final java.lang.Integer maxReportsInDatabaseCount;
    public final java.lang.Integer sessionTimeout;
    public final java.lang.String userProfileID;

    public static class Builder {

        /* renamed from: l, reason: collision with root package name */
        private static final io.appmetrica.analytics.impl.En f3397l = new io.appmetrica.analytics.impl.En(new io.appmetrica.analytics.impl.C0395h0());

        /* renamed from: a, reason: collision with root package name */
        private final io.appmetrica.analytics.impl.C0555n5 f3398a;

        /* renamed from: b, reason: collision with root package name */
        private final java.lang.String f3399b;

        /* renamed from: c, reason: collision with root package name */
        private java.lang.Integer f3400c;

        /* renamed from: d, reason: collision with root package name */
        private java.lang.Boolean f3401d;

        /* renamed from: e, reason: collision with root package name */
        private java.lang.Boolean f3402e;

        /* renamed from: f, reason: collision with root package name */
        private java.lang.Integer f3403f;

        /* renamed from: g, reason: collision with root package name */
        private java.lang.String f3404g;

        /* renamed from: h, reason: collision with root package name */
        private java.lang.Integer f3405h;

        /* renamed from: i, reason: collision with root package name */
        private java.lang.Integer f3406i;

        /* renamed from: j, reason: collision with root package name */
        private final java.util.HashMap f3407j;

        /* renamed from: k, reason: collision with root package name */
        private final java.util.HashMap f3408k;

        public /* synthetic */ Builder(java.lang.String str, int i2) {
            this(str);
        }

        public io.appmetrica.analytics.ReporterConfig build() {
            return new io.appmetrica.analytics.ReporterConfig(this, 0);
        }

        public io.appmetrica.analytics.ReporterConfig.Builder withAdditionalConfig(java.lang.String str, java.lang.Object obj) {
            this.f3408k.put(str, obj);
            return this;
        }

        public io.appmetrica.analytics.ReporterConfig.Builder withAppEnvironmentValue(java.lang.String str, java.lang.String str2) {
            this.f3407j.put(str, str2);
            return this;
        }

        public io.appmetrica.analytics.ReporterConfig.Builder withDataSendingEnabled(boolean z2) {
            this.f3402e = java.lang.Boolean.valueOf(z2);
            return this;
        }

        public io.appmetrica.analytics.ReporterConfig.Builder withDispatchPeriodSeconds(int i2) {
            this.f3405h = java.lang.Integer.valueOf(i2);
            return this;
        }

        public io.appmetrica.analytics.ReporterConfig.Builder withLogs() {
            this.f3401d = java.lang.Boolean.TRUE;
            return this;
        }

        public io.appmetrica.analytics.ReporterConfig.Builder withMaxReportsCount(int i2) {
            this.f3406i = java.lang.Integer.valueOf(i2);
            return this;
        }

        public io.appmetrica.analytics.ReporterConfig.Builder withMaxReportsInDatabaseCount(int i2) {
            this.f3403f = java.lang.Integer.valueOf(this.f3398a.a(i2));
            return this;
        }

        public io.appmetrica.analytics.ReporterConfig.Builder withSessionTimeout(int i2) {
            this.f3400c = java.lang.Integer.valueOf(i2);
            return this;
        }

        public io.appmetrica.analytics.ReporterConfig.Builder withUserProfileID(java.lang.String str) {
            this.f3404g = str;
            return this;
        }

        private Builder(java.lang.String str) {
            this.f3407j = new java.util.HashMap();
            this.f3408k = new java.util.HashMap();
            f3397l.a(str);
            this.f3398a = new io.appmetrica.analytics.impl.C0555n5(str);
            this.f3399b = str;
        }
    }

    public /* synthetic */ ReporterConfig(io.appmetrica.analytics.ReporterConfig.Builder builder, int i2) {
        this(builder);
    }

    public static io.appmetrica.analytics.ReporterConfig.Builder newConfigBuilder(java.lang.String str) {
        return new io.appmetrica.analytics.ReporterConfig.Builder(str, 0);
    }

    private ReporterConfig(io.appmetrica.analytics.ReporterConfig.Builder builder) {
        this.apiKey = builder.f3399b;
        this.sessionTimeout = builder.f3400c;
        this.logs = builder.f3401d;
        this.dataSendingEnabled = builder.f3402e;
        this.maxReportsInDatabaseCount = builder.f3403f;
        this.userProfileID = builder.f3404g;
        this.dispatchPeriodSeconds = builder.f3405h;
        this.maxReportsCount = builder.f3406i;
        this.appEnvironment = io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.unmodifiableSameOrderMapCopy(builder.f3407j);
        this.additionalConfig = io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.unmodifiableSameOrderMapCopy(builder.f3408k);
    }
}
