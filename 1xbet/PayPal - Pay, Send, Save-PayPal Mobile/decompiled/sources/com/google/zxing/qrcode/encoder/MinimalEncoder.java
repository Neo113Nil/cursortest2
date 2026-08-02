package com.google.zxing.qrcode.encoder;

/* loaded from: classes9.dex */
final class MinimalEncoder {
    private final com.google.zxing.qrcode.decoder.ErrorCorrectionLevel ecLevel;
    private final com.google.zxing.common.ECIEncoderSet encoders;
    private final boolean isGS1;
    private final java.lang.String stringToEncode;

    static boolean isNumeric(char c) {
        return c >= '0' && c <= '9';
    }

    enum VersionSize {
        SMALL("version 1-9"),
        MEDIUM("version 10-26"),
        LARGE("version 27-40");

        private final java.lang.String description;

        VersionSize(java.lang.String str) {
            this.description = str;
        }

        @Override // java.lang.Enum
        public final java.lang.String toString() {
            return this.description;
        }
    }

    MinimalEncoder(java.lang.String str, java.nio.charset.Charset charset, boolean z, com.google.zxing.qrcode.decoder.ErrorCorrectionLevel errorCorrectionLevel) {
        this.stringToEncode = str;
        this.isGS1 = z;
        this.encoders = new com.google.zxing.common.ECIEncoderSet(str, charset, -1);
        this.ecLevel = errorCorrectionLevel;
    }

    static com.google.zxing.qrcode.encoder.MinimalEncoder.ResultList encode(java.lang.String str, com.google.zxing.qrcode.decoder.Version version, java.nio.charset.Charset charset, boolean z, com.google.zxing.qrcode.decoder.ErrorCorrectionLevel errorCorrectionLevel) throws com.google.zxing.WriterException {
        return new com.google.zxing.qrcode.encoder.MinimalEncoder(str, charset, z, errorCorrectionLevel).encode(version);
    }

    final com.google.zxing.qrcode.encoder.MinimalEncoder.ResultList encode(com.google.zxing.qrcode.decoder.Version version) throws com.google.zxing.WriterException {
        if (version == null) {
            com.google.zxing.qrcode.decoder.Version[] versionArr = {getVersion(com.google.zxing.qrcode.encoder.MinimalEncoder.VersionSize.SMALL), getVersion(com.google.zxing.qrcode.encoder.MinimalEncoder.VersionSize.MEDIUM), getVersion(com.google.zxing.qrcode.encoder.MinimalEncoder.VersionSize.LARGE)};
            com.google.zxing.qrcode.encoder.MinimalEncoder.ResultList[] resultListArr = {encodeSpecificVersion(versionArr[0]), encodeSpecificVersion(versionArr[1]), encodeSpecificVersion(versionArr[2])};
            int i = Integer.MAX_VALUE;
            int i2 = -1;
            for (int i3 = 0; i3 < 3; i3++) {
                int size = resultListArr[i3].getSize();
                if (com.google.zxing.qrcode.encoder.Encoder.willFit(size, versionArr[i3], this.ecLevel) && size < i) {
                    i2 = i3;
                    i = size;
                }
            }
            if (i2 < 0) {
                throw new com.google.zxing.WriterException("Data too big for any version");
            }
            return resultListArr[i2];
        }
        com.google.zxing.qrcode.encoder.MinimalEncoder.ResultList encodeSpecificVersion = encodeSpecificVersion(version);
        if (com.google.zxing.qrcode.encoder.Encoder.willFit(encodeSpecificVersion.getSize(), getVersion(getVersionSize(encodeSpecificVersion.getVersion())), this.ecLevel)) {
            return encodeSpecificVersion;
        }
        throw new com.google.zxing.WriterException("Data too big for version".concat(java.lang.String.valueOf(version)));
    }

    static com.google.zxing.qrcode.encoder.MinimalEncoder.VersionSize getVersionSize(com.google.zxing.qrcode.decoder.Version version) {
        return version.getVersionNumber() <= 9 ? com.google.zxing.qrcode.encoder.MinimalEncoder.VersionSize.SMALL : version.getVersionNumber() <= 26 ? com.google.zxing.qrcode.encoder.MinimalEncoder.VersionSize.MEDIUM : com.google.zxing.qrcode.encoder.MinimalEncoder.VersionSize.LARGE;
    }

