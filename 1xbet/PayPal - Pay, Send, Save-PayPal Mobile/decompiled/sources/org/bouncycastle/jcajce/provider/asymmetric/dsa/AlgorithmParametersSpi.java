package org.bouncycastle.jcajce.provider.asymmetric.dsa;

/* loaded from: classes17.dex */
public class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi {
    java.security.spec.DSAParameterSpec getHighResolutionOutputSizeshNQ4ISI;

    protected java.security.spec.AlgorithmParameterSpec localEngineGetParameterSpec(java.lang.Class cls) throws java.security.spec.InvalidParameterSpecException {
        if (cls == java.security.spec.DSAParameterSpec.class || cls == java.security.spec.AlgorithmParameterSpec.class) {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }
        throw new java.security.spec.InvalidParameterSpecException("unknown parameter spec passed to DSA parameters object.");
    }

    protected boolean isASN1FormatString(java.lang.String str) {
        return str == null || str.equals("ASN.1");
    }

    @Override // java.security.AlgorithmParametersSpi
    protected java.lang.String engineToString() {
        return "DSA Parameters";
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
            org.bouncycastle.asn1.x509.DSAParameter dSAParameter = org.bouncycastle.asn1.x509.DSAParameter.getInstance(org.bouncycastle.asn1.ASN1Primitive.fromByteArray(bArr));
            this.getHighResolutionOutputSizeshNQ4ISI = new java.security.spec.DSAParameterSpec(dSAParameter.getP(), dSAParameter.getQ(), dSAParameter.getG());
        } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
            throw new java.io.IOException("Not a valid DSA Parameter encoding.");
        } catch (java.lang.ClassCastException unused2) {
            throw new java.io.IOException("Not a valid DSA Parameter encoding.");
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec) throws java.security.spec.InvalidParameterSpecException {
        if (!(algorithmParameterSpec instanceof java.security.spec.DSAParameterSpec)) {
            throw new java.security.spec.InvalidParameterSpecException("DSAParameterSpec required to initialise a DSA algorithm parameters object");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = (java.security.spec.DSAParameterSpec) algorithmParameterSpec;
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
            return new org.bouncycastle.asn1.x509.DSAParameter(this.getHighResolutionOutputSizeshNQ4ISI.getP(), this.getHighResolutionOutputSizeshNQ4ISI.getQ(), this.getHighResolutionOutputSizeshNQ4ISI.getG()).getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
        } catch (java.io.IOException unused) {
            throw new java.lang.RuntimeException("Error encoding DSAParameters");
        }
    }
}
