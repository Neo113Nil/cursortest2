package com.datadog.android.compose;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.datadog.android.compose.InteractionTrackingKt$TrackInteractionEffect$1$1", f = "InteractionTracking.kt", i = {}, l = {77, 86}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class InteractionTrackingKt$TrackInteractionEffect$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ boolean Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.foundation.interaction.InteractionSource getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.util.Map<java.lang.String, java.lang.Object> getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.datadog.android.compose.InteractionType getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.datadog.android.api.SdkCore getHighSpeedVideoSizes;
    int getInputFormats;
    final /* synthetic */ java.lang.String getOutputFormats;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (com.datadog.android.compose.internal.InternalInteractionTrackingKt.trackSwipe(r4, r11.getOutputFormats, r11.getHighResolutionOutputSizeshNQ4ISI, (com.datadog.android.compose.InteractionType.Swipe) r12, r11.Camera2StreamConfigurationMap, r11.getHighSpeedVideoFpsRanges, r11) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        if (com.datadog.android.compose.internal.InternalInteractionTrackingKt.trackScroll(r4, r11.getOutputFormats, r11.getHighResolutionOutputSizeshNQ4ISI, (com.datadog.android.compose.InteractionType.Scroll) r12, r11.Camera2StreamConfigurationMap, r11.getHighSpeedVideoFpsRanges, r11) == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.datadog.android.rum.RumMonitor rumMonitor = com.datadog.android.rum.GlobalRumMonitor.get(this.getHighSpeedVideoSizes);
            com.datadog.android.compose.InteractionType interactionType = this.getHighSpeedVideoFpsRangesFor;
            if (interactionType instanceof com.datadog.android.compose.InteractionType.Swipe) {
                this.getInputFormats = 1;
            } else if (interactionType instanceof com.datadog.android.compose.InteractionType.Scroll) {
                this.getInputFormats = 2;
            }
        } else {
            if (i != 1 && i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.datadog.android.compose.InteractionTrackingKt$TrackInteractionEffect$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.datadog.android.compose.InteractionTrackingKt$TrackInteractionEffect$1$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getOutputFormats, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InteractionTrackingKt$TrackInteractionEffect$1$1(com.datadog.android.api.SdkCore sdkCore, com.datadog.android.compose.InteractionType interactionType, java.lang.String str, androidx.compose.foundation.interaction.InteractionSource interactionSource, boolean z, java.util.Map<java.lang.String, ? extends java.lang.Object> map, kotlin.coroutines.Continuation<? super com.datadog.android.compose.InteractionTrackingKt$TrackInteractionEffect$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = sdkCore;
        this.getHighSpeedVideoFpsRangesFor = interactionType;
        this.getOutputFormats = str;
        this.getHighResolutionOutputSizeshNQ4ISI = interactionSource;
        this.Camera2StreamConfigurationMap = z;
        this.getHighSpeedVideoFpsRanges = map;
    }
}
