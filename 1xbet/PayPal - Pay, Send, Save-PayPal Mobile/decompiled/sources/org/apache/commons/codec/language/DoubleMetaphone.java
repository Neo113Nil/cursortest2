package org.apache.commons.codec.language;

/* loaded from: classes17.dex */
public class DoubleMetaphone implements org.apache.commons.codec.StringEncoder {
    private int getHighResolutionOutputSizeshNQ4ISI = 4;
    private static final java.lang.String[] getHighSpeedVideoFpsRanges = {"GN", "KN", "PN", "WR", "PS"};
    private static final java.lang.String[] getHighSpeedVideoSizes = {"L", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "N", "M", "B", "H", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "V", "W", " "};
    private static final java.lang.String[] getHighSpeedVideoFpsRangesFor = {"ES", "EP", "EB", "EL", "EY", "IB", "IL", "IN", "IE", "EI", "ER"};
    private static final java.lang.String[] Camera2StreamConfigurationMap = {"L", "T", "K", "S", "N", "M", "B", "Z"};

    public class DoubleMetaphoneResult {
        private final java.lang.StringBuilder getHighResolutionOutputSizeshNQ4ISI;
        private final int getHighSpeedVideoFpsRangesFor;
        private final java.lang.StringBuilder getHighSpeedVideoSizes;

        public DoubleMetaphoneResult(int i) {
            this.getHighResolutionOutputSizeshNQ4ISI = new java.lang.StringBuilder(org.apache.commons.codec.language.DoubleMetaphone.this.getMaxCodeLen());
            this.getHighSpeedVideoSizes = new java.lang.StringBuilder(org.apache.commons.codec.language.DoubleMetaphone.this.getMaxCodeLen());
            this.getHighSpeedVideoFpsRangesFor = i;
        }

        public void append(char c) {
            appendPrimary(c);
            appendAlternate(c);
        }

        public void append(char c, char c2) {
            appendPrimary(c);
            appendAlternate(c2);
        }

        public void append(java.lang.String str) {
            appendPrimary(str);
            appendAlternate(str);
        }

        public void append(java.lang.String str, java.lang.String str2) {
            appendPrimary(str);
            appendAlternate(str2);
        }

        public void appendAlternate(char c) {
            if (this.getHighSpeedVideoSizes.length() < this.getHighSpeedVideoFpsRangesFor) {
                this.getHighSpeedVideoSizes.append(c);
            }
        }

        public void appendAlternate(java.lang.String str) {
            int length = this.getHighSpeedVideoFpsRangesFor - this.getHighSpeedVideoSizes.length();
            if (str.length() <= length) {
                this.getHighSpeedVideoSizes.append(str);
            } else {
                this.getHighSpeedVideoSizes.append((java.lang.CharSequence) str, 0, length);
            }
        }

        public void appendPrimary(char c) {
            if (this.getHighResolutionOutputSizeshNQ4ISI.length() < this.getHighSpeedVideoFpsRangesFor) {
                this.getHighResolutionOutputSizeshNQ4ISI.append(c);
            }
        }

        public void appendPrimary(java.lang.String str) {
            int length = this.getHighSpeedVideoFpsRangesFor - this.getHighResolutionOutputSizeshNQ4ISI.length();
            if (str.length() <= length) {
                this.getHighResolutionOutputSizeshNQ4ISI.append(str);
            } else {
                this.getHighResolutionOutputSizeshNQ4ISI.append((java.lang.CharSequence) str, 0, length);
            }
        }

        public java.lang.String getAlternate() {
            return this.getHighSpeedVideoSizes.toString();
        }

        public java.lang.String getPrimary() {
            return this.getHighResolutionOutputSizeshNQ4ISI.toString();
        }

        public boolean isComplete() {
            return this.getHighResolutionOutputSizeshNQ4ISI.length() >= this.getHighSpeedVideoFpsRangesFor && this.getHighSpeedVideoSizes.length() >= this.getHighSpeedVideoFpsRangesFor;
        }
    }

