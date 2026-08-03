package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class ZR implements com.facebook.ads.redexgen.core.TA {
    public static com.facebook.ads.redexgen.core.ZR A07;
    public static byte[] A08;
    public com.facebook.ads.redexgen.core.InterfaceC0866Lx A00;
    public com.facebook.ads.redexgen.core.T1 A01;
    public com.facebook.ads.redexgen.core.T9 A02;
    public com.facebook.ads.redexgen.core.TP A03;
    public com.facebook.ads.redexgen.core.U7 A04;
    public com.facebook.ads.redexgen.core.VM A05;
    public com.facebook.ads.redexgen.core.CY A06;

    static {
        A07();
    }

    public static java.lang.String A06(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 118);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A07() {
        A08 = new byte[]{44, 62, 76, 76, 66, 72, 71, -7, kotlin.io.encoding.Base64.padSymbol, 58, 77, 58, -7, 66, 71, 66, 77, 66, 58, 69, 66, 83, 62, kotlin.io.encoding.Base64.padSymbol, com.google.common.base.Ascii.FS, -13, -19, 32, com.google.common.base.Ascii.ESC, -15, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.RS, -3, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.GS, 19, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.CAN, -18, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.VT, -13, com.google.common.base.Ascii.CAN, 19, com.google.common.base.Ascii.RS, 19, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.SYN, 19, 36, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.SO};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A0C(com.facebook.ads.redexgen.core.C1632ge c1632ge) {
        if (this.A06 != null) {
            return;
        }
        this.A03 = A01(c1632ge);
        this.A06 = A05(c1632ge, this.A03, A03(c1632ge));
        A09(c1632ge, A00(c1632ge, this.A06));
        A0A(c1632ge, this.A06);
        A0B(c1632ge, this.A06);
        if (this.A06 != null) {
            this.A06.A6d();
        }
    }

    public static com.facebook.ads.redexgen.core.SR A00(com.facebook.ads.redexgen.core.C1632ge c1632ge, com.facebook.ads.redexgen.core.CY cy) {
        if (!com.facebook.ads.redexgen.core.C1086Up.A1r(c1632ge) || cy == null) {
            return null;
        }
        return com.facebook.ads.redexgen.core.SS.A00().A00(cy);
    }

    public static com.facebook.ads.redexgen.core.TP A01(com.facebook.ads.redexgen.core.C1632ge c1632ge) {
        return com.facebook.ads.redexgen.core.TQ.A00().A00(c1632ge, new com.facebook.ads.redexgen.core.C1335bp());
    }

    public static synchronized com.facebook.ads.redexgen.core.ZR A02() {
        com.facebook.ads.redexgen.core.ZR zr;
        synchronized (com.facebook.ads.redexgen.core.ZR.class) {
            if (A07 == null) {
                A07 = new com.facebook.ads.redexgen.core.ZR();
            }
            zr = A07;
        }
        return zr;
    }

    public static com.facebook.ads.redexgen.core.InterfaceC1587fv A03(com.facebook.ads.redexgen.core.C1632ge c1632ge) {
        if (!com.facebook.ads.redexgen.core.C1086Up.A1n(c1632ge)) {
            return null;
        }
        return com.facebook.ads.redexgen.core.C1605gD.A01(c1632ge);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.TA
    /* renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final synchronized com.facebook.ads.redexgen.core.CY A9F() {
        return this.A06;
    }

    public static com.facebook.ads.redexgen.core.CY A05(com.facebook.ads.redexgen.core.C1632ge c1632ge, com.facebook.ads.redexgen.core.TP tp, com.facebook.ads.redexgen.core.InterfaceC1587fv interfaceC1587fv) {
        if (!com.facebook.ads.redexgen.core.C1086Up.A2m(c1632ge) || interfaceC1587fv == null || com.facebook.ads.internal.util.process.ProcessUtils.isRemoteRenderingProcess()) {
            return null;
        }
        return com.facebook.ads.redexgen.core.AbstractC1628ga.A00().A00(c1632ge, tp, interfaceC1587fv, com.facebook.ads.redexgen.core.WI.A04(c1632ge), new com.facebook.ads.redexgen.core.ZW(new com.facebook.ads.redexgen.core.WA(c1632ge, A06(0, 0, 9), null, com.facebook.ads.redexgen.core.EnumC1111Vq.A08, 0, new com.facebook.ads.redexgen.core.C1115Vu(), com.facebook.ads.redexgen.core.AbstractC1163Xt.A01(com.facebook.ads.redexgen.core.C1086Up.A0N(c1632ge)), null, null, new com.facebook.ads.redexgen.core.C1755ij()), c1632ge), com.facebook.ads.redexgen.core.C1626gY.A00().A00());
    }

    public static void A08() {
        com.facebook.ads.redexgen.core.AbstractC1119Vy.A05(A06(30, 28, 52), A06(0, 24, 99), A06(24, 6, 68));
    }

    public static void A09(com.facebook.ads.redexgen.core.C1632ge c1632ge, com.facebook.ads.redexgen.core.SR sr) {
        if (!com.facebook.ads.redexgen.core.C1086Up.A1r(c1632ge) || sr == null) {
            return;
        }
        com.facebook.ads.redexgen.core.SP.A00().A00(sr, c1632ge);
    }

    public static void A0A(com.facebook.ads.redexgen.core.C1632ge c1632ge, com.facebook.ads.redexgen.core.CY cy) {
        if (!com.facebook.ads.redexgen.core.C1086Up.A0m(c1632ge) || cy == null) {
            return;
        }
        new com.facebook.ads.redexgen.core.C1031Sm(c1632ge, cy, new com.facebook.ads.redexgen.core.C1032Sn(), com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl.getBidderTokenProviderApi().A00());
    }

    public static void A0B(com.facebook.ads.redexgen.core.C1632ge c1632ge, com.facebook.ads.redexgen.core.CY cy) {
        if (cy == null) {
            return;
        }
        com.facebook.ads.redexgen.core.AbstractC1090Ut.A00(c1632ge, cy);
    }

    @Override // com.facebook.ads.redexgen.core.TA
    public final com.facebook.ads.redexgen.core.VA A6n(com.facebook.ads.redexgen.core.C1632ge c1632ge) {
        return com.facebook.ads.redexgen.core.WW.A01(c1632ge);
    }

    @Override // com.facebook.ads.redexgen.core.TA
    public final synchronized com.facebook.ads.redexgen.core.T9 A74(com.facebook.ads.redexgen.core.T8 t8) {
        if (this.A02 == null) {
            this.A02 = new com.facebook.ads.redexgen.core.C1202Zg(this);
        }
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.TA
    public final synchronized com.facebook.ads.redexgen.core.T1 A7G() {
        if (this.A01 == null) {
            this.A01 = new com.facebook.ads.redexgen.core.C1637gj();
        }
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.TA
    public final synchronized com.facebook.ads.redexgen.core.TP A7l(com.facebook.ads.redexgen.core.T8 t8) {
        if (this.A03 == null) {
            this.A03 = A01(t8.A02());
        }
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.TA
    public final synchronized com.facebook.ads.redexgen.core.InterfaceC1047Tc A7n(com.facebook.ads.redexgen.core.T8 t8) {
        return new com.facebook.ads.redexgen.core.C1530f0(t8);
    }

    @Override // com.facebook.ads.redexgen.core.TA
    public final synchronized com.facebook.ads.redexgen.core.TB A7x(final com.facebook.ads.redexgen.core.T8 t8) {
        return new com.facebook.ads.redexgen.core.AbstractC1334bo(t8) { // from class: com.facebook.ads.redexgen.X.72
            @Override // com.facebook.ads.redexgen.core.TB
            public final boolean A9m() {
                return com.facebook.ads.redexgen.core.TextureViewSurfaceTextureListenerC0636Cz.A09();
            }

            @Override // com.facebook.ads.redexgen.core.TB
            public final void ACP() {
                com.facebook.ads.redexgen.core.U2.A06(com.facebook.ads.redexgen.core.C1009Rp.A09(super.A00));
            }

            @Override // com.facebook.ads.redexgen.core.TB
            public final void ACn() {
                com.facebook.ads.redexgen.core.U2.A07(com.facebook.ads.redexgen.core.C1009Rp.A09(super.A00));
            }

            @Override // com.facebook.ads.redexgen.core.TB
            public final void ADI(com.facebook.ads.redexgen.core.C1632ge c1632ge) {
                com.facebook.ads.redexgen.core.OP.A01(c1632ge);
            }
        };
    }

    @Override // com.facebook.ads.redexgen.core.TA
    public final synchronized com.facebook.ads.redexgen.core.InterfaceC0866Lx A8C(com.facebook.ads.redexgen.core.T8 t8) {
        if (!com.facebook.ads.redexgen.core.C1086Up.A13(t8)) {
            return null;
        }
        if (this.A00 == null) {
            this.A00 = com.facebook.ads.redexgen.core.AbstractC0867Ly.A00().A00(new com.facebook.ads.redexgen.core.C1298bE(t8));
        }
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.TA
    public final synchronized com.facebook.ads.redexgen.core.TD A8y(com.facebook.ads.redexgen.core.T8 t8) {
        return new com.facebook.ads.redexgen.core.C1272ao(t8);
    }

    @Override // com.facebook.ads.redexgen.core.TA
    public final com.facebook.ads.redexgen.core.C1632ge A8z(android.content.Context context) {
        com.facebook.ads.redexgen.core.C1632ge sdkContext = com.facebook.ads.redexgen.core.T7.A00();
        if (sdkContext == null) {
            com.facebook.ads.redexgen.core.C1632ge sdkContext2 = new com.facebook.ads.redexgen.core.C1632ge(context, this);
            com.facebook.ads.redexgen.core.T7.A01(sdkContext2);
            return sdkContext2;
        }
        return sdkContext;
    }

    @Override // com.facebook.ads.redexgen.core.TA
    public final synchronized com.facebook.ads.redexgen.core.VM A90(com.facebook.ads.redexgen.core.C1632ge c1632ge) {
        if (this.A05 == null) {
            this.A05 = new com.facebook.ads.redexgen.core.XP(c1632ge);
        }
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.core.TA
    public final synchronized com.facebook.ads.redexgen.core.U7 A96() {
        if (this.A04 == null) {
            this.A04 = new com.facebook.ads.redexgen.core.U7();
            A08();
        }
        return this.A04;
    }
}
