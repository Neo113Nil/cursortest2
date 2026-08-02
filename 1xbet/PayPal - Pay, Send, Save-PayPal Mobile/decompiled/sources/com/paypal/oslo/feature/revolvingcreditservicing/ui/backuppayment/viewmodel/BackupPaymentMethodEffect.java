package com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/backuppayment/viewmodel/BackupPaymentMethodEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "ShowDontSeeBankBottomSheet", "NavigateToReview", "NavigateToLinkBank", "NavigateBack", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/backuppayment/viewmodel/BackupPaymentMethodEffect$NavigateBack;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/backuppayment/viewmodel/BackupPaymentMethodEffect$NavigateToLinkBank;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/backuppayment/viewmodel/BackupPaymentMethodEffect$NavigateToReview;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/backuppayment/viewmodel/BackupPaymentMethodEffect$ShowDontSeeBankBottomSheet;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class BackupPaymentMethodEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private BackupPaymentMethodEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/backuppayment/viewmodel/BackupPaymentMethodEffect$ShowDontSeeBankBottomSheet;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/backuppayment/viewmodel/BackupPaymentMethodEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowDontSeeBankBottomSheet extends com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodEffect.ShowDontSeeBankBottomSheet INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodEffect.ShowDontSeeBankBottomSheet();

        public final int hashCode() {
            return -205180567;
        }

        private ShowDontSeeBankBottomSheet() {
            super("ShowDontSeeBankBottomSheet", null);
        }

        public final java.lang.String toString() {
            return "ShowDontSeeBankBottomSheet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodEffect.ShowDontSeeBankBottomSheet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/backuppayment/viewmodel/BackupPaymentMethodEffect$NavigateToReview;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/backuppayment/viewmodel/BackupPaymentMethodEffect;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/fundinginstrument/FundingInstrumentUiModel;", "selectedFundingInstrument", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/fundinginstrument/FundingInstrumentUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/fundinginstrument/FundingInstrumentUiModel;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/fundinginstrument/FundingInstrumentUiModel;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/backuppayment/viewmodel/BackupPaymentMethodEffect$NavigateToReview;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/fundinginstrument/FundingInstrumentUiModel;", "getSelectedFundingInstrument"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToReview extends com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel selectedFundingInstrument;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToReview(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel fundingInstrumentUiModel) {
            super("NavigateToReview", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentUiModel, "");
            this.selectedFundingInstrument = fundingInstrumentUiModel;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel getSelectedFundingInstrument() {
            return this.selectedFundingInstrument;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel fundingInstrumentUiModel = this.selectedFundingInstrument;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToReview(selectedFundingInstrument=");
            sb.append(fundingInstrumentUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.selectedFundingInstrument.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodEffect.NavigateToReview) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedFundingInstrument, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodEffect.NavigateToReview) other).selectedFundingInstrument);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodEffect.NavigateToReview copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel selectedFundingInstrument) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedFundingInstrument, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodEffect.NavigateToReview(selectedFundingInstrument);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel getSelectedFundingInstrument() {
            return this.selectedFundingInstrument;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodEffect.NavigateToReview copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodEffect.NavigateToReview navigateToReview, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel fundingInstrumentUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                fundingInstrumentUiModel = navigateToReview.selectedFundingInstrument;
            }
            return navigateToReview.copy(fundingInstrumentUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/backuppayment/viewmodel/BackupPaymentMethodEffect$NavigateToLinkBank;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/backuppayment/viewmodel/BackupPaymentMethodEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToLinkBank extends com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodEffect.NavigateToLinkBank INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodEffect.NavigateToLinkBank();

        public final int hashCode() {
            return 501405336;
        }

        private NavigateToLinkBank() {
            super("NavigateToLinkBank", null);
        }

        public final java.lang.String toString() {
            return "NavigateToLinkBank";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodEffect.NavigateToLinkBank)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/backuppayment/viewmodel/BackupPaymentMethodEffect$NavigateBack;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/backuppayment/viewmodel/BackupPaymentMethodEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBack extends com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodEffect.NavigateBack INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodEffect.NavigateBack();

        public final int hashCode() {
            return 375488462;
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
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodEffect.NavigateBack)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ BackupPaymentMethodEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
