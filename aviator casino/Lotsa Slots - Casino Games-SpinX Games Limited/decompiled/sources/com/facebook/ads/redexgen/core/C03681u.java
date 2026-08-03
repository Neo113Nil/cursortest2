package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.1u, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C03681u implements com.facebook.ads.redexgen.core.InterfaceC0574Al {
    public static byte[] A09;
    public static java.lang.String[] A0A = {"5g", "bfnfjiUri9kvxuLEKnZU3kJc1ieY23zz", "NIX", "B1MUzprhDDigVQ4p3NlPN3VyWdkPEAJB", "UzK", "rOCmuOM4l5uJjn2akKGm2JxYL79BUlOr", "kAulvLpzcmVynuK8kNGYEaaJbNqcwElD", "7ScKsdjGN77oK2tO1d"};
    public static final java.lang.String A0B;
    public long A00;
    public com.facebook.ads.redexgen.core.InterfaceC2242rK A01;
    public final com.facebook.ads.redexgen.core.InterfaceC2241rJ A02;
    public final com.facebook.ads.redexgen.core.C2234rB A03;
    public final com.facebook.ads.redexgen.core.C2234rB A04;
    public final java.util.List<android.graphics.Rect> A05;
    public final java.util.Map<java.lang.String, com.facebook.ads.redexgen.core.C2233rA> A06;
    public final boolean A07;
    public final boolean A08;

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A09, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            java.lang.String[] strArr = A0A;
            if (strArr[3].charAt(2) == strArr[1].charAt(2)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0A;
            strArr2[5] = "GBjOApmdB9meVYu3h8dWYwSrfWPE5QmB";
            strArr2[6] = "rSzbUr5mB5cqWCHa6t40U5C3uIAdU8ry";
            if (i4 >= length) {
                return new java.lang.String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 73);
            i4++;
        }
    }

    public static void A03() {
        A09 = new byte[]{com.google.common.base.Ascii.DC4, 40, 41, 51, 96, 54, 41, 37, 55, 48, 47, 41, 46, 52, 96, 40, 33, 51, 96, 46, 47, 52, 96, 34, 37, 37, 46, 96, 45, 37, 33, 51, 53, 50, 37, 36, 96, 47, 50, 96, 41, 51, 96, 33, 96, 39, 50, 47, 53, 48, 96, 55, 40, 41, 35, 40, 96, 55, 41, 44, 44, 96, 46, 37, 54, 37, 50, 96, 50, 37, 52, 53, 50, 46, 96, 33, 96, 45, 37, 33, 51, 53, 50, 37, 45, 37, 46, 52, 96, 51, 41, 46, 35, 37, 96, 41, 52, 103, 51, 96, 45, 33, 36, 37, 96, 53, 48, 96, 47, 38, 96, 51, 53, 34, 54, 41, 37, 55, 51, 96, 52, 40, 33, 52, 96, 35, 47, 53, 44, 36, 96, 34, 37, 96, 47, 38, 38, 51, 35, 50, 37, 37, 46, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.ESC, 9, 45, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.US, com.google.common.base.Ascii.DLE, kotlin.io.encoding.Base64.padSymbol, 38, 63, 63, 115, 37, 58, 54, 36, 115, 35, 33, 60, 35, 54, 33, 39, 42, 115, 53, 60, 33, 115, 33, 54, 62, 60, 37, 54, 55, 115, 58, 39, 54, 62, 115, com.google.common.base.Ascii.RS, 2, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.EM, 63, 8, com.google.common.base.Ascii.GS, 2, com.google.common.base.Ascii.US, com.google.common.base.Ascii.EM};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC0574Al
    public final void A6P(java.util.List<com.facebook.ads.redexgen.core.C2245rN<?, ?>> list) {
        java.util.Collection A00;
        java.util.Collection A002;
        if (list != null && !list.isEmpty()) {
            A06(list);
        }
        A05(this.A04);
        A04(this.A04);
        A05(this.A03);
        A04(this.A03);
        if (0 != 0) {
            java.lang.String obj = toString();
            java.util.List<android.graphics.Rect> list2 = this.A05;
            A00 = this.A04.A00();
            A002 = this.A03.A00();
            new com.facebook.ads.redexgen.core.C2232r9(obj, this, list2, A00, A002);
            throw new java.lang.NullPointerException(A02(143, 7, 55));
        }
    }

    static {
        A03();
        A0B = com.facebook.ads.redexgen.core.C03681u.class.getSimpleName();
    }

    public C03681u(com.facebook.ads.redexgen.core.InterfaceC2241rJ interfaceC2241rJ) {
        this(interfaceC2241rJ, false, false);
    }

    public C03681u(com.facebook.ads.redexgen.core.InterfaceC2241rJ interfaceC2241rJ, boolean z, boolean z2) {
        this.A06 = new java.util.HashMap();
        this.A04 = new com.facebook.ads.redexgen.core.C2234rB();
        this.A03 = new com.facebook.ads.redexgen.core.C2234rB();
        this.A05 = new java.util.ArrayList(1);
        this.A02 = interfaceC2241rJ;
        this.A08 = z;
        this.A07 = z2;
    }

    public static android.graphics.Rect A00(com.facebook.ads.redexgen.core.C2233rA c2233rA) {
        android.graphics.Rect rect;
        android.graphics.Rect rect2;
        android.graphics.Rect rect3;
        android.graphics.Rect rect4;
        android.graphics.Rect rect5;
        if (c2233rA != null) {
            rect = c2233rA.A02;
            if (rect.top != Integer.MIN_VALUE) {
                rect2 = c2233rA.A02;
                if (rect2.left != Integer.MIN_VALUE) {
                    rect3 = c2233rA.A02;
                    if (rect3.right != Integer.MIN_VALUE) {
                        rect4 = c2233rA.A02;
                        if (rect4.bottom != Integer.MIN_VALUE) {
                            rect5 = c2233rA.A02;
                            return rect5;
                        }
                    }
                }
            }
        }
        throw new java.lang.IllegalStateException(A02(0, 143, 9));
    }

    private com.facebook.ads.redexgen.core.C2233rA A01(com.facebook.ads.redexgen.core.C2245rN c2245rN, android.graphics.Rect rect, android.graphics.Rect rect2) {
        boolean A06;
        android.graphics.Rect rect3;
        java.util.List list;
        com.facebook.ads.redexgen.core.C2233rA c2233rA = this.A06.get(c2245rN.A02);
        A06 = this.A04.A06(c2245rN);
        if (A06) {
            if (c2233rA != null) {
                c2233rA.A01 = com.facebook.ads.redexgen.core.EnumC2237rE.A04;
            } else {
                c2233rA = com.facebook.ads.redexgen.core.C2233rA.A03(this.A00);
                this.A06.put(c2245rN.A02, c2233rA);
            }
        }
        if (c2233rA != null) {
            rect3 = c2233rA.A02;
            rect3.set(rect2);
            list = c2233rA.A03;
            list.add(new android.graphics.Rect(rect));
        }
        return c2233rA;
    }

    private void A04(com.facebook.ads.redexgen.core.C2234rB c2234rB) {
        java.util.Collection<com.facebook.ads.redexgen.core.C2245rN> A01;
        java.util.List list;
        A01 = c2234rB.A01();
        for (com.facebook.ads.redexgen.core.C2245rN c2245rN : A01) {
            com.facebook.ads.redexgen.core.C2233rA c2233rA = this.A06.get(c2245rN.A02);
            if (c2233rA == null) {
                if (0 != 0) {
                    java.lang.String str = A02(androidx.compose.material.TextFieldImplKt.AnimationDuration, 36, 26) + c2245rN.A02;
                    throw new java.lang.NullPointerException(A02(186, 10, 36));
                }
            } else {
                c2233rA.A01 = com.facebook.ads.redexgen.core.EnumC2237rE.A03;
                list = c2233rA.A03;
                list.clear();
                if (A07(c2245rN)) {
                    c2245rN.A03(this);
                }
                if (this.A08) {
                    this.A06.remove(c2233rA);
                }
            }
        }
    }

    private void A05(com.facebook.ads.redexgen.core.C2234rB c2234rB) {
        java.util.Collection<com.facebook.ads.redexgen.core.C2245rN> A00;
        A00 = c2234rB.A00();
        for (com.facebook.ads.redexgen.core.C2245rN visible : A00) {
            if (A07(visible)) {
                visible.A03(this);
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<?, ?> */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0004 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A06(java.util.List<com.facebook.ads.redexgen.core.C2245rN<?, ?>> list) {
        for (com.facebook.ads.redexgen.core.C2245rN<?, ?> c2245rN : list) {
            if (this.A06.get(c2245rN.A02) != null) {
                boolean z = c2245rN.A04;
                if (A0A[0].length() != 2) {
                    throw new java.lang.RuntimeException();
                }
                A0A[7] = "nPwsVC";
                if (z) {
                    com.facebook.ads.redexgen.core.EnumC2237rE enumC2237rE = c2245rN.A01;
                    java.lang.String[] strArr = A0A;
                    if (strArr[5].length() != strArr[6].length()) {
                        A0A[0] = "zj";
                        if (enumC2237rE != null) {
                            if (c2245rN.A01 == com.facebook.ads.redexgen.core.EnumC2237rE.A03) {
                                c2245rN.A03(this);
                            }
                        }
                    } else {
                        java.lang.String[] strArr2 = A0A;
                        strArr2[4] = "4Gl";
                        strArr2[2] = "t26";
                        if (enumC2237rE != null) {
                            if (c2245rN.A01 == com.facebook.ads.redexgen.core.EnumC2237rE.A03) {
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<?, ?> */
    public static boolean A07(com.facebook.ads.redexgen.core.C2245rN<?, ?> c2245rN) {
        if (c2245rN.A04) {
            com.facebook.ads.redexgen.core.EnumC2246rO enumC2246rO = c2245rN.A00;
            com.facebook.ads.redexgen.core.EnumC2246rO enumC2246rO2 = com.facebook.ads.redexgen.core.EnumC2246rO.A04;
            java.lang.String[] strArr = A0A;
            if (strArr[5].length() != strArr[6].length()) {
                throw new java.lang.RuntimeException();
            }
            A0A[7] = "iICfc1p4CYNR1vFaz";
            if (enumC2246rO == enumC2246rO2) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x009f, code lost:
    
        if (r4 != false) goto L20;
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC0574Al
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A46(com.facebook.ads.redexgen.core.C2245rN c2245rN, android.graphics.Rect rect, android.graphics.Rect rect2, boolean z) {
        boolean A06;
        android.graphics.Rect rect3;
        android.graphics.Rect rect4;
        android.graphics.Rect rect5;
        android.graphics.Rect rect6;
        android.graphics.Rect rect7;
        java.util.List list;
        android.graphics.Rect rect8;
        android.graphics.Rect rect9;
        java.util.List list2;
        A01(c2245rN, rect, rect2);
        com.facebook.ads.redexgen.core.C2245rN c2245rN2 = c2245rN.A05;
        com.facebook.ads.redexgen.core.C2245rN parentViewpointData = com.facebook.ads.redexgen.core.C2245rN.A0B;
        if (c2245rN2 == parentViewpointData || c2245rN2 == null) {
            return;
        }
        A06 = this.A03.A06(c2245rN2);
        com.facebook.ads.redexgen.core.C2233rA c2233rA = this.A06.get(c2245rN2.A02);
        if (A06) {
            if (c2233rA == null) {
                c2233rA = com.facebook.ads.redexgen.core.C2233rA.A03(this.A00);
                rect8 = c2233rA.A02;
                rect8.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
                this.A06.put(c2245rN2.A02, c2233rA);
            } else {
                list2 = c2233rA.A03;
                list2.clear();
                if (this.A07) {
                    boolean A04 = c2245rN2.A04();
                    if (A0A[0].length() != 2) {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr = A0A;
                    strArr[5] = "H54AceamXdthsYm78mtSydojeY2Fx6Sn";
                    strArr[6] = "PVfiJKIqQ6L9JP1UYx1CLIU2NiQOo1Yq";
                }
                com.facebook.ads.redexgen.core.EnumC2237rE enumC2237rE = com.facebook.ads.redexgen.core.EnumC2237rE.A04;
                if (A0A[7].length() == 26) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr2 = A0A;
                strArr2[5] = "tsuWg7tiHeCbTZ79GKvfVJLQxaexBCGH";
                strArr2[6] = "f1Y9d3aTAam6AIKjxx39fqUFlMtOCeIE";
                c2233rA.A01 = enumC2237rE;
            }
            if (z) {
                rect9 = c2233rA.A02;
                rect9.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
        } else if (z && c2233rA != null) {
            rect3 = c2233rA.A02;
            int i = rect2.left;
            rect4 = c2233rA.A02;
            int min = java.lang.Math.min(i, rect4.left);
            int i2 = rect2.top;
            rect5 = c2233rA.A02;
            int min2 = java.lang.Math.min(i2, rect5.top);
            int i3 = rect2.right;
            rect6 = c2233rA.A02;
            int max = java.lang.Math.max(i3, rect6.right);
            int i4 = rect2.bottom;
            rect7 = c2233rA.A02;
            rect3.set(min, min2, max, java.lang.Math.max(i4, rect7.bottom));
        }
        if (c2233rA == null) {
            return;
        }
        list = c2233rA.A03;
        list.add(new android.graphics.Rect(rect));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0574Al
    public final void A4h(long j, java.util.List<android.graphics.Rect> list) {
        java.util.Collection A01;
        java.util.Collection<com.facebook.ads.redexgen.core.C2245rN> A012;
        java.util.List list2;
        this.A00 = j;
        this.A05.clear();
        java.util.Iterator<android.graphics.Rect> it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            java.lang.String[] strArr = A0A;
            if (strArr[3].charAt(2) == strArr[1].charAt(2)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0A;
            strArr2[4] = "xWg";
            strArr2[2] = "l5f";
            if (hasNext) {
                this.A05.add(new android.graphics.Rect(it.next()));
            } else {
                A01 = this.A04.A01();
                java.util.Iterator it2 = A01.iterator();
                while (true) {
                    boolean hasNext2 = it2.hasNext();
                    if (A0A[0].length() == 2) {
                        java.lang.String[] strArr3 = A0A;
                        strArr3[3] = "KXc0LwnJCEJYYpq44EYPYXvj71LHxLBt";
                        strArr3[1] = "SZ9db6jeJg1WeryC8zmRUBHGUrGxU8hd";
                        if (!hasNext2) {
                            break;
                        }
                        this.A06.remove(((com.facebook.ads.redexgen.core.C2245rN) it2.next()).A02);
                    } else {
                        if (!hasNext2) {
                            break;
                        }
                        this.A06.remove(((com.facebook.ads.redexgen.core.C2245rN) it2.next()).A02);
                    }
                }
                A012 = this.A03.A01();
                if (A0A[0].length() != 2) {
                    throw new java.lang.RuntimeException();
                }
                A0A[0] = "Au";
                for (com.facebook.ads.redexgen.core.C2245rN viewpointData : A012) {
                    this.A06.remove(viewpointData.A02);
                }
                java.util.Iterator<com.facebook.ads.redexgen.core.C2233rA> it3 = this.A06.values().iterator();
                while (it3.hasNext()) {
                    list2 = it3.next().A03;
                    list2.clear();
                }
                this.A04.A04();
                this.A03.A04();
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2236rD
    public final void A8D(com.facebook.ads.redexgen.core.C2245rN c2245rN, android.graphics.Rect rect) {
        java.util.List<android.graphics.Rect> list;
        if (!this.A06.containsKey(c2245rN.A02)) {
            return;
        }
        rect.setEmpty();
        list = this.A06.get(c2245rN.A02).A03;
        for (android.graphics.Rect rect2 : list) {
            if (A0A[7].length() == 26) {
                throw new java.lang.RuntimeException();
            }
            A0A[7] = "8y";
            rect.union(rect2);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2236rD
    public final com.facebook.ads.redexgen.core.EnumC2237rE A9U(com.facebook.ads.redexgen.core.C2245rN c2245rN) {
        com.facebook.ads.redexgen.core.EnumC2237rE enumC2237rE;
        if (!this.A06.containsKey(c2245rN.A02)) {
            return com.facebook.ads.redexgen.core.EnumC2237rE.A02;
        }
        enumC2237rE = this.A06.get(c2245rN.A02).A01;
        if (c2245rN.A04) {
            if (c2245rN.A00 == com.facebook.ads.redexgen.core.EnumC2246rO.A04) {
                com.facebook.ads.redexgen.core.EnumC2237rE viewState = com.facebook.ads.redexgen.core.EnumC2237rE.A03;
                return viewState;
            }
            com.facebook.ads.redexgen.core.EnumC2237rE viewState2 = com.facebook.ads.redexgen.core.EnumC2237rE.A04;
            if (enumC2237rE == viewState2 && !c2245rN.A04()) {
                com.facebook.ads.redexgen.core.EnumC2237rE viewState3 = com.facebook.ads.redexgen.core.EnumC2237rE.A02;
                return viewState3;
            }
        }
        return enumC2237rE;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2236rD
    public final void A9W(android.graphics.Rect rect) {
        rect.setEmpty();
        java.util.Iterator<android.graphics.Rect> it = this.A05.iterator();
        while (it.hasNext()) {
            rect.union(it.next());
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2236rD
    public final float A9X(com.facebook.ads.redexgen.core.C2245rN c2245rN) {
        java.util.List<android.graphics.Rect> list;
        com.facebook.ads.redexgen.core.C2233rA c2233rA = this.A06.get(c2245rN.A02);
        if (c2233rA != null) {
            android.graphics.Rect A00 = A00(c2233rA);
            int height = A00.height() * A00.width();
            int totalVisibleArea = 0;
            list = c2233rA.A03;
            for (android.graphics.Rect rect : list) {
                totalVisibleArea += rect.height() * rect.width();
            }
            return totalVisibleArea / height;
        }
        return 0.0f;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0574Al
    public final void AJu(com.facebook.ads.redexgen.core.InterfaceC2242rK interfaceC2242rK) {
        this.A01 = interfaceC2242rK;
    }
}
