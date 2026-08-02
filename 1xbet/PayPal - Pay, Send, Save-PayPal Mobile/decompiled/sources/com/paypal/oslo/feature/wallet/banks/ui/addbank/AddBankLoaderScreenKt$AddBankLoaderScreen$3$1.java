package com.paypal.oslo.feature.wallet.banks.ui.addbank;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.banks.ui.addbank.AddBankLoaderScreenKt$AddBankLoaderScreen$3$1", f = "AddBankLoaderScreen.kt", i = {0, 0, 0}, l = {80}, m = "invokeSuspend", n = {"messageCount", "index", "$i$a$-repeat-AddBankLoaderScreenKt$AddBankLoaderScreen$3$1$1"}, nl = {81}, s = {"I$0", "I$2", "I$3"}, v = 2)
/* loaded from: classes15.dex */
final class AddBankLoaderScreenKt$AddBankLoaderScreen$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.wallet.common.MessageRotation getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.MutableIntState getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    int getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;

    /* JADX WARN: Removed duplicated region for block: B:11:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0056 -> B:5:0x0059). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.wallet.common.MessageRotation messageRotation;
        int i;
        androidx.compose.runtime.MutableIntState mutableIntState;
        int i2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.getOutputMinFrameDuration;
        if (i3 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            int size = this.getHighResolutionOutputSizeshNQ4ISI.getMessages().size();
            if (size > 0) {
                messageRotation = this.getHighResolutionOutputSizeshNQ4ISI;
                i = 0;
                mutableIntState = this.getHighSpeedVideoSizes;
                i2 = size;
                if (i < i2) {
                }
            }
            return kotlin.Unit.INSTANCE;
        }
        if (i3 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i = this.getHighSpeedVideoFpsRangesFor;
        i2 = this.getHighSpeedVideoFpsRanges;
        mutableIntState = (androidx.compose.runtime.MutableIntState) this.getHighSpeedVideoSizesFor;
        messageRotation = (com.paypal.oslo.feature.wallet.common.MessageRotation) this.getOutputFormats;
        kotlin.ResultKt.throwOnFailure(obj);
        i++;
        if (i < i2) {
            mutableIntState.setIntValue(i);
            long intervalMs = messageRotation.getIntervalMs();
            this.getOutputFormats = messageRotation;
            this.getHighSpeedVideoSizesFor = mutableIntState;
            this.getHighSpeedVideoFpsRanges = i2;
            this.getHighSpeedVideoFpsRangesFor = i;
            this.getInputSizeshNQ4ISI = i;
            this.getInputFormats = 0;
            this.getOutputMinFrameDuration = 1;
            if (kotlinx.coroutines.DelayKt.delay(intervalMs, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            i++;
            if (i < i2) {
                this.Camera2StreamConfigurationMap.invoke();
                return kotlin.Unit.INSTANCE;
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.banks.ui.addbank.AddBankLoaderScreenKt$AddBankLoaderScreen$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.banks.ui.addbank.AddBankLoaderScreenKt$AddBankLoaderScreen$3$1(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddBankLoaderScreenKt$AddBankLoaderScreen$3$1(com.paypal.oslo.feature.wallet.common.MessageRotation messageRotation, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.MutableIntState mutableIntState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.ui.addbank.AddBankLoaderScreenKt$AddBankLoaderScreen$3$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = messageRotation;
        this.Camera2StreamConfigurationMap = function0;
        this.getHighSpeedVideoSizes = mutableIntState;
    }
}
