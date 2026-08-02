package org.bouncycastle.cert;

/* loaded from: classes17.dex */
public class X509CertificateHolder implements org.bouncycastle.util.Encodable, java.io.Serializable {
    private static final long serialVersionUID = 20170722001L;
    private transient org.bouncycastle.asn1.x509.Certificate Camera2StreamConfigurationMap;
    private transient org.bouncycastle.asn1.x509.Extensions getHighResolutionOutputSizeshNQ4ISI;

    public X509CertificateHolder(org.bouncycastle.asn1.x509.Certificate certificate) {
        this.Camera2StreamConfigurationMap = certificate;
        this.getHighResolutionOutputSizeshNQ4ISI = certificate.getTBSCertificate().getExtensions();
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        objectInputStream.defaultReadObject();
        org.bouncycastle.asn1.x509.Certificate certificate = org.bouncycastle.asn1.x509.Certificate.getInstance(objectInputStream.readObject());
        this.Camera2StreamConfigurationMap = certificate;
        this.getHighResolutionOutputSizeshNQ4ISI = certificate.getTBSCertificate().getExtensions();
    }

    public org.bouncycastle.asn1.x509.Certificate toASN1Structure() {
        return this.Camera2StreamConfigurationMap;
    }

    public boolean isValidOn(java.util.Date date) {
        return (date.before(this.Camera2StreamConfigurationMap.getStartDate().getDate()) || date.after(this.Camera2StreamConfigurationMap.getEndDate().getDate())) ? false : true;
    }

    public boolean isSignatureValid(org.bouncycastle.operator.ContentVerifierProvider contentVerifierProvider) throws org.bouncycastle.cert.CertException {
        org.bouncycastle.asn1.x509.TBSCertificate tBSCertificate = this.Camera2StreamConfigurationMap.getTBSCertificate();
        if (!org.bouncycastle.cert.CertUtils.getHighSpeedVideoSizes(tBSCertificate.getSignature(), this.Camera2StreamConfigurationMap.getSignatureAlgorithm())) {
            throw new org.bouncycastle.cert.CertException("signature invalid - algorithm identifier mismatch");
        }
        try {
            org.bouncycastle.operator.ContentVerifier contentVerifier = contentVerifierProvider.get(tBSCertificate.getSignature());
            java.io.OutputStream outputStream = contentVerifier.getOutputStream();
            tBSCertificate.encodeTo(outputStream, org.bouncycastle.asn1.ASN1Encoding.DER);
            outputStream.close();
            return contentVerifier.verify(getSignature());
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to process signature: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cert.CertException(sb.toString(), e);
        }
    }

    public int hashCode() {
        return this.Camera2StreamConfigurationMap.hashCode();
    }

    public boolean hasExtensions() {
        return this.getHighResolutionOutputSizeshNQ4ISI != null;
    }

    public int getVersionNumber() {
        return this.Camera2StreamConfigurationMap.getVersionNumber();
    }

    public int getVersion() {
        return this.Camera2StreamConfigurationMap.getVersionNumber();
    }

    public org.bouncycastle.asn1.x509.SubjectPublicKeyInfo getSubjectPublicKeyInfo() {
        return this.Camera2StreamConfigurationMap.getSubjectPublicKeyInfo();
    }

    public org.bouncycastle.asn1.x500.X500Name getSubject() {
        return org.bouncycastle.asn1.x500.X500Name.getInstance(this.Camera2StreamConfigurationMap.getSubject());
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getSignatureAlgorithm() {
        return this.Camera2StreamConfigurationMap.getSignatureAlgorithm();
    }

    public byte[] getSignature() {
        return this.Camera2StreamConfigurationMap.getSignature().getOctets();
    }

    public java.math.BigInteger getSerialNumber() {
        return this.Camera2StreamConfigurationMap.getSerialNumber().getValue();
    }

    public java.util.Date getNotBefore() {
        return this.Camera2StreamConfigurationMap.getStartDate().getDate();
    }

    public java.util.Date getNotAfter() {
        return this.Camera2StreamConfigurationMap.getEndDate().getDate();
    }

    public java.util.Set getNonCriticalExtensionOIDs() {
        return org.bouncycastle.cert.CertUtils.getHighSpeedVideoFpsRangesFor(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public org.bouncycastle.asn1.x500.X500Name getIssuer() {
        return org.bouncycastle.asn1.x500.X500Name.getInstance(this.Camera2StreamConfigurationMap.getIssuer());
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
        return this.Camera2StreamConfigurationMap.getEncoded();
    }

    public java.util.Set getCriticalExtensionOIDs() {
        return org.bouncycastle.cert.CertUtils.getHighSpeedVideoSizes(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof org.bouncycastle.cert.X509CertificateHolder) {
            return this.Camera2StreamConfigurationMap.equals(((org.bouncycastle.cert.X509CertificateHolder) obj).Camera2StreamConfigurationMap);
        }
        return false;
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    private static org.bouncycastle.asn1.x509.Certificate getHighSpeedVideoSizes(byte[] bArr) throws java.io.IOException {
        try {
            return org.bouncycastle.asn1.x509.Certificate.getInstance(org.bouncycastle.cert.CertUtils.getHighSpeedVideoSizes(bArr));
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

    public X509CertificateHolder(byte[] bArr) throws java.io.IOException {
        this(getHighSpeedVideoSizes(bArr));
    }
}
