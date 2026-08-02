package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class X509NameTokenizer {
    private char Camera2StreamConfigurationMap;
    private int getHighSpeedVideoFpsRanges;
    private java.lang.StringBuffer getHighSpeedVideoFpsRangesFor;
    private java.lang.String getHighSpeedVideoSizes;

    public java.lang.String nextToken() {
        if (this.getHighSpeedVideoFpsRanges == this.getHighSpeedVideoSizes.length()) {
            return null;
        }
        int i = this.getHighSpeedVideoFpsRanges + 1;
        this.getHighSpeedVideoFpsRangesFor.setLength(0);
        boolean z = false;
        boolean z2 = false;
        while (i != this.getHighSpeedVideoSizes.length()) {
            char charAt = this.getHighSpeedVideoSizes.charAt(i);
            if (charAt == '\"') {
                if (!z2) {
                    z = !z;
                }
            } else if (!z2 && !z) {
                if (charAt != '\\') {
                    if (charAt == this.Camera2StreamConfigurationMap) {
                        break;
                    }
                    this.getHighSpeedVideoFpsRangesFor.append(charAt);
                } else {
                    this.getHighSpeedVideoFpsRangesFor.append(charAt);
                    z2 = true;
                }
                i++;
            }
            this.getHighSpeedVideoFpsRangesFor.append(charAt);
            z2 = false;
            i++;
        }
        this.getHighSpeedVideoFpsRanges = i;
        return this.getHighSpeedVideoFpsRangesFor.toString();
    }

    public boolean hasMoreTokens() {
        return this.getHighSpeedVideoFpsRanges != this.getHighSpeedVideoSizes.length();
    }

    public X509NameTokenizer(java.lang.String str, char c) {
        this.getHighSpeedVideoFpsRangesFor = new java.lang.StringBuffer();
        this.getHighSpeedVideoSizes = str;
        this.getHighSpeedVideoFpsRanges = -1;
        this.Camera2StreamConfigurationMap = c;
    }

    public X509NameTokenizer(java.lang.String str) {
        this(str, kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
    }
}
