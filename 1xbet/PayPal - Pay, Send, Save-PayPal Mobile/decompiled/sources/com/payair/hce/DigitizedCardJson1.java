package com.payair.hce;

/* loaded from: classes10.dex */
public final class DigitizedCardJson1 extends java.io.FilterInputStream {
    private int AlternateContactlessPaymentDataJson;
    private final int DigitizedCardProfile;
    private short IccPrivateKeyCrtComponentsJson;
    private int RecordsJson;
    private byte[] SdkCoreAlternateContactlessPaymentDataImpl;
    private int getAid;
    private int getGpoResponse;
    private long[] getProfileVersion;
    private final int valueOf;
    private final int values;
    private long[] writeReplace;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    public DigitizedCardJson1(java.io.InputStream inputStream, int i, int i2, short s, int i3, int i4) throws java.io.IOException {
        this(inputStream, i, i2, s, i3, i4, (byte) 0);
    }

    private DigitizedCardJson1(java.io.InputStream inputStream, int i, int i2, short s, int i3, int i4, byte b) throws java.io.IOException {
        super(new java.io.BufferedInputStream(inputStream, 4096));
        this.AlternateContactlessPaymentDataJson = 1;
        this.getAid = Integer.MAX_VALUE;
        int min = java.lang.Math.min(java.lang.Math.max((int) s, 4), 8);
        this.valueOf = min;
        this.SdkCoreAlternateContactlessPaymentDataImpl = new byte[min];
        this.writeReplace = new long[4];
        this.getProfileVersion = new long[4];
        this.RecordsJson = min;
        this.getGpoResponse = min;
        this.writeReplace = com.payair.hce.isTransactionIdRequired.writeReplace(i ^ i4, min ^ i4);
        this.getProfileVersion = com.payair.hce.isTransactionIdRequired.writeReplace(i2 ^ i4, i3 ^ i4);
        this.DigitizedCardProfile = 100;
        this.values = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws java.io.IOException {
        writeReplace();
        int i = this.RecordsJson;
        if (i >= this.getGpoResponse) {
            return -1;
        }
        byte[] bArr = this.SdkCoreAlternateContactlessPaymentDataImpl;
        this.RecordsJson = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            writeReplace();
            int i5 = this.RecordsJson;
            if (i5 >= this.getGpoResponse) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.SdkCoreAlternateContactlessPaymentDataImpl;
            this.RecordsJson = i5 + 1;
            bArr[i4] = bArr2[i5];
        }
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws java.io.IOException {
        long j2 = 0;
        while (j2 < j && read() != -1) {
            j2++;
        }
        return j2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws java.io.IOException {
        writeReplace();
        return this.getGpoResponse - this.RecordsJson;
    }

    private void AlternateContactlessPaymentDataJson() {
        long[] jArr = this.writeReplace;
        long[] jArr2 = this.getProfileVersion;
        short s = this.IccPrivateKeyCrtComponentsJson;
        long j = jArr[s % 4];
        long j2 = jArr2[(s + 2) % 4];
        int i = (s + 3) % 4;
        jArr2[i] = ((jArr[i] * 2147483085) + j2) / androidx.collection.SieveCacheKt.NodeLinkMask;
        jArr[i] = ((j * 2147483085) + j2) % androidx.collection.SieveCacheKt.NodeLinkMask;
        for (int i2 = 0; i2 < this.valueOf; i2++) {
            this.SdkCoreAlternateContactlessPaymentDataImpl[i2] = (byte) (r1[i2] ^ ((this.writeReplace[this.IccPrivateKeyCrtComponentsJson] >> (i2 << 3)) & 255));
        }
        this.IccPrivateKeyCrtComponentsJson = (short) ((this.IccPrivateKeyCrtComponentsJson + 1) % 4);
    }

    private int writeReplace() throws java.io.IOException {
        int i;
        if (this.getAid == Integer.MAX_VALUE) {
            this.getAid = ((java.io.FilterInputStream) this).in.read();
        }
        if (this.RecordsJson == this.valueOf) {
            byte[] bArr = this.SdkCoreAlternateContactlessPaymentDataImpl;
            int i2 = this.getAid;
            bArr[0] = (byte) i2;
            if (i2 < 0) {
                throw new java.lang.IllegalStateException("unexpected block size");
            }
            int i3 = 1;
            do {
                int read = ((java.io.FilterInputStream) this).in.read(this.SdkCoreAlternateContactlessPaymentDataImpl, i3, this.valueOf - i3);
                if (read <= 0) {
                    break;
                }
                i3 += read;
            } while (i3 < this.valueOf);
            if (i3 < this.valueOf) {
                throw new java.lang.IllegalStateException("unexpected block size");
            }
            int i4 = this.DigitizedCardProfile;
            if (i4 == this.values) {
                AlternateContactlessPaymentDataJson();
            } else {
                if (this.AlternateContactlessPaymentDataJson <= i4) {
                    AlternateContactlessPaymentDataJson();
                }
                int i5 = this.AlternateContactlessPaymentDataJson;
                if (i5 < this.values) {
                    this.AlternateContactlessPaymentDataJson = i5 + 1;
                } else {
                    this.AlternateContactlessPaymentDataJson = 1;
                }
            }
            int read2 = ((java.io.FilterInputStream) this).in.read();
            this.getAid = read2;
            this.RecordsJson = 0;
            if (read2 < 0) {
                int i6 = this.valueOf;
                i = i6 - (this.SdkCoreAlternateContactlessPaymentDataImpl[i6 - 1] & 255);
            } else {
                i = this.valueOf;
            }
            this.getGpoResponse = i;
        }
        return this.getGpoResponse;
    }
}
