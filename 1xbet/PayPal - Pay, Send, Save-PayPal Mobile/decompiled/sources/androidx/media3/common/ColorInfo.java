package androidx.media3.common;

/* loaded from: classes7.dex */
public final class ColorInfo {
    public final int chromaBitdepth;
    public final int colorRange;
    public final int colorSpace;
    public final int colorTransfer;
    private int getOutputMinFrameDuration;
    public final byte[] hdrStaticInfo;
    public final int lumaBitdepth;
    public static final androidx.media3.common.ColorInfo SDR_BT709_LIMITED = new androidx.media3.common.ColorInfo.Builder().setColorSpace(1).setColorRange(2).setColorTransfer(3).build();
    public static final androidx.media3.common.ColorInfo SRGB_BT709_FULL = new androidx.media3.common.ColorInfo.Builder().setColorSpace(1).setColorRange(1).setColorTransfer(2).build();
    private static final java.lang.String getHighSpeedVideoFpsRanges = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    private static final java.lang.String getHighSpeedVideoFpsRangesFor = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    private static final java.lang.String Camera2StreamConfigurationMap = androidx.media3.common.util.Util.intToStringMaxRadix(2);
    private static final java.lang.String getHighSpeedVideoSizes = androidx.media3.common.util.Util.intToStringMaxRadix(3);
    private static final java.lang.String getInputSizeshNQ4ISI = androidx.media3.common.util.Util.intToStringMaxRadix(4);
    private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI = androidx.media3.common.util.Util.intToStringMaxRadix(5);

    public static int colorSpaceToIsoColorPrimaries(int i) {
        if (i != 2) {
            return i != 6 ? 1 : 9;
        }
        return 5;
    }

    public static int colorSpaceToIsoMatrixCoefficients(int i) {
        if (i != 2) {
            return i != 6 ? 1 : 9;
        }
        return 6;
    }

    public static int colorTransferToIsoTransferCharacteristics(int i) {
        if (i == 1) {
            return 8;
        }
        if (i == 2) {
            return 13;
        }
        if (i == 6) {
            return 16;
        }
        if (i != 7) {
            return i != 10 ? 1 : 4;
        }
        return 18;
    }

