package com.paypal.oslo.feature.identity.sna.ui.screens;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.sna.ui.screens.AutomaticMobileVerificationScreenKt$rememberStatusBarState$1$1", f = "AutomaticMobileVerificationScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class AutomaticMobileVerificationScreenKt$rememberStatusBarState$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ boolean Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.String> getHighSpeedVideoSizesFor;
    int getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getInputFormats != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (com.paypal.oslo.feature.identity.sna.ui.screens.AutomaticMobileVerificationScreenKt.access$rememberStatusBarState$lambda$7(this.getHighResolutionOutputSizeshNQ4ISI) != null && !kotlin.jvm.internal.Intrinsics.areEqual(com.paypal.oslo.feature.identity.sna.ui.screens.AutomaticMobileVerificationScreenKt.access$rememberStatusBarState$lambda$7(this.getHighResolutionOutputSizeshNQ4ISI), kotlin.coroutines.jvm.internal.Boxing.boxBoolean(this.Camera2StreamConfigurationMap))) {
            androidx.compose.runtime.MutableState<java.lang.String> mutableState = this.getHighSpeedVideoSizesFor;
            if (this.Camera2StreamConfigurationMap) {
                str = this.getHighSpeedVideoFpsRangesFor;
            } else {
                str = this.getHighSpeedVideoSizes;
            }
            mutableState.setValue(str);
            this.getHighSpeedVideoFpsRanges.setValue(java.lang.Boolean.valueOf(true));
        }
        this.getHighResolutionOutputSizeshNQ4ISI.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(this.Camera2StreamConfigurationMap));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.sna.ui.screens.AutomaticMobileVerificationScreenKt$rememberStatusBarState$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.sna.ui.screens.AutomaticMobileVerificationScreenKt$rememberStatusBarState$1$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AutomaticMobileVerificationScreenKt$rememberStatusBarState$1$1(boolean z, java.lang.String str, java.lang.String str2, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, androidx.compose.runtime.MutableState<java.lang.String> mutableState2, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState3, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.sna.ui.screens.AutomaticMobileVerificationScreenKt$rememberStatusBarState$1$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = z;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoSizes = str2;
        this.getHighResolutionOutputSizeshNQ4ISI = mutableState;
        this.getHighSpeedVideoSizesFor = mutableState2;
        this.getHighSpeedVideoFpsRanges = mutableState3;
    }
}
