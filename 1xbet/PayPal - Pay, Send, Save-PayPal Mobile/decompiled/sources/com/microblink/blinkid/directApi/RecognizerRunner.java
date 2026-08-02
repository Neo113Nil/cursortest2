package com.microblink.blinkid.directApi;

/* loaded from: classes9.dex */
public class RecognizerRunner {
    private static final com.microblink.blinkid.directApi.RecognizerRunner Camera2StreamConfigurationMap = new com.microblink.blinkid.directApi.RecognizerRunner();
    private final com.microblink.blinkid.directApi.RecognizerRunner.RecognitionLicenseAndErrorCallback getHighSpeedVideoSizes;
    private com.microblink.blinkid.directApi.RecognizerRunner.State getOutputFormats;
    private final com.microblink.blinkid.recognition.callback.RecognitionProcessCallback getOutputMinFrameDurationlomOqCM;
    private com.microblink.blinkid.recognition.NativeRecognizerWrapper getOutputSizes = null;
    private com.microblink.blinkid.view.recognition.ScanResultListener getHighSpeedVideoFpsRangesFor = null;
    private com.microblink.blinkid.directApi.DirectApiErrorListener getOutputMinFrameDuration = null;
    private com.microblink.blinkid.entities.recognizers.RecognizerBundle getInputSizeshNQ4ISI = null;
    private com.microblink.blinkid.recognition.FrameAnalyzers getHighSpeedVideoFpsRanges = null;
    private com.microblink.blinkid.hardware.MicroblinkDeviceManager getHighSpeedVideoSizesFor = null;
    private com.microblink.blinkid.metadata.MetadataCallbacks getOutputStallDuration = new com.microblink.blinkid.metadata.MetadataCallbacks();
    private long getHighResolutionOutputSizeshNQ4ISI = 1000000;
    private boolean getInputFormats = false;
    private android.content.Context getOutputStallDurationlomOqCM = null;

    public class RecognitionLicenseAndErrorCallback implements com.microblink.blinkid.secured.llIllIlIII, com.microblink.blinkid.secured.lIIllllIII, com.microblink.blinkid.secured.lIllIlllIl {
        RecognitionLicenseAndErrorCallback() {
        }

        @Override // com.microblink.blinkid.secured.lIllIlllIl
        public void onLicenseInformation(java.lang.String str) {
            if (com.microblink.blinkid.directApi.RecognizerRunner.this.getOutputStallDurationlomOqCM != null) {
                android.widget.Toast.makeText(com.microblink.blinkid.directApi.RecognizerRunner.this.getOutputStallDurationlomOqCM, str, 1).show();
            }
        }

        @Override // com.microblink.blinkid.secured.lIIllllIII
        public void onRecognitionDone(com.microblink.blinkid.recognition.RecognitionSuccessType recognitionSuccessType) {
            com.microblink.blinkid.directApi.RecognizerRunner.Camera2StreamConfigurationMap(com.microblink.blinkid.directApi.RecognizerRunner.this, recognitionSuccessType);
        }

        @Override // com.microblink.blinkid.secured.lIIllllIII
        public void onRecognitionDoneWithTimeout(com.microblink.blinkid.recognition.RecognitionSuccessType recognitionSuccessType) {
            com.microblink.blinkid.directApi.RecognizerRunner.Camera2StreamConfigurationMap(com.microblink.blinkid.directApi.RecognizerRunner.this, recognitionSuccessType);
        }

        @Override // com.microblink.blinkid.secured.llIllIlIII
        public void onRecognizerError(java.lang.Throwable th) {
            com.microblink.blinkid.directApi.RecognizerRunner.this.getOutputMinFrameDuration.onRecognizerError(th);
            synchronized (com.microblink.blinkid.directApi.RecognizerRunner.this) {
                if (com.microblink.blinkid.directApi.RecognizerRunner.this.getOutputFormats == com.microblink.blinkid.directApi.RecognizerRunner.State.WORKING) {
                    com.microblink.blinkid.directApi.RecognizerRunner.this.getOutputFormats = com.microblink.blinkid.directApi.RecognizerRunner.State.READY;
                }
            }
        }
    }

