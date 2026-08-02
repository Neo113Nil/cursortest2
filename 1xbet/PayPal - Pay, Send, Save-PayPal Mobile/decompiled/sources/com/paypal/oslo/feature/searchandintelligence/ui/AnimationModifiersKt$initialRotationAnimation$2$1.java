package com.paypal.oslo.feature.searchandintelligence.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.searchandintelligence.ui.AnimationModifiersKt$initialRotationAnimation$2$1", f = "AnimationModifiers.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ALERT_WARNING_VALUE, 205}, m = "invokeSuspend", n = {}, nl = {202, 207}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class AnimationModifiersKt$initialRotationAnimation$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap;
    final /* synthetic */ float getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ boolean getHighSpeedVideoFpsRanges;
    final /* synthetic */ boolean getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ long getHighSpeedVideoSizes;
    final /* synthetic */ float getHighSpeedVideoSizesFor;
    int getInputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> getOutputFormats;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r12.getOutputFormats, kotlin.coroutines.jvm.internal.Boxing.boxFloat(r12.getHighSpeedVideoSizesFor), androidx.compose.animation.core.AnimationSpecKt.tween$default((int) kotlin.time.Duration.m23953getInWholeMillisecondsimpl(r12.getHighSpeedVideoSizes), 0, androidx.compose.animation.core.EasingKt.getFastOutSlowInEasing(), 2, null), null, null, r12, 12, null) != r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
    
        if (r12.getOutputFormats.snapTo(kotlin.coroutines.jvm.internal.Boxing.boxFloat(r12.getHighResolutionOutputSizeshNQ4ISI), r12) == r0) goto L19;
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
            if (!this.getHighSpeedVideoFpsRanges) {
                this.getInputSizeshNQ4ISI = 2;
            } else if (!this.getHighSpeedVideoFpsRangesFor) {
                this.getInputSizeshNQ4ISI = 1;
            }
        } else if (i == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.Camera2StreamConfigurationMap.invoke();
        } else {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.searchandintelligence.ui.AnimationModifiersKt$initialRotationAnimation$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.searchandintelligence.ui.AnimationModifiersKt$initialRotationAnimation$2$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getOutputFormats, this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnimationModifiersKt$initialRotationAnimation$2$1(boolean z, boolean z2, androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable, float f, long j, kotlin.jvm.functions.Function0<kotlin.Unit> function0, float f2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.searchandintelligence.ui.AnimationModifiersKt$initialRotationAnimation$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = z;
        this.getHighSpeedVideoFpsRangesFor = z2;
        this.getOutputFormats = animatable;
        this.getHighSpeedVideoSizesFor = f;
        this.getHighSpeedVideoSizes = j;
        this.Camera2StreamConfigurationMap = function0;
        this.getHighResolutionOutputSizeshNQ4ISI = f2;
    }
}
