package com.google.zxing.datamatrix.encoder;

/* loaded from: classes9.dex */
public final class MinimalEncoder {
    static final char[] C40_SHIFT2_CHARS = {'!', '\"', '#', kotlin.text.Typography.dollar, '%', kotlin.text.Typography.amp, '\'', '(', ')', '*', '+', kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA, '-', com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR, kotlinx.io.files.FileSystemKt.UnixPathSeparator, kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON, ';', kotlin.text.Typography.less, '=', kotlin.text.Typography.greater, '?', '@', kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST, '\\', kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.ObscuredMaskString, '_'};

    enum Mode {
        ASCII,
        C40,
        TEXT,
        X12,
        EDF,
        B256
    }

    static boolean isExtendedASCII(char c, int i) {
        return c != i && c >= 128 && c <= 255;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isInC40Shift1Set(char c) {
        return c <= 31;
    }

    private MinimalEncoder() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isInC40Shift2Set(char c, int i) {
        for (char c2 : C40_SHIFT2_CHARS) {
            if (c2 == c) {
                return true;
            }
        }
        return c == i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isInTextShift1Set(char c) {
        return isInC40Shift1Set(c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isInTextShift2Set(char c, int i) {
        return isInC40Shift2Set(c, i);
    }

    public static java.lang.String encodeHighLevel(java.lang.String str) {
        return encodeHighLevel(str, null, -1, com.google.zxing.datamatrix.encoder.SymbolShapeHint.FORCE_NONE);
    }

    public static java.lang.String encodeHighLevel(java.lang.String str, java.nio.charset.Charset charset, int i, com.google.zxing.datamatrix.encoder.SymbolShapeHint symbolShapeHint) {
        int i2;
        if (str.startsWith("[)>\u001e05\u001d") && str.endsWith("\u001e\u0004")) {
            str = str.substring(7, str.length() - 2);
            i2 = 5;
        } else if (str.startsWith("[)>\u001e06\u001d") && str.endsWith("\u001e\u0004")) {
            str = str.substring(7, str.length() - 2);
            i2 = 6;
        } else {
            i2 = 0;
        }
        return new java.lang.String(encode(str, charset, i, symbolShapeHint, i2), java.nio.charset.StandardCharsets.ISO_8859_1);
    }

    static byte[] encode(java.lang.String str, java.nio.charset.Charset charset, int i, com.google.zxing.datamatrix.encoder.SymbolShapeHint symbolShapeHint, int i2) {
        return encodeMinimally(new com.google.zxing.datamatrix.encoder.MinimalEncoder.Input(str, charset, i, symbolShapeHint, i2, null)).getBytes();
    }

    static void addEdge(com.google.zxing.datamatrix.encoder.MinimalEncoder.Edge[][] edgeArr, com.google.zxing.datamatrix.encoder.MinimalEncoder.Edge edge) {
        int i = edge.fromPosition + edge.characterLength;
        if (edgeArr[i][edge.getEndMode().ordinal()] == null || edgeArr[i][edge.getEndMode().ordinal()].cachedTotalSize > edge.cachedTotalSize) {
            edgeArr[i][edge.getEndMode().ordinal()] = edge;
        }
    }

    static int getNumberOfC40Words(com.google.zxing.datamatrix.encoder.MinimalEncoder.Input input, int i, boolean z, int[] iArr) {
        int i2 = 0;
        for (int i3 = i; i3 < input.length(); i3++) {
            if (input.isECI(i3)) {
                iArr[0] = 0;
                return 0;
            }
            char charAt = input.charAt(i3);
            if ((z && com.google.zxing.datamatrix.encoder.HighLevelEncoder.isNativeC40(charAt)) || (!z && com.google.zxing.datamatrix.encoder.HighLevelEncoder.isNativeText(charAt))) {
                i2++;
            } else if (isExtendedASCII(charAt, input.getFNC1Character())) {
                int i4 = charAt & 255;
                i2 = (i4 < 128 || (!(z && com.google.zxing.datamatrix.encoder.HighLevelEncoder.isNativeC40((char) (i4 + androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT))) && (z || !com.google.zxing.datamatrix.encoder.HighLevelEncoder.isNativeText((char) (i4 + androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT))))) ? i2 + 4 : i2 + 3;
            } else {
                i2 += 2;
            }
            if (i2 % 3 == 0 || ((i2 - 2) % 3 == 0 && i3 + 1 == input.length())) {
                iArr[0] = (i3 - i) + 1;
                return (int) java.lang.Math.ceil(i2 / 3.0d);
            }
        }
        iArr[0] = 0;
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static void addEdges(com.google.zxing.datamatrix.encoder.MinimalEncoder.Input input, com.google.zxing.datamatrix.encoder.MinimalEncoder.Edge[][] edgeArr, int i, com.google.zxing.datamatrix.encoder.MinimalEncoder.Edge edge) {
        if (input.isECI(i)) {
            addEdge(edgeArr, new com.google.zxing.datamatrix.encoder.MinimalEncoder.Edge(input, com.google.zxing.datamatrix.encoder.MinimalEncoder.Mode.ASCII, i, 1, edge, null));
            return;
        }
        char charAt = input.charAt(i);
        int i2 = 0;
        if (edge == null || edge.getEndMode() != com.google.zxing.datamatrix.encoder.MinimalEncoder.Mode.EDF) {
            if (com.google.zxing.datamatrix.encoder.HighLevelEncoder.isDigit(charAt) && input.haveNCharacters(i, 2) && com.google.zxing.datamatrix.encoder.HighLevelEncoder.isDigit(input.charAt(i + 1))) {
                addEdge(edgeArr, new com.google.zxing.datamatrix.encoder.MinimalEncoder.Edge(input, com.google.zxing.datamatrix.encoder.MinimalEncoder.Mode.ASCII, i, 2, edge, null));
            } else {
                addEdge(edgeArr, new com.google.zxing.datamatrix.encoder.MinimalEncoder.Edge(input, com.google.zxing.datamatrix.encoder.MinimalEncoder.Mode.ASCII, i, 1, edge, null));
            }
            com.google.zxing.datamatrix.encoder.MinimalEncoder.Mode[] modeArr = {com.google.zxing.datamatrix.encoder.MinimalEncoder.Mode.C40, com.google.zxing.datamatrix.encoder.MinimalEncoder.Mode.TEXT};
            int i3 = 0;
            while (i3 < 2) {
                com.google.zxing.datamatrix.encoder.MinimalEncoder.Mode mode = modeArr[i3];
                int[] iArr = new int[1];
                if (getNumberOfC40Words(input, i, mode == com.google.zxing.datamatrix.encoder.MinimalEncoder.Mode.C40 ? 1 : i2, iArr) > 0) {
                    addEdge(edgeArr, new com.google.zxing.datamatrix.encoder.MinimalEncoder.Edge(input, mode, i, iArr[i2], edge, null));
                }
                i3++;
                i2 = 0;
            }
            if (input.haveNCharacters(i, 3) && com.google.zxing.datamatrix.encoder.HighLevelEncoder.isNativeX12(input.charAt(i)) && com.google.zxing.datamatrix.encoder.HighLevelEncoder.isNativeX12(input.charAt(i + 1)) && com.google.zxing.datamatrix.encoder.HighLevelEncoder.isNativeX12(input.charAt(i + 2))) {
                addEdge(edgeArr, new com.google.zxing.datamatrix.encoder.MinimalEncoder.Edge(input, com.google.zxing.datamatrix.encoder.MinimalEncoder.Mode.X12, i, 3, edge, null));
            }
            addEdge(edgeArr, new com.google.zxing.datamatrix.encoder.MinimalEncoder.Edge(input, com.google.zxing.datamatrix.encoder.MinimalEncoder.Mode.B256, i, 1, edge, null));
            i2 = 0;
        }
        while (i2 < 3) {
            int i4 = i + i2;
            if (!input.haveNCharacters(i4, 1) || !com.google.zxing.datamatrix.encoder.HighLevelEncoder.isNativeEDIFACT(input.charAt(i4))) {
                break;
            }
            i2++;
            addEdge(edgeArr, new com.google.zxing.datamatrix.encoder.MinimalEncoder.Edge(input, com.google.zxing.datamatrix.encoder.MinimalEncoder.Mode.EDF, i, i2, edge, null));
        }
        if (i2 == 3 && input.haveNCharacters(i, 4) && com.google.zxing.datamatrix.encoder.HighLevelEncoder.isNativeEDIFACT(input.charAt(i + 3))) {
            addEdge(edgeArr, new com.google.zxing.datamatrix.encoder.MinimalEncoder.Edge(input, com.google.zxing.datamatrix.encoder.MinimalEncoder.Mode.EDF, i, 4, edge, null));
        }
    }

    static com.google.zxing.datamatrix.encoder.MinimalEncoder.Result encodeMinimally(com.google.zxing.datamatrix.encoder.MinimalEncoder.Input input) {
        int length = input.length();
        com.google.zxing.datamatrix.encoder.MinimalEncoder.Edge[][] edgeArr = (com.google.zxing.datamatrix.encoder.MinimalEncoder.Edge[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) com.google.zxing.datamatrix.encoder.MinimalEncoder.Edge.class, length + 1, 6);
        int i = 0;
        addEdges(input, edgeArr, 0, null);
        for (int i2 = 1; i2 <= length; i2++) {
            for (int i3 = 0; i3 < 6; i3++) {
                com.google.zxing.datamatrix.encoder.MinimalEncoder.Edge edge = edgeArr[i2][i3];
                if (edge != null && i2 < length) {
                    addEdges(input, edgeArr, i2, edge);
                }
            }
            for (int i4 = 0; i4 < 6; i4++) {
                edgeArr[i2 - 1][i4] = null;
            }
        }
        int i5 = Integer.MAX_VALUE;
        int i6 = -1;
        while (i < 6) {
            com.google.zxing.datamatrix.encoder.MinimalEncoder.Edge edge2 = edgeArr[length][i];
            if (edge2 != null) {
                int i7 = (i <= 0 || i > 3) ? edge2.cachedTotalSize : edge2.cachedTotalSize + 1;
                if (i7 < i5) {
                    i6 = i;
                    i5 = i7;
                }
            }
            i++;
        }
        if (i6 < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to encode \"");
            sb.append(input);
            sb.append("\"");
            throw new java.lang.IllegalStateException(sb.toString());
        }
        return new com.google.zxing.datamatrix.encoder.MinimalEncoder.Result(edgeArr[length][i6]);
    }

    static final class Edge {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final int cachedTotalSize;
        private final int characterLength;
        private final int fromPosition;
        private final com.google.zxing.datamatrix.encoder.MinimalEncoder.Input input;
        private final com.google.zxing.datamatrix.encoder.MinimalEncoder.Mode mode;
        private final com.google.zxing.datamatrix.encoder.MinimalEncoder.Edge previous;
        private static final int[] allCodewordCapacities = {3, 5, 8, 10, 12, 16, 18, 22, 30, 32, 36, 44, 49, 62, 86, 114, 144, 174, 204, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE, 368, 456, 576, 696, 816, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_SLICES, 1304, 1558};
        private static final int[] squareCodewordCapacities = {3, 5, 8, 12, 18, 22, 30, 36, 44, 62, 86, 114, 144, 174, 204, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE, 368, 456, 576, 696, 816, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_SLICES, 1304, 1558};
        private static final int[] rectangularCodewordCapacities = {5, 10, 16, 33, 32, 49};

        private static int getC40Value(boolean z, int i, char c, int i2) {
            if (c == i2) {
                return 27;
            }
            if (z) {
                if (c <= 31) {
                    return c;
                }
                if (c == ' ') {
                    return 3;
                }
                return c <= '/' ? c - '!' : c <= '9' ? c - ',' : c <= '@' ? c - '+' : c <= 'Z' ? c - '3' : c <= '_' ? c - 'E' : c <= 127 ? c - '`' : c;
            }
            if (c == 0) {
                return 0;
            }
            if (i == 0 && c <= 3) {
                return c - 1;
            }
            if (i == 1 && c <= 31) {
                return c;
            }
            if (c == ' ') {
                return 3;
            }
            if (c >= '!' && c <= '/') {
                return c - '!';
            }
            if (c >= '0' && c <= '9') {
                return c - ',';
            }
            if (c >= ':' && c <= '@') {
                return c - '+';
            }
            if (c >= 'A' && c <= 'Z') {
                return c - '@';
            }
            if (c >= '[' && c <= '_') {
                return c - 'E';
            }
            if (c == '`') {
                return 0;
            }
            return (c < 'a' || c > 'z') ? (c < '{' || c > 127) ? c : c - '`' : c - 'S';
        }

        private static int getX12Value(char c) {
            if (c == '\r') {
                return 0;
            }
            if (c == '*') {
                return 1;
            }
            if (c == '>') {
                return 2;
            }
            if (c == ' ') {
                return 3;
            }
            return (c < '0' || c > '9') ? (c < 'A' || c > 'Z') ? c : c - '3' : c - ',';
        }

        /* synthetic */ Edge(com.google.zxing.datamatrix.encoder.MinimalEncoder.Input input, com.google.zxing.datamatrix.encoder.MinimalEncoder.Mode mode, int i, int i2, com.google.zxing.datamatrix.encoder.MinimalEncoder.Edge edge, com.google.zxing.datamatrix.encoder.MinimalEncoder.AnonymousClass1 anonymousClass1) {
            this(input, mode, i, i2, edge);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0051, code lost:
        
            if (r0 != com.google.zxing.datamatrix.encoder.MinimalEncoder.Mode.X12) goto L81;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x009a, code lost:
        
            if (r0 == com.google.zxing.datamatrix.encoder.MinimalEncoder.Mode.X12) goto L67;
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x00c1, code lost:
        
            if (r0 != com.google.zxing.datamatrix.encoder.MinimalEncoder.Mode.X12) goto L81;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private Edge(com.google.zxing.datamatrix.encoder.MinimalEncoder.Input input, com.google.zxing.datamatrix.encoder.MinimalEncoder.Mode mode, int i, int i2, com.google.zxing.datamatrix.encoder.MinimalEncoder.Edge edge) {
            this.input = input;
            this.mode = mode;
            this.fromPosition = i;
            this.characterLength = i2;
            this.previous = edge;
            int i3 = edge != null ? edge.cachedTotalSize : 0;
            com.google.zxing.datamatrix.encoder.MinimalEncoder.Mode previousMode = getPreviousMode();
            int ordinal = mode.ordinal();
            if (ordinal == 0) {
                i3 = (input.isECI(i) || com.google.zxing.datamatrix.encoder.MinimalEncoder.isExtendedASCII(input.charAt(i), input.getFNC1Character())) ? i3 + 2 : i3 + 1;
                if (previousMode != com.google.zxing.datamatrix.encoder.MinimalEncoder.Mode.C40) {
                    if (previousMode != com.google.zxing.datamatrix.encoder.MinimalEncoder.Mode.TEXT) {
                    }
                }
                i3++;
            } else if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
                if (mode == com.google.zxing.datamatrix.encoder.MinimalEncoder.Mode.X12) {
                    i3 += 2;
                } else {
                    i3 += com.google.zxing.datamatrix.encoder.MinimalEncoder.getNumberOfC40Words(input, i, mode == com.google.zxing.datamatrix.encoder.MinimalEncoder.Mode.C40, new int[1]) * 2;
                }
                if (previousMode != com.google.zxing.datamatrix.encoder.MinimalEncoder.Mode.ASCII && previousMode != com.google.zxing.datamatrix.encoder.MinimalEncoder.Mode.B256) {
                    if (previousMode != mode) {
                        if (previousMode != com.google.zxing.datamatrix.encoder.MinimalEncoder.Mode.C40) {
                            if (previousMode != com.google.zxing.datamatrix.encoder.MinimalEncoder.Mode.TEXT) {
                            }
                        }
                        i3 += 2;
                    }
                }
                i3++;
            } else if (ordinal != 4) {
                if (ordinal == 5) {
                    i3 = (previousMode == com.google.zxing.datamatrix.encoder.MinimalEncoder.Mode.B256 && getB256Size() != 250) ? i3 + 1 : i3 + 2;
                    if (previousMode != com.google.zxing.datamatrix.encoder.MinimalEncoder.Mode.ASCII) {
                        if (previousMode != com.google.zxing.datamatrix.encoder.MinimalEncoder.Mode.C40) {
                            if (previousMode != com.google.zxing.datamatrix.encoder.MinimalEncoder.Mode.TEXT) {
                            }
                        }
                        i3 += 2;
                    }
                    i3++;
                }
            } else if (previousMode == com.google.zxing.datamatrix.encoder.MinimalEncoder.Mode.ASCII || previousMode == com.google.zxing.datamatrix.encoder.MinimalEncoder.Mode.B256) {
                i3 += 4;
            } else {
                i3 = (previousMode == com.google.zxing.datamatrix.encoder.MinimalEncoder.Mode.C40 || previousMode == com.google.zxing.datamatrix.encoder.MinimalEncoder.Mode.TEXT || previousMode == com.google.zxing.datamatrix.encoder.MinimalEncoder.Mode.X12) ? i3 + 5 : i3 + 3;
            }
            this.cachedTotalSize = i3;
        }

        final int getB256Size() {
            int i = 0;
            for (com.google.zxing.datamatrix.encoder.MinimalEncoder.Edge edge = this; edge != null && edge.mode == com.google.zxing.datamatrix.encoder.MinimalEncoder.Mode.B256 && i <= 250; edge = edge.previous) {
                i++;
            }
            return i;
        }

        final com.google.zxing.datamatrix.encoder.MinimalEncoder.Mode getPreviousStartMode() {
            com.google.zxing.datamatrix.encoder.MinimalEncoder.Edge edge = this.previous;
            return edge == null ? com.google.zxing.datamatrix.encoder.MinimalEncoder.Mode.ASCII : edge.mode;
        }

        final com.google.zxing.datamatrix.encoder.MinimalEncoder.Mode getPreviousMode() {
            com.google.zxing.datamatrix.encoder.MinimalEncoder.Edge edge = this.previous;
            return edge == null ? com.google.zxing.datamatrix.encoder.MinimalEncoder.Mode.ASCII : edge.getEndMode();
        }

        final com.google.zxing.datamatrix.encoder.MinimalEncoder.Mode getEndMode() {
            if (this.mode == com.google.zxing.datamatrix.encoder.MinimalEncoder.Mode.EDF) {
                if (this.characterLength < 4) {
                    return com.google.zxing.datamatrix.encoder.MinimalEncoder.Mode.ASCII;
                }
                int lastASCII = getLastASCII();
                if (lastASCII > 0 && getCodewordsRemaining(this.cachedTotalSize + lastASCII) <= 2 - lastASCII) {
                    return com.google.zxing.datamatrix.encoder.MinimalEncoder.Mode.ASCII;
                }
            }
            if (this.mode == com.google.zxing.datamatrix.encoder.MinimalEncoder.Mode.C40 || this.mode == com.google.zxing.datamatrix.encoder.MinimalEncoder.Mode.TEXT || this.mode == com.google.zxing.datamatrix.encoder.MinimalEncoder.Mode.X12) {
                if (this.fromPosition + this.characterLength >= this.input.length() && getCodewordsRemaining(this.cachedTotalSize) == 0) {
                    return com.google.zxing.datamatrix.encoder.MinimalEncoder.Mode.ASCII;
                }
                if (getLastASCII() == 1 && getCodewordsRemaining(this.cachedTotalSize + 1) == 0) {
                    return com.google.zxing.datamatrix.encoder.MinimalEncoder.Mode.ASCII;
                }
            }
            return this.mode;
        }

        final com.google.zxing.datamatrix.encoder.MinimalEncoder.Mode getMode() {
            return this.mode;
        }

        final int getLastASCII() {
            int length = this.input.length();
            int i = this.fromPosition + this.characterLength;
            int i2 = length - i;
            if (i2 <= 4 && i < length) {
                if (i2 == 1) {
                    return com.google.zxing.datamatrix.encoder.MinimalEncoder.isExtendedASCII(this.input.charAt(i), this.input.getFNC1Character()) ? 0 : 1;
                }
                if (i2 == 2) {
                    if (!com.google.zxing.datamatrix.encoder.MinimalEncoder.isExtendedASCII(this.input.charAt(i), this.input.getFNC1Character())) {
                        int i3 = i + 1;
                        if (!com.google.zxing.datamatrix.encoder.MinimalEncoder.isExtendedASCII(this.input.charAt(i3), this.input.getFNC1Character())) {
                            return (com.google.zxing.datamatrix.encoder.HighLevelEncoder.isDigit(this.input.charAt(i)) && com.google.zxing.datamatrix.encoder.HighLevelEncoder.isDigit(this.input.charAt(i3))) ? 1 : 2;
                        }
                    }
                    return 0;
                }
                if (i2 == 3) {
                    if (com.google.zxing.datamatrix.encoder.HighLevelEncoder.isDigit(this.input.charAt(i)) && com.google.zxing.datamatrix.encoder.HighLevelEncoder.isDigit(this.input.charAt(i + 1)) && !com.google.zxing.datamatrix.encoder.MinimalEncoder.isExtendedASCII(this.input.charAt(i + 2), this.input.getFNC1Character())) {
                        return 2;
                    }
                    return (com.google.zxing.datamatrix.encoder.HighLevelEncoder.isDigit(this.input.charAt(i + 1)) && com.google.zxing.datamatrix.encoder.HighLevelEncoder.isDigit(this.input.charAt(i + 2)) && !com.google.zxing.datamatrix.encoder.MinimalEncoder.isExtendedASCII(this.input.charAt(i), this.input.getFNC1Character())) ? 2 : 0;
                }
                if (com.google.zxing.datamatrix.encoder.HighLevelEncoder.isDigit(this.input.charAt(i)) && com.google.zxing.datamatrix.encoder.HighLevelEncoder.isDigit(this.input.charAt(i + 1)) && com.google.zxing.datamatrix.encoder.HighLevelEncoder.isDigit(this.input.charAt(i + 2)) && com.google.zxing.datamatrix.encoder.HighLevelEncoder.isDigit(this.input.charAt(i + 3))) {
                    return 2;
                }
            }
            return 0;
        }

        final int getMinSymbolSize(int i) {
            int i2 = com.google.zxing.datamatrix.encoder.MinimalEncoder.AnonymousClass1.$SwitchMap$com$google$zxing$datamatrix$encoder$SymbolShapeHint[this.input.getShapeHint().ordinal()];
            if (i2 == 1) {
                for (int i3 : squareCodewordCapacities) {
                    if (i3 >= i) {
                        return i3;
                    }
                }
            } else if (i2 == 2) {
                for (int i4 : rectangularCodewordCapacities) {
                    if (i4 >= i) {
                        return i4;
                    }
                }
            }
            for (int i5 : allCodewordCapacities) {
                if (i5 >= i) {
                    return i5;
                }
            }
            int[] iArr = allCodewordCapacities;
            return iArr[iArr.length - 1];
        }

        final int getCodewordsRemaining(int i) {
            return getMinSymbolSize(i) - i;
        }

        static byte[] getBytes(int i) {
            return new byte[]{(byte) i};
        }

        static byte[] getBytes(int i, int i2) {
            return new byte[]{(byte) i, (byte) i2};
        }

        static void setC40Word(byte[] bArr, int i, int i2, int i3, int i4) {
            int i5 = ((i2 & 255) * 1600) + ((i3 & 255) * 40) + (i4 & 255) + 1;
            bArr[i] = (byte) (i5 / 256);
            bArr[i + 1] = (byte) (i5 % 256);
        }

        final byte[] getX12Words() {
            int i = (this.characterLength / 3) * 2;
            byte[] bArr = new byte[i];
            for (int i2 = 0; i2 < i; i2 += 2) {
                int i3 = (i2 / 2) * 3;
                setC40Word(bArr, i2, getX12Value(this.input.charAt(this.fromPosition + i3)), getX12Value(this.input.charAt(this.fromPosition + i3 + 1)), getX12Value(this.input.charAt(this.fromPosition + i3 + 2)));
            }
            return bArr;
        }

        static int getShiftValue(char c, boolean z, int i) {
            if (z && com.google.zxing.datamatrix.encoder.MinimalEncoder.isInC40Shift1Set(c)) {
                return 0;
            }
            if (!z && com.google.zxing.datamatrix.encoder.MinimalEncoder.isInTextShift1Set(c)) {
                return 0;
            }
            if (z && com.google.zxing.datamatrix.encoder.MinimalEncoder.isInC40Shift2Set(c, i)) {
                return 1;
            }
            return (z || !com.google.zxing.datamatrix.encoder.MinimalEncoder.isInTextShift2Set(c, i)) ? 2 : 1;
        }

        final byte[] getC40Words(boolean z, int i) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i2 = 0; i2 < this.characterLength; i2++) {
                char charAt = this.input.charAt(this.fromPosition + i2);
                if ((z && com.google.zxing.datamatrix.encoder.HighLevelEncoder.isNativeC40(charAt)) || (!z && com.google.zxing.datamatrix.encoder.HighLevelEncoder.isNativeText(charAt))) {
                    arrayList.add(java.lang.Byte.valueOf((byte) getC40Value(z, 0, charAt, i)));
                } else if (!com.google.zxing.datamatrix.encoder.MinimalEncoder.isExtendedASCII(charAt, i)) {
                    int shiftValue = getShiftValue(charAt, z, i);
                    arrayList.add(java.lang.Byte.valueOf((byte) shiftValue));
                    arrayList.add(java.lang.Byte.valueOf((byte) getC40Value(z, shiftValue, charAt, i)));
                } else {
                    char c = (char) ((charAt & 255) + androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT);
                    if ((z && com.google.zxing.datamatrix.encoder.HighLevelEncoder.isNativeC40(c)) || (!z && com.google.zxing.datamatrix.encoder.HighLevelEncoder.isNativeText(c))) {
                        arrayList.add((byte) 1);
                        arrayList.add(java.lang.Byte.valueOf(com.google.common.base.Ascii.RS));
                        arrayList.add(java.lang.Byte.valueOf((byte) getC40Value(z, 0, c, i)));
                    } else {
                        arrayList.add((byte) 1);
                        arrayList.add(java.lang.Byte.valueOf(com.google.common.base.Ascii.RS));
                        int shiftValue2 = getShiftValue(c, z, i);
                        arrayList.add(java.lang.Byte.valueOf((byte) shiftValue2));
                        arrayList.add(java.lang.Byte.valueOf((byte) getC40Value(z, shiftValue2, c, i)));
                    }
                }
            }
            if (arrayList.size() % 3 != 0) {
                arrayList.add((byte) 0);
            }
            byte[] bArr = new byte[(arrayList.size() / 3) * 2];
            int i3 = 0;
            for (int i4 = 0; i4 < arrayList.size(); i4 += 3) {
                setC40Word(bArr, i3, ((java.lang.Byte) arrayList.get(i4)).byteValue() & 255, ((java.lang.Byte) arrayList.get(i4 + 1)).byteValue() & 255, ((java.lang.Byte) arrayList.get(i4 + 2)).byteValue() & 255);
                i3 += 2;
            }
            return bArr;
        }

        final byte[] getEDFBytes() {
            int ceil = (int) java.lang.Math.ceil(this.characterLength / 4.0d);
            byte[] bArr = new byte[ceil * 3];
            int i = this.fromPosition;
            int min = java.lang.Math.min((this.characterLength + i) - 1, this.input.length() - 1);
            for (int i2 = 0; i2 < ceil; i2 += 3) {
                int[] iArr = new int[4];
                for (int i3 = 0; i3 < 4; i3++) {
                    if (i <= min) {
                        iArr[i3] = this.input.charAt(i) & '?';
                        i++;
                    } else {
                        iArr[i3] = i == min + 1 ? 31 : 0;
                    }
                }
                int i4 = (iArr[0] << 18) | (iArr[1] << 12) | (iArr[2] << 6) | iArr[3];
                bArr[i2] = (byte) ((i4 >> 16) & 255);
                bArr[i2 + 1] = (byte) ((i4 >> 8) & 255);
                bArr[i2 + 2] = (byte) (i4 & 255);
            }
            return bArr;
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
        
            if (r0 == 5) goto L31;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final byte[] getLatchBytes() {
            int ordinal = getPreviousMode().ordinal();
            if (ordinal != 0) {
                if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
                    if (this.mode != getPreviousMode()) {
                        int ordinal2 = this.mode.ordinal();
                        if (ordinal2 == 0) {
                            return getBytes(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                        }
                        if (ordinal2 == 1) {
                            return getBytes(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE);
                        }
                        if (ordinal2 == 2) {
                            return getBytes(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, 239);
                        }
                        if (ordinal2 == 3) {
                            return getBytes(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, 238);
                        }
                        if (ordinal2 == 4) {
                            return getBytes(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
                        }
                        if (ordinal2 == 5) {
                            return getBytes(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, 231);
                        }
                    }
                } else if (ordinal != 4) {
                }
                return new byte[0];
            }
            int ordinal3 = this.mode.ordinal();
            if (ordinal3 == 1) {
                return getBytes(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE);
            }
            if (ordinal3 == 2) {
                return getBytes(239);
            }
            if (ordinal3 == 3) {
                return getBytes(238);
            }
            if (ordinal3 == 4) {
                return getBytes(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
            }
            if (ordinal3 == 5) {
                return getBytes(231);
            }
            return new byte[0];
        }

        final byte[] getDataBytes() {
            int ordinal = this.mode.ordinal();
            if (ordinal == 0) {
                if (this.input.isECI(this.fromPosition)) {
                    return getBytes(241, this.input.getECIValue(this.fromPosition) + 1);
                }
                if (com.google.zxing.datamatrix.encoder.MinimalEncoder.isExtendedASCII(this.input.charAt(this.fromPosition), this.input.getFNC1Character())) {
                    return getBytes(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE, this.input.charAt(this.fromPosition) - 127);
                }
                if (this.characterLength == 2) {
                    return getBytes(((this.input.charAt(this.fromPosition) - '0') * 10) + this.input.charAt(this.fromPosition + 1) + 82);
                }
                if (this.input.isFNC1(this.fromPosition)) {
                    return getBytes(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
                }
                return getBytes(this.input.charAt(this.fromPosition) + 1);
            }
            if (ordinal == 1) {
                return getC40Words(true, this.input.getFNC1Character());
            }
            if (ordinal == 2) {
                return getC40Words(false, this.input.getFNC1Character());
            }
            if (ordinal == 3) {
                return getX12Words();
            }
            if (ordinal == 4) {
                return getEDFBytes();
            }
            if (ordinal == 5) {
                return getBytes(this.input.charAt(this.fromPosition));
            }
            return new byte[0];
        }
    }

    /* renamed from: com.google.zxing.datamatrix.encoder.MinimalEncoder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$zxing$datamatrix$encoder$SymbolShapeHint;

        static {
            int[] iArr = new int[com.google.zxing.datamatrix.encoder.SymbolShapeHint.values().length];
            $SwitchMap$com$google$zxing$datamatrix$encoder$SymbolShapeHint = iArr;
            try {
                iArr[com.google.zxing.datamatrix.encoder.SymbolShapeHint.FORCE_SQUARE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$zxing$datamatrix$encoder$SymbolShapeHint[com.google.zxing.datamatrix.encoder.SymbolShapeHint.FORCE_RECTANGLE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    static final class Result {
        private final byte[] bytes;

        Result(com.google.zxing.datamatrix.encoder.MinimalEncoder.Edge edge) {
            int i;
            com.google.zxing.datamatrix.encoder.MinimalEncoder.Input input = edge.input;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            int i2 = 0;
            int prepend = ((edge.mode == com.google.zxing.datamatrix.encoder.MinimalEncoder.Mode.C40 || edge.mode == com.google.zxing.datamatrix.encoder.MinimalEncoder.Mode.TEXT || edge.mode == com.google.zxing.datamatrix.encoder.MinimalEncoder.Mode.X12) && edge.getEndMode() != com.google.zxing.datamatrix.encoder.MinimalEncoder.Mode.ASCII) ? prepend(com.google.zxing.datamatrix.encoder.MinimalEncoder.Edge.getBytes(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE), arrayList) : 0;
            for (com.google.zxing.datamatrix.encoder.MinimalEncoder.Edge edge2 = edge; edge2 != null; edge2 = edge2.previous) {
                prepend += prepend(edge2.getDataBytes(), arrayList);
                if (edge2.previous == null || edge2.getPreviousStartMode() != edge2.getMode()) {
                    if (edge2.getMode() == com.google.zxing.datamatrix.encoder.MinimalEncoder.Mode.B256) {
                        if (prepend <= 249) {
                            arrayList.add(0, java.lang.Byte.valueOf((byte) prepend));
                            i = prepend + 1;
                        } else {
                            arrayList.add(0, java.lang.Byte.valueOf((byte) (prepend % 250)));
                            arrayList.add(0, java.lang.Byte.valueOf((byte) ((prepend / 250) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_CONFIRMED_VALUE)));
                            i = prepend + 2;
                        }
                        arrayList2.add(java.lang.Integer.valueOf(arrayList.size()));
                        arrayList3.add(java.lang.Integer.valueOf(i));
                    }
                    prepend(edge2.getLatchBytes(), arrayList);
                    prepend = 0;
                }
            }
            if (input.getMacroId() == 5) {
                prepend(com.google.zxing.datamatrix.encoder.MinimalEncoder.Edge.getBytes(236), arrayList);
            } else if (input.getMacroId() == 6) {
                prepend(com.google.zxing.datamatrix.encoder.MinimalEncoder.Edge.getBytes(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE), arrayList);
            }
            if (input.getFNC1Character() > 0) {
                prepend(com.google.zxing.datamatrix.encoder.MinimalEncoder.Edge.getBytes(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE), arrayList);
            }
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                applyRandomPattern(arrayList, arrayList.size() - ((java.lang.Integer) arrayList2.get(i3)).intValue(), ((java.lang.Integer) arrayList3.get(i3)).intValue());
            }
            int minSymbolSize = edge.getMinSymbolSize(arrayList.size());
            if (arrayList.size() < minSymbolSize) {
                arrayList.add((byte) -127);
            }
            while (arrayList.size() < minSymbolSize) {
                arrayList.add(java.lang.Byte.valueOf((byte) randomize253State(arrayList.size() + 1)));
            }
            this.bytes = new byte[arrayList.size()];
            while (true) {
                byte[] bArr = this.bytes;
                if (i2 >= bArr.length) {
                    return;
                }
                bArr[i2] = ((java.lang.Byte) arrayList.get(i2)).byteValue();
                i2++;
            }
        }

        static int prepend(byte[] bArr, java.util.List<java.lang.Byte> list) {
            for (int length = bArr.length - 1; length >= 0; length--) {
                list.add(0, java.lang.Byte.valueOf(bArr[length]));
            }
            return bArr.length;
        }

        private static int randomize253State(int i) {
            int i2 = (i * 149) % com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE;
            int i3 = i2 + 130;
            return i3 <= 254 ? i3 : i2 - 124;
        }

        static void applyRandomPattern(java.util.List<java.lang.Byte> list, int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = i + i3;
                int byteValue = (list.get(i4).byteValue() & 255) + (((i4 + 1) * 149) % 255) + 1;
                if (byteValue > 255) {
                    byteValue -= 256;
                }
                list.set(i4, java.lang.Byte.valueOf((byte) byteValue));
            }
        }

        public final byte[] getBytes() {
            return this.bytes;
        }
    }

    static final class Input extends com.google.zxing.common.MinimalECIInput {
        private final int macroId;
        private final com.google.zxing.datamatrix.encoder.SymbolShapeHint shape;

        /* synthetic */ Input(java.lang.String str, java.nio.charset.Charset charset, int i, com.google.zxing.datamatrix.encoder.SymbolShapeHint symbolShapeHint, int i2, com.google.zxing.datamatrix.encoder.MinimalEncoder.AnonymousClass1 anonymousClass1) {
            this(str, charset, i, symbolShapeHint, i2);
        }

        private Input(java.lang.String str, java.nio.charset.Charset charset, int i, com.google.zxing.datamatrix.encoder.SymbolShapeHint symbolShapeHint, int i2) {
            super(str, charset, i);
            this.shape = symbolShapeHint;
            this.macroId = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int getMacroId() {
            return this.macroId;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public com.google.zxing.datamatrix.encoder.SymbolShapeHint getShapeHint() {
            return this.shape;
        }
    }
}
