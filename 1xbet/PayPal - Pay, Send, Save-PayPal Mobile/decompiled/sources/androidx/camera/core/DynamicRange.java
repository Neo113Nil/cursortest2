package androidx.camera.core;

/* loaded from: classes6.dex */
public final class DynamicRange {
    public static final int BIT_DEPTH_10_BIT = 10;
    public static final int BIT_DEPTH_8_BIT = 8;
    public static final int BIT_DEPTH_UNSPECIFIED = 0;
    public static final int ENCODING_DOLBY_VISION = 6;
    public static final int ENCODING_HDR10 = 4;
    public static final int ENCODING_HDR10_PLUS = 5;
    public static final int ENCODING_HDR_UNSPECIFIED = 2;
    public static final int ENCODING_HLG = 3;
    public static final int ENCODING_SDR = 1;
    public static final int ENCODING_UNSPECIFIED = 0;
    private final int getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoFpsRangesFor;
    public static final androidx.camera.core.DynamicRange UNSPECIFIED = new androidx.camera.core.DynamicRange(0, 0);
    public static final androidx.camera.core.DynamicRange SDR = new androidx.camera.core.DynamicRange(1, 8);
    public static final androidx.camera.core.DynamicRange HDR_UNSPECIFIED_10_BIT = new androidx.camera.core.DynamicRange(2, 10);
    public static final androidx.camera.core.DynamicRange HLG_10_BIT = new androidx.camera.core.DynamicRange(3, 10);
    public static final androidx.camera.core.DynamicRange HDR10_10_BIT = new androidx.camera.core.DynamicRange(4, 10);
    public static final androidx.camera.core.DynamicRange HDR10_PLUS_10_BIT = new androidx.camera.core.DynamicRange(5, 10);
    public static final androidx.camera.core.DynamicRange DOLBY_VISION_10_BIT = new androidx.camera.core.DynamicRange(6, 10);
    public static final androidx.camera.core.DynamicRange DOLBY_VISION_8_BIT = new androidx.camera.core.DynamicRange(6, 8);

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface BitDepth {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface DynamicRangeEncoding {
    }

    public DynamicRange(int i, int i2) {
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getHighSpeedVideoFpsRanges = i2;
    }

    public final int getEncoding() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final int getBitDepth() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final boolean isFullySpecified() {
        return (getEncoding() == 0 || getEncoding() == 2 || getBitDepth() == 0) ? false : true;
    }

    public final boolean is10BitHdr() {
        return isFullySpecified() && getEncoding() != 1 && getBitDepth() == 10;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DynamicRange@");
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb.append("{encoding=");
        switch (this.getHighSpeedVideoFpsRangesFor) {
            case 0:
                str = "UNSPECIFIED";
                break;
            case 1:
                str = "SDR";
                break;
            case 2:
                str = "HDR_UNSPECIFIED";
                break;
            case 3:
                str = "HLG";
                break;
            case 4:
                str = "HDR10";
                break;
            case 5:
                str = "HDR10_PLUS";
                break;
            case 6:
                str = "DOLBY_VISION";
                break;
            default:
                str = "<Unknown>";
                break;
        }
        sb.append(str);
        sb.append(", bitDepth=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.DynamicRange)) {
            return false;
        }
        androidx.camera.core.DynamicRange dynamicRange = (androidx.camera.core.DynamicRange) obj;
        return this.getHighSpeedVideoFpsRangesFor == dynamicRange.getEncoding() && this.getHighSpeedVideoFpsRanges == dynamicRange.getBitDepth();
    }

    public final int hashCode() {
        return ((this.getHighSpeedVideoFpsRangesFor ^ 1000003) * 1000003) ^ this.getHighSpeedVideoFpsRanges;
    }
}
