package com.zettle.sdk.feature.taptopay.ui;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001aR\u0016\u0010\u0017\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001dR\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R#\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0\u001e8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b$\u0010 \u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/RotateViewBySensorManager;", "Landroid/hardware/SensorEventListener;", "Landroidx/fragment/app/FragmentActivity;", "activity", "Lkotlin/Function0;", "", "rotateView", "recoverView", "<init>", "(Landroidx/fragment/app/FragmentActivity;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Landroid/hardware/Sensor;", "sensor", "", "accuracy", "onAccuracyChanged", "(Landroid/hardware/Sensor;I)V", "Landroid/hardware/SensorEvent;", "event", "onSensorChanged", "(Landroid/hardware/SensorEvent;)V", "getHighSpeedVideoFpsRangesFor", "Landroidx/fragment/app/FragmentActivity;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup, "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function0;", "getHighResolutionOutputSizeshNQ4ISI", "", "Z", "Lkotlin/Lazy;", "getOutputMinFrameDuration", "Lkotlin/Lazy;", "getHighSpeedVideoSizesFor", "Lkotlin/Result;", "Landroid/hardware/SensorManager;", "getInputFormats", "getInputSizeshNQ4ISI"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RotateViewBySensorManager implements android.hardware.SensorEventListener {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private boolean getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private int Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.fragment.app.FragmentActivity getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final kotlin.Lazy<kotlin.Result<android.hardware.SensorManager>> getInputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final kotlin.Lazy<android.hardware.Sensor> getHighSpeedVideoSizesFor;

    public RotateViewBySensorManager(androidx.fragment.app.FragmentActivity fragmentActivity, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02) {
        androidx.view.Lifecycle lifecycle;
        androidx.view.LifecycleCoroutineScope lifecycleScope;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        this.getHighSpeedVideoSizes = fragmentActivity;
        this.getHighSpeedVideoFpsRangesFor = function0;
        this.getHighResolutionOutputSizeshNQ4ISI = function02;
        this.getInputSizeshNQ4ISI = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<kotlin.Result<? extends android.hardware.SensorManager>>() { // from class: com.zettle.sdk.feature.taptopay.ui.RotateViewBySensorManager$sensorManager$1
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ kotlin.Result<? extends android.hardware.SensorManager> invoke() {
                return kotlin.Result.m23435boximpl(getHighSpeedVideoSizes());
            }

            public final java.lang.Object getHighSpeedVideoSizes() {
                androidx.fragment.app.FragmentActivity fragmentActivity2;
                com.zettle.sdk.feature.taptopay.ui.RotateViewBySensorManager rotateViewBySensorManager = com.zettle.sdk.feature.taptopay.ui.RotateViewBySensorManager.this;
                try {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    fragmentActivity2 = rotateViewBySensorManager.getHighSpeedVideoSizes;
                    java.lang.Object systemService = fragmentActivity2 != null ? fragmentActivity2.getSystemService("sensor") : null;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
                    return kotlin.Result.m23436constructorimpl((android.hardware.SensorManager) systemService);
                } catch (java.lang.Throwable th) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    return kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                }
            }

            {
                super(0);
            }
        });
        this.getHighSpeedVideoSizesFor = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<android.hardware.Sensor>() { // from class: com.zettle.sdk.feature.taptopay.ui.RotateViewBySensorManager$sensor$1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
            public final android.hardware.Sensor invoke() {
                java.lang.Object camera2StreamConfigurationMap = ((kotlin.Result) com.zettle.sdk.feature.taptopay.ui.RotateViewBySensorManager.this.getInputSizeshNQ4ISI.getValue()).getCamera2StreamConfigurationMap();
                if (kotlin.Result.m23441isFailureimpl(camera2StreamConfigurationMap)) {
                    camera2StreamConfigurationMap = null;
                }
                android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) camera2StreamConfigurationMap;
                if (sensorManager != null) {
                    return sensorManager.getDefaultSensor(11);
                }
                return null;
            }

            {
                super(0);
            }
        });
        if (fragmentActivity != null && (lifecycleScope = androidx.view.LifecycleOwnerKt.getLifecycleScope(fragmentActivity)) != null) {
            lifecycleScope.launchWhenResumed(new com.zettle.sdk.feature.taptopay.ui.RotateViewBySensorManager.AnonymousClass1(null));
        }
        if (fragmentActivity == null || (lifecycle = fragmentActivity.getLifecycle()) == null) {
            return;
        }
        lifecycle.addObserver(new androidx.view.DefaultLifecycleObserver() { // from class: com.zettle.sdk.feature.taptopay.ui.RotateViewBySensorManager$special$$inlined$doOnPause$1
            @Override // androidx.view.DefaultLifecycleObserver
            public final void onPause(androidx.view.LifecycleOwner owner) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(owner, "");
                kotlin.Lazy lazy = com.zettle.sdk.feature.taptopay.ui.RotateViewBySensorManager.this.getInputSizeshNQ4ISI;
                if (!lazy.isInitialized()) {
                    lazy = null;
                }
                if (lazy != null) {
                    java.lang.Object camera2StreamConfigurationMap = ((kotlin.Result) lazy.getValue()).getCamera2StreamConfigurationMap();
                    android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) (kotlin.Result.m23441isFailureimpl(camera2StreamConfigurationMap) ? null : camera2StreamConfigurationMap);
                    if (sensorManager != null) {
                        sensorManager.unregisterListener(com.zettle.sdk.feature.taptopay.ui.RotateViewBySensorManager.this);
                    }
                }
                super.onPause(owner);
            }
        });
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.feature.taptopay.ui.RotateViewBySensorManager$1", f = "RotateViewBySensorManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.zettle.sdk.feature.taptopay.ui.RotateViewBySensorManager$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoSizes == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                java.lang.Object camera2StreamConfigurationMap = ((kotlin.Result) com.zettle.sdk.feature.taptopay.ui.RotateViewBySensorManager.this.getInputSizeshNQ4ISI.getValue()).getCamera2StreamConfigurationMap();
                if (kotlin.Result.m23441isFailureimpl(camera2StreamConfigurationMap)) {
                    camera2StreamConfigurationMap = null;
                }
                android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) camera2StreamConfigurationMap;
                if (sensorManager != null) {
                    com.zettle.sdk.feature.taptopay.ui.RotateViewBySensorManager rotateViewBySensorManager = com.zettle.sdk.feature.taptopay.ui.RotateViewBySensorManager.this;
                    kotlin.coroutines.jvm.internal.Boxing.boxBoolean(sensorManager.registerListener(rotateViewBySensorManager, (android.hardware.Sensor) rotateViewBySensorManager.getHighSpeedVideoSizesFor.getValue(), 3));
                }
                return kotlin.Unit.INSTANCE;
            }
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.zettle.sdk.feature.taptopay.ui.RotateViewBySensorManager.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.zettle.sdk.feature.taptopay.ui.RotateViewBySensorManager.this.new AnonymousClass1(continuation);
        }

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.zettle.sdk.feature.taptopay.ui.RotateViewBySensorManager.AnonymousClass1> continuation) {
            super(2, continuation);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(android.hardware.SensorEvent event) {
        double[] dArr;
        if (event == null) {
            return;
        }
        float[] fArr = (float[]) event.values.clone();
        if (fArr == null) {
            dArr = new double[0];
        } else {
            double[] dArr2 = new double[fArr.length];
            int length = fArr.length;
            for (int i = 0; i < length; i++) {
                dArr2[i] = fArr[i];
            }
            dArr = dArr2;
        }
        double d = dArr[0];
        double d2 = dArr[1];
        double d3 = dArr[2];
        double d4 = dArr[3];
        double sqrt = java.lang.Math.sqrt((d * d) + (d2 * d2) + (d3 * d3) + (d4 * d4));
        double d5 = dArr[0] / sqrt;
        dArr[0] = d5;
        double d6 = dArr[1] / sqrt;
        dArr[1] = d6;
        double d7 = dArr[2] / sqrt;
        dArr[2] = d7;
        double d8 = dArr[3] / sqrt;
        dArr[3] = d8;
        boolean z = java.lang.Double.compare(java.lang.Math.atan2(((d8 * d5) + (d7 * d6)) * 2.0d, 1.0d - (((d5 * d5) + (d6 * d6)) * 2.0d)) * 57.29577951308232d, 0.0d) < 0;
        int i2 = this.Camera2StreamConfigurationMap;
        if (-4 <= i2 && i2 < 5) {
            if (z && i2 != 4) {
                this.Camera2StreamConfigurationMap = i2 + 1;
            } else if (i2 != -4) {
                this.Camera2StreamConfigurationMap = i2 - 1;
            }
        }
        boolean z2 = this.getHighSpeedVideoFpsRanges;
        if (!z2 && z && this.Camera2StreamConfigurationMap > 2) {
            this.getHighSpeedVideoFpsRanges = true;
            this.Camera2StreamConfigurationMap = 0;
            this.getHighSpeedVideoFpsRangesFor.invoke();
        } else {
            if (!z2 || z || this.Camera2StreamConfigurationMap >= -2) {
                return;
            }
            this.getHighSpeedVideoFpsRanges = false;
            this.Camera2StreamConfigurationMap = 0;
            this.getHighResolutionOutputSizeshNQ4ISI.invoke();
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(android.hardware.Sensor sensor, int accuracy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sensor, "");
    }
}
