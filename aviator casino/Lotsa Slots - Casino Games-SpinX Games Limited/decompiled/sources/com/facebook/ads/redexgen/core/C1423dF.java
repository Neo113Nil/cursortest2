package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.dF, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1423dF extends java.io.InputStream {
    public static byte[] A04;
    public java.security.MessageDigest A00;
    public final com.facebook.ads.redexgen.core.C1632ge A01;
    public final com.facebook.ads.redexgen.core.InterfaceC1422dE A02;
    public final java.io.FileInputStream A03;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 43);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-52, -61, -76, -23, -8, -15};
    }

    public C1423dF(com.facebook.ads.redexgen.core.C1632ge c1632ge, java.io.FileInputStream fileInputStream, com.facebook.ads.redexgen.core.InterfaceC1422dE interfaceC1422dE) {
        this.A03 = fileInputStream;
        this.A02 = interfaceC1422dE;
        this.A01 = c1632ge;
        try {
            this.A00 = java.security.MessageDigest.getInstance(A00(0, 3, 84));
        } catch (java.security.NoSuchAlgorithmException unused) {
            this.A00 = null;
        }
    }

    @Override // java.io.InputStream
    public final int available() throws java.io.IOException {
        return this.A03.available();
    }

    @Override // java.io.InputStream
    public final int read() throws java.io.IOException {
        byte[] b = new byte[1];
        return read(b);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        int read = this.A03.read(bArr, i, i2);
        if (this.A00 != null) {
            try {
                if (read > 0) {
                    this.A00.update(bArr, i, read);
                } else if (read == -1) {
                    this.A02.A9s(com.facebook.ads.redexgen.core.C1144Xa.A05(this.A00.digest()));
                    this.A00 = null;
                }
            } catch (java.lang.Exception e) {
                this.A00 = null;
                this.A01.A08().ABz(A00(3, 3, 90), com.facebook.ads.redexgen.core.AbstractC1048Td.A13, new com.facebook.ads.redexgen.core.C1049Te(e));
            }
        }
        return read;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws java.io.IOException {
        int actuallyRead = (int) j;
        byte[] bArr = new byte[1024];
        long j2 = 0;
        while (actuallyRead > 0) {
            int bytesToRead = read(bArr, 0, java.lang.Math.min(actuallyRead, 1024));
            if (bytesToRead <= 0) {
                break;
            }
            actuallyRead -= bytesToRead;
            j2 += bytesToRead;
        }
        return j2;
    }
}
