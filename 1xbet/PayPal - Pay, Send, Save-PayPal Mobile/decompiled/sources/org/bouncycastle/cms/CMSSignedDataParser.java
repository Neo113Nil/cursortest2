package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public class CMSSignedDataParser extends org.bouncycastle.cms.CMSContentInfoParser {
    private boolean Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.ASN1Set getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.ASN1Set getHighSpeedVideoSizes;
    private java.util.Set<org.bouncycastle.asn1.x509.AlgorithmIdentifier> getHighSpeedVideoSizesFor;
    private org.bouncycastle.asn1.cms.SignedDataParser getInputFormats;
    private org.bouncycastle.cms.SignerInformationStore getInputSizeshNQ4ISI;
    private org.bouncycastle.asn1.ASN1ObjectIdentifier getOutputFormats;
    private org.bouncycastle.cms.CMSTypedStream getOutputMinFrameDuration;
    private java.util.Map getOutputStallDuration;
    private static final org.bouncycastle.cms.CMSSignedHelper getHighSpeedVideoFpsRangesFor = org.bouncycastle.cms.CMSSignedHelper.getHighSpeedVideoSizes;
    private static final org.bouncycastle.operator.DefaultDigestAlgorithmIdentifierFinder getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.operator.DefaultDigestAlgorithmIdentifierFinder();

    private static void Camera2StreamConfigurationMap(org.bouncycastle.asn1.cms.ContentInfoParser contentInfoParser, java.io.OutputStream outputStream) throws java.io.IOException {
        org.bouncycastle.asn1.ASN1OctetStringParser aSN1OctetStringParser = (org.bouncycastle.asn1.ASN1OctetStringParser) contentInfoParser.getContent(4);
        if (aSN1OctetStringParser != null) {
            java.io.OutputStream highResolutionOutputSizeshNQ4ISI = org.bouncycastle.cms.CMSUtils.getHighResolutionOutputSizeshNQ4ISI(outputStream, true, 0);
            org.bouncycastle.util.io.Streams.pipeAll(aSN1OctetStringParser.getOctetStream(), highResolutionOutputSizeshNQ4ISI);
            highResolutionOutputSizeshNQ4ISI.close();
        }
    }

    private void getHighSpeedVideoFpsRangesFor() throws org.bouncycastle.cms.CMSException {
        if (this.Camera2StreamConfigurationMap) {
            return;
        }
        this.Camera2StreamConfigurationMap = true;
        try {
            org.bouncycastle.asn1.ASN1SetParser certificates = this.getInputFormats.getCertificates();
            org.bouncycastle.asn1.ASN1Set aSN1Set = null;
            this.getHighSpeedVideoSizes = certificates == null ? null : org.bouncycastle.asn1.ASN1Set.getInstance(certificates.toASN1Primitive());
            org.bouncycastle.asn1.ASN1SetParser crls = this.getInputFormats.getCrls();
            if (crls != null) {
                aSN1Set = org.bouncycastle.asn1.ASN1Set.getInstance(crls.toASN1Primitive());
            }
            this.getHighSpeedVideoFpsRanges = aSN1Set;
        } catch (java.io.IOException e) {
            throw new org.bouncycastle.cms.CMSException("problem parsing cert/crl sets", e);
        }
    }

    public static java.io.OutputStream replaceCertificatesAndCRLs(java.io.InputStream inputStream, org.bouncycastle.util.Store store, org.bouncycastle.util.Store store2, org.bouncycastle.util.Store store3, java.io.OutputStream outputStream) throws org.bouncycastle.cms.CMSException, java.io.IOException {
        org.bouncycastle.asn1.cms.SignedDataParser signedDataParser = org.bouncycastle.asn1.cms.SignedDataParser.getInstance(new org.bouncycastle.asn1.cms.ContentInfoParser((org.bouncycastle.asn1.ASN1SequenceParser) new org.bouncycastle.asn1.ASN1StreamParser(inputStream).readObject()).getContent(16));
        org.bouncycastle.asn1.BERSequenceGenerator bERSequenceGenerator = new org.bouncycastle.asn1.BERSequenceGenerator(outputStream);
        bERSequenceGenerator.addObject((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.cms.CMSObjectIdentifiers.signedData);
        org.bouncycastle.asn1.BERSequenceGenerator bERSequenceGenerator2 = new org.bouncycastle.asn1.BERSequenceGenerator(bERSequenceGenerator.getRawOutputStream(), 0, true);
        bERSequenceGenerator2.addObject((org.bouncycastle.asn1.ASN1Primitive) signedDataParser.getVersion());
        bERSequenceGenerator2.getRawOutputStream().write(signedDataParser.getDigestAlgorithms().toASN1Primitive().getEncoded());
        org.bouncycastle.asn1.cms.ContentInfoParser encapContentInfo = signedDataParser.getEncapContentInfo();
        org.bouncycastle.asn1.BERSequenceGenerator bERSequenceGenerator3 = new org.bouncycastle.asn1.BERSequenceGenerator(bERSequenceGenerator2.getRawOutputStream());
        bERSequenceGenerator3.addObject((org.bouncycastle.asn1.ASN1Primitive) encapContentInfo.getContentType());
        Camera2StreamConfigurationMap(encapContentInfo, bERSequenceGenerator3.getRawOutputStream());
        bERSequenceGenerator3.close();
        org.bouncycastle.asn1.ASN1SetParser certificates = signedDataParser.getCertificates();
        if (certificates != null) {
            org.bouncycastle.asn1.ASN1Set.getInstance(certificates.toASN1Primitive());
        }
        org.bouncycastle.asn1.ASN1SetParser crls = signedDataParser.getCrls();
        if (crls != null) {
            org.bouncycastle.asn1.ASN1Set.getInstance(crls.toASN1Primitive());
        }
        if (store != null || store3 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (store != null) {
                arrayList.addAll(org.bouncycastle.cms.CMSUtils.getHighSpeedVideoFpsRanges(store));
            }
            if (store3 != null) {
                arrayList.addAll(org.bouncycastle.cms.CMSUtils.Camera2StreamConfigurationMap(store3));
            }
            org.bouncycastle.asn1.ASN1Set highSpeedVideoSizes = org.bouncycastle.cms.CMSUtils.getHighSpeedVideoSizes(arrayList);
            if (highSpeedVideoSizes.size() > 0) {
                bERSequenceGenerator2.getRawOutputStream().write(new org.bouncycastle.asn1.DERTaggedObject(false, 0, (org.bouncycastle.asn1.ASN1Encodable) highSpeedVideoSizes).getEncoded());
            }
        }
        if (store2 != null) {
            org.bouncycastle.asn1.ASN1Set highSpeedVideoSizes2 = org.bouncycastle.cms.CMSUtils.getHighSpeedVideoSizes(org.bouncycastle.cms.CMSUtils.getHighSpeedVideoSizes(store2));
            if (highSpeedVideoSizes2.size() > 0) {
                bERSequenceGenerator2.getRawOutputStream().write(new org.bouncycastle.asn1.DERTaggedObject(false, 1, (org.bouncycastle.asn1.ASN1Encodable) highSpeedVideoSizes2).getEncoded());
            }
        }
        bERSequenceGenerator2.getRawOutputStream().write(signedDataParser.getSignerInfos().toASN1Primitive().getEncoded());
        bERSequenceGenerator2.close();
        bERSequenceGenerator.close();
        return outputStream;
    }

    private static void Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1Generator aSN1Generator, org.bouncycastle.asn1.ASN1SetParser aSN1SetParser, int i) throws java.io.IOException {
        org.bouncycastle.asn1.ASN1Set aSN1Set = aSN1SetParser == null ? null : org.bouncycastle.asn1.ASN1Set.getInstance(aSN1SetParser.toASN1Primitive());
        if (aSN1Set != null) {
            boolean z = aSN1SetParser instanceof org.bouncycastle.asn1.BERSetParser;
            java.io.OutputStream rawOutputStream = aSN1Generator.getRawOutputStream();
            if (z) {
                rawOutputStream.write(new org.bouncycastle.asn1.BERTaggedObject(false, i, (org.bouncycastle.asn1.ASN1Encodable) aSN1Set).getEncoded());
            } else {
                rawOutputStream.write(new org.bouncycastle.asn1.DERTaggedObject(false, i, (org.bouncycastle.asn1.ASN1Encodable) aSN1Set).getEncoded());
            }
        }
    }

    public int getVersion() {
        return this.getInputFormats.getVersion().intValueExact();
    }

    public org.bouncycastle.cms.SignerInformationStore getSignerInfos() throws org.bouncycastle.cms.CMSException {
        if (this.getInputSizeshNQ4ISI == null) {
            getHighSpeedVideoFpsRangesFor();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.HashMap hashMap = new java.util.HashMap();
            for (java.lang.Object obj : this.getOutputStallDuration.keySet()) {
                hashMap.put(obj, ((org.bouncycastle.operator.DigestCalculator) this.getOutputStallDuration.get(obj)).getDigest());
            }
            try {
                org.bouncycastle.asn1.ASN1SetParser signerInfos = this.getInputFormats.getSignerInfos();
                while (true) {
                    org.bouncycastle.asn1.ASN1Encodable readObject = signerInfos.readObject();
                    if (readObject == null) {
                        break;
                    }
                    org.bouncycastle.asn1.cms.SignerInfo signerInfo = org.bouncycastle.asn1.cms.SignerInfo.getInstance(readObject.toASN1Primitive());
                    arrayList.add(new org.bouncycastle.cms.SignerInformation(signerInfo, this.getOutputFormats, null, (byte[]) hashMap.get(signerInfo.getDigestAlgorithm().getAlgorithm())));
                }
                this.getInputSizeshNQ4ISI = new org.bouncycastle.cms.SignerInformationStore(arrayList);
            } catch (java.io.IOException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("io exception: ");
                sb.append(e.getMessage());
                throw new org.bouncycastle.cms.CMSException(sb.toString(), e);
            }
        }
        return this.getInputSizeshNQ4ISI;
    }

    public java.lang.String getSignedContentTypeOID() {
        return this.getOutputFormats.getId();
    }

    public org.bouncycastle.cms.CMSTypedStream getSignedContent() {
        if (this.getOutputMinFrameDuration == null) {
            return null;
        }
        return new org.bouncycastle.cms.CMSTypedStream(this.getOutputMinFrameDuration.getContentType(), org.bouncycastle.cms.CMSUtils.getHighResolutionOutputSizeshNQ4ISI(this.getOutputStallDuration.values(), this.getOutputMinFrameDuration.getContentStream()));
    }

    public org.bouncycastle.util.Store getOtherRevocationInfo(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) throws org.bouncycastle.cms.CMSException {
        getHighSpeedVideoFpsRangesFor();
        return org.bouncycastle.cms.CMSSignedHelper.getHighSpeedVideoFpsRangesFor(aSN1ObjectIdentifier, this.getHighSpeedVideoFpsRanges);
    }

    public java.util.Set<org.bouncycastle.asn1.x509.AlgorithmIdentifier> getDigestAlgorithmIDs() {
        return this.getHighSpeedVideoSizesFor;
    }

    public org.bouncycastle.util.Store getCertificates() throws org.bouncycastle.cms.CMSException {
        getHighSpeedVideoFpsRangesFor();
        return org.bouncycastle.cms.CMSSignedHelper.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes);
    }

    public org.bouncycastle.util.Store getCRLs() throws org.bouncycastle.cms.CMSException {
        getHighSpeedVideoFpsRangesFor();
        return org.bouncycastle.cms.CMSSignedHelper.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges);
    }

    public org.bouncycastle.util.Store getAttributeCertificates() throws org.bouncycastle.cms.CMSException {
        getHighSpeedVideoFpsRangesFor();
        return org.bouncycastle.cms.CMSSignedHelper.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes);
    }

    public static java.io.OutputStream replaceSigners(java.io.InputStream inputStream, org.bouncycastle.cms.SignerInformationStore signerInformationStore, java.io.OutputStream outputStream) throws org.bouncycastle.cms.CMSException, java.io.IOException {
        org.bouncycastle.asn1.cms.SignedDataParser signedDataParser = org.bouncycastle.asn1.cms.SignedDataParser.getInstance(new org.bouncycastle.asn1.cms.ContentInfoParser((org.bouncycastle.asn1.ASN1SequenceParser) new org.bouncycastle.asn1.ASN1StreamParser(inputStream).readObject()).getContent(16));
        org.bouncycastle.asn1.BERSequenceGenerator bERSequenceGenerator = new org.bouncycastle.asn1.BERSequenceGenerator(outputStream);
        bERSequenceGenerator.addObject((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.cms.CMSObjectIdentifiers.signedData);
        org.bouncycastle.asn1.BERSequenceGenerator bERSequenceGenerator2 = new org.bouncycastle.asn1.BERSequenceGenerator(bERSequenceGenerator.getRawOutputStream(), 0, true);
        bERSequenceGenerator2.addObject((org.bouncycastle.asn1.ASN1Primitive) signedDataParser.getVersion());
        signedDataParser.getDigestAlgorithms().toASN1Primitive();
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
        for (org.bouncycastle.cms.SignerInformation signerInformation : signerInformationStore.getSigners()) {
            org.bouncycastle.cms.CMSSignedHelper cMSSignedHelper = org.bouncycastle.cms.CMSSignedHelper.getHighSpeedVideoSizes;
            aSN1EncodableVector.add(org.bouncycastle.cms.CMSSignedHelper.getHighSpeedVideoFpsRanges(signerInformation.getDigestAlgorithmID(), getHighResolutionOutputSizeshNQ4ISI));
        }
        bERSequenceGenerator2.getRawOutputStream().write(new org.bouncycastle.asn1.DERSet(aSN1EncodableVector).getEncoded());
        org.bouncycastle.asn1.cms.ContentInfoParser encapContentInfo = signedDataParser.getEncapContentInfo();
        org.bouncycastle.asn1.BERSequenceGenerator bERSequenceGenerator3 = new org.bouncycastle.asn1.BERSequenceGenerator(bERSequenceGenerator2.getRawOutputStream());
        bERSequenceGenerator3.addObject((org.bouncycastle.asn1.ASN1Primitive) encapContentInfo.getContentType());
        Camera2StreamConfigurationMap(encapContentInfo, bERSequenceGenerator3.getRawOutputStream());
        bERSequenceGenerator3.close();
        Camera2StreamConfigurationMap(bERSequenceGenerator2, signedDataParser.getCertificates(), 0);
        Camera2StreamConfigurationMap(bERSequenceGenerator2, signedDataParser.getCrls(), 1);
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector2 = new org.bouncycastle.asn1.ASN1EncodableVector();
        java.util.Iterator<org.bouncycastle.cms.SignerInformation> it = signerInformationStore.getSigners().iterator();
        while (it.hasNext()) {
            aSN1EncodableVector2.add(it.next().toASN1Structure());
        }
        bERSequenceGenerator2.getRawOutputStream().write(new org.bouncycastle.asn1.DERSet(aSN1EncodableVector2).getEncoded());
        bERSequenceGenerator2.close();
        bERSequenceGenerator.close();
        return outputStream;
    }

    public CMSSignedDataParser(org.bouncycastle.operator.DigestCalculatorProvider digestCalculatorProvider, byte[] bArr) throws org.bouncycastle.cms.CMSException {
        this(digestCalculatorProvider, new java.io.ByteArrayInputStream(bArr));
    }

    public CMSSignedDataParser(org.bouncycastle.operator.DigestCalculatorProvider digestCalculatorProvider, org.bouncycastle.cms.CMSTypedStream cMSTypedStream, byte[] bArr) throws org.bouncycastle.cms.CMSException {
        this(digestCalculatorProvider, cMSTypedStream, new java.io.ByteArrayInputStream(bArr));
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
    
        if (r4.getOutputMinFrameDuration == null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CMSSignedDataParser(org.bouncycastle.operator.DigestCalculatorProvider digestCalculatorProvider, org.bouncycastle.cms.CMSTypedStream cMSTypedStream, java.io.InputStream inputStream) throws org.bouncycastle.cms.CMSException {
        super(inputStream);
        org.bouncycastle.cms.CMSTypedStream pKCS7TypedStream;
        try {
            this.getOutputMinFrameDuration = cMSTypedStream;
            this.getInputFormats = org.bouncycastle.asn1.cms.SignedDataParser.getInstance(this._contentInfo.getContent(16));
            this.getOutputStallDuration = new java.util.HashMap();
            org.bouncycastle.asn1.ASN1SetParser digestAlgorithms = this.getInputFormats.getDigestAlgorithms();
            java.util.HashSet hashSet = new java.util.HashSet();
            while (true) {
                org.bouncycastle.asn1.ASN1Encodable readObject = digestAlgorithms.readObject();
                if (readObject == null) {
                    break;
                }
                org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(readObject);
                hashSet.add(algorithmIdentifier);
                try {
                    org.bouncycastle.operator.DigestCalculator digestCalculator = digestCalculatorProvider.get(algorithmIdentifier);
                    if (digestCalculator != null) {
                        this.getOutputStallDuration.put(algorithmIdentifier.getAlgorithm(), digestCalculator);
                    }
                } catch (org.bouncycastle.operator.OperatorCreationException unused) {
                }
            }
            this.getHighSpeedVideoSizesFor = java.util.Collections.unmodifiableSet(hashSet);
            org.bouncycastle.asn1.cms.ContentInfoParser encapContentInfo = this.getInputFormats.getEncapContentInfo();
            org.bouncycastle.asn1.ASN1Encodable content = encapContentInfo.getContent(4);
            if (content instanceof org.bouncycastle.asn1.ASN1OctetStringParser) {
                pKCS7TypedStream = new org.bouncycastle.cms.CMSTypedStream(encapContentInfo.getContentType(), ((org.bouncycastle.asn1.ASN1OctetStringParser) content).getOctetStream());
                if (this.getOutputMinFrameDuration == null) {
                    this.getOutputMinFrameDuration = pKCS7TypedStream;
                }
                pKCS7TypedStream.drain();
            } else if (content != null) {
                pKCS7TypedStream = new org.bouncycastle.cms.PKCS7TypedStream(encapContentInfo.getContentType(), content);
            }
            this.getOutputFormats = cMSTypedStream == null ? encapContentInfo.getContentType() : this.getOutputMinFrameDuration.getContentType();
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("io exception: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cms.CMSException(sb.toString(), e);
        }
    }

    public CMSSignedDataParser(org.bouncycastle.operator.DigestCalculatorProvider digestCalculatorProvider, java.io.InputStream inputStream) throws org.bouncycastle.cms.CMSException {
        this(digestCalculatorProvider, (org.bouncycastle.cms.CMSTypedStream) null, inputStream);
    }
}
