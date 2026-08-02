package codec.language;

/* loaded from: classes7.dex */
public class DoubleMetaphone implements codec.StringEncoder {
    public static final java.lang.String[] b = {"GN", "KN", "PN", "WR", "PS"};
    public static final java.lang.String[] c = {"L", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "N", "M", "B", "H", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "V", "W", " "};
    public static final java.lang.String[] d = {"ES", "EP", "EB", "EL", "EY", "IB", "IL", "IN", "IE", "EI", "ER"};
    public static final java.lang.String[] e = {"L", "T", "K", "S", "N", "M", "B", "Z"};

    /* renamed from: a, reason: collision with root package name */
    public int f2782a = 4;

    public static boolean contains(java.lang.String str, int i, int i2, java.lang.String... strArr) {
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

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
    
        if (r11 != 'E') goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        if (contains(r17, r10, 6, "BACHER", "MACHER") != false) goto L120;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(java.lang.String str, codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult, int i) {
        if (!contains(str, i, 4, "CHIA")) {
            if (i > 1) {
                int i2 = i - 2;
                if (!a(charAt(str, i2))) {
                    if (contains(str, i - 1, 3, "ACH")) {
                        char charAt = charAt(str, i + 2);
                        if (charAt != 'I') {
                        }
                    }
                }
            }
            if (i == 0 && contains(str, i, 6, "CAESAR")) {
                doubleMetaphoneResult.append('S');
                return i + 2;
            }
            if (contains(str, i, 2, "CH")) {
                if (i > 0 && contains(str, i, 4, "CHAE")) {
                    doubleMetaphoneResult.append('K', 'X');
                    return i + 2;
                }
                if (i == 0) {
                    int i3 = i + 1;
                    if ((contains(str, i3, 5, "HARAC", "HARIS") || contains(str, i3, 3, "HOR", "HYM", "HIA", "HEM")) && !contains(str, 0, 5, "CHORE")) {
                        doubleMetaphoneResult.append('K');
                        return i + 2;
                    }
                }
                if (!contains(str, 0, 4, "VAN ", "VON ") && !contains(str, 0, 3, "SCH")) {
                    if (!contains(str, i - 2, 6, "ORCHES", "ARCHIT", "ORCHID")) {
                        int i4 = i + 2;
                        if (!contains(str, i4, 1, "T", "S")) {
                            if ((!contains(str, i - 1, 1, "A", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.ORDER_PREFIX_PAYMENT, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.UNITY, "E") && i != 0) || (!contains(str, i4, 1, c) && i + 1 != str.length() - 1)) {
                                if (i <= 0) {
                                    doubleMetaphoneResult.append('X');
                                    return i4;
                                }
                                if (contains(str, 0, 2, "MC")) {
                                    doubleMetaphoneResult.append('K');
                                    return i4;
                                }
                                doubleMetaphoneResult.append('X', 'K');
                                return i4;
                            }
                        }
                    }
                }
                doubleMetaphoneResult.append('K');
                return i + 2;
            }
            if (contains(str, i, 2, "CZ")) {
                if (!contains(str, i - 2, 4, "WICZ")) {
                    doubleMetaphoneResult.append('S', 'X');
                    return i + 2;
                }
            }
            int i5 = i + 1;
            if (contains(str, i5, 3, "CIA")) {
                doubleMetaphoneResult.append('X');
                return i + 3;
            }
            if (!contains(str, i, 2, "CC") || (i == 1 && charAt(str, 0) == 'M')) {
                if (contains(str, i, 2, "CK", "CG", "CQ")) {
                    doubleMetaphoneResult.append('K');
                    return i + 2;
                }
                if (!contains(str, i, 2, "CI", "CE", "CY")) {
                    doubleMetaphoneResult.append('K');
                    return contains(str, i5, 2, " C", " Q", " G") ? i + 3 : (!contains(str, i5, 1, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "K", com.visa.cbp.getEncExpo.updateVisuals) || contains(str, i5, 2, "CE", "CI")) ? i5 : i + 2;
                }
                if (contains(str, i, 3, "CIO", "CIE", "CIA")) {
                    doubleMetaphoneResult.append('S', 'X');
                } else {
                    doubleMetaphoneResult.append('S');
                }
                return i + 2;
            }
            int i6 = i + 2;
            if (!contains(str, i6, 1, com.visa.cbp.getEncExpo.warmup, "E", "H") || contains(str, i6, 2, "HU")) {
                doubleMetaphoneResult.append('K');
                return i6;
            }
            if (i != 1 || charAt(str, i - 1) != 'A') {
                if (!contains(str, i - 1, 5, "UCCEE", "UCCES")) {
                    doubleMetaphoneResult.append('X');
                    return i + 3;
                }
            }
            doubleMetaphoneResult.append("KS");
            return i + 3;
        }
        doubleMetaphoneResult.append('K');
        return i + 2;
    }

    public char charAt(java.lang.String str, int i) {
        if (i < 0 || i >= str.length()) {
            return (char) 0;
        }
        return str.charAt(i);
    }

    public java.lang.String doubleMetaphone(java.lang.String str) {
        return doubleMetaphone(str, false);
    }

    @Override // codec.Encoder
    public java.lang.Object encode(java.lang.Object obj) throws codec.EncoderException {
        if (obj instanceof java.lang.String) {
            return doubleMetaphone((java.lang.String) obj);
        }
        throw new codec.EncoderException("DoubleMetaphone encode parameter is not of type String");
    }

    public int getMaxCodeLen() {
        return this.f2782a;
    }

    public boolean isDoubleMetaphoneEqual(java.lang.String str, java.lang.String str2) {
        return isDoubleMetaphoneEqual(str, str2, false);
    }

    public void setMaxCodeLen(int i) {
        this.f2782a = i;
    }

    public class DoubleMetaphoneResult {

        /* renamed from: a, reason: collision with root package name */
        public final java.lang.StringBuilder f2783a;
        public final java.lang.StringBuilder b;
        public final int c;

        public DoubleMetaphoneResult(codec.language.DoubleMetaphone doubleMetaphone, int i) {
            this.f2783a = new java.lang.StringBuilder(doubleMetaphone.getMaxCodeLen());
            this.b = new java.lang.StringBuilder(doubleMetaphone.getMaxCodeLen());
            this.c = i;
        }

        public void append(char c) {
            appendPrimary(c);
            appendAlternate(c);
        }

        public void appendAlternate(char c) {
            if (this.b.length() < this.c) {
                this.b.append(c);
            }
        }

        public void appendPrimary(char c) {
            if (this.f2783a.length() < this.c) {
                this.f2783a.append(c);
            }
        }

        public java.lang.String getAlternate() {
            return this.b.toString();
        }

        public java.lang.String getPrimary() {
            return this.f2783a.toString();
        }

        public boolean isComplete() {
            return this.f2783a.length() >= this.c && this.b.length() >= this.c;
        }

        public void append(char c, char c2) {
            appendPrimary(c);
            appendAlternate(c2);
        }

        public void appendAlternate(java.lang.String str) {
            int length = this.c - this.b.length();
            if (str.length() <= length) {
                this.b.append(str);
            } else {
                this.b.append(str.substring(0, length));
            }
        }

        public void appendPrimary(java.lang.String str) {
            int length = this.c - this.f2783a.length();
            if (str.length() <= length) {
                this.f2783a.append(str);
            } else {
                this.f2783a.append(str.substring(0, length));
            }
        }

        public void append(java.lang.String str) {
            appendPrimary(str);
            appendAlternate(str);
        }

        public void append(java.lang.String str, java.lang.String str2) {
            appendPrimary(str);
            appendAlternate(str2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x01c9, code lost:
    
        if (charAt(r1, r3) == 'V') goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01cc, code lost:
    
        r9 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02f1, code lost:
    
        if (contains(r1, r6 + 1, 1, "M", "N", "L", "W") == false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0314, code lost:
    
        if (contains(r1, r4, r14, "Z") != false) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0420, code lost:
    
        if (charAt(r1, r4) != r3) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x046a, code lost:
    
        r3 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0432, code lost:
    
        if (charAt(r1, r3) == 'Q') goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0456, code lost:
    
        if (contains(r1, r4, 1, "P", "B") != false) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0466, code lost:
    
        if (charAt(r1, r4) == 'N') goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x04a0, code lost:
    
        if (contains(r1, r6 + 2, 2, "ER") != false) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x04c8, code lost:
    
        if (contains(r1, r6 - 1, 4, "ILLO", "ILLA", "ALLE") == false) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0500, code lost:
    
        r7.appendPrimary(org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_RANDOM_LT);
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x04ef, code lost:
    
        if (contains(r1, r1.length() - 1, 1, "A", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.ORDER_PREFIX_PAYMENT) != false) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0505, code lost:
    
        r7.append(org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_RANDOM_LT);
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x04fe, code lost:
    
        if (contains(r1, r6 - 1, 4, "ALLE") != false) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x05a9, code lost:
    
        if (charAt(r1, r3) == 'J') goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0645, code lost:
    
        if (contains(r1, r6 - 2, 1, "B", "H", "D") == false) goto L306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x0657, code lost:
    
        if (contains(r1, r6 - 3, 1, "B", "H", "D") == false) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0668, code lost:
    
        if (contains(r1, r6 - 4, 1, "B", "H") == false) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x0856, code lost:
    
        if (charAt(r1, r4) == 'B') goto L405;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x022b, code lost:
    
        if (contains(r1, r3, 1, "T", "D") != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ca, code lost:
    
        if (charAt(r1, r4) == 'Z') goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0115, code lost:
    
        r9 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0318, code lost:
    
        r6 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00fd, code lost:
    
        if (contains(r1, r6 - 2, 2, "AU", "OU") == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0113, code lost:
    
        if (contains(r1, r4, 1, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.XAMARIN) != false) goto L105;
     */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String doubleMetaphone(java.lang.String str, boolean z) {
        java.lang.String str2;
        char c2;
        int i;
        char c3;
        int i2;
        char c4;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        char c5;
        int i8;
        int i9;
        if (str != null) {
            java.lang.String trim = str.trim();
            if (trim.length() != 0) {
                str2 = trim.toUpperCase(java.util.Locale.ENGLISH);
                if (str2 != null) {
                    return null;
                }
                char c6 = 'K';
                int i10 = 1;
                boolean z2 = str2.indexOf(87) >= 0 || str2.indexOf(75) >= 0 || str2.indexOf("CZ") >= 0 || str2.indexOf("WITZ") >= 0;
                java.lang.String[] strArr = b;
                int i11 = 0;
                while (true) {
                    c2 = 5;
                    if (i11 >= 5) {
                        i = 0;
                        break;
                    }
                    if (str2.startsWith(strArr[i11])) {
                        i = 1;
                        break;
                    }
                    i11++;
                }
                codec.language.DoubleMetaphone.DoubleMetaphoneResult doubleMetaphoneResult = new codec.language.DoubleMetaphone.DoubleMetaphoneResult(this, getMaxCodeLen());
                while (!doubleMetaphoneResult.isComplete() && i <= str2.length() - i10) {
                    char charAt = str2.charAt(i);
                    if (charAt == 199) {
                        c3 = c6;
                        i2 = i10;
                        c4 = c2;
                        doubleMetaphoneResult.append('S');
                    } else if (charAt != 209) {
                        i3 = 2;
                        switch (charAt) {
                            case 'A':
                            case 'E':
                            case 'I':
                            case 'O':
                            case 'U':
                            case 'Y':
                                c3 = 'K';
                                c4 = 5;
                                i2 = 1;
                                if (i == 0) {
                                    doubleMetaphoneResult.append('A');
                                    break;
                                }
                                break;
                            case 'B':
                                c3 = 'K';
                                c4 = 5;
                                i2 = 1;
                                doubleMetaphoneResult.append('P');
                                i5 = i + 1;
                                break;
                            case 'C':
                                c3 = 'K';
                                c4 = 5;
                                i2 = 1;
                                i5 = a(str2, doubleMetaphoneResult, i);
                                i = i5;
                                c6 = c3;
                                c2 = c4;
                                i10 = i2;
                                break;
                            case 'D':
                                c3 = 'K';
                                c4 = 5;
                                i6 = 3;
                                if (!contains(str2, i, 2, "DG")) {
                                    i2 = 1;
                                    if (!contains(str2, i, 2, "DT", "DD")) {
                                        doubleMetaphoneResult.append('T');
                                        break;
                                    } else {
                                        doubleMetaphoneResult.append('T');
                                        i += i3;
                                        c6 = c3;
                                        c2 = c4;
                                        i10 = i2;
                                    }
                                } else {
                                    int i12 = i + 2;
                                    i2 = 1;
                                    if (contains(str2, i12, 1, com.visa.cbp.getEncExpo.warmup, "E", "Y")) {
                                        doubleMetaphoneResult.append('J');
                                        i3 = i6;
                                        i += i3;
                                        c6 = c3;
                                        c2 = c4;
                                        i10 = i2;
                                        break;
                                    } else {
                                        doubleMetaphoneResult.append("TK");
                                        i = i12;
                                        c6 = c3;
                                        c2 = c4;
                                        i10 = i2;
                                    }
                                }
                            case 'F':
                                c3 = 'K';
                                c4 = 5;
                                doubleMetaphoneResult.append('F');
                                int i13 = i + 1;
                                if (charAt(str2, i13) != 'F') {
                                    i = i13;
                                    i2 = 1;
                                    c6 = c3;
                                    c2 = c4;
                                    i10 = i2;
                                    break;
                                }
                                i2 = 1;
                                i += i3;
                                c6 = c3;
                                c2 = c4;
                                i10 = i2;
                            case 'G':
                                c4 = 5;
                                int i14 = i + 1;
                                if (charAt(str2, i14) == 'H') {
                                    if (i > 0 && !a(charAt(str2, i - 1))) {
                                        doubleMetaphoneResult.append('K');
                                    } else if (i != 0) {
                                        if (i > 1) {
                                            break;
                                        }
                                        if (i > 2) {
                                            break;
                                        }
                                        if (i > 3) {
                                            break;
                                        }
                                        if (i > 2 && charAt(str2, i - 1) == 'U') {
                                            if (contains(str2, i - 3, 1, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "G", "L", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "T")) {
                                                doubleMetaphoneResult.append('F');
                                            }
                                        }
                                        if (i > 0 && charAt(str2, i - 1) != 'I') {
                                            c3 = 'K';
                                            doubleMetaphoneResult.append('K');
                                            i2 = 1;
                                            i += i3;
                                            c6 = c3;
                                            c2 = c4;
                                            i10 = i2;
                                            break;
                                        }
                                    } else {
                                        i += 2;
                                        if (charAt(str2, i) == 'I') {
                                            doubleMetaphoneResult.append('J');
                                        } else {
                                            doubleMetaphoneResult.append('K');
                                        }
                                        c2 = 5;
                                        c6 = 'K';
                                        i10 = 1;
                                        break;
                                    }
                                    c3 = 'K';
                                    i2 = 1;
                                    i += i3;
                                    c6 = c3;
                                    c2 = c4;
                                    i10 = i2;
                                } else {
                                    if (charAt(str2, i14) == 'N') {
                                        if (i == 1 && a(charAt(str2, 0)) && !z2) {
                                            doubleMetaphoneResult.append("KN", "N");
                                        } else {
                                            if (contains(str2, i + 2, 2, "EY") || charAt(str2, i14) == 'Y' || z2) {
                                                doubleMetaphoneResult.append("KN");
                                            } else {
                                                doubleMetaphoneResult.append("N", "KN");
                                            }
                                        }
                                    } else if (contains(str2, i14, 2, "LI") && !z2) {
                                        doubleMetaphoneResult.append("KL", "L");
                                    } else if (i == 0 && (charAt(str2, i14) == 'Y' || contains(str2, i14, 2, d))) {
                                        doubleMetaphoneResult.append('K', 'J');
                                    } else {
                                        if ((contains(str2, i14, 2, "ER") || charAt(str2, i14) == 'Y') && !contains(str2, 0, 6, "DANGER", "RANGER", "MANGER")) {
                                            int i15 = i - 1;
                                            if (!contains(str2, i15, 1, "E", com.visa.cbp.getEncExpo.warmup) && !contains(str2, i15, 3, "RGY", "OGY")) {
                                                c3 = 'K';
                                                doubleMetaphoneResult.append('K', 'J');
                                                i2 = 1;
                                                i += i3;
                                                c6 = c3;
                                                c2 = c4;
                                                i10 = i2;
                                            }
                                        }
                                        if (!contains(str2, i14, 1, "E", com.visa.cbp.getEncExpo.warmup, "Y")) {
                                            if (!contains(str2, i - 1, 4, "AGGI", "OGGI")) {
                                                if (charAt(str2, i14) == 'G') {
                                                    i += 2;
                                                    c3 = 'K';
                                                    doubleMetaphoneResult.append('K');
                                                } else {
                                                    c3 = 'K';
                                                    doubleMetaphoneResult.append('K');
                                                    i = i14;
                                                }
                                                i2 = 1;
                                                c6 = c3;
                                                c2 = c4;
                                                i10 = i2;
                                            }
                                        }
                                        if (contains(str2, 0, 4, "VAN ", "VON ") || contains(str2, 0, 3, "SCH") || contains(str2, i14, 2, com.paypal.oslo.feature.pushnotification.shared.domain.CommsPayloadKeys.EVENT_TYPE)) {
                                            c3 = 'K';
                                            doubleMetaphoneResult.append('K');
                                        } else if (contains(str2, i14, 3, "IER")) {
                                            doubleMetaphoneResult.append('J');
                                            c3 = 'K';
                                        } else {
                                            c3 = 'K';
                                            doubleMetaphoneResult.append('J', 'K');
                                        }
                                        i2 = 1;
                                        i += i3;
                                        c6 = c3;
                                        c2 = c4;
                                        i10 = i2;
                                    }
                                    c3 = 'K';
                                    i2 = 1;
                                    i += i3;
                                    c6 = c3;
                                    c2 = c4;
                                    i10 = i2;
                                }
                                break;
                            case 'H':
                                c4 = 5;
                                if ((i == 0 || a(charAt(str2, i - 1))) && a(charAt(str2, i + 1))) {
                                    doubleMetaphoneResult.append('H');
                                    c3 = 'K';
                                    i2 = 1;
                                    i += i3;
                                    c6 = c3;
                                    c2 = c4;
                                    i10 = i2;
                                    break;
                                }
                                c3 = 'K';
                                i2 = 1;
                                break;
                            case 'J':
                                c4 = 5;
                                if (!contains(str2, i, 4, "JOSE") && !contains(str2, 0, 4, "SAN ")) {
                                    if (i != 0 || contains(str2, i, 4, "JOSE")) {
                                        int i16 = i - 1;
                                        if (a(charAt(str2, i16)) && !z2) {
                                            int i17 = i + 1;
                                            if (charAt(str2, i17) == 'A' || charAt(str2, i17) == 'O') {
                                                doubleMetaphoneResult.append('J', 'H');
                                            }
                                        }
                                        if (i == str2.length() - 1) {
                                            doubleMetaphoneResult.append('J', ' ');
                                        } else if (!contains(str2, i + 1, 1, e) && !contains(str2, i16, 1, "S", "K", "L")) {
                                            doubleMetaphoneResult.append('J');
                                        }
                                    } else {
                                        doubleMetaphoneResult.append('J', 'A');
                                    }
                                    i4 = i + 1;
                                    break;
                                } else {
                                    if ((i == 0 && charAt(str2, i + 4) == ' ') || str2.length() == 4 || contains(str2, 0, 4, "SAN ")) {
                                        doubleMetaphoneResult.append('H');
                                    } else {
                                        doubleMetaphoneResult.append('J', 'H');
                                    }
                                    c3 = 'K';
                                    i2 = 1;
                                    break;
                                }
                                break;
                            case 'K':
                                c3 = 'K';
                                c4 = 5;
                                doubleMetaphoneResult.append('K');
                                int i18 = i + 1;
                                if (charAt(str2, i18) != 'K') {
                                    i = i18;
                                    i2 = 1;
                                    c6 = c3;
                                    c2 = c4;
                                    i10 = i2;
                                    break;
                                } else {
                                    i2 = 1;
                                    i += i3;
                                    c6 = c3;
                                    c2 = c4;
                                    i10 = i2;
                                }
                            case 'L':
                                c4 = 5;
                                i4 = i + 1;
                                if (charAt(str2, i4) != 'L') {
                                    doubleMetaphoneResult.append(org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_RANDOM_LT);
                                    i = i4;
                                    c3 = 'K';
                                    i2 = 1;
                                    c6 = c3;
                                    c2 = c4;
                                    i10 = i2;
                                    break;
                                } else {
                                    if (i == str2.length() - 3) {
                                        break;
                                    }
                                    if (!contains(str2, str2.length() - 2, 2, "AS", "OS")) {
                                        break;
                                    }
                                    break;
                                }
                            case 'M':
                                c4 = 5;
                                doubleMetaphoneResult.append(io.ktor.util.date.GMTDateParser.MONTH);
                                i4 = i + 1;
                                if (charAt(str2, i4) != 'M') {
                                    if (contains(str2, i - 1, 3, "UMB")) {
                                        if (i4 != str2.length() - 1) {
                                            break;
                                        }
                                    }
                                    i = i4;
                                    c3 = 'K';
                                    i2 = 1;
                                    c6 = c3;
                                    c2 = c4;
                                    i10 = i2;
                                    break;
                                }
                                c3 = 'K';
                                i2 = 1;
                                i += i3;
                                c6 = c3;
                                c2 = c4;
                                i10 = i2;
                            case 'N':
                                c4 = 5;
                                doubleMetaphoneResult.append('N');
                                i7 = i + 1;
                                break;
                            case 'P':
                                c4 = 5;
                                i7 = i + 1;
                                if (charAt(str2, i7) != 'H') {
                                    doubleMetaphoneResult.append('P');
                                    break;
                                } else {
                                    doubleMetaphoneResult.append('F');
                                }
                                c3 = 'K';
                                i2 = 1;
                                i += i3;
                                c6 = c3;
                                c2 = c4;
                                i10 = i2;
                                break;
                            case 'Q':
                                c4 = 5;
                                doubleMetaphoneResult.append('K');
                                i4 = i + 1;
                                break;
                            case 'R':
                                c4 = 5;
                                if (i == str2.length() - 1 && !z2) {
                                    if (contains(str2, i - 2, 2, "IE")) {
                                        if (!contains(str2, i - 4, 2, "ME", "MA")) {
                                            c5 = org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_RANDOM_REGULAR;
                                            doubleMetaphoneResult.appendAlternate(org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_RANDOM_REGULAR);
                                            i7 = i + 1;
                                            break;
                                        }
                                    }
                                }
                                c5 = org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_RANDOM_REGULAR;
                                doubleMetaphoneResult.append(org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_RANDOM_REGULAR);
                                i7 = i + 1;
                            case 'S':
                                if (!contains(str2, i - 1, 3, "ISL", "YSL")) {
                                    if (i == 0) {
                                        c4 = 5;
                                        if (contains(str2, i, 5, "SUGAR")) {
                                            doubleMetaphoneResult.append('X', 'S');
                                            c3 = 'K';
                                            i3 = 1;
                                            i2 = 1;
                                            i += i3;
                                            c6 = c3;
                                            c2 = c4;
                                            i10 = i2;
                                            break;
                                        }
                                    } else {
                                        c4 = 5;
                                    }
                                    if (contains(str2, i, 2, "SH")) {
                                        if (contains(str2, i + 1, 4, "HEIM", "HOEK", "HOLM", "HOLZ")) {
                                            doubleMetaphoneResult.append('S');
                                        } else {
                                            doubleMetaphoneResult.append('X');
                                        }
                                    } else {
                                        if (!contains(str2, i, 3, "SIO", "SIA") && !contains(str2, i, 4, "SIAN")) {
                                            if (i == 0) {
                                                i8 = 1;
                                                break;
                                            } else {
                                                i8 = 1;
                                            }
                                            int i19 = i + 1;
                                            if (!contains(str2, i19, i8, "Z")) {
                                                if (contains(str2, i, 2, "SC")) {
                                                    int i20 = i + 2;
                                                    if (charAt(str2, i20) == 'H') {
                                                        int i21 = i + 3;
                                                        if (contains(str2, i21, 2, "OO", "ER", "EN", "UY", "ED", "EM")) {
                                                            if (contains(str2, i21, 2, "ER", "EN")) {
                                                                doubleMetaphoneResult.append(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.XAMARIN, "SK");
                                                            } else {
                                                                doubleMetaphoneResult.append("SK");
                                                            }
                                                        } else if (i != 0 || a(charAt(str2, 3)) || charAt(str2, 3) == 'W') {
                                                            doubleMetaphoneResult.append('X');
                                                        } else {
                                                            doubleMetaphoneResult.append('X', 'S');
                                                        }
                                                    } else {
                                                        if (contains(str2, i20, 1, com.visa.cbp.getEncExpo.warmup, "E", "Y")) {
                                                            doubleMetaphoneResult.append('S');
                                                        } else {
                                                            doubleMetaphoneResult.append("SK");
                                                        }
                                                        i2 = 1;
                                                        c3 = 'K';
                                                        i6 = 3;
                                                        i3 = i6;
                                                        i += i3;
                                                        c6 = c3;
                                                        c2 = c4;
                                                        i10 = i2;
                                                    }
                                                } else {
                                                    if (i == str2.length() - 1) {
                                                        if (contains(str2, i - 2, 2, "AI", "OI")) {
                                                            doubleMetaphoneResult.appendAlternate('S');
                                                            if (!contains(str2, i19, 1, "S", "Z")) {
                                                                i4 = i19;
                                                                i = i4;
                                                                c3 = 'K';
                                                                i2 = 1;
                                                                c6 = c3;
                                                                c2 = c4;
                                                                i10 = i2;
                                                            }
                                                        }
                                                    }
                                                    doubleMetaphoneResult.append('S');
                                                    if (!contains(str2, i19, 1, "S", "Z")) {
                                                    }
                                                }
                                            }
                                            doubleMetaphoneResult.append('S', 'X');
                                            i9 = i + 1;
                                            break;
                                        } else if (z2) {
                                            doubleMetaphoneResult.append('S');
                                        } else {
                                            doubleMetaphoneResult.append('S', 'X');
                                        }
                                        c3 = 'K';
                                        i2 = 1;
                                        i6 = 3;
                                        i3 = i6;
                                        i += i3;
                                        c6 = c3;
                                        c2 = c4;
                                        i10 = i2;
                                    }
                                    c3 = 'K';
                                    i2 = 1;
                                    i += i3;
                                    c6 = c3;
                                    c2 = c4;
                                    i10 = i2;
                                }
                                c4 = 5;
                                c3 = 'K';
                                i2 = 1;
                                break;
                            case 'T':
                                if (contains(str2, i, 4, "TION")) {
                                    doubleMetaphoneResult.append('X');
                                    c3 = 'K';
                                    i3 = 3;
                                    c4 = 5;
                                    i2 = 1;
                                    i += i3;
                                    c6 = c3;
                                    c2 = c4;
                                    i10 = i2;
                                    break;
                                } else {
                                    if (!contains(str2, i, 3, "TIA", "TCH")) {
                                        if (!contains(str2, i, 2, "TH") && !contains(str2, i, 3, "TTH")) {
                                            doubleMetaphoneResult.append('T');
                                            i4 = i + 1;
                                            break;
                                        } else {
                                            i += 2;
                                            if (contains(str2, i, 2, "OM", "AM") || contains(str2, 0, 4, "VAN ", "VON ") || contains(str2, 0, 3, "SCH")) {
                                                doubleMetaphoneResult.append('T');
                                            } else {
                                                doubleMetaphoneResult.append(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 'T');
                                            }
                                            c6 = 'K';
                                            i10 = 1;
                                            c2 = 5;
                                            break;
                                        }
                                    } else {
                                        doubleMetaphoneResult.append('X');
                                        i3 = 3;
                                    }
                                    c3 = 'K';
                                    c4 = 5;
                                    i2 = 1;
                                    i += i3;
                                    c6 = c3;
                                    c2 = c4;
                                    i10 = i2;
                                }
                                break;
                            case 'V':
                                doubleMetaphoneResult.append('F');
                                i4 = i + 1;
                                break;
                            case 'W':
                                if (contains(str2, i, 2, "WR")) {
                                    doubleMetaphoneResult.append(org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_RANDOM_REGULAR);
                                    c3 = 'K';
                                    c4 = 5;
                                    i2 = 1;
                                    i += i3;
                                    c6 = c3;
                                    c2 = c4;
                                    i10 = i2;
                                    break;
                                } else {
                                    if (i == 0) {
                                        int i22 = i + 1;
                                        if (a(charAt(str2, i22)) || contains(str2, i, 2, "WH")) {
                                            if (a(charAt(str2, i22))) {
                                                doubleMetaphoneResult.append('A', 'F');
                                            } else {
                                                doubleMetaphoneResult.append('A');
                                            }
                                            i = i22;
                                            c3 = 'K';
                                            c4 = 5;
                                            i2 = 1;
                                            c6 = c3;
                                            c2 = c4;
                                            i10 = i2;
                                        }
                                    }
                                    if (i != str2.length() - 1 || !a(charAt(str2, i - 1))) {
                                        if (!contains(str2, i - 1, 5, "EWSKI", "EWSKY", "OWSKI", "OWSKY") && !contains(str2, 0, 3, "SCH")) {
                                            if (contains(str2, i, 4, "WICZ", "WITZ")) {
                                                doubleMetaphoneResult.append("TS", "FX");
                                                c3 = 'K';
                                                i3 = 4;
                                                c4 = 5;
                                                i2 = 1;
                                                i += i3;
                                                c6 = c3;
                                                c2 = c4;
                                                i10 = i2;
                                            }
                                            c4 = 5;
                                            c3 = 'K';
                                            i2 = 1;
                                            break;
                                        }
                                    }
                                    doubleMetaphoneResult.appendAlternate('F');
                                    c3 = 'K';
                                    i3 = 1;
                                    c4 = 5;
                                    i2 = 1;
                                    i += i3;
                                    c6 = c3;
                                    c2 = c4;
                                    i10 = i2;
                                }
                                break;
                            case 'X':
                                if (i == 0) {
                                    doubleMetaphoneResult.append('S');
                                    c4 = 5;
                                    c3 = 'K';
                                    i3 = 1;
                                    i2 = 1;
                                    i += i3;
                                    c6 = c3;
                                    c2 = c4;
                                    i10 = i2;
                                    break;
                                } else {
                                    if (i == str2.length() - 1) {
                                        if (!contains(str2, i - 3, 3, "IAU", "EAU")) {
                                            break;
                                        }
                                        i9 = i + 1;
                                        break;
                                    }
                                    doubleMetaphoneResult.append("KS");
                                    i9 = i + 1;
                                }
                            case 'Z':
                                i9 = i + 1;
                                if (charAt(str2, i9) != 'H') {
                                    if (contains(str2, i9, 2, "ZO", "ZI", "ZA") || (z2 && i > 0 && charAt(str2, i - 1) != 'T')) {
                                        doubleMetaphoneResult.append("S", "TS");
                                    } else {
                                        doubleMetaphoneResult.append('S');
                                    }
                                    break;
                                } else {
                                    doubleMetaphoneResult.append('J');
                                }
                                c3 = 'K';
                                c4 = 5;
                                i2 = 1;
                                i += i3;
                                c6 = c3;
                                c2 = c4;
                                i10 = i2;
                                break;
                            default:
                                c3 = 'K';
                                c4 = 5;
                                i2 = 1;
                                break;
                        }
                    } else {
                        c3 = c6;
                        i2 = i10;
                        c4 = c2;
                        doubleMetaphoneResult.append('N');
                    }
                    i3 = i2;
                    i += i3;
                    c6 = c3;
                    c2 = c4;
                    i10 = i2;
                }
                return z ? doubleMetaphoneResult.getAlternate() : doubleMetaphoneResult.getPrimary();
            }
        }
        str2 = null;
        if (str2 != null) {
        }
    }

    public boolean isDoubleMetaphoneEqual(java.lang.String str, java.lang.String str2, boolean z) {
        return codec.binary.StringUtils.equals(doubleMetaphone(str, z), doubleMetaphone(str2, z));
    }

    @Override // codec.StringEncoder
    public java.lang.String encode(java.lang.String str) {
        return doubleMetaphone(str);
    }

    public static boolean a(char c2) {
        return "AEIOUY".indexOf(c2) != -1;
    }
}
