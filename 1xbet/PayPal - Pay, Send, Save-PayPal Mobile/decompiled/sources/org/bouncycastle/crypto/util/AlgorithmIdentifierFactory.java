package org.bouncycastle.crypto.util;

/* loaded from: classes17.dex */
public class AlgorithmIdentifierFactory {
    static final org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.ASN1ObjectIdentifier(org.bouncycastle.cms.CMSEnvelopedGenerator.IDEA_CBC).intern();
    static final org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoSizes = new org.bouncycastle.asn1.ASN1ObjectIdentifier(org.bouncycastle.cms.CMSEnvelopedGenerator.CAST5_CBC).intern();
    private static final short[] getHighResolutionOutputSizeshNQ4ISI = {189, 86, 234, 242, 162, 241, 172, 42, 176, com.visa.cbp.setDeviceName.isOutputSupportedFor, 209, 156, 27, 51, 253, 208, 48, 4, 182, 220, 125, 223, 50, 75, 247, 203, 69, 155, 49, 187, 33, 90, 65, 159, 225, 217, 74, 77, 158, 218, 160, 104, 44, 195, 39, 95, 128, 54, 62, 238, 251, 149, 26, 254, 206, 168, 52, 169, 19, 240, 166, 63, 216, 12, 120, 36, 175, 35, 82, 193, 103, 23, 245, 102, com.visa.cbp.setDeviceName.Camera2StreamConfigurationMap, 231, 232, 7, 184, 96, 72, 230, 30, 83, 243, com.visa.cbp.setDeviceName.getOutputStallDurationlomOqCM, com.visa.cbp.getEncExpo.ResultReceiverMyResultReceiver, 114, 140, 8, 21, 110, 134, 0, com.visa.cbp.setDeviceName.getHighSpeedVideoFpsRanges, 250, 244, 127, 138, 66, 25, 246, 219, 205, 20, 141, 80, 18, 186, 60, 6, 78, 236, 179, 53, 17, 161, 136, 142, 43, com.visa.cbp.setDeviceName.coroutineBoundary, 153, 183, 113, 116, 211, 228, 191, 58, 222, 150, 14, 188, 10, 237, 119, 252, 55, 107, 3, 121, 137, 98, 198, 215, 192, 210, 124, 106, 139, 34, 163, 91, 5, 93, 2, 117, 213, 97, 227, 24, com.visa.cbp.setDeviceName.getOutputSizeshNQ4ISI, 85, 81, 173, 31, 11, 94, 133, 229, 194, 87, 99, 202, 61, 108, 180, 197, 204, 112, com.visa.cbp.getEncExpo.invoke, com.visa.cbp.setDeviceName.getHighSpeedVideoSizesFor, 89, 13, 71, 32, 200, 79, 88, 224, 1, 226, 22, 56, 196, com.visa.cbp.setDeviceName.getHighResolutionOutputSizeshNQ4ISI, 59, 15, 101, 70, 190, 126, 45, 123, 130, 249, 64, 181, 29, 115, 248, 235, 38, 199, com.visa.cbp.setDeviceName.unwrapAs, 151, 37, 84, 177, 40, 170, 152, 157, com.visa.cbp.setDeviceName._CREATION, 100, 109, 122, 212, 16, 129, 68, 239, 73, 214, 174, 46, 221, 118, 92, 47, 167, 28, 201, 9, 105, 154, 131, 207, 41, 57, 185, 233, 76, 255, 67, 171};

    public static org.bouncycastle.asn1.x509.AlgorithmIdentifier generateEncryptionAlgID(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, int i, java.security.SecureRandom secureRandom) throws java.lang.IllegalArgumentException {
        if (aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_CBC) || aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_CBC) || aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_CBC) || aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia128_cbc) || aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia192_cbc) || aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia256_cbc) || aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.kisa.KISAObjectIdentifiers.id_seedCBC)) {
            byte[] bArr = new byte[16];
            secureRandom.nextBytes(bArr);
            return new org.bouncycastle.asn1.x509.AlgorithmIdentifier(aSN1ObjectIdentifier, new org.bouncycastle.asn1.DEROctetString(bArr));
        }
        if (aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_GCM) || aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_GCM) || aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_GCM)) {
            byte[] bArr2 = new byte[12];
            secureRandom.nextBytes(bArr2);
            return new org.bouncycastle.asn1.x509.AlgorithmIdentifier(aSN1ObjectIdentifier, new org.bouncycastle.internal.asn1.cms.GCMParameters(bArr2, 16));
        }
        if (aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_CCM) || aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_CCM) || aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_CCM)) {
            byte[] bArr3 = new byte[8];
            secureRandom.nextBytes(bArr3);
            return new org.bouncycastle.asn1.x509.AlgorithmIdentifier(aSN1ObjectIdentifier, new org.bouncycastle.internal.asn1.cms.CCMParameters(bArr3, 16));
        }
        if (aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.des_EDE3_CBC) || aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) getHighSpeedVideoFpsRangesFor) || aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.desCBC)) {
            byte[] bArr4 = new byte[8];
            secureRandom.nextBytes(bArr4);
            return new org.bouncycastle.asn1.x509.AlgorithmIdentifier(aSN1ObjectIdentifier, new org.bouncycastle.asn1.DEROctetString(bArr4));
        }
        if (aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) getHighSpeedVideoSizes)) {
            byte[] bArr5 = new byte[8];
            secureRandom.nextBytes(bArr5);
            return new org.bouncycastle.asn1.x509.AlgorithmIdentifier(aSN1ObjectIdentifier, new org.bouncycastle.asn1.misc.CAST5CBCParameters(bArr5, i));
        }
        if (aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.rc4)) {
            return new org.bouncycastle.asn1.x509.AlgorithmIdentifier(aSN1ObjectIdentifier, org.bouncycastle.asn1.DERNull.INSTANCE);
        }
        if (!aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.RC2_CBC)) {
            throw new java.lang.IllegalArgumentException("unable to match algorithm");
        }
        byte[] bArr6 = new byte[8];
        secureRandom.nextBytes(bArr6);
        return new org.bouncycastle.asn1.x509.AlgorithmIdentifier(aSN1ObjectIdentifier, new org.bouncycastle.asn1.pkcs.RC2CBCParameter(getHighResolutionOutputSizeshNQ4ISI[128], bArr6));
    }

    private AlgorithmIdentifierFactory() {
    }
}
