package org.bouncycastle.crypto.agreement.srp;

/* loaded from: classes17.dex */
public class SRP6Client {
    protected java.math.BigInteger A;
    protected java.math.BigInteger B;
    protected java.math.BigInteger Key;
    protected java.math.BigInteger M1;
    protected java.math.BigInteger M2;
    protected java.math.BigInteger N;
    protected java.math.BigInteger S;

    /* renamed from: a, reason: collision with root package name */
    protected java.math.BigInteger f7046a;
    protected org.bouncycastle.crypto.Digest digest;
    protected java.math.BigInteger g;
    protected java.security.SecureRandom random;
    protected java.math.BigInteger u;
    protected java.math.BigInteger x;

    public java.math.BigInteger calculateSecret(java.math.BigInteger bigInteger) throws org.bouncycastle.crypto.CryptoException {
        java.math.BigInteger validatePublicValue = org.bouncycastle.crypto.agreement.srp.SRP6Util.validatePublicValue(this.N, bigInteger);
        this.B = validatePublicValue;
        this.u = org.bouncycastle.crypto.agreement.srp.SRP6Util.calculateU(this.digest, this.N, this.A, validatePublicValue);
        java.math.BigInteger calculateK = org.bouncycastle.crypto.agreement.srp.SRP6Util.calculateK(this.digest, this.N, this.g);
        java.math.BigInteger modPow = this.B.subtract(this.g.modPow(this.x, this.N).multiply(calculateK).mod(this.N)).mod(this.N).modPow(this.u.multiply(this.x).add(this.f7046a), this.N);
        this.S = modPow;
        return modPow;
    }

    public boolean verifyServerEvidenceMessage(java.math.BigInteger bigInteger) throws org.bouncycastle.crypto.CryptoException {
        java.math.BigInteger bigInteger2;
        java.math.BigInteger bigInteger3;
        java.math.BigInteger bigInteger4 = this.A;
        if (bigInteger4 == null || (bigInteger2 = this.M1) == null || (bigInteger3 = this.S) == null) {
            throw new org.bouncycastle.crypto.CryptoException("Impossible to compute and verify M2: some data are missing from the previous operations (A,M1,S)");
        }
        if (!org.bouncycastle.crypto.agreement.srp.SRP6Util.calculateM2(this.digest, this.N, bigInteger4, bigInteger2, bigInteger3).equals(bigInteger)) {
            return false;
        }
        this.M2 = bigInteger;
        return true;
    }

    protected java.math.BigInteger selectPrivateValue() {
        return org.bouncycastle.crypto.agreement.srp.SRP6Util.generatePrivateValue(this.digest, this.N, this.g, this.random);
    }

    public void init(org.bouncycastle.crypto.params.SRP6GroupParameters sRP6GroupParameters, org.bouncycastle.crypto.Digest digest, java.security.SecureRandom secureRandom) {
        init(sRP6GroupParameters.getN(), sRP6GroupParameters.getG(), digest, secureRandom);
    }

    public void init(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, org.bouncycastle.crypto.Digest digest, java.security.SecureRandom secureRandom) {
        this.N = bigInteger;
        this.g = bigInteger2;
        this.digest = digest;
        this.random = secureRandom;
    }

    public java.math.BigInteger generateClientCredentials(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.x = org.bouncycastle.crypto.agreement.srp.SRP6Util.calculateX(this.digest, this.N, bArr, bArr2, bArr3);
        java.math.BigInteger selectPrivateValue = selectPrivateValue();
        this.f7046a = selectPrivateValue;
        java.math.BigInteger modPow = this.g.modPow(selectPrivateValue, this.N);
        this.A = modPow;
        return modPow;
    }

    public java.math.BigInteger calculateSessionKey() throws org.bouncycastle.crypto.CryptoException {
        java.math.BigInteger bigInteger = this.S;
        if (bigInteger == null || this.M1 == null || this.M2 == null) {
            throw new org.bouncycastle.crypto.CryptoException("Impossible to compute Key: some data are missing from the previous operations (S,M1,M2)");
        }
        java.math.BigInteger calculateKey = org.bouncycastle.crypto.agreement.srp.SRP6Util.calculateKey(this.digest, this.N, bigInteger);
        this.Key = calculateKey;
        return calculateKey;
    }

    public java.math.BigInteger calculateClientEvidenceMessage() throws org.bouncycastle.crypto.CryptoException {
        java.math.BigInteger bigInteger;
        java.math.BigInteger bigInteger2;
        java.math.BigInteger bigInteger3 = this.A;
        if (bigInteger3 == null || (bigInteger = this.B) == null || (bigInteger2 = this.S) == null) {
            throw new org.bouncycastle.crypto.CryptoException("Impossible to compute M1: some data are missing from the previous operations (A,B,S)");
        }
        java.math.BigInteger calculateM1 = org.bouncycastle.crypto.agreement.srp.SRP6Util.calculateM1(this.digest, this.N, bigInteger3, bigInteger, bigInteger2);
        this.M1 = calculateM1;
        return calculateM1;
    }
}
