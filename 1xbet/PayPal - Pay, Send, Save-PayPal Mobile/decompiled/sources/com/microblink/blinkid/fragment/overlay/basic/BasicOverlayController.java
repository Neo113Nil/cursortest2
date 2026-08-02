package com.microblink.blinkid.fragment.overlay.basic;

/* loaded from: classes10.dex */
public final class BasicOverlayController extends com.microblink.blinkid.fragment.overlay.BaseOverlayController {
    private final com.microblink.blinkid.fragment.overlay.basic.BasicOverlaySettings Camera2StreamConfigurationMap;
    private final com.microblink.blinkid.metadata.MetadataCallbacks getHighResolutionOutputSizeshNQ4ISI;
    private final com.microblink.blinkid.view.OnActivityFlipListener getHighSpeedVideoFpsRanges;
    private final com.microblink.blinkid.entities.recognizers.RecognizerBundle getHighSpeedVideoFpsRangesFor;
    private android.widget.ImageButton getHighSpeedVideoSizes;
    private final com.microblink.blinkid.fragment.overlay.components.feedback.RecognitionFeedbackHandler getHighSpeedVideoSizesFor;
    private final com.microblink.blinkid.entities.recognizers.HighResImagesBundle getInputFormats;
    private final java.lang.Runnable getInputSizeshNQ4ISI;
    private final com.microblink.blinkid.fragment.overlay.components.statusmsg.StatusMessageTranslator getOutputFormats;
    private com.microblink.blinkid.fragment.overlay.components.statusmsg.StatusTextManager getOutputMinFrameDuration;
    private final com.microblink.blinkid.fragment.overlay.components.settings.ControlsLayoutConfig getOutputSizes;
    private com.microblink.blinkid.view.viewfinder.quadview.QuadViewManager getOutputStallDuration;
    private final com.microblink.blinkid.view.OrientationAllowedListener getOutputStallDurationlomOqCM;

