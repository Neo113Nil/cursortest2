package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Sx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1042Sx {
    public static com.facebook.ads.redexgen.core.LR A0A;
    public static java.util.List<java.lang.String> A0B;
    public static byte[] A0C;
    public static java.lang.String[] A0D = {"9sbbD15", "Lu4K49mlxrSXSmjNh7fbv8QTyeXNNeG", "dxmg93Ac1Ci0DpKcQcYnCSB5QhHSt8Hl", "k6rgF4fsXLHTj2vl", "7FEQyJVT", "NWpMXisSbHx8hQWP", "4pbn9SiXGJE3zFdxdKEeQNSdsbhvbmq3", "cv"};
    public static final java.lang.String A0E;
    public static final java.util.Map<java.lang.String, com.facebook.ads.redexgen.core.LX> A0F;
    public static final java.util.Map<java.lang.String, com.facebook.ads.redexgen.core.C1044Sz> A0G;
    public long A00;
    public com.facebook.ads.redexgen.core.VI A01;
    public final com.facebook.ads.redexgen.core.C1043Sy A03;
    public final com.facebook.ads.redexgen.core.T8 A04;
    public final boolean A08;
    public final boolean A09;
    public final java.util.Map<java.lang.String, android.graphics.Bitmap> A07 = java.util.Collections.synchronizedMap(new java.util.HashMap());
    public final android.os.Handler A02 = new android.os.Handler(android.os.Looper.getMainLooper());
    public final java.util.List<java.util.concurrent.Callable<java.lang.Boolean>> A05 = new java.util.ArrayList();
    public final java.util.List<java.util.concurrent.Callable<java.lang.Boolean>> A06 = new java.util.ArrayList();

    public static java.lang.String A08(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 92);
        }
        return new java.lang.String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 7
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static java.util.concurrent.atomic.AtomicBoolean A0D(java.util.ArrayList<java.util.concurrent.Callable<java.lang.Boolean>> arrayList) {
        java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList.size());
        java.util.Iterator<java.util.concurrent.Callable<java.lang.Boolean>> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(com.facebook.ads.redexgen.core.YG.A02().submit(it.next()));
        }
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(true);
        try {
            java.util.Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                java.lang.Boolean bool = (java.lang.Boolean) ((java.util.concurrent.Future) it2.next()).get();
                atomicBoolean.set(atomicBoolean.get() && bool != null && bool.booleanValue());
            }
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
            android.util.Log.e(A0E, A08(85, 42, 126), e);
            atomicBoolean.set(false);
        }
        return atomicBoolean;
    }

    public static void A0F() {
        A0C = new byte[]{121, 42, 122, 120, 124, 44, 42, 121, 95, com.google.common.base.Ascii.VT, 92, 93, com.google.common.base.Ascii.SI, 86, 90, 10, 34, 114, 47, 35, 34, 36, 118, com.google.common.base.Ascii.VT, 41, 43, 32, 45, 104, 59, 60, 41, 58, 60, 45, 44, 102, 100, 70, 68, 79, 78, 73, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 7, 68, 72, 74, 87, 75, 66, 83, 66, 63, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.US, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.ESC, 92, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.CAN, 69, 103, 101, 110, 111, 104, 97, 38, 117, 114, 103, 116, 114, 99, 98, 40, 40, 40, 103, 90, 65, 71, 82, 86, 75, 77, 76, 2, 85, 74, 75, 78, 71, 2, 71, 90, 71, 65, 87, 86, 75, 76, 69, 2, 65, 67, 65, 74, 71, 2, 70, 77, 85, 76, 78, 77, 67, 70, 81, com.google.common.base.Ascii.FF, 66, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 66, 73, 68, 98, 78, 76, 81, 77, 68, 85, 72, 78, 79, 105, 78, 78, 74, 111, 109, 111, 100, 105, 74, 109, 101, 96, 121, 126, 105, 68, 99, 99, 103, 104, 117, 104, 110, 120, 121, 104, 101, 102, 104, 109, 119, 116, 122, Byte.MAX_VALUE, 68, 111, 114, 118, 126, 68, 118, 104, 89, 66, 69, 93};
    }

    static {
        A0F();
        A0E = com.facebook.ads.redexgen.core.C1042Sx.class.getSimpleName();
        A0F = java.util.Collections.synchronizedMap(new java.util.HashMap());
        A0G = java.util.Collections.synchronizedMap(new java.util.HashMap());
    }

    public C1042Sx(com.facebook.ads.redexgen.core.T8 t8) {
        this.A04 = t8;
        this.A03 = com.facebook.ads.redexgen.core.C1043Sy.A06(t8.A02());
        this.A08 = com.facebook.ads.redexgen.core.C1086Up.A2q(t8);
        this.A09 = com.facebook.ads.redexgen.core.C1086Up.A2z(t8, com.facebook.ads.redexgen.core.C1563fX.A03());
    }

    public static synchronized com.facebook.ads.redexgen.core.LR A03(com.facebook.ads.redexgen.core.C1632ge c1632ge) {
        com.facebook.ads.redexgen.core.LR lr;
        synchronized (com.facebook.ads.redexgen.core.C1042Sx.class) {
            if (A0A == null) {
                A0A = com.facebook.ads.redexgen.core.LS.A00(c1632ge, new com.facebook.ads.redexgen.core.LY().A00(com.facebook.ads.redexgen.core.C1086Up.A06(c1632ge)).A02(c1632ge.A05().AAO()).A01(-1).A03(com.facebook.ads.redexgen.core.C1086Up.A0p(c1632ge)).A04(com.facebook.ads.redexgen.core.C1086Up.A2y(c1632ge)).A05(), A05(c1632ge));
            }
            lr = A0A;
        }
        return lr;
    }

    public static com.facebook.ads.redexgen.core.LX A04(com.facebook.ads.redexgen.core.T8 t8, java.lang.String str) {
        com.facebook.ads.redexgen.core.LX lx = A0F.get(str);
        if (com.facebook.ads.redexgen.core.T0.A06(t8) && lx != null) {
            com.facebook.ads.redexgen.core.LX storedCacheData = new com.facebook.ads.redexgen.core.LX(lx);
            return storedCacheData;
        }
        com.facebook.ads.redexgen.core.LX storedCacheData2 = new com.facebook.ads.redexgen.core.LX(str);
        return storedCacheData2;
    }

    public static com.facebook.ads.redexgen.core.C1640gm A05(com.facebook.ads.redexgen.core.C1632ge c1632ge) {
        return new com.facebook.ads.redexgen.core.C1640gm(c1632ge);
    }

    public static synchronized java.util.List<java.lang.String> A09(com.facebook.ads.redexgen.core.T8 t8) {
        java.util.List<java.lang.String> list;
        synchronized (com.facebook.ads.redexgen.core.C1042Sx.class) {
            if (A0B == null) {
                A0B = new java.util.ArrayList();
                A0J(A0B, t8);
            }
            list = A0B;
        }
        return list;
    }

    public static /* synthetic */ java.util.Map A0A() {
        java.util.Map<java.lang.String, com.facebook.ads.redexgen.core.C1044Sz> map = A0G;
        if (A0D[7].length() == 16) {
            throw new java.lang.RuntimeException();
        }
        A0D[6] = "WjQPXn0MHZbTNsTxKlY7B5aUAaJR9kiv";
        return map;
    }

    public static void A0H(com.facebook.ads.redexgen.core.T8 t8, java.lang.String str) {
        if (com.facebook.ads.redexgen.core.T0.A06(t8) && !android.text.TextUtils.isEmpty(str)) {
            com.facebook.ads.redexgen.core.C1044Sz c1044Sz = A0G.get(str);
            if (A0D[7].length() == 16) {
                throw new java.lang.RuntimeException();
            }
            A0D[6] = "a10tGuQmEwUEP0sxRmqxEmZkNnUikCvX";
            if (c1044Sz != null) {
                c1044Sz.A00 = A08(185, 4, 118);
                com.facebook.ads.redexgen.core.C1632ge A02 = t8.A02();
                com.facebook.ads.redexgen.core.C1567fb A06 = com.facebook.ads.redexgen.core.C1567fb.A06(A02);
                java.lang.String A09 = com.facebook.ads.redexgen.core.C1567fb.A09(A02, com.facebook.ads.redexgen.core.XB.A00(str));
                if (A09 == null) {
                    A09 = str;
                }
                com.facebook.ads.redexgen.core.T0.A04(t8, c1044Sz, A06.A0J(A09));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0I(com.facebook.ads.redexgen.core.VH vh) {
        if (this.A01 == null) {
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(A08(173, 12, 71), com.facebook.ads.redexgen.core.Y1.A05(this.A00));
        this.A01.A04(vh, hashMap);
    }

    public static void A0J(java.util.List<java.lang.String> cacheDirs, com.facebook.ads.redexgen.core.T8 t8) {
        A0K(cacheDirs, com.facebook.ads.redexgen.core.C1876ks.A01(t8));
        A0K(cacheDirs, com.facebook.ads.redexgen.core.C1043Sy.A07(t8));
    }

    public static void A0K(java.util.List<java.lang.String> list, java.io.File file) {
        java.lang.String path;
        if (file == null || (path = file.getPath()) == null) {
            return;
        }
        java.lang.String path2 = A08(0, 0, 103);
        if (path != path2) {
            java.util.Locale locale = java.util.Locale.getDefault();
            java.lang.String path3 = A0D[4];
            if (path3.length() == 2) {
                throw new java.lang.RuntimeException();
            }
            A0D[4] = "BAOa9xP";
            java.lang.String path4 = path.toLowerCase(locale);
            list.add(path4);
        }
    }

    public final float A0M(java.lang.String str) {
        return this.A03.A0E(str);
    }

    public final android.graphics.Bitmap A0N(java.lang.String str) {
        return this.A07.get(str);
    }

    public final android.graphics.Bitmap A0O(java.lang.String str, int i, int i2) {
        if (this.A08) {
            com.facebook.ads.redexgen.core.LX A04 = A04(this.A04, str);
            A04.A03 = A08(185, 4, 118);
            A04.A01 = i2;
            A04.A00 = i;
            return A03(this.A04.A02()).AIe(A04, true).A00();
        }
        return this.A03.A0G(this.A04, str, i, i2, A08(169, 4, 85));
    }

    public final java.io.File A0P(java.lang.String str) {
        com.facebook.ads.redexgen.core.LX A04 = A04(this.A04, str);
        A04.A03 = A08(185, 4, 118);
        return A03(this.A04.A02()).AIf(A04);
    }

    public final java.io.File A0Q(java.lang.String str) {
        if (this.A08) {
            return A0P(str);
        }
        return this.A03.A0H(str);
    }

    public final java.lang.String A0R(java.lang.String str) {
        if (this.A08) {
            return A0S(str);
        }
        return this.A03.A0I(str);
    }

    public final java.lang.String A0S(java.lang.String str) {
        com.facebook.ads.redexgen.core.LX A04 = A04(this.A04, str);
        A04.A03 = A08(185, 4, 118);
        java.lang.String AIh = A03(this.A04.A02()).AIh(A04);
        return AIh != null ? AIh : str;
    }

    public final java.lang.String A0T(java.lang.String str) {
        if (this.A09) {
            A0H(this.A04, str);
            return str;
        }
        return A0S(str);
    }

    public final void A0U() {
        com.facebook.ads.redexgen.core.AbstractC1119Vy.A05(A08(127, 19, 125), A08(37, 16, 123), A08(16, 7, 75));
    }

    public final void A0V() {
        com.facebook.ads.redexgen.core.AbstractC1119Vy.A05(A08(146, 16, 80), A08(53, 14, 32), A08(8, 8, 50));
    }

    public final void A0W() {
        this.A07.clear();
    }

    public final void A0X(com.facebook.ads.redexgen.core.InterfaceC1034Sp interfaceC1034Sp, com.facebook.ads.redexgen.core.C1035Sq c1035Sq) {
        com.facebook.ads.redexgen.core.AbstractC1119Vy.A05(A08(162, 7, 81), A08(67, 18, 90), A08(0, 8, 20));
        this.A00 = java.lang.System.currentTimeMillis();
        com.facebook.ads.redexgen.core.T0.A02(this.A04, c1035Sq, com.facebook.ads.redexgen.core.T0.A07, A08(23, 14, 20), -1L);
        com.facebook.ads.redexgen.core.YG.A03().execute(new com.facebook.ads.redexgen.core.C1641gn(this, new java.util.ArrayList(this.A05), c1035Sq, interfaceC1034Sp, new java.util.ArrayList(this.A06)));
        this.A05.clear();
        this.A06.clear();
    }

    public final void A0Y(com.facebook.ads.redexgen.core.C1038St c1038St) {
        this.A05.add(new com.facebook.ads.redexgen.core.CallableC1039Su(this, c1038St));
    }

    public final void A0Z(com.facebook.ads.redexgen.core.C1038St c1038St) {
        c1038St.A05 = true;
        this.A06.add(new com.facebook.ads.redexgen.core.CallableC1039Su(this, c1038St));
    }

    public final void A0a(com.facebook.ads.redexgen.core.C1038St c1038St) {
        c1038St.A05 = true;
        if (this.A09) {
            this.A06.add(new com.facebook.ads.redexgen.core.CallableC1037Ss(this, c1038St));
        } else {
            this.A06.add(new com.facebook.ads.redexgen.core.CallableC1039Su(this, c1038St));
        }
    }

    public final void A0b(com.facebook.ads.redexgen.core.C1038St c1038St) {
        if (this.A09) {
            this.A05.add(new com.facebook.ads.redexgen.core.CallableC1037Ss(this, c1038St));
        } else {
            this.A05.add(new com.facebook.ads.redexgen.core.CallableC1039Su(this, c1038St));
        }
    }

    public final void A0c(com.facebook.ads.redexgen.core.C1040Sv c1040Sv) {
        com.facebook.ads.redexgen.core.CallableC1041Sw callableC1041Sw = new com.facebook.ads.redexgen.core.CallableC1041Sw(this, c1040Sv);
        if (!c1040Sv.A03) {
            this.A05.add(callableC1041Sw);
        } else {
            this.A06.add(callableC1041Sw);
        }
    }

    public final void A0d(com.facebook.ads.redexgen.core.C1040Sv c1040Sv) {
        c1040Sv.A03 = true;
        A0c(c1040Sv);
    }

    public final void A0e(com.facebook.ads.redexgen.core.VI vi) {
        this.A01 = vi;
    }
}
