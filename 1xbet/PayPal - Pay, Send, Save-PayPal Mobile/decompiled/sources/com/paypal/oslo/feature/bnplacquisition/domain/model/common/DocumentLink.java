package com.paypal.oslo.feature.bnplacquisition.domain.model.common;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ<\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u001a\u0010!\u001a\u00020 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/DocumentLink;", "", "", "fileName", "relativePath", "staticUrl", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/DocumentLinkType;", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/DocumentLinkType;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/DocumentLinkType;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/DocumentLinkType;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/DocumentLink;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFileName", "getRelativePath", "getStaticUrl", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/DocumentLinkType;", "getType", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/DocumentIdentifierType;", "identifierType", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/DocumentIdentifierType;", "getIdentifierType", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/DocumentIdentifierType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class DocumentLink {
    public static final int $stable = 0;
    private final java.lang.String fileName;
    private final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.DocumentIdentifierType identifierType;
    private final java.lang.String relativePath;
    private final java.lang.String staticUrl;
    private final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.DocumentLinkType type;

    public DocumentLink(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.bnplacquisition.domain.model.enums.DocumentLinkType documentLinkType) {
        com.paypal.oslo.feature.bnplacquisition.domain.model.enums.DocumentIdentifierType documentIdentifierType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentLinkType, "");
        this.fileName = str;
        this.relativePath = str2;
        this.staticUrl = str3;
        this.type = documentLinkType;
        java.lang.String str4 = str2;
        if (str4 == null || str4.length() == 0) {
            java.lang.String str5 = str3;
            documentIdentifierType = (str5 == null || str5.length() == 0) ? com.paypal.oslo.feature.bnplacquisition.domain.model.enums.DocumentIdentifierType.UNKNOWN : com.paypal.oslo.feature.bnplacquisition.domain.model.enums.DocumentIdentifierType.URL;
        } else {
            documentIdentifierType = com.paypal.oslo.feature.bnplacquisition.domain.model.enums.DocumentIdentifierType.ID;
        }
        this.identifierType = documentIdentifierType;
    }

    public /* synthetic */ DocumentLink(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.bnplacquisition.domain.model.enums.DocumentLinkType documentLinkType, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, documentLinkType);
    }

    public final java.lang.String getFileName() {
        return this.fileName;
    }

    public final java.lang.String getRelativePath() {
        return this.relativePath;
    }

    public final java.lang.String getStaticUrl() {
        return this.staticUrl;
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.DocumentLinkType getType() {
        return this.type;
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.DocumentIdentifierType getIdentifierType() {
        return this.identifierType;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.fileName;
        java.lang.String str2 = this.relativePath;
        java.lang.String str3 = this.staticUrl;
        com.paypal.oslo.feature.bnplacquisition.domain.model.enums.DocumentLinkType documentLinkType = this.type;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DocumentLink(fileName=");
        sb.append(str);
        sb.append(", relativePath=");
        sb.append(str2);
        sb.append(", staticUrl=");
        sb.append(str3);
        sb.append(", type=");
        sb.append(documentLinkType);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.fileName.hashCode();
        java.lang.String str = this.relativePath;
        int hashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.staticUrl;
        return (((((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.type.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.common.DocumentLink)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.DocumentLink documentLink = (com.paypal.oslo.feature.bnplacquisition.domain.model.common.DocumentLink) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.fileName, documentLink.fileName) && kotlin.jvm.internal.Intrinsics.areEqual(this.relativePath, documentLink.relativePath) && kotlin.jvm.internal.Intrinsics.areEqual(this.staticUrl, documentLink.staticUrl) && this.type == documentLink.type;
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.common.DocumentLink copy(java.lang.String fileName, java.lang.String relativePath, java.lang.String staticUrl, com.paypal.oslo.feature.bnplacquisition.domain.model.enums.DocumentLinkType type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.common.DocumentLink(fileName, relativePath, staticUrl, type);
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.DocumentLinkType getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getStaticUrl() {
        return this.staticUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getRelativePath() {
        return this.relativePath;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getFileName() {
        return this.fileName;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.common.DocumentLink copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.common.DocumentLink documentLink, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.bnplacquisition.domain.model.enums.DocumentLinkType documentLinkType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = documentLink.fileName;
        }
        if ((i & 2) != 0) {
            str2 = documentLink.relativePath;
        }
        if ((i & 4) != 0) {
            str3 = documentLink.staticUrl;
        }
        if ((i & 8) != 0) {
            documentLinkType = documentLink.type;
        }
        return documentLink.copy(str, str2, str3, documentLinkType);
    }
}
