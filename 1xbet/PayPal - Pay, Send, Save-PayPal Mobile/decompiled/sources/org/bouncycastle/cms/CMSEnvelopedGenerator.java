package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public class CMSEnvelopedGenerator {
    public static final java.lang.String CAST5_CBC = "1.2.840.113533.7.66.10";
    public static final java.lang.String IDEA_CBC = "1.3.6.1.4.1.188.7.1.1.2";
    protected org.bouncycastle.asn1.cms.OriginatorInfo originatorInfo;
    public static final java.lang.String DES_EDE3_CBC = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.des_EDE3_CBC.getId();
    public static final java.lang.String RC2_CBC = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.RC2_CBC.getId();
    public static final java.lang.String AES128_CBC = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_CBC.getId();
    public static final java.lang.String AES192_CBC = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_CBC.getId();
    public static final java.lang.String AES256_CBC = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_CBC.getId();
    public static final java.lang.String CAMELLIA128_CBC = org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia128_cbc.getId();
    public static final java.lang.String CAMELLIA192_CBC = org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia192_cbc.getId();
    public static final java.lang.String CAMELLIA256_CBC = org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia256_cbc.getId();
    public static final java.lang.String SEED_CBC = org.bouncycastle.asn1.kisa.KISAObjectIdentifiers.id_seedCBC.getId();
    public static final java.lang.String DES_EDE3_WRAP = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_alg_CMS3DESwrap.getId();
    public static final java.lang.String AES128_WRAP = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_wrap.getId();
    public static final java.lang.String AES192_WRAP = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_wrap.getId();
    public static final java.lang.String AES256_WRAP = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_wrap.getId();
    public static final java.lang.String CAMELLIA128_WRAP = org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia128_wrap.getId();
    public static final java.lang.String CAMELLIA192_WRAP = org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia192_wrap.getId();
    public static final java.lang.String CAMELLIA256_WRAP = org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia256_wrap.getId();
    public static final java.lang.String SEED_WRAP = org.bouncycastle.asn1.kisa.KISAObjectIdentifiers.id_npki_app_cmsSeed_wrap.getId();
    public static final java.lang.String ECDH_SHA1KDF = org.bouncycastle.asn1.x9.X9ObjectIdentifiers.dhSinglePass_stdDH_sha1kdf_scheme.getId();
    public static final java.lang.String ECMQV_SHA1KDF = org.bouncycastle.asn1.x9.X9ObjectIdentifiers.mqvSinglePass_sha1kdf_scheme.getId();
    final java.util.List Camera2StreamConfigurationMap = new java.util.ArrayList();
    protected org.bouncycastle.cms.CMSAttributeTableGenerator unprotectedAttributeGenerator = null;

    public void setUnprotectedAttributeGenerator(org.bouncycastle.cms.CMSAttributeTableGenerator cMSAttributeTableGenerator) {
        this.unprotectedAttributeGenerator = cMSAttributeTableGenerator;
    }

    public void setOriginatorInfo(org.bouncycastle.cms.OriginatorInformation originatorInformation) {
        this.originatorInfo = originatorInformation.toASN1Structure();
    }

    public void addRecipientInfoGenerator(org.bouncycastle.cms.RecipientInfoGenerator recipientInfoGenerator) {
        this.Camera2StreamConfigurationMap.add(recipientInfoGenerator);
    }

    protected CMSEnvelopedGenerator() {
    }
}
