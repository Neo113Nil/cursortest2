package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class OO extends android.os.Handler {
    public static byte[] A09;
    public static java.lang.String[] A0A = {"huWs6nyYMzfxZtpl5l", "fgwmKB6Qyc6FtxfQKB9IkKk97cCBhoPq", "Jv452jFQqMHbXRCew", "VJzjxvVEvnwAHRNG0UVfEBBm35lAgOcC", "2O55YLspBlua8aaDjHW6JYUsijhI69vr", "eg8WpOT66b5I3PrsSw6YGr9", "zIsMPTJraAXX1U7X8ddpQ67iDmaNCfrq", "78M1aKJi48odvK"};
    public android.os.Messenger A00;
    public com.facebook.ads.redexgen.core.InterfaceC1151Xh A01;
    public boolean A02;
    public final android.content.ServiceConnection A03;
    public final android.os.Handler A04;
    public final android.os.Messenger A05;
    public final com.facebook.ads.redexgen.core.InterfaceC0862Lt A06;
    public final com.facebook.ads.redexgen.core.C1632ge A07;
    public final com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc A08;

    public static java.lang.String A05(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 57);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A06() {
        A09 = new byte[]{-102, -83, -85, -83, -79, -66, -83, -84, 104, -80, -87, -74, -84, -69, -80, -87, -77, -83, 104, -82, -87, -79, -76, -83, -84, 116, 104, -85, -73, -84, -83, -126, 104, -116, -115, -117, -104, -119, 122, 124, -124, 122, Byte.MIN_VALUE, 126, -104, 122, -123, -117, 126, 122, 125, -110, -104, 126, -111, -126, -116, -115, -116, -104, -124, 126, -110, 0, 1, -1, com.google.common.base.Ascii.FF, -3, -18, -16, -8, -18, -12, -14, com.google.common.base.Ascii.FF, -10, -5, 0, 1, -18, -7, -7, -14, -15, com.google.common.base.Ascii.FF, -8, -14, 6, -28, -27, -29, -16, -31, -46, -44, -36, -46, -40, -42, -16, -36, -42, -22};
    }

    static {
        A06();
    }

    public OO(com.facebook.ads.redexgen.core.C1632ge c1632ge) {
        super(android.os.Looper.getMainLooper());
        this.A04 = new android.os.Handler(android.os.Looper.getMainLooper());
        this.A03 = new com.facebook.ads.redexgen.core.ON(this);
        this.A07 = c1632ge;
        this.A05 = new android.os.Messenger(this);
        com.facebook.ads.redexgen.core.InterfaceC0866Lx funnelModule = c1632ge.A00(c1632ge);
        if (funnelModule != null) {
            this.A06 = funnelModule.ACM();
        } else {
            this.A06 = new com.facebook.ads.redexgen.core.C1856kX();
        }
        this.A08 = new com.facebook.ads.redexgen.core.C1736iO(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(android.os.Messenger messenger) {
        android.os.Message obtain = android.os.Message.obtain((android.os.Handler) null, 1);
        obtain.replyTo = this.A05;
        obtain.setData(com.facebook.ads.redexgen.core.OX.A00(this.A07));
        try {
            messenger.send(obtain);
        } catch (android.os.RemoteException unused) {
        }
    }

    public final void A09() {
        if (this.A02) {
            this.A02 = false;
            this.A07.unbindService(this.A03);
            this.A00 = null;
        }
    }

    public final void A0A(java.lang.String str, com.facebook.ads.redexgen.core.InterfaceC1151Xh interfaceC1151Xh, int i) {
        if (this.A02) {
            this.A06.AIN(i);
            this.A01 = interfaceC1151Xh;
            android.os.Message obtain = android.os.Message.obtain((android.os.Handler) null, i);
            obtain.replyTo = this.A05;
            if (str != null) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString(A05(88, 15, 88), str);
                obtain.setData(bundle);
            }
            try {
                if (this.A00 != null) {
                    this.A00.send(obtain);
                    return;
                }
                return;
            } catch (android.os.RemoteException e) {
                this.A06.AIO(e.toString());
                return;
            }
        }
        com.facebook.ads.redexgen.core.InterfaceC0862Lt interfaceC0862Lt = this.A06;
        if (A0A[3].charAt(16) != '0') {
            throw new java.lang.RuntimeException();
        }
        A0A[1] = "UrwnsONYHFKEsBm1tj1C3JCQoMa7O9rm";
        interfaceC0862Lt.AIP();
    }

    public final void A0B(boolean z) {
        this.A06.AIK();
        this.A02 = com.facebook.ads.redexgen.core.OM.A04(this.A07, z, this.A03);
        if (this.A02) {
            android.os.Messenger messenger = this.A00;
            if (A0A[2].length() != 17) {
                throw new java.lang.RuntimeException();
            }
            A0A[6] = "P62SHD49IwhaYJMd1yj6mhn8O1XS0mYq";
            if (messenger == null) {
                this.A04.postDelayed(this.A08, com.facebook.ads.redexgen.core.AbstractC1089Us.A01(this.A07));
                return;
            }
            return;
        }
        com.facebook.ads.redexgen.core.U5.A05(this.A07);
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            if (message.what == 2) {
                com.facebook.ads.redexgen.core.OM.A02(this.A07, message);
                this.A06.AIJ();
                return;
            }
            if (message.what == 20 || message.what == 40 || message.what == 30) {
                this.A06.AIL(message.what);
                if (message.what == 20) {
                    com.facebook.ads.redexgen.core.AbstractC1089Us.A07(this.A07);
                }
                java.lang.String str = A05(0, 33, 15) + message.what;
                com.facebook.ads.redexgen.core.U5.A05(this.A07);
                return;
            }
            if (message.what == 4) {
                this.A06.AIM();
                android.os.Bundle data = message.getData();
                if (this.A01 != null) {
                    boolean z = data.getBoolean(A05(33, 30, 0), false);
                    java.lang.String A05 = A05(88, 15, 88);
                    if (A0A[3].charAt(16) != '0') {
                        throw new java.lang.RuntimeException();
                    }
                    A0A[0] = "zzNr3SVv6qtYyPyvWR";
                    if (z) {
                        this.A01.AF5(data.getString(A05));
                    } else if (data.getBoolean(A05(63, 25, 116), false)) {
                        this.A01.AF6(data.getString(A05));
                    }
                }
            }
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
