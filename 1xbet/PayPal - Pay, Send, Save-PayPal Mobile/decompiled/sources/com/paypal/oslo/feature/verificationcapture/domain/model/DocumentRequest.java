package com.paypal.oslo.feature.verificationcapture.domain.model;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000eJN\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0013J\u0010\u0010\u001c\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b!\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0013R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b$\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentRequest;", "", "", "", "labels", "type", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "", "filesTotal", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/FileUploadInfo;", "files", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "component4", "()I", "component5", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentRequest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/util/List;", "getLabels", "Ljava/lang/String;", "getType", "getContentType", com.visa.cbp.getEncExpo.warmup, "getFilesTotal", "getFiles"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class DocumentRequest {
    public static final int $stable = 8;
    private final java.lang.String contentType;
    private final java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.FileUploadInfo> files;
    private final int filesTotal;
    private final java.util.List<java.lang.String> labels;
    private final java.lang.String type;

    public DocumentRequest(java.util.List<java.lang.String> list, java.lang.String str, java.lang.String str2, int i, java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.FileUploadInfo> list2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        this.labels = list;
        this.type = str;
        this.contentType = str2;
        this.filesTotal = i;
        this.files = list2;
    }

    public final java.util.List<java.lang.String> getLabels() {
        return this.labels;
    }

    public final java.lang.String getType() {
        return this.type;
    }

    public final java.lang.String getContentType() {
        return this.contentType;
    }

    public final int getFilesTotal() {
        return this.filesTotal;
    }

    public final java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.FileUploadInfo> getFiles() {
        return this.files;
    }

    public final java.lang.String toString() {
        java.util.List<java.lang.String> list = this.labels;
        java.lang.String str = this.type;
        java.lang.String str2 = this.contentType;
        int i = this.filesTotal;
        java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.FileUploadInfo> list2 = this.files;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DocumentRequest(labels=");
        sb.append(list);
        sb.append(", type=");
        sb.append(str);
        sb.append(", contentType=");
        sb.append(str2);
        sb.append(", filesTotal=");
        sb.append(i);
        sb.append(", files=");
        sb.append(list2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((this.labels.hashCode() * 31) + this.type.hashCode()) * 31) + this.contentType.hashCode()) * 31) + java.lang.Integer.hashCode(this.filesTotal)) * 31) + this.files.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.verificationcapture.domain.model.DocumentRequest)) {
            return false;
        }
        com.paypal.oslo.feature.verificationcapture.domain.model.DocumentRequest documentRequest = (com.paypal.oslo.feature.verificationcapture.domain.model.DocumentRequest) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.labels, documentRequest.labels) && kotlin.jvm.internal.Intrinsics.areEqual(this.type, documentRequest.type) && kotlin.jvm.internal.Intrinsics.areEqual(this.contentType, documentRequest.contentType) && this.filesTotal == documentRequest.filesTotal && kotlin.jvm.internal.Intrinsics.areEqual(this.files, documentRequest.files);
    }

    public final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentRequest copy(java.util.List<java.lang.String> labels, java.lang.String type, java.lang.String contentType, int filesTotal, java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.FileUploadInfo> files) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(labels, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(files, "");
        return new com.paypal.oslo.feature.verificationcapture.domain.model.DocumentRequest(labels, type, contentType, filesTotal, files);
    }

    public final java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.FileUploadInfo> component5() {
        return this.files;
    }

    /* renamed from: component4, reason: from getter */
    public final int getFilesTotal() {
        return this.filesTotal;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getContentType() {
        return this.contentType;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getType() {
        return this.type;
    }

    public final java.util.List<java.lang.String> component1() {
        return this.labels;
    }

    public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.domain.model.DocumentRequest copy$default(com.paypal.oslo.feature.verificationcapture.domain.model.DocumentRequest documentRequest, java.util.List list, java.lang.String str, java.lang.String str2, int i, java.util.List list2, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            list = documentRequest.labels;
        }
        if ((i2 & 2) != 0) {
            str = documentRequest.type;
        }
        java.lang.String str3 = str;
        if ((i2 & 4) != 0) {
            str2 = documentRequest.contentType;
        }
        java.lang.String str4 = str2;
        if ((i2 & 8) != 0) {
            i = documentRequest.filesTotal;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            list2 = documentRequest.files;
        }
        return documentRequest.copy(list, str3, str4, i3, list2);
    }
}
