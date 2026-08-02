package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public final class t extends com.dyneti.android.dyscan.m {
    public static com.dyneti.android.dyscan.b l;
    public static boolean m;
    public static int n;

    /* renamed from: o, reason: collision with root package name */
    public static boolean f3339o;
    public final com.dyneti.android.dyscan.l2 b;
    public final com.dyneti.android.dyscan.DyScanView c;
    public final java.util.concurrent.ExecutorService d;
    public final androidx.camera.view.PreviewView e;
    public androidx.camera.core.ImageAnalysis f;
    public androidx.camera.lifecycle.ProcessCameraProvider g;
    public androidx.camera.core.Camera h;
    public androidx.camera.core.Preview i;
    public boolean j;
    public boolean k;

    public t(com.dyneti.android.dyscan.t1 t1Var, com.dyneti.android.dyscan.l2 l2Var, com.dyneti.android.dyscan.DyScanView dyScanView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t1Var, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(l2Var, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dyScanView, "");
        this.b = l2Var;
        this.c = dyScanView;
        this.d = java.util.concurrent.Executors.newSingleThreadExecutor();
        androidx.camera.view.PreviewView previewView = dyScanView.c;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(previewView, "");
        this.e = previewView;
        this.k = true;
    }

    public static final void a(com.google.common.util.concurrent.ListenableFuture listenableFuture) {
        try {
            listenableFuture.get();
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
        }
    }

    public static final void b(com.google.common.util.concurrent.ListenableFuture listenableFuture, com.dyneti.android.dyscan.t tVar) {
        try {
            listenableFuture.get();
        } catch (java.lang.InterruptedException unused) {
        } catch (java.util.concurrent.ExecutionException unused2) {
        } finally {
            tVar.j = false;
        }
    }

    public final boolean c() {
        androidx.camera.core.CameraInfo cameraInfo;
        androidx.view.LiveData<java.lang.Integer> torchState;
        java.lang.Integer value;
        androidx.camera.core.Camera camera = this.h;
        return (camera == null || (cameraInfo = camera.getCameraInfo()) == null || (torchState = cameraInfo.getTorchState()) == null || (value = torchState.getValue()) == null || !value.equals(1)) ? false : true;
    }

    public final void d() {
        androidx.camera.core.CameraControl cameraControl;
        androidx.camera.core.CameraInfo cameraInfo;
        androidx.view.LiveData<java.lang.Integer> torchState;
        java.lang.Integer value;
        androidx.camera.core.Camera camera = this.h;
        boolean z = (camera == null || (cameraInfo = camera.getCameraInfo()) == null || (torchState = cameraInfo.getTorchState()) == null || (value = torchState.getValue()) == null || !value.equals(1)) ? false : true;
        androidx.camera.core.Camera camera2 = this.h;
        final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> enableTorch = (camera2 == null || (cameraControl = camera2.getCameraControl()) == null) ? null : cameraControl.enableTorch(!z);
        if (enableTorch != null) {
            enableTorch.addListener(new java.lang.Runnable() { // from class: com.dyneti.android.dyscan.t$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    com.dyneti.android.dyscan.t.a(com.google.common.util.concurrent.ListenableFuture.this);
                }
            }, androidx.core.content.ContextCompat.getMainExecutor(this.c.getContext()));
        }
    }

    public static final void c(com.google.common.util.concurrent.ListenableFuture listenableFuture, com.dyneti.android.dyscan.t tVar) {
        try {
            listenableFuture.get();
        } catch (java.lang.InterruptedException unused) {
        } catch (java.util.concurrent.ExecutionException unused2) {
        } finally {
            tVar.f3322a = false;
        }
    }

    public final void a(boolean z) {
        androidx.camera.core.CameraInfo cameraInfo;
        androidx.camera.core.ExposureState exposureState;
        androidx.camera.core.CameraControl cameraControl;
        if (c()) {
            if (z) {
                new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new java.lang.Runnable() { // from class: com.dyneti.android.dyscan.t$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.dyneti.android.dyscan.t.a(com.dyneti.android.dyscan.t.this);
                    }
                }, 3000L);
                return;
            }
            if (this.j) {
                return;
            }
            this.j = true;
            f3339o = true;
            androidx.camera.core.Camera camera = this.h;
            if (camera == null || (cameraInfo = camera.getCameraInfo()) == null || (exposureState = cameraInfo.getExposureState()) == null) {
                return;
            }
            if (!exposureState.getGetHighResolutionOutputSizeshNQ4ISI()) {
                this.j = false;
                return;
            }
            int getHighSpeedVideoSizes = exposureState.getGetHighSpeedVideoSizes() - 1;
            if (getHighSpeedVideoSizes >= exposureState.getExposureCompensationRange().getLower().intValue()) {
                androidx.camera.core.Camera camera2 = this.h;
                final com.google.common.util.concurrent.ListenableFuture<java.lang.Integer> exposureCompensationIndex = (camera2 == null || (cameraControl = camera2.getCameraControl()) == null) ? null : cameraControl.setExposureCompensationIndex(getHighSpeedVideoSizes);
                if (exposureCompensationIndex != null) {
                    exposureCompensationIndex.addListener(new java.lang.Runnable() { // from class: com.dyneti.android.dyscan.t$$ExternalSyntheticLambda7
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.dyneti.android.dyscan.t.b(com.google.common.util.concurrent.ListenableFuture.this, this);
                        }
                    }, androidx.core.content.ContextCompat.getMainExecutor(this.c.getContext()));
                }
            }
        }
    }

    public final boolean b() {
        android.content.Context context = this.c.getContext();
        if (context.getPackageManager().hasSystemFeature("android.hardware.camera.flash")) {
            return true;
        }
        java.lang.Object systemService = context.getSystemService(com.paypal.oslo.feature.qrc.domain.utils.Constants.SOURCE_CAMERA);
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
        android.hardware.camera2.CameraManager cameraManager = (android.hardware.camera2.CameraManager) systemService;
        try {
            for (java.lang.String str : cameraManager.getCameraIdList()) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(cameraManager.getCameraCharacteristics(str).get(android.hardware.camera2.CameraCharacteristics.FLASH_INFO_AVAILABLE), java.lang.Boolean.TRUE)) {
                    return true;
                }
            }
        } catch (android.hardware.camera2.CameraAccessException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static final void a(final com.dyneti.android.dyscan.t tVar) {
        androidx.camera.core.CameraControl cameraControl;
        androidx.camera.core.Camera camera = tVar.h;
        final com.google.common.util.concurrent.ListenableFuture<java.lang.Integer> exposureCompensationIndex = (camera == null || (cameraControl = camera.getCameraControl()) == null) ? null : cameraControl.setExposureCompensationIndex(0);
        if (exposureCompensationIndex != null) {
            exposureCompensationIndex.addListener(new java.lang.Runnable() { // from class: com.dyneti.android.dyscan.t$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    com.dyneti.android.dyscan.t.a(com.google.common.util.concurrent.ListenableFuture.this, tVar);
                }
            }, androidx.core.content.ContextCompat.getMainExecutor(tVar.c.getContext()));
        }
    }

    public static final void a(com.google.common.util.concurrent.ListenableFuture listenableFuture, com.dyneti.android.dyscan.t tVar) {
        try {
            listenableFuture.get();
        } catch (java.lang.InterruptedException unused) {
        } catch (java.util.concurrent.ExecutionException unused2) {
        } finally {
            tVar.j = false;
        }
    }

    public final com.dyneti.android.dyscan.b a() {
        androidx.camera.core.Camera camera = this.h;
        if (camera != null) {
            com.dyneti.android.dyscan.n.a(camera);
        }
        return l;
    }

    public static final void a(final com.dyneti.android.dyscan.t tVar, final androidx.camera.core.ImageAnalysis.Analyzer analyzer, final java.lang.Runnable runnable) {
        android.content.Context context = tVar.c.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        synchronized (com.dyneti.android.dyscan.o.class) {
            if (!com.dyneti.android.dyscan.o.f3327a) {
                com.dyneti.android.dyscan.o.f3327a = true;
                try {
                    androidx.camera.lifecycle.ProcessCameraProvider.Companion companion = androidx.camera.lifecycle.ProcessCameraProvider.INSTANCE;
                    androidx.camera.core.CameraXConfig build = androidx.camera.core.CameraXConfig.Builder.fromConfig(androidx.camera.camera2.Camera2Config.defaultConfig()).setAvailableCamerasLimiter(androidx.camera.core.CameraSelector.DEFAULT_BACK_CAMERA).setMinimumLoggingLevel(6).build();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
                    companion.configureInstance(build);
                } catch (java.lang.IllegalStateException unused) {
                }
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        final com.google.common.util.concurrent.ListenableFuture<androidx.camera.lifecycle.ProcessCameraProvider> companion2 = androidx.camera.lifecycle.ProcessCameraProvider.INSTANCE.getInstance(context);
        companion2.addListener(new java.lang.Runnable() { // from class: com.dyneti.android.dyscan.t$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.dyneti.android.dyscan.t.a(com.dyneti.android.dyscan.t.this, companion2, analyzer, runnable);
            }
        }, androidx.core.content.ContextCompat.getMainExecutor(tVar.c.getActivity()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x006a, code lost:
    
        if (java.lang.Math.abs(r11 - java.lang.Math.log(1.3333333333333333d)) <= java.lang.Math.abs(r11 - java.lang.Math.log(1.7777777777777777d))) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00a7, code lost:
    
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00a5, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00a3, code lost:
    
        if (java.lang.Math.abs(r11 - java.lang.Math.log(1.3333333333333333d)) <= java.lang.Math.abs(r11 - java.lang.Math.log(1.7777777777777777d))) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(com.dyneti.android.dyscan.t tVar, com.google.common.util.concurrent.ListenableFuture listenableFuture, androidx.camera.core.ImageAnalysis.Analyzer analyzer, java.lang.Runnable runnable) {
        int i;
        int rotation;
        androidx.camera.core.UseCaseGroup useCaseGroup;
        androidx.camera.core.Camera camera;
        android.util.Size resolution;
        androidx.camera.core.CameraControl cameraControl;
        androidx.camera.core.CameraInfo cameraInfo;
        try {
            tVar.g = (androidx.camera.lifecycle.ProcessCameraProvider) listenableFuture.get();
            int i2 = android.os.Build.VERSION.SDK_INT;
            if (i2 >= 30) {
                java.lang.Object systemService = tVar.c.getContext().getSystemService(com.datadog.android.sessionreplay.internal.recorder.mapper.DecorViewMapper.WINDOW_KEY_NAME);
                kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
                android.view.WindowManager windowManager = (android.view.WindowManager) systemService;
                int width = windowManager.getCurrentWindowMetrics().getBounds().width();
                int height = windowManager.getCurrentWindowMetrics().getBounds().height();
                double log = java.lang.Math.log(kotlin.ranges.RangesKt.coerceAtLeast(width, height) / kotlin.ranges.RangesKt.coerceAtMost(width, height));
            } else {
                android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
                tVar.e.getDisplay().getRealMetrics(displayMetrics);
                int i3 = displayMetrics.widthPixels;
                int i4 = displayMetrics.heightPixels;
                double log2 = java.lang.Math.log(kotlin.ranges.RangesKt.coerceAtLeast(i3, i4) / kotlin.ranges.RangesKt.coerceAtMost(i3, i4));
            }
            androidx.camera.lifecycle.ProcessCameraProvider processCameraProvider = tVar.g;
            androidx.camera.camera2.interop.CaptureRequestOptions captureRequestOptions = null;
            r7 = null;
            java.lang.Integer num = null;
            if (processCameraProvider == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                processCameraProvider = null;
            }
            processCameraProvider.unbindAll();
            tVar.a(i);
            androidx.camera.core.ImageAnalysis.Builder builder = new androidx.camera.core.ImageAnalysis.Builder();
            builder.setTargetAspectRatio(i);
            android.view.Display display = tVar.e.getDisplay();
            if (display != null) {
                rotation = display.getRotation();
            } else if (i2 < 30) {
                java.lang.Object systemService2 = tVar.c.getContext().getSystemService(com.datadog.android.sessionreplay.internal.recorder.mapper.DecorViewMapper.WINDOW_KEY_NAME);
                kotlin.jvm.internal.Intrinsics.checkNotNull(systemService2, "");
                android.view.Display defaultDisplay = ((android.view.WindowManager) systemService2).getDefaultDisplay();
                rotation = defaultDisplay != null ? defaultDisplay.getRotation() : 0;
            } else {
                rotation = tVar.c.getContext().getDisplay().getRotation();
            }
            builder.setTargetRotation(rotation);
            builder.setBackpressureStrategy(0);
            builder.setOutputImageFormat(2);
            androidx.camera.core.ImageAnalysis build = builder.build();
            tVar.f = build;
            if (build != null) {
                build.setAnalyzer(tVar.d, analyzer);
            }
            androidx.camera.core.ViewPort viewPort = tVar.e.getViewPort();
            if (viewPort != null) {
                androidx.camera.core.UseCaseGroup.Builder builder2 = new androidx.camera.core.UseCaseGroup.Builder();
                builder2.setViewPort(viewPort);
                androidx.camera.core.Preview preview = tVar.i;
                if (preview != null) {
                    builder2.addUseCase(preview);
                }
                androidx.camera.core.ImageAnalysis imageAnalysis = tVar.f;
                if (imageAnalysis != null) {
                    builder2.addUseCase(imageAnalysis);
                }
                useCaseGroup = builder2.build();
            } else {
                useCaseGroup = null;
            }
            if (useCaseGroup != null) {
                androidx.camera.lifecycle.ProcessCameraProvider processCameraProvider2 = tVar.g;
                if (processCameraProvider2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    processCameraProvider2 = null;
                }
                android.app.Activity activity = tVar.c.getActivity();
                kotlin.jvm.internal.Intrinsics.checkNotNull(activity, "");
                androidx.camera.core.CameraSelector cameraSelector = androidx.camera.core.CameraSelector.DEFAULT_BACK_CAMERA;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cameraSelector, "");
                camera = processCameraProvider2.bindToLifecycle((androidx.view.LifecycleOwner) activity, cameraSelector, useCaseGroup);
            } else {
                camera = null;
            }
            tVar.h = camera;
            if (camera != null && (cameraInfo = camera.getCameraInfo()) != null) {
                tVar.a(cameraInfo);
            }
            androidx.camera.core.Camera camera2 = tVar.h;
            if (camera2 != null) {
                androidx.camera.core.CameraInfo cameraInfo2 = camera2.getCameraInfo();
                androidx.camera.camera2.interop.Camera2CameraInfo from = cameraInfo2 != null ? androidx.camera.camera2.interop.Camera2CameraInfo.from(cameraInfo2) : null;
                androidx.camera.core.Camera camera3 = tVar.h;
                androidx.camera.camera2.interop.Camera2CameraControl from2 = (camera3 == null || (cameraControl = camera3.getCameraControl()) == null) ? null : androidx.camera.camera2.interop.Camera2CameraControl.from(cameraControl);
                java.lang.Float f = from != null ? (java.lang.Float) from.getCameraCharacteristic(android.hardware.camera2.CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE) : null;
                if (f != null && from != null) {
                    int[] iArr = (int[]) from.getCameraCharacteristic(android.hardware.camera2.CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
                    if (kotlin.jvm.internal.Intrinsics.areEqual(iArr != null ? java.lang.Boolean.valueOf(kotlin.collections.ArraysKt.contains(iArr, 1)) : null, java.lang.Boolean.TRUE) && tVar.k) {
                        if (f.floatValue() > 8.5f) {
                            f = java.lang.Float.valueOf(8.5f);
                        }
                        androidx.camera.core.Preview preview2 = tVar.i;
                        if (preview2 != null) {
                            float floatValue = f.floatValue();
                            int width2 = tVar.c.getWidth();
                            androidx.camera.core.ResolutionInfo resolutionInfo = preview2.getResolutionInfo();
                            if (resolutionInfo != null && (resolution = resolutionInfo.getResolution()) != null) {
                                num = java.lang.Integer.valueOf(resolution.getWidth());
                            }
                            if (num != null) {
                                floatValue = (floatValue * width2) / num.intValue();
                            }
                            captureRequestOptions = new androidx.camera.camera2.interop.CaptureRequestOptions.Builder().setCaptureRequestOption(android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE, 0).setCaptureRequestOption(android.hardware.camera2.CaptureRequest.LENS_FOCUS_DISTANCE, java.lang.Float.valueOf(floatValue)).build();
                        }
                        if (captureRequestOptions != null && from2 != null) {
                            from2.setCaptureRequestOptions(captureRequestOptions);
                        }
                    }
                }
                tVar.k = false;
            }
            runnable.run();
        } catch (java.lang.InterruptedException e) {
            com.dyneti.android.dyscan.DyScanView dyScanView = tVar.c;
            com.dyneti.android.dyscan.b a2 = tVar.a();
            com.dyneti.android.dyscan.DyScanView dyScanView2 = tVar.c;
            com.dyneti.android.dyscan.e eVar = new com.dyneti.android.dyscan.e(dyScanView, "POST", a2, dyScanView2.u0, dyScanView2.v0);
            eVar.f3298a.a("scanSuccessful", false);
            eVar.f3298a.a("error", "Failed to get Camera.");
            eVar.f3298a.a("androidCameraAccessExceptionReason", e.getMessage());
            com.dyneti.android.dyscan.DyScanView dyScanView3 = tVar.c;
            dyScanView3.a(eVar.f3298a, new com.dyneti.android.dyscan.a2(dyScanView3.getActivity()));
            eVar.execute(new com.dyneti.android.dyscan.d[0]);
            com.dyneti.android.dyscan.DyScanView dyScanView4 = tVar.c;
            dyScanView4.i0 = true;
            dyScanView4.a0.onFailure(4);
        } catch (java.util.concurrent.ExecutionException unused) {
        }
    }

    public final void a(int i) {
        int rotation;
        androidx.camera.core.Preview.Builder builder = new androidx.camera.core.Preview.Builder();
        builder.setTargetAspectRatio(i);
        android.view.Display display = this.e.getDisplay();
        if (display != null) {
            rotation = display.getRotation();
        } else if (android.os.Build.VERSION.SDK_INT < 30) {
            java.lang.Object systemService = this.c.getContext().getSystemService(com.datadog.android.sessionreplay.internal.recorder.mapper.DecorViewMapper.WINDOW_KEY_NAME);
            kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
            android.view.Display defaultDisplay = ((android.view.WindowManager) systemService).getDefaultDisplay();
            rotation = defaultDisplay != null ? defaultDisplay.getRotation() : 0;
        } else {
            rotation = this.c.getContext().getDisplay().getRotation();
        }
        builder.setTargetRotation(rotation);
        androidx.camera.core.Preview build = builder.build();
        this.i = build;
        if (build != null) {
            build.setSurfaceProvider(this.e.getSurfaceProvider());
        }
        androidx.view.LiveData<androidx.camera.view.PreviewView.StreamState> previewStreamState = this.e.getPreviewStreamState();
        android.content.ComponentCallbacks2 activity = this.c.getActivity();
        kotlin.jvm.internal.Intrinsics.checkNotNull(activity, "");
        previewStreamState.observe((androidx.view.LifecycleOwner) activity, new com.dyneti.android.dyscan.s(new kotlin.jvm.functions.Function1() { // from class: com.dyneti.android.dyscan.t$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.dyneti.android.dyscan.t.a((androidx.camera.view.PreviewView.StreamState) obj);
            }
        }));
    }

    public static final kotlin.Unit a(androidx.camera.view.PreviewView.StreamState streamState) {
        int i = streamState == null ? -1 : com.dyneti.android.dyscan.p.f3329a[streamState.ordinal()];
        if (i == -1 || i == 1 || i == 2) {
            return kotlin.Unit.INSTANCE;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public final void a(androidx.camera.core.CameraInfo cameraInfo) {
        androidx.view.LiveData<androidx.camera.core.CameraState> cameraState = cameraInfo.getCameraState();
        android.content.ComponentCallbacks2 activity = this.c.getActivity();
        kotlin.jvm.internal.Intrinsics.checkNotNull(activity, "");
        cameraState.observe((androidx.view.LifecycleOwner) activity, new com.dyneti.android.dyscan.s(new kotlin.jvm.functions.Function1() { // from class: com.dyneti.android.dyscan.t$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.dyneti.android.dyscan.t.a(com.dyneti.android.dyscan.t.this, (androidx.camera.core.CameraState) obj);
            }
        }));
    }

    public static final kotlin.Unit a(com.dyneti.android.dyscan.t tVar, androidx.camera.core.CameraState cameraState) {
        int i = com.dyneti.android.dyscan.p.b[cameraState.getType().ordinal()];
        if (i != 1 && i != 2 && i != 3 && i != 4 && i != 5) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        androidx.camera.core.CameraState.StateError error = cameraState.getError();
        if (error != null) {
            com.dyneti.android.dyscan.DyScanView dyScanView = tVar.c;
            com.dyneti.android.dyscan.b a2 = tVar.a();
            com.dyneti.android.dyscan.DyScanView dyScanView2 = tVar.c;
            com.dyneti.android.dyscan.e eVar = new com.dyneti.android.dyscan.e(dyScanView, "POST", a2, dyScanView2.u0, dyScanView2.v0);
            eVar.f3298a.a("scanSuccessful", false);
            switch (error.getCode()) {
                case 1:
                    eVar.f3298a.a("error", "Max cameras in use");
                    break;
                case 2:
                    eVar.f3298a.a("error", "Camera in use");
                    break;
                case 3:
                    eVar.f3298a.a("error", "Other recoverable error");
                    break;
                case 4:
                    eVar.f3298a.a("error", "Stream config error");
                    break;
                case 5:
                    eVar.f3298a.a("error", "Camera disabled");
                    break;
                case 6:
                    eVar.f3298a.a("error", "Fatal error");
                    break;
                case 7:
                    eVar.f3298a.a("error", "Do not disturb mode enabled");
                    break;
            }
            com.dyneti.android.dyscan.DyScanView dyScanView3 = tVar.c;
            dyScanView3.a(eVar.f3298a, new com.dyneti.android.dyscan.a2(dyScanView3.getActivity()));
            eVar.execute(new com.dyneti.android.dyscan.d[0]);
            com.dyneti.android.dyscan.DyScanView dyScanView4 = tVar.c;
            dyScanView4.i0 = true;
            dyScanView4.a0.onFailure(3);
        }
        return kotlin.Unit.INSTANCE;
    }

    public final void a(final com.dyneti.android.dyscan.a1 a1Var, final java.lang.Runnable runnable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a1Var, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "");
        if (androidx.core.content.ContextCompat.checkSelfPermission(this.c.getContext(), "android.permission.CAMERA") != 0) {
            com.dyneti.android.dyscan.DyScanView dyScanView = this.c;
            com.dyneti.android.dyscan.b a2 = a();
            com.dyneti.android.dyscan.DyScanView dyScanView2 = this.c;
            com.dyneti.android.dyscan.e eVar = new com.dyneti.android.dyscan.e(dyScanView, "POST", a2, dyScanView2.u0, dyScanView2.v0);
            eVar.f3298a.a("scanSuccessful", false);
            eVar.f3298a.a("error", "no camera permissions");
            com.dyneti.android.dyscan.DyScanView dyScanView3 = this.c;
            dyScanView3.a(eVar.f3298a, new com.dyneti.android.dyscan.a2(dyScanView3.getActivity()));
            eVar.execute(new com.dyneti.android.dyscan.d[0]);
            com.dyneti.android.dyscan.DyScanView dyScanView4 = this.c;
            dyScanView4.i0 = true;
            dyScanView4.a0.onFailure(3);
            return;
        }
        this.e.post(new java.lang.Runnable() { // from class: com.dyneti.android.dyscan.t$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                com.dyneti.android.dyscan.t.a(com.dyneti.android.dyscan.t.this, a1Var, runnable);
            }
        });
        androidx.camera.view.PreviewView previewView = this.e;
        if (this.c.w) {
            previewView.setOnHierarchyChangeListener(new com.dyneti.android.dyscan.q());
        }
    }

    public final void a(float f, float f2) {
        androidx.camera.core.CameraControl cameraControl;
        androidx.camera.core.CameraControl cameraControl2;
        androidx.camera.core.Camera camera = this.h;
        final com.google.common.util.concurrent.ListenableFuture<androidx.camera.core.FocusMeteringResult> listenableFuture = null;
        androidx.camera.camera2.interop.Camera2CameraControl from = (camera == null || (cameraControl2 = camera.getCameraControl()) == null) ? null : androidx.camera.camera2.interop.Camera2CameraControl.from(cameraControl2);
        if (from != null) {
            from.setCaptureRequestOptions(new androidx.camera.camera2.interop.CaptureRequestOptions.Builder().setCaptureRequestOption(android.hardware.camera2.CaptureRequest.CONTROL_MODE, 1).build());
        }
        androidx.camera.core.MeteringPoint createPoint = this.e.getMeteringPointFactory().createPoint(f, f2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createPoint, "");
        androidx.camera.core.FocusMeteringAction.Builder builder = new androidx.camera.core.FocusMeteringAction.Builder(createPoint, 7);
        androidx.camera.core.MeteringPointFactory meteringPointFactory = this.e.getMeteringPointFactory();
        com.dyneti.android.dyscan.l2 l2Var = this.b;
        builder.addPoint(meteringPointFactory.createPoint((l2Var.d() + l2Var.e()) * 0.7f, this.e.getHeight() * 0.5f));
        builder.addPoint(this.e.getMeteringPointFactory().createPoint(this.b.e() * 1.3f, this.e.getHeight() * 0.5f));
        builder.addPoint(this.e.getMeteringPointFactory().createPoint(this.e.getWidth() * 0.5f, this.b.f() * 1.3f));
        androidx.camera.core.MeteringPointFactory meteringPointFactory2 = this.e.getMeteringPointFactory();
        float width = this.e.getWidth();
        com.dyneti.android.dyscan.l2 l2Var2 = this.b;
        builder.addPoint(meteringPointFactory2.createPoint(width * 0.5f, (l2Var2.c() + l2Var2.f()) * 0.7f));
        androidx.camera.core.FocusMeteringAction build = builder.build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        androidx.camera.core.Camera camera2 = this.h;
        if (camera2 != null && (cameraControl = camera2.getCameraControl()) != null) {
            listenableFuture = cameraControl.startFocusAndMetering(build);
        }
        if (listenableFuture != null) {
            listenableFuture.addListener(new java.lang.Runnable() { // from class: com.dyneti.android.dyscan.t$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.dyneti.android.dyscan.t.c(com.google.common.util.concurrent.ListenableFuture.this, this);
                }
            }, androidx.core.content.ContextCompat.getMainExecutor(this.c.getContext()));
        }
    }
}
