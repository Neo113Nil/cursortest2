package my.com.softspace.reader.internal.kernel;

/* loaded from: classes17.dex */
class ApplicationConfiguration {
    final byte[] Camera2StreamConfigurationMap;
    final java.util.List<byte[]> getHighSpeedVideoFpsRanges;
    final byte[] getHighSpeedVideoSizes;

    private ApplicationConfiguration(byte[] bArr, byte[] bArr2, java.util.List<byte[]> list) {
        this.getHighSpeedVideoSizes = bArr;
        this.Camera2StreamConfigurationMap = bArr2;
        this.getHighSpeedVideoFpsRanges = list == null ? new java.util.ArrayList<>() : list;
    }

    static my.com.softspace.reader.internal.kernel.ApplicationConfiguration getHighSpeedVideoSizes(byte[] bArr, byte[] bArr2, java.util.List<byte[]> list) {
        if (list == null || list.size() == 0) {
            return new my.com.softspace.reader.internal.kernel.ApplicationConfiguration(bArr, bArr2, null);
        }
        return new my.com.softspace.reader.internal.kernel.ApplicationConfiguration(bArr, bArr2, list);
    }
}
