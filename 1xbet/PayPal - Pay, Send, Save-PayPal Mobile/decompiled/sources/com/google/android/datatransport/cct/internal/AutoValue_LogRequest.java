package com.google.android.datatransport.cct.internal;

/* loaded from: classes8.dex */
final class AutoValue_LogRequest extends com.google.android.datatransport.cct.internal.LogRequest {
    private final com.google.android.datatransport.cct.internal.ClientInfo clientInfo;
    private final java.util.List<com.google.android.datatransport.cct.internal.LogEvent> logEvents;
    private final java.lang.Integer logSource;
    private final java.lang.String logSourceName;
    private final com.google.android.datatransport.cct.internal.QosTier qosTier;
    private final long requestTimeMs;
    private final long requestUptimeMs;

    private AutoValue_LogRequest(long j, long j2, com.google.android.datatransport.cct.internal.ClientInfo clientInfo, java.lang.Integer num, java.lang.String str, java.util.List<com.google.android.datatransport.cct.internal.LogEvent> list, com.google.android.datatransport.cct.internal.QosTier qosTier) {
        this.requestTimeMs = j;
        this.requestUptimeMs = j2;
        this.clientInfo = clientInfo;
        this.logSource = num;
        this.logSourceName = str;
        this.logEvents = list;
        this.qosTier = qosTier;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    public final long getRequestTimeMs() {
        return this.requestTimeMs;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    public final long getRequestUptimeMs() {
        return this.requestUptimeMs;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    public final com.google.android.datatransport.cct.internal.ClientInfo getClientInfo() {
        return this.clientInfo;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    public final java.lang.Integer getLogSource() {
        return this.logSource;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    public final java.lang.String getLogSourceName() {
        return this.logSourceName;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    @com.google.firebase.encoders.annotations.Encodable.Field(name = "logEvent")
    public final java.util.List<com.google.android.datatransport.cct.internal.LogEvent> getLogEvents() {
        return this.logEvents;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    public final com.google.android.datatransport.cct.internal.QosTier getQosTier() {
        return this.qosTier;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LogRequest{requestTimeMs=");
        sb.append(this.requestTimeMs);
        sb.append(", requestUptimeMs=");
        sb.append(this.requestUptimeMs);
        sb.append(", clientInfo=");
        sb.append(this.clientInfo);
        sb.append(", logSource=");
        sb.append(this.logSource);
        sb.append(", logSourceName=");
        sb.append(this.logSourceName);
        sb.append(", logEvents=");
        sb.append(this.logEvents);
        sb.append(", qosTier=");
        sb.append(this.qosTier);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.datatransport.cct.internal.LogRequest)) {
            return false;
        }
        com.google.android.datatransport.cct.internal.LogRequest logRequest = (com.google.android.datatransport.cct.internal.LogRequest) obj;
        if (this.requestTimeMs != logRequest.getRequestTimeMs() || this.requestUptimeMs != logRequest.getRequestUptimeMs()) {
            return false;
        }
        com.google.android.datatransport.cct.internal.ClientInfo clientInfo = this.clientInfo;
        if (clientInfo == null) {
            if (logRequest.getClientInfo() != null) {
                return false;
            }
        } else if (!clientInfo.equals(logRequest.getClientInfo())) {
            return false;
        }
        java.lang.Integer num = this.logSource;
        if (num == null) {
            if (logRequest.getLogSource() != null) {
                return false;
            }
        } else if (!num.equals(logRequest.getLogSource())) {
            return false;
        }
        java.lang.String str = this.logSourceName;
        if (str == null) {
            if (logRequest.getLogSourceName() != null) {
                return false;
            }
        } else if (!str.equals(logRequest.getLogSourceName())) {
            return false;
        }
        java.util.List<com.google.android.datatransport.cct.internal.LogEvent> list = this.logEvents;
        if (list == null) {
            if (logRequest.getLogEvents() != null) {
                return false;
            }
        } else if (!list.equals(logRequest.getLogEvents())) {
            return false;
        }
        com.google.android.datatransport.cct.internal.QosTier qosTier = this.qosTier;
        if (qosTier == null) {
            if (logRequest.getQosTier() != null) {
                return false;
            }
        } else if (!qosTier.equals(logRequest.getQosTier())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.requestTimeMs;
        int i = (int) (j ^ (j >>> 32));
        long j2 = this.requestUptimeMs;
        int i2 = (int) ((j2 >>> 32) ^ j2);
        com.google.android.datatransport.cct.internal.ClientInfo clientInfo = this.clientInfo;
        int hashCode = clientInfo == null ? 0 : clientInfo.hashCode();
        java.lang.Integer num = this.logSource;
        int hashCode2 = num == null ? 0 : num.hashCode();
        java.lang.String str = this.logSourceName;
        int hashCode3 = str == null ? 0 : str.hashCode();
        java.util.List<com.google.android.datatransport.cct.internal.LogEvent> list = this.logEvents;
        int hashCode4 = list == null ? 0 : list.hashCode();
        com.google.android.datatransport.cct.internal.QosTier qosTier = this.qosTier;
        return ((((((((((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ hashCode) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ (qosTier != null ? qosTier.hashCode() : 0);
    }

    static final class Builder extends com.google.android.datatransport.cct.internal.LogRequest.Builder {
        private com.google.android.datatransport.cct.internal.ClientInfo clientInfo;
        private java.util.List<com.google.android.datatransport.cct.internal.LogEvent> logEvents;
        private java.lang.Integer logSource;
        private java.lang.String logSourceName;
        private com.google.android.datatransport.cct.internal.QosTier qosTier;
        private java.lang.Long requestTimeMs;
        private java.lang.Long requestUptimeMs;

        Builder() {
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public final com.google.android.datatransport.cct.internal.LogRequest.Builder setRequestTimeMs(long j) {
            this.requestTimeMs = java.lang.Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public final com.google.android.datatransport.cct.internal.LogRequest.Builder setRequestUptimeMs(long j) {
            this.requestUptimeMs = java.lang.Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public final com.google.android.datatransport.cct.internal.LogRequest.Builder setClientInfo(com.google.android.datatransport.cct.internal.ClientInfo clientInfo) {
            this.clientInfo = clientInfo;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        final com.google.android.datatransport.cct.internal.LogRequest.Builder setLogSource(java.lang.Integer num) {
            this.logSource = num;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        final com.google.android.datatransport.cct.internal.LogRequest.Builder setLogSourceName(java.lang.String str) {
            this.logSourceName = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public final com.google.android.datatransport.cct.internal.LogRequest.Builder setLogEvents(java.util.List<com.google.android.datatransport.cct.internal.LogEvent> list) {
            this.logEvents = list;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public final com.google.android.datatransport.cct.internal.LogRequest.Builder setQosTier(com.google.android.datatransport.cct.internal.QosTier qosTier) {
            this.qosTier = qosTier;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public final com.google.android.datatransport.cct.internal.LogRequest build() {
            java.lang.String str;
            if (this.requestTimeMs != null) {
                str = "";
            } else {
                str = " requestTimeMs";
            }
            if (this.requestUptimeMs == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append(" requestUptimeMs");
                str = sb.toString();
            }
            if (!str.isEmpty()) {
                throw new java.lang.IllegalStateException("Missing required properties:".concat(java.lang.String.valueOf(str)));
            }
            return new com.google.android.datatransport.cct.internal.AutoValue_LogRequest(this.requestTimeMs.longValue(), this.requestUptimeMs.longValue(), this.clientInfo, this.logSource, this.logSourceName, this.logEvents, this.qosTier);
        }
    }
}
