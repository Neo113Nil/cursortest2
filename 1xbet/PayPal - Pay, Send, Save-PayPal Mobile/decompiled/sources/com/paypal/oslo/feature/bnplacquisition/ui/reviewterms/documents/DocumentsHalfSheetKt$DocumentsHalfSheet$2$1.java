package com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetKt$DocumentsHalfSheet$2$1", f = "DocumentsHalfSheet.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, nl = {96}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class DocumentsHalfSheetKt$DocumentsHalfSheet$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function1<android.net.Uri, kotlin.Unit> Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetViewModel getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.pds.components.BottomSheetController getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetUiEffect> uiEffect = this.getHighSpeedVideoFpsRanges.getUiEffect();
            final kotlin.jvm.functions.Function1<android.net.Uri, kotlin.Unit> function1 = this.Camera2StreamConfigurationMap;
            final com.paypal.pds.components.BottomSheetController bottomSheetController = this.getHighSpeedVideoFpsRangesFor;
            final kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoSizes = 1;
            if (uiEffect.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetKt$DocumentsHalfSheet$2$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetUiEffect documentsHalfSheetUiEffect = (com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetUiEffect) obj2;
                    if (documentsHalfSheetUiEffect instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetUiEffect.OpenDocument) {
                        function1.invoke(((com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetUiEffect.OpenDocument) documentsHalfSheetUiEffect).getUri());
                    } else {
                        if (!(documentsHalfSheetUiEffect instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetUiEffect.Close)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        bottomSheetController.hideSheet();
                        function0.invoke();
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetKt$DocumentsHalfSheet$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetKt$DocumentsHalfSheet$2$1(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DocumentsHalfSheetKt$DocumentsHalfSheet$2$1(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetViewModel documentsHalfSheetViewModel, kotlin.jvm.functions.Function1<? super android.net.Uri, kotlin.Unit> function1, com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetKt$DocumentsHalfSheet$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = documentsHalfSheetViewModel;
        this.Camera2StreamConfigurationMap = function1;
        this.getHighSpeedVideoFpsRangesFor = bottomSheetController;
        this.getHighResolutionOutputSizeshNQ4ISI = function0;
    }
}
