package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/WalletTokenState;", "Lcom/paypal/oslo/api/graphql/schema/type/CreditExternalWalletTokenState;", "toGraphqlTokenState", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/WalletTokenState;)Lcom/paypal/oslo/api/graphql/schema/type/CreditExternalWalletTokenState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class WalletTokenStateKt {
    public static final com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletTokenState toGraphqlTokenState(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletTokenState walletTokenState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletTokenState, "");
        int i = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletTokenStateKt.WhenMappings.$EnumSwitchMapping$0[walletTokenState.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletTokenState.ACTIVATED;
        }
        if (i == 2) {
            return com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletTokenState.PENDING_ACTIVATION;
        }
        if (i == 3) {
            return com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletTokenState.ACTIVATING;
        }
        if (i == 4) {
            return com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletTokenState.SUSPENDED;
        }
        if (i != 5) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletTokenState.UNKNOWN;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletTokenState.values().length];
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletTokenState.ACTIVATED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletTokenState.REQUIRES_ACTIVATION.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletTokenState.ACTIVATING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletTokenState.SUSPENDED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletTokenState.UNKNOWN.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
