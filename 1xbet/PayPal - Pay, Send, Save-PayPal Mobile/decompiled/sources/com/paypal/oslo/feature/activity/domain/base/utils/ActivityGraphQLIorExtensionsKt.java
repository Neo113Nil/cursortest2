package com.paypal.oslo.feature.activity.domain.base.utils;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aU\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00022\u0018\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\b\u0010\t"}, d2 = {"T", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Larrow/core/Ior;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/core/network/graphql/GraphQLData;", "Lkotlin/Function1;", "onSuccess", "Lcom/paypal/oslo/feature/activity/domain/base/error/IActivityDomainError;", "mapActivityGraphQL", "(Larrow/core/Ior;Lkotlin/jvm/functions/Function1;)Larrow/core/Ior;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityGraphQLIorExtensionsKt {
    public static final <T, R> arrow.core.Ior<com.paypal.oslo.feature.activity.domain.base.error.IActivityDomainError, R> mapActivityGraphQL(arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, com.paypal.oslo.core.network.graphql.GraphQLData<T>> ior, kotlin.jvm.functions.Function1<? super com.paypal.oslo.core.network.graphql.GraphQLData<T>, ? extends R> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ior, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        if (ior instanceof arrow.core.Ior.Left) {
            return new arrow.core.Ior.Left(new com.paypal.oslo.feature.activity.domain.base.error.ActivityGenericErrorActivityImpl(null, (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue(), 1, null));
        }
        if (ior instanceof arrow.core.Ior.Right) {
            com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue();
            if (graphQLData.getData() == null) {
                return new arrow.core.Ior.Left(new com.paypal.oslo.feature.activity.domain.base.error.ActivityGenericErrorActivityImpl("GraphQL returned null data - possible server error", null, 2, null));
            }
            return new arrow.core.Ior.Right(function1.invoke(graphQLData));
        }
        if (ior instanceof arrow.core.Ior.Both) {
            arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
            java.lang.Object leftValue = both.getLeftValue();
            com.paypal.oslo.core.network.graphql.GraphQLData graphQLData2 = (com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue();
            com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) leftValue;
            if (graphQLData2.getData() == null) {
                return new arrow.core.Ior.Left(new com.paypal.oslo.feature.activity.domain.base.error.ActivityGenericErrorActivityImpl(null, callError, 1, null));
            }
            return new arrow.core.Ior.Both(new com.paypal.oslo.feature.activity.domain.base.error.ActivityGenericErrorActivityImpl(null, callError, 1, null), function1.invoke(graphQLData2));
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
