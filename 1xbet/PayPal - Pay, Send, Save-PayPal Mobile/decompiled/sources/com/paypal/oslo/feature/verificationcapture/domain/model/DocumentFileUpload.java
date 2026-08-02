package com.paypal.oslo.feature.verificationcapture.domain.model;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentFileUpload;", "", "Ljava/io/File;", "file", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentSide;", "side", "<init>", "(Ljava/io/File;Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentSide;)V", "component1", "()Ljava/io/File;", "component2", "()Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentSide;", "copy", "(Ljava/io/File;Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentSide;)Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentFileUpload;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/io/File;", "getFile", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentSide;", "getSide"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class DocumentFileUpload {
    public static final int $stable = 8;
    private final java.io.File file;
    private final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide side;

    public DocumentFileUpload(java.io.File file, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentSide, "");
        this.file = file;
        this.side = documentSide;
    }

    public final java.io.File getFile() {
        return this.file;
    }

    public final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide getSide() {
        return this.side;
    }

    public final java.lang.String toString() {
        java.io.File file = this.file;
        com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide = this.side;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DocumentFileUpload(file=");
        sb.append(file);
        sb.append(", side=");
        sb.append(documentSide);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.file.hashCode() * 31) + this.side.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.verificationcapture.domain.model.DocumentFileUpload)) {
            return false;
        }
        com.paypal.oslo.feature.verificationcapture.domain.model.DocumentFileUpload documentFileUpload = (com.paypal.oslo.feature.verificationcapture.domain.model.DocumentFileUpload) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.file, documentFileUpload.file) && this.side == documentFileUpload.side;
    }

    public final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentFileUpload copy(java.io.File file, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide side) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(side, "");
        return new com.paypal.oslo.feature.verificationcapture.domain.model.DocumentFileUpload(file, side);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide getSide() {
        return this.side;
    }

    /* renamed from: component1, reason: from getter */
    public final java.io.File getFile() {
        return this.file;
    }

    public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.domain.model.DocumentFileUpload copy$default(com.paypal.oslo.feature.verificationcapture.domain.model.DocumentFileUpload documentFileUpload, java.io.File file, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            file = documentFileUpload.file;
        }
        if ((i & 2) != 0) {
            documentSide = documentFileUpload.side;
        }
        return documentFileUpload.copy(file, documentSide);
    }
}
