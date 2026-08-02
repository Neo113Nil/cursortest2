package com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class GetProvisionedWalletTokensUseCaseKt {
    public static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletToken access$toWalletToken(com.paypal.oslo.feature.starpay.api.Token token) {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletTokenState walletTokenState;
        java.lang.String issuerTokenId = token.getIssuerTokenId();
        java.lang.String fpanLastFour = token.getFpanLastFour();
        int i = com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetProvisionedWalletTokensUseCaseKt.WhenMappings.$EnumSwitchMapping$0[token.getTokenState().ordinal()];
        if (i == 1) {
            walletTokenState = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletTokenState.ACTIVATED;
        } else if (i == 2) {
            walletTokenState = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletTokenState.REQUIRES_ACTIVATION;
        } else if (i == 3) {
            walletTokenState = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletTokenState.ACTIVATING;
        } else if (i == 4) {
            walletTokenState = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletTokenState.SUSPENDED;
        } else {
            if (i != 5) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            walletTokenState = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletTokenState.UNKNOWN;
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletToken(issuerTokenId, fpanLastFour, walletTokenState, token.getIssuerName(), false, token.isDefaultToken());
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.starpay.api.TokenState.values().length];
            try {
                iArr[com.paypal.oslo.feature.starpay.api.TokenState.ACTIVE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.starpay.api.TokenState.REQUIRES_ACTIVATION.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.starpay.api.TokenState.ACTIVATING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.starpay.api.TokenState.SUSPENDED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.starpay.api.TokenState.UNKNOWN.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
