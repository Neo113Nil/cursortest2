package com.ingo.sdk.kotlin.common.features.identity_documents;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/identity_documents/UploadIdentityDocumentsUseCaseParameters;", "", "", "frontIdentityDocumentImage", "backIdentityDocumentImage", "customerSelfieImage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ingo/sdk/kotlin/common/features/identity_documents/UploadIdentityDocumentsUseCaseParameters;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFrontIdentityDocumentImage", "getBackIdentityDocumentImage", "getCustomerSelfieImage"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class UploadIdentityDocumentsUseCaseParameters {
    private final java.lang.String backIdentityDocumentImage;
    private final java.lang.String customerSelfieImage;
    private final java.lang.String frontIdentityDocumentImage;

    public UploadIdentityDocumentsUseCaseParameters(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.frontIdentityDocumentImage = str;
        this.backIdentityDocumentImage = str2;
        this.customerSelfieImage = str3;
    }

    public final java.lang.String getFrontIdentityDocumentImage() {
        return this.frontIdentityDocumentImage;
    }

    public final java.lang.String getBackIdentityDocumentImage() {
        return this.backIdentityDocumentImage;
    }

    public final java.lang.String getCustomerSelfieImage() {
        return this.customerSelfieImage;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.frontIdentityDocumentImage;
        java.lang.String str2 = this.backIdentityDocumentImage;
        java.lang.String str3 = this.customerSelfieImage;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UploadIdentityDocumentsUseCaseParameters(frontIdentityDocumentImage=");
        sb.append(str);
        sb.append(", backIdentityDocumentImage=");
        sb.append(str2);
        sb.append(", customerSelfieImage=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.frontIdentityDocumentImage.hashCode() * 31) + this.backIdentityDocumentImage.hashCode()) * 31) + this.customerSelfieImage.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.ingo.sdk.kotlin.common.features.identity_documents.UploadIdentityDocumentsUseCaseParameters)) {
            return false;
        }
        com.ingo.sdk.kotlin.common.features.identity_documents.UploadIdentityDocumentsUseCaseParameters uploadIdentityDocumentsUseCaseParameters = (com.ingo.sdk.kotlin.common.features.identity_documents.UploadIdentityDocumentsUseCaseParameters) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.frontIdentityDocumentImage, uploadIdentityDocumentsUseCaseParameters.frontIdentityDocumentImage) && kotlin.jvm.internal.Intrinsics.areEqual(this.backIdentityDocumentImage, uploadIdentityDocumentsUseCaseParameters.backIdentityDocumentImage) && kotlin.jvm.internal.Intrinsics.areEqual(this.customerSelfieImage, uploadIdentityDocumentsUseCaseParameters.customerSelfieImage);
    }

    public final com.ingo.sdk.kotlin.common.features.identity_documents.UploadIdentityDocumentsUseCaseParameters copy(java.lang.String frontIdentityDocumentImage, java.lang.String backIdentityDocumentImage, java.lang.String customerSelfieImage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frontIdentityDocumentImage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backIdentityDocumentImage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customerSelfieImage, "");
        return new com.ingo.sdk.kotlin.common.features.identity_documents.UploadIdentityDocumentsUseCaseParameters(frontIdentityDocumentImage, backIdentityDocumentImage, customerSelfieImage);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCustomerSelfieImage() {
        return this.customerSelfieImage;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getBackIdentityDocumentImage() {
        return this.backIdentityDocumentImage;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getFrontIdentityDocumentImage() {
        return this.frontIdentityDocumentImage;
    }

    public static /* synthetic */ com.ingo.sdk.kotlin.common.features.identity_documents.UploadIdentityDocumentsUseCaseParameters copy$default(com.ingo.sdk.kotlin.common.features.identity_documents.UploadIdentityDocumentsUseCaseParameters uploadIdentityDocumentsUseCaseParameters, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = uploadIdentityDocumentsUseCaseParameters.frontIdentityDocumentImage;
        }
        if ((i & 2) != 0) {
            str2 = uploadIdentityDocumentsUseCaseParameters.backIdentityDocumentImage;
        }
        if ((i & 4) != 0) {
            str3 = uploadIdentityDocumentsUseCaseParameters.customerSelfieImage;
        }
        return uploadIdentityDocumentsUseCaseParameters.copy(str, str2, str3);
    }
}
