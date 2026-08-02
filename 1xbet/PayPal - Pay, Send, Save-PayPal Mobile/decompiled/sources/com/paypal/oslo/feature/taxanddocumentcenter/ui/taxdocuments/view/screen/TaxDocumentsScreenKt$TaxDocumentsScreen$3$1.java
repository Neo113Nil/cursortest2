package com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsScreenKt$TaxDocumentsScreen$3$1", f = "TaxDocumentsScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class TaxDocumentsScreenKt$TaxDocumentsScreen$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.String> Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.MutableState<com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.MultiSavingsSheetData> getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.String> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.MutableState<com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.MultiSavingsSheetData> getHighSpeedVideoSizes;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getOutputMinFrameDuration != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState access$TaxDocumentsScreen$lambda$0 = com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsScreenKt.access$TaxDocumentsScreen$lambda$0(this.getHighResolutionOutputSizeshNQ4ISI);
        if ((access$TaxDocumentsScreen$lambda$0 instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.Downloading) || (access$TaxDocumentsScreen$lambda$0 instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.DownloadError)) {
            if (com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsScreenKt.access$TaxDocumentsScreen$lambda$9(this.getHighSpeedVideoSizes) != null) {
                this.getHighSpeedVideoFpsRanges.setValue(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsScreenKt.access$TaxDocumentsScreen$lambda$9(this.getHighSpeedVideoSizes));
                this.getHighSpeedVideoFpsRangesFor.setValue(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsScreenKt.access$TaxDocumentsScreen$lambda$12(this.Camera2StreamConfigurationMap));
                this.getHighSpeedVideoSizes.setValue(null);
            }
        } else if ((access$TaxDocumentsScreen$lambda$0 instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState.Content) && com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsScreenKt.access$TaxDocumentsScreen$lambda$15(this.getHighSpeedVideoFpsRanges) != null) {
            this.getHighSpeedVideoSizes.setValue(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsScreenKt.access$TaxDocumentsScreen$lambda$15(this.getHighSpeedVideoFpsRanges));
            this.Camera2StreamConfigurationMap.setValue(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsScreenKt.access$TaxDocumentsScreen$lambda$18(this.getHighSpeedVideoFpsRangesFor));
            this.getHighSpeedVideoFpsRanges.setValue(null);
            this.getHighSpeedVideoFpsRangesFor.setValue(null);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsScreenKt$TaxDocumentsScreen$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsScreenKt$TaxDocumentsScreen$3$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TaxDocumentsScreenKt$TaxDocumentsScreen$3$1(androidx.compose.runtime.State<? extends com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiState> state, androidx.compose.runtime.MutableState<com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.MultiSavingsSheetData> mutableState, androidx.compose.runtime.MutableState<com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.MultiSavingsSheetData> mutableState2, androidx.compose.runtime.MutableState<java.lang.String> mutableState3, androidx.compose.runtime.MutableState<java.lang.String> mutableState4, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsScreenKt$TaxDocumentsScreen$3$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = state;
        this.getHighSpeedVideoSizes = mutableState;
        this.getHighSpeedVideoFpsRanges = mutableState2;
        this.Camera2StreamConfigurationMap = mutableState3;
        this.getHighSpeedVideoFpsRangesFor = mutableState4;
    }
}
