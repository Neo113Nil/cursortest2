package com.facebook.ads.redexgen.core;

@com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("OculusDefaultDataSource extends this class and hence cannot be final")
/* loaded from: assets/audience_network/classes2.dex */
public final class AP implements com.facebook.ads.redexgen.core.InterfaceC2132pF {
    public static byte[] A0B;
    public static java.lang.String[] A0C = {"tGdrGbTKqUAyZjAtECCaXso437TIFtay", "xasvTmVCH4LeG7al8p8ObQF4UIpko", "linuVDi59rGKxPba8cSgrQfx0g5xcZS0", "EsZJycHVVsXuEv", "at8NLtJKkPgo1aJyGFOZsbSRJOLI96cu", "TOIRSmJtL8rNzzbss9LVqHyYWtEEJZpF", "R6ga9urJMlxgk01j3rMsq3yEpAD", "8pNo6y0"};
    public com.facebook.ads.redexgen.core.InterfaceC2132pF A00;
    public com.facebook.ads.redexgen.core.InterfaceC2132pF A01;
    public com.facebook.ads.redexgen.core.InterfaceC2132pF A02;
    public com.facebook.ads.redexgen.core.InterfaceC2132pF A03;
    public com.facebook.ads.redexgen.core.InterfaceC2132pF A04;
    public com.facebook.ads.redexgen.core.InterfaceC2132pF A05;
    public com.facebook.ads.redexgen.core.InterfaceC2132pF A06;

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("OculusDefaultDataSource accesses this field directly")
    public com.facebook.ads.redexgen.core.InterfaceC2132pF A07;
    public final com.facebook.ads.redexgen.core.InterfaceC2132pF A08;

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("OculusDefaultDataSource accesses this field directly")
    public final android.content.Context A09;

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("OculusDefaultDataSource accesses this field directly")
    public final java.util.List<com.facebook.ads.redexgen.core.InterfaceC04675t> A0A = new java.util.ArrayList();

    public static java.lang.String A07(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 6);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A08() {
        A0B = new byte[]{com.google.common.base.Ascii.CAN, 86, 89, 83, 69, 88, 94, 83, 104, 86, 68, 68, 82, 67, com.google.common.base.Ascii.CAN, 76, 121, 121, 104, 96, 125, 121, 100, 99, 106, 45, 121, 98, 45, 125, 97, 108, 116, 45, 95, 89, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 93, 45, 126, 121, Byte.MAX_VALUE, 104, 108, 96, 45, 122, 100, 121, 101, 98, 120, 121, 45, 105, 104, 125, 104, 99, 105, 100, 99, 106, 45, 98, 99, 45, 121, 101, 104, 45, 95, 89, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 93, 45, 104, 117, 121, 104, 99, 126, 100, 98, 99, 83, 114, 113, 118, 98, 123, 99, 83, 118, 99, 118, 68, 120, 98, 101, 116, 114, 7, 48, 48, 45, 48, 98, 43, 44, 49, 54, 35, 44, 54, 43, 35, 54, 43, 44, 37, 98, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.DC2, 98, 39, 58, 54, 39, 44, 49, 43, 45, 44, 70, 73, 67, 85, 72, 78, 67, 9, 85, 66, 84, 72, 82, 85, 68, 66, 48, 34, 34, 52, 37, 38, 42, 40, 107, 35, 36, 38, 32, 39, 42, 42, 46, 107, 36, 33, 54, 107, 34, 42, 42, 34, 41, 32, 107, 36, 43, 33, 55, 42, 44, 33, 107, 32, kotlin.io.encoding.Base64.padSymbol, 42, 53, 41, 36, 60, 32, 55, 119, 107, 32, kotlin.io.encoding.Base64.padSymbol, 49, 107, 55, 49, 40, 53, 107, com.google.common.base.Ascii.ETB, 49, 40, 53, 1, 36, 49, 36, com.google.common.base.Ascii.SYN, 42, 48, 55, 38, 32, com.google.common.base.Ascii.FF, 0, 1, com.google.common.base.Ascii.ESC, 10, 1, com.google.common.base.Ascii.ESC, 63, 58, 47, 58, 51, 32, 54, 51, 36, 50, 46, 52, 51, 34, 36, 75, 77, 84, 73, 70, 87, 67};
    }

    static {
        A08();
    }

    public AP(android.content.Context context, com.facebook.ads.redexgen.core.InterfaceC2132pF interfaceC2132pF) {
        this.A09 = context.getApplicationContext();
        this.A08 = (com.facebook.ads.redexgen.core.InterfaceC2132pF) com.facebook.ads.redexgen.core.AbstractC04203y.A01(interfaceC2132pF);
    }

