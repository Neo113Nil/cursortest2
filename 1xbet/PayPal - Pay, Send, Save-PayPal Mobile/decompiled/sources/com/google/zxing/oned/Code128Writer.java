package com.google.zxing.oned;

/* loaded from: classes9.dex */
public final class Code128Writer extends com.google.zxing.oned.OneDimensionalCodeWriter {
    private static final int CODE_CODE_A = 101;
    private static final int CODE_CODE_B = 100;
    private static final int CODE_CODE_C = 99;
    private static final int CODE_FNC_1 = 102;
    private static final int CODE_FNC_2 = 97;
    private static final int CODE_FNC_3 = 96;
    private static final int CODE_FNC_4_A = 101;
    private static final int CODE_FNC_4_B = 100;
    private static final int CODE_START_A = 103;
    private static final int CODE_START_B = 104;
    private static final int CODE_START_C = 105;
    private static final int CODE_STOP = 106;
    private static final char ESCAPE_FNC_1 = 241;
    private static final char ESCAPE_FNC_2 = 242;
    private static final char ESCAPE_FNC_3 = 243;
    private static final char ESCAPE_FNC_4 = 244;

    enum CType {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    protected final java.util.Collection<com.google.zxing.BarcodeFormat> getSupportedWriteFormats() {
        return java.util.Collections.singleton(com.google.zxing.BarcodeFormat.CODE_128);
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public final boolean[] encode(java.lang.String str) {
        return encode(str, null);
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public final boolean[] encode(java.lang.String str, java.util.Map<com.google.zxing.EncodeHintType, ?> map) {
        return (map != null && map.containsKey(com.google.zxing.EncodeHintType.CODE128_COMPACT) && java.lang.Boolean.parseBoolean(map.get(com.google.zxing.EncodeHintType.CODE128_COMPACT).toString())) ? new com.google.zxing.oned.Code128Writer.MinimalEncoder().encode(str) : encodeFast(str, check(str, map));
    }

    private static int check(java.lang.String str, java.util.Map<com.google.zxing.EncodeHintType, ?> map) {
        int i = -1;
        if (map != null && map.containsKey(com.google.zxing.EncodeHintType.FORCE_CODE_SET)) {
            java.lang.String obj = map.get(com.google.zxing.EncodeHintType.FORCE_CODE_SET).toString();
            obj.hashCode();
            switch (obj.hashCode()) {
                case 65:
                    if (obj.equals("A")) {
                        i = 0;
                        break;
                    }
                    break;
                case 66:
                    if (obj.equals("B")) {
                        i = 1;
                        break;
                    }
                    break;
                case 67:
                    if (obj.equals(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA)) {
                        i = 2;
                        break;
                    }
                    break;
            }
            if (i == 0) {
                i = 101;
            } else if (i == 1) {
                i = 100;
            } else {
                if (i != 2) {
                    throw new java.lang.IllegalArgumentException("Unsupported code set hint: ".concat(java.lang.String.valueOf(obj)));
                }
                i = 99;
            }
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            switch (charAt) {
                case 241:
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE:
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE:
                case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE:
                    break;
                default:
                    if (charAt > 127) {
                        throw new java.lang.IllegalArgumentException("Bad character in input: ASCII value=".concat(java.lang.String.valueOf((int) charAt)));
                    }
                    break;
            }
            switch (i) {
                case 99:
                    if (charAt < '0' || ((charAt > '9' && charAt <= 127) || charAt == 242 || charAt == 243 || charAt == 244)) {
                        throw new java.lang.IllegalArgumentException("Bad character in input for forced code set C: ASCII value=".concat(java.lang.String.valueOf((int) charAt)));
                    }
                    break;
                    break;
                case 100:
                    if (charAt < ' ') {
                        throw new java.lang.IllegalArgumentException("Bad character in input for forced code set B: ASCII value=".concat(java.lang.String.valueOf((int) charAt)));
                    }
                    break;
                case 101:
                    if (charAt > '_' && charAt <= 127) {
                        throw new java.lang.IllegalArgumentException("Bad character in input for forced code set A: ASCII value=".concat(java.lang.String.valueOf((int) charAt)));
                    }
                    break;
            }
        }
        return i;
    }

    private static boolean[] encodeFast(java.lang.String str, int i) {
        int length = str.length();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1;
        while (i2 < length) {
            int chooseCode = i == -1 ? chooseCode(str, i2, i4) : i;
            int i6 = 100;
            if (chooseCode == i4) {
                switch (str.charAt(i2)) {
                    case 241:
                        i6 = 102;
                        break;
                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE:
                        i6 = 97;
                        break;
                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE:
                        i6 = 96;
                        break;
                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE:
                        if (i4 == 101) {
                            i6 = 101;
                            break;
                        }
                        break;
                    default:
                        if (i4 == 100) {
                            i6 = str.charAt(i2) - ' ';
                            break;
                        } else if (i4 == 101) {
                            char charAt = str.charAt(i2);
                            i6 = charAt - ' ';
                            if (i6 < 0) {
                                i6 = charAt + '@';
                                break;
                            }
                        } else {
                            int i7 = i2 + 1;
                            if (i7 == length) {
                                throw new java.lang.IllegalArgumentException("Bad number of characters for digit only encoding.");
                            }
                            i6 = java.lang.Integer.parseInt(str.substring(i2, i2 + 2));
                            i2 = i7;
                            break;
                        }
                        break;
                }
                i2++;
            } else {
                if (i4 == 0) {
                    i6 = chooseCode != 100 ? chooseCode != 101 ? 105 : 103 : 104;
                } else {
                    i6 = chooseCode;
                }
                i4 = chooseCode;
            }
            arrayList.add(com.google.zxing.oned.Code128Reader.CODE_PATTERNS[i6]);
            i3 += i6 * i5;
            if (i2 != 0) {
                i5++;
            }
        }
        return produceResult(arrayList, i3);
    }

    static boolean[] produceResult(java.util.Collection<int[]> collection, int i) {
        int i2 = i % 103;
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException("Unable to compute a valid input checksum");
        }
        collection.add(com.google.zxing.oned.Code128Reader.CODE_PATTERNS[i2]);
        collection.add(com.google.zxing.oned.Code128Reader.CODE_PATTERNS[106]);
        int i3 = 0;
        int i4 = 0;
        for (int[] iArr : collection) {
            for (int i5 : iArr) {
                i4 += i5;
            }
        }
        boolean[] zArr = new boolean[i4];
        java.util.Iterator<int[]> it = collection.iterator();
        while (it.hasNext()) {
            i3 += appendPattern(zArr, i3, it.next(), true);
        }
        return zArr;
    }

