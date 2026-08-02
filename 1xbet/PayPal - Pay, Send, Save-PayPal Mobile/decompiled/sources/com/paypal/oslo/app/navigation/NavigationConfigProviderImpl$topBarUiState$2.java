package com.paypal.oslo.app.navigation;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/paypal/oslo/app/navigation/TopBarUiState;", "state", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, ""}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.app.navigation.NavigationConfigProviderImpl$topBarUiState$2", f = "NavigationConfigProviderImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes4.dex */
final class NavigationConfigProviderImpl$topBarUiState$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<com.paypal.oslo.app.navigation.TopBarUiState, java.lang.Integer, kotlin.coroutines.Continuation<? super com.paypal.oslo.app.navigation.TopBarUiState>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    /* synthetic */ int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.app.navigation.TopBarUiState topBarUiState = (com.paypal.oslo.app.navigation.TopBarUiState) this.getHighSpeedVideoFpsRangesFor;
        int i = this.getHighSpeedVideoFpsRanges;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        return com.paypal.oslo.app.navigation.TopBarUiState.copy$default(topBarUiState, false, null, null, i, false, 23, null);
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.app.navigation.TopBarUiState topBarUiState, java.lang.Integer num, kotlin.coroutines.Continuation<? super com.paypal.oslo.app.navigation.TopBarUiState> continuation) {
        int intValue = num.intValue();
        com.paypal.oslo.app.navigation.NavigationConfigProviderImpl$topBarUiState$2 navigationConfigProviderImpl$topBarUiState$2 = new com.paypal.oslo.app.navigation.NavigationConfigProviderImpl$topBarUiState$2(continuation);
        navigationConfigProviderImpl$topBarUiState$2.getHighSpeedVideoFpsRangesFor = topBarUiState;
        navigationConfigProviderImpl$topBarUiState$2.getHighSpeedVideoFpsRanges = intValue;
        return navigationConfigProviderImpl$topBarUiState$2.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    NavigationConfigProviderImpl$topBarUiState$2(kotlin.coroutines.Continuation<? super com.paypal.oslo.app.navigation.NavigationConfigProviderImpl$topBarUiState$2> continuation) {
        super(3, continuation);
    }
}
