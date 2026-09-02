package io.appmetrica.analytics;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.C0258h0;
import io.appmetrica.analytics.impl.C0599u5;
import io.appmetrica.analytics.impl.Gn;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class ReporterConfig {
    public final Map<String, Object> additionalConfig;
    public final String apiKey;
    public final Map<String, String> appEnvironment;
    public final Boolean dataSendingEnabled;
    public final Integer dispatchPeriodSeconds;
    public final Boolean logs;
    public final Integer maxReportsCount;
    public final Integer maxReportsInDatabaseCount;
    public final Integer sessionTimeout;
    public final String userProfileID;

    public static class Builder {

        /* renamed from: l, reason: collision with root package name */
        private static final Gn f1533l = new Gn(new C0258h0());

        /* renamed from: a, reason: collision with root package name */
        private final C0599u5 f1534a;

        /* renamed from: b, reason: collision with root package name */
        private final String f1535b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f1536c;

        /* renamed from: d, reason: collision with root package name */
        private Boolean f1537d;

        /* renamed from: e, reason: collision with root package name */
        private Boolean f1538e;

        /* renamed from: f, reason: collision with root package name */
        private Integer f1539f;

        /* renamed from: g, reason: collision with root package name */
        private String f1540g;

        /* renamed from: h, reason: collision with root package name */
        private Integer f1541h;

        /* renamed from: i, reason: collision with root package name */
        private Integer f1542i;

        /* renamed from: j, reason: collision with root package name */
        private final HashMap f1543j;

        /* renamed from: k, reason: collision with root package name */
        private final HashMap f1544k;

        public /* synthetic */ Builder(String str, int i2) {
            this(str);
        }

        public ReporterConfig build() {
            return new ReporterConfig(this, 0);
        }

        public Builder withAdditionalConfig(String str, Object obj) {
            this.f1544k.put(str, obj);
            return this;
        }

        public Builder withAppEnvironmentValue(String str, String str2) {
            this.f1543j.put(str, str2);
            return this;
        }

        public Builder withDataSendingEnabled(boolean z2) {
            this.f1538e = Boolean.valueOf(z2);
            return this;
        }

        public Builder withDispatchPeriodSeconds(int i2) {
            this.f1541h = Integer.valueOf(i2);
            return this;
        }

        public Builder withLogs() {
            this.f1537d = Boolean.TRUE;
            return this;
        }

        public Builder withMaxReportsCount(int i2) {
            this.f1542i = Integer.valueOf(i2);
            return this;
        }

        public Builder withMaxReportsInDatabaseCount(int i2) {
            this.f1539f = Integer.valueOf(this.f1534a.a(i2));
            return this;
        }

        public Builder withSessionTimeout(int i2) {
            this.f1536c = Integer.valueOf(i2);
            return this;
        }

        public Builder withUserProfileID(String str) {
            this.f1540g = str;
            return this;
        }

        private Builder(String str) {
            this.f1543j = new HashMap();
            this.f1544k = new HashMap();
            f1533l.a(str);
            this.f1534a = new C0599u5(str);
            this.f1535b = str;
        }
    }

    public /* synthetic */ ReporterConfig(Builder builder, int i2) {
        this(builder);
    }

    public static Builder newConfigBuilder(String str) {
        return new Builder(str, 0);
    }

    private ReporterConfig(Builder builder) {
        this.apiKey = builder.f1535b;
        this.sessionTimeout = builder.f1536c;
        this.logs = builder.f1537d;
        this.dataSendingEnabled = builder.f1538e;
        this.maxReportsInDatabaseCount = builder.f1539f;
        this.userProfileID = builder.f1540g;
        this.dispatchPeriodSeconds = builder.f1541h;
        this.maxReportsCount = builder.f1542i;
        this.appEnvironment = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f1543j);
        this.additionalConfig = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f1544k);
    }
}
