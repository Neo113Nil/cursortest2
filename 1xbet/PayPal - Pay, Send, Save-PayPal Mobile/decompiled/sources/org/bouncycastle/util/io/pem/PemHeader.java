package org.bouncycastle.util.io.pem;

/* loaded from: classes17.dex */
public class PemHeader {
    private java.lang.String getHighSpeedVideoFpsRanges;
    private java.lang.String getHighSpeedVideoSizes;

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof org.bouncycastle.util.io.pem.PemHeader)) {
            return false;
        }
        org.bouncycastle.util.io.pem.PemHeader pemHeader = (org.bouncycastle.util.io.pem.PemHeader) obj;
        if (pemHeader == this) {
            return true;
        }
        java.lang.String str = this.getHighSpeedVideoSizes;
        java.lang.String str2 = pemHeader.getHighSpeedVideoSizes;
        if (str == str2 || (str != null && str2 != null && str.equals(str2))) {
            java.lang.String str3 = this.getHighSpeedVideoFpsRanges;
            java.lang.String str4 = pemHeader.getHighSpeedVideoFpsRanges;
            if (str3 == str4) {
                return true;
            }
            if (str3 != null && str4 != null && str3.equals(str4)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        java.lang.String str = this.getHighSpeedVideoSizes;
        int hashCode = str == null ? 1 : str.hashCode();
        java.lang.String str2 = this.getHighSpeedVideoFpsRanges;
        return hashCode + ((str2 != null ? str2.hashCode() : 1) * 31);
    }

    public java.lang.String getValue() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public java.lang.String getName() {
        return this.getHighSpeedVideoSizes;
    }

    public PemHeader(java.lang.String str, java.lang.String str2) {
        this.getHighSpeedVideoSizes = str;
        this.getHighSpeedVideoFpsRanges = str2;
    }
}
