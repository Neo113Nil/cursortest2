package org.bouncycastle.cms;

/* loaded from: classes17.dex */
class CMSUtils {
    private static final java.util.Set getHighResolutionOutputSizeshNQ4ISI;
    private static final java.util.Set<java.lang.String> getHighSpeedVideoFpsRanges;
    private static final java.util.Set getHighSpeedVideoFpsRangesFor;
    private static final java.util.Set getHighSpeedVideoSizes;

    static java.io.OutputStream Camera2StreamConfigurationMap(java.util.Collection collection, java.io.OutputStream outputStream) {
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            java.io.OutputStream calculatingOutputStream = ((org.bouncycastle.cms.SignerInfoGenerator) it.next()).getCalculatingOutputStream();
            if (outputStream == null) {
                if (calculatingOutputStream == null) {
                    calculatingOutputStream = new org.bouncycastle.cms.NullOutputStream();
                }
                outputStream = calculatingOutputStream;
            } else if (calculatingOutputStream != null) {
                outputStream = new org.bouncycastle.util.io.TeeOutputStream(outputStream, calculatingOutputStream);
            } else if (outputStream == null) {
                outputStream = new org.bouncycastle.cms.NullOutputStream();
            }
        }
        return outputStream;
    }

    static java.io.OutputStream getHighResolutionOutputSizeshNQ4ISI(java.io.OutputStream outputStream, java.io.OutputStream outputStream2) {
        return outputStream == null ? outputStream2 == null ? new org.bouncycastle.cms.NullOutputStream() : outputStream2 : outputStream2 == null ? outputStream == null ? new org.bouncycastle.cms.NullOutputStream() : outputStream : new org.bouncycastle.util.io.TeeOutputStream(outputStream, outputStream2);
    }

    private static void Camera2StreamConfigurationMap(org.bouncycastle.asn1.cms.OtherRevocationInfoFormat otherRevocationInfoFormat) {
        if (org.bouncycastle.asn1.cms.CMSObjectIdentifiers.id_ri_ocsp_response.equals((org.bouncycastle.asn1.ASN1Primitive) otherRevocationInfoFormat.getInfoFormat()) && org.bouncycastle.asn1.ocsp.OCSPResponse.getInstance(otherRevocationInfoFormat.getInfo()).getResponseStatus().getIntValue() != 0) {
            throw new java.lang.IllegalArgumentException("cannot add unsuccessful OCSP response to CMS SignedData");
        }
    }

    public static byte[] getHighSpeedVideoSizes(java.io.InputStream inputStream) throws java.io.IOException {
        return org.bouncycastle.util.io.Streams.readAll(inputStream);
    }

    static org.bouncycastle.asn1.cms.ContentInfo getHighSpeedVideoFpsRangesFor(byte[] bArr) throws org.bouncycastle.cms.CMSException {
        return getHighSpeedVideoFpsRanges(new org.bouncycastle.asn1.ASN1InputStream(bArr));
    }

    private static org.bouncycastle.asn1.cms.ContentInfo getHighSpeedVideoFpsRanges(org.bouncycastle.asn1.ASN1InputStream aSN1InputStream) throws org.bouncycastle.cms.CMSException {
        try {
            org.bouncycastle.asn1.cms.ContentInfo contentInfo = org.bouncycastle.asn1.cms.ContentInfo.getInstance(aSN1InputStream.readObject());
            if (contentInfo != null) {
                return contentInfo;
            }
            throw new org.bouncycastle.cms.CMSException("No content found.");
        } catch (java.io.IOException e) {
            throw new org.bouncycastle.cms.CMSException("IOException reading content.", e);
        } catch (java.lang.ClassCastException e2) {
            throw new org.bouncycastle.cms.CMSException("Malformed content.", e2);
        } catch (java.lang.IllegalArgumentException e3) {
            throw new org.bouncycastle.cms.CMSException("Malformed content.", e3);
        }
    }

    static org.bouncycastle.asn1.cms.ContentInfo getHighSpeedVideoFpsRangesFor(java.io.InputStream inputStream) throws org.bouncycastle.cms.CMSException {
        return getHighSpeedVideoFpsRanges(new org.bouncycastle.asn1.ASN1InputStream(inputStream));
    }

    static boolean Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return getHighSpeedVideoFpsRangesFor.contains(aSN1ObjectIdentifier);
    }

    static boolean getHighSpeedVideoSizes(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier2) {
        if (algorithmIdentifier == null || algorithmIdentifier2 == null || !algorithmIdentifier.getAlgorithm().equals((org.bouncycastle.asn1.ASN1Primitive) algorithmIdentifier2.getAlgorithm())) {
            return false;
        }
        org.bouncycastle.asn1.ASN1Encodable parameters = algorithmIdentifier.getParameters();
        org.bouncycastle.asn1.ASN1Encodable parameters2 = algorithmIdentifier2.getParameters();
        return parameters != null ? parameters.equals(parameters2) || (parameters.equals(org.bouncycastle.asn1.DERNull.INSTANCE) && parameters2 == null) : parameters2 == null || parameters2.equals(org.bouncycastle.asn1.DERNull.INSTANCE);
    }

    static boolean getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        return getHighSpeedVideoFpsRanges.contains(org.bouncycastle.util.Strings.toUpperCase(str));
    }

    static java.io.OutputStream Camera2StreamConfigurationMap(java.io.OutputStream outputStream) {
        return outputStream == null ? new org.bouncycastle.cms.NullOutputStream() : outputStream;
    }

    static java.util.Collection getHighSpeedVideoFpsRanges(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.util.Store store) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = store.getMatches(null).iterator();
        while (it.hasNext()) {
            org.bouncycastle.asn1.cms.OtherRevocationInfoFormat otherRevocationInfoFormat = new org.bouncycastle.asn1.cms.OtherRevocationInfoFormat(aSN1ObjectIdentifier, (org.bouncycastle.asn1.ASN1Encodable) it.next());
            Camera2StreamConfigurationMap(otherRevocationInfoFormat);
            arrayList.add(new org.bouncycastle.asn1.DERTaggedObject(false, 1, (org.bouncycastle.asn1.ASN1Encodable) otherRevocationInfoFormat));
        }
        return arrayList;
    }

    static java.util.List getHighSpeedVideoFpsRanges(org.bouncycastle.util.Store store) throws org.bouncycastle.cms.CMSException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            java.util.Iterator it = store.getMatches(null).iterator();
            while (it.hasNext()) {
                arrayList.add(((org.bouncycastle.cert.X509CertificateHolder) it.next()).toASN1Structure());
            }
            return arrayList;
        } catch (java.lang.ClassCastException e) {
            throw new org.bouncycastle.cms.CMSException("error processing certs", e);
        }
    }

    static java.util.List getHighSpeedVideoSizes(org.bouncycastle.util.Store store) throws org.bouncycastle.cms.CMSException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            for (java.lang.Object obj : store.getMatches(null)) {
                if (obj instanceof org.bouncycastle.cert.X509CRLHolder) {
                    obj = ((org.bouncycastle.cert.X509CRLHolder) obj).toASN1Structure();
                } else if (obj instanceof org.bouncycastle.asn1.cms.OtherRevocationInfoFormat) {
                    org.bouncycastle.asn1.cms.OtherRevocationInfoFormat otherRevocationInfoFormat = org.bouncycastle.asn1.cms.OtherRevocationInfoFormat.getInstance(obj);
                    Camera2StreamConfigurationMap(otherRevocationInfoFormat);
                    arrayList.add(new org.bouncycastle.asn1.DERTaggedObject(false, 1, (org.bouncycastle.asn1.ASN1Encodable) otherRevocationInfoFormat));
                } else if (obj instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
                }
                arrayList.add(obj);
            }
            return arrayList;
        } catch (java.lang.ClassCastException e) {
            throw new org.bouncycastle.cms.CMSException("error processing certs", e);
        }
    }

    static java.util.List Camera2StreamConfigurationMap(org.bouncycastle.util.Store store) throws org.bouncycastle.cms.CMSException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            java.util.Iterator it = store.getMatches(null).iterator();
            while (it.hasNext()) {
                arrayList.add(new org.bouncycastle.asn1.DERTaggedObject(false, 2, (org.bouncycastle.asn1.ASN1Encodable) ((org.bouncycastle.cert.X509AttributeCertificateHolder) it.next()).toASN1Structure()));
            }
            return arrayList;
        } catch (java.lang.ClassCastException e) {
            throw new org.bouncycastle.cms.CMSException("error processing certs", e);
        }
    }

    static org.bouncycastle.asn1.ASN1Set Camera2StreamConfigurationMap(java.util.List list) {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            aSN1EncodableVector.add((org.bouncycastle.asn1.ASN1Encodable) it.next());
        }
        return new org.bouncycastle.asn1.DERSet(aSN1EncodableVector);
    }

    static org.bouncycastle.asn1.ASN1Set getHighSpeedVideoSizes(java.util.List list) {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            aSN1EncodableVector.add((org.bouncycastle.asn1.ASN1Encodable) it.next());
        }
        return new org.bouncycastle.asn1.BERSet(aSN1EncodableVector);
    }

    static java.io.OutputStream getHighResolutionOutputSizeshNQ4ISI(java.io.OutputStream outputStream, boolean z, int i) throws java.io.IOException {
        org.bouncycastle.asn1.BEROctetStringGenerator bEROctetStringGenerator = new org.bouncycastle.asn1.BEROctetStringGenerator(outputStream, 0, z);
        return i != 0 ? bEROctetStringGenerator.getOctetOutputStream(new byte[i]) : bEROctetStringGenerator.getOctetOutputStream();
    }

    static org.bouncycastle.asn1.ASN1Set getHighSpeedVideoFpsRangesFor(java.util.Set<org.bouncycastle.asn1.x509.AlgorithmIdentifier> set) {
        return new org.bouncycastle.asn1.DLSet((org.bouncycastle.asn1.x509.AlgorithmIdentifier[]) set.toArray(new org.bouncycastle.asn1.x509.AlgorithmIdentifier[set.size()]));
    }

    static java.io.InputStream getHighResolutionOutputSizeshNQ4ISI(java.util.Collection collection, java.io.InputStream inputStream) {
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            inputStream = new org.bouncycastle.util.io.TeeInputStream(inputStream, ((org.bouncycastle.operator.DigestCalculator) it.next()).getOutputStream());
        }
        return inputStream;
    }

    static void getHighSpeedVideoFpsRangesFor(java.util.Set<org.bouncycastle.asn1.x509.AlgorithmIdentifier> set, org.bouncycastle.cms.SignerInformation signerInformation, org.bouncycastle.operator.DigestAlgorithmIdentifierFinder digestAlgorithmIdentifierFinder) {
        org.bouncycastle.cms.CMSSignedHelper cMSSignedHelper = org.bouncycastle.cms.CMSSignedHelper.getHighSpeedVideoSizes;
        set.add(org.bouncycastle.cms.CMSSignedHelper.getHighSpeedVideoFpsRanges(signerInformation.getDigestAlgorithmID(), digestAlgorithmIdentifierFinder));
        java.util.Iterator<org.bouncycastle.cms.SignerInformation> it = signerInformation.getCounterSignatures().iterator();
        while (it.hasNext()) {
            org.bouncycastle.cms.SignerInformation next = it.next();
            org.bouncycastle.cms.CMSSignedHelper cMSSignedHelper2 = org.bouncycastle.cms.CMSSignedHelper.getHighSpeedVideoSizes;
            set.add(org.bouncycastle.cms.CMSSignedHelper.getHighSpeedVideoFpsRanges(next.getDigestAlgorithmID(), digestAlgorithmIdentifierFinder));
        }
    }

    CMSUtils() {
    }

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        getHighSpeedVideoFpsRanges = hashSet;
        java.util.HashSet hashSet2 = new java.util.HashSet();
        getHighSpeedVideoSizes = hashSet2;
        java.util.HashSet hashSet3 = new java.util.HashSet();
        getHighResolutionOutputSizeshNQ4ISI = hashSet3;
        java.util.HashSet hashSet4 = new java.util.HashSet();
        getHighSpeedVideoFpsRangesFor = hashSet4;
        hashSet.add("DES");
        hashSet.add("DESEDE");
        hashSet.add(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.desCBC.getId());
        hashSet.add(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.des_EDE3_CBC.getId());
        hashSet.add(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_alg_CMS3DESwrap.getId());
        hashSet2.add(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.mqvSinglePass_sha1kdf_scheme);
        hashSet2.add(org.bouncycastle.asn1.sec.SECObjectIdentifiers.mqvSinglePass_sha224kdf_scheme);
        hashSet2.add(org.bouncycastle.asn1.sec.SECObjectIdentifiers.mqvSinglePass_sha256kdf_scheme);
        hashSet2.add(org.bouncycastle.asn1.sec.SECObjectIdentifiers.mqvSinglePass_sha384kdf_scheme);
        hashSet2.add(org.bouncycastle.asn1.sec.SECObjectIdentifiers.mqvSinglePass_sha512kdf_scheme);
        hashSet3.add(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.dhSinglePass_cofactorDH_sha1kdf_scheme);
        hashSet3.add(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.dhSinglePass_stdDH_sha1kdf_scheme);
        hashSet3.add(org.bouncycastle.asn1.sec.SECObjectIdentifiers.dhSinglePass_cofactorDH_sha224kdf_scheme);
        hashSet3.add(org.bouncycastle.asn1.sec.SECObjectIdentifiers.dhSinglePass_stdDH_sha224kdf_scheme);
        hashSet3.add(org.bouncycastle.asn1.sec.SECObjectIdentifiers.dhSinglePass_cofactorDH_sha256kdf_scheme);
        hashSet3.add(org.bouncycastle.asn1.sec.SECObjectIdentifiers.dhSinglePass_stdDH_sha256kdf_scheme);
        hashSet3.add(org.bouncycastle.asn1.sec.SECObjectIdentifiers.dhSinglePass_cofactorDH_sha384kdf_scheme);
        hashSet3.add(org.bouncycastle.asn1.sec.SECObjectIdentifiers.dhSinglePass_stdDH_sha384kdf_scheme);
        hashSet3.add(org.bouncycastle.asn1.sec.SECObjectIdentifiers.dhSinglePass_cofactorDH_sha512kdf_scheme);
        hashSet3.add(org.bouncycastle.asn1.sec.SECObjectIdentifiers.dhSinglePass_stdDH_sha512kdf_scheme);
        hashSet4.add(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3410_2001_CryptoPro_ESDH);
        hashSet4.add(org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_agreement_gost_3410_12_256);
        hashSet4.add(org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_agreement_gost_3410_12_512);
    }
}
