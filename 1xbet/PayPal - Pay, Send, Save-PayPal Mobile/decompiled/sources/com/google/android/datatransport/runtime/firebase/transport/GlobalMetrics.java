package com.google.android.datatransport.runtime.firebase.transport;

/* loaded from: classes3.dex */
public final class GlobalMetrics {
    private static final com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics DEFAULT_INSTANCE = new com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics.Builder().build();
    private final com.google.android.datatransport.runtime.firebase.transport.StorageMetrics storage_metrics_;

    GlobalMetrics(com.google.android.datatransport.runtime.firebase.transport.StorageMetrics storageMetrics) {
        this.storage_metrics_ = storageMetrics;
    }

    public static com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics.Builder newBuilder() {
        return new com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics.Builder();
    }

    @com.google.firebase.encoders.annotations.Encodable.Ignore
    public final com.google.android.datatransport.runtime.firebase.transport.StorageMetrics getStorageMetrics() {
        com.google.android.datatransport.runtime.firebase.transport.StorageMetrics storageMetrics = this.storage_metrics_;
        return storageMetrics == null ? com.google.android.datatransport.runtime.firebase.transport.StorageMetrics.getDefaultInstance() : storageMetrics;
    }

    @com.google.firebase.encoders.annotations.Encodable.Field(name = "storageMetrics")
    public final com.google.android.datatransport.runtime.firebase.transport.StorageMetrics getStorageMetricsInternal() {
        return this.storage_metrics_;
    }

    public static com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final class Builder {
        private com.google.android.datatransport.runtime.firebase.transport.StorageMetrics storage_metrics_ = null;

        Builder() {
        }

        public final com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics build() {
            return new com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics(this.storage_metrics_);
        }

        public final com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics.Builder setStorageMetrics(com.google.android.datatransport.runtime.firebase.transport.StorageMetrics storageMetrics) {
            this.storage_metrics_ = storageMetrics;
            return this;
        }
    }
}