    private static com.google.zxing.oned.Code128Writer.CType findCType(java.lang.CharSequence charSequence, int i) {
        int length = charSequence.length();
        if (i >= length) {
            return com.google.zxing.oned.Code128Writer.CType.UNCODABLE;
        }
        char charAt = charSequence.charAt(i);
        if (charAt == 241) {
            return com.google.zxing.oned.Code128Writer.CType.FNC_1;
        }
        if (charAt < '0' || charAt > '9') {
            return com.google.zxing.oned.Code128Writer.CType.UNCODABLE;
        }
        int i2 = i + 1;
        if (i2 >= length) {
            return com.google.zxing.oned.Code128Writer.CType.ONE_DIGIT;
        }
        char charAt2 = charSequence.charAt(i2);
        if (charAt2 < '0' || charAt2 > '9') {
            return com.google.zxing.oned.Code128Writer.CType.ONE_DIGIT;
        }
        return com.google.zxing.oned.Code128Writer.CType.TWO_DIGITS;
    }

    private static int chooseCode(java.lang.CharSequence charSequence, int i, int i2) {
        com.google.zxing.oned.Code128Writer.CType findCType;
        com.google.zxing.oned.Code128Writer.CType findCType2;
        char charAt;
        com.google.zxing.oned.Code128Writer.CType findCType3 = findCType(charSequence, i);
        if (findCType3 == com.google.zxing.oned.Code128Writer.CType.ONE_DIGIT) {
            return i2 == 101 ? 101 : 100;
        }
        if (findCType3 == com.google.zxing.oned.Code128Writer.CType.UNCODABLE) {
            return (i >= charSequence.length() || ((charAt = charSequence.charAt(i)) >= ' ' && (i2 != 101 || (charAt >= '`' && (charAt < 241 || charAt > 244))))) ? 100 : 101;
        }
        if (i2 == 101 && findCType3 == com.google.zxing.oned.Code128Writer.CType.FNC_1) {
            return 101;
        }
        if (i2 == 99) {
            return 99;
        }
        if (i2 == 100) {
            if (findCType3 == com.google.zxing.oned.Code128Writer.CType.FNC_1 || (findCType = findCType(charSequence, i + 2)) == com.google.zxing.oned.Code128Writer.CType.UNCODABLE || findCType == com.google.zxing.oned.Code128Writer.CType.ONE_DIGIT) {
                return 100;
            }
            if (findCType == com.google.zxing.oned.Code128Writer.CType.FNC_1) {
                return findCType(charSequence, i + 3) == com.google.zxing.oned.Code128Writer.CType.TWO_DIGITS ? 99 : 100;
            }
            int i3 = i + 4;
            while (true) {
                findCType2 = findCType(charSequence, i3);
                if (findCType2 != com.google.zxing.oned.Code128Writer.CType.TWO_DIGITS) {
                    break;
                }
                i3 += 2;
            }
            return findCType2 == com.google.zxing.oned.Code128Writer.CType.ONE_DIGIT ? 100 : 99;
        }
        if (findCType3 == com.google.zxing.oned.Code128Writer.CType.FNC_1) {
            findCType3 = findCType(charSequence, i + 1);
        }
        return findCType3 == com.google.zxing.oned.Code128Writer.CType.TWO_DIGITS ? 99 : 100;
    }

