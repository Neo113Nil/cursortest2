package org.bouncycastle.crypto.signers;

/* loaded from: classes17.dex */
public class Ed25519ctxSigner implements org.bouncycastle.crypto.Signer {
    private boolean Camera2StreamConfigurationMap;
    private final org.bouncycastle.crypto.signers.Ed25519ctxSigner.Buffer getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.crypto.signers.Ed25519ctxSigner.Buffer(0);
    private org.bouncycastle.crypto.params.Ed25519PublicKeyParameters getHighSpeedVideoFpsRanges;
    private final byte[] getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters getHighSpeedVideoSizes;

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        org.bouncycastle.crypto.params.Ed25519PublicKeyParameters ed25519PublicKeyParameters;
        if (this.Camera2StreamConfigurationMap || (ed25519PublicKeyParameters = this.getHighSpeedVideoFpsRanges) == null) {
            throw new java.lang.IllegalStateException("Ed25519ctxSigner not initialised for verification");
        }
        return this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(ed25519PublicKeyParameters, this.getHighSpeedVideoFpsRangesFor, bArr);
    }

    static class Buffer extends java.io.ByteArrayOutputStream {
        final boolean getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.crypto.params.Ed25519PublicKeyParameters ed25519PublicKeyParameters, byte[] bArr, byte[] bArr2) {
            synchronized (this) {
                if (64 != bArr2.length) {
                    reset();
                    return false;
                }
                boolean verify = org.bouncycastle.math.ec.rfc8032.Ed25519.verify(bArr2, 0, ed25519PublicKeyParameters.getEncoded(), 0, bArr, this.buf, 0, this.count);
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

        final byte[] getHighSpeedVideoFpsRangesFor(org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters ed25519PrivateKeyParameters, byte[] bArr) {
            byte[] bArr2;
            synchronized (this) {
                bArr2 = new byte[64];
                ed25519PrivateKeyParameters.sign(1, bArr, this.buf, 0, this.count, bArr2, 0);
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
        this.getHighResolutionOutputSizeshNQ4ISI.write(bArr, i, i2);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b) {
        this.getHighResolutionOutputSizeshNQ4ISI.write(b);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        this.getHighResolutionOutputSizeshNQ4ISI.reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        this.Camera2StreamConfigurationMap = z;
        if (z) {
            this.getHighSpeedVideoSizes = (org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters) cipherParameters;
            this.getHighSpeedVideoFpsRanges = null;
        } else {
            this.getHighSpeedVideoSizes = null;
            this.getHighSpeedVideoFpsRanges = (org.bouncycastle.crypto.params.Ed25519PublicKeyParameters) cipherParameters;
        }
        reset();
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() {
        org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters ed25519PrivateKeyParameters;
        if (!this.Camera2StreamConfigurationMap || (ed25519PrivateKeyParameters = this.getHighSpeedVideoSizes) == null) {
            throw new java.lang.IllegalStateException("Ed25519ctxSigner not initialised for signature generation.");
        }
        return this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(ed25519PrivateKeyParameters, this.getHighSpeedVideoFpsRangesFor);
    }

    public Ed25519ctxSigner(byte[] bArr) {
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.util.Arrays.clone(bArr);
    }
}
