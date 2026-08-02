package com.paypal.oslo.feature.packagetracking.ui.settings;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsSideEffectsMiddlewareKt$handleUnlinkEmail$1", f = "PackageSettingsSideEffectsMiddleware.kt", i = {}, l = {138}, m = "invokeSuspend", n = {}, nl = {141}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class PackageSettingsSideEffectsMiddlewareKt$handleUnlinkEmail$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getHighSpeedVideoFpsRanges;
    final /* synthetic */ boolean getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.Camera2StreamConfigurationMap = 1;
            obj = this.getHighSpeedVideoSizes.getDeAuthorizeUseCase().invoke(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this);
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
        com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel packageSettingsViewModel = this.getHighSpeedVideoSizes;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.packagetracking.domain.model.DeAuthorizeData deAuthorizeData = (com.paypal.oslo.feature.packagetracking.domain.model.DeAuthorizeData) ((arrow.core.Either.Right) either).getValue();
            if (kotlin.jvm.internal.Intrinsics.areEqual(deAuthorizeData != null ? kotlin.coroutines.jvm.internal.Boxing.boxBoolean(deAuthorizeData.getDeauthorized()) : null, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true))) {
                packageSettingsViewModel.processEvent$package_tracking_prodRelease(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.UnlinkSuccess.INSTANCE);
            } else {
                packageSettingsViewModel.processEvent$package_tracking_prodRelease(new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.UnlinkFailed(com.paypal.oslo.feature.packagetracking.domain.UiString.INSTANCE.invoke(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_error_email_unlinking_title), com.paypal.oslo.feature.packagetracking.domain.UiString.INSTANCE.invoke(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_banner_description_contact_us)));
            }
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError packageTrackingError = (com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError) ((arrow.core.Either.Left) either).getValue();
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.packagetracking.LoggerKt.log, "PackageSettingsMiddleware", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorMessage", packageTrackingError.getMessage()), kotlin.TuplesKt.to("error", packageTrackingError)), null, 4, null);
            packageSettingsViewModel.processEvent$package_tracking_prodRelease(new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.UnlinkFailed(com.paypal.oslo.feature.packagetracking.domain.UiString.INSTANCE.invoke(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_error_email_unlinking_title), com.paypal.oslo.feature.packagetracking.domain.UiString.INSTANCE.invoke(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_banner_description_contact_us)));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsSideEffectsMiddlewareKt$handleUnlinkEmail$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsSideEffectsMiddlewareKt$handleUnlinkEmail$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PackageSettingsSideEffectsMiddlewareKt$handleUnlinkEmail$1(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel packageSettingsViewModel, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, boolean z, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsSideEffectsMiddlewareKt$handleUnlinkEmail$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = packageSettingsViewModel;
        this.getHighSpeedVideoFpsRanges = emailProvider;
        this.getHighSpeedVideoFpsRangesFor = z;
    }
}
