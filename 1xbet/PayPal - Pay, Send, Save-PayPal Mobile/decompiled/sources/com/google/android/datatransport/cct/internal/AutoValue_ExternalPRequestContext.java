package com.google.android.datatransport.cct.internal;

/* loaded from: classes8.dex */
final class AutoValue_ExternalPRequestContext extends com.google.android.datatransport.cct.internal.ExternalPRequestContext {
    private final java.lang.Integer originAssociatedProductId;

    private AutoValue_ExternalPRequestContext(java.lang.Integer num) {
        this.originAssociatedProductId = num;
    }

    @Override // com.google.android.datatransport.cct.internal.ExternalPRequestContext
    public final java.lang.Integer getOriginAssociatedProductId() {
        return this.originAssociatedProductId;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ExternalPRequestContext{originAssociatedProductId=");
        sb.append(this.originAssociatedProductId);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.datatransport.cct.internal.ExternalPRequestContext)) {
            return false;
        }
        java.lang.Integer num = this.originAssociatedProductId;
        java.lang.Integer originAssociatedProductId = ((com.google.android.datatransport.cct.internal.ExternalPRequestContext) obj).getOriginAssociatedProductId();
        return num == null ? originAssociatedProductId == null : num.equals(originAssociatedProductId);
    }

    public final int hashCode() {
        java.lang.Integer num = this.originAssociatedProductId;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    static final class Builder extends com.google.android.datatransport.cct.internal.ExternalPRequestContext.Builder {
        private java.lang.Integer originAssociatedProductId;

        Builder() {
        }

        @Override // com.google.android.datatransport.cct.internal.ExternalPRequestContext.Builder
        public final com.google.android.datatransport.cct.internal.ExternalPRequestContext.Builder setOriginAssociatedProductId(java.lang.Integer num) {
            this.originAssociatedProductId = num;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.ExternalPRequestContext.Builder
        public final com.google.android.datatransport.cct.internal.ExternalPRequestContext build() {
            return new com.google.android.datatransport.cct.internal.AutoValue_ExternalPRequestContext(this.originAssociatedProductId);
        }
    }
}
