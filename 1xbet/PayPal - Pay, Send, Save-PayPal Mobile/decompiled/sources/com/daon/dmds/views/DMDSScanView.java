package com.daon.dmds.views;

/* loaded from: classes7.dex */
public class DMDSScanView extends android.widget.RelativeLayout implements android.content.ComponentCallbacks {
    private static com.daon.dmds.utils.face.FaceFinder ArtificialStackFrames = null;
    public static com.daon.dmds.views.DebugPointsView debugPointsView = null;
    static final java.lang.String getHighSpeedVideoSizes = "DMDSScanView";
    private com.daon.dmds.models.ResponseData AMEXKernel;
    com.daon.dmds.models.DMDSLifecycleState Camera2StreamConfigurationMap;
    private boolean CoroutineDebuggingKt;
    private com.daon.dmds.models.DMDSDocumentCaptureType _BOUNDARY;
    private com.daon.dmds.models.DMDSFace _CREATION;

    /* renamed from: a, reason: collision with root package name */
    private com.daon.dmds.managers.DMDSMetadataProvider f2844a;
    private com.daon.dmds.managers.DMDSDefaultScanListener accessartificialFrame;
    private boolean b;
    private com.daon.dmds.models.DMDSIDCaptureResult c;
    private java.lang.Runnable coroutineBoundary;
    long coroutineCreation;
    private boolean d;
    private android.os.Handler getARTIFICIAL_FRAME_PACKAGE_NAME;
    com.microblink.blinkid.geometry.Rectangle getHighResolutionOutputSizeshNQ4ISI;
    java.util.List<com.daon.dmds.models.DMDSDocumentDetectionStatus> getHighSpeedVideoFpsRanges;
    com.daon.dmds.recognizers.DocumentRecognizer getHighSpeedVideoFpsRangesFor;
    com.daon.dmds.models.DMDSOptions getHighSpeedVideoSizesFor;
    com.daon.dmds.managers.DMDSCustomScanListener getInputFormats;
    java.lang.Runnable getInputSizeshNQ4ISI;
    com.daon.dmds.models.DMDSErrorCode getOutputFormats;
    boolean getOutputMinFrameDuration;
    boolean getOutputMinFrameDurationlomOqCM;
    com.daon.dmds.models.DMDSOptions getOutputSizes;
    boolean getOutputSizeshNQ4ISI;
    com.daon.dmds.models.DMDSQuadrangle getOutputStallDuration;
    com.daon.dmds.models.DMDSQuadrangle getOutputStallDurationlomOqCM;
    boolean getValidOutputFormatsForInputhNQ4ISI;
    public com.daon.dmds.recognizers.IBarcodeScan idBarcodeScanListener;
    private com.daon.dmds.utils.idcapture.IdCaptureQualityFilter init;
    android.os.Handler isOutputSupportedFor;
    com.microblink.blinkid.view.recognition.RecognizerRunnerView isOutputSupportedForhNQ4ISI;
    private com.daon.dmds.models.DMDSIDCaptureResult kernelVersion;
    android.os.Handler toString;
    com.microblink.blinkid.metadata.detection.quad.DisplayableQuadDetection unwrapAs;

    /* renamed from: com.daon.dmds.views.DMDSScanView$4, reason: invalid class name */
    class AnonymousClass4 extends com.daon.dmds.models.CameraEvents {
        AnonymousClass4() {
        }

