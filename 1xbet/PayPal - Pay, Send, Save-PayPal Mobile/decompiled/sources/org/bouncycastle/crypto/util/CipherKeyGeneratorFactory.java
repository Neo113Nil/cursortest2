package org.bouncycastle.crypto.util;

/* loaded from: classes17.dex */
public class CipherKeyGeneratorFactory {
    public static org.bouncycastle.crypto.CipherKeyGenerator createKeyGenerator(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, java.security.SecureRandom secureRandom) throws java.lang.IllegalArgumentException {
        if (org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_CBC.equals((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifier)) {
            org.bouncycastle.crypto.CipherKeyGenerator cipherKeyGenerator = new org.bouncycastle.crypto.CipherKeyGenerator();
            cipherKeyGenerator.init(new org.bouncycastle.crypto.KeyGenerationParameters(secureRandom, 128));
            return cipherKeyGenerator;
        }
        if (org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_CBC.equals((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifier)) {
            org.bouncycastle.crypto.CipherKeyGenerator cipherKeyGenerator2 = new org.bouncycastle.crypto.CipherKeyGenerator();
            cipherKeyGenerator2.init(new org.bouncycastle.crypto.KeyGenerationParameters(secureRandom, 192));
            return cipherKeyGenerator2;
        }
        if (org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_CBC.equals((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifier)) {
            org.bouncycastle.crypto.CipherKeyGenerator cipherKeyGenerator3 = new org.bouncycastle.crypto.CipherKeyGenerator();
            cipherKeyGenerator3.init(new org.bouncycastle.crypto.KeyGenerationParameters(secureRandom, 256));
            return cipherKeyGenerator3;
        }
        if (org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_GCM.equals((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifier)) {
            org.bouncycastle.crypto.CipherKeyGenerator cipherKeyGenerator4 = new org.bouncycastle.crypto.CipherKeyGenerator();
            cipherKeyGenerator4.init(new org.bouncycastle.crypto.KeyGenerationParameters(secureRandom, 128));
            return cipherKeyGenerator4;
        }
        if (org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_GCM.equals((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifier)) {
            org.bouncycastle.crypto.CipherKeyGenerator cipherKeyGenerator5 = new org.bouncycastle.crypto.CipherKeyGenerator();
            cipherKeyGenerator5.init(new org.bouncycastle.crypto.KeyGenerationParameters(secureRandom, 192));
            return cipherKeyGenerator5;
        }
        if (org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_GCM.equals((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifier)) {
            org.bouncycastle.crypto.CipherKeyGenerator cipherKeyGenerator6 = new org.bouncycastle.crypto.CipherKeyGenerator();
            cipherKeyGenerator6.init(new org.bouncycastle.crypto.KeyGenerationParameters(secureRandom, 256));
            return cipherKeyGenerator6;
        }
        if (org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_CCM.equals((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifier)) {
            org.bouncycastle.crypto.CipherKeyGenerator cipherKeyGenerator7 = new org.bouncycastle.crypto.CipherKeyGenerator();
            cipherKeyGenerator7.init(new org.bouncycastle.crypto.KeyGenerationParameters(secureRandom, 128));
            return cipherKeyGenerator7;
        }
        if (org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_CCM.equals((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifier)) {
            org.bouncycastle.crypto.CipherKeyGenerator cipherKeyGenerator8 = new org.bouncycastle.crypto.CipherKeyGenerator();
            cipherKeyGenerator8.init(new org.bouncycastle.crypto.KeyGenerationParameters(secureRandom, 192));
            return cipherKeyGenerator8;
        }
        if (org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_CCM.equals((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifier)) {
            org.bouncycastle.crypto.CipherKeyGenerator cipherKeyGenerator9 = new org.bouncycastle.crypto.CipherKeyGenerator();
            cipherKeyGenerator9.init(new org.bouncycastle.crypto.KeyGenerationParameters(secureRandom, 256));
            return cipherKeyGenerator9;
        }
        if (org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.des_EDE3_CBC.equals((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifier)) {
            org.bouncycastle.crypto.generators.DESedeKeyGenerator dESedeKeyGenerator = new org.bouncycastle.crypto.generators.DESedeKeyGenerator();
            dESedeKeyGenerator.init(new org.bouncycastle.crypto.KeyGenerationParameters(secureRandom, 192));
            return dESedeKeyGenerator;
        }
        if (org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia128_cbc.equals((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifier)) {
            org.bouncycastle.crypto.CipherKeyGenerator cipherKeyGenerator10 = new org.bouncycastle.crypto.CipherKeyGenerator();
            cipherKeyGenerator10.init(new org.bouncycastle.crypto.KeyGenerationParameters(secureRandom, 128));
            return cipherKeyGenerator10;
        }
        if (org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia192_cbc.equals((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifier)) {
            org.bouncycastle.crypto.CipherKeyGenerator cipherKeyGenerator11 = new org.bouncycastle.crypto.CipherKeyGenerator();
            cipherKeyGenerator11.init(new org.bouncycastle.crypto.KeyGenerationParameters(secureRandom, 192));
            return cipherKeyGenerator11;
        }
        if (org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia256_cbc.equals((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifier)) {
            org.bouncycastle.crypto.CipherKeyGenerator cipherKeyGenerator12 = new org.bouncycastle.crypto.CipherKeyGenerator();
            cipherKeyGenerator12.init(new org.bouncycastle.crypto.KeyGenerationParameters(secureRandom, 256));
            return cipherKeyGenerator12;
        }
        if (org.bouncycastle.asn1.kisa.KISAObjectIdentifiers.id_seedCBC.equals((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifier)) {
            org.bouncycastle.crypto.CipherKeyGenerator cipherKeyGenerator13 = new org.bouncycastle.crypto.CipherKeyGenerator();
            cipherKeyGenerator13.init(new org.bouncycastle.crypto.KeyGenerationParameters(secureRandom, 128));
            return cipherKeyGenerator13;
        }
        if (org.bouncycastle.crypto.util.AlgorithmIdentifierFactory.getHighSpeedVideoSizes.equals((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifier)) {
            org.bouncycastle.crypto.CipherKeyGenerator cipherKeyGenerator14 = new org.bouncycastle.crypto.CipherKeyGenerator();
            cipherKeyGenerator14.init(new org.bouncycastle.crypto.KeyGenerationParameters(secureRandom, 128));
            return cipherKeyGenerator14;
        }
        if (org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.desCBC.equals((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifier)) {
            org.bouncycastle.crypto.generators.DESKeyGenerator dESKeyGenerator = new org.bouncycastle.crypto.generators.DESKeyGenerator();
            dESKeyGenerator.init(new org.bouncycastle.crypto.KeyGenerationParameters(secureRandom, 64));
            return dESKeyGenerator;
        }
        if (org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.rc4.equals((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifier)) {
            org.bouncycastle.crypto.CipherKeyGenerator cipherKeyGenerator15 = new org.bouncycastle.crypto.CipherKeyGenerator();
            cipherKeyGenerator15.init(new org.bouncycastle.crypto.KeyGenerationParameters(secureRandom, 128));
            return cipherKeyGenerator15;
        }
        if (!org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.RC2_CBC.equals((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifier)) {
            throw new java.lang.IllegalArgumentException("cannot recognise cipher: ".concat(java.lang.String.valueOf(aSN1ObjectIdentifier)));
        }
        org.bouncycastle.crypto.CipherKeyGenerator cipherKeyGenerator16 = new org.bouncycastle.crypto.CipherKeyGenerator();
        cipherKeyGenerator16.init(new org.bouncycastle.crypto.KeyGenerationParameters(secureRandom, 128));
        return cipherKeyGenerator16;
    }

    private CipherKeyGeneratorFactory() {
    }
}
