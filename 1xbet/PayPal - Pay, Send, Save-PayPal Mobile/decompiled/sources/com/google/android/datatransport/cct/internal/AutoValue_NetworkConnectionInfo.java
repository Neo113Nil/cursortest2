package com.google.android.datatransport.cct.internal;

/* loaded from: classes8.dex */
final class AutoValue_NetworkConnectionInfo extends com.google.android.datatransport.cct.internal.NetworkConnectionInfo {
    private final com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype mobileSubtype;
    private final com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType networkType;

    private AutoValue_NetworkConnectionInfo(com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType networkType, com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype mobileSubtype) {
        this.networkType = networkType;
        this.mobileSubtype = mobileSubtype;
    }

    @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo
    public final com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType getNetworkType() {
        return this.networkType;
    }

    @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo
    public final com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype getMobileSubtype() {
        return this.mobileSubtype;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NetworkConnectionInfo{networkType=");
        sb.append(this.networkType);
        sb.append(", mobileSubtype=");
        sb.append(this.mobileSubtype);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.datatransport.cct.internal.NetworkConnectionInfo)) {
            return false;
        }
        com.google.android.datatransport.cct.internal.NetworkConnectionInfo networkConnectionInfo = (com.google.android.datatransport.cct.internal.NetworkConnectionInfo) obj;
        com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType networkType = this.networkType;
        if (networkType == null) {
            if (networkConnectionInfo.getNetworkType() != null) {
                return false;
            }
        } else if (!networkType.equals(networkConnectionInfo.getNetworkType())) {
            return false;
        }
        com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype mobileSubtype = this.mobileSubtype;
        if (mobileSubtype == null) {
            if (networkConnectionInfo.getMobileSubtype() != null) {
                return false;
            }
        } else if (!mobileSubtype.equals(networkConnectionInfo.getMobileSubtype())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType networkType = this.networkType;
        int hashCode = networkType == null ? 0 : networkType.hashCode();
        com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype mobileSubtype = this.mobileSubtype;
        return ((hashCode ^ 1000003) * 1000003) ^ (mobileSubtype != null ? mobileSubtype.hashCode() : 0);
    }

    static final class Builder extends com.google.android.datatransport.cct.internal.NetworkConnectionInfo.Builder {
        private com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype mobileSubtype;
        private com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType networkType;

        Builder() {
        }

        @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo.Builder
        public final com.google.android.datatransport.cct.internal.NetworkConnectionInfo.Builder setNetworkType(com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType networkType) {
            this.networkType = networkType;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo.Builder
        public final com.google.android.datatransport.cct.internal.NetworkConnectionInfo.Builder setMobileSubtype(com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype mobileSubtype) {
            this.mobileSubtype = mobileSubtype;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.NetworkConnectionInfo.Builder
        public final com.google.android.datatransport.cct.internal.NetworkConnectionInfo build() {
            return new com.google.android.datatransport.cct.internal.AutoValue_NetworkConnectionInfo(this.networkType, this.mobileSubtype);
        }
    }
}