    protected static boolean contains(java.lang.String str, int i, int i2, java.lang.String... strArr) {
        int i3;
        if (i >= 0 && (i3 = i2 + i) <= str.length()) {
            java.lang.String substring = str.substring(i, i3);
            for (java.lang.String str2 : strArr) {
                if (substring.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    protected char charAt(java.lang.String str, int i) {
        if (i < 0 || i >= str.length()) {
            return (char) 0;
        }
        return str.charAt(i);
    }

    public java.lang.String doubleMetaphone(java.lang.String str) {
        return doubleMetaphone(str, false);
    }

    @Override // org.apache.commons.codec.Encoder
    public java.lang.Object encode(java.lang.Object obj) throws org.apache.commons.codec.EncoderException {
        if (!(obj instanceof java.lang.String)) {
            throw new org.apache.commons.codec.EncoderException("DoubleMetaphone encode parameter is not of type String");
        }
        return doubleMetaphone((java.lang.String) obj);
    }

    @Override // org.apache.commons.codec.StringEncoder
    public java.lang.String encode(java.lang.String str) {
        return doubleMetaphone(str);
    }

    public int getMaxCodeLen() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public boolean isDoubleMetaphoneEqual(java.lang.String str, java.lang.String str2) {
        return isDoubleMetaphoneEqual(str, str2, false);
    }

    public boolean isDoubleMetaphoneEqual(java.lang.String str, java.lang.String str2, boolean z) {
        return org.apache.commons.codec.binary.StringUtils.equals(doubleMetaphone(str, z), doubleMetaphone(str2, z));
    }

    public void setMaxCodeLen(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0212, code lost:
    
        if (contains(r1, r3, 1, "T", "D") != false) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02dd, code lost:
    
        if (contains(r1, r6 + 1, 1, "M", "N", "L", "W") == false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02fe, code lost:
    
        if (contains(r1, r3, 1, "Z") != false) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x03b3, code lost:
    
        if (contains(r1, r3, 1, "S", "Z") == false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x03fd, code lost:
    
        if (charAt(r1, r4) != r3) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0433, code lost:
    
        if (contains(r1, r3, 1, "P", "B") != false) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x049f, code lost:
    
        if (contains(r1, r6 - 1, 4, "ILLO", "ILLA", "ALLE") != false) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x04d7, code lost:
    
        r7.appendPrimary(org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_RANDOM_LT);
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x04c6, code lost:
    
        if (contains(r1, r1.length() - 1, 1, "A", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.ORDER_PREFIX_PAYMENT) != false) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x04db, code lost:
    
        r7.append(org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_RANDOM_LT);
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x04d5, code lost:
    
        if (contains(r1, r6 - 1, 4, "ALLE") != false) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0582, code lost:
    
        if (charAt(r1, r4) == 'J') goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x05bd, code lost:
    
        if ("AEIOUY".indexOf(charAt(r1, r6 - 1)) != (-1)) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0619, code lost:
    
        if (contains(r1, r6 - 2, 1, "B", "H", "D") == false) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x062b, code lost:
    
        if (contains(r1, r6 - 3, 1, "B", "H", "D") == false) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x063c, code lost:
    
        if (contains(r1, r6 - 4, 1, "B", "H") != false) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x01c6, code lost:
    
        if (charAt(r1, r3) == 'V') goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x0412, code lost:
    
        r6 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x040e, code lost:
    
        if (charAt(r1, r3) == 'Q') goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x0442, code lost:
    
        if (charAt(r1, r4) == 'N') goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x07c3, code lost:
    
        r6 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x0478, code lost:
    
        if (contains(r1, r6 + 2, 2, "ER") != false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x07bf, code lost:
    
        if (charAt(r1, r4) == 'F') goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x0840, code lost:
    
        if (r4 != 'E') goto L385;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x084f, code lost:
    
        if (contains(r1, r3, 6, "BACHER", "MACHER") != false) goto L385;
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x0a79, code lost:
    
        if (contains(r1, r3, 2, "CE", "CI") == false) goto L494;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x0a8c, code lost:
    
        if (charAt(r1, r3) == 'B') goto L494;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c8, code lost:
    
        if (charAt(r1, r4) == 'Z') goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00fe, code lost:
    
        if (contains(r1, r6 - 2, 2, "AU", "OU") == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0113, code lost:
    
        if (contains(r1, r3, 1, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.XAMARIN) == false) goto L230;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:33:0x0086. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:418:0x08ff  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0019 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String doubleMetaphone(java.lang.String str, boolean z) {
        java.lang.String upperCase;
        int i;
        char c;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        char c2;
        if (str != null) {
            java.lang.String trim = str.trim();
            if (!trim.isEmpty()) {
                upperCase = trim.toUpperCase(java.util.Locale.ENGLISH);
                if (upperCase != null) {
                    return null;
                }
                char c3 = 'K';
                boolean z2 = upperCase.indexOf(87) >= 0 || upperCase.indexOf(75) >= 0 || upperCase.contains("CZ") || upperCase.contains("WITZ");
                java.lang.String[] strArr = getHighSpeedVideoFpsRanges;
                int length = strArr.length;
                int i9 = 0;
                while (true) {
                    if (i9 >= length) {
                        i = 0;
                        break;
                    }
                    if (upperCase.startsWith(strArr[i9])) {
                        i = 1;
                        break;
                    }
                    i9++;
                }
                org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = new org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult(getMaxCodeLen());
                while (!doubleMetaphoneResult.isComplete() && i <= upperCase.length() - 1) {
                    char charAt = upperCase.charAt(i);
                    if (charAt == 199) {
                        c = c3;
                        doubleMetaphoneResult.append('S');
                    } else if (charAt != 209) {
                        switch (charAt) {
                            case 'A':
                            case 'E':
                            case 'I':
                            case 'O':
                            case 'U':
                            case 'Y':
                                c = 'K';
                                if (i == 0) {
                                    doubleMetaphoneResult.append('A');
                                    break;
                                }
                                break;
                            case 'B':
                                c = 'K';
                                doubleMetaphoneResult.append('P');
                                i2 = i + 1;
                                break;
                            case 'C':
                                if (!contains(upperCase, i, 4, "CHIA")) {
                                    if (i > 1) {
                                        int i10 = i - 2;
                                        if ("AEIOUY".indexOf(charAt(upperCase, i10)) == -1) {
                                            if (contains(upperCase, i - 1, 3, "ACH")) {
                                                char charAt2 = charAt(upperCase, i + 2);
                                                if (charAt2 != 'I') {
                                                    break;
                                                }
                                                break;
                                            }
                                        }
                                    }
                                    if (i == 0 && contains(upperCase, i, 6, "CAESAR")) {
                                        doubleMetaphoneResult.append('S');
                                    } else if (!contains(upperCase, i, 2, "CH")) {
                                        if (contains(upperCase, i, 2, "CZ")) {
                                            if (!contains(upperCase, i - 2, 4, "WICZ")) {
                                                doubleMetaphoneResult.append('S', 'X');
                                            }
                                        }
                                        i2 = i + 1;
                                        if (contains(upperCase, i2, 3, "CIA")) {
                                            doubleMetaphoneResult.append('X');
                                            i += 3;
                                            c = 'K';
                                            c3 = c;
                                            break;
                                        } else {
                                            if (contains(upperCase, i, 2, "CC") && (i != 1 || charAt(upperCase, 0) != 'M')) {
                                                i2 = i + 2;
                                                if (contains(upperCase, i2, 1, com.visa.cbp.getEncExpo.warmup, "E", "H") && !contains(upperCase, i2, 2, "HU")) {
                                                    if (i != 1 || charAt(upperCase, i - 1) != 'A') {
                                                        if (!contains(upperCase, i - 1, 5, "UCCEE", "UCCES")) {
                                                            doubleMetaphoneResult.append('X');
                                                            i += 3;
                                                            c = 'K';
                                                            c3 = c;
                                                        }
                                                    }
                                                    doubleMetaphoneResult.append("KS");
                                                    i += 3;
                                                    c = 'K';
                                                    c3 = c;
                                                } else {
                                                    c = 'K';
                                                    doubleMetaphoneResult.append('K');
                                                    i = i2;
                                                    c3 = c;
                                                }
                                            }
                                            if (contains(upperCase, i, 2, "CK", "CG", "CQ")) {
                                                doubleMetaphoneResult.append('K');
                                            } else if (contains(upperCase, i, 2, "CI", "CE", "CY")) {
                                                if (contains(upperCase, i, 3, "CIO", "CIE", "CIA")) {
                                                    doubleMetaphoneResult.append('S', 'X');
                                                } else {
                                                    doubleMetaphoneResult.append('S');
                                                }
                                            } else {
                                                c = 'K';
                                                doubleMetaphoneResult.append('K');
                                                if (contains(upperCase, i2, 2, " C", " Q", " G")) {
                                                    i += 3;
                                                    c3 = c;
                                                } else {
                                                    if (contains(upperCase, i2, 1, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "K", com.visa.cbp.getEncExpo.updateVisuals)) {
                                                        break;
                                                    }
                                                    i = i2;
                                                    c3 = c;
                                                }
                                            }
                                            i += 2;
                                            c = 'K';
                                            c3 = c;
                                        }
                                    } else if (i > 0 && contains(upperCase, i, 4, "CHAE")) {
                                        doubleMetaphoneResult.append('K', 'X');
                                    } else {
                                        if (i == 0) {
                                            int i11 = i + 1;
                                            if (contains(upperCase, i11, 5, "HARAC", "HARIS") || contains(upperCase, i11, 3, "HOR", "HYM", "HIA", "HEM")) {
                                                i3 = 0;
                                                if (!contains(upperCase, 0, 5, "CHORE")) {
                                                    doubleMetaphoneResult.append('K');
                                                }
                                                if (!contains(upperCase, i3, 4, "VAN ", "VON ") && !contains(upperCase, i3, 3, "SCH")) {
                                                    if (!contains(upperCase, i - 2, 6, "ORCHES", "ARCHIT", "ORCHID")) {
                                                        int i12 = i + 2;
                                                        if (!contains(upperCase, i12, 1, "T", "S")) {
                                                            if ((!contains(upperCase, i - 1, 1, "A", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.ORDER_PREFIX_PAYMENT, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.UNITY, "E") && i != 0) || (!contains(upperCase, i12, 1, getHighSpeedVideoSizes) && i + 1 != upperCase.length() - 1)) {
                                                                if (i > 0) {
                                                                    if (contains(upperCase, 0, 2, "MC")) {
                                                                        doubleMetaphoneResult.append('K');
                                                                    } else {
                                                                        doubleMetaphoneResult.append('X', 'K');
                                                                    }
                                                                } else {
                                                                    doubleMetaphoneResult.append('X');
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                doubleMetaphoneResult.append('K');
                                            }
                                        }
                                        i3 = 0;
                                        if (!contains(upperCase, i3, 4, "VAN ", "VON ")) {
                                            if (!contains(upperCase, i - 2, 6, "ORCHES", "ARCHIT", "ORCHID")) {
                                            }
                                        }
                                        doubleMetaphoneResult.append('K');
                                    }
                                    i += 2;
                                    c = 'K';
                                    c3 = c;
                                }
                                doubleMetaphoneResult.append('K');
                                i += 2;
                                c = 'K';
                                c3 = c;
                                break;
                            case 'D':
                                if (contains(upperCase, i, 2, "DG")) {
                                    i6 = i + 2;
                                    if (contains(upperCase, i6, 1, com.visa.cbp.getEncExpo.warmup, "E", "Y")) {
                                        doubleMetaphoneResult.append('J');
                                        i += 3;
                                        c3 = 'K';
                                        break;
                                    } else {
                                        doubleMetaphoneResult.append("TK");
                                        i = i6;
                                        c3 = 'K';
                                    }
                                } else if (contains(upperCase, i, 2, "DT", "DD")) {
                                    doubleMetaphoneResult.append('T');
                                    i += 2;
                                    c3 = 'K';
                                } else {
                                    doubleMetaphoneResult.append('T');
                                    i++;
                                    c3 = 'K';
                                }
                            case 'F':
                                doubleMetaphoneResult.append('F');
                                i4 = i + 1;
                                break;
                            case 'G':
                                int i13 = i + 1;
                                if (charAt(upperCase, i13) != 'H') {
                                    if (charAt(upperCase, i13) != 'N') {
                                        if (contains(upperCase, i13, 2, "LI") && !z2) {
                                            doubleMetaphoneResult.append("KL", "L");
                                        } else if (i == 0 && (charAt(upperCase, i13) == 'Y' || contains(upperCase, i13, 2, getHighSpeedVideoFpsRangesFor))) {
                                            doubleMetaphoneResult.append('K', 'J');
                                        } else {
                                            if ((contains(upperCase, i13, 2, "ER") || charAt(upperCase, i13) == 'Y') && !contains(upperCase, 0, 6, "DANGER", "RANGER", "MANGER")) {
                                                int i14 = i - 1;
                                                if (!contains(upperCase, i14, 1, "E", com.visa.cbp.getEncExpo.warmup) && !contains(upperCase, i14, 3, "RGY", "OGY")) {
                                                    doubleMetaphoneResult.append('K', 'J');
                                                }
                                            }
                                            if (!contains(upperCase, i13, 1, "E", com.visa.cbp.getEncExpo.warmup, "Y")) {
                                                if (!contains(upperCase, i - 1, 4, "AGGI", "OGGI")) {
                                                    if (charAt(upperCase, i13) == 'G') {
                                                        i13 = i + 2;
                                                    }
                                                    doubleMetaphoneResult.append('K');
                                                    i = i13;
                                                    c3 = 'K';
                                                }
                                            }
                                            if (contains(upperCase, 0, 4, "VAN ", "VON ") || contains(upperCase, 0, 3, "SCH") || contains(upperCase, i13, 2, com.paypal.oslo.feature.pushnotification.shared.domain.CommsPayloadKeys.EVENT_TYPE)) {
                                                doubleMetaphoneResult.append('K');
                                            } else if (contains(upperCase, i13, 3, "IER")) {
                                                doubleMetaphoneResult.append('J');
                                            } else {
                                                doubleMetaphoneResult.append('J', 'K');
                                            }
                                        }
                                    } else if (i == 1 && "AEIOUY".indexOf(charAt(upperCase, 0)) != -1 && !z2) {
                                        doubleMetaphoneResult.append("KN", "N");
                                    } else {
                                        if (!contains(upperCase, i + 2, 2, "EY") && charAt(upperCase, i13) != 'Y' && !z2) {
                                            doubleMetaphoneResult.append("N", "KN");
                                        } else {
                                            doubleMetaphoneResult.append("KN");
                                        }
                                    }
                                    i += 2;
                                    c3 = 'K';
                                } else {
                                    if (i > 0 && "AEIOUY".indexOf(charAt(upperCase, i - 1)) == -1) {
                                        doubleMetaphoneResult.append('K');
                                    } else if (i == 0) {
                                        i += 2;
                                        if (charAt(upperCase, i) == 'I') {
                                            doubleMetaphoneResult.append('J');
                                        } else {
                                            doubleMetaphoneResult.append('K');
                                        }
                                    } else {
                                        if (i > 1) {
                                            break;
                                        }
                                        if (i > 2) {
                                            break;
                                        }
                                        if (i > 3) {
                                            break;
                                        }
                                        if (i > 2 && charAt(upperCase, i - 1) == 'U') {
                                            if (contains(upperCase, i - 3, 1, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "G", "L", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "T")) {
                                                doubleMetaphoneResult.append('F');
                                                i += 2;
                                            }
                                        }
                                        if (i > 0 && charAt(upperCase, i - 1) != 'I') {
                                            doubleMetaphoneResult.append('K');
                                        }
                                        i += 2;
                                    }
                                    c3 = 'K';
                                    break;
                                }
                                break;
                            case 'H':
                                if (i != 0) {
                                    i7 = -1;
                                    break;
                                } else {
                                    i7 = -1;
                                }
                                if ("AEIOUY".indexOf(charAt(upperCase, i + 1)) != i7) {
                                    doubleMetaphoneResult.append('H');
                                    i += 2;
                                    c3 = 'K';
                                    break;
                                }
                                i++;
                                c3 = 'K';
                            case 'J':
                                if (contains(upperCase, i, 4, "JOSE") || contains(upperCase, 0, 4, "SAN ")) {
                                    if ((i == 0 && charAt(upperCase, i + 4) == ' ') || upperCase.length() == 4 || contains(upperCase, 0, 4, "SAN ")) {
                                        doubleMetaphoneResult.append('H');
                                    } else {
                                        doubleMetaphoneResult.append('J', 'H');
                                    }
                                    i++;
                                    c3 = 'K';
                                    break;
                                } else {
                                    if (i == 0 && !contains(upperCase, i, 4, "JOSE")) {
                                        doubleMetaphoneResult.append('J', 'A');
                                    } else {
                                        int i15 = i - 1;
                                        if ("AEIOUY".indexOf(charAt(upperCase, i15)) != -1 && !z2) {
                                            int i16 = i + 1;
                                            if (charAt(upperCase, i16) == 'A' || charAt(upperCase, i16) == 'O') {
                                                doubleMetaphoneResult.append('J', 'H');
                                            }
                                        }
                                        if (i == upperCase.length() - 1) {
                                            doubleMetaphoneResult.append('J', ' ');
                                        } else if (!contains(upperCase, i + 1, 1, Camera2StreamConfigurationMap) && !contains(upperCase, i15, 1, "S", "K", "L")) {
                                            doubleMetaphoneResult.append('J');
                                        }
                                    }
                                    i6 = i + 1;
                                    break;
                                }
                                break;
                            case 'K':
                                doubleMetaphoneResult.append('K');
                                int i17 = i + 1;
                                if (charAt(upperCase, i17) == 'K') {
                                    c = 'K';
                                    i += 2;
                                    c3 = c;
                                    break;
                                } else {
                                    c = 'K';
                                    i = i17;
                                    c3 = c;
                                }
                            case 'L':
                                i8 = i + 1;
                                if (charAt(upperCase, i8) != 'L') {
                                    doubleMetaphoneResult.append(org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_RANDOM_LT);
                                    i = i8;
                                    c3 = 'K';
                                    break;
                                } else {
                                    if (i == upperCase.length() - 3) {
                                        break;
                                    }
                                    if (!contains(upperCase, upperCase.length() - 2, 2, "AS", "OS")) {
                                        break;
                                    }
                                    break;
                                }
                            case 'M':
                                doubleMetaphoneResult.append(io.ktor.util.date.GMTDateParser.MONTH);
                                int i18 = i + 1;
                                if (charAt(upperCase, i18) != 'M') {
                                    if (contains(upperCase, i - 1, 3, "UMB")) {
                                        if (i18 != upperCase.length() - 1) {
                                            break;
                                        }
                                    }
                                    c = 'K';
                                    break;
                                }
                                c = 'K';
                                i += 2;
                                c3 = c;
                                break;
                            case 'N':
                                doubleMetaphoneResult.append('N');
                                i4 = i + 1;
                                break;
                            case 'P':
                                i8 = i + 1;
                                if (charAt(upperCase, i8) == 'H') {
                                    doubleMetaphoneResult.append('F');
                                } else {
                                    doubleMetaphoneResult.append('P');
                                    break;
                                }
                                i += 2;
                                c3 = 'K';
                                break;
                            case 'Q':
                                doubleMetaphoneResult.append('K');
                                i5 = i + 1;
                                break;
                            case 'R':
                                if (i == upperCase.length() - 1 && !z2) {
                                    if (contains(upperCase, i - 2, 2, "IE")) {
                                        if (!contains(upperCase, i - 4, 2, "ME", "MA")) {
                                            c2 = org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_RANDOM_REGULAR;
                                            doubleMetaphoneResult.appendAlternate(org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_RANDOM_REGULAR);
                                            i6 = i + 1;
                                            break;
                                        }
                                    }
                                }
                                c2 = org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_RANDOM_REGULAR;
                                doubleMetaphoneResult.append(org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_RANDOM_REGULAR);
                                i6 = i + 1;
                            case 'S':
                                if (!contains(upperCase, i - 1, 3, "ISL", "YSL")) {
                                    if (i == 0 && contains(upperCase, i, 5, "SUGAR")) {
                                        doubleMetaphoneResult.append('X', 'S');
                                    } else {
                                        if (contains(upperCase, i, 2, "SH")) {
                                            if (contains(upperCase, i + 1, 4, "HEIM", "HOEK", "HOLM", "HOLZ")) {
                                                doubleMetaphoneResult.append('S');
                                            } else {
                                                doubleMetaphoneResult.append('X');
                                            }
                                        } else {
                                            if (!contains(upperCase, i, 3, "SIO", "SIA") && !contains(upperCase, i, 4, "SIAN")) {
                                                if (i == 0) {
                                                    break;
                                                }
                                                i8 = i + 1;
                                                if (!contains(upperCase, i8, 1, "Z")) {
                                                    if (!contains(upperCase, i, 2, "SC")) {
                                                        if (i == upperCase.length() - 1) {
                                                            if (contains(upperCase, i - 2, 2, "AI", "OI")) {
                                                                doubleMetaphoneResult.appendAlternate('S');
                                                                break;
                                                            }
                                                        }
                                                        doubleMetaphoneResult.append('S');
                                                    } else {
                                                        int i19 = i + 2;
                                                        if (charAt(upperCase, i19) == 'H') {
                                                            int i20 = i + 3;
                                                            if (contains(upperCase, i20, 2, "OO", "ER", "EN", "UY", "ED", "EM")) {
                                                                if (contains(upperCase, i20, 2, "ER", "EN")) {
                                                                    doubleMetaphoneResult.append(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.XAMARIN, "SK");
                                                                } else {
                                                                    doubleMetaphoneResult.append("SK");
                                                                }
                                                            } else if (i == 0 && "AEIOUY".indexOf(charAt(upperCase, 3)) == -1 && charAt(upperCase, 3) != 'W') {
                                                                doubleMetaphoneResult.append('X', 'S');
                                                            } else {
                                                                doubleMetaphoneResult.append('X');
                                                            }
                                                        } else if (contains(upperCase, i19, 1, com.visa.cbp.getEncExpo.warmup, "E", "Y")) {
                                                            doubleMetaphoneResult.append('S');
                                                        } else {
                                                            doubleMetaphoneResult.append("SK");
                                                        }
                                                    }
                                                }
                                                doubleMetaphoneResult.append('S', 'X');
                                                i8 = i + 1;
                                                break;
                                            } else if (z2) {
                                                doubleMetaphoneResult.append('S');
                                            } else {
                                                doubleMetaphoneResult.append('S', 'X');
                                            }
                                            i += 3;
                                            c3 = 'K';
                                            break;
                                        }
                                        i += 2;
                                        c3 = 'K';
                                    }
                                }
                                i++;
                                c3 = 'K';
                                break;
                            case 'T':
                                if (contains(upperCase, i, 4, "TION") || contains(upperCase, i, 3, "TIA", "TCH")) {
                                    doubleMetaphoneResult.append('X');
                                    i += 3;
                                    c3 = 'K';
                                    break;
                                } else if (contains(upperCase, i, 2, "TH") || contains(upperCase, i, 3, "TTH")) {
                                    i += 2;
                                    if (contains(upperCase, i, 2, "OM", "AM") || contains(upperCase, 0, 4, "VAN ", "VON ") || contains(upperCase, 0, 3, "SCH")) {
                                        doubleMetaphoneResult.append('T');
                                    } else {
                                        doubleMetaphoneResult.append(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 'T');
                                    }
                                    c3 = 'K';
                                } else {
                                    doubleMetaphoneResult.append('T');
                                    i8 = i + 1;
                                    break;
                                }
                                break;
                            case 'V':
                                doubleMetaphoneResult.append('F');
                                i5 = i + 1;
                                break;
                            case 'W':
                                if (contains(upperCase, i, 2, "WR")) {
                                    doubleMetaphoneResult.append(org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_RANDOM_REGULAR);
                                    i += 2;
                                    c3 = 'K';
                                    break;
                                } else {
                                    if (i == 0) {
                                        i8 = i + 1;
                                        if ("AEIOUY".indexOf(charAt(upperCase, i8)) != -1 || contains(upperCase, i, 2, "WH")) {
                                            if ("AEIOUY".indexOf(charAt(upperCase, i8)) != -1) {
                                                doubleMetaphoneResult.append('A', 'F');
                                            } else {
                                                doubleMetaphoneResult.append('A');
                                            }
                                            i = i8;
                                            c3 = 'K';
                                        }
                                    }
                                    if (i != upperCase.length() - 1 || "AEIOUY".indexOf(charAt(upperCase, i - 1)) == -1) {
                                        if (!contains(upperCase, i - 1, 5, "EWSKI", "EWSKY", "OWSKI", "OWSKY") && !contains(upperCase, 0, 3, "SCH")) {
                                            if (contains(upperCase, i, 4, "WICZ", "WITZ")) {
                                                doubleMetaphoneResult.append("TS", "FX");
                                                i += 4;
                                                c3 = 'K';
                                            }
                                            i++;
                                            c3 = 'K';
                                        }
                                    }
                                    doubleMetaphoneResult.appendAlternate('F');
                                    i++;
                                    c3 = 'K';
                                }
                                break;
                            case 'X':
                                if (i == 0) {
                                    doubleMetaphoneResult.append('S');
                                    i++;
                                    c3 = 'K';
                                    break;
                                } else {
                                    if (i == upperCase.length() - 1) {
                                        if (!contains(upperCase, i - 3, 3, "IAU", "EAU")) {
                                            break;
                                        }
                                        i8 = i + 1;
                                        break;
                                    }
                                    doubleMetaphoneResult.append("KS");
                                    i8 = i + 1;
                                }
                            case 'Z':
                                i6 = i + 1;
                                if (charAt(upperCase, i6) == 'H') {
                                    doubleMetaphoneResult.append('J');
                                } else {
                                    if (contains(upperCase, i6, 2, "ZO", "ZI", "ZA") || (z2 && i > 0 && charAt(upperCase, i - 1) != 'T')) {
                                        doubleMetaphoneResult.append("S", "TS");
                                    } else {
                                        doubleMetaphoneResult.append('S');
                                    }
                                    break;
                                }
                                i += 2;
                                c3 = 'K';
                                break;
                            default:
                                c = 'K';
                                break;
                        }
                    } else {
                        c = c3;
                        doubleMetaphoneResult.append('N');
                    }
                    i++;
                    c3 = c;
                }
                return z ? doubleMetaphoneResult.getAlternate() : doubleMetaphoneResult.getPrimary();
            }
        }
        upperCase = null;
        if (upperCase != null) {
        }
    }
}
