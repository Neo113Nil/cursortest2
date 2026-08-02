package org.bouncycastle.cert;

/* loaded from: classes17.dex */
public class X509CRLHolder implements org.bouncycastle.util.Encodable, java.io.Serializable {
    private static final long serialVersionUID = 20170722001L;
    private transient boolean Camera2StreamConfigurationMap;
    private transient org.bouncycastle.asn1.x509.Extensions getHighResolutionOutputSizeshNQ4ISI;
    private transient org.bouncycastle.asn1.x509.GeneralNames getHighSpeedVideoFpsRanges;
    private transient org.bouncycastle.asn1.x509.CertificateList getHighSpeedVideoFpsRangesFor;

    public org.bouncycastle.asn1.x509.CertificateList toASN1Structure() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public boolean isSignatureValid(org.bouncycastle.operator.ContentVerifierProvider contentVerifierProvider) throws org.bouncycastle.cert.CertException {
        org.bouncycastle.asn1.x509.TBSCertList tBSCertList = this.getHighSpeedVideoFpsRangesFor.getTBSCertList();
        if (!org.bouncycastle.cert.CertUtils.getHighSpeedVideoSizes(tBSCertList.getSignature(), this.getHighSpeedVideoFpsRangesFor.getSignatureAlgorithm())) {
            throw new org.bouncycastle.cert.CertException("signature invalid - algorithm identifier mismatch");
        }
        try {
            org.bouncycastle.operator.ContentVerifier contentVerifier = contentVerifierProvider.get(tBSCertList.getSignature());
            java.io.OutputStream outputStream = contentVerifier.getOutputStream();
            tBSCertList.encodeTo(outputStream, org.bouncycastle.asn1.ASN1Encoding.DER);
            outputStream.close();
            return contentVerifier.verify(this.getHighSpeedVideoFpsRangesFor.getSignature().getOctets());
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to process signature: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cert.CertException(sb.toString(), e);
        }
    }

    public int hashCode() {
        return this.getHighSpeedVideoFpsRangesFor.hashCode();
    }

    public boolean hasExtensions() {
        return this.getHighResolutionOutputSizeshNQ4ISI != null;
    }

    public java.util.Date getThisUpdate() {
        return this.getHighSpeedVideoFpsRangesFor.getThisUpdate().getDate();
    }

    public java.util.Collection getRevokedCertificates() {
        java.util.ArrayList arrayList = new java.util.ArrayList(this.getHighSpeedVideoFpsRangesFor.getRevokedCertificates().length);
        org.bouncycastle.asn1.x509.GeneralNames generalNames = this.getHighSpeedVideoFpsRanges;
        java.util.Enumeration revokedCertificateEnumeration = this.getHighSpeedVideoFpsRangesFor.getRevokedCertificateEnumeration();
        while (revokedCertificateEnumeration.hasMoreElements()) {
            org.bouncycastle.cert.X509CRLEntryHolder x509CRLEntryHolder = new org.bouncycastle.cert.X509CRLEntryHolder((org.bouncycastle.asn1.x509.TBSCertList.CRLEntry) revokedCertificateEnumeration.nextElement(), this.Camera2StreamConfigurationMap, generalNames);
            arrayList.add(x509CRLEntryHolder);
            generalNames = x509CRLEntryHolder.getCertificateIssuer();
        }
        return arrayList;
    }

    public org.bouncycastle.cert.X509CRLEntryHolder getRevokedCertificate(java.math.BigInteger bigInteger) {
        org.bouncycastle.asn1.x509.Extension extension;
        org.bouncycastle.asn1.x509.GeneralNames generalNames = this.getHighSpeedVideoFpsRanges;
        java.util.Enumeration revokedCertificateEnumeration = this.getHighSpeedVideoFpsRangesFor.getRevokedCertificateEnumeration();
        while (revokedCertificateEnumeration.hasMoreElements()) {
            org.bouncycastle.asn1.x509.TBSCertList.CRLEntry cRLEntry = (org.bouncycastle.asn1.x509.TBSCertList.CRLEntry) revokedCertificateEnumeration.nextElement();
            if (cRLEntry.getUserCertificate().hasValue(bigInteger)) {
                return new org.bouncycastle.cert.X509CRLEntryHolder(cRLEntry, this.Camera2StreamConfigurationMap, generalNames);
            }
            if (this.Camera2StreamConfigurationMap && cRLEntry.hasExtensions() && (extension = cRLEntry.getExtensions().getExtension(org.bouncycastle.asn1.x509.Extension.certificateIssuer)) != null) {
                generalNames = org.bouncycastle.asn1.x509.GeneralNames.getInstance(extension.getParsedValue());
            }
        }
        return null;
    }

