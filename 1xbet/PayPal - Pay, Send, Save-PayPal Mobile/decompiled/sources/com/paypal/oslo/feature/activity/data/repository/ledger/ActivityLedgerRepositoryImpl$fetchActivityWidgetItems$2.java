package com.paypal.oslo.feature.activity.data.repository.ledger;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/activity/domain/base/error/IActivityDomainError;", "Lcom/paypal/oslo/feature/activity/domain/widget/remote/ActivityWidgetResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.activity.data.repository.ledger.ActivityLedgerRepositoryImpl$fetchActivityWidgetItems$2", f = "ActivityLedgerRepositoryImpl.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE}, m = "invokeSuspend", n = {"$this$withContext"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PAUSE_VALUE}, s = {"L$0"}, v = 2)
/* loaded from: classes10.dex */
final class ActivityLedgerRepositoryImpl$fetchActivityWidgetItems$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.activity.domain.base.error.IActivityDomainError, ? extends com.paypal.oslo.feature.activity.domain.widget.remote.ActivityWidgetResult>>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.activity.data.repository.ledger.ActivityLedgerRepositoryImpl Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.activity.graphql.GetUserFilteredActivitiesQuery getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return obj;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRanges = coroutineScope;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            java.lang.Object executeGraphQLQueryForWidgetResult$activity_prodRelease = this.Camera2StreamConfigurationMap.executeGraphQLQueryForWidgetResult$activity_prodRelease(this.getHighSpeedVideoSizes, this);
            return executeGraphQLQueryForWidgetResult$activity_prodRelease == coroutine_suspended ? coroutine_suspended : executeGraphQLQueryForWidgetResult$activity_prodRelease;
        } catch (java.lang.Exception e) {
            java.lang.String simpleName = e.getClass().getSimpleName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(simpleName, "");
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.activity.LoggerKt.log;
            kotlin.Pair[] pairArr = new kotlin.Pair[5];
            pairArr[0] = kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.CLASS, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(coroutineScope.getClass()).getSimpleName());
            pairArr[1] = kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "fetchActivityWidgetItems");
            pairArr[2] = kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.ERROR_TYPE, simpleName);
            java.lang.String message = e.getMessage();
            pairArr[3] = kotlin.TuplesKt.to("error_message", message != null ? message : "");
            pairArr[4] = kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.STACK_TRACE, kotlin.ExceptionsKt.stackTraceToString(e));
            com.paypal.android.logger.Logger.d$default(logger, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.KEY_MESSAGE_EXCEPTION_FETCH_WIDGET_ITEMS, kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
            return new arrow.core.Ior.Left(this.Camera2StreamConfigurationMap.getActivityErrorMapper().mapToDomainError(e));
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.activity.domain.base.error.IActivityDomainError, ? extends com.paypal.oslo.feature.activity.domain.widget.remote.ActivityWidgetResult>> continuation) {
        return ((com.paypal.oslo.feature.activity.data.repository.ledger.ActivityLedgerRepositoryImpl$fetchActivityWidgetItems$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.activity.data.repository.ledger.ActivityLedgerRepositoryImpl$fetchActivityWidgetItems$2 activityLedgerRepositoryImpl$fetchActivityWidgetItems$2 = new com.paypal.oslo.feature.activity.data.repository.ledger.ActivityLedgerRepositoryImpl$fetchActivityWidgetItems$2(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
        activityLedgerRepositoryImpl$fetchActivityWidgetItems$2.getHighSpeedVideoFpsRanges = obj;
        return activityLedgerRepositoryImpl$fetchActivityWidgetItems$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActivityLedgerRepositoryImpl$fetchActivityWidgetItems$2(com.paypal.oslo.feature.activity.data.repository.ledger.ActivityLedgerRepositoryImpl activityLedgerRepositoryImpl, com.paypal.oslo.feature.activity.graphql.GetUserFilteredActivitiesQuery getUserFilteredActivitiesQuery, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.activity.data.repository.ledger.ActivityLedgerRepositoryImpl$fetchActivityWidgetItems$2> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = activityLedgerRepositoryImpl;
        this.getHighSpeedVideoSizes = getUserFilteredActivitiesQuery;
    }
}
