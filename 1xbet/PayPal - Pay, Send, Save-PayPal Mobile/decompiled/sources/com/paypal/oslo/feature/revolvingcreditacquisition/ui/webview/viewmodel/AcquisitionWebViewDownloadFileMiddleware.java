package com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u00020\n2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewDownloadFileMiddleware;", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewState;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/viewmodel/AcquisitionWebViewEvent;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/domain/usecase/DownloadFileUseCase;", "downloadFileUseCase", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditacquisition/domain/usecase/DownloadFileUseCase;)V", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware$Input;", "input", "", "invoke", "(Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware$Input;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/domain/usecase/DownloadFileUseCase;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AcquisitionWebViewDownloadFileMiddleware implements com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewState, com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent> {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.revolvingcreditacquisition.domain.usecase.DownloadFileUseCase getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public AcquisitionWebViewDownloadFileMiddleware(com.paypal.oslo.feature.revolvingcreditacquisition.domain.usecase.DownloadFileUseCase downloadFileUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadFileUseCase, "");
        this.getHighResolutionOutputSizeshNQ4ISI = downloadFileUseCase;
    }

    @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
    public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewState, com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent> input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent event = input.getEvent();
        kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent, kotlin.Unit> eventDispatcher = input.getEventDispatcher();
        if (event instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewEvent.OnDownloadRequested) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(input.getScope(), null, null, new com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewDownloadFileMiddleware$invoke$1(this, event, eventDispatcher, null), 3, null);
        }
    }
}
