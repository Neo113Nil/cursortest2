package com.paypal.oslo.feature.directdeposit.ui.pdf;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPdfViewerScreenKt$DirectDepositPdfViewerScreenContent$6$1", f = "DirectDepositPdfViewerScreen.kt", i = {}, l = {144}, m = "invokeSuspend", n = {}, nl = {152}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class DirectDepositPdfViewerScreenKt$DirectDepositPdfViewerScreenContent$6$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.MutableIntState getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.MutableIntState getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.coroutines.CoroutineContext getHighSpeedVideoSizes;
    final /* synthetic */ java.io.File getInputFormats;
    final /* synthetic */ androidx.compose.runtime.MutableState<android.graphics.Bitmap> getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPdfRenderer getOutputFormats;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean booleanValue;
        int intValue;
        int intValue2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputMinFrameDuration;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            booleanValue = ((java.lang.Boolean) this.Camera2StreamConfigurationMap.getValue()).booleanValue();
            if (booleanValue) {
                intValue = this.getHighResolutionOutputSizeshNQ4ISI.getIntValue();
                if (intValue > 0) {
                    intValue2 = this.getHighSpeedVideoFpsRangesFor.getIntValue();
                    if (intValue2 > 0) {
                        this.getHighSpeedVideoFpsRanges.setValue(java.lang.Boolean.valueOf(true));
                        this.getOutputMinFrameDuration = 1;
                        obj = kotlinx.coroutines.BuildersKt.withContext(this.getHighSpeedVideoSizes, new com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPdfViewerScreenKt$DirectDepositPdfViewerScreenContent$6$1$bitmap$1(this.getOutputFormats, this.getInputFormats, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, null), this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
            }
            return kotlin.Unit.INSTANCE;
        }
        if (i != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        android.graphics.Bitmap access$DirectDepositPdfViewerScreenContent$lambda$10 = com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPdfViewerScreenKt.access$DirectDepositPdfViewerScreenContent$lambda$10(this.getInputSizeshNQ4ISI);
        if (access$DirectDepositPdfViewerScreenContent$lambda$10 != null) {
            access$DirectDepositPdfViewerScreenContent$lambda$10.recycle();
        }
        this.getInputSizeshNQ4ISI.setValue(bitmap);
        this.getHighSpeedVideoFpsRanges.setValue(java.lang.Boolean.valueOf(false));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPdfViewerScreenKt$DirectDepositPdfViewerScreenContent$6$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPdfViewerScreenKt$DirectDepositPdfViewerScreenContent$6$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getOutputFormats, this.getInputFormats, this.getInputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DirectDepositPdfViewerScreenKt$DirectDepositPdfViewerScreenContent$6$1(kotlin.coroutines.CoroutineContext coroutineContext, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, androidx.compose.runtime.MutableIntState mutableIntState, androidx.compose.runtime.MutableIntState mutableIntState2, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState2, com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPdfRenderer directDepositPdfRenderer, java.io.File file, androidx.compose.runtime.MutableState<android.graphics.Bitmap> mutableState3, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPdfViewerScreenKt$DirectDepositPdfViewerScreenContent$6$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = coroutineContext;
        this.Camera2StreamConfigurationMap = mutableState;
        this.getHighResolutionOutputSizeshNQ4ISI = mutableIntState;
        this.getHighSpeedVideoFpsRangesFor = mutableIntState2;
        this.getHighSpeedVideoFpsRanges = mutableState2;
        this.getOutputFormats = directDepositPdfRenderer;
        this.getInputFormats = file;
        this.getInputSizeshNQ4ISI = mutableState3;
    }
}