    private com.facebook.ads.redexgen.core.InterfaceC2132pF A00() {
        if (this.A00 == null) {
            final android.content.Context context = this.A09;
            this.A00 = new com.facebook.ads.redexgen.core.AQ(context) { // from class: com.facebook.ads.redexgen.X.1n
                public static byte[] A05;
                public static java.lang.String[] A06 = {"PTz87XAKzq7jvDXOa", "sgpUZ", "Bde9N92B9PLOW1wkk", "DRZuAIPcc", "gakZC5ePxUI2GDKV9", "pz9vQcEWFJbuREE6smExYo368tZlwkrG", "j43UPSzsV7IrH", "51Zh85ddLdY4jrUIDlK8L"};
                public long A00;
                public android.net.Uri A01;
                public java.io.InputStream A02;
                public boolean A03;
                public final android.content.res.AssetManager A04;

                public static java.lang.String A00(int i, int i2, int i3) {
                    byte[] copyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
                    for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                        int i5 = (copyOfRange[i4] ^ i3) ^ 113;
                        java.lang.String[] strArr = A06;
                        if (strArr[2].length() != strArr[4].length()) {
                            throw new java.lang.RuntimeException();
                        }
                        A06[1] = "rCVU";
                        copyOfRange[i4] = (byte) i5;
                    }
                    return new java.lang.String(copyOfRange);
                }

                public static void A01() {
                    A05 = new byte[]{124, 116, 58, 53, 63, 41, 52, 50, 63, 4, 58, 40, 40, 62, 47, 116};
                }

                /* JADX WARN: Failed to parse debug info
                java.lang.ArrayIndexOutOfBoundsException
                 */
                @Override // com.facebook.ads.redexgen.core.InterfaceC2132pF
                public final long AGi(com.facebook.ads.redexgen.core.C04565i c04565i) throws com.facebook.ads.redexgen.core.C2134pH {
                    try {
                        this.A01 = c04565i.A06;
                        java.lang.String str = (java.lang.String) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A01.getPath());
                        boolean startsWith = str.startsWith(A00(1, 15, 42));
                        java.lang.String[] strArr = A06;
                        if (strArr[2].length() == strArr[4].length()) {
                            java.lang.String[] strArr2 = A06;
                            strArr2[2] = "3xdRIl55zUe0UeQhp";
                            strArr2[4] = "pS29hwepCfn47vExr";
                            if (startsWith) {
                                str = str.substring(15);
                            } else if (str.startsWith(A00(0, 1, 34))) {
                                str = str.substring(1);
                            }
                            A0G(c04565i);
                            this.A02 = this.A04.open(str, 1);
                            if (this.A02.skip(c04565i.A04) < c04565i.A04) {
                                throw new com.facebook.ads.redexgen.core.C2134pH(null, 2008);
                            }
                            if (c04565i.A03 != -1) {
                                this.A00 = c04565i.A03;
                            } else {
                                this.A00 = this.A02.available();
                                if (this.A00 == 2147483647L) {
                                    this.A00 = -1L;
                                }
                            }
                            this.A03 = true;
                            A0H(c04565i);
                            return this.A00;
                        }
                    } catch (com.facebook.ads.redexgen.core.C2134pH e) {
                        throw e;
                    } catch (java.io.IOException e2) {
                        boolean z = e2 instanceof java.io.FileNotFoundException;
                        if (A06[6].length() == 13) {
                            A06[6] = "P3wDYI6sXfUMf";
                            throw new com.facebook.ads.redexgen.core.C2134pH(e2, z ? 2005 : 2000);
                        }
                    }
                    throw new java.lang.RuntimeException();
                }

                static {
                    A01();
                }

                {
                    super(false);
                    this.A04 = context.getAssets();
                }

                @Override // com.facebook.ads.redexgen.core.InterfaceC2132pF
                public final android.net.Uri A9P() {
                    return this.A01;
                }

                @Override // com.facebook.ads.redexgen.core.InterfaceC2132pF
                public final void close() throws com.facebook.ads.redexgen.core.C2134pH {
                    this.A01 = null;
                    try {
                        try {
                            if (this.A02 != null) {
                                this.A02.close();
                            }
                        } catch (java.io.IOException e) {
                            throw new com.facebook.ads.redexgen.core.C2134pH(e, 2000);
                        }
                    } finally {
                        this.A02 = null;
                        if (this.A03) {
                            this.A03 = false;
                            A0E();
                        }
                    }
                }

                @Override // com.facebook.ads.redexgen.core.InterfaceC03762c
                public final int read(byte[] bArr, int i, int i2) throws com.facebook.ads.redexgen.core.C2134pH {
                    if (i2 == 0) {
                        return 0;
                    }
                    if (this.A00 == 0) {
                        return -1;
                    }
                    try {
                        if (this.A00 != -1) {
                            i2 = (int) java.lang.Math.min(this.A00, i2);
                        }
                        int read = ((java.io.InputStream) com.facebook.ads.redexgen.core.C5C.A0f(this.A02)).read(bArr, i, i2);
                        if (read == -1) {
                            return -1;
                        }
                        long j = this.A00;
                        if (A06[6].length() != 13) {
                            throw new java.lang.RuntimeException();
                        }
                        A06[6] = "7Z6S4bUZVA19c";
                        if (j != -1) {
                            this.A00 -= read;
                        }
                        A0F(read);
                        return read;
                    } catch (java.io.IOException e) {
                        throw new com.facebook.ads.redexgen.core.C2134pH(e, 2000);
                    }
                }
            };
            A09(this.A00);
        }
        return this.A00;
    }

    private com.facebook.ads.redexgen.core.InterfaceC2132pF A01() {
        if (this.A01 == null) {
            final android.content.Context context = this.A09;
            this.A01 = new com.facebook.ads.redexgen.core.AQ(context) { // from class: com.facebook.ads.redexgen.X.1m
                public static byte[] A06;
                public static java.lang.String[] A07 = {"2ftN4rqyMzReasXlS0Bd7yvXq4Z2w8Rd", "SB3v1XRSpovCjfjTdx7anKa7xqXJKcRT", "XVjCn6r7eDTGJtLvngTS2wgt8nCOhnB8", "1Z3zzaFrxDlwod4BzGavHrSG6vNvtkR5", "UgcL11Y1AQOJlkVRTNTymNMOAMwNhJW2", "NkTGPgJcqOjwrAzhjPkYXMY7OTNaeVTG", "UuxCrg9I54LtW8vlxqROWB7HyIfBI135", "4rxicH75x32fMwhdD1obBcUBdLwTm4oP"};
                public long A00;
                public android.content.res.AssetFileDescriptor A01;
                public android.net.Uri A02;
                public java.io.FileInputStream A03;
                public boolean A04;
                public final android.content.ContentResolver A05;

                public static java.lang.String A00(int i, int i2, int i3) {
                    byte[] copyOfRange = java.util.Arrays.copyOfRange(A06, i, i + i2);
                    for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                        copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 87);
                    }
                    return new java.lang.String(copyOfRange);
                }

                public static void A01() {
                    A06 = new byte[]{-76, -71, -76, 10, 54, 60, 51, 43, -25, 53, 54, 59, -25, 54, 55, 44, 53, -25, 45, 48, 51, 44, -25, 43, 44, 58, 42, 57, 48, 55, 59, 54, 57, -25, 45, 54, 57, 1, -25, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.SI, -39, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.SUB, 33, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.GS, -39, com.google.common.base.Ascii.DLE, 35, com.google.common.base.Ascii.US, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.FF, -39, -20, -18, -18, -16, -5, -1, 10, -6, -3, -12, -14, -12, -7, -20, -9, 10, -8, -16, -17, -12, -20, 10, -15, -6, -3, -8, -20, -1, -70, -58, -59, -53, -68, -59, -53, 1};
                }

                /* JADX WARN: Code restructure failed: missing block: B:46:0x010e, code lost:
                
                    if (r0 >= 0) goto L39;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:48:0x016d, code lost:
                
                    throw new com.facebook.ads.redexgen.core.C2133pG(null, 2008);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:50:0x012a, code lost:
                
                    if (r0 >= 0) goto L39;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:55:0x00e4, code lost:
                
                    if (r0 >= 0) goto L39;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:57:0x0176, code lost:
                
                    throw new com.facebook.ads.redexgen.core.C2133pG(null, 2008);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:59:0x00ee, code lost:
                
                    if (r0 >= 0) goto L39;
                 */
                /* JADX WARN: Failed to parse debug info
                java.lang.ArrayIndexOutOfBoundsException: Index 23 out of bounds for length 15
                	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
                	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
                	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
                	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
                	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
                 */
                @Override // com.facebook.ads.redexgen.core.InterfaceC2132pF
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final long AGi(com.facebook.ads.redexgen.core.C04565i c04565i) throws com.facebook.ads.redexgen.core.C2133pG {
                    android.content.res.AssetFileDescriptor openAssetFileDescriptor;
                    try {
                        try {
                            android.net.Uri uri = c04565i.A06;
                            this.A02 = uri;
                            A0G(c04565i);
                            if (A00(90, 7, 0).equals(c04565i.A06.getScheme())) {
                                android.os.Bundle bundle = new android.os.Bundle();
                                bundle.putBoolean(A00(39, 51, 84), true);
                                openAssetFileDescriptor = this.A05.openTypedAssetFileDescriptor(uri, A00(0, 3, 51), bundle);
                            } else {
                                openAssetFileDescriptor = this.A05.openAssetFileDescriptor(uri, A00(97, 1, 56));
                            }
                            this.A01 = openAssetFileDescriptor;
                            if (openAssetFileDescriptor == null) {
                                try {
                                    throw new com.facebook.ads.redexgen.core.C2133pG(new java.io.IOException(A00(3, 36, 112) + uri), 2000);
                                } catch (java.io.IOException e) {
                                    e = e;
                                    throw new com.facebook.ads.redexgen.core.C2133pG(e, e instanceof java.io.FileNotFoundException ? 2005 : 2000);
                                }
                            }
                            long length = openAssetFileDescriptor.getLength();
                            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                            this.A03 = fileInputStream;
                            if (length != -1 && c04565i.A04 > length) {
                                throw new com.facebook.ads.redexgen.core.C2133pG(null, 2008);
                            }
                            long startOffset = openAssetFileDescriptor.getStartOffset();
                            long skip = fileInputStream.skip(c04565i.A04 + startOffset) - startOffset;
                            long j = c04565i.A04;
                            java.lang.String[] strArr = A07;
                            if (strArr[0].charAt(30) == strArr[3].charAt(30)) {
                                java.lang.String[] strArr2 = A07;
                                strArr2[7] = "V2cYJorATJJITl96mEL4teMpahqL5My0";
                                strArr2[2] = "81QpsL8o4R3JZzZywbg9Kxgu0WDTOmHd";
                                if (skip != j) {
                                    throw new com.facebook.ads.redexgen.core.C2133pG(null, 2008);
                                }
                                if (length == -1) {
                                    java.nio.channels.FileChannel channel = fileInputStream.getChannel();
                                    long size = channel.size();
                                    if (size == 0) {
                                        this.A00 = -1L;
                                    } else {
                                        this.A00 = size - channel.position();
                                        long j2 = this.A00;
                                        if (A07[5].charAt(20) != 'X') {
                                            java.lang.String[] strArr3 = A07;
                                            strArr3[7] = "o4lencYzmcLYt1MiV6fFEBYqoofjVCYJ";
                                            strArr3[2] = "LnRaAWOGUoCClb3L4bo6XdN18ipe8ADC";
                                        } else {
                                            A07[1] = "bSHOsa59vSpVf4yTu8YpmIN0mXabJXNA";
                                        }
                                    }
                                } else {
                                    this.A00 = length - skip;
                                    long j3 = this.A00;
                                    if (A07[5].charAt(20) != 'X') {
                                        A07[5] = "bEcLXKtmUZe87exD27VZX6tOwUTS9Sez";
                                    } else {
                                        A07[1] = "HQINqvWzgwxijb9Tl3Os5Fu0qA3gaNYz";
                                    }
                                }
                                long j4 = c04565i.A03;
                                if (A07[5].charAt(20) == 'X') {
                                    java.lang.String[] strArr4 = A07;
                                    strArr4[0] = "HMZNFKbBHMEnP71uJIxHqXthvd44tlRl";
                                    strArr4[3] = "eoHh6GrHY21TbtSwRzT9Dqoif9pbqNR5";
                                    if (j4 != -1) {
                                        this.A00 = this.A00 == -1 ? c04565i.A03 : java.lang.Math.min(this.A00, c04565i.A03);
                                    }
                                    this.A04 = true;
                                    A0H(c04565i);
                                    return c04565i.A03 != -1 ? c04565i.A03 : this.A00;
                                }
                            }
                            throw new java.lang.RuntimeException();
                        } catch (java.io.IOException e2) {
                            e = e2;
                        }
                    } catch (com.facebook.ads.redexgen.core.C2133pG e3) {
                        throw e3;
                    }
                }

                static {
                    A01();
                }

                {
                    super(false);
                    this.A05 = context.getContentResolver();
                }

                @Override // com.facebook.ads.redexgen.core.InterfaceC2132pF
                public final android.net.Uri A9P() {
                    return this.A02;
                }

                @Override // com.facebook.ads.redexgen.core.InterfaceC2132pF
                public final void close() throws com.facebook.ads.redexgen.core.C2133pG {
                    this.A02 = null;
                    try {
                        try {
                            if (this.A03 != null) {
                                this.A03.close();
                            }
                            this.A03 = null;
                            try {
                                try {
                                    if (this.A01 != null) {
                                        this.A01.close();
                                    }
                                } catch (java.io.IOException e) {
                                    throw new com.facebook.ads.redexgen.core.C2133pG(e, 2000);
                                }
                            } finally {
                                this.A01 = null;
                                if (this.A04) {
                                    this.A04 = false;
                                    A0E();
                                }
                            }
                        } catch (java.io.IOException e2) {
                            throw new com.facebook.ads.redexgen.core.C2133pG(e2, 2000);
                        }
                    } catch (java.lang.Throwable th) {
                        this.A03 = null;
                        try {
                            try {
                                if (this.A01 != null) {
                                    this.A01.close();
                                }
                                this.A01 = null;
                                if (this.A04) {
                                    this.A04 = false;
                                    A0E();
                                }
                                throw th;
                            } catch (java.io.IOException e3) {
                                throw new com.facebook.ads.redexgen.core.C2133pG(e3, 2000);
                            }
                        } finally {
                            this.A01 = null;
                            if (this.A04) {
                                this.A04 = false;
                                A0E();
                            }
                        }
                    }
                }

                @Override // com.facebook.ads.redexgen.core.InterfaceC03762c
                public final int read(byte[] bArr, int i, int i2) throws com.facebook.ads.redexgen.core.C2133pG {
                    if (i2 == 0) {
                        return 0;
                    }
                    long j = this.A00;
                    if (A07[1].charAt(15) != 'T') {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr = A07;
                    strArr[0] = "xrRDl1n0HP8M9562uVsbLDb97IGJJORF";
                    strArr[3] = "BxGqKYmJPgWUa88HGr5IfMWzChfrhfRY";
                    if (j == 0) {
                        return -1;
                    }
                    try {
                        if (this.A00 != -1) {
                            i2 = (int) java.lang.Math.min(this.A00, i2);
                        }
                        int read = ((java.io.FileInputStream) com.facebook.ads.redexgen.core.C5C.A0f(this.A03)).read(bArr, i, i2);
                        if (read == -1) {
                            return -1;
                        }
                        if (this.A00 != -1) {
                            this.A00 -= read;
                        }
                        A0F(read);
                        return read;
                    } catch (java.io.IOException e) {
                        throw new com.facebook.ads.redexgen.core.C2133pG(e, 2000);
                    }
                }
            };
            A09(this.A01);
        }
        return this.A01;
    }

    private com.facebook.ads.redexgen.core.InterfaceC2132pF A02() {
        if (this.A02 == null) {
            this.A02 = new com.facebook.ads.redexgen.core.AQ() { // from class: com.facebook.ads.redexgen.X.1l
                public static byte[] A04;
                public int A00;
                public int A01;
                public com.facebook.ads.redexgen.core.C04565i A02;
                public byte[] A03;

                static {
                    A01();
                }

                public static java.lang.String A00(int i, int i2, int i3) {
                    byte[] copyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
                    for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                        copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 120);
                    }
                    return new java.lang.String(copyOfRange);
                }

                public static void A01() {
                    A04 = new byte[]{-17, 48, 87, 86, 104, 90, 43, 41, 58, 103, 103, 100, 103, com.google.common.base.Ascii.NAK, 108, 93, 94, 97, 90, com.google.common.base.Ascii.NAK, 101, 86, 103, 104, 94, 99, 92, com.google.common.base.Ascii.NAK, 55, 86, 104, 90, 43, 41, com.google.common.base.Ascii.NAK, 90, 99, 88, 100, 89, 90, 89, com.google.common.base.Ascii.NAK, 104, 105, 103, 94, 99, 92, 47, com.google.common.base.Ascii.NAK, -23, 2, -7, com.google.common.base.Ascii.FF, 4, -7, -9, 8, -7, -8, -76, -23, -26, -35, -76, -6, 3, 6, 1, -11, 8, -50, -76, 60, 85, 90, 92, 87, 87, 86, 89, 91, 76, 75, 7, 90, 74, 79, 76, 84, 76, 33, 7, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.SYN, 41, com.google.common.base.Ascii.SYN};
                }

                @Override // com.facebook.ads.redexgen.core.InterfaceC2132pF
                public final android.net.Uri A9P() {
                    if (this.A02 != null) {
                        return this.A02.A06;
                    }
                    return null;
                }

                @Override // com.facebook.ads.redexgen.core.InterfaceC2132pF
                public final long AGi(com.facebook.ads.redexgen.core.C04565i c04565i) throws java.io.IOException {
                    A0G(c04565i);
                    this.A02 = c04565i;
                    android.net.Uri uri = c04565i.A06;
                    java.lang.String scheme = uri.getScheme();
                    com.facebook.ads.redexgen.core.AbstractC04203y.A09(A00(94, 4, 61).equals(scheme), A00(74, 20, 111) + scheme);
                    java.lang.String[] uriParts = com.facebook.ads.redexgen.core.C5C.A1O(uri.getSchemeSpecificPart(), A00(0, 1, 75));
                    if (uriParts.length == 2) {
                        java.lang.String str = uriParts[1];
                        java.lang.String dataString = uriParts[0];
                        if (dataString.contains(A00(1, 7, 125))) {
                            try {
                                this.A03 = android.util.Base64.decode(str, 0);
                            } catch (java.lang.IllegalArgumentException e) {
                                throw com.facebook.ads.redexgen.core.C3K.A02(A00(8, 43, 125) + str, e);
                            }
                        } else {
                            this.A03 = com.facebook.ads.redexgen.core.C5C.A1G(java.net.URLDecoder.decode(str, com.facebook.ads.redexgen.core.AbstractC1833k9.A01.name()));
                        }
                        if (c04565i.A04 <= this.A03.length) {
                            this.A01 = (int) c04565i.A04;
                            this.A00 = this.A03.length - this.A01;
                            if (c04565i.A03 != -1) {
                                this.A00 = (int) java.lang.Math.min(this.A00, c04565i.A03);
                            }
                            A0H(c04565i);
                            return c04565i.A03 != -1 ? c04565i.A03 : this.A00;
                        }
                        this.A03 = null;
                        throw new com.facebook.ads.redexgen.core.C04495b(2008);
                    }
                    throw com.facebook.ads.redexgen.core.C3K.A02(A00(51, 23, 28) + uri, null);
                }

                @Override // com.facebook.ads.redexgen.core.InterfaceC2132pF
                public final void close() {
                    if (this.A03 != null) {
                        this.A03 = null;
                        A0E();
                    }
                    this.A02 = null;
                }

                @Override // com.facebook.ads.redexgen.core.InterfaceC03762c
                public final int read(byte[] bArr, int i, int i2) {
                    if (i2 == 0) {
                        return 0;
                    }
                    if (this.A00 == 0) {
                        return -1;
                    }
                    int min = java.lang.Math.min(i2, this.A00);
                    java.lang.System.arraycopy(com.facebook.ads.redexgen.core.C5C.A0f(this.A03), this.A01, bArr, i, min);
                    this.A01 += min;
                    this.A00 -= min;
                    A0F(min);
                    return min;
                }
            };
            A09(this.A02);
        }
        return this.A02;
    }

    private com.facebook.ads.redexgen.core.InterfaceC2132pF A03() {
        if (this.A03 == null) {
            this.A03 = new com.facebook.ads.redexgen.core.C03571j();
            A09(this.A03);
        }
        return this.A03;
    }

    private com.facebook.ads.redexgen.core.InterfaceC2132pF A04() {
        if (this.A04 == null) {
            final android.content.Context context = this.A09;
            this.A04 = new com.facebook.ads.redexgen.core.AQ(context) { // from class: com.facebook.ads.redexgen.X.1i
                public static byte[] A07;
                public static java.lang.String[] A08 = {"QLuP8Pt4KiB", "RgtlFkBshe2uzsEMObMvf6GLE9oju0kX", "TTP1lITjIL7gpSd4kE", "ZIRCIqgztw3RRTH34yg2MmGGdHBG3Sqw", "W8lxrl5W", "1BP9Supp2XIZ7aBeV", "CPoLKetsO3XScG5XHhoA5", com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ};
                public long A00;
                public android.content.res.AssetFileDescriptor A01;
                public android.net.Uri A02;
                public java.io.InputStream A03;
                public boolean A04;
                public final android.content.res.Resources A05;
                public final java.lang.String A06;

                public static java.lang.String A00(int i, int i2, int i3) {
                    byte[] copyOfRange = java.util.Arrays.copyOfRange(A07, i, i + i2);
                    for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                        copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 127);
                    }
                    return new java.lang.String(copyOfRange);
                }

                public static void A01() {
                    A07 = new byte[]{105, 54, 72, 99, 105, 45, 98, 107, 45, 126, 121, Byte.MAX_VALUE, 104, 108, 96, 45, Byte.MAX_VALUE, 104, 108, 110, 101, 104, 105, 45, 101, 108, 123, 100, 99, 106, 45, 99, 98, 121, 45, Byte.MAX_VALUE, 104, 108, 105, 45, 126, 120, 107, 107, 100, 110, 100, 104, 99, 121, 45, 105, 108, 121, 108, 35, 122, 77, 91, 71, 93, 90, 75, 77, 8, 65, 76, 77, 70, 92, 65, 78, 65, 77, 90, 8, 69, 93, 91, 92, 8, 74, 77, 8, 73, 70, 8, 65, 70, 92, 77, 79, 77, 90, 6, com.google.common.base.Ascii.ESC, 44, 58, 38, 60, 59, 42, 44, 105, 32, 58, 105, 42, 38, 36, 57, 59, 44, 58, 58, 44, 45, 115, 105, 50, 5, 19, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.DC2, 3, 5, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.DC4, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 6, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.SO, 4, 78, 115, 116, 111, 6, 75, 83, 85, 82, 6, 67, 79, 82, 78, 67, 84, 6, 83, 85, 67, 6, 85, 69, 78, 67, 75, 67, 6, 84, 71, 81, 84, 67, 85, 73, 83, 84, 69, 67, 6, 73, 84, 6, 71, 72, 66, 84, 73, 79, 66, 8, 84, 67, 85, 73, 83, 84, 69, 67, 114, 74, 5, 98, 109, 103, 113, 108, 106, 103, 45, 113, 102, 112, 108, 118, 113, 96, 102, 69, 86, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 92, 79, 89, 92, 75, 93, 65, 91, 92, 77, 75};
                }

                /* JADX WARN: Code restructure failed: missing block: B:101:0x0116, code lost:
                
                    if (r1 != 0) goto L25;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:22:0x00f7, code lost:
                
                    if (r1 != 0) goto L25;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:99:0x0260, code lost:
                
                    throw new com.facebook.ads.redexgen.core.C2120p3(A00(119, 19, 31), null, 2005);
                 */
                /* JADX WARN: Failed to parse debug info
                java.lang.ArrayIndexOutOfBoundsException
                 */
                @Override // com.facebook.ads.redexgen.core.InterfaceC2132pF
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final long AGi(com.facebook.ads.redexgen.core.C04565i c04565i) throws com.facebook.ads.redexgen.core.C2120p3 {
                    int parseInt;
                    com.facebook.ads.redexgen.core.C03561i c03561i;
                    android.net.Uri uri = c04565i.A06;
                    this.A02 = uri;
                    try {
                        try {
                            if (!android.text.TextUtils.equals(A00(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, 11, 81), uri.getScheme())) {
                                java.lang.String scheme = uri.getScheme();
                                java.lang.String[] strArr = A08;
                                if (strArr[1].charAt(14) != strArr[3].charAt(14)) {
                                    java.lang.String[] strArr2 = A08;
                                    strArr2[4] = "6WAfCQCC";
                                    strArr2[5] = "2bXUndVpRAzh6SBol";
                                    java.lang.String A00 = A00(199, 16, 124);
                                    if (!android.text.TextUtils.equals(A00, scheme) || uri.getPathSegments().size() != 1 || !((java.lang.String) com.facebook.ads.redexgen.core.AbstractC04203y.A01(uri.getLastPathSegment())).matches(A00(196, 3, 81))) {
                                        if (!android.text.TextUtils.equals(A00, uri.getScheme())) {
                                            throw new com.facebook.ads.redexgen.core.C2120p3(A00(138, 58, 89), null, 1004);
                                        }
                                        java.lang.String str = (java.lang.String) com.facebook.ads.redexgen.core.AbstractC04203y.A01(uri.getPath());
                                        if (str.startsWith(A00(0, 1, 57))) {
                                            str = str.substring(1);
                                        }
                                        java.lang.String host = uri.getHost();
                                        java.lang.String str2 = (android.text.TextUtils.isEmpty(host) ? A00(0, 0, 29) : host + A00(1, 1, 115)) + str;
                                        android.content.res.Resources resources = this.A05;
                                        java.lang.String str3 = this.A06;
                                        if (A08[6].length() != 1) {
                                            java.lang.String[] strArr3 = A08;
                                            strArr3[1] = "8DRS4lLYfMrToLqDwLXqvfchHPsueWE2";
                                            strArr3[3] = "vCWitTtlDB9EwPvV6O7ut3igyg5fSS64";
                                            parseInt = resources.getIdentifier(str2, A00(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, 3, 72), str3);
                                        } else {
                                            java.lang.String[] strArr4 = A08;
                                            strArr4[7] = androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS;
                                            strArr4[2] = "wipKq4bcm9KT4pACcA";
                                            parseInt = resources.getIdentifier(str2, A00(10, 1, 58), str3);
                                        }
                                    }
                                }
                                throw new java.lang.RuntimeException();
                            }
                            android.content.res.AssetFileDescriptor openRawResourceFd = this.A05.openRawResourceFd(parseInt);
                            this.A01 = openRawResourceFd;
                            if (openRawResourceFd == null) {
                                throw new com.facebook.ads.redexgen.core.C2120p3(A00(95, 24, 54) + uri, null, 2000);
                            }
                            long length = openRawResourceFd.getLength();
                            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(openRawResourceFd.getFileDescriptor());
                            this.A03 = fileInputStream;
                            if (length != -1) {
                                try {
                                    if (c04565i.A04 > length) {
                                        throw new com.facebook.ads.redexgen.core.C2120p3(null, null, 2008);
                                    }
                                } catch (com.facebook.ads.redexgen.core.C2120p3 e) {
                                    throw e;
                                } catch (java.io.IOException e2) {
                                    e = e2;
                                    throw new com.facebook.ads.redexgen.core.C2120p3(null, e, 2000);
                                }
                            }
                            try {
                                long startOffset = openRawResourceFd.getStartOffset();
                                long skip = fileInputStream.skip(c04565i.A04 + startOffset) - startOffset;
                                try {
                                } catch (com.facebook.ads.redexgen.core.C2120p3 e3) {
                                    throw e3;
                                } catch (java.io.IOException e4) {
                                    e = e4;
                                }
                                try {
                                    if (skip != c04565i.A04) {
                                        throw new com.facebook.ads.redexgen.core.C2120p3(null, null, 2008);
                                    }
                                    if (length == -1) {
                                        java.nio.channels.FileChannel channel = fileInputStream.getChannel();
                                        if (channel.size() == 0) {
                                            c03561i = this;
                                            c03561i.A00 = -1L;
                                        } else {
                                            c03561i = this;
                                            c03561i.A00 = channel.size() - channel.position();
                                            if (c03561i.A00 < 0) {
                                                throw new com.facebook.ads.redexgen.core.C2120p3(null, null, 2008);
                                            }
                                        }
                                    } else {
                                        c03561i = this;
                                        c03561i.A00 = length - skip;
                                        if (c03561i.A00 < 0) {
                                            throw new com.facebook.ads.redexgen.core.C04495b(2008);
                                        }
                                    }
                                    long j = c04565i.A03;
                                    java.lang.String[] strArr5 = A08;
                                    if (strArr5[7].length() != strArr5[2].length()) {
                                        A08[0] = com.fyber.inneractive.sdk.external.InneractiveMediationDefs.GENDER_FEMALE;
                                        if (j != -1) {
                                            c03561i.A00 = c03561i.A00 == -1 ? c04565i.A03 : java.lang.Math.min(c03561i.A00, c04565i.A03);
                                        }
                                        c03561i.A04 = true;
                                        A0H(c04565i);
                                        return c04565i.A03 != -1 ? c04565i.A03 : c03561i.A00;
                                    }
                                    throw new java.lang.RuntimeException();
                                } catch (com.facebook.ads.redexgen.core.C2120p3 e5) {
                                    throw e5;
                                } catch (java.io.IOException e6) {
                                    e = e6;
                                    throw new com.facebook.ads.redexgen.core.C2120p3(null, e, 2000);
                                }
                            } catch (com.facebook.ads.redexgen.core.C2120p3 e7) {
                                throw e7;
                            } catch (java.io.IOException e8) {
                                e = e8;
                            }
                        } catch (android.content.res.Resources.NotFoundException e9) {
                            throw new com.facebook.ads.redexgen.core.C2120p3(null, e9, 2005);
                        }
                        parseInt = java.lang.Integer.parseInt((java.lang.String) com.facebook.ads.redexgen.core.AbstractC04203y.A01(uri.getLastPathSegment()));
                        A0G(c04565i);
                    } catch (java.lang.NumberFormatException unused) {
                        throw new com.facebook.ads.redexgen.core.C2120p3(A00(56, 39, 87), null, 1004);
                    }
                }

                static {
                    A01();
                }

                {
                    super(false);
                    this.A05 = context.getResources();
                    this.A06 = context.getPackageName();
                }

                @Override // com.facebook.ads.redexgen.core.InterfaceC2132pF
                public final android.net.Uri A9P() {
                    return this.A02;
                }

                @Override // com.facebook.ads.redexgen.core.InterfaceC2132pF
                public final void close() throws com.facebook.ads.redexgen.core.C2120p3 {
                    this.A02 = null;
                    try {
                        try {
                            if (this.A03 != null) {
                                this.A03.close();
                            }
                            this.A03 = null;
                            try {
                                try {
                                    if (this.A01 != null) {
                                        this.A01.close();
                                    }
                                } catch (java.io.IOException e) {
                                    throw new com.facebook.ads.redexgen.core.C2120p3(null, e, 2000);
                                }
                            } catch (java.lang.Throwable th) {
                                this.A01 = null;
                                java.lang.String[] strArr = A08;
                                if (strArr[1].charAt(14) == strArr[3].charAt(14)) {
                                    throw new java.lang.RuntimeException();
                                }
                                A08[6] = "iC26zNxzLLnB2GH7qyOIGlAQhGgRPuU";
                                if (this.A04) {
                                    this.A04 = false;
                                    A0E();
                                }
                                throw th;
                            }
                        } catch (java.io.IOException e2) {
                            throw new com.facebook.ads.redexgen.core.C2120p3(null, e2, 2000);
                        }
                    } catch (java.lang.Throwable th2) {
                        this.A03 = null;
                        try {
                            try {
                                if (this.A01 != null) {
                                    this.A01.close();
                                }
                                this.A01 = null;
                                if (this.A04) {
                                    this.A04 = false;
                                    A0E();
                                }
                                throw th2;
                            } catch (java.io.IOException e3) {
                                throw new com.facebook.ads.redexgen.core.C2120p3(null, e3, 2000);
                            }
                        } finally {
                            this.A01 = null;
                            if (this.A04) {
                                this.A04 = false;
                                A0E();
                            }
                        }
                    }
                }

                @Override // com.facebook.ads.redexgen.core.InterfaceC03762c
                public final int read(byte[] bArr, int i, int i2) throws com.facebook.ads.redexgen.core.C2120p3 {
                    if (i2 == 0) {
                        return 0;
                    }
                    if (this.A00 == 0) {
                        return -1;
                    }
                    try {
                        if (this.A00 != -1) {
                            i2 = (int) java.lang.Math.min(this.A00, i2);
                        }
                        int read = ((java.io.InputStream) com.facebook.ads.redexgen.core.C5C.A0f(this.A03)).read(bArr, i, i2);
                        if (read == -1) {
                            if (this.A00 == -1) {
                                return -1;
                            }
                            throw new com.facebook.ads.redexgen.core.C2120p3(A00(2, 54, 114), new java.io.EOFException(), 2000);
                        }
                        if (this.A00 != -1) {
                            this.A00 -= read;
                        }
                        A0F(read);
                        return read;
                    } catch (java.io.IOException e) {
                        throw new com.facebook.ads.redexgen.core.C2120p3(null, e, 2000);
                    }
                }
            };
            A09(this.A04);
        }
        return this.A04;
    }

    private com.facebook.ads.redexgen.core.InterfaceC2132pF A05() {
        if (this.A05 == null) {
            try {
                this.A05 = (com.facebook.ads.redexgen.core.InterfaceC2132pF) java.lang.Class.forName(A07(157, 66, 67)).getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
                A09(this.A05);
            } catch (java.lang.ClassNotFoundException unused) {
                com.facebook.ads.redexgen.core.AbstractC04284g.A07(A07(85, 17, 17), A07(15, 70, 11));
            } catch (java.lang.Exception e) {
                throw new java.lang.RuntimeException(A07(102, 34, 68), e);
            }
            if (this.A05 == null) {
                this.A05 = this.A08;
            }
        }
        return this.A05;
    }

    private com.facebook.ads.redexgen.core.InterfaceC2132pF A06() {
        if (this.A06 == null) {
            this.A06 = new com.facebook.ads.redexgen.core.C03551h();
            A09(this.A06);
        }
        return this.A06;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A09(com.facebook.ads.redexgen.core.InterfaceC2132pF interfaceC2132pF) {
        for (int i = 0; i < i; i++) {
            interfaceC2132pF.A43(this.A0A.get(i));
        }
    }

    private void A0A(com.facebook.ads.redexgen.core.InterfaceC2132pF interfaceC2132pF, com.facebook.ads.redexgen.core.InterfaceC04675t interfaceC04675t) {
        if (interfaceC2132pF != null) {
            interfaceC2132pF.A43(interfaceC04675t);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2132pF
    public final void A43(com.facebook.ads.redexgen.core.InterfaceC04675t interfaceC04675t) {
        com.facebook.ads.redexgen.core.AbstractC04203y.A01(interfaceC04675t);
        this.A08.A43(interfaceC04675t);
        this.A0A.add(interfaceC04675t);
        A0A(this.A03, interfaceC04675t);
        A0A(this.A00, interfaceC04675t);
        A0A(this.A01, interfaceC04675t);
        A0A(this.A05, interfaceC04675t);
        A0A(this.A06, interfaceC04675t);
        A0A(this.A02, interfaceC04675t);
        A0A(this.A04, interfaceC04675t);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2132pF
    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> A8t() {
        return this.A07 == null ? java.util.Collections.emptyMap() : this.A07.A8t();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2132pF
    public final android.net.Uri A9P() {
        if (this.A07 == null) {
            return null;
        }
        return this.A07.A9P();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2132pF
    public final long AGi(com.facebook.ads.redexgen.core.C04565i c04565i) throws java.io.IOException {
        com.facebook.ads.redexgen.core.AbstractC04203y.A08(this.A07 == null);
        java.lang.String scheme = c04565i.A06.getScheme();
        if (com.facebook.ads.redexgen.core.C5C.A1A(c04565i.A06)) {
            java.lang.String path = c04565i.A06.getPath();
            if (path != null) {
                java.lang.String[] strArr = A0C;
                java.lang.String uriPath = strArr[4];
                if (uriPath.charAt(27) != strArr[0].charAt(27)) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr2 = A0C;
                strArr2[4] = "woaZ3GsQ3DbiayOrUPjNVqqq8n8IT0aY";
                strArr2[0] = "klzvMTRWbU3yZvxB9bRoGsioUmbI9kjx";
                java.lang.String scheme2 = A07(0, 15, 49);
                if (path.startsWith(scheme2)) {
                    com.facebook.ads.redexgen.core.InterfaceC2132pF A00 = A00();
                    java.lang.String[] strArr3 = A0C;
                    java.lang.String uriPath2 = strArr3[4];
                    if (uriPath2.charAt(27) != strArr3[0].charAt(27)) {
                        java.lang.String[] strArr4 = A0C;
                        strArr4[1] = "PIVfyqk1Etrv0Wbxq4vDpVOoMCV7O";
                        strArr4[7] = "Bsp2dR1";
                        this.A07 = A00;
                    } else {
                        java.lang.String[] strArr5 = A0C;
                        strArr5[1] = "maZBVk5L4nnlZEqCNC7SxmxFjkMbb";
                        strArr5[7] = "XTvzFpJ";
                        this.A07 = A00;
                    }
                }
            }
            this.A07 = A03();
        } else {
            java.lang.String scheme3 = A07(com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION, 5, 87);
            if (scheme3.equals(scheme)) {
                this.A07 = A00();
            } else {
                java.lang.String scheme4 = A07(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 7, 105);
                if (scheme4.equals(scheme)) {
                    this.A07 = A01();
                } else {
                    java.lang.String scheme5 = A07(245, 4, 63);
                    if (scheme5.equals(scheme)) {
                        this.A07 = A05();
                    } else {
                        java.lang.String scheme6 = A07(249, 3, 53);
                        if (scheme6.equals(scheme)) {
                            this.A07 = A06();
                        } else {
                            java.lang.String scheme7 = A07(230, 4, 93);
                            if (scheme7.equals(scheme)) {
                                this.A07 = A02();
                            } else {
                                java.lang.String scheme8 = A07(234, 11, 71);
                                if (!scheme8.equals(scheme)) {
                                    java.lang.String scheme9 = A07(136, 16, 33);
                                    if (!scheme9.equals(scheme)) {
                                        this.A07 = this.A08;
                                    }
                                }
                                this.A07 = A04();
                            }
                        }
                    }
                }
            }
        }
        return this.A07.AGi(c04565i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2132pF
    public final void close() throws java.io.IOException {
        if (this.A07 != null) {
            try {
                this.A07.close();
            } finally {
                this.A07 = null;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03762c
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        return ((com.facebook.ads.redexgen.core.InterfaceC2132pF) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A07)).read(bArr, i, i2);
    }
}
