package com.paypal.oslo.feature.identity.unifiedalert.data;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.unifiedalert.data.AlertsForegroundMonitor$fetchAndProcess$2", f = "AlertsForegroundMonitor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class AlertsForegroundMonitor$fetchAndProcess$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.identity.unifiedalert.domain.FetchCompletedAction getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.identity.unifiedalert.data.AlertsForegroundMonitor getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.navigation.AppNavigator appNavigator;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            appNavigator = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes;
            final com.paypal.oslo.feature.identity.unifiedalert.domain.FetchCompletedAction fetchCompletedAction = this.getHighSpeedVideoFpsRanges;
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.unifiedalert.data.AlertsForegroundMonitor$fetchAndProcess$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.identity.unifiedalert.data.AlertsForegroundMonitor$fetchAndProcess$2.Camera2StreamConfigurationMap(com.paypal.oslo.feature.identity.unifiedalert.domain.FetchCompletedAction.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
            return kotlin.Unit.INSTANCE;
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.feature.identity.unifiedalert.domain.FetchCompletedAction fetchCompletedAction, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        com.paypal.oslo.feature.identity.unifiedalert.domain.FetchCompletedAction.ShowAlert showAlert = (com.paypal.oslo.feature.identity.unifiedalert.domain.FetchCompletedAction.ShowAlert) fetchCompletedAction;
        navigationScope.pushIfNotCurrent(new com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertDestination(showAlert.getAlert(), showAlert.getSource()));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.unifiedalert.data.AlertsForegroundMonitor$fetchAndProcess$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.unifiedalert.data.AlertsForegroundMonitor$fetchAndProcess$2(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AlertsForegroundMonitor$fetchAndProcess$2(com.paypal.oslo.feature.identity.unifiedalert.data.AlertsForegroundMonitor alertsForegroundMonitor, com.paypal.oslo.feature.identity.unifiedalert.domain.FetchCompletedAction fetchCompletedAction, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.unifiedalert.data.AlertsForegroundMonitor$fetchAndProcess$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = alertsForegroundMonitor;
        this.getHighSpeedVideoFpsRanges = fetchCompletedAction;
    }
}
