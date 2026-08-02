package com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsEffectHandlerKt$TaxDocumentsEffectHandler$1$1", f = "TaxDocumentsEffectHandler.kt", i = {}, l = {62}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class TaxDocumentsEffectHandlerKt$TaxDocumentsEffectHandler$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.MultiSavingsSheetData, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ android.content.Context getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SheetData, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoSizes;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoSizesFor;
    final /* synthetic */ java.lang.String getInputFormats;
    final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getInputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getOutputFormats;
    final /* synthetic */ java.lang.String getOutputMinFrameDuration;
    int getOutputMinFrameDurationlomOqCM;
    final /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel getOutputSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputMinFrameDurationlomOqCM;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect> uiEffect = this.getOutputSizes.getUiEffect();
            final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> function1 = this.getInputSizeshNQ4ISI;
            final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.MultiSavingsSheetData, kotlin.Unit> function12 = this.getHighResolutionOutputSizeshNQ4ISI;
            final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel taxDocumentsViewModel = this.getOutputSizes;
            final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SheetData, kotlin.Unit> function13 = this.getHighSpeedVideoFpsRangesFor;
            final android.content.Context context = this.getHighSpeedVideoFpsRanges;
            final kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.getHighSpeedVideoSizesFor;
            final kotlin.jvm.functions.Function0<kotlin.Unit> function02 = this.getHighSpeedVideoSizes;
            final java.lang.String str = this.getOutputFormats;
            final java.lang.String str2 = this.getOutputMinFrameDuration;
            final java.lang.String str3 = this.getInputFormats;
            final kotlin.jvm.functions.Function0<kotlin.Unit> function03 = this.Camera2StreamConfigurationMap;
            this.getOutputMinFrameDurationlomOqCM = 1;
            if (uiEffect.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsEffectHandlerKt$TaxDocumentsEffectHandler$1$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect taxDocumentsUiEffect = (com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect) obj2;
                    if (taxDocumentsUiEffect instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.ShowToast) {
                        function1.invoke(((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.ShowToast) taxDocumentsUiEffect).getMessage());
                    } else if (taxDocumentsUiEffect instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.OpenMultiSavingsSheet) {
                        function12.invoke(((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.OpenMultiSavingsSheet) taxDocumentsUiEffect).getData());
                    } else if (taxDocumentsUiEffect instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.OpenDeeplink) {
                        com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.OpenDeeplink openDeeplink = (com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.OpenDeeplink) taxDocumentsUiEffect;
                        taxDocumentsViewModel.navigateToDeeplink(openDeeplink.getUrl(), openDeeplink.getShouldRefreshOnReturn());
                    } else if (taxDocumentsUiEffect instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.OpenReconSheet) {
                        function13.invoke(((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.OpenReconSheet) taxDocumentsUiEffect).getData());
                    } else if (!(taxDocumentsUiEffect instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.OpenDownloadedFile)) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(taxDocumentsUiEffect, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.ShowReconSheetLoading.INSTANCE)) {
                            function0.invoke();
                        } else if (kotlin.jvm.internal.Intrinsics.areEqual(taxDocumentsUiEffect, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.DismissReconSheet.INSTANCE)) {
                            function02.invoke();
                        } else if (kotlin.jvm.internal.Intrinsics.areEqual(taxDocumentsUiEffect, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.ShowReconciliationSuccess.INSTANCE)) {
                            function1.invoke(str);
                        } else if (kotlin.jvm.internal.Intrinsics.areEqual(taxDocumentsUiEffect, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.ShowReconciliationFailure.INSTANCE)) {
                            function1.invoke(str2);
                        } else if (taxDocumentsUiEffect instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.NavigateToSelfCorrectionFlow) {
                            taxDocumentsViewModel.navigateToDeeplink(((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.NavigateToSelfCorrectionFlow) taxDocumentsUiEffect).getDeepLink(), true);
                        } else if (kotlin.jvm.internal.Intrinsics.areEqual(taxDocumentsUiEffect, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.ShowSelfCorrectionFailure.INSTANCE)) {
                            function1.invoke(str3);
                        } else {
                            if (!kotlin.jvm.internal.Intrinsics.areEqual(taxDocumentsUiEffect, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.DismissMultiSavingsSheet.INSTANCE)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            function03.invoke();
                        }
                    } else {
                        com.paypal.oslo.feature.taxanddocumentcenter.ui.download.util.FileOpener.openFile$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.download.util.FileOpener.INSTANCE, context, r2.getFileUri(), ((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiEffect.OpenDownloadedFile) taxDocumentsUiEffect).getMimeType(), null, 8, null);
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
        return ((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsEffectHandlerKt$TaxDocumentsEffectHandler$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsEffectHandlerKt$TaxDocumentsEffectHandler$1$1(this.getOutputSizes, this.getInputSizeshNQ4ISI, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoSizes, this.getOutputFormats, this.getOutputMinFrameDuration, this.getInputFormats, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TaxDocumentsEffectHandlerKt$TaxDocumentsEffectHandler$1$1(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel taxDocumentsViewModel, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.MultiSavingsSheetData, kotlin.Unit> function12, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SheetData, kotlin.Unit> function13, android.content.Context context, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.jvm.functions.Function0<kotlin.Unit> function03, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.screen.TaxDocumentsEffectHandlerKt$TaxDocumentsEffectHandler$1$1> continuation) {
        super(2, continuation);
        this.getOutputSizes = taxDocumentsViewModel;
        this.getInputSizeshNQ4ISI = function1;
        this.getHighResolutionOutputSizeshNQ4ISI = function12;
        this.getHighSpeedVideoFpsRangesFor = function13;
        this.getHighSpeedVideoFpsRanges = context;
        this.getHighSpeedVideoSizesFor = function0;
        this.getHighSpeedVideoSizes = function02;
        this.getOutputFormats = str;
        this.getOutputMinFrameDuration = str2;
        this.getInputFormats = str3;
        this.Camera2StreamConfigurationMap = function03;
    }
}
