package com.paypal.oslo.feature.bnplacquisition.ui.repayments;

@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0015\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001eB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0015\u001f !\"#$%&'()*+,-./0123"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "LoadDomainModel", "DomainModelLoaded", "FundingInstrumentSelected", "AgreementClicked", "LinkCardPressed", "DisclaimerLinkPressed", "Continue", "SkipPressed", "ClosePressed", "ConfirmExitPressed", "SubmitCreditApplicationSuccess", "UpdateError", "ApplicationDeclined", "ErrorBackPressed", "DeclineClosePressed", "OnAddFiSuccess", "OnRefreshWithNewFi", "OnNewFiConsumed", "OnFundingInstrumentsReloaded", "OnFundingInstrumentsReloadFailed", "SwitchToSuccess", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent$AgreementClicked;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent$ApplicationDeclined;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent$ClosePressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent$ConfirmExitPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent$Continue;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent$DeclineClosePressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent$DisclaimerLinkPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent$DomainModelLoaded;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent$ErrorBackPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent$FundingInstrumentSelected;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent$LinkCardPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent$LoadDomainModel;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent$OnAddFiSuccess;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent$OnFundingInstrumentsReloadFailed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent$OnFundingInstrumentsReloaded;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent$OnNewFiConsumed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent$OnRefreshWithNewFi;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent$SkipPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent$SubmitCreditApplicationSuccess;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent$SwitchToSuccess;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent$UpdateError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class RepaymentsEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private RepaymentsEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent$LoadDomainModel;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/repayments/RepaymentsSuccess;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/repayments/RepaymentsSuccess;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/repayments/RepaymentsSuccess;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/repayments/RepaymentsSuccess;)Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent$LoadDomainModel;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/repayments/RepaymentsSuccess;", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoadDomainModel extends com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.RepaymentsSuccess data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadDomainModel(com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.RepaymentsSuccess repaymentsSuccess) {
            super("LoadDomainModel", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(repaymentsSuccess, "");
            this.data = repaymentsSuccess;
        }

        public final com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.RepaymentsSuccess getData() {
            return this.data;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.RepaymentsSuccess repaymentsSuccess = this.data;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LoadDomainModel(data=");
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
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.LoadDomainModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.LoadDomainModel) other).data);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.LoadDomainModel copy(com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.RepaymentsSuccess data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.LoadDomainModel(data);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.RepaymentsSuccess getData() {
            return this.data;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.LoadDomainModel copy$default(com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.LoadDomainModel loadDomainModel, com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.RepaymentsSuccess repaymentsSuccess, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                repaymentsSuccess = loadDomainModel.data;
            }
            return loadDomainModel.copy(repaymentsSuccess);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent$DomainModelLoaded;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsUiModel;", "uiModel", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsUiModel;)Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent$DomainModelLoaded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsUiModel;", "getUiModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DomainModelLoaded extends com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DomainModelLoaded(com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiModel repaymentsUiModel) {
            super("DomainModelLoaded", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(repaymentsUiModel, "");
            this.uiModel = repaymentsUiModel;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiModel getUiModel() {
            return this.uiModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiModel repaymentsUiModel = this.uiModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DomainModelLoaded(uiModel=");
            sb.append(repaymentsUiModel);
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
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.DomainModelLoaded) && kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, ((com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.DomainModelLoaded) other).uiModel);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.DomainModelLoaded copy(com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiModel uiModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.DomainModelLoaded(uiModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiModel getUiModel() {
            return this.uiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.DomainModelLoaded copy$default(com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.DomainModelLoaded domainModelLoaded, com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiModel repaymentsUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                repaymentsUiModel = domainModelLoaded.uiModel;
            }
            return domainModelLoaded.copy(repaymentsUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent$FundingInstrumentSelected;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent;", "", "index", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent$FundingInstrumentSelected;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getIndex"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FundingInstrumentSelected extends com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent {
        public static final int $stable = 0;
        private final int index;

        public FundingInstrumentSelected(int i) {
            super("FundingInstrumentSelected", null);
            this.index = i;
        }

        public final int getIndex() {
            return this.index;
        }

        public final java.lang.String toString() {
            int i = this.index;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FundingInstrumentSelected(index=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Integer.hashCode(this.index);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.FundingInstrumentSelected) && this.index == ((com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.FundingInstrumentSelected) other).index;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.FundingInstrumentSelected copy(int index) {
            return new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.FundingInstrumentSelected(index);
        }

        /* renamed from: component1, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.FundingInstrumentSelected copy$default(com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.FundingInstrumentSelected fundingInstrumentSelected, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = fundingInstrumentSelected.index;
            }
            return fundingInstrumentSelected.copy(i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0003\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent$AgreementClicked;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent;", "", "isChecked", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent$AgreementClicked;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AgreementClicked extends com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent {
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
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.AgreementClicked) && this.isChecked == ((com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.AgreementClicked) other).isChecked;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.AgreementClicked copy(boolean isChecked) {
            return new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.AgreementClicked(isChecked);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsChecked() {
            return this.isChecked;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.AgreementClicked copy$default(com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.AgreementClicked agreementClicked, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = agreementClicked.isChecked;
            }
            return agreementClicked.copy(z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent$LinkCardPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LinkCardPressed extends com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.LinkCardPressed INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.LinkCardPressed();

        public final int hashCode() {
            return 2009226518;
        }

        private LinkCardPressed() {
            super("LinkCardPressed", null);
        }

        public final java.lang.String toString() {
            return "LinkCardPressed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.LinkCardPressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent$DisclaimerLinkPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent;", "", "url", "html", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent$DisclaimerLinkPressed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl", "getHtml"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DisclaimerLinkPressed extends com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent {
        public static final int $stable = 0;
        private final java.lang.String html;
        private final java.lang.String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DisclaimerLinkPressed(java.lang.String str, java.lang.String str2) {
            super("DisclaimerLinkPressed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
            this.html = str2;
        }

        public /* synthetic */ DisclaimerLinkPressed(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String getHtml() {
            return this.html;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.String str2 = this.html;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DisclaimerLinkPressed(url=");
            sb.append(str);
            sb.append(", html=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.url.hashCode();
            java.lang.String str = this.html;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.DisclaimerLinkPressed)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.DisclaimerLinkPressed disclaimerLinkPressed = (com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.DisclaimerLinkPressed) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.url, disclaimerLinkPressed.url) && kotlin.jvm.internal.Intrinsics.areEqual(this.html, disclaimerLinkPressed.html);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.DisclaimerLinkPressed copy(java.lang.String url, java.lang.String html) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.DisclaimerLinkPressed(url, html);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getHtml() {
            return this.html;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.DisclaimerLinkPressed copy$default(com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.DisclaimerLinkPressed disclaimerLinkPressed, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = disclaimerLinkPressed.url;
            }
            if ((i & 2) != 0) {
                str2 = disclaimerLinkPressed.html;
            }
            return disclaimerLinkPressed.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent$Continue;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent;", "", "p0", "<init>", "(Ljava/lang/String;)V", "Pressed", "Valid", "Invalid", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent$Continue$Invalid;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent$Continue$Pressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent$Continue$Valid;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Continue extends com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent {
        public static final int $stable = 0;

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent$Continue$Pressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent$Continue;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Pressed extends com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.Continue {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.Continue.Pressed INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.Continue.Pressed();

            public final int hashCode() {
                return 2016586493;
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
                if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.Continue.Pressed)) {
                    return false;
                }
                return true;
            }
        }

        private Continue(java.lang.String str) {
            super(str, null);
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent$Continue$Valid;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent$Continue;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Valid extends com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.Continue {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.Continue.Valid INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.Continue.Valid();

            public final int hashCode() {
                return -2035316329;
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
                if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.Continue.Valid)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent$Continue$Invalid;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent$Continue;", "", "showFundingInstrumentError", "showConsentError", "<init>", "(ZZ)V", "component1", "()Z", "component2", "copy", "(ZZ)Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent$Continue$Invalid;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getShowFundingInstrumentError", "getShowConsentError"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Invalid extends com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.Continue {
            public static final int $stable = 0;
            private final boolean showConsentError;
            private final boolean showFundingInstrumentError;

            public Invalid(boolean z, boolean z2) {
                super("ContinueInvalid", null);
                this.showFundingInstrumentError = z;
                this.showConsentError = z2;
            }

            public /* synthetic */ Invalid(boolean z, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
            }

            public final boolean getShowFundingInstrumentError() {
                return this.showFundingInstrumentError;
            }

            public final boolean getShowConsentError() {
                return this.showConsentError;
            }

            public final java.lang.String toString() {
                boolean z = this.showFundingInstrumentError;
                boolean z2 = this.showConsentError;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid(showFundingInstrumentError=");
                sb.append(z);
                sb.append(", showConsentError=");
                sb.append(z2);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (java.lang.Boolean.hashCode(this.showFundingInstrumentError) * 31) + java.lang.Boolean.hashCode(this.showConsentError);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.Continue.Invalid)) {
                    return false;
                }
                com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.Continue.Invalid invalid = (com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.Continue.Invalid) other;
                return this.showFundingInstrumentError == invalid.showFundingInstrumentError && this.showConsentError == invalid.showConsentError;
            }

            public final com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.Continue.Invalid copy(boolean showFundingInstrumentError, boolean showConsentError) {
                return new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.Continue.Invalid(showFundingInstrumentError, showConsentError);
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getShowConsentError() {
                return this.showConsentError;
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getShowFundingInstrumentError() {
                return this.showFundingInstrumentError;
            }

            public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.Continue.Invalid copy$default(com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.Continue.Invalid invalid, boolean z, boolean z2, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    z = invalid.showFundingInstrumentError;
                }
                if ((i & 2) != 0) {
                    z2 = invalid.showConsentError;
                }
                return invalid.copy(z, z2);
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Invalid() {
                this(r2, r2, 3, null);
                boolean z = false;
            }
        }

        public /* synthetic */ Continue(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent$SkipPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SkipPressed extends com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.SkipPressed INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.SkipPressed();

        public final int hashCode() {
            return -1142292703;
        }

        private SkipPressed() {
            super("SkipPressed", null);
        }

        public final java.lang.String toString() {
            return "SkipPressed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.SkipPressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent$ClosePressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ClosePressed extends com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.ClosePressed INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.ClosePressed();

        public final int hashCode() {
            return -436932276;
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
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.ClosePressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent$ConfirmExitPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ConfirmExitPressed extends com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.ConfirmExitPressed INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.ConfirmExitPressed();

        public final int hashCode() {
            return -1166921978;
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
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.ConfirmExitPressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent$SubmitCreditApplicationSuccess;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/SubmitVirtualCardApplicationDetailsSuccess;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/SubmitVirtualCardApplicationDetailsSuccess;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/SubmitVirtualCardApplicationDetailsSuccess;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/SubmitVirtualCardApplicationDetailsSuccess;)Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent$SubmitCreditApplicationSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/SubmitVirtualCardApplicationDetailsSuccess;", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SubmitCreditApplicationSuccess extends com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetailsSuccess data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SubmitCreditApplicationSuccess(com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetailsSuccess submitVirtualCardApplicationDetailsSuccess) {
            super("SubmitCreditApplicationSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(submitVirtualCardApplicationDetailsSuccess, "");
            this.data = submitVirtualCardApplicationDetailsSuccess;
        }

        public final com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetailsSuccess getData() {
            return this.data;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetailsSuccess submitVirtualCardApplicationDetailsSuccess = this.data;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SubmitCreditApplicationSuccess(data=");
            sb.append(submitVirtualCardApplicationDetailsSuccess);
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
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.SubmitCreditApplicationSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.SubmitCreditApplicationSuccess) other).data);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.SubmitCreditApplicationSuccess copy(com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetailsSuccess data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.SubmitCreditApplicationSuccess(data);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetailsSuccess getData() {
            return this.data;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.SubmitCreditApplicationSuccess copy$default(com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.SubmitCreditApplicationSuccess submitCreditApplicationSuccess, com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetailsSuccess submitVirtualCardApplicationDetailsSuccess, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                submitVirtualCardApplicationDetailsSuccess = submitCreditApplicationSuccess.data;
            }
            return submitCreditApplicationSuccess.copy(submitVirtualCardApplicationDetailsSuccess);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent$UpdateError;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "errorContent", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;)Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent$UpdateError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "getErrorContent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpdateError extends com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent {
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
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.UpdateError) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorContent, ((com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.UpdateError) other).errorContent);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.UpdateError copy(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel errorContent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorContent, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.UpdateError(errorContent);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel getErrorContent() {
            return this.errorContent;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.UpdateError copy$default(com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.UpdateError updateError, com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                fullscreenErrorUiModel = updateError.errorContent;
            }
            return updateError.copy(fullscreenErrorUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent$ApplicationDeclined;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "declineContent", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;)Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent$ApplicationDeclined;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "getDeclineContent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ApplicationDeclined extends com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent {
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
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.ApplicationDeclined) && kotlin.jvm.internal.Intrinsics.areEqual(this.declineContent, ((com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.ApplicationDeclined) other).declineContent);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.ApplicationDeclined copy(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel declineContent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declineContent, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.ApplicationDeclined(declineContent);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel getDeclineContent() {
            return this.declineContent;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.ApplicationDeclined copy$default(com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.ApplicationDeclined applicationDeclined, com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel fullscreenErrorUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                fullscreenErrorUiModel = applicationDeclined.declineContent;
            }
            return applicationDeclined.copy(fullscreenErrorUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent$ErrorBackPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ErrorBackPressed extends com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.ErrorBackPressed INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.ErrorBackPressed();

        public final int hashCode() {
            return 1478672213;
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
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.ErrorBackPressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent$DeclineClosePressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DeclineClosePressed extends com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.DeclineClosePressed INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.DeclineClosePressed();

        public final int hashCode() {
            return 973198494;
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
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.DeclineClosePressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent$OnAddFiSuccess;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent;", "", "newFiId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent$OnAddFiSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getNewFiId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnAddFiSuccess extends com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent {
        public static final int $stable = 0;
        private final java.lang.String newFiId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnAddFiSuccess(java.lang.String str) {
            super("OnAddFiSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.newFiId = str;
        }

        public final java.lang.String getNewFiId() {
            return this.newFiId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.newFiId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnAddFiSuccess(newFiId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.newFiId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.OnAddFiSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.newFiId, ((com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.OnAddFiSuccess) other).newFiId);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.OnAddFiSuccess copy(java.lang.String newFiId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newFiId, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.OnAddFiSuccess(newFiId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getNewFiId() {
            return this.newFiId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.OnAddFiSuccess copy$default(com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.OnAddFiSuccess onAddFiSuccess, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onAddFiSuccess.newFiId;
            }
            return onAddFiSuccess.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent$OnRefreshWithNewFi;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent;", "", "newlyAddedFiId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent$OnRefreshWithNewFi;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getNewlyAddedFiId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnRefreshWithNewFi extends com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent {
        public static final int $stable = 0;
        private final java.lang.String newlyAddedFiId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnRefreshWithNewFi(java.lang.String str) {
            super("OnRefreshWithNewFi", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.newlyAddedFiId = str;
        }

        public final java.lang.String getNewlyAddedFiId() {
            return this.newlyAddedFiId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.newlyAddedFiId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnRefreshWithNewFi(newlyAddedFiId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.newlyAddedFiId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.OnRefreshWithNewFi) && kotlin.jvm.internal.Intrinsics.areEqual(this.newlyAddedFiId, ((com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.OnRefreshWithNewFi) other).newlyAddedFiId);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.OnRefreshWithNewFi copy(java.lang.String newlyAddedFiId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newlyAddedFiId, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.OnRefreshWithNewFi(newlyAddedFiId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getNewlyAddedFiId() {
            return this.newlyAddedFiId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.OnRefreshWithNewFi copy$default(com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.OnRefreshWithNewFi onRefreshWithNewFi, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onRefreshWithNewFi.newlyAddedFiId;
            }
            return onRefreshWithNewFi.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent$OnNewFiConsumed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnNewFiConsumed extends com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.OnNewFiConsumed INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.OnNewFiConsumed();

        public final int hashCode() {
            return 842625642;
        }

        private OnNewFiConsumed() {
            super("OnNewFiConsumed", null);
        }

        public final java.lang.String toString() {
            return "OnNewFiConsumed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.OnNewFiConsumed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent$OnFundingInstrumentsReloaded;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent;", "", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/FundingInstrument;", "fundingInstruments", "", "newlyAddedFiId", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent$OnFundingInstrumentsReloaded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/List;", "getFundingInstruments", "Ljava/lang/String;", "getNewlyAddedFiId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnFundingInstrumentsReloaded extends com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.repayments.FundingInstrument> fundingInstruments;
        private final java.lang.String newlyAddedFiId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnFundingInstrumentsReloaded(java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.repayments.FundingInstrument> list, java.lang.String str) {
            super("OnFundingInstrumentsReloaded", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.fundingInstruments = list;
            this.newlyAddedFiId = str;
        }

        public final java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.repayments.FundingInstrument> getFundingInstruments() {
            return this.fundingInstruments;
        }

        public final java.lang.String getNewlyAddedFiId() {
            return this.newlyAddedFiId;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.repayments.FundingInstrument> list = this.fundingInstruments;
            java.lang.String str = this.newlyAddedFiId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnFundingInstrumentsReloaded(fundingInstruments=");
            sb.append(list);
            sb.append(", newlyAddedFiId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.fundingInstruments.hashCode() * 31) + this.newlyAddedFiId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.OnFundingInstrumentsReloaded)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.OnFundingInstrumentsReloaded onFundingInstrumentsReloaded = (com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.OnFundingInstrumentsReloaded) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.fundingInstruments, onFundingInstrumentsReloaded.fundingInstruments) && kotlin.jvm.internal.Intrinsics.areEqual(this.newlyAddedFiId, onFundingInstrumentsReloaded.newlyAddedFiId);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.OnFundingInstrumentsReloaded copy(java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.repayments.FundingInstrument> fundingInstruments, java.lang.String newlyAddedFiId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstruments, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newlyAddedFiId, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.OnFundingInstrumentsReloaded(fundingInstruments, newlyAddedFiId);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getNewlyAddedFiId() {
            return this.newlyAddedFiId;
        }

        public final java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.repayments.FundingInstrument> component1() {
            return this.fundingInstruments;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.OnFundingInstrumentsReloaded copy$default(com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.OnFundingInstrumentsReloaded onFundingInstrumentsReloaded, java.util.List list, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = onFundingInstrumentsReloaded.fundingInstruments;
            }
            if ((i & 2) != 0) {
                str = onFundingInstrumentsReloaded.newlyAddedFiId;
            }
            return onFundingInstrumentsReloaded.copy(list, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent$OnFundingInstrumentsReloadFailed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnFundingInstrumentsReloadFailed extends com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.OnFundingInstrumentsReloadFailed INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.OnFundingInstrumentsReloadFailed();

        public final int hashCode() {
            return -920410618;
        }

        private OnFundingInstrumentsReloadFailed() {
            super("OnFundingInstrumentsReloadFailed", null);
        }

        public final java.lang.String toString() {
            return "OnFundingInstrumentsReloadFailed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.OnFundingInstrumentsReloadFailed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent$SwitchToSuccess;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsUiModel;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsUiModel;)Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsEvent$SwitchToSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsUiModel;", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SwitchToSuccess extends com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiModel data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SwitchToSuccess(com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiModel repaymentsUiModel) {
            super("SwitchToSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(repaymentsUiModel, "");
            this.data = repaymentsUiModel;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiModel getData() {
            return this.data;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiModel repaymentsUiModel = this.data;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SwitchToSuccess(data=");
            sb.append(repaymentsUiModel);
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
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.SwitchToSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.SwitchToSuccess) other).data);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.SwitchToSuccess copy(com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiModel data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.SwitchToSuccess(data);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiModel getData() {
            return this.data;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.SwitchToSuccess copy$default(com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.SwitchToSuccess switchToSuccess, com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiModel repaymentsUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                repaymentsUiModel = switchToSuccess.data;
            }
            return switchToSuccess.copy(repaymentsUiModel);
        }
    }

    public /* synthetic */ RepaymentsEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
