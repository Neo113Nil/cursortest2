package org.bouncycastle.cert.crmf.bc;

/* loaded from: classes17.dex */
public class BcFixedLengthMGF1Padder implements org.bouncycastle.cert.crmf.EncryptedValuePadder {
    private java.security.SecureRandom getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.crypto.Digest getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;

    @Override // org.bouncycastle.cert.crmf.EncryptedValuePadder
    public byte[] getUnpaddedData(byte[] bArr) {
        int digestSize = this.getHighSpeedVideoFpsRangesFor.getDigestSize();
        byte[] bArr2 = new byte[digestSize];
        int digestSize2 = this.getHighSpeedVideoSizes - this.getHighSpeedVideoFpsRangesFor.getDigestSize();
        byte[] bArr3 = new byte[digestSize2];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, digestSize);
        org.bouncycastle.crypto.generators.MGF1BytesGenerator mGF1BytesGenerator = new org.bouncycastle.crypto.generators.MGF1BytesGenerator(this.getHighSpeedVideoFpsRangesFor);
        mGF1BytesGenerator.init(new org.bouncycastle.crypto.params.MGFParameters(bArr2));
        mGF1BytesGenerator.generateBytes(bArr3, 0, digestSize2);
        for (int i = 0; i != digestSize2; i++) {
            int i2 = i + digestSize;
            bArr[i2] = (byte) (bArr[i2] ^ bArr3[i]);
        }
        int length = bArr.length - 1;
        while (true) {
            if (length == digestSize) {
                length = 0;
                break;
            }
            if (bArr[length] == 0) {
                break;
            }
            length--;
        }
        if (length == 0) {
            throw new java.lang.IllegalStateException("bad padding in encoding");
        }
        int i3 = length - digestSize;
        byte[] bArr4 = new byte[i3];
        java.lang.System.arraycopy(bArr, digestSize, bArr4, 0, i3);
        return bArr4;
    }

    @Override // org.bouncycastle.cert.crmf.EncryptedValuePadder
    public byte[] getPaddedData(byte[] bArr) {
        int i = this.getHighSpeedVideoSizes;
        byte[] bArr2 = new byte[i];
        int digestSize = this.getHighSpeedVideoFpsRangesFor.getDigestSize();
        byte[] bArr3 = new byte[digestSize];
        int digestSize2 = this.getHighSpeedVideoSizes - this.getHighSpeedVideoFpsRangesFor.getDigestSize();
        byte[] bArr4 = new byte[digestSize2];
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            this.getHighResolutionOutputSizeshNQ4ISI = new java.security.SecureRandom();
        }
        this.getHighResolutionOutputSizeshNQ4ISI.nextBytes(bArr3);
        org.bouncycastle.crypto.generators.MGF1BytesGenerator mGF1BytesGenerator = new org.bouncycastle.crypto.generators.MGF1BytesGenerator(this.getHighSpeedVideoFpsRangesFor);
        mGF1BytesGenerator.init(new org.bouncycastle.crypto.params.MGFParameters(bArr3));
        mGF1BytesGenerator.generateBytes(bArr4, 0, digestSize2);
        java.lang.System.arraycopy(bArr3, 0, bArr2, 0, digestSize);
        java.lang.System.arraycopy(bArr, 0, bArr2, digestSize, bArr.length);
        int length = bArr.length + digestSize;
        while (true) {
            length++;
            if (length == i) {
                break;
            }
            bArr2[length] = (byte) (this.getHighResolutionOutputSizeshNQ4ISI.nextInt(255) + 1);
        }
        for (int i2 = 0; i2 != digestSize2; i2++) {
            int i3 = i2 + digestSize;
            bArr2[i3] = (byte) (bArr2[i3] ^ bArr4[i2]);
        }
        return bArr2;
    }

    public BcFixedLengthMGF1Padder(int i, java.security.SecureRandom secureRandom) {
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.crypto.digests.SHA1Digest();
        this.getHighSpeedVideoSizes = i;
        this.getHighResolutionOutputSizeshNQ4ISI = secureRandom;
    }

    public BcFixedLengthMGF1Padder(int i) {
        this(i, null);
    }
}
