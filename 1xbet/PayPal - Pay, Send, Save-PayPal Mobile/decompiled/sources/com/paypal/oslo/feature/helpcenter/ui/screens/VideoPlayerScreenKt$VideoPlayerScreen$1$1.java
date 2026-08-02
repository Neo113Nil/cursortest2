package com.paypal.oslo.feature.helpcenter.ui.screens;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.helpcenter.ui.screens.VideoPlayerScreenKt$VideoPlayerScreen$1$1", f = "VideoPlayerScreen.kt", i = {0}, l = {77}, m = "invokeSuspend", n = {"videoView"}, nl = {78}, s = {"L$0"}, v = 2)
/* loaded from: classes12.dex */
final class VideoPlayerScreenKt$VideoPlayerScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.MutableState<android.widget.VideoView> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.MutableIntState getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0039 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0037 -> B:5:0x003a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.getHighSpeedVideoSizes
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            java.lang.Object r1 = r5.Camera2StreamConfigurationMap
            android.widget.VideoView r1 = (android.widget.VideoView) r1
            kotlin.ResultKt.throwOnFailure(r6)
            goto L3a
        L13:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1b:
            kotlin.ResultKt.throwOnFailure(r6)
            androidx.compose.runtime.MutableState<android.widget.VideoView> r6 = r5.getHighResolutionOutputSizeshNQ4ISI
            android.widget.VideoView r6 = com.paypal.oslo.feature.helpcenter.ui.screens.VideoPlayerScreenKt.access$VideoPlayerScreen$lambda$4(r6)
            if (r6 != 0) goto L29
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L29:
            r1 = r6
        L2a:
            r6 = r5
            kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
            r5.Camera2StreamConfigurationMap = r1
            r5.getHighSpeedVideoSizes = r2
            r3 = 250(0xfa, double:1.235E-321)
            java.lang.Object r6 = kotlinx.coroutines.DelayKt.delay(r3, r6)
            if (r6 != r0) goto L3a
            return r0
        L3a:
            boolean r6 = r1.isPlaying()
            if (r6 == 0) goto L2a
            androidx.compose.runtime.MutableIntState r6 = r5.getHighSpeedVideoFpsRangesFor
            int r3 = r1.getCurrentPosition()
            com.paypal.oslo.feature.helpcenter.ui.screens.VideoPlayerScreenKt.access$VideoPlayerScreen$lambda$2(r6, r3)
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.oslo.feature.helpcenter.ui.screens.VideoPlayerScreenKt$VideoPlayerScreen$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.helpcenter.ui.screens.VideoPlayerScreenKt$VideoPlayerScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.helpcenter.ui.screens.VideoPlayerScreenKt$VideoPlayerScreen$1$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VideoPlayerScreenKt$VideoPlayerScreen$1$1(androidx.compose.runtime.MutableState<android.widget.VideoView> mutableState, androidx.compose.runtime.MutableIntState mutableIntState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.helpcenter.ui.screens.VideoPlayerScreenKt$VideoPlayerScreen$1$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = mutableState;
        this.getHighSpeedVideoFpsRangesFor = mutableIntState;
    }
}
