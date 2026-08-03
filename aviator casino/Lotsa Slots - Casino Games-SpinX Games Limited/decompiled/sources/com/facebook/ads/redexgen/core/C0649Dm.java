package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Dm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0649Dm implements com.facebook.ads.redexgen.core.InterfaceC1524eu {
    public static java.lang.String[] A0E = {"2ZSu0wXuDbQnaud22BC", "QCmSLF", "fQxhtf", "E3sU0uCnWEnB3ZcSzOkvj4xNFgaNSXPe", "Ye0yKWwaCEsRuR61siA7kBVWrkv2bkox", "1q930HE08Ni0sTckStF", "wfAs2pJjw0biCEJKLi3nGPcNksloIp8Y", "ZBBhRoR6L"};
    public com.facebook.ads.redexgen.core.C0673Ek A01;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final com.facebook.ads.redexgen.core.E4 A09 = new com.facebook.ads.redexgen.core.E4() { // from class: com.facebook.ads.redexgen.X.42
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.core.UN
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(com.facebook.ads.redexgen.core.C4B c4b) {
            android.os.Handler handler;
            boolean A0G;
            handler = com.facebook.ads.redexgen.core.C0649Dm.this.A07;
            handler.removeCallbacksAndMessages(null);
            A0G = com.facebook.ads.redexgen.core.C0649Dm.this.A0G(com.facebook.ads.redexgen.core.EnumC1549fJ.A04);
            if (A0G) {
                com.facebook.ads.redexgen.core.C0649Dm.this.A03();
                com.facebook.ads.redexgen.core.C0649Dm.this.A06(true, false);
            }
            com.facebook.ads.redexgen.core.C0649Dm.this.A05 = true;
        }
    };
    public final com.facebook.ads.redexgen.core.EA A08 = new com.facebook.ads.redexgen.core.EA() { // from class: com.facebook.ads.redexgen.X.41
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.core.UN
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(com.facebook.ads.redexgen.core.C4K c4k) {
            boolean z;
            com.facebook.ads.redexgen.core.C0649Dm.this.A02 = true;
            z = com.facebook.ads.redexgen.core.C0649Dm.this.A03;
            if (z) {
                return;
            }
            com.facebook.ads.redexgen.core.C0649Dm.this.A03();
            com.facebook.ads.redexgen.core.C0649Dm.this.A06(false, false);
            com.facebook.ads.redexgen.core.C0649Dm.this.A05 = true;
        }
    };
    public final com.facebook.ads.redexgen.core.E2 A0A = new com.facebook.ads.redexgen.core.C04193x(this);
    public final com.facebook.ads.redexgen.core.AbstractC0662Dz A0B = new com.facebook.ads.redexgen.core.AbstractC0662Dz() { // from class: com.facebook.ads.redexgen.X.3w
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.core.UN
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(com.facebook.ads.redexgen.core.C4A c4a) {
            boolean z;
            boolean A0G;
            z = com.facebook.ads.redexgen.core.C0649Dm.this.A04;
            if (z) {
                return;
            }
            A0G = com.facebook.ads.redexgen.core.C0649Dm.this.A0G(com.facebook.ads.redexgen.core.EnumC1549fJ.A04);
            if (!A0G) {
                return;
            }
            com.facebook.ads.redexgen.core.C0649Dm.this.A03();
            com.facebook.ads.redexgen.core.C0649Dm.this.A06(true, false);
        }
    };
    public final com.facebook.ads.redexgen.core.AbstractC0656Dt A0C = new com.facebook.ads.redexgen.core.C04173v(this);
    public final android.os.Handler A07 = new android.os.Handler();
    public final java.util.List<com.facebook.ads.redexgen.core.InterfaceC1550fK> A0D = new java.util.ArrayList();
    public int A00 = 2000;
    public boolean A02 = false;

    public C0649Dm(boolean z, boolean z2) {
        this.A04 = z;
        this.A03 = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03() {
        this.A07.removeCallbacksAndMessages(null);
        java.util.Iterator<com.facebook.ads.redexgen.core.InterfaceC1550fK> it = this.A0D.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A0E[7].length() != 9) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0E;
            strArr[6] = "Y40dGjVL9Zscw9FMyiKWKh6z3JvZ0T5u";
            strArr[4] = "hO4VpYUkDoigTR3nwiJ8PFOPPoG0N1QG";
            if (hasNext) {
                it.next().cancel();
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06(boolean z, boolean z2) {
        java.util.Iterator<com.facebook.ads.redexgen.core.InterfaceC1550fK> it = this.A0D.iterator();
        while (it.hasNext()) {
            it.next().A4A(z, z2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0G(com.facebook.ads.redexgen.core.EnumC1549fJ enumC1549fJ) {
        java.util.Iterator<com.facebook.ads.redexgen.core.InterfaceC1550fK> it = this.A0D.iterator();
        while (it.hasNext()) {
            if (it.next().A9B() != enumC1549fJ) {
                return false;
            }
        }
        return true;
    }

    public final void A0H() {
        this.A0D.clear();
    }

    public final void A0I() {
        if (this.A04) {
            this.A07.removeCallbacksAndMessages(null);
            this.A04 = false;
        }
    }

    public final void A0J() {
        this.A06 = true;
        this.A05 = true;
        A06(false, false);
    }

    public final void A0K(int i) {
        this.A00 = i;
    }

    public final void A0L(com.facebook.ads.redexgen.core.InterfaceC1550fK interfaceC1550fK) {
        this.A0D.add(interfaceC1550fK);
    }

    public final boolean A0M() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1524eu
    public final void AAv(com.facebook.ads.redexgen.core.C0673Ek c0673Ek) {
        this.A01 = c0673Ek;
        c0673Ek.getEventBus().A03(this.A09, this.A0C, this.A0A, this.A0B, this.A08);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1524eu
    public final void AKV(com.facebook.ads.redexgen.core.C0673Ek c0673Ek) {
        A03();
        c0673Ek.getEventBus().A04(this.A08, this.A0C, this.A0A, this.A0B, this.A09);
        this.A01 = null;
    }
}
