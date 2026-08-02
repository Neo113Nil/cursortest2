package androidx.profileinstaller;

/* loaded from: classes7.dex */
class WritableFileSection {
    final androidx.profileinstaller.FileSectionType Camera2StreamConfigurationMap;
    final byte[] getHighResolutionOutputSizeshNQ4ISI;
    final int getHighSpeedVideoFpsRanges;
    final boolean getHighSpeedVideoSizes;

    WritableFileSection(androidx.profileinstaller.FileSectionType fileSectionType, int i, byte[] bArr, boolean z) {
        this.Camera2StreamConfigurationMap = fileSectionType;
        this.getHighSpeedVideoFpsRanges = i;
        this.getHighResolutionOutputSizeshNQ4ISI = bArr;
        this.getHighSpeedVideoSizes = z;
    }
}
