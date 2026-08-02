package com.android.volley;

/* loaded from: classes3.dex */
public final class Header {
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String getHighSpeedVideoSizes;

    public Header(java.lang.String str, java.lang.String str2) {
        this.getHighSpeedVideoSizes = str;
        this.getHighResolutionOutputSizeshNQ4ISI = str2;
    }

    public final java.lang.String getName() {
        return this.getHighSpeedVideoSizes;
    }

    public final java.lang.String getValue() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.android.volley.Header header = (com.android.volley.Header) obj;
        return android.text.TextUtils.equals(this.getHighSpeedVideoSizes, header.getHighSpeedVideoSizes) && android.text.TextUtils.equals(this.getHighResolutionOutputSizeshNQ4ISI, header.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final int hashCode() {
        return (this.getHighSpeedVideoSizes.hashCode() * 31) + this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Header[name=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(",value=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append("]");
        return sb.toString();
    }
}
