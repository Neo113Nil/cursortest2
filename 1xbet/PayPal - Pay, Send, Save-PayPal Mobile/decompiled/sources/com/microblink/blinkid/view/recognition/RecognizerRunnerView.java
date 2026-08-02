package com.microblink.blinkid.view.recognition;

/* loaded from: classes.dex */
public final class RecognizerRunnerView extends com.microblink.blinkid.view.CameraViewGroup implements androidx.view.LifecycleObserver {
    private final com.microblink.blinkid.view.recognition.IIlIIIllIl Camera2StreamConfigurationMap;
    private final com.microblink.blinkid.view.recognition.lIlIIIIlIl CoroutineDebuggingKt;
    private final java.util.concurrent.atomic.AtomicBoolean coroutineBoundary;
    private com.microblink.blinkid.recognition.NativeRecognizerWrapper coroutineCreation;
    private com.microblink.blinkid.view.recognition.HighResImageListener getHighResolutionOutputSizeshNQ4ISI;
    private final com.microblink.blinkid.secured.lIlIIIIllI getHighSpeedVideoFpsRanges;
    private boolean getHighSpeedVideoFpsRangesFor;
    private com.microblink.blinkid.recognition.FrameAnalyzers getHighSpeedVideoSizes;
    private final com.microblink.blinkid.view.recognition.IlIllIlllI getHighSpeedVideoSizesFor;
    private com.microblink.blinkid.view.recognition.FrameRecognitionCallback getInputFormats;
    private com.microblink.blinkid.geometry.Rectangle getInputSizeshNQ4ISI;
    private final com.microblink.blinkid.hardware.MicroblinkDeviceManager getOutputFormats;
    private com.microblink.blinkid.recognition.callback.RecognitionProcessCallback getOutputMinFrameDuration;
    private final java.util.concurrent.atomic.AtomicBoolean getOutputMinFrameDurationlomOqCM;
    private final com.microblink.blinkid.view.recognition.llIIlIIlll getOutputSizes;
    private com.microblink.blinkid.metadata.MetadataCallbacks getOutputSizeshNQ4ISI;
    private com.microblink.blinkid.entities.recognizers.RecognizerBundle getOutputStallDuration;
    private final java.util.concurrent.atomic.AtomicBoolean getOutputStallDurationlomOqCM;
    private final java.util.concurrent.atomic.AtomicReference getValidOutputFormatsForInputhNQ4ISI;
    private final java.util.concurrent.atomic.AtomicInteger isOutputSupportedFor;
    private com.microblink.blinkid.view.NotSupportedReason isOutputSupportedForhNQ4ISI;
    private com.microblink.blinkid.geometry.Rectangle toString;
    private com.microblink.blinkid.view.recognition.ScanResultListener unwrapAs;

