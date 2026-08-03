package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.80, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class AnonymousClass80 implements com.facebook.ads.redexgen.core.InterfaceC1832k8 {
    public static byte[] A09;
    public static java.lang.String[] A0A = {"0TFgGHCmbDEnT", "P3BoNX3HbYs3p91Xznd9cH02Ego1LEzw", "OWrFl7C0gkEmqIZvATANnxtRvMpHSetZ", "XjLJU23F7IQ7TgYJbWjoa78", "8eUGin29aZrVydG4hLQZ04ng176drDiv", "tE42BGb8ExLW22Y3fw0IicKZ4ID1w2IZ", "N0c3cK9W7W98ikBdYu66t8J", "EarR2SOYmotvRVJvY11PbnGgxllwGrNq"};
    public com.facebook.ads.redexgen.core.N9 A01;
    public com.facebook.ads.redexgen.core.NA A02;
    public com.facebook.ads.redexgen.core.C1808jk A03;
    public com.facebook.ads.redexgen.core.C1806ji A04;
    public com.facebook.ads.redexgen.core.AnonymousClass76 A05;
    public com.facebook.ads.redexgen.core.Z1 A06;
    public com.facebook.ads.redexgen.core.Z2 A07;
    public final java.lang.String A08 = java.util.UUID.randomUUID().toString();
    public long A00 = -1;

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 16);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A04() {
        A09 = new byte[]{-81, -64, -11, -19, -20, -15, -3, -11, -25, -6, -19, -21, -4, -23, -10, -17, -12, -19};
    }

    static {
        A04();
    }

    private void A05(com.facebook.ads.redexgen.core.AnonymousClass76 anonymousClass76, com.facebook.ads.redexgen.core.C1806ji c1806ji, com.facebook.ads.redexgen.core.C1042Sx c1042Sx, com.facebook.ads.redexgen.core.N9 n9, com.facebook.ads.redexgen.core.Z2 z2) {
        java.lang.String A7O = c1806ji.A7O();
        if (!android.text.TextUtils.isEmpty(A7O)) {
            c1042Sx.A0e(new com.facebook.ads.redexgen.core.VI(A7O, anonymousClass76.A0A()));
        }
        com.facebook.ads.redexgen.core.C1098Vb A0I = c1806ji.A0I();
        java.lang.String[] strArr = A0A;
        java.lang.String clientToken = strArr[3];
        if (clientToken.length() != strArr[6].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0A;
        strArr2[3] = "l0iKT0z7S0YTo68xxrsf1qJ";
        strArr2[6] = "FTb7Q8n5ne47CtPUjUxYv1n";
        if (A0I != null) {
            com.facebook.ads.redexgen.core.C1040Sv c1040Sv = new com.facebook.ads.redexgen.core.C1040Sv(c1806ji.A0I().getUrl(), c1806ji.A0I().getHeight(), c1806ji.A0I().getWidth(), c1806ji.A0b(), A03(2, 16, 120));
            c1040Sv.A01 = new com.facebook.ads.redexgen.core.T3(false, -1, -1);
            c1042Sx.A0W();
            c1042Sx.A0c(c1040Sv);
        }
        if (c1806ji.A0H() != null) {
            c1042Sx.A0c(new com.facebook.ads.redexgen.core.C1040Sv(c1806ji.A0H().getUrl(), c1806ji.A0H().getHeight(), c1806ji.A0H().getWidth(), c1806ji.A0b(), A03(2, 16, 120)));
        }
        java.lang.String A0e = c1806ji.A0e();
        if (A0e != null && !android.text.TextUtils.isEmpty(A0e)) {
            c1042Sx.A0b(new com.facebook.ads.redexgen.core.C1038St(A0e, c1806ji.A0b(), A03(2, 16, 120), c1806ji.A0D()));
        }
        com.facebook.ads.redexgen.core.AbstractC1801jd A0F = c1806ji.A0F();
        java.lang.String A03 = A03(2, 16, 120);
        if (A0F != null) {
            com.facebook.ads.redexgen.core.O0.A00(c1806ji.A0F(), c1042Sx, A03);
        }
        com.facebook.ads.redexgen.core.C1820jw c1820jw = new com.facebook.ads.redexgen.core.C1820jw(this, z2, n9, anonymousClass76);
        java.lang.String clientToken2 = c1806ji.A0b();
        c1042Sx.A0X(c1820jw, new com.facebook.ads.redexgen.core.C1035Sq(clientToken2, A03));
    }

    @Override // com.facebook.ads.redexgen.core.N1
    public final java.lang.String A7O() {
        if (this.A04 == null) {
            return null;
        }
        return this.A04.A7O();
    }

    @Override // com.facebook.ads.redexgen.core.N1
    public final com.facebook.ads.internal.protocol.AdPlacementType A8k() {
        return com.facebook.ads.internal.protocol.AdPlacementType.MEDIUM_RECTANGLE;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1832k8
    public final void AAt(com.facebook.ads.redexgen.core.AnonymousClass76 anonymousClass76, com.facebook.ads.redexgen.core.VA va, com.facebook.ads.redexgen.core.EnumC1110Vp enumC1110Vp, com.facebook.ads.redexgen.core.N9 n9, org.json.JSONObject jSONObject, com.facebook.ads.redexgen.core.C1068Tx c1068Tx) {
        anonymousClass76.A0F().A4N();
        this.A05 = anonymousClass76;
        this.A01 = n9;
        com.facebook.ads.redexgen.core.C1042Sx c1042Sx = new com.facebook.ads.redexgen.core.C1042Sx(anonymousClass76);
        this.A00 = java.lang.System.currentTimeMillis();
        com.facebook.ads.redexgen.core.C1806ji A00 = com.facebook.ads.redexgen.core.NI.A00(anonymousClass76, jSONObject, com.facebook.ads.redexgen.core.AbstractC1147Xd.A02(jSONObject, A03(0, 2, 60)));
        this.A04 = A00;
        if (!com.facebook.ads.redexgen.core.AbstractC0892Mx.A06(anonymousClass76, A00, va)) {
            com.facebook.ads.redexgen.core.Z1 adViewListener = new com.facebook.ads.redexgen.core.C1822jy(this, anonymousClass76);
            this.A06 = adViewListener;
            com.facebook.ads.redexgen.core.Z2 z2 = new com.facebook.ads.redexgen.core.Z2(anonymousClass76, va, c1042Sx, new java.lang.ref.WeakReference(adViewListener), c1068Tx.A04(), c1068Tx.A07(), c1068Tx.A08(), c1068Tx.A09(), A00, this.A08);
            this.A07 = z2;
            this.A03 = new com.facebook.ads.redexgen.core.C1808jk(anonymousClass76, new com.facebook.ads.redexgen.core.C1821jx(this, anonymousClass76, n9), z2.getViewabilityChecker(), va, A00);
            A05(anonymousClass76, A00, c1042Sx, n9, z2);
            this.A02 = new com.facebook.ads.redexgen.core.NA(anonymousClass76, this.A08, this, n9);
            this.A02.A02();
            return;
        }
        anonymousClass76.A0F().A52();
        n9.AEN(this, com.facebook.ads.redexgen.core.C1108Vm.A00(com.facebook.ads.internal.protocol.AdErrorType.NO_FILL));
    }

    @Override // com.facebook.ads.redexgen.core.N1
    public final boolean AKL() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.N1
    public final void onDestroy() {
        if (this.A05 != null) {
            com.facebook.ads.redexgen.core.InterfaceC1863kf A0F = this.A05.A0F();
            java.lang.String[] strArr = A0A;
            if (strArr[1].charAt(24) == strArr[4].charAt(24)) {
                throw new java.lang.RuntimeException();
            }
            A0A[7] = "tMGyCfr9ucO4oWdztKDfdPlDfRrhkMp8";
            A0F.A4L(this.A07 != null);
        }
        if (this.A07 != null) {
            this.A07.A0I();
            this.A07 = null;
            this.A06 = null;
        }
        com.facebook.ads.redexgen.core.NA na = this.A02;
        if (A0A[0].length() == 16) {
            throw new java.lang.RuntimeException();
        }
        A0A[7] = "5ZoCIskAsYlLTmabnaeKVzywNB4LbbVC";
        if (na != null) {
            this.A02.A03();
        }
    }
}
