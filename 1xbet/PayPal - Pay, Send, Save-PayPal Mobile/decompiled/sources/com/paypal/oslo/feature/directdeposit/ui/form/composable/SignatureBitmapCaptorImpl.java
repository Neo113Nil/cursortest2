package com.paypal.oslo.feature.directdeposit.ui.form.composable;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/ui/form/composable/SignatureBitmapCaptorImpl;", "Lcom/paypal/oslo/feature/directdeposit/ui/form/composable/SignatureBitmapCaptor;", "<init>", "()V", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "graphicsLayer", "Landroid/graphics/Bitmap;", "capture", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SignatureBitmapCaptorImpl implements com.paypal.oslo.feature.directdeposit.ui.form.composable.SignatureBitmapCaptor {
    public static final int $stable = 0;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.directdeposit.ui.form.composable.SignatureBitmapCaptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object capture(androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer, kotlin.coroutines.Continuation<? super android.graphics.Bitmap> continuation) {
        com.paypal.oslo.feature.directdeposit.ui.form.composable.SignatureBitmapCaptorImpl$capture$1 signatureBitmapCaptorImpl$capture$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.directdeposit.ui.form.composable.SignatureBitmapCaptorImpl$capture$1) {
            signatureBitmapCaptorImpl$capture$1 = (com.paypal.oslo.feature.directdeposit.ui.form.composable.SignatureBitmapCaptorImpl$capture$1) continuation;
            if ((signatureBitmapCaptorImpl$capture$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                signatureBitmapCaptorImpl$capture$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = signatureBitmapCaptorImpl$capture$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = signatureBitmapCaptorImpl$capture$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    signatureBitmapCaptorImpl$capture$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(graphicsLayer);
                    signatureBitmapCaptorImpl$capture$1.getHighSpeedVideoSizes = 1;
                    obj = graphicsLayer.toImageBitmap(signatureBitmapCaptorImpl$capture$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return androidx.compose.ui.graphics.AndroidImageBitmap_androidKt.asAndroidBitmap((androidx.compose.ui.graphics.ImageBitmap) obj);
            }
        }
        signatureBitmapCaptorImpl$capture$1 = new com.paypal.oslo.feature.directdeposit.ui.form.composable.SignatureBitmapCaptorImpl$capture$1(this, continuation);
        java.lang.Object obj2 = signatureBitmapCaptorImpl$capture$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = signatureBitmapCaptorImpl$capture$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        return androidx.compose.ui.graphics.AndroidImageBitmap_androidKt.asAndroidBitmap((androidx.compose.ui.graphics.ImageBitmap) obj2);
    }
}
