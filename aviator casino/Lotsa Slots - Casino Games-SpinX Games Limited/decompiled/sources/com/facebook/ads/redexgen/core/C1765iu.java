package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.iu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1765iu implements com.facebook.ads.redexgen.core.WC {
    public static byte[] A0E;
    public static java.lang.String[] A0F = {"gvO2SkJ6judPPNAAbU10EdMFrysfMOoq", "C8fayNw08H03MAMa0MYSKK0pyo1qSvcR", "zD", "tQ435k35SGtCPZ", "PU5xmRYaUesfDikXgdcM0c", "Sj", "IzP0LuOvX3krWKzZjoX9w767Mf8waFqk", "fiC8qpcDm8TluoxAfEpO8PomLrdxugFO"};
    public com.facebook.ads.redexgen.core.OB A00;
    public com.facebook.ads.redexgen.core.C1067Tw A01;
    public java.lang.String A02;
    public boolean A03;
    public final int A04;
    public final android.os.Handler A05;
    public final com.facebook.ads.AdSize A06;
    public final com.facebook.ads.redexgen.core.N6 A07;
    public final com.facebook.ads.redexgen.core.C1636gi A08;
    public final com.facebook.ads.redexgen.core.VA A09;
    public final com.facebook.ads.redexgen.core.EnumC1111Vq A0A;
    public final com.facebook.ads.redexgen.core.WD A0B;
    public final java.lang.Runnable A0C;
    public final java.lang.String A0D;

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 81);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A05() {
        A0E = new byte[]{-47, -46, -125, -45, -49, -60, -58, -56, -48, -56, -47, -41, -125, -52, -47, -125, -43, -56, -42, -45, -46, -47, -42, -56};
    }

    static {
        A05();
        com.facebook.ads.redexgen.core.YD.A02();
    }

    public C1765iu(com.facebook.ads.redexgen.core.C1636gi c1636gi, java.lang.String str, com.facebook.ads.redexgen.core.EnumC1111Vq enumC1111Vq, com.facebook.ads.AdSize adSize, int i) {
        this.A08 = c1636gi;
        this.A0D = str;
        this.A0A = enumC1111Vq;
        this.A06 = adSize;
        this.A04 = i;
        this.A0B = new com.facebook.ads.redexgen.core.WD(this.A08);
        this.A0B.A0R(this);
        this.A07 = new com.facebook.ads.redexgen.core.N6();
        this.A03 = true;
        this.A05 = new android.os.Handler();
        this.A0C = new com.facebook.ads.redexgen.core.Q9<com.facebook.ads.redexgen.core.C1765iu>(this) { // from class: com.facebook.ads.redexgen.X.7e
            {
                super(this);
            }

            @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc
            public final void A07() {
                com.facebook.ads.redexgen.core.C1636gi c1636gi2;
                android.os.Handler handler;
                java.lang.Runnable runnable;
                com.facebook.ads.redexgen.core.C1765iu A08 = A08();
                if (A08 == null) {
                    return;
                }
                c1636gi2 = A08.A08;
                if (com.facebook.ads.redexgen.core.YV.A02(c1636gi2)) {
                    A08.A07();
                    return;
                }
                handler = A08.A05;
                runnable = A08.A0C;
                handler.postDelayed(runnable, 5000L);
            }
        };
        this.A09 = c1636gi.A0A();
        com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.makeLoader(this.A08).getInitApi().onAdLoadInvoked(this.A08);
    }

    private java.util.List<com.facebook.ads.redexgen.core.C1818ju> A04() {
        com.facebook.ads.redexgen.core.C1067Tw c1067Tw = this.A01;
        final java.util.ArrayList arrayList = new java.util.ArrayList(c1067Tw.A02());
        for (com.facebook.ads.redexgen.core.C1065Tu A04 = c1067Tw.A04(); A04 != null; A04 = c1067Tw.A04()) {
            com.facebook.ads.redexgen.core.N1 A00 = this.A07.A00(this.A08, com.facebook.ads.internal.protocol.AdPlacementType.NATIVE);
            if (A00 != null && A00.A8k() == com.facebook.ads.internal.protocol.AdPlacementType.NATIVE) {
                final com.facebook.ads.redexgen.core.C1818ju nativeAdapter = (com.facebook.ads.redexgen.core.C1818ju) A00;
                nativeAdapter.A0L(this.A08, new com.facebook.ads.redexgen.core.AbstractC1766iv() { // from class: com.facebook.ads.redexgen.X.7f
                    @Override // com.facebook.ads.redexgen.core.NG
                    public final void AEw(com.facebook.ads.redexgen.core.C1818ju c1818ju) {
                        arrayList.add(nativeAdapter);
                    }
                }, this.A09, new com.facebook.ads.redexgen.core.O8(A04.A04(), c1067Tw.A05(), this.A0D, c1067Tw.A05().A0C()), com.facebook.ads.redexgen.core.UK.A0K());
            }
        }
        return arrayList;
    }

    public final void A06() {
        this.A03 = false;
        this.A05.removeCallbacks(this.A0C);
    }

    public final void A07() {
        try {
            this.A0B.A0Q(new com.facebook.ads.redexgen.core.WA(this.A08, this.A0D, this.A06 != null ? new com.facebook.ads.redexgen.core.C1157Xn(this.A06.getWidth(), this.A06.getHeight()) : null, this.A0A, this.A04, new com.facebook.ads.redexgen.core.C1115Vu(this.A08, null, null, null), com.facebook.ads.redexgen.core.AbstractC1163Xt.A01(com.facebook.ads.redexgen.core.C1086Up.A0N(this.A08)), this.A02, null, new com.facebook.ads.redexgen.core.C1755ij()));
        } catch (com.facebook.ads.redexgen.core.C1109Vn e) {
            ADp(com.facebook.ads.redexgen.core.C1108Vm.A02(e));
        }
    }

    public final void A08(com.facebook.ads.redexgen.core.OB ob) {
        this.A00 = ob;
    }

    public final void A09(java.lang.String str) {
        this.A02 = str;
    }

    public final boolean A0A() {
        return this.A01 == null || this.A01.A0I();
    }

    @Override // com.facebook.ads.redexgen.core.WC
    public final void ADp(com.facebook.ads.redexgen.core.C1108Vm c1108Vm) {
        if (this.A03) {
            this.A05.postDelayed(this.A0C, 1800000L);
        }
        if (this.A00 != null) {
            this.A00.ADp(c1108Vm);
        }
    }

    @Override // com.facebook.ads.redexgen.core.WC
    public final void AG7(com.facebook.ads.redexgen.core.RG rg) {
        com.facebook.ads.redexgen.core.C1067Tw A00 = rg.A00();
        if (A00 != null) {
            if (this.A03) {
                long A0A = A00.A05().A0A();
                if (A0A == 0) {
                    A0A = 1800000;
                }
                this.A05.postDelayed(this.A0C, A0A);
            }
            this.A01 = A00;
            java.util.List<com.facebook.ads.redexgen.core.C1818ju> A04 = A04();
            if (this.A00 != null) {
                boolean isEmpty = A04.isEmpty();
                java.lang.String[] strArr = A0F;
                if (strArr[7].charAt(9) == strArr[6].charAt(9)) {
                    throw new java.lang.RuntimeException();
                }
                A0F[0] = "Ma8ASQR7F1ZvPn5hHoXinNcVvjUetiuh";
                if (isEmpty) {
                    this.A00.ADp(com.facebook.ads.redexgen.core.C1108Vm.A01(com.facebook.ads.internal.protocol.AdErrorType.NO_FILL, A03(0, 0, 63)));
                    return;
                } else {
                    this.A00.AEy(A04);
                    return;
                }
            }
            return;
        }
        throw new java.lang.IllegalStateException(A03(0, 24, 18));
    }
}
