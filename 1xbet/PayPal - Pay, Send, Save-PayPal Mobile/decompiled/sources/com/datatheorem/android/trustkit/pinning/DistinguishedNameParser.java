package com.datatheorem.android.trustkit.pinning;

/* loaded from: classes8.dex */
final class DistinguishedNameParser {
    char[] Camera2StreamConfigurationMap;
    final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    int getInputSizeshNQ4ISI;
    final int getOutputMinFrameDuration;

    public DistinguishedNameParser(javax.security.auth.x500.X500Principal x500Principal) {
        java.lang.String name2 = x500Principal.getName("RFC2253");
        this.getHighResolutionOutputSizeshNQ4ISI = name2;
        this.getOutputMinFrameDuration = name2.length();
    }

    final java.lang.String getHighSpeedVideoFpsRangesFor() {
        int i;
        int i2;
        int i3;
        int i4;
        char c;
        char c2;
        char c3;
        int i5;
        int i6;
        char c4;
        char c5;
        while (true) {
            i = this.getInputSizeshNQ4ISI;
            i2 = this.getOutputMinFrameDuration;
            if (i >= i2 || this.Camera2StreamConfigurationMap[i] != ' ') {
                break;
            }
            this.getInputSizeshNQ4ISI = i + 1;
        }
        if (i == i2) {
            return null;
        }
        this.getHighSpeedVideoFpsRanges = i;
        this.getInputSizeshNQ4ISI = i + 1;
        while (true) {
            i3 = this.getInputSizeshNQ4ISI;
            i4 = this.getOutputMinFrameDuration;
            if (i3 >= i4 || (c5 = this.Camera2StreamConfigurationMap[i3]) == '=' || c5 == ' ') {
                break;
            }
            this.getInputSizeshNQ4ISI = i3 + 1;
        }
        if (i3 >= i4) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected end of DN: ");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            throw new java.lang.IllegalStateException(sb.toString());
        }
        this.getHighSpeedVideoSizes = i3;
        if (this.Camera2StreamConfigurationMap[i3] == ' ') {
            while (true) {
                i5 = this.getInputSizeshNQ4ISI;
                i6 = this.getOutputMinFrameDuration;
                if (i5 >= i6 || (c4 = this.Camera2StreamConfigurationMap[i5]) == '=' || c4 != ' ') {
                    break;
                }
                this.getInputSizeshNQ4ISI = i5 + 1;
            }
            if (this.Camera2StreamConfigurationMap[i5] != '=' || i5 == i6) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unexpected end of DN: ");
                sb2.append(this.getHighResolutionOutputSizeshNQ4ISI);
                throw new java.lang.IllegalStateException(sb2.toString());
            }
        }
        this.getInputSizeshNQ4ISI++;
        while (true) {
            int i7 = this.getInputSizeshNQ4ISI;
            if (i7 >= this.getOutputMinFrameDuration || this.Camera2StreamConfigurationMap[i7] != ' ') {
                break;
            }
            this.getInputSizeshNQ4ISI = i7 + 1;
        }
        int i8 = this.getHighSpeedVideoSizes;
        int i9 = this.getHighSpeedVideoFpsRanges;
        if (i8 - i9 > 4) {
            char[] cArr = this.Camera2StreamConfigurationMap;
            if (cArr[i9 + 3] == '.' && (((c = cArr[i9]) == 'O' || c == 'o') && (((c2 = cArr[i9 + 1]) == 'I' || c2 == 'i') && ((c3 = cArr[i9 + 2]) == 'D' || c3 == 'd')))) {
                this.getHighSpeedVideoFpsRanges = i9 + 4;
            }
        }
        char[] cArr2 = this.Camera2StreamConfigurationMap;
        int i10 = this.getHighSpeedVideoFpsRanges;
        return new java.lang.String(cArr2, i10, i8 - i10);
    }

    final char getHighSpeedVideoFpsRanges() {
        int i;
        int i2 = this.getInputSizeshNQ4ISI + 1;
        this.getInputSizeshNQ4ISI = i2;
        if (i2 == this.getOutputMinFrameDuration) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected end of DN: ");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            throw new java.lang.IllegalStateException(sb.toString());
        }
        char c = this.Camera2StreamConfigurationMap[i2];
        if (c == ' ' || c == '%' || c == '\\' || c == '_' || c == '\"' || c == '#') {
            return c;
        }
        switch (c) {
            case '*':
            case '+':
            case ',':
                return c;
            default:
                switch (c) {
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                        return c;
                    default:
                        int highSpeedVideoSizes = getHighSpeedVideoSizes(i2);
                        this.getInputSizeshNQ4ISI++;
                        if (highSpeedVideoSizes >= 128) {
                            if (highSpeedVideoSizes >= 192 && highSpeedVideoSizes <= 247) {
                                if (highSpeedVideoSizes <= 223) {
                                    highSpeedVideoSizes &= 31;
                                    i = 1;
                                } else if (highSpeedVideoSizes <= 239) {
                                    highSpeedVideoSizes &= 15;
                                    i = 2;
                                } else {
                                    highSpeedVideoSizes &= 7;
                                    i = 3;
                                }
                                for (int i3 = 0; i3 < i; i3++) {
                                    int i4 = this.getInputSizeshNQ4ISI;
                                    int i5 = i4 + 1;
                                    this.getInputSizeshNQ4ISI = i5;
                                    if (i5 != this.getOutputMinFrameDuration && this.Camera2StreamConfigurationMap[i5] == '\\') {
                                        int i6 = i4 + 2;
                                        this.getInputSizeshNQ4ISI = i6;
                                        int highSpeedVideoSizes2 = getHighSpeedVideoSizes(i6);
                                        this.getInputSizeshNQ4ISI++;
                                        if ((highSpeedVideoSizes2 & 192) == 128) {
                                            highSpeedVideoSizes = (highSpeedVideoSizes << 6) + (highSpeedVideoSizes2 & 63);
                                        }
                                    }
                                }
                            }
                            return '?';
                        }
                        return (char) highSpeedVideoSizes;
                }
        }
    }

    final int getHighSpeedVideoSizes(int i) {
        int i2;
        int i3;
        int i4 = i + 1;
        if (i4 >= this.getOutputMinFrameDuration) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Malformed DN: ");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            throw new java.lang.IllegalStateException(sb.toString());
        }
        char[] cArr = this.Camera2StreamConfigurationMap;
        char c = cArr[i];
        if (c >= '0' && c <= '9') {
            i2 = c - '0';
        } else if (c >= 'a' && c <= 'f') {
            i2 = c - 'W';
        } else {
            if (c < 'A' || c > 'F') {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Malformed DN: ");
                sb2.append(this.getHighResolutionOutputSizeshNQ4ISI);
                throw new java.lang.IllegalStateException(sb2.toString());
            }
            i2 = c - '7';
        }
        char c2 = cArr[i4];
        if (c2 >= '0' && c2 <= '9') {
            i3 = c2 - '0';
        } else if (c2 >= 'a' && c2 <= 'f') {
            i3 = c2 - 'W';
        } else {
            if (c2 < 'A' || c2 > 'F') {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Malformed DN: ");
                sb3.append(this.getHighResolutionOutputSizeshNQ4ISI);
                throw new java.lang.IllegalStateException(sb3.toString());
            }
            i3 = c2 - '7';
        }
        return (i2 << 4) + i3;
    }
}