    public enum State {
        OFFLINE,
        READY,
        WORKING
    }

    private RecognizerRunner() {
        com.microblink.blinkid.directApi.RecognizerRunner.RecognitionLicenseAndErrorCallback recognitionLicenseAndErrorCallback = new com.microblink.blinkid.directApi.RecognizerRunner.RecognitionLicenseAndErrorCallback();
        this.getHighSpeedVideoSizes = recognitionLicenseAndErrorCallback;
        this.getOutputMinFrameDurationlomOqCM = new com.microblink.blinkid.recognition.callback.RecognitionProcessCallback(recognitionLicenseAndErrorCallback, this.getOutputStallDuration, com.microblink.blinkid.geometry.Rectangle.getDefaultROI(), com.microblink.blinkid.entities.recognizers.RecognizerBundle.RecognitionDebugMode.RECOGNITION);
        this.getOutputFormats = com.microblink.blinkid.directApi.RecognizerRunner.State.OFFLINE;
    }

    public static com.microblink.blinkid.directApi.RecognizerRunner getSingletonInstance() {
        return Camera2StreamConfigurationMap;
    }

    public void cancel() {
        synchronized (this) {
            if (this.getOutputFormats == com.microblink.blinkid.directApi.RecognizerRunner.State.WORKING) {
                this.getOutputMinFrameDurationlomOqCM.getCancelDelegate().llIIlIlIIl(true);
                this.getOutputFormats = com.microblink.blinkid.directApi.RecognizerRunner.State.READY;
            }
        }
    }

    public final com.microblink.blinkid.directApi.RecognizerRunner.State getCurrentState() {
        com.microblink.blinkid.directApi.RecognizerRunner.State state;
        synchronized (this) {
            state = this.getOutputFormats;
        }
        return state;
    }

    public final void initialize(android.content.Context context, com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle, com.microblink.blinkid.directApi.DirectApiErrorListener directApiErrorListener) {
        synchronized (this) {
            if (this.getOutputFormats != com.microblink.blinkid.directApi.RecognizerRunner.State.OFFLINE) {
                throw new java.lang.IllegalStateException("Cannot initialize already initialized recognizer!");
            }
            if (context == null) {
                throw new java.lang.NullPointerException("Context cannot be null");
            }
            if (directApiErrorListener == null) {
                throw new java.lang.NullPointerException("Error listener cannot be null!");
            }
            if (recognizerBundle == null) {
                recognizerBundle = new com.microblink.blinkid.entities.recognizers.RecognizerBundle(new com.microblink.blinkid.entities.recognizers.Recognizer[0]);
            }
            com.microblink.blinkid.entities.recognizers.Recognizer<com.microblink.blinkid.entities.recognizers.Recognizer.Result>[] recognizers = recognizerBundle.getRecognizers();
            if (recognizers == null || recognizers.length == 0) {
                throw new java.lang.NullPointerException("RecognizerRunner recognizer array inside RecognizerBundle cannot be null nor empty!");
            }
            if (com.microblink.blinkid.settings.NativeLibraryInfo.isProtectionEnabled() && !com.microblink.blinkid.recognition.RightsManager.llIIlIlIIl(com.microblink.blinkid.recognition.Right.ALLOW_CUSTOM_UI)) {
                com.microblink.blinkid.util.Log.e(this, "Direct API requires license key that allows creation of custom UI!", new java.lang.Object[0]);
                throw new com.microblink.blinkid.licence.exception.InvalidLicenceKeyException("Direct API requires license key that allows creation of custom UI!");
            }
            this.getInputSizeshNQ4ISI = recognizerBundle;
            this.getOutputMinFrameDuration = directApiErrorListener;
            this.getOutputSizes = com.microblink.blinkid.recognition.NativeRecognizerWrapper.IllIIlIIII;
            this.getOutputStallDurationlomOqCM = context;
            this.getHighSpeedVideoSizesFor = com.microblink.blinkid.hardware.MicroblinkDeviceManager.llIIlIlIIl(context);
            com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle2 = this.getInputSizeshNQ4ISI;
            com.microblink.blinkid.secured.lllllllIIl llIIlIlIIl = this.getHighSpeedVideoSizesFor.llIIlIlIIl();
            this.getHighSpeedVideoFpsRanges = new com.microblink.blinkid.recognition.FrameAnalyzers(recognizerBundle2, llIIlIlIIl != null ? llIIlIlIIl.llIIlIlIIl : 1.0d);
            if (com.microblink.blinkid.settings.NativeLibraryInfo.isProtectionEnabled() && !com.microblink.blinkid.recognition.RightsManager.llIIlIlIIl(com.microblink.blinkid.recognition.Right.ALLOW_REMOVE_DEMO_OVERLAY)) {
                android.widget.Toast.makeText(this.getOutputStallDurationlomOqCM, "Powered by Microblink SDK", 1).show();
            }
            this.getOutputSizes.llIIlIlIIl(context, recognizerBundle, this.getHighSpeedVideoSizes);
            this.getOutputFormats = com.microblink.blinkid.directApi.RecognizerRunner.State.READY;
        }
    }

