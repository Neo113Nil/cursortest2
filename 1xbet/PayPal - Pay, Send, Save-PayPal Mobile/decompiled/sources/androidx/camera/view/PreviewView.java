package androidx.camera.view;

/* loaded from: classes6.dex */
public final class PreviewView extends android.widget.FrameLayout {
    private static final androidx.camera.view.PreviewView.ImplementationMode getOutputStallDurationlomOqCM = androidx.camera.view.PreviewView.ImplementationMode.PERFORMANCE;
    androidx.camera.view.CameraController Camera2StreamConfigurationMap;
    androidx.camera.view.PreviewViewImplementation getHighResolutionOutputSizeshNQ4ISI;
    final java.util.concurrent.atomic.AtomicReference<androidx.camera.view.PreviewStreamStateObserver> getHighSpeedVideoFpsRanges;
    androidx.camera.view.PreviewView.ImplementationMode getHighSpeedVideoFpsRangesFor;
    androidx.camera.core.impl.CameraInfoInternal getHighSpeedVideoSizes;
    final androidx.view.MutableLiveData<androidx.camera.view.PreviewView.StreamState> getHighSpeedVideoSizesFor;
    androidx.camera.view.PreviewView.OnFrameUpdateListener getInputFormats;
    androidx.camera.view.PreviewViewMeteringPointFactory getInputSizeshNQ4ISI;
    java.util.concurrent.Executor getOutputFormats;
    final androidx.camera.view.PreviewTransformation getOutputMinFrameDuration;
    private final androidx.camera.view.PreviewView.DisplayRotationListener getOutputMinFrameDurationlomOqCM;
    final androidx.camera.core.Preview.SurfaceProvider getOutputSizes;
    boolean getOutputSizeshNQ4ISI;
    final androidx.camera.view.ScreenFlashView getOutputStallDuration;
    private final androidx.camera.viewfinder.core.ZoomGestureDetector isOutputSupportedFor;
    private final android.view.View.OnLayoutChangeListener toString;
    private android.view.MotionEvent unwrapAs;

    public interface OnFrameUpdateListener {
        void onFrameUpdate(long j);
    }

    public enum StreamState {
        IDLE,
        STREAMING
    }

    /* renamed from: androidx.camera.view.PreviewView$1, reason: invalid class name */
    class AnonymousClass1 implements androidx.camera.core.Preview.SurfaceProvider {
        AnonymousClass1() {
        }

