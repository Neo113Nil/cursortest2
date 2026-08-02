package com.google.android.datatransport.cct.internal;

/* loaded from: classes8.dex */
final class AutoValue_LogEvent extends com.google.android.datatransport.cct.internal.LogEvent {
    private final com.google.android.datatransport.cct.internal.ComplianceData complianceData;
    private final java.lang.Integer eventCode;
    private final long eventTimeMs;
    private final long eventUptimeMs;
    private final com.google.android.datatransport.cct.internal.NetworkConnectionInfo networkConnectionInfo;
    private final byte[] sourceExtension;
    private final java.lang.String sourceExtensionJsonProto3;
    private final long timezoneOffsetSeconds;

    private AutoValue_LogEvent(long j, java.lang.Integer num, com.google.android.datatransport.cct.internal.ComplianceData complianceData, long j2, byte[] bArr, java.lang.String str, long j3, com.google.android.datatransport.cct.internal.NetworkConnectionInfo networkConnectionInfo) {
        this.eventTimeMs = j;
        this.eventCode = num;
        this.complianceData = complianceData;
        this.eventUptimeMs = j2;
        this.sourceExtension = bArr;
        this.sourceExtensionJsonProto3 = str;
        this.timezoneOffsetSeconds = j3;
        this.networkConnectionInfo = networkConnectionInfo;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public final long getEventTimeMs() {
        return this.eventTimeMs;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public final java.lang.Integer getEventCode() {
        return this.eventCode;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public final com.google.android.datatransport.cct.internal.ComplianceData getComplianceData() {
        return this.complianceData;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public final long getEventUptimeMs() {
        return this.eventUptimeMs;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public final byte[] getSourceExtension() {
        return this.sourceExtension;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public final java.lang.String getSourceExtensionJsonProto3() {
        return this.sourceExtensionJsonProto3;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public final long getTimezoneOffsetSeconds() {
        return this.timezoneOffsetSeconds;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public final com.google.android.datatransport.cct.internal.NetworkConnectionInfo getNetworkConnectionInfo() {
        return this.networkConnectionInfo;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LogEvent{eventTimeMs=");
        sb.append(this.eventTimeMs);
        sb.append(", eventCode=");
        sb.append(this.eventCode);
        sb.append(", complianceData=");
        sb.append(this.complianceData);
        sb.append(", eventUptimeMs=");
        sb.append(this.eventUptimeMs);
        sb.append(", sourceExtension=");
        sb.append(java.util.Arrays.toString(this.sourceExtension));
        sb.append(", sourceExtensionJsonProto3=");
        sb.append(this.sourceExtensionJsonProto3);
        sb.append(", timezoneOffsetSeconds=");
        sb.append(this.timezoneOffsetSeconds);
        sb.append(", networkConnectionInfo=");
        sb.append(this.networkConnectionInfo);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.datatransport.cct.internal.LogEvent)) {
            return false;
        }
        com.google.android.datatransport.cct.internal.LogEvent logEvent = (com.google.android.datatransport.cct.internal.LogEvent) obj;
        if (this.eventTimeMs != logEvent.getEventTimeMs()) {
            return false;
        }
        java.lang.Integer num = this.eventCode;
        if (num == null) {
            if (logEvent.getEventCode() != null) {
                return false;
            }
        } else if (!num.equals(logEvent.getEventCode())) {
            return false;
        }
        com.google.android.datatransport.cct.internal.ComplianceData complianceData = this.complianceData;
        if (complianceData == null) {
            if (logEvent.getComplianceData() != null) {
                return false;
            }
        } else if (!complianceData.equals(logEvent.getComplianceData())) {
            return false;
        }
        if (this.eventUptimeMs != logEvent.getEventUptimeMs()) {
            return false;
        }
        if (!java.util.Arrays.equals(this.sourceExtension, logEvent instanceof com.google.android.datatransport.cct.internal.AutoValue_LogEvent ? ((com.google.android.datatransport.cct.internal.AutoValue_LogEvent) logEvent).sourceExtension : logEvent.getSourceExtension())) {
            return false;
        }
        java.lang.String str = this.sourceExtensionJsonProto3;
        if (str == null) {
            if (logEvent.getSourceExtensionJsonProto3() != null) {
                return false;
            }
        } else if (!str.equals(logEvent.getSourceExtensionJsonProto3())) {
            return false;
        }
        if (this.timezoneOffsetSeconds != logEvent.getTimezoneOffsetSeconds()) {
            return false;
        }
        com.google.android.datatransport.cct.internal.NetworkConnectionInfo networkConnectionInfo = this.networkConnectionInfo;
        if (networkConnectionInfo == null) {
            if (logEvent.getNetworkConnectionInfo() != null) {
                return false;
            }
        } else if (!networkConnectionInfo.equals(logEvent.getNetworkConnectionInfo())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.eventTimeMs;
        int i = (int) (j ^ (j >>> 32));
        java.lang.Integer num = this.eventCode;
        int hashCode = num == null ? 0 : num.hashCode();
        com.google.android.datatransport.cct.internal.ComplianceData complianceData = this.complianceData;
        int hashCode2 = complianceData == null ? 0 : complianceData.hashCode();
        long j2 = this.eventUptimeMs;
        int i2 = (int) (j2 ^ (j2 >>> 32));
        int hashCode3 = java.util.Arrays.hashCode(this.sourceExtension);
        java.lang.String str = this.sourceExtensionJsonProto3;
        int hashCode4 = str == null ? 0 : str.hashCode();
        long j3 = this.timezoneOffsetSeconds;
        int i3 = (int) (j3 ^ (j3 >>> 32));
        com.google.android.datatransport.cct.internal.NetworkConnectionInfo networkConnectionInfo = this.networkConnectionInfo;
        return ((((((((((((((i ^ 1000003) * 1000003) ^ hashCode) * 1000003) ^ hashCode2) * 1000003) ^ i2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ i3) * 1000003) ^ (networkConnectionInfo != null ? networkConnectionInfo.hashCode() : 0);
    }

    static final class Builder extends com.google.android.datatransport.cct.internal.LogEvent.Builder {
        private com.google.android.datatransport.cct.internal.ComplianceData complianceData;
        private java.lang.Integer eventCode;
        private java.lang.Long eventTimeMs;
        private java.lang.Long eventUptimeMs;
        private com.google.android.datatransport.cct.internal.NetworkConnectionInfo networkConnectionInfo;
        private byte[] sourceExtension;
        private java.lang.String sourceExtensionJsonProto3;
        private java.lang.Long timezoneOffsetSeconds;

        Builder() {
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public final com.google.android.datatransport.cct.internal.LogEvent.Builder setEventTimeMs(long j) {
            this.eventTimeMs = java.lang.Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public final com.google.android.datatransport.cct.internal.LogEvent.Builder setEventCode(java.lang.Integer num) {
            this.eventCode = num;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public final com.google.android.datatransport.cct.internal.LogEvent.Builder setComplianceData(com.google.android.datatransport.cct.internal.ComplianceData complianceData) {
            this.complianceData = complianceData;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public final com.google.android.datatransport.cct.internal.LogEvent.Builder setEventUptimeMs(long j) {
            this.eventUptimeMs = java.lang.Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        final com.google.android.datatransport.cct.internal.LogEvent.Builder setSourceExtension(byte[] bArr) {
            this.sourceExtension = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        final com.google.android.datatransport.cct.internal.LogEvent.Builder setSourceExtensionJsonProto3(java.lang.String str) {
            this.sourceExtensionJsonProto3 = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public final com.google.android.datatransport.cct.internal.LogEvent.Builder setTimezoneOffsetSeconds(long j) {
            this.timezoneOffsetSeconds = java.lang.Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public final com.google.android.datatransport.cct.internal.LogEvent.Builder setNetworkConnectionInfo(com.google.android.datatransport.cct.internal.NetworkConnectionInfo networkConnectionInfo) {
            this.networkConnectionInfo = networkConnectionInfo;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public final com.google.android.datatransport.cct.internal.LogEvent build() {
            java.lang.String str;
            if (this.eventTimeMs != null) {
                str = "";
            } else {
                str = " eventTimeMs";
            }
            if (this.eventUptimeMs == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append(" eventUptimeMs");
                str = sb.toString();
            }
            if (this.timezoneOffsetSeconds == null) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(str);
                sb2.append(" timezoneOffsetSeconds");
                str = sb2.toString();
            }
            if (!str.isEmpty()) {
                throw new java.lang.IllegalStateException("Missing required properties:".concat(java.lang.String.valueOf(str)));
            }
            return new com.google.android.datatransport.cct.internal.AutoValue_LogEvent(this.eventTimeMs.longValue(), this.eventCode, this.complianceData, this.eventUptimeMs.longValue(), this.sourceExtension, this.sourceExtensionJsonProto3, this.timezoneOffsetSeconds.longValue(), this.networkConnectionInfo);
        }
    }
}
