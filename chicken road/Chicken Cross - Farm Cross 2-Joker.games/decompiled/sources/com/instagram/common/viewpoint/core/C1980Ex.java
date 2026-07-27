package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Ex, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1980Ex {
    public static String[] A05 = {"LpJTwMN2G", "VgMO4aUKUhad1vQS8qeWccWG6TZwybQB", "ACcLkDhyx", "Vz4L8Yk2qa8xi00BpA99exXw347yn2OW", "M93qmyVYUpuFuHp", "Ixo", "WCFkueysi57ip8GEP7BFiSRGMX4T5ofH", "LFY6A3GYQmBEHARGrOHSwwc2jPi1aXj0"};
    public final int A00;
    public final C3445pY A01;
    public final Object A02;
    public final C18127s[] A03;
    public final InterfaceC3302nE[] A04;

    public C1980Ex(C18127s[] c18127sArr, InterfaceC3302nE[] interfaceC3302nEArr, C3445pY c3445pY, Object obj) {
        this.A03 = c18127sArr;
        this.A04 = (InterfaceC3302nE[]) interfaceC3302nEArr.clone();
        this.A01 = c3445pY;
        this.A02 = obj;
        this.A00 = c18127sArr.length;
    }

    public final boolean A00(int i) {
        return this.A03[i] != null;
    }

    public final boolean A01(C1980Ex c1980Ex, int i) {
        if (c1980Ex == null) {
            return false;
        }
        C18127s[] c18127sArr = this.A03;
        if (A05[5].length() == 3) {
            A05[1] = "2a41zxf8OUQisEdMYeAN8aC4JNcLEgEy";
            if (!C5C.A1E(c18127sArr[i], c1980Ex.A03[i])) {
                return false;
            }
            InterfaceC3302nE interfaceC3302nE = this.A04[i];
            InterfaceC3302nE interfaceC3302nE2 = c1980Ex.A04[i];
            String[] strArr = A05;
            if (strArr[2].length() == strArr[0].length()) {
                A05[4] = "ShAZgc6gkhlm9OR";
                return C5C.A1E(interfaceC3302nE, interfaceC3302nE2);
            }
        }
        throw new RuntimeException();
    }
}
