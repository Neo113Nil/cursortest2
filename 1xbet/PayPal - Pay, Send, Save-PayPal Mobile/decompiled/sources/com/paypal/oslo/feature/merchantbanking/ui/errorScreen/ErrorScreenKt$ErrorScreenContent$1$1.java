package com.paypal.oslo.feature.merchantbanking.ui.errorScreen;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenKt$ErrorScreenContent$1$1", f = "ErrorScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class ErrorScreenKt$ErrorScreenContent$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext uIContext = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(com.paypal.oslo.feature.merchantbanking.api.analytics.MerchantBankingAnalytics.ErrorScreen.IDENTIFIER), null, null, null, 14, null);
        com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext screenShownAction = com.paypal.oslo.feature.merchantbanking.api.analytics.MerchantBankingAnalytics.INSTANCE.getScreenShownAction();
        java.lang.String lowerCase = this.getHighSpeedVideoFpsRangesFor.name().toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ScreenAvailable(uIContext, screenShownAction, new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext(lowerCase, null, this.Camera2StreamConfigurationMap), null, null, 24, null).track(com.paypal.oslo.feature.merchantbanking.AnalyticsTrackerKt.analyticsTracker);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenKt$ErrorScreenContent$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenKt$ErrorScreenContent$1$1(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ErrorScreenKt$ErrorScreenContent$1$1(com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum errorScreenTypeEnum, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenKt$ErrorScreenContent$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = errorScreenTypeEnum;
        this.Camera2StreamConfigurationMap = str;
    }
}