    public final void recognizeBitmap(android.graphics.Bitmap bitmap, com.microblink.blinkid.hardware.orientation.Orientation orientation, com.microblink.blinkid.view.recognition.ScanResultListener scanResultListener) {
        recognizeBitmapWithRecognizers(bitmap, orientation, new com.microblink.blinkid.geometry.Rectangle(0.0f, 0.0f, 1.0f, 1.0f), scanResultListener, this.getInputSizeshNQ4ISI);
    }

    public final void recognizeBitmapWithRecognizers(android.graphics.Bitmap bitmap, com.microblink.blinkid.hardware.orientation.Orientation orientation, com.microblink.blinkid.view.recognition.ScanResultListener scanResultListener, com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle) {
        recognizeBitmapWithRecognizers(bitmap, orientation, new com.microblink.blinkid.geometry.Rectangle(0.0f, 0.0f, 1.0f, 1.0f), scanResultListener, recognizerBundle);
    }

    public final void recognizeStillImage(com.microblink.blinkid.image.InputImage inputImage, com.microblink.blinkid.view.recognition.ScanResultListener scanResultListener) {
        getHighResolutionOutputSizeshNQ4ISI(inputImage, false, scanResultListener, this.getInputSizeshNQ4ISI);
    }

    public final void recognizeStillImageWithRecognizers(com.microblink.blinkid.image.InputImage inputImage, com.microblink.blinkid.view.recognition.ScanResultListener scanResultListener, com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle) {
        getHighResolutionOutputSizeshNQ4ISI(inputImage, false, scanResultListener, recognizerBundle);
    }

    public final void recognizeString(java.lang.String str, com.microblink.blinkid.view.recognition.ScanResultListener scanResultListener) {
        recognizeStringWithRecognizers(str, scanResultListener, this.getInputSizeshNQ4ISI);
    }

