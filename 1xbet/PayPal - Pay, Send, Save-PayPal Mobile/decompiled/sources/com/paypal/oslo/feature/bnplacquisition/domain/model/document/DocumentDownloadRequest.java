package com.paypal.oslo.feature.bnplacquisition.domain.model.document;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/document/DocumentDownloadRequest;", "", "", "url", "fileName", "creditAccountId", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/productselection/CreditProductIdentifier;", com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware.KEY_CPI, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/productselection/CreditProductIdentifier;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/productselection/CreditProductIdentifier;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/productselection/CreditProductIdentifier;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/document/DocumentDownloadRequest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl", "getFileName", "getCreditAccountId", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/productselection/CreditProductIdentifier;", "getCpi"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class DocumentDownloadRequest {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier cpi;
    private final java.lang.String creditAccountId;
    private final java.lang.String fileName;
    private final java.lang.String url;

    public DocumentDownloadRequest(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier creditProductIdentifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        this.url = str;
        this.fileName = str2;
        this.creditAccountId = str3;
        this.cpi = creditProductIdentifier;
    }

    public final java.lang.String getUrl() {
        return this.url;
    }

    public final java.lang.String getFileName() {
        return this.fileName;
    }

    public final java.lang.String getCreditAccountId() {
        return this.creditAccountId;
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier getCpi() {
        return this.cpi;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.url;
        java.lang.String str2 = this.fileName;
        java.lang.String str3 = this.creditAccountId;
        com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier creditProductIdentifier = this.cpi;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DocumentDownloadRequest(url=");
        sb.append(str);
        sb.append(", fileName=");
        sb.append(str2);
        sb.append(", creditAccountId=");
        sb.append(str3);
        sb.append(", cpi=");
        sb.append(creditProductIdentifier);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.url.hashCode() * 31) + this.fileName.hashCode()) * 31) + this.creditAccountId.hashCode()) * 31) + this.cpi.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.document.DocumentDownloadRequest)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.domain.model.document.DocumentDownloadRequest documentDownloadRequest = (com.paypal.oslo.feature.bnplacquisition.domain.model.document.DocumentDownloadRequest) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.url, documentDownloadRequest.url) && kotlin.jvm.internal.Intrinsics.areEqual(this.fileName, documentDownloadRequest.fileName) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, documentDownloadRequest.creditAccountId) && this.cpi == documentDownloadRequest.cpi;
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.document.DocumentDownloadRequest copy(java.lang.String url, java.lang.String fileName, java.lang.String creditAccountId, com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier cpi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cpi, "");
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.document.DocumentDownloadRequest(url, fileName, creditAccountId, cpi);
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier getCpi() {
        return this.cpi;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCreditAccountId() {
        return this.creditAccountId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getFileName() {
        return this.fileName;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getUrl() {
        return this.url;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.document.DocumentDownloadRequest copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.document.DocumentDownloadRequest documentDownloadRequest, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier creditProductIdentifier, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = documentDownloadRequest.url;
        }
        if ((i & 2) != 0) {
            str2 = documentDownloadRequest.fileName;
        }
        if ((i & 4) != 0) {
            str3 = documentDownloadRequest.creditAccountId;
        }
        if ((i & 8) != 0) {
            creditProductIdentifier = documentDownloadRequest.cpi;
        }
        return documentDownloadRequest.copy(str, str2, str3, creditProductIdentifier);
    }
}
