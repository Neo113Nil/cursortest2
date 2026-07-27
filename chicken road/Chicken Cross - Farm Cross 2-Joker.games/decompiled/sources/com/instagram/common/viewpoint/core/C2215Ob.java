package com.instagram.common.viewpoint.core;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Ob, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2215Ob extends AbstractC2874fo {
    public static String[] A01 = {"M3Te92XvVv4q3bfKEkaCq6oPQP87x4vv", "LzmiiHhJsyKuUkJv7K1Ir2o", "KopJ75", "b4r1pmUHtrvrrbICXjY", "ceBgm8EiRhrot5ffXZtZ35omPt2ZFFf0", "0EayevzsZQe4lRY4RLfa4MEWre", "N9h8Vj", "K1Ob6mZ8MwS9WZtXZ80XEzEALvtTcRJ2"};
    public final /* synthetic */ Z2 A00;

    public C2215Ob(Z2 z2) {
        this.A00 = z2;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2874fo
    public final void A03() {
        AbstractC2230Oq abstractC2230Oq;
        C2875fp c2875fp;
        Y2 y2;
        WeakReference weakReference;
        C2875fp c2875fp2;
        Y2 y22;
        AbstractC2230Oq abstractC2230Oq2;
        C2875fp c2875fp3;
        abstractC2230Oq = this.A00.A08;
        if (abstractC2230Oq != null) {
            abstractC2230Oq2 = this.A00.A08;
            if (!abstractC2230Oq2.A0G()) {
                c2875fp3 = this.A00.A0A;
                c2875fp3.A0T();
                return;
            }
        }
        c2875fp = this.A00.A0A;
        c2875fp.A0V();
        y2 = this.A00.A06;
        if (!y2.A07()) {
            y22 = this.A00.A06;
            y22.A05();
        }
        weakReference = this.A00.A0C;
        Z1 listener = (Z1) weakReference.get();
        if (listener != null) {
            listener.AEA();
        }
        Z2 z2 = this.A00;
        String[] strArr = A01;
        if (strArr[1].length() == strArr[3].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[1] = "2rS8p9kEkH8XxeBlGl7RSlB";
        strArr2[3] = "nqXy6qNf0NylKakjBUJ";
        c2875fp2 = z2.A0A;
        c2875fp2.A0V();
    }
}