    public final void recognizeStringWithRecognizers(java.lang.String str, com.microblink.blinkid.view.recognition.ScanResultListener scanResultListener, com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle) {
        if (this.getOutputFormats != com.microblink.blinkid.directApi.RecognizerRunner.State.READY) {
            throw new java.lang.IllegalStateException("Cannot recognize string. RecognizerRunner not ready!");
        }
        if (scanResultListener == null) {
            throw new java.lang.NullPointerException("Result listener cannot be null!");
        }
        if (recognizerBundle != this.getInputSizeshNQ4ISI) {
            if (recognizerBundle == null) {
                recognizerBundle = new com.microblink.blinkid.entities.recognizers.RecognizerBundle(new com.microblink.blinkid.entities.recognizers.Recognizer[0]);
            }
            com.microblink.blinkid.entities.recognizers.Recognizer<com.microblink.blinkid.entities.recognizers.Recognizer.Result>[] recognizers = recognizerBundle.getRecognizers();
            if (recognizers == null || recognizers.length == 0) {
                throw new java.lang.NullPointerException("RecognizerRunner recognizer array inside RecognizerBundle cannot be null nor empty!");
            }
        }
        com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle2 = recognizerBundle;
        this.getHighSpeedVideoFpsRangesFor = scanResultListener;
        this.getOutputMinFrameDurationlomOqCM.getCancelDelegate().llIIlIlIIl(false);
        this.getOutputSizes.IIlIIIllIl.set(false);
        com.microblink.blinkid.recognition.NativeRecognizerWrapper nativeRecognizerWrapper = this.getOutputSizes;
        com.microblink.blinkid.recognition.callback.RecognitionProcessCallback recognitionProcessCallback = this.getOutputMinFrameDurationlomOqCM;
        com.microblink.blinkid.directApi.RecognizerRunner.RecognitionLicenseAndErrorCallback recognitionLicenseAndErrorCallback = this.getHighSpeedVideoSizes;
        com.microblink.blinkid.secured.IlIlIlIIIl ilIlIlIIIl = nativeRecognizerWrapper.IllIIIIllI;
        if (ilIlIlIIIl != null) {
            ilIlIlIIIl.llIIlIlIIl(new com.microblink.blinkid.secured.llIlllIIll(nativeRecognizerWrapper, recognizerBundle2, recognitionLicenseAndErrorCallback, str, recognitionProcessCallback, recognitionLicenseAndErrorCallback));
        } else {
            com.microblink.blinkid.util.Log.wtf(nativeRecognizerWrapper, "Processing thread is null! Unable to perform recognition!", new java.lang.Object[0]);
        }
        this.getOutputFormats = com.microblink.blinkid.directApi.RecognizerRunner.State.WORKING;
        this.getInputFormats = false;
    }

    public final void recognizeVideoBitmap(android.graphics.Bitmap bitmap, com.microblink.blinkid.hardware.orientation.Orientation orientation, com.microblink.blinkid.view.recognition.ScanResultListener scanResultListener) {
        recognizeVideoBitmapWithRecognizers(bitmap, orientation, new com.microblink.blinkid.geometry.Rectangle(0.0f, 0.0f, 1.0f, 1.0f), scanResultListener, this.getInputSizeshNQ4ISI);
    }

    public final void recognizeVideoBitmapWithRecognizers(android.graphics.Bitmap bitmap, com.microblink.blinkid.hardware.orientation.Orientation orientation, com.microblink.blinkid.view.recognition.ScanResultListener scanResultListener, com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle) {
        recognizeVideoBitmapWithRecognizers(bitmap, orientation, new com.microblink.blinkid.geometry.Rectangle(0.0f, 0.0f, 1.0f, 1.0f), scanResultListener, recognizerBundle);
    }

    public final void recognizeVideoImage(com.microblink.blinkid.image.InputImage inputImage, com.microblink.blinkid.view.recognition.ScanResultListener scanResultListener) {
        getHighResolutionOutputSizeshNQ4ISI(inputImage, true, scanResultListener, this.getInputSizeshNQ4ISI);
    }

    public final void recognizeVideoImageWithRecognizers(com.microblink.blinkid.image.InputImage inputImage, com.microblink.blinkid.view.recognition.ScanResultListener scanResultListener, com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle) {
        getHighResolutionOutputSizeshNQ4ISI(inputImage, true, scanResultListener, recognizerBundle);
    }

    public final void resetRecognitionState() {
        resetRecognitionState(true);
    }

    public void setMetadataCallbacks(com.microblink.blinkid.metadata.MetadataCallbacks metadataCallbacks) {
        if (metadataCallbacks == null) {
            metadataCallbacks = new com.microblink.blinkid.metadata.MetadataCallbacks();
        }
        this.getOutputStallDuration = metadataCallbacks;
        this.getOutputMinFrameDurationlomOqCM.setMetadataCallbacks(metadataCallbacks);
    }

