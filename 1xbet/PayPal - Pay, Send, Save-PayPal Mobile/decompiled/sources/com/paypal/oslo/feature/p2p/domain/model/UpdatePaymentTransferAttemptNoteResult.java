package com.paypal.oslo.feature.p2p.domain.model;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J6\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/UpdatePaymentTransferAttemptNoteResult;", "", "", "paymentTransferAttemptId", "", "Lcom/paypal/oslo/feature/p2p/domain/model/TransferType;", "supportedTransferTypes", "Lcom/paypal/oslo/feature/p2p/domain/model/FundingOptions;", "fundingOptions", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/p2p/domain/model/FundingOptions;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lcom/paypal/oslo/feature/p2p/domain/model/FundingOptions;", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/p2p/domain/model/FundingOptions;)Lcom/paypal/oslo/feature/p2p/domain/model/UpdatePaymentTransferAttemptNoteResult;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPaymentTransferAttemptId", "Ljava/util/List;", "getSupportedTransferTypes", "Lcom/paypal/oslo/feature/p2p/domain/model/FundingOptions;", "getFundingOptions"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class UpdatePaymentTransferAttemptNoteResult {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.p2p.domain.model.FundingOptions fundingOptions;
    private final java.lang.String paymentTransferAttemptId;
    private final java.util.List<com.paypal.oslo.feature.p2p.domain.model.TransferType> supportedTransferTypes;

    public UpdatePaymentTransferAttemptNoteResult(java.lang.String str, java.util.List<com.paypal.oslo.feature.p2p.domain.model.TransferType> list, com.paypal.oslo.feature.p2p.domain.model.FundingOptions fundingOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.paymentTransferAttemptId = str;
        this.supportedTransferTypes = list;
        this.fundingOptions = fundingOptions;
    }

    public /* synthetic */ UpdatePaymentTransferAttemptNoteResult(java.lang.String str, java.util.List list, com.paypal.oslo.feature.p2p.domain.model.FundingOptions fundingOptions, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i & 4) != 0 ? null : fundingOptions);
    }

    public final java.lang.String getPaymentTransferAttemptId() {
        return this.paymentTransferAttemptId;
    }

    public final java.util.List<com.paypal.oslo.feature.p2p.domain.model.TransferType> getSupportedTransferTypes() {
        return this.supportedTransferTypes;
    }

    public final com.paypal.oslo.feature.p2p.domain.model.FundingOptions getFundingOptions() {
        return this.fundingOptions;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.paymentTransferAttemptId;
        java.util.List<com.paypal.oslo.feature.p2p.domain.model.TransferType> list = this.supportedTransferTypes;
        com.paypal.oslo.feature.p2p.domain.model.FundingOptions fundingOptions = this.fundingOptions;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdatePaymentTransferAttemptNoteResult(paymentTransferAttemptId=");
        sb.append(str);
        sb.append(", supportedTransferTypes=");
        sb.append(list);
        sb.append(", fundingOptions=");
        sb.append(fundingOptions);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.paymentTransferAttemptId.hashCode();
        int hashCode2 = this.supportedTransferTypes.hashCode();
        com.paypal.oslo.feature.p2p.domain.model.FundingOptions fundingOptions = this.fundingOptions;
        return (((hashCode * 31) + hashCode2) * 31) + (fundingOptions == null ? 0 : fundingOptions.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptNoteResult)) {
            return false;
        }
        com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptNoteResult updatePaymentTransferAttemptNoteResult = (com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptNoteResult) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.paymentTransferAttemptId, updatePaymentTransferAttemptNoteResult.paymentTransferAttemptId) && kotlin.jvm.internal.Intrinsics.areEqual(this.supportedTransferTypes, updatePaymentTransferAttemptNoteResult.supportedTransferTypes) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingOptions, updatePaymentTransferAttemptNoteResult.fundingOptions);
    }

    public final com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptNoteResult copy(java.lang.String paymentTransferAttemptId, java.util.List<com.paypal.oslo.feature.p2p.domain.model.TransferType> supportedTransferTypes, com.paypal.oslo.feature.p2p.domain.model.FundingOptions fundingOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentTransferAttemptId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportedTransferTypes, "");
        return new com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptNoteResult(paymentTransferAttemptId, supportedTransferTypes, fundingOptions);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.p2p.domain.model.FundingOptions getFundingOptions() {
        return this.fundingOptions;
    }

    public final java.util.List<com.paypal.oslo.feature.p2p.domain.model.TransferType> component2() {
        return this.supportedTransferTypes;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPaymentTransferAttemptId() {
        return this.paymentTransferAttemptId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptNoteResult copy$default(com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptNoteResult updatePaymentTransferAttemptNoteResult, java.lang.String str, java.util.List list, com.paypal.oslo.feature.p2p.domain.model.FundingOptions fundingOptions, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = updatePaymentTransferAttemptNoteResult.paymentTransferAttemptId;
        }
        if ((i & 2) != 0) {
            list = updatePaymentTransferAttemptNoteResult.supportedTransferTypes;
        }
        if ((i & 4) != 0) {
            fundingOptions = updatePaymentTransferAttemptNoteResult.fundingOptions;
        }
        return updatePaymentTransferAttemptNoteResult.copy(str, list, fundingOptions);
    }
}
