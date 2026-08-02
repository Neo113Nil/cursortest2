package com.paypal.oslo.feature.activity.data.repository.detail;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/activity/domain/base/error/IActivityDomainError;", "Lcom/paypal/oslo/feature/activity/domain/detail/remote/ActivityTransactionDetailResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.activity.data.repository.detail.ActivityTransactionDetailRepositoryImpl$fetchActivityDetailResult$2", f = "ActivityTransactionDetailRepositoryImpl.kt", i = {0, 0, 0}, l = {64}, m = "invokeSuspend", n = {"$this$withContext", "packageInputData", "activityDetailsQuery"}, nl = {65}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes10.dex */
final class ActivityTransactionDetailRepositoryImpl$fetchActivityDetailResult$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.activity.domain.base.error.IActivityDomainError, ? extends com.paypal.oslo.feature.activity.domain.detail.remote.ActivityTransactionDetailResult>>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.activity.api.models.ActivityTransactionDto getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.activity.data.repository.detail.ActivityTransactionDetailRepositoryImpl getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        java.lang.Class<?> cls;
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.paypal.oslo.feature.activity.data.repository.detail.PackageInputWithSkipFlag shipmentPackageInput$activity_prodRelease = this.getHighSpeedVideoFpsRanges.getShipmentPackageInput$activity_prodRelease(this.getHighResolutionOutputSizeshNQ4ISI);
                com.paypal.oslo.api.graphql.schema.type.ActivityDetailsInput activityQueriesInput$activity_prodRelease = this.getHighSpeedVideoFpsRanges.getActivityQueriesInput$activity_prodRelease(this.getHighResolutionOutputSizeshNQ4ISI);
                com.paypal.oslo.api.graphql.schema.type.ActivityShipmentPackagesInput input = shipmentPackageInput$activity_prodRelease.getInput();
                boolean skipPackages = shipmentPackageInput$activity_prodRelease.getSkipPackages();
                com.paypal.oslo.api.graphql.schema.type.TransactionRewardSummaryInput transactionRewardQueryInput$activity_prodRelease = this.getHighSpeedVideoFpsRanges.getTransactionRewardQueryInput$activity_prodRelease(this.getHighResolutionOutputSizeshNQ4ISI);
                com.paypal.oslo.feature.activity.data.repository.detail.ActivityTransactionDetailRepositoryImpl activityTransactionDetailRepositoryImpl = this.getHighSpeedVideoFpsRanges;
                com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery getActivityDetailsQuery = new com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery(activityQueriesInput$activity_prodRelease, input, skipPackages, transactionRewardQueryInput$activity_prodRelease, activityTransactionDetailRepositoryImpl.skipPromotionQueryForRewards$activity_prodRelease(this.getHighResolutionOutputSizeshNQ4ISI, activityTransactionDetailRepositoryImpl.getActivityFeatureManager()), this.getHighSpeedVideoFpsRanges.skipRelationshipQuery$activity_prodRelease(this.getHighResolutionOutputSizeshNQ4ISI));
                this.getHighSpeedVideoSizesFor = coroutineScope;
                this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(shipmentPackageInput$activity_prodRelease);
                this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getActivityDetailsQuery);
                this.getHighSpeedVideoSizes = 1;
                obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(this.getHighSpeedVideoFpsRanges.getApolloClient(), getActivityDetailsQuery, (com.paypal.oslo.core.network.graphql.CallConfig) null, this, 2, (java.lang.Object) null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            final com.paypal.oslo.feature.activity.data.repository.detail.ActivityTransactionDetailRepositoryImpl activityTransactionDetailRepositoryImpl2 = this.getHighSpeedVideoFpsRanges;
            return com.paypal.oslo.feature.activity.domain.base.utils.ActivityGraphQLIorExtensionsKt.mapActivityGraphQL((arrow.core.Ior) obj, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.data.repository.detail.ActivityTransactionDetailRepositoryImpl$fetchActivityDetailResult$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    com.paypal.oslo.feature.activity.domain.detail.remote.ActivityTransactionDetailResult access$getActivityDetailDomainResult;
                    access$getActivityDetailDomainResult = com.paypal.oslo.feature.activity.data.repository.detail.ActivityTransactionDetailRepositoryImpl.access$getActivityDetailDomainResult(com.paypal.oslo.feature.activity.data.repository.detail.ActivityTransactionDetailRepositoryImpl.this, (com.paypal.oslo.core.network.graphql.GraphQLData) obj2);
                    return access$getActivityDetailDomainResult;
                }
            });
        } catch (java.lang.Exception e) {
            java.lang.String simpleName = e.getClass().getSimpleName();
            java.lang.Throwable cause = e.getCause();
            if (cause == null || (cls = cause.getClass()) == null || (str = cls.getSimpleName()) == null) {
                str = "none";
            }
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.activity.LoggerKt.log;
            kotlin.Pair[] pairArr = new kotlin.Pair[6];
            pairArr[0] = kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.CLASS, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(coroutineScope.getClass()).getSimpleName());
            pairArr[1] = kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "fetchActivityDetailResult");
            pairArr[2] = kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.ERROR_TYPE, simpleName);
            pairArr[3] = kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.ROOT_CAUSE, str);
            java.lang.String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            pairArr[4] = kotlin.TuplesKt.to("error_message", message);
            pairArr[5] = kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.STACK_TRACE, kotlin.ExceptionsKt.stackTraceToString(e));
            com.paypal.android.logger.Logger.d$default(logger, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.KEY_MESSAGE_EXCEPTION_ACTIVITY_DETAIL_ERROR_OCCURRED, kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
            return new arrow.core.Ior.Left(this.getHighSpeedVideoFpsRanges.getActivityErrorMapper().mapToDomainError(e));
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.activity.domain.base.error.IActivityDomainError, ? extends com.paypal.oslo.feature.activity.domain.detail.remote.ActivityTransactionDetailResult>> continuation) {
        return ((com.paypal.oslo.feature.activity.data.repository.detail.ActivityTransactionDetailRepositoryImpl$fetchActivityDetailResult$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.activity.data.repository.detail.ActivityTransactionDetailRepositoryImpl$fetchActivityDetailResult$2 activityTransactionDetailRepositoryImpl$fetchActivityDetailResult$2 = new com.paypal.oslo.feature.activity.data.repository.detail.ActivityTransactionDetailRepositoryImpl$fetchActivityDetailResult$2(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        activityTransactionDetailRepositoryImpl$fetchActivityDetailResult$2.getHighSpeedVideoSizesFor = obj;
        return activityTransactionDetailRepositoryImpl$fetchActivityDetailResult$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActivityTransactionDetailRepositoryImpl$fetchActivityDetailResult$2(com.paypal.oslo.feature.activity.data.repository.detail.ActivityTransactionDetailRepositoryImpl activityTransactionDetailRepositoryImpl, com.paypal.oslo.feature.activity.api.models.ActivityTransactionDto activityTransactionDto, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.activity.data.repository.detail.ActivityTransactionDetailRepositoryImpl$fetchActivityDetailResult$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = activityTransactionDetailRepositoryImpl;
        this.getHighResolutionOutputSizeshNQ4ISI = activityTransactionDto;
    }
}
