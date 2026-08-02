package com.paypal.oslo.feature.bnplacquisition.ui.offers;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\b\n\u000b\f\r\u000e\u000f\u0010\u0011B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\b\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "NavigateToReviewTerms", "NavigateToPersonalInfo", "NavigateToAdditionalInfo", "NavigateToRepaymentSelection", "NavigateBack", "ShowExitConfirmationModal", "CloseAcquisition", "ShowEmoneyInfoSheet", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiEffect$CloseAcquisition;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiEffect$NavigateBack;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiEffect$NavigateToAdditionalInfo;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiEffect$NavigateToPersonalInfo;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiEffect$NavigateToRepaymentSelection;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiEffect$NavigateToReviewTerms;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiEffect$ShowEmoneyInfoSheet;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiEffect$ShowExitConfirmationModal;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class OffersUiEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private OffersUiEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiEffect$NavigateToReviewTerms;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiEffect;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/reviewterms/ReviewTermsSuccess;", "reviewTermsData", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/reviewterms/ReviewTermsSuccess;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/reviewterms/ReviewTermsSuccess;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/reviewterms/ReviewTermsSuccess;)Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiEffect$NavigateToReviewTerms;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/reviewterms/ReviewTermsSuccess;", "getReviewTermsData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToReviewTerms extends com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.domain.model.reviewterms.ReviewTermsSuccess reviewTermsData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToReviewTerms(com.paypal.oslo.feature.bnplacquisition.domain.model.reviewterms.ReviewTermsSuccess reviewTermsSuccess) {
            super("NavigateToReviewTerms", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewTermsSuccess, "");
            this.reviewTermsData = reviewTermsSuccess;
        }

        public final com.paypal.oslo.feature.bnplacquisition.domain.model.reviewterms.ReviewTermsSuccess getReviewTermsData() {
            return this.reviewTermsData;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.domain.model.reviewterms.ReviewTermsSuccess reviewTermsSuccess = this.reviewTermsData;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToReviewTerms(reviewTermsData=");
            sb.append(reviewTermsSuccess);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.reviewTermsData.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiEffect.NavigateToReviewTerms) && kotlin.jvm.internal.Intrinsics.areEqual(this.reviewTermsData, ((com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiEffect.NavigateToReviewTerms) other).reviewTermsData);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiEffect.NavigateToReviewTerms copy(com.paypal.oslo.feature.bnplacquisition.domain.model.reviewterms.ReviewTermsSuccess reviewTermsData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewTermsData, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiEffect.NavigateToReviewTerms(reviewTermsData);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.domain.model.reviewterms.ReviewTermsSuccess getReviewTermsData() {
            return this.reviewTermsData;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiEffect.NavigateToReviewTerms copy$default(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiEffect.NavigateToReviewTerms navigateToReviewTerms, com.paypal.oslo.feature.bnplacquisition.domain.model.reviewterms.ReviewTermsSuccess reviewTermsSuccess, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                reviewTermsSuccess = navigateToReviewTerms.reviewTermsData;
            }
            return navigateToReviewTerms.copy(reviewTermsSuccess);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiEffect$NavigateToPersonalInfo;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiEffect;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/CreateCreditApplicationSuccess;", "createCreditApplicationSuccess", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/CreateCreditApplicationSuccess;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/CreateCreditApplicationSuccess;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/CreateCreditApplicationSuccess;)Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiEffect$NavigateToPersonalInfo;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/CreateCreditApplicationSuccess;", "getCreateCreditApplicationSuccess"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToPersonalInfo extends com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.CreateCreditApplicationSuccess createCreditApplicationSuccess;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToPersonalInfo(com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.CreateCreditApplicationSuccess createCreditApplicationSuccess) {
            super("NavigateToPersonalInfo", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createCreditApplicationSuccess, "");
            this.createCreditApplicationSuccess = createCreditApplicationSuccess;
        }

        public final com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.CreateCreditApplicationSuccess getCreateCreditApplicationSuccess() {
            return this.createCreditApplicationSuccess;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.CreateCreditApplicationSuccess createCreditApplicationSuccess = this.createCreditApplicationSuccess;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToPersonalInfo(createCreditApplicationSuccess=");
            sb.append(createCreditApplicationSuccess);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.createCreditApplicationSuccess.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiEffect.NavigateToPersonalInfo) && kotlin.jvm.internal.Intrinsics.areEqual(this.createCreditApplicationSuccess, ((com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiEffect.NavigateToPersonalInfo) other).createCreditApplicationSuccess);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiEffect.NavigateToPersonalInfo copy(com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.CreateCreditApplicationSuccess createCreditApplicationSuccess) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createCreditApplicationSuccess, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiEffect.NavigateToPersonalInfo(createCreditApplicationSuccess);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.CreateCreditApplicationSuccess getCreateCreditApplicationSuccess() {
            return this.createCreditApplicationSuccess;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiEffect.NavigateToPersonalInfo copy$default(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiEffect.NavigateToPersonalInfo navigateToPersonalInfo, com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.CreateCreditApplicationSuccess createCreditApplicationSuccess, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                createCreditApplicationSuccess = navigateToPersonalInfo.createCreditApplicationSuccess;
            }
            return navigateToPersonalInfo.copy(createCreditApplicationSuccess);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiEffect$NavigateToAdditionalInfo;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiEffect;", "", "formattedAmount", "selectedOfferId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiEffect$NavigateToAdditionalInfo;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFormattedAmount", "getSelectedOfferId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToAdditionalInfo extends com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiEffect {
        public static final int $stable = 0;
        private final java.lang.String formattedAmount;
        private final java.lang.String selectedOfferId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToAdditionalInfo(java.lang.String str, java.lang.String str2) {
            super("NavigateToAdditionalInfo", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.formattedAmount = str;
            this.selectedOfferId = str2;
        }

        public final java.lang.String getFormattedAmount() {
            return this.formattedAmount;
        }

        public final java.lang.String getSelectedOfferId() {
            return this.selectedOfferId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.formattedAmount;
            java.lang.String str2 = this.selectedOfferId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToAdditionalInfo(formattedAmount=");
            sb.append(str);
            sb.append(", selectedOfferId=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.formattedAmount.hashCode() * 31) + this.selectedOfferId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiEffect.NavigateToAdditionalInfo)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiEffect.NavigateToAdditionalInfo navigateToAdditionalInfo = (com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiEffect.NavigateToAdditionalInfo) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.formattedAmount, navigateToAdditionalInfo.formattedAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedOfferId, navigateToAdditionalInfo.selectedOfferId);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiEffect.NavigateToAdditionalInfo copy(java.lang.String formattedAmount, java.lang.String selectedOfferId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedOfferId, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiEffect.NavigateToAdditionalInfo(formattedAmount, selectedOfferId);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getSelectedOfferId() {
            return this.selectedOfferId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getFormattedAmount() {
            return this.formattedAmount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiEffect.NavigateToAdditionalInfo copy$default(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiEffect.NavigateToAdditionalInfo navigateToAdditionalInfo, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToAdditionalInfo.formattedAmount;
            }
            if ((i & 2) != 0) {
                str2 = navigateToAdditionalInfo.selectedOfferId;
            }
            return navigateToAdditionalInfo.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiEffect$NavigateToRepaymentSelection;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiEffect;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/repayments/RepaymentsSuccess;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/repayments/RepaymentsSuccess;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/repayments/RepaymentsSuccess;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/repayments/RepaymentsSuccess;)Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiEffect$NavigateToRepaymentSelection;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/repayments/RepaymentsSuccess;", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToRepaymentSelection extends com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.RepaymentsSuccess data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToRepaymentSelection(com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.RepaymentsSuccess repaymentsSuccess) {
            super("NavigateToRepaymentSelection", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(repaymentsSuccess, "");
            this.data = repaymentsSuccess;
        }

        public final com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.RepaymentsSuccess getData() {
            return this.data;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.RepaymentsSuccess repaymentsSuccess = this.data;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToRepaymentSelection(data=");
            sb.append(repaymentsSuccess);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.data.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiEffect.NavigateToRepaymentSelection) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiEffect.NavigateToRepaymentSelection) other).data);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiEffect.NavigateToRepaymentSelection copy(com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.RepaymentsSuccess data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiEffect.NavigateToRepaymentSelection(data);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.RepaymentsSuccess getData() {
            return this.data;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiEffect.NavigateToRepaymentSelection copy$default(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiEffect.NavigateToRepaymentSelection navigateToRepaymentSelection, com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.RepaymentsSuccess repaymentsSuccess, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                repaymentsSuccess = navigateToRepaymentSelection.data;
            }
            return navigateToRepaymentSelection.copy(repaymentsSuccess);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiEffect$NavigateBack;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBack extends com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiEffect.NavigateBack INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiEffect.NavigateBack();

        public final int hashCode() {
            return 1847984883;
        }

        private NavigateBack() {
            super("NavigateBack", null);
        }

        public final java.lang.String toString() {
            return "NavigateBack";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiEffect.NavigateBack)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiEffect$ShowExitConfirmationModal;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowExitConfirmationModal extends com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiEffect.ShowExitConfirmationModal INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiEffect.ShowExitConfirmationModal();

        public final int hashCode() {
            return -918934046;
        }

        private ShowExitConfirmationModal() {
            super("ShowExitConfirmationModal", null);
        }

        public final java.lang.String toString() {
            return "ShowExitConfirmationModal";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiEffect.ShowExitConfirmationModal)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiEffect$CloseAcquisition;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CloseAcquisition extends com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiEffect.CloseAcquisition INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiEffect.CloseAcquisition();

        public final int hashCode() {
            return -423846416;
        }

        private CloseAcquisition() {
            super("CloseAcquisition", null);
        }

        public final java.lang.String toString() {
            return "CloseAcquisition";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiEffect.CloseAcquisition)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiEffect$ShowEmoneyInfoSheet;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowEmoneyInfoSheet extends com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiEffect.ShowEmoneyInfoSheet INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiEffect.ShowEmoneyInfoSheet();

        public final int hashCode() {
            return -494418434;
        }

        private ShowEmoneyInfoSheet() {
            super("ShowEmoneyInfoSheet", null);
        }

        public final java.lang.String toString() {
            return "ShowEmoneyInfoSheet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiEffect.ShowEmoneyInfoSheet)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ OffersUiEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
