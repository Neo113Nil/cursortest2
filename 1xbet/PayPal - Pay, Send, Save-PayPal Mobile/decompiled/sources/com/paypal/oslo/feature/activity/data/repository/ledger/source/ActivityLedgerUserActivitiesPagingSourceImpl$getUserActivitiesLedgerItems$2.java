package com.paypal.oslo.feature.activity.data.repository.ledger.source;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/activity/domain/base/error/IActivityDomainError;", "Lcom/paypal/oslo/feature/activity/graphql/GetUserActivitiesQuery$Data;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.activity.data.repository.ledger.source.ActivityLedgerUserActivitiesPagingSourceImpl$getUserActivitiesLedgerItems$2", f = "ActivityLedgerUserActivitiesPagingSourceImpl.kt", i = {}, l = {126}, m = "invokeSuspend", n = {}, nl = {127}, s = {}, v = 2)
/* loaded from: classes10.dex */
final class ActivityLedgerUserActivitiesPagingSourceImpl$getUserActivitiesLedgerItems$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.activity.domain.base.error.IActivityDomainError, ? extends com.paypal.oslo.feature.activity.graphql.GetUserActivitiesQuery.Data>>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.activity.graphql.GetUserActivitiesQuery getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.activity.data.repository.ledger.source.ActivityLedgerUserActivitiesPagingSourceImpl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighSpeedVideoFpsRangesFor = 1;
                obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(this.getHighSpeedVideoSizes.getApolloClient(), this.getHighResolutionOutputSizeshNQ4ISI, (com.paypal.oslo.core.network.graphql.CallConfig) null, this, 2, (java.lang.Object) null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return com.paypal.oslo.feature.activity.domain.base.utils.ActivityGraphQLIorExtensionsKt.mapActivityGraphQL((arrow.core.Ior) obj, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.data.repository.ledger.source.ActivityLedgerUserActivitiesPagingSourceImpl$getUserActivitiesLedgerItems$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.data.repository.ledger.source.ActivityLedgerUserActivitiesPagingSourceImpl$getUserActivitiesLedgerItems$2.getHighSpeedVideoSizes((com.paypal.oslo.core.network.graphql.GraphQLData) obj2);
                }
            });
        } catch (java.lang.Exception e) {
            return new arrow.core.Ior.Left(this.getHighSpeedVideoSizes.getErrorMapper().mapToDomainError(e));
        }
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.GetUserActivitiesQuery.Data getHighSpeedVideoSizes(com.paypal.oslo.core.network.graphql.GraphQLData graphQLData) {
        return (com.paypal.oslo.feature.activity.graphql.GetUserActivitiesQuery.Data) graphQLData.getData();
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.activity.domain.base.error.IActivityDomainError, ? extends com.paypal.oslo.feature.activity.graphql.GetUserActivitiesQuery.Data>> continuation) {
        return ((com.paypal.oslo.feature.activity.data.repository.ledger.source.ActivityLedgerUserActivitiesPagingSourceImpl$getUserActivitiesLedgerItems$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.activity.data.repository.ledger.source.ActivityLedgerUserActivitiesPagingSourceImpl$getUserActivitiesLedgerItems$2(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActivityLedgerUserActivitiesPagingSourceImpl$getUserActivitiesLedgerItems$2(com.paypal.oslo.feature.activity.data.repository.ledger.source.ActivityLedgerUserActivitiesPagingSourceImpl activityLedgerUserActivitiesPagingSourceImpl, com.paypal.oslo.feature.activity.graphql.GetUserActivitiesQuery getUserActivitiesQuery, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.activity.data.repository.ledger.source.ActivityLedgerUserActivitiesPagingSourceImpl$getUserActivitiesLedgerItems$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = activityLedgerUserActivitiesPagingSourceImpl;
        this.getHighResolutionOutputSizeshNQ4ISI = getUserActivitiesQuery;
    }
}
