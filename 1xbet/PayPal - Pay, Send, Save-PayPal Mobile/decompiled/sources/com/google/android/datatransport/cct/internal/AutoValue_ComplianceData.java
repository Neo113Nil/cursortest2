package com.google.android.datatransport.cct.internal;

/* loaded from: classes8.dex */
final class AutoValue_ComplianceData extends com.google.android.datatransport.cct.internal.ComplianceData {
    private final com.google.android.datatransport.cct.internal.ExternalPrivacyContext privacyContext;
    private final com.google.android.datatransport.cct.internal.ComplianceData.ProductIdOrigin productIdOrigin;

    private AutoValue_ComplianceData(com.google.android.datatransport.cct.internal.ExternalPrivacyContext externalPrivacyContext, com.google.android.datatransport.cct.internal.ComplianceData.ProductIdOrigin productIdOrigin) {
        this.privacyContext = externalPrivacyContext;
        this.productIdOrigin = productIdOrigin;
    }

    @Override // com.google.android.datatransport.cct.internal.ComplianceData
    public final com.google.android.datatransport.cct.internal.ExternalPrivacyContext getPrivacyContext() {
        return this.privacyContext;
    }

    @Override // com.google.android.datatransport.cct.internal.ComplianceData
    public final com.google.android.datatransport.cct.internal.ComplianceData.ProductIdOrigin getProductIdOrigin() {
        return this.productIdOrigin;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ComplianceData{privacyContext=");
        sb.append(this.privacyContext);
        sb.append(", productIdOrigin=");
        sb.append(this.productIdOrigin);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.datatransport.cct.internal.ComplianceData)) {
            return false;
        }
        com.google.android.datatransport.cct.internal.ComplianceData complianceData = (com.google.android.datatransport.cct.internal.ComplianceData) obj;
        com.google.android.datatransport.cct.internal.ExternalPrivacyContext externalPrivacyContext = this.privacyContext;
        if (externalPrivacyContext == null) {
            if (complianceData.getPrivacyContext() != null) {
                return false;
            }
        } else if (!externalPrivacyContext.equals(complianceData.getPrivacyContext())) {
            return false;
        }
        com.google.android.datatransport.cct.internal.ComplianceData.ProductIdOrigin productIdOrigin = this.productIdOrigin;
        if (productIdOrigin == null) {
            if (complianceData.getProductIdOrigin() != null) {
                return false;
            }
        } else if (!productIdOrigin.equals(complianceData.getProductIdOrigin())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        com.google.android.datatransport.cct.internal.ExternalPrivacyContext externalPrivacyContext = this.privacyContext;
        int hashCode = externalPrivacyContext == null ? 0 : externalPrivacyContext.hashCode();
        com.google.android.datatransport.cct.internal.ComplianceData.ProductIdOrigin productIdOrigin = this.productIdOrigin;
        return ((hashCode ^ 1000003) * 1000003) ^ (productIdOrigin != null ? productIdOrigin.hashCode() : 0);
    }

    static final class Builder extends com.google.android.datatransport.cct.internal.ComplianceData.Builder {
        private com.google.android.datatransport.cct.internal.ExternalPrivacyContext privacyContext;
        private com.google.android.datatransport.cct.internal.ComplianceData.ProductIdOrigin productIdOrigin;

        Builder() {
        }

        @Override // com.google.android.datatransport.cct.internal.ComplianceData.Builder
        public final com.google.android.datatransport.cct.internal.ComplianceData.Builder setPrivacyContext(com.google.android.datatransport.cct.internal.ExternalPrivacyContext externalPrivacyContext) {
            this.privacyContext = externalPrivacyContext;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.ComplianceData.Builder
        public final com.google.android.datatransport.cct.internal.ComplianceData.Builder setProductIdOrigin(com.google.android.datatransport.cct.internal.ComplianceData.ProductIdOrigin productIdOrigin) {
            this.productIdOrigin = productIdOrigin;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.ComplianceData.Builder
        public final com.google.android.datatransport.cct.internal.ComplianceData build() {
            return new com.google.android.datatransport.cct.internal.AutoValue_ComplianceData(this.privacyContext, this.productIdOrigin);
        }
    }
}
