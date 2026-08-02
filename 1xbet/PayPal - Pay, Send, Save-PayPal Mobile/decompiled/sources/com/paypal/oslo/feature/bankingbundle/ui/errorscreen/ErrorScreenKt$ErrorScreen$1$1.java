package com.paypal.oslo.feature.bankingbundle.ui.errorscreen;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bankingbundle.ui.errorscreen.ErrorScreenKt$ErrorScreen$1$1", f = "ErrorScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class ErrorScreenKt$ErrorScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.bankingbundle.ui.errorscreen.ErrorScreenTypeEnum getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.bankingbundle.domain.error.ErrorDetail getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0068, code lost:
    
        if (r1 == null) goto L8;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.List emptyList;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext uIContext = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(com.paypal.oslo.feature.bankingbundle.api.analytics.BankingBundleAnalytics.ErrorScreen.IDENTIFIER), null, null, null, 14, null);
        com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext screenShownAction = com.paypal.oslo.feature.bankingbundle.api.analytics.BankingBundleAnalytics.INSTANCE.getScreenShownAction();
        java.lang.String name2 = this.getHighSpeedVideoFpsRanges.name();
        java.util.Locale locale = java.util.Locale.ROOT;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String lowerCase = name2.toLowerCase(locale);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext navigationContext = new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext(lowerCase, null, this.getHighSpeedVideoFpsRangesFor);
        com.paypal.oslo.feature.bankingbundle.domain.error.ErrorDetail errorDetail = this.getHighSpeedVideoSizes;
        if (errorDetail != null) {
            com.paypal.oslo.feature.bankingbundle.ui.errorscreen.ErrorScreenTypeEnum errorScreenTypeEnum = this.getHighSpeedVideoFpsRanges;
            java.lang.String code = errorDetail.getCode();
            java.lang.String message = errorDetail.getMessage();
            java.lang.String name3 = errorScreenTypeEnum.name();
            java.util.Locale locale2 = java.util.Locale.ROOT;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale2, "");
            java.lang.String lowerCase2 = name3.toLowerCase(locale2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            emptyList = kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext(code, message, lowerCase2, "api_call"));
        }
        emptyList = kotlin.collections.CollectionsKt.emptyList();
        new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ScreenAvailable(uIContext, screenShownAction, navigationContext, null, emptyList, 8, null).track(com.paypal.oslo.feature.bankingbundle.AnalyticsTrackerKt.analyticsTracker);
        new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ScreenAvailable(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(com.paypal.oslo.feature.bankingbundle.api.analytics.BankingBundleAnalytics.ErrorScreen.IDENTIFIER), null, null, null, 14, null), com.paypal.oslo.feature.bankingbundle.api.analytics.BankingBundleAnalytics.INSTANCE.getScreenLoadedAction(), null, null, null, 28, null).track(com.paypal.oslo.feature.bankingbundle.AnalyticsTrackerKt.analyticsTracker);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bankingbundle.ui.errorscreen.ErrorScreenKt$ErrorScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bankingbundle.ui.errorscreen.ErrorScreenKt$ErrorScreen$1$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ErrorScreenKt$ErrorScreen$1$1(com.paypal.oslo.feature.bankingbundle.ui.errorscreen.ErrorScreenTypeEnum errorScreenTypeEnum, java.lang.String str, com.paypal.oslo.feature.bankingbundle.domain.error.ErrorDetail errorDetail, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bankingbundle.ui.errorscreen.ErrorScreenKt$ErrorScreen$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = errorScreenTypeEnum;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoSizes = errorDetail;
    }
}