    public java.util.Set getNonCriticalExtensionOIDs() {
        return org.bouncycastle.cert.CertUtils.getHighSpeedVideoFpsRangesFor(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public java.util.Date getNextUpdate() {
        org.bouncycastle.asn1.x509.Time nextUpdate = this.getHighSpeedVideoFpsRangesFor.getNextUpdate();
        if (nextUpdate != null) {
            return nextUpdate.getDate();
        }
        return null;
    }

    public org.bouncycastle.asn1.x500.X500Name getIssuer() {
        return org.bouncycastle.asn1.x500.X500Name.getInstance(this.getHighSpeedVideoFpsRangesFor.getIssuer());
    }

    public org.bouncycastle.asn1.x509.Extensions getExtensions() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public java.util.List getExtensionOIDs() {
        return org.bouncycastle.cert.CertUtils.getHighResolutionOutputSizeshNQ4ISI(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public org.bouncycastle.asn1.x509.Extension getExtension(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        org.bouncycastle.asn1.x509.Extensions extensions = this.getHighResolutionOutputSizeshNQ4ISI;
        if (extensions != null) {
            return extensions.getExtension(aSN1ObjectIdentifier);
        }
        return null;
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws java.io.IOException {
        return this.getHighSpeedVideoFpsRangesFor.getEncoded();
    }

    public java.util.Set getCriticalExtensionOIDs() {
        return org.bouncycastle.cert.CertUtils.getHighSpeedVideoSizes(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof org.bouncycastle.cert.X509CRLHolder) {
            return this.getHighSpeedVideoFpsRangesFor.equals(((org.bouncycastle.cert.X509CRLHolder) obj).getHighSpeedVideoFpsRangesFor);
        }
        return false;
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        objectInputStream.defaultReadObject();
        getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.x509.CertificateList.getInstance(objectInputStream.readObject()));
    }

    private static org.bouncycastle.asn1.x509.CertificateList getHighSpeedVideoFpsRanges(java.io.InputStream inputStream) throws java.io.IOException {
        try {
            org.bouncycastle.asn1.ASN1Primitive readObject = new org.bouncycastle.asn1.ASN1InputStream(inputStream, true).readObject();
            if (readObject != null) {
                return org.bouncycastle.asn1.x509.CertificateList.getInstance(readObject);
            }
            throw new java.io.IOException("no content found");
        } catch (java.lang.ClassCastException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("malformed data: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cert.CertIOException(sb.toString(), e);
        } catch (java.lang.IllegalArgumentException e2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("malformed data: ");
            sb2.append(e2.getMessage());
            throw new org.bouncycastle.cert.CertIOException(sb2.toString(), e2);
        }
    }

    private static boolean Camera2StreamConfigurationMap(org.bouncycastle.asn1.x509.Extensions extensions) {
        org.bouncycastle.asn1.x509.Extension extension;
        return (extensions == null || (extension = extensions.getExtension(org.bouncycastle.asn1.x509.Extension.issuingDistributionPoint)) == null || !org.bouncycastle.asn1.x509.IssuingDistributionPoint.getInstance(extension.getParsedValue()).isIndirectCRL()) ? false : true;
    }

    private void getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.x509.CertificateList certificateList) {
        this.getHighSpeedVideoFpsRangesFor = certificateList;
        org.bouncycastle.asn1.x509.Extensions extensions = certificateList.getTBSCertList().getExtensions();
        this.getHighResolutionOutputSizeshNQ4ISI = extensions;
        this.Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(extensions);
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.x509.GeneralNames(new org.bouncycastle.asn1.x509.GeneralName(certificateList.getIssuer()));
    }

    public X509CRLHolder(byte[] bArr) throws java.io.IOException {
        this(getHighSpeedVideoFpsRanges(new java.io.ByteArrayInputStream(bArr)));
    }

    public X509CRLHolder(org.bouncycastle.asn1.x509.CertificateList certificateList) {
        getHighResolutionOutputSizeshNQ4ISI(certificateList);
    }

    public X509CRLHolder(java.io.InputStream inputStream) throws java.io.IOException {
        this(getHighSpeedVideoFpsRanges(inputStream));
    }
}
