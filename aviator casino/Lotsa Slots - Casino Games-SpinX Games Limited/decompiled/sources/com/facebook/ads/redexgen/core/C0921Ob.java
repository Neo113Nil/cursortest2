package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Ob, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0921Ob extends com.facebook.ads.redexgen.core.AbstractC1580fo {
    public static java.lang.String[] A01 = {"M3Te92XvVv4q3bfKEkaCq6oPQP87x4vv", "LzmiiHhJsyKuUkJv7K1Ir2o", "KopJ75", "b4r1pmUHtrvrrbICXjY", "ceBgm8EiRhrot5ffXZtZ35omPt2ZFFf0", "0EayevzsZQe4lRY4RLfa4MEWre", "N9h8Vj", "K1Ob6mZ8MwS9WZtXZ80XEzEALvtTcRJ2"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.Z2 A00;

    public C0921Ob(com.facebook.ads.redexgen.core.Z2 z2) {
        this.A00 = z2;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1580fo
    public final void A03() {
        com.facebook.ads.redexgen.core.AbstractC0936Oq abstractC0936Oq;
        com.facebook.ads.redexgen.core.C1581fp c1581fp;
        com.facebook.ads.redexgen.core.Y2 y2;
        java.lang.ref.WeakReference weakReference;
        com.facebook.ads.redexgen.core.C1581fp c1581fp2;
        com.facebook.ads.redexgen.core.Y2 y22;
        com.facebook.ads.redexgen.core.AbstractC0936Oq abstractC0936Oq2;
        com.facebook.ads.redexgen.core.C1581fp c1581fp3;
        abstractC0936Oq = this.A00.A08;
        if (abstractC0936Oq != null) {
            abstractC0936Oq2 = this.A00.A08;
            if (!abstractC0936Oq2.A0G()) {
                c1581fp3 = this.A00.A0A;
                c1581fp3.A0T();
                return;
            }
        }
        c1581fp = this.A00.A0A;
        c1581fp.A0V();
        y2 = this.A00.A06;
        if (!y2.A07()) {
            y22 = this.A00.A06;
            y22.A05();
        }
        weakReference = this.A00.A0C;
        com.facebook.ads.redexgen.core.Z1 listener = (com.facebook.ads.redexgen.core.Z1) weakReference.get();
        if (listener != null) {
            listener.AEA();
        }
        com.facebook.ads.redexgen.core.Z2 z2 = this.A00;
        java.lang.String[] strArr = A01;
        if (strArr[1].length() == strArr[3].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A01;
        strArr2[1] = "2rS8p9kEkH8XxeBlGl7RSlB";
        strArr2[3] = "nqXy6qNf0NylKakjBUJ";
        c1581fp2 = z2.A0A;
        c1581fp2.A0V();
    }
}
