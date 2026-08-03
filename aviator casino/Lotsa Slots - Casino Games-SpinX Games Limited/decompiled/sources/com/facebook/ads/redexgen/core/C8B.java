package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.8B, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C8B implements com.facebook.ads.redexgen.core.InterfaceC2132pF {
    public static byte[] A0M;
    public static java.lang.String[] A0N = {"gtbAICrdQ5OiLd8QtlGJkysA4GOuQAyl", "NB4BeTTq5ijHDPStUBIG2cd4hjVw3Rms", "uuMr3aWTfRr6VJnGuPPVK2CIrmsp3XMP", "Eb6am5ksZvZ5Hz0HFQHbX0NWivmHdCO7", "qnDH", "QayiUw4ouBPhcoxDO7fR8OixzHh3DuJf", "V84YazX1IDZHbq2m95FMlzDl0u9g04ST", "S22pIk311xlkEmMZRooVtOw4dNPxaWRF"};
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public android.net.Uri A05;
    public com.facebook.ads.redexgen.core.InterfaceC2132pF A06;
    public com.facebook.ads.redexgen.core.C04565i A07;
    public com.facebook.ads.redexgen.core.C04565i A08;

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization
    public com.facebook.ads.redexgen.core.ML A09;
    public com.facebook.ads.redexgen.core.MZ A0A;
    public boolean A0B;
    public boolean A0C;
    public final com.facebook.ads.redexgen.core.InterfaceC2132pF A0D;
    public final com.facebook.ads.redexgen.core.InterfaceC2132pF A0E;
    public final com.facebook.ads.redexgen.core.InterfaceC2132pF A0F;
    public final com.facebook.ads.redexgen.core.MP A0G;
    public final com.facebook.ads.redexgen.core.MS A0H;
    public final com.facebook.ads.redexgen.core.MY A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0M, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = copyOfRange[i4];
            if (A0N[4].length() == 12) {
                throw new java.lang.RuntimeException();
            }
            A0N[4] = "VXYuEglycDYgl";
            copyOfRange[i4] = (byte) ((b ^ i3) ^ 28);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A05() {
        A0M = new byte[]{com.google.common.base.Ascii.EM, 59, 57, 50, 63, com.google.common.base.Ascii.RS, 59, 46, 59, 9, 53, 47, 40, 57, 63, com.google.common.base.Ascii.SYN, 58, 32, 57, 49, 59, 114, 33, 117, 32, 37, 49, 52, 33, 48, 117, 39, 48, 49, 60, 39, 48, 54, 33, 48, 49, 117, 0, 7, com.google.common.base.Ascii.FS, 123, 117, 1, kotlin.io.encoding.Base64.padSymbol, 60, 38, 117, 56, 60, 50, kotlin.io.encoding.Base64.padSymbol, 33, 117, 54, 52, 32, 38, 48, 117, 39, 48, 57, 52, 33, 60, 35, 48, 117, 0, 7, com.google.common.base.Ascii.FS, 38, 117, 50, 48, 33, 117, 39, 48, 38, 58, 57, 35, 48, 49, 117, 60, 59, 54, 58, 39, 39, 48, 54, 33, 57, 44, 123, 95, 94, 115, 81, 83, 88, 85, 84, 114, 73, 68, 85, 67, 98, 85, 81, 84};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC2132pF
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("usage of fbDataSpecExtension and the check for isInitSegment")
    public final long AGi(com.facebook.ads.redexgen.core.C04565i c04565i) throws java.io.IOException {
        try {
            java.lang.String A4l = this.A0I.A4l(c04565i);
            com.facebook.ads.redexgen.core.C04565i A09 = c04565i.A04().A08(A4l).A09();
            this.A08 = A09;
            this.A05 = A01(this.A0G, A4l, A09.A06);
            this.A03 = c04565i.A04;
            this.A09 = new com.facebook.ads.redexgen.core.ML(c04565i.A07);
            this.A0B = A00(c04565i) != -1;
            boolean z = this.A0B;
            if (this.A0B) {
                this.A00 = -1L;
            } else {
                this.A00 = com.facebook.ads.redexgen.core.AbstractC0878Mj.A00(this.A0G.A7S(A4l));
                if (this.A00 != -1) {
                    this.A00 -= c04565i.A04;
                    if (this.A00 < 0) {
                        throw new com.facebook.ads.redexgen.core.C04495b(2008);
                    }
                }
            }
            boolean z2 = c04565i.A07.A08 <= 0 && c04565i.A07.A07 <= 0;
            if (c04565i.A03 != -1) {
                this.A00 = this.A00 == -1 ? c04565i.A03 : java.lang.Math.min(this.A00, c04565i.A03);
            }
            if (this.A00 > 0 || this.A00 == -1) {
                A06(A09, false, z2);
            }
            return c04565i.A03 != -1 ? c04565i.A03 : this.A00;
        } catch (java.lang.Throwable th) {
            A09(th);
            throw th;
        }
    }

    static {
        A05();
    }

    public C8B(com.facebook.ads.redexgen.core.MP mp, com.facebook.ads.redexgen.core.InterfaceC2132pF interfaceC2132pF, com.facebook.ads.redexgen.core.InterfaceC2132pF interfaceC2132pF2, com.facebook.ads.redexgen.core.C5W c5w, com.facebook.ads.redexgen.core.MY my, int i, com.facebook.ads.redexgen.core.AbstractC04013d abstractC04013d, int i2, com.facebook.ads.redexgen.core.MS ms) {
        this.A0G = mp;
        this.A0D = interfaceC2132pF2;
        this.A0I = my == null ? com.facebook.ads.redexgen.core.MY.A00 : my;
        this.A0J = (i & 1) != 0;
        this.A0L = (i & 2) != 0;
        this.A0K = (i & 4) != 0;
        if (interfaceC2132pF != null) {
            interfaceC2132pF = abstractC04013d != null ? new com.facebook.ads.redexgen.core.AH(interfaceC2132pF, abstractC04013d, i2) : interfaceC2132pF;
            this.A0F = interfaceC2132pF;
            this.A0E = c5w != null ? new com.facebook.ads.redexgen.core.AF(interfaceC2132pF, c5w) : null;
        } else {
            this.A0F = com.facebook.ads.redexgen.core.AI.A02;
            this.A0E = null;
        }
        this.A0H = ms;
    }

    private int A00(com.facebook.ads.redexgen.core.C04565i c04565i) {
        if (this.A0L && this.A0C) {
            return 0;
        }
        if (this.A0K && c04565i.A03 == -1) {
            return 1;
        }
        return -1;
    }

    public static android.net.Uri A01(com.facebook.ads.redexgen.core.MP mp, java.lang.String str, android.net.Uri redirectedUri) {
        android.net.Uri redirectedUri2 = com.facebook.ads.redexgen.core.AbstractC0878Mj.A01(mp.A7S(str));
        return redirectedUri2 != null ? redirectedUri2 : redirectedUri;
    }

    private void A03() throws java.io.IOException {
        if (this.A06 == null) {
            return;
        }
        try {
            this.A06.close();
            this.A07 = null;
            this.A06 = null;
            if (A0N[5].charAt(3) == 'i') {
                java.lang.String[] strArr = A0N;
                strArr[2] = "vHGwoIowQcJHPzt2zHibHrQYTuNv4ZzT";
                strArr[1] = "k7MJrtNgTHKuOTKhmFADSg5K1rHaIFar";
                if (this.A0A != null) {
                    com.facebook.ads.redexgen.core.MP mp = this.A0G;
                    if (A0N[6].charAt(29) == '4') {
                        java.lang.String[] strArr2 = A0N;
                        strArr2[2] = "npCyc8crYVBLSlKGvChDlZdzdxvHOR7S";
                        strArr2[1] = "yWpl1AKn1flVHx0rOJ2JJIdMQnxjFkRn";
                        mp.AHg(this.A0A);
                        this.A0A = null;
                        return;
                    }
                } else {
                    return;
                }
            }
            throw new java.lang.RuntimeException();
        } catch (java.lang.Throwable th) {
            this.A07 = null;
            this.A06 = null;
            if (this.A0A != null) {
                this.A0G.AHg(this.A0A);
                this.A0A = null;
            }
            throw th;
        }
    }

    private void A04() {
        if (0 != 0 && this.A04 > 0) {
            this.A0G.A7A();
            throw new java.lang.NullPointerException(A02(103, 17, 44));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c9, code lost:
    
        if (r2 != (-1)) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cb, code lost:
    
        r21.A00 = r2;
        r2 = r21.A03 + r21.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00de, code lost:
    
        if (com.facebook.ads.redexgen.core.C8B.A0N[5].charAt(3) == 'i') goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e5, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e9, code lost:
    
        com.facebook.ads.redexgen.core.C8B.A0N[3] = "iUSWGyHOgLgD9ZjfpDxtLA9tGfi2lrY2";
        com.facebook.ads.redexgen.core.C0880Ml.A00(r5, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e6, code lost:
    
        if (r2 != (-1)) goto L39;
     */
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Parameter isInitSegment and all ot is usages. Setting mFbDataSpecExtension in nextDataSpec. Call to maybeUpdateRedirectedUriMetadata at the end")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A06(com.facebook.ads.redexgen.core.C04565i c04565i, boolean z, boolean z2) throws java.io.IOException {
        com.facebook.ads.redexgen.core.MZ AKA;
        long j;
        com.facebook.ads.redexgen.core.C04565i A09;
        com.facebook.ads.redexgen.core.InterfaceC2132pF interfaceC2132pF;
        long j2;
        android.net.Uri uri;
        java.lang.String str = (java.lang.String) com.facebook.ads.redexgen.core.C5C.A0f(c04565i.A08);
        com.facebook.ads.redexgen.core.MN mn = z2 ? com.facebook.ads.redexgen.core.MN.A03 : com.facebook.ads.redexgen.core.MN.A06;
        if (this.A0B) {
            AKA = null;
        } else if (this.A0J) {
            try {
                AKA = this.A0G.AKA(str, this.A03, this.A00, mn);
            } catch (java.lang.InterruptedException unused) {
                java.lang.Thread.currentThread().interrupt();
                throw new java.io.InterruptedIOException();
            }
        } else {
            str = str;
            AKA = this.A0G.AKB(str, this.A03, this.A00, mn);
        }
        if (AKA == null) {
            interfaceC2132pF = this.A0F;
            A09 = c04565i.A04().A04(this.A03).A03(this.A00).A07(this.A09).A09();
        } else {
            boolean z3 = AKA.A05;
            java.lang.String[] strArr = A0N;
            if (strArr[0].charAt(4) == strArr[7].charAt(4)) {
                A0N[5] = "u32inRltH66jjh9yXIb3cYFcwSkjtAHW";
                if (z3) {
                    android.net.Uri fromFile = android.net.Uri.fromFile((java.io.File) com.facebook.ads.redexgen.core.C5C.A0f(AKA.A03));
                    long j3 = AKA.A02;
                    long j4 = this.A03 - j3;
                    long j5 = AKA.A01 - j4;
                    if (this.A00 != -1) {
                        j5 = java.lang.Math.min(j5, this.A00);
                    }
                    A09 = c04565i.A04().A06(fromFile).A05(j3).A04(j4).A03(j5).A07(this.A09).A09();
                    interfaceC2132pF = this.A0D;
                } else {
                    if (AKA.A04()) {
                        j = this.A00;
                    } else {
                        j = AKA.A01;
                        if (this.A00 != -1) {
                            j = java.lang.Math.min(j, this.A00);
                        }
                    }
                    A09 = c04565i.A04().A04(this.A03).A03(j).A07(this.A09).A09();
                    if (this.A0E != null) {
                        interfaceC2132pF = this.A0E;
                    } else {
                        interfaceC2132pF = this.A0F;
                        this.A0G.AHg(AKA);
                        AKA = null;
                    }
                }
            }
            throw new java.lang.RuntimeException();
        }
        boolean z4 = this.A0B;
        if (A0N[5].charAt(3) == 'i') {
            java.lang.String[] strArr2 = A0N;
            strArr2[0] = "KvC0Ia1A4x1eGi9X8aRBDgkMlzCJszIJ";
            strArr2[7] = "nNrFIIpUFsn1fqvNydhqNDEn907tEQAg";
            if (!z4 && interfaceC2132pF == this.A0F) {
                j2 = this.A03 + 102400;
            } else {
                j2 = Long.MAX_VALUE;
            }
            this.A01 = j2;
            if (z) {
                com.facebook.ads.redexgen.core.AbstractC04203y.A08(A0A());
                com.facebook.ads.redexgen.core.InterfaceC2132pF interfaceC2132pF2 = this.A0F;
                if (A0N[3].charAt(26) == 'u') {
                    java.lang.Throwable e = new java.lang.RuntimeException();
                    throw e;
                }
                A0N[5] = "8XoiTPgLcR8ApVu7jrAIE2ygde6TsOz1";
                if (interfaceC2132pF == interfaceC2132pF2) {
                    return;
                }
                try {
                    A03();
                } catch (java.lang.Throwable th) {
                    if (((com.facebook.ads.redexgen.core.MZ) com.facebook.ads.redexgen.core.C5C.A0f(AKA)).A03()) {
                        this.A0G.AHg(AKA);
                    }
                    throw th;
                }
            }
            if (AKA != null && AKA.A03()) {
                this.A0A = AKA;
            }
            this.A06 = interfaceC2132pF;
            this.A07 = A09;
            this.A02 = 0L;
            long AGi = interfaceC2132pF.AGi(A09);
            com.facebook.ads.redexgen.core.C0880Ml c0880Ml = new com.facebook.ads.redexgen.core.C0880Ml();
            if (A09.A03 == -1) {
                if (A0N[4].length() != 12) {
                    A0N[3] = "AihO48tXyqmUqd3oId9EAGnNfKcJ6kuS";
                }
            }
            if (A0C()) {
                this.A05 = interfaceC2132pF.A9P();
                boolean isRedirected = !c04565i.A06.equals(this.A05);
                if (A0N[4].length() != 12) {
                    A0N[4] = "aty3owKlrPhsH";
                    if (isRedirected) {
                        uri = this.A05;
                    } else {
                        uri = null;
                    }
                    com.facebook.ads.redexgen.core.C0880Ml.A01(c0880Ml, uri);
                }
            }
            if (A0D()) {
                this.A0G.A4E(str, c0880Ml);
            }
            A08(str, this.A05);
            return;
        }
        throw new java.lang.RuntimeException();
    }

    private void A07(java.lang.String str) throws java.io.IOException {
        this.A00 = 0L;
        if (A0D()) {
            com.facebook.ads.redexgen.core.C0880Ml c0880Ml = new com.facebook.ads.redexgen.core.C0880Ml();
            com.facebook.ads.redexgen.core.C0880Ml.A00(c0880Ml, this.A03);
            this.A0G.A4E(str, c0880Ml);
        }
    }

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization
    private void A08(java.lang.String str, android.net.Uri uri) {
        if (!A0D()) {
            return;
        }
        com.facebook.ads.redexgen.core.C0880Ml c0880Ml = new com.facebook.ads.redexgen.core.C0880Ml();
        if (!uri.equals(this.A05)) {
            android.net.Uri uri2 = this.A05;
            if (A0N[6].charAt(29) != '4') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0N;
            strArr[0] = "HwBuIJEC6JIKumxqgSDJ0pUKIwQFYzQv";
            strArr[7] = "1FgFIXgVQckXZ73NbznNhujKeCbi6Slt";
            com.facebook.ads.redexgen.core.C0880Ml.A01(c0880Ml, uri2);
        } else {
            com.facebook.ads.redexgen.core.C0880Ml.A01(c0880Ml, null);
        }
        try {
            this.A0G.A4E(str, c0880Ml);
        } catch (com.facebook.ads.redexgen.core.MM e) {
            java.lang.String message = A02(15, 88, 73);
            android.util.Log.w(A02(0, 15, 70), message, e);
        }
    }

    private void A09(java.lang.Throwable th) {
        if (A0B() || (th instanceof com.facebook.ads.redexgen.core.MM)) {
            this.A0C = true;
        }
    }

    private boolean A0A() {
        return this.A06 == this.A0F;
    }

    private boolean A0B() {
        return this.A06 == this.A0D;
    }

    private boolean A0C() {
        return !A0B();
    }

    private boolean A0D() {
        return this.A06 == this.A0E;
    }

    public final com.facebook.ads.redexgen.core.MP A0E() {
        return this.A0G;
    }

    public final com.facebook.ads.redexgen.core.MY A0F() {
        return this.A0I;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2132pF
    public final void A43(com.facebook.ads.redexgen.core.InterfaceC04675t interfaceC04675t) {
        com.facebook.ads.redexgen.core.AbstractC04203y.A01(interfaceC04675t);
        this.A0D.A43(interfaceC04675t);
        this.A0F.A43(interfaceC04675t);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2132pF
    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> A8t() {
        if (A0C()) {
            return this.A0F.A8t();
        }
        return java.util.Collections.emptyMap();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2132pF
    public final android.net.Uri A9P() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2132pF
    public final void close() throws java.io.IOException {
        this.A08 = null;
        this.A05 = null;
        this.A03 = 0L;
        A04();
        try {
            A03();
        } catch (java.lang.Throwable e) {
            A09(e);
            throw e;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03762c
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (i2 == 0) {
            return 0;
        }
        if (this.A00 == 0) {
            return -1;
        }
        com.facebook.ads.redexgen.core.C04565i currentDataSpec = (com.facebook.ads.redexgen.core.C04565i) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A08);
        com.facebook.ads.redexgen.core.C04565i c04565i = (com.facebook.ads.redexgen.core.C04565i) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A07);
        try {
            if (this.A03 >= this.A01) {
                A06(currentDataSpec, true, false);
            }
            try {
                int bytesRead = ((com.facebook.ads.redexgen.core.InterfaceC2132pF) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A06)).read(bArr, i, i2);
                if (bytesRead != -1) {
                    if (A0B()) {
                        this.A04 += bytesRead;
                    }
                    this.A03 += bytesRead;
                    this.A02 += bytesRead;
                    if (this.A00 != -1) {
                        this.A00 -= bytesRead;
                    }
                } else if (A0C() && (c04565i.A03 == -1 || this.A02 < c04565i.A03)) {
                    A07((java.lang.String) com.facebook.ads.redexgen.core.C5C.A0f(currentDataSpec.A08));
                } else if (this.A00 > 0 || this.A00 == -1) {
                    A03();
                    A06(currentDataSpec, false, false);
                    return read(bArr, i, i2);
                }
                return bytesRead;
            } catch (java.lang.Throwable th) {
                e = th;
                A09(e);
                throw e;
            }
        } catch (java.lang.Throwable th2) {
            e = th2;
        }
    }
}
