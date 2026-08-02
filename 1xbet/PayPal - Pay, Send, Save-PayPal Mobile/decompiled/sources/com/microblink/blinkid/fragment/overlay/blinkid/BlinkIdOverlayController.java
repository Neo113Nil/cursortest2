package com.microblink.blinkid.fragment.overlay.blinkid;

/* loaded from: classes10.dex */
public class BlinkIdOverlayController extends com.microblink.blinkid.fragment.overlay.BaseOverlayController {
    private static final long getHighSpeedVideoFpsRanges = com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState.FLIP_CARD.minDurationMs + com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleUiState.SUCCESS_FIRST_SIDE.minDurationMs;
    private final com.microblink.blinkid.entities.recognizers.HighResImagesBundle Camera2StreamConfigurationMap;
    private final com.microblink.blinkid.fragment.overlay.blinkid.reticleui.BlinkIdDialogOnboardingPresenter getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.Runnable getHighSpeedVideoFpsRangesFor;
    private final com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.InternalBlinkIdRecognizerCallbacks getHighSpeedVideoSizes;
    private final com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlaySettings getHighSpeedVideoSizesFor;
    private final com.microblink.blinkid.metadata.recognition.FirstSideRecognitionCallback getInputFormats;
    private int getInputSizeshNQ4ISI;
    private final com.microblink.blinkid.uisettings.options.ScanUIEventListener getOutputFormats;
    private final com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.ProcessingStatusHandler getOutputMinFrameDuration;
    private com.microblink.blinkid.fragment.overlay.DocumentSide getOutputMinFrameDurationlomOqCM;
    private final com.microblink.blinkid.fragment.overlay.components.feedback.RecognitionFeedbackHandler getOutputSizeshNQ4ISI;
    private final com.microblink.blinkid.fragment.overlay.components.feedback.RecognitionFeedbackHandler getOutputStallDuration;
    private final com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView getOutputStallDurationlomOqCM;
    protected final com.microblink.blinkid.fragment.overlay.blinkid.ImageUploadManager lIllIIlIIl;
    protected final com.microblink.blinkid.fragment.overlay.DocumentRecognizerManager llIllIIlll;
    protected final com.microblink.blinkid.fragment.overlay.PingSessionFlowManager lllIIlIIlI;

    /* renamed from: com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] Camera2StreamConfigurationMap;
        static final /* synthetic */ int[] getHighSpeedVideoFpsRangesFor;

