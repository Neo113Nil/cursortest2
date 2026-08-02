package com.paypal.oslo.feature.qrc.ui.showtopay.home;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayScreenKt$ShowToPayScreen$1$1", f = "ShowToPayScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class ShowToPayScreenKt$ShowToPayScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayViewModel Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ android.content.Context getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.Camera2StreamConfigurationMap.handleEvent(new com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent.LoadScreen(this.getHighSpeedVideoFpsRangesFor));
        if (androidx.core.content.ContextCompat.checkSelfPermission(this.getHighSpeedVideoSizes, com.paypal.oslo.core.permission.domain.model.PermissionType.FineLocation.INSTANCE.getPermission()) == 0) {
            kotlin.Pair<java.lang.Double, java.lang.Double> location = com.paypal.oslo.feature.qrc.ui.scanner.ScannerScreenKt.getLocation(this.getHighSpeedVideoSizes);
            this.Camera2StreamConfigurationMap.detectCountryFromLocation(location != null ? location.getFirst() : null, location != null ? location.getSecond() : null);
            this.Camera2StreamConfigurationMap.handleEvent(com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayEvent.CheckLocation.INSTANCE);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayScreenKt$ShowToPayScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayScreenKt$ShowToPayScreen$1$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShowToPayScreenKt$ShowToPayScreen$1$1(com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayViewModel showToPayViewModel, java.lang.String str, android.content.Context context, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.qrc.ui.showtopay.home.ShowToPayScreenKt$ShowToPayScreen$1$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = showToPayViewModel;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoSizes = context;
    }
}
