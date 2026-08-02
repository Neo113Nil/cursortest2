package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/WalletToken;", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditExternalWalletTokenInput;", "toGraphqlInput", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/WalletToken;)Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditExternalWalletTokenInput;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class WalletTokenKt {
    public static final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditExternalWalletTokenInput toGraphqlInput(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletToken walletToken) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletToken, "");
        return new com.paypal.oslo.api.graphql.schema.type.RevolvingCreditExternalWalletTokenInput(null, new com.apollographql.apollo.api.Optional.Present(walletToken.getId()), null, new com.apollographql.apollo.api.Optional.Present(walletToken.getFundingPrimaryAccountNumberLastDigits()), com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletTokenStateKt.toGraphqlTokenState(walletToken.getState()), walletToken.getIssuerName(), walletToken.isCompanionToken(), new com.apollographql.apollo.api.Optional.Present(java.lang.Boolean.valueOf(walletToken.isDefaultToken())), 5, null);
    }
}
