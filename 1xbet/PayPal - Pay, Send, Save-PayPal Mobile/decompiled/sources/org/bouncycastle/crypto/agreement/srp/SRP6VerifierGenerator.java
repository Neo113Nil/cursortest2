package org.bouncycastle.crypto.agreement.srp;

/* loaded from: classes17.dex */
public class SRP6VerifierGenerator {
    protected java.math.BigInteger N;
    protected org.bouncycastle.crypto.Digest digest;
    protected java.math.BigInteger g;

    public void init(org.bouncycastle.crypto.params.SRP6GroupParameters sRP6GroupParameters, org.bouncycastle.crypto.Digest digest) {
        this.N = sRP6GroupParameters.getN();
        this.g = sRP6GroupParameters.getG();
        this.digest = digest;
    }

    public void init(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, org.bouncycastle.crypto.Digest digest) {
        this.N = bigInteger;
        this.g = bigInteger2;
        this.digest = digest;
    }

    public java.math.BigInteger generateVerifier(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return this.g.modPow(org.bouncycastle.crypto.agreement.srp.SRP6Util.calculateX(this.digest, this.N, bArr, bArr2, bArr3), this.N);
    }
}
