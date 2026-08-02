package com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u0011\u0010!\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b \u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/documents/DocumentItemUiModel;", "", "", "displayName", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/disclosure/ConsentType;", "type", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/DocumentLink;", "downloadLink", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/disclosure/ConsentType;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/DocumentLink;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/disclosure/ConsentType;", "component3", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/DocumentLink;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/disclosure/ConsentType;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/DocumentLink;)Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/documents/DocumentItemUiModel;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDisplayName", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/disclosure/ConsentType;", "getType", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/DocumentLink;", "getDownloadLink", "getDownloadFileName", "downloadFileName"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class DocumentItemUiModel {
    public static final int $stable = 0;
    private final java.lang.String displayName;
    private final com.paypal.oslo.feature.bnplacquisition.domain.model.common.DocumentLink downloadLink;
    private final com.paypal.oslo.feature.bnplacquisition.domain.model.disclosure.ConsentType type;

    public DocumentItemUiModel(java.lang.String str, com.paypal.oslo.feature.bnplacquisition.domain.model.disclosure.ConsentType consentType, com.paypal.oslo.feature.bnplacquisition.domain.model.common.DocumentLink documentLink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consentType, "");
        this.displayName = str;
        this.type = consentType;
        this.downloadLink = documentLink;
    }

    public final java.lang.String getDisplayName() {
        return this.displayName;
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.disclosure.ConsentType getType() {
        return this.type;
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.common.DocumentLink getDownloadLink() {
        return this.downloadLink;
    }

    public final java.lang.String getDownloadFileName() {
        java.lang.String fileName;
        java.lang.String obj;
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.DocumentLink documentLink = this.downloadLink;
        if (documentLink != null && (fileName = documentLink.getFileName()) != null && (obj = kotlin.text.StringsKt.trim(fileName).toString()) != null) {
            if (kotlin.text.StringsKt.isBlank(obj)) {
                obj = null;
            }
            if (obj != null) {
                return obj;
            }
        }
        java.lang.String lowerCase = this.type.getValue().toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        java.lang.String replace$default = kotlin.text.StringsKt.replace$default(lowerCase, "_", "-", false, 4, (java.lang.Object) null);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(replace$default);
        sb.append(".pdf");
        return sb.toString();
    }

    public final java.lang.String toString() {
        java.lang.String str = this.displayName;
        com.paypal.oslo.feature.bnplacquisition.domain.model.disclosure.ConsentType consentType = this.type;
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.DocumentLink documentLink = this.downloadLink;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DocumentItemUiModel(displayName=");
        sb.append(str);
        sb.append(", type=");
        sb.append(consentType);
        sb.append(", downloadLink=");
        sb.append(documentLink);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.displayName.hashCode();
        int hashCode2 = this.type.hashCode();
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.DocumentLink documentLink = this.downloadLink;
        return (((hashCode * 31) + hashCode2) * 31) + (documentLink == null ? 0 : documentLink.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentItemUiModel)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentItemUiModel documentItemUiModel = (com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentItemUiModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.displayName, documentItemUiModel.displayName) && this.type == documentItemUiModel.type && kotlin.jvm.internal.Intrinsics.areEqual(this.downloadLink, documentItemUiModel.downloadLink);
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentItemUiModel copy(java.lang.String displayName, com.paypal.oslo.feature.bnplacquisition.domain.model.disclosure.ConsentType type, com.paypal.oslo.feature.bnplacquisition.domain.model.common.DocumentLink downloadLink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentItemUiModel(displayName, type, downloadLink);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.bnplacquisition.domain.model.common.DocumentLink getDownloadLink() {
        return this.downloadLink;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.bnplacquisition.domain.model.disclosure.ConsentType getType() {
        return this.type;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getDisplayName() {
        return this.displayName;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentItemUiModel copy$default(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentItemUiModel documentItemUiModel, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.domain.model.disclosure.ConsentType consentType, com.paypal.oslo.feature.bnplacquisition.domain.model.common.DocumentLink documentLink, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = documentItemUiModel.displayName;
        }
        if ((i & 2) != 0) {
            consentType = documentItemUiModel.type;
        }
        if ((i & 4) != 0) {
            documentLink = documentItemUiModel.downloadLink;
        }
        return documentItemUiModel.copy(str, consentType, documentLink);
    }
}
