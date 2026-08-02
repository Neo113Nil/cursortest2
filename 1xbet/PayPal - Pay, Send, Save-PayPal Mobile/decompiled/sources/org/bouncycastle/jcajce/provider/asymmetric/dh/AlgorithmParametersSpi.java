package org.bouncycastle.jcajce.provider.asymmetric.dh;

/* loaded from: classes17.dex */
public class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi {
    javax.crypto.spec.DHParameterSpec getHighSpeedVideoSizes;

    protected java.security.spec.AlgorithmParameterSpec localEngineGetParameterSpec(java.lang.Class cls) throws java.security.spec.InvalidParameterSpecException {
        if (cls == javax.crypto.spec.DHParameterSpec.class || cls == java.security.spec.AlgorithmParameterSpec.class) {
            return this.getHighSpeedVideoSizes;
        }
        throw new java.security.spec.InvalidParameterSpecException("unknown parameter spec passed to DH parameters object.");
    }

    protected boolean isASN1FormatString(java.lang.String str) {
        return str == null || str.equals("ASN.1");
    }

    @Override // java.security.AlgorithmParametersSpi
    protected java.lang.String engineToString() {
        return "Diffie-Hellman Parameters";
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr, java.lang.String str) throws java.io.IOException {
        if (!isASN1FormatString(str)) {
            throw new java.io.IOException("Unknown parameter format ".concat(java.lang.String.valueOf(str)));
        }
        engineInit(bArr);
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr) throws java.io.IOException {
        try {
            org.bouncycastle.asn1.pkcs.DHParameter dHParameter = org.bouncycastle.asn1.pkcs.DHParameter.getInstance(bArr);
            this.getHighSpeedVideoSizes = dHParameter.getL() != null ? new javax.crypto.spec.DHParameterSpec(dHParameter.getP(), dHParameter.getG(), dHParameter.getL().intValue()) : new javax.crypto.spec.DHParameterSpec(dHParameter.getP(), dHParameter.getG());
        } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
            throw new java.io.IOException("Not a valid DH Parameter encoding.");
        } catch (java.lang.ClassCastException unused2) {
            throw new java.io.IOException("Not a valid DH Parameter encoding.");
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec) throws java.security.spec.InvalidParameterSpecException {
        if (!(algorithmParameterSpec instanceof javax.crypto.spec.DHParameterSpec)) {
            throw new java.security.spec.InvalidParameterSpecException("DHParameterSpec required to initialise a Diffie-Hellman algorithm parameters object");
        }
        this.getHighSpeedVideoSizes = (javax.crypto.spec.DHParameterSpec) algorithmParameterSpec;
    }

    @Override // java.security.AlgorithmParametersSpi
    protected java.security.spec.AlgorithmParameterSpec engineGetParameterSpec(java.lang.Class cls) throws java.security.spec.InvalidParameterSpecException {
        if (cls != null) {
            return localEngineGetParameterSpec(cls);
        }
        throw new java.lang.NullPointerException("argument to getParameterSpec must not be null");
    }

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded(java.lang.String str) {
        if (isASN1FormatString(str)) {
            return engineGetEncoded();
        }
        return null;
    }

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded() {
        try {
            return new org.bouncycastle.asn1.pkcs.DHParameter(this.getHighSpeedVideoSizes.getP(), this.getHighSpeedVideoSizes.getG(), this.getHighSpeedVideoSizes.getL()).getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
        } catch (java.io.IOException unused) {
            throw new java.lang.RuntimeException("Error encoding DHParameters");
        }
    }
}
