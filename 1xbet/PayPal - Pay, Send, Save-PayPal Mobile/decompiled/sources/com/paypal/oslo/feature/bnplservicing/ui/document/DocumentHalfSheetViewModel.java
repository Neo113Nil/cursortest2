package com.paypal.oslo.feature.bnplservicing.ui.document;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00180\u001c8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/document/DocumentHalfSheetViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/bnplservicing/domain/usecase/DownloadDocumentUseCase;", "downloadDocument", "Lcom/paypal/oslo/feature/bnplservicing/ui/document/PdfViewerIntent;", "pdfViewerIntent", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/domain/usecase/DownloadDocumentUseCase;Lcom/paypal/oslo/feature/bnplservicing/ui/document/PdfViewerIntent;)V", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/model/DocumentData;", "document", "", "creditAccountId", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware.KEY_CPI, "", "onDocumentClick", "(Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/model/DocumentData;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;)V", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/bnplservicing/domain/usecase/DownloadDocumentUseCase;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/bnplservicing/ui/document/PdfViewerIntent;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/feature/bnplservicing/ui/document/DocumentResult;", "getDocumentResult", "()Lkotlinx/coroutines/flow/Flow;", "documentResult", "Lkotlinx/coroutines/channels/Channel;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/channels/Channel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DocumentHalfSheetViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplservicing.domain.usecase.DownloadDocumentUseCase getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplservicing.ui.document.PdfViewerIntent getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.channels.Channel<com.paypal.oslo.feature.bnplservicing.ui.document.DocumentResult> getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public DocumentHalfSheetViewModel(com.paypal.oslo.feature.bnplservicing.domain.usecase.DownloadDocumentUseCase downloadDocumentUseCase, com.paypal.oslo.feature.bnplservicing.ui.document.PdfViewerIntent pdfViewerIntent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadDocumentUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pdfViewerIntent, "");
        this.getHighSpeedVideoSizes = downloadDocumentUseCase;
        this.getHighSpeedVideoFpsRangesFor = pdfViewerIntent;
        this.getHighResolutionOutputSizeshNQ4ISI = kotlinx.coroutines.channels.ChannelKt.Channel$default(-2, null, null, 6, null);
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.bnplservicing.ui.document.DocumentResult> getDocumentResult() {
        return kotlinx.coroutines.flow.FlowKt.receiveAsFlow(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final void onDocumentClick(com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.DocumentData document, java.lang.String creditAccountId, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier cpi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(document, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cpi, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetViewModel$onDocumentClick$1(this, document, creditAccountId, cpi, null), 3, null);
    }
}
