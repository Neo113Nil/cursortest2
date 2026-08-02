package com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.screen;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.screen.AllTransactionsScreenKt$AllTransactionsScreen$1$1", f = "AllTransactionsScreen.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class AllTransactionsScreenKt$AllTransactionsScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ android.content.Context Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsMviViewModel getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.OpenDownloadedFile> openFileEffect = this.getHighSpeedVideoFpsRangesFor.getOpenFileEffect();
            final android.content.Context context = this.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoSizes = 1;
            if (openFileEffect.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.screen.AllTransactionsScreenKt$AllTransactionsScreen$1$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.OpenDownloadedFile openDownloadedFile = (com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.OpenDownloadedFile) obj2;
                    com.paypal.oslo.feature.taxanddocumentcenter.ui.download.util.FileOpener.openFile$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.download.util.FileOpener.INSTANCE, context, openDownloadedFile.getFileUri(), openDownloadedFile.getMimeType(), null, 8, null);
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
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.screen.AllTransactionsScreenKt$AllTransactionsScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.screen.AllTransactionsScreenKt$AllTransactionsScreen$1$1(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AllTransactionsScreenKt$AllTransactionsScreen$1$1(com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsMviViewModel allTransactionsMviViewModel, android.content.Context context, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.view.screen.AllTransactionsScreenKt$AllTransactionsScreen$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = allTransactionsMviViewModel;
        this.Camera2StreamConfigurationMap = context;
    }
}
