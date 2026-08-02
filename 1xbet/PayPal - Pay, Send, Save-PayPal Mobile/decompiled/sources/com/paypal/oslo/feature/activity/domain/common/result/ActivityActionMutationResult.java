package com.paypal.oslo.feature.activity.domain.common.result;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/common/result/ActivityActionMutationResult;", "Lcom/paypal/oslo/feature/activity/domain/base/result/IActivityRemoteBaseResult;", "CancelPaymentRequestResult", "BlockContactResult", "InvoiceReportSpamMutationResult", "Empty", "Lcom/paypal/oslo/feature/activity/domain/common/result/ActivityActionMutationResult$BlockContactResult;", "Lcom/paypal/oslo/feature/activity/domain/common/result/ActivityActionMutationResult$CancelPaymentRequestResult;", "Lcom/paypal/oslo/feature/activity/domain/common/result/ActivityActionMutationResult$Empty;", "Lcom/paypal/oslo/feature/activity/domain/common/result/ActivityActionMutationResult$InvoiceReportSpamMutationResult;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface ActivityActionMutationResult extends com.paypal.oslo.feature.activity.domain.base.result.IActivityRemoteBaseResult {

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/common/result/ActivityActionMutationResult$CancelPaymentRequestResult;", "Lcom/paypal/oslo/feature/activity/domain/common/result/ActivityActionMutationResult;", "", "id", "status", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/activity/domain/common/result/ActivityActionMutationResult$CancelPaymentRequestResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getStatus"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CancelPaymentRequestResult implements com.paypal.oslo.feature.activity.domain.common.result.ActivityActionMutationResult {
        public static final int $stable = 0;
        private final java.lang.String id;
        private final java.lang.String status;

        public CancelPaymentRequestResult(java.lang.String str, java.lang.String str2) {
            this.id = str;
            this.status = str2;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getStatus() {
            return this.status;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.id;
            java.lang.String str2 = this.status;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CancelPaymentRequestResult(id=");
            sb.append(str);
            sb.append(", status=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.id;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.status;
            return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.domain.common.result.ActivityActionMutationResult.CancelPaymentRequestResult)) {
                return false;
            }
            com.paypal.oslo.feature.activity.domain.common.result.ActivityActionMutationResult.CancelPaymentRequestResult cancelPaymentRequestResult = (com.paypal.oslo.feature.activity.domain.common.result.ActivityActionMutationResult.CancelPaymentRequestResult) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, cancelPaymentRequestResult.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.status, cancelPaymentRequestResult.status);
        }

        public final com.paypal.oslo.feature.activity.domain.common.result.ActivityActionMutationResult.CancelPaymentRequestResult copy(java.lang.String id, java.lang.String status) {
            return new com.paypal.oslo.feature.activity.domain.common.result.ActivityActionMutationResult.CancelPaymentRequestResult(id, status);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getStatus() {
            return this.status;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.common.result.ActivityActionMutationResult.CancelPaymentRequestResult copy$default(com.paypal.oslo.feature.activity.domain.common.result.ActivityActionMutationResult.CancelPaymentRequestResult cancelPaymentRequestResult, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = cancelPaymentRequestResult.id;
            }
            if ((i & 2) != 0) {
                str2 = cancelPaymentRequestResult.status;
            }
            return cancelPaymentRequestResult.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0003\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/common/result/ActivityActionMutationResult$BlockContactResult;", "Lcom/paypal/oslo/feature/activity/domain/common/result/ActivityActionMutationResult;", "", "isSuccessful", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/activity/domain/common/result/ActivityActionMutationResult$BlockContactResult;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BlockContactResult implements com.paypal.oslo.feature.activity.domain.common.result.ActivityActionMutationResult {
        public static final int $stable = 0;
        private final boolean isSuccessful;

        public BlockContactResult(boolean z) {
            this.isSuccessful = z;
        }

        public final boolean isSuccessful() {
            return this.isSuccessful;
        }

        public final java.lang.String toString() {
            boolean z = this.isSuccessful;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BlockContactResult(isSuccessful=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.isSuccessful);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.domain.common.result.ActivityActionMutationResult.BlockContactResult) && this.isSuccessful == ((com.paypal.oslo.feature.activity.domain.common.result.ActivityActionMutationResult.BlockContactResult) other).isSuccessful;
        }

        public final com.paypal.oslo.feature.activity.domain.common.result.ActivityActionMutationResult.BlockContactResult copy(boolean isSuccessful) {
            return new com.paypal.oslo.feature.activity.domain.common.result.ActivityActionMutationResult.BlockContactResult(isSuccessful);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsSuccessful() {
            return this.isSuccessful;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.common.result.ActivityActionMutationResult.BlockContactResult copy$default(com.paypal.oslo.feature.activity.domain.common.result.ActivityActionMutationResult.BlockContactResult blockContactResult, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = blockContactResult.isSuccessful;
            }
            return blockContactResult.copy(z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/common/result/ActivityActionMutationResult$InvoiceReportSpamMutationResult;", "Lcom/paypal/oslo/feature/activity/domain/common/result/ActivityActionMutationResult;", "", "status", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/activity/domain/common/result/ActivityActionMutationResult$InvoiceReportSpamMutationResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getStatus"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InvoiceReportSpamMutationResult implements com.paypal.oslo.feature.activity.domain.common.result.ActivityActionMutationResult {
        public static final int $stable = 0;
        private final java.lang.String status;

        public InvoiceReportSpamMutationResult(java.lang.String str) {
            this.status = str;
        }

        public final java.lang.String getStatus() {
            return this.status;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.status;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InvoiceReportSpamMutationResult(status=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.status;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.domain.common.result.ActivityActionMutationResult.InvoiceReportSpamMutationResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.status, ((com.paypal.oslo.feature.activity.domain.common.result.ActivityActionMutationResult.InvoiceReportSpamMutationResult) other).status);
        }

        public final com.paypal.oslo.feature.activity.domain.common.result.ActivityActionMutationResult.InvoiceReportSpamMutationResult copy(java.lang.String status) {
            return new com.paypal.oslo.feature.activity.domain.common.result.ActivityActionMutationResult.InvoiceReportSpamMutationResult(status);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getStatus() {
            return this.status;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.common.result.ActivityActionMutationResult.InvoiceReportSpamMutationResult copy$default(com.paypal.oslo.feature.activity.domain.common.result.ActivityActionMutationResult.InvoiceReportSpamMutationResult invoiceReportSpamMutationResult, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = invoiceReportSpamMutationResult.status;
            }
            return invoiceReportSpamMutationResult.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/common/result/ActivityActionMutationResult$Empty;", "Lcom/paypal/oslo/feature/activity/domain/common/result/ActivityActionMutationResult;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Empty implements com.paypal.oslo.feature.activity.domain.common.result.ActivityActionMutationResult {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.activity.domain.common.result.ActivityActionMutationResult.Empty INSTANCE = new com.paypal.oslo.feature.activity.domain.common.result.ActivityActionMutationResult.Empty();

        public final int hashCode() {
            return 51421876;
        }

        private Empty() {
        }

        public final java.lang.String toString() {
            return "Empty";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.domain.common.result.ActivityActionMutationResult.Empty)) {
                return false;
            }
            return true;
        }
    }
}
