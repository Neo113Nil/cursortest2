package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.hQ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1680hQ extends com.facebook.ads.redexgen.core.WP {
    public static java.lang.String[] A02 = {"aYZ348mE1NYrFcMBoebQMkiZFG78oX5w", "qZgy2fVZKkcRQxGeLIPji8yDZzfZsU0K", "FW", "4WpWxoGmbDHaVYPSEbV5W", "JuvmjYnKk99PR9XqbJ5bpADbGT7vNhdJ", "90qKQYWe37jbHMTFJzGbdEUnuOp61wed", "dYksIGNGyyMeZtC5mrM4so", "pL5NnltKvH9DFuMzl1s9TskXUqu4u7R4"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1676hM A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1108Vm A01;

    public C1680hQ(com.facebook.ads.redexgen.core.C1676hM c1676hM, com.facebook.ads.redexgen.core.C1108Vm c1108Vm) {
        this.A00 = c1676hM;
        this.A01 = c1108Vm;
    }

    @Override // com.facebook.ads.redexgen.core.WP
    public final void A01() {
        com.facebook.ads.redexgen.core.C0997Rd c0997Rd;
        com.facebook.ads.redexgen.core.C0997Rd c0997Rd2;
        com.facebook.ads.redexgen.core.C0997Rd c0997Rd3;
        c0997Rd = this.A00.A01;
        if (c0997Rd.A06() != null) {
            c0997Rd2 = this.A00.A01;
            com.facebook.ads.AdListener A06 = c0997Rd2.A06();
            c0997Rd3 = this.A00.A01;
            if (A02[2].length() != 2) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A02;
            strArr[3] = "zGBwvDJj20KV94Zd2N0fZ";
            strArr[6] = "5j2wCmqr0QfuHbPw5sx74i";
            A06.onError(c0997Rd3.A07(), com.facebook.ads.redexgen.core.XE.A00(this.A01));
        }
    }
}
