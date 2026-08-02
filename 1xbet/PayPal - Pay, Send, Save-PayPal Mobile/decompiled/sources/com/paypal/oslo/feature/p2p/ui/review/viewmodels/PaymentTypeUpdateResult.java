package com.paypal.oslo.feature.p2p.ui.review.viewmodels;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0004\n\u000b\f\rÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/PaymentTypeUpdateResult;", "", "Lcom/paypal/oslo/feature/p2p/domain/model/UpdateTransferTypeResult;", "getTransferResult", "()Lcom/paypal/oslo/feature/p2p/domain/model/UpdateTransferTypeResult;", "transferResult", "Success", "ScamContingencyDetected", "HighRiskScamDeclined", "Failed", "Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/PaymentTypeUpdateResult$Failed;", "Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/PaymentTypeUpdateResult$HighRiskScamDeclined;", "Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/PaymentTypeUpdateResult$ScamContingencyDetected;", "Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/PaymentTypeUpdateResult$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface PaymentTypeUpdateResult {
    com.paypal.oslo.feature.p2p.domain.model.UpdateTransferTypeResult getTransferResult();

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/PaymentTypeUpdateResult$Success;", "Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/PaymentTypeUpdateResult;", "Lcom/paypal/oslo/feature/p2p/domain/model/UpdateTransferTypeResult;", "transferResult", "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/model/UpdateTransferTypeResult;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/domain/model/UpdateTransferTypeResult;", "copy", "(Lcom/paypal/oslo/feature/p2p/domain/model/UpdateTransferTypeResult;)Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/PaymentTypeUpdateResult$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/domain/model/UpdateTransferTypeResult;", "getTransferResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success implements com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeUpdateResult {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.p2p.domain.model.UpdateTransferTypeResult transferResult;

        public Success(com.paypal.oslo.feature.p2p.domain.model.UpdateTransferTypeResult updateTransferTypeResult) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateTransferTypeResult, "");
            this.transferResult = updateTransferTypeResult;
        }

        @Override // com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeUpdateResult
        public final com.paypal.oslo.feature.p2p.domain.model.UpdateTransferTypeResult getTransferResult() {
            return this.transferResult;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.domain.model.UpdateTransferTypeResult updateTransferTypeResult = this.transferResult;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(transferResult=");
            sb.append(updateTransferTypeResult);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.transferResult.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeUpdateResult.Success) && kotlin.jvm.internal.Intrinsics.areEqual(this.transferResult, ((com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeUpdateResult.Success) other).transferResult);
        }

        public final com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeUpdateResult.Success copy(com.paypal.oslo.feature.p2p.domain.model.UpdateTransferTypeResult transferResult) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferResult, "");
            return new com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeUpdateResult.Success(transferResult);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.domain.model.UpdateTransferTypeResult getTransferResult() {
            return this.transferResult;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeUpdateResult.Success copy$default(com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeUpdateResult.Success success, com.paypal.oslo.feature.p2p.domain.model.UpdateTransferTypeResult updateTransferTypeResult, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                updateTransferTypeResult = success.transferResult;
            }
            return success.copy(updateTransferTypeResult);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/PaymentTypeUpdateResult$ScamContingencyDetected;", "Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/PaymentTypeUpdateResult;", "Lcom/paypal/oslo/feature/p2p/ui/scamalert/composables/ScamAlertType;", "scamAlertType", "Lcom/paypal/oslo/feature/p2p/domain/model/UpdateTransferTypeResult;", "transferResult", "<init>", "(Lcom/paypal/oslo/feature/p2p/ui/scamalert/composables/ScamAlertType;Lcom/paypal/oslo/feature/p2p/domain/model/UpdateTransferTypeResult;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/ui/scamalert/composables/ScamAlertType;", "component2", "()Lcom/paypal/oslo/feature/p2p/domain/model/UpdateTransferTypeResult;", "copy", "(Lcom/paypal/oslo/feature/p2p/ui/scamalert/composables/ScamAlertType;Lcom/paypal/oslo/feature/p2p/domain/model/UpdateTransferTypeResult;)Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/PaymentTypeUpdateResult$ScamContingencyDetected;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/ui/scamalert/composables/ScamAlertType;", "getScamAlertType", "Lcom/paypal/oslo/feature/p2p/domain/model/UpdateTransferTypeResult;", "getTransferResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ScamContingencyDetected implements com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeUpdateResult {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType scamAlertType;
        private final com.paypal.oslo.feature.p2p.domain.model.UpdateTransferTypeResult transferResult;

        public ScamContingencyDetected(com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType scamAlertType, com.paypal.oslo.feature.p2p.domain.model.UpdateTransferTypeResult updateTransferTypeResult) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scamAlertType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateTransferTypeResult, "");
            this.scamAlertType = scamAlertType;
            this.transferResult = updateTransferTypeResult;
        }

        public final com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType getScamAlertType() {
            return this.scamAlertType;
        }

        @Override // com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeUpdateResult
        public final com.paypal.oslo.feature.p2p.domain.model.UpdateTransferTypeResult getTransferResult() {
            return this.transferResult;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType scamAlertType = this.scamAlertType;
            com.paypal.oslo.feature.p2p.domain.model.UpdateTransferTypeResult updateTransferTypeResult = this.transferResult;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ScamContingencyDetected(scamAlertType=");
            sb.append(scamAlertType);
            sb.append(", transferResult=");
            sb.append(updateTransferTypeResult);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.scamAlertType.hashCode() * 31) + this.transferResult.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeUpdateResult.ScamContingencyDetected)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeUpdateResult.ScamContingencyDetected scamContingencyDetected = (com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeUpdateResult.ScamContingencyDetected) other;
            return this.scamAlertType == scamContingencyDetected.scamAlertType && kotlin.jvm.internal.Intrinsics.areEqual(this.transferResult, scamContingencyDetected.transferResult);
        }

        public final com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeUpdateResult.ScamContingencyDetected copy(com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType scamAlertType, com.paypal.oslo.feature.p2p.domain.model.UpdateTransferTypeResult transferResult) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scamAlertType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferResult, "");
            return new com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeUpdateResult.ScamContingencyDetected(scamAlertType, transferResult);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.p2p.domain.model.UpdateTransferTypeResult getTransferResult() {
            return this.transferResult;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType getScamAlertType() {
            return this.scamAlertType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeUpdateResult.ScamContingencyDetected copy$default(com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeUpdateResult.ScamContingencyDetected scamContingencyDetected, com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType scamAlertType, com.paypal.oslo.feature.p2p.domain.model.UpdateTransferTypeResult updateTransferTypeResult, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                scamAlertType = scamContingencyDetected.scamAlertType;
            }
            if ((i & 2) != 0) {
                updateTransferTypeResult = scamContingencyDetected.transferResult;
            }
            return scamContingencyDetected.copy(scamAlertType, updateTransferTypeResult);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/PaymentTypeUpdateResult$HighRiskScamDeclined;", "Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/PaymentTypeUpdateResult;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/domain/model/UpdateTransferTypeResult;", "transferResult", "Lcom/paypal/oslo/feature/p2p/domain/model/UpdateTransferTypeResult;", "getTransferResult", "()Lcom/paypal/oslo/feature/p2p/domain/model/UpdateTransferTypeResult;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class HighRiskScamDeclined implements com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeUpdateResult {
        private static final com.paypal.oslo.feature.p2p.domain.model.UpdateTransferTypeResult transferResult = null;
        public static final com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeUpdateResult.HighRiskScamDeclined INSTANCE = new com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeUpdateResult.HighRiskScamDeclined();
        public static final int $stable = 8;

        public final int hashCode() {
            return 1600417557;
        }

        private HighRiskScamDeclined() {
        }

        @Override // com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeUpdateResult
        public final com.paypal.oslo.feature.p2p.domain.model.UpdateTransferTypeResult getTransferResult() {
            return transferResult;
        }

        public final java.lang.String toString() {
            return "HighRiskScamDeclined";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeUpdateResult.HighRiskScamDeclined)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/PaymentTypeUpdateResult$Failed;", "Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/PaymentTypeUpdateResult;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/domain/model/UpdateTransferTypeResult;", "transferResult", "Lcom/paypal/oslo/feature/p2p/domain/model/UpdateTransferTypeResult;", "getTransferResult", "()Lcom/paypal/oslo/feature/p2p/domain/model/UpdateTransferTypeResult;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Failed implements com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeUpdateResult {
        private static final com.paypal.oslo.feature.p2p.domain.model.UpdateTransferTypeResult transferResult = null;
        public static final com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeUpdateResult.Failed INSTANCE = new com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeUpdateResult.Failed();
        public static final int $stable = 8;

        public final int hashCode() {
            return 2060767191;
        }

        private Failed() {
        }

        @Override // com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeUpdateResult
        public final com.paypal.oslo.feature.p2p.domain.model.UpdateTransferTypeResult getTransferResult() {
            return transferResult;
        }

        public final java.lang.String toString() {
            return "Failed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeUpdateResult.Failed)) {
                return false;
            }
            return true;
        }
    }
}
