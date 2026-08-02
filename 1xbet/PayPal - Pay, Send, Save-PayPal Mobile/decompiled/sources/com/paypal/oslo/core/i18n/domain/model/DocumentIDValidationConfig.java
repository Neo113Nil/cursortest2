package com.paypal.oslo.core.i18n.domain.model;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J2\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u000bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/DocumentIDValidationConfig;", "", "Lcom/paypal/oslo/core/i18n/domain/model/CountryCode;", "countryCode", "Lcom/paypal/oslo/core/i18n/domain/model/DocumentType;", "documentType", "Lcom/paypal/oslo/core/i18n/domain/model/DocumentSubType;", "documentSubType", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/core/i18n/domain/model/DocumentType;Lcom/paypal/oslo/core/i18n/domain/model/DocumentSubType;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-iSWX8ZM", "()Ljava/lang/String;", "component1", "component2", "()Lcom/paypal/oslo/core/i18n/domain/model/DocumentType;", "component3", "()Lcom/paypal/oslo/core/i18n/domain/model/DocumentSubType;", "copy-KclIhc0", "(Ljava/lang/String;Lcom/paypal/oslo/core/i18n/domain/model/DocumentType;Lcom/paypal/oslo/core/i18n/domain/model/DocumentSubType;)Lcom/paypal/oslo/core/i18n/domain/model/DocumentIDValidationConfig;", "copy", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "Ljava/lang/String;", "getCountryCode-iSWX8ZM", "Lcom/paypal/oslo/core/i18n/domain/model/DocumentType;", "getDocumentType", "Lcom/paypal/oslo/core/i18n/domain/model/DocumentSubType;", "getDocumentSubType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class DocumentIDValidationConfig {
    private final java.lang.String countryCode;
    private final com.paypal.oslo.core.i18n.domain.model.DocumentSubType documentSubType;
    private final com.paypal.oslo.core.i18n.domain.model.DocumentType documentType;

    private DocumentIDValidationConfig(java.lang.String str, com.paypal.oslo.core.i18n.domain.model.DocumentType documentType, com.paypal.oslo.core.i18n.domain.model.DocumentSubType documentSubType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentType, "");
        this.countryCode = str;
        this.documentType = documentType;
        this.documentSubType = documentSubType;
    }

    public /* synthetic */ DocumentIDValidationConfig(java.lang.String str, com.paypal.oslo.core.i18n.domain.model.DocumentType documentType, com.paypal.oslo.core.i18n.domain.model.DocumentSubType documentSubType, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, documentType, (i & 4) != 0 ? null : documentSubType, null);
    }

    /* renamed from: getCountryCode-iSWX8ZM, reason: not valid java name */
    public final java.lang.String m11410getCountryCodeiSWX8ZM() {
        return this.countryCode;
    }

    public final com.paypal.oslo.core.i18n.domain.model.DocumentType getDocumentType() {
        return this.documentType;
    }

    public final com.paypal.oslo.core.i18n.domain.model.DocumentSubType getDocumentSubType() {
        return this.documentSubType;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.countryCode;
        java.lang.String m11368toStringimpl = str == null ? "null" : com.paypal.oslo.core.i18n.domain.model.CountryCode.m11368toStringimpl(str);
        com.paypal.oslo.core.i18n.domain.model.DocumentType documentType = this.documentType;
        com.paypal.oslo.core.i18n.domain.model.DocumentSubType documentSubType = this.documentSubType;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DocumentIDValidationConfig(countryCode=");
        sb.append(m11368toStringimpl);
        sb.append(", documentType=");
        sb.append(documentType);
        sb.append(", documentSubType=");
        sb.append(documentSubType);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.countryCode;
        int m11367hashCodeimpl = str == null ? 0 : com.paypal.oslo.core.i18n.domain.model.CountryCode.m11367hashCodeimpl(str);
        int hashCode = this.documentType.hashCode();
        com.paypal.oslo.core.i18n.domain.model.DocumentSubType documentSubType = this.documentSubType;
        return (((m11367hashCodeimpl * 31) + hashCode) * 31) + (documentSubType != null ? documentSubType.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.i18n.domain.model.DocumentIDValidationConfig)) {
            return false;
        }
        com.paypal.oslo.core.i18n.domain.model.DocumentIDValidationConfig documentIDValidationConfig = (com.paypal.oslo.core.i18n.domain.model.DocumentIDValidationConfig) other;
        java.lang.String str = this.countryCode;
        java.lang.String str2 = documentIDValidationConfig.countryCode;
        if (str != null ? str2 != null && com.paypal.oslo.core.i18n.domain.model.CountryCode.m11366equalsimpl0(str, str2) : str2 == null) {
            return this.documentType == documentIDValidationConfig.documentType && this.documentSubType == documentIDValidationConfig.documentSubType;
        }
        return false;
    }

    /* renamed from: copy-KclIhc0, reason: not valid java name */
    public final com.paypal.oslo.core.i18n.domain.model.DocumentIDValidationConfig m11409copyKclIhc0(java.lang.String countryCode, com.paypal.oslo.core.i18n.domain.model.DocumentType documentType, com.paypal.oslo.core.i18n.domain.model.DocumentSubType documentSubType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentType, "");
        return new com.paypal.oslo.core.i18n.domain.model.DocumentIDValidationConfig(countryCode, documentType, documentSubType, null);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.core.i18n.domain.model.DocumentSubType getDocumentSubType() {
        return this.documentSubType;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.core.i18n.domain.model.DocumentType getDocumentType() {
        return this.documentType;
    }

    /* renamed from: component1-iSWX8ZM, reason: not valid java name and from getter */
    public final java.lang.String getCountryCode() {
        return this.countryCode;
    }

    /* renamed from: copy-KclIhc0$default, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.DocumentIDValidationConfig m11407copyKclIhc0$default(com.paypal.oslo.core.i18n.domain.model.DocumentIDValidationConfig documentIDValidationConfig, java.lang.String str, com.paypal.oslo.core.i18n.domain.model.DocumentType documentType, com.paypal.oslo.core.i18n.domain.model.DocumentSubType documentSubType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = documentIDValidationConfig.countryCode;
        }
        if ((i & 2) != 0) {
            documentType = documentIDValidationConfig.documentType;
        }
        if ((i & 4) != 0) {
            documentSubType = documentIDValidationConfig.documentSubType;
        }
        return documentIDValidationConfig.m11409copyKclIhc0(str, documentType, documentSubType);
    }

    public /* synthetic */ DocumentIDValidationConfig(java.lang.String str, com.paypal.oslo.core.i18n.domain.model.DocumentType documentType, com.paypal.oslo.core.i18n.domain.model.DocumentSubType documentSubType, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, documentType, documentSubType);
    }
}
