package androidx.webkit;

/* loaded from: classes7.dex */
public class CustomHeader {
    private final java.util.Set<java.lang.String> Camera2StreamConfigurationMap;
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String getHighSpeedVideoSizes;

    public CustomHeader(java.lang.String str, java.lang.String str2, java.util.Set<java.lang.String> set) {
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoSizes = str2;
        this.Camera2StreamConfigurationMap = set;
    }

    public java.lang.String getName() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public java.lang.String getValue() {
        return this.getHighSpeedVideoSizes;
    }

    public java.util.Set<java.lang.String> getRules() {
        return this.Camera2StreamConfigurationMap;
    }

    public int hashCode() {
        return java.util.Objects.hash(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.webkit.CustomHeader)) {
            return false;
        }
        androidx.webkit.CustomHeader customHeader = (androidx.webkit.CustomHeader) obj;
        return java.util.Objects.equals(this.getHighResolutionOutputSizeshNQ4ISI, customHeader.getHighResolutionOutputSizeshNQ4ISI) && java.util.Objects.equals(this.getHighSpeedVideoSizes, customHeader.getHighSpeedVideoSizes) && java.util.Objects.equals(this.Camera2StreamConfigurationMap, customHeader.Camera2StreamConfigurationMap);
    }
}
