package com.paypal.oslo.feature.activity.data.repository.ledger.source;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/activity/domain/base/error/IActivityDomainError;", "Lcom/paypal/oslo/feature/activity/graphql/GetUserFilteredActivitiesQuery$Data;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.activity.data.repository.ledger.source.ActivityWidgetUserFilteredActivitiesPagingSourceImpl$getUserFilteredActivities$2", f = "ActivityWidgetUserFilteredActivitiesPagingSourceImpl.kt", i = {}, l = {137}, m = "invokeSuspend", n = {}, nl = {138}, s = {}, v = 2)
/* loaded from: classes10.dex */
final class ActivityWidgetUserFilteredActivitiesPagingSourceImpl$getUserFilteredActivities$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.activity.domain.base.error.IActivityDomainError, ? extends com.paypal.oslo.feature.activity.graphql.GetUserFilteredActivitiesQuery.Data>>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.activity.graphql.GetUserFilteredActivitiesQuery getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.activity.data.repository.ledger.source.ActivityWidgetUserFilteredActivitiesPagingSourceImpl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.Camera2StreamConfigurationMap = 1;
                obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(this.getHighSpeedVideoSizes.getApolloClient(), this.getHighSpeedVideoFpsRanges, (com.paypal.oslo.core.network.graphql.CallConfig) null, this, 2, (java.lang.Object) null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return com.paypal.oslo.feature.activity.domain.base.utils.ActivityGraphQLIorExtensionsKt.mapActivityGraphQL((arrow.core.Ior) obj, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.data.repository.ledger.source.ActivityWidgetUserFilteredActivitiesPagingSourceImpl$getUserFilteredActivities$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.data.repository.ledger.source.ActivityWidgetUserFilteredActivitiesPagingSourceImpl$getUserFilteredActivities$2.getHighSpeedVideoSizes((com.paypal.oslo.core.network.graphql.GraphQLData) obj2);
                }
            });
        } catch (java.lang.Exception e) {
            com.paypal.oslo.feature.activity.domain.base.utils.logs.ActivityLogUtils.INSTANCE.logRecentActivitiesException$activity_prodRelease("getUserFilteredActivities", e);
            return new arrow.core.Ior.Left(this.getHighSpeedVideoSizes.getErrorMapper().mapToDomainError(e));
        }
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.GetUserFilteredActivitiesQuery.Data getHighSpeedVideoSizes(com.paypal.oslo.core.network.graphql.GraphQLData graphQLData) {
        return (com.paypal.oslo.feature.activity.graphql.GetUserFilteredActivitiesQuery.Data) graphQLData.getData();
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.activity.domain.base.error.IActivityDomainError, ? extends com.paypal.oslo.feature.activity.graphql.GetUserFilteredActivitiesQuery.Data>> continuation) {
        return ((com.paypal.oslo.feature.activity.data.repository.ledger.source.ActivityWidgetUserFilteredActivitiesPagingSourceImpl$getUserFilteredActivities$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.activity.data.repository.ledger.source.ActivityWidgetUserFilteredActivitiesPagingSourceImpl$getUserFilteredActivities$2(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActivityWidgetUserFilteredActivitiesPagingSourceImpl$getUserFilteredActivities$2(com.paypal.oslo.feature.activity.data.repository.ledger.source.ActivityWidgetUserFilteredActivitiesPagingSourceImpl activityWidgetUserFilteredActivitiesPagingSourceImpl, com.paypal.oslo.feature.activity.graphql.GetUserFilteredActivitiesQuery getUserFilteredActivitiesQuery, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.activity.data.repository.ledger.source.ActivityWidgetUserFilteredActivitiesPagingSourceImpl$getUserFilteredActivities$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = activityWidgetUserFilteredActivitiesPagingSourceImpl;
        this.getHighSpeedVideoFpsRanges = getUserFilteredActivitiesQuery;
    }
}
