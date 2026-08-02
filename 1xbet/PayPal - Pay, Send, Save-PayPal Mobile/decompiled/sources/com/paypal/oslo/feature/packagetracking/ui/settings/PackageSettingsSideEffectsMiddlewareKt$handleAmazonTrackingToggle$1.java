package com.paypal.oslo.feature.packagetracking.ui.settings;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsSideEffectsMiddlewareKt$handleAmazonTrackingToggle$1", f = "PackageSettingsSideEffectsMiddleware.kt", i = {}, l = {721}, m = "invokeSuspend", n = {}, nl = {754}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class PackageSettingsSideEffectsMiddlewareKt$handleAmazonTrackingToggle$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ boolean Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel getHighSpeedVideoFpsRanges;
    final /* synthetic */ boolean getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object invoke;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            invoke = this.getHighSpeedVideoFpsRanges.getSaveAmazonTrackingPreferenceUseCase().invoke(this.Camera2StreamConfigurationMap, this);
            if (invoke == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            invoke = obj;
        }
        arrow.core.Either either = (arrow.core.Either) invoke;
        com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel packageSettingsViewModel = this.getHighSpeedVideoFpsRanges;
        boolean z = this.getHighSpeedVideoSizes;
        if (either instanceof arrow.core.Either.Right) {
            boolean booleanValue = ((java.lang.Boolean) ((arrow.core.Either.Right) either).getValue()).booleanValue();
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.packagetracking.LoggerKt.log, "PackageSettingsMiddleware", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("action", "AmazonPreferenceToggleSuccess"), kotlin.TuplesKt.to("enabled", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(booleanValue))), null, 4, null);
            new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ComponentAppeared(com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.copy$default(com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.PackageSettingsContexts.INSTANCE.getUiContext(), null, null, null, com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.Items.INSTANCE.getAmazonPreferencesUpdateSuccess(), 7, null), com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.AmazonUserPreferencesContexts.INSTANCE.getUserIntentContext(), null, 4, null).track(com.paypal.oslo.feature.packagetracking.AnalyticsTrackerKt.analyticsTracker);
            packageSettingsViewModel.processEvent$package_tracking_prodRelease(new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.AmazonTrackingToggleSuccess(booleanValue));
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.packagetracking.LoggerKt.log, "PackageSettingsMiddleware", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("action", "AmazonPreferenceToggleFailed"), kotlin.TuplesKt.to("error", ((com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError) ((arrow.core.Either.Left) either).getValue()).getMessage())), null, 4, null);
            packageSettingsViewModel.processEvent$package_tracking_prodRelease(new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.AmazonTrackingToggleFailed(z));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsSideEffectsMiddlewareKt$handleAmazonTrackingToggle$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsSideEffectsMiddlewareKt$handleAmazonTrackingToggle$1(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PackageSettingsSideEffectsMiddlewareKt$handleAmazonTrackingToggle$1(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel packageSettingsViewModel, boolean z, boolean z2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsSideEffectsMiddlewareKt$handleAmazonTrackingToggle$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = packageSettingsViewModel;
        this.Camera2StreamConfigurationMap = z;
        this.getHighSpeedVideoSizes = z2;
    }
}
