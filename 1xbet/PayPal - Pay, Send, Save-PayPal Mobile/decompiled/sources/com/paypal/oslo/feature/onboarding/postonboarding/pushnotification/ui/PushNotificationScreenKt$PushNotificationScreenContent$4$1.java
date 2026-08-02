package com.paypal.oslo.feature.onboarding.postonboarding.pushnotification.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.onboarding.postonboarding.pushnotification.ui.PushNotificationScreenKt$PushNotificationScreenContent$4$1", f = "PushNotificationScreen.kt", i = {}, l = {157}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class PushNotificationScreenKt$PushNotificationScreenContent$4$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.pushnotification.api.optin.PushOptInState Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Transition, kotlin.Unit> getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ boolean getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Next next;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (!this.getHighSpeedVideoSizes) {
                this.getHighResolutionOutputSizeshNQ4ISI.invoke(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
                this.Camera2StreamConfigurationMap.requestPermission();
                this.getHighSpeedVideoFpsRangesFor = 1;
                obj = kotlinx.coroutines.flow.FlowKt.firstOrNull(this.Camera2StreamConfigurationMap.getResultFlow(), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return kotlin.Unit.INSTANCE;
        }
        if (i != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.pushnotification.api.optin.PushOptInResult pushOptInResult = (com.paypal.oslo.feature.pushnotification.api.optin.PushOptInResult) obj;
        if (kotlin.jvm.internal.Intrinsics.areEqual(pushOptInResult, com.paypal.oslo.feature.pushnotification.api.optin.PushOptInResult.Granted.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(pushOptInResult, com.paypal.oslo.feature.pushnotification.api.optin.PushOptInResult.NotRequired.INSTANCE)) {
            next = new com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Next(null, false, 3, null);
        } else {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(pushOptInResult, com.paypal.oslo.feature.pushnotification.api.optin.PushOptInResult.Denied.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(pushOptInResult, com.paypal.oslo.feature.pushnotification.api.optin.PushOptInResult.RequiresSettings.INSTANCE) && pushOptInResult != null) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            next = new com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Skip(false, 1, null);
        }
        this.getHighSpeedVideoFpsRanges.invoke(next);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.onboarding.postonboarding.pushnotification.ui.PushNotificationScreenKt$PushNotificationScreenContent$4$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.onboarding.postonboarding.pushnotification.ui.PushNotificationScreenKt$PushNotificationScreenContent$4$1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PushNotificationScreenKt$PushNotificationScreenContent$4$1(boolean z, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1, com.paypal.oslo.feature.pushnotification.api.optin.PushOptInState pushOptInState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Transition, kotlin.Unit> function12, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.postonboarding.pushnotification.ui.PushNotificationScreenKt$PushNotificationScreenContent$4$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = z;
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
        this.Camera2StreamConfigurationMap = pushOptInState;
        this.getHighSpeedVideoFpsRanges = function12;
    }
}
