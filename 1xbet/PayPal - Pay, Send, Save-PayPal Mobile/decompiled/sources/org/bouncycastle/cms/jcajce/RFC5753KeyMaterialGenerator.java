package org.bouncycastle.cms.jcajce;

/* loaded from: classes17.dex */
class RFC5753KeyMaterialGenerator implements org.bouncycastle.cms.jcajce.KeyMaterialGenerator {
    @Override // org.bouncycastle.cms.jcajce.KeyMaterialGenerator
    public final byte[] getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, int i, byte[] bArr) {
        try {
            return new org.bouncycastle.asn1.cms.ecc.ECCCMSSharedInfo(algorithmIdentifier, bArr, org.bouncycastle.util.Pack.intToBigEndian(i)).getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
        } catch (java.io.IOException e) {
            throw new java.lang.IllegalStateException("Unable to create KDF material: ".concat(java.lang.String.valueOf(e)));
        }
    }

    RFC5753KeyMaterialGenerator() {
    }
}
