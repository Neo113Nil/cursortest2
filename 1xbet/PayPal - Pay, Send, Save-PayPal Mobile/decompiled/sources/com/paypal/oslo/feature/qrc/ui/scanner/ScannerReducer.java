package com.paypal.oslo.feature.qrc.ui.scanner;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerUiState;", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent;", "Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerUiState;Lcom/paypal/oslo/feature/qrc/ui/scanner/ScannerEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ScannerReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState, com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent, com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public ScannerReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "ScannerReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState, com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect>> reduce(com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState state, com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent event) {
        com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect.ShowLocationMismatch showLocationMismatch;
        com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiModel copy;
        com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiModel copy2;
        com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect.NavigateToReview navigateToReview;
        com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiModel copy3;
        com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiModel copy4;
        com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiModel copy5;
        com.paypal.oslo.feature.qrc.ui.scanner.ErrorType errorType;
        com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiModel copy6;
        com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiModel copy7;
        com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiModel copy8;
        com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect.NavigateToReview navigateToReview2;
        com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiModel copy9;
        com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiModel copy10;
        com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiModel copy11;
        com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiModel copy12;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        com.paypal.oslo.feature.qrc.ui.scanner.ErrorType errorType2 = null;
        if (state instanceof com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState.Initial) {
            return event instanceof com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.LoadScreen ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState.CameraPermissionRequired.INSTANCE, null, 2, null) : com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent((com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState.Initial) state, event);
        }
        if (!(state instanceof com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState.CameraPermissionRequired)) {
            if (!(state instanceof com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState.Content)) {
                if (!(state instanceof com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState.LocationPermissionRequired)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState.LocationPermissionRequired locationPermissionRequired = (com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState.LocationPermissionRequired) state;
                if (event instanceof com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.LocationPermissionGranted) {
                    return locationPermissionRequired.getUiModel().getPendingNavArgs() == null ? com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState.Content(locationPermissionRequired.getUiModel()), null, 2, null) : com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(locationPermissionRequired, null, 2, null);
                }
                if (!(event instanceof com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.LocationPermissionDenied)) {
                    if (!(event instanceof com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.LocationPermissionDialogDismissed)) {
                        if (!(event instanceof com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.LocationProcessed)) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(locationPermissionRequired, event);
                        }
                        com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.LocationProcessed locationProcessed = (com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.LocationProcessed) event;
                        com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs pendingNavArgs = locationPermissionRequired.getUiModel().getPendingNavArgs();
                        if (pendingNavArgs == null) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState.Content(locationPermissionRequired.getUiModel()), null, 2, null);
                        }
                        if (locationProcessed.isMatched()) {
                            if (pendingNavArgs.getShouldCollectTransactionAmount()) {
                                showLocationMismatch = new com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect.NavigateToEnterAmount(pendingNavArgs);
                            } else {
                                showLocationMismatch = new com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect.NavigateToReview(pendingNavArgs);
                            }
                        } else {
                            showLocationMismatch = new com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect.ShowLocationMismatch(pendingNavArgs);
                        }
                        copy = r2.copy((r18 & 1) != 0 ? r2.id : null, (r18 & 2) != 0 ? r2.isFlashEnabled : false, (r18 & 4) != 0 ? r2.isApiLoading : false, (r18 & 8) != 0 ? r2.pendingNavArgs : null, (r18 & 16) != 0 ? r2.isQRCodeDetected : false, (r18 & 32) != 0 ? r2.errorMessage : null, (r18 & 64) != 0 ? r2.errorType : null, (r18 & 128) != 0 ? locationPermissionRequired.getUiModel().scannedImageUri : null);
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState.Content(copy), showLocationMismatch);
                    }
                    copy2 = r5.copy((r18 & 1) != 0 ? r5.id : null, (r18 & 2) != 0 ? r5.isFlashEnabled : false, (r18 & 4) != 0 ? r5.isApiLoading : false, (r18 & 8) != 0 ? r5.pendingNavArgs : null, (r18 & 16) != 0 ? r5.isQRCodeDetected : false, (r18 & 32) != 0 ? r5.errorMessage : null, (r18 & 64) != 0 ? r5.errorType : null, (r18 & 128) != 0 ? locationPermissionRequired.getUiModel().scannedImageUri : null);
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState.Content(copy2), null, 2, null);
                }
                com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs pendingNavArgs2 = locationPermissionRequired.getUiModel().getPendingNavArgs();
                if (pendingNavArgs2 == null) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState.Content(locationPermissionRequired.getUiModel()), null, 2, null);
                }
                if (pendingNavArgs2.getShouldCollectTransactionAmount()) {
                    navigateToReview = new com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect.NavigateToEnterAmount(pendingNavArgs2);
                } else {
                    navigateToReview = new com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect.NavigateToReview(pendingNavArgs2);
                }
                copy3 = r3.copy((r18 & 1) != 0 ? r3.id : null, (r18 & 2) != 0 ? r3.isFlashEnabled : false, (r18 & 4) != 0 ? r3.isApiLoading : false, (r18 & 8) != 0 ? r3.pendingNavArgs : null, (r18 & 16) != 0 ? r3.isQRCodeDetected : false, (r18 & 32) != 0 ? r3.errorMessage : null, (r18 & 64) != 0 ? r3.errorType : null, (r18 & 128) != 0 ? locationPermissionRequired.getUiModel().scannedImageUri : null);
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState.Content(copy3), navigateToReview);
            }
            com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState.Content content = (com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState.Content) state;
            if (!(event instanceof com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.QRCodeScanned)) {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.FlashPressed.INSTANCE)) {
                    if (!(event instanceof com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.PollForQrcSession)) {
                        if (!(event instanceof com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.QrCodeValidForPayment)) {
                            if (!(event instanceof com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.EnrollmentRequired)) {
                                if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.EnrollmentCompleted.INSTANCE)) {
                                    if (!(event instanceof com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.ShowCountryCodeMismatch)) {
                                        if (!(event instanceof com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.ShowValidationError)) {
                                            if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.ClearError.INSTANCE)) {
                                                if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.GalleryPressed.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.CameraPermissionGranted.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.LoadScreen.INSTANCE)) {
                                                    return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(content, event);
                                                }
                                            } else {
                                                copy4 = r5.copy((r18 & 1) != 0 ? r5.id : null, (r18 & 2) != 0 ? r5.isFlashEnabled : false, (r18 & 4) != 0 ? r5.isApiLoading : false, (r18 & 8) != 0 ? r5.pendingNavArgs : null, (r18 & 16) != 0 ? r5.isQRCodeDetected : false, (r18 & 32) != 0 ? r5.errorMessage : null, (r18 & 64) != 0 ? r5.errorType : null, (r18 & 128) != 0 ? content.getUiModel().scannedImageUri : null);
                                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState.Content(copy4), null, 2, null);
                                            }
                                        } else {
                                            com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.ShowValidationError showValidationError = (com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.ShowValidationError) event;
                                            java.lang.String reason = showValidationError.getReason();
                                            if (reason != null) {
                                                java.lang.String str = reason;
                                                if (kotlin.text.StringsKt.contains((java.lang.CharSequence) str, (java.lang.CharSequence) "internet", true)) {
                                                    errorType = com.paypal.oslo.feature.qrc.ui.scanner.ErrorType.NO_INTERNET;
                                                } else if (kotlin.text.StringsKt.contains((java.lang.CharSequence) str, (java.lang.CharSequence) com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, true)) {
                                                    errorType = com.paypal.oslo.feature.qrc.ui.scanner.ErrorType.TIMEOUT;
                                                } else {
                                                    errorType = kotlin.text.StringsKt.contains((java.lang.CharSequence) str, (java.lang.CharSequence) "not supported", true) ? com.paypal.oslo.feature.qrc.ui.scanner.ErrorType.UNSUPPORTED : com.paypal.oslo.feature.qrc.ui.scanner.ErrorType.GENERIC_ERROR;
                                                }
                                                errorType2 = errorType;
                                            }
                                            copy5 = r5.copy((r18 & 1) != 0 ? r5.id : null, (r18 & 2) != 0 ? r5.isFlashEnabled : false, (r18 & 4) != 0 ? r5.isApiLoading : false, (r18 & 8) != 0 ? r5.pendingNavArgs : null, (r18 & 16) != 0 ? r5.isQRCodeDetected : false, (r18 & 32) != 0 ? r5.errorMessage : showValidationError.getReason(), (r18 & 64) != 0 ? r5.errorType : errorType2, (r18 & 128) != 0 ? content.getUiModel().scannedImageUri : null);
                                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState.Content(copy5), new com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect.ShowValidationError(showValidationError.getReason()));
                                        }
                                    } else {
                                        copy6 = r6.copy((r18 & 1) != 0 ? r6.id : null, (r18 & 2) != 0 ? r6.isFlashEnabled : false, (r18 & 4) != 0 ? r6.isApiLoading : false, (r18 & 8) != 0 ? r6.pendingNavArgs : null, (r18 & 16) != 0 ? r6.isQRCodeDetected : false, (r18 & 32) != 0 ? r6.errorMessage : null, (r18 & 64) != 0 ? r6.errorType : null, (r18 & 128) != 0 ? content.getUiModel().scannedImageUri : null);
                                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState.Content(copy6), new com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect.ShowLocationMismatch(null));
                                    }
                                } else {
                                    copy7 = r5.copy((r18 & 1) != 0 ? r5.id : null, (r18 & 2) != 0 ? r5.isFlashEnabled : false, (r18 & 4) != 0 ? r5.isApiLoading : true, (r18 & 8) != 0 ? r5.pendingNavArgs : null, (r18 & 16) != 0 ? r5.isQRCodeDetected : false, (r18 & 32) != 0 ? r5.errorMessage : null, (r18 & 64) != 0 ? r5.errorType : null, (r18 & 128) != 0 ? content.getUiModel().scannedImageUri : null);
                                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState.Content(copy7), null, 2, null);
                                }
                            } else {
                                copy8 = r2.copy((r18 & 1) != 0 ? r2.id : null, (r18 & 2) != 0 ? r2.isFlashEnabled : false, (r18 & 4) != 0 ? r2.isApiLoading : false, (r18 & 8) != 0 ? r2.pendingNavArgs : null, (r18 & 16) != 0 ? r2.isQRCodeDetected : false, (r18 & 32) != 0 ? r2.errorMessage : null, (r18 & 64) != 0 ? r2.errorType : null, (r18 & 128) != 0 ? content.getUiModel().scannedImageUri : null);
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState.Content(copy8), new com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect.NavigateToEnrollment(((com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.EnrollmentRequired) event).getNavArgs()));
                            }
                        } else {
                            com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.QrCodeValidForPayment qrCodeValidForPayment = (com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.QrCodeValidForPayment) event;
                            if (!qrCodeValidForPayment.getNavArgs().isPayPalWorldQR()) {
                                if (qrCodeValidForPayment.getNavArgs().getShouldCollectTransactionAmount()) {
                                    navigateToReview2 = new com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect.NavigateToEnterAmount(qrCodeValidForPayment.getNavArgs());
                                } else {
                                    navigateToReview2 = new com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect.NavigateToReview(qrCodeValidForPayment.getNavArgs());
                                }
                                copy9 = r3.copy((r18 & 1) != 0 ? r3.id : null, (r18 & 2) != 0 ? r3.isFlashEnabled : false, (r18 & 4) != 0 ? r3.isApiLoading : false, (r18 & 8) != 0 ? r3.pendingNavArgs : null, (r18 & 16) != 0 ? r3.isQRCodeDetected : false, (r18 & 32) != 0 ? r3.errorMessage : null, (r18 & 64) != 0 ? r3.errorType : null, (r18 & 128) != 0 ? content.getUiModel().scannedImageUri : null);
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(new com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState.Content(copy9), navigateToReview2);
                            }
                            copy10 = r5.copy((r18 & 1) != 0 ? r5.id : null, (r18 & 2) != 0 ? r5.isFlashEnabled : false, (r18 & 4) != 0 ? r5.isApiLoading : false, (r18 & 8) != 0 ? r5.pendingNavArgs : qrCodeValidForPayment.getNavArgs(), (r18 & 16) != 0 ? r5.isQRCodeDetected : false, (r18 & 32) != 0 ? r5.errorMessage : null, (r18 & 64) != 0 ? r5.errorType : null, (r18 & 128) != 0 ? content.getUiModel().scannedImageUri : null);
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState.LocationPermissionRequired(copy10), null, 2, null);
                        }
                    }
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(content, null, 2, null);
                }
                copy11 = r6.copy((r18 & 1) != 0 ? r6.id : null, (r18 & 2) != 0 ? r6.isFlashEnabled : !content.getUiModel().isFlashEnabled(), (r18 & 4) != 0 ? r6.isApiLoading : false, (r18 & 8) != 0 ? r6.pendingNavArgs : null, (r18 & 16) != 0 ? r6.isQRCodeDetected : false, (r18 & 32) != 0 ? r6.errorMessage : null, (r18 & 64) != 0 ? r6.errorType : null, (r18 & 128) != 0 ? content.getUiModel().scannedImageUri : null);
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState.Content(copy11), null, 2, null);
            }
            copy12 = r5.copy((r18 & 1) != 0 ? r5.id : null, (r18 & 2) != 0 ? r5.isFlashEnabled : false, (r18 & 4) != 0 ? r5.isApiLoading : true, (r18 & 8) != 0 ? r5.pendingNavArgs : null, (r18 & 16) != 0 ? r5.isQRCodeDetected : true, (r18 & 32) != 0 ? r5.errorMessage : null, (r18 & 64) != 0 ? r5.errorType : null, (r18 & 128) != 0 ? content.getUiModel().scannedImageUri : ((com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.QRCodeScanned) event).getImageUri());
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState.Content(copy12), null, 2, null);
        }
        com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState.CameraPermissionRequired cameraPermissionRequired = (com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState.CameraPermissionRequired) state;
        if (event instanceof com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.CameraPermissionGranted) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiState.Content(new com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiModel(null, false, false, null, false, null, null, null, 255, null)), null, 2, null);
        }
        if (!(event instanceof com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.CameraPermissionDenied) && !(event instanceof com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent.RequestCameraPermission)) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(cameraPermissionRequired, event);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(cameraPermissionRequired, null, 2, null);
    }
}
