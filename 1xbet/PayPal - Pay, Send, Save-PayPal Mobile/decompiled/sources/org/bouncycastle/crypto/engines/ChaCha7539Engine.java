package org.bouncycastle.crypto.engines;

/* loaded from: classes17.dex */
public class ChaCha7539Engine extends org.bouncycastle.crypto.engines.Salsa20Engine {
    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    protected int getNonceSize() {
        return 12;
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    protected void setKey(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            if (bArr.length != 32) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(getAlgorithmName());
                sb.append(" requires 256 bit key");
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            packTauOrSigma(bArr.length, this.engineState, 0);
            org.bouncycastle.util.Pack.littleEndianToInt(bArr, 0, this.engineState, 4, 8);
        }
        org.bouncycastle.util.Pack.littleEndianToInt(bArr2, 0, this.engineState, 13, 3);
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    protected void retreatCounter(long j) {
        int i = (int) (j >>> 32);
        int i2 = (int) j;
        if (i != 0) {
            throw new java.lang.IllegalStateException("attempt to reduce counter past zero.");
        }
        if ((this.engineState[12] & 4294967295L) < (4294967295L & i2)) {
            throw new java.lang.IllegalStateException("attempt to reduce counter past zero.");
        }
        int[] iArr = this.engineState;
        iArr[12] = iArr[12] - i2;
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    protected void retreatCounter() {
        if (this.engineState[12] == 0) {
            throw new java.lang.IllegalStateException("attempt to reduce counter past zero.");
        }
        this.engineState[12] = r0[12] - 1;
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    protected void resetCounter() {
        this.engineState[12] = 0;
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    protected long getCounter() {
        return this.engineState[12] & 4294967295L;
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine, org.bouncycastle.crypto.StreamCipher
    public java.lang.String getAlgorithmName() {
        return "ChaCha7539";
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    protected void generateKeyStream(byte[] bArr) {
        org.bouncycastle.crypto.engines.ChaChaEngine.chachaCore(this.rounds, this.engineState, this.x);
        org.bouncycastle.util.Pack.intToLittleEndian(this.x, bArr, 0);
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    protected void advanceCounter(long j) {
        int i = (int) (j >>> 32);
        int i2 = (int) j;
        if (i > 0) {
            throw new java.lang.IllegalStateException("attempt to increase counter past 2^32.");
        }
        int i3 = this.engineState[12];
        int[] iArr = this.engineState;
        iArr[12] = iArr[12] + i2;
        if (i3 != 0 && this.engineState[12] < i3) {
            throw new java.lang.IllegalStateException("attempt to increase counter past 2^32.");
        }
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    protected void advanceCounter() {
        int[] iArr = this.engineState;
        int i = iArr[12] + 1;
        iArr[12] = i;
        if (i == 0) {
            throw new java.lang.IllegalStateException("attempt to increase counter past 2^32.");
        }
    }
}
