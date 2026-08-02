package com.ingo.sdk.kotlin.common.features.void_image;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/void_image/UploadVoidImageUseCaseParameters;", "", "", "transactionReferenceNumber", "voidImageAsBase64", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/ingo/sdk/kotlin/common/features/void_image/UploadVoidImageUseCaseParameters;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTransactionReferenceNumber", "getVoidImageAsBase64"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class UploadVoidImageUseCaseParameters {
    private final java.lang.String transactionReferenceNumber;
    private final java.lang.String voidImageAsBase64;

    public UploadVoidImageUseCaseParameters(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.transactionReferenceNumber = str;
        this.voidImageAsBase64 = str2;
    }

    public final java.lang.String getTransactionReferenceNumber() {
        return this.transactionReferenceNumber;
    }

    public final java.lang.String getVoidImageAsBase64() {
        return this.voidImageAsBase64;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.transactionReferenceNumber;
        java.lang.String str2 = this.voidImageAsBase64;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UploadVoidImageUseCaseParameters(transactionReferenceNumber=");
        sb.append(str);
        sb.append(", voidImageAsBase64=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.transactionReferenceNumber.hashCode() * 31) + this.voidImageAsBase64.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.ingo.sdk.kotlin.common.features.void_image.UploadVoidImageUseCaseParameters)) {
            return false;
        }
        com.ingo.sdk.kotlin.common.features.void_image.UploadVoidImageUseCaseParameters uploadVoidImageUseCaseParameters = (com.ingo.sdk.kotlin.common.features.void_image.UploadVoidImageUseCaseParameters) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.transactionReferenceNumber, uploadVoidImageUseCaseParameters.transactionReferenceNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.voidImageAsBase64, uploadVoidImageUseCaseParameters.voidImageAsBase64);
    }

    public final com.ingo.sdk.kotlin.common.features.void_image.UploadVoidImageUseCaseParameters copy(java.lang.String transactionReferenceNumber, java.lang.String voidImageAsBase64) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionReferenceNumber, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(voidImageAsBase64, "");
        return new com.ingo.sdk.kotlin.common.features.void_image.UploadVoidImageUseCaseParameters(transactionReferenceNumber, voidImageAsBase64);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getVoidImageAsBase64() {
        return this.voidImageAsBase64;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTransactionReferenceNumber() {
        return this.transactionReferenceNumber;
    }

    public static /* synthetic */ com.ingo.sdk.kotlin.common.features.void_image.UploadVoidImageUseCaseParameters copy$default(com.ingo.sdk.kotlin.common.features.void_image.UploadVoidImageUseCaseParameters uploadVoidImageUseCaseParameters, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = uploadVoidImageUseCaseParameters.transactionReferenceNumber;
        }
        if ((i & 2) != 0) {
            str2 = uploadVoidImageUseCaseParameters.voidImageAsBase64;
        }
        return uploadVoidImageUseCaseParameters.copy(str, str2);
    }
}
