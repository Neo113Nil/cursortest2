package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.nC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C3300nC implements F0 {
    public int A00;
    public int A01;
    public int A02;
    public C1981Ey[] A03;
    public final int A04;
    public final boolean A05;
    public final byte[] A06;

    public C3300nC(boolean z, int i) {
        this(z, i, 0);
    }

    public C3300nC(boolean z, int i, int i2) {
        AbstractC17143y.A07(i > 0);
        AbstractC17143y.A07(i2 >= 0);
        this.A05 = z;
        this.A04 = i;
        this.A01 = i2;
        this.A03 = new C1981Ey[i2 + 100];
        if (i2 > 0) {
            this.A06 = new byte[i2 * i];
            for (int i3 = 0; i3 < i2; i3++) {
                this.A03[i3] = new C1981Ey(this.A06, i3 * i);
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

    @Override // com.instagram.common.viewpoint.core.F0
    public final synchronized C1981Ey A49() {
        C1981Ey c1981Ey;
        this.A00++;
        if (this.A01 > 0) {
            C1981Ey[] c1981EyArr = this.A03;
            int i = this.A01 - 1;
            this.A01 = i;
            c1981Ey = (C1981Ey) AbstractC17143y.A01(c1981EyArr[i]);
            this.A03[this.A01] = null;
        } else {
            c1981Ey = new C1981Ey(new byte[this.A04], 0);
            if (this.A00 > this.A03.length) {
                this.A03 = (C1981Ey[]) Arrays.copyOf(this.A03, this.A03.length * 2);
            }
        }
        return c1981Ey;
    }

    @Override // com.instagram.common.viewpoint.core.F0
    public final int A8I() {
        return this.A04;
    }

    @Override // com.instagram.common.viewpoint.core.F0
    public final synchronized void AHd(C1981Ey c1981Ey) {
        C1981Ey[] c1981EyArr = this.A03;
        int i = this.A01;
        this.A01 = i + 1;
        c1981EyArr[i] = c1981Ey;
        this.A00--;
        notifyAll();
    }

    @Override // com.instagram.common.viewpoint.core.F0
    public final synchronized void AHe(InterfaceC1982Ez interfaceC1982Ez) {
        while (interfaceC1982Ez != null) {
            C1981Ey[] c1981EyArr = this.A03;
            int i = this.A01;
            this.A01 = i + 1;
            c1981EyArr[i] = interfaceC1982Ez.A6u();
            this.A00--;
            interfaceC1982Ez = interfaceC1982Ez.ACc();
        }
        notifyAll();
    }

    @Override // com.instagram.common.viewpoint.core.F0
    public final synchronized void AKT() {
        int A05 = C5C.A05(this.A02, this.A04);
        int targetAllocationCount = this.A00;
        int max = Math.max(0, A05 - targetAllocationCount);
        int targetAllocationCount2 = this.A01;
        if (max >= targetAllocationCount2) {
            return;
        }
        if (this.A06 != null) {
            int lowIndex = 0;
            int targetAllocationCount3 = this.A01;
            int highIndex = targetAllocationCount3 - 1;
            while (lowIndex <= highIndex) {
                C1981Ey highAllocation = (C1981Ey) AbstractC17143y.A01(this.A03[lowIndex]);
                if (highAllocation.A01 == this.A06) {
                    lowIndex++;
                } else {
                    C1981Ey lowAllocation = (C1981Ey) AbstractC17143y.A01(this.A03[highIndex]);
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
            max = Math.max(max, lowIndex);
            int targetAllocationCount5 = this.A01;
            if (max >= targetAllocationCount5) {
                return;
            }
        }
        C1981Ey[] c1981EyArr = this.A03;
        int targetAvailableCount = this.A01;
        Arrays.fill(c1981EyArr, max, targetAvailableCount, (Object) null);
        this.A01 = max;
    }
}
