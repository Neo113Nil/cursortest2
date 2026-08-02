package com.paypal.oslo.feature.verificationcapture.domain.model;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentUploadRequest;", "", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/Entity;", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Owner, "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentRequest;", "document", "<init>", "(Lcom/paypal/oslo/feature/verificationcapture/domain/model/Entity;Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentRequest;)V", "component1", "()Lcom/paypal/oslo/feature/verificationcapture/domain/model/Entity;", "component2", "()Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentRequest;", "copy", "(Lcom/paypal/oslo/feature/verificationcapture/domain/model/Entity;Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentRequest;)Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentUploadRequest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/Entity;", "getOwner", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentRequest;", "getDocument"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class DocumentUploadRequest {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentRequest document;
    private final com.paypal.oslo.feature.verificationcapture.domain.model.Entity owner;

    public DocumentUploadRequest(com.paypal.oslo.feature.verificationcapture.domain.model.Entity entity, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentRequest documentRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentRequest, "");
        this.owner = entity;
        this.document = documentRequest;
    }

    public final com.paypal.oslo.feature.verificationcapture.domain.model.Entity getOwner() {
        return this.owner;
    }

    public final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentRequest getDocument() {
        return this.document;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.verificationcapture.domain.model.Entity entity = this.owner;
        com.paypal.oslo.feature.verificationcapture.domain.model.DocumentRequest documentRequest = this.document;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DocumentUploadRequest(owner=");
        sb.append(entity);
        sb.append(", document=");
        sb.append(documentRequest);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.owner.hashCode() * 31) + this.document.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.verificationcapture.domain.model.DocumentUploadRequest)) {
            return false;
        }
        com.paypal.oslo.feature.verificationcapture.domain.model.DocumentUploadRequest documentUploadRequest = (com.paypal.oslo.feature.verificationcapture.domain.model.DocumentUploadRequest) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.owner, documentUploadRequest.owner) && kotlin.jvm.internal.Intrinsics.areEqual(this.document, documentUploadRequest.document);
    }

    public final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentUploadRequest copy(com.paypal.oslo.feature.verificationcapture.domain.model.Entity owner, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentRequest document) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(owner, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(document, "");
        return new com.paypal.oslo.feature.verificationcapture.domain.model.DocumentUploadRequest(owner, document);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentRequest getDocument() {
        return this.document;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.verificationcapture.domain.model.Entity getOwner() {
        return this.owner;
    }

    public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.domain.model.DocumentUploadRequest copy$default(com.paypal.oslo.feature.verificationcapture.domain.model.DocumentUploadRequest documentUploadRequest, com.paypal.oslo.feature.verificationcapture.domain.model.Entity entity, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentRequest documentRequest, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            entity = documentUploadRequest.owner;
        }
        if ((i & 2) != 0) {
            documentRequest = documentUploadRequest.document;
        }
        return documentUploadRequest.copy(entity, documentRequest);
    }
}
