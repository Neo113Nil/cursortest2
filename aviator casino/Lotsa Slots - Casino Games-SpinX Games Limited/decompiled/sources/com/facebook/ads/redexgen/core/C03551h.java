package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.1h, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C03551h extends com.facebook.ads.redexgen.core.AQ {
    public int A00;
    public android.net.Uri A01;
    public java.net.DatagramSocket A02;
    public java.net.InetAddress A03;
    public java.net.MulticastSocket A04;
    public boolean A05;
    public final int A06;
    public final java.net.DatagramPacket A07;
    public final byte[] A08;

    public C03551h() {
        this(2000);
    }

    public C03551h(int i) {
        this(i, 8000);
    }

    public C03551h(int i, int i2) {
        super(true);
        this.A06 = i2;
        this.A08 = new byte[i];
        this.A07 = new java.net.DatagramPacket(this.A08, 0, i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2132pF
    public final android.net.Uri A9P() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2132pF
    public final long AGi(com.facebook.ads.redexgen.core.C04565i c04565i) throws com.facebook.ads.redexgen.core.C2118p1 {
        this.A01 = c04565i.A06;
        java.lang.String str = (java.lang.String) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A01.getHost());
        int port = this.A01.getPort();
        A0G(c04565i);
        try {
            this.A03 = java.net.InetAddress.getByName(str);
            java.net.InetSocketAddress inetSocketAddress = new java.net.InetSocketAddress(this.A03, port);
            if (this.A03.isMulticastAddress()) {
                this.A04 = new java.net.MulticastSocket(inetSocketAddress);
                this.A04.joinGroup(this.A03);
                this.A02 = this.A04;
            } else {
                this.A02 = new java.net.DatagramSocket(inetSocketAddress);
            }
            this.A02.setSoTimeout(this.A06);
            this.A05 = true;
            A0H(c04565i);
            return -1L;
        } catch (java.io.IOException e) {
            throw new com.facebook.ads.redexgen.core.C2118p1(e, 2001);
        } catch (java.lang.SecurityException e2) {
            throw new com.facebook.ads.redexgen.core.C2118p1(e2, 2006);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2132pF
    public final void close() {
        this.A01 = null;
        if (this.A04 != null) {
            try {
                this.A04.leaveGroup((java.net.InetAddress) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A03));
            } catch (java.io.IOException unused) {
            }
            this.A04 = null;
        }
        if (this.A02 != null) {
            this.A02.close();
            this.A02 = null;
        }
        this.A03 = null;
        this.A00 = 0;
        if (this.A05) {
            this.A05 = false;
            A0E();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03762c
    public final int read(byte[] bArr, int i, int i2) throws com.facebook.ads.redexgen.core.C2118p1 {
        if (i2 == 0) {
            return 0;
        }
        if (this.A00 == 0) {
            try {
                ((java.net.DatagramSocket) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A02)).receive(this.A07);
                this.A00 = this.A07.getLength();
                A0F(this.A00);
            } catch (java.net.SocketTimeoutException e) {
                throw new com.facebook.ads.redexgen.core.C2118p1(e, 2002);
            } catch (java.io.IOException e2) {
                throw new com.facebook.ads.redexgen.core.C2118p1(e2, 2001);
            }
        }
        int length = this.A07.getLength() - this.A00;
        int packetOffset = this.A00;
        int bytesToRead = java.lang.Math.min(packetOffset, i2);
        java.lang.System.arraycopy(this.A08, length, bArr, i, bytesToRead);
        int packetOffset2 = this.A00;
        this.A00 = packetOffset2 - bytesToRead;
        return bytesToRead;
    }
}
