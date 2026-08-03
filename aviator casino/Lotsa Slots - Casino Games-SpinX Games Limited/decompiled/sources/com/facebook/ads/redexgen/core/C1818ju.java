package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.ju, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1818ju implements com.facebook.ads.redexgen.core.InterfaceC0891Mw, com.facebook.ads.redexgen.core.N1 {
    public static byte[] A0C;
    public static java.lang.String[] A0D = {"axrzCdv0FVVdCRJ2G5bzsKW6gzdnjkd", "bTiRlDodVRVUvI5asAv5OrmPjdR2kQoL", "0F0kzsbgf", "9OhtkIX5JTQzZAf31yyS0L6RFdCICf7G", "a5UohLNEI7iVSyxaj4LiJgBVL6R7sy1L", "7foeJoxu0TAivWs2uWCvQbVxkZa0ERHH", "EHJaWrfXkxbvFmDXjSXoaOL8kiGJisUm", "EwwWMCMqNj"};
    public static final java.lang.String A0E;
    public int A00;
    public com.facebook.ads.redexgen.core.C1806ji A01;
    public com.facebook.ads.redexgen.core.NG A02;
    public com.facebook.ads.redexgen.core.NH A03;
    public com.facebook.ads.redexgen.core.InterfaceC1097Va A04;
    public java.util.List<com.facebook.ads.redexgen.core.UK> A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final com.facebook.ads.redexgen.core.C1636gi A0A;
    public final java.lang.String A0B;

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 27);
            if (A0D[0].length() != 31) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0D;
            strArr[4] = "ypXQoKhxcHRWJrqojmqi5sMtZ7xfThaX";
            strArr[6] = "2LOy6kLjroQDrfbojOuFHdbjLd88ORkx";
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A04() {
        A0C = new byte[]{55, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.ETB, 6, 2, 19, 4, 86, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.SUB, 4, 19, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.SI, 86, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.DC2, 19, com.google.common.base.Ascii.DC2, 86, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.ETB, 2, com.google.common.base.Ascii.ETB, 2, 45, 40, 34, 42, 97, 41, 32, 49, 49, 36, 47, 36, 37, 97, 46, 47, 97, 45, 46, 34, 42, 50, 34, 51, 36, 36, 47, 97, 32, 37, 87, 120, 125, 119, Byte.MAX_VALUE, 52, 120, 123, 115, 115, 113, 112, 119, 117, 120, 120, 113, 102, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 109, 100, 113, 46, 44, 63, 41, 46, 35, 57, 85, 87, 68, 82, 95, 88, 82, 114, 101, 58, 53, 32, kotlin.io.encoding.Base64.padSymbol, 34, 49, com.google.common.base.Ascii.FF, 17, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.VT, 100, Byte.MAX_VALUE, 120, 96, 100, 116, 88, 117, 33, 62, 50, 32};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private void A06(java.util.Map<java.lang.String, java.lang.String> map, java.util.Map<java.lang.String, java.lang.String> map2) {
        try {
            new android.os.Handler().postDelayed(new com.facebook.ads.redexgen.core.C1819jv(this, map2, A03(map)), this.A01.A09() * 1000);
        } catch (java.lang.Exception unused) {
        }
    }

    static {
        A04();
        A0E = com.facebook.ads.redexgen.core.C1818ju.class.getSimpleName();
    }

    public C1818ju(com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        this(c1636gi, new com.facebook.ads.redexgen.core.C1806ji());
    }

    public C1818ju(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.C1806ji c1806ji) {
        this.A0B = java.util.UUID.randomUUID().toString();
        this.A00 = 200;
        this.A01 = c1806ji;
        this.A0A = c1636gi;
    }

    private java.util.Map<java.lang.String, java.lang.String> A03(java.util.Map<java.lang.String, java.lang.String> map) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String A02 = A02(118, 4, 76);
        if (map.containsKey(A02)) {
            hashMap.put(A02, map.get(A02));
        }
        java.lang.String A022 = A02(102, 8, 100);
        if (map.containsKey(A022)) {
            hashMap.put(A022, map.get(A022));
        }
        return hashMap;
    }

    private void A05(com.facebook.ads.redexgen.core.C1806ji c1806ji) {
        if (!this.A06) {
            this.A01 = c1806ji;
            java.util.List<com.facebook.ads.redexgen.core.C1806ji> A0f = this.A01.A0f();
            if (A0f != null && A0f.size() > 0) {
                int size = A0f.size();
                java.util.ArrayList arrayList = new java.util.ArrayList(size);
                for (int i = 0; i < size; i++) {
                    com.facebook.ads.redexgen.core.C1818ju adapter = new com.facebook.ads.redexgen.core.C1818ju(this.A0A);
                    adapter.A05(A0f.get(i));
                    arrayList.add(new com.facebook.ads.redexgen.core.UK(this.A0A, adapter, (com.facebook.ads.redexgen.core.C1068Tx) null, this.A04));
                }
                this.A05 = arrayList;
            }
            this.A06 = true;
            this.A07 = A07();
            return;
        }
        throw new java.lang.IllegalStateException(A02(0, 27, 109));
    }

    private boolean A07() {
        return (!(this.A01.A0j() || android.text.TextUtils.isEmpty(this.A01.A0Y())) || (!android.text.TextUtils.isEmpty(this.A01.A0V()) && this.A01.A0j())) && (this.A01.A0I() != null || this.A01.A0j()) && (this.A01.A0H() != null || A8k() == com.facebook.ads.internal.protocol.AdPlacementType.NATIVE_BANNER);
    }

    public final int A08() {
        return this.A01.A02();
    }

    public final int A09() {
        return this.A01.A05();
    }

    public final int A0A() {
        int A08 = this.A01.A08();
        if (A08 < 0 || A08 > 100) {
            return 0;
        }
        return A08;
    }

    public final int A0B() {
        return this.A00;
    }

    public final int A0C() {
        return this.A01.A0B();
    }

    public final int A0D() {
        return this.A01.A0C();
    }

    public final com.facebook.ads.redexgen.core.C1806ji A0E() {
        return this.A01;
    }

    public final com.facebook.ads.redexgen.core.NG A0F() {
        return this.A02;
    }

    public final java.lang.String A0G() {
        return this.A01.A0b();
    }

    public final java.util.List<com.facebook.ads.redexgen.core.UK> A0H() {
        if (!A0R()) {
            return null;
        }
        return this.A05;
    }

    public final void A0I() {
        if (!this.A09) {
            java.lang.String A0c = A0E().A0c();
            if (A0c != null) {
                com.facebook.ads.redexgen.core.VA A0A = this.A0A.A0A();
                java.lang.String[] strArr = A0D;
                if (strArr[1].charAt(25) != strArr[3].charAt(25)) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr2 = A0D;
                strArr2[4] = "MHNGbcOaMZIG61BxjY7eI95TuiNlx0Gr";
                strArr2[6] = "kvjKrlZQ6RBIZv1Jj5ESJw4vFB55PB3z";
                A0A.AGz(A0c);
            }
            this.A09 = true;
        }
    }

    public final void A0J() {
        if (this.A05 != null && !this.A05.isEmpty()) {
            java.util.Iterator<com.facebook.ads.redexgen.core.UK> it = this.A05.iterator();
            while (it.hasNext()) {
                it.next().unregisterView();
            }
        }
    }

    public final void A0K(com.facebook.ads.redexgen.core.NG ng) {
        this.A02 = ng;
    }

    public final void A0L(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.NG ng, com.facebook.ads.redexgen.core.VA va, com.facebook.ads.redexgen.core.O8 o8, com.facebook.ads.redexgen.core.InterfaceC1097Va interfaceC1097Va) {
        int i;
        this.A02 = ng;
        this.A04 = interfaceC1097Va;
        org.json.JSONObject A03 = o8.A03();
        com.facebook.ads.redexgen.core.C1068Tx A01 = o8.A01();
        if (A01 != null) {
            i = A01.A06();
        } else {
            i = 200;
        }
        this.A00 = i;
        A05(com.facebook.ads.redexgen.core.NI.A00(c1636gi, A03, com.facebook.ads.redexgen.core.AbstractC1147Xd.A02(A03, A02(94, 2, 10))));
        if (com.facebook.ads.redexgen.core.AbstractC0892Mx.A06(c1636gi, this, va)) {
            c1636gi.A0F().A52();
            ng.AEz(this, com.facebook.ads.redexgen.core.C1108Vm.A00(com.facebook.ads.internal.protocol.AdErrorType.NO_FILL));
        } else {
            if (ng != null) {
                ng.AEw(this);
            }
            this.A03 = new com.facebook.ads.redexgen.core.NH(c1636gi, this.A0B, this, ng);
            this.A03.A02();
        }
    }

    public final void A0M(java.util.Map<java.lang.String, java.lang.String> extraData) {
        com.facebook.ads.redexgen.core.C0900Ng c0900Ng;
        if (!A0R()) {
            return;
        }
        boolean shouldBlockLockscreenClicks = com.facebook.ads.redexgen.core.C1086Up.A26(this.A0A);
        if (shouldBlockLockscreenClicks) {
            boolean shouldBlockLockscreenClicks2 = com.facebook.ads.redexgen.core.YC.A03(extraData);
            if (shouldBlockLockscreenClicks2) {
                android.util.Log.e(A0E, A02(27, 31, 90));
                return;
            }
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        if (extraData != null) {
            hashMap.putAll(extraData);
        }
        boolean shouldBlockLockscreenClicks3 = this.A01.A0j();
        if (shouldBlockLockscreenClicks3) {
            hashMap.put(A02(87, 7, 45), java.lang.String.valueOf(A0E().A04()));
            hashMap.put(A02(80, 7, 86), java.lang.String.valueOf(A0E().A03()));
        }
        hashMap.put(A02(70, 10, 15), com.facebook.ads.internal.protocol.AdPlacementType.NATIVE.name());
        hashMap.put(A02(110, 8, 10), this.A0B);
        com.facebook.ads.redexgen.core.C1636gi c1636gi = this.A0A;
        com.facebook.ads.redexgen.core.VA A0A = this.A0A.A0A();
        java.lang.String A7O = this.A01.A7O();
        android.net.Uri A0E2 = this.A01.A0E();
        if (this.A01.A0F() != null) {
            c0900Ng = this.A01.A0F().A2A();
        } else {
            c0900Ng = null;
        }
        com.facebook.ads.redexgen.core.AbstractC0888Mt A00 = com.facebook.ads.redexgen.core.C0889Mu.A00(c1636gi, A0A, A7O, A0E2, hashMap, c0900Ng);
        com.facebook.ads.redexgen.core.EnumC0885Mq enumC0885Mq = com.facebook.ads.redexgen.core.EnumC0885Mq.A09;
        if (A00 != null) {
            enumC0885Mq = A00.A0G(null);
        }
        if (enumC0885Mq != com.facebook.ads.redexgen.core.EnumC0885Mq.A06) {
            com.facebook.ads.redexgen.core.XI.A04(this.A0A, A02(58, 12, 15));
            if (this.A02 != null) {
                this.A02.AEv(this);
            }
        }
    }

    public final void A0N(java.util.Map<java.lang.String, java.lang.String> extraData) {
        this.A0A.A0A().AB6(this.A01.A7O(), extraData);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0103, code lost:
    
        if (r4 != false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A0O(java.util.Map<java.lang.String, java.lang.String> map) {
        if (A0R() && !this.A08) {
            if (this.A02 != null) {
                com.facebook.ads.redexgen.core.NG ng = this.A02;
                if (A0D[7].length() == 10) {
                    A0D[2] = "N1HzTzVNk";
                    ng.AEx(this);
                }
                throw new java.lang.RuntimeException();
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            if (map != null) {
                hashMap.putAll(map);
            }
            if (this.A01.A0j()) {
                hashMap.put(A02(87, 7, 45), java.lang.String.valueOf(A0E().A04()));
                hashMap.put(A02(80, 7, 86), java.lang.String.valueOf(A0E().A03()));
            }
            if (!android.text.TextUtils.isEmpty(A7O())) {
                if (!this.A01.A0j()) {
                    this.A0A.A0F().A3L();
                    java.lang.String A0a = this.A01.A0a();
                    java.lang.String[] strArr = A0D;
                    if (strArr[1].charAt(25) == strArr[3].charAt(25)) {
                        java.lang.String[] strArr2 = A0D;
                        strArr2[1] = "Q8Us8dZOubCsANiQB8YQBmsKLdjgWIPJ";
                        strArr2[3] = "Pg8pQUM49Vm5a0t7ebabBeivyd2Kgjff";
                        com.facebook.ads.redexgen.core.AbstractC0920Oa.A02(A0a, com.facebook.ads.redexgen.core.AbstractC1156Xm.A00(A02(96, 6, 79)));
                    }
                    throw new java.lang.RuntimeException();
                }
                this.A0A.A0A().ABJ(A7O(), hashMap);
                com.facebook.ads.redexgen.core.C1132Wl.A00(this.A0A).A0E(com.facebook.ads.internal.protocol.AdPlacementType.NATIVE.toString(), A7O());
            }
            if (!A0T()) {
                boolean A0U = A0U();
                if (A0D[2].length() == 9) {
                    A0D[2] = "BGAjHSzJz";
                }
                throw new java.lang.RuntimeException();
            }
            A06(map, hashMap);
            this.A08 = true;
        }
    }

    public final boolean A0P() {
        return true;
    }

    public final boolean A0Q() {
        return A0R() && this.A01.A0E() != null;
    }

    public final boolean A0R() {
        return this.A06 && this.A07;
    }

    public final boolean A0S() {
        return this.A01.A0i();
    }

    public final boolean A0T() {
        return com.facebook.ads.redexgen.core.C1086Up.A1b(this.A0A) && A0R() && this.A01.A0k();
    }

    public final boolean A0U() {
        return com.facebook.ads.redexgen.core.C1086Up.A1b(this.A0A) && A0R() && this.A01.A0l();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0891Mw
    public final java.lang.String A7O() {
        return this.A01.A7O();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0891Mw
    public final java.util.Collection<java.lang.String> A7p() {
        return A0E().A7p();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0891Mw
    public final com.facebook.ads.redexgen.core.EnumC0890Mv A8K() {
        return A0E().A8K();
    }

    public com.facebook.ads.internal.protocol.AdPlacementType A8k() {
        return com.facebook.ads.internal.protocol.AdPlacementType.NATIVE;
    }

    @Override // com.facebook.ads.redexgen.core.N1
    public final boolean AKL() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.N1
    public final void onDestroy() {
        if (this.A03 != null) {
            com.facebook.ads.redexgen.core.NH nh = this.A03;
            java.lang.String[] strArr = A0D;
            if (strArr[4].charAt(16) != strArr[6].charAt(16)) {
                throw new java.lang.RuntimeException();
            }
            A0D[7] = "xLZjaQWgus";
            nh.A03();
        }
    }
}
