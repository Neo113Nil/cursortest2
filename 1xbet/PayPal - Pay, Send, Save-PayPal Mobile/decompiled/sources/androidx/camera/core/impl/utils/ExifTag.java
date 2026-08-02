package androidx.camera.core.impl.utils;

/* loaded from: classes6.dex */
class ExifTag {
    public final java.lang.String Camera2StreamConfigurationMap;
    public final int getHighResolutionOutputSizeshNQ4ISI;
    public final int getHighSpeedVideoFpsRanges;
    public final int getHighSpeedVideoSizes;

    ExifTag(java.lang.String str, int i, int i2) {
        this.Camera2StreamConfigurationMap = str;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getHighSpeedVideoFpsRanges = i2;
        this.getHighSpeedVideoSizes = -1;
    }

    ExifTag(java.lang.String str, int i, int i2, int i3) {
        this.Camera2StreamConfigurationMap = str;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getHighSpeedVideoFpsRanges = i2;
        this.getHighSpeedVideoSizes = i3;
    }
}