    public void terminate() {
        synchronized (this) {
            com.microblink.blinkid.directApi.RecognizerRunner.State state = this.getOutputFormats;
            com.microblink.blinkid.directApi.RecognizerRunner.State state2 = com.microblink.blinkid.directApi.RecognizerRunner.State.OFFLINE;
            if (state != state2) {
                this.getOutputMinFrameDurationlomOqCM.getCancelDelegate().llIIlIlIIl(true);
                this.getOutputSizes.llIIlIlIIl();
                this.getOutputFormats = state2;
                this.getOutputSizes = null;
                this.getInputSizeshNQ4ISI = null;
                this.getHighSpeedVideoFpsRangesFor = null;
                this.getOutputMinFrameDuration = null;
                this.getOutputStallDuration = new com.microblink.blinkid.metadata.MetadataCallbacks();
                this.getHighSpeedVideoFpsRanges.llIIlIlIIl();
                this.getHighSpeedVideoFpsRanges = null;
                this.getOutputStallDurationlomOqCM = null;
                this.getOutputMinFrameDurationlomOqCM.setMetadataCallbacks(this.getOutputStallDuration);
            }
        }
    }

    public final void recognizeBitmap(android.graphics.Bitmap bitmap, com.microblink.blinkid.hardware.orientation.Orientation orientation, com.microblink.blinkid.geometry.Rectangle rectangle, com.microblink.blinkid.view.recognition.ScanResultListener scanResultListener) {
        recognizeBitmapWithRecognizers(bitmap, orientation, rectangle, scanResultListener, this.getInputSizeshNQ4ISI);
    }

    public final void recognizeBitmapWithRecognizers(android.graphics.Bitmap bitmap, com.microblink.blinkid.hardware.orientation.Orientation orientation, com.microblink.blinkid.geometry.Rectangle rectangle, com.microblink.blinkid.view.recognition.ScanResultListener scanResultListener, com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle) {
        synchronized (this) {
            if (this.getOutputFormats != com.microblink.blinkid.directApi.RecognizerRunner.State.READY) {
                throw new java.lang.IllegalStateException("Cannot recognize image. RecognizerRunner not ready!");
            }
            if (scanResultListener == null) {
                throw new java.lang.NullPointerException("Result listener cannot be null!");
            }
            if (rectangle == null) {
                throw new java.lang.NullPointerException("Scan region cannot be null!");
            }
            if (orientation == null || orientation == com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_UNKNOWN) {
                throw new java.lang.IllegalArgumentException("Bitmap orientation cannot be null nor unknown!");
            }
            if (!rectangle.isRelative()) {
                throw new java.lang.IllegalArgumentException("Scanning region must be given in relative coordinates, i.e. following must hold true: x + width <= 1.f && y + height <= 1.f");
            }
            if (recognizerBundle != this.getInputSizeshNQ4ISI) {
                if (recognizerBundle == null) {
                    recognizerBundle = new com.microblink.blinkid.entities.recognizers.RecognizerBundle(new com.microblink.blinkid.entities.recognizers.Recognizer[0]);
                }
                com.microblink.blinkid.entities.recognizers.Recognizer<com.microblink.blinkid.entities.recognizers.Recognizer.Result>[] recognizers = recognizerBundle.getRecognizers();
                if (recognizers == null || recognizers.length == 0) {
                    throw new java.lang.NullPointerException("RecognizerRunner recognizer array inside RecognizerBundle cannot be null nor empty!");
                }
            }
            com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle2 = recognizerBundle;
            this.getHighSpeedVideoFpsRangesFor = scanResultListener;
            this.getOutputMinFrameDurationlomOqCM.getCancelDelegate().llIIlIlIIl(false);
            this.getOutputSizes.IIlIIIllIl.set(false);
            this.getOutputMinFrameDurationlomOqCM.setScanningRegion(rectangle);
            this.getHighSpeedVideoFpsRanges.llIIlIlIIl(this.getInputSizeshNQ4ISI);
            com.microblink.blinkid.recognition.NativeRecognizerWrapper nativeRecognizerWrapper = this.getOutputSizes;
            long j = this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighResolutionOutputSizeshNQ4ISI = 1 + j;
            com.microblink.blinkid.hardware.camera.memory.BitmapCameraFrame bitmapCameraFrame = new com.microblink.blinkid.hardware.camera.memory.BitmapCameraFrame(bitmap, j, true);
            android.graphics.RectF rectF = rectangle.toRectF();
            bitmapCameraFrame.IllIIIllII = rectF;
            com.microblink.blinkid.secured.lIIlIIllII.llIIlIlIIl(rectF);
            bitmapCameraFrame.lIlIIIIlIl = orientation;
            if (!bitmapCameraFrame.llIIlIlIIl(this.getHighSpeedVideoFpsRanges.llIIlIlIIl)) {
                bitmapCameraFrame.IlIllIlIIl();
                throw new java.lang.RuntimeException("Failed to process given bitmap. See ADB log for more info.");
            }
            com.microblink.blinkid.recognition.callback.RecognitionProcessCallback recognitionProcessCallback = this.getOutputMinFrameDurationlomOqCM;
            com.microblink.blinkid.directApi.RecognizerRunner.RecognitionLicenseAndErrorCallback recognitionLicenseAndErrorCallback = this.getHighSpeedVideoSizes;
            nativeRecognizerWrapper.llIIlIlIIl(bitmapCameraFrame, recognizerBundle2, recognitionProcessCallback, recognitionLicenseAndErrorCallback, recognitionLicenseAndErrorCallback, true);
            this.getOutputFormats = com.microblink.blinkid.directApi.RecognizerRunner.State.WORKING;
            this.getInputFormats = false;
        }
    }

