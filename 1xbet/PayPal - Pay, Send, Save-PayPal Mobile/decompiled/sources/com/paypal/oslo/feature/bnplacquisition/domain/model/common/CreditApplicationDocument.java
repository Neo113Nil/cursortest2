package com.paypal.oslo.feature.bnplacquisition.domain.model.common;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J>\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b\"\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/CreditApplicationDocument;", "", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/disclosure/ConsentType;", "type", "", "html", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/DocumentLink;", "downloadLink", "viewLink", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/disclosure/ConsentType;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/DocumentLink;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/DocumentLink;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/disclosure/ConsentType;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/DocumentLink;", "component4", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/disclosure/ConsentType;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/DocumentLink;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/DocumentLink;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/CreditApplicationDocument;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/disclosure/ConsentType;", "getType", "Ljava/lang/String;", "getHtml", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/DocumentLink;", "getDownloadLink", "getViewLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CreditApplicationDocument {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.bnplacquisition.domain.model.common.DocumentLink downloadLink;
    private final java.lang.String html;
    private final com.paypal.oslo.feature.bnplacquisition.domain.model.disclosure.ConsentType type;
    private final com.paypal.oslo.feature.bnplacquisition.domain.model.common.DocumentLink viewLink;

    public CreditApplicationDocument(com.paypal.oslo.feature.bnplacquisition.domain.model.disclosure.ConsentType consentType, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.domain.model.common.DocumentLink documentLink, com.paypal.oslo.feature.bnplacquisition.domain.model.common.DocumentLink documentLink2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consentType, "");
        this.type = consentType;
        this.html = str;
        this.downloadLink = documentLink;
        this.viewLink = documentLink2;
    }

    public /* synthetic */ CreditApplicationDocument(com.paypal.oslo.feature.bnplacquisition.domain.model.disclosure.ConsentType consentType, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.domain.model.common.DocumentLink documentLink, com.paypal.oslo.feature.bnplacquisition.domain.model.common.DocumentLink documentLink2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(consentType, str, (i & 4) != 0 ? null : documentLink, (i & 8) != 0 ? null : documentLink2);
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.disclosure.ConsentType getType() {
        return this.type;
    }

    public final java.lang.String getHtml() {
        return this.html;
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.common.DocumentLink getDownloadLink() {
        return this.downloadLink;
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.common.DocumentLink getViewLink() {
        return this.viewLink;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.bnplacquisition.domain.model.disclosure.ConsentType consentType = this.type;
        java.lang.String str = this.html;
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.DocumentLink documentLink = this.downloadLink;
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.DocumentLink documentLink2 = this.viewLink;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CreditApplicationDocument(type=");
        sb.append(consentType);
        sb.append(", html=");
        sb.append(str);
        sb.append(", downloadLink=");
        sb.append(documentLink);
        sb.append(", viewLink=");
        sb.append(documentLink2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode();
        java.lang.String str = this.html;
        int hashCode2 = str == null ? 0 : str.hashCode();
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.DocumentLink documentLink = this.downloadLink;
        int hashCode3 = documentLink == null ? 0 : documentLink.hashCode();
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.DocumentLink documentLink2 = this.viewLink;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (documentLink2 != null ? documentLink2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.common.CreditApplicationDocument)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.CreditApplicationDocument creditApplicationDocument = (com.paypal.oslo.feature.bnplacquisition.domain.model.common.CreditApplicationDocument) other;
        return this.type == creditApplicationDocument.type && kotlin.jvm.internal.Intrinsics.areEqual(this.html, creditApplicationDocument.html) && kotlin.jvm.internal.Intrinsics.areEqual(this.downloadLink, creditApplicationDocument.downloadLink) && kotlin.jvm.internal.Intrinsics.areEqual(this.viewLink, creditApplicationDocument.viewLink);
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.common.CreditApplicationDocument copy(com.paypal.oslo.feature.bnplacquisition.domain.model.disclosure.ConsentType type, java.lang.String html, com.paypal.oslo.feature.bnplacquisition.domain.model.common.DocumentLink downloadLink, com.paypal.oslo.feature.bnplacquisition.domain.model.common.DocumentLink viewLink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.common.CreditApplicationDocument(type, html, downloadLink, viewLink);
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.bnplacquisition.domain.model.common.DocumentLink getViewLink() {
        return this.viewLink;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.bnplacquisition.domain.model.common.DocumentLink getDownloadLink() {
        return this.downloadLink;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getHtml() {
        return this.html;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.bnplacquisition.domain.model.disclosure.ConsentType getType() {
        return this.type;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.common.CreditApplicationDocument copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.common.CreditApplicationDocument creditApplicationDocument, com.paypal.oslo.feature.bnplacquisition.domain.model.disclosure.ConsentType consentType, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.domain.model.common.DocumentLink documentLink, com.paypal.oslo.feature.bnplacquisition.domain.model.common.DocumentLink documentLink2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            consentType = creditApplicationDocument.type;
        }
        if ((i & 2) != 0) {
            str = creditApplicationDocument.html;
        }
        if ((i & 4) != 0) {
            documentLink = creditApplicationDocument.downloadLink;
        }
        if ((i & 8) != 0) {
            documentLink2 = creditApplicationDocument.viewLink;
        }
        return creditApplicationDocument.copy(consentType, str, documentLink, documentLink2);
    }
}
