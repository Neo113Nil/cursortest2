package com.paypal.oslo.feature.qrc.ui.scanner;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class ScannerScreenKt$ScannerScreen$5$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent, kotlin.Unit> {
    public final void getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent scannerEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scannerEvent, "");
        ((com.paypal.oslo.feature.qrc.ui.scanner.ScannerViewModel) this.receiver).handleIntent(scannerEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent scannerEvent) {
        getHighResolutionOutputSizeshNQ4ISI(scannerEvent);
        return kotlin.Unit.INSTANCE;
    }

    ScannerScreenKt$ScannerScreen$5$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.qrc.ui.scanner.ScannerViewModel.class, "handleIntent", "handleIntent(Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent;)V", 0);
    }
}
