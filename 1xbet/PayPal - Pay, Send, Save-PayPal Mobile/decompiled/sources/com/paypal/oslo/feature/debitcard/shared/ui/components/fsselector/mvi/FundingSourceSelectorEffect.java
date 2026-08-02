package com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames.INTENT_DISMISS, "FundingSourceSelected", "NavigateToLinkBank", "NavigateToLinkCard", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEffect$Dismiss;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEffect$FundingSourceSelected;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEffect$NavigateToLinkBank;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEffect$NavigateToLinkCard;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class FundingSourceSelectorEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private FundingSourceSelectorEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEffect$Dismiss;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Dismiss extends com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEffect.Dismiss INSTANCE = new com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEffect.Dismiss();

        public final int hashCode() {
            return -1332197032;
        }

        private Dismiss() {
            super(com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames.INTENT_DISMISS, null);
        }

        public final java.lang.String toString() {
            return com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames.INTENT_DISMISS;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEffect.Dismiss)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEffect$FundingSourceSelected;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEffect;", "", "selectedFundingSourceId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEffect$FundingSourceSelected;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getSelectedFundingSourceId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FundingSourceSelected extends com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEffect {
        public static final int $stable = 0;
        private final java.lang.String selectedFundingSourceId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FundingSourceSelected(java.lang.String str) {
            super("FundingSourceSelected", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.selectedFundingSourceId = str;
        }

        public final java.lang.String getSelectedFundingSourceId() {
            return this.selectedFundingSourceId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.selectedFundingSourceId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FundingSourceSelected(selectedFundingSourceId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.selectedFundingSourceId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEffect.FundingSourceSelected) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedFundingSourceId, ((com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEffect.FundingSourceSelected) other).selectedFundingSourceId);
        }

        public final com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEffect.FundingSourceSelected copy(java.lang.String selectedFundingSourceId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedFundingSourceId, "");
            return new com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEffect.FundingSourceSelected(selectedFundingSourceId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getSelectedFundingSourceId() {
            return this.selectedFundingSourceId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEffect.FundingSourceSelected copy$default(com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEffect.FundingSourceSelected fundingSourceSelected, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = fundingSourceSelected.selectedFundingSourceId;
            }
            return fundingSourceSelected.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEffect$NavigateToLinkBank;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToLinkBank extends com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEffect.NavigateToLinkBank INSTANCE = new com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEffect.NavigateToLinkBank();

        public final int hashCode() {
            return 755771828;
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
            if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEffect.NavigateToLinkBank)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEffect$NavigateToLinkCard;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fsselector/mvi/FundingSourceSelectorEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToLinkCard extends com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEffect.NavigateToLinkCard INSTANCE = new com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEffect.NavigateToLinkCard();

        public final int hashCode() {
            return 755801736;
        }

        private NavigateToLinkCard() {
            super("NavigateToLinkCard", null);
        }

        public final java.lang.String toString() {
            return "NavigateToLinkCard";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.mvi.FundingSourceSelectorEffect.NavigateToLinkCard)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ FundingSourceSelectorEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
