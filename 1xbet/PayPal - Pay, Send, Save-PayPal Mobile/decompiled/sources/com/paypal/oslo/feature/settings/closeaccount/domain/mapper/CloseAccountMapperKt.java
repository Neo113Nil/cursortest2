package com.paypal.oslo.feature.settings.closeaccount.domain.mapper;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/apollographql/apollo/api/ApolloResponse;", "Lcom/paypal/oslo/feature/settings/graphql/CloseAccountMutation$Data;", "response", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/CloseAccountError;", "Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/CloseAccountResult;", "toCloseAccountIor", "(Lcom/apollographql/apollo/api/ApolloResponse;)Larrow/core/Ior;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CloseAccountMapperKt {
    public static final arrow.core.Ior<com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountError, com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountResult> toCloseAccountIor(com.apollographql.apollo.api.ApolloResponse<com.paypal.oslo.feature.settings.graphql.CloseAccountMutation.Data> apolloResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloResponse, "");
        if (apolloResponse.hasErrors()) {
            return arrow.core.IorKt.leftIor(com.paypal.oslo.feature.settings.closeaccount.domain.mapper.CloseAccountErrorMapperKt.extractCloseAccountError(apolloResponse));
        }
        com.paypal.oslo.feature.settings.graphql.CloseAccountMutation.Data data = apolloResponse.data;
        com.paypal.oslo.feature.settings.graphql.CloseAccountMutation.CloseAccount closeAccount = data != null ? data.getCloseAccount() : null;
        if (closeAccount != null) {
            return arrow.core.IorKt.rightIor(new com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountResult(closeAccount.getSuccess()));
        }
        return arrow.core.IorKt.leftIor(new com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountError("No data returned from server", kotlin.collections.CollectionsKt.emptyList(), null, 4, null));
    }
}
