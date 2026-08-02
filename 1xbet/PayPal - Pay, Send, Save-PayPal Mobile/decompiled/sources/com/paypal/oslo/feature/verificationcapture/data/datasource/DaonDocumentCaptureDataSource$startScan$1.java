package com.paypal.oslo.feature.verificationcapture.data.datasource;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentDetectionStatus;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.data.datasource.DaonDocumentCaptureDataSource$startScan$1", f = "DaonDocumentCaptureDataSource.kt", i = {0, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3}, l = {303, 308, androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING, 544}, m = "invokeSuspend", n = {"$this$callbackFlow", "$this$callbackFlow", "$this$callbackFlow", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "options", "lifecycleField", com.paypal.oslo.core.telemetry.AppLifecycleConstants.FEATURE, "currentState", "resumedDeferred", "lifecycleObserver", "cameraReady", "$this$callbackFlow", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "cameraReady"}, nl = {308, 309, 504, 548}, s = {"L$0", "L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "Z$0", "L$0", "L$1", "Z$0"}, v = 2)
/* loaded from: classes15.dex */
final class DaonDocumentCaptureDataSource$startScan$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.daon.dmds.views.DaonDocumentScanView getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.domain.model.CaptureConfig getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    boolean getOutputMinFrameDurationlomOqCM;
    private /* synthetic */ java.lang.Object getOutputSizes;
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.data.datasource.DaonDocumentCaptureDataSource getOutputStallDuration;
    int getOutputStallDurationlomOqCM;

    /*  JADX ERROR: Types fix failed
        java.lang.NullPointerException
        */
    /* JADX WARN: Failed to calculate best type for var: r0v14 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v10 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v14 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v16 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v17 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v19 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v27 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v8 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v21 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v22 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v25 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v26 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v29 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v31 ??
    java.lang.NullPointerException
     */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x01b2: MOVE (r23 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]), block:B:89:0x01b1 */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x01bf: MOVE (r23 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]), block:B:90:0x01be */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x01b4: MOVE (r10 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]), block:B:89:0x01b1 */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x01c1: MOVE (r10 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]), block:B:90:0x01be */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0238: MOVE (r10 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]), block:B:96:0x0237 */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x024e: MOVE (r10 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]), block:B:92:0x024d */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0264: MOVE (r10 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]), block:B:94:0x0263 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.oslo.feature.verificationcapture.data.datasource.DaonDocumentCaptureDataSource$startScan$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.data.datasource.DaonDocumentCaptureDataSource$startScan$1$1", f = "DaonDocumentCaptureDataSource.kt", i = {}, l = {502}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.verificationcapture.data.datasource.DaonDocumentCaptureDataSource$startScan$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
        int Camera2StreamConfigurationMap;
        final /* synthetic */ kotlinx.coroutines.CompletableDeferred<java.lang.Boolean> getHighResolutionOutputSizeshNQ4ISI;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.Camera2StreamConfigurationMap;
            if (i != 0) {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return obj;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            this.Camera2StreamConfigurationMap = 1;
            java.lang.Object await = this.getHighResolutionOutputSizeshNQ4ISI.await(this);
            return await == coroutine_suspended ? coroutine_suspended : await;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
            return ((com.paypal.oslo.feature.verificationcapture.data.datasource.DaonDocumentCaptureDataSource$startScan$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.paypal.oslo.feature.verificationcapture.data.datasource.DaonDocumentCaptureDataSource$startScan$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(kotlinx.coroutines.CompletableDeferred<java.lang.Boolean> completableDeferred, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.data.datasource.DaonDocumentCaptureDataSource$startScan$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighResolutionOutputSizeshNQ4ISI = completableDeferred;
        }
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.verificationcapture.data.datasource.DaonDocumentCaptureDataSource daonDocumentCaptureDataSource) {
        daonDocumentCaptureDataSource.getHighSpeedVideoSizesFor = true;
        daonDocumentCaptureDataSource.stopScan();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(kotlinx.coroutines.CompletableDeferred completableDeferred, androidx.view.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[DaonDataSource] Lifecycle event", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("event", event.toString()), kotlin.TuplesKt.to("state", lifecycleOwner.getLifecycle().getCamera2StreamConfigurationMap().toString())), null, 4, null);
        if (lifecycleOwner.getLifecycle().getCamera2StreamConfigurationMap() == androidx.lifecycle.Lifecycle.State.RESUMED) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[DaonDataSource] ✅ Activity RESUMED!", null, null, 6, null);
            completableDeferred.complete(java.lang.Boolean.TRUE);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.verificationcapture.data.datasource.DaonDocumentCaptureDataSource$startScan$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.verificationcapture.data.datasource.DaonDocumentCaptureDataSource$startScan$1 daonDocumentCaptureDataSource$startScan$1 = new com.paypal.oslo.feature.verificationcapture.data.datasource.DaonDocumentCaptureDataSource$startScan$1(this.getOutputStallDuration, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
        daonDocumentCaptureDataSource$startScan$1.getOutputSizes = obj;
        return daonDocumentCaptureDataSource$startScan$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DaonDocumentCaptureDataSource$startScan$1(com.paypal.oslo.feature.verificationcapture.data.datasource.DaonDocumentCaptureDataSource daonDocumentCaptureDataSource, com.daon.dmds.views.DaonDocumentScanView daonDocumentScanView, com.paypal.oslo.feature.verificationcapture.domain.model.CaptureConfig captureConfig, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.data.datasource.DaonDocumentCaptureDataSource$startScan$1> continuation) {
        super(2, continuation);
        this.getOutputStallDuration = daonDocumentCaptureDataSource;
        this.getHighResolutionOutputSizeshNQ4ISI = daonDocumentScanView;
        this.getHighSpeedVideoFpsRanges = captureConfig;
        this.getHighSpeedVideoFpsRangesFor = documentType;
    }
}
