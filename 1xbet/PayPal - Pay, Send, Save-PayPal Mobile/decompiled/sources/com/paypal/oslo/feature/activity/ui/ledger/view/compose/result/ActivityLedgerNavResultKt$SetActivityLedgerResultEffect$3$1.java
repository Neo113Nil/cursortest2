package com.paypal.oslo.feature.activity.ui.ledger.view.compose.result;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/packagetracking/api/navigation/result/PackageSettingsNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.activity.ui.ledger.view.compose.result.ActivityLedgerNavResultKt$SetActivityLedgerResultEffect$3$1", f = "ActivityLedgerNavResult.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes10.dex */
final class ActivityLedgerNavResultKt$SetActivityLedgerResultEffect$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.packagetracking.api.navigation.result.PackageSettingsNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.packagetracking.api.navigation.result.PackageSettingsNavResult packageSettingsNavResult = (com.paypal.oslo.feature.packagetracking.api.navigation.result.PackageSettingsNavResult) this.getHighSpeedVideoFpsRanges;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (packageSettingsNavResult.getLinkStateChanged()) {
            if (this.getHighResolutionOutputSizeshNQ4ISI.getLedgerScreenState$activity_prodRelease().getValue() instanceof com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState.LedgerInitialState) {
                com.paypal.oslo.feature.activity.ui.ledger.view.compose.result.ActivityLedgerNavResultKt.reloadActivityLedgerBasedOnState(this.getHighResolutionOutputSizeshNQ4ISI);
            } else {
                this.getHighResolutionOutputSizeshNQ4ISI.refreshEmailLinkStatus$activity_prodRelease();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.packagetracking.api.navigation.result.PackageSettingsNavResult packageSettingsNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.activity.ui.ledger.view.compose.result.ActivityLedgerNavResultKt$SetActivityLedgerResultEffect$3$1) create(packageSettingsNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.activity.ui.ledger.view.compose.result.ActivityLedgerNavResultKt$SetActivityLedgerResultEffect$3$1 activityLedgerNavResultKt$SetActivityLedgerResultEffect$3$1 = new com.paypal.oslo.feature.activity.ui.ledger.view.compose.result.ActivityLedgerNavResultKt$SetActivityLedgerResultEffect$3$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        activityLedgerNavResultKt$SetActivityLedgerResultEffect$3$1.getHighSpeedVideoFpsRanges = obj;
        return activityLedgerNavResultKt$SetActivityLedgerResultEffect$3$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActivityLedgerNavResultKt$SetActivityLedgerResultEffect$3$1(com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.activity.ui.ledger.view.compose.result.ActivityLedgerNavResultKt$SetActivityLedgerResultEffect$3$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = activityLedgerViewModel;
    }
}
