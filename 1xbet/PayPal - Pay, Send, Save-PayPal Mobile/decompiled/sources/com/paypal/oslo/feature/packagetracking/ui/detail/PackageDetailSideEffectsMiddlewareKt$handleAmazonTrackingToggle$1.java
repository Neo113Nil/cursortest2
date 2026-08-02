package com.paypal.oslo.feature.packagetracking.ui.detail;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailSideEffectsMiddlewareKt$handleAmazonTrackingToggle$1", f = "PackageDetailSideEffectsMiddleware.kt", i = {}, l = {com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.ENROLLMENT_OS_UPGRADE_REQUIRED}, m = "invokeSuspend", n = {}, nl = {624}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class PackageDetailSideEffectsMiddlewareKt$handleAmazonTrackingToggle$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ boolean getHighSpeedVideoFpsRanges;
    final /* synthetic */ boolean getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.Camera2StreamConfigurationMap = 1;
            obj = this.getHighSpeedVideoSizes.getSaveAmazonTrackingPreferenceUseCase().invoke(this.getHighSpeedVideoFpsRanges, this);
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
        com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailViewModel packageDetailViewModel = this.getHighSpeedVideoSizes;
        boolean z = this.getHighSpeedVideoFpsRangesFor;
        if (either instanceof arrow.core.Either.Right) {
            packageDetailViewModel.processEvent$package_tracking_prodRelease(new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.AmazonTrackingToggleSuccess(((java.lang.Boolean) ((arrow.core.Either.Right) either).getValue()).booleanValue()));
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.packagetracking.LoggerKt.log, com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailLogConstants.PACKAGE_TRACKING_ERROR, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("action", "AmazonPreferenceToggleFailed"), kotlin.TuplesKt.to("error", ((com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError) ((arrow.core.Either.Left) either).getValue()).getMessage())), null, 4, null);
            packageDetailViewModel.processEvent$package_tracking_prodRelease(new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.AmazonTrackingToggleFailed(z, new com.paypal.oslo.feature.packagetracking.domain.model.display.InfoBanner("amazon-tracking-toggle-error", com.paypal.oslo.feature.packagetracking.domain.UiString.INSTANCE.invoke(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_error_generic_title), com.paypal.oslo.feature.packagetracking.domain.UiString.INSTANCE.invoke(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_amazon_preference_toggle_error), com.paypal.oslo.feature.packagetracking.domain.model.display.BannerType.AMAZON_TRACKING_TOGGLE_FAILED, null, 16, null)));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailSideEffectsMiddlewareKt$handleAmazonTrackingToggle$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailSideEffectsMiddlewareKt$handleAmazonTrackingToggle$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PackageDetailSideEffectsMiddlewareKt$handleAmazonTrackingToggle$1(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailViewModel packageDetailViewModel, boolean z, boolean z2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailSideEffectsMiddlewareKt$handleAmazonTrackingToggle$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = packageDetailViewModel;
        this.getHighSpeedVideoFpsRanges = z;
        this.getHighSpeedVideoFpsRangesFor = z2;
    }
}
