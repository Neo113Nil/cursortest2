package com.paypal.oslo.feature.searchandintelligence.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.searchandintelligence.ui.FadeInTextKt$FadeInText$1$1", f = "FadeInText.kt", i = {0}, l = {69}, m = "invokeSuspend", n = {"i"}, nl = {70}, s = {"I$0"}, v = 2)
/* loaded from: classes14.dex */
final class FadeInTextKt$FadeInText$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ long getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.MutableIntState getHighSpeedVideoSizes;
    int getInputSizeshNQ4ISI;
    int getOutputFormats;
    int getOutputMinFrameDuration;

    /* JADX WARN: Removed duplicated region for block: B:10:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x006c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x005a -> B:5:0x005d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int last;
        int i;
        int i2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.getOutputFormats;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = this.getOutputMinFrameDuration;
            last = this.getInputSizeshNQ4ISI;
            i = this.getHighSpeedVideoFpsRanges;
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizes.setIntValue(java.lang.Math.min(i + 2, this.getHighResolutionOutputSizeshNQ4ISI));
            if (i != last) {
                i += i2;
                this.getHighSpeedVideoFpsRanges = i;
                this.getInputSizeshNQ4ISI = last;
                this.getOutputMinFrameDuration = i2;
                this.getOutputFormats = 1;
                if (kotlinx.coroutines.DelayKt.m24057delayVtjQ1oo(this.getHighSpeedVideoFpsRangesFor, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                this.getHighSpeedVideoSizes.setIntValue(java.lang.Math.min(i + 2, this.getHighResolutionOutputSizeshNQ4ISI));
                if (i != last) {
                }
            }
            if (this.Camera2StreamConfigurationMap.length() > 700) {
                this.getHighSpeedVideoSizes.setIntValue(this.Camera2StreamConfigurationMap.length());
            }
            return kotlin.Unit.INSTANCE;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighSpeedVideoSizes.setIntValue(0);
        kotlin.ranges.IntProgression step = kotlin.ranges.RangesKt.step(kotlin.ranges.RangesKt.until(0, this.getHighResolutionOutputSizeshNQ4ISI), 2);
        int first = step.getFirst();
        last = step.getLast();
        int step2 = step.getStep();
        if ((step2 > 0 && first <= last) || (step2 < 0 && last <= first)) {
            i = first;
            i2 = step2;
            this.getHighSpeedVideoFpsRanges = i;
            this.getInputSizeshNQ4ISI = last;
            this.getOutputMinFrameDuration = i2;
            this.getOutputFormats = 1;
            if (kotlinx.coroutines.DelayKt.m24057delayVtjQ1oo(this.getHighSpeedVideoFpsRangesFor, this) == coroutine_suspended) {
            }
            this.getHighSpeedVideoSizes.setIntValue(java.lang.Math.min(i + 2, this.getHighResolutionOutputSizeshNQ4ISI));
            if (i != last) {
            }
        }
        if (this.Camera2StreamConfigurationMap.length() > 700) {
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.searchandintelligence.ui.FadeInTextKt$FadeInText$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.searchandintelligence.ui.FadeInTextKt$FadeInText$1$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FadeInTextKt$FadeInText$1$1(int i, long j, java.lang.String str, androidx.compose.runtime.MutableIntState mutableIntState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.searchandintelligence.ui.FadeInTextKt$FadeInText$1$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getHighSpeedVideoFpsRangesFor = j;
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoSizes = mutableIntState;
    }
}
