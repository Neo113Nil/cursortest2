package com.paypal.oslo.feature.activity.domain.usecase.search;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/usecase/search/ActivitySuggestionUseCase;", "", "Lcom/paypal/oslo/feature/activity/domain/repository/search/IActivitySearchRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/repository/search/IActivitySearchRepository;)V", "Lcom/paypal/oslo/api/graphql/schema/type/ActivitySearchSuggestionsInput;", "queryInput", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityNetworkFailureResult;", "Lcom/paypal/oslo/feature/activity/domain/base/result/ActivityNetworkSuccessResult;", "invoke", "(Lcom/paypal/oslo/api/graphql/schema/type/ActivitySearchSuggestionsInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/activity/domain/repository/search/IActivitySearchRepository;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivitySuggestionUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.activity.domain.repository.search.IActivitySearchRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public ActivitySuggestionUseCase(com.paypal.oslo.feature.activity.domain.repository.search.IActivitySearchRepository iActivitySearchRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iActivitySearchRepository, "");
        this.getHighSpeedVideoFpsRangesFor = iActivitySearchRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(com.paypal.oslo.api.graphql.schema.type.ActivitySearchSuggestionsInput activitySearchSuggestionsInput, kotlin.coroutines.Continuation<? super arrow.core.Ior<com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult, com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult>> continuation) {
        com.paypal.oslo.feature.activity.domain.usecase.search.ActivitySuggestionUseCase$invoke$1 activitySuggestionUseCase$invoke$1;
        int i;
        arrow.core.Either either;
        arrow.core.Either.Right right;
        if (continuation instanceof com.paypal.oslo.feature.activity.domain.usecase.search.ActivitySuggestionUseCase$invoke$1) {
            activitySuggestionUseCase$invoke$1 = (com.paypal.oslo.feature.activity.domain.usecase.search.ActivitySuggestionUseCase$invoke$1) continuation;
            if ((activitySuggestionUseCase$invoke$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                activitySuggestionUseCase$invoke$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = activitySuggestionUseCase$invoke$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = activitySuggestionUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.activity.graphql.GetActivitySearchSuggestionsQuery getActivitySearchSuggestionsQuery = new com.paypal.oslo.feature.activity.graphql.GetActivitySearchSuggestionsQuery(activitySearchSuggestionsInput);
                    com.paypal.oslo.feature.activity.domain.repository.search.IActivitySearchRepository iActivitySearchRepository = this.getHighSpeedVideoFpsRangesFor;
                    activitySuggestionUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(activitySearchSuggestionsInput);
                    activitySuggestionUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getActivitySearchSuggestionsQuery);
                    activitySuggestionUseCase$invoke$1.getHighSpeedVideoFpsRanges = 1;
                    obj = iActivitySearchRepository.fetchSearchSuggestions(getActivitySearchSuggestionsQuery, activitySuggestionUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = ((arrow.core.Ior) obj).toEither();
                if (!(either instanceof arrow.core.Either.Left)) {
                    right = new arrow.core.Either.Left(new com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult(null, com.paypal.oslo.feature.activity.domain.base.error.ActivityErrorUIModelKt.toDomainErrorUIModel((com.paypal.oslo.feature.activity.domain.base.error.IActivityDomainError) ((arrow.core.Either.Left) either).getValue()), 1, null));
                } else {
                    if (!(either instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                if (!(right instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.activity.domain.search.remote.ActivitySearchSuggestionResult activitySearchSuggestionResult = (com.paypal.oslo.feature.activity.domain.search.remote.ActivitySearchSuggestionResult) ((arrow.core.Either.Right) right).getValue();
                    activitySearchSuggestionResult.transformToDomainResult$activity_prodRelease();
                    right = new arrow.core.Either.Right(new com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult(activitySearchSuggestionResult));
                } else if (!(right instanceof arrow.core.Either.Left)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return right.toIor();
            }
        }
        activitySuggestionUseCase$invoke$1 = new com.paypal.oslo.feature.activity.domain.usecase.search.ActivitySuggestionUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = activitySuggestionUseCase$invoke$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = activitySuggestionUseCase$invoke$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        either = ((arrow.core.Ior) obj2).toEither();
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        if (!(right instanceof arrow.core.Either.Right)) {
        }
        return right.toIor();
    }
}
