package com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class TransferAmountEntryScreenKt$LoadedState$2$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> {
    public final void Camera2StreamConfigurationMap(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        ((com.paypal.oslo.feature.wallet.fifo.transfer.ui.viewmodel.TransferAmountViewModel) this.receiver).onAmountChanged(str);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(java.lang.String str) {
        Camera2StreamConfigurationMap(str);
        return kotlin.Unit.INSTANCE;
    }

    TransferAmountEntryScreenKt$LoadedState$2$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.wallet.fifo.transfer.ui.viewmodel.TransferAmountViewModel.class, "onAmountChanged", "onAmountChanged(Ljava/lang/String;)V", 0);
    }
}