    static com.google.zxing.qrcode.decoder.Version getVersion(com.google.zxing.qrcode.encoder.MinimalEncoder.VersionSize versionSize) {
        int ordinal = versionSize.ordinal();
        if (ordinal == 0) {
            return com.google.zxing.qrcode.decoder.Version.getVersionForNumber(9);
        }
        if (ordinal == 1) {
            return com.google.zxing.qrcode.decoder.Version.getVersionForNumber(26);
        }
        return com.google.zxing.qrcode.decoder.Version.getVersionForNumber(40);
    }

    static boolean isDoubleByteKanji(char c) {
        return com.google.zxing.qrcode.encoder.Encoder.isOnlyDoubleByteKanji(java.lang.String.valueOf(c));
    }

    static boolean isAlphanumeric(char c) {
        return com.google.zxing.qrcode.encoder.Encoder.getAlphanumericCode(c) != -1;
    }

    /* renamed from: com.google.zxing.qrcode.encoder.MinimalEncoder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$zxing$qrcode$decoder$Mode;

        static {
            int[] iArr = new int[com.google.zxing.qrcode.decoder.Mode.values().length];
            $SwitchMap$com$google$zxing$qrcode$decoder$Mode = iArr;
            try {
                iArr[com.google.zxing.qrcode.decoder.Mode.KANJI.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode[com.google.zxing.qrcode.decoder.Mode.ALPHANUMERIC.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode[com.google.zxing.qrcode.decoder.Mode.NUMERIC.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode[com.google.zxing.qrcode.decoder.Mode.BYTE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode[com.google.zxing.qrcode.decoder.Mode.ECI.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    final boolean canEncode(com.google.zxing.qrcode.decoder.Mode mode, char c) {
        int i = com.google.zxing.qrcode.encoder.MinimalEncoder.AnonymousClass1.$SwitchMap$com$google$zxing$qrcode$decoder$Mode[mode.ordinal()];
        if (i == 1) {
            return isDoubleByteKanji(c);
        }
        if (i == 2) {
            return isAlphanumeric(c);
        }
        if (i != 3) {
            return i == 4;
        }
        return isNumeric(c);
    }

    static int getCompactedOrdinal(com.google.zxing.qrcode.decoder.Mode mode) {
        int i;
        if (mode == null || (i = com.google.zxing.qrcode.encoder.MinimalEncoder.AnonymousClass1.$SwitchMap$com$google$zxing$qrcode$decoder$Mode[mode.ordinal()]) == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        throw new java.lang.IllegalStateException("Illegal mode ".concat(java.lang.String.valueOf(mode)));
    }

    final void addEdge(com.google.zxing.qrcode.encoder.MinimalEncoder.Edge[][][] edgeArr, int i, com.google.zxing.qrcode.encoder.MinimalEncoder.Edge edge) {
        com.google.zxing.qrcode.encoder.MinimalEncoder.Edge[] edgeArr2 = edgeArr[i + edge.characterLength][edge.charsetEncoderIndex];
        int compactedOrdinal = getCompactedOrdinal(edge.mode);
        com.google.zxing.qrcode.encoder.MinimalEncoder.Edge edge2 = edgeArr2[compactedOrdinal];
        if (edge2 == null || edge2.cachedTotalSize > edge.cachedTotalSize) {
            edgeArr2[compactedOrdinal] = edge;
        }
    }

    final void addEdges(com.google.zxing.qrcode.decoder.Version version, com.google.zxing.qrcode.encoder.MinimalEncoder.Edge[][][] edgeArr, int i, com.google.zxing.qrcode.encoder.MinimalEncoder.Edge edge) {
        int i2;
        int length = this.encoders.length();
        int priorityEncoderIndex = this.encoders.getPriorityEncoderIndex();
        if (priorityEncoderIndex < 0 || !this.encoders.canEncode(this.stringToEncode.charAt(i), priorityEncoderIndex)) {
            priorityEncoderIndex = 0;
        } else {
            length = priorityEncoderIndex + 1;
        }
        int i3 = length;
        for (int i4 = priorityEncoderIndex; i4 < i3; i4++) {
            if (this.encoders.canEncode(this.stringToEncode.charAt(i), i4)) {
                addEdge(edgeArr, i, new com.google.zxing.qrcode.encoder.MinimalEncoder.Edge(this, com.google.zxing.qrcode.decoder.Mode.BYTE, i, i4, 1, edge, version, null));
            }
        }
        if (canEncode(com.google.zxing.qrcode.decoder.Mode.KANJI, this.stringToEncode.charAt(i))) {
            addEdge(edgeArr, i, new com.google.zxing.qrcode.encoder.MinimalEncoder.Edge(this, com.google.zxing.qrcode.decoder.Mode.KANJI, i, 0, 1, edge, version, null));
        }
        int length2 = this.stringToEncode.length();
        int i5 = 2;
        if (canEncode(com.google.zxing.qrcode.decoder.Mode.ALPHANUMERIC, this.stringToEncode.charAt(i))) {
            int i6 = i + 1;
            addEdge(edgeArr, i, new com.google.zxing.qrcode.encoder.MinimalEncoder.Edge(this, com.google.zxing.qrcode.decoder.Mode.ALPHANUMERIC, i, 0, (i6 >= length2 || !canEncode(com.google.zxing.qrcode.decoder.Mode.ALPHANUMERIC, this.stringToEncode.charAt(i6))) ? 1 : 2, edge, version, null));
        }
        if (canEncode(com.google.zxing.qrcode.decoder.Mode.NUMERIC, this.stringToEncode.charAt(i))) {
            com.google.zxing.qrcode.decoder.Mode mode = com.google.zxing.qrcode.decoder.Mode.NUMERIC;
            int i7 = i + 1;
            if (i7 >= length2 || !canEncode(com.google.zxing.qrcode.decoder.Mode.NUMERIC, this.stringToEncode.charAt(i7))) {
                i2 = 1;
            } else {
                int i8 = i + 2;
                if (i8 < length2 && canEncode(com.google.zxing.qrcode.decoder.Mode.NUMERIC, this.stringToEncode.charAt(i8))) {
                    i5 = 3;
                }
                i2 = i5;
            }
            addEdge(edgeArr, i, new com.google.zxing.qrcode.encoder.MinimalEncoder.Edge(this, mode, i, 0, i2, edge, version, null));
        }
    }

    final com.google.zxing.qrcode.encoder.MinimalEncoder.ResultList encodeSpecificVersion(com.google.zxing.qrcode.decoder.Version version) throws com.google.zxing.WriterException {
        int length = this.stringToEncode.length();
        com.google.zxing.qrcode.encoder.MinimalEncoder.Edge[][][] edgeArr = (com.google.zxing.qrcode.encoder.MinimalEncoder.Edge[][][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) com.google.zxing.qrcode.encoder.MinimalEncoder.Edge.class, length + 1, this.encoders.length(), 4);
        addEdges(version, edgeArr, 0, null);
        for (int i = 1; i <= length; i++) {
            for (int i2 = 0; i2 < this.encoders.length(); i2++) {
                for (int i3 = 0; i3 < 4; i3++) {
                    com.google.zxing.qrcode.encoder.MinimalEncoder.Edge edge = edgeArr[i][i2][i3];
                    if (edge != null && i < length) {
                        addEdges(version, edgeArr, i, edge);
                    }
                }
            }
        }
        int i4 = -1;
        int i5 = Integer.MAX_VALUE;
        int i6 = -1;
        for (int i7 = 0; i7 < this.encoders.length(); i7++) {
            for (int i8 = 0; i8 < 4; i8++) {
                com.google.zxing.qrcode.encoder.MinimalEncoder.Edge edge2 = edgeArr[length][i7][i8];
                if (edge2 != null && edge2.cachedTotalSize < i5) {
                    i5 = edge2.cachedTotalSize;
                    i4 = i7;
                    i6 = i8;
                }
            }
        }
        if (i4 < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Internal error: failed to encode \"");
            sb.append(this.stringToEncode);
            sb.append("\"");
            throw new com.google.zxing.WriterException(sb.toString());
        }
        return new com.google.zxing.qrcode.encoder.MinimalEncoder.ResultList(version, edgeArr[length][i4][i6]);
    }

    final class Edge {
        private final int cachedTotalSize;
        private final int characterLength;
        private final int charsetEncoderIndex;
        private final int fromPosition;
        private final com.google.zxing.qrcode.decoder.Mode mode;
        private final com.google.zxing.qrcode.encoder.MinimalEncoder.Edge previous;

        /* synthetic */ Edge(com.google.zxing.qrcode.encoder.MinimalEncoder minimalEncoder, com.google.zxing.qrcode.decoder.Mode mode, int i, int i2, int i3, com.google.zxing.qrcode.encoder.MinimalEncoder.Edge edge, com.google.zxing.qrcode.decoder.Version version, com.google.zxing.qrcode.encoder.MinimalEncoder.AnonymousClass1 anonymousClass1) {
            this(mode, i, i2, i3, edge, version);
        }

