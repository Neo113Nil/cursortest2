package com.google.android.gms.common.internal;

/* loaded from: classes4.dex */
public class TelemetryLoggingOptions implements com.google.android.gms.common.api.Api.ApiOptions.Optional {
    public static final com.google.android.gms.common.internal.TelemetryLoggingOptions zaa = builder().build();
    private final java.lang.String zab;

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.common.internal.TelemetryLoggingOptions) {
            return com.google.android.gms.common.internal.Objects.equal(this.zab, ((com.google.android.gms.common.internal.TelemetryLoggingOptions) obj).zab);
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zab);
    }

    public final android.os.Bundle zaa() {
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.String str = this.zab;
        if (str != null) {
            bundle.putString(com.visa.cbp.getTicketMetaData$6672$values.values.ReplenishRequest, str);
        }
        return bundle;
    }

    public static class Builder {
        private java.lang.String zaa;

        public com.google.android.gms.common.internal.TelemetryLoggingOptions.Builder setApi(java.lang.String str) {
            this.zaa = str;
            return this;
        }

        public com.google.android.gms.common.internal.TelemetryLoggingOptions build() {
            return new com.google.android.gms.common.internal.TelemetryLoggingOptions(this.zaa, null);
        }

        /* synthetic */ Builder(com.google.android.gms.common.internal.zaac zaacVar) {
        }

        private Builder() {
        }
    }

    public static com.google.android.gms.common.internal.TelemetryLoggingOptions.Builder builder() {
        return new com.google.android.gms.common.internal.TelemetryLoggingOptions.Builder(null);
    }

    /* synthetic */ TelemetryLoggingOptions(java.lang.String str, com.google.android.gms.common.internal.zaad zaadVar) {
        this.zab = str;
    }
}
