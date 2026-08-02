package com.paypal.oslo.feature.bnplacquisition.ui.reviewplan;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0012\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0012\u001c\u001d\u001e\u001f !\"#$%&'()*+,-"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "LoadDomainData", "Success", "ApplyButtonPressed", "AgreementLinkPressed", "ClosePressed", "ConfirmExitPressed", "SubmitApplicationSuccess", "SubmitApplicationError", "SubmitApplicationDecline", "ErrorBackPressed", "NFCProvisioningRemoveCardsSuccess", "NFCProvisioningUpdateError", "NFCProvisioningRetryPressed", "NFCProvisioningErrorClosed", "NFCProvisioningGoToMyCardPressed", "TokenizationCompleted", "TokenizationCancelled", "TokenizationFailed", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent$AgreementLinkPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent$ApplyButtonPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent$ClosePressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent$ConfirmExitPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent$ErrorBackPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent$LoadDomainData;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent$NFCProvisioningErrorClosed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent$NFCProvisioningGoToMyCardPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent$NFCProvisioningRemoveCardsSuccess;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent$NFCProvisioningRetryPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent$NFCProvisioningUpdateError;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent$SubmitApplicationDecline;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent$SubmitApplicationError;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent$SubmitApplicationSuccess;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent$Success;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent$TokenizationCancelled;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent$TokenizationCompleted;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent$TokenizationFailed;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class ReviewPlanEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private ReviewPlanEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent$LoadDomainData;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/reviewplan/ReviewPlanDetailsSuccess;", "reviewPlanData", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/reviewplan/ReviewPlanDetailsSuccess;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/reviewplan/ReviewPlanDetailsSuccess;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/reviewplan/ReviewPlanDetailsSuccess;)Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent$LoadDomainData;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/reviewplan/ReviewPlanDetailsSuccess;", "getReviewPlanData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoadDomainData extends com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.domain.model.reviewplan.ReviewPlanDetailsSuccess reviewPlanData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadDomainData(com.paypal.oslo.feature.bnplacquisition.domain.model.reviewplan.ReviewPlanDetailsSuccess reviewPlanDetailsSuccess) {
            super("LoadDomainData", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewPlanDetailsSuccess, "");
            this.reviewPlanData = reviewPlanDetailsSuccess;
        }

        public final com.paypal.oslo.feature.bnplacquisition.domain.model.reviewplan.ReviewPlanDetailsSuccess getReviewPlanData() {
            return this.reviewPlanData;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.domain.model.reviewplan.ReviewPlanDetailsSuccess reviewPlanDetailsSuccess = this.reviewPlanData;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LoadDomainData(reviewPlanData=");
            sb.append(reviewPlanDetailsSuccess);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.reviewPlanData.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.LoadDomainData) && kotlin.jvm.internal.Intrinsics.areEqual(this.reviewPlanData, ((com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.LoadDomainData) other).reviewPlanData);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.LoadDomainData copy(com.paypal.oslo.feature.bnplacquisition.domain.model.reviewplan.ReviewPlanDetailsSuccess reviewPlanData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewPlanData, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.LoadDomainData(reviewPlanData);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.domain.model.reviewplan.ReviewPlanDetailsSuccess getReviewPlanData() {
            return this.reviewPlanData;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.LoadDomainData copy$default(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.LoadDomainData loadDomainData, com.paypal.oslo.feature.bnplacquisition.domain.model.reviewplan.ReviewPlanDetailsSuccess reviewPlanDetailsSuccess, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                reviewPlanDetailsSuccess = loadDomainData.reviewPlanData;
            }
            return loadDomainData.copy(reviewPlanDetailsSuccess);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent$Success;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanUiModel;", "uiModel", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanUiModel;)Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanUiModel;", "getUiModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiModel reviewPlanUiModel) {
            super("Success", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewPlanUiModel, "");
            this.uiModel = reviewPlanUiModel;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiModel getUiModel() {
            return this.uiModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiModel reviewPlanUiModel = this.uiModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(uiModel=");
            sb.append(reviewPlanUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.uiModel.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.Success) && kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, ((com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.Success) other).uiModel);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.Success copy(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiModel uiModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.Success(uiModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiModel getUiModel() {
            return this.uiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.Success copy$default(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.Success success, com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiModel reviewPlanUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                reviewPlanUiModel = success.uiModel;
            }
            return success.copy(reviewPlanUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent$ApplyButtonPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ApplyButtonPressed extends com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.ApplyButtonPressed INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.ApplyButtonPressed();

        public final int hashCode() {
            return 964783620;
        }

        private ApplyButtonPressed() {
            super("ApplyButtonPressed", null);
        }

        public final java.lang.String toString() {
            return "ApplyButtonPressed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.ApplyButtonPressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent$AgreementLinkPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent;", "", "url", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent$AgreementLinkPressed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AgreementLinkPressed extends com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent {
        public static final int $stable = 0;
        private final java.lang.String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AgreementLinkPressed(java.lang.String str) {
            super("AgreementLinkPressed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AgreementLinkPressed(url=");
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
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.AgreementLinkPressed) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.AgreementLinkPressed) other).url);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.AgreementLinkPressed copy(java.lang.String url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.AgreementLinkPressed(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.AgreementLinkPressed copy$default(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.AgreementLinkPressed agreementLinkPressed, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = agreementLinkPressed.url;
            }
            return agreementLinkPressed.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent$ClosePressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ClosePressed extends com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.ClosePressed INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.ClosePressed();

        public final int hashCode() {
            return 710203084;
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
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.ClosePressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent$ConfirmExitPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ConfirmExitPressed extends com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.ConfirmExitPressed INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.ConfirmExitPressed();

        public final int hashCode() {
            return 1638921350;
        }

        private ConfirmExitPressed() {
            super("ConfirmExitPressed", null);
        }

        public final java.lang.String toString() {
            return "ConfirmExitPressed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.ConfirmExitPressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent$SubmitApplicationSuccess;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/SubmitVirtualCardApplicationDetailsSuccess;", "submitApplication", "", "correlationId", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/SubmitVirtualCardApplicationDetailsSuccess;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/SubmitVirtualCardApplicationDetailsSuccess;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/SubmitVirtualCardApplicationDetailsSuccess;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent$SubmitApplicationSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/SubmitVirtualCardApplicationDetailsSuccess;", "getSubmitApplication", "Ljava/lang/String;", "getCorrelationId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SubmitApplicationSuccess extends com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent {
        public static final int $stable = 0;
        private final java.lang.String correlationId;
        private final com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetailsSuccess submitApplication;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SubmitApplicationSuccess(com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetailsSuccess submitVirtualCardApplicationDetailsSuccess, java.lang.String str) {
            super("SubmitApplicationSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(submitVirtualCardApplicationDetailsSuccess, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.submitApplication = submitVirtualCardApplicationDetailsSuccess;
            this.correlationId = str;
        }

        public final com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetailsSuccess getSubmitApplication() {
            return this.submitApplication;
        }

        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetailsSuccess submitVirtualCardApplicationDetailsSuccess = this.submitApplication;
            java.lang.String str = this.correlationId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SubmitApplicationSuccess(submitApplication=");
            sb.append(submitVirtualCardApplicationDetailsSuccess);
            sb.append(", correlationId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.submitApplication.hashCode() * 31) + this.correlationId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.SubmitApplicationSuccess)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.SubmitApplicationSuccess submitApplicationSuccess = (com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.SubmitApplicationSuccess) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.submitApplication, submitApplicationSuccess.submitApplication) && kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, submitApplicationSuccess.correlationId);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.SubmitApplicationSuccess copy(com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetailsSuccess submitApplication, java.lang.String correlationId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(submitApplication, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(correlationId, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.SubmitApplicationSuccess(submitApplication, correlationId);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetailsSuccess getSubmitApplication() {
            return this.submitApplication;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.SubmitApplicationSuccess copy$default(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.SubmitApplicationSuccess submitApplicationSuccess, com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetailsSuccess submitVirtualCardApplicationDetailsSuccess, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                submitVirtualCardApplicationDetailsSuccess = submitApplicationSuccess.submitApplication;
            }
            if ((i & 2) != 0) {
                str = submitApplicationSuccess.correlationId;
            }
            return submitApplicationSuccess.copy(submitVirtualCardApplicationDetailsSuccess, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent$SubmitApplicationError;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "errorContent", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;)Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent$SubmitApplicationError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "getErrorContent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SubmitApplicationError extends com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel errorContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SubmitApplicationError(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel) {
            super("SubmitApplicationError", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullscreenErrorUiModel, "");
            this.errorContent = fullscreenErrorUiModel;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel getErrorContent() {
            return this.errorContent;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel = this.errorContent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SubmitApplicationError(errorContent=");
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
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.SubmitApplicationError) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorContent, ((com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.SubmitApplicationError) other).errorContent);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.SubmitApplicationError copy(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel errorContent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorContent, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.SubmitApplicationError(errorContent);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel getErrorContent() {
            return this.errorContent;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.SubmitApplicationError copy$default(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.SubmitApplicationError submitApplicationError, com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                fullscreenErrorUiModel = submitApplicationError.errorContent;
            }
            return submitApplicationError.copy(fullscreenErrorUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent$SubmitApplicationDecline;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "declineContent", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;)Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent$SubmitApplicationDecline;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "getDeclineContent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SubmitApplicationDecline extends com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel declineContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SubmitApplicationDecline(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel) {
            super("SubmitApplicationDecline", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullscreenErrorUiModel, "");
            this.declineContent = fullscreenErrorUiModel;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel getDeclineContent() {
            return this.declineContent;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel = this.declineContent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SubmitApplicationDecline(declineContent=");
            sb.append(fullscreenErrorUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.declineContent.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.SubmitApplicationDecline) && kotlin.jvm.internal.Intrinsics.areEqual(this.declineContent, ((com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.SubmitApplicationDecline) other).declineContent);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.SubmitApplicationDecline copy(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel declineContent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declineContent, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.SubmitApplicationDecline(declineContent);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel getDeclineContent() {
            return this.declineContent;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.SubmitApplicationDecline copy$default(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.SubmitApplicationDecline submitApplicationDecline, com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                fullscreenErrorUiModel = submitApplicationDecline.declineContent;
            }
            return submitApplicationDecline.copy(fullscreenErrorUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent$ErrorBackPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ErrorBackPressed extends com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.ErrorBackPressed INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.ErrorBackPressed();

        public final int hashCode() {
            return -149691179;
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
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.ErrorBackPressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent$NFCProvisioningRemoveCardsSuccess;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NFCProvisioningRemoveCardsSuccess extends com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.NFCProvisioningRemoveCardsSuccess INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.NFCProvisioningRemoveCardsSuccess();

        public final int hashCode() {
            return -2134505062;
        }

        private NFCProvisioningRemoveCardsSuccess() {
            super("NFCProvisioningRemoveCardsSuccess", null);
        }

        public final java.lang.String toString() {
            return "NFCProvisioningRemoveCardsSuccess";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.NFCProvisioningRemoveCardsSuccess)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0011J\u0010\u0010\u001c\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent$NFCProvisioningUpdateError;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "errorContent", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorType;", "errorType", "", "retryCount", "", "creditAccountId", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorType;ILjava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorType;", "component3", "()I", "component4", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorType;ILjava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent$NFCProvisioningUpdateError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "getErrorContent", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorType;", "getErrorType", com.visa.cbp.getEncExpo.warmup, "getRetryCount", "Ljava/lang/String;", "getCreditAccountId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NFCProvisioningUpdateError extends com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent {
        public static final int $stable = 0;
        private final java.lang.String creditAccountId;
        private final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel errorContent;
        private final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType errorType;
        private final int retryCount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NFCProvisioningUpdateError(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel, com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType fullscreenErrorType, int i, java.lang.String str) {
            super("NFCProvisioningUpdateError", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullscreenErrorUiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullscreenErrorType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.errorContent = fullscreenErrorUiModel;
            this.errorType = fullscreenErrorType;
            this.retryCount = i;
            this.creditAccountId = str;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel getErrorContent() {
            return this.errorContent;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType getErrorType() {
            return this.errorType;
        }

        public final int getRetryCount() {
            return this.retryCount;
        }

        public /* synthetic */ NFCProvisioningUpdateError(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel, com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType fullscreenErrorType, int i, java.lang.String str, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(fullscreenErrorUiModel, fullscreenErrorType, i, (i2 & 8) != 0 ? "" : str);
        }

        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel = this.errorContent;
            com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType fullscreenErrorType = this.errorType;
            int i = this.retryCount;
            java.lang.String str = this.creditAccountId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NFCProvisioningUpdateError(errorContent=");
            sb.append(fullscreenErrorUiModel);
            sb.append(", errorType=");
            sb.append(fullscreenErrorType);
            sb.append(", retryCount=");
            sb.append(i);
            sb.append(", creditAccountId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.errorContent.hashCode() * 31) + this.errorType.hashCode()) * 31) + java.lang.Integer.hashCode(this.retryCount)) * 31) + this.creditAccountId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.NFCProvisioningUpdateError)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.NFCProvisioningUpdateError nFCProvisioningUpdateError = (com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.NFCProvisioningUpdateError) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.errorContent, nFCProvisioningUpdateError.errorContent) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorType, nFCProvisioningUpdateError.errorType) && this.retryCount == nFCProvisioningUpdateError.retryCount && kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, nFCProvisioningUpdateError.creditAccountId);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.NFCProvisioningUpdateError copy(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel errorContent, com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType errorType, int retryCount, java.lang.String creditAccountId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorContent, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.NFCProvisioningUpdateError(errorContent, errorType, retryCount, creditAccountId);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        /* renamed from: component3, reason: from getter */
        public final int getRetryCount() {
            return this.retryCount;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType getErrorType() {
            return this.errorType;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel getErrorContent() {
            return this.errorContent;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.NFCProvisioningUpdateError copy$default(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.NFCProvisioningUpdateError nFCProvisioningUpdateError, com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel, com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType fullscreenErrorType, int i, java.lang.String str, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                fullscreenErrorUiModel = nFCProvisioningUpdateError.errorContent;
            }
            if ((i2 & 2) != 0) {
                fullscreenErrorType = nFCProvisioningUpdateError.errorType;
            }
            if ((i2 & 4) != 0) {
                i = nFCProvisioningUpdateError.retryCount;
            }
            if ((i2 & 8) != 0) {
                str = nFCProvisioningUpdateError.creditAccountId;
            }
            return nFCProvisioningUpdateError.copy(fullscreenErrorUiModel, fullscreenErrorType, i, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent$NFCProvisioningRetryPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NFCProvisioningRetryPressed extends com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.NFCProvisioningRetryPressed INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.NFCProvisioningRetryPressed();

        public final int hashCode() {
            return 1953391792;
        }

        private NFCProvisioningRetryPressed() {
            super("NFCProvisioningRetryPressed", null);
        }

        public final java.lang.String toString() {
            return "NFCProvisioningRetryPressed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.NFCProvisioningRetryPressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent$NFCProvisioningErrorClosed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NFCProvisioningErrorClosed extends com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.NFCProvisioningErrorClosed INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.NFCProvisioningErrorClosed();

        public final int hashCode() {
            return 611616382;
        }

        private NFCProvisioningErrorClosed() {
            super("NFCProvisioningErrorClosed", null);
        }

        public final java.lang.String toString() {
            return "NFCProvisioningErrorClosed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.NFCProvisioningErrorClosed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent$NFCProvisioningGoToMyCardPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NFCProvisioningGoToMyCardPressed extends com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.NFCProvisioningGoToMyCardPressed INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.NFCProvisioningGoToMyCardPressed();

        public final int hashCode() {
            return -1698659763;
        }

        private NFCProvisioningGoToMyCardPressed() {
            super("NFCProvisioningGoToMyCardPressed", null);
        }

        public final java.lang.String toString() {
            return "NFCProvisioningGoToMyCardPressed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.NFCProvisioningGoToMyCardPressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0003\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent$TokenizationCompleted;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent;", "", "isTapToPayPayMode", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent$TokenizationCompleted;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TokenizationCompleted extends com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent {
        public static final int $stable = 0;
        private final boolean isTapToPayPayMode;

        public TokenizationCompleted(boolean z) {
            super("TokenizationCompleted", null);
            this.isTapToPayPayMode = z;
        }

        public final boolean isTapToPayPayMode() {
            return this.isTapToPayPayMode;
        }

        public final java.lang.String toString() {
            boolean z = this.isTapToPayPayMode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TokenizationCompleted(isTapToPayPayMode=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.isTapToPayPayMode);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.TokenizationCompleted) && this.isTapToPayPayMode == ((com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.TokenizationCompleted) other).isTapToPayPayMode;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.TokenizationCompleted copy(boolean isTapToPayPayMode) {
            return new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.TokenizationCompleted(isTapToPayPayMode);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsTapToPayPayMode() {
            return this.isTapToPayPayMode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.TokenizationCompleted copy$default(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.TokenizationCompleted tokenizationCompleted, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = tokenizationCompleted.isTapToPayPayMode;
            }
            return tokenizationCompleted.copy(z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0003\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent$TokenizationCancelled;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent;", "", "isTapToPayPayMode", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent$TokenizationCancelled;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TokenizationCancelled extends com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent {
        public static final int $stable = 0;
        private final boolean isTapToPayPayMode;

        public TokenizationCancelled(boolean z) {
            super("TokenizationCancelled", null);
            this.isTapToPayPayMode = z;
        }

        public final boolean isTapToPayPayMode() {
            return this.isTapToPayPayMode;
        }

        public final java.lang.String toString() {
            boolean z = this.isTapToPayPayMode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TokenizationCancelled(isTapToPayPayMode=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.isTapToPayPayMode);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.TokenizationCancelled) && this.isTapToPayPayMode == ((com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.TokenizationCancelled) other).isTapToPayPayMode;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.TokenizationCancelled copy(boolean isTapToPayPayMode) {
            return new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.TokenizationCancelled(isTapToPayPayMode);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsTapToPayPayMode() {
            return this.isTapToPayPayMode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.TokenizationCancelled copy$default(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.TokenizationCancelled tokenizationCancelled, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = tokenizationCancelled.isTapToPayPayMode;
            }
            return tokenizationCancelled.copy(z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0005\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent$TokenizationFailed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent;", "", "error", "", "isTapToPayPayMode", "<init>", "(Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent$TokenizationFailed;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getError", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TokenizationFailed extends com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent {
        public static final int $stable = 0;
        private final java.lang.String error;
        private final boolean isTapToPayPayMode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TokenizationFailed(java.lang.String str, boolean z) {
            super("TokenizationFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.error = str;
            this.isTapToPayPayMode = z;
        }

        public final java.lang.String getError() {
            return this.error;
        }

        public final boolean isTapToPayPayMode() {
            return this.isTapToPayPayMode;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.error;
            boolean z = this.isTapToPayPayMode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TokenizationFailed(error=");
            sb.append(str);
            sb.append(", isTapToPayPayMode=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.error.hashCode() * 31) + java.lang.Boolean.hashCode(this.isTapToPayPayMode);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.TokenizationFailed)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.TokenizationFailed tokenizationFailed = (com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.TokenizationFailed) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.error, tokenizationFailed.error) && this.isTapToPayPayMode == tokenizationFailed.isTapToPayPayMode;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.TokenizationFailed copy(java.lang.String error, boolean isTapToPayPayMode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.TokenizationFailed(error, isTapToPayPayMode);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsTapToPayPayMode() {
            return this.isTapToPayPayMode;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.TokenizationFailed copy$default(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.TokenizationFailed tokenizationFailed, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = tokenizationFailed.error;
            }
            if ((i & 2) != 0) {
                z = tokenizationFailed.isTapToPayPayMode;
            }
            return tokenizationFailed.copy(str, z);
        }
    }

    public /* synthetic */ ReviewPlanEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