        @Override // androidx.camera.core.Preview.SurfaceProvider
        public void onSurfaceRequested(final androidx.camera.core.SurfaceRequest surfaceRequest) {
            androidx.camera.view.PreviewViewImplementation surfaceViewImplementation;
            if (!androidx.camera.core.impl.utils.Threads.isMainThread()) {
                androidx.core.content.ContextCompat.getMainExecutor(androidx.camera.view.PreviewView.this.getContext()).execute(new java.lang.Runnable() { // from class: androidx.camera.view.PreviewView$1$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.camera.view.PreviewView.AnonymousClass1 anonymousClass1 = androidx.camera.view.PreviewView.AnonymousClass1.this;
                        androidx.camera.view.PreviewView.this.getOutputSizes.onSurfaceRequested(surfaceRequest);
                    }
                });
                return;
            }
            androidx.camera.core.Logger.d("PreviewView", "Surface requested by Preview.");
            final androidx.camera.core.impl.CameraInternal camera = surfaceRequest.getCamera();
            androidx.camera.view.PreviewView.this.getHighSpeedVideoSizes = camera.getCamera2StreamConfigurationMap();
            androidx.camera.view.PreviewView.this.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(camera.getCamera2StreamConfigurationMap().getSensorRect());
            surfaceRequest.setTransformationInfoListener(androidx.core.content.ContextCompat.getMainExecutor(androidx.camera.view.PreviewView.this.getContext()), new androidx.camera.core.SurfaceRequest.TransformationInfoListener() { // from class: androidx.camera.view.PreviewView$1$$ExternalSyntheticLambda2
                @Override // androidx.camera.core.SurfaceRequest.TransformationInfoListener
                public final void onTransformationInfoUpdate(androidx.camera.core.SurfaceRequest.TransformationInfo transformationInfo) {
                    boolean z;
                    androidx.camera.view.PreviewView.AnonymousClass1 anonymousClass1 = androidx.camera.view.PreviewView.AnonymousClass1.this;
                    androidx.camera.core.impl.CameraInternal cameraInternal = camera;
                    androidx.camera.core.SurfaceRequest surfaceRequest2 = surfaceRequest;
                    androidx.camera.core.Logger.d("PreviewView", "Preview transformation info updated. ".concat(java.lang.String.valueOf(transformationInfo)));
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(cameraInternal.getCamera2StreamConfigurationMap().getLensFacing());
                    if (valueOf == null) {
                        androidx.camera.core.Logger.w("PreviewView", "The lens facing is null, probably an external.");
                    } else if (valueOf.intValue() != 0) {
                        z = false;
                        androidx.camera.view.PreviewTransformation previewTransformation = androidx.camera.view.PreviewView.this.getOutputMinFrameDuration;
                        android.util.Size resolution = surfaceRequest2.getResolution();
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Transformation info set: ");
                        sb.append(transformationInfo);
                        sb.append(" ");
                        sb.append(resolution);
                        sb.append(" ");
                        sb.append(z);
                        androidx.camera.core.Logger.d("PreviewTransform", sb.toString());
                        previewTransformation.getOutputFormats = transformationInfo.getCropRect();
                        previewTransformation.getHighSpeedVideoFpsRangesFor = transformationInfo.getRotationDegrees();
                        previewTransformation.getOutputMinFrameDuration = transformationInfo.getTargetRotation();
                        previewTransformation.getHighResolutionOutputSizeshNQ4ISI = resolution;
                        previewTransformation.Camera2StreamConfigurationMap = z;
                        previewTransformation.getHighSpeedVideoFpsRanges = transformationInfo.hasCameraTransform();
                        previewTransformation.getInputFormats = transformationInfo.getSensorToBufferTransform();
                        if (transformationInfo.getTargetRotation() != -1 || (androidx.camera.view.PreviewView.this.getHighResolutionOutputSizeshNQ4ISI != null && (androidx.camera.view.PreviewView.this.getHighResolutionOutputSizeshNQ4ISI instanceof androidx.camera.view.SurfaceViewImplementation))) {
                            androidx.camera.view.PreviewView.this.getOutputSizeshNQ4ISI = true;
                        } else {
                            androidx.camera.view.PreviewView.this.getOutputSizeshNQ4ISI = false;
                        }
                        androidx.camera.view.PreviewView.this.getHighResolutionOutputSizeshNQ4ISI();
                    }
                    z = true;
                    androidx.camera.view.PreviewTransformation previewTransformation2 = androidx.camera.view.PreviewView.this.getOutputMinFrameDuration;
                    android.util.Size resolution2 = surfaceRequest2.getResolution();
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Transformation info set: ");
                    sb2.append(transformationInfo);
                    sb2.append(" ");
                    sb2.append(resolution2);
                    sb2.append(" ");
                    sb2.append(z);
                    androidx.camera.core.Logger.d("PreviewTransform", sb2.toString());
                    previewTransformation2.getOutputFormats = transformationInfo.getCropRect();
                    previewTransformation2.getHighSpeedVideoFpsRangesFor = transformationInfo.getRotationDegrees();
                    previewTransformation2.getOutputMinFrameDuration = transformationInfo.getTargetRotation();
                    previewTransformation2.getHighResolutionOutputSizeshNQ4ISI = resolution2;
                    previewTransformation2.Camera2StreamConfigurationMap = z;
                    previewTransformation2.getHighSpeedVideoFpsRanges = transformationInfo.hasCameraTransform();
                    previewTransformation2.getInputFormats = transformationInfo.getSensorToBufferTransform();
                    if (transformationInfo.getTargetRotation() != -1) {
                    }
                    androidx.camera.view.PreviewView.this.getOutputSizeshNQ4ISI = true;
                    androidx.camera.view.PreviewView.this.getHighResolutionOutputSizeshNQ4ISI();
                }
            });
            if (!androidx.camera.view.PreviewView.getHighResolutionOutputSizeshNQ4ISI(androidx.camera.view.PreviewView.this.getHighResolutionOutputSizeshNQ4ISI, surfaceRequest, androidx.camera.view.PreviewView.this.getHighSpeedVideoFpsRangesFor)) {
                androidx.camera.view.PreviewView previewView = androidx.camera.view.PreviewView.this;
                if (androidx.camera.view.PreviewView.Camera2StreamConfigurationMap(surfaceRequest, previewView.getHighSpeedVideoFpsRangesFor)) {
                    androidx.camera.view.PreviewView previewView2 = androidx.camera.view.PreviewView.this;
                    surfaceViewImplementation = new androidx.camera.view.TextureViewImplementation(previewView2, previewView2.getOutputMinFrameDuration);
                } else {
                    androidx.camera.view.PreviewView previewView3 = androidx.camera.view.PreviewView.this;
                    surfaceViewImplementation = new androidx.camera.view.SurfaceViewImplementation(previewView3, previewView3.getOutputMinFrameDuration);
                }
                previewView.getHighResolutionOutputSizeshNQ4ISI = surfaceViewImplementation;
            }
            final androidx.camera.view.PreviewStreamStateObserver previewStreamStateObserver = new androidx.camera.view.PreviewStreamStateObserver(camera.getCamera2StreamConfigurationMap(), androidx.camera.view.PreviewView.this.getHighSpeedVideoSizesFor, androidx.camera.view.PreviewView.this.getHighResolutionOutputSizeshNQ4ISI);
            androidx.camera.view.PreviewView.this.getHighSpeedVideoFpsRanges.set(previewStreamStateObserver);
            camera.getCameraState().addObserver(androidx.core.content.ContextCompat.getMainExecutor(androidx.camera.view.PreviewView.this.getContext()), previewStreamStateObserver);
            androidx.camera.view.PreviewView.this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap(surfaceRequest, new androidx.camera.view.PreviewViewImplementation.OnSurfaceNotInUseListener() { // from class: androidx.camera.view.PreviewView$1$$ExternalSyntheticLambda3
                @Override // androidx.camera.view.PreviewViewImplementation.OnSurfaceNotInUseListener
                public final void onSurfaceNotInUse() {
                    androidx.camera.view.PreviewView.AnonymousClass1 anonymousClass1 = androidx.camera.view.PreviewView.AnonymousClass1.this;
                    androidx.camera.view.PreviewStreamStateObserver previewStreamStateObserver2 = previewStreamStateObserver;
                    androidx.camera.core.impl.CameraInternal cameraInternal = camera;
                    if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(androidx.camera.view.PreviewView.this.getHighSpeedVideoFpsRanges, previewStreamStateObserver2, null)) {
                        previewStreamStateObserver2.Camera2StreamConfigurationMap(androidx.camera.view.PreviewView.StreamState.IDLE);
                    }
                    com.google.common.util.concurrent.ListenableFuture<java.lang.Void> listenableFuture = previewStreamStateObserver2.getHighSpeedVideoFpsRanges;
                    if (listenableFuture != null) {
                        listenableFuture.cancel(false);
                        previewStreamStateObserver2.getHighSpeedVideoFpsRanges = null;
                    }
                    cameraInternal.getCameraState().removeObserver(previewStreamStateObserver2);
                }
            });
            androidx.camera.view.PreviewView previewView4 = androidx.camera.view.PreviewView.this;
            if (previewView4.indexOfChild(previewView4.getOutputStallDuration) == -1) {
                androidx.camera.view.PreviewView previewView5 = androidx.camera.view.PreviewView.this;
                previewView5.addView(previewView5.getOutputStallDuration);
            }
            if (androidx.camera.view.PreviewView.this.getInputFormats == null || androidx.camera.view.PreviewView.this.getOutputFormats == null) {
                return;
            }
            androidx.camera.view.PreviewView.this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(androidx.camera.view.PreviewView.this.getOutputFormats, androidx.camera.view.PreviewView.this.getInputFormats);
        }
    }

    public PreviewView(android.content.Context context) {
        this(context, null);
    }

    public PreviewView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreviewView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreviewView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        androidx.camera.view.PreviewView.ImplementationMode implementationMode = getOutputStallDurationlomOqCM;
        this.getHighSpeedVideoFpsRangesFor = implementationMode;
        androidx.camera.view.PreviewTransformation previewTransformation = new androidx.camera.view.PreviewTransformation();
        this.getOutputMinFrameDuration = previewTransformation;
        this.getOutputSizeshNQ4ISI = true;
        this.getHighSpeedVideoSizesFor = new androidx.view.MutableLiveData<>(androidx.camera.view.PreviewView.StreamState.IDLE);
        this.getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicReference<>();
        this.getInputSizeshNQ4ISI = new androidx.camera.view.PreviewViewMeteringPointFactory(previewTransformation);
        this.getOutputMinFrameDurationlomOqCM = new androidx.camera.view.PreviewView.DisplayRotationListener();
        this.toString = new android.view.View.OnLayoutChangeListener() { // from class: androidx.camera.view.PreviewView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(android.view.View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                androidx.camera.view.PreviewView previewView = androidx.camera.view.PreviewView.this;
                if (i5 - i3 == i9 - i7 && i6 - i4 == i10 - i8) {
                    return;
                }
                previewView.getHighResolutionOutputSizeshNQ4ISI();
                previewView.getHighSpeedVideoFpsRanges(true);
            }
        };
        this.getOutputSizes = new androidx.camera.view.PreviewView.AnonymousClass1();
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        android.content.res.TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, androidx.camera.view.R.styleable.PreviewView, i, i2);
        androidx.core.view.ViewCompat.saveAttributeDataForStyleable(this, context, androidx.camera.view.R.styleable.PreviewView, attributeSet, obtainStyledAttributes, i, i2);
        try {
            setScaleType(androidx.camera.view.PreviewView.ScaleType.getHighSpeedVideoFpsRanges(obtainStyledAttributes.getInteger(androidx.camera.view.R.styleable.PreviewView_scaleType, previewTransformation.getHighSpeedVideoSizes.getHighSpeedVideoSizes)));
            setImplementationMode(androidx.camera.view.PreviewView.ImplementationMode.Camera2StreamConfigurationMap(obtainStyledAttributes.getInteger(androidx.camera.view.R.styleable.PreviewView_implementationMode, implementationMode.Camera2StreamConfigurationMap)));
            obtainStyledAttributes.recycle();
            this.isOutputSupportedFor = new androidx.camera.viewfinder.core.ZoomGestureDetector(context, new androidx.camera.viewfinder.core.ZoomGestureDetector.OnZoomGestureListener() { // from class: androidx.camera.view.PreviewView$$ExternalSyntheticLambda1
                @Override // androidx.camera.viewfinder.core.ZoomGestureDetector.OnZoomGestureListener
                public final boolean onZoomEvent(androidx.camera.viewfinder.core.ZoomGestureDetector.ZoomEvent zoomEvent) {
                    androidx.camera.view.CameraController cameraController;
                    androidx.camera.view.PreviewView previewView = androidx.camera.view.PreviewView.this;
                    if (!(zoomEvent instanceof androidx.camera.viewfinder.core.ZoomGestureDetector.ZoomEvent.Move) || (cameraController = previewView.Camera2StreamConfigurationMap) == null) {
                        return true;
                    }
                    float incrementalScaleFactor = ((androidx.camera.viewfinder.core.ZoomGestureDetector.ZoomEvent.Move) zoomEvent).getIncrementalScaleFactor();
                    if (cameraController.getHighSpeedVideoFpsRangesFor == null) {
                        androidx.camera.core.Logger.w("CameraController", "Use cases not attached to camera.");
                        return true;
                    }
                    if (!cameraController.toString) {
                        androidx.camera.core.Logger.d("CameraController", "Pinch to zoom disabled.");
                        return true;
                    }
                    androidx.camera.core.Logger.d("CameraController", "Pinch to zoom with scale: ".concat(java.lang.String.valueOf(incrementalScaleFactor)));
                    androidx.camera.core.ZoomState value = cameraController.getZoomState().getValue();
                    if (value == null) {
                        return true;
                    }
                    cameraController.setZoomRatio(java.lang.Math.min(java.lang.Math.max(value.getGetHighResolutionOutputSizeshNQ4ISI() * (incrementalScaleFactor > 1.0f ? ((incrementalScaleFactor - 1.0f) * 2.0f) + 1.0f : 1.0f - ((1.0f - incrementalScaleFactor) * 2.0f)), value.getGetHighSpeedVideoFpsRangesFor()), value.getGetHighSpeedVideoSizes()));
                    return true;
                }
            });
            if (getBackground() == null) {
                setBackgroundColor(androidx.core.content.ContextCompat.getColor(getContext(), android.R.color.black));
            }
            androidx.camera.view.ScreenFlashView screenFlashView = new androidx.camera.view.ScreenFlashView(context);
            this.getOutputStallDuration = screenFlashView;
            screenFlashView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1));
        } catch (java.lang.Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode()) {
            android.content.Context context = getContext();
            android.hardware.display.DisplayManager displayManager = context == null ? null : (android.hardware.display.DisplayManager) context.getSystemService(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
            if (displayManager != null) {
                displayManager.registerDisplayListener(this.getOutputMinFrameDurationlomOqCM, new android.os.Handler(android.os.Looper.getMainLooper()));
            }
        }
        addOnLayoutChangeListener(this.toString);
        androidx.camera.view.PreviewViewImplementation previewViewImplementation = this.getHighResolutionOutputSizeshNQ4ISI;
        if (previewViewImplementation != null) {
            previewViewImplementation.getHighSpeedVideoFpsRanges();
        }
        getHighSpeedVideoFpsRanges(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.toString);
        androidx.camera.view.PreviewViewImplementation previewViewImplementation = this.getHighResolutionOutputSizeshNQ4ISI;
        if (previewViewImplementation != null) {
            previewViewImplementation.getHighSpeedVideoSizes();
        }
        androidx.camera.view.CameraController cameraController = this.Camera2StreamConfigurationMap;
        if (cameraController != null) {
            cameraController.Camera2StreamConfigurationMap();
        }
        if (isInEditMode()) {
            return;
        }
        android.content.Context context = getContext();
        android.hardware.display.DisplayManager displayManager = context == null ? null : (android.hardware.display.DisplayManager) context.getSystemService(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
        if (displayManager != null) {
            displayManager.unregisterDisplayListener(this.getOutputMinFrameDurationlomOqCM);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.Camera2StreamConfigurationMap == null) {
            return super.onTouchEvent(motionEvent);
        }
        boolean z = motionEvent.getPointerCount() == 1;
        boolean z2 = motionEvent.getAction() == 1;
        boolean z3 = motionEvent.getEventTime() - motionEvent.getDownTime() < ((long) android.view.ViewConfiguration.getLongPressTimeout());
        if (!z || !z2 || !z3) {
            return this.isOutputSupportedFor.onTouchEvent(motionEvent) || super.onTouchEvent(motionEvent);
        }
        this.unwrapAs = motionEvent;
        performClick();
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        androidx.camera.core.FocusMeteringAction.Builder disableAutoCancel;
        if (this.Camera2StreamConfigurationMap != null) {
            android.view.MotionEvent motionEvent = this.unwrapAs;
            float x = motionEvent != null ? motionEvent.getX() : getWidth() / 2.0f;
            android.view.MotionEvent motionEvent2 = this.unwrapAs;
            float y = motionEvent2 != null ? motionEvent2.getY() : getHeight() / 2.0f;
            androidx.camera.view.CameraController cameraController = this.Camera2StreamConfigurationMap;
            androidx.camera.view.PreviewViewMeteringPointFactory previewViewMeteringPointFactory = this.getInputSizeshNQ4ISI;
            if (cameraController.getHighSpeedVideoFpsRangesFor == null) {
                androidx.camera.core.Logger.w("CameraController", "Use cases not attached to camera.");
            } else if (!cameraController.coroutineCreation) {
                androidx.camera.core.Logger.d("CameraController", "Tap to focus disabled. ");
            } else {
                android.graphics.PointF pointF = new android.graphics.PointF(x, y);
                androidx.camera.core.FocusMeteringAction.Builder addPoint = new androidx.camera.core.FocusMeteringAction.Builder(previewViewMeteringPointFactory.createPoint(pointF.x, pointF.y, 0.16666667f), 1).addPoint(previewViewMeteringPointFactory.createPoint(pointF.x, pointF.y, 0.25f), 2);
                long j = cameraController.ArtificialStackFrames;
                if (j > 0) {
                    disableAutoCancel = addPoint.setAutoCancelDuration(j, java.util.concurrent.TimeUnit.NANOSECONDS);
                } else {
                    disableAutoCancel = addPoint.disableAutoCancel();
                }
                androidx.camera.core.FocusMeteringAction build = disableAutoCancel.build();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Tap to focus started: ");
                sb.append(x);
                sb.append(", ");
                sb.append(y);
                androidx.camera.core.Logger.d("CameraController", sb.toString());
                androidx.camera.view.CameraController.FocusMeteringResultCallback focusMeteringResultCallback = cameraController.getHighSpeedVideoSizesFor;
                if (focusMeteringResultCallback != null) {
                    synchronized (focusMeteringResultCallback.getHighResolutionOutputSizeshNQ4ISI) {
                        focusMeteringResultCallback.getHighSpeedVideoFpsRanges = true;
                    }
                }
                cameraController._CREATION.postValue(new androidx.camera.view.TapToFocusInfo(1, pointF));
                final androidx.camera.view.CameraController.FocusMeteringResultCallback focusMeteringResultCallback2 = new androidx.camera.view.CameraController.FocusMeteringResultCallback(pointF, cameraController._CREATION);
                cameraController.getHighSpeedVideoSizesFor = focusMeteringResultCallback2;
                androidx.camera.core.impl.utils.futures.Futures.addCallback(cameraController.getHighSpeedVideoFpsRangesFor.getCameraControl().startFocusAndMetering(build), focusMeteringResultCallback2, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
                long millis = java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(cameraController.ArtificialStackFrames);
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Tap to focus auto cancel duration: ");
                sb2.append(millis);
                sb2.append(" ms");
                androidx.camera.core.Logger.d("CameraController", sb2.toString());
                if (millis > 0) {
                    new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new java.lang.Runnable() { // from class: androidx.camera.view.CameraController$$ExternalSyntheticLambda5
                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.camera.view.CameraController.FocusMeteringResultCallback focusMeteringResultCallback3 = androidx.camera.view.CameraController.FocusMeteringResultCallback.this;
                            synchronized (focusMeteringResultCallback3.getHighResolutionOutputSizeshNQ4ISI) {
                                if (focusMeteringResultCallback3.getHighSpeedVideoFpsRanges) {
                                    return;
                                }
                                androidx.camera.core.Logger.d("CameraController", "Tap-to-focus reset.");
                                focusMeteringResultCallback3.getHighSpeedVideoSizes.postValue(new androidx.camera.view.TapToFocusInfo(0, null));
                                focusMeteringResultCallback3.getHighSpeedVideoFpsRanges = true;
                            }
                        }
                    }, millis);
                }
            }
        }
        this.unwrapAs = null;
        return super.performClick();
    }

    public final void setImplementationMode(androidx.camera.view.PreviewView.ImplementationMode implementationMode) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        this.getHighSpeedVideoFpsRangesFor = implementationMode;
        if (implementationMode == androidx.camera.view.PreviewView.ImplementationMode.PERFORMANCE && this.getInputFormats != null) {
            throw new java.lang.IllegalArgumentException("PERFORMANCE mode doesn't support frame update listener");
        }
    }

    public final androidx.camera.view.PreviewView.ImplementationMode getImplementationMode() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final androidx.camera.core.Preview.SurfaceProvider getSurfaceProvider() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        return this.getOutputSizes;
    }

    public final void setScaleType(androidx.camera.view.PreviewView.ScaleType scaleType) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        this.getOutputMinFrameDuration.getHighSpeedVideoSizes = scaleType;
        getHighResolutionOutputSizeshNQ4ISI();
        getHighSpeedVideoFpsRanges(false);
    }

    public final androidx.camera.view.PreviewView.ScaleType getScaleType() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        return this.getOutputMinFrameDuration.getHighSpeedVideoSizes;
    }

    public final androidx.camera.core.MeteringPointFactory getMeteringPointFactory() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        return this.getInputSizeshNQ4ISI;
    }

    public final androidx.view.LiveData<androidx.camera.view.PreviewView.StreamState> getPreviewStreamState() {
        return this.getHighSpeedVideoSizesFor;
    }

    public final android.graphics.Bitmap getBitmap() {
        android.graphics.Bitmap highResolutionOutputSizeshNQ4ISI;
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        androidx.camera.view.PreviewViewImplementation previewViewImplementation = this.getHighResolutionOutputSizeshNQ4ISI;
        if (previewViewImplementation == null || (highResolutionOutputSizeshNQ4ISI = previewViewImplementation.getHighResolutionOutputSizeshNQ4ISI()) == null) {
            return null;
        }
        androidx.camera.view.PreviewTransformation previewTransformation = previewViewImplementation.getHighSpeedVideoFpsRangesFor;
        android.util.Size size = new android.util.Size(previewViewImplementation.getHighSpeedVideoFpsRanges.getWidth(), previewViewImplementation.getHighSpeedVideoFpsRanges.getHeight());
        int layoutDirection = previewViewImplementation.getHighSpeedVideoFpsRanges.getLayoutDirection();
        if (!previewTransformation.getHighSpeedVideoFpsRanges()) {
            return highResolutionOutputSizeshNQ4ISI;
        }
        android.graphics.Matrix highSpeedVideoSizes = previewTransformation.getHighSpeedVideoSizes();
        android.graphics.RectF highSpeedVideoFpsRanges = previewTransformation.getHighSpeedVideoFpsRanges(size, layoutDirection);
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(size.getWidth(), size.getHeight(), highResolutionOutputSizeshNQ4ISI.getConfig());
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.postConcat(highSpeedVideoSizes);
        matrix.postScale(highSpeedVideoFpsRanges.width() / previewTransformation.getHighResolutionOutputSizeshNQ4ISI.getWidth(), highSpeedVideoFpsRanges.height() / previewTransformation.getHighResolutionOutputSizeshNQ4ISI.getHeight());
        matrix.postTranslate(highSpeedVideoFpsRanges.left, highSpeedVideoFpsRanges.top);
        canvas.drawBitmap(highResolutionOutputSizeshNQ4ISI, matrix, new android.graphics.Paint(7));
        return createBitmap;
    }

    public final androidx.camera.core.ViewPort getViewPort() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        android.view.Display highSpeedVideoSizes = getHighSpeedVideoSizes();
        if (highSpeedVideoSizes == null) {
            return null;
        }
        return getViewPort(highSpeedVideoSizes.getRotation());
    }

    public final androidx.camera.core.ViewPort getViewPort(int i) {
        int i2;
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        androidx.camera.core.ViewPort.Builder builder = new androidx.camera.core.ViewPort.Builder(new android.util.Rational(getWidth(), getHeight()), i);
        int ordinal = getScaleType().ordinal();
        if (ordinal != 0) {
            i2 = 1;
            if (ordinal != 1) {
                i2 = 2;
                if (ordinal != 2) {
                    i2 = 3;
                    if (ordinal != 3 && ordinal != 4 && ordinal != 5) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected scale type: ");
                        sb.append(getScaleType());
                        throw new java.lang.IllegalStateException(sb.toString());
                    }
                }
            }
        } else {
            i2 = 0;
        }
        return builder.setScaleType(i2).setLayoutDirection(getLayoutDirection()).build();
    }

    final void getHighResolutionOutputSizeshNQ4ISI() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        if (this.getHighResolutionOutputSizeshNQ4ISI != null) {
            getHighSpeedVideoFpsRangesFor();
            this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizesFor();
        }
        this.getInputSizeshNQ4ISI.getHighSpeedVideoSizes(new android.util.Size(getWidth(), getHeight()), getLayoutDirection());
        androidx.camera.view.CameraController cameraController = this.Camera2StreamConfigurationMap;
        if (cameraController != null) {
            cameraController.Camera2StreamConfigurationMap(getSensorToViewTransform());
        }
    }

    static boolean getHighResolutionOutputSizeshNQ4ISI(androidx.camera.view.PreviewViewImplementation previewViewImplementation, androidx.camera.core.SurfaceRequest surfaceRequest, androidx.camera.view.PreviewView.ImplementationMode implementationMode) {
        return (previewViewImplementation instanceof androidx.camera.view.SurfaceViewImplementation) && !Camera2StreamConfigurationMap(surfaceRequest, implementationMode);
    }

    static boolean Camera2StreamConfigurationMap(androidx.camera.core.SurfaceRequest surfaceRequest, androidx.camera.view.PreviewView.ImplementationMode implementationMode) {
        boolean equals = surfaceRequest.getCamera().getCamera2StreamConfigurationMap().getImplementationType().equals(androidx.camera.core.CameraInfo.IMPLEMENTATION_TYPE_CAMERA2_LEGACY);
        boolean z = (androidx.camera.view.internal.compat.quirk.DeviceQuirks.get(androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk.class) == null && androidx.camera.view.internal.compat.quirk.DeviceQuirks.get(androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk.class) == null) ? false : true;
        if (equals || z) {
            return true;
        }
        int ordinal = implementationMode.ordinal();
        if (ordinal == 0) {
            return false;
        }
        if (ordinal == 1) {
            return true;
        }
        throw new java.lang.IllegalArgumentException("Invalid implementation mode: ".concat(java.lang.String.valueOf(implementationMode)));
    }

    private void getHighSpeedVideoFpsRangesFor() {
        android.view.Display highSpeedVideoSizes;
        androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal;
        if (!this.getOutputSizeshNQ4ISI || (highSpeedVideoSizes = getHighSpeedVideoSizes()) == null || (cameraInfoInternal = this.getHighSpeedVideoSizes) == null) {
            return;
        }
        androidx.camera.view.PreviewTransformation previewTransformation = this.getOutputMinFrameDuration;
        int sensorRotationDegrees = cameraInfoInternal.getSensorRotationDegrees(highSpeedVideoSizes.getRotation());
        int rotation = highSpeedVideoSizes.getRotation();
        if (previewTransformation.getHighSpeedVideoFpsRanges) {
            previewTransformation.getHighSpeedVideoFpsRangesFor = sensorRotationDegrees;
            previewTransformation.getOutputMinFrameDuration = rotation;
        }
    }

    public final void setFrameUpdateListener(java.util.concurrent.Executor executor, androidx.camera.view.PreviewView.OnFrameUpdateListener onFrameUpdateListener) {
        if (this.getHighSpeedVideoFpsRangesFor == androidx.camera.view.PreviewView.ImplementationMode.PERFORMANCE) {
            throw new java.lang.IllegalArgumentException("PERFORMANCE mode doesn't support frame update listener");
        }
        this.getInputFormats = onFrameUpdateListener;
        this.getOutputFormats = executor;
        androidx.camera.view.PreviewViewImplementation previewViewImplementation = this.getHighResolutionOutputSizeshNQ4ISI;
        if (previewViewImplementation != null) {
            previewViewImplementation.getHighResolutionOutputSizeshNQ4ISI(executor, onFrameUpdateListener);
        }
    }

    public enum ImplementationMode {
        PERFORMANCE(0),
        COMPATIBLE(1);

        final int Camera2StreamConfigurationMap;

        ImplementationMode(int i) {
            this.Camera2StreamConfigurationMap = i;
        }

        static androidx.camera.view.PreviewView.ImplementationMode Camera2StreamConfigurationMap(int i) {
            for (androidx.camera.view.PreviewView.ImplementationMode implementationMode : values()) {
                if (implementationMode.Camera2StreamConfigurationMap == i) {
                    return implementationMode;
                }
            }
            throw new java.lang.IllegalArgumentException("Unknown implementation mode id ".concat(java.lang.String.valueOf(i)));
        }
    }

    public enum ScaleType {
        FILL_START(0),
        FILL_CENTER(1),
        FILL_END(2),
        FIT_START(3),
        FIT_CENTER(4),
        FIT_END(5);

        final int getHighSpeedVideoSizes;

        ScaleType(int i) {
            this.getHighSpeedVideoSizes = i;
        }

        static androidx.camera.view.PreviewView.ScaleType getHighSpeedVideoFpsRanges(int i) {
            for (androidx.camera.view.PreviewView.ScaleType scaleType : values()) {
                if (scaleType.getHighSpeedVideoSizes == i) {
                    return scaleType;
                }
            }
            throw new java.lang.IllegalArgumentException("Unknown scale type id ".concat(java.lang.String.valueOf(i)));
        }
    }

    public final void setController(androidx.camera.view.CameraController cameraController) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        androidx.camera.view.CameraController cameraController2 = this.Camera2StreamConfigurationMap;
        if (cameraController2 != null && cameraController2 != cameraController) {
            cameraController2.Camera2StreamConfigurationMap();
            getHighSpeedVideoFpsRanges((androidx.camera.core.ImageCapture.ScreenFlash) null);
        }
        this.Camera2StreamConfigurationMap = cameraController;
        getHighSpeedVideoFpsRanges(false);
        getHighSpeedVideoFpsRanges(this.getOutputStallDuration.getScreenFlash());
    }

    public final androidx.camera.view.CameraController getController() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        return this.Camera2StreamConfigurationMap;
    }

    public final androidx.camera.view.transform.OutputTransform getOutputTransform() {
        android.graphics.Matrix matrix;
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        try {
            matrix = this.getOutputMinFrameDuration.getHighSpeedVideoFpsRangesFor(new android.util.Size(getWidth(), getHeight()), getLayoutDirection());
        } catch (java.lang.IllegalStateException unused) {
            matrix = null;
        }
        android.graphics.Rect rect = this.getOutputMinFrameDuration.getOutputFormats;
        if (matrix == null || rect == null) {
            androidx.camera.core.Logger.d("PreviewView", "Transform info is not ready");
            return null;
        }
        matrix.preConcat(androidx.camera.core.impl.utils.TransformUtils.getNormalizedToBuffer(rect));
        if (this.getHighResolutionOutputSizeshNQ4ISI instanceof androidx.camera.view.TextureViewImplementation) {
            matrix.postConcat(getMatrix());
        } else if (!getMatrix().isIdentity()) {
            androidx.camera.core.Logger.w("PreviewView", "PreviewView needs to be in COMPATIBLE mode for the transform to work correctly.");
        }
        return new androidx.camera.view.transform.OutputTransform(matrix, new android.util.Size(rect.width(), rect.height()));
    }

    public final android.graphics.Matrix getSensorToViewTransform() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        return this.getOutputMinFrameDuration.getHighResolutionOutputSizeshNQ4ISI(new android.util.Size(getWidth(), getHeight()), getLayoutDirection());
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0062 A[Catch: IllegalStateException -> 0x0072, TryCatch #0 {IllegalStateException -> 0x0072, blocks: (B:7:0x0013, B:9:0x0020, B:10:0x0027, B:12:0x002c, B:14:0x0031, B:16:0x0038, B:17:0x003f, B:19:0x0047, B:24:0x0052, B:26:0x0062, B:28:0x006b, B:29:0x006e), top: B:6:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006b A[Catch: IllegalStateException -> 0x0072, TryCatch #0 {IllegalStateException -> 0x0072, blocks: (B:7:0x0013, B:9:0x0020, B:10:0x0027, B:12:0x002c, B:14:0x0031, B:16:0x0038, B:17:0x003f, B:19:0x0047, B:24:0x0052, B:26:0x0062, B:28:0x006b, B:29:0x006e), top: B:6:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void getHighSpeedVideoFpsRanges(boolean z) {
        boolean z2;
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        androidx.camera.core.ViewPort viewPort = getViewPort();
        if (this.Camera2StreamConfigurationMap == null || viewPort == null || !isAttachedToWindow()) {
            return;
        }
        try {
            androidx.camera.view.CameraController cameraController = this.Camera2StreamConfigurationMap;
            androidx.camera.core.Preview.SurfaceProvider surfaceProvider = getSurfaceProvider();
            androidx.camera.core.impl.utils.Threads.checkMainThread();
            if (cameraController.coroutineBoundary != surfaceProvider) {
                cameraController.coroutineBoundary = surfaceProvider;
                cameraController.isOutputSupportedForhNQ4ISI.setSurfaceProvider(surfaceProvider);
            }
            if (cameraController.accessartificialFrame == null) {
                z2 = true;
                if (cameraController.getARTIFICIAL_FRAME_PACKAGE_NAME != null) {
                    int highResolutionOutputSizeshNQ4ISI = cameraController.getHighResolutionOutputSizeshNQ4ISI(viewPort);
                    androidx.camera.core.resolutionselector.AspectRatioStrategy aspectRatioStrategy = highResolutionOutputSizeshNQ4ISI != -1 ? new androidx.camera.core.resolutionselector.AspectRatioStrategy(highResolutionOutputSizeshNQ4ISI, 1) : null;
                    int highResolutionOutputSizeshNQ4ISI2 = cameraController.getHighResolutionOutputSizeshNQ4ISI(cameraController.getARTIFICIAL_FRAME_PACKAGE_NAME);
                    if (aspectRatioStrategy != (highResolutionOutputSizeshNQ4ISI2 != -1 ? new androidx.camera.core.resolutionselector.AspectRatioStrategy(highResolutionOutputSizeshNQ4ISI2, 1) : null)) {
                    }
                }
                cameraController.getARTIFICIAL_FRAME_PACKAGE_NAME = viewPort;
                if (!cameraController.CoroutineDebuggingKt.addListener(androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor(), cameraController.getHighSpeedVideoFpsRanges)) {
                    androidx.camera.core.Logger.w("CameraController", "The device cannot detect rotation changes.");
                }
                if (z2) {
                    cameraController.getHighSpeedVideoFpsRangesFor();
                }
                cameraController.getHighSpeedVideoSizes((java.lang.Runnable) null);
            }
            z2 = false;
            cameraController.getARTIFICIAL_FRAME_PACKAGE_NAME = viewPort;
            if (!cameraController.CoroutineDebuggingKt.addListener(androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor(), cameraController.getHighSpeedVideoFpsRanges)) {
            }
            if (z2) {
            }
            cameraController.getHighSpeedVideoSizes((java.lang.Runnable) null);
        } catch (java.lang.IllegalStateException e) {
            if (z) {
                androidx.camera.core.Logger.e("PreviewView", e.toString(), e);
                return;
            }
            throw e;
        }
    }

    private void getHighSpeedVideoFpsRanges(androidx.camera.core.ImageCapture.ScreenFlash screenFlash) {
        androidx.camera.view.CameraController cameraController = this.Camera2StreamConfigurationMap;
        if (cameraController == null) {
            androidx.camera.core.Logger.d("PreviewView", "setScreenFlashUiInfo: mCameraController is null!");
        } else {
            cameraController.setScreenFlashUiInfo(new androidx.camera.view.internal.ScreenFlashUiInfo(androidx.camera.view.internal.ScreenFlashUiInfo.ProviderType.PREVIEW_VIEW, screenFlash));
        }
    }

    public final void setScreenFlashWindow(android.view.Window window) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        this.getOutputStallDuration.setScreenFlashWindow(window);
        getHighSpeedVideoFpsRanges(this.getOutputStallDuration.getScreenFlash());
    }

    public final void setScreenFlashOverlayColor(int i) {
        this.getOutputStallDuration.setBackgroundColor(i);
    }

    final android.view.Display getHighSpeedVideoSizes() {
        if (getDisplay() == null) {
            return null;
        }
        android.content.Context context = getContext();
        android.view.Display display = (context != null ? (android.hardware.display.DisplayManager) context.getSystemService(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION) : null).getDisplay(0);
        return display != null ? display : getDisplay();
    }

    class DisplayRotationListener implements android.hardware.display.DisplayManager.DisplayListener {
        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i) {
        }

        DisplayRotationListener() {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i) {
            android.view.Display highSpeedVideoSizes = androidx.camera.view.PreviewView.this.getHighSpeedVideoSizes();
            if (highSpeedVideoSizes == null || highSpeedVideoSizes.getDisplayId() != i) {
                return;
            }
            androidx.camera.view.PreviewView.this.getHighResolutionOutputSizeshNQ4ISI();
        }
    }

    public final androidx.camera.core.ImageCapture.ScreenFlash getScreenFlash() {
        return this.getOutputStallDuration.getScreenFlash();
    }
}