    static final class MinimalEncoder {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        static final java.lang.String A = " !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001fÿ";
        static final java.lang.String B = " !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u007fÿ";
        private static final int CODE_SHIFT = 98;
        private int[][] memoizedCost;
        private com.google.zxing.oned.Code128Writer.MinimalEncoder.Latch[][] minPath;

        enum Charset {
            A,
            B,
            C,
            NONE
        }

        enum Latch {
            A,
            B,
            C,
            SHIFT,
            NONE
        }

        private static boolean isDigit(char c) {
            return c >= '0' && c <= '9';
        }

        private MinimalEncoder() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean[] encode(java.lang.String str) {
            this.memoizedCost = (int[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Integer.TYPE, 4, str.length());
            this.minPath = (com.google.zxing.oned.Code128Writer.MinimalEncoder.Latch[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) com.google.zxing.oned.Code128Writer.MinimalEncoder.Latch.class, 4, str.length());
            encode(str, com.google.zxing.oned.Code128Writer.MinimalEncoder.Charset.NONE, 0);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int[] iArr = {0};
            int[] iArr2 = {1};
            int length = str.length();
            com.google.zxing.oned.Code128Writer.MinimalEncoder.Charset charset = com.google.zxing.oned.Code128Writer.MinimalEncoder.Charset.NONE;
            int i = 0;
            while (i < length) {
                com.google.zxing.oned.Code128Writer.MinimalEncoder.Latch latch = this.minPath[charset.ordinal()][i];
                int ordinal = latch.ordinal();
                int i2 = 101;
                if (ordinal == 0) {
                    charset = com.google.zxing.oned.Code128Writer.MinimalEncoder.Charset.A;
                    addPattern(arrayList, i == 0 ? 103 : 101, iArr, iArr2, i);
                } else if (ordinal == 1) {
                    charset = com.google.zxing.oned.Code128Writer.MinimalEncoder.Charset.B;
                    addPattern(arrayList, i == 0 ? 104 : 100, iArr, iArr2, i);
                } else if (ordinal == 2) {
                    charset = com.google.zxing.oned.Code128Writer.MinimalEncoder.Charset.C;
                    addPattern(arrayList, i == 0 ? 105 : 99, iArr, iArr2, i);
                } else if (ordinal == 3) {
                    addPattern(arrayList, 98, iArr, iArr2, i);
                }
                if (charset == com.google.zxing.oned.Code128Writer.MinimalEncoder.Charset.C) {
                    if (str.charAt(i) == 241) {
                        addPattern(arrayList, 102, iArr, iArr2, i);
                    } else {
                        addPattern(arrayList, java.lang.Integer.parseInt(str.substring(i, i + 2)), iArr, iArr2, i);
                        int i3 = i + 1;
                        if (i3 < length) {
                            i = i3;
                        }
                    }
                } else {
                    switch (str.charAt(i)) {
                        case 241:
                            i2 = 102;
                            break;
                        case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE:
                            i2 = 97;
                            break;
                        case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE:
                            i2 = 96;
                            break;
                        case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE:
                            if ((charset != com.google.zxing.oned.Code128Writer.MinimalEncoder.Charset.A || latch == com.google.zxing.oned.Code128Writer.MinimalEncoder.Latch.SHIFT) && (charset != com.google.zxing.oned.Code128Writer.MinimalEncoder.Charset.B || latch != com.google.zxing.oned.Code128Writer.MinimalEncoder.Latch.SHIFT)) {
                                i2 = 100;
                                break;
                            }
                            break;
                        default:
                            i2 = str.charAt(i) - ' ';
                            break;
                    }
                    if (((charset == com.google.zxing.oned.Code128Writer.MinimalEncoder.Charset.A && latch != com.google.zxing.oned.Code128Writer.MinimalEncoder.Latch.SHIFT) || (charset == com.google.zxing.oned.Code128Writer.MinimalEncoder.Charset.B && latch == com.google.zxing.oned.Code128Writer.MinimalEncoder.Latch.SHIFT)) && i2 < 0) {
                        i2 += 96;
                    }
                    addPattern(arrayList, i2, iArr, iArr2, i);
                }
                i++;
            }
            this.memoizedCost = null;
            this.minPath = null;
            return com.google.zxing.oned.Code128Writer.produceResult(arrayList, iArr[0]);
        }

        private static void addPattern(java.util.Collection<int[]> collection, int i, int[] iArr, int[] iArr2, int i2) {
            collection.add(com.google.zxing.oned.Code128Reader.CODE_PATTERNS[i]);
            if (i2 != 0) {
                iArr2[0] = iArr2[0] + 1;
            }
            iArr[0] = iArr[0] + (i * iArr2[0]);
        }

        private boolean canEncode(java.lang.CharSequence charSequence, com.google.zxing.oned.Code128Writer.MinimalEncoder.Charset charset, int i) {
            int i2;
            char charAt = charSequence.charAt(i);
            int ordinal = charset.ordinal();
            if (ordinal == 0) {
                return charAt == 241 || charAt == 242 || charAt == 243 || charAt == 244 || A.indexOf(charAt) >= 0;
            }
            if (ordinal == 1) {
                return charAt == 241 || charAt == 242 || charAt == 243 || charAt == 244 || B.indexOf(charAt) >= 0;
            }
            if (ordinal != 2) {
                return false;
            }
            return charAt == 241 || ((i2 = i + 1) < charSequence.length() && isDigit(charAt) && isDigit(charSequence.charAt(i2)));
        }

        private int encode(java.lang.CharSequence charSequence, com.google.zxing.oned.Code128Writer.MinimalEncoder.Charset charset, int i) {
            int i2;
            int i3;
            int i4 = this.memoizedCost[charset.ordinal()][i];
            if (i4 > 0) {
                return i4;
            }
            com.google.zxing.oned.Code128Writer.MinimalEncoder.Latch latch = com.google.zxing.oned.Code128Writer.MinimalEncoder.Latch.NONE;
            int i5 = i + 1;
            int i6 = 0;
            boolean z = i5 >= charSequence.length();
            com.google.zxing.oned.Code128Writer.MinimalEncoder.Charset[] charsetArr = {com.google.zxing.oned.Code128Writer.MinimalEncoder.Charset.A, com.google.zxing.oned.Code128Writer.MinimalEncoder.Charset.B};
            int i7 = Integer.MAX_VALUE;
            while (true) {
                if (i6 > 1) {
                    break;
                }
                if (canEncode(charSequence, charsetArr[i6], i)) {
                    com.google.zxing.oned.Code128Writer.MinimalEncoder.Latch latch2 = com.google.zxing.oned.Code128Writer.MinimalEncoder.Latch.NONE;
                    com.google.zxing.oned.Code128Writer.MinimalEncoder.Charset charset2 = charsetArr[i6];
                    if (charset != charset2) {
                        latch2 = com.google.zxing.oned.Code128Writer.MinimalEncoder.Latch.valueOf(charset2.toString());
                        i3 = 2;
                    } else {
                        i3 = 1;
                    }
                    if (!z) {
                        i3 += encode(charSequence, charsetArr[i6], i5);
                    }
                    if (i3 < i7) {
                        latch = latch2;
                        i7 = i3;
                    }
                    if (charset == charsetArr[(i6 + 1) % 2]) {
                        com.google.zxing.oned.Code128Writer.MinimalEncoder.Latch latch3 = com.google.zxing.oned.Code128Writer.MinimalEncoder.Latch.SHIFT;
                        int encode = z ? 2 : encode(charSequence, charset, i5) + 2;
                        if (encode < i7) {
                            i7 = encode;
                            latch = latch3;
                        }
                    }
                }
                i6++;
            }
            if (canEncode(charSequence, com.google.zxing.oned.Code128Writer.MinimalEncoder.Charset.C, i)) {
                com.google.zxing.oned.Code128Writer.MinimalEncoder.Latch latch4 = com.google.zxing.oned.Code128Writer.MinimalEncoder.Latch.NONE;
                if (charset != com.google.zxing.oned.Code128Writer.MinimalEncoder.Charset.C) {
                    latch4 = com.google.zxing.oned.Code128Writer.MinimalEncoder.Latch.C;
                    i2 = 2;
                } else {
                    i2 = 1;
                }
                int i8 = (charSequence.charAt(i) != 241 ? 2 : 1) + i;
                if (i8 < charSequence.length()) {
                    i2 += encode(charSequence, com.google.zxing.oned.Code128Writer.MinimalEncoder.Charset.C, i8);
                }
                if (i2 < i7) {
                    latch = latch4;
                    i7 = i2;
                }
            }
            if (i7 == Integer.MAX_VALUE) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Bad character in input: ASCII value=");
                sb.append((int) charSequence.charAt(i));
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            this.memoizedCost[charset.ordinal()][i] = i7;
            this.minPath[charset.ordinal()][i] = latch;
            return i7;
        }
    }
}
