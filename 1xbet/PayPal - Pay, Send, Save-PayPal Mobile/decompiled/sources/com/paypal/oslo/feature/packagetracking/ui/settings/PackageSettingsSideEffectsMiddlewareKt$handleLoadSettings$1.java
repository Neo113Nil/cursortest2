package com.paypal.oslo.feature.packagetracking.ui.settings;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsSideEffectsMiddlewareKt$handleLoadSettings$1", f = "PackageSettingsSideEffectsMiddleware.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, nl = {754}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class PackageSettingsSideEffectsMiddlewareKt$handleLoadSettings$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ boolean Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRanges = 1;
            obj = this.getHighSpeedVideoSizes.getGetEmailLinkStatusUseCase().invoke(this.Camera2StreamConfigurationMap, this);
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
            java.util.List list = (java.util.List) ((arrow.core.Either.Right) either).getValue();
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.packagetracking.LoggerKt.log;
            kotlin.Pair[] pairArr = new kotlin.Pair[3];
            int i2 = 0;
            pairArr[0] = kotlin.TuplesKt.to("action", "SettingsLoaded");
            pairArr[1] = kotlin.TuplesKt.to("accountCount", kotlin.coroutines.jvm.internal.Boxing.boxInt(list.size()));
            java.util.List list2 = list;
            if (!(list2 instanceof java.util.Collection) || !list2.isEmpty()) {
                java.util.Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (((com.paypal.oslo.feature.packagetracking.domain.model.EmailLink) it.next()).getStatus() == com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkStatus.LINKED && (i2 = i2 + 1) < 0) {
                        kotlin.collections.CollectionsKt.throwCountOverflow();
                    }
                }
            }
            pairArr[2] = kotlin.TuplesKt.to("linkedCount", kotlin.coroutines.jvm.internal.Boxing.boxInt(i2));
            com.paypal.android.logger.Logger.d$default(logger, "PackageSettingsMiddleware", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
            packageSettingsViewModel.processEvent$package_tracking_prodRelease(new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.SettingsLoaded(list));
        } else if (either instanceof arrow.core.Either.Left) {
            packageSettingsViewModel.processEvent$package_tracking_prodRelease(new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.SettingsLoadFailed(com.paypal.oslo.feature.packagetracking.domain.UiString.INSTANCE.invoke(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_error_generic_title), com.paypal.oslo.feature.packagetracking.domain.UiString.INSTANCE.invoke(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_settings_error_retry_message)));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsSideEffectsMiddlewareKt$handleLoadSettings$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsSideEffectsMiddlewareKt$handleLoadSettings$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PackageSettingsSideEffectsMiddlewareKt$handleLoadSettings$1(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel packageSettingsViewModel, boolean z, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsSideEffectsMiddlewareKt$handleLoadSettings$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = packageSettingsViewModel;
        this.Camera2StreamConfigurationMap = z;
    }
}
