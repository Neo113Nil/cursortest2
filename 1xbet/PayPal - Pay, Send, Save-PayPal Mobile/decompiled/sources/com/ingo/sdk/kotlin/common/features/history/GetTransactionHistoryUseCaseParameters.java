package com.ingo.sdk.kotlin.common.features.history;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001a\u0010\f"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/history/GetTransactionHistoryUseCaseParameters;", "", "", "transactionReferenceNumber", "", "pageSize", "pageNumber", "<init>", "(Ljava/lang/String;II)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "copy", "(Ljava/lang/String;II)Lcom/ingo/sdk/kotlin/common/features/history/GetTransactionHistoryUseCaseParameters;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getTransactionReferenceNumber", com.visa.cbp.getEncExpo.warmup, "getPageSize", "getPageNumber"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class GetTransactionHistoryUseCaseParameters {
    private final int pageNumber;
    private final int pageSize;
    private final java.lang.String transactionReferenceNumber;

    public GetTransactionHistoryUseCaseParameters(java.lang.String str, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.transactionReferenceNumber = str;
        this.pageSize = i;
        this.pageNumber = i2;
    }

    public final java.lang.String getTransactionReferenceNumber() {
        return this.transactionReferenceNumber;
    }

    public final int getPageSize() {
        return this.pageSize;
    }

    public final int getPageNumber() {
        return this.pageNumber;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.transactionReferenceNumber;
        int i = this.pageSize;
        int i2 = this.pageNumber;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetTransactionHistoryUseCaseParameters(transactionReferenceNumber=");
        sb.append(str);
        sb.append(", pageSize=");
        sb.append(i);
        sb.append(", pageNumber=");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.transactionReferenceNumber.hashCode() * 31) + java.lang.Integer.hashCode(this.pageSize)) * 31) + java.lang.Integer.hashCode(this.pageNumber);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.ingo.sdk.kotlin.common.features.history.GetTransactionHistoryUseCaseParameters)) {
            return false;
        }
        com.ingo.sdk.kotlin.common.features.history.GetTransactionHistoryUseCaseParameters getTransactionHistoryUseCaseParameters = (com.ingo.sdk.kotlin.common.features.history.GetTransactionHistoryUseCaseParameters) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.transactionReferenceNumber, getTransactionHistoryUseCaseParameters.transactionReferenceNumber) && this.pageSize == getTransactionHistoryUseCaseParameters.pageSize && this.pageNumber == getTransactionHistoryUseCaseParameters.pageNumber;
    }

    public final com.ingo.sdk.kotlin.common.features.history.GetTransactionHistoryUseCaseParameters copy(java.lang.String transactionReferenceNumber, int pageSize, int pageNumber) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionReferenceNumber, "");
        return new com.ingo.sdk.kotlin.common.features.history.GetTransactionHistoryUseCaseParameters(transactionReferenceNumber, pageSize, pageNumber);
    }

    /* renamed from: component3, reason: from getter */
    public final int getPageNumber() {
        return this.pageNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final int getPageSize() {
        return this.pageSize;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTransactionReferenceNumber() {
        return this.transactionReferenceNumber;
    }

    public static /* synthetic */ com.ingo.sdk.kotlin.common.features.history.GetTransactionHistoryUseCaseParameters copy$default(com.ingo.sdk.kotlin.common.features.history.GetTransactionHistoryUseCaseParameters getTransactionHistoryUseCaseParameters, java.lang.String str, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            str = getTransactionHistoryUseCaseParameters.transactionReferenceNumber;
        }
        if ((i3 & 2) != 0) {
            i = getTransactionHistoryUseCaseParameters.pageSize;
        }
        if ((i3 & 4) != 0) {
            i2 = getTransactionHistoryUseCaseParameters.pageNumber;
        }
        return getTransactionHistoryUseCaseParameters.copy(str, i, i2);
    }
}
