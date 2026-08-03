package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.3v, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C04173v extends com.facebook.ads.redexgen.core.AbstractC0656Dt {
    public static java.lang.String[] A01 = {"A0hxmHyocA20uKbzLNrX1cuoBFAzY21E", "I9xoCKjiIf8OmMJxcwGdtcNw1YuiDvi3", androidx.media3.exoplayer.upstream.CmcdConfiguration.KEY_DEADLINE, "8cu3hn6v04Mabo0DRb3BoKxPmV6m17RH", "M3PfsQ0uQOYBe23ut3RBur7M821ZKE4o", "dBLXd4nh7JPFvxg4r1eMmoTDEY", "dzagYupPsp4H2uhompZ2DySoLx14PfZd", "Z1qzuvaE1jq9Ec95ZFgzh3McR3fZkyWy"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0649Dm A00;

    public C04173v(com.facebook.ads.redexgen.core.C0649Dm c0649Dm) {
        this.A00 = c0649Dm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.UN
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(com.facebook.ads.redexgen.core.C0657Du c0657Du) {
        com.facebook.ads.redexgen.core.C0673Ek c0673Ek;
        boolean z;
        android.os.Handler handler;
        boolean A0G;
        boolean z2;
        android.os.Handler handler2;
        int i;
        c0673Ek = this.A00.A01;
        if (c0673Ek == null) {
            return;
        }
        z = this.A00.A05;
        if (!z && c0657Du.A00().getAction() == 0) {
            com.facebook.ads.redexgen.core.C0649Dm c0649Dm = this.A00;
            java.lang.String[] strArr = A01;
            if (strArr[5].length() == strArr[2].length()) {
                throw new java.lang.RuntimeException();
            }
            A01[4] = "8qKCS4QoQxaUoDKBRazWJt0HJmuP0GoR";
            handler = c0649Dm.A07;
            handler.removeCallbacksAndMessages(null);
            A0G = this.A00.A0G(com.facebook.ads.redexgen.core.EnumC1549fJ.A04);
            if (A0G) {
                this.A00.A03();
                com.facebook.ads.redexgen.core.C0649Dm c0649Dm2 = this.A00;
                if (A01[3].charAt(1) != 'x') {
                    A01[3] = "krfS0sgwBFPIM38aK2Y5K2a50FO4BQxK";
                    c0649Dm2.A06(true, false);
                } else {
                    c0649Dm2.A06(true, false);
                }
            }
            z2 = this.A00.A04;
            if (!z2) {
                return;
            }
            handler2 = this.A00.A07;
            com.facebook.ads.redexgen.core.C0650Dn c0650Dn = new com.facebook.ads.redexgen.core.C0650Dn(this);
            i = this.A00.A00;
            handler2.postDelayed(c0650Dn, i);
        }
    }
}
