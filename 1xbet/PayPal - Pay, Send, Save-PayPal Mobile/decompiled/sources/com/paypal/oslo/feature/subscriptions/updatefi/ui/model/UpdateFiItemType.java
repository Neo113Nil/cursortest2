package com.paypal.oslo.feature.subscriptions.updatefi.ui.model;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/model/UpdateFiItemType;", "", "BalanceFundingInstrumentItem", com.paypal.oslo.feature.bnplacquisition.ui.common.components.FundingInstrumentTestTag.FUNDING_INSTRUMENT_ITEM, "AddPaymentMethod", "Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/model/UpdateFiItemType$AddPaymentMethod;", "Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/model/UpdateFiItemType$BalanceFundingInstrumentItem;", "Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/model/UpdateFiItemType$FundingInstrumentItem;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface UpdateFiItemType {

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u0005\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/model/UpdateFiItemType$BalanceFundingInstrumentItem;", "Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/model/UpdateFiItemType;", "Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentUiModel;", "fundingInstrument", "", "isChecked", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentUiModel;Z)V", "component1", "()Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentUiModel;", "component2", "()Z", "copy", "(Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentUiModel;Z)Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/model/UpdateFiItemType$BalanceFundingInstrumentItem;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentUiModel;", "getFundingInstrument", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BalanceFundingInstrumentItem implements com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiItemType {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrument;
        private final boolean isChecked;

        public BalanceFundingInstrumentItem(com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentUiModel, "");
            this.fundingInstrument = fundingInstrumentUiModel;
            this.isChecked = z;
        }

        public final com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel getFundingInstrument() {
            return this.fundingInstrument;
        }

        public final boolean isChecked() {
            return this.isChecked;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel = this.fundingInstrument;
            boolean z = this.isChecked;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BalanceFundingInstrumentItem(fundingInstrument=");
            sb.append(fundingInstrumentUiModel);
            sb.append(", isChecked=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.fundingInstrument.hashCode() * 31) + java.lang.Boolean.hashCode(this.isChecked);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiItemType.BalanceFundingInstrumentItem)) {
                return false;
            }
            com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiItemType.BalanceFundingInstrumentItem balanceFundingInstrumentItem = (com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiItemType.BalanceFundingInstrumentItem) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.fundingInstrument, balanceFundingInstrumentItem.fundingInstrument) && this.isChecked == balanceFundingInstrumentItem.isChecked;
        }

        public final com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiItemType.BalanceFundingInstrumentItem copy(com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrument, boolean isChecked) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrument, "");
            return new com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiItemType.BalanceFundingInstrumentItem(fundingInstrument, isChecked);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsChecked() {
            return this.isChecked;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel getFundingInstrument() {
            return this.fundingInstrument;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiItemType.BalanceFundingInstrumentItem copy$default(com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiItemType.BalanceFundingInstrumentItem balanceFundingInstrumentItem, com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                fundingInstrumentUiModel = balanceFundingInstrumentItem.fundingInstrument;
            }
            if ((i & 2) != 0) {
                z = balanceFundingInstrumentItem.isChecked;
            }
            return balanceFundingInstrumentItem.copy(fundingInstrumentUiModel, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/model/UpdateFiItemType$FundingInstrumentItem;", "Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/model/UpdateFiItemType;", "Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentUiModel;", "fundingInstrument", "<init>", "(Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentUiModel;", "copy", "(Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentUiModel;)Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/model/UpdateFiItemType$FundingInstrumentItem;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentUiModel;", "getFundingInstrument"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FundingInstrumentItem implements com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiItemType {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrument;

        public FundingInstrumentItem(com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentUiModel, "");
            this.fundingInstrument = fundingInstrumentUiModel;
        }

        public final com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel getFundingInstrument() {
            return this.fundingInstrument;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel = this.fundingInstrument;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FundingInstrumentItem(fundingInstrument=");
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
            return (other instanceof com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiItemType.FundingInstrumentItem) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingInstrument, ((com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiItemType.FundingInstrumentItem) other).fundingInstrument);
        }

        public final com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiItemType.FundingInstrumentItem copy(com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrument) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrument, "");
            return new com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiItemType.FundingInstrumentItem(fundingInstrument);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel getFundingInstrument() {
            return this.fundingInstrument;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiItemType.FundingInstrumentItem copy$default(com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiItemType.FundingInstrumentItem fundingInstrumentItem, com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                fundingInstrumentUiModel = fundingInstrumentItem.fundingInstrument;
            }
            return fundingInstrumentItem.copy(fundingInstrumentUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/model/UpdateFiItemType$AddPaymentMethod;", "Lcom/paypal/oslo/feature/subscriptions/updatefi/ui/model/UpdateFiItemType;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AddPaymentMethod implements com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiItemType {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiItemType.AddPaymentMethod INSTANCE = new com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiItemType.AddPaymentMethod();

        public final int hashCode() {
            return 1394636341;
        }

        private AddPaymentMethod() {
        }

        public final java.lang.String toString() {
            return "AddPaymentMethod";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.updatefi.ui.model.UpdateFiItemType.AddPaymentMethod)) {
                return false;
            }
            return true;
        }
    }
}
