package com.paypal.oslo.feature.cashin.ui.utils;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cashin.ui.utils.MarkerUtilsKt$rememberMarkerIcon$1$1", f = "MarkerUtils.kt", i = {0}, l = {193}, m = "invokeSuspend", n = {"request"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_EXTERNAL_VALUE}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class MarkerUtilsKt$rememberMarkerIcon$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.runtime.MutableState<com.google.android.gms.maps.model.BitmapDescriptor> Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.core.commonui.components.ImageLoader getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ android.content.Context getHighSpeedVideoSizes;
    java.lang.Object getInputFormats;
    int getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputSizeshNQ4ISI;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                java.lang.String str = this.getHighResolutionOutputSizeshNQ4ISI;
                if (str != null && !kotlin.text.StringsKt.isBlank(str)) {
                    com.paypal.oslo.core.commonui.components.ImageRequest build = new com.paypal.oslo.core.commonui.components.ImageRequest.Builder(this.getHighSpeedVideoSizes).data(this.getHighResolutionOutputSizeshNQ4ISI).size(this.getHighSpeedVideoFpsRanges).build();
                    this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(build);
                    this.getInputSizeshNQ4ISI = 1;
                    obj = this.getHighSpeedVideoFpsRangesFor.execute(build, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    this.Camera2StreamConfigurationMap.setValue(null);
                    return kotlin.Unit.INSTANCE;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            com.paypal.oslo.core.commonui.components.ImageResult imageResult = (com.paypal.oslo.core.commonui.components.ImageResult) obj;
            if (imageResult instanceof com.paypal.oslo.core.commonui.components.SuccessResult) {
                this.Camera2StreamConfigurationMap.setValue(com.google.android.gms.maps.model.BitmapDescriptorFactory.fromBitmap(android.graphics.Bitmap.createScaledBitmap(((com.paypal.oslo.core.commonui.components.SuccessResult) imageResult).getImage().toBitmap(), this.getHighSpeedVideoFpsRanges, 120, true)));
            }
        } catch (java.lang.UnsupportedOperationException e) {
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.cashin.LoggerKt.log, "MarkerUtils: Failed to load marker icon from URL", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", this.getHighResolutionOutputSizeshNQ4ISI), kotlin.TuplesKt.to("error", e.getMessage())), null, 4, null);
            this.Camera2StreamConfigurationMap.setValue(null);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.cashin.ui.utils.MarkerUtilsKt$rememberMarkerIcon$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.cashin.ui.utils.MarkerUtilsKt$rememberMarkerIcon$1$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MarkerUtilsKt$rememberMarkerIcon$1$1(java.lang.String str, android.content.Context context, int i, com.paypal.oslo.core.commonui.components.ImageLoader imageLoader, androidx.compose.runtime.MutableState<com.google.android.gms.maps.model.BitmapDescriptor> mutableState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cashin.ui.utils.MarkerUtilsKt$rememberMarkerIcon$1$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoSizes = context;
        this.getHighSpeedVideoFpsRanges = i;
        this.getHighSpeedVideoFpsRangesFor = imageLoader;
        this.Camera2StreamConfigurationMap = mutableState;
    }
}