    @org.checkerframework.dataflow.qual.Pure
    public static int isoColorPrimariesToColorSpace(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    @org.checkerframework.dataflow.qual.Pure
    public static int isoTransferCharacteristicsToColorTransfer(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 4) {
            return 10;
        }
        if (i == 13) {
            return 2;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    /* synthetic */ ColorInfo(int i, int i2, int i3, byte[] bArr, int i4, int i5, byte b) {
        this(i, i2, i3, bArr, i4, i5);
    }

    public static final class Builder {
        private int Camera2StreamConfigurationMap;
        private byte[] getHighResolutionOutputSizeshNQ4ISI;
        private int getHighSpeedVideoFpsRanges;
        private int getHighSpeedVideoFpsRangesFor;
        private int getHighSpeedVideoSizes;
        private int getOutputMinFrameDuration;

        /* synthetic */ Builder(androidx.media3.common.ColorInfo colorInfo, byte b) {
            this(colorInfo);
        }

        public Builder() {
            this.Camera2StreamConfigurationMap = -1;
            this.getHighSpeedVideoSizes = -1;
            this.getHighSpeedVideoFpsRangesFor = -1;
            this.getOutputMinFrameDuration = -1;
            this.getHighSpeedVideoFpsRanges = -1;
        }

        private Builder(androidx.media3.common.ColorInfo colorInfo) {
            this.Camera2StreamConfigurationMap = colorInfo.colorSpace;
            this.getHighSpeedVideoSizes = colorInfo.colorRange;
            this.getHighSpeedVideoFpsRangesFor = colorInfo.colorTransfer;
            this.getHighResolutionOutputSizeshNQ4ISI = colorInfo.hdrStaticInfo;
            this.getOutputMinFrameDuration = colorInfo.lumaBitdepth;
            this.getHighSpeedVideoFpsRanges = colorInfo.chromaBitdepth;
        }

        public final androidx.media3.common.ColorInfo.Builder setColorSpace(int i) {
            this.Camera2StreamConfigurationMap = i;
            return this;
        }

        public final androidx.media3.common.ColorInfo.Builder setColorRange(int i) {
            this.getHighSpeedVideoSizes = i;
            return this;
        }

        public final androidx.media3.common.ColorInfo.Builder setColorTransfer(int i) {
            this.getHighSpeedVideoFpsRangesFor = i;
            return this;
        }

        public final androidx.media3.common.ColorInfo.Builder setHdrStaticInfo(byte[] bArr) {
            this.getHighResolutionOutputSizeshNQ4ISI = bArr;
            return this;
        }

        public final androidx.media3.common.ColorInfo.Builder setLumaBitdepth(int i) {
            this.getOutputMinFrameDuration = i;
            return this;
        }

        public final androidx.media3.common.ColorInfo.Builder setChromaBitdepth(int i) {
            this.getHighSpeedVideoFpsRanges = i;
            return this;
        }

        public final androidx.media3.common.ColorInfo build() {
            return new androidx.media3.common.ColorInfo(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputMinFrameDuration, this.getHighSpeedVideoFpsRanges, (byte) 0);
        }
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"#1"}, result = false)
    public static boolean isEquivalentToAssumedSdrDefault(androidx.media3.common.ColorInfo colorInfo) {
        if (colorInfo == null) {
            return true;
        }
        int i = colorInfo.colorSpace;
        if (i != -1 && i != 1 && i != 2) {
            return false;
        }
        int i2 = colorInfo.colorRange;
        if (i2 != -1 && i2 != 2) {
            return false;
        }
        int i3 = colorInfo.colorTransfer;
        if ((i3 != -1 && i3 != 3) || colorInfo.hdrStaticInfo != null) {
            return false;
        }
        int i4 = colorInfo.chromaBitdepth;
        if (i4 != -1 && i4 != 8) {
            return false;
        }
        int i5 = colorInfo.lumaBitdepth;
        return i5 == -1 || i5 == 8;
    }

    public static boolean isTransferHdr(androidx.media3.common.ColorInfo colorInfo) {
        if (colorInfo == null) {
            return false;
        }
        int i = colorInfo.colorTransfer;
        return i == 7 || i == 6;
    }

    private ColorInfo(int i, int i2, int i3, byte[] bArr, int i4, int i5) {
        this.colorSpace = i;
        this.colorRange = i2;
        this.colorTransfer = i3;
        this.hdrStaticInfo = bArr;
        this.lumaBitdepth = i4;
        this.chromaBitdepth = i5;
    }

    public final androidx.media3.common.ColorInfo.Builder buildUpon() {
        return new androidx.media3.common.ColorInfo.Builder(this, (byte) 0);
    }

    public final boolean isValid() {
        return isBitdepthValid() || isDataSpaceValid();
    }

    public final boolean isBitdepthValid() {
        return (this.lumaBitdepth == -1 || this.chromaBitdepth == -1) ? false : true;
    }

    public final boolean isDataSpaceValid() {
        return (this.colorSpace == -1 || this.colorRange == -1 || this.colorTransfer == -1) ? false : true;
    }

    public final java.lang.String toLogString() {
        java.lang.String str;
        java.lang.String str2;
        if (isDataSpaceValid()) {
            str = androidx.media3.common.util.Util.formatInvariant("%s/%s/%s", getHighResolutionOutputSizeshNQ4ISI(this.colorSpace), getHighSpeedVideoSizes(this.colorRange), getHighSpeedVideoFpsRangesFor(this.colorTransfer));
        } else {
            str = "NA/NA/NA";
        }
        if (isBitdepthValid()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.lumaBitdepth);
            sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
            sb.append(this.chromaBitdepth);
            str2 = sb.toString();
        } else {
            str2 = "NA/NA";
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(str);
        sb2.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
        sb2.append(str2);
        return sb2.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.media3.common.ColorInfo colorInfo = (androidx.media3.common.ColorInfo) obj;
        return this.colorSpace == colorInfo.colorSpace && this.colorRange == colorInfo.colorRange && this.colorTransfer == colorInfo.colorTransfer && java.util.Arrays.equals(this.hdrStaticInfo, colorInfo.hdrStaticInfo) && this.lumaBitdepth == colorInfo.lumaBitdepth && this.chromaBitdepth == colorInfo.chromaBitdepth;
    }

    public final int hashCode() {
        if (this.getOutputMinFrameDuration == 0) {
            int i = this.colorSpace;
            int i2 = this.colorRange;
            int i3 = this.colorTransfer;
            int hashCode = java.util.Arrays.hashCode(this.hdrStaticInfo);
            this.getOutputMinFrameDuration = ((((((((((i + 527) * 31) + i2) * 31) + i3) * 31) + hashCode) * 31) + this.lumaBitdepth) * 31) + this.chromaBitdepth;
        }
        return this.getOutputMinFrameDuration;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ColorInfo(");
        sb.append(getHighResolutionOutputSizeshNQ4ISI(this.colorSpace));
        sb.append(", ");
        sb.append(getHighSpeedVideoSizes(this.colorRange));
        sb.append(", ");
        sb.append(getHighSpeedVideoFpsRangesFor(this.colorTransfer));
        sb.append(", ");
        sb.append(this.hdrStaticInfo != null);
        sb.append(", ");
        int i = this.lumaBitdepth;
        java.lang.String str2 = "NA";
        if (i == -1) {
            str = "NA";
        } else {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(i);
            sb2.append("bit Luma");
            str = sb2.toString();
        }
        sb.append(str);
        sb.append(", ");
        int i2 = this.chromaBitdepth;
        if (i2 != -1) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(i2);
            sb3.append("bit Chroma");
            str2 = sb3.toString();
        }
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    private static java.lang.String getHighResolutionOutputSizeshNQ4ISI(int i) {
        if (i == -1) {
            return "Unset color space";
        }
        if (i == 6) {
            return "BT2020";
        }
        if (i == 1) {
            return "BT709";
        }
        if (i == 2) {
            return "BT601";
        }
        return "Undefined color space ".concat(java.lang.String.valueOf(i));
    }

    private static java.lang.String getHighSpeedVideoFpsRangesFor(int i) {
        if (i == -1) {
            return "Unset color transfer";
        }
        if (i == 10) {
            return "Gamma 2.2";
        }
        if (i == 1) {
            return "Linear";
        }
        if (i == 2) {
            return "sRGB";
        }
        if (i == 3) {
            return "SDR SMPTE 170M";
        }
        if (i == 6) {
            return "ST2084 PQ";
        }
        if (i == 7) {
            return "HLG";
        }
        return "Undefined color transfer ".concat(java.lang.String.valueOf(i));
    }

    private static java.lang.String getHighSpeedVideoSizes(int i) {
        if (i == -1) {
            return "Unset color range";
        }
        if (i == 1) {
            return "Full range";
        }
        if (i == 2) {
            return "Limited range";
        }
        return "Undefined color range ".concat(java.lang.String.valueOf(i));
    }

    public final android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(getHighSpeedVideoFpsRanges, this.colorSpace);
        bundle.putInt(getHighSpeedVideoFpsRangesFor, this.colorRange);
        bundle.putInt(Camera2StreamConfigurationMap, this.colorTransfer);
        bundle.putByteArray(getHighSpeedVideoSizes, this.hdrStaticInfo);
        bundle.putInt(getInputSizeshNQ4ISI, this.lumaBitdepth);
        bundle.putInt(getHighResolutionOutputSizeshNQ4ISI, this.chromaBitdepth);
        return bundle;
    }

    public static androidx.media3.common.ColorInfo fromBundle(android.os.Bundle bundle) {
        return new androidx.media3.common.ColorInfo(bundle.getInt(getHighSpeedVideoFpsRanges, -1), bundle.getInt(getHighSpeedVideoFpsRangesFor, -1), bundle.getInt(Camera2StreamConfigurationMap, -1), bundle.getByteArray(getHighSpeedVideoSizes), bundle.getInt(getInputSizeshNQ4ISI, -1), bundle.getInt(getHighResolutionOutputSizeshNQ4ISI, -1));
    }
}