    public BasicOverlayController(com.microblink.blinkid.fragment.overlay.basic.BasicOverlaySettings basicOverlaySettings, com.microblink.blinkid.view.recognition.ScanResultListener scanResultListener) {
        super(scanResultListener);
        this.getInputFormats = new com.microblink.blinkid.entities.recognizers.HighResImagesBundle();
        this.getHighResolutionOutputSizeshNQ4ISI = new com.microblink.blinkid.metadata.MetadataCallbacks();
        this.getOutputStallDurationlomOqCM = new com.microblink.blinkid.view.OrientationAllowedListener() { // from class: com.microblink.blinkid.fragment.overlay.basic.BasicOverlayController.7
            @Override // com.microblink.blinkid.view.OrientationAllowedListener
            public boolean isOrientationAllowed(com.microblink.blinkid.hardware.orientation.Orientation orientation) {
                com.microblink.blinkid.uisettings.options.OverlayOrientation overlayOrientation = com.microblink.blinkid.fragment.overlay.basic.BasicOverlayController.this.Camera2StreamConfigurationMap.getHighSpeedVideoSizesFor;
                if (overlayOrientation != null) {
                    return (overlayOrientation == com.microblink.blinkid.uisettings.options.OverlayOrientation.LANDSCAPE && orientation.isHorizontal()) || (overlayOrientation == com.microblink.blinkid.uisettings.options.OverlayOrientation.PORTRAIT && orientation.isVertical());
                }
                com.microblink.blinkid.hardware.orientation.Orientation highSpeedVideoSizes = com.microblink.blinkid.fragment.overlay.basic.BasicOverlayController.this.getHighSpeedVideoSizes();
                return highSpeedVideoSizes == null || !highSpeedVideoSizes.isHorizontal() || orientation.isHorizontal();
            }
        };
        this.getHighSpeedVideoFpsRanges = new com.microblink.blinkid.view.OnActivityFlipListener() { // from class: com.microblink.blinkid.fragment.overlay.basic.BasicOverlayController.8
            @Override // com.microblink.blinkid.view.OnActivityFlipListener
            public void onActivityFlip() {
                if (com.microblink.blinkid.fragment.overlay.basic.BasicOverlayController.this.getOutputStallDuration != null) {
                    com.microblink.blinkid.fragment.overlay.basic.BasicOverlayController.this.getOutputStallDuration.configurationChanged(com.microblink.blinkid.fragment.overlay.basic.BasicOverlayController.this.llIIIlllll, com.microblink.blinkid.fragment.overlay.basic.BasicOverlayController.this.IllIIIllII.getResources().getConfiguration());
                }
                com.microblink.blinkid.fragment.overlay.basic.BasicOverlayController.this.getHighSpeedVideoSizesFor.onOrientationChange(com.microblink.blinkid.fragment.overlay.basic.BasicOverlayController.this.llIIIlllll.getHostScreenOrientation());
            }
        };
        this.getHighSpeedVideoFpsRangesFor = basicOverlaySettings.getOutputMinFrameDurationlomOqCM;
        this.getInputSizeshNQ4ISI = basicOverlaySettings.getInputSizeshNQ4ISI;
        this.Camera2StreamConfigurationMap = basicOverlaySettings;
        this.getOutputSizes = basicOverlaySettings.getOutputStallDurationlomOqCM;
        this.getHighSpeedVideoSizesFor = basicOverlaySettings.getHighSpeedVideoSizes;
        this.getOutputFormats = basicOverlaySettings.getOutputFormats;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.microblink.blinkid.hardware.orientation.Orientation getHighSpeedVideoSizes() {
        if (!com.microblink.blinkid.secured.lIIllllIIl.llIIlIlIIl) {
            com.microblink.blinkid.util.Log.w(this, "It seems that lib{}.so has not been loaded!", com.microblink.blinkid.secured.IlIlllllII.llIIlIlIIl[0]);
            return null;
        }
        com.microblink.blinkid.entities.recognizers.Recognizer<com.microblink.blinkid.entities.recognizers.Recognizer.Result>[] recognizers = this.getHighSpeedVideoFpsRangesFor.getRecognizers();
        if (recognizers != null) {
            for (com.microblink.blinkid.entities.recognizers.Recognizer<com.microblink.blinkid.entities.recognizers.Recognizer.Result> recognizer : recognizers) {
                if (recognizer != null && recognizer.requiresLandscapeMode()) {
                    return com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_LANDSCAPE_RIGHT;
                }
            }
        }
        return null;
    }

    public final com.microblink.blinkid.entities.recognizers.HighResImagesBundle getHighResImagesBundle() {
        return this.getInputFormats;
    }

    @Override // com.microblink.blinkid.fragment.overlay.BaseOverlayController
    public final boolean llIIlIIlll() {
        return true;
    }

    @Override // com.microblink.blinkid.fragment.overlay.BaseOverlayController
    public final void onCameraAutofocusFailed() {
        com.microblink.blinkid.view.viewfinder.quadview.QuadViewManager quadViewManager = this.getOutputStallDuration;
        if (quadViewManager != null) {
            quadViewManager.animateQuadToDefaultPosition();
        }
        this.getHighSpeedVideoSizesFor.clear();
    }

    @Override // com.microblink.blinkid.fragment.overlay.BaseOverlayController, com.microblink.blinkid.fragment.overlay.ScanningOverlay
    public final void onRecognizerRunnerViewCreated(final com.microblink.blinkid.fragment.RecognizerRunnerFragment recognizerRunnerFragment) {
        super.onRecognizerRunnerViewCreated(recognizerRunnerFragment);
        this.llIIIlllll.setRecognizerBundle(this.getHighSpeedVideoFpsRangesFor);
        this.llIIIlllll.setAnimateRotation(true);
        this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor.apply(this.llIIIlllll);
        this.llIIIlllll.setHighResFrameCaptureEnabled(this.Camera2StreamConfigurationMap.getOutputMinFrameDuration);
        com.microblink.blinkid.geometry.Rectangle rectangle = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap.roi;
        if (rectangle != null) {
            this.llIIIlllll.setScanningRegion(rectangle, this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap.isRotatable);
        }
        this.getHighResolutionOutputSizeshNQ4ISI.setFailedDetectionCallback(new com.microblink.blinkid.metadata.detection.FailedDetectionCallback() { // from class: com.microblink.blinkid.fragment.overlay.basic.BasicOverlayController.3
            @Override // com.microblink.blinkid.metadata.detection.FailedDetectionCallback
            public void onDetectionFailed() {
                com.microblink.blinkid.fragment.overlay.basic.BasicOverlayController.this.getHighSpeedVideoSizesFor.clear();
                if (com.microblink.blinkid.fragment.overlay.basic.BasicOverlayController.this.getOutputStallDuration != null) {
                    com.microblink.blinkid.fragment.overlay.basic.BasicOverlayController.this.getOutputStallDuration.animateQuadToDefaultPosition();
                }
                if (com.microblink.blinkid.fragment.overlay.basic.BasicOverlayController.this.getOutputMinFrameDuration != null) {
                    com.microblink.blinkid.fragment.overlay.basic.BasicOverlayController.this.getOutputMinFrameDuration.updateStatus(com.microblink.blinkid.fragment.overlay.basic.BasicOverlayController.this.getOutputFormats.getMessage(com.microblink.blinkid.fragment.overlay.components.statusmsg.StatusMessageTranslator.Event.DETECTION_FAILED));
                }
            }
        });
        this.getHighResolutionOutputSizeshNQ4ISI.setQuadDetectionCallback(new com.microblink.blinkid.metadata.detection.quad.QuadDetectionCallback() { // from class: com.microblink.blinkid.fragment.overlay.basic.BasicOverlayController.4
            @Override // com.microblink.blinkid.metadata.detection.quad.QuadDetectionCallback
            public void onQuadDetection(com.microblink.blinkid.metadata.detection.quad.DisplayableQuadDetection displayableQuadDetection) {
                if (com.microblink.blinkid.fragment.overlay.basic.BasicOverlayController.this.getOutputStallDuration != null) {
                    com.microblink.blinkid.fragment.overlay.basic.BasicOverlayController.this.getOutputStallDuration.animateQuadToDetectionPosition(displayableQuadDetection);
                }
                if (com.microblink.blinkid.fragment.overlay.basic.BasicOverlayController.this.getOutputMinFrameDuration != null) {
                    com.microblink.blinkid.fragment.overlay.basic.BasicOverlayController.this.getOutputMinFrameDuration.updateStatus(com.microblink.blinkid.fragment.overlay.basic.BasicOverlayController.this.getOutputFormats.getMessage(com.microblink.blinkid.fragment.overlay.components.statusmsg.StatusMessageTranslator.Event.fromDetectionStatus(displayableQuadDetection.getDetectionStatus())));
                }
                com.microblink.blinkid.fragment.overlay.basic.BasicOverlayController.this.getHighSpeedVideoSizesFor.clear();
            }
        });
        this.getHighResolutionOutputSizeshNQ4ISI.setPointsDetectionCallback(new com.microblink.blinkid.metadata.detection.points.PointsDetectionCallback() { // from class: com.microblink.blinkid.fragment.overlay.basic.BasicOverlayController.5
            @Override // com.microblink.blinkid.metadata.detection.points.PointsDetectionCallback
            public void onPointsDetection(com.microblink.blinkid.metadata.detection.points.DisplayablePointsDetection displayablePointsDetection) {
                com.microblink.blinkid.fragment.overlay.basic.BasicOverlayController.this.getHighSpeedVideoSizesFor.onPointsDetection(displayablePointsDetection);
                if (com.microblink.blinkid.fragment.overlay.basic.BasicOverlayController.this.getOutputMinFrameDuration != null) {
                    com.microblink.blinkid.fragment.overlay.basic.BasicOverlayController.this.getOutputMinFrameDuration.updateStatus(com.microblink.blinkid.fragment.overlay.basic.BasicOverlayController.this.getOutputFormats.getMessage(com.microblink.blinkid.fragment.overlay.components.statusmsg.StatusMessageTranslator.Event.fromDetectionStatus(displayablePointsDetection.getDetectionStatus())));
                }
            }
        });
        com.microblink.blinkid.image.DebugImageListener debugImageListener = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
        if (debugImageListener != null) {
            this.getHighResolutionOutputSizeshNQ4ISI.setDebugImageCallback(debugImageListener);
        }
        com.microblink.blinkid.uisettings.options.OverlayOrientation overlayOrientation = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizesFor;
        if (overlayOrientation == null) {
            this.llIIIlllll.setInitialOrientation(getHighSpeedVideoSizes());
        } else {
            this.llIIIlllll.setInitialOrientation(overlayOrientation.toOrientation());
        }
        this.llIIIlllll.setOrientationAllowedListener(this.getOutputStallDurationlomOqCM);
        this.llIIIlllll.setOnActivityFlipListener(this.getHighSpeedVideoFpsRanges);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) recognizerRunnerFragment.getActivity().getLayoutInflater().inflate(this.getOutputSizes.layoutId, (android.view.ViewGroup) null);
        this.llIIIlllll.addChildView(viewGroup, false);
        if (this.getHighSpeedVideoFpsRangesFor.getRecognitionDebugMode() != com.microblink.blinkid.entities.recognizers.RecognizerBundle.RecognitionDebugMode.RECOGNITION) {
            new com.microblink.blinkid.fragment.overlay.components.debug.DebugViewHandler().initialize(recognizerRunnerFragment.getActivity(), viewGroup, this.getHighResolutionOutputSizeshNQ4ISI);
        }
        this.getOutputStallDuration = com.microblink.blinkid.view.viewfinder.quadview.QuadViewManagerFactory.createQuadViewFromPreset(this.llIIIlllll, this.Camera2StreamConfigurationMap.getOutputSizeshNQ4ISI);
        if (this.getHighSpeedVideoFpsRangesFor.getRecognitionDebugMode() == com.microblink.blinkid.entities.recognizers.RecognizerBundle.RecognitionDebugMode.DETECTION_TEST) {
            this.getOutputStallDuration.setAnimationDuration(0L);
        }
        android.view.View createView = this.getHighSpeedVideoSizesFor.createView(this.llIIIlllll, this.getHighResolutionOutputSizeshNQ4ISI);
        if (createView != null) {
            this.llIIIlllll.addChildView(createView, false);
        }
        this.IIlIIIllIl.setup((android.widget.ImageView) this.llIIIlllll.findViewById(this.getOutputSizes.torchButtonId), this.llIIIlllll);
        ((android.widget.ImageButton) this.llIIIlllll.findViewById(this.getOutputSizes.backButtonId)).setOnClickListener(new android.view.View.OnClickListener() { // from class: com.microblink.blinkid.fragment.overlay.basic.BasicOverlayController.1
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                com.microblink.blinkid.fragment.RecognizerRunnerFragment.this.getActivity().onBackPressed();
            }
        });
        android.widget.ImageButton imageButton = (android.widget.ImageButton) viewGroup.findViewById(this.getOutputSizes.helpButtonId);
        this.getHighSpeedVideoSizes = imageButton;
        imageButton.setVisibility(8);
        this.getHighSpeedVideoSizes.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.microblink.blinkid.fragment.overlay.basic.BasicOverlayController.2
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                if (com.microblink.blinkid.fragment.overlay.basic.BasicOverlayController.this.getInputSizeshNQ4ISI != null) {
                    com.microblink.blinkid.fragment.overlay.basic.BasicOverlayController.this.getInputSizeshNQ4ISI.run();
                }
            }
        });
        android.widget.TextSwitcher textSwitcher = (android.widget.TextSwitcher) viewGroup.findViewById(this.getOutputSizes.statusTextId);
        if (textSwitcher != null) {
            this.getOutputMinFrameDuration = new com.microblink.blinkid.fragment.overlay.components.statusmsg.StatusTextManager(textSwitcher, new com.microblink.blinkid.fragment.overlay.components.statusmsg.StatusTextStyler.Default(com.microblink.blinkid.library.R.style.MB_scan_status_text));
            textSwitcher.setVisibility(0);
            this.getOutputMinFrameDuration.updateStatus(this.getOutputFormats.getMessage(com.microblink.blinkid.fragment.overlay.components.statusmsg.StatusMessageTranslator.Event.INITIAL));
        }
        this.llIIIlllll.setMetadataCallbacks(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // com.microblink.blinkid.view.recognition.ScanResultListener
    public final void onScanningDone(final com.microblink.blinkid.recognition.RecognitionSuccessType recognitionSuccessType) {
        if (recognitionSuccessType == com.microblink.blinkid.recognition.RecognitionSuccessType.UNSUCCESSFUL) {
            return;
        }
        pauseScanning();
        if (this.Camera2StreamConfigurationMap.getOutputMinFrameDuration) {
            this.llIIIlllll.post(new java.lang.Runnable() { // from class: com.microblink.blinkid.fragment.overlay.basic.BasicOverlayController.6
                @Override // java.lang.Runnable
                public void run() {
                    com.microblink.blinkid.fragment.overlay.basic.BasicOverlayController.this.llIIIlllll.captureHighResImage(new com.microblink.blinkid.view.recognition.HighResImageListener() { // from class: com.microblink.blinkid.fragment.overlay.basic.BasicOverlayController.6.1
                        @Override // com.microblink.blinkid.view.recognition.HighResImageListener
                        public void onHighResImageAvailable(com.microblink.blinkid.image.highres.HighResImageWrapper highResImageWrapper) {
                            com.microblink.blinkid.fragment.overlay.basic.BasicOverlayController.this.llIIlIIlll.play();
                            com.microblink.blinkid.fragment.overlay.basic.BasicOverlayController.this.getInputFormats.addImage(highResImageWrapper);
                            com.microblink.blinkid.fragment.overlay.basic.BasicOverlayController.AnonymousClass6 anonymousClass6 = com.microblink.blinkid.fragment.overlay.basic.BasicOverlayController.AnonymousClass6.this;
                            com.microblink.blinkid.fragment.overlay.basic.BasicOverlayController.getHighResolutionOutputSizeshNQ4ISI(com.microblink.blinkid.fragment.overlay.basic.BasicOverlayController.this, recognitionSuccessType);
                            com.microblink.blinkid.fragment.overlay.basic.BasicOverlayController.this.llIIlIlIIl.onScanningDone(recognitionSuccessType);
                            com.microblink.blinkid.fragment.overlay.basic.BasicOverlayController.this.resumeScanning();
                        }
                    });
                }
            });
            return;
        }
        this.llIIlIIlll.play();
        if (this.getOutputMinFrameDuration != null) {
            this.getOutputMinFrameDuration.updateStatus(this.getOutputFormats.getMessage(com.microblink.blinkid.fragment.overlay.components.statusmsg.StatusMessageTranslator.Event.fromRecognitionSuccessType(recognitionSuccessType)));
        }
        this.llIIlIlIIl.onScanningDone(recognitionSuccessType);
        resumeScanning();
    }

    static void getHighResolutionOutputSizeshNQ4ISI(com.microblink.blinkid.fragment.overlay.basic.BasicOverlayController basicOverlayController, com.microblink.blinkid.recognition.RecognitionSuccessType recognitionSuccessType) {
        if (basicOverlayController.getOutputMinFrameDuration != null) {
            basicOverlayController.getOutputMinFrameDuration.updateStatus(basicOverlayController.getOutputFormats.getMessage(com.microblink.blinkid.fragment.overlay.components.statusmsg.StatusMessageTranslator.Event.fromRecognitionSuccessType(recognitionSuccessType)));
        }
    }

    @Override // com.microblink.blinkid.fragment.overlay.BaseOverlayController
    public final int IlIllIlIIl() {
        return this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges;
    }

    @Override // com.microblink.blinkid.fragment.overlay.BaseOverlayController
    public final void IllIIIIllI() {
        this.getHighSpeedVideoFpsRangesFor.clearSavedState();
        this.getInputFormats.clearSavedState();
        if (this.getInputSizeshNQ4ISI != null) {
            this.getHighSpeedVideoSizes.setVisibility(0);
        } else {
            this.getHighSpeedVideoSizes.setVisibility(4);
        }
        com.microblink.blinkid.fragment.overlay.components.statusmsg.StatusTextManager statusTextManager = this.getOutputMinFrameDuration;
        if (statusTextManager != null) {
            statusTextManager.updateStatus(this.getOutputFormats.getMessage(com.microblink.blinkid.fragment.overlay.components.statusmsg.StatusMessageTranslator.Event.INITIAL));
        }
    }

    @Override // com.microblink.blinkid.fragment.overlay.BaseOverlayController
    public final void IlIllIlIIl(android.os.Bundle bundle) {
        this.getHighSpeedVideoFpsRangesFor.saveState();
        this.getInputFormats.saveState();
    }

    @Override // com.microblink.blinkid.fragment.overlay.BaseOverlayController
    public final int llIIlIlIIl() {
        return this.Camera2StreamConfigurationMap.getInputFormats;
    }

    @Override // com.microblink.blinkid.fragment.overlay.BaseOverlayController
    public final void llIIlIlIIl(android.content.res.Configuration configuration) {
        com.microblink.blinkid.view.viewfinder.quadview.QuadViewManager quadViewManager = this.getOutputStallDuration;
        if (quadViewManager != null) {
            quadViewManager.configurationChanged(this.llIIIlllll, configuration);
        }
        this.getHighSpeedVideoSizesFor.onOrientationChange(this.llIIIlllll.getHostScreenOrientation());
    }
}
