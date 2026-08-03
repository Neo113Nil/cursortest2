package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Ex, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0686Ex {
    public static java.lang.String[] A05 = {"LpJTwMN2G", "VgMO4aUKUhad1vQS8qeWccWG6TZwybQB", "ACcLkDhyx", "Vz4L8Yk2qa8xi00BpA99exXw347yn2OW", "M93qmyVYUpuFuHp", "Ixo", "WCFkueysi57ip8GEP7BFiSRGMX4T5ofH", "LFY6A3GYQmBEHARGrOHSwwc2jPi1aXj0"};
    public final int A00;
    public final com.facebook.ads.redexgen.core.C2151pY A01;
    public final java.lang.Object A02;
    public final com.facebook.ads.redexgen.core.C05187s[] A03;
    public final com.facebook.ads.redexgen.core.InterfaceC2008nE[] A04;

    public C0686Ex(com.facebook.ads.redexgen.core.C05187s[] c05187sArr, com.facebook.ads.redexgen.core.InterfaceC2008nE[] interfaceC2008nEArr, com.facebook.ads.redexgen.core.C2151pY c2151pY, java.lang.Object obj) {
        this.A03 = c05187sArr;
        this.A04 = (com.facebook.ads.redexgen.core.InterfaceC2008nE[]) interfaceC2008nEArr.clone();
        this.A01 = c2151pY;
        this.A02 = obj;
        this.A00 = c05187sArr.length;
    }

    public final boolean A00(int i) {
        return this.A03[i] != null;
    }

    public final boolean A01(com.facebook.ads.redexgen.core.C0686Ex c0686Ex, int i) {
        if (c0686Ex == null) {
            return false;
        }
        com.facebook.ads.redexgen.core.C05187s[] c05187sArr = this.A03;
        if (A05[5].length() == 3) {
            A05[1] = "2a41zxf8OUQisEdMYeAN8aC4JNcLEgEy";
            if (!com.facebook.ads.redexgen.core.C5C.A1E(c05187sArr[i], c0686Ex.A03[i])) {
                return false;
            }
            com.facebook.ads.redexgen.core.InterfaceC2008nE interfaceC2008nE = this.A04[i];
            com.facebook.ads.redexgen.core.InterfaceC2008nE interfaceC2008nE2 = c0686Ex.A04[i];
            java.lang.String[] strArr = A05;
            if (strArr[2].length() == strArr[0].length()) {
                A05[4] = "ShAZgc6gkhlm9OR";
                return com.facebook.ads.redexgen.core.C5C.A1E(interfaceC2008nE, interfaceC2008nE2);
            }
        }
        throw new java.lang.RuntimeException();
    }
}
