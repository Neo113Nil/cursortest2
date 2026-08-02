package com.paypal.oslo.feature.checkcapture.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.checkcapture.ui.CheckCaptureComposablesKt$HandleCheckCaptureEffects$1$1", f = "CheckCaptureComposables.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, nl = {110}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class CheckCaptureComposablesKt$HandleCheckCaptureEffects$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ android.content.Context Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.view.result.ActivityResultLauncher<android.content.Intent> getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureEffect> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.checkcapture.ingo.IngoSdkLauncher getHighSpeedVideoSizes;
    final /* synthetic */ com.ingo.sdk.kotlin.ux.IngoSdkTheme getHighSpeedVideoSizesFor;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getInputFormats;
    final /* synthetic */ com.paypal.oslo.core.permission.ui.controller.PermissionController getInputSizeshNQ4ISI;
    int getOutputFormats;
    final /* synthetic */ com.paypal.oslo.feature.checkcapture.ui.viewmodel.CheckCaptureViewModel getOutputMinFrameDuration;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/checkcapture/ui/mvi/CheckCaptureEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.checkcapture.ui.CheckCaptureComposablesKt$HandleCheckCaptureEffects$1$1$1", f = "CheckCaptureComposables.kt", i = {0, 1, 1, 1}, l = {84, 95}, m = "invokeSuspend", n = {"effect", "effect", "locationStatus", "locationGranted"}, nl = {91, 102}, s = {"L$0", "L$0", "L$1", "Z$0"}, v = 2)
    /* renamed from: com.paypal.oslo.feature.checkcapture.ui.CheckCaptureComposablesKt$HandleCheckCaptureEffects$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext Camera2StreamConfigurationMap;
        final /* synthetic */ com.ingo.sdk.kotlin.ux.IngoSdkTheme getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ com.paypal.oslo.feature.checkcapture.ingo.IngoSdkLauncher getHighSpeedVideoFpsRanges;
        final /* synthetic */ androidx.view.result.ActivityResultLauncher<android.content.Intent> getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ android.content.Context getHighSpeedVideoSizes;
        java.lang.Object getHighSpeedVideoSizesFor;
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getInputFormats;
        final /* synthetic */ com.paypal.oslo.core.permission.ui.controller.PermissionController getInputSizeshNQ4ISI;
        final /* synthetic */ com.paypal.oslo.feature.checkcapture.ui.viewmodel.CheckCaptureViewModel getOutputFormats;
        /* synthetic */ java.lang.Object getOutputMinFrameDuration;
        int getOutputMinFrameDurationlomOqCM;
        boolean getOutputSizeshNQ4ISI;

        /* JADX WARN: Code restructure failed: missing block: B:14:0x00cb, code lost:
        
            if (r10 == r1) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x00ed, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0087, code lost:
        
            if (r10 != r1) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureEffect checkCaptureEffect = (com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureEffect) this.getOutputMinFrameDuration;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getOutputMinFrameDurationlomOqCM;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                if (checkCaptureEffect instanceof com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureEffect.NavigateToIngo) {
                    com.paypal.oslo.feature.checkcapture.analytics.AnalyticsActionsKt.appeared(com.paypal.oslo.feature.checkcapture.analytics.CheckCaptureAnalytics.INSTANCE.createIngoSdkLaunchedEvent(this.Camera2StreamConfigurationMap));
                    this.getHighSpeedVideoFpsRanges.launch(this.getHighSpeedVideoSizes, ((com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureEffect.NavigateToIngo) checkCaptureEffect).getSessionDetails(), this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, com.paypal.oslo.feature.checkcapture.ui.CheckCaptureScreenHelpersKt.createOnIngoLaunchSuccessCallback(), com.paypal.oslo.feature.checkcapture.ui.CheckCaptureScreenHelpersKt.createOnIngoLaunchFailureCallback(this.getInputFormats));
                    return kotlin.Unit.INSTANCE;
                }
                if (!kotlin.jvm.internal.Intrinsics.areEqual(checkCaptureEffect, com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureEffect.RequestPermissions.INSTANCE)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.checkcapture.analytics.AnalyticsActionsKt.appeared(com.paypal.oslo.feature.checkcapture.analytics.CheckCaptureAnalytics.INSTANCE.createLocationPermissionDialogShownEvent(this.Camera2StreamConfigurationMap));
                this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(checkCaptureEffect);
                this.getOutputMinFrameDurationlomOqCM = 1;
                obj = this.getInputSizeshNQ4ISI.requestPermission(new com.paypal.oslo.core.permission.domain.model.PermissionRequest(com.paypal.oslo.core.permission.domain.model.PermissionType.FineLocation.INSTANCE, "Check Capture requires location to process checks", "feature-check-capture"), this);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.checkcapture.analytics.AnalyticsActionsKt.clicked(com.paypal.oslo.feature.checkcapture.analytics.CheckCaptureAnalytics.INSTANCE.createCameraPermissionResultEvent(kotlin.jvm.internal.Intrinsics.areEqual((com.paypal.oslo.core.permission.domain.model.PermissionStatus) obj, com.paypal.oslo.core.permission.domain.model.PermissionStatus.Granted.INSTANCE), this.Camera2StreamConfigurationMap));
                    this.getOutputFormats.processIntent(com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureIntent.PermissionsHandled.INSTANCE);
                    return kotlin.Unit.INSTANCE;
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            com.paypal.oslo.core.permission.domain.model.PermissionStatus permissionStatus = (com.paypal.oslo.core.permission.domain.model.PermissionStatus) obj;
            boolean areEqual = kotlin.jvm.internal.Intrinsics.areEqual(permissionStatus, com.paypal.oslo.core.permission.domain.model.PermissionStatus.Granted.INSTANCE);
            com.paypal.oslo.feature.checkcapture.analytics.AnalyticsActionsKt.clicked(com.paypal.oslo.feature.checkcapture.analytics.CheckCaptureAnalytics.INSTANCE.createLocationPermissionResultEvent(areEqual, this.Camera2StreamConfigurationMap));
            com.paypal.oslo.feature.checkcapture.analytics.AnalyticsActionsKt.appeared(com.paypal.oslo.feature.checkcapture.analytics.CheckCaptureAnalytics.INSTANCE.createCameraPermissionDialogShownEvent(this.Camera2StreamConfigurationMap));
            this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(checkCaptureEffect);
            this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(permissionStatus);
            this.getOutputSizeshNQ4ISI = areEqual;
            this.getOutputMinFrameDurationlomOqCM = 2;
            obj = this.getInputSizeshNQ4ISI.requestPermission(new com.paypal.oslo.core.permission.domain.model.PermissionRequest(com.paypal.oslo.core.permission.domain.model.PermissionType.Camera.INSTANCE, "Check Capture requires camera to capture check images", "feature-check-capture"), this);
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureEffect checkCaptureEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.checkcapture.ui.CheckCaptureComposablesKt$HandleCheckCaptureEffects$1$1.AnonymousClass1) create(checkCaptureEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.checkcapture.ui.CheckCaptureComposablesKt$HandleCheckCaptureEffects$1$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.checkcapture.ui.CheckCaptureComposablesKt$HandleCheckCaptureEffects$1$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getInputFormats, this.getInputSizeshNQ4ISI, this.getOutputFormats, continuation);
            anonymousClass1.getOutputMinFrameDuration = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext businessFlowContext, com.paypal.oslo.feature.checkcapture.ingo.IngoSdkLauncher ingoSdkLauncher, android.content.Context context, com.ingo.sdk.kotlin.ux.IngoSdkTheme ingoSdkTheme, androidx.view.result.ActivityResultLauncher<android.content.Intent> activityResultLauncher, kotlin.jvm.functions.Function0<kotlin.Unit> function0, com.paypal.oslo.core.permission.ui.controller.PermissionController permissionController, com.paypal.oslo.feature.checkcapture.ui.viewmodel.CheckCaptureViewModel checkCaptureViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.checkcapture.ui.CheckCaptureComposablesKt$HandleCheckCaptureEffects$1$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.Camera2StreamConfigurationMap = businessFlowContext;
            this.getHighSpeedVideoFpsRanges = ingoSdkLauncher;
            this.getHighSpeedVideoSizes = context;
            this.getHighResolutionOutputSizeshNQ4ISI = ingoSdkTheme;
            this.getHighSpeedVideoFpsRangesFor = activityResultLauncher;
            this.getInputFormats = function0;
            this.getInputSizeshNQ4ISI = permissionController;
            this.getOutputFormats = checkCaptureViewModel;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getOutputFormats = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getHighSpeedVideoFpsRangesFor, new com.paypal.oslo.feature.checkcapture.ui.CheckCaptureComposablesKt$HandleCheckCaptureEffects$1$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRanges, this.getInputFormats, this.getInputSizeshNQ4ISI, this.getOutputMinFrameDuration, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.checkcapture.ui.CheckCaptureComposablesKt$HandleCheckCaptureEffects$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.checkcapture.ui.CheckCaptureComposablesKt$HandleCheckCaptureEffects$1$1(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRanges, this.getInputFormats, this.getInputSizeshNQ4ISI, this.getOutputMinFrameDuration, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CheckCaptureComposablesKt$HandleCheckCaptureEffects$1$1(kotlinx.coroutines.flow.Flow<? extends com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureEffect> flow, com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext businessFlowContext, com.paypal.oslo.feature.checkcapture.ingo.IngoSdkLauncher ingoSdkLauncher, android.content.Context context, com.ingo.sdk.kotlin.ux.IngoSdkTheme ingoSdkTheme, androidx.view.result.ActivityResultLauncher<android.content.Intent> activityResultLauncher, kotlin.jvm.functions.Function0<kotlin.Unit> function0, com.paypal.oslo.core.permission.ui.controller.PermissionController permissionController, com.paypal.oslo.feature.checkcapture.ui.viewmodel.CheckCaptureViewModel checkCaptureViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.checkcapture.ui.CheckCaptureComposablesKt$HandleCheckCaptureEffects$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = flow;
        this.getHighResolutionOutputSizeshNQ4ISI = businessFlowContext;
        this.getHighSpeedVideoSizes = ingoSdkLauncher;
        this.Camera2StreamConfigurationMap = context;
        this.getHighSpeedVideoSizesFor = ingoSdkTheme;
        this.getHighSpeedVideoFpsRanges = activityResultLauncher;
        this.getInputFormats = function0;
        this.getInputSizeshNQ4ISI = permissionController;
        this.getOutputMinFrameDuration = checkCaptureViewModel;
    }
}
