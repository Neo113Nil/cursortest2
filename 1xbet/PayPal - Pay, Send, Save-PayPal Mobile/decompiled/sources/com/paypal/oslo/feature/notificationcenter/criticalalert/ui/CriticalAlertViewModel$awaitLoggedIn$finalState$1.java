package com.paypal.oslo.feature.notificationcenter.criticalalert.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "state", "Lcom/paypal/oslo/core/userstore/model/UserState;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertViewModel$awaitLoggedIn$finalState$1", f = "CriticalAlertViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class CriticalAlertViewModel$awaitLoggedIn$finalState$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.core.userstore.model.UserState, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.userstore.model.UserState userState = (com.paypal.oslo.core.userstore.model.UserState) this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertViewModel.access$isLoggedInState(this.getHighSpeedVideoSizes, userState) || (userState instanceof com.paypal.oslo.core.userstore.model.UserState.LoggedOut) || (userState instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileError));
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.core.userstore.model.UserState userState, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return ((com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertViewModel$awaitLoggedIn$finalState$1) create(userState, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertViewModel$awaitLoggedIn$finalState$1 criticalAlertViewModel$awaitLoggedIn$finalState$1 = new com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertViewModel$awaitLoggedIn$finalState$1(this.getHighSpeedVideoSizes, continuation);
        criticalAlertViewModel$awaitLoggedIn$finalState$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return criticalAlertViewModel$awaitLoggedIn$finalState$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CriticalAlertViewModel$awaitLoggedIn$finalState$1(com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertViewModel criticalAlertViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertViewModel$awaitLoggedIn$finalState$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = criticalAlertViewModel;
    }
}
