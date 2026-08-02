package com.paypal.oslo.feature.packagetracking.ui.settings;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsScreenKt$PackageSettingsContent$4$1$1$1", f = "PackageSettingsScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class PackageSettingsScreenKt$PackageSettingsContent$4$1$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.packagetracking.domain.error.ErrorInfo getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext copy$default = com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.copy$default(com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.PackageSettingsContexts.INSTANCE.getUiContext(), null, null, null, com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.Items.INSTANCE.getErrorBanner(), 7, null);
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI.getErrorCode(), com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.ErrorCodes.UNLINKED_BY_SYSTEM)) {
            userIntentContext = com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.copy$default(com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.PackageSettingsContexts.INSTANCE.getUserIntentContext(), null, null, com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.ActionNames.RELINK_EMAIL, 3, null);
        } else {
            userIntentContext = com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.PackageSettingsContexts.INSTANCE.getUserIntentContext();
        }
        new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ComponentAppeared(copy$default, userIntentContext, kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.PackageSettingsContexts.errorContext$default(com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.PackageSettingsContexts.INSTANCE, this.getHighResolutionOutputSizeshNQ4ISI.getErrorCode(), null, 2, null))).track(com.paypal.oslo.feature.packagetracking.AnalyticsTrackerKt.analyticsTracker);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsScreenKt$PackageSettingsContent$4$1$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsScreenKt$PackageSettingsContent$4$1$1$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PackageSettingsScreenKt$PackageSettingsContent$4$1$1$1(com.paypal.oslo.feature.packagetracking.domain.error.ErrorInfo errorInfo, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsScreenKt$PackageSettingsContent$4$1$1$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = errorInfo;
    }
}
