package androidx.camera.camera2.adapter;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CaptureResultAdapterKt {
    public static final /* synthetic */ void access$populateExifData(androidx.camera.camera2.pipe.FrameMetadata frameMetadata, androidx.camera.core.impl.utils.ExifData.Builder builder) {
        try {
            android.hardware.camera2.CaptureResult.Key key = android.hardware.camera2.CaptureResult.JPEG_ORIENTATION;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
            java.lang.Integer num = (java.lang.Integer) frameMetadata.get(key);
            if (num != null) {
                builder.setOrientationDegrees(num.intValue());
            }
        } catch (java.nio.BufferUnderflowException unused) {
            androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
            if (androidx.camera.core.Logger.isWarnEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                java.lang.String unused2 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
            }
        }
        android.hardware.camera2.CaptureResult.Key key2 = android.hardware.camera2.CaptureResult.SENSOR_EXPOSURE_TIME;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key2, "");
        java.lang.Long l = (java.lang.Long) frameMetadata.get(key2);
        if (l != null) {
            builder.setExposureTimeNanos(l.longValue());
        }
        android.hardware.camera2.CaptureResult.Key key3 = android.hardware.camera2.CaptureResult.LENS_APERTURE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key3, "");
        java.lang.Float f = (java.lang.Float) frameMetadata.get(key3);
        if (f != null) {
            builder.setLensFNumber(f.floatValue());
        }
        android.hardware.camera2.CaptureResult.Key key4 = android.hardware.camera2.CaptureResult.SENSOR_SENSITIVITY;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key4, "");
        java.lang.Integer num2 = (java.lang.Integer) frameMetadata.get(key4);
        if (num2 != null) {
            int intValue = num2.intValue();
            builder.setIso(intValue);
            android.hardware.camera2.CaptureResult.Key key5 = android.hardware.camera2.CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key5, "");
            if (((java.lang.Integer) frameMetadata.get(key5)) != null) {
                builder.setIso(intValue * ((int) (r2.intValue() / 100.0f)));
            }
        }
        android.hardware.camera2.CaptureResult.Key key6 = android.hardware.camera2.CaptureResult.LENS_FOCAL_LENGTH;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key6, "");
        java.lang.Float f2 = (java.lang.Float) frameMetadata.get(key6);
        if (f2 != null) {
            builder.setFocalLength(f2.floatValue());
        }
        android.hardware.camera2.CaptureResult.Key key7 = android.hardware.camera2.CaptureResult.CONTROL_AWB_MODE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key7, "");
        java.lang.Integer num3 = (java.lang.Integer) frameMetadata.get(key7);
        if (num3 != null) {
            int intValue2 = num3.intValue();
            androidx.camera.core.impl.utils.ExifData.WhiteBalanceMode whiteBalanceMode = androidx.camera.core.impl.utils.ExifData.WhiteBalanceMode.AUTO;
            if (intValue2 == 0) {
                whiteBalanceMode = androidx.camera.core.impl.utils.ExifData.WhiteBalanceMode.MANUAL;
            }
            builder.setWhiteBalanceMode(whiteBalanceMode);
        }
    }

    public static final /* synthetic */ androidx.camera.core.impl.CameraCaptureMetaData.AeMode access$getAeMode(androidx.camera.camera2.pipe.FrameMetadata frameMetadata) {
        android.hardware.camera2.CaptureResult.Key key = android.hardware.camera2.CaptureResult.CONTROL_AE_MODE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
        java.lang.Integer num = (java.lang.Integer) frameMetadata.get(key);
        if (num != null && num.intValue() == 0) {
            return androidx.camera.core.impl.CameraCaptureMetaData.AeMode.OFF;
        }
        if (num != null && num.intValue() == 1) {
            return androidx.camera.core.impl.CameraCaptureMetaData.AeMode.ON;
        }
        if (num != null && num.intValue() == 2) {
            return androidx.camera.core.impl.CameraCaptureMetaData.AeMode.ON_AUTO_FLASH;
        }
        if (num != null && num.intValue() == 3) {
            return androidx.camera.core.impl.CameraCaptureMetaData.AeMode.ON_ALWAYS_FLASH;
        }
        if (num != null && num.intValue() == 4) {
            return androidx.camera.core.impl.CameraCaptureMetaData.AeMode.ON_AUTO_FLASH_REDEYE;
        }
        if (num != null) {
            androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
            if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                androidx.camera.camera2.pipe.FrameNumber.m502toStringimpl(frameMetadata.mo496getFrameNumberUgla2oM());
            }
        }
        return androidx.camera.core.impl.CameraCaptureMetaData.AeMode.UNKNOWN;
    }

    public static final /* synthetic */ androidx.camera.core.impl.CameraCaptureMetaData.AeState access$getAeState(androidx.camera.camera2.pipe.FrameMetadata frameMetadata) {
        android.hardware.camera2.CaptureResult.Key key = android.hardware.camera2.CaptureResult.CONTROL_AE_STATE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
        java.lang.Integer num = (java.lang.Integer) frameMetadata.get(key);
        if (num != null && num.intValue() == 0) {
            return androidx.camera.core.impl.CameraCaptureMetaData.AeState.INACTIVE;
        }
        if ((num != null && num.intValue() == 1) || (num != null && num.intValue() == 5)) {
            return androidx.camera.core.impl.CameraCaptureMetaData.AeState.SEARCHING;
        }
        if (num != null && num.intValue() == 4) {
            return androidx.camera.core.impl.CameraCaptureMetaData.AeState.FLASH_REQUIRED;
        }
        if (num != null && num.intValue() == 2) {
            return androidx.camera.core.impl.CameraCaptureMetaData.AeState.CONVERGED;
        }
        if (num != null && num.intValue() == 3) {
            return androidx.camera.core.impl.CameraCaptureMetaData.AeState.LOCKED;
        }
        if (num == null) {
            return androidx.camera.core.impl.CameraCaptureMetaData.AeState.UNKNOWN;
        }
        androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
            java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
            androidx.camera.camera2.pipe.FrameNumber.m502toStringimpl(frameMetadata.mo496getFrameNumberUgla2oM());
        }
        return androidx.camera.core.impl.CameraCaptureMetaData.AeState.UNKNOWN;
    }

    public static final /* synthetic */ androidx.camera.core.impl.CameraCaptureMetaData.AfMode access$getAfMode(androidx.camera.camera2.pipe.FrameMetadata frameMetadata) {
        android.hardware.camera2.CaptureResult.Key key = android.hardware.camera2.CaptureResult.CONTROL_AF_MODE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
        java.lang.Integer num = (java.lang.Integer) frameMetadata.get(key);
        if ((num != null && num.intValue() == 0) || (num != null && num.intValue() == 5)) {
            return androidx.camera.core.impl.CameraCaptureMetaData.AfMode.OFF;
        }
        if ((num != null && num.intValue() == 1) || (num != null && num.intValue() == 2)) {
            return androidx.camera.core.impl.CameraCaptureMetaData.AfMode.ON_MANUAL_AUTO;
        }
        if ((num != null && num.intValue() == 4) || (num != null && num.intValue() == 3)) {
            return androidx.camera.core.impl.CameraCaptureMetaData.AfMode.ON_CONTINUOUS_AUTO;
        }
        if (num == null) {
            return androidx.camera.core.impl.CameraCaptureMetaData.AfMode.UNKNOWN;
        }
        androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
            java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
            androidx.camera.camera2.pipe.FrameNumber.m502toStringimpl(frameMetadata.mo496getFrameNumberUgla2oM());
        }
        return androidx.camera.core.impl.CameraCaptureMetaData.AfMode.UNKNOWN;
    }

    public static final /* synthetic */ androidx.camera.core.impl.CameraCaptureMetaData.AfState access$getAfState(androidx.camera.camera2.pipe.FrameMetadata frameMetadata) {
        android.hardware.camera2.CaptureResult.Key key = android.hardware.camera2.CaptureResult.CONTROL_AF_STATE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
        java.lang.Integer num = (java.lang.Integer) frameMetadata.get(key);
        if (num != null && num.intValue() == 0) {
            return androidx.camera.core.impl.CameraCaptureMetaData.AfState.INACTIVE;
        }
        if ((num != null && num.intValue() == 3) || (num != null && num.intValue() == 1)) {
            return androidx.camera.core.impl.CameraCaptureMetaData.AfState.SCANNING;
        }
        if (num != null && num.intValue() == 4) {
            return androidx.camera.core.impl.CameraCaptureMetaData.AfState.LOCKED_FOCUSED;
        }
        if (num != null && num.intValue() == 5) {
            return androidx.camera.core.impl.CameraCaptureMetaData.AfState.LOCKED_NOT_FOCUSED;
        }
        if (num != null && num.intValue() == 2) {
            return androidx.camera.core.impl.CameraCaptureMetaData.AfState.PASSIVE_FOCUSED;
        }
        if (num != null && num.intValue() == 6) {
            return androidx.camera.core.impl.CameraCaptureMetaData.AfState.PASSIVE_NOT_FOCUSED;
        }
        if (num == null) {
            return androidx.camera.core.impl.CameraCaptureMetaData.AfState.UNKNOWN;
        }
        androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
            java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
            androidx.camera.camera2.pipe.FrameNumber.m502toStringimpl(frameMetadata.mo496getFrameNumberUgla2oM());
        }
        return androidx.camera.core.impl.CameraCaptureMetaData.AfState.UNKNOWN;
    }

    public static final /* synthetic */ androidx.camera.core.impl.CameraCaptureMetaData.AwbMode access$getAwbMode(androidx.camera.camera2.pipe.FrameMetadata frameMetadata) {
        android.hardware.camera2.CaptureResult.Key key = android.hardware.camera2.CaptureResult.CONTROL_AWB_MODE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
        java.lang.Integer num = (java.lang.Integer) frameMetadata.get(key);
        if (num != null && num.intValue() == 0) {
            return androidx.camera.core.impl.CameraCaptureMetaData.AwbMode.OFF;
        }
        if (num != null && num.intValue() == 1) {
            return androidx.camera.core.impl.CameraCaptureMetaData.AwbMode.AUTO;
        }
        if (num != null && num.intValue() == 2) {
            return androidx.camera.core.impl.CameraCaptureMetaData.AwbMode.INCANDESCENT;
        }
        if (num != null && num.intValue() == 3) {
            return androidx.camera.core.impl.CameraCaptureMetaData.AwbMode.FLUORESCENT;
        }
        if (num != null && num.intValue() == 4) {
            return androidx.camera.core.impl.CameraCaptureMetaData.AwbMode.WARM_FLUORESCENT;
        }
        if (num != null && num.intValue() == 5) {
            return androidx.camera.core.impl.CameraCaptureMetaData.AwbMode.DAYLIGHT;
        }
        if (num != null && num.intValue() == 6) {
            return androidx.camera.core.impl.CameraCaptureMetaData.AwbMode.CLOUDY_DAYLIGHT;
        }
        if (num != null && num.intValue() == 7) {
            return androidx.camera.core.impl.CameraCaptureMetaData.AwbMode.TWILIGHT;
        }
        if (num != null && num.intValue() == 8) {
            return androidx.camera.core.impl.CameraCaptureMetaData.AwbMode.SHADE;
        }
        if (num != null) {
            androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
            if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                androidx.camera.camera2.pipe.FrameNumber.m502toStringimpl(frameMetadata.mo496getFrameNumberUgla2oM());
            }
        }
        return androidx.camera.core.impl.CameraCaptureMetaData.AwbMode.UNKNOWN;
    }

    public static final /* synthetic */ androidx.camera.core.impl.CameraCaptureMetaData.AwbState access$getAwbState(androidx.camera.camera2.pipe.FrameMetadata frameMetadata) {
        android.hardware.camera2.CaptureResult.Key key = android.hardware.camera2.CaptureResult.CONTROL_AWB_STATE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
        java.lang.Integer num = (java.lang.Integer) frameMetadata.get(key);
        if (num != null && num.intValue() == 0) {
            return androidx.camera.core.impl.CameraCaptureMetaData.AwbState.INACTIVE;
        }
        if (num != null && num.intValue() == 1) {
            return androidx.camera.core.impl.CameraCaptureMetaData.AwbState.METERING;
        }
        if (num != null && num.intValue() == 2) {
            return androidx.camera.core.impl.CameraCaptureMetaData.AwbState.CONVERGED;
        }
        if (num != null && num.intValue() == 3) {
            return androidx.camera.core.impl.CameraCaptureMetaData.AwbState.LOCKED;
        }
        if (num != null) {
            androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
            if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                androidx.camera.camera2.pipe.FrameNumber.m502toStringimpl(frameMetadata.mo496getFrameNumberUgla2oM());
            }
        }
        return androidx.camera.core.impl.CameraCaptureMetaData.AwbState.UNKNOWN;
    }

    public static final /* synthetic */ androidx.camera.core.impl.CameraCaptureMetaData.FlashState access$getFlashState(androidx.camera.camera2.pipe.FrameMetadata frameMetadata) {
        android.hardware.camera2.CaptureResult.Key key = android.hardware.camera2.CaptureResult.FLASH_STATE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
        java.lang.Integer num = (java.lang.Integer) frameMetadata.get(key);
        if ((num != null && num.intValue() == 0) || (num != null && num.intValue() == 1)) {
            return androidx.camera.core.impl.CameraCaptureMetaData.FlashState.NONE;
        }
        if (num != null && num.intValue() == 2) {
            return androidx.camera.core.impl.CameraCaptureMetaData.FlashState.READY;
        }
        if ((num != null && num.intValue() == 3) || (num != null && num.intValue() == 4)) {
            return androidx.camera.core.impl.CameraCaptureMetaData.FlashState.FIRED;
        }
        if (num == null) {
            return androidx.camera.core.impl.CameraCaptureMetaData.FlashState.UNKNOWN;
        }
        androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
            java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
            androidx.camera.camera2.pipe.FrameNumber.m502toStringimpl(frameMetadata.mo496getFrameNumberUgla2oM());
        }
        return androidx.camera.core.impl.CameraCaptureMetaData.FlashState.UNKNOWN;
    }

    public static final /* synthetic */ long access$getTimestamp(androidx.camera.camera2.pipe.FrameMetadata frameMetadata) {
        android.hardware.camera2.CaptureResult.Key key = android.hardware.camera2.CaptureResult.SENSOR_TIMESTAMP;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
        java.lang.Object orDefault = frameMetadata.getOrDefault((android.hardware.camera2.CaptureResult.Key<android.hardware.camera2.CaptureResult.Key>) key, (android.hardware.camera2.CaptureResult.Key) (-1L));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(orDefault, "");
        return ((java.lang.Number) orDefault).longValue();
    }
}
