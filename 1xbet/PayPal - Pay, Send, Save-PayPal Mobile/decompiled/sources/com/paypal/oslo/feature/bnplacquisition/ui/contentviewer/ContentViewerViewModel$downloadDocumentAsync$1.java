package com.paypal.oslo.feature.bnplacquisition.ui.contentviewer;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerViewModel$downloadDocumentAsync$1", f = "ContentViewerViewModel.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, nl = {80}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class ContentViewerViewModel$downloadDocumentAsync$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerViewModel Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.bnplacquisition.domain.usecase.DownloadDocumentUseCase downloadDocumentUseCase;
        com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage sessionStorage;
        com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage sessionStorage2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            downloadDocumentUseCase = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap;
            java.lang.String str = this.getHighSpeedVideoSizes;
            java.lang.String str2 = this.getHighSpeedVideoFpsRanges;
            java.lang.String str3 = this.getHighResolutionOutputSizeshNQ4ISI;
            sessionStorage = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
            java.lang.String getHighSpeedVideoFpsRangesFor = sessionStorage.getGetHighSpeedVideoFpsRangesFor();
            if (getHighSpeedVideoFpsRangesFor == null) {
                getHighSpeedVideoFpsRangesFor = "";
            }
            java.lang.String str4 = getHighSpeedVideoFpsRangesFor;
            sessionStorage2 = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoFpsRangesFor = 1;
            obj = downloadDocumentUseCase.invoke(str, str2, str3, str4, sessionStorage2.getGetHighResolutionOutputSizeshNQ4ISI(), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either = (arrow.core.Either) obj;
        com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerViewModel contentViewerViewModel = this.Camera2StreamConfigurationMap;
        if (either instanceof arrow.core.Either.Right) {
            contentViewerViewModel.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerEvent.DownloadSuccess((android.net.Uri) ((arrow.core.Either.Right) either).getValue()));
        } else if (either instanceof arrow.core.Either.Left) {
            contentViewerViewModel.processEvent(com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerEvent.DownloadError.INSTANCE);
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerViewModel$downloadDocumentAsync$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerViewModel$downloadDocumentAsync$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContentViewerViewModel$downloadDocumentAsync$1(com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerViewModel contentViewerViewModel, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.contentviewer.ContentViewerViewModel$downloadDocumentAsync$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = contentViewerViewModel;
        this.getHighSpeedVideoSizes = str;
        this.getHighSpeedVideoFpsRanges = str2;
        this.getHighResolutionOutputSizeshNQ4ISI = str3;
    }
}
