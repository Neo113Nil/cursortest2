package com.google.android.datatransport.runtime.firebase.transport;

/* loaded from: classes3.dex */
public final class LogSourceMetrics {
    private static final com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics DEFAULT_INSTANCE = new com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics.Builder().build();
    private final java.util.List<com.google.android.datatransport.runtime.firebase.transport.LogEventDropped> log_event_dropped_;
    private final java.lang.String log_source_;

    LogSourceMetrics(java.lang.String str, java.util.List<com.google.android.datatransport.runtime.firebase.transport.LogEventDropped> list) {
        this.log_source_ = str;
        this.log_event_dropped_ = list;
    }

    public static com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics.Builder newBuilder() {
        return new com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics.Builder();
    }

    public final java.lang.String getLogSource() {
        return this.log_source_;
    }

    @com.google.firebase.encoders.annotations.Encodable.Field(name = "logEventDropped")
    public final java.util.List<com.google.android.datatransport.runtime.firebase.transport.LogEventDropped> getLogEventDroppedList() {
        return this.log_event_dropped_;
    }

    public static com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final class Builder {
        private java.lang.String log_source_ = "";
        private java.util.List<com.google.android.datatransport.runtime.firebase.transport.LogEventDropped> log_event_dropped_ = new java.util.ArrayList();

        Builder() {
        }

        public final com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics build() {
            return new com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics(this.log_source_, java.util.Collections.unmodifiableList(this.log_event_dropped_));
        }

        public final com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics.Builder setLogSource(java.lang.String str) {
            this.log_source_ = str;
            return this;
        }

        public final com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics.Builder addLogEventDropped(com.google.android.datatransport.runtime.firebase.transport.LogEventDropped logEventDropped) {
            this.log_event_dropped_.add(logEventDropped);
            return this;
        }

        public final com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics.Builder setLogEventDroppedList(java.util.List<com.google.android.datatransport.runtime.firebase.transport.LogEventDropped> list) {
            this.log_event_dropped_ = list;
            return this;
        }
    }
}
