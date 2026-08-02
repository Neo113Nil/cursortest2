package com.paypal.oslo.feature.verificationcapture.api.widget;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJB\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000fR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b#\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/api/widget/IdScanWidgetStatus;", "", "Lcom/paypal/oslo/feature/verificationcapture/api/widget/WidgetStatusCode;", "statusCode", "", "documentId", "", "Lcom/paypal/oslo/feature/verificationcapture/api/widget/CapturedFile;", "capturedFiles", "errorMessage", "<init>", "(Lcom/paypal/oslo/feature/verificationcapture/api/widget/WidgetStatusCode;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/verificationcapture/api/widget/WidgetStatusCode;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/List;", "component4", "copy", "(Lcom/paypal/oslo/feature/verificationcapture/api/widget/WidgetStatusCode;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/paypal/oslo/feature/verificationcapture/api/widget/IdScanWidgetStatus;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/verificationcapture/api/widget/WidgetStatusCode;", "getStatusCode", "Ljava/lang/String;", "getDocumentId", "Ljava/util/List;", "getCapturedFiles", "getErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class IdScanWidgetStatus {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.verificationcapture.api.widget.CapturedFile> capturedFiles;
    private final java.lang.String documentId;
    private final java.lang.String errorMessage;
    private final com.paypal.oslo.feature.verificationcapture.api.widget.WidgetStatusCode statusCode;

    public IdScanWidgetStatus(com.paypal.oslo.feature.verificationcapture.api.widget.WidgetStatusCode widgetStatusCode, java.lang.String str, java.util.List<com.paypal.oslo.feature.verificationcapture.api.widget.CapturedFile> list, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(widgetStatusCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.statusCode = widgetStatusCode;
        this.documentId = str;
        this.capturedFiles = list;
        this.errorMessage = str2;
    }

    public final com.paypal.oslo.feature.verificationcapture.api.widget.WidgetStatusCode getStatusCode() {
        return this.statusCode;
    }

    public final java.lang.String getDocumentId() {
        return this.documentId;
    }

    public /* synthetic */ IdScanWidgetStatus(com.paypal.oslo.feature.verificationcapture.api.widget.WidgetStatusCode widgetStatusCode, java.lang.String str, java.util.List list, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(widgetStatusCode, (i & 2) != 0 ? null : str, (i & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : str2);
    }

    public final java.util.List<com.paypal.oslo.feature.verificationcapture.api.widget.CapturedFile> getCapturedFiles() {
        return this.capturedFiles;
    }

    public final java.lang.String getErrorMessage() {
        return this.errorMessage;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.verificationcapture.api.widget.WidgetStatusCode widgetStatusCode = this.statusCode;
        java.lang.String str = this.documentId;
        java.util.List<com.paypal.oslo.feature.verificationcapture.api.widget.CapturedFile> list = this.capturedFiles;
        java.lang.String str2 = this.errorMessage;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("IdScanWidgetStatus(statusCode=");
        sb.append(widgetStatusCode);
        sb.append(", documentId=");
        sb.append(str);
        sb.append(", capturedFiles=");
        sb.append(list);
        sb.append(", errorMessage=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.statusCode.hashCode();
        java.lang.String str = this.documentId;
        int hashCode2 = str == null ? 0 : str.hashCode();
        int hashCode3 = this.capturedFiles.hashCode();
        java.lang.String str2 = this.errorMessage;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetStatus)) {
            return false;
        }
        com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetStatus idScanWidgetStatus = (com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetStatus) other;
        return this.statusCode == idScanWidgetStatus.statusCode && kotlin.jvm.internal.Intrinsics.areEqual(this.documentId, idScanWidgetStatus.documentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.capturedFiles, idScanWidgetStatus.capturedFiles) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, idScanWidgetStatus.errorMessage);
    }

    public final com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetStatus copy(com.paypal.oslo.feature.verificationcapture.api.widget.WidgetStatusCode statusCode, java.lang.String documentId, java.util.List<com.paypal.oslo.feature.verificationcapture.api.widget.CapturedFile> capturedFiles, java.lang.String errorMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statusCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(capturedFiles, "");
        return new com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetStatus(statusCode, documentId, capturedFiles, errorMessage);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getErrorMessage() {
        return this.errorMessage;
    }

    public final java.util.List<com.paypal.oslo.feature.verificationcapture.api.widget.CapturedFile> component3() {
        return this.capturedFiles;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getDocumentId() {
        return this.documentId;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.verificationcapture.api.widget.WidgetStatusCode getStatusCode() {
        return this.statusCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetStatus copy$default(com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetStatus idScanWidgetStatus, com.paypal.oslo.feature.verificationcapture.api.widget.WidgetStatusCode widgetStatusCode, java.lang.String str, java.util.List list, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            widgetStatusCode = idScanWidgetStatus.statusCode;
        }
        if ((i & 2) != 0) {
            str = idScanWidgetStatus.documentId;
        }
        if ((i & 4) != 0) {
            list = idScanWidgetStatus.capturedFiles;
        }
        if ((i & 8) != 0) {
            str2 = idScanWidgetStatus.errorMessage;
        }
        return idScanWidgetStatus.copy(widgetStatusCode, str, list, str2);
    }
}
