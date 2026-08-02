package androidx.webkit;

/* loaded from: classes7.dex */
public class WebMessageCompat {
    public static final int TYPE_ARRAY_BUFFER = 1;
    public static final int TYPE_STRING = 0;
    private final java.lang.String Camera2StreamConfigurationMap;
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.webkit.WebMessagePortCompat[] getHighSpeedVideoFpsRanges;
    private final byte[] getHighSpeedVideoFpsRangesFor;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface Type {
    }

    public WebMessageCompat(java.lang.String str) {
        this(str, (androidx.webkit.WebMessagePortCompat[]) null);
    }

    public WebMessageCompat(java.lang.String str, androidx.webkit.WebMessagePortCompat[] webMessagePortCompatArr) {
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getHighSpeedVideoFpsRanges = webMessagePortCompatArr;
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
    }

    public WebMessageCompat(byte[] bArr) {
        this(bArr, (androidx.webkit.WebMessagePortCompat[]) null);
    }

    public WebMessageCompat(byte[] bArr, androidx.webkit.WebMessagePortCompat[] webMessagePortCompatArr) {
        java.util.Objects.requireNonNull(bArr);
        this.getHighSpeedVideoFpsRangesFor = bArr;
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoFpsRanges = webMessagePortCompatArr;
        this.getHighResolutionOutputSizeshNQ4ISI = 1;
    }

    public int getType() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public byte[] getArrayBuffer() {
        getHighSpeedVideoFpsRanges(1);
        java.util.Objects.requireNonNull(this.getHighSpeedVideoFpsRangesFor);
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public java.lang.String getData() {
        getHighSpeedVideoFpsRanges(0);
        return this.Camera2StreamConfigurationMap;
    }

    public androidx.webkit.WebMessagePortCompat[] getPorts() {
        return this.getHighSpeedVideoFpsRanges;
    }

    private java.lang.String getHighResolutionOutputSizeshNQ4ISI(int i) {
        if (i == 0) {
            return "String";
        }
        if (i == 1) {
            return "ArrayBuffer";
        }
        return "Unknown";
    }

    private void getHighSpeedVideoFpsRanges(int i) {
        if (i == this.getHighResolutionOutputSizeshNQ4ISI) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Wrong data accessor type detected. ");
        sb.append(getHighResolutionOutputSizeshNQ4ISI(this.getHighResolutionOutputSizeshNQ4ISI));
        sb.append(" expected, but got ");
        sb.append(getHighResolutionOutputSizeshNQ4ISI(i));
        throw new java.lang.IllegalStateException(sb.toString());
    }
}
