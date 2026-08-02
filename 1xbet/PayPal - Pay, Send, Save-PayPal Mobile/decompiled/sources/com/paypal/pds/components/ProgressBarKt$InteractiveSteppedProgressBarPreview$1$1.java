package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.pds.components.ProgressBarKt$InteractiveSteppedProgressBarPreview$1$1", f = "ProgressBar.kt", i = {}, l = {532}, m = "invokeSuspend", n = {}, nl = {com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.ENROLLMENT_MOBILE_WALLET_ALREADY_ENROLLED}, s = {}, v = 2)
/* loaded from: classes16.dex */
final class ProgressBarKt$InteractiveSteppedProgressBarPreview$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.runtime.MutableFloatState Camera2StreamConfigurationMap;
    final /* synthetic */ int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoFpsRanges;
    final /* synthetic */ float getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.MutableIntState getHighSpeedVideoSizes;
    int getOutputFormats;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002d -> B:5:0x0030). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean booleanValue;
        float floatValue;
        float floatValue2;
        int intValue;
        int intValue2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            booleanValue = ((java.lang.Boolean) this.getHighSpeedVideoFpsRanges.getValue()).booleanValue();
            if (booleanValue) {
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.compose.runtime.MutableFloatState mutableFloatState = this.Camera2StreamConfigurationMap;
            floatValue = mutableFloatState.getFloatValue();
            mutableFloatState.setFloatValue(floatValue + 1.0f);
            floatValue2 = this.Camera2StreamConfigurationMap.getFloatValue();
            if (floatValue2 >= this.getHighSpeedVideoFpsRangesFor) {
                intValue = this.getHighSpeedVideoSizes.getIntValue();
                if (intValue >= this.getHighResolutionOutputSizeshNQ4ISI - 1) {
                    this.Camera2StreamConfigurationMap.setFloatValue(this.getHighSpeedVideoFpsRangesFor);
                    this.getHighSpeedVideoFpsRanges.setValue(java.lang.Boolean.valueOf(false));
                } else {
                    intValue2 = this.getHighSpeedVideoSizes.getIntValue();
                    this.getHighSpeedVideoSizes.setIntValue(intValue2 + 1);
                    this.Camera2StreamConfigurationMap.setFloatValue(0.0f);
                }
            }
            booleanValue = ((java.lang.Boolean) this.getHighSpeedVideoFpsRanges.getValue()).booleanValue();
            if (booleanValue) {
                this.getOutputFormats = 1;
                if (kotlinx.coroutines.DelayKt.delay(600L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                androidx.compose.runtime.MutableFloatState mutableFloatState2 = this.Camera2StreamConfigurationMap;
                floatValue = mutableFloatState2.getFloatValue();
                mutableFloatState2.setFloatValue(floatValue + 1.0f);
                floatValue2 = this.Camera2StreamConfigurationMap.getFloatValue();
                if (floatValue2 >= this.getHighSpeedVideoFpsRangesFor) {
                }
                booleanValue = ((java.lang.Boolean) this.getHighSpeedVideoFpsRanges.getValue()).booleanValue();
                if (booleanValue) {
                    return kotlin.Unit.INSTANCE;
                }
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.pds.components.ProgressBarKt$InteractiveSteppedProgressBarPreview$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.pds.components.ProgressBarKt$InteractiveSteppedProgressBarPreview$1$1(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProgressBarKt$InteractiveSteppedProgressBarPreview$1$1(float f, int i, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, androidx.compose.runtime.MutableFloatState mutableFloatState, androidx.compose.runtime.MutableIntState mutableIntState, kotlin.coroutines.Continuation<? super com.paypal.pds.components.ProgressBarKt$InteractiveSteppedProgressBarPreview$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = f;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getHighSpeedVideoFpsRanges = mutableState;
        this.Camera2StreamConfigurationMap = mutableFloatState;
        this.getHighSpeedVideoSizes = mutableIntState;
    }
}
