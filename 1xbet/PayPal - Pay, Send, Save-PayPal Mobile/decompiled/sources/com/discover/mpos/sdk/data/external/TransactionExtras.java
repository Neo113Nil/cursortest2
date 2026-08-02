package com.discover.mpos.sdk.data.external;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b$\u0010\u0010"}, d2 = {"Lcom/discover/mpos/sdk/data/external/TransactionExtras;", "", "Lcom/discover/mpos/sdk/data/external/ApplicationCandidateData;", "candidateData", "Lcom/discover/mpos/sdk/data/external/PreProcessingIndicatorData;", "preProcessingIndicatorData", "", "selectApplicationResponse", "unpredictableNumber", "<init>", "(Lcom/discover/mpos/sdk/data/external/ApplicationCandidateData;Lcom/discover/mpos/sdk/data/external/PreProcessingIndicatorData;[B[B)V", "component1", "()Lcom/discover/mpos/sdk/data/external/ApplicationCandidateData;", "component2", "()Lcom/discover/mpos/sdk/data/external/PreProcessingIndicatorData;", "component3", "()[B", "component4", "copy", "(Lcom/discover/mpos/sdk/data/external/ApplicationCandidateData;Lcom/discover/mpos/sdk/data/external/PreProcessingIndicatorData;[B[B)Lcom/discover/mpos/sdk/data/external/TransactionExtras;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/discover/mpos/sdk/data/external/ApplicationCandidateData;", "getCandidateData", "Lcom/discover/mpos/sdk/data/external/PreProcessingIndicatorData;", "getPreProcessingIndicatorData", "[B", "getSelectApplicationResponse", "getUnpredictableNumber"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final /* data */ class TransactionExtras {
    private final com.discover.mpos.sdk.data.external.ApplicationCandidateData candidateData;
    private final com.discover.mpos.sdk.data.external.PreProcessingIndicatorData preProcessingIndicatorData;
    private final byte[] selectApplicationResponse;
    private final byte[] unpredictableNumber;

    public TransactionExtras(com.discover.mpos.sdk.data.external.ApplicationCandidateData applicationCandidateData, com.discover.mpos.sdk.data.external.PreProcessingIndicatorData preProcessingIndicatorData, byte[] bArr, byte[] bArr2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationCandidateData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preProcessingIndicatorData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr2, "");
        this.candidateData = applicationCandidateData;
        this.preProcessingIndicatorData = preProcessingIndicatorData;
        this.selectApplicationResponse = bArr;
        this.unpredictableNumber = bArr2;
    }

    public final com.discover.mpos.sdk.data.external.ApplicationCandidateData getCandidateData() {
        return this.candidateData;
    }

    public final com.discover.mpos.sdk.data.external.PreProcessingIndicatorData getPreProcessingIndicatorData() {
        return this.preProcessingIndicatorData;
    }

    public final byte[] getSelectApplicationResponse() {
        return this.selectApplicationResponse;
    }

    public final byte[] getUnpredictableNumber() {
        return this.unpredictableNumber;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TransactionExtras(candidateData=");
        sb.append(this.candidateData);
        sb.append(", preProcessingIndicatorData=");
        sb.append(this.preProcessingIndicatorData);
        sb.append(", selectApplicationResponse=");
        sb.append(java.util.Arrays.toString(this.selectApplicationResponse));
        sb.append(", unpredictableNumber=");
        sb.append(java.util.Arrays.toString(this.unpredictableNumber));
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.discover.mpos.sdk.data.external.ApplicationCandidateData applicationCandidateData = this.candidateData;
        int hashCode = applicationCandidateData != null ? applicationCandidateData.hashCode() : 0;
        com.discover.mpos.sdk.data.external.PreProcessingIndicatorData preProcessingIndicatorData = this.preProcessingIndicatorData;
        int hashCode2 = preProcessingIndicatorData != null ? preProcessingIndicatorData.hashCode() : 0;
        byte[] bArr = this.selectApplicationResponse;
        int hashCode3 = bArr != null ? java.util.Arrays.hashCode(bArr) : 0;
        byte[] bArr2 = this.unpredictableNumber;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (bArr2 != null ? java.util.Arrays.hashCode(bArr2) : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.discover.mpos.sdk.data.external.TransactionExtras)) {
            return false;
        }
        com.discover.mpos.sdk.data.external.TransactionExtras transactionExtras = (com.discover.mpos.sdk.data.external.TransactionExtras) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.candidateData, transactionExtras.candidateData) && kotlin.jvm.internal.Intrinsics.areEqual(this.preProcessingIndicatorData, transactionExtras.preProcessingIndicatorData) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectApplicationResponse, transactionExtras.selectApplicationResponse) && kotlin.jvm.internal.Intrinsics.areEqual(this.unpredictableNumber, transactionExtras.unpredictableNumber);
    }

    public final com.discover.mpos.sdk.data.external.TransactionExtras copy(com.discover.mpos.sdk.data.external.ApplicationCandidateData candidateData, com.discover.mpos.sdk.data.external.PreProcessingIndicatorData preProcessingIndicatorData, byte[] selectApplicationResponse, byte[] unpredictableNumber) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(candidateData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preProcessingIndicatorData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectApplicationResponse, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unpredictableNumber, "");
        return new com.discover.mpos.sdk.data.external.TransactionExtras(candidateData, preProcessingIndicatorData, selectApplicationResponse, unpredictableNumber);
    }

    /* renamed from: component4, reason: from getter */
    public final byte[] getUnpredictableNumber() {
        return this.unpredictableNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final byte[] getSelectApplicationResponse() {
        return this.selectApplicationResponse;
    }

    /* renamed from: component2, reason: from getter */
    public final com.discover.mpos.sdk.data.external.PreProcessingIndicatorData getPreProcessingIndicatorData() {
        return this.preProcessingIndicatorData;
    }

    /* renamed from: component1, reason: from getter */
    public final com.discover.mpos.sdk.data.external.ApplicationCandidateData getCandidateData() {
        return this.candidateData;
    }

    public static /* synthetic */ com.discover.mpos.sdk.data.external.TransactionExtras copy$default(com.discover.mpos.sdk.data.external.TransactionExtras transactionExtras, com.discover.mpos.sdk.data.external.ApplicationCandidateData applicationCandidateData, com.discover.mpos.sdk.data.external.PreProcessingIndicatorData preProcessingIndicatorData, byte[] bArr, byte[] bArr2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            applicationCandidateData = transactionExtras.candidateData;
        }
        if ((i & 2) != 0) {
            preProcessingIndicatorData = transactionExtras.preProcessingIndicatorData;
        }
        if ((i & 4) != 0) {
            bArr = transactionExtras.selectApplicationResponse;
        }
        if ((i & 8) != 0) {
            bArr2 = transactionExtras.unpredictableNumber;
        }
        return transactionExtras.copy(applicationCandidateData, preProcessingIndicatorData, bArr, bArr2);
    }
}
