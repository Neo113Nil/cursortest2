package com.paypal.oslo.feature.cashin.ui.barcode.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroidx/compose/ui/graphics/ImageBitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cashin.ui.barcode.viewmodel.BarcodeViewModel$mapToSuccessState$barcodeBitmap$1", f = "BarcodeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class BarcodeViewModel$mapToSuccessState$barcodeBitmap$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super androidx.compose.ui.graphics.ImageBitmap>, java.lang.Object> {
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.cashin.domain.model.CashInActivationDetails getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        android.graphics.Bitmap generateBarcode$default = com.paypal.oslo.feature.cashin.ui.barcode.util.BarcodeGenerator.generateBarcode$default(com.paypal.oslo.feature.cashin.ui.barcode.util.BarcodeGenerator.INSTANCE, this.getHighSpeedVideoSizes.getCode(), 600, 200, null, 8, null);
        if (generateBarcode$default != null) {
            return androidx.compose.ui.graphics.AndroidImageBitmap_androidKt.asImageBitmap(generateBarcode$default);
        }
        return null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super androidx.compose.ui.graphics.ImageBitmap> continuation) {
        return ((com.paypal.oslo.feature.cashin.ui.barcode.viewmodel.BarcodeViewModel$mapToSuccessState$barcodeBitmap$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.cashin.ui.barcode.viewmodel.BarcodeViewModel$mapToSuccessState$barcodeBitmap$1(this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BarcodeViewModel$mapToSuccessState$barcodeBitmap$1(com.paypal.oslo.feature.cashin.domain.model.CashInActivationDetails cashInActivationDetails, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cashin.ui.barcode.viewmodel.BarcodeViewModel$mapToSuccessState$barcodeBitmap$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = cashInActivationDetails;
    }
}
