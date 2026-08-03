package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.kP, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1848kP implements com.facebook.ads.redexgen.core.InterfaceC0876Mh {
    public static byte[] A07;
    public static java.lang.String[] A08 = {"F3MsLf6P", "OcoAPMR8U6yTwuATNsSjihct3nuq8KFx", "bdE6GcC1kS6ix1fgAcoyQkC9rv", "V0wqj6Me", "EdnIrf", "cKhO3MBZMfPQ2uYBFx142UbqGZ0vcEvq", "x8zWNoAeDf", "YEiR7yHxtXFy2pC0Q9KvxgBtY"};
    public com.facebook.ads.redexgen.core.C0883Mo A00;
    public boolean A01;
    public final com.facebook.ads.redexgen.core.AnonymousClass40 A02;
    public final java.security.SecureRandom A03;
    public final javax.crypto.Cipher A04;
    public final javax.crypto.spec.SecretKeySpec A05;
    public final boolean A06;

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A07, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            java.lang.String[] strArr = A08;
            if (strArr[2].length() == strArr[0].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A08;
            strArr2[6] = "SFj9nJw9GR";
            strArr2[4] = "liv3w1";
            if (i4 >= length) {
                return new java.lang.String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 117);
            i4++;
        }
    }

    public static void A03() {
        A07 = new byte[]{com.google.common.base.Ascii.VT, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.GS};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A05(java.util.HashMap<java.lang.String, com.facebook.ads.redexgen.core.C0875Mg> hashMap) throws java.io.IOException {
        try {
            com.facebook.ads.redexgen.core.C04213z A03 = this.A02.A03();
            if (this.A00 == null) {
                this.A00 = new com.facebook.ads.redexgen.core.C0883Mo(A03);
            } else {
                this.A00.A00(A03);
            }
            com.facebook.ads.redexgen.core.C0883Mo c0883Mo = this.A00;
            java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(c0883Mo);
            dataOutputStream.writeInt(2);
            dataOutputStream.writeInt(this.A06 ? 1 : 0);
            if (this.A06) {
                byte[] bArr = new byte[16];
                ((java.security.SecureRandom) com.facebook.ads.redexgen.core.C5C.A0f(this.A03)).nextBytes(bArr);
                dataOutputStream.write(bArr);
                try {
                    ((javax.crypto.Cipher) com.facebook.ads.redexgen.core.C5C.A0f(this.A04)).init(1, (java.security.Key) com.facebook.ads.redexgen.core.C5C.A0f(this.A05), new javax.crypto.spec.IvParameterSpec(bArr));
                    dataOutputStream.flush();
                    dataOutputStream = new java.io.DataOutputStream(new javax.crypto.CipherOutputStream(c0883Mo, this.A04));
                } catch (java.security.InvalidAlgorithmParameterException | java.security.InvalidKeyException e) {
                    throw new java.lang.IllegalStateException(e);
                }
            }
            dataOutputStream.writeInt(hashMap.size());
            int i = 0;
            for (com.facebook.ads.redexgen.core.C0875Mg c0875Mg : hashMap.values()) {
                A04(c0875Mg, dataOutputStream);
                i += A00(c0875Mg, 2);
            }
            dataOutputStream.writeInt(i);
            this.A02.A06(dataOutputStream);
            com.facebook.ads.redexgen.core.C5C.A10(null);
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.C5C.A10(null);
            throw th;
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private boolean A06(java.util.HashMap<java.lang.String, com.facebook.ads.redexgen.core.C0875Mg> hashMap, android.util.SparseArray<java.lang.String> sparseArray) {
        if (!this.A02.A07()) {
            return true;
        }
        try {
            java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(this.A02.A04());
            java.io.DataInputStream dataInputStream = new java.io.DataInputStream(bufferedInputStream);
            int readInt = dataInputStream.readInt();
            if (readInt < 0 || readInt > 2) {
                com.facebook.ads.redexgen.core.C5C.A10(dataInputStream);
                return false;
            }
            if ((dataInputStream.readInt() & 1) != 0) {
                if (this.A04 == null) {
                    com.facebook.ads.redexgen.core.C5C.A10(dataInputStream);
                    return false;
                }
                byte[] bArr = new byte[16];
                dataInputStream.readFully(bArr);
                try {
                    this.A04.init(2, (java.security.Key) com.facebook.ads.redexgen.core.C5C.A0f(this.A05), new javax.crypto.spec.IvParameterSpec(bArr));
                    dataInputStream = new java.io.DataInputStream(new javax.crypto.CipherInputStream(bufferedInputStream, this.A04));
                } catch (java.security.InvalidAlgorithmParameterException | java.security.InvalidKeyException e) {
                    throw new java.lang.IllegalStateException(e);
                }
            } else if (this.A06) {
                this.A01 = true;
            }
            int readInt2 = dataInputStream.readInt();
            int i = 0;
            for (int i2 = 0; i2 < readInt2; i2++) {
                com.facebook.ads.redexgen.core.C0875Mg A01 = A01(readInt, dataInputStream);
                hashMap.put(A01.A02, A01);
                sparseArray.put(A01.A01, A01.A02);
                i += A00(A01, readInt);
            }
            int readInt3 = dataInputStream.readInt();
            boolean z = dataInputStream.read() == -1;
            if (readInt3 == i && z) {
                com.facebook.ads.redexgen.core.C5C.A10(dataInputStream);
                return true;
            }
            com.facebook.ads.redexgen.core.C5C.A10(dataInputStream);
            return false;
        } catch (java.io.IOException unused) {
            if (0 != 0) {
                com.facebook.ads.redexgen.core.C5C.A10(null);
            }
            return false;
        } catch (java.lang.Throwable th) {
            if (0 != 0) {
                com.facebook.ads.redexgen.core.C5C.A10(null);
            }
            throw th;
        }
    }

    static {
        A03();
    }

    public C1848kP(java.io.File file, byte[] bArr, boolean z) {
        com.facebook.ads.redexgen.core.AbstractC04203y.A08((bArr == null && z) ? false : true);
        javax.crypto.Cipher cipher = null;
        javax.crypto.spec.SecretKeySpec secretKeySpec = null;
        if (bArr != null) {
            com.facebook.ads.redexgen.core.AbstractC04203y.A07(bArr.length == 16);
            try {
                cipher = com.facebook.ads.redexgen.core.C0877Mi.A05();
                secretKeySpec = new javax.crypto.spec.SecretKeySpec(bArr, A02(0, 3, 85));
            } catch (java.security.NoSuchAlgorithmException | javax.crypto.NoSuchPaddingException e) {
                throw new java.lang.IllegalStateException(e);
            }
        } else {
            com.facebook.ads.redexgen.core.AbstractC04203y.A07(!z);
        }
        this.A06 = z;
        this.A04 = cipher;
        this.A05 = secretKeySpec;
        this.A03 = z ? new java.security.SecureRandom() : null;
        this.A02 = new com.facebook.ads.redexgen.core.AnonymousClass40(file);
    }

    private int A00(com.facebook.ads.redexgen.core.C0875Mg c0875Mg, int i) {
        int result = c0875Mg.A01;
        int i2 = result * 31;
        int result2 = c0875Mg.A02.hashCode();
        int result3 = i2 + result2;
        if (i < 2) {
            long A00 = com.facebook.ads.redexgen.core.AbstractC0878Mj.A00(c0875Mg.A03());
            return (result3 * 31) + ((int) ((A00 >>> 32) ^ A00));
        }
        return (result3 * 31) + c0875Mg.A03().hashCode();
    }

    private com.facebook.ads.redexgen.core.C0875Mg A01(int i, java.io.DataInputStream dataInputStream) throws java.io.IOException {
        com.facebook.ads.redexgen.core.C1846kN A02;
        int readInt = dataInputStream.readInt();
        java.lang.String readUTF = dataInputStream.readUTF();
        if (i >= 2) {
            A02 = com.facebook.ads.redexgen.core.C0877Mi.A02(dataInputStream);
        } else {
            long length = dataInputStream.readLong();
            com.facebook.ads.redexgen.core.C0880Ml c0880Ml = new com.facebook.ads.redexgen.core.C0880Ml();
            com.facebook.ads.redexgen.core.C0880Ml.A00(c0880Ml, length);
            A02 = com.facebook.ads.redexgen.core.C1846kN.A03.A05(c0880Ml);
        }
        return new com.facebook.ads.redexgen.core.C0875Mg(readInt, readUTF, A02);
    }

    private void A04(com.facebook.ads.redexgen.core.C0875Mg c0875Mg, java.io.DataOutputStream dataOutputStream) throws java.io.IOException {
        dataOutputStream.writeInt(c0875Mg.A01);
        dataOutputStream.writeUTF(c0875Mg.A02);
        com.facebook.ads.redexgen.core.C0877Mi.A08(c0875Mg.A03(), dataOutputStream);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0876Mh
    public final void A5p() {
        this.A02.A05();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0876Mh
    public final boolean A6S() {
        return this.A02.A07();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0876Mh
    public final void AAF(long j) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0876Mh
    public final void AAs(java.util.HashMap<java.lang.String, com.facebook.ads.redexgen.core.C0875Mg> hashMap, android.util.SparseArray<java.lang.String> sparseArray) {
        com.facebook.ads.redexgen.core.AbstractC04203y.A08(!this.A01);
        if (!A06(hashMap, sparseArray)) {
            hashMap.clear();
            java.lang.String[] strArr = A08;
            if (strArr[2].length() == strArr[0].length()) {
                throw new java.lang.RuntimeException();
            }
            A08[7] = "LXlnn5Px";
            sparseArray.clear();
            this.A02.A05();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0876Mh
    public final void AFd(com.facebook.ads.redexgen.core.C0875Mg c0875Mg, boolean z) {
        this.A01 = true;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0876Mh
    public final void AGK(com.facebook.ads.redexgen.core.C0875Mg c0875Mg) {
        this.A01 = true;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0876Mh
    public final void AKI(java.util.HashMap<java.lang.String, com.facebook.ads.redexgen.core.C0875Mg> hashMap) throws java.io.IOException {
        A05(hashMap);
        this.A01 = false;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0876Mh
    public final void AKJ(java.util.HashMap<java.lang.String, com.facebook.ads.redexgen.core.C0875Mg> hashMap) throws java.io.IOException {
        if (!this.A01) {
            return;
        }
        AKI(hashMap);
    }
}
