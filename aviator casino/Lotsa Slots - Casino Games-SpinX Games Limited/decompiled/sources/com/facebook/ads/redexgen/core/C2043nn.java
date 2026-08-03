package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.nn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2043nn implements com.facebook.ads.redexgen.core.FL, com.facebook.ads.redexgen.core.InterfaceC0627Cp {
    public static java.lang.String[] A0E = {"SSDELygzudefytBtRYlDWoyFfpg", "4SEnazR2Nu4dPKZqq", "4H9jqKlT7lQdtxWBQl9xa6akogWkCWsp", "Wknx73gM1GoPE2GN1snRYal1oMjUwY3P", "7txELYcTJwThSLRxJ5dUM1K4qPQ", "gA7GGJKubAjwOro28", "9KdodW4K4GXGszeM7wnefptXiT4TjY3", ""};
    public long A00;
    public com.facebook.ads.redexgen.core.C04565i A01;
    public com.facebook.ads.redexgen.core.InterfaceC0743Hd A02;
    public boolean A04;
    public final android.net.Uri A06;
    public final com.facebook.ads.redexgen.core.AnonymousClass48 A07;
    public final com.facebook.ads.redexgen.core.AG A08;
    public final com.facebook.ads.redexgen.core.DD A09;
    public final com.facebook.ads.redexgen.core.HA A0A;
    public volatile boolean A0C;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C05599p A0D;
    public final com.facebook.ads.redexgen.core.HV A0B = new com.facebook.ads.redexgen.core.HV();
    public boolean A03 = true;
    public final long A05 = com.facebook.ads.redexgen.core.Cq.A00();

    public C2043nn(com.facebook.ads.redexgen.core.C05599p c05599p, android.net.Uri uri, com.facebook.ads.redexgen.core.InterfaceC2132pF interfaceC2132pF, com.facebook.ads.redexgen.core.DD dd, com.facebook.ads.redexgen.core.HA ha, com.facebook.ads.redexgen.core.AnonymousClass48 anonymousClass48) {
        this.A0D = c05599p;
        this.A06 = uri;
        this.A08 = new com.facebook.ads.redexgen.core.AG(interfaceC2132pF);
        this.A09 = dd;
        this.A0A = ha;
        this.A07 = anonymousClass48;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(long j, long j2) {
        this.A0B.A00 = j;
        this.A00 = j2;
        this.A03 = true;
        this.A04 = false;
    }

    @Override // com.facebook.ads.redexgen.core.FL
    public final void A4r() {
        this.A0C = true;
    }

    @Override // com.facebook.ads.redexgen.core.FL
    public final void AAr() throws java.io.IOException {
        int i = 0;
        while (i == 0 && !this.A0C) {
            try {
                long j = this.A0B.A00;
                this.A01 = new com.facebook.ads.redexgen.core.C04565i(this.A06, j, -1L, this.A0D.A0b);
                long AGi = this.A08.AGi(this.A01);
                if (AGi != -1) {
                    AGi += j;
                    this.A0D.A0G();
                }
                this.A0D.A09 = null;
                com.facebook.ads.redexgen.core.InterfaceC2132pF interfaceC2132pF = this.A08;
                if (this.A0D.A09 != null && this.A0D.A09.A01 != -1) {
                    final com.facebook.ads.redexgen.core.AG ag = this.A08;
                    final int i2 = this.A0D.A09.A01;
                    interfaceC2132pF = new com.facebook.ads.redexgen.core.InterfaceC2132pF(ag, i2, this) { // from class: com.facebook.ads.redexgen.X.9r
                        public int A00;
                        public final int A01;
                        public final com.facebook.ads.redexgen.core.InterfaceC2132pF A02;
                        public final com.facebook.ads.redexgen.core.InterfaceC0627Cp A03;
                        public final byte[] A04;

                        {
                            com.facebook.ads.redexgen.core.AbstractC04203y.A07(i2 > 0);
                            this.A02 = ag;
                            this.A01 = i2;
                            this.A03 = this;
                            this.A04 = new byte[1];
                            this.A00 = i2;
                        }

                        private boolean A00() throws java.io.IOException {
                            int bytesRead = this.A02.read(this.A04, 0, 1);
                            if (bytesRead == -1) {
                                return false;
                            }
                            int bytesRead2 = this.A04[0];
                            int metadataLength = (bytesRead2 & 255) << 4;
                            if (metadataLength == 0) {
                                return true;
                            }
                            int i3 = 0;
                            int i4 = metadataLength;
                            byte[] bArr = new byte[metadataLength];
                            while (i4 > 0) {
                                int bytesRead3 = this.A02.read(bArr, i3, i4);
                                if (bytesRead3 == -1) {
                                    return false;
                                }
                                i3 += bytesRead3;
                                i4 -= bytesRead3;
                            }
                            while (metadataLength > 0) {
                                int bytesRead4 = metadataLength - 1;
                                if (bArr[bytesRead4] != 0) {
                                    break;
                                }
                                metadataLength--;
                            }
                            if (metadataLength > 0) {
                                this.A03.AE5(new com.facebook.ads.redexgen.core.C04434v(bArr, metadataLength));
                            }
                            return true;
                        }

                        @Override // com.facebook.ads.redexgen.core.InterfaceC2132pF
                        public final void A43(com.facebook.ads.redexgen.core.InterfaceC04675t interfaceC04675t) {
                            com.facebook.ads.redexgen.core.AbstractC04203y.A01(interfaceC04675t);
                            this.A02.A43(interfaceC04675t);
                        }

                        @Override // com.facebook.ads.redexgen.core.InterfaceC2132pF
                        public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> A8t() {
                            return this.A02.A8t();
                        }

                        @Override // com.facebook.ads.redexgen.core.InterfaceC2132pF
                        public final android.net.Uri A9P() {
                            return this.A02.A9P();
                        }

                        @Override // com.facebook.ads.redexgen.core.InterfaceC2132pF
                        public final long AGi(com.facebook.ads.redexgen.core.C04565i c04565i) {
                            throw new java.lang.UnsupportedOperationException();
                        }

                        @Override // com.facebook.ads.redexgen.core.InterfaceC2132pF
                        public final void close() {
                            throw new java.lang.UnsupportedOperationException();
                        }

                        @Override // com.facebook.ads.redexgen.core.InterfaceC03762c
                        public final int read(byte[] bArr, int i3, int i4) throws java.io.IOException {
                            if (this.A00 == 0) {
                                if (!A00()) {
                                    return -1;
                                }
                                this.A00 = this.A01;
                            }
                            int read = this.A02.read(bArr, i3, java.lang.Math.min(this.A00, i4));
                            if (read != -1) {
                                int bytesRead = this.A00;
                                this.A00 = bytesRead - read;
                            }
                            return read;
                        }
                    };
                    this.A02 = this.A0D.A0Z();
                    this.A02.A6e(com.facebook.ads.redexgen.core.C05599p.A0g);
                }
                this.A09.AAB(interfaceC2132pF, this.A06, this.A08.A8t(), j, AGi, this.A0A);
                if (this.A0D.A09 != null) {
                    this.A09.A5y();
                }
                if (this.A03) {
                    this.A09.AJ6(j, this.A00);
                    this.A03 = false;
                }
                while (i == 0 && !this.A0C) {
                    try {
                        this.A07.A00();
                        i = this.A09.AHM(this.A0B);
                        long position = this.A09.A7a();
                        if (position > this.A0D.A0M + j) {
                            j = position;
                            this.A07.A02();
                            this.A0D.A0O.post(this.A0D.A0a);
                        }
                    } catch (java.lang.InterruptedException unused) {
                        throw new java.io.InterruptedIOException();
                    }
                }
                if (i == 1) {
                    i = 0;
                } else {
                    long A7a = this.A09.A7a();
                    java.lang.String[] strArr = A0E;
                    if (strArr[2].charAt(24) != strArr[3].charAt(24)) {
                        throw new java.lang.RuntimeException();
                    }
                    A0E[6] = "OKjnlHtv3KbBLefZQYMpPe9SdH47QI1";
                    if (A7a != -1) {
                        this.A0B.A00 = this.A09.A7a();
                    }
                }
                com.facebook.ads.redexgen.core.AbstractC04515d.A00(this.A08);
            } catch (java.lang.Throwable th) {
                if (i != 1 && this.A09.A7a() != -1) {
                    this.A0B.A00 = this.A09.A7a();
                }
                com.facebook.ads.redexgen.core.AbstractC04515d.A00(this.A08);
                throw th;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0627Cp
    public final void AE5(com.facebook.ads.redexgen.core.C04434v c04434v) {
        long max;
        if (this.A04) {
            max = java.lang.Math.max(this.A0D.A03(true), this.A00);
        } else {
            max = this.A00;
        }
        int A07 = c04434v.A07();
        com.facebook.ads.redexgen.core.InterfaceC0743Hd interfaceC0743Hd = (com.facebook.ads.redexgen.core.InterfaceC0743Hd) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A02);
        interfaceC0743Hd.AIr(c04434v, A07);
        interfaceC0743Hd.AIu(max, 1, A07, 0, null);
        this.A04 = true;
    }
}
