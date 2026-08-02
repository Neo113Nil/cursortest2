package com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initial", "Awaiting", "EligibilityChecked", "Error", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionUiState$Awaiting;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionUiState$EligibilityChecked;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionUiState$Error;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionUiState$Initial;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class DebitCardInContextAcquisitionUiState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionUiState$Initial;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiState.Initial INSTANCE = new com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiState.Initial();

        public final int hashCode() {
            return -904280052;
        }

        private Initial() {
            super("Initial", null);
        }

        public final java.lang.String toString() {
            return "Initial";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiState.Initial)) {
                return false;
            }
            return true;
        }
    }

    private DebitCardInContextAcquisitionUiState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000bJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionUiState$Awaiting;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionUiState;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/AwaitingData;", "awaitingData", "", "retryCount", "<init>", "(Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/AwaitingData;I)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/AwaitingData;", "component2", "()I", "copy", "(Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/AwaitingData;I)Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionUiState$Awaiting;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/AwaitingData;", "getAwaitingData", com.visa.cbp.getEncExpo.warmup, "getRetryCount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Awaiting extends com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.AwaitingData awaitingData;
        private final int retryCount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Awaiting(com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.AwaitingData awaitingData, int i) {
            super("Awaiting", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(awaitingData, "");
            this.awaitingData = awaitingData;
            this.retryCount = i;
        }

        public /* synthetic */ Awaiting(com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.AwaitingData awaitingData, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(awaitingData, (i2 & 2) != 0 ? 0 : i);
        }

        public final com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.AwaitingData getAwaitingData() {
            return this.awaitingData;
        }

        public final int getRetryCount() {
            return this.retryCount;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.AwaitingData awaitingData = this.awaitingData;
            int i = this.retryCount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Awaiting(awaitingData=");
            sb.append(awaitingData);
            sb.append(", retryCount=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.awaitingData.hashCode() * 31) + java.lang.Integer.hashCode(this.retryCount);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiState.Awaiting)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiState.Awaiting awaiting = (com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiState.Awaiting) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.awaitingData, awaiting.awaitingData) && this.retryCount == awaiting.retryCount;
        }

        public final com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiState.Awaiting copy(com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.AwaitingData awaitingData, int retryCount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(awaitingData, "");
            return new com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiState.Awaiting(awaitingData, retryCount);
        }

        /* renamed from: component2, reason: from getter */
        public final int getRetryCount() {
            return this.retryCount;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.AwaitingData getAwaitingData() {
            return this.awaitingData;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiState.Awaiting copy$default(com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiState.Awaiting awaiting, com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.AwaitingData awaitingData, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                awaitingData = awaiting.awaitingData;
            }
            if ((i2 & 2) != 0) {
                i = awaiting.retryCount;
            }
            return awaiting.copy(awaitingData, i);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionUiState$EligibilityChecked;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionUiState;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/model/eligibility/EligibleDebitCardDetails;", "eligibleDebitCardDetails", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/BannerState;", "bannerState", "<init>", "(Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/model/eligibility/EligibleDebitCardDetails;Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/BannerState;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/model/eligibility/EligibleDebitCardDetails;", "component2", "()Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/BannerState;", "copy", "(Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/model/eligibility/EligibleDebitCardDetails;Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/BannerState;)Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionUiState$EligibilityChecked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/model/eligibility/EligibleDebitCardDetails;", "getEligibleDebitCardDetails", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/BannerState;", "getBannerState"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EligibilityChecked extends com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.BannerState bannerState;
        private final com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.EligibleDebitCardDetails eligibleDebitCardDetails;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EligibilityChecked(com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.EligibleDebitCardDetails eligibleDebitCardDetails, com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.BannerState bannerState) {
            super("EligibilityChecked", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eligibleDebitCardDetails, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bannerState, "");
            this.eligibleDebitCardDetails = eligibleDebitCardDetails;
            this.bannerState = bannerState;
        }

        public final com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.EligibleDebitCardDetails getEligibleDebitCardDetails() {
            return this.eligibleDebitCardDetails;
        }

        public /* synthetic */ EligibilityChecked(com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.EligibleDebitCardDetails eligibleDebitCardDetails, com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.BannerState.Hidden hidden, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(eligibleDebitCardDetails, (i & 2) != 0 ? com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.BannerState.Hidden.INSTANCE : hidden);
        }

        public final com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.BannerState getBannerState() {
            return this.bannerState;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.EligibleDebitCardDetails eligibleDebitCardDetails = this.eligibleDebitCardDetails;
            com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.BannerState bannerState = this.bannerState;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("EligibilityChecked(eligibleDebitCardDetails=");
            sb.append(eligibleDebitCardDetails);
            sb.append(", bannerState=");
            sb.append(bannerState);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.eligibleDebitCardDetails.hashCode() * 31) + this.bannerState.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiState.EligibilityChecked)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiState.EligibilityChecked eligibilityChecked = (com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiState.EligibilityChecked) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.eligibleDebitCardDetails, eligibilityChecked.eligibleDebitCardDetails) && kotlin.jvm.internal.Intrinsics.areEqual(this.bannerState, eligibilityChecked.bannerState);
        }

        public final com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiState.EligibilityChecked copy(com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.EligibleDebitCardDetails eligibleDebitCardDetails, com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.BannerState bannerState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eligibleDebitCardDetails, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bannerState, "");
            return new com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiState.EligibilityChecked(eligibleDebitCardDetails, bannerState);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.BannerState getBannerState() {
            return this.bannerState;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.EligibleDebitCardDetails getEligibleDebitCardDetails() {
            return this.eligibleDebitCardDetails;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiState.EligibilityChecked copy$default(com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiState.EligibilityChecked eligibilityChecked, com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.EligibleDebitCardDetails eligibleDebitCardDetails, com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.BannerState bannerState, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                eligibleDebitCardDetails = eligibilityChecked.eligibleDebitCardDetails;
            }
            if ((i & 2) != 0) {
                bannerState = eligibilityChecked.bannerState;
            }
            return eligibilityChecked.copy(eligibleDebitCardDetails, bannerState);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000bJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionUiState$Error;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionUiState;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "errorType", "", "retryCount", "<init>", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;I)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "component2", "()I", "copy", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;I)Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/DebitCardInContextAcquisitionUiState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "getErrorType", com.visa.cbp.getEncExpo.warmup, "getRetryCount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType;
        private final int retryCount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, int i) {
            super("Error", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitErrorType, "");
            this.errorType = debitErrorType;
            this.retryCount = i;
        }

        public /* synthetic */ Error(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(debitErrorType, (i2 & 2) != 0 ? 0 : i);
        }

        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getErrorType() {
            return this.errorType;
        }

        public final int getRetryCount() {
            return this.retryCount;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType = this.errorType;
            int i = this.retryCount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(errorType=");
            sb.append(debitErrorType);
            sb.append(", retryCount=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.errorType.hashCode() * 31) + java.lang.Integer.hashCode(this.retryCount);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiState.Error)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiState.Error error = (com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiState.Error) other;
            return this.errorType == error.errorType && this.retryCount == error.retryCount;
        }

        public final com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiState.Error copy(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType, int retryCount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
            return new com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiState.Error(errorType, retryCount);
        }

        /* renamed from: component2, reason: from getter */
        public final int getRetryCount() {
            return this.retryCount;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getErrorType() {
            return this.errorType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiState.Error copy$default(com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionUiState.Error error, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                debitErrorType = error.errorType;
            }
            if ((i2 & 2) != 0) {
                i = error.retryCount;
            }
            return error.copy(debitErrorType, i);
        }
    }

    public /* synthetic */ DebitCardInContextAcquisitionUiState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
