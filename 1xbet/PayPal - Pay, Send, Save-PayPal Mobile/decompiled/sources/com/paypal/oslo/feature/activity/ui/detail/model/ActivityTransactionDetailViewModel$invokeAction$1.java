package com.paypal.oslo.feature.activity.ui.detail.model;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel$invokeAction$1", f = "ActivityTransactionDetailViewModel.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE}, m = "invokeSuspend", n = {}, nl = {125}, s = {}, v = 2)
/* loaded from: classes10.dex */
final class ActivityTransactionDetailViewModel$invokeAction$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.activity.domain.usecase.detail.ActivityDetailActionsUseCase activityDetailActionsUseCase;
        com.paypal.oslo.feature.activity.domain.base.result.ActivityActionResult activityActionResult;
        java.util.Set<com.paypal.oslo.api.graphql.schema.type.ActivityActionType> actions;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        boolean z = true;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                activityDetailActionsUseCase = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes;
                this.getHighSpeedVideoSizes = 1;
                obj = activityDetailActionsUseCase.invoke(this.getHighResolutionOutputSizeshNQ4ISI, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            activityActionResult = (com.paypal.oslo.feature.activity.domain.base.result.ActivityActionResult) obj;
        } catch (java.lang.Exception e) {
            com.paypal.oslo.feature.activity.domain.base.utils.logs.ActivityActionsLogUtils.INSTANCE.logActivityActionException$activity_prodRelease("invokeAction", e);
        }
        if (activityActionResult instanceof com.paypal.oslo.feature.activity.domain.base.result.ActivityActionResult.ActivityNavigationResult) {
            com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType data = ((com.paypal.oslo.feature.activity.domain.base.result.ActivityActionResult.ActivityNavigationResult) activityActionResult).getData();
            actions = data != null ? data.getActions() : null;
            if (actions == null) {
                actions = kotlin.collections.SetsKt.emptySet();
            }
            java.util.Set<com.paypal.oslo.api.graphql.schema.type.ActivityActionType> set = actions;
            if (!(set instanceof java.util.Collection) || !set.isEmpty()) {
                java.util.Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    if (kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.api.graphql.schema.type.ActivityActionType.PAY).contains((com.paypal.oslo.api.graphql.schema.type.ActivityActionType) it.next())) {
                        break;
                    }
                }
            }
            z = false;
            this.getHighSpeedVideoFpsRanges.setNeedsLedgerRefresh$activity_prodRelease(z);
            return kotlin.Unit.INSTANCE;
        }
        if (activityActionResult instanceof com.paypal.oslo.feature.activity.domain.base.result.ActivityActionResult.ActivityWebKitResult) {
            com.paypal.oslo.feature.activity.domain.common.models.ActivityActionNavigationType data2 = ((com.paypal.oslo.feature.activity.domain.base.result.ActivityActionResult.ActivityWebKitResult) activityActionResult).getData();
            actions = data2 != null ? data2.getActions() : null;
            if (actions == null) {
                actions = kotlin.collections.SetsKt.emptySet();
            }
            java.util.Set<com.paypal.oslo.api.graphql.schema.type.ActivityActionType> set2 = actions;
            if (!(set2 instanceof java.util.Collection) || !set2.isEmpty()) {
                java.util.Iterator<T> it2 = set2.iterator();
                while (it2.hasNext()) {
                    if (kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.ActivityActionType[]{com.paypal.oslo.api.graphql.schema.type.ActivityActionType.CANCEL, com.paypal.oslo.api.graphql.schema.type.ActivityActionType.REFUND}).contains((com.paypal.oslo.api.graphql.schema.type.ActivityActionType) it2.next())) {
                        break;
                    }
                }
            }
        }
        z = false;
        this.getHighSpeedVideoFpsRanges.setNeedsLedgerRefresh$activity_prodRelease(z);
        return kotlin.Unit.INSTANCE;
        com.paypal.oslo.feature.activity.domain.base.utils.logs.ActivityActionsLogUtils.INSTANCE.logActivityActionException$activity_prodRelease("invokeAction", e);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel$invokeAction$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel$invokeAction$1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActivityTransactionDetailViewModel$invokeAction$1(com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel activityTransactionDetailViewModel, com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel$invokeAction$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = activityTransactionDetailViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = activityActionModel;
    }
}
