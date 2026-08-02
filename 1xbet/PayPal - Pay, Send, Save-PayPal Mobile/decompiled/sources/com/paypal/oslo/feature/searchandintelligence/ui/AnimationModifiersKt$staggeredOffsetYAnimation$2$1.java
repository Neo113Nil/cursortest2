package com.paypal.oslo.feature.searchandintelligence.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.searchandintelligence.ui.AnimationModifiersKt$staggeredOffsetYAnimation$2$1", f = "AnimationModifiers.kt", i = {}, l = {251, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, 259}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, 256, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class AnimationModifiersKt$staggeredOffsetYAnimation$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ int Camera2StreamConfigurationMap;
    final /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> getHighSpeedVideoFpsRanges;
    final /* synthetic */ float getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ boolean getHighSpeedVideoSizes;
    final /* synthetic */ long getHighSpeedVideoSizesFor;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getInputFormats;
    int getInputSizeshNQ4ISI;
    final /* synthetic */ float getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0066, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r11.getHighSpeedVideoFpsRanges, kotlin.coroutines.jvm.internal.Boxing.boxFloat(r11.getOutputMinFrameDuration), androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 200.0f, null, 5, null), null, null, r11, 12, null) != r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0081, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0043, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r5 * r7, r11) != r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007f, code lost:
    
        if (r11.getHighSpeedVideoFpsRanges.snapTo(kotlin.coroutines.jvm.internal.Boxing.boxFloat(r11.getHighSpeedVideoFpsRangesFor), r11) == r0) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (!this.getHighResolutionOutputSizeshNQ4ISI) {
                this.getInputSizeshNQ4ISI = 3;
            } else if (!this.getHighSpeedVideoSizes) {
                long j = this.Camera2StreamConfigurationMap;
                long m23953getInWholeMillisecondsimpl = kotlin.time.Duration.m23953getInWholeMillisecondsimpl(this.getHighSpeedVideoSizesFor);
                this.getInputSizeshNQ4ISI = 1;
            }
        } else if (i == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getInputSizeshNQ4ISI = 2;
        } else if (i == 2) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getInputFormats.invoke();
        } else {
            if (i != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.searchandintelligence.ui.AnimationModifiersKt$staggeredOffsetYAnimation$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.searchandintelligence.ui.AnimationModifiersKt$staggeredOffsetYAnimation$2$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRanges, this.getOutputMinFrameDuration, this.getInputFormats, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnimationModifiersKt$staggeredOffsetYAnimation$2$1(boolean z, boolean z2, int i, long j, androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable, float f, kotlin.jvm.functions.Function0<kotlin.Unit> function0, float f2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.searchandintelligence.ui.AnimationModifiersKt$staggeredOffsetYAnimation$2$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.getHighSpeedVideoSizes = z2;
        this.Camera2StreamConfigurationMap = i;
        this.getHighSpeedVideoSizesFor = j;
        this.getHighSpeedVideoFpsRanges = animatable;
        this.getOutputMinFrameDuration = f;
        this.getInputFormats = function0;
        this.getHighSpeedVideoFpsRangesFor = f2;
    }
}
