package org.bouncycastle.pqc.crypto.lms;

/* loaded from: classes17.dex */
public class Composer {
    private final java.io.ByteArrayOutputStream getHighResolutionOutputSizeshNQ4ISI = new java.io.ByteArrayOutputStream();

    public org.bouncycastle.pqc.crypto.lms.Composer u64str(long j) {
        u32str((int) (j >>> 32));
        u32str((int) j);
        return this;
    }

    public org.bouncycastle.pqc.crypto.lms.Composer u32str(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI.write((byte) (i >>> 24));
        this.getHighResolutionOutputSizeshNQ4ISI.write((byte) (i >>> 16));
        this.getHighResolutionOutputSizeshNQ4ISI.write((byte) (i >>> 8));
        this.getHighResolutionOutputSizeshNQ4ISI.write((byte) i);
        return this;
    }

    public org.bouncycastle.pqc.crypto.lms.Composer u16str(int i) {
        int i2 = i & 65535;
        this.getHighResolutionOutputSizeshNQ4ISI.write((byte) (i2 >>> 8));
        this.getHighResolutionOutputSizeshNQ4ISI.write((byte) i2);
        return this;
    }

    public org.bouncycastle.pqc.crypto.lms.Composer padUntil(int i, int i2) {
        while (this.getHighResolutionOutputSizeshNQ4ISI.size() < i2) {
            this.getHighResolutionOutputSizeshNQ4ISI.write(i);
        }
        return this;
    }

    public org.bouncycastle.pqc.crypto.lms.Composer pad(int i, int i2) {
        while (i2 >= 0) {
            try {
                this.getHighResolutionOutputSizeshNQ4ISI.write(i);
                i2--;
            } catch (java.lang.Exception e) {
                throw new java.lang.RuntimeException(e.getMessage(), e);
            }
        }
        return this;
    }

    public org.bouncycastle.pqc.crypto.lms.Composer bytes(byte[][] bArr, int i, int i2) {
        while (i != i2) {
            try {
                this.getHighResolutionOutputSizeshNQ4ISI.write(bArr[i]);
                i++;
            } catch (java.lang.Exception e) {
                throw new java.lang.RuntimeException(e.getMessage(), e);
            }
        }
        return this;
    }

    public org.bouncycastle.pqc.crypto.lms.Composer bytes(byte[][] bArr) {
        try {
            for (byte[] bArr2 : bArr) {
                this.getHighResolutionOutputSizeshNQ4ISI.write(bArr2);
            }
            return this;
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException(e.getMessage(), e);
        }
    }

    public org.bouncycastle.pqc.crypto.lms.Composer bytes(org.bouncycastle.util.Encodable[] encodableArr) {
        try {
            for (org.bouncycastle.util.Encodable encodable : encodableArr) {
                this.getHighResolutionOutputSizeshNQ4ISI.write(encodable.getEncoded());
            }
            return this;
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException(e.getMessage(), e);
        }
    }

    public org.bouncycastle.pqc.crypto.lms.Composer bytes(byte[] bArr, int i, int i2) {
        try {
            this.getHighResolutionOutputSizeshNQ4ISI.write(bArr, i, i2);
            return this;
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException(e.getMessage(), e);
        }
    }

    public org.bouncycastle.pqc.crypto.lms.Composer bytes(byte[] bArr) {
        try {
            this.getHighResolutionOutputSizeshNQ4ISI.write(bArr);
            return this;
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException(e.getMessage(), e);
        }
    }

    public org.bouncycastle.pqc.crypto.lms.Composer bytes(org.bouncycastle.util.Encodable encodable) {
        try {
            this.getHighResolutionOutputSizeshNQ4ISI.write(encodable.getEncoded());
            return this;
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException(e.getMessage(), e);
        }
    }

    public byte[] build() {
        return this.getHighResolutionOutputSizeshNQ4ISI.toByteArray();
    }

    public org.bouncycastle.pqc.crypto.lms.Composer bool(boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI.write(z ? 1 : 0);
        return this;
    }

    public static org.bouncycastle.pqc.crypto.lms.Composer compose() {
        return new org.bouncycastle.pqc.crypto.lms.Composer();
    }

    private Composer() {
    }
}
