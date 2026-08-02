package com.paypal.oslo.feature.verificationcapture.ui.screens.daonface;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessCaptureScreenKt$DaonFaceLivenessCaptureScreen$1$1", f = "DaonFaceLivenessCaptureScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class DaonFaceLivenessCaptureScreenKt$DaonFaceLivenessCaptureScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ android.content.Context getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.android.logger.Logger log = com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog();
        java.lang.String str = this.getHighSpeedVideoFpsRanges;
        java.lang.String str2 = this.getHighSpeedVideoFpsRangesFor;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[DaonFace] Initializing screen (partyId=");
        sb.append(str);
        sb.append(", flowName=");
        sb.append(str2);
        sb.append(")");
        com.paypal.android.logger.Logger.i$default(log, sb.toString(), null, null, 6, null);
        this.getHighSpeedVideoSizes.initialize(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessCaptureScreenKt$DaonFaceLivenessCaptureScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessCaptureScreenKt$DaonFaceLivenessCaptureScreen$1$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DaonFaceLivenessCaptureScreenKt$DaonFaceLivenessCaptureScreen$1$1(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessViewModel daonFaceLivenessViewModel, android.content.Context context, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceLivenessCaptureScreenKt$DaonFaceLivenessCaptureScreen$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighSpeedVideoFpsRangesFor = str2;
        this.getHighSpeedVideoSizes = daonFaceLivenessViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = context;
    }
}
