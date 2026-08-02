package org.bouncycastle.jcajce.spec;

/* loaded from: classes17.dex */
public class PBKDF2KeySpec extends javax.crypto.spec.PBEKeySpec {
    private static final org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoSizes = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA1, org.bouncycastle.asn1.DERNull.INSTANCE);
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier Camera2StreamConfigurationMap;

    public boolean isDefaultPrf() {
        return getHighSpeedVideoSizes.equals(this.Camera2StreamConfigurationMap);
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getPrf() {
        return this.Camera2StreamConfigurationMap;
    }

    public PBKDF2KeySpec(char[] cArr, byte[] bArr, int i, int i2, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
        super(cArr, bArr, i, i2);
        this.Camera2StreamConfigurationMap = algorithmIdentifier;
    }
}