    public RecognizerRunnerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isOutputSupportedForhNQ4ISI = null;
        this.coroutineCreation = null;
        this.getInputSizeshNQ4ISI = com.microblink.blinkid.geometry.Rectangle.getDefaultROI();
        this.toString = com.microblink.blinkid.geometry.Rectangle.getDefaultROI();
        this.getHighSpeedVideoFpsRangesFor = false;
        this.getOutputMinFrameDurationlomOqCM = new java.util.concurrent.atomic.AtomicBoolean(true);
        this.getOutputStallDurationlomOqCM = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.getOutputSizeshNQ4ISI = new com.microblink.blinkid.metadata.MetadataCallbacks();
        this.getValidOutputFormatsForInputhNQ4ISI = new java.util.concurrent.atomic.AtomicReference(null);
        this.coroutineBoundary = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.isOutputSupportedFor = new java.util.concurrent.atomic.AtomicInteger(0);
        this.getHighSpeedVideoSizesFor = new com.microblink.blinkid.view.recognition.IlIllIlllI(this);
        this.CoroutineDebuggingKt = new com.microblink.blinkid.view.recognition.lIlIIIIlIl(this);
        this.getOutputSizes = new com.microblink.blinkid.view.recognition.llIIlIIlll(this);
        this.Camera2StreamConfigurationMap = new com.microblink.blinkid.view.recognition.IIlIIIllIl(this);
        this.getHighSpeedVideoFpsRanges = new com.microblink.blinkid.secured.lIlIIIIllI(context);
        if (isInEditMode()) {
            return;
        }
        this.getOutputFormats = com.microblink.blinkid.hardware.MicroblinkDeviceManager.llIIlIlIIl(context);
        if (!com.microblink.blinkid.recognition.RightsManager.llIIIlllll()) {
            throw new com.microblink.blinkid.licence.exception.InvalidLicenceKeyException("Please set valid license key before creating RecognizerRunnerView");
        }
        getContext().getApplicationContext();
    }

    static boolean coroutineBoundary(com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView) {
        com.microblink.blinkid.recognition.NativeRecognizerWrapper nativeRecognizerWrapper;
        com.microblink.blinkid.secured.IIlIIIIllI iIlIIIIllI;
        return recognizerRunnerView.isScanningPaused() || (nativeRecognizerWrapper = recognizerRunnerView.coroutineCreation) == null || (iIlIIIIllI = (com.microblink.blinkid.secured.IIlIIIIllI) nativeRecognizerWrapper.llIIlIlIIl.get()) == com.microblink.blinkid.secured.IIlIIIIllI.DONE || iIlIIIIllI == com.microblink.blinkid.secured.IIlIIIIllI.UNINITIALIZED;
    }

    static boolean getInputFormats(com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView) {
        return recognizerRunnerView.lllIIIlIlI != 1.0f && recognizerRunnerView.getInputSizeshNQ4ISI.equals(com.microblink.blinkid.geometry.Rectangle.getDefaultROI());
    }

    static void getOutputSizeshNQ4ISI(com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView) {
        if (recognizerRunnerView.isOutputSupportedFor.get() <= 0) {
            recognizerRunnerView.getHighSpeedVideoFpsRanges(true);
        }
    }

    static void toString(com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView) {
        com.microblink.blinkid.recognition.NativeRecognizerWrapper nativeRecognizerWrapper = recognizerRunnerView.coroutineCreation;
        if (nativeRecognizerWrapper != null) {
            java.util.Timer timer = nativeRecognizerWrapper.IllIIIllII;
            if (timer != null) {
                timer.cancel();
            }
            nativeRecognizerWrapper.IlIllIlIIl = false;
            nativeRecognizerWrapper.IllIIIllII = null;
        }
    }

    public final void captureHighResImage(com.microblink.blinkid.view.recognition.HighResImageListener highResImageListener) {
        this.getHighResolutionOutputSizeshNQ4ISI = highResImageListener;
        IllIIIllII();
    }

    @Override // com.microblink.blinkid.view.CameraViewGroup, com.microblink.blinkid.view.BaseCameraView
    @androidx.view.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_CREATE)
    public final void create() {
        if (this.llIIIlllll != com.microblink.blinkid.view.BaseCameraView.CameraViewState.DESTROYED) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("It is not allowed to call create() on already created view (state is ");
            sb.append(this.llIIIlllll.name());
            sb.append(")");
            throw new java.lang.IllegalStateException(sb.toString());
        }
        com.microblink.blinkid.secured.lIIllllIIl.llIIlIlIIl();
        com.microblink.blinkid.recognition.FrameAnalyzers frameAnalyzers = this.getHighSpeedVideoSizes;
        if (frameAnalyzers == null) {
            com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle = this.getOutputStallDuration;
            com.microblink.blinkid.secured.lllllllIIl llIIlIlIIl = this.getOutputFormats.llIIlIlIIl();
            this.getHighSpeedVideoSizes = new com.microblink.blinkid.recognition.FrameAnalyzers(recognizerBundle, llIIlIlIIl != null ? llIIlIlIIl.llIIlIlIIl : 1.0d);
        } else {
            frameAnalyzers.llIIlIlIIl(this.getOutputStallDuration);
        }
        this.getOutputMinFrameDuration = new com.microblink.blinkid.recognition.callback.RecognitionProcessCallback(this.getHighSpeedVideoSizesFor, this.getOutputSizeshNQ4ISI, this.toString, this.getOutputStallDuration.getRecognitionDebugMode());
        setVisiblePartUpdateListener(new com.microblink.blinkid.view.recognition.llIIlIlIIl(this));
        if (this.unwrapAs == null) {
            throw new java.lang.NullPointerException("Please set ScanResultListener with method setScanResultListener before calling create method!");
        }
        setCameraFrameFactory(new com.microblink.blinkid.secured.IIlIlIllll());
        super.create();
        com.microblink.blinkid.secured.lIlIIIIllI liliiiilli = this.getHighSpeedVideoFpsRanges;
        if (liliiiilli != null) {
            liliiiilli.setVisibility(8);
            addChildView(this.getHighSpeedVideoFpsRanges, false);
        }
    }

    @Override // com.microblink.blinkid.view.BaseCameraView
    @androidx.view.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_DESTROY)
    public final void destroy() {
        super.destroy();
        this.getOutputMinFrameDuration.dispose();
        this.getOutputMinFrameDuration = null;
        this.getHighSpeedVideoSizes.llIIlIlIIl();
        this.getHighSpeedVideoSizes = null;
    }

    public final com.microblink.blinkid.entities.recognizers.RecognizerBundle getRecognizerBundle() {
        return this.getOutputStallDuration;
    }

    public final com.microblink.blinkid.view.recognition.ScanResultListener getScanResultListener() {
        return this.unwrapAs;
    }

    public final com.microblink.blinkid.geometry.Rectangle getScanningRegion() {
        return this.getInputSizeshNQ4ISI;
    }

    public final boolean isScanningPaused() {
        com.microblink.blinkid.recognition.callback.RecognitionProcessCallback recognitionProcessCallback = this.getOutputMinFrameDuration;
        return recognitionProcessCallback == null || recognitionProcessCallback.getCancelDelegate().IlIllIlIIl;
    }

    @Override // com.microblink.blinkid.view.BaseCameraView
    @androidx.view.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_PAUSE)
    public final void pause() {
        if (this.llIIIlllll != com.microblink.blinkid.view.BaseCameraView.CameraViewState.RESUMED) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot pause view that has not been resumed. Please make sure that your view has been resumed with resume() method. State is ");
            sb.append(this.llIIIlllll.name());
            throw new java.lang.IllegalStateException(sb.toString());
        }
        this.getOutputMinFrameDurationlomOqCM.set(true);
        com.microblink.blinkid.secured.lIllIlIlII lillililii = (com.microblink.blinkid.secured.lIllIlIlII) this.getValidOutputFormatsForInputhNQ4ISI.getAndSet(null);
        if (lillililii != null) {
            lillililii.IlIllIlIIl();
        }
        com.microblink.blinkid.recognition.callback.RecognitionProcessCallback recognitionProcessCallback = this.getOutputMinFrameDuration;
        if (recognitionProcessCallback != null) {
            recognitionProcessCallback.getCancelDelegate().llIIlIlIIl(true);
        }
        com.microblink.blinkid.recognition.NativeRecognizerWrapper nativeRecognizerWrapper = this.coroutineCreation;
        if (nativeRecognizerWrapper != null) {
            nativeRecognizerWrapper.IIlIIIllIl.set(true);
        }
        while (this.coroutineBoundary.get()) {
        }
        super.pause();
    }

    public final void pauseScanning() {
        if (this.isOutputSupportedFor.getAndIncrement() == 0) {
            this.getOutputMinFrameDurationlomOqCM.set(true);
            com.microblink.blinkid.secured.lIllIlIlII lillililii = (com.microblink.blinkid.secured.lIllIlIlII) this.getValidOutputFormatsForInputhNQ4ISI.getAndSet(null);
            if (lillililii != null) {
                lillililii.IlIllIlIIl();
            }
            com.microblink.blinkid.recognition.callback.RecognitionProcessCallback recognitionProcessCallback = this.getOutputMinFrameDuration;
            if (recognitionProcessCallback != null) {
                recognitionProcessCallback.getCancelDelegate().llIIlIlIIl(true);
            }
            com.microblink.blinkid.recognition.NativeRecognizerWrapper nativeRecognizerWrapper = this.coroutineCreation;
            if (nativeRecognizerWrapper != null) {
                nativeRecognizerWrapper.IIlIIIllIl.set(true);
            }
        }
        com.microblink.blinkid.util.Log.i(this, "pauseScanning: pause count is {}", this.isOutputSupportedFor);
    }

    public final void reconfigureRecognizers(com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle) {
        com.microblink.blinkid.entities.recognizers.Recognizer<com.microblink.blinkid.entities.recognizers.Recognizer.Result>[] recognizers;
        if (recognizerBundle != null) {
            com.microblink.blinkid.view.BaseCameraView.CameraViewState cameraViewState = this.llIIIlllll;
            if (cameraViewState == com.microblink.blinkid.view.BaseCameraView.CameraViewState.DESTROYED || cameraViewState == com.microblink.blinkid.view.BaseCameraView.CameraViewState.CREATED) {
                throw new java.lang.IllegalStateException("Method must be called after calling start()");
            }
            java.lang.Boolean isAutofocusSupported = isAutofocusSupported();
            if (isAutofocusSupported == null) {
                com.microblink.blinkid.util.Log.w(this, "Reconfiguring recognizers while camera is paused. Cannot perform autofocus check.", new java.lang.Object[0]);
            } else if (!isAutofocusSupported.booleanValue() && (recognizers = recognizerBundle.getRecognizers()) != null) {
                for (com.microblink.blinkid.entities.recognizers.Recognizer<com.microblink.blinkid.entities.recognizers.Recognizer.Result> recognizer : recognizers) {
                    if (recognizer != null && recognizer.requiresAutofocus()) {
                        throw new com.microblink.blinkid.hardware.camera.AutoFocusRequiredButNotSupportedException("New recognition settings require camera with autofocus, while opened camera does not support that!");
                    }
                }
            }
            this.getOutputStallDuration = recognizerBundle;
            this.getHighSpeedVideoSizes.llIIlIlIIl(recognizerBundle);
            com.microblink.blinkid.recognition.NativeRecognizerWrapper nativeRecognizerWrapper = this.coroutineCreation;
            if (nativeRecognizerWrapper != null) {
                com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle2 = this.getOutputStallDuration;
                com.microblink.blinkid.view.recognition.IlIllIlllI ilIllIlllI = this.getHighSpeedVideoSizesFor;
                com.microblink.blinkid.secured.IlIlIlIIIl ilIlIlIIIl = nativeRecognizerWrapper.IllIIIIllI;
                if (ilIlIlIIIl == null) {
                    throw new java.lang.IllegalStateException("Cannot reconfigure recognizers when they are not active. Please initialize first!");
                }
                ilIlIlIIIl.llIIlIlIIl(new com.microblink.blinkid.secured.lIIlIIIIlI(nativeRecognizerWrapper, recognizerBundle2, ilIllIlllI));
            }
        }
    }

    public final void resetRecognitionState() {
        resetRecognitionState(true);
    }

    @Override // com.microblink.blinkid.view.BaseCameraView
    @androidx.view.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_RESUME)
    public final void resume() {
        if (this.llIIIlllll != com.microblink.blinkid.view.BaseCameraView.CameraViewState.STARTED) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot resume view that has not been started. Please call start() first. State is ");
            sb.append(this.llIIIlllll.name());
            throw new java.lang.IllegalStateException(sb.toString());
        }
        com.microblink.blinkid.util.Log.i(this, "RecognizerRunner view resume: Context = {}", getContext());
        if (this.isOutputSupportedForhNQ4ISI == null) {
            super.resume();
        } else {
            this.llIIIlllll = com.microblink.blinkid.view.BaseCameraView.CameraViewState.RESUMED;
        }
    }

    public final void resumeScanning(boolean z) {
        if (this.isOutputSupportedFor.decrementAndGet() <= 0) {
            getHighSpeedVideoFpsRanges(z);
        }
        com.microblink.blinkid.util.Log.i(this, "resumeScanning: pause count is {}", java.lang.Integer.valueOf(this.isOutputSupportedFor.get()));
    }

    public final void setFrameRecognitionCallback(com.microblink.blinkid.view.recognition.FrameRecognitionCallback frameRecognitionCallback) {
        this.getInputFormats = frameRecognitionCallback;
    }

    public final void setLifecycle(androidx.view.Lifecycle lifecycle) {
        lifecycle.addObserver(this);
    }

    public final void setMetadataCallbacks(com.microblink.blinkid.metadata.MetadataCallbacks metadataCallbacks) {
        if (metadataCallbacks == null) {
            metadataCallbacks = new com.microblink.blinkid.metadata.MetadataCallbacks();
        }
        this.getOutputSizeshNQ4ISI = metadataCallbacks;
        com.microblink.blinkid.recognition.callback.RecognitionProcessCallback recognitionProcessCallback = this.getOutputMinFrameDuration;
        if (recognitionProcessCallback != null) {
            recognitionProcessCallback.setMetadataCallbacks(metadataCallbacks);
        }
    }

    public final void setRecognizerBundle(com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle) {
        if (this.llIIIlllll != com.microblink.blinkid.view.BaseCameraView.CameraViewState.DESTROYED) {
            throw new java.lang.IllegalStateException("Method setRecognizerBundle must be called before calling create()");
        }
        if (recognizerBundle != null) {
            this.getOutputStallDuration = recognizerBundle;
        }
    }

    public final void setScanResultListener(com.microblink.blinkid.view.recognition.ScanResultListener scanResultListener) {
        if (this.llIIIlllll != com.microblink.blinkid.view.BaseCameraView.CameraViewState.DESTROYED) {
            throw new java.lang.IllegalStateException("Method setScanResultListener must be called before calling create()");
        }
        this.unwrapAs = scanResultListener;
    }

    public final void setScanningRegion(com.microblink.blinkid.geometry.Rectangle rectangle, boolean z) {
        this.getInputSizeshNQ4ISI = rectangle;
        this.getHighSpeedVideoFpsRangesFor = z;
        if (rectangle != null && !rectangle.isRelative()) {
            throw new java.lang.IllegalArgumentException("Scanning region must be given in relative coordinates, i.e. following must hold true: x + width <= 1.f && y + height <= 1.f. Given region is ".concat(java.lang.String.valueOf(rectangle)));
        }
        if (getOpenedCameraType() != null) {
            getHighSpeedVideoSizes(getCurrentOrientation());
            com.microblink.blinkid.util.Log.d(this, "Updated scanning region", new java.lang.Object[0]);
            com.microblink.blinkid.recognition.callback.RecognitionProcessCallback recognitionProcessCallback = this.getOutputMinFrameDuration;
            if (recognitionProcessCallback != null) {
                recognitionProcessCallback.setScanningRegion(this.toString);
            }
        }
    }

    public final boolean shouldRotateScanningRegion() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00cd, code lost:
    
        if (com.microblink.blinkid.secured.IllIlIIIll.llIIlIlIIl(r0, com.microblink.blinkid.secured.IllIlIIIll.IlIllIlllI) != false) goto L47;
     */
    @Override // com.microblink.blinkid.view.BaseCameraView
    @androidx.view.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_START)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void start() {
        com.microblink.blinkid.view.CameraEventsListener cameraEventsListener;
        super.start();
        android.content.Context context = getContext();
        com.microblink.blinkid.util.Log.i(this, "Loading Native Library!", new java.lang.Object[0]);
        if (this.coroutineCreation == null) {
            this.coroutineCreation = com.microblink.blinkid.recognition.NativeRecognizerWrapper.IllIIlIIII;
        }
        this.coroutineCreation.lIlIIIIlIl = this.CoroutineDebuggingKt;
        com.microblink.blinkid.view.NotSupportedReason notSupportedReason = null;
        try {
            boolean llIIIlllll = com.microblink.blinkid.recognition.RightsManager.llIIIlllll();
            com.microblink.blinkid.view.NotSupportedReason notSupportedReason2 = com.microblink.blinkid.secured.IlIlIlllIl.IllIIIIllI() < 21 ? com.microblink.blinkid.view.NotSupportedReason.UNSUPPORTED_ANDROID_VERSION : !this.getOutputFormats.IlIllIlIIl.llIIlIlIIl() ? com.microblink.blinkid.view.NotSupportedReason.NO_CAMERA : !com.microblink.blinkid.hardware.MicroblinkDeviceManager.IllIIIllII ? com.microblink.blinkid.view.NotSupportedReason.UNSUPPORTED_PROCESSOR_ARCHITECTURE : null;
            if (notSupportedReason2 != null) {
                notSupportedReason = notSupportedReason2;
            } else if (llIIIlllll) {
                if (!com.microblink.blinkid.recognition.RightsManager.llIIIlllll() || !com.microblink.blinkid.recognition.RightsManager.llIIlIlIIl(com.microblink.blinkid.recognition.Right.ALLOW_CUSTOM_UI)) {
                    java.lang.String name2 = context.getClass().getName();
                    try {
                        java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-256");
                        messageDigest.update(name2.getBytes("iso-8859-1"), 0, name2.length());
                        byte[] digest = messageDigest.digest();
                        if (!com.microblink.blinkid.secured.IllIlIIIll.llIIlIlIIl(digest, com.microblink.blinkid.secured.IllIlIIIll.llIIlIlIIl) && !com.microblink.blinkid.secured.IllIlIIIll.llIIlIlIIl(digest, com.microblink.blinkid.secured.IllIlIIIll.IlIllIlIIl) && !com.microblink.blinkid.secured.IllIlIIIll.llIIlIlIIl(digest, com.microblink.blinkid.secured.IllIlIIIll.IllIIIllII) && !com.microblink.blinkid.secured.IllIlIIIll.llIIlIlIIl(digest, com.microblink.blinkid.secured.IllIlIIIll.llIIIlllll) && !com.microblink.blinkid.secured.IllIlIIIll.llIIlIlIIl(digest, com.microblink.blinkid.secured.IllIlIIIll.IllIIIIllI) && !com.microblink.blinkid.secured.IllIlIIIll.llIIlIlIIl(digest, com.microblink.blinkid.secured.IllIlIIIll.lIlIIIIlIl) && !com.microblink.blinkid.secured.IllIlIIIll.llIIlIlIIl(digest, com.microblink.blinkid.secured.IllIlIIIll.llIIlIIlll) && !com.microblink.blinkid.secured.IllIlIIIll.llIIlIlIIl(digest, com.microblink.blinkid.secured.IllIlIIIll.IIlIIIllIl) && !com.microblink.blinkid.secured.IllIlIIIll.llIIlIlIIl(digest, com.microblink.blinkid.secured.IllIlIIIll.lIIIIIllll) && !com.microblink.blinkid.secured.IllIlIIIll.llIIlIlIIl(digest, com.microblink.blinkid.secured.IllIlIIIll.lllIIIlIlI)) {
                        }
                    } catch (java.io.UnsupportedEncodingException e) {
                        e.printStackTrace();
                    } catch (java.security.NoSuchAlgorithmException e2) {
                        e2.printStackTrace();
                    }
                }
                if (!this.IlIllIlIIl) {
                    this.coroutineCreation.llIIlIlIIl(getContext(), this.getOutputStallDuration, this.getHighSpeedVideoSizesFor);
                }
            } else {
                notSupportedReason = com.microblink.blinkid.view.NotSupportedReason.INVALID_OR_MISSING_LICENSE;
            }
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
            com.microblink.blinkid.view.CameraEventsListener cameraEventsListener2 = this.llIIlIlIIl;
            if (cameraEventsListener2 != null) {
                cameraEventsListener2.onError(th);
            }
            this.IlIllIlIIl = true;
        }
        this.isOutputSupportedForhNQ4ISI = notSupportedReason;
        com.microblink.blinkid.util.Log.i(this, "Not support reason: {}", notSupportedReason);
        if (this.isOutputSupportedForhNQ4ISI != null || (cameraEventsListener = this.llIIlIlIIl) == null) {
        }
        cameraEventsListener.onError(new com.microblink.blinkid.recognition.FeatureNotSupportedException(this.isOutputSupportedForhNQ4ISI));
        return;
        notSupportedReason = com.microblink.blinkid.view.NotSupportedReason.CUSTOM_UI_FORBIDDEN;
        this.isOutputSupportedForhNQ4ISI = notSupportedReason;
        com.microblink.blinkid.util.Log.i(this, "Not support reason: {}", notSupportedReason);
        if (this.isOutputSupportedForhNQ4ISI != null) {
        }
    }

    @Override // com.microblink.blinkid.view.BaseCameraView
    @androidx.view.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_STOP)
    public final void stop() {
        super.stop();
        com.microblink.blinkid.recognition.NativeRecognizerWrapper nativeRecognizerWrapper = this.coroutineCreation;
        if (nativeRecognizerWrapper != null) {
            nativeRecognizerWrapper.lIlIIIIlIl = null;
            nativeRecognizerWrapper.llIIlIlIIl();
            this.coroutineCreation = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getHighSpeedVideoSizes() {
        com.microblink.blinkid.recognition.NativeRecognizerWrapper nativeRecognizerWrapper = this.coroutineCreation;
        if (nativeRecognizerWrapper != null) {
            com.microblink.blinkid.util.Log.d(this, "Before preparing for next recognition, recognizer state is: {}", (com.microblink.blinkid.secured.IIlIIIIllI) nativeRecognizerWrapper.llIIlIlIIl.get());
        }
        com.microblink.blinkid.recognition.NativeRecognizerWrapper nativeRecognizerWrapper2 = this.coroutineCreation;
        if (nativeRecognizerWrapper2 == null || ((com.microblink.blinkid.secured.IIlIIIIllI) nativeRecognizerWrapper2.llIIlIlIIl.get()) != com.microblink.blinkid.secured.IIlIIIIllI.DONE) {
            return;
        }
        com.microblink.blinkid.recognition.NativeRecognizerWrapper nativeRecognizerWrapper3 = this.coroutineCreation;
        com.microblink.blinkid.secured.IlIlIlIIIl ilIlIlIIIl = nativeRecognizerWrapper3.IllIIIIllI;
        if (ilIlIlIIIl != null) {
            ilIlIlIIIl.llIIlIlIIl(new com.microblink.blinkid.secured.IIllIlIIII(nativeRecognizerWrapper3));
        } else {
            com.microblink.blinkid.util.Log.wtf(nativeRecognizerWrapper3, "Processing thread is null! Unable to prepare for next recognition!", new java.lang.Object[0]);
        }
    }

    @Override // com.microblink.blinkid.view.BaseCameraView
    public final void IIlIIIllIl() {
        com.microblink.blinkid.secured.lIllIlIlII lillililii = (com.microblink.blinkid.secured.lIllIlIlII) this.getValidOutputFormatsForInputhNQ4ISI.getAndSet(null);
        if (lillililii != null) {
            lillililii.IlIllIlIIl();
        }
    }

    @Override // com.microblink.blinkid.view.BaseCameraView
    public final boolean IlIllIlllI() {
        try {
            com.microblink.blinkid.recognition.NativeRecognizerWrapper nativeRecognizerWrapper = this.coroutineCreation;
            if (nativeRecognizerWrapper != null) {
                com.microblink.blinkid.secured.IlIlIlIIIl ilIlIlIIIl = nativeRecognizerWrapper.IllIIIIllI;
                if (ilIlIlIIIl != null) {
                    ilIlIlIIIl.llIIlIlIIl(new com.microblink.blinkid.secured.IlIlIIlllI(nativeRecognizerWrapper, true));
                } else {
                    com.microblink.blinkid.util.Log.wtf(nativeRecognizerWrapper, "Unable to reset recognizers: processing thread is null", new java.lang.Object[0]);
                }
            }
            return com.microblink.blinkid.secured.lIIllllIIl.llIIlIlIIl;
        } catch (java.lang.UnsatisfiedLinkError e) {
            com.microblink.blinkid.util.Log.e(this, e, "Unable to load native library", new java.lang.Object[0]);
            throw e;
        }
    }

    @Override // com.microblink.blinkid.view.CameraViewGroup, com.microblink.blinkid.view.BaseCameraView
    public final com.microblink.blinkid.hardware.orientation.OrientationChangeListener IllIIIIllI() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // com.microblink.blinkid.view.BaseCameraView
    public final boolean lIIIIIllll() {
        com.microblink.blinkid.entities.recognizers.Recognizer<com.microblink.blinkid.entities.recognizers.Recognizer.Result>[] recognizers = this.getOutputStallDuration.getRecognizers();
        if (recognizers != null) {
            for (com.microblink.blinkid.entities.recognizers.Recognizer<com.microblink.blinkid.entities.recognizers.Recognizer.Result> recognizer : recognizers) {
                if (recognizer != null && recognizer.requiresAutofocus()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.microblink.blinkid.view.BaseCameraView
    public final void llIIlIIlll() {
        if (getCameraViewState() != com.microblink.blinkid.view.BaseCameraView.CameraViewState.RESUMED) {
            com.microblink.blinkid.util.Log.w(this, "Camera preview started callback received after view was paused", new java.lang.Object[0]);
            return;
        }
        com.microblink.blinkid.hardware.orientation.Orientation currentOrientation = getCurrentOrientation();
        if (currentOrientation == null || currentOrientation == com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_UNKNOWN) {
            currentOrientation = getInitialOrientation();
        }
        if (currentOrientation == null || currentOrientation == com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_UNKNOWN) {
            currentOrientation = getConfigurationOrientation() == 1 ? com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_PORTRAIT : com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_LANDSCAPE_RIGHT;
        }
        getHighSpeedVideoSizes(currentOrientation);
        this.getOutputMinFrameDuration.setScanningRegion(this.toString);
        if (this.getHighSpeedVideoFpsRanges != null) {
            if (com.microblink.blinkid.recognition.RightsManager.llIIIlllll() && com.microblink.blinkid.recognition.RightsManager.llIIlIlIIl(com.microblink.blinkid.recognition.Right.ALLOW_REMOVE_DEMO_OVERLAY)) {
                llIIlIlIIl(new com.microblink.blinkid.view.recognition.IllIIIllII(this));
            } else {
                llIIlIlIIl(new com.microblink.blinkid.view.recognition.llIIIlllll(this));
            }
        }
        com.microblink.blinkid.recognition.callback.RecognitionProcessCallback recognitionProcessCallback = this.getOutputMinFrameDuration;
        if (recognitionProcessCallback != null) {
            recognitionProcessCallback.setCameraOptions(getOpenedCameraType() == com.microblink.blinkid.hardware.camera.CameraType.CAMERA_FRONTFACE, llIIlIlIIl());
        }
        if (this.isOutputSupportedFor.get() <= 0) {
            getHighSpeedVideoFpsRanges(true);
        }
    }

    public final void resetRecognitionState(boolean z) {
        if (this.coroutineCreation != null) {
            com.microblink.blinkid.util.Log.d(this, "Resetting recognizer state!", new java.lang.Object[0]);
            com.microblink.blinkid.recognition.NativeRecognizerWrapper nativeRecognizerWrapper = this.coroutineCreation;
            com.microblink.blinkid.secured.IlIlIlIIIl ilIlIlIIIl = nativeRecognizerWrapper.IllIIIIllI;
            if (ilIlIlIIIl != null) {
                ilIlIlIIIl.llIIlIlIIl(new com.microblink.blinkid.secured.IlIlIIlllI(nativeRecognizerWrapper, z));
            } else {
                com.microblink.blinkid.util.Log.wtf(nativeRecognizerWrapper, "Unable to reset recognizers: processing thread is null", new java.lang.Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x00a2, code lost:
    
        if (r7 == com.microblink.blinkid.hardware.camera.CameraType.CAMERA_BACKFACE) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00ac, code lost:
    
        r6.toString = new com.microblink.blinkid.geometry.Rectangle(r0, r2, r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a9, code lost:
    
        r2 = 1.0f - (r2 + r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a7, code lost:
    
        if (r7 == com.microblink.blinkid.hardware.camera.CameraType.CAMERA_FRONTFACE) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void getHighSpeedVideoSizes(com.microblink.blinkid.hardware.orientation.Orientation orientation) {
        float y;
        float x;
        float width;
        com.microblink.blinkid.util.Log.d(this, "Preparing ROI from original ROI {} in orientation {}", this.getInputSizeshNQ4ISI, orientation);
        com.microblink.blinkid.geometry.Rectangle rectangle = this.getInputSizeshNQ4ISI;
        if (rectangle != null) {
            float x2 = rectangle.getX();
            float y2 = this.getInputSizeshNQ4ISI.getY();
            float width2 = this.getInputSizeshNQ4ISI.getWidth();
            float height = this.getInputSizeshNQ4ISI.getHeight();
            if (orientation == com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_LANDSCAPE_LEFT) {
                y = 1.0f - (this.getInputSizeshNQ4ISI.getWidth() + this.getInputSizeshNQ4ISI.getX());
                x = this.getInputSizeshNQ4ISI.getY();
                width = this.getInputSizeshNQ4ISI.getHeight();
            } else if (orientation == com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_PORTRAIT) {
                width2 = this.getInputSizeshNQ4ISI.getHeight();
                height = this.getInputSizeshNQ4ISI.getWidth();
                y = this.getInputSizeshNQ4ISI.getY();
                x = this.getInputSizeshNQ4ISI.getX();
                width = this.getInputSizeshNQ4ISI.getWidth();
            } else {
                if (orientation == com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_PORTRAIT_UPSIDE) {
                    width2 = this.getInputSizeshNQ4ISI.getHeight();
                    height = this.getInputSizeshNQ4ISI.getWidth();
                    x2 = 1.0f - (this.getInputSizeshNQ4ISI.getHeight() + this.getInputSizeshNQ4ISI.getY());
                    y2 = this.getInputSizeshNQ4ISI.getX();
                }
                com.microblink.blinkid.hardware.camera.CameraType openedCameraType = getOpenedCameraType();
                if (!llIIlIlIIl()) {
                    x2 = 1.0f - (x2 + width2);
                }
            }
            y2 = 1.0f - (width + x);
            x2 = y;
            com.microblink.blinkid.hardware.camera.CameraType openedCameraType2 = getOpenedCameraType();
            if (!llIIlIlIIl()) {
            }
        } else {
            this.toString = com.microblink.blinkid.geometry.Rectangle.getDefaultROI();
        }
        com.microblink.blinkid.util.Log.d(this, "Prepared ROI {}", this.toString);
        if (this.lllIIIlIlI == 1.0f || !this.getInputSizeshNQ4ISI.equals(com.microblink.blinkid.geometry.Rectangle.getDefaultROI())) {
            this.getOutputMinFrameDuration.setVisiblePartRelativeDestination(null);
        }
    }

    @Override // com.microblink.blinkid.view.BaseCameraView
    public final void llIIlIlIIl(com.microblink.blinkid.secured.lIIlllIIlI liillliili) {
        super.llIIlIlIIl(liillliili);
        liillliili.llIIIlllll = new com.microblink.blinkid.view.recognition.IlIllIlIIl(this);
    }

    @Override // com.microblink.blinkid.view.BaseCameraView
    public final com.microblink.blinkid.view.recognition.llIIlIIlll llIIIlllll() {
        return this.getOutputSizes;
    }

    static android.graphics.RectF getHighResolutionOutputSizeshNQ4ISI(com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView, android.graphics.RectF rectF) {
        float width;
        float height;
        float width2;
        float height2;
        if (recognizerRunnerView.lllIIIlIlI == 1.0f || !recognizerRunnerView.getInputSizeshNQ4ISI.equals(com.microblink.blinkid.geometry.Rectangle.getDefaultROI())) {
            width = rectF.left + (rectF.width() * recognizerRunnerView.toString.getX());
            height = rectF.top + (rectF.height() * recognizerRunnerView.toString.getY());
            width2 = recognizerRunnerView.toString.getWidth() * rectF.width();
            height2 = recognizerRunnerView.toString.getHeight() * rectF.height();
        } else {
            width = 0.0f;
            width2 = 1.0f;
            height2 = 1.0f;
            height = 0.0f;
        }
        android.graphics.RectF rectF2 = new android.graphics.RectF(width, height, width2 + width, height2 + height);
        com.microblink.blinkid.util.Log.v(recognizerRunnerView, "From visible {}, scanning region {} and zoomScale {}, calculated absolute region is {}", rectF, recognizerRunnerView.toString, java.lang.Float.valueOf(recognizerRunnerView.lllIIIlIlI), rectF2);
        return rectF2;
    }

    private void getHighSpeedVideoFpsRanges(boolean z) {
        this.isOutputSupportedFor.set(0);
        com.microblink.blinkid.recognition.callback.RecognitionProcessCallback recognitionProcessCallback = this.getOutputMinFrameDuration;
        if (recognitionProcessCallback != null) {
            recognitionProcessCallback.getCancelDelegate().llIIlIlIIl(false);
        }
        com.microblink.blinkid.recognition.NativeRecognizerWrapper nativeRecognizerWrapper = this.coroutineCreation;
        if (nativeRecognizerWrapper != null) {
            nativeRecognizerWrapper.IIlIIIllIl.set(false);
        }
        if (z && this.coroutineCreation != null) {
            com.microblink.blinkid.util.Log.d(this, "Resetting recognizer state!", new java.lang.Object[0]);
            com.microblink.blinkid.recognition.NativeRecognizerWrapper nativeRecognizerWrapper2 = this.coroutineCreation;
            com.microblink.blinkid.secured.IlIlIlIIIl ilIlIlIIIl = nativeRecognizerWrapper2.IllIIIIllI;
            if (ilIlIlIIIl != null) {
                ilIlIlIIIl.llIIlIlIIl(new com.microblink.blinkid.secured.IlIlIIlllI(nativeRecognizerWrapper2, true));
            } else {
                com.microblink.blinkid.util.Log.wtf(nativeRecognizerWrapper2, "Unable to reset recognizers: processing thread is null", new java.lang.Object[0]);
            }
        }
        this.getOutputMinFrameDurationlomOqCM.set(false);
        getHighSpeedVideoSizes();
    }

    static void Camera2StreamConfigurationMap(com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView, boolean z) {
        if (recognizerRunnerView.coroutineCreation != null) {
            com.microblink.blinkid.util.Log.d(recognizerRunnerView, "Resetting recognizer state!", new java.lang.Object[0]);
            com.microblink.blinkid.recognition.NativeRecognizerWrapper nativeRecognizerWrapper = recognizerRunnerView.coroutineCreation;
            com.microblink.blinkid.secured.IlIlIlIIIl ilIlIlIIIl = nativeRecognizerWrapper.IllIIIIllI;
            if (ilIlIlIIIl != null) {
                ilIlIlIIIl.llIIlIlIIl(new com.microblink.blinkid.secured.IlIlIIlllI(nativeRecognizerWrapper, z));
            } else {
                com.microblink.blinkid.util.Log.wtf(nativeRecognizerWrapper, "Unable to reset recognizers: processing thread is null", new java.lang.Object[0]);
            }
        }
    }

    @Override // com.microblink.blinkid.view.CameraViewGroup, com.microblink.blinkid.view.BaseCameraView
    public final void llIIlIlIIl(android.content.res.Configuration configuration) {
        super.llIIlIlIIl(configuration);
        if (getOpenedCameraType() != null) {
            getHighSpeedVideoSizes(getCurrentOrientation());
            com.microblink.blinkid.util.Log.d(this, "Updated scanning region", new java.lang.Object[0]);
            com.microblink.blinkid.recognition.callback.RecognitionProcessCallback recognitionProcessCallback = this.getOutputMinFrameDuration;
            if (recognitionProcessCallback != null) {
                recognitionProcessCallback.setScanningRegion(this.toString);
            }
        }
    }

    static void getHighSpeedVideoFpsRangesFor(com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView, java.lang.String str) {
        if (recognizerRunnerView.getOutputMinFrameDurationlomOqCM.get()) {
            return;
        }
        android.app.AlertDialog create = new android.app.AlertDialog.Builder(recognizerRunnerView.getContext()).setCancelable(false).setTitle("Library information").setMessage(str).setNeutralButton(com.paypal.oslo.feature.p2p.ui.common.error.NetworkErrorConfigKt.NetworkErrorOkButton, new com.microblink.blinkid.view.recognition.IllIIIIllI(recognizerRunnerView)).create();
        if (recognizerRunnerView.llIIIlllll == com.microblink.blinkid.view.BaseCameraView.CameraViewState.RESUMED) {
            recognizerRunnerView.getOutputMinFrameDurationlomOqCM.set(true);
            com.microblink.blinkid.secured.lIllIlIlII lillililii = (com.microblink.blinkid.secured.lIllIlIlII) recognizerRunnerView.getValidOutputFormatsForInputhNQ4ISI.getAndSet(null);
            if (lillililii != null) {
                lillililii.IlIllIlIIl();
            }
            create.show();
        }
    }

    static void getHighResolutionOutputSizeshNQ4ISI(com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView, com.microblink.blinkid.recognition.RecognitionSuccessType recognitionSuccessType) {
        if (!recognizerRunnerView.getOutputMinFrameDurationlomOqCM.get()) {
            com.microblink.blinkid.recognition.callback.RecognitionProcessCallback recognitionProcessCallback = recognizerRunnerView.getOutputMinFrameDuration;
            if (recognitionProcessCallback == null || recognitionProcessCallback.getCancelDelegate().IlIllIlIIl || recognizerRunnerView.coroutineCreation == null) {
                return;
            }
            recognizerRunnerView.getOutputMinFrameDurationlomOqCM.set(true);
            com.microblink.blinkid.secured.lIllIlIlII lillililii = (com.microblink.blinkid.secured.lIllIlIlII) recognizerRunnerView.getValidOutputFormatsForInputhNQ4ISI.getAndSet(null);
            if (lillililii != null) {
                lillililii.IlIllIlIIl();
            }
            recognizerRunnerView.unwrapAs.onScanningDone(recognitionSuccessType);
            com.microblink.blinkid.entities.recognizers.SignedPayload llIIlIlIIl = recognizerRunnerView.coroutineCreation.llIIlIlIIl(new com.microblink.blinkid.secured.IlIlIlIllI(recognizerRunnerView.getContext(), 1));
            if (llIIlIlIIl != null) {
                com.microblink.blinkid.secured.llIIIllIlI.llIIlIlIIl().llIIlIlIIl(1, recognitionSuccessType, llIIlIlIIl);
            }
            if (recognizerRunnerView.isOutputSupportedFor.get() <= 0) {
                recognizerRunnerView.getOutputMinFrameDurationlomOqCM.set(false);
                recognizerRunnerView.getHighSpeedVideoSizes();
                return;
            }
            return;
        }
        com.microblink.blinkid.util.Log.i(recognizerRunnerView, "Recognition has been paused, will not raise scanning done event.", new java.lang.Object[0]);
    }

    public RecognizerRunnerView(android.content.Context context) {
        this(context, null);
    }

    static /* synthetic */ com.microblink.blinkid.hardware.orientation.Orientation getOutputStallDurationlomOqCM(com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView) {
        com.microblink.blinkid.hardware.orientation.Orientation currentOrientation = recognizerRunnerView.getCurrentOrientation();
        if (currentOrientation == null || currentOrientation == com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_UNKNOWN) {
            currentOrientation = recognizerRunnerView.getInitialOrientation();
        }
        if (recognizerRunnerView.llIIlIlIIl()) {
            currentOrientation = currentOrientation.rotate180();
        }
        com.microblink.blinkid.util.Log.d(recognizerRunnerView, "Current orientation for recognition: {}", currentOrientation);
        return currentOrientation;
    }

    static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView, int i) {
        com.microblink.blinkid.recognition.NativeRecognizerWrapper nativeRecognizerWrapper = recognizerRunnerView.coroutineCreation;
        if (nativeRecognizerWrapper != null) {
            if (i == 0) {
                java.util.Timer timer = nativeRecognizerWrapper.IllIIIllII;
                if (timer != null) {
                    timer.cancel();
                }
                nativeRecognizerWrapper.IlIllIlIIl = false;
                nativeRecognizerWrapper.IllIIIllII = null;
                return;
            }
            if (nativeRecognizerWrapper.IllIIIllII == null) {
                com.microblink.blinkid.util.Log.d(nativeRecognizerWrapper, "Scheduling timeout after {} miliseconds", java.lang.Integer.valueOf(i));
                nativeRecognizerWrapper.IllIIIllII = new java.util.Timer();
                nativeRecognizerWrapper.IlIllIlIIl = false;
                nativeRecognizerWrapper.IllIIIllII.schedule(new com.microblink.blinkid.secured.lllIlIIlIl(nativeRecognizerWrapper), i);
            }
        }
    }
}
