package com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/network/PartialErrorHandler;", "toPartialErrors", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/revolvingcreditservicing/data/network/PartialErrorHandler;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CallErrorToPartialErrorHandlerMapperKt {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.data.network.PartialErrorHandler toPartialErrors(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        java.lang.String str;
        if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.data.network.PartialErrorHandler(kotlin.collections.CollectionsKt.emptyList());
        }
        arrow.core.NonEmptyList<com.paypal.oslo.core.network.graphql.error.GraphQLError> m9567boximpl = arrow.core.NonEmptyList.m9567boximpl(((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError).m11659getErrors1X0FAY());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.paypal.oslo.core.network.graphql.error.GraphQLError graphQLError : m9567boximpl) {
            java.util.List<java.lang.Object> path = graphQLError.getPath();
            if (path != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj : path) {
                    java.lang.String str2 = obj instanceof java.lang.String ? (java.lang.String) obj : null;
                    if (str2 != null) {
                        arrayList2.add(str2);
                    }
                }
                str = kotlin.collections.CollectionsKt.joinToString$default(arrayList2, ".", null, null, 0, null, null, 62, null);
            } else {
                str = null;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.data.network.PartialError partialError = str != null ? new com.paypal.oslo.feature.revolvingcreditservicing.data.network.PartialError(str, graphQLError.getMessage(), graphQLError.getErrorCode()) : null;
            if (partialError != null) {
                arrayList.add(partialError);
            }
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.data.network.PartialErrorHandler(arrayList);
    }
}
