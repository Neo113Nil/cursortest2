package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.lU, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1913lU implements com.facebook.ads.redexgen.core.H9 {
    public static java.lang.String[] A03 = {"MPtFkEiIPrQJk6C68eapJqoHhp6zbLCW", "P1eCuU1JvuL46IL3Xh4EOSVLMCcJCOjT", "W4WpROs4sm5j6Tf0ztR0Y16lEj4WGQ", "4wLB1kD6U2fJ8LvWKaQYimBngFnzynrL", "j1g6H1G7HHWswscQmxGermXRDRDROF5f", "vYNShvJ8K3s57yIlGqGLfJHMZKUSU02I", "LyEFdcIU17ooQUQ0BZMXWJLXZvdofmIX", "P7XGal"};
    public static final com.facebook.ads.redexgen.core.HD A04 = new com.facebook.ads.redexgen.core.HD() { // from class: com.facebook.ads.redexgen.X.lV
        @Override // com.facebook.ads.redexgen.core.HD
        public final com.facebook.ads.redexgen.core.H9[] A5N() {
            return com.facebook.ads.redexgen.core.C1913lU.A00();
        }

        @Override // com.facebook.ads.redexgen.core.HD
        public final /* synthetic */ com.facebook.ads.redexgen.core.H9[] A5O(android.net.Uri uri, java.util.Map map) {
            return com.facebook.ads.redexgen.core.HC.A01(this, uri, map);
        }
    };
    public boolean A00;
    public final com.facebook.ads.redexgen.core.C1912lT A02 = new com.facebook.ads.redexgen.core.C1912lT();
    public final com.facebook.ads.redexgen.core.C04434v A01 = new com.facebook.ads.redexgen.core.C04434v(16384);

    public static /* synthetic */ com.facebook.ads.redexgen.core.H9[] A00() {
        return new com.facebook.ads.redexgen.core.H9[]{new com.facebook.ads.redexgen.core.C1913lU()};
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final void AAC(com.facebook.ads.redexgen.core.HA ha) {
        this.A02.A5c(ha, new com.facebook.ads.redexgen.core.LG(0, 1));
        ha.A6O();
        ha.AJ7(new com.facebook.ads.redexgen.core.C1982mn(-9223372036854775807L));
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final int AHL(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms, com.facebook.ads.redexgen.core.HV hv) throws java.io.IOException {
        int read = interfaceC1987ms.read(this.A01.A0l(), 0, 16384);
        if (read == -1) {
            return -1;
        }
        this.A01.A0f(0);
        this.A01.A0e(read);
        if (!this.A00) {
            this.A02.AGq(0L, 4);
            this.A00 = true;
        }
        this.A02.A5A(this.A01);
        return 0;
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final void AHb() {
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final void AJ6(long j, long j2) {
        this.A00 = false;
        this.A02.AJ5();
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final boolean AK5(com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms) throws java.io.IOException {
        com.facebook.ads.redexgen.core.C04434v c04434v = new com.facebook.ads.redexgen.core.C04434v(10);
        int length = 0;
        while (true) {
            byte[] A0l = c04434v.A0l();
            if (A03[3].charAt(10) != 'f') {
                throw new java.lang.RuntimeException();
            }
            A03[3] = "dKI30oOFAvfBQiacazr45UFgS6k9aj5a";
            interfaceC1987ms.AGt(A0l, 0, 10);
            c04434v.A0f(0);
            if (c04434v.A0K() != 4801587) {
                interfaceC1987ms.AIl();
                interfaceC1987ms.A47(length);
                int i = length;
                int syncBytes = 0;
                while (true) {
                    interfaceC1987ms.AGt(c04434v.A0l(), 0, 7);
                    c04434v.A0f(0);
                    int headerPosition = c04434v.A0M();
                    if (headerPosition != 44096 && headerPosition != 44097) {
                        syncBytes = 0;
                        interfaceC1987ms.AIl();
                        i++;
                        if (i - length >= 8192) {
                            return false;
                        }
                        interfaceC1987ms.A47(i);
                    } else {
                        syncBytes++;
                        if (syncBytes >= 4) {
                            return true;
                        }
                        int headerPosition2 = com.facebook.ads.redexgen.core.AbstractC0734Gu.A02(c04434v.A0l(), headerPosition);
                        if (headerPosition2 == -1) {
                            return false;
                        }
                        interfaceC1987ms.A47(headerPosition2 - 7);
                    }
                }
            } else {
                c04434v.A0g(3);
                int A0H = c04434v.A0H();
                length += A0H + 10;
                interfaceC1987ms.A47(A0H);
            }
        }
    }
}
