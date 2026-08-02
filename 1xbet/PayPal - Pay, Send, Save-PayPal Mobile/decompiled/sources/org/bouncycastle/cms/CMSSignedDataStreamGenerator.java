package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public class CMSSignedDataStreamGenerator extends org.bouncycastle.cms.CMSSignedGenerator {
    private int getHighSpeedVideoSizes;

    public java.io.OutputStream open(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, java.io.OutputStream outputStream, boolean z, java.io.OutputStream outputStream2) throws java.io.IOException {
        boolean z2;
        boolean z3;
        boolean z4;
        org.bouncycastle.asn1.ASN1Integer aSN1Integer;
        org.bouncycastle.asn1.BERSequenceGenerator bERSequenceGenerator = new org.bouncycastle.asn1.BERSequenceGenerator(outputStream);
        bERSequenceGenerator.addObject((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.cms.CMSObjectIdentifiers.signedData);
        boolean z5 = false;
        org.bouncycastle.asn1.BERSequenceGenerator bERSequenceGenerator2 = new org.bouncycastle.asn1.BERSequenceGenerator(bERSequenceGenerator.getRawOutputStream(), 0, true);
        if (this.certs != null) {
            z2 = false;
            z3 = false;
            z4 = false;
            for (java.lang.Object obj : this.certs) {
                if (obj instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
                    org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = (org.bouncycastle.asn1.ASN1TaggedObject) obj;
                    if (aSN1TaggedObject.getTagNo() == 1) {
                        z3 = true;
                    } else if (aSN1TaggedObject.getTagNo() == 2) {
                        z4 = true;
                    } else if (aSN1TaggedObject.getTagNo() == 3) {
                        z2 = true;
                    }
                }
            }
        } else {
            z2 = false;
            z3 = false;
            z4 = false;
        }
        if (z2) {
            aSN1Integer = new org.bouncycastle.asn1.ASN1Integer(5L);
        } else {
            if (this.crls != null) {
                java.util.Iterator it = this.crls.iterator();
                while (it.hasNext()) {
                    if (it.next() instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
                        z5 = true;
                    }
                }
                if (z5) {
                    aSN1Integer = new org.bouncycastle.asn1.ASN1Integer(5L);
                }
            }
            if (z4) {
                aSN1Integer = new org.bouncycastle.asn1.ASN1Integer(4L);
            } else if (z3) {
                aSN1Integer = new org.bouncycastle.asn1.ASN1Integer(3L);
            } else {
                java.util.List list = this._signers;
                java.util.List list2 = this.signerGens;
                java.util.Iterator it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (org.bouncycastle.asn1.cms.SignerInfo.getInstance(((org.bouncycastle.cms.SignerInformation) it2.next()).toASN1Structure()).getVersion().intValueExact() == 3) {
                            break;
                        }
                    } else {
                        java.util.Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            if (((org.bouncycastle.cms.SignerInfoGenerator) it3.next()).getGeneratedVersion() == 3) {
                            }
                        }
                        aSN1Integer = !org.bouncycastle.asn1.cms.CMSObjectIdentifiers.data.equals((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifier) ? new org.bouncycastle.asn1.ASN1Integer(3L) : new org.bouncycastle.asn1.ASN1Integer(1L);
                    }
                }
                aSN1Integer = new org.bouncycastle.asn1.ASN1Integer(3L);
            }
        }
        bERSequenceGenerator2.addObject((org.bouncycastle.asn1.ASN1Primitive) aSN1Integer);
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it4 = this._signers.iterator();
        while (it4.hasNext()) {
            org.bouncycastle.cms.CMSUtils.getHighSpeedVideoFpsRangesFor(hashSet, (org.bouncycastle.cms.SignerInformation) it4.next(), this.digestAlgIdFinder);
        }
        java.util.Iterator it5 = this.signerGens.iterator();
        while (it5.hasNext()) {
            hashSet.add(((org.bouncycastle.cms.SignerInfoGenerator) it5.next()).getDigestAlgorithm());
        }
        bERSequenceGenerator2.getRawOutputStream().write(org.bouncycastle.cms.CMSUtils.getHighSpeedVideoFpsRangesFor(hashSet).getEncoded());
        org.bouncycastle.asn1.BERSequenceGenerator bERSequenceGenerator3 = new org.bouncycastle.asn1.BERSequenceGenerator(bERSequenceGenerator2.getRawOutputStream());
        bERSequenceGenerator3.addObject((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifier);
        return new org.bouncycastle.cms.CMSSignedDataStreamGenerator.CmsSignedDataOutputStream(org.bouncycastle.cms.CMSUtils.Camera2StreamConfigurationMap(this.signerGens, org.bouncycastle.cms.CMSUtils.getHighResolutionOutputSizeshNQ4ISI(outputStream2, z ? org.bouncycastle.cms.CMSUtils.getHighResolutionOutputSizeshNQ4ISI(bERSequenceGenerator3.getRawOutputStream(), true, this.getHighSpeedVideoSizes) : null)), aSN1ObjectIdentifier, bERSequenceGenerator, bERSequenceGenerator2, bERSequenceGenerator3);
    }

    public void setBufferSize(int i) {
        this.getHighSpeedVideoSizes = i;
    }

    public java.io.OutputStream open(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, java.io.OutputStream outputStream, boolean z) throws java.io.IOException {
        return open(aSN1ObjectIdentifier, outputStream, z, null);
    }

    class CmsSignedDataOutputStream extends java.io.OutputStream {
        private org.bouncycastle.asn1.BERSequenceGenerator Camera2StreamConfigurationMap;
        private org.bouncycastle.asn1.BERSequenceGenerator getHighSpeedVideoFpsRanges;
        private org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoFpsRangesFor;
        private java.io.OutputStream getHighSpeedVideoSizes;
        private org.bouncycastle.asn1.BERSequenceGenerator getOutputFormats;

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws java.io.IOException {
            this.getHighSpeedVideoSizes.write(bArr, i, i2);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws java.io.IOException {
            this.getHighSpeedVideoSizes.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(int i) throws java.io.IOException {
            this.getHighSpeedVideoSizes.write(i);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
            this.getHighSpeedVideoSizes.close();
            this.getHighSpeedVideoFpsRanges.close();
            org.bouncycastle.cms.CMSSignedDataStreamGenerator.this.digests.clear();
            if (org.bouncycastle.cms.CMSSignedDataStreamGenerator.this.certs.size() != 0) {
                this.getOutputFormats.getRawOutputStream().write(new org.bouncycastle.asn1.BERTaggedObject(false, 0, (org.bouncycastle.asn1.ASN1Encodable) org.bouncycastle.cms.CMSUtils.getHighSpeedVideoSizes(org.bouncycastle.cms.CMSSignedDataStreamGenerator.this.certs)).getEncoded());
            }
            if (org.bouncycastle.cms.CMSSignedDataStreamGenerator.this.crls.size() != 0) {
                this.getOutputFormats.getRawOutputStream().write(new org.bouncycastle.asn1.BERTaggedObject(false, 1, (org.bouncycastle.asn1.ASN1Encodable) org.bouncycastle.cms.CMSUtils.getHighSpeedVideoSizes(org.bouncycastle.cms.CMSSignedDataStreamGenerator.this.crls)).getEncoded());
            }
            org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
            for (org.bouncycastle.cms.SignerInfoGenerator signerInfoGenerator : org.bouncycastle.cms.CMSSignedDataStreamGenerator.this.signerGens) {
                try {
                    aSN1EncodableVector.add(signerInfoGenerator.generate(this.getHighSpeedVideoFpsRangesFor));
                    org.bouncycastle.cms.CMSSignedDataStreamGenerator.this.digests.put(signerInfoGenerator.getDigestAlgorithm().getAlgorithm().getId(), signerInfoGenerator.getCalculatedDigest());
                } catch (org.bouncycastle.cms.CMSException e) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("exception generating signers: ");
                    sb.append(e.getMessage());
                    throw new org.bouncycastle.cms.CMSStreamException(sb.toString(), e);
                }
            }
            java.util.Iterator it = org.bouncycastle.cms.CMSSignedDataStreamGenerator.this._signers.iterator();
            while (it.hasNext()) {
                aSN1EncodableVector.add(((org.bouncycastle.cms.SignerInformation) it.next()).toASN1Structure());
            }
            this.getOutputFormats.getRawOutputStream().write(new org.bouncycastle.asn1.DERSet(aSN1EncodableVector).getEncoded());
            this.getOutputFormats.close();
            this.Camera2StreamConfigurationMap.close();
        }

        public CmsSignedDataOutputStream(java.io.OutputStream outputStream, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.BERSequenceGenerator bERSequenceGenerator, org.bouncycastle.asn1.BERSequenceGenerator bERSequenceGenerator2, org.bouncycastle.asn1.BERSequenceGenerator bERSequenceGenerator3) {
            this.getHighSpeedVideoSizes = outputStream;
            this.getHighSpeedVideoFpsRangesFor = aSN1ObjectIdentifier;
            this.Camera2StreamConfigurationMap = bERSequenceGenerator;
            this.getOutputFormats = bERSequenceGenerator2;
            this.getHighSpeedVideoFpsRanges = bERSequenceGenerator3;
        }
    }

    public java.io.OutputStream open(java.io.OutputStream outputStream, boolean z, java.io.OutputStream outputStream2) throws java.io.IOException {
        return open(org.bouncycastle.asn1.cms.CMSObjectIdentifiers.data, outputStream, z, outputStream2);
    }

    public java.io.OutputStream open(java.io.OutputStream outputStream, boolean z) throws java.io.IOException {
        return open(org.bouncycastle.asn1.cms.CMSObjectIdentifiers.data, outputStream, z);
    }

    public java.io.OutputStream open(java.io.OutputStream outputStream) throws java.io.IOException {
        return open(outputStream, false);
    }

    public java.util.List<org.bouncycastle.asn1.x509.AlgorithmIdentifier> getDigestAlgorithms() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (org.bouncycastle.cms.SignerInformation signerInformation : this._signers) {
            org.bouncycastle.cms.CMSSignedHelper cMSSignedHelper = org.bouncycastle.cms.CMSSignedHelper.getHighSpeedVideoSizes;
            arrayList.add(org.bouncycastle.cms.CMSSignedHelper.getHighSpeedVideoFpsRanges(signerInformation.getDigestAlgorithmID(), this.digestAlgIdFinder));
        }
        java.util.Iterator it = this.signerGens.iterator();
        while (it.hasNext()) {
            arrayList.add(((org.bouncycastle.cms.SignerInfoGenerator) it.next()).getDigestAlgorithm());
        }
        return arrayList;
    }

    public CMSSignedDataStreamGenerator(org.bouncycastle.operator.DigestAlgorithmIdentifierFinder digestAlgorithmIdentifierFinder) {
        super(digestAlgorithmIdentifierFinder);
    }

    public CMSSignedDataStreamGenerator() {
    }
}
