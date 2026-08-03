package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.kM, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1845kM implements com.facebook.ads.redexgen.core.MP {
    public static byte[] A0B;
    public static java.lang.String[] A0C = {"", "bCiwVY89t3fNm3gVh5Cta1r1ex617UD6", "2pbQHFWCVx6Uhmp9EyO9uCwpcu4x9Dl0", "32tJ4jyYWOzcf72n5Wgg62", "i6oCPG91V", "KagoX429g1hrk2zqYLocuLLyf0lslURo", "DhZpyS71VRHuUy7Qk1AUkZm91VAyIgrZ", "oeCQOWeJcqbtbEq5qioytyhoePvaJg5Z"};
    public static final java.util.HashSet<java.io.File> A0D;
    public long A00;
    public long A01;
    public com.facebook.ads.redexgen.core.MM A02;
    public boolean A03;
    public final com.facebook.ads.redexgen.core.InterfaceC1851kS A04;
    public final com.facebook.ads.redexgen.core.MV A05;
    public final com.facebook.ads.redexgen.core.C0877Mi A06;
    public final java.io.File A07;
    public final java.util.HashMap<java.lang.String, java.util.ArrayList<com.facebook.ads.redexgen.core.MO>> A08;
    public final java.util.Random A09;
    public final boolean A0A;

    public static java.lang.String A04(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0B, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            java.lang.String[] strArr = A0C;
            if (strArr[3].length() == strArr[4].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0C;
            strArr2[6] = "f7QnNjNC08rjnWmNVHuGYagSWe5Lcp9o";
            strArr2[7] = "r0Bisby3rM4igG5oRpf6tXDb0tjiDQ2I";
            if (i4 >= length) {
                return new java.lang.String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 43);
            i4++;
        }
    }

    public static void A07() {
        A0B = new byte[]{110, 53, 41, 36, 99, 76, 77, 86, 74, 71, 80, 2, 113, 75, 79, 82, 78, 71, 97, 67, 65, 74, 71, 2, 75, 76, 81, 86, 67, 76, 65, 71, 2, 87, 81, 71, 81, 2, 86, 74, 71, 2, 68, 77, 78, 70, 71, 80, com.google.common.base.Ascii.CAN, 2, 114, 79, 88, 103, 91, 86, 78, 82, 69, com.google.common.base.Ascii.CR, 100, 94, 90, 71, 91, 82, 116, 86, 84, 95, 82, 126, 89, 94, 67, 35, 4, com.google.common.base.Ascii.FF, 9, 0, 1, 69, 17, 10, 69, 6, com.google.common.base.Ascii.ETB, 0, 4, 17, 0, 69, 48, 44, 33, 69, 3, com.google.common.base.Ascii.FF, 9, 0, 95, 69, com.google.common.base.Ascii.US, 56, 48, 53, 60, kotlin.io.encoding.Base64.padSymbol, 121, 45, 54, 121, 58, 43, 60, 56, 45, 60, 121, 58, 56, 58, 49, 60, 121, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.GS, 99, 121, 108, 75, 67, 70, 79, 78, 10, 94, 69, 10, 73, 88, 79, 75, 94, 79, 10, 73, 75, 73, 66, 79, 10, 78, 67, 88, 79, 73, 94, 69, 88, 83, com.google.common.base.Ascii.DLE, 10, 112, 87, 95, 90, 83, 82, com.google.common.base.Ascii.SYN, 66, 89, com.google.common.base.Ascii.SYN, 95, 88, 95, 66, 95, 87, 90, 95, 76, 83, com.google.common.base.Ascii.SYN, 85, 87, 85, 94, 83, com.google.common.base.Ascii.SYN, 95, 88, 82, 95, 85, 83, 69, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.SYN, 43, com.google.common.base.Ascii.FF, 4, 1, 8, 9, 77, com.google.common.base.Ascii.EM, 2, 77, 1, 4, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.EM, 77, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.SO, 5, 8, 77, 9, 4, com.google.common.base.Ascii.US, 8, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.EM, 2, com.google.common.base.Ascii.US, com.google.common.base.Ascii.DC4, 77, com.google.common.base.Ascii.VT, 4, 1, 8, com.google.common.base.Ascii.RS, 87, 77, 48, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.US, com.google.common.base.Ascii.SUB, 19, com.google.common.base.Ascii.DC2, 86, 2, com.google.common.base.Ascii.EM, 86, 4, 19, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.EM, 0, 19, 86, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.US, com.google.common.base.Ascii.SUB, 19, 86, com.google.common.base.Ascii.US, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.DC2, 19, com.google.common.base.Ascii.SO, 86, 19, com.google.common.base.Ascii.CAN, 2, 4, com.google.common.base.Ascii.SI, 86, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.EM, 4, 76, 86, 56, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.EM, 19, com.google.common.base.Ascii.SUB, 7, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.DLE, 17, 85, 32, 60, 49, 85, 19, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.DLE, 79, 85, 102, 92, 88, 69, 89, 80, 118, 84, 86, 93, 80, 97, 70, 93, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 91, 92, 85, com.google.common.base.Ascii.DC2, 91, 92, 86, 87, 74, com.google.common.base.Ascii.DC2, 84, 91, 94, 87, com.google.common.base.Ascii.DC2, 84, 83, 91, 94, 87, 86};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 23 out of bounds for length 22
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private void A0G(java.io.File file, boolean z, java.io.File[] fileArr, java.util.Map<java.lang.String, com.facebook.ads.redexgen.core.MU> map) {
        if (fileArr == null || fileArr.length == 0) {
            if (z) {
                return;
            }
            file.delete();
            return;
        }
        for (java.io.File file2 : fileArr) {
            if (A0C[2].charAt(26) != '8') {
                java.lang.String[] strArr = A0C;
                strArr[6] = "8aOt5QXsfRNGpIpRxoAxSAZDoaRpec1S";
                strArr[7] = "wFGX3oecQoVuPclALoyOBFGO19d1hLj7";
                java.lang.String name = file2.getName();
                if (z && name.indexOf(46) == -1) {
                    A0G(file2, false, file2.listFiles(), map);
                } else {
                    if (z) {
                        boolean A0A = com.facebook.ads.redexgen.core.C0877Mi.A0A(name);
                        if (A0C[0].length() != 2) {
                            java.lang.String[] strArr2 = A0C;
                            strArr2[3] = "SjNVVRrUmgTFjXqPeyNmbh";
                            strArr2[4] = "SAWP83LvD";
                            if (!A0A) {
                                if (name.endsWith(A04(0, 4, 107))) {
                                }
                            }
                        }
                    }
                    long j = -1;
                    long j2 = -9223372036854775807L;
                    com.facebook.ads.redexgen.core.MU remove = map != null ? map.remove(name) : null;
                    if (remove != null) {
                        j = remove.A01;
                        j2 = remove.A00;
                    }
                    com.facebook.ads.redexgen.core.C1844kL A01 = com.facebook.ads.redexgen.core.C1844kL.A01(file2, j, j2, this.A06);
                    if (A01 != null) {
                        A0C(A01);
                    } else {
                        file2.delete();
                    }
                }
            }
            throw new java.lang.RuntimeException();
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized java.util.NavigableSet<com.facebook.ads.redexgen.core.MZ> A0I(java.lang.String str) {
        com.facebook.ads.redexgen.core.C0875Mg A0C2;
        com.facebook.ads.redexgen.core.AbstractC04203y.A08(!this.A03);
        A0C2 = this.A06.A0C(str);
        return (A0C2 == null || A0C2.A09()) ? new java.util.TreeSet() : new java.util.TreeSet((java.util.Collection) A0C2.A06());
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.MP
    public final synchronized long A7B(java.lang.String str, long j, long j2) {
        long j3;
        long j4 = j;
        synchronized (this) {
            long j5 = j2 == -1 ? Long.MAX_VALUE : j4 + j2;
            if (j5 < 0) {
                j5 = Long.MAX_VALUE;
            }
            j3 = 0;
            while (j4 < j5) {
                long A7C = A7C(str, j4, j5 - j4);
                if (A7C > 0) {
                    j3 += A7C;
                } else {
                    A7C = -A7C;
                }
                j4 += A7C;
            }
        }
        return j3;
    }

    static {
        A07();
        A0D = new java.util.HashSet<>();
    }

    @java.lang.Deprecated
    public C1845kM(java.io.File file, com.facebook.ads.redexgen.core.InterfaceC1851kS interfaceC1851kS) {
        this(file, interfaceC1851kS, (byte[]) null, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1845kM(java.io.File file, com.facebook.ads.redexgen.core.InterfaceC1851kS interfaceC1851kS, com.facebook.ads.redexgen.core.C5O c5o, byte[] bArr, boolean z, boolean z2) {
        this(file, interfaceC1851kS, r1, r0);
        com.facebook.ads.redexgen.core.MV mv;
        com.facebook.ads.redexgen.core.C0877Mi c0877Mi = new com.facebook.ads.redexgen.core.C0877Mi(c5o, file, bArr, z, z2);
        if (c5o != null && !z2) {
            mv = new com.facebook.ads.redexgen.core.MV(c5o);
        } else {
            mv = null;
        }
    }

    public C1845kM(java.io.File file, com.facebook.ads.redexgen.core.InterfaceC1851kS interfaceC1851kS, com.facebook.ads.redexgen.core.C0877Mi c0877Mi, com.facebook.ads.redexgen.core.MV mv) {
        if (A0H(file)) {
            this.A07 = file;
            this.A04 = interfaceC1851kS;
            this.A06 = c0877Mi;
            this.A05 = mv;
            this.A08 = new java.util.HashMap<>();
            this.A09 = new java.util.Random();
            this.A0A = interfaceC1851kS.AIj();
            this.A01 = -1L;
            android.os.ConditionVariable conditionVariable = new android.os.ConditionVariable();
            new com.facebook.ads.redexgen.core.C0884Mp(this, A04(50, 25, 28), conditionVariable).start();
            conditionVariable.block();
            return;
        }
        throw new java.lang.IllegalStateException(A04(4, 46, 9) + file);
    }

    @java.lang.Deprecated
    public C1845kM(java.io.File file, com.facebook.ads.redexgen.core.InterfaceC1851kS interfaceC1851kS, byte[] bArr, boolean z) {
        this(file, interfaceC1851kS, null, bArr, z, true);
    }

    public static long A00(java.io.File file) throws java.io.IOException {
        long nextLong = new java.security.SecureRandom().nextLong();
        long abs = nextLong == Long.MIN_VALUE ? 0L : java.lang.Math.abs(nextLong);
        java.io.File file2 = new java.io.File(file, java.lang.Long.toString(abs, 16) + A04(0, 4, 107));
        if (file2.createNewFile()) {
            return abs;
        }
        throw new java.io.IOException(A04(75, 27, 78) + file2);
    }

    public static long A01(java.lang.String str) {
        return java.lang.Long.parseLong(str.substring(0, str.indexOf(46)), 16);
    }

    public static long A02(java.io.File[] fileArr) {
        for (java.io.File file : fileArr) {
            java.lang.String fileName = file.getName();
            if (fileName.endsWith(A04(0, 4, 107))) {
                try {
                    return A01(fileName);
                } catch (java.lang.NumberFormatException unused) {
                    com.facebook.ads.redexgen.core.AbstractC04284g.A05(A04(297, 11, 30), A04(277, 20, 94) + file);
                    file.delete();
                }
            }
        }
        return -1L;
    }

    private com.facebook.ads.redexgen.core.C1844kL A03(java.lang.String str, long j, long j2) {
        com.facebook.ads.redexgen.core.C1844kL A04;
        com.facebook.ads.redexgen.core.C0875Mg A0C2 = this.A06.A0C(str);
        if (A0C2 == null) {
            return com.facebook.ads.redexgen.core.C1844kL.A04(str, j, j2);
        }
        while (true) {
            A04 = A0C2.A04(j, j2);
            if (!A04.A05 || A04.A03.length() == A04.A01) {
                break;
            }
            A06();
        }
        return A04;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        if (!this.A07.exists()) {
            try {
                A0F(this.A07);
            } catch (com.facebook.ads.redexgen.core.MM e) {
                this.A02 = e;
                return;
            }
        }
        java.io.File file = this.A07;
        java.lang.String[] strArr = A0C;
        if (strArr[6].charAt(20) == strArr[7].charAt(20)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0C;
        strArr2[1] = "a7bsaZYeTJGewaTpvlEBtyxkDQTMEU8W";
        strArr2[5] = "kn4PmWwOChlyCy8qyQNRjkcz1fm49U24";
        java.io.File[] listFiles = file.listFiles();
        java.lang.String A04 = A04(297, 11, 30);
        if (listFiles == null) {
            java.lang.String str = A04(200, 38, 70) + this.A07;
            com.facebook.ads.redexgen.core.AbstractC04284g.A05(A04, str);
            this.A02 = new com.facebook.ads.redexgen.core.MM(str);
            return;
        }
        this.A01 = A02(listFiles);
        if (this.A01 == -1) {
            try {
                this.A01 = A00(this.A07);
            } catch (java.io.IOException e2) {
                java.lang.String str2 = A04(102, 28, 114) + this.A07;
                com.facebook.ads.redexgen.core.AbstractC04284g.A08(A04, str2, e2);
                this.A02 = new com.facebook.ads.redexgen.core.MM(str2, e2);
                return;
            }
        }
        try {
            this.A06.A0J(this.A01);
            if (this.A05 != null) {
                this.A05.A06(this.A01);
                java.util.Map<java.lang.String, com.facebook.ads.redexgen.core.MU> A05 = this.A05.A05();
                A0G(this.A07, true, listFiles, A05);
                this.A05.A09(A05.keySet());
            } else {
                A0G(this.A07, true, listFiles, null);
            }
            this.A06.A0H();
            try {
                this.A06.A0I();
            } catch (java.io.IOException e3) {
                com.facebook.ads.redexgen.core.AbstractC04284g.A08(A04, A04(308, 25, 25), e3);
            }
        } catch (java.io.IOException e4) {
            java.lang.String str3 = A04(164, 36, 29) + this.A07;
            com.facebook.ads.redexgen.core.AbstractC04284g.A08(A04, str3, e4);
            this.A02 = new com.facebook.ads.redexgen.core.MM(str3, e4);
        }
    }

    private void A06() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<com.facebook.ads.redexgen.core.C0875Mg> it = this.A06.A0G().iterator();
        while (it.hasNext()) {
            java.util.Iterator<com.facebook.ads.redexgen.core.C1844kL> it2 = it.next().A06().iterator();
            while (it2.hasNext()) {
                com.facebook.ads.redexgen.core.C1844kL next = it2.next();
                if (next.A03.length() != next.A01) {
                    arrayList.add(next);
                }
            }
        }
        int i = 0;
        while (true) {
            int size = arrayList.size();
            java.lang.String[] strArr = A0C;
            java.lang.String str = strArr[1];
            java.lang.String str2 = strArr[5];
            int i2 = str.charAt(29);
            if (i2 != str2.charAt(29)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0C;
            strArr2[1] = "aqjjwslhzF6rAKukFAflKhlVTVCMUUBi";
            strArr2[5] = "oi6ATHfePUfqMvf6S7GQLdSJgMPLAUWw";
            if (i < size) {
                A0A((com.facebook.ads.redexgen.core.MZ) arrayList.get(i));
                i++;
            } else {
                return;
            }
        }
    }

    private final synchronized void A08() throws com.facebook.ads.redexgen.core.MM {
        if (this.A02 != null) {
            throw this.A02;
        }
    }

    private void A09(com.facebook.ads.redexgen.core.MZ mz) {
        java.util.ArrayList<com.facebook.ads.redexgen.core.MO> arrayList = this.A08.get(mz.A04);
        if (arrayList != null) {
            for (int i = arrayList.size() - 1; i >= 0; i--) {
                arrayList.get(i).AG3(this, mz);
            }
        }
        this.A04.AG3(this, mz);
    }

    private void A0A(com.facebook.ads.redexgen.core.MZ mz) {
        com.facebook.ads.redexgen.core.C0875Mg A0C2 = this.A06.A0C(mz.A04);
        if (A0C2 == null || !A0C2.A0D(mz)) {
            return;
        }
        this.A00 -= mz.A01;
        if (this.A05 != null) {
            java.lang.String name = mz.A03.getName();
            try {
                this.A05.A07(name);
            } catch (java.io.IOException unused) {
                com.facebook.ads.redexgen.core.AbstractC04284g.A07(A04(297, 11, 30), A04(238, 39, 93) + name);
            }
        }
        this.A06.A0K(A0C2.A02);
        A09(mz);
    }

    private void A0C(com.facebook.ads.redexgen.core.C1844kL c1844kL) {
        this.A06.A0D(c1844kL.A04).A08(c1844kL);
        this.A00 += c1844kL.A01;
        A0D(c1844kL);
    }

    private void A0D(com.facebook.ads.redexgen.core.C1844kL c1844kL) {
        java.util.ArrayList<com.facebook.ads.redexgen.core.MO> arrayList = this.A08.get(c1844kL.A04);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                com.facebook.ads.redexgen.core.MO mo = arrayList.get(size);
                int i = A0C[0].length();
                if (i == 2) {
                    throw new java.lang.RuntimeException();
                }
                A0C[0] = "Z81vyiSZneiyPRnyPjjjzGlAG4UB";
                mo.AG2(this, c1844kL);
            }
        }
        this.A04.AG2(this, c1844kL);
    }

    private void A0E(com.facebook.ads.redexgen.core.C1844kL c1844kL, com.facebook.ads.redexgen.core.MZ mz) {
        java.util.ArrayList<com.facebook.ads.redexgen.core.MO> arrayList = this.A08.get(c1844kL.A04);
        if (arrayList != null) {
            for (int i = arrayList.size() - 1; i >= 0; i--) {
                arrayList.get(i).AG4(this, c1844kL, mz);
            }
        }
        this.A04.AG4(this, c1844kL, mz);
    }

    public static void A0F(java.io.File file) throws com.facebook.ads.redexgen.core.MM {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        java.lang.String str = A04(130, 34, 1) + file;
        java.lang.String message = A04(297, 11, 30);
        com.facebook.ads.redexgen.core.AbstractC04284g.A05(message, str);
        throw new com.facebook.ads.redexgen.core.MM(str);
    }

    public static synchronized boolean A0H(java.io.File file) {
        boolean add;
        synchronized (com.facebook.ads.redexgen.core.C1845kM.class) {
            add = A0D.add(file.getAbsoluteFile());
        }
        return add;
    }

    @Override // com.facebook.ads.redexgen.core.MP
    public final synchronized void A4E(java.lang.String str, com.facebook.ads.redexgen.core.C0880Ml c0880Ml) throws com.facebook.ads.redexgen.core.MM {
        com.facebook.ads.redexgen.core.AbstractC04203y.A08(!this.A03);
        A08();
        this.A06.A0L(str, c0880Ml);
        try {
            this.A06.A0I();
        } catch (java.io.IOException e) {
            throw new com.facebook.ads.redexgen.core.MM(e);
        }
    }

    @Override // com.facebook.ads.redexgen.core.MP
    public final synchronized void A55(java.io.File file, long j) throws com.facebook.ads.redexgen.core.MM {
        com.facebook.ads.redexgen.core.AbstractC04203y.A08(!this.A03);
        if (file.exists()) {
            if (j == 0) {
                file.delete();
                return;
            }
            com.facebook.ads.redexgen.core.C1844kL c1844kL = (com.facebook.ads.redexgen.core.C1844kL) com.facebook.ads.redexgen.core.AbstractC04203y.A01(com.facebook.ads.redexgen.core.C1844kL.A02(file, j, this.A06));
            com.facebook.ads.redexgen.core.C0875Mg c0875Mg = (com.facebook.ads.redexgen.core.C0875Mg) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A06.A0C(c1844kL.A04));
            com.facebook.ads.redexgen.core.AbstractC04203y.A08(c0875Mg.A0B(c1844kL.A02, c1844kL.A01));
            long A00 = com.facebook.ads.redexgen.core.AbstractC0878Mj.A00(c0875Mg.A03());
            if (A00 != -1) {
                com.facebook.ads.redexgen.core.AbstractC04203y.A08(c1844kL.A02 + c1844kL.A01 <= A00);
            }
            if (this.A05 != null) {
                try {
                    this.A05.A08(file.getName(), c1844kL.A01, c1844kL.A00);
                } catch (java.io.IOException e) {
                    throw new com.facebook.ads.redexgen.core.MM(e);
                }
            }
            A0C(c1844kL);
            try {
                this.A06.A0I();
                notifyAll();
            } catch (java.io.IOException e2) {
                throw new com.facebook.ads.redexgen.core.MM(e2);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.MP
    public final synchronized long A7A() {
        com.facebook.ads.redexgen.core.AbstractC04203y.A08(!this.A03);
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.MP
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization
    public final synchronized long A7C(java.lang.String str, long j, long j2) {
        com.facebook.ads.redexgen.core.C0875Mg cachedContent;
        com.facebook.ads.redexgen.core.AbstractC04203y.A08(!this.A03);
        if (j2 == -1) {
            j2 = Long.MAX_VALUE;
        }
        cachedContent = this.A06.A0C(str);
        return cachedContent != null ? cachedContent.A02(j, j2) : -j2;
    }

    @Override // com.facebook.ads.redexgen.core.MP
    public final synchronized com.facebook.ads.redexgen.core.InterfaceC0879Mk A7S(java.lang.String str) {
        com.facebook.ads.redexgen.core.AbstractC04203y.A08(!this.A03);
        return this.A06.A0E(str);
    }

    @Override // com.facebook.ads.redexgen.core.MP
    public final synchronized void AHg(com.facebook.ads.redexgen.core.MZ mz) {
        com.facebook.ads.redexgen.core.AbstractC04203y.A08(!this.A03);
        com.facebook.ads.redexgen.core.C0875Mg c0875Mg = (com.facebook.ads.redexgen.core.C0875Mg) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A06.A0C(mz.A04));
        c0875Mg.A07(mz.A02);
        this.A06.A0K(c0875Mg.A02);
        notifyAll();
    }

    @Override // com.facebook.ads.redexgen.core.MP
    public final synchronized void AIU(java.lang.String str) {
        com.facebook.ads.redexgen.core.AbstractC04203y.A08(!this.A03);
        java.util.Iterator<com.facebook.ads.redexgen.core.MZ> it = A0I(str).iterator();
        while (it.hasNext()) {
            A0A(it.next());
        }
    }

    @Override // com.facebook.ads.redexgen.core.MP
    public final synchronized void AIV(com.facebook.ads.redexgen.core.MZ mz) {
        com.facebook.ads.redexgen.core.AbstractC04203y.A08(!this.A03);
        A0A(mz);
    }

    @Override // com.facebook.ads.redexgen.core.MP
    public final synchronized java.io.File AK8(java.lang.String str, long lastTouchTimestamp, long j) throws com.facebook.ads.redexgen.core.MM {
        com.facebook.ads.redexgen.core.C0875Mg A0C2;
        java.io.File file;
        com.facebook.ads.redexgen.core.AbstractC04203y.A08(!this.A03);
        A08();
        A0C2 = this.A06.A0C(str);
        com.facebook.ads.redexgen.core.AbstractC04203y.A01(A0C2);
        com.facebook.ads.redexgen.core.AbstractC04203y.A08(A0C2.A0B(lastTouchTimestamp, j));
        if (!this.A07.exists()) {
            A0F(this.A07);
            A06();
        }
        this.A04.AG5(this, str, lastTouchTimestamp, j);
        file = new java.io.File(this.A07, java.lang.Integer.toString(this.A09.nextInt(10)));
        if (!file.exists()) {
            A0F(file);
        }
        return com.facebook.ads.redexgen.core.C1844kL.A05(file, A0C2.A01, lastTouchTimestamp, java.lang.System.currentTimeMillis());
    }

    @Override // com.facebook.ads.redexgen.core.MP
    public final synchronized com.facebook.ads.redexgen.core.MZ AKA(java.lang.String str, long j, long j2, com.facebook.ads.redexgen.core.MN mn) throws java.lang.InterruptedException, com.facebook.ads.redexgen.core.MM {
        com.facebook.ads.redexgen.core.MZ span;
        com.facebook.ads.redexgen.core.AbstractC04203y.A08(!this.A03);
        A08();
        while (true) {
            span = AKB(str, j, j2, mn);
            if (span == null) {
                wait();
            }
        }
        return span;
    }

    @Override // com.facebook.ads.redexgen.core.MP
    public final synchronized com.facebook.ads.redexgen.core.C1844kL AKB(java.lang.String str, long j, long j2, com.facebook.ads.redexgen.core.MN mn) throws com.facebook.ads.redexgen.core.MM {
        com.facebook.ads.redexgen.core.AbstractC04203y.A08(!this.A03);
        A08();
        com.facebook.ads.redexgen.core.C1844kL A03 = A03(str, j, j2);
        if (A03.A05) {
            com.facebook.ads.redexgen.core.C1844kL span = this.A06.A0C(str).A05(A03, A03.A00, false);
            A0E(A03, span);
            return span;
        }
        if (this.A06.A0D(str).A0C(j, A03.A01)) {
            return A03;
        }
        return null;
    }
}
