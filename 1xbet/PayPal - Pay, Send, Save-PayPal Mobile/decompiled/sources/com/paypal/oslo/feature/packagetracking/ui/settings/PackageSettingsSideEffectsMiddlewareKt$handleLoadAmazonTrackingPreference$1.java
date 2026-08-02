package com.paypal.oslo.feature.packagetracking.ui.settings;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsSideEffectsMiddlewareKt$handleLoadAmazonTrackingPreference$1", f = "PackageSettingsSideEffectsMiddleware.kt", i = {}, l = {673}, m = "invokeSuspend", n = {}, nl = {754}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class PackageSettingsSideEffectsMiddlewareKt$handleLoadAmazonTrackingPreference$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRangesFor = 1;
            obj = this.getHighResolutionOutputSizeshNQ4ISI.getGetAmazonTrackingPreferenceUseCase().invoke(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either = (arrow.core.Either) obj;
        com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel packageSettingsViewModel = this.getHighResolutionOutputSizeshNQ4ISI;
        if (either instanceof arrow.core.Either.Right) {
            boolean booleanValue = ((java.lang.Boolean) ((arrow.core.Either.Right) either).getValue()).booleanValue();
            if (packageSettingsViewModel.getUiState().getValue() instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiState.Success) {
                packageSettingsViewModel.processEvent$package_tracking_prodRelease(new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.AmazonTrackingPreferenceLoaded(booleanValue));
            } else {
                packageSettingsViewModel.setPendingAmazonPreference$package_tracking_prodRelease(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(booleanValue));
            }
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.packagetracking.LoggerKt.log, "PackageSettingsMiddleware", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("action", "AmazonPreferenceLoadFailed"), kotlin.TuplesKt.to("error", ((com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError) ((arrow.core.Either.Left) either).getValue()).getMessage())), null, 4, null);
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsSideEffectsMiddlewareKt$handleLoadAmazonTrackingPreference$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsSideEffectsMiddlewareKt$handleLoadAmazonTrackingPreference$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PackageSettingsSideEffectsMiddlewareKt$handleLoadAmazonTrackingPreference$1(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel packageSettingsViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsSideEffectsMiddlewareKt$handleLoadAmazonTrackingPreference$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = packageSettingsViewModel;
    }
}