        @Override // com.daon.dmds.models.CameraEvents, com.microblink.blinkid.view.CameraEventsListener
        public void onCameraPermissionDenied() {
            com.daon.dmds.utils.DobsLogUtils.logDebug(com.daon.dmds.views.DMDSScanView.getHighSpeedVideoSizes, "CAMERA permission denied!");
            if (com.daon.dmds.views.DMDSScanView.this.accessartificialFrame != null) {
                com.daon.dmds.views.DMDSScanView.this.accessartificialFrame.documentScannedFailed(com.daon.dmds.models.DMDSError.errorForCode(com.daon.dmds.views.DMDSScanView.this.getContext(), com.daon.dmds.models.DMDSErrorCode.DMDSErrorCodeCameraAccessUnauthorized), null);
            }
            int checkSelfPermission = androidx.core.app.ActivityCompat.checkSelfPermission(com.daon.dmds.views.DMDSScanView.this.getContext(), "android.permission.CAMERA");
            final android.app.Activity activity = com.daon.dmds.utils.DMDSDocumentUtils.getActivity(com.daon.dmds.views.DMDSScanView.this.getContext());
            if (checkSelfPermission == -1) {
                new android.app.AlertDialog.Builder(activity).setTitle(com.daon.dmds.R.string.dmds_permission_dlg_title).setMessage(com.daon.dmds.R.string.dmds_permission_dlg_msg).setPositiveButton(com.daon.dmds.R.string.dmds_yes, new android.content.DialogInterface.OnClickListener() { // from class: com.daon.dmds.views.DMDSScanView$4$$ExternalSyntheticLambda0
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                        androidx.core.app.ActivityCompat.requestPermissions(activity, new java.lang.String[]{"android.permission.CAMERA"}, 2);
                    }
                }).setNegativeButton(com.daon.dmds.R.string.dmds_no, new android.content.DialogInterface.OnClickListener() { // from class: com.daon.dmds.views.DMDSScanView$4$$ExternalSyntheticLambda1
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                        activity.finish();
                    }
                }).create().show();
            }
        }

        @Override // com.daon.dmds.models.CameraEvents, com.microblink.blinkid.view.BaseCameraEventsListener
        public void onCameraPreviewStarted() {
            com.daon.dmds.utils.DobsLogUtils.logDebug(com.daon.dmds.views.DMDSScanView.getHighSpeedVideoSizes, "onCameraPreviewStarted: ");
        }

        @Override // com.daon.dmds.models.CameraEvents, com.microblink.blinkid.view.BaseCameraEventsListener
        public void onError(java.lang.Throwable th) {
            com.daon.dmds.utils.DobsLogUtils.getStackTrace(th);
            if (com.daon.dmds.views.DMDSScanView.this.accessartificialFrame != null) {
                com.daon.dmds.views.DMDSScanView.this.accessartificialFrame.documentScannedFailed(new com.daon.dmds.models.DMDSError(th.getLocalizedMessage(), com.daon.dmds.models.DMDSErrorCode.DMDSErrorCodeScanningLibraryError), null);
            }
            if (com.daon.dmds.views.DMDSScanView.this.getInputFormats != null) {
                com.daon.dmds.views.DMDSScanView.this.getInputFormats.documentScannedFailed(new com.daon.dmds.models.DMDSError(th.getLocalizedMessage(), com.daon.dmds.models.DMDSErrorCode.DMDSErrorCodeScanningLibraryError), null);
            }
        }
    }

    public DMDSScanView(android.content.Context context) {
        super(context);
        this.accessartificialFrame = null;
        this.getInputFormats = null;
        this._CREATION = null;
        this.Camera2StreamConfigurationMap = com.daon.dmds.models.DMDSLifecycleState.DESTROYED;
        this.d = false;
        this.CoroutineDebuggingKt = false;
        this.getValidOutputFormatsForInputhNQ4ISI = false;
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.getOutputStallDurationlomOqCM = null;
        this.getOutputStallDuration = null;
        this.getHighSpeedVideoFpsRanges = new java.util.ArrayList();
        this.coroutineCreation = java.lang.System.currentTimeMillis();
        this.getOutputMinFrameDuration = false;
        this.idBarcodeScanListener = new com.daon.dmds.recognizers.IBarcodeScan() { // from class: com.daon.dmds.views.DMDSScanView$$ExternalSyntheticLambda11
            @Override // com.daon.dmds.recognizers.IBarcodeScan
            public final void onBarcodeScanningStarted() {
                final com.daon.dmds.views.DMDSScanView dMDSScanView = com.daon.dmds.views.DMDSScanView.this;
                if (dMDSScanView.isOutputSupportedFor == null) {
                    dMDSScanView.isOutputSupportedFor = new android.os.Handler(android.os.Looper.getMainLooper());
                }
                dMDSScanView.isOutputSupportedFor.post(new java.lang.Runnable() { // from class: com.daon.dmds.views.DMDSScanView$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.daon.dmds.views.DMDSScanView dMDSScanView2 = com.daon.dmds.views.DMDSScanView.this;
                        if (dMDSScanView2.getInputFormats != null) {
                            com.daon.dmds.utils.DobsLogUtils.logDebug(com.daon.dmds.views.DMDSScanView.getHighSpeedVideoSizes, "idBarcodeScanListener: ");
                            dMDSScanView2.getInputFormats.barcodeScanningStarted();
                        }
                    }
                });
            }
        };
        this.coroutineBoundary = new java.lang.Runnable() { // from class: com.daon.dmds.views.DMDSScanView$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                com.daon.dmds.views.DMDSScanView dMDSScanView = com.daon.dmds.views.DMDSScanView.this;
                java.lang.String str = com.daon.dmds.views.DMDSScanView.getHighSpeedVideoSizes;
                com.daon.dmds.utils.DobsLogUtils.logDebug(str, "docRecognizerRun: ");
                if (com.daon.dmds.utils.DMDSDocumentUtils.ignoreFallbackToEdgeDetection(dMDSScanView.getOutputSizes) || !dMDSScanView.getOutputSizes.isFallbackToEdgeDetection() || !dMDSScanView.getOutputSizes.noEdgeDetectionInRequests() || dMDSScanView.isOutputSupportedForhNQ4ISI == null) {
                    dMDSScanView.getHighResolutionOutputSizeshNQ4ISI();
                    return;
                }
                com.daon.dmds.utils.DobsLogUtils.logDebug(str, "Fallback to edge detection");
                com.daon.dmds.managers.DMDSCustomScanListener dMDSCustomScanListener = dMDSScanView.getInputFormats;
                if (dMDSCustomScanListener != null) {
                    dMDSCustomScanListener.fallingBackToEdgeDetection();
                }
                com.daon.dmds.models.DMDSOptions fallbackOptions = com.daon.dmds.utils.DMDSDocumentUtils.getFallbackOptions(dMDSScanView.getOutputSizes);
                dMDSScanView.getHighSpeedVideoSizesFor = fallbackOptions;
                dMDSScanView.getHighSpeedVideoFpsRangesFor = com.daon.dmds.recognizers.DMDSDocumentFactory.getDocument(fallbackOptions.getDocumentTypes());
                try {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Fallback to: ");
                    sb.append(dMDSScanView.getHighSpeedVideoFpsRangesFor.toString());
                    com.daon.dmds.utils.DobsLogUtils.logError(str, sb.toString());
                    dMDSScanView.isOutputSupportedForhNQ4ISI.reconfigureRecognizers(dMDSScanView.getHighSpeedVideoFpsRangesFor.buildRecognizerBundle(dMDSScanView.getHighSpeedVideoSizesFor));
                } catch (com.microblink.blinkid.licence.exception.InvalidLicenceKeyException e) {
                    com.daon.dmds.utils.DobsLogUtils.getStackTrace(e);
                    dMDSScanView.getHighSpeedVideoFpsRangesFor = com.daon.dmds.recognizers.DMDSDocumentFactory.getDocument(com.daon.dmds.models.DocTypeEnum.None);
                    java.lang.String str2 = com.daon.dmds.views.DMDSScanView.getHighSpeedVideoSizes;
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Fallback catch: ");
                    sb2.append(dMDSScanView.getHighSpeedVideoFpsRangesFor.toString());
                    com.daon.dmds.utils.DobsLogUtils.logError(str2, sb2.toString());
                    try {
                        dMDSScanView.isOutputSupportedForhNQ4ISI.reconfigureRecognizers(dMDSScanView.getHighSpeedVideoFpsRangesFor.buildRecognizerBundle(dMDSScanView.getHighSpeedVideoSizesFor));
                    } catch (java.lang.Exception e2) {
                        dMDSScanView.getHighSpeedVideoSizes(e2);
                    }
                } catch (java.lang.Exception e3) {
                    dMDSScanView.getHighSpeedVideoSizes(e3);
                }
                com.daon.dmds.utils.DobsLogUtils.logDebug(com.daon.dmds.views.DMDSScanView.getHighSpeedVideoSizes, "startFallbackToEdgeDetectionTimer: ");
                dMDSScanView.getOutputMinFrameDurationlomOqCM = true;
                dMDSScanView.getOutputSizeshNQ4ISI = false;
                dMDSScanView.getHighSpeedVideoFpsRangesFor();
                if (dMDSScanView.toString == null) {
                    dMDSScanView.toString = new android.os.Handler(android.os.Looper.getMainLooper());
                }
                dMDSScanView.toString.postDelayed(dMDSScanView.getInputSizeshNQ4ISI, dMDSScanView.getHighSpeedVideoSizesFor.getFallbackToEdgeDetectionDuration() * 1000);
            }
        };
        this.getInputSizeshNQ4ISI = new java.lang.Runnable() { // from class: com.daon.dmds.views.DMDSScanView$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                com.daon.dmds.views.DMDSScanView.this.getHighResolutionOutputSizeshNQ4ISI();
            }
        };
    }

    static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(com.daon.dmds.managers.DMDSFlashStateChangeListener dMDSFlashStateChangeListener, boolean z) {
        if (dMDSFlashStateChangeListener != null) {
            dMDSFlashStateChangeListener.onOperationDone(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getHighResolutionOutputSizeshNQ4ISI(com.daon.dmds.models.ResponseData responseData) {
        java.lang.String str = getHighSpeedVideoSizes;
        com.daon.dmds.utils.DobsLogUtils.logDebug(str, "lookForAnotherDetection: ".concat(java.lang.String.valueOf(responseData)));
        if (this.getOutputSizeshNQ4ISI) {
            this.AMEXKernel = com.daon.dmds.utils.DMDSDocumentUtils.processSecondStageResults(this.AMEXKernel, responseData);
        } else {
            this.getOutputSizeshNQ4ISI = true;
            this.AMEXKernel = responseData;
            com.daon.dmds.models.DocTypeEnum isSecondRecognitionRequired = com.daon.dmds.utils.DMDSDocumentUtils.isSecondRecognitionRequired(com.daon.dmds.utils.DMDSDocumentUtils.getEnumFromName(responseData.getResult().getDocument().getDocumentType()));
            if (isSecondRecognitionRequired != com.daon.dmds.models.DocTypeEnum.None) {
                com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView = this.isOutputSupportedForhNQ4ISI;
                if (recognizerRunnerView == null || this.getOutputSizes == null) {
                    return;
                }
                if (recognizerRunnerView.getCameraViewState() == com.microblink.blinkid.view.BaseCameraView.CameraViewState.DESTROYED || this.isOutputSupportedForhNQ4ISI.getCameraViewState() == com.microblink.blinkid.view.BaseCameraView.CameraViewState.CREATED) {
                    getHighSpeedVideoFpsRangesFor(com.daon.dmds.models.DMDSError.errorForCode(getContext(), com.daon.dmds.models.DMDSErrorCode.DMDSErrorCodeDocumentNotFound));
                    return;
                }
                this.getOutputSizes.getUiOptions().setAllowManualCroppingEdgeDetection(this.getOutputSizes.getUiOptions().isAllowManualCroppingDocumentRecognition());
                this.getHighSpeedVideoFpsRangesFor = com.daon.dmds.recognizers.DMDSDocumentFactory.getDocument(isSecondRecognitionRequired);
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Second recognition with: ");
                sb.append(this.getHighSpeedVideoFpsRangesFor);
                com.daon.dmds.utils.DobsLogUtils.logError(str, sb.toString());
                try {
                    this.isOutputSupportedForhNQ4ISI.reconfigureRecognizers(this.getHighSpeedVideoFpsRangesFor.buildRecognizerBundle(this.getOutputSizes));
                    this.isOutputSupportedForhNQ4ISI.resumeScanning(true);
                    return;
                } catch (java.lang.Exception e) {
                    getHighSpeedVideoSizes(e);
                    return;
                }
            }
        }
        if (this.AMEXKernel.getResult().getDocument().getProcessedBackImage() != null) {
            this.AMEXKernel.getResult().getDocument().setProcessedDocumentCoordinates(this.getOutputStallDuration);
            this.AMEXKernel.getResult().getDocument().setProcessedBackDocumentCoordinates(com.daon.dmds.utils.DMDSPointParser.rotatePoints(this.unwrapAs, com.daon.dmds.utils.MBUtils.getOrientation(getContext()), this.AMEXKernel.getResult().getDocument().getUnprocessedBackImage().getWidth(), this.AMEXKernel.getResult().getDocument().getUnprocessedBackImage().getHeight()));
        } else {
            this.AMEXKernel.getResult().getDocument().setProcessedDocumentCoordinates(com.daon.dmds.utils.DMDSPointParser.rotatePoints(this.unwrapAs, com.daon.dmds.utils.MBUtils.getOrientation(getContext()), this.AMEXKernel.getResult().getDocument().getUnprocessedImage().getWidth(), this.AMEXKernel.getResult().getDocument().getUnprocessedImage().getHeight()));
        }
        getInputSizeshNQ4ISI();
    }

    private void getHighSpeedVideoFpsRanges(android.graphics.Bitmap bitmap, final com.daon.dmds.models.DMDSDocument dMDSDocument) {
        com.daon.dmds.utils.face.FaceFinder highSpeedVideoSizesFor = getHighSpeedVideoSizesFor();
        com.daon.dmds.models.DMDSOptions dMDSOptions = this.getHighSpeedVideoSizesFor;
        if (dMDSOptions == null) {
            dMDSOptions = this.getOutputSizes;
        }
        highSpeedVideoSizesFor.findBestFace(bitmap, dMDSOptions, dMDSDocument.getTextExtracted().get(com.daon.dmds.recognizers.IDMDSResultCreatorFields.ClassTypeName), new com.daon.dmds.utils.face.FaceResultListener() { // from class: com.daon.dmds.views.DMDSScanView.6
            @Override // com.daon.dmds.utils.face.FaceResultListener
            public void onFailure(com.daon.dmds.models.DMDSFaceQualityInfo dMDSFaceQualityInfo) {
                com.daon.dmds.views.DMDSScanView.getHighResolutionOutputSizeshNQ4ISI(com.daon.dmds.views.DMDSScanView.this, dMDSFaceQualityInfo);
                com.daon.dmds.views.DMDSScanView.this.getHighSpeedVideoFpsRanges.add(dMDSFaceQualityInfo.getAnalyzeStatus());
                com.daon.dmds.utils.DobsLogUtils.logError(com.daon.dmds.views.DMDSScanView.getHighSpeedVideoSizes, "Fail to extract face, quality info 2: ".concat(java.lang.String.valueOf(dMDSFaceQualityInfo)));
                com.daon.dmds.views.DMDSScanView.this.getOutputFormats = com.daon.dmds.models.DMDSErrorCode.DMDSErrorCodeFaceNotFound;
                com.daon.dmds.views.DMDSScanView.this.isOutputSupportedForhNQ4ISI.resumeScanning(com.daon.dmds.utils.DMDSDocumentUtils.extractDocumentType(com.daon.dmds.views.DMDSScanView.this.getOutputSizes.getDocumentTypes()) == com.daon.dmds.models.DocTypeEnum.IdDocumentCombined);
            }

            @Override // com.daon.dmds.utils.face.FaceResultListener
            public void onSuccess(com.daon.dmds.models.DMDSFace dMDSFace) {
                com.daon.dmds.views.DMDSScanView.getOutputFormats(com.daon.dmds.views.DMDSScanView.this);
                com.daon.dmds.views.DMDSScanView.this.getHighSpeedVideoSizes(dMDSDocument);
                com.daon.dmds.views.DMDSScanView.this.getOutputMinFrameDuration();
                com.daon.dmds.views.DMDSScanView.this._CREATION = dMDSFace;
            }
        });
    }

    private void getHighSpeedVideoFpsRangesFor(com.daon.dmds.models.DMDSError dMDSError) {
        java.lang.String str = getHighSpeedVideoSizes;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("notifyScanFailed() -> error: ");
        sb.append(dMDSError.description);
        com.daon.dmds.utils.DobsLogUtils.logError(str, sb.toString());
        com.daon.dmds.models.DMDSLifecycleState dMDSLifecycleState = this.Camera2StreamConfigurationMap;
        if (dMDSLifecycleState == com.daon.dmds.models.DMDSLifecycleState.PAUSED || dMDSLifecycleState == com.daon.dmds.models.DMDSLifecycleState.STOPPED || dMDSLifecycleState == com.daon.dmds.models.DMDSLifecycleState.DESTROYED) {
            return;
        }
        getInputFormats();
        com.daon.dmds.managers.DMDSCustomScanListener dMDSCustomScanListener = this.getInputFormats;
        if (dMDSCustomScanListener != null) {
            dMDSCustomScanListener.documentScannedFailed(dMDSError, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getHighSpeedVideoSizes(final com.daon.dmds.models.DMDSDocument dMDSDocument) {
        com.daon.dmds.utils.DobsLogUtils.logDebug(getHighSpeedVideoSizes, "notifyFirstSideScanned: ".concat(java.lang.String.valueOf(dMDSDocument)));
        com.daon.dmds.models.DMDSLifecycleState dMDSLifecycleState = this.Camera2StreamConfigurationMap;
        if (dMDSLifecycleState == com.daon.dmds.models.DMDSLifecycleState.PAUSED || dMDSLifecycleState == com.daon.dmds.models.DMDSLifecycleState.STOPPED || dMDSLifecycleState == com.daon.dmds.models.DMDSLifecycleState.DESTROYED || this.getInputFormats == null) {
            return;
        }
        if (this.isOutputSupportedFor == null) {
            this.isOutputSupportedFor = new android.os.Handler(android.os.Looper.getMainLooper());
        }
        this.isOutputSupportedFor.post(new java.lang.Runnable() { // from class: com.daon.dmds.views.DMDSScanView$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.daon.dmds.views.DMDSScanView.this.getInputFormats.firstSideRecognitionFinished(dMDSDocument.getRecognitionMode());
            }
        });
    }

    private void getHighSpeedVideoSizes(final com.daon.dmds.models.DMDSResult dMDSResult) {
        java.lang.String str = getHighSpeedVideoSizes;
        com.daon.dmds.utils.DobsLogUtils.logDebug(str, "notifyScanSucceed: ".concat(java.lang.String.valueOf(dMDSResult)));
        if (this.getValidOutputFormatsForInputhNQ4ISI) {
            com.daon.dmds.utils.DobsLogUtils.logError(str, "Ignore success results due to timeout");
            return;
        }
        com.daon.dmds.models.DMDSLifecycleState dMDSLifecycleState = this.Camera2StreamConfigurationMap;
        if (dMDSLifecycleState == com.daon.dmds.models.DMDSLifecycleState.PAUSED || dMDSLifecycleState == com.daon.dmds.models.DMDSLifecycleState.STOPPED || dMDSLifecycleState == com.daon.dmds.models.DMDSLifecycleState.DESTROYED) {
            return;
        }
        if (com.daon.dmds.utils.DMDSDocumentUtils.isUiThread()) {
            com.daon.dmds.managers.DMDSCustomScanListener dMDSCustomScanListener = this.getInputFormats;
            if (dMDSCustomScanListener != null) {
                dMDSCustomScanListener.documentScanned(dMDSResult);
                return;
            }
            return;
        }
        if (this.getInputFormats != null) {
            if (this.isOutputSupportedFor == null) {
                this.isOutputSupportedFor = new android.os.Handler(android.os.Looper.getMainLooper());
            }
            this.isOutputSupportedFor.post(new java.lang.Runnable() { // from class: com.daon.dmds.views.DMDSScanView$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    com.daon.dmds.views.DMDSScanView dMDSScanView = com.daon.dmds.views.DMDSScanView.this;
                    dMDSScanView.getInputFormats.documentScanned(dMDSResult);
                }
            });
        }
    }

    private com.daon.dmds.utils.face.FaceFinder getHighSpeedVideoSizesFor() {
        if (ArtificialStackFrames == null) {
            try {
                ArtificialStackFrames = new com.daon.dmds.utils.face.FaceFinderImpl(getContext(), this.getOutputSizes.getFaceLicenceKey());
            } catch (java.lang.Exception e) {
                this.accessartificialFrame.documentScannedFailed(new com.daon.dmds.models.DMDSError(e.getLocalizedMessage(), com.daon.dmds.models.DMDSErrorCode.DMDSErrorCodeLicenseNotValid), null);
            }
        }
        return ArtificialStackFrames;
    }

    private void getInputFormats() {
        com.daon.dmds.models.ResponseData responseData = this.AMEXKernel;
        if (responseData != null && responseData.getResult() != null) {
            this.AMEXKernel.getResult().clearAllData();
        }
        this.AMEXKernel = null;
        this.getHighSpeedVideoSizesFor = null;
    }

    private void getInputSizeshNQ4ISI() {
        com.daon.dmds.utils.DobsLogUtils.logDebug(getHighSpeedVideoSizes, "continueWithProcessing: ");
        this.d = false;
        if (!this.getOutputSizes.isFaceDetection() || this._CREATION != null) {
            if (this._CREATION != null) {
                this.AMEXKernel.getResult().setFace(this._CREATION);
            }
            getOutputFormats();
            return;
        }
        android.graphics.Bitmap documentImageForFaceExtraction = com.daon.dmds.utils.DMDSDocumentUtils.getDocumentImageForFaceExtraction(this.AMEXKernel, this.getHighSpeedVideoFpsRangesFor);
        if (documentImageForFaceExtraction == null) {
            getOutputFormats();
            return;
        }
        com.daon.dmds.utils.face.FaceFinder highSpeedVideoSizesFor = getHighSpeedVideoSizesFor();
        com.daon.dmds.models.DMDSOptions dMDSOptions = this.getHighSpeedVideoSizesFor;
        if (dMDSOptions == null) {
            dMDSOptions = this.getOutputSizes;
        }
        highSpeedVideoSizesFor.findBestFace(documentImageForFaceExtraction, dMDSOptions, this.AMEXKernel.getResult().getDocument().getTextExtracted().get(com.daon.dmds.recognizers.IDMDSResultCreatorFields.ClassTypeName), new com.daon.dmds.utils.face.FaceResultListener() { // from class: com.daon.dmds.views.DMDSScanView.2
            @Override // com.daon.dmds.utils.face.FaceResultListener
            public void onFailure(com.daon.dmds.models.DMDSFaceQualityInfo dMDSFaceQualityInfo) {
                com.daon.dmds.views.DMDSScanView.getHighResolutionOutputSizeshNQ4ISI(com.daon.dmds.views.DMDSScanView.this, dMDSFaceQualityInfo);
                com.daon.dmds.views.DMDSScanView.this.getHighSpeedVideoFpsRanges(dMDSFaceQualityInfo.getAnalyzeStatus());
                com.daon.dmds.utils.DobsLogUtils.logError(com.daon.dmds.views.DMDSScanView.getHighSpeedVideoSizes, "Fail to extract face, quality info: ".concat(java.lang.String.valueOf(dMDSFaceQualityInfo)));
                com.daon.dmds.views.DMDSScanView.this.getOutputFormats = com.daon.dmds.models.DMDSErrorCode.DMDSErrorCodeFaceNotFound;
                com.daon.dmds.views.DMDSScanView dMDSScanView = com.daon.dmds.views.DMDSScanView.this;
                dMDSScanView.resumeScanning(com.daon.dmds.utils.DMDSDocumentUtils.extractDocumentType(dMDSScanView.getOutputSizes.getDocumentTypes()) == com.daon.dmds.models.DocTypeEnum.IdDocumentCombined);
                com.daon.dmds.views.DMDSScanView.getOutputSizeshNQ4ISI(com.daon.dmds.views.DMDSScanView.this);
            }

            @Override // com.daon.dmds.utils.face.FaceResultListener
            public void onSuccess(com.daon.dmds.models.DMDSFace dMDSFace) {
                if ((com.daon.dmds.views.DMDSScanView.this.getOutputMinFrameDurationlomOqCM && com.daon.dmds.views.DMDSScanView.this.AMEXKernel.getResult().getDocument().getTextExtracted() != null && !com.daon.dmds.views.DMDSScanView.this.AMEXKernel.getResult().getDocument().getTextExtracted().isEmpty()) || com.daon.dmds.views.DMDSScanView.this.AMEXKernel == null) {
                    com.daon.dmds.utils.DobsLogUtils.logDebug(com.daon.dmds.views.DMDSScanView.getHighSpeedVideoSizes, "Skip face sdk results, stale results");
                    if (com.daon.dmds.views.DMDSScanView.this.getValidOutputFormatsForInputhNQ4ISI) {
                        return;
                    }
                    com.daon.dmds.views.DMDSScanView.this.resumeScanning(false);
                    return;
                }
                if (com.daon.dmds.utils.DMDSDocumentUtils.isDocTypeFromEdgeGroup(com.daon.dmds.views.DMDSScanView.this.AMEXKernel.getResult().getDocument().getDocumentType()) && dMDSFace.getQualityData().getFaceRotation() != 0) {
                    com.daon.dmds.views.DMDSScanView.this.AMEXKernel.getResult().getDocument().setProcessedImage(com.daon.dmds.utils.DMDSDocumentUtils.rotateImage(com.daon.dmds.views.DMDSScanView.this.AMEXKernel.getResult().getDocument().getProcessedImage(), dMDSFace.getQualityData().getFaceRotation()));
                }
                com.daon.dmds.views.DMDSScanView.this._CREATION = dMDSFace;
                com.daon.dmds.views.DMDSScanView.this.AMEXKernel.getResult().setFace(dMDSFace);
                com.daon.dmds.views.DMDSScanView.this.getOutputFormats();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getOutputFormats() {
        java.lang.String str = getHighSpeedVideoSizes;
        com.daon.dmds.utils.DobsLogUtils.logDebug(str, "resultPostProcessing: ");
        com.daon.dmds.models.DMDSResult result = this.AMEXKernel.getResult();
        if (this.getOutputSizes.isQualityFilterEnabled()) {
            com.daon.dmds.models.DMDSIDCaptureResult dMDSIDCaptureResult = this.kernelVersion;
            if (dMDSIDCaptureResult != null && dMDSIDCaptureResult.hasResult()) {
                result.getDocument().setFrontQualityImage(this.kernelVersion.getQualityImage());
                result.getDocument().setQualityData(com.daon.dmds.utils.DMDSDocumentUtils.populateQualityData(this.kernelVersion.getQualityResult()));
            }
            com.daon.dmds.models.DMDSIDCaptureResult dMDSIDCaptureResult2 = this.c;
            if (dMDSIDCaptureResult2 != null && dMDSIDCaptureResult2.hasResult()) {
                result.getDocument().setBackQualityImage(this.c.getQualityImage());
                result.getDocument().setQualityDataBack(com.daon.dmds.utils.DMDSDocumentUtils.populateQualityData(this.c.getQualityResult()));
            }
        }
        com.daon.dmds.utils.DobsLogUtils.logDebug(str, "stopDocRecognizerTimer: ");
        if (this.getARTIFICIAL_FRAME_PACKAGE_NAME == null) {
            this.getARTIFICIAL_FRAME_PACKAGE_NAME = new android.os.Handler(android.os.Looper.getMainLooper());
        }
        this.getARTIFICIAL_FRAME_PACKAGE_NAME.removeCallbacks(this.coroutineBoundary);
        com.daon.dmds.utils.DobsLogUtils.logDebug(str, "stopEdgeDetectionTimer: ");
        if (this.toString == null) {
            this.toString = new android.os.Handler(android.os.Looper.getMainLooper());
        }
        this.toString.removeCallbacks(this.getInputSizeshNQ4ISI);
        if (result != null) {
            com.daon.dmds.utils.DMDSDocumentUtils.padProcessedBitmap(result, this.getOutputSizes);
        }
        if (this._BOUNDARY == com.daon.dmds.models.DMDSDocumentCaptureType.DMDSDocumentCaptureTypeUnknown) {
            if (this.b) {
                this._BOUNDARY = com.daon.dmds.models.DMDSDocumentCaptureType.DMDSDocumentCaptureTypeEdgeDetection;
            } else if (this.getOutputMinFrameDurationlomOqCM) {
                this._BOUNDARY = com.daon.dmds.models.DMDSDocumentCaptureType.DMDSDocumentCaptureTypeFallBackEdgeDetection;
            } else {
                this._BOUNDARY = com.daon.dmds.models.DMDSDocumentCaptureType.DMDSDocumentCaptureTypeDocumentRecognition;
            }
        }
        if (result != null) {
            result.getDocument().setDocumentCaptureType(this._BOUNDARY);
        }
        getHighSpeedVideoSizes(this.AMEXKernel.getResult());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getOutputMinFrameDuration() {
        java.lang.String str = getHighSpeedVideoSizes;
        com.daon.dmds.utils.DobsLogUtils.logDebug(str, "startDocRecognizerTimer: ");
        this.d = true;
        com.daon.dmds.utils.DobsLogUtils.logDebug(str, "stopDocRecognizerTimer: ");
        if (this.getARTIFICIAL_FRAME_PACKAGE_NAME == null) {
            this.getARTIFICIAL_FRAME_PACKAGE_NAME = new android.os.Handler(android.os.Looper.getMainLooper());
        }
        this.getARTIFICIAL_FRAME_PACKAGE_NAME.removeCallbacks(this.coroutineBoundary);
        if (this.getARTIFICIAL_FRAME_PACKAGE_NAME == null) {
            this.getARTIFICIAL_FRAME_PACKAGE_NAME = new android.os.Handler(android.os.Looper.getMainLooper());
        }
        this.getARTIFICIAL_FRAME_PACKAGE_NAME.postDelayed(this.coroutineBoundary, this.getOutputSizes.getScanningDuration() * 1000);
    }

    private void getOutputSizes() {
        com.daon.dmds.utils.DobsLogUtils.logDebug(getHighSpeedVideoSizes, "stopDocRecognizerTimer: ");
        if (this.getARTIFICIAL_FRAME_PACKAGE_NAME == null) {
            this.getARTIFICIAL_FRAME_PACKAGE_NAME = new android.os.Handler(android.os.Looper.getMainLooper());
        }
        this.getARTIFICIAL_FRAME_PACKAGE_NAME.removeCallbacks(this.coroutineBoundary);
    }

    static /* synthetic */ com.daon.dmds.models.ResponseData getOutputSizeshNQ4ISI(com.daon.dmds.views.DMDSScanView dMDSScanView) {
        dMDSScanView.AMEXKernel = null;
        return null;
    }

    final void Camera2StreamConfigurationMap() {
        com.daon.dmds.utils.DobsLogUtils.logDebug(getHighSpeedVideoSizes, "setInitState: ");
        this._BOUNDARY = com.daon.dmds.models.DMDSDocumentCaptureType.DMDSDocumentCaptureTypeUnknown;
        this.b = com.daon.dmds.utils.DMDSDocumentUtils.listContainsEdgeDetection(this.getOutputSizes.getDocumentTypes());
        this.getOutputFormats = com.daon.dmds.models.DMDSErrorCode.DMDSErrorCodeDocumentNotFound;
        this.getValidOutputFormatsForInputhNQ4ISI = false;
        this.getOutputMinFrameDuration = false;
        this.getOutputMinFrameDurationlomOqCM = false;
        this.getOutputSizeshNQ4ISI = false;
        this.d = false;
        this.AMEXKernel = null;
    }

    public void addChildView(android.view.View view, boolean z) {
        com.daon.dmds.utils.DobsLogUtils.logDebug(getHighSpeedVideoSizes, "addChildView() -> rotatable: ".concat(java.lang.String.valueOf(z)));
        com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView = this.isOutputSupportedForhNQ4ISI;
        if (recognizerRunnerView != null) {
            recognizerRunnerView.addChildView(view, z);
        }
    }

    public void addMetadataProvider(com.daon.dmds.managers.DMDSMetadataProvider dMDSMetadataProvider) {
        com.daon.dmds.utils.DobsLogUtils.logDebug(getHighSpeedVideoSizes, "addMetadataProvider: ");
        this.f2844a = dMDSMetadataProvider;
    }

    public void create(com.daon.dmds.models.DMDSOptions dMDSOptions, com.daon.dmds.managers.DMDSDefaultScanListener dMDSDefaultScanListener) {
        com.daon.dmds.utils.DobsLogUtils.logDebug(getHighSpeedVideoSizes, "create (default): ");
        this.Camera2StreamConfigurationMap = com.daon.dmds.models.DMDSLifecycleState.CREATED;
        if (dMDSDefaultScanListener == null) {
            throw new java.lang.IllegalArgumentException("DMDSDefaultScanListener must not be null!");
        }
        this.accessartificialFrame = dMDSDefaultScanListener;
        getHighSpeedVideoSizes(dMDSOptions);
    }

    public void destroy() {
        java.lang.String str = getHighSpeedVideoSizes;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("destroy() -> currentState: ");
        sb.append(this.Camera2StreamConfigurationMap.name());
        com.daon.dmds.utils.DobsLogUtils.logDebug(str, sb.toString());
        this.Camera2StreamConfigurationMap = com.daon.dmds.models.DMDSLifecycleState.DESTROYED;
        com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView = this.isOutputSupportedForhNQ4ISI;
        if (recognizerRunnerView != null) {
            try {
                recognizerRunnerView.destroy();
            } catch (java.lang.IllegalStateException e) {
                com.daon.dmds.utils.DobsLogUtils.getStackTrace(e);
            }
        }
        com.daon.dmds.utils.face.FaceFinder faceFinder = ArtificialStackFrames;
        if (faceFinder != null) {
            faceFinder.clear();
            ArtificialStackFrames = null;
        }
        this.getHighSpeedVideoFpsRangesFor = null;
        getOutputSizes();
        getHighSpeedVideoFpsRangesFor();
        this.coroutineBoundary = null;
        this.getInputSizeshNQ4ISI = null;
        this.accessartificialFrame = null;
        this.getInputFormats = null;
        this.AMEXKernel = null;
        this.kernelVersion = null;
        this.c = null;
        if (this.isOutputSupportedFor == null) {
            this.isOutputSupportedFor = new android.os.Handler(android.os.Looper.getMainLooper());
        }
        this.isOutputSupportedFor.removeCallbacksAndMessages(null);
        if (this.getARTIFICIAL_FRAME_PACKAGE_NAME == null) {
            this.getARTIFICIAL_FRAME_PACKAGE_NAME = new android.os.Handler(android.os.Looper.getMainLooper());
        }
        this.getARTIFICIAL_FRAME_PACKAGE_NAME.removeCallbacksAndMessages(null);
        if (this.toString == null) {
            this.toString = new android.os.Handler(android.os.Looper.getMainLooper());
        }
        this.toString.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void getHighResolutionOutputSizeshNQ4ISI() {
        com.daon.dmds.utils.DobsLogUtils.logVerbose(getHighSpeedVideoSizes, "Scanning timeout!");
        pauseScanning();
        this.getValidOutputFormatsForInputhNQ4ISI = true;
        getInputFormats();
        com.daon.dmds.models.DMDSError errorForCode = com.daon.dmds.models.DMDSError.errorForCode(getContext(), this.getOutputFormats);
        com.daon.dmds.managers.DMDSCustomScanListener dMDSCustomScanListener = this.getInputFormats;
        if (dMDSCustomScanListener != null) {
            dMDSCustomScanListener.detectionTimeOut(errorForCode);
        }
    }

    final com.daon.dmds.utils.idcapture.IdCaptureQualityFilter getHighSpeedVideoFpsRanges() {
        if (this.init == null) {
            try {
                this.init = new com.daon.dmds.utils.idcapture.IdCaptureQualityFilterImpl(getContext());
            } catch (com.daon.idcapture.IDCaptureException e) {
                e.printStackTrace();
                return null;
            }
        }
        return this.init;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void getHighSpeedVideoFpsRanges(final com.daon.dmds.models.DMDSDocumentDetectionStatus dMDSDocumentDetectionStatus) {
        boolean z;
        java.lang.String str = getHighSpeedVideoSizes;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("handleAnalyzeStatus: ");
        sb.append(dMDSDocumentDetectionStatus.name());
        com.daon.dmds.utils.DobsLogUtils.logDebug(str, sb.toString());
        if (!com.daon.dmds.utils.DMDSDocumentUtils.isUiThread()) {
            if (this.getInputFormats != null) {
                if (this.isOutputSupportedFor == null) {
                    this.isOutputSupportedFor = new android.os.Handler(android.os.Looper.getMainLooper());
                }
                this.isOutputSupportedFor.post(new java.lang.Runnable() { // from class: com.daon.dmds.views.DMDSScanView$$ExternalSyntheticLambda15
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z2;
                        com.daon.dmds.views.DMDSScanView dMDSScanView = com.daon.dmds.views.DMDSScanView.this;
                        com.daon.dmds.models.DMDSDocumentDetectionStatus dMDSDocumentDetectionStatus2 = dMDSDocumentDetectionStatus;
                        com.daon.dmds.models.DMDSOptions dMDSOptions = dMDSScanView.getHighSpeedVideoSizesFor;
                        if (dMDSOptions == null) {
                            dMDSOptions = dMDSScanView.getOutputSizes;
                        }
                        boolean isAggregateDetectionStatusUpdates = dMDSOptions.isAggregateDetectionStatusUpdates();
                        com.daon.dmds.managers.DMDSCustomScanListener dMDSCustomScanListener = dMDSScanView.getInputFormats;
                        java.util.List<com.daon.dmds.models.DMDSDocumentDetectionStatus> list = dMDSScanView.getHighSpeedVideoFpsRanges;
                        if (java.lang.System.currentTimeMillis() - dMDSScanView.coroutineCreation > 1000) {
                            dMDSScanView.coroutineCreation = java.lang.System.currentTimeMillis();
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        com.daon.dmds.utils.DMDSDocumentUtils.handleFeedbackMessages(isAggregateDetectionStatusUpdates, dMDSDocumentDetectionStatus2, dMDSCustomScanListener, list, z2);
                    }
                });
                return;
            }
            return;
        }
        if (this.getInputFormats != null) {
            com.daon.dmds.models.DMDSOptions dMDSOptions = this.getHighSpeedVideoSizesFor;
            if (dMDSOptions == null) {
                dMDSOptions = this.getOutputSizes;
            }
            boolean isAggregateDetectionStatusUpdates = dMDSOptions.isAggregateDetectionStatusUpdates();
            com.daon.dmds.managers.DMDSCustomScanListener dMDSCustomScanListener = this.getInputFormats;
            java.util.List<com.daon.dmds.models.DMDSDocumentDetectionStatus> list = this.getHighSpeedVideoFpsRanges;
            if (java.lang.System.currentTimeMillis() - this.coroutineCreation > 1000) {
                this.coroutineCreation = java.lang.System.currentTimeMillis();
                z = true;
            } else {
                z = false;
            }
            com.daon.dmds.utils.DMDSDocumentUtils.handleFeedbackMessages(isAggregateDetectionStatusUpdates, dMDSDocumentDetectionStatus, dMDSCustomScanListener, list, z);
        }
    }

    final void getHighSpeedVideoFpsRangesFor() {
        com.daon.dmds.utils.DobsLogUtils.logDebug(getHighSpeedVideoSizes, "stopEdgeDetectionTimer: ");
        if (this.toString == null) {
            this.toString = new android.os.Handler(android.os.Looper.getMainLooper());
        }
        this.toString.removeCallbacks(this.getInputSizeshNQ4ISI);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void getHighSpeedVideoFpsRangesFor(com.daon.dmds.models.DMDSDocument dMDSDocument) {
        if (this.getOutputSizes.isFaceDetection()) {
            com.daon.dmds.recognizers.DocumentRecognizer documentRecognizer = this.getHighSpeedVideoFpsRangesFor;
            if (documentRecognizer instanceof com.daon.dmds.recognizers.FaceExtractor) {
                getHighSpeedVideoFpsRanges(((com.daon.dmds.recognizers.FaceExtractor) documentRecognizer).getFaceFromRecogniser(), dMDSDocument);
                return;
            }
        }
        com.daon.dmds.utils.DobsLogUtils.logDebug(getHighSpeedVideoSizes, "stopDocRecognizerTimer: ");
        if (this.getARTIFICIAL_FRAME_PACKAGE_NAME == null) {
            this.getARTIFICIAL_FRAME_PACKAGE_NAME = new android.os.Handler(android.os.Looper.getMainLooper());
        }
        this.getARTIFICIAL_FRAME_PACKAGE_NAME.removeCallbacks(this.coroutineBoundary);
        getHighSpeedVideoSizes(dMDSDocument);
        getOutputMinFrameDuration();
    }

    final void getHighSpeedVideoSizes(java.lang.Exception exc) {
        com.daon.dmds.utils.DobsLogUtils.getStackTrace(exc);
        com.daon.dmds.models.DMDSError dMDSError = new com.daon.dmds.models.DMDSError();
        if (exc instanceof com.microblink.blinkid.hardware.camera.AutoFocusRequiredButNotSupportedException) {
            dMDSError = com.daon.dmds.models.DMDSError.errorForCode(getContext(), com.daon.dmds.models.DMDSErrorCode.DMDSErrorCodeAutofocusRequiredButNotSupported);
        } else if (exc instanceof com.microblink.blinkid.licence.exception.InvalidLicenceKeyException) {
            dMDSError = com.daon.dmds.models.DMDSError.errorForCode(getContext(), com.daon.dmds.models.DMDSErrorCode.DMDSErrorCodeLicenseNotValid);
        }
        getHighSpeedVideoFpsRangesFor(dMDSError);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        android.app.Activity activity = com.daon.dmds.utils.DMDSDocumentUtils.getActivity(getContext());
        if (activity != null) {
            activity.registerComponentCallbacks(this);
        }
    }

    @Override // android.view.View, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        com.daon.dmds.utils.DobsLogUtils.logDebug(getHighSpeedVideoSizes, "configurationChanged: ");
        this.isOutputSupportedForhNQ4ISI.changeConfiguration(configuration);
        this.isOutputSupportedForhNQ4ISI.resumeScanning(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        android.app.Activity activity = com.daon.dmds.utils.DMDSDocumentUtils.getActivity(getContext());
        if (activity != null) {
            activity.unregisterComponentCallbacks(this);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        com.daon.dmds.utils.DobsLogUtils.logWarn(getHighSpeedVideoSizes, "onLowMemory: ");
    }

    public void pause() {
        java.lang.String str = getHighSpeedVideoSizes;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("pause() -> currentState: ");
        sb.append(this.Camera2StreamConfigurationMap.name());
        com.daon.dmds.utils.DobsLogUtils.logDebug(str, sb.toString());
        this.Camera2StreamConfigurationMap = com.daon.dmds.models.DMDSLifecycleState.PAUSED;
        com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView = this.isOutputSupportedForhNQ4ISI;
        if (recognizerRunnerView != null) {
            try {
            } catch (java.lang.IllegalStateException e) {
                com.daon.dmds.utils.DobsLogUtils.getStackTrace(e);
            }
            if (recognizerRunnerView.getCameraViewState() != com.microblink.blinkid.view.BaseCameraView.CameraViewState.RESUMED) {
                return;
            }
            this.isOutputSupportedForhNQ4ISI.pause();
            getOutputSizes();
            getHighSpeedVideoFpsRangesFor();
        }
    }

    public void pauseScanning() {
        com.daon.dmds.utils.DobsLogUtils.logDebug(getHighSpeedVideoSizes, "pauseScanning: ");
        com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView = this.isOutputSupportedForhNQ4ISI;
        if (recognizerRunnerView == null || recognizerRunnerView.isScanningPaused()) {
            return;
        }
        getOutputSizes();
        this.isOutputSupportedForhNQ4ISI.pauseScanning();
    }

    public void refocusCamera() {
        com.daon.dmds.utils.DobsLogUtils.logDebug(getHighSpeedVideoSizes, "refocusCamera: ");
        com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView = this.isOutputSupportedForhNQ4ISI;
        if (recognizerRunnerView != null) {
            recognizerRunnerView.focusCamera();
        }
    }

    public void restartScanning() {
        com.daon.dmds.utils.DobsLogUtils.logDebug(getHighSpeedVideoSizes, "restartScanning: ");
        getOutputSizes();
        getHighSpeedVideoFpsRangesFor();
        com.daon.dmds.models.DMDSOptions dMDSOptions = this.getOutputSizes;
        if (dMDSOptions == null || !dMDSOptions.isAutoStartScanningEnabled()) {
            return;
        }
        startScanning();
    }

    public void resume() {
        java.lang.String str = getHighSpeedVideoSizes;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("resume() -> currentState: ");
        sb.append(this.Camera2StreamConfigurationMap.name());
        com.daon.dmds.utils.DobsLogUtils.logDebug(str, sb.toString());
        this.Camera2StreamConfigurationMap = com.daon.dmds.models.DMDSLifecycleState.RESUMED;
        com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView = this.isOutputSupportedForhNQ4ISI;
        if (recognizerRunnerView != null) {
            try {
            } catch (java.lang.IllegalStateException e) {
                com.daon.dmds.utils.DobsLogUtils.getStackTrace(e);
            }
            if (recognizerRunnerView.getCameraViewState() != com.microblink.blinkid.view.BaseCameraView.CameraViewState.STARTED) {
                return;
            }
            this.isOutputSupportedForhNQ4ISI.resume();
            this.isOutputSupportedForhNQ4ISI.resumeScanning(true);
            if (this.d || this.getOutputSizes.isAutoStartScanningEnabled()) {
                getOutputMinFrameDuration();
            }
        }
    }

    public void resumeScanning(final boolean z) {
        java.lang.String str = getHighSpeedVideoSizes;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("resumeScanning() -> resetState: ");
        sb.append(z);
        sb.append("  currentState: ");
        sb.append(this.Camera2StreamConfigurationMap.name());
        com.daon.dmds.utils.DobsLogUtils.logDebug(str, sb.toString());
        com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView = this.isOutputSupportedForhNQ4ISI;
        if (recognizerRunnerView == null || !recognizerRunnerView.isScanningPaused() || this.getValidOutputFormatsForInputhNQ4ISI) {
            return;
        }
        com.daon.dmds.models.DMDSLifecycleState dMDSLifecycleState = this.Camera2StreamConfigurationMap;
        boolean z2 = (dMDSLifecycleState == com.daon.dmds.models.DMDSLifecycleState.STOPPED || dMDSLifecycleState == com.daon.dmds.models.DMDSLifecycleState.PAUSED || dMDSLifecycleState == com.daon.dmds.models.DMDSLifecycleState.DESTROYED) ? false : true;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("isValidScanningState() --> current state: ");
        sb2.append(this.Camera2StreamConfigurationMap);
        sb2.append(" isValid: ");
        sb2.append(z2);
        com.daon.dmds.utils.DobsLogUtils.logDebug(str, sb2.toString());
        if (z2) {
            if (this.isOutputSupportedFor == null) {
                this.isOutputSupportedFor = new android.os.Handler(android.os.Looper.getMainLooper());
            }
            this.isOutputSupportedFor.post(new java.lang.Runnable() { // from class: com.daon.dmds.views.DMDSScanView$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    com.daon.dmds.views.DMDSScanView dMDSScanView = com.daon.dmds.views.DMDSScanView.this;
                    boolean z3 = z;
                    if (z3) {
                        dMDSScanView.Camera2StreamConfigurationMap();
                        java.lang.String str2 = com.daon.dmds.views.DMDSScanView.getHighSpeedVideoSizes;
                        com.daon.dmds.utils.DobsLogUtils.logError(str2, java.util.Arrays.toString(java.lang.Thread.currentThread().getStackTrace()));
                        dMDSScanView.getHighSpeedVideoFpsRangesFor = com.daon.dmds.recognizers.DMDSDocumentFactory.getDocument(dMDSScanView.getOutputSizes.getDocumentTypes());
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Resume scan with: ");
                        sb3.append(dMDSScanView.getHighSpeedVideoFpsRangesFor);
                        com.daon.dmds.utils.DobsLogUtils.logError(str2, sb3.toString());
                        try {
                            dMDSScanView.isOutputSupportedForhNQ4ISI.reconfigureRecognizers(dMDSScanView.getHighSpeedVideoFpsRangesFor.buildRecognizerBundle(dMDSScanView.getOutputSizes));
                        } catch (java.lang.Exception e) {
                            dMDSScanView.getHighSpeedVideoSizes(e);
                        }
                    }
                    dMDSScanView.isOutputSupportedForhNQ4ISI.resumeScanning(z3);
                }
            });
            if (this.getARTIFICIAL_FRAME_PACKAGE_NAME == null) {
                this.getARTIFICIAL_FRAME_PACKAGE_NAME = new android.os.Handler(android.os.Looper.getMainLooper());
            }
            if (androidx.core.os.HandlerCompat.hasCallbacks(this.getARTIFICIAL_FRAME_PACKAGE_NAME, this.coroutineBoundary)) {
                return;
            }
            getOutputMinFrameDuration();
        }
    }

    public void setFlashState(boolean z, final com.daon.dmds.managers.DMDSFlashStateChangeListener dMDSFlashStateChangeListener) {
        com.daon.dmds.utils.DobsLogUtils.logDebug(getHighSpeedVideoSizes, "setFlashState: ".concat(java.lang.String.valueOf(z)));
        com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView = this.isOutputSupportedForhNQ4ISI;
        if (recognizerRunnerView != null) {
            recognizerRunnerView.setTorchState(z, new com.microblink.blinkid.hardware.SuccessCallback() { // from class: com.daon.dmds.views.DMDSScanView$$ExternalSyntheticLambda14
                @Override // com.microblink.blinkid.hardware.SuccessCallback
                public final void onOperationDone(boolean z2) {
                    com.daon.dmds.views.DMDSScanView.getHighResolutionOutputSizeshNQ4ISI(com.daon.dmds.managers.DMDSFlashStateChangeListener.this, z2);
                }
            });
        }
    }

    public void setScanningRegion(com.daon.dmds.models.DMDSRect dMDSRect, boolean z) {
        java.lang.String str = getHighSpeedVideoSizes;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("setScanningRegion() -> rect: ");
        sb.append(dMDSRect);
        sb.append(" autoRotate: ");
        sb.append(z);
        com.daon.dmds.utils.DobsLogUtils.logDebug(str, sb.toString());
        if (dMDSRect == null) {
            com.daon.dmds.utils.DobsLogUtils.logError(str, "Rect value can't be null");
            return;
        }
        if (!com.daon.dmds.utils.DMDSValidator.isRectValid(dMDSRect)) {
            com.daon.dmds.utils.DobsLogUtils.logError(str, "Invalid rect dimension");
            return;
        }
        com.microblink.blinkid.geometry.Rectangle rectangle = new com.microblink.blinkid.geometry.Rectangle(dMDSRect.getLeft(), dMDSRect.getTop(), dMDSRect.getWidth(), dMDSRect.getHeight());
        if (!rectangle.isRelative()) {
            com.daon.dmds.utils.DobsLogUtils.logError(str, "Rect is not relative");
            return;
        }
        this.getHighResolutionOutputSizeshNQ4ISI = rectangle;
        this.CoroutineDebuggingKt = z;
        com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView = this.isOutputSupportedForhNQ4ISI;
        if (recognizerRunnerView != null) {
            recognizerRunnerView.setScanningRegion(rectangle, z);
        }
    }

    public void start() {
        java.lang.String str = getHighSpeedVideoSizes;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("start() -> currentState: ");
        sb.append(this.Camera2StreamConfigurationMap.name());
        com.daon.dmds.utils.DobsLogUtils.logDebug(str, sb.toString());
        this.Camera2StreamConfigurationMap = com.daon.dmds.models.DMDSLifecycleState.STARTED;
        com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView = this.isOutputSupportedForhNQ4ISI;
        if (recognizerRunnerView == null) {
            return;
        }
        try {
            recognizerRunnerView.start();
        } catch (java.lang.IllegalStateException e) {
            com.daon.dmds.utils.DobsLogUtils.getStackTrace(e);
        }
    }

    public boolean startScanning() {
        java.lang.String str = getHighSpeedVideoSizes;
        com.daon.dmds.utils.DobsLogUtils.logDebug(str, "startScanning: ");
        com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView = this.isOutputSupportedForhNQ4ISI;
        if (recognizerRunnerView != null && this.getOutputSizes != null && recognizerRunnerView.getCameraViewState() != com.microblink.blinkid.view.BaseCameraView.CameraViewState.DESTROYED && this.isOutputSupportedForhNQ4ISI.getCameraViewState() != com.microblink.blinkid.view.BaseCameraView.CameraViewState.CREATED) {
            Camera2StreamConfigurationMap();
            com.daon.dmds.recognizers.DocumentRecognizer document = com.daon.dmds.recognizers.DMDSDocumentFactory.getDocument(this.getOutputSizes.getDocumentTypes());
            this.getHighSpeedVideoFpsRangesFor = document;
            if (document instanceof com.daon.dmds.recognizers.IIdDocument) {
                ((com.daon.dmds.recognizers.IIdDocument) document).registerBarcodeScanCallback(this.idBarcodeScanListener);
            }
            try {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Start scan with: ");
                sb.append(this.getHighSpeedVideoFpsRangesFor.toString());
                com.daon.dmds.utils.DobsLogUtils.logError(str, sb.toString());
                this.isOutputSupportedForhNQ4ISI.reconfigureRecognizers(this.getHighSpeedVideoFpsRangesFor.buildRecognizerBundle(this.getOutputSizes));
                this.isOutputSupportedForhNQ4ISI.resumeScanning(true);
                getOutputMinFrameDuration();
                return true;
            } catch (java.lang.Exception e) {
                getHighSpeedVideoSizes(e);
            }
        }
        return false;
    }

    public void stop() {
        java.lang.String str = getHighSpeedVideoSizes;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("stop() -> currentState: ");
        sb.append(this.Camera2StreamConfigurationMap.name());
        com.daon.dmds.utils.DobsLogUtils.logDebug(str, sb.toString());
        this.Camera2StreamConfigurationMap = com.daon.dmds.models.DMDSLifecycleState.STOPPED;
        com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView = this.isOutputSupportedForhNQ4ISI;
        if (recognizerRunnerView == null) {
            return;
        }
        try {
            recognizerRunnerView.stop();
        } catch (java.lang.IllegalStateException e) {
            com.daon.dmds.utils.DobsLogUtils.getStackTrace(e);
        }
    }

    public boolean updateDocumentTypes(java.util.List<com.daon.dmds.models.DocTypeEnum> list) {
        java.lang.String str = getHighSpeedVideoSizes;
        com.daon.dmds.utils.DobsLogUtils.logDebug(str, "updateDocumentTypes: ".concat(java.lang.String.valueOf(list)));
        if (list == null || list.isEmpty()) {
            return false;
        }
        if (list.size() > 1 && com.daon.dmds.utils.DMDSDocumentUtils.listContainsEdgeDetection(list)) {
            return false;
        }
        this.getOutputSizes.setDocumentTypes(list);
        this.b = com.daon.dmds.utils.DMDSDocumentUtils.listContainsEdgeDetection(list);
        com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView = this.isOutputSupportedForhNQ4ISI;
        if (recognizerRunnerView != null && this.getOutputSizes != null) {
            if (recognizerRunnerView.getCameraViewState() != com.microblink.blinkid.view.BaseCameraView.CameraViewState.DESTROYED && this.isOutputSupportedForhNQ4ISI.getCameraViewState() != com.microblink.blinkid.view.BaseCameraView.CameraViewState.CREATED) {
                if (this.getOutputSizes.isAutoStartScanningEnabled()) {
                    this.getHighSpeedVideoFpsRangesFor = com.daon.dmds.recognizers.DMDSDocumentFactory.getDocument(this.getOutputSizes.getDocumentTypes());
                } else {
                    this.getHighSpeedVideoFpsRangesFor = com.daon.dmds.recognizers.DMDSDocumentFactory.getDocument(com.daon.dmds.models.DocTypeEnum.None);
                }
                com.daon.dmds.recognizers.DocumentRecognizer documentRecognizer = this.getHighSpeedVideoFpsRangesFor;
                if (documentRecognizer instanceof com.daon.dmds.recognizers.IIdDocument) {
                    ((com.daon.dmds.recognizers.IIdDocument) documentRecognizer).registerBarcodeScanCallback(this.idBarcodeScanListener);
                }
                try {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Update document type with: ");
                    sb.append(this.getHighSpeedVideoFpsRangesFor.toString());
                    com.daon.dmds.utils.DobsLogUtils.logError(str, sb.toString());
                    this.isOutputSupportedForhNQ4ISI.reconfigureRecognizers(this.getHighSpeedVideoFpsRangesFor.buildRecognizerBundle(this.getOutputSizes));
                } catch (java.lang.Exception e) {
                    getHighSpeedVideoSizes(e);
                }
            }
            return false;
        }
        return true;
    }

    public void updateScanningOptions(com.daon.dmds.models.DMDSOptions dMDSOptions) {
        java.lang.String str = getHighSpeedVideoSizes;
        com.daon.dmds.utils.DobsLogUtils.logDebug(str, "updateScanningOptions: ".concat(java.lang.String.valueOf(dMDSOptions)));
        com.daon.dmds.models.DMDSError validateOptions = com.daon.dmds.utils.DMDSValidator.validateOptions(dMDSOptions, getContext());
        if (validateOptions != null) {
            getHighSpeedVideoFpsRangesFor(validateOptions);
            return;
        }
        this.getOutputSizes = new com.daon.dmds.models.DMDSOptions(dMDSOptions);
        com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView = this.isOutputSupportedForhNQ4ISI;
        if (recognizerRunnerView == null || recognizerRunnerView.getCameraViewState() == com.microblink.blinkid.view.BaseCameraView.CameraViewState.DESTROYED || this.isOutputSupportedForhNQ4ISI.getCameraViewState() == com.microblink.blinkid.view.BaseCameraView.CameraViewState.CREATED) {
            return;
        }
        if (dMDSOptions.isAutoStartScanningEnabled()) {
            this.getHighSpeedVideoFpsRangesFor = com.daon.dmds.recognizers.DMDSDocumentFactory.getDocument(dMDSOptions.getDocumentTypes());
        } else {
            this.getHighSpeedVideoFpsRangesFor = com.daon.dmds.recognizers.DMDSDocumentFactory.getDocument(com.daon.dmds.models.DocTypeEnum.None);
        }
        com.daon.dmds.recognizers.DocumentRecognizer documentRecognizer = this.getHighSpeedVideoFpsRangesFor;
        if (documentRecognizer instanceof com.daon.dmds.recognizers.IIdDocument) {
            ((com.daon.dmds.recognizers.IIdDocument) documentRecognizer).registerBarcodeScanCallback(this.idBarcodeScanListener);
        }
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Update scan options with: ");
            sb.append(this.getHighSpeedVideoFpsRangesFor.toString());
            com.daon.dmds.utils.DobsLogUtils.logError(str, sb.toString());
            this.isOutputSupportedForhNQ4ISI.reconfigureRecognizers(this.getHighSpeedVideoFpsRangesFor.buildRecognizerBundle(dMDSOptions));
        } catch (java.lang.Exception e) {
            getHighSpeedVideoSizes(e);
        }
    }

    public void create(com.daon.dmds.models.DMDSOptions dMDSOptions, com.daon.dmds.managers.DMDSCustomScanListener dMDSCustomScanListener) {
        com.daon.dmds.utils.DobsLogUtils.logDebug(getHighSpeedVideoSizes, "create (custom): ");
        this.Camera2StreamConfigurationMap = com.daon.dmds.models.DMDSLifecycleState.CREATED;
        if (dMDSCustomScanListener != null) {
            this.getInputFormats = dMDSCustomScanListener;
            getHighSpeedVideoSizes(dMDSOptions);
            return;
        }
        throw new java.lang.IllegalArgumentException("DMDSCustomScanListener must not be null!");
    }

    private void getHighSpeedVideoSizes(com.daon.dmds.models.DMDSOptions dMDSOptions) {
        java.lang.String str = getHighSpeedVideoSizes;
        com.daon.dmds.utils.DobsLogUtils.logDebug(str, "create: ".concat(java.lang.String.valueOf(dMDSOptions)));
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BlinkId version: ");
        sb.append(com.microblink.blinkid.MicroblinkSDK.getNativeLibraryVersionString());
        com.daon.dmds.utils.DobsLogUtils.logError(str, sb.toString());
        com.daon.dmds.models.DMDSError validateOptions = com.daon.dmds.utils.DMDSValidator.validateOptions(dMDSOptions, getContext());
        if (validateOptions != null) {
            getHighSpeedVideoFpsRangesFor(validateOptions);
            return;
        }
        com.daon.dmds.models.DMDSOptions dMDSOptions2 = new com.daon.dmds.models.DMDSOptions(dMDSOptions);
        this.getOutputSizes = dMDSOptions2;
        if (!com.daon.dmds.utils.MBUtils.setupLicense(dMDSOptions2.getLicenseKey(), this.getOutputSizes.getLicenseeAppId(), getContext())) {
            getHighSpeedVideoFpsRangesFor(com.daon.dmds.models.DMDSError.errorForCode(getContext(), com.daon.dmds.models.DMDSErrorCode.DMDSErrorCodeLicenseNotValid));
            return;
        }
        if (com.daon.dmds.utils.DMDSValidator.validateDependencies(dMDSOptions)) {
            java.lang.String validateLicense = com.daon.dmds.utils.DMDSValidator.validateLicense(dMDSOptions, getContext());
            if (validateLicense.isEmpty()) {
                try {
                    ((android.view.LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(com.daon.dmds.R.layout.custom_scan_view_layout, (android.view.ViewGroup) this, true);
                    Camera2StreamConfigurationMap();
                    com.daon.dmds.utils.DobsLogUtils.logDebug(str, "createRecognizerView: ");
                    this.isOutputSupportedForhNQ4ISI = (com.microblink.blinkid.view.recognition.RecognizerRunnerView) findViewById(com.daon.dmds.R.id.recognizerView);
                    if (this.getOutputSizes.isAutoStartScanningEnabled()) {
                        this.getHighSpeedVideoFpsRangesFor = com.daon.dmds.recognizers.DMDSDocumentFactory.getDocument(this.getOutputSizes.getDocumentTypes());
                    } else {
                        this.getHighSpeedVideoFpsRangesFor = com.daon.dmds.recognizers.DMDSDocumentFactory.getDocument(com.daon.dmds.models.DocTypeEnum.None);
                    }
                    com.daon.dmds.recognizers.DocumentRecognizer documentRecognizer = this.getHighSpeedVideoFpsRangesFor;
                    if (documentRecognizer instanceof com.daon.dmds.recognizers.IIdDocument) {
                        ((com.daon.dmds.recognizers.IIdDocument) documentRecognizer).registerBarcodeScanCallback(this.idBarcodeScanListener);
                    }
                    try {
                        this.isOutputSupportedForhNQ4ISI.setRecognizerBundle(this.getHighSpeedVideoFpsRangesFor.buildRecognizerBundle(this.getOutputSizes));
                        this.isOutputSupportedForhNQ4ISI.setForceUseLegacyCamera(this.getOutputSizes.isForceLegacyCameraAPI());
                        if (this.getOutputSizes.getCameraSurfaceType() != com.daon.dmds.models.DMDSCameraSurfaceType.DEFAULT) {
                            com.microblink.blinkid.view.surface.CameraSurface cameraSurface = com.microblink.blinkid.view.surface.CameraSurface.SURFACE_TEXTURE_VIEW;
                            if (this.getOutputSizes.getCameraSurfaceType() == com.daon.dmds.models.DMDSCameraSurfaceType.SURFACE_VIEW) {
                                cameraSurface = com.microblink.blinkid.view.surface.CameraSurface.SURFACE_SURFACE_VIEW;
                            }
                            this.isOutputSupportedForhNQ4ISI.setRequestedSurfaceViewForCameraDisplay(cameraSurface);
                        }
                        this.isOutputSupportedForhNQ4ISI.setScanResultListener(new com.microblink.blinkid.view.recognition.ScanResultListener() { // from class: com.daon.dmds.views.DMDSScanView.3
                            @Override // com.microblink.blinkid.view.recognition.ScanResultListener
                            public void onScanningDone(com.microblink.blinkid.recognition.RecognitionSuccessType recognitionSuccessType) {
                                java.lang.String str2 = com.daon.dmds.views.DMDSScanView.getHighSpeedVideoSizes;
                                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("onScanningDone: ");
                                sb2.append(recognitionSuccessType.name());
                                com.daon.dmds.utils.DobsLogUtils.logDebug(str2, sb2.toString());
                                com.daon.dmds.views.DMDSScanView.Camera2StreamConfigurationMap(com.daon.dmds.views.DMDSScanView.this);
                            }

                            @Override // com.microblink.blinkid.view.recognition.ScanResultListener
                            public void onUnrecoverableError(java.lang.Throwable th) {
                                com.daon.dmds.utils.DobsLogUtils.getStackTrace(th);
                            }
                        });
                        this.isOutputSupportedForhNQ4ISI.setCameraEventsListener(new com.daon.dmds.views.DMDSScanView.AnonymousClass4());
                        com.microblink.blinkid.metadata.MetadataCallbacks metadataCallbacks = new com.microblink.blinkid.metadata.MetadataCallbacks();
                        metadataCallbacks.setQuadDetectionCallback(new com.microblink.blinkid.metadata.detection.quad.QuadDetectionCallback() { // from class: com.daon.dmds.views.DMDSScanView$$ExternalSyntheticLambda7
                            @Override // com.microblink.blinkid.metadata.detection.quad.QuadDetectionCallback
                            public final void onQuadDetection(com.microblink.blinkid.metadata.detection.quad.DisplayableQuadDetection displayableQuadDetection) {
                                final com.daon.dmds.views.DMDSScanView dMDSScanView = com.daon.dmds.views.DMDSScanView.this;
                                java.lang.String str2 = com.daon.dmds.views.DMDSScanView.getHighSpeedVideoSizes;
                                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("setQuadDetectionCallback: ");
                                sb2.append(displayableQuadDetection.getDetectionStatus());
                                com.daon.dmds.utils.DobsLogUtils.logDebug(str2, sb2.toString());
                                if (!com.daon.dmds.utils.DMDSPointParser.isDetectionValid(displayableQuadDetection)) {
                                    com.daon.dmds.utils.DobsLogUtils.logDebug(str2, "Invalid detection points");
                                    return;
                                }
                                com.microblink.blinkid.view.recognition.DetectionStatus detectionStatus = displayableQuadDetection.getDetectionStatus();
                                com.daon.dmds.utils.DobsLogUtils.logDebug(str2, "onQuadDetection: ");
                                com.daon.dmds.models.DMDSQuadrangle parseDetectionPoints = com.daon.dmds.utils.DMDSPointParser.parseDetectionPoints(displayableQuadDetection, dMDSScanView.isOutputSupportedForhNQ4ISI);
                                dMDSScanView.unwrapAs = displayableQuadDetection;
                                dMDSScanView.getOutputStallDurationlomOqCM = parseDetectionPoints;
                                com.daon.dmds.models.DMDSDocumentDetectionIssues dMDSDocumentDetectionIssues = new com.daon.dmds.models.DMDSDocumentDetectionIssues();
                                final com.daon.dmds.models.DMDSDocumentDetectionMetadata dMDSDocumentDetectionMetadata = new com.daon.dmds.models.DMDSDocumentDetectionMetadata();
                                com.daon.dmds.recognizers.DocumentRecognizer documentRecognizer2 = dMDSScanView.getHighSpeedVideoFpsRangesFor;
                                if (documentRecognizer2 instanceof com.daon.dmds.recognizers.QualityAssessment) {
                                    dMDSDocumentDetectionIssues = ((com.daon.dmds.recognizers.QualityAssessment) documentRecognizer2).assessFrameQuality();
                                }
                                dMDSScanView.getOutputMinFrameDuration = com.daon.dmds.utils.DMDSPointParser.documentFillsScanningRegion(dMDSScanView.getOutputStallDurationlomOqCM, dMDSScanView.isOutputSupportedForhNQ4ISI, dMDSScanView.getOutputSizes.getScanningRegionFillPercent());
                                dMDSDocumentDetectionMetadata.setDetectionLocation(dMDSScanView.getOutputStallDurationlomOqCM);
                                dMDSDocumentDetectionIssues.setDocumentTooCloseToEdge(detectionStatus == com.microblink.blinkid.view.recognition.DetectionStatus.DOCUMENT_TOO_CLOSE_TO_CAMERA_EDGE);
                                dMDSDocumentDetectionIssues.setDocumentTooCloseToCamera(detectionStatus == com.microblink.blinkid.view.recognition.DetectionStatus.CAMERA_TOO_CLOSE);
                                dMDSDocumentDetectionIssues.setDocumentTilted(com.daon.dmds.utils.DMDSDocumentUtils.checkIfDocumentIsTilted(dMDSScanView.getOutputSizes, dMDSDocumentDetectionMetadata.getDetectionLocation()));
                                dMDSDocumentDetectionIssues.setDocumentFillsScanningArea(dMDSScanView.getOutputMinFrameDuration && detectionStatus != com.microblink.blinkid.view.recognition.DetectionStatus.CAMERA_TOO_FAR);
                                if (detectionStatus == com.microblink.blinkid.view.recognition.DetectionStatus.SUCCESS) {
                                    if (dMDSScanView.getOutputFormats == com.daon.dmds.models.DMDSErrorCode.DMDSErrorCodeDocumentNotFound) {
                                        dMDSScanView.getOutputFormats = com.daon.dmds.models.DMDSErrorCode.DMDSErrorCodeDocumentNotRecognized;
                                    }
                                    android.graphics.Rect scanningRect = com.daon.dmds.utils.DMDSPointParser.toScanningRect(dMDSScanView.isOutputSupportedForhNQ4ISI);
                                    double calculateDetectionAspectRatio = com.daon.dmds.utils.DMDSPointParser.calculateDetectionAspectRatio(com.daon.dmds.utils.DMDSPointParser.rotatePoints(displayableQuadDetection, com.daon.dmds.utils.MBUtils.getOrientation(dMDSScanView.getContext()), scanningRect.width(), scanningRect.height()));
                                    double d = com.daon.dmds.utils.DMDSDocumentUtils.ASPECT_RATIO_THRESHOLD;
                                    if (calculateDetectionAspectRatio > d || calculateDetectionAspectRatio < 1.0d / d) {
                                        com.daon.dmds.utils.DobsLogUtils.logDebug(str2, "Ignore detection points due to aspect ratio ".concat(java.lang.String.valueOf(calculateDetectionAspectRatio)));
                                        return;
                                    }
                                }
                                java.lang.String str3 = com.daon.dmds.views.DMDSScanView.getHighSpeedVideoSizes;
                                com.daon.dmds.utils.DobsLogUtils.logDebug(str3, "notifyDetection: ".concat(java.lang.String.valueOf(dMDSDocumentDetectionMetadata)));
                                if (dMDSScanView.getValidOutputFormatsForInputhNQ4ISI) {
                                    com.daon.dmds.utils.DobsLogUtils.logError(str3, "Ignore detection results due to timeout");
                                } else {
                                    com.daon.dmds.models.DMDSLifecycleState dMDSLifecycleState = dMDSScanView.Camera2StreamConfigurationMap;
                                    if (dMDSLifecycleState != com.daon.dmds.models.DMDSLifecycleState.PAUSED && dMDSLifecycleState != com.daon.dmds.models.DMDSLifecycleState.STOPPED && dMDSLifecycleState != com.daon.dmds.models.DMDSLifecycleState.DESTROYED) {
                                        if (com.daon.dmds.utils.DMDSDocumentUtils.isUiThread()) {
                                            com.daon.dmds.managers.DMDSCustomScanListener dMDSCustomScanListener = dMDSScanView.getInputFormats;
                                            if (dMDSCustomScanListener != null) {
                                                dMDSCustomScanListener.documentDetected(dMDSDocumentDetectionMetadata);
                                            }
                                        } else if (dMDSScanView.getInputFormats != null) {
                                            if (dMDSScanView.isOutputSupportedFor == null) {
                                                dMDSScanView.isOutputSupportedFor = new android.os.Handler(android.os.Looper.getMainLooper());
                                            }
                                            dMDSScanView.isOutputSupportedFor.post(new java.lang.Runnable() { // from class: com.daon.dmds.views.DMDSScanView$$ExternalSyntheticLambda9
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    com.daon.dmds.views.DMDSScanView dMDSScanView2 = com.daon.dmds.views.DMDSScanView.this;
                                                    dMDSScanView2.getInputFormats.documentDetected(dMDSDocumentDetectionMetadata);
                                                }
                                            });
                                        }
                                    }
                                }
                                com.daon.dmds.models.DMDSDocumentDetectionStatus analyzeStatusFromDetectionIssues = com.daon.dmds.utils.DMDSDocumentUtils.getAnalyzeStatusFromDetectionIssues(dMDSDocumentDetectionIssues);
                                if (analyzeStatusFromDetectionIssues != com.daon.dmds.models.DMDSDocumentDetectionStatus.NO_ERROR) {
                                    dMDSScanView.getHighSpeedVideoFpsRanges(analyzeStatusFromDetectionIssues);
                                }
                            }
                        });
                        metadataCallbacks.setFirstSideRecognitionCallback(new com.microblink.blinkid.metadata.recognition.FirstSideRecognitionCallback() { // from class: com.daon.dmds.views.DMDSScanView$$ExternalSyntheticLambda8
                            @Override // com.microblink.blinkid.metadata.recognition.FirstSideRecognitionCallback
                            public final void onFirstSideRecognitionFinished() {
                                final com.daon.dmds.views.DMDSScanView dMDSScanView = com.daon.dmds.views.DMDSScanView.this;
                                if (!com.daon.dmds.utils.DMDSDocumentUtils.isScanningRegionFilled(dMDSScanView.getOutputMinFrameDuration, com.daon.dmds.utils.DMDSDocumentUtils.extractDocumentType(dMDSScanView.getOutputSizes.getDocumentTypes()).name())) {
                                    com.daon.dmds.utils.DobsLogUtils.logError(com.daon.dmds.views.DMDSScanView.getHighSpeedVideoSizes, "Rejected due to scanning region fill percentage");
                                    if (dMDSScanView.isOutputSupportedFor == null) {
                                        dMDSScanView.isOutputSupportedFor = new android.os.Handler(android.os.Looper.getMainLooper());
                                    }
                                    dMDSScanView.isOutputSupportedFor.post(new java.lang.Runnable() { // from class: com.daon.dmds.views.DMDSScanView$$ExternalSyntheticLambda10
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            com.daon.dmds.views.DMDSScanView.this.resumeScanning(true);
                                        }
                                    });
                                    return;
                                }
                                com.daon.dmds.utils.DobsLogUtils.logDebug(com.daon.dmds.views.DMDSScanView.getHighSpeedVideoSizes, "onFirstSideRecognitionFinished: ");
                                final com.daon.dmds.models.DMDSDocument buildFrontResult = ((com.daon.dmds.recognizers.DocumentFrontRecognizer) dMDSScanView.getHighSpeedVideoFpsRangesFor).buildFrontResult();
                                dMDSScanView.getOutputStallDuration = com.daon.dmds.utils.DMDSPointParser.rotatePoints(dMDSScanView.unwrapAs, com.daon.dmds.utils.DMDSDocumentUtils.getMBOrientation(dMDSScanView.getContext(), dMDSScanView.getHighSpeedVideoFpsRangesFor), buildFrontResult.getUnprocessedImage().getWidth(), buildFrontResult.getUnprocessedImage().getHeight());
                                if (!dMDSScanView.getOutputSizes.isQualityFilterEnabled() || dMDSScanView.getHighSpeedVideoFpsRanges() == null || buildFrontResult.getUnprocessedImage() == null) {
                                    dMDSScanView.getHighSpeedVideoFpsRangesFor(buildFrontResult);
                                } else {
                                    dMDSScanView.getHighSpeedVideoFpsRanges().analyzeImageQuality(buildFrontResult.getUnprocessedImage(), dMDSScanView.getOutputSizes, dMDSScanView.getOutputStallDuration, dMDSScanView.getHighResolutionOutputSizeshNQ4ISI != null, new com.daon.dmds.utils.idcapture.IdCaptureResultListener() { // from class: com.daon.dmds.views.DMDSScanView.5
                                        @Override // com.daon.dmds.utils.idcapture.IdCaptureResultListener
                                        public void onFailure(com.daon.dmds.models.DMDSDocumentQualityInfo dMDSDocumentQualityInfo) {
                                            com.daon.dmds.utils.DobsLogUtils.logError(com.daon.dmds.views.DMDSScanView.getHighSpeedVideoSizes, "analyzeImageQuality() -> onFailure: ".concat(java.lang.String.valueOf(dMDSDocumentQualityInfo)));
                                            com.daon.dmds.views.DMDSScanView.getHighSpeedVideoFpsRangesFor(com.daon.dmds.views.DMDSScanView.this, dMDSDocumentQualityInfo);
                                            com.daon.dmds.views.DMDSScanView.this.getHighSpeedVideoFpsRanges.add(dMDSDocumentQualityInfo.getAnalyzeStatus());
                                            com.daon.dmds.views.DMDSScanView.this.isOutputSupportedForhNQ4ISI.resumeScanning(true);
                                        }

                                        @Override // com.daon.dmds.utils.idcapture.IdCaptureResultListener
                                        public void onSuccess(com.daon.dmds.models.DMDSIDCaptureResult dMDSIDCaptureResult) {
                                            com.daon.dmds.utils.DobsLogUtils.logDebug(com.daon.dmds.views.DMDSScanView.getHighSpeedVideoSizes, "analyzeImageQuality() -> onSuccess: ".concat(java.lang.String.valueOf(dMDSIDCaptureResult)));
                                            com.daon.dmds.views.DMDSScanView.this.kernelVersion = dMDSIDCaptureResult;
                                            com.daon.dmds.views.DMDSScanView.this.getHighSpeedVideoFpsRangesFor(buildFrontResult);
                                        }
                                    });
                                }
                            }
                        });
                        this.isOutputSupportedForhNQ4ISI.setMetadataCallbacks(metadataCallbacks);
                        com.microblink.blinkid.geometry.Rectangle rectangle = this.getHighResolutionOutputSizeshNQ4ISI;
                        if (rectangle != null) {
                            this.isOutputSupportedForhNQ4ISI.setScanningRegion(rectangle, this.CoroutineDebuggingKt);
                        }
                        this.isOutputSupportedForhNQ4ISI.setRequestAutofocusOnShakingStopInContinousAutofocusMode(this.getOutputSizes.isRequestAutofocusOnShakingStopInContinousAutofocusMode());
                        this.isOutputSupportedForhNQ4ISI.setAspectMode(com.microblink.blinkid.view.CameraAspectMode.ASPECT_FILL);
                        this.isOutputSupportedForhNQ4ISI.setVideoResolutionPreset(com.daon.dmds.utils.MBUtils.mapVideoResolution(this.getOutputSizes.getVideoResolution()));
                        this.isOutputSupportedForhNQ4ISI.create();
                        return;
                    } catch (java.lang.Exception e) {
                        getHighSpeedVideoSizes(e);
                        return;
                    }
                } catch (java.lang.Exception e2) {
                    if (com.daon.dmds.utils.DMDSDocumentUtils.checkIfLicenseExceptionOccurred(e2.getCause())) {
                        getHighSpeedVideoFpsRangesFor(com.daon.dmds.models.DMDSError.errorForCode(getContext(), com.daon.dmds.models.DMDSErrorCode.DMDSErrorCodeLicenseNotValid));
                        return;
                    }
                    return;
                }
            }
            throw new java.lang.IllegalArgumentException("Invalid request, ".concat(java.lang.String.valueOf(validateLicense)));
        }
        throw new java.lang.IllegalArgumentException("Invalid request, missing SDK dependencies");
    }

    public DMDSScanView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.accessartificialFrame = null;
        this.getInputFormats = null;
        this._CREATION = null;
        this.Camera2StreamConfigurationMap = com.daon.dmds.models.DMDSLifecycleState.DESTROYED;
        this.d = false;
        this.CoroutineDebuggingKt = false;
        this.getValidOutputFormatsForInputhNQ4ISI = false;
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.getOutputStallDurationlomOqCM = null;
        this.getOutputStallDuration = null;
        this.getHighSpeedVideoFpsRanges = new java.util.ArrayList();
        this.coroutineCreation = java.lang.System.currentTimeMillis();
        this.getOutputMinFrameDuration = false;
        this.idBarcodeScanListener = new com.daon.dmds.recognizers.IBarcodeScan() { // from class: com.daon.dmds.views.DMDSScanView$$ExternalSyntheticLambda11
            @Override // com.daon.dmds.recognizers.IBarcodeScan
            public final void onBarcodeScanningStarted() {
                final com.daon.dmds.views.DMDSScanView dMDSScanView = com.daon.dmds.views.DMDSScanView.this;
                if (dMDSScanView.isOutputSupportedFor == null) {
                    dMDSScanView.isOutputSupportedFor = new android.os.Handler(android.os.Looper.getMainLooper());
                }
                dMDSScanView.isOutputSupportedFor.post(new java.lang.Runnable() { // from class: com.daon.dmds.views.DMDSScanView$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.daon.dmds.views.DMDSScanView dMDSScanView2 = com.daon.dmds.views.DMDSScanView.this;
                        if (dMDSScanView2.getInputFormats != null) {
                            com.daon.dmds.utils.DobsLogUtils.logDebug(com.daon.dmds.views.DMDSScanView.getHighSpeedVideoSizes, "idBarcodeScanListener: ");
                            dMDSScanView2.getInputFormats.barcodeScanningStarted();
                        }
                    }
                });
            }
        };
        this.coroutineBoundary = new java.lang.Runnable() { // from class: com.daon.dmds.views.DMDSScanView$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                com.daon.dmds.views.DMDSScanView dMDSScanView = com.daon.dmds.views.DMDSScanView.this;
                java.lang.String str = com.daon.dmds.views.DMDSScanView.getHighSpeedVideoSizes;
                com.daon.dmds.utils.DobsLogUtils.logDebug(str, "docRecognizerRun: ");
                if (com.daon.dmds.utils.DMDSDocumentUtils.ignoreFallbackToEdgeDetection(dMDSScanView.getOutputSizes) || !dMDSScanView.getOutputSizes.isFallbackToEdgeDetection() || !dMDSScanView.getOutputSizes.noEdgeDetectionInRequests() || dMDSScanView.isOutputSupportedForhNQ4ISI == null) {
                    dMDSScanView.getHighResolutionOutputSizeshNQ4ISI();
                    return;
                }
                com.daon.dmds.utils.DobsLogUtils.logDebug(str, "Fallback to edge detection");
                com.daon.dmds.managers.DMDSCustomScanListener dMDSCustomScanListener = dMDSScanView.getInputFormats;
                if (dMDSCustomScanListener != null) {
                    dMDSCustomScanListener.fallingBackToEdgeDetection();
                }
                com.daon.dmds.models.DMDSOptions fallbackOptions = com.daon.dmds.utils.DMDSDocumentUtils.getFallbackOptions(dMDSScanView.getOutputSizes);
                dMDSScanView.getHighSpeedVideoSizesFor = fallbackOptions;
                dMDSScanView.getHighSpeedVideoFpsRangesFor = com.daon.dmds.recognizers.DMDSDocumentFactory.getDocument(fallbackOptions.getDocumentTypes());
                try {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Fallback to: ");
                    sb.append(dMDSScanView.getHighSpeedVideoFpsRangesFor.toString());
                    com.daon.dmds.utils.DobsLogUtils.logError(str, sb.toString());
                    dMDSScanView.isOutputSupportedForhNQ4ISI.reconfigureRecognizers(dMDSScanView.getHighSpeedVideoFpsRangesFor.buildRecognizerBundle(dMDSScanView.getHighSpeedVideoSizesFor));
                } catch (com.microblink.blinkid.licence.exception.InvalidLicenceKeyException e) {
                    com.daon.dmds.utils.DobsLogUtils.getStackTrace(e);
                    dMDSScanView.getHighSpeedVideoFpsRangesFor = com.daon.dmds.recognizers.DMDSDocumentFactory.getDocument(com.daon.dmds.models.DocTypeEnum.None);
                    java.lang.String str2 = com.daon.dmds.views.DMDSScanView.getHighSpeedVideoSizes;
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Fallback catch: ");
                    sb2.append(dMDSScanView.getHighSpeedVideoFpsRangesFor.toString());
                    com.daon.dmds.utils.DobsLogUtils.logError(str2, sb2.toString());
                    try {
                        dMDSScanView.isOutputSupportedForhNQ4ISI.reconfigureRecognizers(dMDSScanView.getHighSpeedVideoFpsRangesFor.buildRecognizerBundle(dMDSScanView.getHighSpeedVideoSizesFor));
                    } catch (java.lang.Exception e2) {
                        dMDSScanView.getHighSpeedVideoSizes(e2);
                    }
                } catch (java.lang.Exception e3) {
                    dMDSScanView.getHighSpeedVideoSizes(e3);
                }
                com.daon.dmds.utils.DobsLogUtils.logDebug(com.daon.dmds.views.DMDSScanView.getHighSpeedVideoSizes, "startFallbackToEdgeDetectionTimer: ");
                dMDSScanView.getOutputMinFrameDurationlomOqCM = true;
                dMDSScanView.getOutputSizeshNQ4ISI = false;
                dMDSScanView.getHighSpeedVideoFpsRangesFor();
                if (dMDSScanView.toString == null) {
                    dMDSScanView.toString = new android.os.Handler(android.os.Looper.getMainLooper());
                }
                dMDSScanView.toString.postDelayed(dMDSScanView.getInputSizeshNQ4ISI, dMDSScanView.getHighSpeedVideoSizesFor.getFallbackToEdgeDetectionDuration() * 1000);
            }
        };
        this.getInputSizeshNQ4ISI = new java.lang.Runnable() { // from class: com.daon.dmds.views.DMDSScanView$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                com.daon.dmds.views.DMDSScanView.this.getHighResolutionOutputSizeshNQ4ISI();
            }
        };
    }

    public DMDSScanView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.accessartificialFrame = null;
        this.getInputFormats = null;
        this._CREATION = null;
        this.Camera2StreamConfigurationMap = com.daon.dmds.models.DMDSLifecycleState.DESTROYED;
        this.d = false;
        this.CoroutineDebuggingKt = false;
        this.getValidOutputFormatsForInputhNQ4ISI = false;
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.getOutputStallDurationlomOqCM = null;
        this.getOutputStallDuration = null;
        this.getHighSpeedVideoFpsRanges = new java.util.ArrayList();
        this.coroutineCreation = java.lang.System.currentTimeMillis();
        this.getOutputMinFrameDuration = false;
        this.idBarcodeScanListener = new com.daon.dmds.recognizers.IBarcodeScan() { // from class: com.daon.dmds.views.DMDSScanView$$ExternalSyntheticLambda11
            @Override // com.daon.dmds.recognizers.IBarcodeScan
            public final void onBarcodeScanningStarted() {
                final com.daon.dmds.views.DMDSScanView dMDSScanView = com.daon.dmds.views.DMDSScanView.this;
                if (dMDSScanView.isOutputSupportedFor == null) {
                    dMDSScanView.isOutputSupportedFor = new android.os.Handler(android.os.Looper.getMainLooper());
                }
                dMDSScanView.isOutputSupportedFor.post(new java.lang.Runnable() { // from class: com.daon.dmds.views.DMDSScanView$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.daon.dmds.views.DMDSScanView dMDSScanView2 = com.daon.dmds.views.DMDSScanView.this;
                        if (dMDSScanView2.getInputFormats != null) {
                            com.daon.dmds.utils.DobsLogUtils.logDebug(com.daon.dmds.views.DMDSScanView.getHighSpeedVideoSizes, "idBarcodeScanListener: ");
                            dMDSScanView2.getInputFormats.barcodeScanningStarted();
                        }
                    }
                });
            }
        };
        this.coroutineBoundary = new java.lang.Runnable() { // from class: com.daon.dmds.views.DMDSScanView$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                com.daon.dmds.views.DMDSScanView dMDSScanView = com.daon.dmds.views.DMDSScanView.this;
                java.lang.String str = com.daon.dmds.views.DMDSScanView.getHighSpeedVideoSizes;
                com.daon.dmds.utils.DobsLogUtils.logDebug(str, "docRecognizerRun: ");
                if (com.daon.dmds.utils.DMDSDocumentUtils.ignoreFallbackToEdgeDetection(dMDSScanView.getOutputSizes) || !dMDSScanView.getOutputSizes.isFallbackToEdgeDetection() || !dMDSScanView.getOutputSizes.noEdgeDetectionInRequests() || dMDSScanView.isOutputSupportedForhNQ4ISI == null) {
                    dMDSScanView.getHighResolutionOutputSizeshNQ4ISI();
                    return;
                }
                com.daon.dmds.utils.DobsLogUtils.logDebug(str, "Fallback to edge detection");
                com.daon.dmds.managers.DMDSCustomScanListener dMDSCustomScanListener = dMDSScanView.getInputFormats;
                if (dMDSCustomScanListener != null) {
                    dMDSCustomScanListener.fallingBackToEdgeDetection();
                }
                com.daon.dmds.models.DMDSOptions fallbackOptions = com.daon.dmds.utils.DMDSDocumentUtils.getFallbackOptions(dMDSScanView.getOutputSizes);
                dMDSScanView.getHighSpeedVideoSizesFor = fallbackOptions;
                dMDSScanView.getHighSpeedVideoFpsRangesFor = com.daon.dmds.recognizers.DMDSDocumentFactory.getDocument(fallbackOptions.getDocumentTypes());
                try {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Fallback to: ");
                    sb.append(dMDSScanView.getHighSpeedVideoFpsRangesFor.toString());
                    com.daon.dmds.utils.DobsLogUtils.logError(str, sb.toString());
                    dMDSScanView.isOutputSupportedForhNQ4ISI.reconfigureRecognizers(dMDSScanView.getHighSpeedVideoFpsRangesFor.buildRecognizerBundle(dMDSScanView.getHighSpeedVideoSizesFor));
                } catch (com.microblink.blinkid.licence.exception.InvalidLicenceKeyException e) {
                    com.daon.dmds.utils.DobsLogUtils.getStackTrace(e);
                    dMDSScanView.getHighSpeedVideoFpsRangesFor = com.daon.dmds.recognizers.DMDSDocumentFactory.getDocument(com.daon.dmds.models.DocTypeEnum.None);
                    java.lang.String str2 = com.daon.dmds.views.DMDSScanView.getHighSpeedVideoSizes;
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Fallback catch: ");
                    sb2.append(dMDSScanView.getHighSpeedVideoFpsRangesFor.toString());
                    com.daon.dmds.utils.DobsLogUtils.logError(str2, sb2.toString());
                    try {
                        dMDSScanView.isOutputSupportedForhNQ4ISI.reconfigureRecognizers(dMDSScanView.getHighSpeedVideoFpsRangesFor.buildRecognizerBundle(dMDSScanView.getHighSpeedVideoSizesFor));
                    } catch (java.lang.Exception e2) {
                        dMDSScanView.getHighSpeedVideoSizes(e2);
                    }
                } catch (java.lang.Exception e3) {
                    dMDSScanView.getHighSpeedVideoSizes(e3);
                }
                com.daon.dmds.utils.DobsLogUtils.logDebug(com.daon.dmds.views.DMDSScanView.getHighSpeedVideoSizes, "startFallbackToEdgeDetectionTimer: ");
                dMDSScanView.getOutputMinFrameDurationlomOqCM = true;
                dMDSScanView.getOutputSizeshNQ4ISI = false;
                dMDSScanView.getHighSpeedVideoFpsRangesFor();
                if (dMDSScanView.toString == null) {
                    dMDSScanView.toString = new android.os.Handler(android.os.Looper.getMainLooper());
                }
                dMDSScanView.toString.postDelayed(dMDSScanView.getInputSizeshNQ4ISI, dMDSScanView.getHighSpeedVideoSizesFor.getFallbackToEdgeDetectionDuration() * 1000);
            }
        };
        this.getInputSizeshNQ4ISI = new java.lang.Runnable() { // from class: com.daon.dmds.views.DMDSScanView$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                com.daon.dmds.views.DMDSScanView.this.getHighResolutionOutputSizeshNQ4ISI();
            }
        };
    }

    static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(com.daon.dmds.views.DMDSScanView dMDSScanView, final com.daon.dmds.models.DMDSFaceQualityInfo dMDSFaceQualityInfo) {
        com.daon.dmds.managers.DMDSMetadataProvider dMDSMetadataProvider;
        final com.daon.dmds.managers.DMDSFaceQualityInfoListener faceQualityInfoListener;
        com.daon.dmds.models.DMDSLifecycleState dMDSLifecycleState = dMDSScanView.Camera2StreamConfigurationMap;
        if (dMDSLifecycleState == com.daon.dmds.models.DMDSLifecycleState.PAUSED || dMDSLifecycleState == com.daon.dmds.models.DMDSLifecycleState.STOPPED || dMDSLifecycleState == com.daon.dmds.models.DMDSLifecycleState.DESTROYED || (dMDSMetadataProvider = dMDSScanView.f2844a) == null || (faceQualityInfoListener = dMDSMetadataProvider.getFaceQualityInfoListener()) == null) {
            return;
        }
        if (dMDSScanView.isOutputSupportedFor == null) {
            dMDSScanView.isOutputSupportedFor = new android.os.Handler(android.os.Looper.getMainLooper());
        }
        dMDSScanView.isOutputSupportedFor.post(new java.lang.Runnable() { // from class: com.daon.dmds.views.DMDSScanView$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                com.daon.dmds.managers.DMDSFaceQualityInfoListener.this.onFaceQualityInfo(dMDSFaceQualityInfo);
            }
        });
    }

    static /* synthetic */ void Camera2StreamConfigurationMap(com.daon.dmds.views.DMDSScanView dMDSScanView) {
        java.lang.String str = getHighSpeedVideoSizes;
        com.daon.dmds.utils.DobsLogUtils.logDebug(str, "performQualityChecks: ");
        dMDSScanView.pauseScanning();
        if (dMDSScanView.getValidOutputFormatsForInputhNQ4ISI) {
            return;
        }
        final com.daon.dmds.models.ResponseData buildResponseData = dMDSScanView.getHighSpeedVideoFpsRangesFor.buildResponseData();
        if (buildResponseData == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("No scan results for ");
            sb.append(dMDSScanView.getHighSpeedVideoFpsRangesFor.toString());
            com.daon.dmds.utils.DobsLogUtils.logDebug(str, sb.toString());
            dMDSScanView.resumeScanning(!dMDSScanView.getOutputMinFrameDurationlomOqCM);
            return;
        }
        if (!com.daon.dmds.utils.DMDSDocumentUtils.isScanningRegionFilled(dMDSScanView.getOutputMinFrameDuration, buildResponseData.getResult().getDocument().getDocumentType())) {
            com.daon.dmds.utils.DobsLogUtils.logError(str, "Rejected due to scanning region fill percentage");
            dMDSScanView.resumeScanning(!dMDSScanView.getOutputMinFrameDurationlomOqCM);
            return;
        }
        android.graphics.Bitmap unprocessedImage = com.daon.dmds.utils.DMDSDocumentUtils.getUnprocessedImage(buildResponseData);
        if (dMDSScanView.getOutputSizes.isQualityFilterEnabled() && dMDSScanView.getHighSpeedVideoFpsRanges() != null && unprocessedImage != null) {
            dMDSScanView.getHighSpeedVideoFpsRanges().analyzeImageQuality(unprocessedImage, dMDSScanView.getOutputSizes, com.daon.dmds.utils.DMDSDocumentUtils.getDocumentDetectionPoints(dMDSScanView.getContext(), dMDSScanView.getHighSpeedVideoFpsRangesFor, buildResponseData, unprocessedImage, dMDSScanView.unwrapAs), dMDSScanView.getHighResolutionOutputSizeshNQ4ISI != null, new com.daon.dmds.utils.idcapture.IdCaptureResultListener() { // from class: com.daon.dmds.views.DMDSScanView.1
                @Override // com.daon.dmds.utils.idcapture.IdCaptureResultListener
                public void onFailure(com.daon.dmds.models.DMDSDocumentQualityInfo dMDSDocumentQualityInfo) {
                    com.daon.dmds.utils.DobsLogUtils.logError(com.daon.dmds.views.DMDSScanView.getHighSpeedVideoSizes, "performQualityChecks() -> onFailure: ".concat(java.lang.String.valueOf(dMDSDocumentQualityInfo)));
                    com.daon.dmds.views.DMDSScanView.getHighSpeedVideoFpsRangesFor(com.daon.dmds.views.DMDSScanView.this, dMDSDocumentQualityInfo);
                    com.daon.dmds.views.DMDSScanView.this.getHighSpeedVideoFpsRanges(dMDSDocumentQualityInfo.getAnalyzeStatus());
                    com.daon.dmds.views.DMDSScanView.this.resumeScanning(com.daon.dmds.utils.DMDSDocumentUtils.getDocumentSide(buildResponseData) == com.daon.dmds.models.DocumentSide.FIRST && !com.daon.dmds.views.DMDSScanView.this.getOutputMinFrameDurationlomOqCM);
                }

                @Override // com.daon.dmds.utils.idcapture.IdCaptureResultListener
                public void onSuccess(com.daon.dmds.models.DMDSIDCaptureResult dMDSIDCaptureResult) {
                    if (com.daon.dmds.utils.DMDSDocumentUtils.getDocumentSide(buildResponseData) == com.daon.dmds.models.DocumentSide.FIRST) {
                        com.daon.dmds.views.DMDSScanView.this.kernelVersion = dMDSIDCaptureResult;
                    } else {
                        com.daon.dmds.views.DMDSScanView.this.c = dMDSIDCaptureResult;
                    }
                    com.daon.dmds.views.DMDSScanView.this.getHighResolutionOutputSizeshNQ4ISI(buildResponseData);
                }
            });
        } else {
            dMDSScanView.getHighResolutionOutputSizeshNQ4ISI(buildResponseData);
        }
    }

    static /* synthetic */ void getOutputFormats(com.daon.dmds.views.DMDSScanView dMDSScanView) {
        com.daon.dmds.utils.DobsLogUtils.logDebug(getHighSpeedVideoSizes, "stopDocRecognizerTimer: ");
        if (dMDSScanView.getARTIFICIAL_FRAME_PACKAGE_NAME == null) {
            dMDSScanView.getARTIFICIAL_FRAME_PACKAGE_NAME = new android.os.Handler(android.os.Looper.getMainLooper());
        }
        dMDSScanView.getARTIFICIAL_FRAME_PACKAGE_NAME.removeCallbacks(dMDSScanView.coroutineBoundary);
    }

    static /* synthetic */ void getHighSpeedVideoFpsRangesFor(com.daon.dmds.views.DMDSScanView dMDSScanView, final com.daon.dmds.models.DMDSDocumentQualityInfo dMDSDocumentQualityInfo) {
        com.daon.dmds.managers.DMDSMetadataProvider dMDSMetadataProvider;
        final com.daon.dmds.managers.DMDSDocumentQualityInfoListener documentQualityInfoListener;
        com.daon.dmds.models.DMDSLifecycleState dMDSLifecycleState = dMDSScanView.Camera2StreamConfigurationMap;
        if (dMDSLifecycleState == com.daon.dmds.models.DMDSLifecycleState.PAUSED || dMDSLifecycleState == com.daon.dmds.models.DMDSLifecycleState.STOPPED || dMDSLifecycleState == com.daon.dmds.models.DMDSLifecycleState.DESTROYED || (dMDSMetadataProvider = dMDSScanView.f2844a) == null || (documentQualityInfoListener = dMDSMetadataProvider.getDocumentQualityInfoListener()) == null) {
            return;
        }
        if (dMDSScanView.isOutputSupportedFor == null) {
            dMDSScanView.isOutputSupportedFor = new android.os.Handler(android.os.Looper.getMainLooper());
        }
        dMDSScanView.isOutputSupportedFor.post(new java.lang.Runnable() { // from class: com.daon.dmds.views.DMDSScanView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.daon.dmds.managers.DMDSDocumentQualityInfoListener.this.onDocumentQualityInfo(dMDSDocumentQualityInfo);
            }
        });
    }
}
