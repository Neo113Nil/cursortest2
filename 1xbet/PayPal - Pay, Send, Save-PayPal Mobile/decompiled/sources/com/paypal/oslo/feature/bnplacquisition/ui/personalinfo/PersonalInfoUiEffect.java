package com.paypal.oslo.feature.bnplacquisition.ui.personalinfo;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\r\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\r\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "NavigateBack", "CloseAcquisition", "OpenUrl", "NavigateToOffers", "NavigateToReviewPlan", "ShowAddressBottomSheet", "DismissAddressBottomSheet", "ShowAddressValidationModal", "ShowAddressSavedToast", "ScrollToFirstError", "ShowRepaymentBottomSheet", "DismissRepaymentBottomSheet", "NavigateToLinkFunding", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiEffect$CloseAcquisition;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiEffect$DismissAddressBottomSheet;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiEffect$DismissRepaymentBottomSheet;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiEffect$NavigateBack;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiEffect$NavigateToLinkFunding;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiEffect$NavigateToOffers;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiEffect$NavigateToReviewPlan;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiEffect$OpenUrl;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiEffect$ScrollToFirstError;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiEffect$ShowAddressBottomSheet;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiEffect$ShowAddressSavedToast;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiEffect$ShowAddressValidationModal;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiEffect$ShowRepaymentBottomSheet;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class PersonalInfoUiEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private PersonalInfoUiEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiEffect$NavigateBack;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBack extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.NavigateBack INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.NavigateBack();

        public final int hashCode() {
            return -1729151309;
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
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.NavigateBack)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiEffect$CloseAcquisition;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CloseAcquisition extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.CloseAcquisition INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.CloseAcquisition();

        public final int hashCode() {
            return -821954128;
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
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.CloseAcquisition)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiEffect$OpenUrl;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiEffect;", "", "url", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiEffect$OpenUrl;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OpenUrl extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect {
        public static final int $stable = 0;
        private final java.lang.String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenUrl(java.lang.String str) {
            super("OpenUrl", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OpenUrl(url=");
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
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.OpenUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.OpenUrl) other).url);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.OpenUrl copy(java.lang.String url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.OpenUrl(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.OpenUrl copy$default(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.OpenUrl openUrl, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = openUrl.url;
            }
            return openUrl.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiEffect$NavigateToOffers;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiEffect;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/offers/AvailableOfferDetailsSuccessCreditApplication;", "availableOffersCreditApplication", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/offers/AvailableOfferDetailsSuccessCreditApplication;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/offers/AvailableOfferDetailsSuccessCreditApplication;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/offers/AvailableOfferDetailsSuccessCreditApplication;)Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiEffect$NavigateToOffers;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/offers/AvailableOfferDetailsSuccessCreditApplication;", "getAvailableOffersCreditApplication"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToOffers extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.domain.model.offers.AvailableOfferDetailsSuccessCreditApplication availableOffersCreditApplication;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToOffers(com.paypal.oslo.feature.bnplacquisition.domain.model.offers.AvailableOfferDetailsSuccessCreditApplication availableOfferDetailsSuccessCreditApplication) {
            super("NavigateToOffers", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableOfferDetailsSuccessCreditApplication, "");
            this.availableOffersCreditApplication = availableOfferDetailsSuccessCreditApplication;
        }

        public final com.paypal.oslo.feature.bnplacquisition.domain.model.offers.AvailableOfferDetailsSuccessCreditApplication getAvailableOffersCreditApplication() {
            return this.availableOffersCreditApplication;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.domain.model.offers.AvailableOfferDetailsSuccessCreditApplication availableOfferDetailsSuccessCreditApplication = this.availableOffersCreditApplication;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToOffers(availableOffersCreditApplication=");
            sb.append(availableOfferDetailsSuccessCreditApplication);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.availableOffersCreditApplication.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.NavigateToOffers) && kotlin.jvm.internal.Intrinsics.areEqual(this.availableOffersCreditApplication, ((com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.NavigateToOffers) other).availableOffersCreditApplication);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.NavigateToOffers copy(com.paypal.oslo.feature.bnplacquisition.domain.model.offers.AvailableOfferDetailsSuccessCreditApplication availableOffersCreditApplication) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableOffersCreditApplication, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.NavigateToOffers(availableOffersCreditApplication);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.domain.model.offers.AvailableOfferDetailsSuccessCreditApplication getAvailableOffersCreditApplication() {
            return this.availableOffersCreditApplication;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.NavigateToOffers copy$default(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.NavigateToOffers navigateToOffers, com.paypal.oslo.feature.bnplacquisition.domain.model.offers.AvailableOfferDetailsSuccessCreditApplication availableOfferDetailsSuccessCreditApplication, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                availableOfferDetailsSuccessCreditApplication = navigateToOffers.availableOffersCreditApplication;
            }
            return navigateToOffers.copy(availableOfferDetailsSuccessCreditApplication);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiEffect$NavigateToReviewPlan;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiEffect;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/reviewplan/ReviewPlanDetailsSuccess;", "reviewDetails", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/reviewplan/ReviewPlanDetailsSuccess;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/reviewplan/ReviewPlanDetailsSuccess;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/reviewplan/ReviewPlanDetailsSuccess;)Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiEffect$NavigateToReviewPlan;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/reviewplan/ReviewPlanDetailsSuccess;", "getReviewDetails"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToReviewPlan extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.domain.model.reviewplan.ReviewPlanDetailsSuccess reviewDetails;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToReviewPlan(com.paypal.oslo.feature.bnplacquisition.domain.model.reviewplan.ReviewPlanDetailsSuccess reviewPlanDetailsSuccess) {
            super("NavigateToReviewPlan", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewPlanDetailsSuccess, "");
            this.reviewDetails = reviewPlanDetailsSuccess;
        }

        public final com.paypal.oslo.feature.bnplacquisition.domain.model.reviewplan.ReviewPlanDetailsSuccess getReviewDetails() {
            return this.reviewDetails;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.domain.model.reviewplan.ReviewPlanDetailsSuccess reviewPlanDetailsSuccess = this.reviewDetails;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToReviewPlan(reviewDetails=");
            sb.append(reviewPlanDetailsSuccess);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.reviewDetails.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.NavigateToReviewPlan) && kotlin.jvm.internal.Intrinsics.areEqual(this.reviewDetails, ((com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.NavigateToReviewPlan) other).reviewDetails);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.NavigateToReviewPlan copy(com.paypal.oslo.feature.bnplacquisition.domain.model.reviewplan.ReviewPlanDetailsSuccess reviewDetails) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewDetails, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.NavigateToReviewPlan(reviewDetails);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.domain.model.reviewplan.ReviewPlanDetailsSuccess getReviewDetails() {
            return this.reviewDetails;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.NavigateToReviewPlan copy$default(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.NavigateToReviewPlan navigateToReviewPlan, com.paypal.oslo.feature.bnplacquisition.domain.model.reviewplan.ReviewPlanDetailsSuccess reviewPlanDetailsSuccess, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                reviewPlanDetailsSuccess = navigateToReviewPlan.reviewDetails;
            }
            return navigateToReviewPlan.copy(reviewPlanDetailsSuccess);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiEffect$ShowAddressBottomSheet;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowAddressBottomSheet extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.ShowAddressBottomSheet INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.ShowAddressBottomSheet();

        public final int hashCode() {
            return 1005250104;
        }

        private ShowAddressBottomSheet() {
            super("ShowAddressBottomSheet", null);
        }

        public final java.lang.String toString() {
            return "ShowAddressBottomSheet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.ShowAddressBottomSheet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiEffect$DismissAddressBottomSheet;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DismissAddressBottomSheet extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.DismissAddressBottomSheet INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.DismissAddressBottomSheet();

        public final int hashCode() {
            return 1450166447;
        }

        private DismissAddressBottomSheet() {
            super("DismissAddressBottomSheet", null);
        }

        public final java.lang.String toString() {
            return "DismissAddressBottomSheet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.DismissAddressBottomSheet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiEffect$ShowAddressValidationModal;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiEffect;", "", "failedAddressText", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "failedAddress", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/core/i18n/domain/model/Address;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/core/i18n/domain/model/Address;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/core/i18n/domain/model/Address;)Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiEffect$ShowAddressValidationModal;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFailedAddressText", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "getFailedAddress"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowAddressValidationModal extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.core.i18n.domain.model.Address failedAddress;
        private final java.lang.String failedAddressText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowAddressValidationModal(java.lang.String str, com.paypal.oslo.core.i18n.domain.model.Address address) {
            super("ShowAddressValidationModal", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
            this.failedAddressText = str;
            this.failedAddress = address;
        }

        public final java.lang.String getFailedAddressText() {
            return this.failedAddressText;
        }

        public final com.paypal.oslo.core.i18n.domain.model.Address getFailedAddress() {
            return this.failedAddress;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.failedAddressText;
            com.paypal.oslo.core.i18n.domain.model.Address address = this.failedAddress;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowAddressValidationModal(failedAddressText=");
            sb.append(str);
            sb.append(", failedAddress=");
            sb.append(address);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.failedAddressText.hashCode() * 31) + this.failedAddress.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.ShowAddressValidationModal)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.ShowAddressValidationModal showAddressValidationModal = (com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.ShowAddressValidationModal) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.failedAddressText, showAddressValidationModal.failedAddressText) && kotlin.jvm.internal.Intrinsics.areEqual(this.failedAddress, showAddressValidationModal.failedAddress);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.ShowAddressValidationModal copy(java.lang.String failedAddressText, com.paypal.oslo.core.i18n.domain.model.Address failedAddress) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failedAddressText, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failedAddress, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.ShowAddressValidationModal(failedAddressText, failedAddress);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.core.i18n.domain.model.Address getFailedAddress() {
            return this.failedAddress;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getFailedAddressText() {
            return this.failedAddressText;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.ShowAddressValidationModal copy$default(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.ShowAddressValidationModal showAddressValidationModal, java.lang.String str, com.paypal.oslo.core.i18n.domain.model.Address address, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = showAddressValidationModal.failedAddressText;
            }
            if ((i & 2) != 0) {
                address = showAddressValidationModal.failedAddress;
            }
            return showAddressValidationModal.copy(str, address);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiEffect$ShowAddressSavedToast;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiEffect;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "text", "<init>", "(Lcom/paypal/oslo/core/commonui/utils/RefText;)V", "component1", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "copy", "(Lcom/paypal/oslo/core/commonui/utils/RefText;)Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiEffect$ShowAddressSavedToast;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getText"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowAddressSavedToast extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect {
        public static final int $stable = com.paypal.oslo.core.commonui.utils.RefText.$stable;
        private final com.paypal.oslo.core.commonui.utils.RefText text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowAddressSavedToast(com.paypal.oslo.core.commonui.utils.RefText refText) {
            super("ShowAddressSavedToast", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText, "");
            this.text = refText;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getText() {
            return this.text;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.commonui.utils.RefText refText = this.text;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowAddressSavedToast(text=");
            sb.append(refText);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.text.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.ShowAddressSavedToast) && kotlin.jvm.internal.Intrinsics.areEqual(this.text, ((com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.ShowAddressSavedToast) other).text);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.ShowAddressSavedToast copy(com.paypal.oslo.core.commonui.utils.RefText text) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.ShowAddressSavedToast(text);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getText() {
            return this.text;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.ShowAddressSavedToast copy$default(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.ShowAddressSavedToast showAddressSavedToast, com.paypal.oslo.core.commonui.utils.RefText refText, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                refText = showAddressSavedToast.text;
            }
            return showAddressSavedToast.copy(refText);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiEffect$ScrollToFirstError;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiEffect;", "", "scrollKey", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiEffect$ScrollToFirstError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getScrollKey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ScrollToFirstError extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect {
        public static final int $stable = 0;
        private final java.lang.String scrollKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ScrollToFirstError(java.lang.String str) {
            super("ScrollToFirstError", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.scrollKey = str;
        }

        public final java.lang.String getScrollKey() {
            return this.scrollKey;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.scrollKey;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ScrollToFirstError(scrollKey=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.scrollKey.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.ScrollToFirstError) && kotlin.jvm.internal.Intrinsics.areEqual(this.scrollKey, ((com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.ScrollToFirstError) other).scrollKey);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.ScrollToFirstError copy(java.lang.String scrollKey) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scrollKey, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.ScrollToFirstError(scrollKey);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getScrollKey() {
            return this.scrollKey;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.ScrollToFirstError copy$default(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.ScrollToFirstError scrollToFirstError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = scrollToFirstError.scrollKey;
            }
            return scrollToFirstError.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiEffect$ShowRepaymentBottomSheet;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowRepaymentBottomSheet extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.ShowRepaymentBottomSheet INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.ShowRepaymentBottomSheet();

        public final int hashCode() {
            return -100769191;
        }

        private ShowRepaymentBottomSheet() {
            super("ShowRepaymentBottomSheet", null);
        }

        public final java.lang.String toString() {
            return "ShowRepaymentBottomSheet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.ShowRepaymentBottomSheet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiEffect$DismissRepaymentBottomSheet;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DismissRepaymentBottomSheet extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.DismissRepaymentBottomSheet INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.DismissRepaymentBottomSheet();

        public final int hashCode() {
            return -2032893168;
        }

        private DismissRepaymentBottomSheet() {
            super("DismissRepaymentBottomSheet", null);
        }

        public final java.lang.String toString() {
            return "DismissRepaymentBottomSheet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.DismissRepaymentBottomSheet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiEffect$NavigateToLinkFunding;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiEffect;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/FundingInstrumentType;", "type", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/FundingInstrumentType;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/FundingInstrumentType;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/FundingInstrumentType;)Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoUiEffect$NavigateToLinkFunding;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/FundingInstrumentType;", "getType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToLinkFunding extends com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.bnplacquisition.ui.repayments.FundingInstrumentType type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToLinkFunding(com.paypal.oslo.feature.bnplacquisition.ui.repayments.FundingInstrumentType fundingInstrumentType) {
            super("NavigateToLinkFunding", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentType, "");
            this.type = fundingInstrumentType;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.repayments.FundingInstrumentType getType() {
            return this.type;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.ui.repayments.FundingInstrumentType fundingInstrumentType = this.type;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToLinkFunding(type=");
            sb.append(fundingInstrumentType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.type.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.NavigateToLinkFunding) && this.type == ((com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.NavigateToLinkFunding) other).type;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.NavigateToLinkFunding copy(com.paypal.oslo.feature.bnplacquisition.ui.repayments.FundingInstrumentType type) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.NavigateToLinkFunding(type);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.repayments.FundingInstrumentType getType() {
            return this.type;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.NavigateToLinkFunding copy$default(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiEffect.NavigateToLinkFunding navigateToLinkFunding, com.paypal.oslo.feature.bnplacquisition.ui.repayments.FundingInstrumentType fundingInstrumentType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                fundingInstrumentType = navigateToLinkFunding.type;
            }
            return navigateToLinkFunding.copy(fundingInstrumentType);
        }
    }

    public /* synthetic */ PersonalInfoUiEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
