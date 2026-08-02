package androidx.camera.camera2.impl;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000  2\u00020\u0001:\u0002! B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\fJ\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001f\u001a\u00020\u00018G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Landroidx/camera/camera2/impl/Camera2ImplConfig;", "Landroidx/camera/camera2/interop/CaptureRequestOptions;", "Landroidx/camera/core/impl/Config;", "config", "<init>", "(Landroidx/camera/core/impl/Config;)V", "", "valueIfMissing", "getCaptureRequestTemplate", "(I)I", "", "getStreamUseCase", "(Ljava/lang/Long;)Ljava/lang/Long;", "getStreamUseHint", "Landroid/hardware/camera2/CameraDevice$StateCallback;", "getDeviceStateCallback", "(Landroid/hardware/camera2/CameraDevice$StateCallback;)Landroid/hardware/camera2/CameraDevice$StateCallback;", "Landroid/hardware/camera2/CameraCaptureSession$StateCallback;", "getSessionStateCallback", "(Landroid/hardware/camera2/CameraCaptureSession$StateCallback;)Landroid/hardware/camera2/CameraCaptureSession$StateCallback;", "Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;", "getSessionCaptureCallback", "(Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;", "", "getCaptureRequestTag", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "getPhysicalCameraId", "(Ljava/lang/String;)Ljava/lang/String;", "getCaptureRequestOptions", "()Landroidx/camera/camera2/interop/CaptureRequestOptions;", "captureRequestOptions", "Companion", "Builder"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Camera2ImplConfig extends androidx.camera.camera2.interop.CaptureRequestOptions {
    public static final java.lang.String CAPTURE_REQUEST_ID_STEM = "camera2.captureRequest.option.";
    public static final androidx.camera.core.impl.Config.Option<java.lang.Object> CAPTURE_REQUEST_TAG_OPTION;
    public static final androidx.camera.core.impl.Config.Option<android.hardware.camera2.CameraDevice.StateCallback> DEVICE_STATE_CALLBACK_OPTION;
    public static final androidx.camera.core.impl.Config.Option<android.hardware.camera2.CameraCaptureSession.CaptureCallback> SESSION_CAPTURE_CALLBACK_OPTION;
    public static final androidx.camera.core.impl.Config.Option<java.lang.String> SESSION_PHYSICAL_CAMERA_ID_OPTION;
    public static final androidx.camera.core.impl.Config.Option<android.hardware.camera2.CameraCaptureSession.StateCallback> SESSION_STATE_CALLBACK_OPTION;
    public static final androidx.camera.core.impl.Config.Option<java.lang.Long> STREAM_USE_CASE_OPTION;
    public static final androidx.camera.core.impl.Config.Option<java.lang.Long> STREAM_USE_HINT_OPTION;
    public static final androidx.camera.core.impl.Config.Option<java.lang.Integer> TEMPLATE_TYPE_OPTION;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Camera2ImplConfig(androidx.camera.core.impl.Config config) {
        super(config);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
    }

    public final androidx.camera.camera2.interop.CaptureRequestOptions getCaptureRequestOptions() {
        return androidx.camera.camera2.interop.CaptureRequestOptions.Builder.INSTANCE.from(getGetHighSpeedVideoFpsRanges()).build();
    }

    public final int getCaptureRequestTemplate(int valueIfMissing) {
        java.lang.Object retrieveOption = getGetHighSpeedVideoFpsRanges().retrieveOption(TEMPLATE_TYPE_OPTION, java.lang.Integer.valueOf(valueIfMissing));
        kotlin.jvm.internal.Intrinsics.checkNotNull(retrieveOption);
        return ((java.lang.Number) retrieveOption).intValue();
    }

    public static /* synthetic */ java.lang.Long getStreamUseCase$default(androidx.camera.camera2.impl.Camera2ImplConfig camera2ImplConfig, java.lang.Long l, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            l = null;
        }
        return camera2ImplConfig.getStreamUseCase(l);
    }

    public final java.lang.Long getStreamUseCase(java.lang.Long valueIfMissing) {
        return (java.lang.Long) getGetHighSpeedVideoFpsRanges().retrieveOption(STREAM_USE_CASE_OPTION, valueIfMissing);
    }

    public static /* synthetic */ java.lang.Long getStreamUseHint$default(androidx.camera.camera2.impl.Camera2ImplConfig camera2ImplConfig, java.lang.Long l, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            l = null;
        }
        return camera2ImplConfig.getStreamUseHint(l);
    }

    public final java.lang.Long getStreamUseHint(java.lang.Long valueIfMissing) {
        return (java.lang.Long) getGetHighSpeedVideoFpsRanges().retrieveOption(STREAM_USE_HINT_OPTION, valueIfMissing);
    }

    public static /* synthetic */ android.hardware.camera2.CameraDevice.StateCallback getDeviceStateCallback$default(androidx.camera.camera2.impl.Camera2ImplConfig camera2ImplConfig, android.hardware.camera2.CameraDevice.StateCallback stateCallback, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            stateCallback = null;
        }
        return camera2ImplConfig.getDeviceStateCallback(stateCallback);
    }

    public final android.hardware.camera2.CameraDevice.StateCallback getDeviceStateCallback(android.hardware.camera2.CameraDevice.StateCallback valueIfMissing) {
        return (android.hardware.camera2.CameraDevice.StateCallback) getGetHighSpeedVideoFpsRanges().retrieveOption(DEVICE_STATE_CALLBACK_OPTION, valueIfMissing);
    }

    public static /* synthetic */ android.hardware.camera2.CameraCaptureSession.StateCallback getSessionStateCallback$default(androidx.camera.camera2.impl.Camera2ImplConfig camera2ImplConfig, android.hardware.camera2.CameraCaptureSession.StateCallback stateCallback, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            stateCallback = null;
        }
        return camera2ImplConfig.getSessionStateCallback(stateCallback);
    }

    public final android.hardware.camera2.CameraCaptureSession.StateCallback getSessionStateCallback(android.hardware.camera2.CameraCaptureSession.StateCallback valueIfMissing) {
        return (android.hardware.camera2.CameraCaptureSession.StateCallback) getGetHighSpeedVideoFpsRanges().retrieveOption(SESSION_STATE_CALLBACK_OPTION, valueIfMissing);
    }

    public static /* synthetic */ android.hardware.camera2.CameraCaptureSession.CaptureCallback getSessionCaptureCallback$default(androidx.camera.camera2.impl.Camera2ImplConfig camera2ImplConfig, android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            captureCallback = null;
        }
        return camera2ImplConfig.getSessionCaptureCallback(captureCallback);
    }

    public final android.hardware.camera2.CameraCaptureSession.CaptureCallback getSessionCaptureCallback(android.hardware.camera2.CameraCaptureSession.CaptureCallback valueIfMissing) {
        return (android.hardware.camera2.CameraCaptureSession.CaptureCallback) getGetHighSpeedVideoFpsRanges().retrieveOption(SESSION_CAPTURE_CALLBACK_OPTION, valueIfMissing);
    }

    public static /* synthetic */ java.lang.Object getCaptureRequestTag$default(androidx.camera.camera2.impl.Camera2ImplConfig camera2ImplConfig, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return camera2ImplConfig.getCaptureRequestTag(obj);
    }

    public final java.lang.Object getCaptureRequestTag(java.lang.Object valueIfMissing) {
        return getGetHighSpeedVideoFpsRanges().retrieveOption(CAPTURE_REQUEST_TAG_OPTION, valueIfMissing);
    }

    public static /* synthetic */ java.lang.String getPhysicalCameraId$default(androidx.camera.camera2.impl.Camera2ImplConfig camera2ImplConfig, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return camera2ImplConfig.getPhysicalCameraId(str);
    }

    public final java.lang.String getPhysicalCameraId(java.lang.String valueIfMissing) {
        return (java.lang.String) getGetHighSpeedVideoFpsRanges().retrieveOption(SESSION_PHYSICAL_CAMERA_ID_OPTION, valueIfMissing);
    }

    @kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\f\u001a\u00020\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0010\u001a\u00020\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0015\u001a\u00020\u00002\u0016\u0010\u0014\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00002\u0010\u0010\u0018\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010%\u001a\u00070!¢\u0006\u0002\b\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$"}, d2 = {"Landroidx/camera/camera2/impl/Camera2ImplConfig$Builder;", "Landroidx/camera/core/ExtendableBuilder;", "Landroidx/camera/camera2/impl/Camera2ImplConfig;", "<init>", "()V", "Landroidx/camera/core/impl/MutableConfig;", "getMutableConfig", "()Landroidx/camera/core/impl/MutableConfig;", "ValueT", "Landroid/hardware/camera2/CaptureRequest$Key;", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "setCaptureRequestOption", "(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Landroidx/camera/camera2/impl/Camera2ImplConfig$Builder;", "Landroidx/camera/core/impl/Config$OptionPriority;", "priority", "setCaptureRequestOptionWithPriority", "(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;Landroidx/camera/core/impl/Config$OptionPriority;)Landroidx/camera/camera2/impl/Camera2ImplConfig$Builder;", "", "", "values", "addAllCaptureRequestOptionsWithPriority", "(Ljava/util/Map;Landroidx/camera/core/impl/Config$OptionPriority;)Landroidx/camera/camera2/impl/Camera2ImplConfig$Builder;", "", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "removeCaptureRequestOptions", "(Ljava/util/List;)Landroidx/camera/camera2/impl/Camera2ImplConfig$Builder;", "Landroidx/camera/core/impl/Config;", "config", "insertAllOptions", "(Landroidx/camera/core/impl/Config;)Landroidx/camera/camera2/impl/Camera2ImplConfig$Builder;", "build", "()Landroidx/camera/camera2/impl/Camera2ImplConfig;", "Landroidx/camera/core/impl/MutableOptionsBundle;", "Lorg/jspecify/annotations/NonNull;", "getHighSpeedVideoFpsRangesFor", "Landroidx/camera/core/impl/MutableOptionsBundle;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder implements androidx.camera.core.ExtendableBuilder<androidx.camera.camera2.impl.Camera2ImplConfig> {

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final androidx.camera.core.impl.MutableOptionsBundle getHighSpeedVideoSizes;

        public Builder() {
            androidx.camera.core.impl.MutableOptionsBundle create = androidx.camera.core.impl.MutableOptionsBundle.create();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "");
            this.getHighSpeedVideoSizes = create;
        }

        @Override // androidx.camera.core.ExtendableBuilder
        public final androidx.camera.core.impl.MutableConfig getMutableConfig() {
            return this.getHighSpeedVideoSizes;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <ValueT> androidx.camera.camera2.impl.Camera2ImplConfig.Builder setCaptureRequestOption(android.hardware.camera2.CaptureRequest.Key<ValueT> key, ValueT value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            this.getHighSpeedVideoSizes.insertOption(androidx.camera.camera2.impl.Camera2ImplConfigKt.createCaptureRequestOption(key), value);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <ValueT> androidx.camera.camera2.impl.Camera2ImplConfig.Builder setCaptureRequestOptionWithPriority(android.hardware.camera2.CaptureRequest.Key<ValueT> key, ValueT value, androidx.camera.core.impl.Config.OptionPriority priority) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(priority, "");
            this.getHighSpeedVideoSizes.insertOption(androidx.camera.camera2.impl.Camera2ImplConfigKt.createCaptureRequestOption(key), priority, value);
            return this;
        }

        public final androidx.camera.camera2.impl.Camera2ImplConfig.Builder removeCaptureRequestOptions(java.util.List<? extends android.hardware.camera2.CaptureRequest.Key<?>> keys) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keys, "");
            java.util.Iterator<T> it = keys.iterator();
            while (it.hasNext()) {
                this.getHighSpeedVideoSizes.removeOption(androidx.camera.camera2.impl.Camera2ImplConfigKt.createCaptureRequestOption((android.hardware.camera2.CaptureRequest.Key) it.next()));
            }
            return this;
        }

        public final androidx.camera.camera2.impl.Camera2ImplConfig.Builder insertAllOptions(androidx.camera.core.impl.Config config) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
            for (androidx.camera.core.impl.Config.Option<?> option : config.listOptions()) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(option, "");
                this.getHighSpeedVideoSizes.insertOption(option, config.getOptionPriority(option), config.retrieveOption(option));
            }
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.ExtendableBuilder
        public final androidx.camera.camera2.impl.Camera2ImplConfig build() {
            androidx.camera.core.impl.OptionsBundle from = androidx.camera.core.impl.OptionsBundle.from(this.getHighSpeedVideoSizes);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(from, "");
            return new androidx.camera.camera2.impl.Camera2ImplConfig(from);
        }

        public final androidx.camera.camera2.impl.Camera2ImplConfig.Builder addAllCaptureRequestOptionsWithPriority(java.util.Map<android.hardware.camera2.CaptureRequest.Key<?>, ? extends java.lang.Object> values, androidx.camera.core.impl.Config.OptionPriority priority) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(priority, "");
            for (java.util.Map.Entry<android.hardware.camera2.CaptureRequest.Key<?>, ? extends java.lang.Object> entry : values.entrySet()) {
                android.hardware.camera2.CaptureRequest.Key<?> key = entry.getKey();
                java.lang.Object value = entry.getValue();
                this.getHighSpeedVideoSizes.insertOption(androidx.camera.camera2.impl.Camera2ImplConfigKt.createCaptureRequestOption(key), priority, value);
            }
            return this;
        }
    }

    static {
        java.lang.Class cls = java.lang.Integer.TYPE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(cls);
        androidx.camera.core.impl.Config.Option<java.lang.Integer> create = androidx.camera.core.impl.Config.Option.create("camera2.captureRequest.templateType", cls);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "");
        TEMPLATE_TYPE_OPTION = create;
        androidx.camera.core.impl.Config.Option<android.hardware.camera2.CameraDevice.StateCallback> create2 = androidx.camera.core.impl.Config.Option.create("camera2.cameraDevice.stateCallback", android.hardware.camera2.CameraDevice.StateCallback.class);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create2, "");
        DEVICE_STATE_CALLBACK_OPTION = create2;
        androidx.camera.core.impl.Config.Option<android.hardware.camera2.CameraCaptureSession.StateCallback> create3 = androidx.camera.core.impl.Config.Option.create("camera2.cameraCaptureSession.stateCallback", android.hardware.camera2.CameraCaptureSession.StateCallback.class);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create3, "");
        SESSION_STATE_CALLBACK_OPTION = create3;
        androidx.camera.core.impl.Config.Option<android.hardware.camera2.CameraCaptureSession.CaptureCallback> create4 = androidx.camera.core.impl.Config.Option.create("camera2.cameraCaptureSession.captureCallback", android.hardware.camera2.CameraCaptureSession.CaptureCallback.class);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create4, "");
        SESSION_CAPTURE_CALLBACK_OPTION = create4;
        java.lang.Class cls2 = java.lang.Long.TYPE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(cls2);
        androidx.camera.core.impl.Config.Option<java.lang.Long> create5 = androidx.camera.core.impl.Config.Option.create("camera2.cameraCaptureSession.streamUseCase", cls2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create5, "");
        STREAM_USE_CASE_OPTION = create5;
        java.lang.Class cls3 = java.lang.Long.TYPE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(cls3);
        androidx.camera.core.impl.Config.Option<java.lang.Long> create6 = androidx.camera.core.impl.Config.Option.create("camera2.cameraCaptureSession.streamUseHint", cls3);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create6, "");
        STREAM_USE_HINT_OPTION = create6;
        androidx.camera.core.impl.Config.Option<java.lang.Object> create7 = androidx.camera.core.impl.Config.Option.create("camera2.captureRequest.tag", java.lang.Object.class);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create7, "");
        CAPTURE_REQUEST_TAG_OPTION = create7;
        androidx.camera.core.impl.Config.Option<java.lang.String> create8 = androidx.camera.core.impl.Config.Option.create("camera2.cameraCaptureSession.physicalCameraId", java.lang.String.class);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create8, "");
        SESSION_PHYSICAL_CAMERA_ID_OPTION = create8;
    }
}
