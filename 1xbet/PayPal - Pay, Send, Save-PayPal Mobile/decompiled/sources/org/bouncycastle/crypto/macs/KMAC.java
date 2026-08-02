package org.bouncycastle.crypto.macs;

/* loaded from: classes17.dex */
public class KMAC implements org.bouncycastle.crypto.Mac, org.bouncycastle.crypto.Xof {
    private static final byte[] getHighSpeedVideoFpsRangesFor = new byte[100];
    private final org.bouncycastle.crypto.digests.CSHAKEDigest Camera2StreamConfigurationMap;
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRanges;
    private boolean getHighSpeedVideoSizes;
    private byte[] getInputSizeshNQ4ISI;
    private final int getOutputFormats;

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        byte[] bArr;
        this.Camera2StreamConfigurationMap.reset();
        byte[] bArr2 = this.getInputSizeshNQ4ISI;
        if (bArr2 != null) {
            int i = this.getHighResolutionOutputSizeshNQ4ISI == 128 ? com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE : 136;
            byte[] leftEncode = org.bouncycastle.crypto.digests.XofUtils.leftEncode(i);
            update(leftEncode, 0, leftEncode.length);
            byte[] concatenate = org.bouncycastle.util.Arrays.concatenate(org.bouncycastle.crypto.digests.XofUtils.leftEncode(bArr2.length * 8), bArr2);
            update(concatenate, 0, concatenate.length);
            int length = i - ((leftEncode.length + concatenate.length) % i);
            if (length > 0 && length != i) {
                while (true) {
                    bArr = getHighSpeedVideoFpsRangesFor;
                    if (length <= bArr.length) {
                        break;
                    }
                    update(bArr, 0, bArr.length);
                    length -= bArr.length;
                }
                update(bArr, 0, length);
            }
        }
        this.getHighSpeedVideoSizes = true;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i, int i2) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException {
        if (!this.getHighSpeedVideoFpsRanges) {
            throw new java.lang.IllegalStateException("KMAC not initialized");
        }
        this.Camera2StreamConfigurationMap.update(bArr, i, i2);
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b) throws java.lang.IllegalStateException {
        if (!this.getHighSpeedVideoFpsRanges) {
            throw new java.lang.IllegalStateException("KMAC not initialized");
        }
        this.Camera2StreamConfigurationMap.update(b);
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(org.bouncycastle.crypto.CipherParameters cipherParameters) throws java.lang.IllegalArgumentException {
        this.getInputSizeshNQ4ISI = org.bouncycastle.util.Arrays.clone(((org.bouncycastle.crypto.params.KeyParameter) cipherParameters).getKey());
        this.getHighSpeedVideoFpsRanges = true;
        reset();
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return this.getOutputFormats;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.getOutputFormats;
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return this.Camera2StreamConfigurationMap.getByteLength();
    }

    @Override // org.bouncycastle.crypto.Mac
    public java.lang.String getAlgorithmName() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("KMAC");
        sb.append(this.Camera2StreamConfigurationMap.getAlgorithmName().substring(6));
        return sb.toString();
    }

    @Override // org.bouncycastle.crypto.Xof
    public int doOutput(byte[] bArr, int i, int i2) {
        if (this.getHighSpeedVideoSizes) {
            if (!this.getHighSpeedVideoFpsRanges) {
                throw new java.lang.IllegalStateException("KMAC not initialized");
            }
            byte[] rightEncode = org.bouncycastle.crypto.digests.XofUtils.rightEncode(0L);
            this.Camera2StreamConfigurationMap.update(rightEncode, 0, rightEncode.length);
            this.getHighSpeedVideoSizes = false;
        }
        return this.Camera2StreamConfigurationMap.doOutput(bArr, i, i2);
    }

    @Override // org.bouncycastle.crypto.Xof
    public int doFinal(byte[] bArr, int i, int i2) {
        if (this.getHighSpeedVideoSizes) {
            if (!this.getHighSpeedVideoFpsRanges) {
                throw new java.lang.IllegalStateException("KMAC not initialized");
            }
            byte[] rightEncode = org.bouncycastle.crypto.digests.XofUtils.rightEncode(i2 * 8);
            this.Camera2StreamConfigurationMap.update(rightEncode, 0, rightEncode.length);
        }
        int doFinal = this.Camera2StreamConfigurationMap.doFinal(bArr, i, i2);
        reset();
        return doFinal;
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException {
        if (this.getHighSpeedVideoSizes) {
            if (!this.getHighSpeedVideoFpsRanges) {
                throw new java.lang.IllegalStateException("KMAC not initialized");
            }
            byte[] rightEncode = org.bouncycastle.crypto.digests.XofUtils.rightEncode(getMacSize() * 8);
            this.Camera2StreamConfigurationMap.update(rightEncode, 0, rightEncode.length);
        }
        int doFinal = this.Camera2StreamConfigurationMap.doFinal(bArr, i, getMacSize());
        reset();
        return doFinal;
    }

    public KMAC(int i, byte[] bArr) {
        this.Camera2StreamConfigurationMap = new org.bouncycastle.crypto.digests.CSHAKEDigest(i, org.bouncycastle.util.Strings.toByteArray("KMAC"), bArr);
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getOutputFormats = (i * 2) / 8;
    }
}
