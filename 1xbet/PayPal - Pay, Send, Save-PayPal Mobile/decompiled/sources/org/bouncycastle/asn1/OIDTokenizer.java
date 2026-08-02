package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public class OIDTokenizer {
    private int getHighSpeedVideoFpsRanges = 0;
    private java.lang.String getHighSpeedVideoFpsRangesFor;

    public java.lang.String nextToken() {
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == -1) {
            return null;
        }
        int indexOf = this.getHighSpeedVideoFpsRangesFor.indexOf(46, i);
        if (indexOf == -1) {
            java.lang.String substring = this.getHighSpeedVideoFpsRangesFor.substring(this.getHighSpeedVideoFpsRanges);
            this.getHighSpeedVideoFpsRanges = -1;
            return substring;
        }
        java.lang.String substring2 = this.getHighSpeedVideoFpsRangesFor.substring(this.getHighSpeedVideoFpsRanges, indexOf);
        this.getHighSpeedVideoFpsRanges = indexOf + 1;
        return substring2;
    }

    public boolean hasMoreTokens() {
        return this.getHighSpeedVideoFpsRanges != -1;
    }

    public OIDTokenizer(java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor = str;
    }
}
