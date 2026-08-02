package com.paypal.oslo.feature.activity.ui.ledger.model;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel$invokeAction$1", f = "ActivityLedgerViewModel.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BANK_VALUE}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE}, s = {}, v = 2)
/* loaded from: classes10.dex */
final class ActivityLedgerViewModel$invokeAction$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerActionsUseCase activityLedgerActionsUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                activityLedgerActionsUseCase = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes;
                this.getHighSpeedVideoSizes = 1;
                obj = activityLedgerActionsUseCase.invoke(this.getHighResolutionOutputSizeshNQ4ISI, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            com.paypal.oslo.feature.activity.domain.base.result.ActivityActionResult activityActionResult = (com.paypal.oslo.feature.activity.domain.base.result.ActivityActionResult) obj;
            if (activityActionResult instanceof com.paypal.oslo.feature.activity.domain.base.result.ActivityActionResult.ActivityMutationsResult) {
                kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult, kotlin.Unit> function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel$invokeAction$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                final com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel = this.getHighSpeedVideoFpsRangesFor;
                com.paypal.oslo.feature.activity.ui.common.factory.ActivityMutationResultHelper.INSTANCE.setActivityMutationsResult$activity_prodRelease((com.paypal.oslo.feature.activity.domain.base.result.ActivityActionResult.ActivityMutationsResult) activityActionResult, function1, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel$invokeAction$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel$invokeAction$1.getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel.this);
                    }
                });
            }
        } catch (java.lang.Exception e) {
            com.paypal.oslo.feature.activity.domain.base.utils.logs.ActivityActionsLogUtils.INSTANCE.logActivityActionException$activity_prodRelease("invokeAction", e);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel) {
        activityLedgerViewModel.fetchActivityLedgerItems$activity_prodRelease(com.paypal.oslo.feature.activity.ui.ledger.model.extensions.ActivityLedgerViewModelExtensionsKt.getCurrentFilterTypeFromState(activityLedgerViewModel));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel$invokeAction$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel$invokeAction$1(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActivityLedgerViewModel$invokeAction$1(com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel, com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel$invokeAction$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = activityLedgerViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = activityActionModel;
    }
}
