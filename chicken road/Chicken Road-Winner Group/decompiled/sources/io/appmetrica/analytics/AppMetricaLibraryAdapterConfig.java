package io.appmetrica.analytics;

/* loaded from: classes.dex */
public class AppMetricaLibraryAdapterConfig {
    public final Boolean advIdentifiersTracking;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private Boolean f5077a;

        public AppMetricaLibraryAdapterConfig build() {
            return new AppMetricaLibraryAdapterConfig(this, 0);
        }

        public Builder withAdvIdentifiersTracking(boolean z3) {
            this.f5077a = Boolean.valueOf(z3);
            return this;
        }
    }

    public /* synthetic */ AppMetricaLibraryAdapterConfig(Builder builder, int i3) {
        this(builder);
    }

    public static Builder newConfigBuilder() {
        return new Builder();
    }

    public String toString() {
        return "AppMetricaLibraryAdapterConfig{advIdentifiersTracking=" + this.advIdentifiersTracking + '}';
    }

    private AppMetricaLibraryAdapterConfig(Builder builder) {
        this.advIdentifiersTracking = builder.f5077a;
    }
}
