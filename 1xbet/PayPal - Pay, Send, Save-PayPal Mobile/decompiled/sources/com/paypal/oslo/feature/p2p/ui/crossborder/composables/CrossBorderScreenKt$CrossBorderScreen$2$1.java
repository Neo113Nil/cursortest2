package com.paypal.oslo.feature.p2p.ui.crossborder.composables;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.crossborder.composables.CrossBorderScreenKt$CrossBorderScreen$2$1", f = "CrossBorderScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class CrossBorderScreenKt$CrossBorderScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel getHighSpeedVideoSizesFor;
    final /* synthetic */ java.util.List<java.lang.String> getInputFormats;
    final /* synthetic */ java.lang.String getInputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getOutputFormats;
    final /* synthetic */ java.lang.String getOutputMinFrameDuration;
    int getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getOutputStallDurationlomOqCM != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighSpeedVideoSizesFor.processEvent(new com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.Initialize(this.getOutputMinFrameDuration, this.Camera2StreamConfigurationMap, this.getOutputFormats, this.getHighSpeedVideoFpsRanges, this.getInputSizeshNQ4ISI, this.getInputFormats, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.p2p.ui.crossborder.composables.CrossBorderScreenKt$CrossBorderScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.p2p.ui.crossborder.composables.CrossBorderScreenKt$CrossBorderScreen$2$1(this.getHighSpeedVideoSizesFor, this.getOutputMinFrameDuration, this.Camera2StreamConfigurationMap, this.getOutputFormats, this.getHighSpeedVideoFpsRanges, this.getInputSizeshNQ4ISI, this.getInputFormats, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CrossBorderScreenKt$CrossBorderScreen$2$1(com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel crossBorderViewModel, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.List<java.lang.String> list, boolean z, java.lang.String str6, java.lang.String str7, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.crossborder.composables.CrossBorderScreenKt$CrossBorderScreen$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizesFor = crossBorderViewModel;
        this.getOutputMinFrameDuration = str;
        this.Camera2StreamConfigurationMap = str2;
        this.getOutputFormats = str3;
        this.getHighSpeedVideoFpsRanges = str4;
        this.getInputSizeshNQ4ISI = str5;
        this.getInputFormats = list;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.getHighSpeedVideoSizes = str6;
        this.getHighSpeedVideoFpsRangesFor = str7;
    }
}
