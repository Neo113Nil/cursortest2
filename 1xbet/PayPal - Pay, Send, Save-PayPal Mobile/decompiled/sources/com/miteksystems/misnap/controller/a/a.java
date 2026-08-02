package com.miteksystems.misnap.controller.a;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fB!\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u000b\u0010\u0013J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0005\u001a\u00020\u0007H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/miteksystems/misnap/controller/a/a;", "Lcom/miteksystems/misnap/controller/a/a0;", "Lcom/miteksystems/misnap/core/Frame;", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_FRAME, "Lcom/miteksystems/misnap/controller/a/b0;", "a", "(Lcom/miteksystems/misnap/core/Frame;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/miteksystems/misnap/barcode/MiSnapBarcodeAnalyzer;", "Lcom/miteksystems/misnap/barcode/MiSnapBarcodeAnalyzer;", "analyzer", "<init>", "(Lcom/miteksystems/misnap/barcode/MiSnapBarcodeAnalyzer;)V", "Landroid/content/Context;", "activityContext", "Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis$Barcode;", "barcodeSettings", "", com.miteksystems.misnap.core.MiSnapSettings.KEY_LICENSE, "(Landroid/content/Context;Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis$Barcode;Ljava/lang/String;)V", "controller_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes10.dex */
public final class a implements com.miteksystems.misnap.controller.a.a0 {
    private final com.miteksystems.misnap.barcode.MiSnapBarcodeAnalyzer getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(android.content.Context context, com.miteksystems.misnap.core.MiSnapSettings.Analysis.Barcode barcode, java.lang.String str) {
        this(new com.miteksystems.misnap.barcode.MiSnapBarcodeAnalyzer(context, barcode, str));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barcode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }

    @Override // com.miteksystems.misnap.controller.a.a0
    public final /* synthetic */ java.lang.Object a(com.miteksystems.misnap.core.Frame frame, kotlin.coroutines.Continuation continuation) {
        com.miteksystems.misnap.barcode.MiSnapBarcodeAnalyzer.Result.Processed analyze = this.getHighSpeedVideoFpsRangesFor.analyze(frame);
        if (!(analyze instanceof com.miteksystems.misnap.barcode.MiSnapBarcodeAnalyzer.Result.Processed)) {
            if (analyze instanceof com.miteksystems.misnap.barcode.MiSnapBarcodeAnalyzer.Result.Failure) {
                throw new com.miteksystems.misnap.controller.a.c(new com.miteksystems.misnap.controller.MiSnapController.ErrorResult.BarcodeAnalysis((com.miteksystems.misnap.barcode.MiSnapBarcodeAnalyzer.Result.Failure) analyze));
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.miteksystems.misnap.barcode.MiSnapBarcodeAnalyzer.Result.Processed processed = analyze;
        com.miteksystems.misnap.core.Barcode barcode = processed.getBarcode();
        if ((barcode != null ? barcode.getEncodedBarcode() : null) != null) {
            com.miteksystems.misnap.core.Barcode barcode2 = processed.getBarcode();
            if ((barcode2 != null ? barcode2.getRawBarcode() : null) != null) {
                return new com.miteksystems.misnap.controller.a.b(com.miteksystems.misnap.core.UserAction.NONE.INSTANCE, processed.getBarcode(), processed.getLicenseExpired());
            }
        }
        return new com.miteksystems.misnap.controller.a.b(com.miteksystems.misnap.core.UserAction.Barcode.NOT_FOUND.INSTANCE, null, processed.getLicenseExpired(), 2, null);
    }

    public a(com.miteksystems.misnap.barcode.MiSnapBarcodeAnalyzer miSnapBarcodeAnalyzer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(miSnapBarcodeAnalyzer, "");
        this.getHighSpeedVideoFpsRangesFor = miSnapBarcodeAnalyzer;
    }

    @Override // com.miteksystems.misnap.controller.a.a0
    public final /* synthetic */ void a() {
        this.getHighSpeedVideoFpsRangesFor.release();
    }
}