        private Edge(com.google.zxing.qrcode.decoder.Mode mode, int i, int i2, int i3, com.google.zxing.qrcode.encoder.MinimalEncoder.Edge edge, com.google.zxing.qrcode.decoder.Version version) {
            this.mode = mode;
            this.fromPosition = i;
            int i4 = (mode == com.google.zxing.qrcode.decoder.Mode.BYTE || edge == null) ? i2 : edge.charsetEncoderIndex;
            this.charsetEncoderIndex = i4;
            this.characterLength = i3;
            this.previous = edge;
            boolean z = false;
            int i5 = edge != null ? edge.cachedTotalSize : 0;
            if ((mode == com.google.zxing.qrcode.decoder.Mode.BYTE && edge == null && i4 != 0) || (edge != null && i4 != edge.charsetEncoderIndex)) {
                z = true;
            }
            i5 = (edge == null || mode != edge.mode || z) ? i5 + mode.getCharacterCountBits(version) + 4 : i5;
            int i6 = com.google.zxing.qrcode.encoder.MinimalEncoder.AnonymousClass1.$SwitchMap$com$google$zxing$qrcode$decoder$Mode[mode.ordinal()];
            if (i6 == 1) {
                i5 += 13;
            } else if (i6 == 2) {
                i5 += i3 == 1 ? 6 : 11;
            } else if (i6 == 3) {
                i5 += i3 != 1 ? i3 == 2 ? 7 : 10 : 4;
            } else if (i6 == 4) {
                i5 += com.google.zxing.qrcode.encoder.MinimalEncoder.this.encoders.encode(com.google.zxing.qrcode.encoder.MinimalEncoder.this.stringToEncode.substring(i, i3 + i), i2).length * 8;
                if (z) {
                    i5 += 12;
                }
            }
            this.cachedTotalSize = i5;
        }
    }

    final class ResultList {
        private final java.util.List<com.google.zxing.qrcode.encoder.MinimalEncoder.ResultList.ResultNode> list = new java.util.ArrayList();
        private final com.google.zxing.qrcode.decoder.Version version;

        ResultList(com.google.zxing.qrcode.decoder.Version version, com.google.zxing.qrcode.encoder.MinimalEncoder.Edge edge) {
            int i;
            int i2;
            int i3 = 0;
            boolean z = false;
            while (true) {
                i = 1;
                if (edge == null) {
                    break;
                }
                int i4 = i3 + edge.characterLength;
                com.google.zxing.qrcode.encoder.MinimalEncoder.Edge edge2 = edge.previous;
                boolean z2 = (edge.mode == com.google.zxing.qrcode.decoder.Mode.BYTE && edge2 == null && edge.charsetEncoderIndex != 0) || !(edge2 == null || edge.charsetEncoderIndex == edge2.charsetEncoderIndex);
                z = z2 ? true : z;
                if (edge2 == null || edge2.mode != edge.mode || z2) {
                    this.list.add(0, new com.google.zxing.qrcode.encoder.MinimalEncoder.ResultList.ResultNode(edge.mode, edge.fromPosition, edge.charsetEncoderIndex, i4));
                    i4 = 0;
                }
                if (z2) {
                    this.list.add(0, new com.google.zxing.qrcode.encoder.MinimalEncoder.ResultList.ResultNode(com.google.zxing.qrcode.decoder.Mode.ECI, edge.fromPosition, edge.charsetEncoderIndex, 0));
                }
                edge = edge2;
                i3 = i4;
            }
            if (com.google.zxing.qrcode.encoder.MinimalEncoder.this.isGS1) {
                com.google.zxing.qrcode.encoder.MinimalEncoder.ResultList.ResultNode resultNode = this.list.get(0);
                if (resultNode != null && resultNode.mode != com.google.zxing.qrcode.decoder.Mode.ECI && z) {
                    this.list.add(0, new com.google.zxing.qrcode.encoder.MinimalEncoder.ResultList.ResultNode(com.google.zxing.qrcode.decoder.Mode.ECI, 0, 0, 0));
                }
                this.list.add(this.list.get(0).mode == com.google.zxing.qrcode.decoder.Mode.ECI ? 1 : 0, new com.google.zxing.qrcode.encoder.MinimalEncoder.ResultList.ResultNode(com.google.zxing.qrcode.decoder.Mode.FNC1_FIRST_POSITION, 0, 0, 0));
            }
            int versionNumber = version.getVersionNumber();
            int ordinal = com.google.zxing.qrcode.encoder.MinimalEncoder.getVersionSize(version).ordinal();
            if (ordinal == 0) {
                i2 = 9;
            } else if (ordinal != 1) {
                i = 27;
                i2 = 40;
            } else {
                i = 10;
                i2 = 26;
            }
            int size = getSize(version);
            while (versionNumber < i2 && !com.google.zxing.qrcode.encoder.Encoder.willFit(size, com.google.zxing.qrcode.decoder.Version.getVersionForNumber(versionNumber), com.google.zxing.qrcode.encoder.MinimalEncoder.this.ecLevel)) {
                versionNumber++;
            }
            while (versionNumber > i && com.google.zxing.qrcode.encoder.Encoder.willFit(size, com.google.zxing.qrcode.decoder.Version.getVersionForNumber(versionNumber - 1), com.google.zxing.qrcode.encoder.MinimalEncoder.this.ecLevel)) {
                versionNumber--;
            }
            this.version = com.google.zxing.qrcode.decoder.Version.getVersionForNumber(versionNumber);
        }

        final int getSize() {
            return getSize(this.version);
        }

        private int getSize(com.google.zxing.qrcode.decoder.Version version) {
            java.util.Iterator<com.google.zxing.qrcode.encoder.MinimalEncoder.ResultList.ResultNode> it = this.list.iterator();
            int i = 0;
            while (it.hasNext()) {
                i += it.next().getSize(version);
            }
            return i;
        }

        final void getBits(com.google.zxing.common.BitArray bitArray) throws com.google.zxing.WriterException {
            java.util.Iterator<com.google.zxing.qrcode.encoder.MinimalEncoder.ResultList.ResultNode> it = this.list.iterator();
            while (it.hasNext()) {
                it.next().getBits(bitArray);
            }
        }

        final com.google.zxing.qrcode.decoder.Version getVersion() {
            return this.version;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            com.google.zxing.qrcode.encoder.MinimalEncoder.ResultList.ResultNode resultNode = null;
            for (com.google.zxing.qrcode.encoder.MinimalEncoder.ResultList.ResultNode resultNode2 : this.list) {
                if (resultNode != null) {
                    sb.append(",");
                }
                sb.append(resultNode2.toString());
                resultNode = resultNode2;
            }
            return sb.toString();
        }

        final class ResultNode {
            private final int characterLength;
            private final int charsetEncoderIndex;
            private final int fromPosition;
            private final com.google.zxing.qrcode.decoder.Mode mode;

            ResultNode(com.google.zxing.qrcode.decoder.Mode mode, int i, int i2, int i3) {
                this.mode = mode;
                this.fromPosition = i;
                this.charsetEncoderIndex = i2;
                this.characterLength = i3;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public int getSize(com.google.zxing.qrcode.decoder.Version version) {
                int i;
                int i2;
                int characterCountBits = this.mode.getCharacterCountBits(version);
                int i3 = characterCountBits + 4;
                int i4 = com.google.zxing.qrcode.encoder.MinimalEncoder.AnonymousClass1.$SwitchMap$com$google$zxing$qrcode$decoder$Mode[this.mode.ordinal()];
                if (i4 != 1) {
                    if (i4 == 2) {
                        int i5 = this.characterLength;
                        int i6 = i5 / 2;
                        r3 = i5 % 2 == 1 ? 6 : 0;
                        i2 = i6 * 11;
                    } else if (i4 == 3) {
                        int i7 = this.characterLength;
                        int i8 = i7 / 3;
                        int i9 = i7 % 3;
                        if (i9 == 1) {
                            r3 = 4;
                        } else if (i9 == 2) {
                            r3 = 7;
                        }
                        i2 = i8 * 10;
                    } else {
                        if (i4 != 4) {
                            return i4 != 5 ? i3 : characterCountBits + 12;
                        }
                        i = getCharacterCountIndicator() * 8;
                    }
                    return i3 + i2 + r3;
                }
                i = this.characterLength * 13;
                return i3 + i;
            }

            private int getCharacterCountIndicator() {
                if (this.mode == com.google.zxing.qrcode.decoder.Mode.BYTE) {
                    com.google.zxing.common.ECIEncoderSet eCIEncoderSet = com.google.zxing.qrcode.encoder.MinimalEncoder.this.encoders;
                    java.lang.String str = com.google.zxing.qrcode.encoder.MinimalEncoder.this.stringToEncode;
                    int i = this.fromPosition;
                    return eCIEncoderSet.encode(str.substring(i, this.characterLength + i), this.charsetEncoderIndex).length;
                }
                return this.characterLength;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void getBits(com.google.zxing.common.BitArray bitArray) throws com.google.zxing.WriterException {
                bitArray.appendBits(this.mode.getBits(), 4);
                if (this.characterLength > 0) {
                    bitArray.appendBits(getCharacterCountIndicator(), this.mode.getCharacterCountBits(com.google.zxing.qrcode.encoder.MinimalEncoder.ResultList.this.version));
                }
                if (this.mode == com.google.zxing.qrcode.decoder.Mode.ECI) {
                    bitArray.appendBits(com.google.zxing.qrcode.encoder.MinimalEncoder.this.encoders.getECIValue(this.charsetEncoderIndex), 8);
                } else if (this.characterLength > 0) {
                    java.lang.String str = com.google.zxing.qrcode.encoder.MinimalEncoder.this.stringToEncode;
                    int i = this.fromPosition;
                    com.google.zxing.qrcode.encoder.Encoder.appendBytes(str.substring(i, this.characterLength + i), this.mode, bitArray, com.google.zxing.qrcode.encoder.MinimalEncoder.this.encoders.getCharset(this.charsetEncoderIndex));
                }
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(this.mode);
                sb.append('(');
                if (this.mode == com.google.zxing.qrcode.decoder.Mode.ECI) {
                    sb.append(com.google.zxing.qrcode.encoder.MinimalEncoder.this.encoders.getCharset(this.charsetEncoderIndex).displayName());
                } else {
                    java.lang.String str = com.google.zxing.qrcode.encoder.MinimalEncoder.this.stringToEncode;
                    int i = this.fromPosition;
                    sb.append(makePrintable(str.substring(i, this.characterLength + i)));
                }
                sb.append(')');
                return sb.toString();
            }

            private java.lang.String makePrintable(java.lang.String str) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) < ' ' || str.charAt(i) > '~') {
                        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                    } else {
                        sb.append(str.charAt(i));
                    }
                }
                return sb.toString();
            }
        }
    }
}
