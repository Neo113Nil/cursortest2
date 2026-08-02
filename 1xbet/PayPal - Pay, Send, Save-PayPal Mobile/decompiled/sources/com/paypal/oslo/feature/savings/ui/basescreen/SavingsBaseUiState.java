package com.paypal.oslo.feature.savings.ui.basescreen;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0012\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0012\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsBaseUiState;", "", "<init>", "()V", "Loading", "MoveToHubState", "MoveHomeScreenState", "NetworkError", "MoveToStartSavings", "MoveToSavingsTerms", "MoveToAddMoneyScreen", "IneligibleForSavings", "IneligibleForSavingsAcctClosedRecently", "IneligibleForSavingsNegativeBalanceInWallet", "IneligibleForSavingsUnconfirmedEmail", "EligibilityInReview", "AwaitingOnboardingResult", "IneligibleForSavingsVerificationFailed", "Error", "OnboardingFeatureDisabled", "SubscribedWithoutSavingsAcct", "MoveToDirectOnBoarding", "Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsBaseUiState$AwaitingOnboardingResult;", "Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsBaseUiState$EligibilityInReview;", "Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsBaseUiState$Error;", "Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsBaseUiState$IneligibleForSavings;", "Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsBaseUiState$IneligibleForSavingsAcctClosedRecently;", "Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsBaseUiState$IneligibleForSavingsNegativeBalanceInWallet;", "Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsBaseUiState$IneligibleForSavingsUnconfirmedEmail;", "Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsBaseUiState$IneligibleForSavingsVerificationFailed;", "Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsBaseUiState$Loading;", "Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsBaseUiState$MoveHomeScreenState;", "Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsBaseUiState$MoveToAddMoneyScreen;", "Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsBaseUiState$MoveToDirectOnBoarding;", "Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsBaseUiState$MoveToHubState;", "Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsBaseUiState$MoveToSavingsTerms;", "Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsBaseUiState$MoveToStartSavings;", "Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsBaseUiState$NetworkError;", "Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsBaseUiState$OnboardingFeatureDisabled;", "Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsBaseUiState$SubscribedWithoutSavingsAcct;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class SavingsBaseUiState {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsBaseUiState$Loading;", "Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsBaseUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.Loading INSTANCE = new com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.Loading();

        public final int hashCode() {
            return 2104049182;
        }

        private Loading() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Loading";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.Loading)) {
                return false;
            }
            return true;
        }
    }

    private SavingsBaseUiState() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsBaseUiState$MoveToHubState;", "Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsBaseUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MoveToHubState extends com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.MoveToHubState INSTANCE = new com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.MoveToHubState();

        public final int hashCode() {
            return -415047738;
        }

        private MoveToHubState() {
            super(null);
        }

        public final java.lang.String toString() {
            return "MoveToHubState";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.MoveToHubState)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsBaseUiState$MoveHomeScreenState;", "Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsBaseUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MoveHomeScreenState extends com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.MoveHomeScreenState INSTANCE = new com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.MoveHomeScreenState();

        public final int hashCode() {
            return -252767497;
        }

        private MoveHomeScreenState() {
            super(null);
        }

        public final java.lang.String toString() {
            return "MoveHomeScreenState";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.MoveHomeScreenState)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsBaseUiState$NetworkError;", "Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsBaseUiState;", "Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsRetryNetworkCall;", "networkOperation", "<init>", "(Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsRetryNetworkCall;)V", "component1", "()Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsRetryNetworkCall;", "copy", "(Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsRetryNetworkCall;)Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsBaseUiState$NetworkError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsRetryNetworkCall;", "getNetworkOperation"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NetworkError extends com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.savings.ui.basescreen.SavingsRetryNetworkCall networkOperation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NetworkError(com.paypal.oslo.feature.savings.ui.basescreen.SavingsRetryNetworkCall savingsRetryNetworkCall) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsRetryNetworkCall, "");
            this.networkOperation = savingsRetryNetworkCall;
        }

        public final com.paypal.oslo.feature.savings.ui.basescreen.SavingsRetryNetworkCall getNetworkOperation() {
            return this.networkOperation;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.savings.ui.basescreen.SavingsRetryNetworkCall savingsRetryNetworkCall = this.networkOperation;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NetworkError(networkOperation=");
            sb.append(savingsRetryNetworkCall);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.networkOperation.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.NetworkError) && kotlin.jvm.internal.Intrinsics.areEqual(this.networkOperation, ((com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.NetworkError) other).networkOperation);
        }

        public final com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.NetworkError copy(com.paypal.oslo.feature.savings.ui.basescreen.SavingsRetryNetworkCall networkOperation) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkOperation, "");
            return new com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.NetworkError(networkOperation);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.savings.ui.basescreen.SavingsRetryNetworkCall getNetworkOperation() {
            return this.networkOperation;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.NetworkError copy$default(com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.NetworkError networkError, com.paypal.oslo.feature.savings.ui.basescreen.SavingsRetryNetworkCall savingsRetryNetworkCall, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                savingsRetryNetworkCall = networkError.networkOperation;
            }
            return networkError.copy(savingsRetryNetworkCall);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u0005\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsBaseUiState$MoveToStartSavings;", "Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsBaseUiState;", "Lcom/paypal/oslo/feature/savings/domain/model/SavingsLandingPageResult;", "landingPageData", "", "isUnconfirmedEmailError", "<init>", "(Lcom/paypal/oslo/feature/savings/domain/model/SavingsLandingPageResult;Z)V", "component1", "()Lcom/paypal/oslo/feature/savings/domain/model/SavingsLandingPageResult;", "component2", "()Z", "copy", "(Lcom/paypal/oslo/feature/savings/domain/model/SavingsLandingPageResult;Z)Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsBaseUiState$MoveToStartSavings;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/savings/domain/model/SavingsLandingPageResult;", "getLandingPageData", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MoveToStartSavings extends com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState {
        public static final int $stable = 0;
        private final boolean isUnconfirmedEmailError;
        private final com.paypal.oslo.feature.savings.domain.model.SavingsLandingPageResult landingPageData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MoveToStartSavings(com.paypal.oslo.feature.savings.domain.model.SavingsLandingPageResult savingsLandingPageResult, boolean z) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsLandingPageResult, "");
            this.landingPageData = savingsLandingPageResult;
            this.isUnconfirmedEmailError = z;
        }

        public /* synthetic */ MoveToStartSavings(com.paypal.oslo.feature.savings.domain.model.SavingsLandingPageResult savingsLandingPageResult, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(savingsLandingPageResult, (i & 2) != 0 ? false : z);
        }

        public final com.paypal.oslo.feature.savings.domain.model.SavingsLandingPageResult getLandingPageData() {
            return this.landingPageData;
        }

        public final boolean isUnconfirmedEmailError() {
            return this.isUnconfirmedEmailError;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.savings.domain.model.SavingsLandingPageResult savingsLandingPageResult = this.landingPageData;
            boolean z = this.isUnconfirmedEmailError;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MoveToStartSavings(landingPageData=");
            sb.append(savingsLandingPageResult);
            sb.append(", isUnconfirmedEmailError=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.landingPageData.hashCode() * 31) + java.lang.Boolean.hashCode(this.isUnconfirmedEmailError);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.MoveToStartSavings)) {
                return false;
            }
            com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.MoveToStartSavings moveToStartSavings = (com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.MoveToStartSavings) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.landingPageData, moveToStartSavings.landingPageData) && this.isUnconfirmedEmailError == moveToStartSavings.isUnconfirmedEmailError;
        }

        public final com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.MoveToStartSavings copy(com.paypal.oslo.feature.savings.domain.model.SavingsLandingPageResult landingPageData, boolean isUnconfirmedEmailError) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(landingPageData, "");
            return new com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.MoveToStartSavings(landingPageData, isUnconfirmedEmailError);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsUnconfirmedEmailError() {
            return this.isUnconfirmedEmailError;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.savings.domain.model.SavingsLandingPageResult getLandingPageData() {
            return this.landingPageData;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.MoveToStartSavings copy$default(com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.MoveToStartSavings moveToStartSavings, com.paypal.oslo.feature.savings.domain.model.SavingsLandingPageResult savingsLandingPageResult, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                savingsLandingPageResult = moveToStartSavings.landingPageData;
            }
            if ((i & 2) != 0) {
                z = moveToStartSavings.isUnconfirmedEmailError;
            }
            return moveToStartSavings.copy(savingsLandingPageResult, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsBaseUiState$MoveToSavingsTerms;", "Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsBaseUiState;", "Lcom/paypal/oslo/feature/savings/domain/model/SavingsLandingPageResult;", "landingPageData", "<init>", "(Lcom/paypal/oslo/feature/savings/domain/model/SavingsLandingPageResult;)V", "component1", "()Lcom/paypal/oslo/feature/savings/domain/model/SavingsLandingPageResult;", "copy", "(Lcom/paypal/oslo/feature/savings/domain/model/SavingsLandingPageResult;)Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsBaseUiState$MoveToSavingsTerms;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/savings/domain/model/SavingsLandingPageResult;", "getLandingPageData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MoveToSavingsTerms extends com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.savings.domain.model.SavingsLandingPageResult landingPageData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MoveToSavingsTerms(com.paypal.oslo.feature.savings.domain.model.SavingsLandingPageResult savingsLandingPageResult) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsLandingPageResult, "");
            this.landingPageData = savingsLandingPageResult;
        }

        public final com.paypal.oslo.feature.savings.domain.model.SavingsLandingPageResult getLandingPageData() {
            return this.landingPageData;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.savings.domain.model.SavingsLandingPageResult savingsLandingPageResult = this.landingPageData;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MoveToSavingsTerms(landingPageData=");
            sb.append(savingsLandingPageResult);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.landingPageData.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.MoveToSavingsTerms) && kotlin.jvm.internal.Intrinsics.areEqual(this.landingPageData, ((com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.MoveToSavingsTerms) other).landingPageData);
        }

        public final com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.MoveToSavingsTerms copy(com.paypal.oslo.feature.savings.domain.model.SavingsLandingPageResult landingPageData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(landingPageData, "");
            return new com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.MoveToSavingsTerms(landingPageData);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.savings.domain.model.SavingsLandingPageResult getLandingPageData() {
            return this.landingPageData;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.MoveToSavingsTerms copy$default(com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.MoveToSavingsTerms moveToSavingsTerms, com.paypal.oslo.feature.savings.domain.model.SavingsLandingPageResult savingsLandingPageResult, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                savingsLandingPageResult = moveToSavingsTerms.landingPageData;
            }
            return moveToSavingsTerms.copy(savingsLandingPageResult);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsBaseUiState$MoveToAddMoneyScreen;", "Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsBaseUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MoveToAddMoneyScreen extends com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.MoveToAddMoneyScreen INSTANCE = new com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.MoveToAddMoneyScreen();

        public final int hashCode() {
            return 1423226261;
        }

        private MoveToAddMoneyScreen() {
            super(null);
        }

        public final java.lang.String toString() {
            return "MoveToAddMoneyScreen";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.MoveToAddMoneyScreen)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsBaseUiState$IneligibleForSavings;", "Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsBaseUiState;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsBaseUiState$IneligibleForSavings;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class IneligibleForSavings extends com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState {
        public static final int $stable = 0;
        private final java.lang.String message;

        public IneligibleForSavings(java.lang.String str) {
            super(null);
            this.message = str;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("IneligibleForSavings(message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.message;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.IneligibleForSavings) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.IneligibleForSavings) other).message);
        }

        public final com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.IneligibleForSavings copy(java.lang.String message) {
            return new com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.IneligibleForSavings(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.IneligibleForSavings copy$default(com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.IneligibleForSavings ineligibleForSavings, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = ineligibleForSavings.message;
            }
            return ineligibleForSavings.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsBaseUiState$IneligibleForSavingsAcctClosedRecently;", "Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsBaseUiState;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsBaseUiState$IneligibleForSavingsAcctClosedRecently;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class IneligibleForSavingsAcctClosedRecently extends com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState {
        public static final int $stable = 0;
        private final java.lang.String message;

        public IneligibleForSavingsAcctClosedRecently(java.lang.String str) {
            super(null);
            this.message = str;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("IneligibleForSavingsAcctClosedRecently(message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.message;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.IneligibleForSavingsAcctClosedRecently) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.IneligibleForSavingsAcctClosedRecently) other).message);
        }

        public final com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.IneligibleForSavingsAcctClosedRecently copy(java.lang.String message) {
            return new com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.IneligibleForSavingsAcctClosedRecently(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.IneligibleForSavingsAcctClosedRecently copy$default(com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.IneligibleForSavingsAcctClosedRecently ineligibleForSavingsAcctClosedRecently, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = ineligibleForSavingsAcctClosedRecently.message;
            }
            return ineligibleForSavingsAcctClosedRecently.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsBaseUiState$IneligibleForSavingsNegativeBalanceInWallet;", "Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsBaseUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class IneligibleForSavingsNegativeBalanceInWallet extends com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.IneligibleForSavingsNegativeBalanceInWallet INSTANCE = new com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.IneligibleForSavingsNegativeBalanceInWallet();

        public final int hashCode() {
            return 1792859899;
        }

        private IneligibleForSavingsNegativeBalanceInWallet() {
            super(null);
        }

        public final java.lang.String toString() {
            return "IneligibleForSavingsNegativeBalanceInWallet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.IneligibleForSavingsNegativeBalanceInWallet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsBaseUiState$IneligibleForSavingsUnconfirmedEmail;", "Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsBaseUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class IneligibleForSavingsUnconfirmedEmail extends com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.IneligibleForSavingsUnconfirmedEmail INSTANCE = new com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.IneligibleForSavingsUnconfirmedEmail();

        public final int hashCode() {
            return -50277472;
        }

        private IneligibleForSavingsUnconfirmedEmail() {
            super(null);
        }

        public final java.lang.String toString() {
            return "IneligibleForSavingsUnconfirmedEmail";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.IneligibleForSavingsUnconfirmedEmail)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsBaseUiState$EligibilityInReview;", "Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsBaseUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EligibilityInReview extends com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.EligibilityInReview INSTANCE = new com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.EligibilityInReview();

        public final int hashCode() {
            return -598489748;
        }

        private EligibilityInReview() {
            super(null);
        }

        public final java.lang.String toString() {
            return "EligibilityInReview";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.EligibilityInReview)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsBaseUiState$AwaitingOnboardingResult;", "Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsBaseUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AwaitingOnboardingResult extends com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.AwaitingOnboardingResult INSTANCE = new com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.AwaitingOnboardingResult();

        public final int hashCode() {
            return -872271774;
        }

        private AwaitingOnboardingResult() {
            super(null);
        }

        public final java.lang.String toString() {
            return "AwaitingOnboardingResult";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.AwaitingOnboardingResult)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsBaseUiState$IneligibleForSavingsVerificationFailed;", "Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsBaseUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class IneligibleForSavingsVerificationFailed extends com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.IneligibleForSavingsVerificationFailed INSTANCE = new com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.IneligibleForSavingsVerificationFailed();

        public final int hashCode() {
            return 577721602;
        }

        private IneligibleForSavingsVerificationFailed() {
            super(null);
        }

        public final java.lang.String toString() {
            return "IneligibleForSavingsVerificationFailed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.IneligibleForSavingsVerificationFailed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsBaseUiState$Error;", "Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsBaseUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.Error INSTANCE = new com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.Error();

        public final int hashCode() {
            return -1041039510;
        }

        private Error() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Error";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.Error)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsBaseUiState$OnboardingFeatureDisabled;", "Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsBaseUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnboardingFeatureDisabled extends com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.OnboardingFeatureDisabled INSTANCE = new com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.OnboardingFeatureDisabled();

        public final int hashCode() {
            return 594515033;
        }

        private OnboardingFeatureDisabled() {
            super(null);
        }

        public final java.lang.String toString() {
            return "OnboardingFeatureDisabled";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.OnboardingFeatureDisabled)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsBaseUiState$SubscribedWithoutSavingsAcct;", "Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsBaseUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SubscribedWithoutSavingsAcct extends com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.SubscribedWithoutSavingsAcct INSTANCE = new com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.SubscribedWithoutSavingsAcct();

        public final int hashCode() {
            return 522885340;
        }

        private SubscribedWithoutSavingsAcct() {
            super(null);
        }

        public final java.lang.String toString() {
            return "SubscribedWithoutSavingsAcct";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.SubscribedWithoutSavingsAcct)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsBaseUiState$MoveToDirectOnBoarding;", "Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsBaseUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MoveToDirectOnBoarding extends com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.MoveToDirectOnBoarding INSTANCE = new com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.MoveToDirectOnBoarding();

        public final int hashCode() {
            return -885454802;
        }

        private MoveToDirectOnBoarding() {
            super(null);
        }

        public final java.lang.String toString() {
            return "MoveToDirectOnBoarding";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.MoveToDirectOnBoarding)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ SavingsBaseUiState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
