package io.appmetrica.analytics;

/* loaded from: classes.dex */
public class AppMetricaLibraryAdapterConfig {
    public final java.lang.Boolean advIdentifiersTracking;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private java.lang.Boolean f3370a;

        public io.appmetrica.analytics.AppMetricaLibraryAdapterConfig build() {
            return new io.appmetrica.analytics.AppMetricaLibraryAdapterConfig(this, 0);
        }

        public io.appmetrica.analytics.AppMetricaLibraryAdapterConfig.Builder withAdvIdentifiersTracking(boolean z2) {
            this.f3370a = java.lang.Boolean.valueOf(z2);
            return this;
        }
    }

    public /* synthetic */ AppMetricaLibraryAdapterConfig(io.appmetrica.analytics.AppMetricaLibraryAdapterConfig.Builder builder, int i2) {
        this(builder);
    }

    public static io.appmetrica.analytics.AppMetricaLibraryAdapterConfig.Builder newConfigBuilder() {
        return new io.appmetrica.analytics.AppMetricaLibraryAdapterConfig.Builder();
    }

    public java.lang.String toString() {
        return "AppMetricaLibraryAdapterConfig{advIdentifiersTracking=" + this.advIdentifiersTracking + '}';
    }

    private AppMetricaLibraryAdapterConfig(io.appmetrica.analytics.AppMetricaLibraryAdapterConfig.Builder builder) {
        this.advIdentifiersTracking = builder.f3370a;
    }
}
