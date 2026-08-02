package my.com.softspace.reader.internal.kernel;

/* loaded from: classes17.dex */
public class AIDInfo implements java.lang.Comparable {
    private static final byte[] getHighSpeedVideoFpsRanges = {0};
    private final byte[] Camera2StreamConfigurationMap;
    private final byte[] getHighResolutionOutputSizeshNQ4ISI;
    private final byte[] getHighSpeedVideoFpsRangesFor;
    private byte[] getHighSpeedVideoSizes;

    public AIDInfo(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.Camera2StreamConfigurationMap = bArr;
        this.getHighResolutionOutputSizeshNQ4ISI = bArr2;
        if (bArr3 != null && bArr3.length > 0) {
            this.getHighSpeedVideoFpsRangesFor = bArr3;
        } else {
            this.getHighSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRanges;
        }
        this.getHighSpeedVideoSizes = null;
    }

    public byte[] getAid() {
        return this.Camera2StreamConfigurationMap;
    }

    public byte[] getName() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public byte[] getPriority() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public byte[] getSelectResponse() {
        return this.getHighSpeedVideoSizes;
    }

    public void setSelectResponse(byte[] bArr) {
        this.getHighSpeedVideoSizes = bArr;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof my.com.softspace.reader.internal.kernel.AIDInfo)) {
            return false;
        }
        my.com.softspace.reader.internal.kernel.AIDInfo aIDInfo = (my.com.softspace.reader.internal.kernel.AIDInfo) obj;
        return java.util.Arrays.equals(getAid(), aIDInfo.getAid()) && java.util.Arrays.equals(getName(), aIDInfo.getName()) && java.util.Arrays.equals(getPriority(), aIDInfo.getPriority());
    }

    public int hashCode() {
        return (((java.util.Arrays.hashCode(getAid()) * 31) + java.util.Arrays.hashCode(getName())) * 31) + java.util.Arrays.hashCode(getPriority());
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        byte b;
        int i;
        if (!(obj instanceof my.com.softspace.reader.internal.kernel.AIDInfo)) {
            return -1;
        }
        byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
        byte[] bArr2 = ((my.com.softspace.reader.internal.kernel.AIDInfo) obj).getHighSpeedVideoFpsRangesFor;
        if (bArr == null || bArr.length <= 0 || bArr2 == null || bArr2.length <= 0 || bArr.length <= 0 || bArr2.length <= 0 || ((i = (b = bArr[0]) & 128) != 0 && (bArr2[0] & 128) == 0)) {
            return -1;
        }
        if (i == 0 && (bArr2[0] & 128) != 0) {
            return 1;
        }
        int i2 = b & com.google.common.base.Ascii.SI;
        int i3 = bArr2[0] & com.google.common.base.Ascii.SI;
        if (i2 == i3) {
            return 0;
        }
        if (i2 != 0 || i3 == 0) {
            return ((i2 == 0 || i3 != 0) && i2 > i3) ? 1 : -1;
        }
        return 1;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AIDInfo{aid=");
        sb.append(new java.lang.String(this.Camera2StreamConfigurationMap));
        sb.append(", name=");
        sb.append(new java.lang.String(this.getHighResolutionOutputSizeshNQ4ISI));
        sb.append(", priority=");
        sb.append(my.com.softspace.reader.internal.kernelconfig.HexUtil.byteArrayToHexString(this.getHighSpeedVideoFpsRangesFor));
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}
