package com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsScreenKt$TaxDocumentsScreen$4$1", f = "TaxDocumentsScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class TaxDocumentsScreenKt$TaxDocumentsScreen$4$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.MutableState<com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SheetData> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.String> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean booleanValue;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsScreenKt.access$TaxDocumentsScreen$lambda$27(this.getHighSpeedVideoSizes) != null) {
            booleanValue = ((java.lang.Boolean) this.getHighSpeedVideoFpsRanges.getValue()).booleanValue();
            if (booleanValue) {
                this.getHighSpeedVideoFpsRangesFor.setValue(null);
                this.getHighSpeedVideoFpsRanges.setValue(java.lang.Boolean.valueOf(false));
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsScreenKt$TaxDocumentsScreen$4$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsScreenKt$TaxDocumentsScreen$4$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TaxDocumentsScreenKt$TaxDocumentsScreen$4$1(androidx.compose.runtime.MutableState<java.lang.String> mutableState, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState2, androidx.compose.runtime.MutableState<com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SheetData> mutableState3, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsScreenKt$TaxDocumentsScreen$4$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = mutableState;
        this.getHighSpeedVideoFpsRanges = mutableState2;
        this.getHighSpeedVideoFpsRangesFor = mutableState3;
    }
}
