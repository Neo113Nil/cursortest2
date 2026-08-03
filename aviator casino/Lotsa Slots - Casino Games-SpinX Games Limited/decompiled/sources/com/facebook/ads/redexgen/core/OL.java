package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class OL extends android.os.Handler {
    public static byte[] A0A;
    public static java.lang.String[] A0B = {"XpTFDRYls00C", "vck7ifrHAA2V1iiiFUM31a68qMrbz65A", "7kp6PJRyhpiDK2W7qsF8Tl5UxrhGPWlx", "kdOcXot4hr7W5LaxQbiu9WGktsRnBt7r", "NVDD45FTbKQ7iY36httqcibFke2pUkbB", "Eok23iuk6Oafvplk2kJb6Rczje1W7ylG", "EhR8LI8Shp7o1jykQx", "UYPguptf9M8vyKCeT3Zah9qOVZaP16c1"};
    public android.os.Messenger A00;
    public boolean A01;
    public boolean A02;
    public final android.content.ServiceConnection A03;
    public final android.os.Handler A04;
    public final android.os.Messenger A05;
    public final com.facebook.ads.redexgen.core.AbstractC1756ik A06;
    public final com.facebook.ads.redexgen.core.C1636gi A07;
    public final com.facebook.ads.redexgen.core.C1632ge A08;
    public final com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc A09;

    public static java.lang.String A04(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 86);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A07() {
        A0A = new byte[]{-30, -17, -25, -37, -63, -64, -59, -53, -42, -55, -51, -42, -72, -57, -57, -42, -58, -55, -64, -68, -59, -53, -72, -53, -64, -58, -59, -42, -62, -68, -48, -54, -35, -27, -25, -20, -35, -104, -21, -35, -22, -18, -31, -37, -35, -104, -35, -22, -22, -25, -22, -90, -84, -83, -85, -72, -102, -99, -72, -94, -99, -72, -92, -98, -78, 71, 58, 54, 72, 37, 74, 65, 54};
    }

    static {
        A07();
    }

    public OL(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.AbstractC1756ik abstractC1756ik) {
        super(android.os.Looper.getMainLooper());
        this.A04 = new android.os.Handler(android.os.Looper.getMainLooper());
        this.A03 = new com.facebook.ads.redexgen.core.OK(this);
        this.A07 = c1636gi;
        this.A08 = c1636gi.A02();
        this.A05 = new android.os.Messenger(this);
        this.A06 = abstractC1756ik;
        this.A09 = new com.facebook.ads.redexgen.core.C1738iQ(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        if (this.A01) {
            A0C();
            this.A00 = null;
        }
        this.A06.A09();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06() {
        this.A00 = null;
        A0C();
        if (this.A06.A03().A6p() == com.facebook.ads.redexgen.core.OD.A06) {
            this.A07.A0F().AHx();
            this.A06.A0B(10, com.facebook.ads.internal.protocol.AdErrorType.INTERNAL_ERROR, null);
            return;
        }
        if (this.A06.A03().A6q() == com.facebook.ads.redexgen.core.OD.A07) {
            if (com.facebook.ads.redexgen.core.AbstractC1089Us.A08(this.A07)) {
                this.A07.A0F().AHn();
                if (this.A06 instanceof com.facebook.ads.redexgen.core.C7Y) {
                    this.A06.AEs(1022, this.A06.A04(), null);
                    return;
                } else {
                    if (this.A06 instanceof com.facebook.ads.redexgen.core.C7X) {
                        this.A06.AEs(3000, this.A06.A04(), null);
                        if (((com.facebook.ads.redexgen.core.C7X) this.A06).A0E().A03 != null) {
                            this.A06.AEs(3002, this.A06.A04(), null);
                        }
                        this.A06.AEs(com.ironsource.C3226pe.h, this.A06.A04(), null);
                        return;
                    }
                    return;
                }
            }
            com.facebook.ads.redexgen.core.C1636gi c1636gi = this.A07;
            java.lang.String[] strArr = A0B;
            if (strArr[1].charAt(8) == strArr[2].charAt(8)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0B;
            strArr2[3] = "cr4Q9HMWLwUnqKkNe0JHYa6bJM3GW5OO";
            strArr2[4] = "PiN7IKeRutrD0cCtifS7cTLBqsuq3alq";
            c1636gi.A0F().AHx();
            this.A06.A0B(10, com.facebook.ads.internal.protocol.AdErrorType.INTERNAL_ERROR, null);
            return;
        }
        if (this.A06.A03().A6p() != com.facebook.ads.redexgen.core.OD.A05) {
            return;
        }
        if (com.facebook.ads.redexgen.core.AbstractC1089Us.A0C(this.A07)) {
            this.A07.A0F().AI4();
            this.A06.A03().AAw();
            this.A06.A0D(true);
            this.A06.A09();
            return;
        }
        this.A07.A0F().AI3();
        this.A06.A03().AJR(new com.facebook.ads.AdError(2008, A04(31, 21, 34)));
    }

    private void A08(android.os.Messenger messenger, int i, android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Message obtain = android.os.Message.obtain((android.os.Handler) null, i);
        obtain.replyTo = this.A05;
        if (bundle != null) {
            obtain.setData(bundle);
        }
        obtain.getData().putString(A04(52, 13, 3), this.A06.A04());
        messenger.send(obtain);
    }

    public static void A0B(com.facebook.ads.redexgen.core.C1636gi c1636gi, java.lang.String str) {
        c1636gi.A0F().AHr(str);
        com.facebook.ads.redexgen.core.T5 A0G = c1636gi.A0G();
        if (A0G != null && A0G.A6o() != null && A0G.A6k() != null) {
            A0G.A6o().onError(A0G.A6k(), com.facebook.ads.AdError.AD_PRESENTATION_ERROR);
        }
    }

    public final void A0C() {
        if (this.A01) {
            this.A07.A0F().AIG();
            this.A01 = false;
            this.A08.unbindService(this.A03);
        }
    }

    public final void A0D(com.facebook.ads.redexgen.core.C1636gi c1636gi, int i) {
        this.A07.A0F().AIE();
        com.facebook.ads.internal.util.activity.AdActivityIntent A05 = com.facebook.ads.redexgen.core.C1140Wu.A05(c1636gi);
        A05.putExtra(A04(65, 8, 123), com.facebook.ads.redexgen.core.WK.A0F);
        A05.putExtra(A04(52, 13, 3), this.A06.A04());
        A05.putExtra(A04(5, 26, 33), i);
        try {
            int usedContext = com.facebook.ads.redexgen.core.C1140Wu.A00(c1636gi, A05);
            this.A07.A0F().AIF(usedContext);
        } catch (com.facebook.ads.redexgen.core.C1138Ws e) {
            java.lang.String A04 = A04(0, 5, 75);
            java.lang.Throwable cause = e.getCause();
            if (cause != null) {
                A04 = A04 + cause.toString();
            }
            A0B(c1636gi, A04);
        }
    }

    public final void A0E(boolean z) {
        this.A01 = com.facebook.ads.redexgen.core.OM.A04(this.A08, z, this.A03);
        if (this.A01) {
            this.A07.A0F().AHt();
            if (this.A00 == null) {
                this.A04.postDelayed(this.A09, com.facebook.ads.redexgen.core.AbstractC1089Us.A00(this.A08));
                return;
            }
            return;
        }
        this.A07.A0F().AI1();
        this.A02 = false;
        this.A06.A09();
    }

    public final boolean A0F(int i, android.os.Bundle bundle) {
        try {
            android.os.Messenger service = this.A00;
            if (service != null) {
                A08(service, i, bundle);
                return true;
            }
            return false;
        } catch (android.os.RemoteException e) {
            A0C();
            this.A07.A0F().AHw(e);
            return false;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            if (message.what == 3) {
                return;
            }
            if (message.what == 20 || message.what == 30 || message.what == 40) {
                if (message.what == 20) {
                    this.A07.A0F().AIB();
                    com.facebook.ads.redexgen.core.AbstractC1089Us.A07(this.A08);
                } else {
                    this.A07.A0F().AIA();
                }
                A05();
                return;
            }
            java.lang.String adId = message.getData().getString(A04(52, 13, 3));
            if (!this.A06.A04().equals(adId)) {
                this.A07.A0F().AIH();
            } else if (message.what == 2001 || message.what == 1011) {
                com.facebook.ads.redexgen.core.OM.A02(this.A08, message);
            } else {
                this.A07.A0F().AI2(message.what);
                this.A06.A0C(message);
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
