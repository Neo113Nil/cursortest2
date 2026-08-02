package org.bouncycastle.asn1.x500.style;

/* loaded from: classes17.dex */
public class X500NameTokenizer {
    private java.lang.String Camera2StreamConfigurationMap;
    private java.lang.StringBuffer getHighResolutionOutputSizeshNQ4ISI;
    private char getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoSizes;

    public java.lang.String nextToken() {
        if (this.getHighSpeedVideoSizes == this.Camera2StreamConfigurationMap.length()) {
            return null;
        }
        int i = this.getHighSpeedVideoSizes + 1;
        this.getHighResolutionOutputSizeshNQ4ISI.setLength(0);
        boolean z = false;
        boolean z2 = false;
        while (i != this.Camera2StreamConfigurationMap.length()) {
            char charAt = this.Camera2StreamConfigurationMap.charAt(i);
            if (charAt == '\"') {
                if (!z2) {
                    z = !z;
                }
            } else if (!z2 && !z) {
                if (charAt != '\\') {
                    if (charAt == this.getHighSpeedVideoFpsRanges) {
                        break;
                    }
                    this.getHighResolutionOutputSizeshNQ4ISI.append(charAt);
                } else {
                    this.getHighResolutionOutputSizeshNQ4ISI.append(charAt);
                    z2 = true;
                }
                i++;
            }
            this.getHighResolutionOutputSizeshNQ4ISI.append(charAt);
            z2 = false;
            i++;
        }
        this.getHighSpeedVideoSizes = i;
        return this.getHighResolutionOutputSizeshNQ4ISI.toString();
    }

    public boolean hasMoreTokens() {
        return this.getHighSpeedVideoSizes != this.Camera2StreamConfigurationMap.length();
    }

    public X500NameTokenizer(java.lang.String str, char c) {
        this.getHighResolutionOutputSizeshNQ4ISI = new java.lang.StringBuffer();
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoSizes = -1;
        this.getHighSpeedVideoFpsRanges = c;
    }

    public X500NameTokenizer(java.lang.String str) {
        this(str, kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
    }
}
