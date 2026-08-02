package com.google.android.datatransport.runtime.firebase.transport;

/* loaded from: classes3.dex */
public final class ClientMetrics {
    private static final com.google.android.datatransport.runtime.firebase.transport.ClientMetrics DEFAULT_INSTANCE = new com.google.android.datatransport.runtime.firebase.transport.ClientMetrics.Builder().build();
    private final java.lang.String app_namespace_;
    private final com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics global_metrics_;
    private final java.util.List<com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics> log_source_metrics_;
    private final com.google.android.datatransport.runtime.firebase.transport.TimeWindow window_;

    ClientMetrics(com.google.android.datatransport.runtime.firebase.transport.TimeWindow timeWindow, java.util.List<com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics> list, com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics globalMetrics, java.lang.String str) {
        this.window_ = timeWindow;
        this.log_source_metrics_ = list;
        this.global_metrics_ = globalMetrics;
        this.app_namespace_ = str;
    }

    public final byte[] toByteArray() {
        return com.google.android.datatransport.runtime.ProtoEncoderDoNotUse.encode(this);
    }

    public final void writeTo(java.io.OutputStream outputStream) throws java.io.IOException {
        com.google.android.datatransport.runtime.ProtoEncoderDoNotUse.encode(this, outputStream);
    }

    public static com.google.android.datatransport.runtime.firebase.transport.ClientMetrics.Builder newBuilder() {
        return new com.google.android.datatransport.runtime.firebase.transport.ClientMetrics.Builder();
    }

    @com.google.firebase.encoders.annotations.Encodable.Ignore
    public final com.google.android.datatransport.runtime.firebase.transport.TimeWindow getWindow() {
        com.google.android.datatransport.runtime.firebase.transport.TimeWindow timeWindow = this.window_;
        return timeWindow == null ? com.google.android.datatransport.runtime.firebase.transport.TimeWindow.getDefaultInstance() : timeWindow;
    }

    @com.google.firebase.encoders.annotations.Encodable.Field(name = com.datadog.android.sessionreplay.internal.recorder.mapper.DecorViewMapper.WINDOW_KEY_NAME)
    public final com.google.android.datatransport.runtime.firebase.transport.TimeWindow getWindowInternal() {
        return this.window_;
    }

    @com.google.firebase.encoders.annotations.Encodable.Field(name = "logSourceMetrics")
    public final java.util.List<com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics> getLogSourceMetricsList() {
        return this.log_source_metrics_;
    }

    @com.google.firebase.encoders.annotations.Encodable.Ignore
    public final com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics getGlobalMetrics() {
        com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics globalMetrics = this.global_metrics_;
        return globalMetrics == null ? com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics.getDefaultInstance() : globalMetrics;
    }

    @com.google.firebase.encoders.annotations.Encodable.Field(name = "globalMetrics")
    public final com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics getGlobalMetricsInternal() {
        return this.global_metrics_;
    }

    public final java.lang.String getAppNamespace() {
        return this.app_namespace_;
    }

    public static com.google.android.datatransport.runtime.firebase.transport.ClientMetrics getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final class Builder {
        private com.google.android.datatransport.runtime.firebase.transport.TimeWindow window_ = null;
        private java.util.List<com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics> log_source_metrics_ = new java.util.ArrayList();
        private com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics global_metrics_ = null;
        private java.lang.String app_namespace_ = "";

        Builder() {
        }

        public final com.google.android.datatransport.runtime.firebase.transport.ClientMetrics build() {
            return new com.google.android.datatransport.runtime.firebase.transport.ClientMetrics(this.window_, java.util.Collections.unmodifiableList(this.log_source_metrics_), this.global_metrics_, this.app_namespace_);
        }

        public final com.google.android.datatransport.runtime.firebase.transport.ClientMetrics.Builder setWindow(com.google.android.datatransport.runtime.firebase.transport.TimeWindow timeWindow) {
            this.window_ = timeWindow;
            return this;
        }

        public final com.google.android.datatransport.runtime.firebase.transport.ClientMetrics.Builder addLogSourceMetrics(com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics logSourceMetrics) {
            this.log_source_metrics_.add(logSourceMetrics);
            return this;
        }

        public final com.google.android.datatransport.runtime.firebase.transport.ClientMetrics.Builder setLogSourceMetricsList(java.util.List<com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics> list) {
            this.log_source_metrics_ = list;
            return this;
        }

        public final com.google.android.datatransport.runtime.firebase.transport.ClientMetrics.Builder setGlobalMetrics(com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics globalMetrics) {
            this.global_metrics_ = globalMetrics;
            return this;
        }

        public final com.google.android.datatransport.runtime.firebase.transport.ClientMetrics.Builder setAppNamespace(java.lang.String str) {
            this.app_namespace_ = str;
            return this;
        }
    }
}
