package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.iw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1767iw implements com.facebook.ads.redexgen.core.NG {
    public static byte[] A07;
    public static java.lang.String[] A08 = {"HqViDmZKE9gqowyTLi9oGTmraxBLxdfb", "ZDhLRf5Uu21mhR1h1Q7a0O5z7jEhSu9k", "2GbaqYyT8OuzZpNttfxCN9qv1cIIYzBc", "fbbf2hOViPWoQMO0MuifN9tE3LO9hSeI", "DwEg34XuIOHddfNq0Duo86gfWbmgRcX4", "GcZc2s8wIoPvhyGTdTaWZVIVIYLPtEuL", "AIVK7lVsrhvQj", "0MZsasdmKrVN6CPRKwrl3lR9QzLAtIP"};
    public final /* synthetic */ long A03;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C05067g A04;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1065Tu A05;
    public final /* synthetic */ java.lang.Runnable A06;
    public boolean A02 = false;
    public boolean A01 = false;
    public boolean A00 = false;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 16);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{-125, -112, -112, -115, -112, -59, -53, -65};
    }

    static {
        A01();
    }

    public C1767iw(com.facebook.ads.redexgen.core.C05067g c05067g, java.lang.Runnable runnable, long j, com.facebook.ads.redexgen.core.C1065Tu c1065Tu) {
        this.A04 = c05067g;
        this.A06 = runnable;
        this.A03 = j;
        this.A05 = c1065Tu;
    }

    @Override // com.facebook.ads.redexgen.core.NG
    public final void AEv(com.facebook.ads.redexgen.core.C1818ju c1818ju) {
        if (!this.A00) {
            this.A00 = true;
            java.lang.String[] strArr = A08;
            if (strArr[1].charAt(12) != strArr[5].charAt(12)) {
                throw new java.lang.RuntimeException();
            }
            A08[0] = "A302cEzPVYQXumyZNbB7zeSxM9mEDz6J";
            this.A04.A05(this.A05.A03(com.facebook.ads.redexgen.core.EnumC1069Ty.A02), null);
        }
        if (this.A04.A07 != null) {
            this.A04.A07.A0C();
        }
    }

    @Override // com.facebook.ads.redexgen.core.NG
    public final void AEw(com.facebook.ads.redexgen.core.C1818ju c1818ju) {
        java.util.Map A01;
        if (c1818ju != this.A04.A00) {
            return;
        }
        android.os.Handler A0H = this.A04.A0H();
        java.lang.Runnable runnable = this.A06;
        if (A08[7].length() != 31) {
            throw new java.lang.RuntimeException();
        }
        A08[0] = "XfIEhebH8X778eyni9LsSDQR6QKL4f9o";
        A0H.removeCallbacks(runnable);
        this.A04.A01 = c1818ju;
        this.A04.A07.A0F(c1818ju);
        if (!this.A02) {
            this.A02 = true;
            A01 = this.A04.A01(this.A03);
            if (A08[3].charAt(7) == 'h') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A08;
            strArr[1] = "6CdPuG9VNNO8hZ7pQWbBuknU9qSrspmw";
            strArr[5] = "JYrF77GwPBrAhOPn8MtwFVV4pu279MHz";
            this.A04.A05(this.A05.A03(com.facebook.ads.redexgen.core.EnumC1069Ty.A04), A01);
        }
    }

    @Override // com.facebook.ads.redexgen.core.NG
    public final void AEx(com.facebook.ads.redexgen.core.C1818ju c1818ju) {
        if (!this.A01) {
            this.A01 = true;
            this.A04.A05(this.A05.A03(com.facebook.ads.redexgen.core.EnumC1069Ty.A03), null);
        }
        this.A04.A0O();
    }

    @Override // com.facebook.ads.redexgen.core.NG
    public final void AEz(com.facebook.ads.redexgen.core.C1818ju c1818ju, com.facebook.ads.redexgen.core.C1108Vm c1108Vm) {
        java.util.Map A01;
        if (c1818ju != this.A04.A00) {
            return;
        }
        this.A04.A0H().removeCallbacks(this.A06);
        this.A04.A0Q(c1818ju);
        if (!this.A02) {
            this.A02 = true;
            A01 = this.A04.A01(this.A03);
            A01.put(A00(0, 5, 14), java.lang.String.valueOf(c1108Vm.A03().getErrorCode()));
            A01.put(A00(5, 3, 72), java.lang.String.valueOf(c1108Vm.A04()));
            this.A04.A05(this.A05.A03(com.facebook.ads.redexgen.core.EnumC1069Ty.A04), A01);
        }
        this.A04.ADp(c1108Vm);
    }
}
