package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

/* loaded from: classes17.dex */
public class AlgorithmParametersSpi extends org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters {
    org.bouncycastle.jce.spec.ElGamalParameterSpec getHighSpeedVideoSizes;

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
    public java.security.spec.AlgorithmParameterSpec localEngineGetParameterSpec(java.lang.Class cls) throws java.security.spec.InvalidParameterSpecException {
        if (cls == org.bouncycastle.jce.spec.ElGamalParameterSpec.class || cls == java.security.spec.AlgorithmParameterSpec.class) {
            return this.getHighSpeedVideoSizes;
        }
        if (cls == javax.crypto.spec.DHParameterSpec.class) {
            return new javax.crypto.spec.DHParameterSpec(this.getHighSpeedVideoSizes.getP(), this.getHighSpeedVideoSizes.getG());
        }
        throw new java.security.spec.InvalidParameterSpecException("unknown parameter spec passed to ElGamal parameters object.");
    }

    @Override // java.security.AlgorithmParametersSpi
    protected java.lang.String engineToString() {
        return "ElGamal Parameters";
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr, java.lang.String str) throws java.io.IOException {
        if (!isASN1FormatString(str) && !str.equalsIgnoreCase("X.509")) {
            throw new java.io.IOException("Unknown parameter format ".concat(java.lang.String.valueOf(str)));
        }
        engineInit(bArr);
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr) throws java.io.IOException {
        try {
            org.bouncycastle.asn1.oiw.ElGamalParameter elGamalParameter = org.bouncycastle.asn1.oiw.ElGamalParameter.getInstance(org.bouncycastle.asn1.ASN1Primitive.fromByteArray(bArr));
            this.getHighSpeedVideoSizes = new org.bouncycastle.jce.spec.ElGamalParameterSpec(elGamalParameter.getP(), elGamalParameter.getG());
        } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
            throw new java.io.IOException("Not a valid ElGamal Parameter encoding.");
        } catch (java.lang.ClassCastException unused2) {
            throw new java.io.IOException("Not a valid ElGamal Parameter encoding.");
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec) throws java.security.spec.InvalidParameterSpecException {
        boolean z = algorithmParameterSpec instanceof org.bouncycastle.jce.spec.ElGamalParameterSpec;
        if (!z && !(algorithmParameterSpec instanceof javax.crypto.spec.DHParameterSpec)) {
            throw new java.security.spec.InvalidParameterSpecException("DHParameterSpec required to initialise a ElGamal algorithm parameters object");
        }
        if (z) {
            this.getHighSpeedVideoSizes = (org.bouncycastle.jce.spec.ElGamalParameterSpec) algorithmParameterSpec;
        } else {
            javax.crypto.spec.DHParameterSpec dHParameterSpec = (javax.crypto.spec.DHParameterSpec) algorithmParameterSpec;
            this.getHighSpeedVideoSizes = new org.bouncycastle.jce.spec.ElGamalParameterSpec(dHParameterSpec.getP(), dHParameterSpec.getG());
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded(java.lang.String str) {
        if (isASN1FormatString(str) || str.equalsIgnoreCase("X.509")) {
            return engineGetEncoded();
        }
        return null;
    }

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded() {
        try {
            return new org.bouncycastle.asn1.oiw.ElGamalParameter(this.getHighSpeedVideoSizes.getP(), this.getHighSpeedVideoSizes.getG()).getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
        } catch (java.io.IOException unused) {
            throw new java.lang.RuntimeException("Error encoding ElGamalParameters");
        }
    }
}
