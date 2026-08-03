package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.nC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2006nC implements com.facebook.ads.redexgen.core.F0 {
    public int A00;
    public int A01;
    public int A02;
    public com.facebook.ads.redexgen.core.C0687Ey[] A03;
    public final int A04;
    public final boolean A05;
    public final byte[] A06;

    public C2006nC(boolean z, int i) {
        this(z, i, 0);
    }

    public C2006nC(boolean z, int i, int i2) {
        com.facebook.ads.redexgen.core.AbstractC04203y.A07(i > 0);
        com.facebook.ads.redexgen.core.AbstractC04203y.A07(i2 >= 0);
        this.A05 = z;
        this.A04 = i;
        this.A01 = i2;
        this.A03 = new com.facebook.ads.redexgen.core.C0687Ey[i2 + 100];
        if (i2 > 0) {
            this.A06 = new byte[i2 * i];
            for (int i3 = 0; i3 < i2; i3++) {
                this.A03[i3] = new com.facebook.ads.redexgen.core.C0687Ey(this.A06, i3 * i);
            }
            return;
        }
        this.A06 = null;
    }

    public final synchronized int A00() {
        return this.A00 * this.A04;
    }

    public final synchronized void A01() {
        if (this.A05) {
            A02(0);
        }
    }

    public final synchronized void A02(int i) {
        boolean targetBufferSizeReduced = i < this.A02;
        this.A02 = i;
        if (targetBufferSizeReduced) {
            AKT();
        }
    }

    @Override // com.facebook.ads.redexgen.core.F0
    public final synchronized com.facebook.ads.redexgen.core.C0687Ey A49() {
        com.facebook.ads.redexgen.core.C0687Ey c0687Ey;
        this.A00++;
        if (this.A01 > 0) {
            com.facebook.ads.redexgen.core.C0687Ey[] c0687EyArr = this.A03;
            int i = this.A01 - 1;
            this.A01 = i;
            c0687Ey = (com.facebook.ads.redexgen.core.C0687Ey) com.facebook.ads.redexgen.core.AbstractC04203y.A01(c0687EyArr[i]);
            this.A03[this.A01] = null;
        } else {
            c0687Ey = new com.facebook.ads.redexgen.core.C0687Ey(new byte[this.A04], 0);
            if (this.A00 > this.A03.length) {
                this.A03 = (com.facebook.ads.redexgen.core.C0687Ey[]) java.util.Arrays.copyOf(this.A03, this.A03.length * 2);
            }
        }
        return c0687Ey;
    }

    @Override // com.facebook.ads.redexgen.core.F0
    public final int A8I() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.core.F0
    public final synchronized void AHd(com.facebook.ads.redexgen.core.C0687Ey c0687Ey) {
        com.facebook.ads.redexgen.core.C0687Ey[] c0687EyArr = this.A03;
        int i = this.A01;
        this.A01 = i + 1;
        c0687EyArr[i] = c0687Ey;
        this.A00--;
        notifyAll();
    }

    @Override // com.facebook.ads.redexgen.core.F0
    public final synchronized void AHe(com.facebook.ads.redexgen.core.InterfaceC0688Ez interfaceC0688Ez) {
        while (interfaceC0688Ez != null) {
            com.facebook.ads.redexgen.core.C0687Ey[] c0687EyArr = this.A03;
            int i = this.A01;
            this.A01 = i + 1;
            c0687EyArr[i] = interfaceC0688Ez.A6u();
            this.A00--;
            interfaceC0688Ez = interfaceC0688Ez.ACc();
        }
        notifyAll();
    }

    @Override // com.facebook.ads.redexgen.core.F0
    public final synchronized void AKT() {
        int A05 = com.facebook.ads.redexgen.core.C5C.A05(this.A02, this.A04);
        int targetAllocationCount = this.A00;
        int max = java.lang.Math.max(0, A05 - targetAllocationCount);
        int targetAllocationCount2 = this.A01;
        if (max >= targetAllocationCount2) {
            return;
        }
        if (this.A06 != null) {
            int lowIndex = 0;
            int targetAllocationCount3 = this.A01;
            int highIndex = targetAllocationCount3 - 1;
            while (lowIndex <= highIndex) {
                com.facebook.ads.redexgen.core.C0687Ey highAllocation = (com.facebook.ads.redexgen.core.C0687Ey) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A03[lowIndex]);
                if (highAllocation.A01 == this.A06) {
                    lowIndex++;
                } else {
                    com.facebook.ads.redexgen.core.C0687Ey lowAllocation = (com.facebook.ads.redexgen.core.C0687Ey) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A03[highIndex]);
                    if (lowAllocation.A01 != this.A06) {
                        highIndex--;
                    } else {
                        this.A03[lowIndex] = lowAllocation;
                        int targetAllocationCount4 = highIndex - 1;
                        this.A03[highIndex] = highAllocation;
                        highIndex = targetAllocationCount4;
                        lowIndex++;
                    }
                }
            }
            max = java.lang.Math.max(max, lowIndex);
            int targetAllocationCount5 = this.A01;
            if (max >= targetAllocationCount5) {
                return;
            }
        }
        com.facebook.ads.redexgen.core.C0687Ey[] c0687EyArr = this.A03;
        int targetAvailableCount = this.A01;
        java.util.Arrays.fill(c0687EyArr, max, targetAvailableCount, (java.lang.Object) null);
        this.A01 = max;
    }
}
