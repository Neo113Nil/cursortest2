package com.paypal.oslo.feature.publicprofile.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PublicProfileRepositoryImplKt {
    public static final /* synthetic */ com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError access$toPublicProfileError(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
            if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
                return com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError.NetworkError.INSTANCE;
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.lang.String errorCode = ((com.paypal.oslo.core.network.graphql.error.GraphQLError) kotlin.collections.CollectionsKt.first((java.util.List) arrow.core.NonEmptyList.m9567boximpl(((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError).m11659getErrors1X0FAY()))).getErrorCode();
        if (errorCode == null) {
            errorCode = "unknown";
        }
        return new com.paypal.oslo.feature.publicprofile.domain.error.PublicProfileError.GraphQLError(errorCode);
    }
}
