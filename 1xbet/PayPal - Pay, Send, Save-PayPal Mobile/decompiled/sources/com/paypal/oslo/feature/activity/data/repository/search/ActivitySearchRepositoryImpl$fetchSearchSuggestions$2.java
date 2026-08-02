package com.paypal.oslo.feature.activity.data.repository.search;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/activity/domain/base/error/IActivityDomainError;", "Lcom/paypal/oslo/feature/activity/domain/search/remote/ActivitySearchSuggestionResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.activity.data.repository.search.ActivitySearchRepositoryImpl$fetchSearchSuggestions$2", f = "ActivitySearchRepositoryImpl.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, nl = {41}, s = {}, v = 2)
/* loaded from: classes10.dex */
final class ActivitySearchRepositoryImpl$fetchSearchSuggestions$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.activity.domain.base.error.IActivityDomainError, ? extends com.paypal.oslo.feature.activity.domain.search.remote.ActivitySearchSuggestionResult>>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.activity.data.repository.search.ActivitySearchRepositoryImpl getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.activity.graphql.GetActivitySearchSuggestionsQuery getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper iActivityErrorMapper;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return obj;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            this.Camera2StreamConfigurationMap = 1;
            java.lang.Object executeGraphQLQueryForResult$activity_prodRelease = this.getHighSpeedVideoFpsRanges.executeGraphQLQueryForResult$activity_prodRelease(this.getHighSpeedVideoFpsRangesFor, this);
            return executeGraphQLQueryForResult$activity_prodRelease == coroutine_suspended ? coroutine_suspended : executeGraphQLQueryForResult$activity_prodRelease;
        } catch (java.lang.Exception e) {
            com.paypal.oslo.feature.activity.domain.base.utils.logs.ActivityLogUtils.INSTANCE.logActivitySearchSuggestionsException$activity_prodRelease("fetchActivitySearchSuggestions", e);
            iActivityErrorMapper = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap;
            return new arrow.core.Ior.Left(iActivityErrorMapper.mapToDomainError(e));
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.activity.domain.base.error.IActivityDomainError, ? extends com.paypal.oslo.feature.activity.domain.search.remote.ActivitySearchSuggestionResult>> continuation) {
        return ((com.paypal.oslo.feature.activity.data.repository.search.ActivitySearchRepositoryImpl$fetchSearchSuggestions$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.activity.data.repository.search.ActivitySearchRepositoryImpl$fetchSearchSuggestions$2(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActivitySearchRepositoryImpl$fetchSearchSuggestions$2(com.paypal.oslo.feature.activity.data.repository.search.ActivitySearchRepositoryImpl activitySearchRepositoryImpl, com.paypal.oslo.feature.activity.graphql.GetActivitySearchSuggestionsQuery getActivitySearchSuggestionsQuery, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.activity.data.repository.search.ActivitySearchRepositoryImpl$fetchSearchSuggestions$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = activitySearchRepositoryImpl;
        this.getHighSpeedVideoFpsRangesFor = getActivitySearchSuggestionsQuery;
    }
}
