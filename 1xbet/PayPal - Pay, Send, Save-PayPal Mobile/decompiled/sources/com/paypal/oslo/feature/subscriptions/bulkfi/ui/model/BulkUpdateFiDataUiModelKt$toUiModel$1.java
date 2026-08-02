package com.paypal.oslo.feature.subscriptions.bulkfi.ui.model;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiDataUiModelKt", f = "BulkUpdateFiDataUiModel.kt", i = {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {34, 35}, m = "toUiModel", n = {"$this$toUiModel", "formatHelper", "$this$toUiModel", "formatHelper", "$this$map$iv", "$this$mapTo$iv$iv", "destination$iv$iv", "item$iv$iv", "it", "$i$f$map", "$i$f$mapTo", "$i$a$-map-BulkUpdateFiDataUiModelKt$toUiModel$2"}, nl = {35, 41}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$6", "L$7", "I$0", "I$1", "I$2"}, v = 2)
/* loaded from: classes15.dex */
final class BulkUpdateFiDataUiModelKt$toUiModel$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    /* synthetic */ java.lang.Object getOutputMinFrameDurationlomOqCM;
    java.lang.Object getOutputSizes;
    int getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDurationlomOqCM = obj;
        this.getOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiDataUiModelKt.toUiModel(null, null, this);
    }

    BulkUpdateFiDataUiModelKt$toUiModel$1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiDataUiModelKt$toUiModel$1> continuation) {
        super(continuation);
    }
}
