package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.mc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1971mc extends com.facebook.ads.redexgen.core.AbstractC0760Hu {
    public static byte[] A03;
    public static java.lang.String[] A04 = {"hpDJt5h1KEOoxvwsMFQNYPr", "VSvt5SXm5usvlgrWoNvpXkXh8Dq", "BGFNPpHl8d5ErpIW7AfimlhS91R1U6wd", "7dPt9qHZlpxHIlw3mPQ6xbLk1XOmee", "0b", "V5zubMgZbVWtRFu8X", "n5IVAqV2SnF", "Sg4r6ty2QhZ"};
    public long A00;
    public long[] A01;
    public long[] A02;

    public static java.lang.String A04(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 92);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A0A() {
        A03 = new byte[]{-39, -22, -25, -42, -23, -34, -28, -29, -43, -40, -37, -44, -33, -34, -30, -40, -29, -40, -34, -35, -30, -32, -38, -18, -37, -25, -42, -30, -38, -24, -25, -26, -59, -35, -20, -39, -68, -39, -20, -39, 35, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.DC4, 34};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 15
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // com.facebook.ads.redexgen.core.AbstractC0760Hu
    public final boolean A0C(com.facebook.ads.redexgen.core.C04434v c04434v, long j) {
        int i;
        if (A00(c04434v) != 2) {
            return false;
        }
        java.lang.String A05 = A05(c04434v);
        if (A04[2].charAt(14) == 'f') {
            throw new java.lang.RuntimeException();
        }
        A04[2] = "yhTvZHDsLiRhvHdxFLG6a7MHjxNmCRFd";
        if (!A04(30, 10, 28).equals(A05) || c04434v.A07() == 0 || A00(c04434v) != 8) {
            return false;
        }
        java.util.HashMap<java.lang.String, java.lang.Object> A08 = A08(c04434v);
        java.lang.Object obj = A08.get(A04(0, 8, 25));
        if (obj instanceof java.lang.Double) {
            double doubleValue = ((java.lang.Double) obj).doubleValue();
            if (doubleValue > 0.0d) {
                this.A00 = (long) (doubleValue * 1000000.0d);
            }
        }
        java.lang.Object obj2 = A08.get(A04(21, 9, 25));
        if (!(obj2 instanceof java.util.Map)) {
            return false;
        }
        java.util.Map map = (java.util.Map) obj2;
        java.lang.Object obj3 = map.get(A04(8, 13, 19));
        java.lang.Object obj4 = map.get(A04(40, 5, 83));
        if (!(obj3 instanceof java.util.List) || !(obj4 instanceof java.util.List)) {
            return false;
        }
        java.util.List list = (java.util.List) obj3;
        java.util.List list2 = (java.util.List) obj4;
        int size = list2.size();
        long[] jArr = new long[size];
        if (A04[3].length() != 20) {
            A04[1] = "ycK0oDKd1FWGh";
            this.A02 = jArr;
            this.A01 = new long[size];
            i = 0;
        } else {
            A04[3] = "l8UzOy1g7iACMRm";
            this.A02 = jArr;
            this.A01 = new long[size];
            i = 0;
        }
        while (i < size) {
            java.lang.Object obj5 = list.get(i);
            java.lang.Object obj6 = list2.get(i);
            if (!(obj6 instanceof java.lang.Double) || !(obj5 instanceof java.lang.Double)) {
                this.A02 = new long[0];
                this.A01 = new long[0];
                return false;
            }
            this.A02[i] = (long) (((java.lang.Double) obj6).doubleValue() * 1000000.0d);
            this.A01[i] = ((java.lang.Double) obj5).longValue();
            i++;
        }
        return false;
    }

    static {
        A0A();
    }

    public C1971mc() {
        super(new com.facebook.ads.redexgen.core.C1988mt());
        this.A00 = -9223372036854775807L;
        this.A02 = new long[0];
        this.A01 = new long[0];
    }

    public static int A00(com.facebook.ads.redexgen.core.C04434v c04434v) {
        return c04434v.A0I();
    }

    public static java.lang.Boolean A01(com.facebook.ads.redexgen.core.C04434v c04434v) {
        return java.lang.Boolean.valueOf(c04434v.A0I() == 1);
    }

    public static java.lang.Double A02(com.facebook.ads.redexgen.core.C04434v c04434v) {
        return java.lang.Double.valueOf(java.lang.Double.longBitsToDouble(c04434v.A0P()));
    }

    public static java.lang.Object A03(com.facebook.ads.redexgen.core.C04434v c04434v, int i) {
        switch (i) {
            case 0:
                return A02(c04434v);
            case 1:
                return A01(c04434v);
            case 2:
                return A05(c04434v);
            case 3:
                return A09(c04434v);
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            default:
                return null;
            case 8:
                return A08(c04434v);
            case 10:
                return A06(c04434v);
            case 11:
                return A07(c04434v);
        }
    }

    public static java.lang.String A05(com.facebook.ads.redexgen.core.C04434v c04434v) {
        int A0M = c04434v.A0M();
        int A09 = c04434v.A09();
        c04434v.A0g(A0M);
        return new java.lang.String(c04434v.A0l(), A09, A0M);
    }

    public static java.util.ArrayList<java.lang.Object> A06(com.facebook.ads.redexgen.core.C04434v c04434v) {
        int A0L = c04434v.A0L();
        java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>(A0L);
        for (int i = 0; i < A0L; i++) {
            int count = A00(c04434v);
            java.lang.Object A032 = A03(c04434v, count);
            if (A032 != null) {
                arrayList.add(A032);
            }
        }
        return arrayList;
    }

    public static java.util.Date A07(com.facebook.ads.redexgen.core.C04434v c04434v) {
        java.util.Date date = new java.util.Date((long) A02(c04434v).doubleValue());
        c04434v.A0g(2);
        return date;
    }

    public static java.util.HashMap<java.lang.String, java.lang.Object> A08(com.facebook.ads.redexgen.core.C04434v c04434v) {
        int A0L = c04434v.A0L();
        java.util.HashMap<java.lang.String, java.lang.Object> hashMap = new java.util.HashMap<>(A0L);
        for (int i = 0; i < A0L; i++) {
            java.lang.String A05 = A05(c04434v);
            int count = A00(c04434v);
            java.lang.Object A032 = A03(c04434v, count);
            if (A032 != null) {
                hashMap.put(A05, A032);
            }
        }
        return hashMap;
    }

    public static java.util.HashMap<java.lang.String, java.lang.Object> A09(com.facebook.ads.redexgen.core.C04434v c04434v) {
        java.util.HashMap<java.lang.String, java.lang.Object> hashMap = new java.util.HashMap<>();
        while (true) {
            java.lang.String A05 = A05(c04434v);
            int A00 = A00(c04434v);
            if (A00 == 9) {
                return hashMap;
            }
            java.lang.Object A032 = A03(c04434v, A00);
            if (A032 != null) {
                hashMap.put(A05, A032);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0760Hu
    public final boolean A0B(com.facebook.ads.redexgen.core.C04434v c04434v) {
        return true;
    }

    public final long A0D() {
        return this.A00;
    }

    public final long[] A0E() {
        return this.A01;
    }

    public final long[] A0F() {
        return this.A02;
    }
}
