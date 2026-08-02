package com.paypal.oslo.feature.packagetracking.ui.detail;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailScreenKt$PackageDetailScreenContent$2$2$1$2$1$1", f = "PackageDetailScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class PackageDetailScreenKt$PackageDetailScreenContent$2$2$1$2$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ComponentAppeared(com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.copy$default(com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.PackageDetailContexts.INSTANCE.getUiContext(), null, null, null, com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.Items.INSTANCE.getErrorBanner(), 7, null), com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.copy$default(com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.PackageDetailContexts.INSTANCE.getUserIntentContext(), null, null, com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.ActionNames.RELINK_EMAIL, 3, null), kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.PackageDetailContexts.errorContext$default(com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.PackageDetailContexts.INSTANCE, com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.ErrorCodes.UNLINKED_BY_SYSTEM, null, 2, null))).track(com.paypal.oslo.feature.packagetracking.AnalyticsTrackerKt.analyticsTracker);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailScreenKt$PackageDetailScreenContent$2$2$1$2$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailScreenKt$PackageDetailScreenContent$2$2$1$2$1$1(continuation);
    }

    PackageDetailScreenKt$PackageDetailScreenContent$2$2$1$2$1$1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailScreenKt$PackageDetailScreenContent$2$2$1$2$1$1> continuation) {
        super(2, continuation);
    }
}
