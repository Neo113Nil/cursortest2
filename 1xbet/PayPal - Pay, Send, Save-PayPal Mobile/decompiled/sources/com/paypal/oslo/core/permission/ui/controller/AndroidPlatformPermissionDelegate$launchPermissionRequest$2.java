package com.paypal.oslo.core.permission.ui.controller;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.permission.ui.controller.AndroidPlatformPermissionDelegate$launchPermissionRequest$2", f = "AndroidPlatformPermissionDelegate.kt", i = {0}, l = {63}, m = "invokeSuspend", n = {"$i$f$suspendCancellableCoroutine"}, nl = {73}, s = {"I$0"}, v = 2)
/* loaded from: classes10.dex */
final class AndroidPlatformPermissionDelegate$launchPermissionRequest$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
    final /* synthetic */ androidx.view.result.ActivityResultLauncher<java.lang.String> Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function1<kotlinx.coroutines.CancellableContinuation<? super java.lang.Boolean>, kotlin.Unit> getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizesFor;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        final kotlin.jvm.functions.Function1<kotlinx.coroutines.CancellableContinuation<? super java.lang.Boolean>, kotlin.Unit> function1 = this.getHighSpeedVideoSizes;
        androidx.view.result.ActivityResultLauncher<java.lang.String> activityResultLauncher = this.Camera2StreamConfigurationMap;
        java.lang.String str = this.getHighResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoFpsRangesFor = function1;
        this.getOutputMinFrameDuration = activityResultLauncher;
        this.getInputSizeshNQ4ISI = str;
        this.getHighSpeedVideoFpsRanges = 0;
        this.getHighSpeedVideoSizesFor = 1;
        com.paypal.oslo.core.permission.ui.controller.AndroidPlatformPermissionDelegate$launchPermissionRequest$2 androidPlatformPermissionDelegate$launchPermissionRequest$2 = this;
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(androidPlatformPermissionDelegate$launchPermissionRequest$2), 1);
        cancellableContinuationImpl.initCancellability();
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        function1.invoke(cancellableContinuationImpl2);
        activityResultLauncher.launch(str);
        cancellableContinuationImpl2.invokeOnCancellation(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: com.paypal.oslo.core.permission.ui.controller.AndroidPlatformPermissionDelegate$launchPermissionRequest$2$1$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                function1.invoke(null);
                return kotlin.Unit.INSTANCE;
            }
        });
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(androidPlatformPermissionDelegate$launchPermissionRequest$2);
        }
        return result == coroutine_suspended ? coroutine_suspended : result;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return ((com.paypal.oslo.core.permission.ui.controller.AndroidPlatformPermissionDelegate$launchPermissionRequest$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.core.permission.ui.controller.AndroidPlatformPermissionDelegate$launchPermissionRequest$2(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AndroidPlatformPermissionDelegate$launchPermissionRequest$2(kotlin.jvm.functions.Function1<? super kotlinx.coroutines.CancellableContinuation<? super java.lang.Boolean>, kotlin.Unit> function1, androidx.view.result.ActivityResultLauncher<java.lang.String> activityResultLauncher, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.permission.ui.controller.AndroidPlatformPermissionDelegate$launchPermissionRequest$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = function1;
        this.Camera2StreamConfigurationMap = activityResultLauncher;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
    }
}
