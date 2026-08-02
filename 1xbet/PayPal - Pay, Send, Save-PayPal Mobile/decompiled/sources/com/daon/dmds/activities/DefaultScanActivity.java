package com.daon.dmds.activities;

/* loaded from: classes7.dex */
public class DefaultScanActivity extends androidx.appcompat.app.AppCompatActivity implements com.daon.dmds.managers.DMDSCustomScanListener, android.view.View.OnClickListener, com.daon.dmds.managers.DMDSDocumentQualityInfoListener, com.daon.dmds.managers.DMDSFaceQualityInfoListener {
    public static final java.lang.String ARG_SCANNING_REGION = "SCANNING_REGION";
    public static final int DMDS_CROPPING_RESULT = 1000;
    private static final java.lang.String getInputFormats = "DefaultScanActivity";
    com.daon.dmds.views.ScanRegionView Camera2StreamConfigurationMap;
    android.widget.Toast getHighResolutionOutputSizeshNQ4ISI;
    com.daon.dmds.models.DMDSOptions getHighSpeedVideoFpsRanges;
    android.widget.TextView getHighSpeedVideoFpsRangesFor;
    com.daon.dmds.views.DaonDocumentScanView getHighSpeedVideoSizes;
    private android.widget.TextView getHighSpeedVideoSizesFor;
    boolean getInputSizeshNQ4ISI;
    private android.view.View getOutputFormats;
    private android.view.View getOutputMinFrameDuration;
    private android.widget.ImageView getOutputMinFrameDurationlomOqCM;
    private android.widget.ImageView getOutputSizeshNQ4ISI;
    private android.widget.TextView getOutputStallDuration;
    private android.widget.TextView isOutputSupportedFor;
    private android.widget.TextView isOutputSupportedForhNQ4ISI;
    private com.daon.dmds.views.ScanDetectionView toString;
    private android.widget.TextView unwrapAs;
    private boolean getOutputSizes = false;
    private final java.lang.Runnable getValidOutputFormatsForInputhNQ4ISI = new java.lang.Runnable() { // from class: com.daon.dmds.activities.DefaultScanActivity$$ExternalSyntheticLambda2
        @Override // java.lang.Runnable
        public final void run() {
            android.widget.TextView textView = com.daon.dmds.activities.DefaultScanActivity.this.getHighSpeedVideoFpsRangesFor;
            if (textView != null) {
                textView.setText((java.lang.CharSequence) null);
            }
        }
    };
    private android.os.Handler accessartificialFrame = null;
    private com.daon.dmds.activities.DefaultScanActivity.ScanState getOutputStallDurationlomOqCM = com.daon.dmds.activities.DefaultScanActivity.ScanState.NOT_SCANNING;

