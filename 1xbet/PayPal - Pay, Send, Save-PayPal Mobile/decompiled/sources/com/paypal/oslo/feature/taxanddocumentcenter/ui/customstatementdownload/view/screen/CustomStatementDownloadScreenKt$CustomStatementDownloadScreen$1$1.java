package com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.view.screen;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.view.screen.CustomStatementDownloadScreenKt$CustomStatementDownloadScreen$1$1", f = "CustomStatementDownloadScreen.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class CustomStatementDownloadScreenKt$CustomStatementDownloadScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadViewModel Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ android.content.Context getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.OpenDownloadedFile> openFileEffect = this.Camera2StreamConfigurationMap.getOpenFileEffect();
            final android.content.Context context = this.getHighSpeedVideoSizes;
            final kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRanges = 1;
            if (openFileEffect.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.view.screen.CustomStatementDownloadScreenKt$CustomStatementDownloadScreen$1$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.OpenDownloadedFile openDownloadedFile = (com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.OpenDownloadedFile) obj2;
                    com.paypal.oslo.feature.taxanddocumentcenter.ui.download.util.FileOpener.openFile$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.download.util.FileOpener.INSTANCE, context, openDownloadedFile.getFileUri(), openDownloadedFile.getMimeType(), null, 8, null);
                    function0.invoke();
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
        return ((com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.view.screen.CustomStatementDownloadScreenKt$CustomStatementDownloadScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.view.screen.CustomStatementDownloadScreenKt$CustomStatementDownloadScreen$1$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomStatementDownloadScreenKt$CustomStatementDownloadScreen$1$1(com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.mvi.CustomStatementDownloadViewModel customStatementDownloadViewModel, android.content.Context context, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatementdownload.view.screen.CustomStatementDownloadScreenKt$CustomStatementDownloadScreen$1$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = customStatementDownloadViewModel;
        this.getHighSpeedVideoSizes = context;
        this.getHighResolutionOutputSizeshNQ4ISI = function0;
    }
}
