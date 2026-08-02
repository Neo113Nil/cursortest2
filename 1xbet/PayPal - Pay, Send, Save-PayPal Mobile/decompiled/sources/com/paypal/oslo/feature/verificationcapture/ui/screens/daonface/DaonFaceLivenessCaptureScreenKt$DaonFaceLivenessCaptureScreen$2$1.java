package com.paypal.oslo.feature.verificationcapture.ui.screens.daonface;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessCaptureScreenKt$DaonFaceLivenessCaptureScreen$2$1", f = "DaonFaceLivenessCaptureScreen.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, nl = {96}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class DaonFaceLivenessCaptureScreenKt$DaonFaceLivenessCaptureScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ boolean Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (this.Camera2StreamConfigurationMap) {
                this.getHighSpeedVideoSizes = 1;
                if (kotlinx.coroutines.DelayKt.delay(60000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return kotlin.Unit.INSTANCE;
        }
        if (i != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "[DaonFace] Capture timeout", null, null, 6, null);
        this.getHighSpeedVideoFpsRangesFor.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessCaptureScreenKt$DaonFaceLivenessCaptureScreen$2$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessCaptureScreenKt$DaonFaceLivenessCaptureScreen$2$1.getHighSpeedVideoSizes((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult.Timeout(0, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessCaptureScreenKt$DaonFaceLivenessCaptureScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessCaptureScreenKt$DaonFaceLivenessCaptureScreen$2$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DaonFaceLivenessCaptureScreenKt$DaonFaceLivenessCaptureScreen$2$1(boolean z, com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessCaptureScreenKt$DaonFaceLivenessCaptureScreen$2$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = z;
        this.getHighSpeedVideoFpsRangesFor = appNavigator;
    }
}
