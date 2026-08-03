package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.l5, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1888l5 implements com.facebook.ads.redexgen.core.L8 {
    public final com.facebook.ads.redexgen.core.C04424u A00 = new com.facebook.ads.redexgen.core.C04424u(new byte[4]);
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1886l3 A01;

    public C1888l5(com.facebook.ads.redexgen.core.C1886l3 c1886l3) {
        this.A01 = c1886l3;
    }

    @Override // com.facebook.ads.redexgen.core.L8
    public final void A5A(com.facebook.ads.redexgen.core.C04434v c04434v) {
        int secondHeaderByte;
        android.util.SparseArray sparseArray;
        android.util.SparseArray sparseArray2;
        android.util.SparseArray sparseArray3;
        int tableId = c04434v.A0I();
        if (tableId != 0) {
            return;
        }
        int tableId2 = c04434v.A0I();
        if ((tableId2 & 128) == 0) {
            return;
        }
        c04434v.A0g(6);
        int A07 = c04434v.A07() / 4;
        for (int i = 0; i < A07; i++) {
            c04434v.A0h(this.A00, 4);
            int programCount = this.A00.A04(16);
            this.A00.A09(3);
            if (programCount == 0) {
                this.A00.A09(13);
            } else {
                int A04 = this.A00.A04(13);
                sparseArray2 = this.A01.A0B;
                if (sparseArray2.get(A04) == null) {
                    sparseArray3 = this.A01.A0B;
                    sparseArray3.put(A04, new com.facebook.ads.redexgen.core.C1892l9(new com.facebook.ads.redexgen.core.C1887l4(this.A01, A04)));
                    com.facebook.ads.redexgen.core.C1886l3.A02(this.A01);
                }
            }
        }
        secondHeaderByte = this.A01.A09;
        if (secondHeaderByte != 2) {
            sparseArray = this.A01.A0B;
            sparseArray.remove(0);
        }
    }

    @Override // com.facebook.ads.redexgen.core.L8
    public final void AAA(com.facebook.ads.redexgen.core.AnonymousClass53 anonymousClass53, com.facebook.ads.redexgen.core.HA ha, com.facebook.ads.redexgen.core.LG lg) {
    }
}