    /* renamed from: com.daon.dmds.activities.DefaultScanActivity$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRangesFor;

        static {
            int[] iArr = new int[com.daon.dmds.models.DMDSDocumentDetectionStatus.values().length];
            getHighSpeedVideoFpsRangesFor = iArr;
            try {
                iArr[com.daon.dmds.models.DMDSDocumentDetectionStatus.DOCUMENT_TILTED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.daon.dmds.models.DMDSDocumentDetectionStatus.DOCUMENT_DOES_NOT_FILL_SCANNING_AREA.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.daon.dmds.models.DMDSDocumentDetectionStatus.DOCUMENT_TOO_CLOSE_TO_EDGE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.daon.dmds.models.DMDSDocumentDetectionStatus.DOCUMENT_TOO_CLOSE_TO_CAMERA.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.daon.dmds.models.DMDSDocumentDetectionStatus.BLUR_DETECTED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.daon.dmds.models.DMDSDocumentDetectionStatus.GLARE_DETECTED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.daon.dmds.models.DMDSDocumentDetectionStatus.WRONG_SIDE_DETECTED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.daon.dmds.models.DMDSDocumentDetectionStatus.FACE_NOT_FOUND.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.daon.dmds.models.DMDSDocumentDetectionStatus.FACE_QUALITY_FAILED.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.daon.dmds.models.DMDSDocumentDetectionStatus.DOCUMENT_QUALITY_FAILED.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.daon.dmds.models.DMDSDocumentDetectionStatus.NO_ERROR.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
        }
    }

    enum ScanState {
        SCANNING_IN_PROGRESS,
        NOT_SCANNING
    }

    private android.widget.TextView Camera2StreamConfigurationMap() {
        boolean z = getResources().getConfiguration().orientation == 2;
        android.widget.TextView textView = this.getHighSpeedVideoSizesFor;
        if (textView != null) {
            textView.setVisibility(z ? 4 : 0);
        } else {
            this.getHighSpeedVideoSizesFor = (android.widget.TextView) findViewById(com.daon.dmds.R.id.btn_cancel);
        }
        android.widget.TextView textView2 = this.getOutputStallDuration;
        if (textView2 != null) {
            textView2.setVisibility(z ? 0 : 4);
        } else {
            this.getOutputStallDuration = (android.widget.TextView) findViewById(com.daon.dmds.R.id.btn_cancel_land);
        }
        return z ? this.getOutputStallDuration : this.getHighSpeedVideoSizesFor;
    }

    private android.widget.ImageView getHighResolutionOutputSizeshNQ4ISI() {
        boolean z = getResources().getConfiguration().orientation == 2;
        android.widget.ImageView imageView = this.getOutputMinFrameDurationlomOqCM;
        if (imageView != null) {
            imageView.setVisibility(z ? 4 : 0);
        } else {
            this.getOutputMinFrameDurationlomOqCM = (android.widget.ImageView) findViewById(com.daon.dmds.R.id.btn_flashlight);
        }
        android.widget.ImageView imageView2 = this.getOutputSizeshNQ4ISI;
        if (imageView2 != null) {
            imageView2.setVisibility(z ? 0 : 4);
        } else {
            this.getOutputSizeshNQ4ISI = (android.widget.ImageView) findViewById(com.daon.dmds.R.id.btn_flashlight_land);
        }
        return z ? this.getOutputSizeshNQ4ISI : this.getOutputMinFrameDurationlomOqCM;
    }

    private void getHighSpeedVideoFpsRanges() {
        if (this.getOutputSizes) {
            getHighResolutionOutputSizeshNQ4ISI().setImageDrawable(androidx.core.content.ContextCompat.getDrawable(this, com.daon.dmds.R.drawable.flashlight_on));
        } else {
            getHighResolutionOutputSizeshNQ4ISI().setImageDrawable(androidx.core.content.ContextCompat.getDrawable(this, com.daon.dmds.R.drawable.flashlight_off));
        }
    }

    private android.widget.TextView getHighSpeedVideoFpsRangesFor() {
        boolean z = getResources().getConfiguration().orientation == 2;
        android.widget.TextView textView = this.unwrapAs;
        if (textView != null) {
            textView.setVisibility(z ? 4 : 0);
        } else {
            this.unwrapAs = (android.widget.TextView) findViewById(com.daon.dmds.R.id.btn_scan);
        }
        android.widget.TextView textView2 = this.isOutputSupportedForhNQ4ISI;
        if (textView2 != null) {
            textView2.setVisibility(z ? 0 : 4);
        } else {
            this.isOutputSupportedForhNQ4ISI = (android.widget.TextView) findViewById(com.daon.dmds.R.id.btn_scan_land);
        }
        return z ? this.isOutputSupportedForhNQ4ISI : this.unwrapAs;
    }

    static /* synthetic */ void getHighSpeedVideoSizes() {
    }

