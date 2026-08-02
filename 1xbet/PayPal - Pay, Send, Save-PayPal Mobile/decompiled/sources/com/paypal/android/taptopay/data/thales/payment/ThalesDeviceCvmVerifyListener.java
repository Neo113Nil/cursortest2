package com.paypal.android.taptopay.data.thales.payment;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u0003J!\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0003"}, d2 = {"Lcom/paypal/android/taptopay/data/thales/payment/ThalesDeviceCvmVerifyListener;", "Lcom/gemalto/mfs/mwsdk/cdcvm/DeviceCVMVerifyListener;", "<init>", "()V", "Lcom/gemalto/mfs/mwsdk/sdkconfig/SDKError;", "", "sdkError", "", "onVerifyError", "(Lcom/gemalto/mfs/mwsdk/sdkconfig/SDKError;)V", "onVerifyFailed", "helpCode", "", "charSequence", "onVerifyHelp", "(ILjava/lang/CharSequence;)V", "onVerifySuccess"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ThalesDeviceCvmVerifyListener implements com.gemalto.mfs.mwsdk.cdcvm.DeviceCVMVerifyListener {
    @Override // com.gemalto.mfs.mwsdk.cdcvm.DeviceCVMVerifyListener
    public final void onVerifySuccess() {
        com.paypal.android.logger.Logger.i$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "onVerifySuccess", null, null, 6, null);
    }

    @Override // com.gemalto.mfs.mwsdk.cdcvm.DeviceCVMVerifyListener
    public final void onVerifyError(com.gemalto.mfs.mwsdk.sdkconfig.SDKError<java.lang.Integer> sdkError) {
        com.paypal.android.logger.Logger log = com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog();
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        pairArr[0] = kotlin.TuplesKt.to("message", sdkError != null ? sdkError.getErrorMessage() : null);
        pairArr[1] = kotlin.TuplesKt.to("code", sdkError != null ? sdkError.getErrorCode() : null);
        com.paypal.android.logger.Logger.w$default(log, "onVerifyError", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
    }

    @Override // com.gemalto.mfs.mwsdk.cdcvm.DeviceCVMVerifyListener
    public final void onVerifyFailed() {
        com.paypal.android.logger.Logger.w$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "onVerifyFailed", null, null, 6, null);
    }

    @Override // com.gemalto.mfs.mwsdk.cdcvm.DeviceCVMVerifyListener
    public final void onVerifyHelp(int helpCode, java.lang.CharSequence charSequence) {
        com.paypal.android.logger.Logger log = com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog();
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        pairArr[0] = kotlin.TuplesKt.to("helpCode", java.lang.Integer.valueOf(helpCode));
        pairArr[1] = kotlin.TuplesKt.to("charSequence", charSequence != null ? charSequence.toString() : null);
        com.paypal.android.logger.Logger.i$default(log, "onVerifyHelp", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
    }
}
