package org.bouncycastle.crypto.agreement.srp;

/* loaded from: classes17.dex */
public class SRP6Server {
    protected java.math.BigInteger A;
    protected java.math.BigInteger B;
    protected java.math.BigInteger Key;
    protected java.math.BigInteger M1;
    protected java.math.BigInteger M2;
    protected java.math.BigInteger N;
    protected java.math.BigInteger S;
    protected java.math.BigInteger b;
    protected org.bouncycastle.crypto.Digest digest;
    protected java.math.BigInteger g;
    protected java.security.SecureRandom random;
    protected java.math.BigInteger u;
    protected java.math.BigInteger v;

    public java.math.BigInteger calculateSecret(java.math.BigInteger bigInteger) throws org.bouncycastle.crypto.CryptoException {
        java.math.BigInteger validatePublicValue = org.bouncycastle.crypto.agreement.srp.SRP6Util.validatePublicValue(this.N, bigInteger);
        this.A = validatePublicValue;
        java.math.BigInteger calculateU = org.bouncycastle.crypto.agreement.srp.SRP6Util.calculateU(this.digest, this.N, validatePublicValue, this.B);
        this.u = calculateU;
        java.math.BigInteger modPow = this.v.modPow(calculateU, this.N).multiply(this.A).mod(this.N).modPow(this.b, this.N);
        this.S = modPow;
        return modPow;
    }

    public boolean verifyClientEvidenceMessage(java.math.BigInteger bigInteger) throws org.bouncycastle.crypto.CryptoException {
        java.math.BigInteger bigInteger2;
        java.math.BigInteger bigInteger3;
        java.math.BigInteger bigInteger4 = this.A;
        if (bigInteger4 == null || (bigInteger2 = this.B) == null || (bigInteger3 = this.S) == null) {
            throw new org.bouncycastle.crypto.CryptoException("Impossible to compute and verify M1: some data are missing from the previous operations (A,B,S)");
        }
        if (!org.bouncycastle.crypto.agreement.srp.SRP6Util.calculateM1(this.digest, this.N, bigInteger4, bigInteger2, bigInteger3).equals(bigInteger)) {
            return false;
        }
        this.M1 = bigInteger;
        return true;
    }

    protected java.math.BigInteger selectPrivateValue() {
        return org.bouncycastle.crypto.agreement.srp.SRP6Util.generatePrivateValue(this.digest, this.N, this.g, this.random);
    }

    public void init(org.bouncycastle.crypto.params.SRP6GroupParameters sRP6GroupParameters, java.math.BigInteger bigInteger, org.bouncycastle.crypto.Digest digest, java.security.SecureRandom secureRandom) {
        init(sRP6GroupParameters.getN(), sRP6GroupParameters.getG(), bigInteger, digest, secureRandom);
    }

    public void init(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3, org.bouncycastle.crypto.Digest digest, java.security.SecureRandom secureRandom) {
        this.N = bigInteger;
        this.g = bigInteger2;
        this.v = bigInteger3;
        this.random = secureRandom;
        this.digest = digest;
    }

    public java.math.BigInteger generateServerCredentials() {
        java.math.BigInteger calculateK = org.bouncycastle.crypto.agreement.srp.SRP6Util.calculateK(this.digest, this.N, this.g);
        this.b = selectPrivateValue();
        java.math.BigInteger mod = calculateK.multiply(this.v).mod(this.N).add(this.g.modPow(this.b, this.N)).mod(this.N);
        this.B = mod;
        return mod;
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

    public java.math.BigInteger calculateServerEvidenceMessage() throws org.bouncycastle.crypto.CryptoException {
        java.math.BigInteger bigInteger;
        java.math.BigInteger bigInteger2;
        java.math.BigInteger bigInteger3 = this.A;
        if (bigInteger3 == null || (bigInteger = this.M1) == null || (bigInteger2 = this.S) == null) {
            throw new org.bouncycastle.crypto.CryptoException("Impossible to compute M2: some data are missing from the previous operations (A,M1,S)");
        }
        java.math.BigInteger calculateM2 = org.bouncycastle.crypto.agreement.srp.SRP6Util.calculateM2(this.digest, this.N, bigInteger3, bigInteger, bigInteger2);
        this.M2 = calculateM2;
        return calculateM2;
    }
}
