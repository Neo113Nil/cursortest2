package androidx.profileinstaller;

/* loaded from: classes7.dex */
class DexProfileData {
    final long Camera2StreamConfigurationMap;
    final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    int[] getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final java.lang.String getHighSpeedVideoSizes;
    final java.util.TreeMap<java.lang.Integer, java.lang.Integer> getInputFormats;
    final int getInputSizeshNQ4ISI;
    long getOutputFormats = 0;
    final int getOutputMinFrameDuration;

    DexProfileData(java.lang.String str, java.lang.String str2, long j, int i, int i2, int i3, int[] iArr, java.util.TreeMap<java.lang.Integer, java.lang.Integer> treeMap) {
        this.getHighSpeedVideoSizes = str;
        this.getHighResolutionOutputSizeshNQ4ISI = str2;
        this.Camera2StreamConfigurationMap = j;
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getInputSizeshNQ4ISI = i2;
        this.getOutputMinFrameDuration = i3;
        this.getHighSpeedVideoFpsRanges = iArr;
        this.getInputFormats = treeMap;
    }
}
