package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.1b, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C03491b extends com.facebook.ads.redexgen.core.AE implements android.os.Handler.Callback {
    public static byte[] A0H;
    public static java.lang.String[] A0I = {"58lW15hp88fFpLaSxErp", "56QScXrV6I", "DwEmmtKo2ODeTiA17rxauXwet98Z4", "A4aLtxZMLOPLaVE6SeDzXnpOLTGefetw", "FhOKuZuvLBWd8lghoK1mwxVLtzQRZ", "h1d8vpIJ83Cnf8DVjx4Ui7av1xQxYsFL", "y1YT0hSXczs7bGZDGpuR", "alxZNjekiwxoo3ZSsAAxphzspQJfVEZr"};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public com.facebook.ads.redexgen.core.C2196qI A05;
    public com.facebook.ads.redexgen.core.InterfaceC1935lq A06;
    public com.facebook.ads.redexgen.core.C8S A07;
    public com.facebook.ads.redexgen.core.C8P A08;
    public com.facebook.ads.redexgen.core.C8P A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final android.os.Handler A0D;
    public final com.facebook.ads.redexgen.core.C04996z A0E;
    public final com.facebook.ads.redexgen.core.EP A0F;
    public final com.facebook.ads.redexgen.core.ES A0G;

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0H, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            java.lang.String[] strArr = A0I;
            if (strArr[6].length() != strArr[0].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0I;
            strArr2[2] = "1YRuRVntTKbD5w1SSS8awuyRss3tM";
            strArr2[4] = "HmFGzdsys3t1iPkkAdwtO8Q44Z9aJ";
            if (i4 >= length) {
                return new java.lang.String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 122);
            i4++;
        }
    }

    public static void A09() {
        A0H = new byte[]{89, Byte.MAX_VALUE, 104, 126, 99, 126, 102, 111, 42, 110, 111, 105, 101, 110, 99, 100, 109, 42, 108, 107, 99, 102, 111, 110, 36, 42, 121, 126, 120, 111, 107, 103, 76, 101, 120, 103, 107, 126, 55, 57, 8, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.EM, 63, 8, 3, 9, 8, com.google.common.base.Ascii.US, 8, com.google.common.base.Ascii.US};
    }

    static {
        A09();
    }

    public C03491b(com.facebook.ads.redexgen.core.ES es, android.os.Looper looper, com.facebook.ads.redexgen.core.EP ep) {
        super(3);
        this.A0G = (com.facebook.ads.redexgen.core.ES) com.facebook.ads.redexgen.core.AbstractC04203y.A01(es);
        this.A0D = looper == null ? null : com.facebook.ads.redexgen.core.C5C.A0c(looper, this);
        this.A0F = ep;
        this.A0E = new com.facebook.ads.redexgen.core.C04996z();
        this.A02 = -9223372036854775807L;
        this.A04 = -9223372036854775807L;
        this.A03 = -9223372036854775807L;
    }

    private long A00() {
        if (this.A01 == -1) {
            return Long.MAX_VALUE;
        }
        com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A09);
        if (this.A01 >= this.A09.A84()) {
            return Long.MAX_VALUE;
        }
        return this.A09.A83(this.A01);
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"subtitle"})
    @org.checkerframework.dataflow.qual.SideEffectFree
    private long A01(long j) {
        int A8a = this.A09.A8a(j);
        if (A8a != 0) {
            int nextEventTimeIndex = this.A09.A84();
            if (nextEventTimeIndex != 0) {
                java.lang.String[] strArr = A0I;
                java.lang.String str = strArr[6];
                java.lang.String str2 = strArr[0];
                int length = str.length();
                int nextEventTimeIndex2 = str2.length();
                if (length != nextEventTimeIndex2) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr2 = A0I;
                strArr2[2] = "dWbBH4lKinuUlTA8CpNFonpmnzuPl";
                strArr2[4] = "MDue3s6tkJ65MZJ0TxYFZvpfeIb1w";
                if (A8a == -1) {
                    com.facebook.ads.redexgen.core.C8P c8p = this.A09;
                    if (A0I[1].length() != 10) {
                        int nextEventTimeIndex3 = this.A09.A84();
                        return c8p.A83(nextEventTimeIndex3 - 1);
                    }
                    A0I[3] = "us0wUp64B7rq5nQeuQUWAOSOIfPFOl8I";
                    int nextEventTimeIndex4 = this.A09.A84();
                    return c8p.A83(nextEventTimeIndex4 - 1);
                }
                int nextEventTimeIndex5 = A8a - 1;
                return this.A09.A83(nextEventTimeIndex5);
            }
        }
        return ((com.facebook.ads.redexgen.core.AbstractC2116oz) this.A09).A01;
    }

    @org.checkerframework.dataflow.qual.SideEffectFree
    private long A02(long j) {
        boolean z = true;
        com.facebook.ads.redexgen.core.AbstractC04203y.A08(j != -9223372036854775807L);
        if (this.A04 == -9223372036854775807L) {
            z = false;
        }
        com.facebook.ads.redexgen.core.AbstractC04203y.A08(z);
        return j - this.A04;
    }

    private void A04() {
        A0B(new com.facebook.ads.redexgen.core.C2144pR(com.facebook.ads.redexgen.core.MetaExoPlayerCustomizedCollections.A01(), A02(this.A03)));
    }

    private void A05() {
        this.A0C = true;
        this.A06 = this.A0F.A5K((com.facebook.ads.redexgen.core.C2196qI) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A05));
    }

    private void A06() {
        this.A07 = null;
        this.A01 = -1;
        if (this.A09 != null) {
            this.A09.A0B();
            this.A09 = null;
        }
        if (this.A08 != null) {
            this.A08.A0B();
            this.A08 = null;
        }
    }

    private void A07() {
        A06();
        ((com.facebook.ads.redexgen.core.InterfaceC1935lq) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A06)).AHb();
        this.A06 = null;
        this.A00 = 0;
    }

    private void A08() {
        A07();
        A05();
    }

    private void A0A(com.facebook.ads.redexgen.core.C2144pR c2144pR) {
        this.A0G.ADa(c2144pR.A01);
        this.A0G.ADZ(c2144pR);
    }

    private void A0B(com.facebook.ads.redexgen.core.C2144pR c2144pR) {
        if (this.A0D != null) {
            this.A0D.obtainMessage(0, c2144pR).sendToTarget();
        } else {
            A0A(c2144pR);
        }
    }

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "Method to propagate any SubtitleDecoder Error upwards")
    private void A0C(com.facebook.ads.redexgen.core.ER er) {
        if (this.A0D != null) {
            this.A0D.obtainMessage(1, er).sendToTarget();
        }
    }

    private void A0D(com.facebook.ads.redexgen.core.C1928lj c1928lj) {
        com.facebook.ads.redexgen.core.AbstractC04284g.A08(A03(39, 12, 23), A03(0, 39, 112) + this.A05, c1928lj);
        A0C(new com.facebook.ads.redexgen.core.ER(this.A05, c1928lj));
        A04();
        A08();
    }

    @Override // com.facebook.ads.redexgen.core.AE
    public final void A1Z() {
        this.A05 = null;
        this.A02 = -9223372036854775807L;
        A04();
        this.A04 = -9223372036854775807L;
        this.A03 = -9223372036854775807L;
        A07();
    }

    @Override // com.facebook.ads.redexgen.core.AE
    public final void A1a(long j, boolean z) {
        this.A03 = j;
        A04();
        this.A0A = false;
        this.A0B = false;
        this.A02 = -9223372036854775807L;
        if (this.A00 != 0) {
            A08();
        } else {
            A06();
            ((com.facebook.ads.redexgen.core.InterfaceC1935lq) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A06)).flush();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AE
    public final void A1c(com.facebook.ads.redexgen.core.C2196qI[] c2196qIArr, long j, long j2) {
        this.A04 = j2;
        this.A05 = c2196qIArr[0];
        if (this.A06 != null) {
            this.A00 = 1;
        } else {
            A05();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2105oo
    public final boolean AAP() {
        return this.A0B;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2105oo
    public final boolean AAe() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e8, code lost:
    
        if (r7 != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ea, code lost:
    
        r9.A09.A0B();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ef, code lost:
    
        r9.A01 = r6.A8a(r10);
        r9.A09 = r6;
        r9.A08 = null;
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0102, code lost:
    
        if (r7 != null) goto L51;
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC2105oo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AIX(long j, long j2) {
        this.A03 = j;
        if (AAN() && this.A02 != -9223372036854775807L && j >= this.A02) {
            A06();
            this.A0B = true;
        }
        if (this.A0B) {
            return;
        }
        if (this.A08 == null) {
            ((com.facebook.ads.redexgen.core.InterfaceC1935lq) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A06)).AJh(j);
            try {
                this.A08 = ((com.facebook.ads.redexgen.core.InterfaceC1935lq) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A06)).A5t();
            } catch (com.facebook.ads.redexgen.core.C1928lj e) {
                A0D(e);
                return;
            }
        }
        if (A9A() != 2) {
            return;
        }
        boolean z = false;
        if (this.A09 != null) {
            long A00 = A00();
            while (A00 <= j) {
                this.A01++;
                A00 = A00();
                z = true;
            }
        }
        if (this.A08 != null) {
            com.facebook.ads.redexgen.core.C8P c8p = this.A08;
            boolean textRendererNeedsUpdate = c8p.A05();
            if (textRendererNeedsUpdate) {
                if (!z && A00() == Long.MAX_VALUE) {
                    if (this.A00 == 2) {
                        A08();
                    } else {
                        A06();
                        this.A0B = true;
                    }
                }
            } else if (((com.facebook.ads.redexgen.core.AbstractC2116oz) c8p).A01 <= j) {
                com.facebook.ads.redexgen.core.C8P c8p2 = this.A09;
                if (A0I[1].length() != 10) {
                    java.lang.String[] strArr = A0I;
                    strArr[6] = "SM2l9fwyY7vSK8U9dCan";
                    strArr[0] = "PLBzRsO91bLUZoRphjDr";
                } else {
                    A0I[1] = "uDUYlaOON0";
                }
            }
        }
        if (z) {
            com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A09);
            A0B(new com.facebook.ads.redexgen.core.C2144pR(this.A09.A7X(j), A02(A01(j))));
        }
        int i = this.A00;
        if (A0I[3].charAt(23) != 'O') {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A0I;
        strArr2[6] = "ML0YoWWFYnm1pIYkMDlj";
        strArr2[0] = "WzY2c9YM67lXJGPj7nnt";
        if (i == 2) {
            return;
        }
        while (true) {
            try {
                boolean textRendererNeedsUpdate2 = this.A0A;
                if (!textRendererNeedsUpdate2) {
                    com.facebook.ads.redexgen.core.C8S c8s = this.A07;
                    if (c8s == null) {
                        c8s = ((com.facebook.ads.redexgen.core.InterfaceC1935lq) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A06)).A5r();
                        if (c8s != null) {
                            this.A07 = c8s;
                        } else {
                            return;
                        }
                    }
                    if (this.A00 == 1) {
                        c8s.A02(4);
                        ((com.facebook.ads.redexgen.core.InterfaceC1935lq) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A06)).AHJ(c8s);
                        this.A07 = null;
                        this.A00 = 2;
                        return;
                    }
                    int A1R = A1R(this.A0E, c8s, 0);
                    if (A1R == -4) {
                        boolean textRendererNeedsUpdate3 = c8s.A05();
                        if (textRendererNeedsUpdate3) {
                            this.A0A = true;
                            this.A0C = false;
                        } else {
                            com.facebook.ads.redexgen.core.C2196qI c2196qI = this.A0E.A00;
                            if (c2196qI != null) {
                                c8s.A00 = c2196qI.A0M;
                                c8s.A0B();
                                boolean z2 = this.A0C;
                                boolean textRendererNeedsUpdate4 = c8s.A07();
                                this.A0C = (textRendererNeedsUpdate4 ? false : true) & z2;
                            } else {
                                return;
                            }
                        }
                        boolean textRendererNeedsUpdate5 = this.A0C;
                        if (!textRendererNeedsUpdate5) {
                            ((com.facebook.ads.redexgen.core.InterfaceC1935lq) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A06)).AHJ(c8s);
                            this.A07 = null;
                        }
                    } else if (A1R == -3) {
                        return;
                    }
                } else {
                    return;
                }
            } catch (com.facebook.ads.redexgen.core.C1928lj e2) {
                A0D(e2);
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05157p
    public final int AKM(com.facebook.ads.redexgen.core.C2196qI c2196qI) {
        if (this.A0F.AKN(c2196qI)) {
            return com.facebook.ads.redexgen.core.AbstractC05087i.A00(4);
        }
        if (com.facebook.ads.redexgen.core.C3J.A0E(c2196qI.A0W)) {
            return com.facebook.ads.redexgen.core.AbstractC05087i.A00(1);
        }
        return com.facebook.ads.redexgen.core.AbstractC05087i.A00(0);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2105oo, com.facebook.ads.redexgen.core.InterfaceC05157p
    public final java.lang.String getName() {
        return A03(39, 12, 23);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        switch (message.what) {
            case 0:
                A0A((com.facebook.ads.redexgen.core.C2144pR) message.obj);
                return true;
            case 1:
                return true;
            default:
                throw new java.lang.IllegalStateException();
        }
    }
}