    public static void startActivityForResults(android.app.Activity activity, com.daon.dmds.models.DMDSOptions dMDSOptions, java.lang.Boolean bool, int i) {
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.daon.dmds.activities.DefaultScanActivity.class);
        intent.putExtra(com.daon.dmds.views.DaonDocumentScanView.DMDS_OPTIONS, dMDSOptions);
        intent.putExtra(ARG_SCANNING_REGION, bool);
        activity.startActivityForResult(intent, i);
    }

    @Override // com.daon.dmds.managers.DMDSCustomScanListener
    public void barcodeScanningStarted() {
        notificationMessage(getString(com.daon.dmds.R.string.zoom_to_barcode));
    }

    @Override // com.daon.dmds.managers.DMDSCustomScanListener
    public void detectionTimeOut(com.daon.dmds.models.DMDSError dMDSError) {
        this.getOutputStallDurationlomOqCM = com.daon.dmds.activities.DefaultScanActivity.ScanState.NOT_SCANNING;
        getHighSpeedVideoFpsRanges(true, getResources().getConfiguration().orientation);
        notificationMessage("");
        java.lang.String str = dMDSError.description;
        android.widget.TextView textView = this.getHighSpeedVideoFpsRangesFor;
        if (textView != null) {
            textView.setText(str);
        }
    }

    @Override // com.daon.dmds.managers.DMDSCustomScanListener
    public void documentDetected(com.daon.dmds.models.DMDSDocumentDetectionMetadata dMDSDocumentDetectionMetadata) {
        if (dMDSDocumentDetectionMetadata.getDetectionLocation() == null) {
            this.toString.setVisibility(8);
        } else if (this.getHighSpeedVideoFpsRanges.getUiOptions().isShowScanningFeedback()) {
            this.toString.setRect(dMDSDocumentDetectionMetadata.getDetectionLocation());
        }
    }

    @Override // com.daon.dmds.managers.DMDSCustomScanListener
    public void documentScanFailed(com.daon.dmds.models.DMDSError dMDSError) {
        this.getOutputStallDurationlomOqCM = com.daon.dmds.activities.DefaultScanActivity.ScanState.NOT_SCANNING;
    }

    @Override // com.daon.dmds.managers.DMDSCustomScanListener
    public void documentScanned(com.daon.dmds.models.DMDSResult dMDSResult) {
        this.getOutputStallDurationlomOqCM = com.daon.dmds.activities.DefaultScanActivity.ScanState.NOT_SCANNING;
        handleScanResult(dMDSResult);
        if (this.getHighSpeedVideoFpsRanges.getUiOptions().isPlayScanCompleteVisualAudioFeedback()) {
            com.daon.dmds.utils.DMDSDocumentUtils.startSoundVibrateNotification(this);
        }
        if (this.getHighSpeedVideoFpsRanges.getUiOptions().isShowScanCompleteVisualFeedback()) {
            boolean isDocTypeFromEdgeGroup = com.daon.dmds.utils.DMDSDocumentUtils.isDocTypeFromEdgeGroup(dMDSResult.getDocument().getDocumentType());
            boolean z = ((isDocTypeFromEdgeGroup && this.getHighSpeedVideoFpsRanges.getUiOptions().isAllowManualCroppingEdgeDetection()) || (!isDocTypeFromEdgeGroup && this.getHighSpeedVideoFpsRanges.getUiOptions().isAllowManualCroppingDocumentRecognition())) && !com.daon.dmds.utils.DMDSDocumentUtils.ignoreDocumentManualCropping(this.getHighSpeedVideoFpsRanges);
            this.getOutputStallDurationlomOqCM = com.daon.dmds.activities.DefaultScanActivity.ScanState.NOT_SCANNING;
            com.daon.dmds.activities.DMDSPreviewActivity.startActivityForResults(this, dMDSResult, this.getHighSpeedVideoFpsRanges, java.lang.Boolean.valueOf(z), 1000);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra(com.daon.dmds.views.DaonDocumentScanView.DMDS_RESULTS, dMDSResult);
        setResult(-1, intent);
        finish();
    }

    @Override // com.daon.dmds.managers.DMDSCustomScanListener
    public void documentScannedFailed(com.daon.dmds.models.DMDSError dMDSError, com.daon.dmds.models.DMDSResult dMDSResult) {
        com.daon.dmds.utils.DobsLogUtils.logError(getInputFormats, dMDSError.description);
        this.getOutputStallDurationlomOqCM = com.daon.dmds.activities.DefaultScanActivity.ScanState.NOT_SCANNING;
        if (!android.text.TextUtils.isEmpty(dMDSError.description)) {
            showMessage(dMDSError.description);
        }
        if (dMDSError.errorCode == com.daon.dmds.models.DMDSErrorCode.DMDSErrorCodeLicenseNotValid) {
            getHighSpeedVideoFpsRangesFor().setVisibility(8);
        }
    }

    @Override // com.daon.dmds.managers.DMDSCustomScanListener
    public void fallingBackToEdgeDetection() {
    }

    @Override // com.daon.dmds.managers.DMDSCustomScanListener
    public void firstSideRecognitionFinished(com.daon.dmds.models.DMDSRecognitionMode dMDSRecognitionMode) {
        notificationMessage(getString(com.daon.dmds.R.string.dmds_second_side, dMDSRecognitionMode.name()));
    }

    final void getHighSpeedVideoFpsRanges(boolean z, int i) {
        if ((this.getHighSpeedVideoFpsRanges.isAutoStartScanningEnabled() || this.getOutputStallDurationlomOqCM == com.daon.dmds.activities.DefaultScanActivity.ScanState.SCANNING_IN_PROGRESS) && !z) {
            this.getHighSpeedVideoSizes.resumeScanning(true);
        } else {
            getHighSpeedVideoFpsRangesFor().setVisibility(0);
        }
        if (!this.getHighSpeedVideoFpsRanges.getUiOptions().isShowCancelButton()) {
            Camera2StreamConfigurationMap().setVisibility(8);
        }
        if (getPackageManager().hasSystemFeature("android.hardware.camera.flash") && this.getHighSpeedVideoFpsRanges.getUiOptions().isShowTorchButton()) {
            getHighResolutionOutputSizeshNQ4ISI().setVisibility(0);
            getHighSpeedVideoFpsRanges();
        } else {
            getHighResolutionOutputSizeshNQ4ISI().setVisibility(8);
        }
        this.Camera2StreamConfigurationMap.setShowBoundary(this.getHighSpeedVideoFpsRanges.getUiOptions().isShowBoundary());
        this.Camera2StreamConfigurationMap.setBorderThickness(this.getHighSpeedVideoFpsRanges.getUiOptions().getRectangleCornerThickness());
        this.Camera2StreamConfigurationMap.setCornerLength(this.getHighSpeedVideoFpsRanges.getUiOptions().getRectangleCornerLength());
        this.Camera2StreamConfigurationMap.setScanningBorderColor(this.getHighSpeedVideoFpsRanges.getUiOptions().getScanningBorderColor());
        this.Camera2StreamConfigurationMap.setBoundaryColor(this.getHighSpeedVideoFpsRanges.getUiOptions().getRectangleColor());
        this.toString.setScanningDetectionColor(this.getHighSpeedVideoFpsRanges.getUiOptions().getOverlayColor());
        this.getOutputMinFrameDuration.setBackgroundColor(this.getHighSpeedVideoFpsRanges.getUiOptions().getBottomBarColor());
        this.getOutputFormats.setBackgroundColor(this.getHighSpeedVideoFpsRanges.getUiOptions().getBottomBarColor());
        Camera2StreamConfigurationMap().setTextColor(this.getHighSpeedVideoFpsRanges.getUiOptions().getCancelButtonTextColor());
        Camera2StreamConfigurationMap().setTextSize(2, this.getHighSpeedVideoFpsRanges.getUiOptions().getCancelButtonTextFontSize());
        this.isOutputSupportedFor.setTextColor(this.getHighSpeedVideoFpsRanges.getUiOptions().getMessageTextColor());
        this.isOutputSupportedFor.setTextSize(2, this.getHighSpeedVideoFpsRanges.getUiOptions().getMessageTextFontSize());
        java.lang.String instructionMessage = this.getHighSpeedVideoFpsRanges.getUiOptions().getInstructionMessage();
        if (android.text.TextUtils.isEmpty(instructionMessage) && this.getInputSizeshNQ4ISI) {
            instructionMessage = getString(com.daon.dmds.R.string.dmds_start);
        }
        android.widget.TextView textView = this.getHighSpeedVideoFpsRangesFor;
        if (textView != null) {
            textView.setText("");
        }
        notificationMessage(instructionMessage);
        if (this.getInputSizeshNQ4ISI) {
            this.Camera2StreamConfigurationMap.setVisibility(0);
        } else {
            this.Camera2StreamConfigurationMap.setVisibility(8);
        }
        android.view.View view = this.getOutputMinFrameDuration;
        if (view == null || this.getOutputFormats == null) {
            return;
        }
        boolean z2 = i == 2;
        view.setVisibility(z2 ? 8 : 0);
        this.getOutputFormats.setVisibility(z2 ? 0 : 8);
    }

    public void handleScanResult(com.daon.dmds.models.DMDSResult dMDSResult) {
    }

    @Override // com.daon.dmds.managers.DMDSCustomScanListener
    public void mrzDetected(com.daon.dmds.models.DMDSMrzDetectionMetadata dMDSMrzDetectionMetadata) {
    }

    @Override // com.daon.dmds.managers.DMDSCustomScanListener
    public void notificationMessage(java.lang.String str) {
        this.isOutputSupportedFor.setText(str);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, android.content.Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1000) {
            if (i2 == -1) {
                if (intent != null) {
                    setResult(-1, intent);
                } else {
                    setResult(0);
                }
                finish();
                return;
            }
            if (intent == null || !intent.getBooleanExtra(com.daon.dmds.views.DaonDocumentScanView.DMDS_CANCEL_SCANNING, false)) {
                recreate();
            } else {
                finish();
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        int id = view.getId();
        if (id == com.daon.dmds.R.id.btn_scan || id == com.daon.dmds.R.id.btn_scan_land) {
            this.getOutputStallDurationlomOqCM = com.daon.dmds.activities.DefaultScanActivity.ScanState.SCANNING_IN_PROGRESS;
            getHighSpeedVideoFpsRanges(false, getResources().getConfiguration().orientation);
            getHighSpeedVideoFpsRangesFor().setVisibility(8);
            this.getHighSpeedVideoSizes.startScanning();
            return;
        }
        if (id == com.daon.dmds.R.id.btn_cancel || id == com.daon.dmds.R.id.btn_cancel_land) {
            this.getOutputStallDurationlomOqCM = com.daon.dmds.activities.DefaultScanActivity.ScanState.NOT_SCANNING;
            finish();
        } else if (id == com.daon.dmds.R.id.btn_flashlight || id == com.daon.dmds.R.id.btn_flashlight_land) {
            boolean z = !this.getOutputSizes;
            this.getOutputSizes = z;
            this.getHighSpeedVideoSizes.setFlashState(z, new com.daon.dmds.managers.DMDSFlashStateChangeListener() { // from class: com.daon.dmds.activities.DefaultScanActivity$$ExternalSyntheticLambda0
                @Override // com.daon.dmds.managers.DMDSFlashStateChangeListener
                public final void onOperationDone(boolean z2) {
                    com.daon.dmds.activities.DefaultScanActivity.getHighSpeedVideoSizes();
                }
            });
            getHighSpeedVideoFpsRanges();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.view.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(final android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.daon.dmds.utils.DobsLogUtils.logDebug(getInputFormats, "onConfigurationChanged: ");
        new android.os.Handler().post(new java.lang.Runnable() { // from class: com.daon.dmds.activities.DefaultScanActivity$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                com.daon.dmds.activities.DefaultScanActivity defaultScanActivity = com.daon.dmds.activities.DefaultScanActivity.this;
                android.content.res.Configuration configuration2 = configuration;
                if (defaultScanActivity.getInputSizeshNQ4ISI) {
                    defaultScanActivity.getHighSpeedVideoSizes.post(new com.daon.dmds.activities.DefaultScanActivity$$ExternalSyntheticLambda1(defaultScanActivity));
                }
                defaultScanActivity.getHighSpeedVideoFpsRanges(false, configuration2.orientation);
            }
        });
        notificationMessage("");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.getHighSpeedVideoFpsRanges = (com.daon.dmds.models.DMDSOptions) getIntent().getParcelableExtra(com.daon.dmds.views.DaonDocumentScanView.DMDS_OPTIONS);
        this.getInputSizeshNQ4ISI = getIntent().getBooleanExtra(ARG_SCANNING_REGION, true);
        com.daon.dmds.models.DMDSOptions dMDSOptions = this.getHighSpeedVideoFpsRanges;
        if (dMDSOptions == null) {
            showMessage(com.daon.dmds.R.string.dmds_error_option_not_set);
            finish();
            return;
        }
        if (dMDSOptions.isAutoStartScanningEnabled()) {
            this.getOutputStallDurationlomOqCM = com.daon.dmds.activities.DefaultScanActivity.ScanState.SCANNING_IN_PROGRESS;
        }
        setContentView(com.daon.dmds.R.layout.activity_default);
        this.getHighSpeedVideoSizes = (com.daon.dmds.views.DaonDocumentScanView) findViewById(com.daon.dmds.R.id.scan_view);
        this.toString = (com.daon.dmds.views.ScanDetectionView) findViewById(com.daon.dmds.R.id.scanDetectView);
        this.Camera2StreamConfigurationMap = (com.daon.dmds.views.ScanRegionView) findViewById(com.daon.dmds.R.id.scanningRegionView);
        this.unwrapAs = (android.widget.TextView) findViewById(com.daon.dmds.R.id.btn_scan);
        this.getOutputMinFrameDuration = findViewById(com.daon.dmds.R.id.bottom_menu_bar);
        this.isOutputSupportedFor = (android.widget.TextView) findViewById(com.daon.dmds.R.id.notification_msg);
        this.getHighSpeedVideoFpsRangesFor = (android.widget.TextView) findViewById(com.daon.dmds.R.id.centerMsg);
        this.getHighSpeedVideoSizesFor = (android.widget.TextView) findViewById(com.daon.dmds.R.id.btn_cancel);
        this.getOutputMinFrameDurationlomOqCM = (android.widget.ImageView) findViewById(com.daon.dmds.R.id.btn_flashlight);
        this.unwrapAs.setOnClickListener(this);
        this.getHighSpeedVideoSizesFor.setOnClickListener(this);
        this.getOutputMinFrameDurationlomOqCM.setOnClickListener(this);
        this.isOutputSupportedForhNQ4ISI = (android.widget.TextView) findViewById(com.daon.dmds.R.id.btn_scan_land);
        this.getOutputStallDuration = (android.widget.TextView) findViewById(com.daon.dmds.R.id.btn_cancel_land);
        this.getOutputSizeshNQ4ISI = (android.widget.ImageView) findViewById(com.daon.dmds.R.id.btn_flashlight_land);
        this.getOutputFormats = findViewById(com.daon.dmds.R.id.bottom_menu_bar_land);
        this.isOutputSupportedForhNQ4ISI.setOnClickListener(this);
        this.getOutputStallDuration.setOnClickListener(this);
        this.getOutputSizeshNQ4ISI.setOnClickListener(this);
        if (this.getInputSizeshNQ4ISI) {
            this.getHighSpeedVideoSizes.post(new com.daon.dmds.activities.DefaultScanActivity$$ExternalSyntheticLambda1(this));
        }
        getHighSpeedVideoFpsRanges(false, getResources().getConfiguration().orientation);
        try {
            this.getHighSpeedVideoSizes.setLifecycle(getLifecycle());
            this.getHighSpeedVideoSizes.create(this.getHighSpeedVideoFpsRanges, this);
            com.daon.dmds.managers.DMDSMetadataProvider dMDSMetadataProvider = new com.daon.dmds.managers.DMDSMetadataProvider();
            dMDSMetadataProvider.setDocumentQualityInfoListener(this);
            dMDSMetadataProvider.setFaceQualityInfoListener(this);
            this.getHighSpeedVideoSizes.addMetadataProvider(dMDSMetadataProvider);
        } catch (java.lang.IllegalArgumentException e) {
            showMessage(com.daon.dmds.utils.DobsLogUtils.getStackTrace(e));
        }
    }

    @Override // com.daon.dmds.managers.DMDSDocumentQualityInfoListener
    @java.lang.Deprecated
    public void onDocumentQualityInfo(com.daon.dmds.models.DMDSDocumentQualityInfo dMDSDocumentQualityInfo) {
        java.lang.String str = getInputFormats;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("onDocumentQualityInfo: ");
        sb.append(dMDSDocumentQualityInfo.toString());
        com.daon.dmds.utils.DobsLogUtils.logDebug(str, sb.toString());
    }

    @Override // com.daon.dmds.managers.DMDSFaceQualityInfoListener
    @java.lang.Deprecated
    public void onFaceQualityInfo(com.daon.dmds.models.DMDSFaceQualityInfo dMDSFaceQualityInfo) {
        java.lang.String str = getInputFormats;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("onFaceQualityInfo: ");
        sb.append(dMDSFaceQualityInfo.toString());
        com.daon.dmds.utils.DobsLogUtils.logDebug(str, sb.toString());
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        notificationMessage("");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        java.lang.String instructionMessage = this.getHighSpeedVideoFpsRanges.getUiOptions().getInstructionMessage();
        if (android.text.TextUtils.isEmpty(instructionMessage) && this.getInputSizeshNQ4ISI) {
            instructionMessage = getString(com.daon.dmds.R.string.dmds_start);
        }
        android.widget.TextView textView = this.getHighSpeedVideoFpsRangesFor;
        if (textView != null) {
            textView.setText("");
        }
        notificationMessage(instructionMessage);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        if (this.accessartificialFrame == null) {
            this.accessartificialFrame = new android.os.Handler(android.os.Looper.getMainLooper());
        }
        this.accessartificialFrame.removeCallbacksAndMessages(null);
    }

    @Override // com.daon.dmds.managers.DMDSCustomScanListener
    public void orientationAboutToChange(com.daon.dmds.models.DMDSOrientation dMDSOrientation, com.daon.dmds.models.DMDSOrientation dMDSOrientation2) {
    }

    @Override // com.daon.dmds.managers.DMDSCustomScanListener
    public void orientationChange(com.daon.dmds.models.DMDSOrientation dMDSOrientation) {
    }

    public void showMessage(int i) {
        if (i == 0) {
            return;
        }
        showMessage(getString(i));
    }

    public void showMessage(final java.lang.String str) {
        runOnUiThread(new java.lang.Runnable() { // from class: com.daon.dmds.activities.DefaultScanActivity$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                com.daon.dmds.activities.DefaultScanActivity defaultScanActivity = com.daon.dmds.activities.DefaultScanActivity.this;
                java.lang.String str2 = str;
                android.widget.Toast toast = defaultScanActivity.getHighResolutionOutputSizeshNQ4ISI;
                if (toast != null) {
                    toast.cancel();
                }
                android.widget.Toast makeText = android.widget.Toast.makeText(defaultScanActivity, str2, 0);
                defaultScanActivity.getHighResolutionOutputSizeshNQ4ISI = makeText;
                makeText.show();
            }
        });
    }

    @Override // com.daon.dmds.managers.DMDSCustomScanListener
    public void documentDetectionStatus(com.daon.dmds.models.DMDSDocumentDetectionStatus dMDSDocumentDetectionStatus) {
        com.daon.dmds.utils.DobsLogUtils.logDebug(getInputFormats, "analyze status: ".concat(java.lang.String.valueOf(dMDSDocumentDetectionStatus)));
        switch (com.daon.dmds.activities.DefaultScanActivity.AnonymousClass1.getHighSpeedVideoFpsRangesFor[dMDSDocumentDetectionStatus.ordinal()]) {
            case 1:
                java.lang.String string = getString(com.daon.dmds.R.string.dmds_tilted_msg);
                android.widget.TextView textView = this.getHighSpeedVideoFpsRangesFor;
                if (textView != null) {
                    textView.setText(string);
                    break;
                }
                break;
            case 2:
                java.lang.String string2 = getString(com.daon.dmds.R.string.dmds_move_closer_msg);
                android.widget.TextView textView2 = this.getHighSpeedVideoFpsRangesFor;
                if (textView2 != null) {
                    textView2.setText(string2);
                    break;
                }
                break;
            case 3:
                java.lang.String string3 = getString(com.daon.dmds.R.string.dmds_move_further_from_edge_msg);
                android.widget.TextView textView3 = this.getHighSpeedVideoFpsRangesFor;
                if (textView3 != null) {
                    textView3.setText(string3);
                    break;
                }
                break;
            case 4:
                java.lang.String string4 = getString(com.daon.dmds.R.string.dmds_move_further_msg);
                android.widget.TextView textView4 = this.getHighSpeedVideoFpsRangesFor;
                if (textView4 != null) {
                    textView4.setText(string4);
                    break;
                }
                break;
            case 5:
                java.lang.String string5 = getString(com.daon.dmds.R.string.dmds_blur_detected_msg);
                android.widget.TextView textView5 = this.getHighSpeedVideoFpsRangesFor;
                if (textView5 != null) {
                    textView5.setText(string5);
                    break;
                }
                break;
            case 6:
                java.lang.String string6 = getString(com.daon.dmds.R.string.dmds_glare_detected_msg);
                android.widget.TextView textView6 = this.getHighSpeedVideoFpsRangesFor;
                if (textView6 != null) {
                    textView6.setText(string6);
                    break;
                }
                break;
            case 7:
                java.lang.String string7 = getString(com.daon.dmds.R.string.dmds_flip_document_msg);
                android.widget.TextView textView7 = this.getHighSpeedVideoFpsRangesFor;
                if (textView7 != null) {
                    textView7.setText(string7);
                    break;
                }
                break;
            case 8:
                java.lang.String string8 = getString(com.daon.dmds.R.string.dmds_face_not_found_msg);
                android.widget.TextView textView8 = this.getHighSpeedVideoFpsRangesFor;
                if (textView8 != null) {
                    textView8.setText(string8);
                    break;
                }
                break;
            case 9:
                java.lang.String string9 = getString(com.daon.dmds.R.string.dmds_face_quality_failed_msg);
                android.widget.TextView textView9 = this.getHighSpeedVideoFpsRangesFor;
                if (textView9 != null) {
                    textView9.setText(string9);
                    break;
                }
                break;
            case 10:
                java.lang.String string10 = getString(com.daon.dmds.R.string.dmds_document_quality_failed_msg);
                android.widget.TextView textView10 = this.getHighSpeedVideoFpsRangesFor;
                if (textView10 != null) {
                    textView10.setText(string10);
                    break;
                }
                break;
            case 11:
                android.widget.TextView textView11 = this.getHighSpeedVideoFpsRangesFor;
                if (textView11 != null) {
                    textView11.setText("");
                    break;
                }
                break;
        }
        if (this.accessartificialFrame == null) {
            this.accessartificialFrame = new android.os.Handler(android.os.Looper.getMainLooper());
        }
        this.accessartificialFrame.removeCallbacksAndMessages(null);
        if (this.accessartificialFrame == null) {
            this.accessartificialFrame = new android.os.Handler(android.os.Looper.getMainLooper());
        }
        this.accessartificialFrame.postDelayed(this.getValidOutputFormatsForInputhNQ4ISI, 1000L);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }
}
