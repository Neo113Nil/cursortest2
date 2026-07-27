package io.appmetrica.analytics;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.C0532h0;
import io.appmetrica.analytics.impl.C0873u5;
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
        private static final Gn f5102l = new Gn(new C0532h0());

        /* renamed from: a, reason: collision with root package name */
        private final C0873u5 f5103a;

        /* renamed from: b, reason: collision with root package name */
        private final String f5104b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f5105c;

        /* renamed from: d, reason: collision with root package name */
        private Boolean f5106d;

        /* renamed from: e, reason: collision with root package name */
        private Boolean f5107e;
        private Integer f;

        /* renamed from: g, reason: collision with root package name */
        private String f5108g;

        /* renamed from: h, reason: collision with root package name */
        private Integer f5109h;

        /* renamed from: i, reason: collision with root package name */
        private Integer f5110i;

        /* renamed from: j, reason: collision with root package name */
        private final HashMap f5111j;

        /* renamed from: k, reason: collision with root package name */
        private final HashMap f5112k;

        public /* synthetic */ Builder(String str, int i3) {
            this(str);
        }

        public ReporterConfig build() {
            return new ReporterConfig(this, 0);
        }

        public Builder withAdditionalConfig(String str, Object obj) {
            this.f5112k.put(str, obj);
            return this;
        }

        public Builder withAppEnvironmentValue(String str, String str2) {
            this.f5111j.put(str, str2);
            return this;
        }

        public Builder withDataSendingEnabled(boolean z3) {
            this.f5107e = Boolean.valueOf(z3);
            return this;
        }

        public Builder withDispatchPeriodSeconds(int i3) {
            this.f5109h = Integer.valueOf(i3);
            return this;
        }

        public Builder withLogs() {
            this.f5106d = Boolean.TRUE;
            return this;
        }

        public Builder withMaxReportsCount(int i3) {
            this.f5110i = Integer.valueOf(i3);
            return this;
        }

        public Builder withMaxReportsInDatabaseCount(int i3) {
            this.f = Integer.valueOf(this.f5103a.a(i3));
            return this;
        }

        public Builder withSessionTimeout(int i3) {
            this.f5105c = Integer.valueOf(i3);
            return this;
        }

        public Builder withUserProfileID(String str) {
            this.f5108g = str;
            return this;
        }

        private Builder(String str) {
            this.f5111j = new HashMap();
            this.f5112k = new HashMap();
            f5102l.a(str);
            this.f5103a = new C0873u5(str);
            this.f5104b = str;
        }
    }

    public /* synthetic */ ReporterConfig(Builder builder, int i3) {
        this(builder);
    }

    public static Builder newConfigBuilder(String str) {
        return new Builder(str, 0);
    }

    private ReporterConfig(Builder builder) {
        this.apiKey = builder.f5104b;
        this.sessionTimeout = builder.f5105c;
        this.logs = builder.f5106d;
        this.dataSendingEnabled = builder.f5107e;
        this.maxReportsInDatabaseCount = builder.f;
        this.userProfileID = builder.f5108g;
        this.dispatchPeriodSeconds = builder.f5109h;
        this.maxReportsCount = builder.f5110i;
        this.appEnvironment = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f5111j);
        this.additionalConfig = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f5112k);
    }
}
