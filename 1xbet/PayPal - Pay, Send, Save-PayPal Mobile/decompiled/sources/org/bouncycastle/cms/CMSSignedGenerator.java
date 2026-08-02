package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public class CMSSignedGenerator {
    private static final java.lang.String Camera2StreamConfigurationMap;
    public static final java.lang.String DATA = org.bouncycastle.asn1.cms.CMSObjectIdentifiers.data.getId();
    public static final java.lang.String DIGEST_GOST3411;
    public static final java.lang.String DIGEST_MD5;
    public static final java.lang.String DIGEST_RIPEMD128;
    public static final java.lang.String DIGEST_RIPEMD160;
    public static final java.lang.String DIGEST_RIPEMD256;
    public static final java.lang.String DIGEST_SHA1;
    public static final java.lang.String DIGEST_SHA224;
    public static final java.lang.String DIGEST_SHA256;
    public static final java.lang.String DIGEST_SHA384;
    public static final java.lang.String DIGEST_SHA512;
    public static final java.lang.String ENCRYPTION_DSA;
    public static final java.lang.String ENCRYPTION_ECDSA;
    public static final java.lang.String ENCRYPTION_ECGOST3410;
    public static final java.lang.String ENCRYPTION_ECGOST3410_2012_256;
    public static final java.lang.String ENCRYPTION_ECGOST3410_2012_512;
    public static final java.lang.String ENCRYPTION_GOST3410;
    public static final java.lang.String ENCRYPTION_RSA;
    public static final java.lang.String ENCRYPTION_RSA_PSS;
    private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private static final java.lang.String getHighSpeedVideoFpsRanges;
    private static final java.util.Map getHighSpeedVideoFpsRangesFor;
    private static final java.lang.String getHighSpeedVideoSizes;
    private static final java.util.Set getInputSizeshNQ4ISI;
    private static final java.lang.String getOutputMinFrameDuration;
    protected java.util.List _signers;
    protected java.util.List certs;
    protected java.util.List crls;
    protected org.bouncycastle.operator.DigestAlgorithmIdentifierFinder digestAlgIdFinder;
    protected java.util.Map digests;
    protected java.util.List signerGens;

    public java.util.Map getGeneratedDigests() {
        return new java.util.HashMap(this.digests);
    }

    protected java.util.Map getBaseParameters(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, byte[] bArr) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, aSN1ObjectIdentifier);
        hashMap.put(org.bouncycastle.cms.CMSAttributeTableGenerator.DIGEST_ALGORITHM_IDENTIFIER, algorithmIdentifier);
        hashMap.put(org.bouncycastle.cms.CMSAttributeTableGenerator.DIGEST, org.bouncycastle.util.Arrays.clone(bArr));
        return hashMap;
    }

    public void addSigners(org.bouncycastle.cms.SignerInformationStore signerInformationStore) {
        java.util.Iterator<org.bouncycastle.cms.SignerInformation> it = signerInformationStore.getSigners().iterator();
        while (it.hasNext()) {
            this._signers.add(it.next());
        }
    }

    public void addSignerInfoGenerator(org.bouncycastle.cms.SignerInfoGenerator signerInfoGenerator) {
        this.signerGens.add(signerInfoGenerator);
    }

    public void addOtherRevocationInfo(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.util.Store store) {
        this.crls.addAll(org.bouncycastle.cms.CMSUtils.getHighSpeedVideoFpsRanges(aSN1ObjectIdentifier, store));
    }

    public void addOtherRevocationInfo(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.crls.add(new org.bouncycastle.asn1.DERTaggedObject(false, 1, (org.bouncycastle.asn1.ASN1Encodable) new org.bouncycastle.asn1.cms.OtherRevocationInfoFormat(aSN1ObjectIdentifier, aSN1Encodable)));
    }

    public void addCertificates(org.bouncycastle.util.Store store) throws org.bouncycastle.cms.CMSException {
        this.certs.addAll(org.bouncycastle.cms.CMSUtils.getHighSpeedVideoFpsRanges(store));
    }

    public void addCertificate(org.bouncycastle.cert.X509CertificateHolder x509CertificateHolder) throws org.bouncycastle.cms.CMSException {
        this.certs.add(x509CertificateHolder.toASN1Structure());
    }

    public void addCRLs(org.bouncycastle.util.Store store) throws org.bouncycastle.cms.CMSException {
        this.crls.addAll(org.bouncycastle.cms.CMSUtils.getHighSpeedVideoSizes(store));
    }

    public void addCRL(org.bouncycastle.cert.X509CRLHolder x509CRLHolder) {
        this.crls.add(x509CRLHolder.toASN1Structure());
    }

    public void addAttributeCertificates(org.bouncycastle.util.Store store) throws org.bouncycastle.cms.CMSException {
        this.certs.addAll(org.bouncycastle.cms.CMSUtils.Camera2StreamConfigurationMap(store));
    }

    public void addAttributeCertificate(org.bouncycastle.cert.X509AttributeCertificateHolder x509AttributeCertificateHolder) throws org.bouncycastle.cms.CMSException {
        this.certs.add(new org.bouncycastle.asn1.DERTaggedObject(false, 2, (org.bouncycastle.asn1.ASN1Encodable) x509AttributeCertificateHolder.toASN1Structure()));
    }

    protected CMSSignedGenerator(org.bouncycastle.operator.DigestAlgorithmIdentifierFinder digestAlgorithmIdentifierFinder) {
        this.certs = new java.util.ArrayList();
        this.crls = new java.util.ArrayList();
        this._signers = new java.util.ArrayList();
        this.signerGens = new java.util.ArrayList();
        this.digests = new java.util.HashMap();
        this.digestAlgIdFinder = digestAlgorithmIdentifierFinder;
    }

    protected CMSSignedGenerator() {
        this(new org.bouncycastle.operator.DefaultDigestAlgorithmIdentifierFinder());
    }

    static {
        java.lang.String id = org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.idSHA1.getId();
        DIGEST_SHA1 = id;
        java.lang.String id2 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha224.getId();
        DIGEST_SHA224 = id2;
        java.lang.String id3 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256.getId();
        DIGEST_SHA256 = id3;
        java.lang.String id4 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha384.getId();
        DIGEST_SHA384 = id4;
        java.lang.String id5 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512.getId();
        DIGEST_SHA512 = id5;
        DIGEST_MD5 = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.md5.getId();
        DIGEST_GOST3411 = org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3411.getId();
        DIGEST_RIPEMD128 = org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.ripemd128.getId();
        DIGEST_RIPEMD160 = org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.ripemd160.getId();
        DIGEST_RIPEMD256 = org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.ripemd256.getId();
        ENCRYPTION_RSA = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.rsaEncryption.getId();
        java.lang.String id6 = org.bouncycastle.asn1.x9.X9ObjectIdentifiers.id_dsa_with_sha1.getId();
        ENCRYPTION_DSA = id6;
        java.lang.String id7 = org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA1.getId();
        ENCRYPTION_ECDSA = id7;
        ENCRYPTION_RSA_PSS = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_RSASSA_PSS.getId();
        ENCRYPTION_GOST3410 = org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3410_94.getId();
        ENCRYPTION_ECGOST3410 = org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3410_2001.getId();
        ENCRYPTION_ECGOST3410_2012_256 = org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3410_12_256.getId();
        ENCRYPTION_ECGOST3410_2012_512 = org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3410_12_512.getId();
        java.lang.String id8 = org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA1.getId();
        getHighSpeedVideoFpsRanges = id8;
        java.lang.String id9 = org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA224.getId();
        Camera2StreamConfigurationMap = id9;
        java.lang.String id10 = org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA256.getId();
        getHighResolutionOutputSizeshNQ4ISI = id10;
        java.lang.String id11 = org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA384.getId();
        getHighSpeedVideoSizes = id11;
        java.lang.String id12 = org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA512.getId();
        getOutputMinFrameDuration = id12;
        java.util.HashSet hashSet = new java.util.HashSet();
        getInputSizeshNQ4ISI = hashSet;
        java.util.HashMap hashMap = new java.util.HashMap();
        getHighSpeedVideoFpsRangesFor = hashMap;
        hashSet.add(id6);
        hashSet.add(id7);
        hashSet.add(id8);
        hashSet.add(id9);
        hashSet.add(id10);
        hashSet.add(id11);
        hashSet.add(id12);
        hashMap.put(id, id8);
        hashMap.put(id2, id9);
        hashMap.put(id3, id10);
        hashMap.put(id4, id11);
        hashMap.put(id5, id12);
    }
}
