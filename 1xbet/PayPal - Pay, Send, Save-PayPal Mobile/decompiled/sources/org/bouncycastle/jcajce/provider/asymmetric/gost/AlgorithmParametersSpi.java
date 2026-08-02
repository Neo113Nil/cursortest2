package org.bouncycastle.jcajce.provider.asymmetric.gost;

/* loaded from: classes17.dex */
public class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi {
    org.bouncycastle.jce.spec.GOST3410ParameterSpec getHighSpeedVideoFpsRanges;

    protected java.security.spec.AlgorithmParameterSpec localEngineGetParameterSpec(java.lang.Class cls) throws java.security.spec.InvalidParameterSpecException {
        if (cls == org.bouncycastle.jce.spec.GOST3410PublicKeyParameterSetSpec.class || cls == java.security.spec.AlgorithmParameterSpec.class) {
            return this.getHighSpeedVideoFpsRanges;
        }
        throw new java.security.spec.InvalidParameterSpecException("unknown parameter spec passed to GOST3410 parameters object.");
    }

    protected boolean isASN1FormatString(java.lang.String str) {
        return str == null || str.equals("ASN.1");
    }

    @Override // java.security.AlgorithmParametersSpi
    protected java.lang.String engineToString() {
        return "GOST3410 Parameters";
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
            this.getHighSpeedVideoFpsRanges = org.bouncycastle.jce.spec.GOST3410ParameterSpec.fromPublicKeyAlg(org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters.getInstance((org.bouncycastle.asn1.ASN1Sequence) org.bouncycastle.asn1.ASN1Primitive.fromByteArray(bArr)));
        } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
            throw new java.io.IOException("Not a valid GOST3410 Parameter encoding.");
        } catch (java.lang.ClassCastException unused2) {
            throw new java.io.IOException("Not a valid GOST3410 Parameter encoding.");
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec) throws java.security.spec.InvalidParameterSpecException {
        if (!(algorithmParameterSpec instanceof org.bouncycastle.jce.spec.GOST3410ParameterSpec)) {
            throw new java.security.spec.InvalidParameterSpecException("GOST3410ParameterSpec required to initialise a GOST3410 algorithm parameters object");
        }
        this.getHighSpeedVideoFpsRanges = (org.bouncycastle.jce.spec.GOST3410ParameterSpec) algorithmParameterSpec;
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
        if (isASN1FormatString(str) || str.equalsIgnoreCase("X.509")) {
            return engineGetEncoded();
        }
        return null;
    }

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded() {
        try {
            return new org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters(new org.bouncycastle.asn1.ASN1ObjectIdentifier(this.getHighSpeedVideoFpsRanges.getPublicKeyParamSetOID()), new org.bouncycastle.asn1.ASN1ObjectIdentifier(this.getHighSpeedVideoFpsRanges.getDigestParamSetOID()), new org.bouncycastle.asn1.ASN1ObjectIdentifier(this.getHighSpeedVideoFpsRanges.getEncryptionParamSetOID())).getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
        } catch (java.io.IOException unused) {
            throw new java.lang.RuntimeException("Error encoding GOST3410Parameters");
        }
    }
}
