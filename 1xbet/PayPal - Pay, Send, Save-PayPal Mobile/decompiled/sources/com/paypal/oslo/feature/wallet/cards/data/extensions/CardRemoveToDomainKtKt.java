package com.paypal.oslo.feature.wallet.cards.data.extensions;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/feature/wallet/cards/domain/remove/model/CardRemoveError;", "toCardRemoveError", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/wallet/cards/domain/remove/model/CardRemoveError;", "Lcom/paypal/oslo/feature/wallet/graphql/RemoveWalletCardMutation$RemoveCard;", "Lcom/paypal/oslo/feature/wallet/cards/domain/remove/model/CardRemove;", "toDomain", "(Lcom/paypal/oslo/feature/wallet/graphql/RemoveWalletCardMutation$RemoveCard;)Lcom/paypal/oslo/feature/wallet/cards/domain/remove/model/CardRemove;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CardRemoveToDomainKtKt {
    public static final com.paypal.oslo.feature.wallet.cards.domain.remove.model.CardRemoveError toCardRemoveError(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            return com.paypal.oslo.feature.wallet.cards.domain.remove.model.CardRemoveError.Network.INSTANCE;
        }
        if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.core.network.graphql.error.CallError.GraphQL graphQL = (com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError;
        java.util.Map<java.lang.String, java.lang.Object> extensions = ((com.paypal.oslo.core.network.graphql.error.GraphQLError) kotlin.collections.CollectionsKt.first((java.util.List) arrow.core.NonEmptyList.m9567boximpl(graphQL.m11659getErrors1X0FAY()))).getExtensions();
        java.lang.Object obj = extensions != null ? extensions.get("code") : null;
        return kotlin.jvm.internal.Intrinsics.areEqual(obj instanceof java.lang.String ? (java.lang.String) obj : null, "INVALID_CARD_ID") ? com.paypal.oslo.feature.wallet.cards.domain.remove.model.CardRemoveError.InvalidCardId.INSTANCE : new com.paypal.oslo.feature.wallet.cards.domain.remove.model.CardRemoveError.Server(graphQL.m11659getErrors1X0FAY(), ((com.paypal.oslo.core.network.graphql.error.GraphQLError) kotlin.collections.CollectionsKt.first((java.util.List) arrow.core.NonEmptyList.m9567boximpl(graphQL.m11659getErrors1X0FAY()))).getMessage(), null);
    }

    public static final com.paypal.oslo.feature.wallet.cards.domain.remove.model.CardRemove toDomain(com.paypal.oslo.feature.wallet.graphql.RemoveWalletCardMutation.RemoveCard removeCard) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(removeCard, "");
        return new com.paypal.oslo.feature.wallet.cards.domain.remove.model.CardRemove(removeCard.getRemoved());
    }
}