    public final void recognizeVideoBitmap(android.graphics.Bitmap bitmap, com.microblink.blinkid.hardware.orientation.Orientation orientation, com.microblink.blinkid.geometry.Rectangle rectangle, com.microblink.blinkid.view.recognition.ScanResultListener scanResultListener) {
        recognizeVideoBitmapWithRecognizers(bitmap, orientation, rectangle, scanResultListener, this.getInputSizeshNQ4ISI);
    }

    public final void recognizeVideoBitmapWithRecognizers(android.graphics.Bitmap bitmap, com.microblink.blinkid.hardware.orientation.Orientation orientation, com.microblink.blinkid.geometry.Rectangle rectangle, com.microblink.blinkid.view.recognition.ScanResultListener scanResultListener, com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle) {
        synchronized (this) {
            if (this.getOutputFormats != com.microblink.blinkid.directApi.RecognizerRunner.State.READY) {
                throw new java.lang.IllegalStateException("Cannot recognize image. RecognizerRunner not ready!");
            }
            if (scanResultListener == null) {
                throw new java.lang.NullPointerException("Result listener cannot be null!");
            }
            if (rectangle == null) {
                throw new java.lang.NullPointerException("Scan region cannot be null!");
            }
            if (orientation == null || orientation == com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_UNKNOWN) {
                throw new java.lang.IllegalArgumentException("Bitmap orientation cannot be null nor unknown!");
            }
            if (!rectangle.isRelative()) {
                throw new java.lang.IllegalArgumentException("Scanning region must be given in relative coordinates, i.e. following must hold true: x + width <= 1.f && y + height <= 1.f");
            }
            if (recognizerBundle != this.getInputSizeshNQ4ISI) {
                if (recognizerBundle == null) {
                    recognizerBundle = new com.microblink.blinkid.entities.recognizers.RecognizerBundle(new com.microblink.blinkid.entities.recognizers.Recognizer[0]);
                }
                com.microblink.blinkid.entities.recognizers.Recognizer<com.microblink.blinkid.entities.recognizers.Recognizer.Result>[] recognizers = recognizerBundle.getRecognizers();
                if (recognizers == null || recognizers.length == 0) {
                    throw new java.lang.NullPointerException("RecognizerRunner recognizer array inside RecognizerBundle cannot be null nor empty!");
                }
            }
            com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle2 = recognizerBundle;
            this.getHighSpeedVideoFpsRangesFor = scanResultListener;
            this.getOutputMinFrameDurationlomOqCM.getCancelDelegate().llIIlIlIIl(false);
            this.getOutputSizes.IIlIIIllIl.set(false);
            this.getOutputMinFrameDurationlomOqCM.setScanningRegion(rectangle);
            this.getHighSpeedVideoFpsRanges.llIIlIlIIl(this.getInputSizeshNQ4ISI);
            com.microblink.blinkid.recognition.NativeRecognizerWrapper nativeRecognizerWrapper = this.getOutputSizes;
            long j = this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighResolutionOutputSizeshNQ4ISI = 1 + j;
            com.microblink.blinkid.hardware.camera.memory.BitmapCameraFrame bitmapCameraFrame = new com.microblink.blinkid.hardware.camera.memory.BitmapCameraFrame(bitmap, j, false);
            android.graphics.RectF rectF = rectangle.toRectF();
            bitmapCameraFrame.IllIIIllII = rectF;
            com.microblink.blinkid.secured.lIIlIIllII.llIIlIlIIl(rectF);
            bitmapCameraFrame.lIlIIIIlIl = orientation;
            if (!bitmapCameraFrame.llIIlIlIIl(this.getHighSpeedVideoFpsRanges.llIIlIlIIl)) {
                bitmapCameraFrame.IlIllIlIIl();
                throw new java.lang.RuntimeException("Failed to process given bitmap. See ADB log for more info.");
            }
            com.microblink.blinkid.recognition.callback.RecognitionProcessCallback recognitionProcessCallback = this.getOutputMinFrameDurationlomOqCM;
            com.microblink.blinkid.directApi.RecognizerRunner.RecognitionLicenseAndErrorCallback recognitionLicenseAndErrorCallback = this.getHighSpeedVideoSizes;
            nativeRecognizerWrapper.llIIlIlIIl(bitmapCameraFrame, recognizerBundle2, recognitionProcessCallback, recognitionLicenseAndErrorCallback, recognitionLicenseAndErrorCallback, true);
            this.getOutputFormats = com.microblink.blinkid.directApi.RecognizerRunner.State.WORKING;
            this.getInputFormats = true;
        }
    }

