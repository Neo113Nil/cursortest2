package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public final class EL {
    public static String[] A05 = {"LpJTwMN2G", "VgMO4aUKUhad1vQS8qeWccWG6TZwybQB", "ACcLkDhyx", "Vz4L8Yk2qa8xi00BpA99exXw347yn2OW", "M93qmyVYUpuFuHp", "Ixo", "WCFkueysi57ip8GEP7BFiSRGMX4T5ofH", "LFY6A3GYQmBEHARGrOHSwwc2jPi1aXj0"};
    public final int A00;
    public final C1785o6 A01;
    public final Object A02;
    public final C7G[] A03;
    public final InterfaceC1640lj[] A04;

    public EL(C7G[] c7gArr, InterfaceC1640lj[] interfaceC1640ljArr, C1785o6 c1785o6, Object obj) {
        this.A03 = c7gArr;
        this.A04 = (InterfaceC1640lj[]) interfaceC1640ljArr.clone();
        this.A01 = c1785o6;
        this.A02 = obj;
        this.A00 = c7gArr.length;
    }

    public final boolean A00(int i) {
        return this.A03[i] != null;
    }

    public final boolean A01(EL el, int i) {
        if (el == null) {
            return false;
        }
        C7G[] c7gArr = this.A03;
        if (A05[5].length() == 3) {
            A05[1] = "2a41zxf8OUQisEdMYeAN8aC4JNcLEgEy";
            if (!AbstractC01424a.A1E(c7gArr[i], el.A03[i])) {
                return false;
            }
            InterfaceC1640lj interfaceC1640lj = this.A04[i];
            InterfaceC1640lj interfaceC1640lj2 = el.A04[i];
            String[] strArr = A05;
            if (strArr[2].length() == strArr[0].length()) {
                A05[4] = "ShAZgc6gkhlm9OR";
                return AbstractC01424a.A1E(interfaceC1640lj, interfaceC1640lj2);
            }
        }
        throw new RuntimeException();
    }
}
