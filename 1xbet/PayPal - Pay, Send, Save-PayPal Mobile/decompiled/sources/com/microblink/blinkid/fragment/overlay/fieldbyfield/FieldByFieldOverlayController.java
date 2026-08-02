package com.microblink.blinkid.fragment.overlay.fieldbyfield;

/* loaded from: classes10.dex */
public final class FieldByFieldOverlayController extends com.microblink.blinkid.fragment.overlay.BaseOverlayController implements com.microblink.blinkid.view.OnActivityFlipListener {
    private android.widget.EditText ArtificialStackFrames;
    private int Camera2StreamConfigurationMap;
    private android.view.View CoroutineDebuggingKt;
    private com.microblink.blinkid.ocr.SlidingTabLayout _CREATION;
    private android.widget.ImageButton accessartificialFrame;
    private com.microblink.blinkid.entities.processors.parserGroup.ParserGroupProcessor b;
    private final android.content.Intent coroutineBoundary;
    private android.widget.TextView coroutineCreation;
    private android.view.View getARTIFICIAL_FRAME_PACKAGE_NAME;
    private int getHighSpeedVideoFpsRangesFor;
    private final com.microblink.blinkid.image.SuccessfulImageListener getHighSpeedVideoSizes;
    private final com.microblink.blinkid.entities.parsers.config.fieldbyfield.FieldByFieldBundle getHighSpeedVideoSizesFor;
    private com.microblink.blinkid.entities.parsers.Parser.Result getInputFormats;
    private final com.microblink.blinkid.entities.parsers.config.fieldbyfield.FieldByFieldElement[] getInputSizeshNQ4ISI;
    private final boolean getOutputFormats;
    private android.graphics.RectF getOutputMinFrameDuration;
    private com.microblink.blinkid.entities.recognizers.blinkinput.BlinkInputRecognizer getOutputMinFrameDurationlomOqCM;
    private final java.util.HashSet getOutputSizes;
    private com.microblink.blinkid.ocr.RoiOverlayView getOutputSizeshNQ4ISI;
    private android.widget.FrameLayout getOutputStallDuration;
    private final com.microblink.blinkid.image.CurrentImageListener getOutputStallDurationlomOqCM;
    private final com.microblink.blinkid.metadata.MetadataCallbacks getValidOutputFormatsForInputhNQ4ISI;
    private final com.microblink.blinkid.entities.parsers.Parser.Result[] isOutputSupportedFor;
    private final com.microblink.blinkid.fragment.overlay.components.feedback.RecognitionFeedbackHandler isOutputSupportedForhNQ4ISI;
    private final com.microblink.blinkid.fragment.overlay.fieldbyfield.FieldByFieldOverlaySettings toString;
    private com.microblink.blinkid.entities.recognizers.successframe.SuccessFrameGrabberRecognizer unwrapAs;
    private static final android.graphics.RectF getHighSpeedVideoFpsRanges = new com.microblink.blinkid.geometry.Rectangle(0.05f, 0.34f, 0.9f, 0.15f).toRectF();
    private static final android.graphics.RectF getHighResolutionOutputSizeshNQ4ISI = new com.microblink.blinkid.geometry.Rectangle(0.1925f, 0.3f, 0.765f, 0.2f).toRectF();

    public FieldByFieldOverlayController(com.microblink.blinkid.fragment.overlay.fieldbyfield.FieldByFieldOverlaySettings fieldByFieldOverlaySettings, com.microblink.blinkid.view.recognition.ScanResultListener scanResultListener) {
        super(scanResultListener);
        this.getOutputSizes = new java.util.HashSet();
        this.Camera2StreamConfigurationMap = 0;
        this.getHighSpeedVideoFpsRangesFor = 1;
        com.microblink.blinkid.metadata.MetadataCallbacks metadataCallbacks = new com.microblink.blinkid.metadata.MetadataCallbacks();
        this.getValidOutputFormatsForInputhNQ4ISI = metadataCallbacks;
        this.toString = fieldByFieldOverlaySettings;
        com.microblink.blinkid.entities.parsers.config.fieldbyfield.FieldByFieldBundle fieldByFieldBundle = fieldByFieldOverlaySettings.getHighResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoSizesFor = fieldByFieldBundle;
        com.microblink.blinkid.entities.parsers.config.fieldbyfield.FieldByFieldElement[] elements = fieldByFieldBundle.getElements();
        this.getInputSizeshNQ4ISI = elements;
        this.isOutputSupportedFor = new com.microblink.blinkid.entities.parsers.Parser.Result[elements.length];
        this.coroutineBoundary = fieldByFieldOverlaySettings.getOutputFormats;
        com.microblink.blinkid.image.DebugImageListener debugImageListener = fieldByFieldOverlaySettings.getHighSpeedVideoFpsRangesFor;
        if (debugImageListener != null) {
            metadataCallbacks.setDebugImageCallback(debugImageListener);
        }
        this.getHighSpeedVideoSizes = fieldByFieldOverlaySettings.Camera2StreamConfigurationMap;
        this.getOutputStallDurationlomOqCM = fieldByFieldOverlaySettings.getInputFormats;
        this.isOutputSupportedForhNQ4ISI = com.microblink.blinkid.fragment.overlay.components.feedback.RecognitionFeedbackHandlerFactory.create(fieldByFieldOverlaySettings.getHighSpeedVideoSizesFor);
        this.getOutputFormats = fieldByFieldOverlaySettings.getHighSpeedVideoSizes;
    }

