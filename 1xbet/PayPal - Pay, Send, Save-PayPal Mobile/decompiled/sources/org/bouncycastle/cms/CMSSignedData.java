package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public class CMSSignedData implements org.bouncycastle.util.Encodable {
    private static final org.bouncycastle.cms.CMSSignedHelper getHighSpeedVideoFpsRangesFor = org.bouncycastle.cms.CMSSignedHelper.getHighSpeedVideoSizes;
    private static final org.bouncycastle.operator.DefaultDigestAlgorithmIdentifierFinder getInputFormats = new org.bouncycastle.operator.DefaultDigestAlgorithmIdentifierFinder();
    org.bouncycastle.asn1.cms.ContentInfo Camera2StreamConfigurationMap;
    org.bouncycastle.cms.SignerInformationStore getHighResolutionOutputSizeshNQ4ISI;
    org.bouncycastle.cms.CMSTypedData getHighSpeedVideoFpsRanges;
    org.bouncycastle.asn1.cms.SignedData getHighSpeedVideoSizes;
    private java.util.Map getOutputMinFrameDuration;

    public boolean verifySignatures(org.bouncycastle.cms.SignerInformationVerifierProvider signerInformationVerifierProvider, boolean z) throws org.bouncycastle.cms.CMSException {
        for (org.bouncycastle.cms.SignerInformation signerInformation : getSignerInfos().getSigners()) {
            try {
                if (!signerInformation.verify(signerInformationVerifierProvider.get(signerInformation.getSID()))) {
                    return false;
                }
                if (!z) {
                    java.util.Iterator<org.bouncycastle.cms.SignerInformation> it = signerInformation.getCounterSignatures().getSigners().iterator();
                    while (it.hasNext()) {
                        if (!getHighResolutionOutputSizeshNQ4ISI(it.next(), signerInformationVerifierProvider)) {
                            return false;
                        }
                    }
                }
            } catch (org.bouncycastle.operator.OperatorCreationException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("failure in verifier provider: ");
                sb.append(e.getMessage());
                throw new org.bouncycastle.cms.CMSException(sb.toString(), e);
            }
        }
        return true;
    }

    public boolean verifySignatures(org.bouncycastle.cms.SignerInformationVerifierProvider signerInformationVerifierProvider) throws org.bouncycastle.cms.CMSException {
        return verifySignatures(signerInformationVerifierProvider, false);
    }

    public org.bouncycastle.asn1.cms.ContentInfo toASN1Structure() {
        return this.Camera2StreamConfigurationMap;
    }

    public boolean isDetachedSignature() {
        return this.getHighSpeedVideoSizes.getEncapContentInfo().getContent() == null && this.getHighSpeedVideoSizes.getSignerInfos().size() > 0;
    }

    public boolean isCertificateManagementMessage() {
        return this.getHighSpeedVideoSizes.getEncapContentInfo().getContent() == null && this.getHighSpeedVideoSizes.getSignerInfos().size() == 0;
    }

    public int getVersion() {
        return this.getHighSpeedVideoSizes.getVersion().intValueExact();
    }

    public org.bouncycastle.cms.SignerInformationStore getSignerInfos() {
        java.util.Map map;
        java.lang.Object algorithm;
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            org.bouncycastle.asn1.ASN1Set signerInfos = this.getHighSpeedVideoSizes.getSignerInfos();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i = 0; i != signerInfos.size(); i++) {
                org.bouncycastle.asn1.cms.SignerInfo signerInfo = org.bouncycastle.asn1.cms.SignerInfo.getInstance(signerInfos.getObjectAt(i));
                org.bouncycastle.asn1.ASN1ObjectIdentifier contentType = this.getHighSpeedVideoSizes.getEncapContentInfo().getContentType();
                java.util.Map map2 = this.getOutputMinFrameDuration;
                if (map2 == null) {
                    arrayList.add(new org.bouncycastle.cms.SignerInformation(signerInfo, contentType, this.getHighSpeedVideoFpsRanges, null));
                } else {
                    if (map2.keySet().iterator().next() instanceof java.lang.String) {
                        map = this.getOutputMinFrameDuration;
                        algorithm = signerInfo.getDigestAlgorithm().getAlgorithm().getId();
                    } else {
                        map = this.getOutputMinFrameDuration;
                        algorithm = signerInfo.getDigestAlgorithm().getAlgorithm();
                    }
                    arrayList.add(new org.bouncycastle.cms.SignerInformation(signerInfo, contentType, null, (byte[]) map.get(algorithm)));
                }
            }
            this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.cms.SignerInformationStore(arrayList);
        }
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public java.lang.String getSignedContentTypeOID() {
        return this.getHighSpeedVideoSizes.getEncapContentInfo().getContentType().getId();
    }

    public org.bouncycastle.cms.CMSTypedData getSignedContent() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.util.Store getOtherRevocationInfo(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return org.bouncycastle.cms.CMSSignedHelper.getHighSpeedVideoFpsRangesFor(aSN1ObjectIdentifier, this.getHighSpeedVideoSizes.getCRLs());
    }

    public byte[] getEncoded(java.lang.String str) throws java.io.IOException {
        return this.Camera2StreamConfigurationMap.getEncoded(str);
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws java.io.IOException {
        return this.Camera2StreamConfigurationMap.getEncoded();
    }

    public java.util.Set<org.bouncycastle.asn1.x509.AlgorithmIdentifier> getDigestAlgorithmIDs() {
        java.util.HashSet hashSet = new java.util.HashSet(this.getHighSpeedVideoSizes.getDigestAlgorithms().size());
        java.util.Enumeration objects = this.getHighSpeedVideoSizes.getDigestAlgorithms().getObjects();
        while (objects.hasMoreElements()) {
            hashSet.add(org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(objects.nextElement()));
        }
        return java.util.Collections.unmodifiableSet(hashSet);
    }

    public org.bouncycastle.util.Store<org.bouncycastle.cert.X509CertificateHolder> getCertificates() {
        return org.bouncycastle.cms.CMSSignedHelper.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes.getCertificates());
    }

    public org.bouncycastle.util.Store<org.bouncycastle.cert.X509CRLHolder> getCRLs() {
        return org.bouncycastle.cms.CMSSignedHelper.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes.getCRLs());
    }

    public org.bouncycastle.util.Store<org.bouncycastle.cert.X509AttributeCertificateHolder> getAttributeCertificates() {
        return org.bouncycastle.cms.CMSSignedHelper.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes.getCertificates());
    }

    private boolean getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.cms.SignerInformation signerInformation, org.bouncycastle.cms.SignerInformationVerifierProvider signerInformationVerifierProvider) throws org.bouncycastle.operator.OperatorCreationException, org.bouncycastle.cms.CMSException {
        if (!signerInformation.verify(signerInformationVerifierProvider.get(signerInformation.getSID()))) {
            return false;
        }
        java.util.Iterator<org.bouncycastle.cms.SignerInformation> it = signerInformation.getCounterSignatures().getSigners().iterator();
        while (it.hasNext()) {
            if (!getHighResolutionOutputSizeshNQ4ISI(it.next(), signerInformationVerifierProvider)) {
                return false;
            }
        }
        return true;
    }

    public static org.bouncycastle.cms.CMSSignedData replaceSigners(org.bouncycastle.cms.CMSSignedData cMSSignedData, org.bouncycastle.cms.SignerInformationStore signerInformationStore) {
        org.bouncycastle.cms.CMSSignedData cMSSignedData2 = new org.bouncycastle.cms.CMSSignedData(cMSSignedData);
        cMSSignedData2.getHighResolutionOutputSizeshNQ4ISI = signerInformationStore;
        java.util.HashSet hashSet = new java.util.HashSet();
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
        for (org.bouncycastle.cms.SignerInformation signerInformation : signerInformationStore.getSigners()) {
            org.bouncycastle.cms.CMSUtils.getHighSpeedVideoFpsRangesFor(hashSet, signerInformation, getInputFormats);
            aSN1EncodableVector.add(signerInformation.toASN1Structure());
        }
        org.bouncycastle.asn1.ASN1Set highSpeedVideoFpsRangesFor = org.bouncycastle.cms.CMSUtils.getHighSpeedVideoFpsRangesFor(hashSet);
        org.bouncycastle.asn1.DLSet dLSet = new org.bouncycastle.asn1.DLSet(aSN1EncodableVector);
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = (org.bouncycastle.asn1.ASN1Sequence) cMSSignedData.getHighSpeedVideoSizes.toASN1Primitive();
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector2 = new org.bouncycastle.asn1.ASN1EncodableVector();
        aSN1EncodableVector2.add(aSN1Sequence.getObjectAt(0));
        aSN1EncodableVector2.add(highSpeedVideoFpsRangesFor);
        for (int i = 2; i != aSN1Sequence.size() - 1; i++) {
            aSN1EncodableVector2.add(aSN1Sequence.getObjectAt(i));
        }
        aSN1EncodableVector2.add(dLSet);
        cMSSignedData2.getHighSpeedVideoSizes = org.bouncycastle.asn1.cms.SignedData.getInstance(new org.bouncycastle.asn1.BERSequence(aSN1EncodableVector2));
        cMSSignedData2.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.cms.ContentInfo(cMSSignedData2.Camera2StreamConfigurationMap.getContentType(), cMSSignedData2.getHighSpeedVideoSizes);
        return cMSSignedData2;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static org.bouncycastle.cms.CMSSignedData replaceCertificatesAndCRLs(org.bouncycastle.cms.CMSSignedData cMSSignedData, org.bouncycastle.util.Store store, org.bouncycastle.util.Store store2, org.bouncycastle.util.Store store3) throws org.bouncycastle.cms.CMSException {
        org.bouncycastle.asn1.ASN1Set aSN1Set;
        org.bouncycastle.asn1.ASN1Set aSN1Set2;
        org.bouncycastle.cms.CMSSignedData cMSSignedData2 = new org.bouncycastle.cms.CMSSignedData(cMSSignedData);
        if (store != null || store2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (store != null) {
                arrayList.addAll(org.bouncycastle.cms.CMSUtils.getHighSpeedVideoFpsRanges(store));
            }
            if (store2 != null) {
                arrayList.addAll(org.bouncycastle.cms.CMSUtils.Camera2StreamConfigurationMap(store2));
            }
            org.bouncycastle.asn1.ASN1Set highSpeedVideoSizes = org.bouncycastle.cms.CMSUtils.getHighSpeedVideoSizes(arrayList);
            if (highSpeedVideoSizes.size() != 0) {
                aSN1Set = highSpeedVideoSizes;
                if (store3 != null) {
                    org.bouncycastle.asn1.ASN1Set highSpeedVideoSizes2 = org.bouncycastle.cms.CMSUtils.getHighSpeedVideoSizes(org.bouncycastle.cms.CMSUtils.getHighSpeedVideoSizes(store3));
                    if (highSpeedVideoSizes2.size() != 0) {
                        aSN1Set2 = highSpeedVideoSizes2;
                        cMSSignedData2.getHighSpeedVideoSizes = new org.bouncycastle.asn1.cms.SignedData(cMSSignedData.getHighSpeedVideoSizes.getDigestAlgorithms(), cMSSignedData.getHighSpeedVideoSizes.getEncapContentInfo(), aSN1Set, aSN1Set2, cMSSignedData.getHighSpeedVideoSizes.getSignerInfos());
                        cMSSignedData2.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.cms.ContentInfo(cMSSignedData2.Camera2StreamConfigurationMap.getContentType(), cMSSignedData2.getHighSpeedVideoSizes);
                        return cMSSignedData2;
                    }
                }
                aSN1Set2 = null;
                cMSSignedData2.getHighSpeedVideoSizes = new org.bouncycastle.asn1.cms.SignedData(cMSSignedData.getHighSpeedVideoSizes.getDigestAlgorithms(), cMSSignedData.getHighSpeedVideoSizes.getEncapContentInfo(), aSN1Set, aSN1Set2, cMSSignedData.getHighSpeedVideoSizes.getSignerInfos());
                cMSSignedData2.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.cms.ContentInfo(cMSSignedData2.Camera2StreamConfigurationMap.getContentType(), cMSSignedData2.getHighSpeedVideoSizes);
                return cMSSignedData2;
            }
        }
        aSN1Set = null;
        if (store3 != null) {
        }
        aSN1Set2 = null;
        cMSSignedData2.getHighSpeedVideoSizes = new org.bouncycastle.asn1.cms.SignedData(cMSSignedData.getHighSpeedVideoSizes.getDigestAlgorithms(), cMSSignedData.getHighSpeedVideoSizes.getEncapContentInfo(), aSN1Set, aSN1Set2, cMSSignedData.getHighSpeedVideoSizes.getSignerInfos());
        cMSSignedData2.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.cms.ContentInfo(cMSSignedData2.Camera2StreamConfigurationMap.getContentType(), cMSSignedData2.getHighSpeedVideoSizes);
        return cMSSignedData2;
    }

    private org.bouncycastle.asn1.cms.SignedData Camera2StreamConfigurationMap() throws org.bouncycastle.cms.CMSException {
        try {
            return org.bouncycastle.asn1.cms.SignedData.getInstance(this.Camera2StreamConfigurationMap.getContent());
        } catch (java.lang.ClassCastException e) {
            throw new org.bouncycastle.cms.CMSException("Malformed content.", e);
        } catch (java.lang.IllegalArgumentException e2) {
            throw new org.bouncycastle.cms.CMSException("Malformed content.", e2);
        }
    }

    public static org.bouncycastle.cms.CMSSignedData addDigestAlgorithm(org.bouncycastle.cms.CMSSignedData cMSSignedData, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
        java.util.Set<org.bouncycastle.asn1.x509.AlgorithmIdentifier> digestAlgorithmIDs = cMSSignedData.getDigestAlgorithmIDs();
        org.bouncycastle.cms.CMSSignedHelper cMSSignedHelper = org.bouncycastle.cms.CMSSignedHelper.getHighSpeedVideoSizes;
        org.bouncycastle.asn1.x509.AlgorithmIdentifier highSpeedVideoFpsRanges = org.bouncycastle.cms.CMSSignedHelper.getHighSpeedVideoFpsRanges(algorithmIdentifier, getInputFormats);
        if (digestAlgorithmIDs.contains(highSpeedVideoFpsRanges)) {
            return cMSSignedData;
        }
        org.bouncycastle.cms.CMSSignedData cMSSignedData2 = new org.bouncycastle.cms.CMSSignedData(cMSSignedData);
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator<org.bouncycastle.asn1.x509.AlgorithmIdentifier> it = digestAlgorithmIDs.iterator();
        while (it.hasNext()) {
            org.bouncycastle.cms.CMSSignedHelper cMSSignedHelper2 = org.bouncycastle.cms.CMSSignedHelper.getHighSpeedVideoSizes;
            hashSet.add(org.bouncycastle.cms.CMSSignedHelper.getHighSpeedVideoFpsRanges(it.next(), getInputFormats));
        }
        hashSet.add(highSpeedVideoFpsRanges);
        org.bouncycastle.asn1.ASN1Set highSpeedVideoFpsRangesFor = org.bouncycastle.cms.CMSUtils.getHighSpeedVideoFpsRangesFor(hashSet);
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = (org.bouncycastle.asn1.ASN1Sequence) cMSSignedData.getHighSpeedVideoSizes.toASN1Primitive();
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
        aSN1EncodableVector.add(aSN1Sequence.getObjectAt(0));
        aSN1EncodableVector.add(highSpeedVideoFpsRangesFor);
        for (int i = 2; i != aSN1Sequence.size(); i++) {
            aSN1EncodableVector.add(aSN1Sequence.getObjectAt(i));
        }
        cMSSignedData2.getHighSpeedVideoSizes = org.bouncycastle.asn1.cms.SignedData.getInstance(new org.bouncycastle.asn1.BERSequence(aSN1EncodableVector));
        cMSSignedData2.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.cms.ContentInfo(cMSSignedData2.Camera2StreamConfigurationMap.getContentType(), cMSSignedData2.getHighSpeedVideoSizes);
        return cMSSignedData2;
    }

    public CMSSignedData(byte[] bArr) throws org.bouncycastle.cms.CMSException {
        this(org.bouncycastle.cms.CMSUtils.getHighSpeedVideoFpsRangesFor(bArr));
    }

    private CMSSignedData(org.bouncycastle.cms.CMSSignedData cMSSignedData) {
        this.getHighSpeedVideoSizes = cMSSignedData.getHighSpeedVideoSizes;
        this.Camera2StreamConfigurationMap = cMSSignedData.Camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRanges = cMSSignedData.getHighSpeedVideoFpsRanges;
        this.getHighResolutionOutputSizeshNQ4ISI = cMSSignedData.getHighResolutionOutputSizeshNQ4ISI;
    }

    public CMSSignedData(org.bouncycastle.cms.CMSProcessable cMSProcessable, byte[] bArr) throws org.bouncycastle.cms.CMSException {
        this(cMSProcessable, org.bouncycastle.cms.CMSUtils.getHighSpeedVideoFpsRangesFor(bArr));
    }

    public CMSSignedData(final org.bouncycastle.cms.CMSProcessable cMSProcessable, org.bouncycastle.asn1.cms.ContentInfo contentInfo) throws org.bouncycastle.cms.CMSException {
        if (cMSProcessable instanceof org.bouncycastle.cms.CMSTypedData) {
            this.getHighSpeedVideoFpsRanges = (org.bouncycastle.cms.CMSTypedData) cMSProcessable;
        } else {
            this.getHighSpeedVideoFpsRanges = new org.bouncycastle.cms.CMSTypedData() { // from class: org.bouncycastle.cms.CMSSignedData.1
                @Override // org.bouncycastle.cms.CMSProcessable
                public void write(java.io.OutputStream outputStream) throws java.io.IOException, org.bouncycastle.cms.CMSException {
                    cMSProcessable.write(outputStream);
                }

                @Override // org.bouncycastle.cms.CMSTypedData
                public org.bouncycastle.asn1.ASN1ObjectIdentifier getContentType() {
                    return org.bouncycastle.cms.CMSSignedData.this.getHighSpeedVideoSizes.getEncapContentInfo().getContentType();
                }

                @Override // org.bouncycastle.cms.CMSProcessable
                public java.lang.Object getContent() {
                    return cMSProcessable.getContent();
                }
            };
        }
        this.Camera2StreamConfigurationMap = contentInfo;
        this.getHighSpeedVideoSizes = Camera2StreamConfigurationMap();
    }

    public CMSSignedData(org.bouncycastle.cms.CMSProcessable cMSProcessable, java.io.InputStream inputStream) throws org.bouncycastle.cms.CMSException {
        this(cMSProcessable, org.bouncycastle.cms.CMSUtils.getHighSpeedVideoFpsRangesFor(new org.bouncycastle.asn1.ASN1InputStream(inputStream)));
    }

    public CMSSignedData(org.bouncycastle.asn1.cms.ContentInfo contentInfo) throws org.bouncycastle.cms.CMSException {
        this.Camera2StreamConfigurationMap = contentInfo;
        org.bouncycastle.asn1.cms.SignedData Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
        this.getHighSpeedVideoSizes = Camera2StreamConfigurationMap;
        org.bouncycastle.asn1.ASN1Encodable content = Camera2StreamConfigurationMap.getEncapContentInfo().getContent();
        if (content == null) {
            this.getHighSpeedVideoFpsRanges = null;
        } else if (content instanceof org.bouncycastle.asn1.ASN1OctetString) {
            this.getHighSpeedVideoFpsRanges = new org.bouncycastle.cms.CMSProcessableByteArray(this.getHighSpeedVideoSizes.getEncapContentInfo().getContentType(), ((org.bouncycastle.asn1.ASN1OctetString) content).getOctets());
        } else {
            this.getHighSpeedVideoFpsRanges = new org.bouncycastle.cms.PKCS7ProcessableObject(this.getHighSpeedVideoSizes.getEncapContentInfo().getContentType(), content);
        }
    }

    public CMSSignedData(java.util.Map map, byte[] bArr) throws org.bouncycastle.cms.CMSException {
        this(map, org.bouncycastle.cms.CMSUtils.getHighSpeedVideoFpsRangesFor(bArr));
    }

    public CMSSignedData(java.util.Map map, org.bouncycastle.asn1.cms.ContentInfo contentInfo) throws org.bouncycastle.cms.CMSException {
        this.getOutputMinFrameDuration = map;
        this.Camera2StreamConfigurationMap = contentInfo;
        this.getHighSpeedVideoSizes = Camera2StreamConfigurationMap();
    }

    public CMSSignedData(java.io.InputStream inputStream) throws org.bouncycastle.cms.CMSException {
        this(org.bouncycastle.cms.CMSUtils.getHighSpeedVideoFpsRangesFor(inputStream));
    }
}
