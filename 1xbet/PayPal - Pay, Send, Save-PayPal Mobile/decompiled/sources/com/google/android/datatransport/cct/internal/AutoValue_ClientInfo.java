package com.google.android.datatransport.cct.internal;

/* loaded from: classes8.dex */
final class AutoValue_ClientInfo extends com.google.android.datatransport.cct.internal.ClientInfo {
    private final com.google.android.datatransport.cct.internal.AndroidClientInfo androidClientInfo;
    private final com.google.android.datatransport.cct.internal.ClientInfo.ClientType clientType;

    private AutoValue_ClientInfo(com.google.android.datatransport.cct.internal.ClientInfo.ClientType clientType, com.google.android.datatransport.cct.internal.AndroidClientInfo androidClientInfo) {
        this.clientType = clientType;
        this.androidClientInfo = androidClientInfo;
    }

    @Override // com.google.android.datatransport.cct.internal.ClientInfo
    public final com.google.android.datatransport.cct.internal.ClientInfo.ClientType getClientType() {
        return this.clientType;
    }

    @Override // com.google.android.datatransport.cct.internal.ClientInfo
    public final com.google.android.datatransport.cct.internal.AndroidClientInfo getAndroidClientInfo() {
        return this.androidClientInfo;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ClientInfo{clientType=");
        sb.append(this.clientType);
        sb.append(", androidClientInfo=");
        sb.append(this.androidClientInfo);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.datatransport.cct.internal.ClientInfo)) {
            return false;
        }
        com.google.android.datatransport.cct.internal.ClientInfo clientInfo = (com.google.android.datatransport.cct.internal.ClientInfo) obj;
        com.google.android.datatransport.cct.internal.ClientInfo.ClientType clientType = this.clientType;
        if (clientType == null) {
            if (clientInfo.getClientType() != null) {
                return false;
            }
        } else if (!clientType.equals(clientInfo.getClientType())) {
            return false;
        }
        com.google.android.datatransport.cct.internal.AndroidClientInfo androidClientInfo = this.androidClientInfo;
        if (androidClientInfo == null) {
            if (clientInfo.getAndroidClientInfo() != null) {
                return false;
            }
        } else if (!androidClientInfo.equals(clientInfo.getAndroidClientInfo())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        com.google.android.datatransport.cct.internal.ClientInfo.ClientType clientType = this.clientType;
        int hashCode = clientType == null ? 0 : clientType.hashCode();
        com.google.android.datatransport.cct.internal.AndroidClientInfo androidClientInfo = this.androidClientInfo;
        return ((hashCode ^ 1000003) * 1000003) ^ (androidClientInfo != null ? androidClientInfo.hashCode() : 0);
    }

    static final class Builder extends com.google.android.datatransport.cct.internal.ClientInfo.Builder {
        private com.google.android.datatransport.cct.internal.AndroidClientInfo androidClientInfo;
        private com.google.android.datatransport.cct.internal.ClientInfo.ClientType clientType;

        Builder() {
        }

        @Override // com.google.android.datatransport.cct.internal.ClientInfo.Builder
        public final com.google.android.datatransport.cct.internal.ClientInfo.Builder setClientType(com.google.android.datatransport.cct.internal.ClientInfo.ClientType clientType) {
            this.clientType = clientType;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.ClientInfo.Builder
        public final com.google.android.datatransport.cct.internal.ClientInfo.Builder setAndroidClientInfo(com.google.android.datatransport.cct.internal.AndroidClientInfo androidClientInfo) {
            this.androidClientInfo = androidClientInfo;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.ClientInfo.Builder
        public final com.google.android.datatransport.cct.internal.ClientInfo build() {
            return new com.google.android.datatransport.cct.internal.AutoValue_ClientInfo(this.clientType, this.androidClientInfo);
        }
    }
}
