package androidx.core.provider;

/* loaded from: classes3.dex */
public final class FontRequest {
    private final java.lang.String Camera2StreamConfigurationMap;
    private final java.util.List<java.util.List<byte[]>> getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoFpsRangesFor;
    final java.lang.String getHighSpeedVideoSizes;
    private final java.lang.String getHighSpeedVideoSizesFor;
    private final java.lang.String getInputSizeshNQ4ISI;
    private final java.lang.String getOutputMinFrameDuration;

    public FontRequest(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List<java.util.List<byte[]>> list) {
        this(str, str2, str3, list, null, null);
    }

    public FontRequest(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List<java.util.List<byte[]>> list, java.lang.String str4, java.lang.String str5) {
        this.Camera2StreamConfigurationMap = (java.lang.String) androidx.core.util.Preconditions.checkNotNull(str);
        this.getHighSpeedVideoFpsRanges = (java.lang.String) androidx.core.util.Preconditions.checkNotNull(str2);
        this.getOutputMinFrameDuration = (java.lang.String) androidx.core.util.Preconditions.checkNotNull(str3);
        this.getHighResolutionOutputSizeshNQ4ISI = (java.util.List) androidx.core.util.Preconditions.checkNotNull(list);
        this.getHighSpeedVideoFpsRangesFor = 0;
        this.getInputSizeshNQ4ISI = str4;
        this.getHighSpeedVideoSizesFor = str5;
        this.getHighSpeedVideoSizes = getHighSpeedVideoSizes(str, str2, str3, str4, str5);
    }

    public FontRequest(java.lang.String str, java.lang.String str2, java.lang.String str3, int i) {
        this.Camera2StreamConfigurationMap = (java.lang.String) androidx.core.util.Preconditions.checkNotNull(str);
        this.getHighSpeedVideoFpsRanges = (java.lang.String) androidx.core.util.Preconditions.checkNotNull(str2);
        this.getOutputMinFrameDuration = (java.lang.String) androidx.core.util.Preconditions.checkNotNull(str3);
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        androidx.core.util.Preconditions.checkArgument(i != 0);
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getInputSizeshNQ4ISI = null;
        this.getHighSpeedVideoSizesFor = null;
        this.getHighSpeedVideoSizes = getHighSpeedVideoSizes(str, str2, str3, null, null);
    }

    private static java.lang.String getHighSpeedVideoSizes(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append("-");
        sb.append(str2);
        sb.append("-");
        sb.append(str3);
        sb.append("-");
        sb.append(str4);
        sb.append("-");
        sb.append(str5);
        return sb.toString();
    }

    public final java.lang.String getProviderAuthority() {
        return this.Camera2StreamConfigurationMap;
    }

    public final java.lang.String getProviderPackage() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final java.lang.String getQuery() {
        return this.getOutputMinFrameDuration;
    }

    public final java.util.List<java.util.List<byte[]>> getCertificates() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final int getCertificatesArrayResId() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @java.lang.Deprecated
    public final java.lang.String getIdentifier() {
        return this.getHighSpeedVideoSizes;
    }

    public final java.lang.String getSystemFont() {
        return this.getInputSizeshNQ4ISI;
    }

    public final java.lang.String getVariationSettings() {
        return this.getHighSpeedVideoSizesFor;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("FontRequest {mProviderAuthority: ");
        sb2.append(this.Camera2StreamConfigurationMap);
        sb2.append(", mProviderPackage: ");
        sb2.append(this.getHighSpeedVideoFpsRanges);
        sb2.append(", mQuery: ");
        sb2.append(this.getOutputMinFrameDuration);
        sb2.append(", mSystemFont: ");
        sb2.append(this.getInputSizeshNQ4ISI);
        sb2.append(", mVariationSettings: ");
        sb2.append(this.getHighSpeedVideoSizesFor);
        sb2.append(", mCertificates:");
        sb.append(sb2.toString());
        for (int i = 0; i < this.getHighResolutionOutputSizeshNQ4ISI.size(); i++) {
            sb.append(" [");
            java.util.List<byte[]> list = this.getHighResolutionOutputSizeshNQ4ISI.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(android.util.Base64.encodeToString(list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("mCertificatesArray: ");
        sb3.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(sb3.toString());
        return sb.toString();
    }
}
