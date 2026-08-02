package androidx.camera.video.internal.workaround;

/* loaded from: classes6.dex */
public class VideoTimebaseConverter {
    private long Camera2StreamConfigurationMap = -1;
    private final androidx.camera.video.internal.encoder.TimeProvider getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.camera.core.impl.Timebase getHighSpeedVideoFpsRanges;
    private androidx.camera.core.impl.Timebase getHighSpeedVideoFpsRangesFor;
    private final androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk getHighSpeedVideoSizes;

    public VideoTimebaseConverter(androidx.camera.video.internal.encoder.TimeProvider timeProvider, androidx.camera.core.impl.Timebase timebase, androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk cameraUseInconsistentTimebaseQuirk) {
        this.getHighResolutionOutputSizeshNQ4ISI = timeProvider;
        this.getHighSpeedVideoFpsRanges = timebase;
        this.getHighSpeedVideoSizes = cameraUseInconsistentTimebaseQuirk;
    }

    public long convertToUptimeUs(long j) {
        androidx.camera.core.impl.Timebase timebase;
        boolean z;
        java.lang.String str;
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            if (this.getHighSpeedVideoSizes != null) {
                androidx.camera.core.Logger.w("VideoTimebaseConverter", "CameraUseInconsistentTimebaseQuirk is enabled");
                z = false;
            } else if (this.getHighResolutionOutputSizeshNQ4ISI.realtimeUs() - this.getHighResolutionOutputSizeshNQ4ISI.uptimeUs() > com.paypal.oslo.feature.helpcenter.ui.util.VideoThumbnailExtractor.DEFAULT_FRAME_TIME_US) {
                z = true;
            } else {
                timebase = this.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRangesFor = timebase;
            }
            timebase = java.lang.Math.abs(j - this.getHighResolutionOutputSizeshNQ4ISI.realtimeUs()) < java.lang.Math.abs(j - this.getHighResolutionOutputSizeshNQ4ISI.uptimeUs()) ? androidx.camera.core.impl.Timebase.REALTIME : androidx.camera.core.impl.Timebase.UPTIME;
            if (z && timebase != this.getHighSpeedVideoFpsRanges) {
                if (android.os.Build.VERSION.SDK_INT < 31) {
                    str = "";
                } else {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(", SOC: ");
                    sb.append(android.os.Build.SOC_MODEL);
                    str = sb.toString();
                }
                androidx.camera.core.Logger.e("VideoTimebaseConverter", java.lang.String.format("Detected camera timebase inconsistent. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, Hardware: %s, API Level: %d%s].\nCamera timebase is inconsistent. The timebase reported by the camera is %s, but the actual timebase contained in the frame is detected as %s.", android.os.Build.MANUFACTURER, android.os.Build.MODEL, android.os.Build.HARDWARE, java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT), str, this.getHighSpeedVideoFpsRanges, timebase));
            } else {
                androidx.camera.core.Logger.d("VideoTimebaseConverter", "Detect input timebase = ".concat(java.lang.String.valueOf(timebase)));
            }
            this.getHighSpeedVideoFpsRangesFor = timebase;
        }
        int i = androidx.camera.video.internal.workaround.VideoTimebaseConverter.AnonymousClass1.getHighSpeedVideoSizes[this.getHighSpeedVideoFpsRangesFor.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return j;
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unknown timebase: ");
            sb2.append(this.getHighSpeedVideoFpsRangesFor);
            throw new java.lang.AssertionError(sb2.toString());
        }
        if (this.Camera2StreamConfigurationMap == -1) {
            long j2 = Long.MAX_VALUE;
            long j3 = 0;
            for (int i2 = 0; i2 < 3; i2++) {
                long uptimeUs = this.getHighResolutionOutputSizeshNQ4ISI.uptimeUs();
                long realtimeUs = this.getHighResolutionOutputSizeshNQ4ISI.realtimeUs();
                long uptimeUs2 = this.getHighResolutionOutputSizeshNQ4ISI.uptimeUs();
                long j4 = uptimeUs2 - uptimeUs;
                if (i2 == 0 || j4 < j2) {
                    j3 = realtimeUs - ((uptimeUs + uptimeUs2) >> 1);
                    j2 = j4;
                }
            }
            this.Camera2StreamConfigurationMap = java.lang.Math.max(0L, j3);
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("mUptimeToRealtimeOffsetUs = ");
            sb3.append(this.Camera2StreamConfigurationMap);
            androidx.camera.core.Logger.d("VideoTimebaseConverter", sb3.toString());
        }
        return j - this.Camera2StreamConfigurationMap;
    }

    /* renamed from: androidx.camera.video.internal.workaround.VideoTimebaseConverter$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoSizes;

        static {
            int[] iArr = new int[androidx.camera.core.impl.Timebase.values().length];
            getHighSpeedVideoSizes = iArr;
            try {
                iArr[androidx.camera.core.impl.Timebase.REALTIME.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoSizes[androidx.camera.core.impl.Timebase.UPTIME.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }
}
