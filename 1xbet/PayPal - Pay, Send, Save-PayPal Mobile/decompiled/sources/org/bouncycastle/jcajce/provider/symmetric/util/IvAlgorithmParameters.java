package org.bouncycastle.jcajce.provider.symmetric.util;

/* loaded from: classes17.dex */
public class IvAlgorithmParameters extends org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters {
    private byte[] getHighResolutionOutputSizeshNQ4ISI;

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
    protected java.security.spec.AlgorithmParameterSpec localEngineGetParameterSpec(java.lang.Class cls) throws java.security.spec.InvalidParameterSpecException {
        if (cls == javax.crypto.spec.IvParameterSpec.class || cls == java.security.spec.AlgorithmParameterSpec.class) {
            return new javax.crypto.spec.IvParameterSpec(this.getHighResolutionOutputSizeshNQ4ISI);
        }
        throw new java.security.spec.InvalidParameterSpecException("unknown parameter spec passed to IV parameters object.");
    }

    @Override // java.security.AlgorithmParametersSpi
    protected java.lang.String engineToString() {
        return "IV Parameters";
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr, java.lang.String str) throws java.io.IOException {
        if (isASN1FormatString(str)) {
            try {
                engineInit(((org.bouncycastle.asn1.ASN1OctetString) org.bouncycastle.asn1.ASN1Primitive.fromByteArray(bArr)).getOctets());
            } catch (java.lang.Exception e) {
                throw new java.io.IOException("Exception decoding: ".concat(java.lang.String.valueOf(e)));
            }
        } else {
            if (!str.equals("RAW")) {
                throw new java.io.IOException("Unknown parameters format in IV parameters object");
            }
            engineInit(bArr);
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr) throws java.io.IOException {
        if (bArr.length % 8 != 0 && bArr[0] == 4 && bArr[1] == bArr.length - 2) {
            bArr = ((org.bouncycastle.asn1.ASN1OctetString) org.bouncycastle.asn1.ASN1Primitive.fromByteArray(bArr)).getOctets();
        }
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.util.Arrays.clone(bArr);
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec) throws java.security.spec.InvalidParameterSpecException {
        if (!(algorithmParameterSpec instanceof javax.crypto.spec.IvParameterSpec)) {
            throw new java.security.spec.InvalidParameterSpecException("IvParameterSpec required to initialise a IV parameters algorithm parameters object");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = ((javax.crypto.spec.IvParameterSpec) algorithmParameterSpec).getIV();
    }

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded(java.lang.String str) throws java.io.IOException {
        if (isASN1FormatString(str)) {
            return new org.bouncycastle.asn1.DEROctetString(engineGetEncoded("RAW")).getEncoded();
        }
        if (str.equals("RAW")) {
            return org.bouncycastle.util.Arrays.clone(this.getHighResolutionOutputSizeshNQ4ISI);
        }
        return null;
    }

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded() throws java.io.IOException {
        return engineGetEncoded("ASN.1");
    }
}
