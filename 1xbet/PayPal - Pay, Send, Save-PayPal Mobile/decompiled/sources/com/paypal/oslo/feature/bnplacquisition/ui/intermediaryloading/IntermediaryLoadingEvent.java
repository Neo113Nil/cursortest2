package com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\b\n\u000b\f\r\u000e\u000f\u0010\u0011B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\b\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/IntermediaryLoadingEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "CheckScreenLockRequired", "CheckLoanStatus", "LoanStatusReceived", "LoanStatusCheckFailed", "ClosePressed", "ErrorBackPressed", "ScreenLockCompleted", "ScreenLockCancelled", "Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/IntermediaryLoadingEvent$CheckLoanStatus;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/IntermediaryLoadingEvent$CheckScreenLockRequired;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/IntermediaryLoadingEvent$ClosePressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/IntermediaryLoadingEvent$ErrorBackPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/IntermediaryLoadingEvent$LoanStatusCheckFailed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/IntermediaryLoadingEvent$LoanStatusReceived;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/IntermediaryLoadingEvent$ScreenLockCancelled;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/IntermediaryLoadingEvent$ScreenLockCompleted;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class IntermediaryLoadingEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private IntermediaryLoadingEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/IntermediaryLoadingEvent$CheckScreenLockRequired;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/IntermediaryLoadingEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CheckScreenLockRequired extends com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent.CheckScreenLockRequired INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent.CheckScreenLockRequired();

        public final int hashCode() {
            return -1573822402;
        }

        private CheckScreenLockRequired() {
            super("CheckScreenLockRequired", null);
        }

        public final java.lang.String toString() {
            return "CheckScreenLockRequired";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent.CheckScreenLockRequired)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/IntermediaryLoadingEvent$CheckLoanStatus;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/IntermediaryLoadingEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CheckLoanStatus extends com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent.CheckLoanStatus INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent.CheckLoanStatus();

        public final int hashCode() {
            return -956307254;
        }

        private CheckLoanStatus() {
            super("CheckLoanStatus", null);
        }

        public final java.lang.String toString() {
            return "CheckLoanStatus";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent.CheckLoanStatus)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/IntermediaryLoadingEvent$LoanStatusReceived;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/IntermediaryLoadingEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/readytouseloan/ReadyToUseLoanResult;", "result", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/readytouseloan/ReadyToUseLoanResult;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/readytouseloan/ReadyToUseLoanResult;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/readytouseloan/ReadyToUseLoanResult;)Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/IntermediaryLoadingEvent$LoanStatusReceived;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/readytouseloan/ReadyToUseLoanResult;", "getResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoanStatusReceived extends com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.bnplacquisition.domain.model.readytouseloan.ReadyToUseLoanResult result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoanStatusReceived(com.paypal.oslo.feature.bnplacquisition.domain.model.readytouseloan.ReadyToUseLoanResult readyToUseLoanResult) {
            super("LoanStatusReceived", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readyToUseLoanResult, "");
            this.result = readyToUseLoanResult;
        }

        public final com.paypal.oslo.feature.bnplacquisition.domain.model.readytouseloan.ReadyToUseLoanResult getResult() {
            return this.result;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.domain.model.readytouseloan.ReadyToUseLoanResult readyToUseLoanResult = this.result;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LoanStatusReceived(result=");
            sb.append(readyToUseLoanResult);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.result.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent.LoanStatusReceived) && kotlin.jvm.internal.Intrinsics.areEqual(this.result, ((com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent.LoanStatusReceived) other).result);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent.LoanStatusReceived copy(com.paypal.oslo.feature.bnplacquisition.domain.model.readytouseloan.ReadyToUseLoanResult result) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent.LoanStatusReceived(result);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.domain.model.readytouseloan.ReadyToUseLoanResult getResult() {
            return this.result;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent.LoanStatusReceived copy$default(com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent.LoanStatusReceived loanStatusReceived, com.paypal.oslo.feature.bnplacquisition.domain.model.readytouseloan.ReadyToUseLoanResult readyToUseLoanResult, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                readyToUseLoanResult = loanStatusReceived.result;
            }
            return loanStatusReceived.copy(readyToUseLoanResult);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/IntermediaryLoadingEvent$LoanStatusCheckFailed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/IntermediaryLoadingEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "errorContent", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;)Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/IntermediaryLoadingEvent$LoanStatusCheckFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "getErrorContent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoanStatusCheckFailed extends com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel errorContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoanStatusCheckFailed(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel) {
            super("LoanStatusCheckFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullscreenErrorUiModel, "");
            this.errorContent = fullscreenErrorUiModel;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel getErrorContent() {
            return this.errorContent;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel = this.errorContent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LoanStatusCheckFailed(errorContent=");
            sb.append(fullscreenErrorUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.errorContent.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent.LoanStatusCheckFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorContent, ((com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent.LoanStatusCheckFailed) other).errorContent);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent.LoanStatusCheckFailed copy(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel errorContent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorContent, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent.LoanStatusCheckFailed(errorContent);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel getErrorContent() {
            return this.errorContent;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent.LoanStatusCheckFailed copy$default(com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent.LoanStatusCheckFailed loanStatusCheckFailed, com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                fullscreenErrorUiModel = loanStatusCheckFailed.errorContent;
            }
            return loanStatusCheckFailed.copy(fullscreenErrorUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/IntermediaryLoadingEvent$ClosePressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/IntermediaryLoadingEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ClosePressed extends com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent.ClosePressed INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent.ClosePressed();

        public final int hashCode() {
            return 341687914;
        }

        private ClosePressed() {
            super("ClosePressed", null);
        }

        public final java.lang.String toString() {
            return "ClosePressed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent.ClosePressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/IntermediaryLoadingEvent$ErrorBackPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/IntermediaryLoadingEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ErrorBackPressed extends com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent.ErrorBackPressed INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent.ErrorBackPressed();

        public final int hashCode() {
            return 1560530291;
        }

        private ErrorBackPressed() {
            super("ErrorBackPressed", null);
        }

        public final java.lang.String toString() {
            return "ErrorBackPressed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent.ErrorBackPressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/IntermediaryLoadingEvent$ScreenLockCompleted;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/IntermediaryLoadingEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ScreenLockCompleted extends com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent.ScreenLockCompleted INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent.ScreenLockCompleted();

        public final int hashCode() {
            return -422058764;
        }

        private ScreenLockCompleted() {
            super("ScreenLockCompleted", null);
        }

        public final java.lang.String toString() {
            return "ScreenLockCompleted";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent.ScreenLockCompleted)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/IntermediaryLoadingEvent$ScreenLockCancelled;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/intermediaryloading/IntermediaryLoadingEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ScreenLockCancelled extends com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent.ScreenLockCancelled INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent.ScreenLockCancelled();

        public final int hashCode() {
            return 1457461242;
        }

        private ScreenLockCancelled() {
            super("ScreenLockCancelled", null);
        }

        public final java.lang.String toString() {
            return "ScreenLockCancelled";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingEvent.ScreenLockCancelled)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ IntermediaryLoadingEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
