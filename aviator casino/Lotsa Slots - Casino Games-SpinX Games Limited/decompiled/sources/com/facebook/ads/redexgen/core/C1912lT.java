package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.lT, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1912lT implements com.facebook.ads.redexgen.core.InterfaceC0838Kv {
    public static byte[] A0D;
    public static java.lang.String[] A0E = {"eg1HF5xa7z40pAwthJhUwMgyYSflMm57", "vTWXZUhc0T5ye2gU", "5CU7tG4vDC5MrJOvyrKXJFg3lgmAd80k", "DBSeFcO6ZOsoqUplN3HsHa32omlpR5Gp", "ocqdBidFvokLCywFTEXKHS5uCgObv9g8", "Mmwr1Jc9dpTbQpvT", "ugccp26DZT8wLBdxyPVLtxapsfOoaJDE", "eNeWJfNXyWcyw1SOouQPEZVsCwWfQhE2"};
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public com.facebook.ads.redexgen.core.C2196qI A05;
    public com.facebook.ads.redexgen.core.InterfaceC0743Hd A06;
    public java.lang.String A07;
    public boolean A08;
    public boolean A09;
    public final com.facebook.ads.redexgen.core.C04424u A0A;
    public final com.facebook.ads.redexgen.core.C04434v A0B;
    public final java.lang.String A0C;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = (copyOfRange[i4] - i3) - 29;
            java.lang.String[] strArr = A0E;
            if (strArr[1].length() != strArr[5].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0E;
            strArr2[7] = "llPzXaIPGYOm1jx09XShEDSvCSxFzIZB";
            strArr2[4] = "gGGXbxf7z5B4GQeBG0q6dPqvCPeZy7ri";
            copyOfRange[i4] = (byte) i5;
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A0D = new byte[]{-108, -88, -105, -100, -94, 98, -108, -106, 103};
    }

    static {
        A02();
    }

    public C1912lT() {
        this(null);
    }

    public C1912lT(java.lang.String str) {
        this.A0A = new com.facebook.ads.redexgen.core.C04424u(new byte[16]);
        this.A0B = new com.facebook.ads.redexgen.core.C04434v(this.A0A.A00);
        this.A02 = 0;
        this.A00 = 0;
        this.A09 = false;
        this.A08 = false;
        this.A04 = -9223372036854775807L;
        this.A0C = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
    
        if (r4.equals(r6.A05.A0W) != false) goto L15;
     */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"output"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A01() {
        this.A0A.A08(0);
        com.facebook.ads.redexgen.core.C0733Gt A04 = com.facebook.ads.redexgen.core.AbstractC0734Gu.A04(this.A0A);
        com.facebook.ads.redexgen.core.C2196qI c2196qI = this.A05;
        java.lang.String A00 = A00(0, 9, 22);
        if (c2196qI != null) {
            int i = A04.A01;
            java.lang.String[] strArr = A0E;
            if (strArr[1].length() != strArr[5].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0E;
            strArr2[7] = "SKD2aiuMz12sC9MEHPwFtgw1C1HH3qQd";
            strArr2[4] = "2YOZvYYyczeO9UVS3DIHqXjJCxImTVhM";
            if (i == this.A05.A06) {
                if (A04.A04 == this.A05.A0G) {
                }
            }
        }
        this.A05 = new com.facebook.ads.redexgen.core.C03872p().A0y(this.A07).A11(A00).A0b(A04.A01).A0m(A04.A04).A10(this.A0C).A14();
        this.A06.A6e(this.A05);
        this.A01 = A04.A02;
        long j = (A04.A03 * 1000000) / this.A05.A0G;
        java.lang.String[] strArr3 = A0E;
        if (strArr3[7].charAt(24) != strArr3[4].charAt(24)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr4 = A0E;
        strArr4[6] = "AWQIxDR1BxjJqdSwyyHMPwKr6xoKH6oB";
        strArr4[2] = "F7eavifvP420Kso3ywMcgn0EXVt9uheB";
        this.A03 = j;
    }

    private boolean A03(com.facebook.ads.redexgen.core.C04434v c04434v) {
        int A0I;
        while (true) {
            if (c04434v.A07() <= 0) {
                return false;
            }
            if (!this.A09) {
                this.A09 = c04434v.A0I() == 172;
            } else {
                A0I = c04434v.A0I();
                this.A09 = A0I == 172;
                if (A0I == 64 || A0I == 65) {
                    break;
                }
            }
        }
        this.A08 = A0I == 65;
        return true;
    }

    private boolean A04(com.facebook.ads.redexgen.core.C04434v c04434v, byte[] bArr, int i) {
        int min = java.lang.Math.min(c04434v.A07(), i - this.A00);
        int bytesToRead = this.A00;
        c04434v.A0k(bArr, bytesToRead, min);
        int bytesToRead2 = this.A00;
        this.A00 = bytesToRead2 + min;
        int bytesToRead3 = this.A00;
        return bytesToRead3 == i;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0838Kv
    public final void A5A(com.facebook.ads.redexgen.core.C04434v c04434v) {
        com.facebook.ads.redexgen.core.AbstractC04203y.A02(this.A06);
        while (c04434v.A07() > 0) {
            switch (this.A02) {
                case 0:
                    if (!A03(c04434v)) {
                        break;
                    } else {
                        this.A02 = 1;
                        this.A0B.A0l()[0] = -84;
                        this.A0B.A0l()[1] = (byte) (this.A08 ? 65 : 64);
                        this.A00 = 2;
                        break;
                    }
                case 1:
                    if (!A04(c04434v, this.A0B.A0l(), 16)) {
                        break;
                    } else {
                        A01();
                        this.A0B.A0f(0);
                        this.A06.AIr(this.A0B, 16);
                        this.A02 = 2;
                        break;
                    }
                case 2:
                    int min = java.lang.Math.min(c04434v.A07(), this.A01 - this.A00);
                    this.A06.AIr(c04434v, min);
                    int bytesToRead = this.A00;
                    this.A00 = bytesToRead + min;
                    int i = this.A00;
                    int bytesToRead2 = this.A01;
                    if (i == bytesToRead2) {
                        long j = this.A04;
                        java.lang.String[] strArr = A0E;
                        java.lang.String str = strArr[1];
                        java.lang.String str2 = strArr[5];
                        int length = str.length();
                        int bytesToRead3 = str2.length();
                        if (length == bytesToRead3) {
                            java.lang.String[] strArr2 = A0E;
                            strArr2[7] = "IAM9NHxQABFG0hTE5bn7OXwICUUtPCRY";
                            strArr2[4] = "ryput7yIrWVq6mIAY3kQFQghClw5ei8P";
                            if (j != -9223372036854775807L) {
                                this.A06.AIu(this.A04, 1, this.A01, 0, null);
                                this.A04 += this.A03;
                            }
                            this.A02 = 0;
                            break;
                        } else {
                            throw new java.lang.RuntimeException();
                        }
                    } else {
                        continue;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0838Kv
    public final void A5c(com.facebook.ads.redexgen.core.HA ha, com.facebook.ads.redexgen.core.LG lg) {
        lg.A05();
        this.A07 = lg.A04();
        this.A06 = ha.AKS(lg.A03(), 1);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0838Kv
    public final void AGp() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0838Kv
    public final void AGq(long j, int i) {
        if (j != -9223372036854775807L) {
            this.A04 = j;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0838Kv
    public final void AJ5() {
        this.A02 = 0;
        this.A00 = 0;
        this.A09 = false;
        this.A08 = false;
        this.A04 = -9223372036854775807L;
    }
}
