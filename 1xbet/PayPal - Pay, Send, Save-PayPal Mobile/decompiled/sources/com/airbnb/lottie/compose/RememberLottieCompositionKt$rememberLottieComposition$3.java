package com.airbnb.lottie.compose;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$3", f = "rememberLottieComposition.kt", i = {0, 0, 1, 1}, l = {93, 95}, m = "invokeSuspend", n = {"exception", "failedCount", "exception", "failedCount"}, s = {"L$0", "I$0", "L$0", "I$0"})
/* loaded from: classes7.dex */
final class RememberLottieCompositionKt$rememberLottieComposition$3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ android.content.Context Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    final /* synthetic */ kotlin.jvm.functions.Function3<java.lang.Integer, java.lang.Throwable, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> getHighSpeedVideoSizesFor;
    int getInputFormats;
    final /* synthetic */ com.airbnb.lottie.compose.LottieCompositionSpec getInputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.MutableState<com.airbnb.lottie.compose.LottieCompositionResultImpl> getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    int getOutputSizes;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0057, code lost:
    
        if (r13 != r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005f, code lost:
    
        if (((java.lang.Boolean) r13).booleanValue() != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0088, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0086, code lost:
    
        if (r13 == r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0042  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0086 -> B:8:0x0089). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Throwable th;
        int i;
        java.lang.String highSpeedVideoFpsRanges;
        java.lang.String highSpeedVideoFpsRanges2;
        java.lang.String Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.getOutputSizes;
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            th = null;
            i = 0;
            if (!com.airbnb.lottie.compose.RememberLottieCompositionKt.access$rememberLottieComposition$lambda$1(this.getOutputFormats).isSuccess()) {
            }
            if (!com.airbnb.lottie.compose.RememberLottieCompositionKt.access$rememberLottieComposition$lambda$1(this.getOutputFormats).isComplete()) {
                com.airbnb.lottie.compose.RememberLottieCompositionKt.access$rememberLottieComposition$lambda$1(this.getOutputFormats).completeExceptionally$lottie_compose_release(th);
            }
            return kotlin.Unit.INSTANCE;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.getInputFormats;
            th = (java.lang.Throwable) this.getOutputMinFrameDuration;
            try {
                kotlin.ResultKt.throwOnFailure(obj);
            } catch (java.lang.Throwable th2) {
                th = th2;
                i++;
            }
            com.airbnb.lottie.compose.RememberLottieCompositionKt.access$rememberLottieComposition$lambda$1(this.getOutputFormats).complete$lottie_compose_release((com.airbnb.lottie.LottieComposition) obj);
            if (!com.airbnb.lottie.compose.RememberLottieCompositionKt.access$rememberLottieComposition$lambda$1(this.getOutputFormats).isSuccess()) {
                if (i != 0) {
                    kotlin.jvm.functions.Function3<java.lang.Integer, java.lang.Throwable, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> function3 = this.getHighSpeedVideoSizesFor;
                    java.lang.Integer boxInt = kotlin.coroutines.jvm.internal.Boxing.boxInt(i);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(th);
                    this.getOutputMinFrameDuration = th;
                    this.getInputFormats = i;
                    this.getOutputSizes = 1;
                    obj = function3.invoke(boxInt, th, this);
                }
                android.content.Context context = this.Camera2StreamConfigurationMap;
                com.airbnb.lottie.compose.LottieCompositionSpec lottieCompositionSpec = this.getInputSizeshNQ4ISI;
                highSpeedVideoFpsRanges = com.airbnb.lottie.compose.RememberLottieCompositionKt.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges);
                highSpeedVideoFpsRanges2 = com.airbnb.lottie.compose.RememberLottieCompositionKt.getHighSpeedVideoFpsRanges(this.getHighResolutionOutputSizeshNQ4ISI);
                Camera2StreamConfigurationMap = com.airbnb.lottie.compose.RememberLottieCompositionKt.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor);
                this.getOutputMinFrameDuration = th;
                this.getInputFormats = i;
                this.getOutputSizes = 2;
                obj = com.airbnb.lottie.compose.RememberLottieCompositionKt.lottieComposition(context, lottieCompositionSpec, highSpeedVideoFpsRanges, highSpeedVideoFpsRanges2, Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this);
            }
            if (!com.airbnb.lottie.compose.RememberLottieCompositionKt.access$rememberLottieComposition$lambda$1(this.getOutputFormats).isComplete() && th != null) {
                com.airbnb.lottie.compose.RememberLottieCompositionKt.access$rememberLottieComposition$lambda$1(this.getOutputFormats).completeExceptionally$lottie_compose_release(th);
            }
            return kotlin.Unit.INSTANCE;
        }
        i = this.getInputFormats;
        th = (java.lang.Throwable) this.getOutputMinFrameDuration;
        kotlin.ResultKt.throwOnFailure(obj);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$3) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$3(this.getHighSpeedVideoSizesFor, this.Camera2StreamConfigurationMap, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getOutputFormats, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    RememberLottieCompositionKt$rememberLottieComposition$3(kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super java.lang.Throwable, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> function3, android.content.Context context, com.airbnb.lottie.compose.LottieCompositionSpec lottieCompositionSpec, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, androidx.compose.runtime.MutableState<com.airbnb.lottie.compose.LottieCompositionResultImpl> mutableState, kotlin.coroutines.Continuation<? super com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$3> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizesFor = function3;
        this.Camera2StreamConfigurationMap = context;
        this.getInputSizeshNQ4ISI = lottieCompositionSpec;
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighResolutionOutputSizeshNQ4ISI = str2;
        this.getHighSpeedVideoFpsRangesFor = str3;
        this.getHighSpeedVideoSizes = str4;
        this.getOutputFormats = mutableState;
    }
}