        static {
            int[] iArr = new int[com.microblink.blinkid.entities.recognizers.blinkid.generic.ProcessingStatus.values().length];
            getHighSpeedVideoFpsRangesFor = iArr;
            try {
                iArr[com.microblink.blinkid.entities.recognizers.blinkid.generic.ProcessingStatus.MandatoryFieldMissing.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.microblink.blinkid.entities.recognizers.blinkid.generic.ProcessingStatus.ScanningWrongSide.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.microblink.blinkid.entities.recognizers.blinkid.generic.ProcessingStatus.ImageReturnFailed.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.microblink.blinkid.entities.recognizers.blinkid.generic.ProcessingStatus.ImagePreprocessingFailed.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.CardRotation.values().length];
            Camera2StreamConfigurationMap = iArr2;
            try {
                iArr2[com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.CardRotation.Zero.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                Camera2StreamConfigurationMap[com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.CardRotation.Clockwise90.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                Camera2StreamConfigurationMap[com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.CardRotation.CounterClockwise90.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                Camera2StreamConfigurationMap[com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.CardRotation.UpsideDown.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
        }
    }

    public interface BlinkIdRecognizerCallbacks {
        void getHighSpeedVideoFpsRanges();

        void getHighSpeedVideoFpsRangesFor(boolean z);
    }

    public static class InternalBlinkIdRecognizerCallbacks implements com.microblink.blinkid.entities.recognizers.classifier.ClassifierCallback, com.microblink.blinkid.entities.recognizers.blinkid.generic.BarcodeScanningStartedCallback {
        public static final android.os.Parcelable.Creator<com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.InternalBlinkIdRecognizerCallbacks> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.InternalBlinkIdRecognizerCallbacks>() { // from class: com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.InternalBlinkIdRecognizerCallbacks.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.InternalBlinkIdRecognizerCallbacks createFromParcel(android.os.Parcel parcel) {
                return new com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.InternalBlinkIdRecognizerCallbacks(null);
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.InternalBlinkIdRecognizerCallbacks[] newArray(int i) {
                return new com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.InternalBlinkIdRecognizerCallbacks[i];
            }
        };
        private final com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.AnonymousClass4 getHighSpeedVideoSizes;

        InternalBlinkIdRecognizerCallbacks(com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.AnonymousClass4 anonymousClass4) {
            this.getHighSpeedVideoSizes = anonymousClass4;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.microblink.blinkid.entities.recognizers.blinkid.generic.BarcodeScanningStartedCallback
        public void onBarcodeScanningStarted() {
            com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.AnonymousClass4 anonymousClass4 = this.getHighSpeedVideoSizes;
            if (anonymousClass4 != null) {
                anonymousClass4.getHighSpeedVideoFpsRanges();
            }
        }

        @Override // com.microblink.blinkid.entities.recognizers.classifier.ClassifierCallback
        public void onDocumentSupportStatus(boolean z) {
            com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.AnonymousClass4 anonymousClass4 = this.getHighSpeedVideoSizes;
            if (anonymousClass4 != null) {
                anonymousClass4.getHighSpeedVideoFpsRangesFor(z);
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
        }
    }

    public static class ProcessingStatusHandler {
        final com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRangesFor = 0;

        ProcessingStatusHandler(com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView blinkIdOverlayView) {
            this.getHighResolutionOutputSizeshNQ4ISI = blinkIdOverlayView;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController$4] */
    public BlinkIdOverlayController(com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlaySettings blinkIdOverlaySettings, com.microblink.blinkid.view.recognition.ScanResultListener scanResultListener, com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView blinkIdOverlayView) {
        super(scanResultListener);
        this.getInputSizeshNQ4ISI = 0;
        this.getOutputMinFrameDurationlomOqCM = com.microblink.blinkid.fragment.overlay.DocumentSide.FIRST_SIDE;
        this.Camera2StreamConfigurationMap = new com.microblink.blinkid.entities.recognizers.HighResImagesBundle();
        com.microblink.blinkid.fragment.overlay.DocumentRecognizerManager documentRecognizerManager = new com.microblink.blinkid.fragment.overlay.DocumentRecognizerManager();
        this.llIllIIlll = documentRecognizerManager;
        this.getInputFormats = new com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.AnonymousClass2();
        this.getHighSpeedVideoFpsRangesFor = new java.lang.Runnable() { // from class: com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.3
            @Override // java.lang.Runnable
            public void run() {
                com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.this.pauseScanning();
                com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.getOutputMinFrameDurationlomOqCM(com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.this);
                com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController blinkIdOverlayController = com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.this;
                blinkIdOverlayController.lIllIIlIIl.uploadImages(blinkIdOverlayController.getContext(), com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.this.getRecognizerBundle());
            }
        };
        this.getHighSpeedVideoSizes = new com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.InternalBlinkIdRecognizerCallbacks(new com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.BlinkIdRecognizerCallbacks() { // from class: com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.4
            @Override // com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.BlinkIdRecognizerCallbacks
            public final void getHighSpeedVideoFpsRanges() {
                com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.this.getOutputStallDurationlomOqCM.onMovingCloserToBarcodeRequired();
                if (com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.this.getOutputFormats != null) {
                    com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.this.getOutputFormats.onScanBarcodeMessageShown();
                }
            }

            @Override // com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.BlinkIdRecognizerCallbacks
            public final void getHighSpeedVideoFpsRangesFor(boolean z) {
                if (z) {
                    com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.this.getOutputStallDurationlomOqCM.onDocumentClassified();
                    com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.this.getInputSizeshNQ4ISI = 0;
                } else {
                    com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.getOutputStallDuration(com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.this);
                }
                if (com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.this.getInputSizeshNQ4ISI < 3 || !com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.this.getHighSpeedVideoSizesFor.getOutputSizeshNQ4ISI) {
                    return;
                }
                com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.this.pauseScanning();
                com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.this.getOutputStallDurationlomOqCM.onErrorDialogShown();
                com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController blinkIdOverlayController = com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.this;
                blinkIdOverlayController.getHighSpeedVideoSizes(blinkIdOverlayController.getOutputStallDurationlomOqCM.getDocumentNotSupportedDialogStrings());
                com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.this.getInputSizeshNQ4ISI = 0;
                if (com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.this.getOutputFormats != null) {
                    com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.this.getOutputFormats.onDocumentUnsupportedDialogShown();
                }
            }
        });
        this.getOutputStallDurationlomOqCM = blinkIdOverlayView;
        this.getHighSpeedVideoSizesFor = blinkIdOverlaySettings;
        com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdUploadManager blinkIdUploadManager = new com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdUploadManager();
        this.lIllIIlIIl = blinkIdUploadManager;
        this.getOutputFormats = blinkIdOverlaySettings.getInputSizeshNQ4ISI;
        documentRecognizerManager.setup(getRecognizerBundle(), blinkIdOverlaySettings.getHighSpeedVideoSizesFor);
        this.getOutputStallDuration = com.microblink.blinkid.fragment.overlay.components.feedback.RecognitionFeedbackHandlerFactory.create(blinkIdOverlaySettings.getInputFormats);
        this.getOutputMinFrameDuration = new com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.ProcessingStatusHandler(blinkIdOverlayView);
        if (com.microblink.blinkid.fragment.overlay.blinkid.reticleui.MandatoryFieldType.values().length != com.microblink.blinkid.entities.recognizers.blinkid.generic.FieldType.values().length) {
            throw new java.lang.IllegalStateException("Number of mandatory field types must be equal to number of field types!");
        }
        if (blinkIdOverlaySettings.getOutputMinFrameDurationlomOqCM) {
            this.getOutputSizeshNQ4ISI = new com.microblink.blinkid.fragment.overlay.components.feedback.PointSetFeedbackHandler(com.microblink.blinkid.metadata.detection.points.PointsType.MRTD_DETECTION);
        } else {
            this.getOutputSizeshNQ4ISI = com.microblink.blinkid.fragment.overlay.components.feedback.RecognitionFeedbackHandler.EMPTY;
        }
        blinkIdUploadManager.setupUploadManager(getHighResolutionOutputSizeshNQ4ISI(getRecognizerBundle()));
        this.lllIIlIIlI = new com.microblink.blinkid.fragment.overlay.PingSessionFlowManager();
        if (blinkIdOverlayView.getOnboardingView() != null) {
            this.getHighResolutionOutputSizeshNQ4ISI = new com.microblink.blinkid.fragment.overlay.blinkid.reticleui.BlinkIdDialogOnboardingPresenter(this, blinkIdOverlayView.getOnboardingView(), blinkIdOverlaySettings.showTooltipTimeIntervalMs);
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI = null;
        }
    }

    static void getInputSizeshNQ4ISI(com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController blinkIdOverlayController) {
        blinkIdOverlayController.getOutputStallDuration.clear();
        blinkIdOverlayController.getOutputSizeshNQ4ISI.clear();
    }

    static /* synthetic */ void getOutputStallDuration(com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController blinkIdOverlayController) {
        blinkIdOverlayController.getInputSizeshNQ4ISI++;
    }

    public com.microblink.blinkid.entities.recognizers.HighResImagesBundle getHighResImagesBundle() {
        return this.Camera2StreamConfigurationMap;
    }

    public com.microblink.blinkid.entities.recognizers.RecognizerBundle getRecognizerBundle() {
        return this.getHighSpeedVideoSizesFor.getRecognizerBundle();
    }

    public com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ScanRecognitionMode getScanRecognitionMode(com.microblink.blinkid.fragment.overlay.DocumentRecognizerManager documentRecognizerManager) {
        boolean z;
        boolean z2;
        if (getRecognizerBundle().getRecognizers().length == 1) {
            com.microblink.blinkid.entities.recognizers.Recognizer<?> concreteRecognizer = documentRecognizerManager.getConcreteRecognizer(getRecognizerBundle().getRecognizers()[0]);
            if (concreteRecognizer instanceof com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdSingleSideRecognizer) {
                com.microblink.blinkid.entities.recognizers.blinkid.generic.RecognitionModeFilter recognitionModeFilter = ((com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdSingleSideRecognizer) concreteRecognizer).getRecognitionModeFilter();
                if (!recognitionModeFilter.enableFullDocumentRecognition && (((!(z = recognitionModeFilter.enableMrzId) && !recognitionModeFilter.enableMrzVisa && !recognitionModeFilter.enableMrzPassport) || (!recognitionModeFilter.enableBarcodeId && !recognitionModeFilter.enablePhotoId)) && (!(z2 = recognitionModeFilter.enableBarcodeId) || !recognitionModeFilter.enablePhotoId))) {
                    if (z2) {
                        return com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ScanRecognitionMode.Barcode;
                    }
                    if (z || recognitionModeFilter.enableMrzVisa || recognitionModeFilter.enableMrzPassport) {
                        return com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ScanRecognitionMode.Mrz;
                    }
                    if (recognitionModeFilter.enablePhotoId) {
                        return com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ScanRecognitionMode.PhotoId;
                    }
                }
            }
            if (concreteRecognizer instanceof com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrtdRecognizer) {
                return com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ScanRecognitionMode.Mrz;
            }
            if ((concreteRecognizer instanceof com.microblink.blinkid.entities.recognizers.blinkbarcode.usdl.UsdlRecognizer) || (concreteRecognizer instanceof com.microblink.blinkid.entities.recognizers.blinkid.idbarcode.IdBarcodeRecognizer)) {
                return com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ScanRecognitionMode.Barcode;
            }
            if (concreteRecognizer instanceof com.microblink.blinkid.entities.recognizers.blinkid.documentface.DocumentFaceRecognizer) {
                return com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ScanRecognitionMode.PhotoId;
            }
        }
        return com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ScanRecognitionMode.FullRecognition;
    }

    @Override // com.microblink.blinkid.fragment.overlay.BaseOverlayController
    public final void llIIIlllll() {
        this.IllIIIIllI.removeCallbacks(this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // com.microblink.blinkid.fragment.overlay.BaseOverlayController
    public final void onCameraAutofocusFailed() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.microblink.blinkid.fragment.overlay.BaseOverlayController, com.microblink.blinkid.fragment.overlay.ScanningOverlay
    public void onFrameRecognitionDone(com.microblink.blinkid.recognition.RecognitionSuccessType recognitionSuccessType) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        for (com.microblink.blinkid.entities.recognizers.Recognizer recognizer : getHighResolutionOutputSizeshNQ4ISI(this.llIIIlllll.getRecognizerBundle())) {
            com.microblink.blinkid.entities.recognizers.Recognizer.Result result = (com.microblink.blinkid.entities.recognizers.Recognizer.Result) recognizer.getResult();
            this.lllIIlIIlI.recordResultState(result.getResultState());
            if (result instanceof com.microblink.blinkid.entities.recognizers.blinkid.ProcessingStatusResult) {
                com.microblink.blinkid.entities.recognizers.blinkid.generic.ProcessingStatus processingStatus = ((com.microblink.blinkid.entities.recognizers.blinkid.ProcessingStatusResult) result).getProcessingStatus();
                this.lllIIlIIlI.recordProcessingStatus(processingStatus.ordinal());
                com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.ProcessingStatusHandler processingStatusHandler = this.getOutputMinFrameDuration;
                androidx.fragment.app.FragmentActivity activity = this.IllIIIllII.getActivity();
                int i = com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.AnonymousClass5.getHighSpeedVideoFpsRangesFor[processingStatus.ordinal()];
                boolean z5 = true;
                if (i == 1) {
                    int i2 = processingStatusHandler.getHighSpeedVideoFpsRangesFor + 1;
                    processingStatusHandler.getHighSpeedVideoFpsRangesFor = i2;
                    if (i2 >= 2) {
                        com.microblink.blinkid.fragment.overlay.blinkid.reticleui.MandatoryFieldType[] mandatoryFieldTypeArr = new com.microblink.blinkid.fragment.overlay.blinkid.reticleui.MandatoryFieldType[0];
                        if (recognizer instanceof com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdSingleSideRecognizer) {
                            mandatoryFieldTypeArr = com.microblink.blinkid.fragment.overlay.blinkid.reticleui.MandatoryFieldType.fieldTypeToMandatoryFieldTypeArray(((com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdSingleSideRecognizer.Result) recognizer.getResult()).getAdditionalProcessingInfo().getMissingMandatoryFields());
                        }
                        if (recognizer instanceof com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer) {
                            mandatoryFieldTypeArr = !((com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer.Result) recognizer.getResult()).isScanningFirstSideDone() ? com.microblink.blinkid.fragment.overlay.blinkid.reticleui.MandatoryFieldType.fieldTypeToMandatoryFieldTypeArray(((com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer.Result) recognizer.getResult()).getFrontAdditionalProcessingInfo().getMissingMandatoryFields()) : com.microblink.blinkid.fragment.overlay.blinkid.reticleui.MandatoryFieldType.fieldTypeToMandatoryFieldTypeArray(((com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer.Result) recognizer.getResult()).getBackAdditionalProcessingInfo().getMissingMandatoryFields());
                        }
                        if (mandatoryFieldTypeArr.length > 0) {
                            processingStatusHandler.getHighResolutionOutputSizeshNQ4ISI.setMandatoryFieldsMissingTooltipText(mandatoryFieldTypeArr.length == 1 ? new int[]{mandatoryFieldTypeArr[0].mandatoryFieldMissingTooltipStringResource} : mandatoryFieldTypeArr.length == 2 ? new int[]{mandatoryFieldTypeArr[0].mandatoryFieldMissingTooltipStringResource, mandatoryFieldTypeArr[1].mandatoryFieldMissingTooltipStringResource} : null, activity);
                        }
                        processingStatusHandler.getHighResolutionOutputSizeshNQ4ISI.onProcessingError(com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView.ProcessingError.MANDATORY_FIELD_MISSING);
                    }
                } else if (i == 2) {
                    processingStatusHandler.getHighResolutionOutputSizeshNQ4ISI.onProcessingError(com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView.ProcessingError.SCANNING_WRONG_SIDE);
                    processingStatusHandler.getHighSpeedVideoFpsRangesFor = 0;
                } else if (i == 3) {
                    com.microblink.blinkid.entities.recognizers.blinkid.generic.ImageExtractionType[] imageExtractionTypeArr = new com.microblink.blinkid.entities.recognizers.blinkid.generic.ImageExtractionType[0];
                    if (recognizer instanceof com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdSingleSideRecognizer) {
                        imageExtractionTypeArr = ((com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdSingleSideRecognizer.Result) recognizer.getResult()).getAdditionalProcessingInfo().getImageExtractionFailures();
                    }
                    if (recognizer instanceof com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer) {
                        imageExtractionTypeArr = !((com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer.Result) recognizer.getResult()).isScanningFirstSideDone() ? ((com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer.Result) recognizer.getResult()).getFrontAdditionalProcessingInfo().getImageExtractionFailures() : ((com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer.Result) recognizer.getResult()).getBackAdditionalProcessingInfo().getImageExtractionFailures();
                    }
                    if (java.util.Arrays.asList(imageExtractionTypeArr).contains(com.microblink.blinkid.entities.recognizers.blinkid.generic.ImageExtractionType.Face)) {
                        processingStatusHandler.getHighResolutionOutputSizeshNQ4ISI.onProcessingError(com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView.ProcessingError.FACE_PHOTO_NOT_FULLY_VISIBLE);
                    }
                    processingStatusHandler.getHighSpeedVideoFpsRangesFor = 0;
                } else if (i != 4) {
                    processingStatusHandler.getHighSpeedVideoFpsRangesFor = 0;
                } else {
                    if (recognizer instanceof com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdSingleSideRecognizer) {
                        com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdSingleSideRecognizer blinkIdSingleSideRecognizer = (com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdSingleSideRecognizer) recognizer;
                        z2 = blinkIdSingleSideRecognizer.shouldEnableBlurFilter();
                        z3 = blinkIdSingleSideRecognizer.shouldEnableGlareFilter();
                        com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.ImageAnalysisResult imageAnalysisResult = ((com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdSingleSideRecognizer.Result) blinkIdSingleSideRecognizer.getResult()).getImageAnalysisResult();
                        z4 = imageAnalysisResult.isBlurDetected();
                        z = imageAnalysisResult.isGlareDetected();
                    } else {
                        z = false;
                        z2 = false;
                        z3 = false;
                        z4 = false;
                    }
                    if (recognizer instanceof com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer) {
                        com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer blinkIdMultiSideRecognizer = (com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer) recognizer;
                        z2 = blinkIdMultiSideRecognizer.shouldEnableBlurFilter();
                        z3 = blinkIdMultiSideRecognizer.shouldEnableGlareFilter();
                        com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.ImageAnalysisResult frontImageAnalysisResult = ((com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer.Result) blinkIdMultiSideRecognizer.getResult()).getFrontImageAnalysisResult();
                        com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.ImageAnalysisResult backImageAnalysisResult = ((com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer.Result) blinkIdMultiSideRecognizer.getResult()).getBackImageAnalysisResult();
                        z4 = frontImageAnalysisResult.isBlurDetected() || backImageAnalysisResult.isBlurDetected();
                        if (!frontImageAnalysisResult.isGlareDetected() && !backImageAnalysisResult.isGlareDetected()) {
                            z5 = false;
                        }
                        z = z5;
                    }
                    if (z4 && z2) {
                        processingStatusHandler.getHighResolutionOutputSizeshNQ4ISI.onProcessingError(com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView.ProcessingError.BLUR_DETECTED);
                    } else if (z && z3) {
                        processingStatusHandler.getHighResolutionOutputSizeshNQ4ISI.onProcessingError(com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView.ProcessingError.GLARE_DETECTED);
                    }
                    processingStatusHandler.getHighSpeedVideoFpsRangesFor = 0;
                }
            }
        }
    }

    @Override // com.microblink.blinkid.fragment.overlay.BaseOverlayController, com.microblink.blinkid.fragment.overlay.ScanningOverlay
    public void onRecognizerRunnerViewCreated(com.microblink.blinkid.fragment.RecognizerRunnerFragment recognizerRunnerFragment) {
        super.onRecognizerRunnerViewCreated(recognizerRunnerFragment);
        boolean z = false;
        for (java.lang.Object obj : getHighResolutionOutputSizeshNQ4ISI(getRecognizerBundle())) {
            if (obj instanceof com.microblink.blinkid.entities.recognizers.classifier.ClassifierCallbackOptions) {
                ((com.microblink.blinkid.entities.recognizers.classifier.ClassifierCallbackOptions) obj).setClassifierCallback(this.getHighSpeedVideoSizes);
                z = true;
            }
            if (obj instanceof com.microblink.blinkid.entities.recognizers.blinkid.generic.BarcodeScanningStartedCallbackOptions) {
                ((com.microblink.blinkid.entities.recognizers.blinkid.generic.BarcodeScanningStartedCallbackOptions) obj).setBarcodeScanningStartedCallback(this.getHighSpeedVideoSizes);
            }
        }
        this.getOutputStallDurationlomOqCM.setRecognizerSupportsClassification(z);
        this.llIIIlllll.setRecognizerBundle(this.llIllIIlll.buildRecognizerBundle(this.getOutputMinFrameDurationlomOqCM));
        this.llIIIlllll.setHighResFrameCaptureEnabled(this.getHighSpeedVideoSizesFor.getHighSpeedVideoFpsRanges);
        this.getHighSpeedVideoSizesFor.getOutputSizes.apply(this.llIIIlllll);
        com.microblink.blinkid.metadata.MetadataCallbacks metadataCallbacks = new com.microblink.blinkid.metadata.MetadataCallbacks();
        metadataCallbacks.setFailedDetectionCallback(new com.microblink.blinkid.metadata.detection.FailedDetectionCallback() { // from class: com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController$$ExternalSyntheticLambda2
            @Override // com.microblink.blinkid.metadata.detection.FailedDetectionCallback
            public final void onDetectionFailed() {
                com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.m10884$r8$lambda$O5g4SgI71H9FYkAcNMCmbD5pw(com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.this);
            }
        });
        metadataCallbacks.setPointsDetectionCallback(new com.microblink.blinkid.metadata.detection.points.PointsDetectionCallback() { // from class: com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController$$ExternalSyntheticLambda3
            @Override // com.microblink.blinkid.metadata.detection.points.PointsDetectionCallback
            public final void onPointsDetection(com.microblink.blinkid.metadata.detection.points.DisplayablePointsDetection displayablePointsDetection) {
                com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.$r8$lambda$Et01kmZNlo63jftD4e4ja4ZHZ6I(com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.this, displayablePointsDetection);
            }
        });
        metadataCallbacks.setFirstSideRecognitionCallback(this.getInputFormats);
        metadataCallbacks.setDebugImageCallback(this.getHighSpeedVideoSizesFor.getHighSpeedVideoSizes);
        metadataCallbacks.setQuadDetectionCallback(new com.microblink.blinkid.metadata.detection.quad.QuadDetectionCallback() { // from class: com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController$$ExternalSyntheticLambda4
            @Override // com.microblink.blinkid.metadata.detection.quad.QuadDetectionCallback
            public final void onQuadDetection(com.microblink.blinkid.metadata.detection.quad.DisplayableQuadDetection displayableQuadDetection) {
                com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.m10887$r8$lambda$eiSFKHaGUqh6AN4WY8twkdBrug(com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.this, displayableQuadDetection);
            }
        });
        final com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView blinkIdOverlayView = this.getOutputStallDurationlomOqCM;
        java.util.Objects.requireNonNull(blinkIdOverlayView);
        metadataCallbacks.setGlareCallback(new com.microblink.blinkid.metadata.glare.GlareCallback() { // from class: com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController$$ExternalSyntheticLambda5
            @Override // com.microblink.blinkid.metadata.glare.GlareCallback
            public final void onGlare(boolean z2) {
                com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView.this.onGlare(z2);
            }
        });
        android.view.View createView = this.getOutputSizeshNQ4ISI.createView(this.llIIIlllll, metadataCallbacks);
        if (createView != null) {
            this.llIIIlllll.addChildView(createView, false);
        }
        android.view.View createView2 = this.getOutputStallDuration.createView(this.llIIIlllll, metadataCallbacks);
        if (createView2 != null) {
            this.llIIIlllll.addChildView(createView2, false);
        }
        final boolean isInMultiWindowMode = recognizerRunnerFragment.getActivity().isInMultiWindowMode();
        this.llIIIlllll.setMetadataCallbacks(metadataCallbacks);
        this.llIIIlllll.setOrientationAllowedListener(new com.microblink.blinkid.view.OrientationAllowedListener() { // from class: com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController$$ExternalSyntheticLambda0
            @Override // com.microblink.blinkid.view.OrientationAllowedListener
            public final boolean isOrientationAllowed(com.microblink.blinkid.hardware.orientation.Orientation orientation) {
                return com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.m10882$r8$lambda$GQ5sXPa7xKzEnDRdGBBAZxFb34(com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.this, isInMultiWindowMode, orientation);
            }
        });
        this.getOutputStallDurationlomOqCM.setScanRecognitionModeOverlay(getScanRecognitionMode(this.llIllIIlll));
        android.view.ViewGroup createLayout = this.getOutputStallDurationlomOqCM.createLayout(recognizerRunnerFragment.getActivity(), this.llIIIlllll);
        if (this.llIllIIlll.getRecognitionDebugMode() != com.microblink.blinkid.entities.recognizers.RecognizerBundle.RecognitionDebugMode.RECOGNITION) {
            new com.microblink.blinkid.fragment.overlay.components.debug.DebugViewHandler().initialize(recognizerRunnerFragment.getActivity(), createLayout, metadataCallbacks);
        }
        com.microblink.blinkid.fragment.overlay.components.TorchController createTorchController = this.getOutputStallDurationlomOqCM.createTorchController(this.llIIIlllll);
        this.IIlIIIllIl = createTorchController;
        createTorchController.setTorchStateListener(new com.microblink.blinkid.fragment.overlay.verification.OverlayTorchStateListener() { // from class: com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.1
            @Override // com.microblink.blinkid.fragment.overlay.verification.OverlayTorchStateListener
            public void onTorchStateChanged(boolean z2) {
                com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.this.getOutputStallDurationlomOqCM.onTorchStateChanged(z2);
            }

            @Override // com.microblink.blinkid.fragment.overlay.verification.OverlayTorchStateListener
            public void onTorchStateInitialised(boolean z2) {
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        if (((com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer.Result) r3.getResult()).getDataMatch().getStateForWholeDocument() == com.microblink.blinkid.entities.recognizers.blinkid.DataMatchState.Failed) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.microblink.blinkid.view.recognition.ScanResultListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onScanningDone(com.microblink.blinkid.recognition.RecognitionSuccessType recognitionSuccessType) {
        if (recognitionSuccessType == com.microblink.blinkid.recognition.RecognitionSuccessType.UNSUCCESSFUL) {
            return;
        }
        pauseScanning();
        this.llIIlIIlll.play();
        if (this.getHighSpeedVideoSizesFor.getHighResolutionOutputSizeshNQ4ISI) {
            if (!this.llIllIIlll.hasInvalidDocumentDataMatch()) {
                com.microblink.blinkid.entities.recognizers.Recognizer[] highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(getRecognizerBundle());
                int length = highResolutionOutputSizeshNQ4ISI.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    com.microblink.blinkid.entities.recognizers.Recognizer recognizer = highResolutionOutputSizeshNQ4ISI[i];
                    if (!(recognizer instanceof com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer)) {
                        i++;
                    }
                }
            }
            if (recognitionSuccessType == com.microblink.blinkid.recognition.RecognitionSuccessType.PARTIAL || recognitionSuccessType == com.microblink.blinkid.recognition.RecognitionSuccessType.STAGE_SUCCESSFUL) {
                this.getOutputStallDurationlomOqCM.onErrorDialogShown();
                getHighSpeedVideoSizes(this.getOutputStallDurationlomOqCM.getRecognitionTimeoutDialogStrings());
                com.microblink.blinkid.uisettings.options.ScanUIEventListener scanUIEventListener = this.getOutputFormats;
                if (scanUIEventListener != null) {
                    scanUIEventListener.onSecondSideScanTimeoutDialogShown();
                }
            } else if (recognitionSuccessType == com.microblink.blinkid.recognition.RecognitionSuccessType.SUCCESSFUL) {
                this.getOutputStallDurationlomOqCM.onErrorDialogShown();
                if (this.getOutputMinFrameDurationlomOqCM == com.microblink.blinkid.fragment.overlay.DocumentSide.FIRST_SIDE) {
                    getHighSpeedVideoSizes(this.getOutputStallDurationlomOqCM.getDataMismatchStrings());
                } else {
                    getHighSpeedVideoSizes(this.getOutputStallDurationlomOqCM.getSidesNotMatchingDialogStrings());
                }
                this.IllIIIIllI.removeCallbacks(this.getHighSpeedVideoFpsRangesFor);
                com.microblink.blinkid.uisettings.options.ScanUIEventListener scanUIEventListener2 = this.getOutputFormats;
                if (scanUIEventListener2 != null) {
                    scanUIEventListener2.onDataMatchFailedDialogShown();
                }
            }
            this.lIllIIlIIl.uploadImages(getContext(), getRecognizerBundle());
            return;
        }
        if (this.getHighSpeedVideoSizesFor.getHighSpeedVideoFpsRanges) {
            this.llIIIlllll.captureHighResImage(new com.microblink.blinkid.view.recognition.HighResImageListener() { // from class: com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController$$ExternalSyntheticLambda8
                @Override // com.microblink.blinkid.view.recognition.HighResImageListener
                public final void onHighResImageAvailable(com.microblink.blinkid.image.highres.HighResImageWrapper highResImageWrapper) {
                    com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.m10886$r8$lambda$Yqg3Wq7ftBSY9XiYMS5R1zU45Y(com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.this, highResImageWrapper);
                }
            });
        } else {
            getHighResolutionOutputSizeshNQ4ISI(this.llIllIIlll.getScanSuccessType());
        }
    }

    @Override // com.microblink.blinkid.fragment.overlay.BaseOverlayController, com.microblink.blinkid.fragment.overlay.ScanningOverlay
    public void pauseScanning() {
        super.pauseScanning();
        this.IllIIIIllI.removeCallbacks(this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // com.microblink.blinkid.fragment.overlay.BaseOverlayController, com.microblink.blinkid.fragment.overlay.ScanningOverlay
    public void resumeScanning() {
        super.resumeScanning();
        com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView = this.llIIIlllll;
        if (recognizerRunnerView == null || recognizerRunnerView.isScanningPaused() || this.getOutputMinFrameDurationlomOqCM != com.microblink.blinkid.fragment.overlay.DocumentSide.SECOND_SIDE || this.getHighSpeedVideoSizesFor.Camera2StreamConfigurationMap == 0) {
            return;
        }
        this.IllIIIIllI.postDelayed(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizesFor.Camera2StreamConfigurationMap);
    }

    /* renamed from: com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController$2, reason: invalid class name */
    public class AnonymousClass2 implements com.microblink.blinkid.metadata.recognition.FirstSideRecognitionCallback {
        AnonymousClass2() {
        }

        @Override // com.microblink.blinkid.metadata.recognition.FirstSideRecognitionCallback
        public void onFirstSideRecognitionFinished() {
            com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.this.llIIIlllll.pauseScanning();
            if (com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.this.getHighSpeedVideoSizesFor.getHighSpeedVideoFpsRanges) {
                com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.this.llIIIlllll.captureHighResImage(new com.microblink.blinkid.view.recognition.HighResImageListener() { // from class: com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController$2$$ExternalSyntheticLambda0
                    @Override // com.microblink.blinkid.view.recognition.HighResImageListener
                    public final void onHighResImageAvailable(com.microblink.blinkid.image.highres.HighResImageWrapper highResImageWrapper) {
                        com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.AnonymousClass2.getHighSpeedVideoFpsRanges(com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.AnonymousClass2.this, highResImageWrapper);
                    }
                });
            } else {
                getHighSpeedVideoSizes();
            }
        }

        private void getHighSpeedVideoSizes() {
            com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.this.llIIlIIlll.play();
            com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.this.getOutputMinFrameDurationlomOqCM = com.microblink.blinkid.fragment.overlay.DocumentSide.SECOND_SIDE;
            com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView = com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.this.llIIIlllll;
            com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController blinkIdOverlayController = com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.this;
            recognizerRunnerView.reconfigureRecognizers(blinkIdOverlayController.llIllIIlll.buildRecognizerBundle(blinkIdOverlayController.getOutputMinFrameDurationlomOqCM));
            com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.getInputSizeshNQ4ISI(com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.this);
            com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.this.llIIlIlIIl(0L);
            com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.this.llIIIlllll.resumeScanning(false);
            if (com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.this.getOutputFormats != null) {
                com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.this.getOutputFormats.onFirstSideDone();
            }
        }

        public static /* synthetic */ void getHighSpeedVideoFpsRanges(com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.AnonymousClass2 anonymousClass2, com.microblink.blinkid.image.highres.HighResImageWrapper highResImageWrapper) {
            com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.this.Camera2StreamConfigurationMap.addImage(highResImageWrapper);
            anonymousClass2.getHighSpeedVideoSizes();
        }
    }

    static void getOutputMinFrameDurationlomOqCM(com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController blinkIdOverlayController) {
        blinkIdOverlayController.getOutputStallDurationlomOqCM.onErrorDialogShown();
        blinkIdOverlayController.getHighSpeedVideoSizes(blinkIdOverlayController.getOutputStallDurationlomOqCM.getRecognitionTimeoutDialogStrings());
        com.microblink.blinkid.uisettings.options.ScanUIEventListener scanUIEventListener = blinkIdOverlayController.getOutputFormats;
        if (scanUIEventListener != null) {
            scanUIEventListener.onSecondSideScanTimeoutDialogShown();
        }
    }

    @Override // com.microblink.blinkid.fragment.overlay.BaseOverlayController
    public final int IlIllIlIIl() {
        return this.getHighSpeedVideoSizesFor.getOutputFormats;
    }

    @Override // com.microblink.blinkid.fragment.overlay.BaseOverlayController
    public final void IllIIIIllI() {
        this.llIllIIlll.clearBundleState();
        this.Camera2StreamConfigurationMap.clearSavedState();
        this.getOutputStallDuration.clear();
        this.getOutputSizeshNQ4ISI.clear();
        if (this.getOutputMinFrameDurationlomOqCM != com.microblink.blinkid.fragment.overlay.DocumentSide.SECOND_SIDE) {
            llIIlIlIIl(0L);
            return;
        }
        this.IllIIIIllI.removeCallbacksAndMessages(null);
        Camera2StreamConfigurationMap(0L);
        resumeScanning();
    }

    @Override // com.microblink.blinkid.fragment.overlay.BaseOverlayController
    public final void IllIIIllII() {
        this.getOutputStallDurationlomOqCM.cleanup();
    }

    @Override // com.microblink.blinkid.fragment.overlay.BaseOverlayController
    public final boolean llIIlIIlll() {
        return this.getOutputMinFrameDurationlomOqCM == com.microblink.blinkid.fragment.overlay.DocumentSide.FIRST_SIDE;
    }

    protected final void lllIIIlIlI() {
        this.getOutputStallDurationlomOqCM.onFirstSideScanStarted();
        com.microblink.blinkid.fragment.overlay.blinkid.reticleui.BlinkIdDialogOnboardingPresenter blinkIdDialogOnboardingPresenter = this.getHighResolutionOutputSizeshNQ4ISI;
        if (blinkIdDialogOnboardingPresenter != null) {
            blinkIdDialogOnboardingPresenter.onFirstSideScanStarted();
        }
    }

    private void Camera2StreamConfigurationMap(long j) {
        this.getOutputMinFrameDurationlomOqCM = com.microblink.blinkid.fragment.overlay.DocumentSide.FIRST_SIDE;
        this.Camera2StreamConfigurationMap.clearImages();
        this.getOutputStallDuration.clear();
        this.getOutputSizeshNQ4ISI.clear();
        this.llIIIlllll.reconfigureRecognizers(this.llIllIIlll.buildRecognizerBundle(this.getOutputMinFrameDurationlomOqCM));
        llIIlIlIIl(j);
    }

    @Override // com.microblink.blinkid.fragment.overlay.BaseOverlayController
    public final int llIIlIlIIl() {
        return this.getHighSpeedVideoSizesFor.getOutputMinFrameDuration;
    }

    private com.microblink.blinkid.entities.recognizers.Recognizer[] getHighResolutionOutputSizeshNQ4ISI(com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle) {
        com.microblink.blinkid.entities.recognizers.Recognizer<com.microblink.blinkid.entities.recognizers.Recognizer.Result>[] recognizers = recognizerBundle.getRecognizers();
        com.microblink.blinkid.entities.recognizers.Recognizer[] recognizerArr = new com.microblink.blinkid.entities.recognizers.Recognizer[recognizers.length];
        for (int i = 0; i < recognizers.length; i++) {
            recognizerArr[i] = this.llIllIIlll.getConcreteRecognizer(recognizers[i]);
        }
        return recognizerArr;
    }

    @Override // com.microblink.blinkid.fragment.overlay.BaseOverlayController
    public final void IlIllIlIIl(android.os.Bundle bundle) {
        this.llIllIIlll.saveBundleState();
        this.Camera2StreamConfigurationMap.saveState();
    }

    private void getHighResolutionOutputSizeshNQ4ISI(final com.microblink.blinkid.recognition.RecognitionSuccessType recognitionSuccessType) {
        long onScanSuccess = this.getOutputStallDurationlomOqCM.onScanSuccess();
        this.IllIIIIllI.removeCallbacks(this.getHighSpeedVideoFpsRangesFor);
        this.IllIIIIllI.postDelayed(new java.lang.Runnable() { // from class: com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.m10883$r8$lambda$I_W187P3eBl_elw_lmxyT7dtNo(com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.this, recognitionSuccessType);
            }
        }, onScanSuccess);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getHighSpeedVideoSizes(com.microblink.blinkid.fragment.overlay.reticle.RetryDialogStrings retryDialogStrings) {
        new android.app.AlertDialog.Builder(getContext(), com.microblink.blinkid.library.R.style.MB_alert_dialog).setTitle(retryDialogStrings.title).setMessage(retryDialogStrings.message).setPositiveButton(retryDialogStrings.retryButton, new android.content.DialogInterface.OnClickListener() { // from class: com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController$$ExternalSyntheticLambda9
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.m10885$r8$lambda$YLd9b1UiIgmYjoa9ZxJWtp37_Y(com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.this, dialogInterface, i);
            }
        }).setCancelable(false).create().show();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void llIIlIlIIl(long j) {
        boolean z;
        com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.CardRotation cardRotation;
        com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView;
        int i;
        if (this.getOutputMinFrameDurationlomOqCM == com.microblink.blinkid.fragment.overlay.DocumentSide.FIRST_SIDE) {
            this.IllIIIIllI.postDelayed(new java.lang.Runnable() { // from class: com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.this.lllIIIlIlI();
                }
            }, j);
            return;
        }
        com.microblink.blinkid.entities.recognizers.Recognizer[] highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(getRecognizerBundle());
        int length = highResolutionOutputSizeshNQ4ISI.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            com.microblink.blinkid.entities.recognizers.Recognizer recognizer = highResolutionOutputSizeshNQ4ISI[i2];
            if (!(recognizer instanceof com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer)) {
                i2++;
            } else if (((com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer.Result) recognizer.getResult()).getClassInfo().getType() == com.microblink.blinkid.entities.recognizers.blinkid.generic.classinfo.Type.PASSPORT) {
                z = true;
            }
        }
        z = false;
        for (com.microblink.blinkid.entities.recognizers.Recognizer recognizer2 : getHighResolutionOutputSizeshNQ4ISI(getRecognizerBundle())) {
            if (recognizer2 instanceof com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer) {
                cardRotation = ((com.microblink.blinkid.entities.recognizers.blinkid.generic.BlinkIdMultiSideRecognizer.Result) recognizer2.getResult()).getFrontImageAnalysisResult().getCardRotation();
                if (cardRotation != null && (recognizerRunnerView = this.llIIIlllll) != null) {
                    int hostScreenOrientation = recognizerRunnerView.getHostScreenOrientation();
                    if (hostScreenOrientation == 0) {
                        break;
                    }
                    if (hostScreenOrientation == 1) {
                        int i3 = com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.AnonymousClass5.Camera2StreamConfigurationMap[cardRotation.ordinal()];
                        if (i3 == 1) {
                            cardRotation = com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.CardRotation.Clockwise90;
                        } else if (i3 == 2) {
                            cardRotation = com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.CardRotation.UpsideDown;
                        } else if (i3 != 3) {
                            if (i3 == 4) {
                                cardRotation = com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.CardRotation.CounterClockwise90;
                            }
                            i = com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.AnonymousClass5.Camera2StreamConfigurationMap[cardRotation.ordinal()];
                            if (i != 1) {
                            }
                        } else {
                            cardRotation = com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.CardRotation.Zero;
                        }
                    } else if (hostScreenOrientation == 8) {
                        int i4 = com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.AnonymousClass5.Camera2StreamConfigurationMap[cardRotation.ordinal()];
                        if (i4 == 1) {
                            cardRotation = com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.CardRotation.UpsideDown;
                            break;
                        }
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i4 == 4) {
                                    break;
                                }
                            } else {
                                cardRotation = com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.CardRotation.Clockwise90;
                                break;
                            }
                        } else {
                            cardRotation = com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.CardRotation.CounterClockwise90;
                            break;
                        }
                    } else if (hostScreenOrientation == 9) {
                        i = com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.AnonymousClass5.Camera2StreamConfigurationMap[cardRotation.ordinal()];
                        if (i != 1) {
                            cardRotation = com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.CardRotation.CounterClockwise90;
                        } else if (i == 2) {
                            cardRotation = com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.CardRotation.Zero;
                        } else if (i == 3) {
                            cardRotation = com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.CardRotation.UpsideDown;
                        } else if (i == 4) {
                            cardRotation = com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.CardRotation.Clockwise90;
                        }
                    }
                } else {
                    cardRotation = com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.CardRotation.Zero;
                    break;
                }
            }
        }
        cardRotation = com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.CardRotation.Zero;
        pauseScanning();
        this.getOutputStallDurationlomOqCM.setShowBackSideBarcodeInstructions(false);
        this.getOutputStallDurationlomOqCM.onFirstSideScanSuccess(z, cardRotation);
        this.IllIIIIllI.postDelayed(new java.lang.Runnable() { // from class: com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.$r8$lambda$XVnWqXa_Ad8IAJ0rVcnfbBx0LZk(com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController.this);
            }
        }, getHighSpeedVideoFpsRanges);
    }

    @Override // com.microblink.blinkid.fragment.overlay.BaseOverlayController
    public final void llIIlIlIIl(android.content.res.Configuration configuration) {
        int hostScreenOrientation = this.llIIIlllll.getHostScreenOrientation();
        this.getOutputStallDuration.onOrientationChange(hostScreenOrientation);
        this.getOutputSizeshNQ4ISI.onOrientationChange(hostScreenOrientation);
        this.getOutputStallDurationlomOqCM.onConfigurationChanged(hostScreenOrientation);
        this.IIlIIIllIl.updateTorchState(false);
    }

    public static /* synthetic */ void $r8$lambda$Et01kmZNlo63jftD4e4ja4ZHZ6I(com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController blinkIdOverlayController, com.microblink.blinkid.metadata.detection.points.DisplayablePointsDetection displayablePointsDetection) {
        blinkIdOverlayController.getOutputStallDuration.onPointsDetection(displayablePointsDetection);
        blinkIdOverlayController.getOutputSizeshNQ4ISI.onPointsDetection(displayablePointsDetection);
    }

    /* renamed from: $r8$lambda$GQ5sXPa7x-KzEnDRdGBBAZxFb34, reason: not valid java name */
    public static /* synthetic */ boolean m10882$r8$lambda$GQ5sXPa7xKzEnDRdGBBAZxFb34(com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController blinkIdOverlayController, boolean z, com.microblink.blinkid.hardware.orientation.Orientation orientation) {
        return z || !blinkIdOverlayController.getHighSpeedVideoSizesFor.getHighSpeedVideoFpsRangesFor || orientation == com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_PORTRAIT || orientation == com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_PORTRAIT_UPSIDE;
    }

    /* renamed from: $r8$lambda$I_W187-P3eBl_elw_lmxyT7dtNo, reason: not valid java name */
    public static /* synthetic */ void m10883$r8$lambda$I_W187P3eBl_elw_lmxyT7dtNo(com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController blinkIdOverlayController, com.microblink.blinkid.recognition.RecognitionSuccessType recognitionSuccessType) {
        blinkIdOverlayController.llIIlIlIIl.onScanningDone(recognitionSuccessType);
        blinkIdOverlayController.lIllIIlIIl.uploadImages(blinkIdOverlayController.getContext(), blinkIdOverlayController.getRecognizerBundle());
        blinkIdOverlayController.resumeScanning();
        if (blinkIdOverlayController.IllIIIllII.getActivity().isFinishing()) {
            return;
        }
        blinkIdOverlayController.Camera2StreamConfigurationMap(100L);
    }

    /* renamed from: $r8$lambda$O5g4SgI7-1-H9FYkAcNMCmbD5pw, reason: not valid java name */
    public static /* synthetic */ void m10884$r8$lambda$O5g4SgI71H9FYkAcNMCmbD5pw(com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController blinkIdOverlayController) {
        blinkIdOverlayController.getOutputStallDuration.clear();
        blinkIdOverlayController.getOutputSizeshNQ4ISI.clear();
    }

    public static /* synthetic */ void $r8$lambda$XVnWqXa_Ad8IAJ0rVcnfbBx0LZk(com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController blinkIdOverlayController) {
        blinkIdOverlayController.getOutputStallDurationlomOqCM.onSecondSideScanStarted();
        blinkIdOverlayController.resumeScanning();
        if (blinkIdOverlayController.getOutputMinFrameDurationlomOqCM != com.microblink.blinkid.fragment.overlay.DocumentSide.SECOND_SIDE || blinkIdOverlayController.getHighSpeedVideoSizesFor.Camera2StreamConfigurationMap == 0) {
            return;
        }
        blinkIdOverlayController.IllIIIIllI.postDelayed(blinkIdOverlayController.getHighSpeedVideoFpsRangesFor, blinkIdOverlayController.getHighSpeedVideoSizesFor.Camera2StreamConfigurationMap);
    }

    /* renamed from: $r8$lambda$YLd9b1UiIgmY-joa9ZxJWtp37_Y, reason: not valid java name */
    public static /* synthetic */ void m10885$r8$lambda$YLd9b1UiIgmYjoa9ZxJWtp37_Y(com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController blinkIdOverlayController, android.content.DialogInterface dialogInterface, int i) {
        blinkIdOverlayController.Camera2StreamConfigurationMap(0L);
        blinkIdOverlayController.resumeScanning();
    }

    /* renamed from: $r8$lambda$Yqg3Wq7ftBSY9XiYMS5R1zU4-5Y, reason: not valid java name */
    public static /* synthetic */ void m10886$r8$lambda$Yqg3Wq7ftBSY9XiYMS5R1zU45Y(com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController blinkIdOverlayController, com.microblink.blinkid.image.highres.HighResImageWrapper highResImageWrapper) {
        blinkIdOverlayController.Camera2StreamConfigurationMap.addImage(highResImageWrapper);
        blinkIdOverlayController.getHighResolutionOutputSizeshNQ4ISI(blinkIdOverlayController.llIllIIlll.getScanSuccessType());
    }

    /* renamed from: $r8$lambda$eiSFKH-aGUqh6AN4WY8twkdBrug, reason: not valid java name */
    public static /* synthetic */ void m10887$r8$lambda$eiSFKHaGUqh6AN4WY8twkdBrug(com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController blinkIdOverlayController, com.microblink.blinkid.metadata.detection.quad.DisplayableQuadDetection displayableQuadDetection) {
        blinkIdOverlayController.lllIIlIIlI.recordDetectionStatus(displayableQuadDetection.getDetectionStatus());
        blinkIdOverlayController.getOutputStallDurationlomOqCM.onCardDetectionUpdate(displayableQuadDetection.getDetectionStatus());
    }
}
