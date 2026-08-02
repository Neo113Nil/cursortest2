package com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u000f\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u000f\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u000f\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/domain/model/AddFIFlowType;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, "Landroidx/navigation3/runtime/NavKey;", "getAddFIDestination", "(Lcom/paypal/oslo/feature/wallet/api/domain/model/AddFIFlowType;)Landroidx/navigation3/runtime/NavKey;", "Lcom/paypal/oslo/feature/wallet/api/navigation/AddFIFlowDestination;", "navigateToAddFI", "()Lcom/paypal/oslo/feature/wallet/api/navigation/AddFIFlowDestination;", "Lcom/paypal/oslo/feature/wallet/api/navigation/AddBankDestination;", "navigateToAddBank", "()Lcom/paypal/oslo/feature/wallet/api/navigation/AddBankDestination;", "Lcom/paypal/oslo/feature/wallet/api/navigation/AddCardFlowDestination;", "navigateToAddCard", "()Lcom/paypal/oslo/feature/wallet/api/navigation/AddCardFlowDestination;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AddFINavigationUtilsKt {
    public static /* synthetic */ androidx.navigation3.runtime.NavKey getAddFIDestination$default(com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType addFIFlowType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            addFIFlowType = com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType.ADD_FI;
        }
        return getAddFIDestination(addFIFlowType);
    }

    public static final androidx.navigation3.runtime.NavKey getAddFIDestination(com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType addFIFlowType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addFIFlowType, "");
        int i = com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddFINavigationUtilsKt.WhenMappings.$EnumSwitchMapping$0[addFIFlowType.ordinal()];
        if (i == 1) {
            return navigateToAddFI();
        }
        if (i == 2) {
            return navigateToAddBank();
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return navigateToAddCard();
    }

    public static final com.paypal.oslo.feature.wallet.api.navigation.AddFIFlowDestination navigateToAddFI() {
        return new com.paypal.oslo.feature.wallet.api.navigation.AddFIFlowDestination(new com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext(com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.WALLET, (java.lang.String) null, (java.lang.String) null, (java.util.Map) null, 14, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.wallet.api.ui.fi.add.config.AddFI.Config((java.lang.String) null, (com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction) null, (com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction) null, (java.lang.String) null, (java.lang.String) null, (java.util.Map) null, 63, (kotlin.jvm.internal.DefaultConstructorMarker) null));
    }

    public static final com.paypal.oslo.feature.wallet.api.navigation.AddBankDestination navigateToAddBank() {
        return new com.paypal.oslo.feature.wallet.api.navigation.AddBankDestination(new com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext(com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.WALLET, (java.lang.String) null, (java.lang.String) null, (java.util.Map) null, 14, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig(false, false, (com.paypal.oslo.feature.wallet.api.ui.banks.config.TopBarConfig) null, 7, (kotlin.jvm.internal.DefaultConstructorMarker) null));
    }

    public static final com.paypal.oslo.feature.wallet.api.navigation.AddCardFlowDestination navigateToAddCard() {
        return new com.paypal.oslo.feature.wallet.api.navigation.AddCardFlowDestination(new com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext(com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.WALLET, (java.lang.String) null, (java.lang.String) null, (java.util.Map) null, 14, (kotlin.jvm.internal.DefaultConstructorMarker) null), (com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header) null, new com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Config((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, false, false, false, false, 255, (kotlin.jvm.internal.DefaultConstructorMarker) null), (com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Options) null, 10, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType.values().length];
            try {
                iArr[com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType.ADD_FI.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType.ADD_BANK.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType.ADD_CARD.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
