package com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.viewmodel.DocumentCaptureViewModel$launchCaptureJob$1", f = "DocumentCaptureViewModel.kt", i = {}, l = {263, 270}, m = "invokeSuspend", n = {}, nl = {270, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class DocumentCaptureViewModel$launchCaptureJob$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.viewmodel.DocumentCaptureViewModel getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureEvent, kotlin.Unit> getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0088, code lost:
    
        if (com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.viewmodel.DocumentCaptureViewModel.access$handleCaptureCompletion(r11.getHighResolutionOutputSizeshNQ4ISI, r11.getHighSpeedVideoSizes, r11) == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean z;
        com.paypal.oslo.feature.verificationcapture.domain.usecase.StartDocumentCaptureUseCase startDocumentCaptureUseCase;
        boolean z2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        try {
        } catch (java.lang.Exception e) {
            com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.viewmodel.DocumentCaptureViewModel.access$handleCaptureException(this.getHighResolutionOutputSizeshNQ4ISI, e, this.getHighSpeedVideoSizes);
        }
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.verificationcapture.LoggerKt.log;
            z = this.getHighResolutionOutputSizeshNQ4ISI.getOutputSizes;
            com.paypal.android.logger.Logger.d$default(logger, "[DocumentCaptureVM] 🚀 Launching capture", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("wait_for_camera_hal_init", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z))), null, 4, null);
            startDocumentCaptureUseCase = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
            com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType = this.getHighSpeedVideoFpsRanges;
            com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide = this.Camera2StreamConfigurationMap;
            z2 = this.getHighResolutionOutputSizeshNQ4ISI.getOutputSizes;
            kotlinx.coroutines.flow.Flow m24097catch = kotlinx.coroutines.flow.FlowKt.m24097catch(com.paypal.oslo.feature.verificationcapture.domain.usecase.StartDocumentCaptureUseCase.invoke$default(startDocumentCaptureUseCase, documentType, documentSide, null, z2, 4, null), new com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.viewmodel.DocumentCaptureViewModel$launchCaptureJob$1.AnonymousClass1(this.getHighSpeedVideoSizes, null));
            final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureEvent, kotlin.Unit> function1 = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (m24097catch.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.viewmodel.DocumentCaptureViewModel$launchCaptureJob$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus documentDetectionStatus = (com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus) obj2;
                    function1.invoke(new com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureEvent.UpdateDetectionStatus(documentDetectionStatus, com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.util.GuidanceMessageMapper.INSTANCE.getGuidanceMessageResId(documentDetectionStatus)));
                    return kotlin.Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.getHighSpeedVideoFpsRangesFor = 2;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentDetectionStatus;", "error", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.viewmodel.DocumentCaptureViewModel$launchCaptureJob$1$1", f = "DocumentCaptureViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.viewmodel.DocumentCaptureViewModel$launchCaptureJob$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus>, java.lang.Throwable, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureEvent, kotlin.Unit> Camera2StreamConfigurationMap;
        /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Throwable th = (java.lang.Throwable) this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoSizes != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.jvm.functions.Function1<com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureEvent, kotlin.Unit> function1 = this.Camera2StreamConfigurationMap;
            java.lang.String message = th.getMessage();
            if (message == null) {
                message = "An error occurred during capture";
            }
            function1.invoke(new com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureEvent.CaptureError(new com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.UiError("CAPTURE_ERROR", message, true)));
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus> flowCollector, java.lang.Throwable th, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.viewmodel.DocumentCaptureViewModel$launchCaptureJob$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.viewmodel.DocumentCaptureViewModel$launchCaptureJob$1.AnonymousClass1(this.Camera2StreamConfigurationMap, continuation);
            anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = th;
            return anonymousClass1.invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.viewmodel.DocumentCaptureViewModel$launchCaptureJob$1.AnonymousClass1> continuation) {
            super(3, continuation);
            this.Camera2StreamConfigurationMap = function1;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.viewmodel.DocumentCaptureViewModel$launchCaptureJob$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.viewmodel.DocumentCaptureViewModel$launchCaptureJob$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DocumentCaptureViewModel$launchCaptureJob$1(com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.viewmodel.DocumentCaptureViewModel documentCaptureViewModel, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.viewmodel.DocumentCaptureViewModel$launchCaptureJob$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = documentCaptureViewModel;
        this.getHighSpeedVideoFpsRanges = documentType;
        this.Camera2StreamConfigurationMap = documentSide;
        this.getHighSpeedVideoSizes = function1;
    }
}
