package com.paypal.oslo.feature.bnplacquisition.ui.reviewterms;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0010\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0010\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "LoadDomainModel", "DomainModelLoaded", "AgreementClicked", "DownloadDocumentPressed", "DisclaimerLinkPressed", "OpenContentViewer", "Continue", "UpdateRepaymentsSuccess", "UpdateError", "ApplicationDeclined", "ErrorBackPressed", "DeclineClosePressed", "NavigateBack", "ClosePressed", "ConfirmExitPressed", "SwitchToSuccess", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent$AgreementClicked;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent$ApplicationDeclined;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent$ClosePressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent$ConfirmExitPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent$Continue;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent$DeclineClosePressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent$DisclaimerLinkPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent$DomainModelLoaded;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent$DownloadDocumentPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent$ErrorBackPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent$LoadDomainModel;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent$NavigateBack;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent$OpenContentViewer;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent$SwitchToSuccess;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent$UpdateError;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent$UpdateRepaymentsSuccess;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class ReviewTermsEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private ReviewTermsEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent$LoadDomainModel;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/reviewterms/ReviewTermsSuccess;", "domainModel", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/reviewterms/ReviewTermsSuccess;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/reviewterms/ReviewTermsSuccess;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/reviewterms/ReviewTermsSuccess;)Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent$LoadDomainModel;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/reviewterms/ReviewTermsSuccess;", "getDomainModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoadDomainModel extends com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.domain.model.reviewterms.ReviewTermsSuccess domainModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadDomainModel(com.paypal.oslo.feature.bnplacquisition.domain.model.reviewterms.ReviewTermsSuccess reviewTermsSuccess) {
            super("LoadDomainModel", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewTermsSuccess, "");
            this.domainModel = reviewTermsSuccess;
        }

        public final com.paypal.oslo.feature.bnplacquisition.domain.model.reviewterms.ReviewTermsSuccess getDomainModel() {
            return this.domainModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.domain.model.reviewterms.ReviewTermsSuccess reviewTermsSuccess = this.domainModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LoadDomainModel(domainModel=");
            sb.append(reviewTermsSuccess);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.domainModel.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.LoadDomainModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.domainModel, ((com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.LoadDomainModel) other).domainModel);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.LoadDomainModel copy(com.paypal.oslo.feature.bnplacquisition.domain.model.reviewterms.ReviewTermsSuccess domainModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(domainModel, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.LoadDomainModel(domainModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.domain.model.reviewterms.ReviewTermsSuccess getDomainModel() {
            return this.domainModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.LoadDomainModel copy$default(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.LoadDomainModel loadDomainModel, com.paypal.oslo.feature.bnplacquisition.domain.model.reviewterms.ReviewTermsSuccess reviewTermsSuccess, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                reviewTermsSuccess = loadDomainModel.domainModel;
            }
            return loadDomainModel.copy(reviewTermsSuccess);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent$DomainModelLoaded;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiModel;", "uiModel", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiModel;)Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent$DomainModelLoaded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiModel;", "getUiModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DomainModelLoaded extends com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DomainModelLoaded(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiModel reviewTermsUiModel) {
            super("DomainModelLoaded", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewTermsUiModel, "");
            this.uiModel = reviewTermsUiModel;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiModel getUiModel() {
            return this.uiModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiModel reviewTermsUiModel = this.uiModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DomainModelLoaded(uiModel=");
            sb.append(reviewTermsUiModel);
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
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.DomainModelLoaded) && kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, ((com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.DomainModelLoaded) other).uiModel);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.DomainModelLoaded copy(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiModel uiModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.DomainModelLoaded(uiModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiModel getUiModel() {
            return this.uiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.DomainModelLoaded copy$default(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.DomainModelLoaded domainModelLoaded, com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiModel reviewTermsUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                reviewTermsUiModel = domainModelLoaded.uiModel;
            }
            return domainModelLoaded.copy(reviewTermsUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0003\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent$AgreementClicked;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent;", "", "isChecked", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent$AgreementClicked;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AgreementClicked extends com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent {
        public static final int $stable = 0;
        private final boolean isChecked;

        public AgreementClicked(boolean z) {
            super("AgreementClicked", null);
            this.isChecked = z;
        }

        public final boolean isChecked() {
            return this.isChecked;
        }

        public final java.lang.String toString() {
            boolean z = this.isChecked;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AgreementClicked(isChecked=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.isChecked);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.AgreementClicked) && this.isChecked == ((com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.AgreementClicked) other).isChecked;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.AgreementClicked copy(boolean isChecked) {
            return new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.AgreementClicked(isChecked);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsChecked() {
            return this.isChecked;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.AgreementClicked copy$default(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.AgreementClicked agreementClicked, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = agreementClicked.isChecked;
            }
            return agreementClicked.copy(z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent$DownloadDocumentPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DownloadDocumentPressed extends com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.DownloadDocumentPressed INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.DownloadDocumentPressed();

        public final int hashCode() {
            return 140555451;
        }

        private DownloadDocumentPressed() {
            super("DownloadDocumentPressed", null);
        }

        public final java.lang.String toString() {
            return "DownloadDocumentPressed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.DownloadDocumentPressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent$DisclaimerLinkPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent;", "", "tag", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent$DisclaimerLinkPressed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTag"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DisclaimerLinkPressed extends com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent {
        public static final int $stable = 0;
        private final java.lang.String tag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DisclaimerLinkPressed(java.lang.String str) {
            super("DisclaimerLinkPressed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.tag = str;
        }

        public final java.lang.String getTag() {
            return this.tag;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.tag;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DisclaimerLinkPressed(tag=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.tag.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.DisclaimerLinkPressed) && kotlin.jvm.internal.Intrinsics.areEqual(this.tag, ((com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.DisclaimerLinkPressed) other).tag);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.DisclaimerLinkPressed copy(java.lang.String tag) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.DisclaimerLinkPressed(tag);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getTag() {
            return this.tag;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.DisclaimerLinkPressed copy$default(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.DisclaimerLinkPressed disclaimerLinkPressed, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = disclaimerLinkPressed.tag;
            }
            return disclaimerLinkPressed.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJJ\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001e\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001f\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b \u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent$OpenContentViewer;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent;", "", "url", "html", "downloadStaticUrl", "downloadRelativePath", "downloadFileName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent$OpenContentViewer;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl", "getHtml", "getDownloadStaticUrl", "getDownloadRelativePath", "getDownloadFileName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OpenContentViewer extends com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent {
        public static final int $stable = 0;
        private final java.lang.String downloadFileName;
        private final java.lang.String downloadRelativePath;
        private final java.lang.String downloadStaticUrl;
        private final java.lang.String html;
        private final java.lang.String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenContentViewer(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
            super("OpenContentViewer", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
            this.html = str2;
            this.downloadStaticUrl = str3;
            this.downloadRelativePath = str4;
            this.downloadFileName = str5;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String getHtml() {
            return this.html;
        }

        public final java.lang.String getDownloadStaticUrl() {
            return this.downloadStaticUrl;
        }

        public final java.lang.String getDownloadRelativePath() {
            return this.downloadRelativePath;
        }

        public final java.lang.String getDownloadFileName() {
            return this.downloadFileName;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.String str2 = this.html;
            java.lang.String str3 = this.downloadStaticUrl;
            java.lang.String str4 = this.downloadRelativePath;
            java.lang.String str5 = this.downloadFileName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OpenContentViewer(url=");
            sb.append(str);
            sb.append(", html=");
            sb.append(str2);
            sb.append(", downloadStaticUrl=");
            sb.append(str3);
            sb.append(", downloadRelativePath=");
            sb.append(str4);
            sb.append(", downloadFileName=");
            sb.append(str5);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.url.hashCode();
            java.lang.String str = this.html;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.downloadStaticUrl;
            int hashCode3 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.downloadRelativePath;
            int hashCode4 = str3 == null ? 0 : str3.hashCode();
            java.lang.String str4 = this.downloadFileName;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str4 != null ? str4.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.OpenContentViewer)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.OpenContentViewer openContentViewer = (com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.OpenContentViewer) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.url, openContentViewer.url) && kotlin.jvm.internal.Intrinsics.areEqual(this.html, openContentViewer.html) && kotlin.jvm.internal.Intrinsics.areEqual(this.downloadStaticUrl, openContentViewer.downloadStaticUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.downloadRelativePath, openContentViewer.downloadRelativePath) && kotlin.jvm.internal.Intrinsics.areEqual(this.downloadFileName, openContentViewer.downloadFileName);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.OpenContentViewer copy(java.lang.String url, java.lang.String html, java.lang.String downloadStaticUrl, java.lang.String downloadRelativePath, java.lang.String downloadFileName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.OpenContentViewer(url, html, downloadStaticUrl, downloadRelativePath, downloadFileName);
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getDownloadFileName() {
            return this.downloadFileName;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getDownloadRelativePath() {
            return this.downloadRelativePath;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getDownloadStaticUrl() {
            return this.downloadStaticUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getHtml() {
            return this.html;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.OpenContentViewer copy$default(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.OpenContentViewer openContentViewer, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = openContentViewer.url;
            }
            if ((i & 2) != 0) {
                str2 = openContentViewer.html;
            }
            java.lang.String str6 = str2;
            if ((i & 4) != 0) {
                str3 = openContentViewer.downloadStaticUrl;
            }
            java.lang.String str7 = str3;
            if ((i & 8) != 0) {
                str4 = openContentViewer.downloadRelativePath;
            }
            java.lang.String str8 = str4;
            if ((i & 16) != 0) {
                str5 = openContentViewer.downloadFileName;
            }
            return openContentViewer.copy(str, str6, str7, str8, str5);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent$Continue;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent;", "", "p0", "<init>", "(Ljava/lang/String;)V", "Pressed", "Valid", "Invalid", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent$Continue$Invalid;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent$Continue$Pressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent$Continue$Valid;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Continue extends com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent {
        public static final int $stable = 0;

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent$Continue$Pressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent$Continue;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Pressed extends com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.Continue {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.Continue.Pressed INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.Continue.Pressed();

            public final int hashCode() {
                return -907218593;
            }

            private Pressed() {
                super("ContinuePressed", null);
            }

            public final java.lang.String toString() {
                return "Pressed";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.Continue.Pressed)) {
                    return false;
                }
                return true;
            }
        }

        private Continue(java.lang.String str) {
            super(str, null);
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent$Continue$Valid;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent$Continue;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Valid extends com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.Continue {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.Continue.Valid INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.Continue.Valid();

            public final int hashCode() {
                return -1515454343;
            }

            private Valid() {
                super("ContinueValid", null);
            }

            public final java.lang.String toString() {
                return "Valid";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.Continue.Valid)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent$Continue$Invalid;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent$Continue;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Invalid extends com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.Continue {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.Continue.Invalid INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.Continue.Invalid();

            public final int hashCode() {
                return 1370830644;
            }

            private Invalid() {
                super("ContinueInvalid", null);
            }

            public final java.lang.String toString() {
                return "Invalid";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.Continue.Invalid)) {
                    return false;
                }
                return true;
            }
        }

        public /* synthetic */ Continue(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent$UpdateRepaymentsSuccess;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/repayments/RepaymentsSuccess;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/repayments/RepaymentsSuccess;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/repayments/RepaymentsSuccess;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/repayments/RepaymentsSuccess;)Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent$UpdateRepaymentsSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/repayments/RepaymentsSuccess;", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpdateRepaymentsSuccess extends com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.RepaymentsSuccess data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateRepaymentsSuccess(com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.RepaymentsSuccess repaymentsSuccess) {
            super("UpdateRepaymentsSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(repaymentsSuccess, "");
            this.data = repaymentsSuccess;
        }

        public final com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.RepaymentsSuccess getData() {
            return this.data;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.RepaymentsSuccess repaymentsSuccess = this.data;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateRepaymentsSuccess(data=");
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
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.UpdateRepaymentsSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.UpdateRepaymentsSuccess) other).data);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.UpdateRepaymentsSuccess copy(com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.RepaymentsSuccess data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.UpdateRepaymentsSuccess(data);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.RepaymentsSuccess getData() {
            return this.data;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.UpdateRepaymentsSuccess copy$default(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.UpdateRepaymentsSuccess updateRepaymentsSuccess, com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.RepaymentsSuccess repaymentsSuccess, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                repaymentsSuccess = updateRepaymentsSuccess.data;
            }
            return updateRepaymentsSuccess.copy(repaymentsSuccess);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent$UpdateError;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "errorContent", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;)Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent$UpdateError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "getErrorContent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpdateError extends com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel errorContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateError(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel) {
            super("UpdateError", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullscreenErrorUiModel, "");
            this.errorContent = fullscreenErrorUiModel;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel getErrorContent() {
            return this.errorContent;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel = this.errorContent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateError(errorContent=");
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
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.UpdateError) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorContent, ((com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.UpdateError) other).errorContent);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.UpdateError copy(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel errorContent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorContent, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.UpdateError(errorContent);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel getErrorContent() {
            return this.errorContent;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.UpdateError copy$default(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.UpdateError updateError, com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                fullscreenErrorUiModel = updateError.errorContent;
            }
            return updateError.copy(fullscreenErrorUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent$ApplicationDeclined;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "declineContent", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;)Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent$ApplicationDeclined;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "getDeclineContent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ApplicationDeclined extends com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel declineContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ApplicationDeclined(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel) {
            super("ApplicationDeclined", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullscreenErrorUiModel, "");
            this.declineContent = fullscreenErrorUiModel;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel getDeclineContent() {
            return this.declineContent;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel = this.declineContent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ApplicationDeclined(declineContent=");
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
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.ApplicationDeclined) && kotlin.jvm.internal.Intrinsics.areEqual(this.declineContent, ((com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.ApplicationDeclined) other).declineContent);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.ApplicationDeclined copy(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel declineContent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declineContent, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.ApplicationDeclined(declineContent);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel getDeclineContent() {
            return this.declineContent;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.ApplicationDeclined copy$default(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.ApplicationDeclined applicationDeclined, com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                fullscreenErrorUiModel = applicationDeclined.declineContent;
            }
            return applicationDeclined.copy(fullscreenErrorUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent$ErrorBackPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ErrorBackPressed extends com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.ErrorBackPressed INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.ErrorBackPressed();

        public final int hashCode() {
            return -1445132873;
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
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.ErrorBackPressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent$DeclineClosePressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DeclineClosePressed extends com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.DeclineClosePressed INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.DeclineClosePressed();

        public final int hashCode() {
            return -167355652;
        }

        private DeclineClosePressed() {
            super("DeclineClosePressed", null);
        }

        public final java.lang.String toString() {
            return "DeclineClosePressed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.DeclineClosePressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent$NavigateBack;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBack extends com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.NavigateBack INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.NavigateBack();

        public final int hashCode() {
            return -292989028;
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
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.NavigateBack)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent$ClosePressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ClosePressed extends com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.ClosePressed INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.ClosePressed();

        public final int hashCode() {
            return -972703570;
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
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.ClosePressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent$ConfirmExitPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ConfirmExitPressed extends com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.ConfirmExitPressed INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.ConfirmExitPressed();

        public final int hashCode() {
            return -2034998040;
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
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.ConfirmExitPressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u0005\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent$SwitchToSuccess;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiModel;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "isAgreed", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiModel;Z)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiModel;", "component2", "()Z", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiModel;Z)Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent$SwitchToSuccess;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiModel;", "getData", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SwitchToSuccess extends com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiModel data;
        private final boolean isAgreed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SwitchToSuccess(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiModel reviewTermsUiModel, boolean z) {
            super("SwitchToSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewTermsUiModel, "");
            this.data = reviewTermsUiModel;
            this.isAgreed = z;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiModel getData() {
            return this.data;
        }

        public final boolean isAgreed() {
            return this.isAgreed;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiModel reviewTermsUiModel = this.data;
            boolean z = this.isAgreed;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SwitchToSuccess(data=");
            sb.append(reviewTermsUiModel);
            sb.append(", isAgreed=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.data.hashCode() * 31) + java.lang.Boolean.hashCode(this.isAgreed);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.SwitchToSuccess)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.SwitchToSuccess switchToSuccess = (com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.SwitchToSuccess) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.data, switchToSuccess.data) && this.isAgreed == switchToSuccess.isAgreed;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.SwitchToSuccess copy(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiModel data, boolean isAgreed) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.SwitchToSuccess(data, isAgreed);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsAgreed() {
            return this.isAgreed;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiModel getData() {
            return this.data;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.SwitchToSuccess copy$default(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent.SwitchToSuccess switchToSuccess, com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiModel reviewTermsUiModel, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                reviewTermsUiModel = switchToSuccess.data;
            }
            if ((i & 2) != 0) {
                z = switchToSuccess.isAgreed;
            }
            return switchToSuccess.copy(reviewTermsUiModel, z);
        }
    }

    public /* synthetic */ ReviewTermsEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