    public final void resetRecognitionState(boolean z) {
        if (this.getOutputSizes != null) {
            com.microblink.blinkid.util.Log.d(this, "Resetting recognizer state!", new java.lang.Object[0]);
            com.microblink.blinkid.recognition.NativeRecognizerWrapper nativeRecognizerWrapper = this.getOutputSizes;
            com.microblink.blinkid.secured.IlIlIlIIIl ilIlIlIIIl = nativeRecognizerWrapper.IllIIIIllI;
            if (ilIlIlIIIl != null) {
                ilIlIlIIIl.llIIlIlIIl(new com.microblink.blinkid.secured.IlIlIIlllI(nativeRecognizerWrapper, z));
            } else {
                com.microblink.blinkid.util.Log.wtf(nativeRecognizerWrapper, "Unable to reset recognizers: processing thread is null", new java.lang.Object[0]);
            }
        }
    }

    private void getHighResolutionOutputSizeshNQ4ISI(com.microblink.blinkid.image.InputImage inputImage, boolean z, com.microblink.blinkid.view.recognition.ScanResultListener scanResultListener, com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle) {
        if (this.getOutputFormats != com.microblink.blinkid.directApi.RecognizerRunner.State.READY) {
            throw new java.lang.IllegalStateException("Cannot recognize image. RecognizerRunner not ready!");
        }
        if (scanResultListener != null) {
            if (recognizerBundle != this.getInputSizeshNQ4ISI) {
                if (recognizerBundle == null) {
                    recognizerBundle = new com.microblink.blinkid.entities.recognizers.RecognizerBundle(new com.microblink.blinkid.entities.recognizers.Recognizer[0]);
                }
                com.microblink.blinkid.entities.recognizers.Recognizer<com.microblink.blinkid.entities.recognizers.Recognizer.Result>[] recognizers = recognizerBundle.getRecognizers();
                if (recognizers == null || recognizers.length == 0) {
                    throw new java.lang.NullPointerException("RecognizerRunner recognizer array inside RecognizerBundle cannot be null nor empty!");
                }
            }
            com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle2 = recognizerBundle;
            this.getHighSpeedVideoFpsRangesFor = scanResultListener;
            this.getOutputMinFrameDurationlomOqCM.getCancelDelegate().llIIlIlIIl(false);
            this.getOutputSizes.IIlIIIllIl.set(false);
            android.graphics.Rect IlIllIlIIl = inputImage.IlIllIlIIl();
            this.getOutputMinFrameDurationlomOqCM.setScanningRegion(new com.microblink.blinkid.geometry.Rectangle(IlIllIlIIl.left / inputImage.IllIIIllII(), IlIllIlIIl.top / inputImage.llIIlIlIIl(), IlIllIlIIl.width() / inputImage.IllIIIllII(), IlIllIlIIl.height() / inputImage.llIIlIlIIl()));
            this.getHighSpeedVideoFpsRanges.llIIlIlIIl(this.getInputSizeshNQ4ISI);
            com.microblink.blinkid.recognition.NativeRecognizerWrapper nativeRecognizerWrapper = this.getOutputSizes;
            if (inputImage.llIIIlllll != 0) {
                long j = this.getHighResolutionOutputSizeshNQ4ISI;
                this.getHighResolutionOutputSizeshNQ4ISI = 1 + j;
                com.microblink.blinkid.image.ImageFrame imageFrame = new com.microblink.blinkid.image.ImageFrame(inputImage, z, j);
                if (imageFrame.llIIlIlIIl(this.getHighSpeedVideoFpsRanges.llIIlIlIIl)) {
                    com.microblink.blinkid.recognition.callback.RecognitionProcessCallback recognitionProcessCallback = this.getOutputMinFrameDurationlomOqCM;
                    com.microblink.blinkid.directApi.RecognizerRunner.RecognitionLicenseAndErrorCallback recognitionLicenseAndErrorCallback = this.getHighSpeedVideoSizes;
                    nativeRecognizerWrapper.llIIlIlIIl(imageFrame, recognizerBundle2, recognitionProcessCallback, recognitionLicenseAndErrorCallback, recognitionLicenseAndErrorCallback, true);
                    this.getOutputFormats = com.microblink.blinkid.directApi.RecognizerRunner.State.WORKING;
                    this.getInputFormats = z;
                    return;
                }
                imageFrame.IlIllIlIIl();
                throw new java.lang.RuntimeException("Failed to process given image. See ADB log for more info.");
            }
            throw new java.lang.IllegalStateException("Cannot recognize disposed image!");
        }
        throw new java.lang.NullPointerException("Result listener cannot be null!");
    }

