package com.google.android.datatransport.cct.internal;

/* loaded from: classes8.dex */
final class AutoValue_ExternalPrivacyContext extends com.google.android.datatransport.cct.internal.ExternalPrivacyContext {
    private final com.google.android.datatransport.cct.internal.ExternalPRequestContext prequest;

    private AutoValue_ExternalPrivacyContext(com.google.android.datatransport.cct.internal.ExternalPRequestContext externalPRequestContext) {
        this.prequest = externalPRequestContext;
    }

    @Override // com.google.android.datatransport.cct.internal.ExternalPrivacyContext
    public final com.google.android.datatransport.cct.internal.ExternalPRequestContext getPrequest() {
        return this.prequest;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ExternalPrivacyContext{prequest=");
        sb.append(this.prequest);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.datatransport.cct.internal.ExternalPrivacyContext)) {
            return false;
        }
        com.google.android.datatransport.cct.internal.ExternalPRequestContext externalPRequestContext = this.prequest;
        com.google.android.datatransport.cct.internal.ExternalPRequestContext prequest = ((com.google.android.datatransport.cct.internal.ExternalPrivacyContext) obj).getPrequest();
        return externalPRequestContext == null ? prequest == null : externalPRequestContext.equals(prequest);
    }

    public final int hashCode() {
        com.google.android.datatransport.cct.internal.ExternalPRequestContext externalPRequestContext = this.prequest;
        return (externalPRequestContext == null ? 0 : externalPRequestContext.hashCode()) ^ 1000003;
    }

    static final class Builder extends com.google.android.datatransport.cct.internal.ExternalPrivacyContext.Builder {
        private com.google.android.datatransport.cct.internal.ExternalPRequestContext prequest;

        Builder() {
        }

        @Override // com.google.android.datatransport.cct.internal.ExternalPrivacyContext.Builder
        public final com.google.android.datatransport.cct.internal.ExternalPrivacyContext.Builder setPrequest(com.google.android.datatransport.cct.internal.ExternalPRequestContext externalPRequestContext) {
            this.prequest = externalPRequestContext;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.ExternalPrivacyContext.Builder
        public final com.google.android.datatransport.cct.internal.ExternalPrivacyContext build() {
            return new com.google.android.datatransport.cct.internal.AutoValue_ExternalPrivacyContext(this.prequest);
        }
    }
}
