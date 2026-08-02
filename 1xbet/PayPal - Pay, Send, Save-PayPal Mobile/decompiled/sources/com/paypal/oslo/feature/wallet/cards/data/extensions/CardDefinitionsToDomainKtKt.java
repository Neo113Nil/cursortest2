package com.paypal.oslo.feature.wallet.cards.data.extensions;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/feature/wallet/cards/domain/carddefinitions/model/CardDefinitionsError;", "toCardDefinitionsError", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/wallet/cards/domain/carddefinitions/model/CardDefinitionsError;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CardDefinitionsToDomainKtKt {
    public static final com.paypal.oslo.feature.wallet.cards.domain.carddefinitions.model.CardDefinitionsError toCardDefinitionsError(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            return com.paypal.oslo.feature.wallet.cards.domain.carddefinitions.model.CardDefinitionsError.Network.INSTANCE;
        }
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) {
            return new com.paypal.oslo.feature.wallet.cards.domain.carddefinitions.model.CardDefinitionsError.ServerError(com.paypal.oslo.feature.wallet.cards.data.extensions.CardErrorToDomainKtKt.toCardServerErrors((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError), null);
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
