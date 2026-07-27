package io.appmetrica.analytics;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.C0681h0;
import io.appmetrica.analytics.impl.C1022u5;
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
        private static final Gn f5905l = new Gn(new C0681h0());

        /* renamed from: a, reason: collision with root package name */
        private final C1022u5 f5906a;

        /* renamed from: b, reason: collision with root package name */
        private final String f5907b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f5908c;

        /* renamed from: d, reason: collision with root package name */
        private Boolean f5909d;

        /* renamed from: e, reason: collision with root package name */
        private Boolean f5910e;

        /* renamed from: f, reason: collision with root package name */
        private Integer f5911f;

        /* renamed from: g, reason: collision with root package name */
        private String f5912g;

        /* renamed from: h, reason: collision with root package name */
        private Integer f5913h;

        /* renamed from: i, reason: collision with root package name */
        private Integer f5914i;

        /* renamed from: j, reason: collision with root package name */
        private final HashMap f5915j;

        /* renamed from: k, reason: collision with root package name */
        private final HashMap f5916k;

        public /* synthetic */ Builder(String str, int i2) {
            this(str);
        }

        public ReporterConfig build() {
            return new ReporterConfig(this, 0);
        }

        public Builder withAdditionalConfig(String str, Object obj) {
            this.f5916k.put(str, obj);
            return this;
        }

        public Builder withAppEnvironmentValue(String str, String str2) {
            this.f5915j.put(str, str2);
            return this;
        }

        public Builder withDataSendingEnabled(boolean z) {
            this.f5910e = Boolean.valueOf(z);
            return this;
        }

        public Builder withDispatchPeriodSeconds(int i2) {
            this.f5913h = Integer.valueOf(i2);
            return this;
        }

        public Builder withLogs() {
            this.f5909d = Boolean.TRUE;
            return this;
        }

        public Builder withMaxReportsCount(int i2) {
            this.f5914i = Integer.valueOf(i2);
            return this;
        }

        public Builder withMaxReportsInDatabaseCount(int i2) {
            this.f5911f = Integer.valueOf(this.f5906a.a(i2));
            return this;
        }

        public Builder withSessionTimeout(int i2) {
            this.f5908c = Integer.valueOf(i2);
            return this;
        }

        public Builder withUserProfileID(String str) {
            this.f5912g = str;
            return this;
        }

        private Builder(String str) {
            this.f5915j = new HashMap();
            this.f5916k = new HashMap();
            f5905l.a(str);
            this.f5906a = new C1022u5(str);
            this.f5907b = str;
        }
    }

    public /* synthetic */ ReporterConfig(Builder builder, int i2) {
        this(builder);
    }

    public static Builder newConfigBuilder(String str) {
        return new Builder(str, 0);
    }

    private ReporterConfig(Builder builder) {
        this.apiKey = builder.f5907b;
        this.sessionTimeout = builder.f5908c;
        this.logs = builder.f5909d;
        this.dataSendingEnabled = builder.f5910e;
        this.maxReportsInDatabaseCount = builder.f5911f;
        this.userProfileID = builder.f5912g;
        this.dispatchPeriodSeconds = builder.f5913h;
        this.maxReportsCount = builder.f5914i;
        this.appEnvironment = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f5915j);
        this.additionalConfig = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f5916k);
    }
}
