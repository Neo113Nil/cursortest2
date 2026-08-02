package com.paypal.oslo.feature.cashin.ui.barcode.composable;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class CashInMethodSelectionScreenKt$CashInMethodSelectionScreen$3$4$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> {
    public final void Camera2StreamConfigurationMap(java.lang.String str) {
        ((com.paypal.oslo.feature.cashin.ui.barcode.viewmodel.BarcodeViewModel) this.receiver).onDebitCardProvisioningComplete(str);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(java.lang.String str) {
        Camera2StreamConfigurationMap(str);
        return kotlin.Unit.INSTANCE;
    }

    CashInMethodSelectionScreenKt$CashInMethodSelectionScreen$3$4$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.cashin.ui.barcode.viewmodel.BarcodeViewModel.class, "onDebitCardProvisioningComplete", "onDebitCardProvisioningComplete(Ljava/lang/String;)V", 0);
    }
}
