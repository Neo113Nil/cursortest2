package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdListener;

/* renamed from: com.facebook.ads.redexgen.X.hQ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2974hQ extends WP {
    public static String[] A02 = {"aYZ348mE1NYrFcMBoebQMkiZFG78oX5w", "qZgy2fVZKkcRQxGeLIPji8yDZzfZsU0K", "FW", "4WpWxoGmbDHaVYPSEbV5W", "JuvmjYnKk99PR9XqbJ5bpADbGT7vNhdJ", "90qKQYWe37jbHMTFJzGbdEUnuOp61wed", "dYksIGNGyyMeZtC5mrM4so", "pL5NnltKvH9DFuMzl1s9TskXUqu4u7R4"};
    public final /* synthetic */ C2970hM A00;
    public final /* synthetic */ C2402Vm A01;

    public C2974hQ(C2970hM c2970hM, C2402Vm c2402Vm) {
        this.A00 = c2970hM;
        this.A01 = c2402Vm;
    }

    @Override // com.instagram.common.viewpoint.core.WP
    public final void A01() {
        C2291Rd c2291Rd;
        C2291Rd c2291Rd2;
        C2291Rd c2291Rd3;
        c2291Rd = this.A00.A01;
        if (c2291Rd.A06() != null) {
            c2291Rd2 = this.A00.A01;
            AdListener A06 = c2291Rd2.A06();
            c2291Rd3 = this.A00.A01;
            if (A02[2].length() != 2) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[3] = "zGBwvDJj20KV94Zd2N0fZ";
            strArr[6] = "5j2wCmqr0QfuHbPw5sx74i";
            A06.onError(c2291Rd3.A07(), XE.A00(this.A01));
        }
    }
}
