package com.paypal.oslo.feature.businesscustomers.data.utils;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "toCustomersException", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Ljava/lang/Exception;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GraphQLExtensionsKt {
    public static final java.lang.Exception toCustomersException(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) {
            return new java.lang.Exception("GraphQL error: ".concat(java.lang.String.valueOf(arrow.core.NonEmptyList.m9607toStringimpl(((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError).m11659getErrors1X0FAY()))));
        }
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            return new java.lang.Exception(com.paypal.oslo.feature.checkcapture.domain.error.CheckCaptureError.NETWORK_ERROR);
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