    static void getHighSpeedVideoSizes(com.microblink.blinkid.fragment.overlay.fieldbyfield.FieldByFieldOverlayController fieldByFieldOverlayController) {
        android.content.Intent intent = fieldByFieldOverlayController.coroutineBoundary;
        if (intent != null) {
            fieldByFieldOverlayController.IllIIIllII.startActivity(intent);
        }
    }

    static void getHighSpeedVideoSizesFor(com.microblink.blinkid.fragment.overlay.fieldbyfield.FieldByFieldOverlayController fieldByFieldOverlayController) {
        if (fieldByFieldOverlayController.getInputSizeshNQ4ISI[fieldByFieldOverlayController.Camera2StreamConfigurationMap].isOptional()) {
            fieldByFieldOverlayController.getOutputSizes.add(java.lang.Integer.valueOf(fieldByFieldOverlayController.Camera2StreamConfigurationMap));
            if (fieldByFieldOverlayController.getOutputFormats) {
                fieldByFieldOverlayController.Camera2StreamConfigurationMap = (fieldByFieldOverlayController.Camera2StreamConfigurationMap + 1) % fieldByFieldOverlayController.getInputSizeshNQ4ISI.length;
            } else {
                fieldByFieldOverlayController.Camera2StreamConfigurationMap();
            }
            fieldByFieldOverlayController._CREATION.getViewPager().setCurrentItem(fieldByFieldOverlayController.Camera2StreamConfigurationMap);
        }
    }

    static void getOutputSizes(com.microblink.blinkid.fragment.overlay.fieldbyfield.FieldByFieldOverlayController fieldByFieldOverlayController) {
        fieldByFieldOverlayController.IllIIIllII.getActivity().onBackPressed();
    }

    /* JADX WARN: Multi-variable type inference failed */
    static void getOutputSizeshNQ4ISI(com.microblink.blinkid.fragment.overlay.fieldbyfield.FieldByFieldOverlayController fieldByFieldOverlayController) {
        if (((com.microblink.blinkid.entities.parsers.Parser.Result) fieldByFieldOverlayController.getInputSizeshNQ4ISI[fieldByFieldOverlayController.Camera2StreamConfigurationMap].getParser().getResult()).getClass().isInstance(fieldByFieldOverlayController.getInputFormats)) {
            fieldByFieldOverlayController.isOutputSupportedFor[fieldByFieldOverlayController.Camera2StreamConfigurationMap] = fieldByFieldOverlayController.getInputFormats;
        }
        fieldByFieldOverlayController.getInputFormats = null;
        if (fieldByFieldOverlayController.getOutputFormats) {
            fieldByFieldOverlayController.Camera2StreamConfigurationMap = (fieldByFieldOverlayController.Camera2StreamConfigurationMap + 1) % fieldByFieldOverlayController.getInputSizeshNQ4ISI.length;
        } else {
            fieldByFieldOverlayController.Camera2StreamConfigurationMap();
        }
        fieldByFieldOverlayController._CREATION.getViewPager().setCurrentItem(fieldByFieldOverlayController.Camera2StreamConfigurationMap);
    }

    @Override // com.microblink.blinkid.fragment.overlay.BaseOverlayController
    public final boolean llIIlIIlll() {
        return true;
    }

    @Override // com.microblink.blinkid.fragment.overlay.BaseOverlayController
    public final int llIIlIlIIl() {
        return 0;
    }

