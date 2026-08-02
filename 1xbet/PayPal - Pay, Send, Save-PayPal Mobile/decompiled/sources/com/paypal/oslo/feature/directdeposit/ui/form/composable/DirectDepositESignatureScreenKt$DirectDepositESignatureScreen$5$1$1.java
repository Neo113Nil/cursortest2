package com.paypal.oslo.feature.directdeposit.ui.form.composable;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureScreenKt$DirectDepositESignatureScreen$5$1$1", f = "DirectDepositESignatureScreen.kt", i = {}, l = {132}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class DirectDepositESignatureScreenKt$DirectDepositESignatureScreen$5$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.ui.graphics.layer.GraphicsLayer getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.form.composable.SignatureBitmapCaptor getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.form.viewmodel.DirectDepositESignatureViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.Camera2StreamConfigurationMap = 1;
            obj = this.getHighSpeedVideoFpsRanges.capture(this.getHighResolutionOutputSizeshNQ4ISI, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.getHighSpeedVideoSizes.processIntent((com.paypal.oslo.feature.directdeposit.ui.form.intent.ESignatureIntent) new com.paypal.oslo.feature.directdeposit.ui.form.intent.ESignatureIntent.DoneClicked((android.graphics.Bitmap) obj));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureScreenKt$DirectDepositESignatureScreen$5$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureScreenKt$DirectDepositESignatureScreen$5$1$1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DirectDepositESignatureScreenKt$DirectDepositESignatureScreen$5$1$1(com.paypal.oslo.feature.directdeposit.ui.form.composable.SignatureBitmapCaptor signatureBitmapCaptor, androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer, com.paypal.oslo.feature.directdeposit.ui.form.viewmodel.DirectDepositESignatureViewModel directDepositESignatureViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureScreenKt$DirectDepositESignatureScreen$5$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = signatureBitmapCaptor;
        this.getHighResolutionOutputSizeshNQ4ISI = graphicsLayer;
        this.getHighSpeedVideoSizes = directDepositESignatureViewModel;
    }
}
