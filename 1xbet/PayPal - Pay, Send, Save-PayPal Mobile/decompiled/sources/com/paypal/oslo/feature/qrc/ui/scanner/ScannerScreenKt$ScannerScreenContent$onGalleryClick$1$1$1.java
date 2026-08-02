package com.paypal.oslo.feature.qrc.ui.scanner;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class ScannerScreenKt$ScannerScreenContent$onGalleryClick$1$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<androidx.view.result.PickVisualMediaRequest, kotlin.Unit> {
    public final void getHighResolutionOutputSizeshNQ4ISI(androidx.view.result.PickVisualMediaRequest pickVisualMediaRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pickVisualMediaRequest, "");
        ((androidx.view.compose.ManagedActivityResultLauncher) this.receiver).launch(pickVisualMediaRequest);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(androidx.view.result.PickVisualMediaRequest pickVisualMediaRequest) {
        getHighResolutionOutputSizeshNQ4ISI(pickVisualMediaRequest);
        return kotlin.Unit.INSTANCE;
    }

    ScannerScreenKt$ScannerScreenContent$onGalleryClick$1$1$1(java.lang.Object obj) {
        super(1, obj, androidx.view.compose.ManagedActivityResultLauncher.class, "launch", "launch(Ljava/lang/Object;)V", 0);
    }
}
