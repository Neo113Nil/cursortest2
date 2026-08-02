package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public class CMSSignedDataGenerator extends org.bouncycastle.cms.CMSSignedGenerator {
    private java.util.List getHighSpeedVideoFpsRangesFor;

    public org.bouncycastle.cms.SignerInformationStore generateCounterSigners(org.bouncycastle.cms.SignerInformation signerInformation) throws org.bouncycastle.cms.CMSException {
        return generate(new org.bouncycastle.cms.CMSProcessableByteArray(null, signerInformation.getSignature()), false).getSignerInfos();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public org.bouncycastle.cms.CMSSignedData generate(org.bouncycastle.cms.CMSTypedData cMSTypedData, boolean z) throws org.bouncycastle.cms.CMSException {
        org.bouncycastle.asn1.BEROctetString bEROctetString;
        if (!this.getHighSpeedVideoFpsRangesFor.isEmpty()) {
            throw new java.lang.IllegalStateException("this method can only be used with SignerInfoGenerator");
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
        this.digests.clear();
        for (org.bouncycastle.cms.SignerInformation signerInformation : this._signers) {
            org.bouncycastle.cms.CMSUtils.getHighSpeedVideoFpsRangesFor(linkedHashSet, signerInformation, this.digestAlgIdFinder);
            aSN1EncodableVector.add(signerInformation.toASN1Structure());
        }
        org.bouncycastle.asn1.ASN1ObjectIdentifier contentType = cMSTypedData.getContentType();
        if (cMSTypedData.getContent() != null) {
            java.io.ByteArrayOutputStream byteArrayOutputStream = z ? new java.io.ByteArrayOutputStream() : null;
            java.io.OutputStream Camera2StreamConfigurationMap = org.bouncycastle.cms.CMSUtils.Camera2StreamConfigurationMap(org.bouncycastle.cms.CMSUtils.Camera2StreamConfigurationMap(this.signerGens, byteArrayOutputStream));
            try {
                cMSTypedData.write(Camera2StreamConfigurationMap);
                Camera2StreamConfigurationMap.close();
                if (z) {
                    bEROctetString = new org.bouncycastle.asn1.BEROctetString(byteArrayOutputStream.toByteArray());
                    for (org.bouncycastle.cms.SignerInfoGenerator signerInfoGenerator : this.signerGens) {
                        org.bouncycastle.asn1.cms.SignerInfo generate = signerInfoGenerator.generate(contentType);
                        linkedHashSet.add(generate.getDigestAlgorithm());
                        aSN1EncodableVector.add(generate);
                        byte[] calculatedDigest = signerInfoGenerator.getCalculatedDigest();
                        if (calculatedDigest != null) {
                            this.digests.put(generate.getDigestAlgorithm().getAlgorithm().getId(), calculatedDigest);
                        }
                    }
                    return new org.bouncycastle.cms.CMSSignedData(cMSTypedData, new org.bouncycastle.asn1.cms.ContentInfo(org.bouncycastle.asn1.cms.CMSObjectIdentifiers.signedData, new org.bouncycastle.asn1.cms.SignedData(org.bouncycastle.cms.CMSUtils.getHighSpeedVideoFpsRangesFor(linkedHashSet), new org.bouncycastle.asn1.cms.ContentInfo(contentType, bEROctetString), this.certs.size() == 0 ? org.bouncycastle.cms.CMSUtils.getHighSpeedVideoSizes(this.certs) : null, this.crls.size() != 0 ? org.bouncycastle.cms.CMSUtils.getHighSpeedVideoSizes(this.crls) : null, new org.bouncycastle.asn1.DERSet(aSN1EncodableVector))));
                }
            } catch (java.io.IOException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("data processing exception: ");
                sb.append(e.getMessage());
                throw new org.bouncycastle.cms.CMSException(sb.toString(), e);
            }
        }
        bEROctetString = null;
        while (r3.hasNext()) {
        }
        if (this.certs.size() == 0) {
        }
        if (this.crls.size() != 0) {
        }
        return new org.bouncycastle.cms.CMSSignedData(cMSTypedData, new org.bouncycastle.asn1.cms.ContentInfo(org.bouncycastle.asn1.cms.CMSObjectIdentifiers.signedData, new org.bouncycastle.asn1.cms.SignedData(org.bouncycastle.cms.CMSUtils.getHighSpeedVideoFpsRangesFor(linkedHashSet), new org.bouncycastle.asn1.cms.ContentInfo(contentType, bEROctetString), this.certs.size() == 0 ? org.bouncycastle.cms.CMSUtils.getHighSpeedVideoSizes(this.certs) : null, this.crls.size() != 0 ? org.bouncycastle.cms.CMSUtils.getHighSpeedVideoSizes(this.crls) : null, new org.bouncycastle.asn1.DERSet(aSN1EncodableVector))));
    }

    public org.bouncycastle.cms.CMSSignedData generate(org.bouncycastle.cms.CMSTypedData cMSTypedData) throws org.bouncycastle.cms.CMSException {
        return generate(cMSTypedData, false);
    }

    public CMSSignedDataGenerator(org.bouncycastle.operator.DigestAlgorithmIdentifierFinder digestAlgorithmIdentifierFinder) {
        super(digestAlgorithmIdentifierFinder);
        this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();
    }

    public CMSSignedDataGenerator() {
        this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();
    }
}
