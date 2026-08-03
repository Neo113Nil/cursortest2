package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.l9, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1892l9 implements com.facebook.ads.redexgen.core.LH {
    public static java.lang.String[] A06 = {"EnQWPJ3V2xjVAThncas5joPITTvIB7EF", "1EuaMqG73HQ", "rjBteZjJ0vNfufCjCKCkAuxJVtJJHvWb", "xDvWT2DyWg3zA1fFgEAgA6zc8FBdFJ1B", "sfKNNRwM9cmkD7QHngaf04", "qaF2qGcI8dYBUqEwfxAr3oVVO8wm", "moKLjsoCWr0SdwKtjYcTHr1Csc5rll9E", "bRjHr7kF"};
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public final com.facebook.ads.redexgen.core.C04434v A04 = new com.facebook.ads.redexgen.core.C04434v(32);
    public final com.facebook.ads.redexgen.core.L8 A05;

    public C1892l9(com.facebook.ads.redexgen.core.L8 l8) {
        this.A05 = l8;
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void A5B(com.facebook.ads.redexgen.core.C04434v c04434v, int i) {
        boolean z = (i & 1) != 0;
        int i2 = -1;
        if (z) {
            i2 = c04434v.A09() + c04434v.A0I();
        }
        boolean payloadUnitStartIndicator = this.A03;
        if (payloadUnitStartIndicator) {
            if (!z) {
                return;
            }
            this.A03 = false;
            c04434v.A0f(i2);
            this.A00 = 0;
        }
        while (c04434v.A07() > 0) {
            if (this.A00 < 3) {
                if (this.A00 == 0) {
                    int A0I = c04434v.A0I();
                    c04434v.A0f(c04434v.A09() - 1);
                    if (A0I == 255) {
                        this.A03 = true;
                        return;
                    }
                }
                int min = java.lang.Math.min(c04434v.A07(), 3 - this.A00);
                c04434v.A0k(this.A04.A0l(), this.A00, min);
                this.A00 += min;
                if (this.A00 == 3) {
                    this.A04.A0f(0);
                    this.A04.A0e(3);
                    this.A04.A0g(1);
                    int A0I2 = this.A04.A0I();
                    int A0I3 = this.A04.A0I();
                    boolean payloadUnitStartIndicator2 = (A0I2 & 128) != 0;
                    this.A02 = payloadUnitStartIndicator2;
                    this.A01 = (((A0I2 & 15) << 8) | A0I3) + 3;
                    if (this.A04.A08() < this.A01) {
                        this.A04.A0c(java.lang.Math.min(4098, java.lang.Math.max(this.A01, this.A04.A08() * 2)));
                    }
                }
            } else {
                int min2 = java.lang.Math.min(c04434v.A07(), this.A01 - this.A00);
                c04434v.A0k(this.A04.A0l(), this.A00, min2);
                this.A00 += min2;
                if (this.A00 == this.A01) {
                    boolean payloadUnitStartIndicator3 = this.A02;
                    if (payloadUnitStartIndicator3) {
                        if (com.facebook.ads.redexgen.core.C5C.A0I(this.A04.A0l(), 0, this.A01, -1) != 0) {
                            this.A03 = true;
                            return;
                        }
                        this.A04.A0e(this.A01 - 4);
                    } else {
                        this.A04.A0e(this.A01);
                    }
                    this.A04.A0f(0);
                    com.facebook.ads.redexgen.core.L8 l8 = this.A05;
                    if (A06[3].charAt(18) == '6') {
                        throw new java.lang.RuntimeException();
                    }
                    A06[6] = "q6sMTbjJkDPtFUqTMgY1hgSKkn8mDgdv";
                    l8.A5A(this.A04);
                    this.A00 = 0;
                } else {
                    continue;
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AAA(com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53, com.facebook.ads.redexgen.core.HA ha, com.facebook.ads.redexgen.core.LG lg) {
        this.A05.AAA(anonymousClass53, ha, lg);
        this.A03 = true;
    }

    @Override // com.facebook.ads.redexgen.core.LH
    public final void AJ5() {
        this.A03 = true;
    }
}
