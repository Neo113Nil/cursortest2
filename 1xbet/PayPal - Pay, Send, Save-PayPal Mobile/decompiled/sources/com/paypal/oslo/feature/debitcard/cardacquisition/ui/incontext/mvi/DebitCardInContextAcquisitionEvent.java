package com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u000f\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u000f\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "CheckInContextProvisionEligibility", "OnEligibilityCheckSucceeded", "OnEligibilityCheckFailed", "OnEligibilityCheckError", "LegalLinkClicked", "AgreeAndContinueClicked", "OnValidationPassed", "OnFundingSourceMissing", "OnFundingSourceContingencyDetected", "OnFundingSourceSelectionChanged", "OnBannerClicked", "OnReadyToNavigateToConfirmBank", "OnBackButtonClicked", "OnCloseButtonClicked", "OnSkipButtonClicked", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionEvent$AgreeAndContinueClicked;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionEvent$CheckInContextProvisionEligibility;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionEvent$LegalLinkClicked;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionEvent$OnBackButtonClicked;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionEvent$OnBannerClicked;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionEvent$OnCloseButtonClicked;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionEvent$OnEligibilityCheckError;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionEvent$OnEligibilityCheckFailed;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionEvent$OnEligibilityCheckSucceeded;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionEvent$OnFundingSourceContingencyDetected;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionEvent$OnFundingSourceMissing;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionEvent$OnFundingSourceSelectionChanged;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionEvent$OnReadyToNavigateToConfirmBank;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionEvent$OnSkipButtonClicked;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionEvent$OnValidationPassed;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class DebitCardInContextAcquisitionEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionEvent$CheckInContextProvisionEligibility;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CheckInContextProvisionEligibility extends com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.CheckInContextProvisionEligibility INSTANCE = new com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.CheckInContextProvisionEligibility();

        public final int hashCode() {
            return 1695857109;
        }

        private CheckInContextProvisionEligibility() {
            super("CheckInContextProvisionEligibility", null);
        }

        public final java.lang.String toString() {
            return "CheckInContextProvisionEligibility";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.CheckInContextProvisionEligibility)) {
                return false;
            }
            return true;
        }
    }

    private DebitCardInContextAcquisitionEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionEvent$OnEligibilityCheckSucceeded;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionEvent;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/model/eligibility/EligibleDebitCardDetails;", "eligibleDebitCardDetails", "<init>", "(Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/model/eligibility/EligibleDebitCardDetails;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/model/eligibility/EligibleDebitCardDetails;", "copy", "(Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/model/eligibility/EligibleDebitCardDetails;)Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionEvent$OnEligibilityCheckSucceeded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/model/eligibility/EligibleDebitCardDetails;", "getEligibleDebitCardDetails"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnEligibilityCheckSucceeded extends com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.EligibleDebitCardDetails eligibleDebitCardDetails;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnEligibilityCheckSucceeded(com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.EligibleDebitCardDetails eligibleDebitCardDetails) {
            super("OnEligibilityCheckSucceeded", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eligibleDebitCardDetails, "");
            this.eligibleDebitCardDetails = eligibleDebitCardDetails;
        }

        public final com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.EligibleDebitCardDetails getEligibleDebitCardDetails() {
            return this.eligibleDebitCardDetails;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.EligibleDebitCardDetails eligibleDebitCardDetails = this.eligibleDebitCardDetails;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnEligibilityCheckSucceeded(eligibleDebitCardDetails=");
            sb.append(eligibleDebitCardDetails);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.eligibleDebitCardDetails.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnEligibilityCheckSucceeded) && kotlin.jvm.internal.Intrinsics.areEqual(this.eligibleDebitCardDetails, ((com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnEligibilityCheckSucceeded) other).eligibleDebitCardDetails);
        }

        public final com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnEligibilityCheckSucceeded copy(com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.EligibleDebitCardDetails eligibleDebitCardDetails) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eligibleDebitCardDetails, "");
            return new com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnEligibilityCheckSucceeded(eligibleDebitCardDetails);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.EligibleDebitCardDetails getEligibleDebitCardDetails() {
            return this.eligibleDebitCardDetails;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnEligibilityCheckSucceeded copy$default(com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnEligibilityCheckSucceeded onEligibilityCheckSucceeded, com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.EligibleDebitCardDetails eligibleDebitCardDetails, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                eligibleDebitCardDetails = onEligibilityCheckSucceeded.eligibleDebitCardDetails;
            }
            return onEligibilityCheckSucceeded.copy(eligibleDebitCardDetails);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionEvent$OnEligibilityCheckFailed;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionEvent;", "", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/model/eligibility/DebitCardEligibilityReason;", "reasons", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionEvent$OnEligibilityCheckFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getReasons"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnEligibilityCheckFailed extends com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityReason> reasons;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnEligibilityCheckFailed(java.util.List<com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityReason> list) {
            super("OnEligibilityCheckFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.reasons = list;
        }

        public final java.util.List<com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityReason> getReasons() {
            return this.reasons;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityReason> list = this.reasons;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnEligibilityCheckFailed(reasons=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.reasons.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnEligibilityCheckFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.reasons, ((com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnEligibilityCheckFailed) other).reasons);
        }

        public final com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnEligibilityCheckFailed copy(java.util.List<com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityReason> reasons) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reasons, "");
            return new com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnEligibilityCheckFailed(reasons);
        }

        public final java.util.List<com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityReason> component1() {
            return this.reasons;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnEligibilityCheckFailed copy$default(com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnEligibilityCheckFailed onEligibilityCheckFailed, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = onEligibilityCheckFailed.reasons;
            }
            return onEligibilityCheckFailed.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionEvent$OnEligibilityCheckError;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnEligibilityCheckError extends com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnEligibilityCheckError INSTANCE = new com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnEligibilityCheckError();

        public final int hashCode() {
            return 1032240371;
        }

        private OnEligibilityCheckError() {
            super("OnEligibilityCheckError", null);
        }

        public final java.lang.String toString() {
            return "OnEligibilityCheckError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnEligibilityCheckError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionEvent$LegalLinkClicked;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionEvent;", "", "url", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionEvent$LegalLinkClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LegalLinkClicked extends com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent {
        public static final int $stable = 0;
        private final java.lang.String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LegalLinkClicked(java.lang.String str) {
            super("LegalLinkClicked", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LegalLinkClicked(url=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.LegalLinkClicked) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.LegalLinkClicked) other).url);
        }

        public final com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.LegalLinkClicked copy(java.lang.String url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.LegalLinkClicked(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.LegalLinkClicked copy$default(com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.LegalLinkClicked legalLinkClicked, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = legalLinkClicked.url;
            }
            return legalLinkClicked.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionEvent$AgreeAndContinueClicked;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionEvent;", "", "fundingSourceId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionEvent$AgreeAndContinueClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFundingSourceId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AgreeAndContinueClicked extends com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent {
        public static final int $stable = 0;
        private final java.lang.String fundingSourceId;

        public AgreeAndContinueClicked(java.lang.String str) {
            super("AgreeAndContinueClicked", null);
            this.fundingSourceId = str;
        }

        public /* synthetic */ AgreeAndContinueClicked(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public final java.lang.String getFundingSourceId() {
            return this.fundingSourceId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.fundingSourceId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AgreeAndContinueClicked(fundingSourceId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.fundingSourceId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.AgreeAndContinueClicked) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingSourceId, ((com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.AgreeAndContinueClicked) other).fundingSourceId);
        }

        public final com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.AgreeAndContinueClicked copy(java.lang.String fundingSourceId) {
            return new com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.AgreeAndContinueClicked(fundingSourceId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getFundingSourceId() {
            return this.fundingSourceId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.AgreeAndContinueClicked copy$default(com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.AgreeAndContinueClicked agreeAndContinueClicked, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = agreeAndContinueClicked.fundingSourceId;
            }
            return agreeAndContinueClicked.copy(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AgreeAndContinueClicked() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionEvent$OnValidationPassed;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionEvent;", "", "fundingSourceId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionEvent$OnValidationPassed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFundingSourceId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnValidationPassed extends com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent {
        public static final int $stable = 0;
        private final java.lang.String fundingSourceId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnValidationPassed(java.lang.String str) {
            super("OnValidationPassed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.fundingSourceId = str;
        }

        public final java.lang.String getFundingSourceId() {
            return this.fundingSourceId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.fundingSourceId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnValidationPassed(fundingSourceId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.fundingSourceId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnValidationPassed) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingSourceId, ((com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnValidationPassed) other).fundingSourceId);
        }

        public final com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnValidationPassed copy(java.lang.String fundingSourceId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingSourceId, "");
            return new com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnValidationPassed(fundingSourceId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getFundingSourceId() {
            return this.fundingSourceId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnValidationPassed copy$default(com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnValidationPassed onValidationPassed, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onValidationPassed.fundingSourceId;
            }
            return onValidationPassed.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionEvent$OnFundingSourceMissing;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnFundingSourceMissing extends com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnFundingSourceMissing INSTANCE = new com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnFundingSourceMissing();

        public final int hashCode() {
            return 952100968;
        }

        private OnFundingSourceMissing() {
            super("OnFundingSourceMissing", null);
        }

        public final java.lang.String toString() {
            return "OnFundingSourceMissing";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnFundingSourceMissing)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionEvent$OnFundingSourceContingencyDetected;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnFundingSourceContingencyDetected extends com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnFundingSourceContingencyDetected INSTANCE = new com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnFundingSourceContingencyDetected();

        public final int hashCode() {
            return 1758612979;
        }

        private OnFundingSourceContingencyDetected() {
            super("OnFundingSourceContingencyDetected", null);
        }

        public final java.lang.String toString() {
            return "OnFundingSourceContingencyDetected";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnFundingSourceContingencyDetected)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionEvent$OnFundingSourceSelectionChanged;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnFundingSourceSelectionChanged extends com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnFundingSourceSelectionChanged INSTANCE = new com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnFundingSourceSelectionChanged();

        public final int hashCode() {
            return 1471434438;
        }

        private OnFundingSourceSelectionChanged() {
            super("OnFundingSourceSelectionChanged", null);
        }

        public final java.lang.String toString() {
            return "OnFundingSourceSelectionChanged";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnFundingSourceSelectionChanged)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionEvent$OnBannerClicked;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionEvent;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/BannerState;", "bannerState", "<init>", "(Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/BannerState;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/BannerState;", "copy", "(Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/BannerState;)Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionEvent$OnBannerClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/BannerState;", "getBannerState"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBannerClicked extends com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.BannerState bannerState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnBannerClicked(com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.BannerState bannerState) {
            super("OnBannerClicked", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bannerState, "");
            this.bannerState = bannerState;
        }

        public final com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.BannerState getBannerState() {
            return this.bannerState;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.BannerState bannerState = this.bannerState;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnBannerClicked(bannerState=");
            sb.append(bannerState);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.bannerState.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnBannerClicked) && kotlin.jvm.internal.Intrinsics.areEqual(this.bannerState, ((com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnBannerClicked) other).bannerState);
        }

        public final com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnBannerClicked copy(com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.BannerState bannerState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bannerState, "");
            return new com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnBannerClicked(bannerState);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.BannerState getBannerState() {
            return this.bannerState;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnBannerClicked copy$default(com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnBannerClicked onBannerClicked, com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.BannerState bannerState, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bannerState = onBannerClicked.bannerState;
            }
            return onBannerClicked.copy(bannerState);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionEvent$OnReadyToNavigateToConfirmBank;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionEvent;", "Lcom/paypal/oslo/feature/wallet/api/ui/banks/config/ConfirmBankConfig;", "config", "<init>", "(Lcom/paypal/oslo/feature/wallet/api/ui/banks/config/ConfirmBankConfig;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/api/ui/banks/config/ConfirmBankConfig;", "copy", "(Lcom/paypal/oslo/feature/wallet/api/ui/banks/config/ConfirmBankConfig;)Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionEvent$OnReadyToNavigateToConfirmBank;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/api/ui/banks/config/ConfirmBankConfig;", "getConfig"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnReadyToNavigateToConfirmBank extends com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent {
        public static final int $stable = com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmBankConfig.$stable;
        private final com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmBankConfig config;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnReadyToNavigateToConfirmBank(com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmBankConfig confirmBankConfig) {
            super("OnReadyToNavigateToConfirmBank", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmBankConfig, "");
            this.config = confirmBankConfig;
        }

        public final com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmBankConfig getConfig() {
            return this.config;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmBankConfig confirmBankConfig = this.config;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnReadyToNavigateToConfirmBank(config=");
            sb.append(confirmBankConfig);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.config.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnReadyToNavigateToConfirmBank) && kotlin.jvm.internal.Intrinsics.areEqual(this.config, ((com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnReadyToNavigateToConfirmBank) other).config);
        }

        public final com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnReadyToNavigateToConfirmBank copy(com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmBankConfig config) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
            return new com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnReadyToNavigateToConfirmBank(config);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmBankConfig getConfig() {
            return this.config;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnReadyToNavigateToConfirmBank copy$default(com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnReadyToNavigateToConfirmBank onReadyToNavigateToConfirmBank, com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmBankConfig confirmBankConfig, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                confirmBankConfig = onReadyToNavigateToConfirmBank.config;
            }
            return onReadyToNavigateToConfirmBank.copy(confirmBankConfig);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionEvent$OnBackButtonClicked;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBackButtonClicked extends com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnBackButtonClicked INSTANCE = new com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnBackButtonClicked();

        public final int hashCode() {
            return 2044340628;
        }

        private OnBackButtonClicked() {
            super("OnBackButtonClicked", null);
        }

        public final java.lang.String toString() {
            return "OnBackButtonClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnBackButtonClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionEvent$OnCloseButtonClicked;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnCloseButtonClicked extends com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnCloseButtonClicked INSTANCE = new com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnCloseButtonClicked();

        public final int hashCode() {
            return 486232983;
        }

        private OnCloseButtonClicked() {
            super("OnCloseButtonClicked", null);
        }

        public final java.lang.String toString() {
            return "OnCloseButtonClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnCloseButtonClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionEvent$OnSkipButtonClicked;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnSkipButtonClicked extends com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnSkipButtonClicked INSTANCE = new com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnSkipButtonClicked();

        public final int hashCode() {
            return 692977660;
        }

        private OnSkipButtonClicked() {
            super("OnSkipButtonClicked", null);
        }

        public final java.lang.String toString() {
            return "OnSkipButtonClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent.OnSkipButtonClicked)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ DebitCardInContextAcquisitionEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
