package com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.reducer;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u001b2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u001bB\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/reducer/DocumentCaptureReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/DocumentCaptureUiState;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/DocumentCaptureEvent;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/DocumentCaptureUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/DocumentCaptureUiState;Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/DocumentCaptureEvent;)Larrow/core/Either;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureConfig;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureConfig;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentType;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentType;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentSide;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentSide;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DocumentCaptureReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState, com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureEvent, com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiEffect> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private com.paypal.oslo.feature.verificationcapture.domain.model.CaptureConfig getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType getHighResolutionOutputSizeshNQ4ISI;
    private com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide getHighSpeedVideoSizes;
    public static final int $stable = 8;

    @javax.inject.Inject
    public DocumentCaptureReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "DocumentCaptureReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState, com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiEffect>> reduce(com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState state, com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureEvent event) {
        kotlin.Pair pair;
        kotlin.Pair pair2;
        kotlin.Pair pair3;
        com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Capturing copy;
        com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Capturing copy2;
        com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Capturing copy3;
        com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Capturing copy4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(event instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureEvent.Initialize)) {
            if (!(event instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureEvent.StartCapture)) {
                if (!(event instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureEvent.RecreateView)) {
                    if (!(event instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureEvent.StopCapture)) {
                        if (!(event instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureEvent.ToggleFlash)) {
                            if (event instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureEvent.UpdateDetectionStatus) {
                                com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureEvent.UpdateDetectionStatus updateDetectionStatus = (com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureEvent.UpdateDetectionStatus) event;
                                if (!(state instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Capturing)) {
                                    pair2 = kotlin.TuplesKt.to(state, null);
                                } else {
                                    copy2 = r5.copy((r18 & 1) != 0 ? r5.documentType : null, (r18 & 2) != 0 ? r5.documentSide : null, (r18 & 4) != 0 ? r5.detectionStatus : updateDetectionStatus.getStatus(), (r18 & 8) != 0 ? r5.guidanceMessageResId : updateDetectionStatus.getGuidanceMessageResId(), (r18 & 16) != 0 ? r5.isFlashEnabled : false, (r18 & 32) != 0 ? r5.remainingTimeSeconds : 0, (r18 & 64) != 0 ? r5.totalTimeoutSeconds : 0, (r18 & 128) != 0 ? ((com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Capturing) state).viewRecreationKey : 0);
                                    pair2 = kotlin.TuplesKt.to(copy2, null);
                                }
                            } else if (event instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureEvent.UpdateRemainingTime) {
                                com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureEvent.UpdateRemainingTime updateRemainingTime = (com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureEvent.UpdateRemainingTime) event;
                                if (!(state instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Capturing)) {
                                    pair2 = kotlin.TuplesKt.to(state, null);
                                } else {
                                    copy = r5.copy((r18 & 1) != 0 ? r5.documentType : null, (r18 & 2) != 0 ? r5.documentSide : null, (r18 & 4) != 0 ? r5.detectionStatus : null, (r18 & 8) != 0 ? r5.guidanceMessageResId : 0, (r18 & 16) != 0 ? r5.isFlashEnabled : false, (r18 & 32) != 0 ? r5.remainingTimeSeconds : updateRemainingTime.getSeconds(), (r18 & 64) != 0 ? r5.totalTimeoutSeconds : 0, (r18 & 128) != 0 ? ((com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Capturing) state).viewRecreationKey : 0);
                                    pair2 = kotlin.TuplesKt.to(copy, null);
                                }
                            } else if (event instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureEvent.CaptureCompleted) {
                                com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureEvent.CaptureCompleted captureCompleted = (com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureEvent.CaptureCompleted) event;
                                com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult result = captureCompleted.getResult();
                                if (result instanceof com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Success) {
                                    com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Success success = (com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Success) captureCompleted.getResult();
                                    com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType = this.getHighResolutionOutputSizeshNQ4ISI;
                                    if (documentType == null) {
                                        documentType = com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType.UNKNOWN;
                                    }
                                    com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide = this.getHighSpeedVideoSizes;
                                    if (documentSide == null) {
                                        documentSide = com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide.FRONT;
                                    }
                                    pair2 = kotlin.TuplesKt.to(new com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Processing(success, documentType, documentSide), new com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiEffect.HapticFeedback(com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.HapticType.SUCCESS));
                                } else if (result instanceof com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.UploadSuccess) {
                                    pair2 = kotlin.TuplesKt.to(com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Initial.INSTANCE, com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiEffect.NavigateBack.INSTANCE);
                                } else if (result instanceof com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Failure) {
                                    pair2 = kotlin.TuplesKt.to(new com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Error(new com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.UiError(((com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Failure) captureCompleted.getResult()).getErrorCode(), ((com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Failure) captureCompleted.getResult()).getErrorMessage(), true), null, null, 6, null), new com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiEffect.HapticFeedback(com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.HapticType.ERROR));
                                } else if (result instanceof com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Cancelled) {
                                    pair2 = kotlin.TuplesKt.to(com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Initial.INSTANCE, com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiEffect.NavigateBack.INSTANCE);
                                } else {
                                    if (!(result instanceof com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Timeout)) {
                                        throw new kotlin.NoWhenBranchMatchedException();
                                    }
                                    long durationMs = ((com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Timeout) captureCompleted.getResult()).getDurationMs();
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Capture timed out after ");
                                    sb.append(durationMs);
                                    sb.append("ms");
                                    pair2 = kotlin.TuplesKt.to(new com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Error(new com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.UiError("TIMEOUT", sb.toString(), true), null, null, 6, null), new com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiEffect.HapticFeedback(com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.HapticType.WARNING));
                                }
                            } else if (!(event instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureEvent.ConfirmPreview)) {
                                if (!(event instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureEvent.RetakePhoto)) {
                                    if (!(event instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureEvent.RetryCapture)) {
                                        if (!(event instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureEvent.CancelCapture)) {
                                            if (!(event instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureEvent.DismissError)) {
                                                if (!(event instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureEvent.CaptureError)) {
                                                    if (!(event instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureEvent.CaptureTimeout)) {
                                                        throw new kotlin.NoWhenBranchMatchedException();
                                                    }
                                                    if (state instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Capturing) {
                                                        com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Capturing capturing = (com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Capturing) state;
                                                        pair = kotlin.TuplesKt.to(capturing.getDocumentType(), capturing.getDocumentSide());
                                                    } else {
                                                        pair = kotlin.TuplesKt.to(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes);
                                                    }
                                                    com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType2 = (com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType) pair.component1();
                                                    com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide2 = (com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide) pair.component2();
                                                    com.paypal.oslo.feature.verificationcapture.domain.model.CaptureConfig captureConfig = this.getHighSpeedVideoFpsRanges;
                                                    long overallTimeoutSeconds = captureConfig != null ? captureConfig.getOverallTimeoutSeconds() : 30;
                                                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Capture timed out after ");
                                                    sb2.append(overallTimeoutSeconds * 1000);
                                                    sb2.append("ms");
                                                    pair2 = kotlin.TuplesKt.to(new com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Error(new com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.UiError("TIMEOUT", sb2.toString(), true), documentType2, documentSide2), new com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiEffect.HapticFeedback(com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.HapticType.WARNING));
                                                } else {
                                                    com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureEvent.CaptureError captureError = (com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureEvent.CaptureError) event;
                                                    if (state instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Capturing) {
                                                        com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Capturing capturing2 = (com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Capturing) state;
                                                        pair3 = kotlin.TuplesKt.to(capturing2.getDocumentType(), capturing2.getDocumentSide());
                                                    } else if (state instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Processing) {
                                                        com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Processing processing = (com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Processing) state;
                                                        pair3 = kotlin.TuplesKt.to(processing.getDocumentType(), processing.getDocumentSide());
                                                    } else {
                                                        pair3 = kotlin.TuplesKt.to(null, null);
                                                    }
                                                    pair2 = kotlin.TuplesKt.to(new com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Error(captureError.getError(), (com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType) pair3.component1(), (com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide) pair3.component2()), new com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiEffect.HapticFeedback(com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.HapticType.ERROR));
                                                }
                                            } else if (state instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Error) {
                                                com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Error error = (com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Error) state;
                                                if (error.getError().isRecoverable() && error.getDocumentType() != null && error.getDocumentSide() != null) {
                                                    pair2 = kotlin.TuplesKt.to(new com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Capturing(error.getDocumentType(), error.getDocumentSide(), null, 0, false, 0, 0, 0, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null), null);
                                                } else {
                                                    pair2 = kotlin.TuplesKt.to(state, com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiEffect.NavigateBack.INSTANCE);
                                                }
                                            } else {
                                                pair2 = kotlin.TuplesKt.to(state, null);
                                            }
                                        } else {
                                            pair2 = kotlin.TuplesKt.to(state, com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiEffect.NavigateBack.INSTANCE);
                                        }
                                    } else if (state instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Error) {
                                        com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Error error2 = (com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Error) state;
                                        if (error2.getDocumentType() != null && error2.getDocumentSide() != null) {
                                            pair2 = kotlin.TuplesKt.to(com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Loading.INSTANCE, null);
                                        } else {
                                            pair2 = kotlin.TuplesKt.to(state, null);
                                        }
                                    } else {
                                        pair2 = kotlin.TuplesKt.to(state, null);
                                    }
                                } else if (state instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Preview) {
                                    com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Preview preview = (com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Preview) state;
                                    com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType3 = preview.getDocumentType();
                                    com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide3 = preview.getDocumentSide();
                                    com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus.NoDocument noDocument = com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus.NoDocument.INSTANCE;
                                    com.paypal.oslo.feature.verificationcapture.domain.model.CaptureConfig captureConfig2 = this.getHighSpeedVideoFpsRanges;
                                    pair2 = kotlin.TuplesKt.to(new com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Capturing(documentType3, documentSide3, noDocument, 0, false, captureConfig2 != null ? captureConfig2.getOverallTimeoutSeconds() : 30, 0, 0, 192, null), null);
                                } else {
                                    pair2 = kotlin.TuplesKt.to(state, null);
                                }
                            } else if (state instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Processing) {
                                pair2 = kotlin.TuplesKt.to(new com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Success(((com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Processing) state).getResult()), null);
                            } else if (state instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Preview) {
                                pair2 = kotlin.TuplesKt.to(new com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Success(((com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Preview) state).getResult()), null);
                            } else {
                                pair2 = kotlin.TuplesKt.to(state, null);
                            }
                        } else if (state instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Capturing) {
                            copy3 = r7.copy((r18 & 1) != 0 ? r7.documentType : null, (r18 & 2) != 0 ? r7.documentSide : null, (r18 & 4) != 0 ? r7.detectionStatus : null, (r18 & 8) != 0 ? r7.guidanceMessageResId : 0, (r18 & 16) != 0 ? r7.isFlashEnabled : !r7.isFlashEnabled(), (r18 & 32) != 0 ? r7.remainingTimeSeconds : 0, (r18 & 64) != 0 ? r7.totalTimeoutSeconds : 0, (r18 & 128) != 0 ? ((com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Capturing) state).viewRecreationKey : 0);
                            pair2 = kotlin.TuplesKt.to(copy3, null);
                        } else {
                            pair2 = kotlin.TuplesKt.to(state, null);
                        }
                    } else if (state instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Capturing) {
                        com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Capturing capturing3 = (com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Capturing) state;
                        pair2 = kotlin.TuplesKt.to(new com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Error(new com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.UiError("CAPTURE_STOPPED", "Capture was stopped", true), capturing3.getDocumentType(), capturing3.getDocumentSide()), null);
                    } else {
                        pair2 = kotlin.TuplesKt.to(state, null);
                    }
                } else if (state instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Capturing) {
                    com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Capturing capturing4 = (com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Capturing) state;
                    int viewRecreationKey = capturing4.getViewRecreationKey();
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[DocumentCaptureReducer] Incrementing viewRecreationKey", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("old_key", java.lang.Integer.valueOf(viewRecreationKey)), kotlin.TuplesKt.to("new_key", java.lang.Integer.valueOf(viewRecreationKey + 1))), null, 4, null);
                    copy4 = capturing4.copy((r18 & 1) != 0 ? capturing4.documentType : null, (r18 & 2) != 0 ? capturing4.documentSide : null, (r18 & 4) != 0 ? capturing4.detectionStatus : null, (r18 & 8) != 0 ? capturing4.guidanceMessageResId : 0, (r18 & 16) != 0 ? capturing4.isFlashEnabled : false, (r18 & 32) != 0 ? capturing4.remainingTimeSeconds : 0, (r18 & 64) != 0 ? capturing4.totalTimeoutSeconds : 0, (r18 & 128) != 0 ? capturing4.viewRecreationKey : capturing4.getViewRecreationKey() + 1);
                    pair2 = kotlin.TuplesKt.to(copy4, null);
                } else {
                    pair2 = kotlin.TuplesKt.to(state, null);
                }
            } else if (state instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Loading) {
                com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType4 = this.getHighResolutionOutputSizeshNQ4ISI;
                if (documentType4 == null) {
                    documentType4 = com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType.UNKNOWN;
                }
                com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType5 = documentType4;
                com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide4 = this.getHighSpeedVideoSizes;
                if (documentSide4 == null) {
                    documentSide4 = com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide.FRONT;
                }
                com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide5 = documentSide4;
                com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus.NoDocument noDocument2 = com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus.NoDocument.INSTANCE;
                com.paypal.oslo.feature.verificationcapture.domain.model.CaptureConfig captureConfig3 = this.getHighSpeedVideoFpsRanges;
                pair2 = kotlin.TuplesKt.to(new com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Capturing(documentType5, documentSide5, noDocument2, 0, false, captureConfig3 != null ? captureConfig3.getOverallTimeoutSeconds() : 30, 0, 0, 192, null), null);
            } else {
                pair2 = kotlin.TuplesKt.to(state, null);
            }
        } else {
            com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureEvent.Initialize initialize = (com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureEvent.Initialize) event;
            this.getHighSpeedVideoFpsRanges = initialize.getConfig();
            this.getHighResolutionOutputSizeshNQ4ISI = initialize.getDocumentType();
            this.getHighSpeedVideoSizes = initialize.getDocumentSide();
            pair2 = kotlin.TuplesKt.to(com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Loading.INSTANCE, null);
        }
        return new arrow.core.Either.Right(new com.paypal.oslo.core.mvi.Reducer.Output((com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState) pair2.component1(), (com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiEffect) pair2.component2()));
    }
}
