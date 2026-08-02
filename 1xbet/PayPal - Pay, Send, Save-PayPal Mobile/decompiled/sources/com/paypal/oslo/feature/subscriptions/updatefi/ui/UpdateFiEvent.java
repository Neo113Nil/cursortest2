package com.paypal.oslo.feature.subscriptions.updatefi.ui;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0007\u0006\u0007\b\t\n\u000b\fR\u0014\u0010\u0005\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0007\r\u000e\u000f\u0010\u0011\u0012\u0013À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/UpdateFiEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "getName", "()Ljava/lang/String;", "name", "OnUpdateClicked", "OnAddPaymentMethodClicked", "OnFirstFundingInstrumentCheckSwitched", "OnFundingInstrumentSelected", "OnAboutPaymentMethodsClicked", "OnTryAgainClicked", "OnAddFiFailed", "Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/UpdateFiEvent$OnAboutPaymentMethodsClicked;", "Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/UpdateFiEvent$OnAddFiFailed;", "Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/UpdateFiEvent$OnAddPaymentMethodClicked;", "Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/UpdateFiEvent$OnFirstFundingInstrumentCheckSwitched;", "Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/UpdateFiEvent$OnFundingInstrumentSelected;", "Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/UpdateFiEvent$OnTryAgainClicked;", "Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/UpdateFiEvent$OnUpdateClicked;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface UpdateFiEvent extends com.paypal.oslo.core.mvi.Event {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/UpdateFiEvent$OnUpdateClicked;", "Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/UpdateFiEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnUpdateClicked implements com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiEvent.OnUpdateClicked INSTANCE = new com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiEvent.OnUpdateClicked();

        public final int hashCode() {
            return 1088151070;
        }

        private OnUpdateClicked() {
        }

        @Override // com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiEvent, com.paypal.oslo.core.mvi.Event
        public final /* bridge */ java.lang.String getName() {
            return super.getName();
        }

        public final java.lang.String toString() {
            return "OnUpdateClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiEvent.OnUpdateClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/UpdateFiEvent$OnAddPaymentMethodClicked;", "Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/UpdateFiEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnAddPaymentMethodClicked implements com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiEvent.OnAddPaymentMethodClicked INSTANCE = new com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiEvent.OnAddPaymentMethodClicked();

        public final int hashCode() {
            return 1805108449;
        }

        private OnAddPaymentMethodClicked() {
        }

        @Override // com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiEvent, com.paypal.oslo.core.mvi.Event
        public final /* bridge */ java.lang.String getName() {
            return super.getName();
        }

        public final java.lang.String toString() {
            return "OnAddPaymentMethodClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiEvent.OnAddPaymentMethodClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0003\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/UpdateFiEvent$OnFirstFundingInstrumentCheckSwitched;", "Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/UpdateFiEvent;", "", "isChecked", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/UpdateFiEvent$OnFirstFundingInstrumentCheckSwitched;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnFirstFundingInstrumentCheckSwitched implements com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiEvent {
        public static final int $stable = 0;
        private final boolean isChecked;

        public OnFirstFundingInstrumentCheckSwitched(boolean z) {
            this.isChecked = z;
        }

        @Override // com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiEvent, com.paypal.oslo.core.mvi.Event
        public final /* bridge */ java.lang.String getName() {
            return super.getName();
        }

        public final boolean isChecked() {
            return this.isChecked;
        }

        public final java.lang.String toString() {
            boolean z = this.isChecked;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnFirstFundingInstrumentCheckSwitched(isChecked=");
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
            return (other instanceof com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiEvent.OnFirstFundingInstrumentCheckSwitched) && this.isChecked == ((com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiEvent.OnFirstFundingInstrumentCheckSwitched) other).isChecked;
        }

        public final com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiEvent.OnFirstFundingInstrumentCheckSwitched copy(boolean isChecked) {
            return new com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiEvent.OnFirstFundingInstrumentCheckSwitched(isChecked);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsChecked() {
            return this.isChecked;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiEvent.OnFirstFundingInstrumentCheckSwitched copy$default(com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiEvent.OnFirstFundingInstrumentCheckSwitched onFirstFundingInstrumentCheckSwitched, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = onFirstFundingInstrumentCheckSwitched.isChecked;
            }
            return onFirstFundingInstrumentCheckSwitched.copy(z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/UpdateFiEvent$OnFundingInstrumentSelected;", "Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/UpdateFiEvent;", "Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentUiModel;", "fundingInstrument", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentUiModel;", "copy", "(Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentUiModel;)Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/UpdateFiEvent$OnFundingInstrumentSelected;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentUiModel;", "getFundingInstrument"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnFundingInstrumentSelected implements com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrument;

        public OnFundingInstrumentSelected(com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentUiModel, "");
            this.fundingInstrument = fundingInstrumentUiModel;
        }

        public final com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel getFundingInstrument() {
            return this.fundingInstrument;
        }

        @Override // com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiEvent, com.paypal.oslo.core.mvi.Event
        public final /* bridge */ java.lang.String getName() {
            return super.getName();
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel = this.fundingInstrument;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnFundingInstrumentSelected(fundingInstrument=");
            sb.append(fundingInstrumentUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.fundingInstrument.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiEvent.OnFundingInstrumentSelected) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingInstrument, ((com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiEvent.OnFundingInstrumentSelected) other).fundingInstrument);
        }

        public final com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiEvent.OnFundingInstrumentSelected copy(com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrument) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrument, "");
            return new com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiEvent.OnFundingInstrumentSelected(fundingInstrument);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel getFundingInstrument() {
            return this.fundingInstrument;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiEvent.OnFundingInstrumentSelected copy$default(com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiEvent.OnFundingInstrumentSelected onFundingInstrumentSelected, com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                fundingInstrumentUiModel = onFundingInstrumentSelected.fundingInstrument;
            }
            return onFundingInstrumentSelected.copy(fundingInstrumentUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/UpdateFiEvent$OnAboutPaymentMethodsClicked;", "Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/UpdateFiEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnAboutPaymentMethodsClicked implements com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiEvent.OnAboutPaymentMethodsClicked INSTANCE = new com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiEvent.OnAboutPaymentMethodsClicked();

        public final int hashCode() {
            return 1372892974;
        }

        private OnAboutPaymentMethodsClicked() {
        }

        @Override // com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiEvent, com.paypal.oslo.core.mvi.Event
        public final /* bridge */ java.lang.String getName() {
            return super.getName();
        }

        public final java.lang.String toString() {
            return "OnAboutPaymentMethodsClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiEvent.OnAboutPaymentMethodsClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/UpdateFiEvent$OnTryAgainClicked;", "Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/UpdateFiEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnTryAgainClicked implements com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiEvent.OnTryAgainClicked INSTANCE = new com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiEvent.OnTryAgainClicked();

        public final int hashCode() {
            return 604090626;
        }

        private OnTryAgainClicked() {
        }

        @Override // com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiEvent, com.paypal.oslo.core.mvi.Event
        public final /* bridge */ java.lang.String getName() {
            return super.getName();
        }

        public final java.lang.String toString() {
            return "OnTryAgainClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiEvent.OnTryAgainClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/UpdateFiEvent$OnAddFiFailed;", "Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/UpdateFiEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnAddFiFailed implements com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiEvent.OnAddFiFailed INSTANCE = new com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiEvent.OnAddFiFailed();

        public final int hashCode() {
            return -1860448863;
        }

        private OnAddFiFailed() {
        }

        @Override // com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiEvent, com.paypal.oslo.core.mvi.Event
        public final /* bridge */ java.lang.String getName() {
            return super.getName();
        }

        public final java.lang.String toString() {
            return "OnAddFiFailed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiEvent.OnAddFiFailed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static java.lang.String getName(com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiEvent updateFiEvent) {
            return com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiEvent.super.getName();
        }
    }

    @Override // com.paypal.oslo.core.mvi.Event
    default java.lang.String getName() {
        java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(getClass()).getSimpleName();
        return simpleName == null ? "" : simpleName;
    }
}
