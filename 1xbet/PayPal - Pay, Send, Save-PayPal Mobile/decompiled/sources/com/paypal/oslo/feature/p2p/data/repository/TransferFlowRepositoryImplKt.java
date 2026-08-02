package com.paypal.oslo.feature.p2p.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TransferFlowRepositoryImplKt {
    public static final /* synthetic */ com.paypal.oslo.feature.p2p.domain.error.TransferError access$toTransferError(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) {
            arrow.core.NonEmptyList<com.paypal.oslo.core.network.graphql.error.GraphQLError> m9567boximpl = arrow.core.NonEmptyList.m9567boximpl(((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError).m11659getErrors1X0FAY());
            if (!(m9567boximpl instanceof java.util.Collection) || !m9567boximpl.isEmpty()) {
                for (com.paypal.oslo.core.network.graphql.error.GraphQLError graphQLError : m9567boximpl) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(graphQLError.getErrorCode(), "PAYMENT_DECLINED_DUE_TO_HIGH_RISK_SCAM") || com.paypal.oslo.feature.p2p.data.GraphQLErrorExtensionsKt.hasDetailIssue(graphQLError, "PAYMENT_DECLINED_DUE_TO_HIGH_RISK_SCAM")) {
                        return com.paypal.oslo.feature.p2p.domain.error.TransferError.HighRiskScamDecline.INSTANCE;
                    }
                }
            }
        }
        return com.paypal.oslo.feature.p2p.domain.error.TransferError.Network.INSTANCE;
    }
}
