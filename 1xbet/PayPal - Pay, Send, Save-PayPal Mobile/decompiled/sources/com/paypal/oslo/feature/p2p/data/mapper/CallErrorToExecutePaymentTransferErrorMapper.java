package com.paypal.oslo.feature.p2p.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/data/mapper/CallErrorToExecutePaymentTransferErrorMapper;", "Lcom/paypal/oslo/feature/p2p/domain/common/mapper/Mapper;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/feature/p2p/domain/error/ExecutePaymentTransferError;", "<init>", "()V", "input", "map", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/p2p/domain/error/ExecutePaymentTransferError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CallErrorToExecutePaymentTransferErrorMapper implements com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper<com.paypal.oslo.core.network.graphql.error.CallError, com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public CallErrorToExecutePaymentTransferErrorMapper() {
    }

    @Override // com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper
    public final com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError map(com.paypal.oslo.core.network.graphql.error.CallError input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        if (!(input instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network)) {
            if (!(input instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.core.network.graphql.error.CallError.GraphQL graphQL = (com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) input;
            java.util.List<com.paypal.oslo.core.network.graphql.error.GraphQLError> m11659getErrors1X0FAY = graphQL.m11659getErrors1X0FAY();
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(m11659getErrors1X0FAY, 10));
            java.util.Iterator<T> it = m11659getErrors1X0FAY.iterator();
            while (it.hasNext()) {
                java.lang.String lowerCase = ((com.paypal.oslo.core.network.graphql.error.GraphQLError) it.next()).getMessage().toLowerCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                arrayList.add(lowerCase);
            }
            java.util.List m9570constructorimpl = arrow.core.NonEmptyList.m9570constructorimpl(arrayList);
            java.util.Map mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(new kotlin.text.Regex("\\b(insufficient|not enough)\\s+funds\\b"), com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Business.InsufficientFunds.INSTANCE), kotlin.TuplesKt.to(new kotlin.text.Regex("\\b(amount|transfer|transaction)?\\s*(limit|exceed(s|ed)?\\s+limit)\\b"), com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Business.AmountExceedsLimit.INSTANCE), kotlin.TuplesKt.to(new kotlin.text.Regex("\\brecipient\\b.*(invalid|not\\s+found)\\b"), com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Business.InvalidRecipient.INSTANCE), kotlin.TuplesKt.to(new kotlin.text.Regex("\\b(security|fraud)\\b"), com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Business.SecurityBlock.INSTANCE), kotlin.TuplesKt.to(new kotlin.text.Regex("\\b(restricted|blocked)\\b"), com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Business.AccountRestricted.INSTANCE));
            java.util.Iterator m9589iteratorimpl = arrow.core.NonEmptyList.m9589iteratorimpl(m9570constructorimpl);
            while (m9589iteratorimpl.hasNext()) {
                java.lang.String str = (java.lang.String) m9589iteratorimpl.next();
                for (java.util.Map.Entry entry : mapOf.entrySet()) {
                    kotlin.text.Regex regex = (kotlin.text.Regex) entry.getKey();
                    com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Business business = (com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Business) entry.getValue();
                    if (regex.containsMatchIn(str)) {
                        return business;
                    }
                }
            }
            java.lang.String message = ((com.paypal.oslo.core.network.graphql.error.GraphQLError) kotlin.collections.CollectionsKt.first((java.util.List) arrow.core.NonEmptyList.m9567boximpl(graphQL.m11659getErrors1X0FAY()))).getMessage();
            if (kotlin.text.StringsKt.isBlank(message)) {
                message = "Unknown GraphQL error";
            }
            return new com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Business.ServerError(message);
        }
        com.paypal.oslo.core.network.http.error.NetworkError error = ((com.paypal.oslo.core.network.graphql.error.CallError.Network) input).getError();
        if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError) {
            int code = ((com.paypal.oslo.core.network.http.error.NetworkError.HttpError) error).getCode();
            if (code == 403) {
                return com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Business.AccountRestricted.INSTANCE;
            }
            if (code == 404) {
                return com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Business.InvalidRecipient.INSTANCE;
            }
        } else if (!(error instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) && !(error instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError.Network.INSTANCE;
    }
}
