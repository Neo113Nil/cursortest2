package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.o5, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2060o5 implements com.facebook.ads.redexgen.core.InterfaceC0591Bd {
    public static byte[] A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 45);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{40, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.FF, 4, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.CR, 73, com.google.common.base.Ascii.GS, 6, 73, 10, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.FF, 8, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.FF, 73, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.FF, 10, 6, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.ESC, 73, com.google.common.base.Ascii.SI, 6, com.google.common.base.Ascii.ESC, 73, com.google.common.base.Ascii.FS, 7, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.EM, 6, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.CR, 73, 36, 32, 36, 44, 73, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.FF, 83, 73, com.google.common.base.Ascii.EM, 8, 8, com.google.common.base.Ascii.DC4, 17, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.FF, 17, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.SYN, 87, 17, com.google.common.base.Ascii.FS, 75, 19, 2, 2, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.ESC, 17, 19, 6, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.FS, 93, 10, 95, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.US, 1, com.google.common.base.Ascii.NAK, 5, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.DC4, 8, com.google.common.base.Ascii.CR, 7, 5, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.VT, 10, 75, com.google.common.base.Ascii.FS, 73, com.google.common.base.Ascii.CR, 7, com.google.common.base.Ascii.GS, 58, 43, 43, 55, 50, 56, 58, 47, 50, 52, 53, 116, 35, 118, 40, 56, 47, 62, 104, 110};
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.ads.redexgen.core.InterfaceC0591Bd
    public final com.facebook.ads.redexgen.core.InterfaceC0762Hw A5J(com.facebook.ads.redexgen.core.C2196qI c2196qI) {
        char c;
        java.lang.String str = c2196qI.A0W;
        if (str != null) {
            switch (str.hashCode()) {
                case -1348231605:
                    java.lang.String mimeType = A00(88, 17, 73);
                    if (str.equals(mimeType)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1248341703:
                    java.lang.String mimeType2 = A00(55, 15, 85);
                    if (str.equals(mimeType2)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 1154383568:
                    java.lang.String mimeType3 = A00(70, 18, 95);
                    if (str.equals(mimeType3)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1652648887:
                    java.lang.String mimeType4 = A00(105, 20, 118);
                    if (str.equals(mimeType4)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    return new com.facebook.ads.redexgen.core.C9U();
                case 1:
                    return new com.facebook.ads.redexgen.core.AbstractC1968mZ() { // from class: com.facebook.ads.redexgen.X.9d
                        /* JADX WARN: Failed to parse debug info
                        java.lang.ArrayIndexOutOfBoundsException: Index 12 out of bounds for length 12
                        	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
                        	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
                        	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
                        	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
                        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
                         */
                        private final com.facebook.ads.androidx.media3.extractor.metadata.emsg.EventMessage A00(com.facebook.ads.redexgen.core.C04434v c04434v) {
                            return new com.facebook.ads.androidx.media3.extractor.metadata.emsg.EventMessage((java.lang.String) com.facebook.ads.redexgen.core.AbstractC04203y.A01(c04434v.A0U()), (java.lang.String) com.facebook.ads.redexgen.core.AbstractC04203y.A01(c04434v.A0U()), c04434v.A0P(), c04434v.A0P(), java.util.Arrays.copyOfRange(c04434v.A0l(), c04434v.A09(), c04434v.A0A()));
                        }

                        @Override // com.facebook.ads.redexgen.core.AbstractC1968mZ
                        public final com.facebook.ads.androidx.media3.common.Metadata A0R(com.facebook.ads.redexgen.core.C05509e c05509e, java.nio.ByteBuffer byteBuffer) {
                            return new com.facebook.ads.androidx.media3.common.Metadata(A00(new com.facebook.ads.redexgen.core.C04434v(byteBuffer.array(), byteBuffer.limit())));
                        }
                    };
                case 2:
                    return new com.facebook.ads.redexgen.core.AbstractC1968mZ() { // from class: com.facebook.ads.redexgen.X.94
                        public static java.lang.String[] A03 = {"LinnqKc1r0Ls5OIb", "1aWHF9GftncklZYsR1NJvylUpCZwYQhA", "WIGwItTSIaUh0S", "86hqVYxCYoyBTLzVv0XRyx6tGel5Hfof", "L8UaESXrw6FNBEuX", "ZSKLe1wjy7TzDmQANFt3bVwH52LTNoGA", "sWuUgP3CrL0lX60YF5iqvlGlBvq7Icsz", "4dV7lZySL5Inrb"};
                        public com.facebook.ads.redexgen.core.AnonymousClass53 A00;
                        public final com.facebook.ads.redexgen.core.C04434v A02 = new com.facebook.ads.redexgen.core.C04434v();
                        public final com.facebook.ads.redexgen.core.C04424u A01 = new com.facebook.ads.redexgen.core.C04424u();

                        @Override // com.facebook.ads.redexgen.core.AbstractC1968mZ
                        public final com.facebook.ads.androidx.media3.common.Metadata A0R(com.facebook.ads.redexgen.core.C05509e c05509e, java.nio.ByteBuffer byteBuffer) {
                            if (this.A00 == null || c05509e.A00 != this.A00.A04()) {
                                this.A00 = new com.facebook.ads.redexgen.core.AnonymousClass53(c05509e.A01);
                                this.A00.A05(c05509e.A01 - c05509e.A00);
                            }
                            byte[] array = byteBuffer.array();
                            int size = byteBuffer.limit();
                            this.A02.A0j(array, size);
                            this.A01.A0E(array, size);
                            this.A01.A09(39);
                            long A04 = (this.A01.A04(1) << 32) | this.A01.A04(32);
                            this.A01.A09(20);
                            int A042 = this.A01.A04(12);
                            int spliceCommandType = this.A01.A04(8);
                            com.facebook.ads.androidx.media3.common.Metadata.Entry entry = null;
                            this.A02.A0g(14);
                            switch (spliceCommandType) {
                                case 0:
                                    entry = new com.facebook.ads.androidx.media3.extractor.metadata.scte35.SpliceNullCommand();
                                    break;
                                case 4:
                                    entry = com.facebook.ads.androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand.A00(this.A02);
                                    break;
                                case 5:
                                    com.facebook.ads.redexgen.core.C04434v c04434v = this.A02;
                                    java.lang.String[] strArr = A03;
                                    if (strArr[0].length() == strArr[4].length()) {
                                        java.lang.String[] strArr2 = A03;
                                        strArr2[0] = "3zG9Y3L3pcSl9hsO";
                                        strArr2[4] = "rzd7tnlstbcgZZIh";
                                        entry = com.facebook.ads.androidx.media3.extractor.metadata.scte35.SpliceInsertCommand.A00(c04434v, A04, this.A00);
                                        break;
                                    } else {
                                        throw new java.lang.RuntimeException();
                                    }
                                case 6:
                                    entry = com.facebook.ads.androidx.media3.extractor.metadata.scte35.TimeSignalCommand.A01(this.A02, A04, this.A00);
                                    break;
                                case 255:
                                    entry = com.facebook.ads.androidx.media3.extractor.metadata.scte35.PrivateCommand.A00(this.A02, A042, A04);
                                    break;
                            }
                            return entry == null ? new com.facebook.ads.androidx.media3.common.Metadata(new com.facebook.ads.androidx.media3.common.Metadata.Entry[0]) : new com.facebook.ads.androidx.media3.common.Metadata(entry);
                        }
                    };
                case 3:
                    return new com.facebook.ads.redexgen.core.AbstractC1968mZ() { // from class: com.facebook.ads.redexgen.X.9c
                        public static byte[] A02;
                        public static java.lang.String[] A03 = {"Lh0eiN4oYILfPl4jy3dJZhwMArdhxg", "ZZdJzt9nksvE8tVcjKh5yb5LHp4DKBwy", "Dbw1S4FpTZ", "Q8KOrM0jMS", "", "1W", "E5bBazuIHkpw9TIkFnjV805WNgqTNchu", "VvZ"};
                        public static final java.util.regex.Pattern A04;
                        public final java.nio.charset.CharsetDecoder A01 = com.facebook.ads.redexgen.core.AbstractC1833k9.A05.newDecoder();
                        public final java.nio.charset.CharsetDecoder A00 = com.facebook.ads.redexgen.core.AbstractC1833k9.A00.newDecoder();

                        public static java.lang.String A00(int i, int i2, int i3) {
                            byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
                            for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                                copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 53);
                            }
                            return new java.lang.String(copyOfRange);
                        }

                        public static void A02() {
                            byte[] bArr = {72, 78, 75, 95, 73, 93, 71, 72, 78, 74, 95, 73, 71, 91, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.FF, 10, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.FF, 17, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.GS, 17, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.DLE, 7, 3, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.SO};
                            java.lang.String[] strArr = A03;
                            if (strArr[3].length() != strArr[2].length()) {
                                throw new java.lang.RuntimeException();
                            }
                            A03[7] = "K4Z";
                            A02 = bArr;
                        }

                        static {
                            A02();
                            A04 = java.util.regex.Pattern.compile(A00(0, 14, 85), 32);
                        }

                        private java.lang.String A01(java.nio.ByteBuffer byteBuffer) {
                            try {
                                return this.A01.decode(byteBuffer).toString();
                            } catch (java.nio.charset.CharacterCodingException unused) {
                                try {
                                    java.lang.String charBuffer = this.A00.decode(byteBuffer).toString();
                                    this.A00.reset();
                                    byteBuffer.rewind();
                                    return charBuffer;
                                } catch (java.nio.charset.CharacterCodingException unused2) {
                                    this.A00.reset();
                                    byteBuffer.rewind();
                                    return null;
                                } catch (java.lang.Throwable th) {
                                    this.A00.reset();
                                    byteBuffer.rewind();
                                    throw th;
                                }
                            } finally {
                                this.A01.reset();
                                byteBuffer.rewind();
                            }
                        }

                        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                        @Override // com.facebook.ads.redexgen.core.AbstractC1968mZ
                        public final com.facebook.ads.androidx.media3.common.Metadata A0R(com.facebook.ads.redexgen.core.C05509e c05509e, java.nio.ByteBuffer byteBuffer) {
                            char c2;
                            java.lang.String A01 = A01(byteBuffer);
                            byte[] bArr = new byte[byteBuffer.limit()];
                            byteBuffer.get(bArr);
                            if (A01 == null) {
                                return new com.facebook.ads.androidx.media3.common.Metadata(new com.facebook.ads.androidx.media3.extractor.metadata.icy.IcyInfo(bArr, null, null));
                            }
                            java.lang.String str2 = null;
                            java.lang.String name = null;
                            java.util.regex.Pattern pattern = A04;
                            java.lang.String icyString = A03[7];
                            if (icyString.length() != 3) {
                                throw new java.lang.RuntimeException();
                            }
                            A03[4] = "";
                            java.util.regex.Matcher matcher = pattern.matcher(A01);
                            for (int i = 0; matcher.find(i); i = matcher.end()) {
                                java.lang.String group = matcher.group(1);
                                java.lang.String group2 = matcher.group(2);
                                if (group != null) {
                                    java.lang.String key = com.facebook.ads.redexgen.core.AbstractC1831k7.A01(group);
                                    switch (key.hashCode()) {
                                        case -315603473:
                                            if (key.equals(A00(25, 9, 87))) {
                                                c2 = 1;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 1646559960:
                                            if (key.equals(A00(14, 11, 77))) {
                                                c2 = 0;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        default:
                                            c2 = 65535;
                                            break;
                                    }
                                    switch (c2) {
                                        case 0:
                                            str2 = group2;
                                            break;
                                        case 1:
                                            name = group2;
                                            break;
                                    }
                                }
                            }
                            return new com.facebook.ads.androidx.media3.common.Metadata(new com.facebook.ads.androidx.media3.extractor.metadata.icy.IcyInfo(bArr, str2, name));
                        }
                    };
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String mimeType5 = A00(0, 55, 68);
        throw new java.lang.IllegalArgumentException(sb.append(mimeType5).append(str).toString());
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0591Bd
    public final boolean AKN(com.facebook.ads.redexgen.core.C2196qI c2196qI) {
        java.lang.String str = c2196qI.A0W;
        java.lang.String mimeType = A00(55, 15, 85);
        if (!mimeType.equals(str)) {
            java.lang.String mimeType2 = A00(70, 18, 95);
            if (!mimeType2.equals(str)) {
                java.lang.String mimeType3 = A00(105, 20, 118);
                if (!mimeType3.equals(str)) {
                    java.lang.String mimeType4 = A00(88, 17, 73);
                    if (!mimeType4.equals(str)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
