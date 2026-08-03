package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.rF, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2238rF {
    public static byte[] A0H;
    public static java.lang.String[] A0I = {"hvB6Y5lFyDpOUo5WE2d6RBuRXgbY5ZUm", "NE", "ywY8EvofFV55395JkJDayoeTErGWKbkG", "zJ8LsRBLLSys8CPHp", "gH0zTalybZGhm0qBmcsXdCP28l4r1an9", "kduBCn7ltQGfodptcqURcnO6EcdnH0I2", "cBbzau3JoVbeDspRwe3LG6GIj8yddyUH", "tX"};
    public com.facebook.ads.redexgen.core.InterfaceC2240rI A00;
    public boolean A01;
    public final android.graphics.Rect A02;
    public final android.graphics.Rect A03;
    public final android.os.Handler A04;
    public final com.facebook.ads.redexgen.core.InterfaceC1692hc A05;
    public final com.facebook.ads.redexgen.core.ScanDelayController A06;
    public final com.facebook.ads.redexgen.core.ViewpointAutoOcclusion A07;
    public final com.facebook.ads.redexgen.core.InterfaceC2248rQ A08;
    public final com.facebook.ads.redexgen.core.ViewpointQeConfig A09;
    public final com.facebook.ads.redexgen.core.ViewpointRegistry A0A;
    public final com.facebook.ads.redexgen.core.InterfaceC0574Al A0B;
    public final java.lang.Runnable A0C;
    public final java.util.List<android.graphics.Rect> A0D;
    public final java.util.List<com.facebook.ads.redexgen.core.DspViewableNode> A0E;
    public final java.util.List<com.facebook.ads.redexgen.core.C2245rN<?, ?>> A0F;
    public final java.util.List<android.graphics.Rect> A0G;

    public static java.lang.String A05(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0H, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 20);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A06() {
        java.lang.String[] strArr = A0I;
        if (strArr[2].charAt(24) != strArr[5].charAt(24)) {
            throw new java.lang.RuntimeException();
        }
        A0I[3] = "afzSeuF2JzxaSSSWQ";
        A0H = new byte[]{-65, -55, -91, -71, -71, -62, -53, -70, -69, -70, -53, -66, -52, -66, -51, -55, -60, -72, -75, -56, -71};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private void A0A(com.facebook.ads.redexgen.core.DspViewableNode dspViewableNode, com.facebook.ads.redexgen.core.C2245rN<?, ?> c2245rN) {
        java.util.Iterator<android.graphics.Rect> it = this.A0D.iterator();
        while (it.hasNext()) {
            if (dspViewableNode.A9Y(this.A03, this.A02, it.next()) && c2245rN != com.facebook.ads.redexgen.core.C2245rN.A0B) {
                if (A0I[0].charAt(13) == 'n') {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr = A0I;
                strArr[6] = "ovGzBU7jFj6BmSvOwlnDuwIQ8kdYWcjX";
                strArr[4] = "9Q0zz3j3tYyfuWL6OVNzyvBOA9tkBax5";
                if (0 != 0) {
                    throw new java.lang.NullPointerException(A05(0, 10, 66));
                }
                this.A0B.A46(c2245rN, this.A03, this.A02, this.A09.A01);
            }
        }
    }

    static {
        A06();
    }

    public C2238rF(com.facebook.ads.redexgen.core.ViewpointQeConfig viewpointQeConfig, com.facebook.ads.redexgen.core.InterfaceC2248rQ interfaceC2248rQ, com.facebook.ads.redexgen.core.InterfaceC1692hc interfaceC1692hc, com.facebook.ads.redexgen.core.InterfaceC0574Al interfaceC0574Al, com.facebook.ads.redexgen.core.ViewpointRegistry viewpointRegistry, com.facebook.ads.redexgen.core.ViewpointAutoOcclusion viewpointAutoOcclusion, android.os.Handler handler, com.facebook.ads.redexgen.core.ScanDelayController scanDelayController) {
        this(viewpointQeConfig, interfaceC2248rQ, interfaceC1692hc, interfaceC0574Al, viewpointRegistry, viewpointAutoOcclusion, handler, scanDelayController, 100);
    }

    public C2238rF(com.facebook.ads.redexgen.core.ViewpointQeConfig viewpointQeConfig, com.facebook.ads.redexgen.core.InterfaceC2248rQ interfaceC2248rQ, com.facebook.ads.redexgen.core.InterfaceC1692hc interfaceC1692hc, com.facebook.ads.redexgen.core.InterfaceC0574Al interfaceC0574Al, com.facebook.ads.redexgen.core.ViewpointRegistry viewpointRegistry, com.facebook.ads.redexgen.core.ViewpointAutoOcclusion viewpointAutoOcclusion, android.os.Handler handler, com.facebook.ads.redexgen.core.ScanDelayController scanDelayController, int i) {
        this.A03 = new android.graphics.Rect();
        this.A02 = new android.graphics.Rect();
        this.A0G = new java.util.ArrayList();
        this.A0E = new java.util.ArrayList();
        this.A0F = new java.util.ArrayList();
        this.A0D = new java.util.ArrayList();
        this.A01 = false;
        this.A09 = viewpointQeConfig;
        this.A08 = interfaceC2248rQ;
        this.A05 = interfaceC1692hc;
        this.A0B = interfaceC0574Al;
        this.A0A = viewpointRegistry;
        this.A07 = viewpointAutoOcclusion;
        this.A04 = handler;
        this.A06 = scanDelayController;
        this.A0C = new com.facebook.ads.redexgen.core.RunnableC2239rG(this, i, new java.lang.Exception());
    }

    public static android.app.Activity A00(android.content.Context context) {
        while (context instanceof android.content.ContextWrapper) {
            if (context instanceof android.app.Activity) {
                return (android.app.Activity) context;
            }
            context = ((android.content.ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public static /* synthetic */ com.facebook.ads.redexgen.core.ScanDelayController A03(com.facebook.ads.redexgen.core.C2238rF c2238rF) {
        return null;
    }

    private void A07(long j) {
        if (this.A0E.isEmpty()) {
            this.A08.A9Z(this.A0D);
            this.A0B.A4h(j, this.A0D);
            this.A0B.A6P(null);
            return;
        }
        throw new java.lang.IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a9, code lost:
    
        if (0 != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b9, code lost:
    
        throw new java.lang.NullPointerException(A05(15, 6, 64));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c4, code lost:
    
        r4.A0E.clear();
        r4.A0F.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ce, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c1, code lost:
    
        if (0 != 0) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void A08(long j) {
        this.A08.A9Z(this.A0D);
        this.A0B.A4h(j, this.A0D);
        if (this.A0E.isEmpty()) {
            if (this.A0F.isEmpty()) {
                this.A0A.A0A(this.A0E, this.A0F);
                for (final com.facebook.ads.redexgen.core.DspViewableNode dspViewableNode : this.A0E) {
                    if (this.A09.A00) {
                        this.A0A.A09(dspViewableNode, new com.facebook.ads.redexgen.core.AZ() { // from class: com.facebook.ads.redexgen.X.1v
                            @Override // com.facebook.ads.redexgen.core.AZ
                            public final java.lang.Object AAK(java.lang.Object obj) {
                                return com.facebook.ads.redexgen.core.C2238rF.this.A0E(dspViewableNode, (com.facebook.ads.redexgen.core.C2245rN) obj);
                            }
                        });
                    } else {
                        A0A(dspViewableNode, this.A0A.A04(dspViewableNode));
                    }
                }
                com.facebook.ads.redexgen.core.InterfaceC0574Al interfaceC0574Al = this.A0B;
                java.lang.String[] strArr = A0I;
                if (strArr[6].charAt(3) != strArr[4].charAt(3)) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr2 = A0I;
                strArr2[2] = "nrcH38GFR0AnNATGilmIDxGLEfq4UsQc";
                strArr2[5] = "6vipxWZV3AO1VWKwqmDQLGTjEEAJtLqC";
                interfaceC0574Al.A6P(this.A0F);
                if (this.A00 != null) {
                    this.A00.AFq();
                }
                java.lang.String[] strArr3 = A0I;
                if (strArr3[6].charAt(3) != strArr3[4].charAt(3)) {
                    java.lang.String[] strArr4 = A0I;
                    strArr4[2] = "ZFnmTy5Nmh2EcYlYiSa9Vz9TEA3yApsY";
                    strArr4[5] = "CtxgPYEhgpysDBKYvCBtA2zCEZrEvZYl";
                } else {
                    A0I[3] = "MnMopZnqiJPVeBF4I";
                }
            } else {
                throw new java.lang.IllegalStateException();
            }
        } else {
            throw new java.lang.IllegalStateException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0B() {
        android.content.Context context = this.A08.A7U();
        if (context == null) {
            return true;
        }
        android.app.Activity A00 = A00(context);
        if (A00 != null) {
            boolean isDestroyed = A00.isDestroyed();
            if (A0I[3].length() != 17) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0I;
            strArr[2] = "bz230dZZFwB5VtBTUF6Wd1FYETvWTo5q";
            strArr[5] = "SaD2YYriklneEcKSamPXZGVrEiYqxj4X";
            if (isDestroyed) {
                return true;
            }
        }
        return false;
    }

    public final /* synthetic */ com.facebook.ads.redexgen.core.C2223qq A0E(com.facebook.ads.redexgen.core.DspViewableNode dspViewableNode, com.facebook.ads.redexgen.core.C2245rN c2245rN) {
        A0A(dspViewableNode, c2245rN);
        return null;
    }

    public final void A0F() {
        if (this.A00 != null) {
            this.A00.AFq();
        }
        if (this.A01) {
            this.A04.removeCallbacks(this.A0C);
            A07(this.A05.ACf());
        }
        this.A01 = false;
    }

    public final void A0G() {
        if (!this.A01) {
            this.A01 = true;
            this.A04.post(this.A0C);
            if (0 != 0) {
                throw new java.lang.NullPointerException(A05(10, 5, 69));
            }
        }
    }

    public final void A0H(com.facebook.ads.redexgen.core.InterfaceC2242rK interfaceC2242rK) {
        this.A0B.AJu(interfaceC2242rK);
    }

    public final void A0I(com.facebook.ads.redexgen.core.InterfaceC2240rI interfaceC2240rI) {
        this.A00 = interfaceC2240rI;
    }
}
