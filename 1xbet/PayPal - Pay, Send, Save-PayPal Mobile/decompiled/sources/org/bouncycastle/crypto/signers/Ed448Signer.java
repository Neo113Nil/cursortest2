package org.bouncycastle.crypto.signers;

/* loaded from: classes17.dex */
public class Ed448Signer implements org.bouncycastle.crypto.Signer {
    private final byte[] Camera2StreamConfigurationMap;
    private org.bouncycastle.crypto.params.Ed448PublicKeyParameters getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.crypto.signers.Ed448Signer.Buffer getHighSpeedVideoFpsRanges = new org.bouncycastle.crypto.signers.Ed448Signer.Buffer(0);
    private boolean getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.crypto.params.Ed448PrivateKeyParameters getHighSpeedVideoSizes;

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        org.bouncycastle.crypto.params.Ed448PublicKeyParameters ed448PublicKeyParameters;
        if (this.getHighSpeedVideoFpsRangesFor || (ed448PublicKeyParameters = this.getHighResolutionOutputSizeshNQ4ISI) == null) {
            throw new java.lang.IllegalStateException("Ed448Signer not initialised for verification");
        }
        return this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges(ed448PublicKeyParameters, this.Camera2StreamConfigurationMap, bArr);
    }

    static class Buffer extends java.io.ByteArrayOutputStream {
        final boolean getHighSpeedVideoFpsRanges(org.bouncycastle.crypto.params.Ed448PublicKeyParameters ed448PublicKeyParameters, byte[] bArr, byte[] bArr2) {
            synchronized (this) {
                if (114 != bArr2.length) {
                    reset();
                    return false;
                }
                boolean verify = org.bouncycastle.math.ec.rfc8032.Ed448.verify(bArr2, 0, ed448PublicKeyParameters.getEncoded(), 0, bArr, this.buf, 0, this.count);
                reset();
                return verify;
            }
        }

        @Override // java.io.ByteArrayOutputStream
        public void reset() {
            synchronized (this) {
                org.bouncycastle.util.Arrays.fill(this.buf, 0, this.count, (byte) 0);
                this.count = 0;
            }
        }

        final byte[] getHighSpeedVideoSizes(org.bouncycastle.crypto.params.Ed448PrivateKeyParameters ed448PrivateKeyParameters, byte[] bArr) {
            byte[] bArr2;
            synchronized (this) {
                bArr2 = new byte[114];
                ed448PrivateKeyParameters.sign(0, bArr, this.buf, 0, this.count, bArr2, 0);
                reset();
            }
            return bArr2;
        }

        /* synthetic */ Buffer(byte b) {
            this();
        }

        private Buffer() {
        }
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i, int i2) {
        this.getHighSpeedVideoFpsRanges.write(bArr, i, i2);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b) {
        this.getHighSpeedVideoFpsRanges.write(b);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        this.getHighSpeedVideoFpsRanges.reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        this.getHighSpeedVideoFpsRangesFor = z;
        if (z) {
            this.getHighSpeedVideoSizes = (org.bouncycastle.crypto.params.Ed448PrivateKeyParameters) cipherParameters;
            this.getHighResolutionOutputSizeshNQ4ISI = null;
        } else {
            this.getHighSpeedVideoSizes = null;
            this.getHighResolutionOutputSizeshNQ4ISI = (org.bouncycastle.crypto.params.Ed448PublicKeyParameters) cipherParameters;
        }
        reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() {
        org.bouncycastle.crypto.params.Ed448PrivateKeyParameters ed448PrivateKeyParameters;
        if (!this.getHighSpeedVideoFpsRangesFor || (ed448PrivateKeyParameters = this.getHighSpeedVideoSizes) == null) {
            throw new java.lang.IllegalStateException("Ed448Signer not initialised for signature generation.");
        }
        return this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes(ed448PrivateKeyParameters, this.Camera2StreamConfigurationMap);
    }

    public Ed448Signer(byte[] bArr) {
        this.Camera2StreamConfigurationMap = org.bouncycastle.util.Arrays.clone(bArr);
    }
}
