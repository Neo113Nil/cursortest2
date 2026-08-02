package org.bouncycastle.crypto.macs;

/* loaded from: classes17.dex */
public class DSTU7564Mac implements org.bouncycastle.crypto.Mac {
    private long Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.crypto.digests.DSTU7564Digest getHighSpeedVideoSizes;
    private byte[] getHighSpeedVideoFpsRangesFor = null;
    private byte[] getHighSpeedVideoFpsRanges = null;

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException {
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(getAlgorithmName());
            sb.append(" not initialised");
            throw new java.lang.IllegalStateException(sb.toString());
        }
        if (bArr.length - i < this.getHighResolutionOutputSizeshNQ4ISI) {
            throw new org.bouncycastle.crypto.OutputLengthException("Output buffer too short");
        }
        int byteLength = this.getHighSpeedVideoSizes.getByteLength() - ((int) (this.Camera2StreamConfigurationMap % this.getHighSpeedVideoSizes.getByteLength()));
        if (byteLength < 13) {
            byteLength += this.getHighSpeedVideoSizes.getByteLength();
        }
        byte[] bArr2 = new byte[byteLength];
        bArr2[0] = Byte.MIN_VALUE;
        org.bouncycastle.util.Pack.longToLittleEndian(this.Camera2StreamConfigurationMap * 8, bArr2, byteLength - 12);
        this.getHighSpeedVideoSizes.update(bArr2, 0, byteLength);
        org.bouncycastle.crypto.digests.DSTU7564Digest dSTU7564Digest = this.getHighSpeedVideoSizes;
        byte[] bArr3 = this.getHighSpeedVideoFpsRanges;
        dSTU7564Digest.update(bArr3, 0, bArr3.length);
        this.Camera2StreamConfigurationMap = 0L;
        int doFinal = this.getHighSpeedVideoSizes.doFinal(bArr, i);
        reset();
        return doFinal;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(org.bouncycastle.crypto.CipherParameters cipherParameters) throws java.lang.IllegalArgumentException {
        this.getHighSpeedVideoFpsRangesFor = null;
        reset();
        if (!(cipherParameters instanceof org.bouncycastle.crypto.params.KeyParameter)) {
            throw new java.lang.IllegalArgumentException("Bad parameter passed");
        }
        byte[] key = ((org.bouncycastle.crypto.params.KeyParameter) cipherParameters).getKey();
        this.getHighSpeedVideoFpsRanges = new byte[key.length];
        int length = (((key.length + this.getHighSpeedVideoSizes.getByteLength()) - 1) / this.getHighSpeedVideoSizes.getByteLength()) * this.getHighSpeedVideoSizes.getByteLength();
        if (length - key.length < 13) {
            length += this.getHighSpeedVideoSizes.getByteLength();
        }
        byte[] bArr = new byte[length];
        java.lang.System.arraycopy(key, 0, bArr, 0, key.length);
        bArr[key.length] = Byte.MIN_VALUE;
        org.bouncycastle.util.Pack.intToLittleEndian(key.length * 8, bArr, length - 12);
        this.getHighSpeedVideoFpsRangesFor = bArr;
        int i = 0;
        while (true) {
            byte[] bArr2 = this.getHighSpeedVideoFpsRanges;
            if (i >= bArr2.length) {
                org.bouncycastle.crypto.digests.DSTU7564Digest dSTU7564Digest = this.getHighSpeedVideoSizes;
                byte[] bArr3 = this.getHighSpeedVideoFpsRangesFor;
                dSTU7564Digest.update(bArr3, 0, bArr3.length);
                return;
            }
            bArr2[i] = (byte) (~key[i]);
            i++;
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i, int i2) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException {
        if (bArr.length - i < i2) {
            throw new org.bouncycastle.crypto.DataLengthException("Input buffer too short");
        }
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            this.getHighSpeedVideoSizes.update(bArr, i, i2);
            this.Camera2StreamConfigurationMap += i2;
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(getAlgorithmName());
            sb.append(" not initialised");
            throw new java.lang.IllegalStateException(sb.toString());
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b) throws java.lang.IllegalStateException {
        this.getHighSpeedVideoSizes.update(b);
        this.Camera2StreamConfigurationMap++;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        this.Camera2StreamConfigurationMap = 0L;
        this.getHighSpeedVideoSizes.reset();
        byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
        if (bArr != null) {
            this.getHighSpeedVideoSizes.update(bArr, 0, bArr.length);
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // org.bouncycastle.crypto.Mac
    public java.lang.String getAlgorithmName() {
        return "DSTU7564Mac";
    }

    public DSTU7564Mac(int i) {
        this.getHighSpeedVideoSizes = new org.bouncycastle.crypto.digests.DSTU7564Digest(i);
        this.getHighResolutionOutputSizeshNQ4ISI = i / 8;
    }
}