    static void Camera2StreamConfigurationMap(com.microblink.blinkid.directApi.RecognizerRunner recognizerRunner, com.microblink.blinkid.recognition.RecognitionSuccessType recognitionSuccessType) {
        if (!recognizerRunner.getOutputMinFrameDurationlomOqCM.getCancelDelegate().IlIllIlIIl) {
            synchronized (recognizerRunner) {
                if (recognizerRunner.getOutputSizes != null) {
                    recognizerRunner.getOutputFormats = com.microblink.blinkid.directApi.RecognizerRunner.State.READY;
                }
            }
        }
        com.microblink.blinkid.recognition.NativeRecognizerWrapper nativeRecognizerWrapper = recognizerRunner.getOutputSizes;
        if (nativeRecognizerWrapper != null) {
            int i = recognizerRunner.getInputFormats ? 3 : 2;
            com.microblink.blinkid.entities.recognizers.SignedPayload llIIlIlIIl = nativeRecognizerWrapper.llIIlIlIIl(new com.microblink.blinkid.secured.IlIlIlIllI(recognizerRunner.getOutputStallDurationlomOqCM, i));
            if (llIIlIlIIl != null) {
                com.microblink.blinkid.secured.llIIIllIlI.llIIlIlIIl().llIIlIlIIl(i, recognitionSuccessType, llIIlIlIIl);
            }
            recognizerRunner.getHighSpeedVideoFpsRangesFor.onScanningDone(recognitionSuccessType);
            com.microblink.blinkid.recognition.NativeRecognizerWrapper nativeRecognizerWrapper2 = recognizerRunner.getOutputSizes;
            com.microblink.blinkid.secured.IlIlIlIIIl ilIlIlIIIl = nativeRecognizerWrapper2.IllIIIIllI;
            if (ilIlIlIIIl != null) {
                ilIlIlIIIl.llIIlIlIIl(new com.microblink.blinkid.secured.IIllIlIIII(nativeRecognizerWrapper2));
            } else {
                com.microblink.blinkid.util.Log.wtf(nativeRecognizerWrapper2, "Processing thread is null! Unable to prepare for next recognition!", new java.lang.Object[0]);
            }
        }
    }
}
