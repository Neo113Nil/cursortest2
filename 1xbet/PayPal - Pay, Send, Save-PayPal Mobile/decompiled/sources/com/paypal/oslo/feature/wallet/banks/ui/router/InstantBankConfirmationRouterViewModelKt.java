package com.paypal.oslo.feature.wallet.banks.ui.router;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class InstantBankConfirmationRouterViewModelKt {
    public static final /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.consent.model.AddBankConsentFlowContentId access$toConsentFlowId(com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmFlowType confirmFlowType) {
        if (com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationRouterViewModelKt.WhenMappings.$EnumSwitchMapping$1[addFIFlow.ordinal()] == 1) {
            int i = com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationRouterViewModelKt.WhenMappings.$EnumSwitchMapping$0[confirmFlowType.ordinal()];
            if (i == 1) {
                return com.paypal.oslo.feature.wallet.banks.ui.consent.model.AddBankConsentFlowContentId.WALLET_RECONNECT;
            }
            if (i == 2) {
                return com.paypal.oslo.feature.wallet.banks.ui.consent.model.AddBankConsentFlowContentId.WALLET_IBC;
            }
            if (i != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return com.paypal.oslo.feature.wallet.banks.ui.consent.model.AddBankConsentFlowContentId.WALLET_OB_UPGRADE;
        }
        int i2 = com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationRouterViewModelKt.WhenMappings.$EnumSwitchMapping$0[confirmFlowType.ordinal()];
        if (i2 == 1) {
            return com.paypal.oslo.feature.wallet.banks.ui.consent.model.AddBankConsentFlowContentId.DEFAULT_RECONNECT;
        }
        if (i2 == 2) {
            return com.paypal.oslo.feature.wallet.banks.ui.consent.model.AddBankConsentFlowContentId.DEFAULT_IBC;
        }
        if (i2 != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.wallet.banks.ui.consent.model.AddBankConsentFlowContentId.DEFAULT_OB_UPGRADE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams access$toInstantBankConfirmationAggregatorParams(com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmBankConfig confirmBankConfig, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow) {
        if (com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationRouterViewModelKt.WhenMappings.$EnumSwitchMapping$0[confirmBankConfig.getConfirmFlowType().ordinal()] == 1) {
            return new com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.ReconsentFlowWithInstrumentIdParams(confirmBankConfig.getBankId(), addFIFlow, "", kotlin.collections.CollectionsKt.emptyList());
        }
        return new com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams.IBCFlowWithInstrumentIdParams(confirmBankConfig.getBankId(), addFIFlow, "", kotlin.collections.CollectionsKt.emptyList());
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmFlowType.values().length];
            try {
                iArr[com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmFlowType.RECONNECT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmFlowType.IBC.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmFlowType.UPGRADE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.values().length];
            try {
                iArr2[com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.WALLET.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
