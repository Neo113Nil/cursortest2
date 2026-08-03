package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.oJ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2074oJ implements com.facebook.ads.redexgen.core.InterfaceC04063k {
    public long A03;
    public long A04;
    public com.facebook.ads.redexgen.core.C9Y A09;
    public boolean A0D;
    public boolean A0E;
    public float A01 = 1.0f;
    public float A00 = 1.0f;
    public com.facebook.ads.redexgen.core.C04043i A07 = com.facebook.ads.redexgen.core.C04043i.A05;
    public com.facebook.ads.redexgen.core.C04043i A08 = com.facebook.ads.redexgen.core.C04043i.A05;
    public com.facebook.ads.redexgen.core.C04043i A05 = com.facebook.ads.redexgen.core.C04043i.A05;
    public com.facebook.ads.redexgen.core.C04043i A06 = com.facebook.ads.redexgen.core.C04043i.A05;
    public java.nio.ByteBuffer A0A = com.facebook.ads.redexgen.core.InterfaceC04063k.A00;
    public java.nio.ShortBuffer A0C = this.A0A.asShortBuffer();
    public java.nio.ByteBuffer A0B = com.facebook.ads.redexgen.core.InterfaceC04063k.A00;
    public int A02 = -1;

    public final long A00(long j) {
        if (this.A04 >= 1024) {
            long A0I = this.A03 - ((com.facebook.ads.redexgen.core.C9Y) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A09)).A0I();
            if (this.A06.A03 == this.A05.A03) {
                long processedInputBytes = com.facebook.ads.redexgen.core.C5C.A0U(j, A0I, this.A04);
                return processedInputBytes;
            }
            long processedInputBytes2 = this.A06.A03;
            long j2 = A0I * processedInputBytes2;
            long j3 = this.A04;
            long processedInputBytes3 = this.A05.A03;
            return com.facebook.ads.redexgen.core.C5C.A0U(j, j2, j3 * processedInputBytes3);
        }
        return (long) (this.A01 * j);
    }

    public final void A01(float f) {
        if (this.A00 != f) {
            this.A00 = f;
            this.A0E = true;
        }
    }

    public final void A02(float f) {
        if (this.A01 != f) {
            this.A01 = f;
            this.A0E = true;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC04063k
    public final com.facebook.ads.redexgen.core.C04043i A57(com.facebook.ads.redexgen.core.C04043i c04043i) throws com.facebook.ads.redexgen.core.C04053j {
        int i;
        if (c04043i.A02 == 2) {
            if (this.A02 == -1) {
                i = c04043i.A03;
            } else {
                i = this.A02;
            }
            this.A07 = c04043i;
            this.A08 = new com.facebook.ads.redexgen.core.C04043i(i, c04043i.A01, 2);
            this.A0E = true;
            return this.A08;
        }
        throw new com.facebook.ads.redexgen.core.C04053j(c04043i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC04063k
    public final java.nio.ByteBuffer A8d() {
        int A0H;
        com.facebook.ads.redexgen.core.C9Y c9y = this.A09;
        if (c9y != null && (A0H = c9y.A0H()) > 0) {
            if (this.A0A.capacity() < A0H) {
                this.A0A = java.nio.ByteBuffer.allocateDirect(A0H).order(java.nio.ByteOrder.nativeOrder());
                this.A0C = this.A0A.asShortBuffer();
            } else {
                this.A0A.clear();
                this.A0C.clear();
            }
            c9y.A0L(this.A0C);
            this.A04 += A0H;
            this.A0A.limit(A0H);
            this.A0B = this.A0A;
        }
        java.nio.ByteBuffer outputBuffer = this.A0B;
        this.A0B = com.facebook.ads.redexgen.core.InterfaceC04063k.A00;
        return outputBuffer;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC04063k
    public final boolean AAL() {
        return this.A08.A03 != -1 && (java.lang.Math.abs(this.A01 - 1.0f) >= 1.0E-4f || java.lang.Math.abs(this.A00 - 1.0f) >= 1.0E-4f || this.A08.A03 != this.A07.A03);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC04063k
    public final boolean AAP() {
        return this.A0D && (this.A09 == null || this.A09.A0H() == 0);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC04063k
    public final void AHG() {
        if (this.A09 != null) {
            this.A09.A0K();
        }
        this.A0D = true;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC04063k
    public final void AHH(java.nio.ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        com.facebook.ads.redexgen.core.C9Y c9y = (com.facebook.ads.redexgen.core.C9Y) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A09);
        java.nio.ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        int remaining = byteBuffer.remaining();
        this.A03 += remaining;
        c9y.A0M(asShortBuffer);
        byteBuffer.position(byteBuffer.position() + remaining);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC04063k
    public final void flush() {
        if (AAL()) {
            this.A05 = this.A07;
            this.A06 = this.A08;
            if (this.A0E) {
                this.A09 = new com.facebook.ads.redexgen.core.C9Y(this.A05.A03, this.A05.A01, this.A01, this.A00, this.A06.A03);
            } else if (this.A09 != null) {
                this.A09.A0J();
            }
        }
        this.A0B = com.facebook.ads.redexgen.core.InterfaceC04063k.A00;
        this.A03 = 0L;
        this.A04 = 0L;
        this.A0D = false;
    }
}
