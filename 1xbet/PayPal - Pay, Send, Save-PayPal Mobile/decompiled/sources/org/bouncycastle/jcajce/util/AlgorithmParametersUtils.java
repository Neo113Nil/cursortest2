package org.bouncycastle.jcajce.util;

/* loaded from: classes17.dex */
public class AlgorithmParametersUtils {
    public static void loadParameters(java.security.AlgorithmParameters algorithmParameters, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) throws java.io.IOException {
        try {
            algorithmParameters.init(aSN1Encodable.toASN1Primitive().getEncoded(), "ASN.1");
        } catch (java.lang.Exception unused) {
            algorithmParameters.init(aSN1Encodable.toASN1Primitive().getEncoded());
        }
    }

    public static org.bouncycastle.asn1.ASN1Encodable extractParameters(java.security.AlgorithmParameters algorithmParameters) throws java.io.IOException {
        try {
            return org.bouncycastle.asn1.ASN1Primitive.fromByteArray(algorithmParameters.getEncoded("ASN.1"));
        } catch (java.lang.Exception unused) {
            return org.bouncycastle.asn1.ASN1Primitive.fromByteArray(algorithmParameters.getEncoded());
        }
    }

    private AlgorithmParametersUtils() {
    }
}
