package org.bouncycastle.tsp;

/* loaded from: classes17.dex */
public class TimeStampTokenGenerator {
    public static final int R_HUNDREDTHS_OF_SECONDS = 2;
    public static final int R_MICROSECONDS = 2;
    public static final int R_MILLISECONDS = 3;
    public static final int R_SECONDS = 0;
    public static final int R_TENTHS_OF_SECONDS = 1;
    private int Camera2StreamConfigurationMap;
    boolean getHighResolutionOutputSizeshNQ4ISI;
    org.bouncycastle.asn1.x509.GeneralName getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;
    private java.util.List getHighSpeedVideoSizesFor;
    private java.util.Map getInputFormats;
    private java.util.List getInputSizeshNQ4ISI;
    private java.util.Locale getOutputFormats;
    private java.util.List getOutputMinFrameDuration;
    private int getOutputMinFrameDurationlomOqCM;
    private org.bouncycastle.asn1.ASN1ObjectIdentifier getOutputSizes;
    private org.bouncycastle.cms.SignerInfoGenerator getOutputStallDuration;

    /* JADX WARN: Code restructure failed: missing block: B:86:0x0138, code lost:
    
        if (r0.length() > r3) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0143, code lost:
    
        r0.delete(r3, r0.length());
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0141, code lost:
    
        if (r0.length() > r3) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public org.bouncycastle.tsp.TimeStampToken generate(org.bouncycastle.tsp.TimeStampRequest timeStampRequest, java.math.BigInteger bigInteger, java.util.Date date, org.bouncycastle.asn1.x509.Extensions extensions) throws org.bouncycastle.tsp.TSPException {
        org.bouncycastle.asn1.x509.Extensions extensions2;
        int i;
        org.bouncycastle.asn1.ASN1GeneralizedTime aSN1GeneralizedTime;
        org.bouncycastle.asn1.ASN1GeneralizedTime aSN1GeneralizedTime2;
        org.bouncycastle.asn1.tsp.MessageImprint messageImprint = new org.bouncycastle.asn1.tsp.MessageImprint(timeStampRequest.getMessageImprintAlgID(), timeStampRequest.getMessageImprintDigest());
        int i2 = this.Camera2StreamConfigurationMap;
        org.bouncycastle.asn1.tsp.Accuracy accuracy = (i2 > 0 || this.getHighSpeedVideoSizes > 0 || this.getHighSpeedVideoFpsRangesFor > 0) ? new org.bouncycastle.asn1.tsp.Accuracy(i2 > 0 ? new org.bouncycastle.asn1.ASN1Integer(this.Camera2StreamConfigurationMap) : null, this.getHighSpeedVideoSizes > 0 ? new org.bouncycastle.asn1.ASN1Integer(this.getHighSpeedVideoSizes) : null, this.getHighSpeedVideoFpsRangesFor > 0 ? new org.bouncycastle.asn1.ASN1Integer(this.getHighSpeedVideoFpsRangesFor) : null) : null;
        boolean z = this.getHighResolutionOutputSizeshNQ4ISI;
        org.bouncycastle.asn1.ASN1Boolean aSN1Boolean = z ? org.bouncycastle.asn1.ASN1Boolean.getInstance(z) : null;
        org.bouncycastle.asn1.ASN1Integer aSN1Integer = timeStampRequest.getNonce() != null ? new org.bouncycastle.asn1.ASN1Integer(timeStampRequest.getNonce()) : null;
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = this.getOutputSizes;
        if (timeStampRequest.getReqPolicy() != null) {
            aSN1ObjectIdentifier = timeStampRequest.getReqPolicy();
        }
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier2 = aSN1ObjectIdentifier;
        org.bouncycastle.asn1.x509.Extensions extensions3 = timeStampRequest.getHighSpeedVideoFpsRanges;
        if (extensions != null) {
            org.bouncycastle.asn1.x509.ExtensionsGenerator extensionsGenerator = new org.bouncycastle.asn1.x509.ExtensionsGenerator();
            if (extensions3 != null) {
                java.util.Enumeration oids = extensions3.oids();
                while (oids.hasMoreElements()) {
                    extensionsGenerator.addExtension(extensions3.getExtension(org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(oids.nextElement())));
                }
            }
            java.util.Enumeration oids2 = extensions.oids();
            while (oids2.hasMoreElements()) {
                extensionsGenerator.addExtension(extensions.getExtension(org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(oids2.nextElement())));
            }
            extensions2 = extensionsGenerator.generate();
        } else {
            extensions2 = extensions3;
        }
        if (this.getOutputMinFrameDurationlomOqCM == 0) {
            aSN1GeneralizedTime2 = this.getOutputFormats == null ? new org.bouncycastle.asn1.ASN1GeneralizedTime(date) : new org.bouncycastle.asn1.ASN1GeneralizedTime(date, this.getOutputFormats);
        } else {
            java.text.SimpleDateFormat simpleDateFormat = this.getOutputFormats == null ? new java.text.SimpleDateFormat("yyyyMMddHHmmss.SSS") : new java.text.SimpleDateFormat("yyyyMMddHHmmss.SSS", this.getOutputFormats);
            simpleDateFormat.setTimeZone(new java.util.SimpleTimeZone(0, "Z"));
            java.lang.StringBuilder sb = new java.lang.StringBuilder(simpleDateFormat.format(date));
            int indexOf = sb.indexOf(".");
            if (indexOf < 0) {
                sb.append("Z");
                aSN1GeneralizedTime = new org.bouncycastle.asn1.ASN1GeneralizedTime(sb.toString());
            } else {
                int i3 = this.getOutputMinFrameDurationlomOqCM;
                if (i3 != 1) {
                    if (i3 == 2) {
                        i = indexOf + 3;
                    } else if (i3 != 3) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("unknown time-stamp resolution: ");
                        sb2.append(this.getOutputMinFrameDurationlomOqCM);
                        throw new org.bouncycastle.tsp.TSPException(sb2.toString());
                    }
                    while (sb.charAt(sb.length() - 1) == '0') {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    if (sb.length() - 1 == indexOf) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    sb.append("Z");
                    aSN1GeneralizedTime = new org.bouncycastle.asn1.ASN1GeneralizedTime(sb.toString());
                } else {
                    i = indexOf + 2;
                }
            }
            aSN1GeneralizedTime2 = aSN1GeneralizedTime;
        }
        org.bouncycastle.asn1.tsp.TSTInfo tSTInfo = new org.bouncycastle.asn1.tsp.TSTInfo(aSN1ObjectIdentifier2, messageImprint, new org.bouncycastle.asn1.ASN1Integer(bigInteger), aSN1GeneralizedTime2, accuracy, aSN1Boolean, aSN1Integer, this.getHighSpeedVideoFpsRanges, extensions2);
        try {
            org.bouncycastle.cms.CMSSignedDataGenerator cMSSignedDataGenerator = new org.bouncycastle.cms.CMSSignedDataGenerator();
            if (timeStampRequest.getCertReq()) {
                cMSSignedDataGenerator.addCertificates(new org.bouncycastle.util.CollectionStore(this.getOutputMinFrameDuration));
                cMSSignedDataGenerator.addAttributeCertificates(new org.bouncycastle.util.CollectionStore(this.getInputSizeshNQ4ISI));
            }
            cMSSignedDataGenerator.addCRLs(new org.bouncycastle.util.CollectionStore(this.getHighSpeedVideoSizesFor));
            if (!this.getInputFormats.isEmpty()) {
                for (org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier3 : this.getInputFormats.keySet()) {
                    cMSSignedDataGenerator.addOtherRevocationInfo(aSN1ObjectIdentifier3, new org.bouncycastle.util.CollectionStore((java.util.Collection) this.getInputFormats.get(aSN1ObjectIdentifier3)));
                }
            }
            cMSSignedDataGenerator.addSignerInfoGenerator(this.getOutputStallDuration);
            return new org.bouncycastle.tsp.TimeStampToken(cMSSignedDataGenerator.generate(new org.bouncycastle.cms.CMSProcessableByteArray(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_ct_TSTInfo, tSTInfo.getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER)), true));
        } catch (java.io.IOException e) {
            throw new org.bouncycastle.tsp.TSPException("Exception encoding info", e);
        } catch (org.bouncycastle.cms.CMSException e2) {
            throw new org.bouncycastle.tsp.TSPException("Error generating time-stamp token", e2);
        }
    }

    public void setTSA(org.bouncycastle.asn1.x509.GeneralName generalName) {
        this.getHighSpeedVideoFpsRanges = generalName;
    }

    public void setResolution(int i) {
        this.getOutputMinFrameDurationlomOqCM = i;
    }

    public void setOrdering(boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI = z;
    }

    public void setLocale(java.util.Locale locale) {
        this.getOutputFormats = locale;
    }

    public void setAccuracySeconds(int i) {
        this.Camera2StreamConfigurationMap = i;
    }

    public void setAccuracyMillis(int i) {
        this.getHighSpeedVideoSizes = i;
    }

    public void setAccuracyMicros(int i) {
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    public org.bouncycastle.tsp.TimeStampToken generate(org.bouncycastle.tsp.TimeStampRequest timeStampRequest, java.math.BigInteger bigInteger, java.util.Date date) throws org.bouncycastle.tsp.TSPException {
        return generate(timeStampRequest, bigInteger, date, null);
    }

    public void addOtherRevocationInfo(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.util.Store store) {
        this.getInputFormats.put(aSN1ObjectIdentifier, store.getMatches(null));
    }

    public void addCertificates(org.bouncycastle.util.Store store) {
        this.getOutputMinFrameDuration.addAll(store.getMatches(null));
    }

    public void addCRLs(org.bouncycastle.util.Store store) {
        this.getHighSpeedVideoSizesFor.addAll(store.getMatches(null));
    }

    public void addAttributeCertificates(org.bouncycastle.util.Store store) {
        this.getInputSizeshNQ4ISI.addAll(store.getMatches(null));
    }

    public TimeStampTokenGenerator(final org.bouncycastle.cms.SignerInfoGenerator signerInfoGenerator, org.bouncycastle.operator.DigestCalculator digestCalculator, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z) throws java.lang.IllegalArgumentException, org.bouncycastle.tsp.TSPException {
        org.bouncycastle.cms.SignerInfoGenerator signerInfoGenerator2;
        this.getOutputMinFrameDurationlomOqCM = 0;
        this.getOutputFormats = null;
        this.Camera2StreamConfigurationMap = -1;
        this.getHighSpeedVideoSizes = -1;
        this.getHighSpeedVideoFpsRangesFor = -1;
        this.getHighResolutionOutputSizeshNQ4ISI = false;
        this.getHighSpeedVideoFpsRanges = null;
        this.getOutputMinFrameDuration = new java.util.ArrayList();
        this.getHighSpeedVideoSizesFor = new java.util.ArrayList();
        this.getInputSizeshNQ4ISI = new java.util.ArrayList();
        this.getInputFormats = new java.util.HashMap();
        this.getOutputStallDuration = signerInfoGenerator;
        this.getOutputSizes = aSN1ObjectIdentifier;
        if (!signerInfoGenerator.hasAssociatedCertificate()) {
            throw new java.lang.IllegalArgumentException("SignerInfoGenerator must have an associated certificate");
        }
        org.bouncycastle.cert.X509CertificateHolder associatedCertificate = signerInfoGenerator.getAssociatedCertificate();
        org.bouncycastle.tsp.TSPUtil.validateCertificate(associatedCertificate);
        try {
            java.io.OutputStream outputStream = digestCalculator.getOutputStream();
            outputStream.write(associatedCertificate.getEncoded());
            outputStream.close();
            if (digestCalculator.getAlgorithmIdentifier().getAlgorithm().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.idSHA1)) {
                final org.bouncycastle.asn1.ess.ESSCertID eSSCertID = new org.bouncycastle.asn1.ess.ESSCertID(digestCalculator.getDigest(), z ? new org.bouncycastle.asn1.x509.IssuerSerial(new org.bouncycastle.asn1.x509.GeneralNames(new org.bouncycastle.asn1.x509.GeneralName(associatedCertificate.getIssuer())), associatedCertificate.getSerialNumber()) : null);
                signerInfoGenerator2 = new org.bouncycastle.cms.SignerInfoGenerator(signerInfoGenerator, new org.bouncycastle.cms.CMSAttributeTableGenerator() { // from class: org.bouncycastle.tsp.TimeStampTokenGenerator.1
                    @Override // org.bouncycastle.cms.CMSAttributeTableGenerator
                    public org.bouncycastle.asn1.cms.AttributeTable getAttributes(java.util.Map map) throws org.bouncycastle.cms.CMSAttributeTableGenerationException {
                        org.bouncycastle.asn1.cms.AttributeTable attributes = signerInfoGenerator.getSignedAttributeTableGenerator().getAttributes(map);
                        return attributes.get(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_aa_signingCertificate) == null ? attributes.add(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_aa_signingCertificate, new org.bouncycastle.asn1.ess.SigningCertificate(eSSCertID)) : attributes;
                    }
                }, signerInfoGenerator.getUnsignedAttributeTableGenerator());
            } else {
                final org.bouncycastle.asn1.ess.ESSCertIDv2 eSSCertIDv2 = new org.bouncycastle.asn1.ess.ESSCertIDv2(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(digestCalculator.getAlgorithmIdentifier().getAlgorithm()), digestCalculator.getDigest(), z ? new org.bouncycastle.asn1.x509.IssuerSerial(new org.bouncycastle.asn1.x509.GeneralNames(new org.bouncycastle.asn1.x509.GeneralName(associatedCertificate.getIssuer())), new org.bouncycastle.asn1.ASN1Integer(associatedCertificate.getSerialNumber())) : null);
                signerInfoGenerator2 = new org.bouncycastle.cms.SignerInfoGenerator(signerInfoGenerator, new org.bouncycastle.cms.CMSAttributeTableGenerator() { // from class: org.bouncycastle.tsp.TimeStampTokenGenerator.2
                    @Override // org.bouncycastle.cms.CMSAttributeTableGenerator
                    public org.bouncycastle.asn1.cms.AttributeTable getAttributes(java.util.Map map) throws org.bouncycastle.cms.CMSAttributeTableGenerationException {
                        org.bouncycastle.asn1.cms.AttributeTable attributes = signerInfoGenerator.getSignedAttributeTableGenerator().getAttributes(map);
                        return attributes.get(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_aa_signingCertificateV2) == null ? attributes.add(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_aa_signingCertificateV2, new org.bouncycastle.asn1.ess.SigningCertificateV2(eSSCertIDv2)) : attributes;
                    }
                }, signerInfoGenerator.getUnsignedAttributeTableGenerator());
            }
            this.getOutputStallDuration = signerInfoGenerator2;
        } catch (java.io.IOException e) {
            throw new org.bouncycastle.tsp.TSPException("Exception processing certificate.", e);
        }
    }

    public TimeStampTokenGenerator(org.bouncycastle.cms.SignerInfoGenerator signerInfoGenerator, org.bouncycastle.operator.DigestCalculator digestCalculator, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) throws java.lang.IllegalArgumentException, org.bouncycastle.tsp.TSPException {
        this(signerInfoGenerator, digestCalculator, aSN1ObjectIdentifier, false);
    }
}
