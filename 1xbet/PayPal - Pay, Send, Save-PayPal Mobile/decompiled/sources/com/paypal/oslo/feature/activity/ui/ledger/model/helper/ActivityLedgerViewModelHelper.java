package com.paypal.oslo.feature.activity.ui.ledger.model.helper;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0080@¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0080@¢\u0006\u0004\b\u000f\u0010\u0010J9\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00122\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00162\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0019H\u0000¢\u0006\u0002\b\u001a¨\u0006\u001b²\u0006\n\u0010\u001c\u001a\u00020\u001dX\u008a\u0084\u0002²\u0006\n\u0010\u001c\u001a\u00020\u001dX\u008a\u0084\u0002²\u0006\n\u0010\u001c\u001a\u00020\u001dX\u008a\u0084\u0002"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/ledger/model/helper/ActivityLedgerViewModelHelper;", "", "<init>", "()V", "fetchLedgerFilterItems", "Lcom/paypal/oslo/feature/activity/domain/base/state/ActivityUiState;", "activityFilterType", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;", "activityLedgerFilterUseCase", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/ActivityLedgerFilterUseCase;", "fetchLedgerFilterItems$activity_prodRelease", "(Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/ActivityLedgerFilterUseCase;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchLedgerItems", "activityLedgerUseCase", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/ActivityLedgerUseCase;", "fetchLedgerItems$activity_prodRelease", "(Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/ActivityLedgerUseCase;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchCompletedLedgerItems", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem;", "cursor", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "activityLedgerUserActivitiesPaginationUseCase", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/ActivityLedgerUserActivitiesPaginationUseCase;", "fetchCompletedLedgerItems$activity_prodRelease", "activity_prodRelease", "inputQueryType", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/mapper/ActivityLedgerUseCaseInputQueryType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityLedgerViewModelHelper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityLedgerViewModelHelper INSTANCE = new com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityLedgerViewModelHelper();

    private ActivityLedgerViewModelHelper() {
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object fetchLedgerFilterItems$activity_prodRelease(final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType activityFilterType, com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerFilterUseCase activityLedgerFilterUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState> continuation) {
        com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityLedgerViewModelHelper$fetchLedgerFilterItems$1 activityLedgerViewModelHelper$fetchLedgerFilterItems$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityLedgerViewModelHelper$fetchLedgerFilterItems$1) {
            activityLedgerViewModelHelper$fetchLedgerFilterItems$1 = (com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityLedgerViewModelHelper$fetchLedgerFilterItems$1) continuation;
            if ((activityLedgerViewModelHelper$fetchLedgerFilterItems$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                activityLedgerViewModelHelper$fetchLedgerFilterItems$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = activityLedgerViewModelHelper$fetchLedgerFilterItems$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = activityLedgerViewModelHelper$fetchLedgerFilterItems$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.Lazy lazy = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityLedgerViewModelHelper$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryType activityLedgerSectionsListWithFilters$activity_prodRelease;
                            activityLedgerSectionsListWithFilters$activity_prodRelease = com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityLedgerFiltersInputProvider.INSTANCE.getActivityLedgerSectionsListWithFilters$activity_prodRelease(com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.this);
                            return activityLedgerSectionsListWithFilters$activity_prodRelease;
                        }
                    });
                    com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryType activityLedgerUseCaseInputQueryType = (com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryType) lazy.getValue();
                    activityLedgerViewModelHelper$fetchLedgerFilterItems$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(activityFilterType);
                    activityLedgerViewModelHelper$fetchLedgerFilterItems$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(activityLedgerFilterUseCase);
                    activityLedgerViewModelHelper$fetchLedgerFilterItems$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(lazy);
                    activityLedgerViewModelHelper$fetchLedgerFilterItems$1.getHighSpeedVideoSizes = 1;
                    obj = activityLedgerFilterUseCase.invoke(activityLedgerUseCaseInputQueryType, activityFilterType, activityLedgerViewModelHelper$fetchLedgerFilterItems$1);
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
                if (!(either instanceof arrow.core.Either.Right)) {
                    return new com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState.Success((com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult) ((arrow.core.Either.Right) either).getValue());
                }
                if (either instanceof arrow.core.Either.Left) {
                    return new com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState.Failure((com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult) ((arrow.core.Either.Left) either).getValue());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        activityLedgerViewModelHelper$fetchLedgerFilterItems$1 = new com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityLedgerViewModelHelper$fetchLedgerFilterItems$1(this, continuation);
        java.lang.Object obj2 = activityLedgerViewModelHelper$fetchLedgerFilterItems$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = activityLedgerViewModelHelper$fetchLedgerFilterItems$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        either = ((arrow.core.Ior) obj2).toEither();
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object fetchLedgerItems$activity_prodRelease(com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerUseCase activityLedgerUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState> continuation) {
        com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityLedgerViewModelHelper$fetchLedgerItems$1 activityLedgerViewModelHelper$fetchLedgerItems$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityLedgerViewModelHelper$fetchLedgerItems$1) {
            activityLedgerViewModelHelper$fetchLedgerItems$1 = (com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityLedgerViewModelHelper$fetchLedgerItems$1) continuation;
            if ((activityLedgerViewModelHelper$fetchLedgerItems$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                activityLedgerViewModelHelper$fetchLedgerItems$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = activityLedgerViewModelHelper$fetchLedgerItems$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = activityLedgerViewModelHelper$fetchLedgerItems$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.Lazy lazy = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityLedgerViewModelHelper$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryType activityLedgerSectionsListWithFilters$activity_prodRelease;
                            activityLedgerSectionsListWithFilters$activity_prodRelease = com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityLedgerFiltersInputProvider.INSTANCE.getActivityLedgerSectionsListWithFilters$activity_prodRelease(new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Default(null, 1, null));
                            return activityLedgerSectionsListWithFilters$activity_prodRelease;
                        }
                    });
                    com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryType activityLedgerUseCaseInputQueryType = (com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryType) lazy.getValue();
                    activityLedgerViewModelHelper$fetchLedgerItems$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(activityLedgerUseCase);
                    activityLedgerViewModelHelper$fetchLedgerItems$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(lazy);
                    activityLedgerViewModelHelper$fetchLedgerItems$1.getHighSpeedVideoFpsRanges = 1;
                    obj = activityLedgerUseCase.invoke(activityLedgerUseCaseInputQueryType, activityLedgerViewModelHelper$fetchLedgerItems$1);
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
                if (!(either instanceof arrow.core.Either.Right)) {
                    return new com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState.Success((com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult) ((arrow.core.Either.Right) either).getValue());
                }
                if (either instanceof arrow.core.Either.Left) {
                    return new com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState.Failure((com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult) ((arrow.core.Either.Left) either).getValue());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        activityLedgerViewModelHelper$fetchLedgerItems$1 = new com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityLedgerViewModelHelper$fetchLedgerItems$1(this, continuation);
        java.lang.Object obj2 = activityLedgerViewModelHelper$fetchLedgerItems$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = activityLedgerViewModelHelper$fetchLedgerItems$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        either = ((arrow.core.Ior) obj2).toEither();
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }

    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem>> fetchCompletedLedgerItems$activity_prodRelease(kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> cursor, final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType activityFilterType, com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerUserActivitiesPaginationUseCase activityLedgerUserActivitiesPaginationUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cursor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityFilterType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityLedgerUserActivitiesPaginationUseCase, "");
        return activityLedgerUserActivitiesPaginationUseCase.invoke(cursor, (com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryType) kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityLedgerViewModelHelper$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                com.paypal.oslo.feature.activity.domain.usecase.ledger.mapper.ActivityLedgerUseCaseInputQueryType.ActivityLedgerPaginationQueryType completedActivityItems$activity_prodRelease;
                completedActivityItems$activity_prodRelease = com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityLedgerDefaultFilterInputProvider.INSTANCE.getCompletedActivityItems$activity_prodRelease(com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.this);
                return completedActivityItems$activity_prodRelease;
            }
        }).getValue());
    }
}