    @Override // com.microblink.blinkid.view.OnActivityFlipListener
    public final void onActivityFlip() {
        com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView = this.llIIIlllll;
        if (recognizerRunnerView != null) {
            this.isOutputSupportedForhNQ4ISI.onOrientationChange(recognizerRunnerView.getHostScreenOrientation());
        }
    }

    @Override // com.microblink.blinkid.fragment.overlay.BaseOverlayController, com.microblink.blinkid.fragment.overlay.ScanningOverlay
    public final void onRecognizerRunnerFragmentAttached(com.microblink.blinkid.fragment.RecognizerRunnerFragment recognizerRunnerFragment, android.app.Activity activity) {
        super.onRecognizerRunnerFragmentAttached(recognizerRunnerFragment, activity);
        if (activity.getResources().getConfiguration().orientation == 2) {
            this.getOutputMinFrameDuration = getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRangesFor = 2;
        } else {
            this.getOutputMinFrameDuration = getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRangesFor = 1;
        }
        this.getOutputSizes.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.microblink.blinkid.fragment.overlay.BaseOverlayController, com.microblink.blinkid.fragment.overlay.ScanningOverlay
    public final void onRecognizerRunnerViewCreated(com.microblink.blinkid.fragment.RecognizerRunnerFragment recognizerRunnerFragment) {
        super.onRecognizerRunnerViewCreated(recognizerRunnerFragment);
        this.llIIIlllll.setOnActivityFlipListener(this);
        this.llIIIlllll.setShakeListener(new com.microblink.blinkid.hardware.accelerometer.ShakeCallback() { // from class: com.microblink.blinkid.fragment.overlay.fieldbyfield.FieldByFieldOverlayController.1
            @Override // com.microblink.blinkid.hardware.accelerometer.ShakeCallback
            public void onShakingStarted() {
            }

            @Override // com.microblink.blinkid.hardware.accelerometer.ShakeCallback
            public void onShakingStopped() {
                com.microblink.blinkid.fragment.overlay.fieldbyfield.FieldByFieldOverlayController.this.llIIIlllll.resetRecognitionState();
            }
        });
        this.toString.getInputSizeshNQ4ISI.apply(this.llIIIlllll);
        this.llIIIlllll.setOptimizeCameraForNearScan(true);
        android.view.View inflate = recognizerRunnerFragment.getActivity().getLayoutInflater().inflate(com.microblink.blinkid.resources.Layouts.lIIIIIllll, (android.view.ViewGroup) this.llIIIlllll, false);
        com.microblink.blinkid.ocr.RoiOverlayView roiOverlayView = (com.microblink.blinkid.ocr.RoiOverlayView) inflate.findViewById(com.microblink.blinkid.library.R.id.roi_overlay);
        this.getOutputSizeshNQ4ISI = roiOverlayView;
        this.coroutineCreation = (android.widget.TextView) roiOverlayView.findViewById(com.microblink.blinkid.library.R.id.txtMessage);
        this.getOutputStallDuration = (android.widget.FrameLayout) inflate.findViewById(com.microblink.blinkid.library.R.id.overlayContainer);
        getHighSpeedVideoSizes();
        if (this.coroutineBoundary != null) {
            this.accessartificialFrame.setVisibility(0);
        }
        com.microblink.blinkid.entities.parsers.config.fieldbyfield.FieldByFieldElement fieldByFieldElement = this.getInputSizeshNQ4ISI[this.Camera2StreamConfigurationMap];
        com.microblink.blinkid.entities.processors.parserGroup.ParserGroupProcessor parserGroupProcessor = new com.microblink.blinkid.entities.processors.parserGroup.ParserGroupProcessor(fieldByFieldElement.getParser());
        this.b = parserGroupProcessor;
        com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView = this.llIIIlllll;
        com.microblink.blinkid.entities.recognizers.blinkinput.BlinkInputRecognizer blinkInputRecognizer = new com.microblink.blinkid.entities.recognizers.blinkinput.BlinkInputRecognizer(parserGroupProcessor);
        this.getOutputMinFrameDurationlomOqCM = blinkInputRecognizer;
        this.unwrapAs = null;
        com.microblink.blinkid.entities.recognizers.blinkinput.BlinkInputRecognizer blinkInputRecognizer2 = blinkInputRecognizer;
        if (this.getHighSpeedVideoSizes != null) {
            com.microblink.blinkid.entities.recognizers.successframe.SuccessFrameGrabberRecognizer successFrameGrabberRecognizer = new com.microblink.blinkid.entities.recognizers.successframe.SuccessFrameGrabberRecognizer(this.getOutputMinFrameDurationlomOqCM);
            this.unwrapAs = successFrameGrabberRecognizer;
            blinkInputRecognizer2 = successFrameGrabberRecognizer;
        }
        recognizerRunnerView.setRecognizerBundle(this.getOutputStallDurationlomOqCM != null ? new com.microblink.blinkid.entities.recognizers.RecognizerBundle(blinkInputRecognizer2, new com.microblink.blinkid.entities.recognizers.framegrabber.FrameGrabberRecognizer(this.getOutputStallDurationlomOqCM)) : new com.microblink.blinkid.entities.recognizers.RecognizerBundle(blinkInputRecognizer2));
        com.microblink.blinkid.geometry.Rectangle Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(fieldByFieldElement.getScanRegionRelativeWidth(), fieldByFieldElement.getScanRegionRelativeHeight());
        com.microblink.blinkid.geometry.Rectangle Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(fieldByFieldElement.getShownScanRegionRelativeWidth(), fieldByFieldElement.getShownScanRegionRelativeHeight());
        this.llIIIlllll.setScanningRegion(Camera2StreamConfigurationMap, true);
        this.getOutputSizeshNQ4ISI.setScanningRegion(Camera2StreamConfigurationMap2);
        android.view.View createView = this.isOutputSupportedForhNQ4ISI.createView(this.llIIIlllll, this.getValidOutputFormatsForInputhNQ4ISI);
        if (createView != null) {
            this.llIIIlllll.addChildView(createView, false);
        }
        getHighSpeedVideoSizes(false, false);
        this.llIIIlllll.addChildView(inflate, false);
        this.llIIIlllll.setMetadataCallbacks(this.getValidOutputFormatsForInputhNQ4ISI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.microblink.blinkid.view.recognition.ScanResultListener
    public final void onScanningDone(com.microblink.blinkid.recognition.RecognitionSuccessType recognitionSuccessType) {
        com.microblink.blinkid.entities.recognizers.successframe.SuccessFrameGrabberRecognizer successFrameGrabberRecognizer;
        com.microblink.blinkid.image.Image successFrame;
        if (recognitionSuccessType != com.microblink.blinkid.recognition.RecognitionSuccessType.UNSUCCESSFUL) {
            com.microblink.blinkid.entities.parsers.Parser.Result result = (com.microblink.blinkid.entities.parsers.Parser.Result) this.getInputSizeshNQ4ISI[this.Camera2StreamConfigurationMap].getParser().getResult();
            if (result.getResultState() == com.microblink.blinkid.entities.parsers.Parser.Result.State.Valid) {
                final java.lang.String obj = result.toString();
                this.getInputFormats = result.mo10870clone();
                this.IllIIIIllI.post(new java.lang.Runnable() { // from class: com.microblink.blinkid.fragment.overlay.fieldbyfield.FieldByFieldOverlayController.2
                    @Override // java.lang.Runnable
                    public void run() {
                        com.microblink.blinkid.fragment.overlay.fieldbyfield.FieldByFieldOverlayController.this.ArtificialStackFrames.setText(obj.trim());
                        com.microblink.blinkid.fragment.overlay.fieldbyfield.FieldByFieldOverlayController.getHighSpeedVideoFpsRangesFor(com.microblink.blinkid.fragment.overlay.fieldbyfield.FieldByFieldOverlayController.this, true);
                        com.microblink.blinkid.fragment.overlay.fieldbyfield.FieldByFieldOverlayController.this.CoroutineDebuggingKt.requestFocus();
                    }
                });
                if (this.getHighSpeedVideoSizes == null || (successFrameGrabberRecognizer = this.unwrapAs) == null || (successFrame = ((com.microblink.blinkid.entities.recognizers.successframe.SuccessFrameGrabberRecognizer.Result) successFrameGrabberRecognizer.getResult()).getSuccessFrame()) == null) {
                    return;
                }
                this.getHighSpeedVideoSizes.onSuccessfulImageAvailable(successFrame);
            }
        }
    }

    private void Camera2StreamConfigurationMap() {
        int i = this.Camera2StreamConfigurationMap + 1;
        int length = this.getInputSizeshNQ4ISI.length;
        while (true) {
            int i2 = i % length;
            if (i2 == this.Camera2StreamConfigurationMap) {
                this.llIIIlllll.pauseScanning();
                int i3 = 0;
                while (true) {
                    com.microblink.blinkid.entities.parsers.config.fieldbyfield.FieldByFieldElement[] fieldByFieldElementArr = this.getInputSizeshNQ4ISI;
                    if (i3 >= fieldByFieldElementArr.length) {
                        this.llIIlIlIIl.onScanningDone(com.microblink.blinkid.recognition.RecognitionSuccessType.SUCCESSFUL);
                        this.llIIIlllll.resumeScanning(true);
                        return;
                    }
                    com.microblink.blinkid.entities.parsers.Parser.Result result = this.isOutputSupportedFor[i3];
                    if (result != null) {
                        fieldByFieldElementArr[i3].getParser().consumeResult(result);
                        this.isOutputSupportedFor[i3] = null;
                    } else {
                        fieldByFieldElementArr[i3].getParser().clearResult();
                    }
                    i3++;
                }
            } else if (!this.getOutputSizes.contains(java.lang.Integer.valueOf(i2)) && this.isOutputSupportedFor[i2] == null) {
                this.Camera2StreamConfigurationMap = i2;
                return;
            } else {
                i = i2 + 1;
                length = this.getInputSizeshNQ4ISI.length;
            }
        }
    }

    private void getHighSpeedVideoSizes() {
        this.getOutputStallDuration.findViewById(com.microblink.blinkid.library.R.id.defaultBackButton).setOnClickListener(new android.view.View.OnClickListener() { // from class: com.microblink.blinkid.fragment.overlay.fieldbyfield.FieldByFieldOverlayController.3
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                com.microblink.blinkid.fragment.overlay.fieldbyfield.FieldByFieldOverlayController.getOutputSizes(com.microblink.blinkid.fragment.overlay.fieldbyfield.FieldByFieldOverlayController.this);
            }
        });
        this.IIlIIIllIl.setup((android.widget.ImageButton) this.getOutputStallDuration.findViewById(com.microblink.blinkid.library.R.id.defaultTorchButton), this.llIIIlllll);
        android.widget.ImageButton imageButton = (android.widget.ImageButton) this.getOutputStallDuration.findViewById(com.microblink.blinkid.library.R.id.defaultHelpButton);
        this.accessartificialFrame = imageButton;
        imageButton.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.microblink.blinkid.fragment.overlay.fieldbyfield.FieldByFieldOverlayController.4
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                com.microblink.blinkid.fragment.overlay.fieldbyfield.FieldByFieldOverlayController.getHighSpeedVideoSizes(com.microblink.blinkid.fragment.overlay.fieldbyfield.FieldByFieldOverlayController.this);
            }
        });
        this.getOutputStallDuration.findViewById(com.microblink.blinkid.library.R.id.btnAccept).setOnClickListener(new android.view.View.OnClickListener() { // from class: com.microblink.blinkid.fragment.overlay.fieldbyfield.FieldByFieldOverlayController.5
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                com.microblink.blinkid.fragment.overlay.fieldbyfield.FieldByFieldOverlayController.getOutputSizeshNQ4ISI(com.microblink.blinkid.fragment.overlay.fieldbyfield.FieldByFieldOverlayController.this);
            }
        });
        android.view.View findViewById = this.getOutputStallDuration.findViewById(com.microblink.blinkid.library.R.id.laySkip);
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = findViewById;
        findViewById.findViewById(com.microblink.blinkid.library.R.id.btnSkip).setOnClickListener(new android.view.View.OnClickListener() { // from class: com.microblink.blinkid.fragment.overlay.fieldbyfield.FieldByFieldOverlayController.6
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                com.microblink.blinkid.fragment.overlay.fieldbyfield.FieldByFieldOverlayController.getHighSpeedVideoSizesFor(com.microblink.blinkid.fragment.overlay.fieldbyfield.FieldByFieldOverlayController.this);
            }
        });
        this.CoroutineDebuggingKt = this.getOutputStallDuration.findViewById(com.microblink.blinkid.library.R.id.layResult);
        android.widget.EditText editText = (android.widget.EditText) this.getOutputStallDuration.findViewById(com.microblink.blinkid.library.R.id.txtResult);
        this.ArtificialStackFrames = editText;
        editText.setKeyListener(null);
        androidx.viewpager.widget.ViewPager viewPager = (androidx.viewpager.widget.ViewPager) this.getOutputStallDuration.findViewById(com.microblink.blinkid.library.R.id.viewpager);
        viewPager.setAdapter(new com.microblink.blinkid.fragment.overlay.fieldbyfield.SamplePagerAdapter(getContext(), this.getInputSizeshNQ4ISI));
        com.microblink.blinkid.ocr.SlidingTabLayout slidingTabLayout = (com.microblink.blinkid.ocr.SlidingTabLayout) this.getOutputStallDuration.findViewById(com.microblink.blinkid.library.R.id.indicator);
        this._CREATION = slidingTabLayout;
        slidingTabLayout.setViewPager(viewPager);
        viewPager.setCurrentItem(this.Camera2StreamConfigurationMap);
        this._CREATION.setOnPageChangeListener(new androidx.viewpager.widget.ViewPager.OnPageChangeListener() { // from class: com.microblink.blinkid.fragment.overlay.fieldbyfield.FieldByFieldOverlayController.7
            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                if (com.microblink.blinkid.fragment.overlay.fieldbyfield.FieldByFieldOverlayController.this.IlIllIlIIl == com.microblink.blinkid.fragment.overlay.OverlayState.RESUMED || com.microblink.blinkid.fragment.overlay.fieldbyfield.FieldByFieldOverlayController.this.IlIllIlIIl == com.microblink.blinkid.fragment.overlay.OverlayState.STARTED) {
                    com.microblink.blinkid.fragment.overlay.fieldbyfield.FieldByFieldOverlayController.this.Camera2StreamConfigurationMap = i;
                    com.microblink.blinkid.fragment.overlay.fieldbyfield.FieldByFieldOverlayController.this.getHighSpeedVideoSizes(true, true);
                }
            }
        });
    }

    @Override // com.microblink.blinkid.fragment.overlay.BaseOverlayController
    public final int IlIllIlIIl() {
        return this.toString.getHighSpeedVideoFpsRanges;
    }

    @Override // com.microblink.blinkid.fragment.overlay.BaseOverlayController
    public final void IllIIIIllI() {
        this.getHighSpeedVideoSizesFor.clearSavedState();
    }

    @Override // com.microblink.blinkid.fragment.overlay.BaseOverlayController
    public final void lIlIIIIlIl() {
        this.llIIIlllll.setMeteringAreas(new android.graphics.RectF[]{this.getOutputMinFrameDuration}, true);
    }

    @Override // com.microblink.blinkid.fragment.overlay.BaseOverlayController
    public final void IlIllIlIIl(android.os.Bundle bundle) {
        boolean[] zArr = new boolean[this.isOutputSupportedFor.length];
        int i = 0;
        while (true) {
            com.microblink.blinkid.entities.parsers.Parser.Result[] resultArr = this.isOutputSupportedFor;
            if (i < resultArr.length) {
                com.microblink.blinkid.entities.parsers.Parser.Result result = resultArr[i];
                if (result != null) {
                    zArr[i] = true;
                    this.getInputSizeshNQ4ISI[i].getParser().consumeResult(result.mo10870clone());
                } else {
                    zArr[i] = false;
                    this.getInputSizeshNQ4ISI[i].getParser().clearResult();
                }
                i++;
            } else {
                this.getHighSpeedVideoSizesFor.saveState();
                bundle.putInt("FieldByFieldOverlayController.currentElement", this.Camera2StreamConfigurationMap);
                bundle.putBooleanArray("FieldByFieldOverlayController.acceptedResults", zArr);
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.microblink.blinkid.fragment.overlay.BaseOverlayController
    public final void llIIlIlIIl(android.os.Bundle bundle) {
        if (bundle != null) {
            this.Camera2StreamConfigurationMap = bundle.getInt("FieldByFieldOverlayController.currentElement", this.Camera2StreamConfigurationMap);
            boolean[] booleanArray = bundle.getBooleanArray("FieldByFieldOverlayController.acceptedResults");
            for (int i = 0; i < this.isOutputSupportedFor.length; i++) {
                com.microblink.blinkid.entities.parsers.Parser.Result result = (com.microblink.blinkid.entities.parsers.Parser.Result) this.getInputSizeshNQ4ISI[i].getParser().getResult();
                if (booleanArray[i] && result.getResultState() == com.microblink.blinkid.entities.parsers.Parser.Result.State.Valid) {
                    this.isOutputSupportedFor[i] = result.mo10870clone();
                }
            }
        }
    }

    @Override // com.microblink.blinkid.fragment.overlay.BaseOverlayController
    public final void llIIlIlIIl(android.content.res.Configuration configuration) {
        com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView = this.llIIIlllll;
        if (recognizerRunnerView != null) {
            this.isOutputSupportedForhNQ4ISI.onOrientationChange(recognizerRunnerView.getHostScreenOrientation());
            this.isOutputSupportedForhNQ4ISI.clear();
            int i = this.getHighSpeedVideoFpsRangesFor;
            int i2 = configuration.orientation;
            if (i == i2) {
                return;
            }
            this.getHighSpeedVideoFpsRangesFor = i2;
            if (i2 == 2) {
                this.getOutputMinFrameDuration = getHighResolutionOutputSizeshNQ4ISI;
            } else {
                this.getOutputMinFrameDuration = getHighSpeedVideoFpsRanges;
            }
            this.getOutputStallDuration.removeAllViews();
            this.IllIIIllII.getActivity().getLayoutInflater().inflate(com.microblink.blinkid.resources.Layouts.lllIIIlIlI, (android.view.ViewGroup) this.getOutputStallDuration, true);
            getHighSpeedVideoSizes();
            if (this.coroutineBoundary != null) {
                this.accessartificialFrame.setVisibility(0);
            }
            getHighSpeedVideoSizes(false, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void getHighSpeedVideoSizes(boolean z, boolean z2) {
        com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle;
        com.microblink.blinkid.entities.parsers.config.fieldbyfield.FieldByFieldElement fieldByFieldElement = this.getInputSizeshNQ4ISI[this.Camera2StreamConfigurationMap];
        final com.microblink.blinkid.geometry.Rectangle Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(fieldByFieldElement.getScanRegionRelativeWidth(), fieldByFieldElement.getScanRegionRelativeHeight());
        com.microblink.blinkid.geometry.Rectangle Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(fieldByFieldElement.getShownScanRegionRelativeWidth(), fieldByFieldElement.getShownScanRegionRelativeHeight());
        if (z) {
            com.microblink.blinkid.entities.processors.parserGroup.ParserGroupProcessor parserGroupProcessor = new com.microblink.blinkid.entities.processors.parserGroup.ParserGroupProcessor(fieldByFieldElement.getParser());
            this.b = parserGroupProcessor;
            com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView = this.llIIIlllll;
            com.microblink.blinkid.entities.recognizers.blinkinput.BlinkInputRecognizer blinkInputRecognizer = new com.microblink.blinkid.entities.recognizers.blinkinput.BlinkInputRecognizer(parserGroupProcessor);
            this.getOutputMinFrameDurationlomOqCM = blinkInputRecognizer;
            this.unwrapAs = null;
            com.microblink.blinkid.entities.recognizers.blinkinput.BlinkInputRecognizer blinkInputRecognizer2 = blinkInputRecognizer;
            if (this.getHighSpeedVideoSizes != null) {
                com.microblink.blinkid.entities.recognizers.successframe.SuccessFrameGrabberRecognizer successFrameGrabberRecognizer = new com.microblink.blinkid.entities.recognizers.successframe.SuccessFrameGrabberRecognizer(this.getOutputMinFrameDurationlomOqCM);
                this.unwrapAs = successFrameGrabberRecognizer;
                blinkInputRecognizer2 = successFrameGrabberRecognizer;
            }
            if (this.getOutputStallDurationlomOqCM != null) {
                recognizerBundle = new com.microblink.blinkid.entities.recognizers.RecognizerBundle(blinkInputRecognizer2, new com.microblink.blinkid.entities.recognizers.framegrabber.FrameGrabberRecognizer(this.getOutputStallDurationlomOqCM));
            } else {
                recognizerBundle = new com.microblink.blinkid.entities.recognizers.RecognizerBundle(blinkInputRecognizer2);
            }
            recognizerRunnerView.reconfigureRecognizers(recognizerBundle);
        }
        if (z2) {
            com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView2 = this.llIIIlllll;
            if (recognizerRunnerView2 != null) {
                recognizerRunnerView2.pauseScanning();
            }
            com.microblink.blinkid.ocr.RoiOverlayView roiOverlayView = this.getOutputSizeshNQ4ISI;
            if (roiOverlayView != null) {
                roiOverlayView.setScanningRegionAnimated(Camera2StreamConfigurationMap2, 500L, new com.microblink.blinkid.ocr.RoiOverlayView.RoiAnimationCallback() { // from class: com.microblink.blinkid.fragment.overlay.fieldbyfield.FieldByFieldOverlayController.9
                    @Override // com.microblink.blinkid.ocr.RoiOverlayView.RoiAnimationCallback
                    public void onAnimationFinish() {
                        if (com.microblink.blinkid.fragment.overlay.fieldbyfield.FieldByFieldOverlayController.this.llIIIlllll != null) {
                            com.microblink.blinkid.fragment.overlay.fieldbyfield.FieldByFieldOverlayController.this.llIIIlllll.setScanningRegion(Camera2StreamConfigurationMap, true);
                            com.microblink.blinkid.fragment.overlay.fieldbyfield.FieldByFieldOverlayController.this.llIIIlllll.resumeScanning(true);
                        }
                    }
                });
            } else {
                com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView3 = this.llIIIlllll;
                if (recognizerRunnerView3 != null) {
                    recognizerRunnerView3.setScanningRegion(Camera2StreamConfigurationMap, true);
                    this.llIIIlllll.resumeScanning(true);
                }
            }
        } else {
            com.microblink.blinkid.ocr.RoiOverlayView roiOverlayView2 = this.getOutputSizeshNQ4ISI;
            if (roiOverlayView2 != null) {
                roiOverlayView2.setScanningRegion(Camera2StreamConfigurationMap2);
            }
            com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView4 = this.llIIIlllll;
            if (recognizerRunnerView4 != null) {
                recognizerRunnerView4.setScanningRegion(Camera2StreamConfigurationMap, true);
            }
        }
        com.microblink.blinkid.entities.parsers.Parser.Result result = this.isOutputSupportedFor[this.Camera2StreamConfigurationMap];
        final java.lang.String obj = result != null ? result.toString() : null;
        final java.lang.String text = this.getInputSizeshNQ4ISI[this.Camera2StreamConfigurationMap].getText(getContext());
        this.IllIIIIllI.post(new java.lang.Runnable() { // from class: com.microblink.blinkid.fragment.overlay.fieldbyfield.FieldByFieldOverlayController.8
            @Override // java.lang.Runnable
            public void run() {
                java.lang.String str;
                com.microblink.blinkid.fragment.overlay.fieldbyfield.FieldByFieldOverlayController.this.coroutineCreation.setText(text);
                if (com.microblink.blinkid.fragment.overlay.fieldbyfield.FieldByFieldOverlayController.this.getOutputFormats || (str = obj) == null || str.isEmpty()) {
                    com.microblink.blinkid.fragment.overlay.fieldbyfield.FieldByFieldOverlayController.getHighSpeedVideoFpsRangesFor(com.microblink.blinkid.fragment.overlay.fieldbyfield.FieldByFieldOverlayController.this, false);
                } else {
                    com.microblink.blinkid.fragment.overlay.fieldbyfield.FieldByFieldOverlayController.getHighSpeedVideoFpsRangesFor(com.microblink.blinkid.fragment.overlay.fieldbyfield.FieldByFieldOverlayController.this, true);
                    com.microblink.blinkid.fragment.overlay.fieldbyfield.FieldByFieldOverlayController.this.ArtificialStackFrames.setText(obj);
                }
            }
        });
    }

    static void getHighSpeedVideoFpsRangesFor(com.microblink.blinkid.fragment.overlay.fieldbyfield.FieldByFieldOverlayController fieldByFieldOverlayController, boolean z) {
        if (z) {
            fieldByFieldOverlayController.CoroutineDebuggingKt.setVisibility(0);
            fieldByFieldOverlayController.getARTIFICIAL_FRAME_PACKAGE_NAME.setVisibility(8);
            fieldByFieldOverlayController.getARTIFICIAL_FRAME_PACKAGE_NAME.requestLayout();
        } else {
            fieldByFieldOverlayController.CoroutineDebuggingKt.setVisibility(4);
            if (fieldByFieldOverlayController.getInputSizeshNQ4ISI[fieldByFieldOverlayController.Camera2StreamConfigurationMap].isOptional()) {
                fieldByFieldOverlayController.getARTIFICIAL_FRAME_PACKAGE_NAME.setVisibility(0);
            } else {
                fieldByFieldOverlayController.getARTIFICIAL_FRAME_PACKAGE_NAME.setVisibility(8);
            }
        }
    }

    private com.microblink.blinkid.geometry.Rectangle Camera2StreamConfigurationMap(float f, float f2) {
        float width = this.getOutputMinFrameDuration.width() * f;
        float height = this.getOutputMinFrameDuration.height() * f2;
        float width2 = (this.getOutputMinFrameDuration.width() - width) / 2.0f;
        float height2 = (this.getOutputMinFrameDuration.height() - height) / 2.0f;
        android.graphics.RectF rectF = this.getOutputMinFrameDuration;
        return new com.microblink.blinkid.geometry.Rectangle(rectF.left + width2, rectF.top + height2, width, height);
    }
}
