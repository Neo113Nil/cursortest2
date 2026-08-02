package org.bouncycastle.cert;

/* loaded from: classes17.dex */
public class X509AttributeCertificateHolder implements org.bouncycastle.util.Encodable, java.io.Serializable {
    private static org.bouncycastle.asn1.x509.Attribute[] getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.x509.Attribute[0];
    private static final long serialVersionUID = 20170722001L;
    private transient org.bouncycastle.asn1.x509.Extensions getHighResolutionOutputSizeshNQ4ISI;
    private transient org.bouncycastle.asn1.x509.AttributeCertificate getHighSpeedVideoFpsRangesFor;

    public X509AttributeCertificateHolder(org.bouncycastle.asn1.x509.AttributeCertificate attributeCertificate) {
        this.getHighSpeedVideoFpsRangesFor = attributeCertificate;
        this.getHighResolutionOutputSizeshNQ4ISI = attributeCertificate.getAcinfo().getExtensions();
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        objectInputStream.defaultReadObject();
        org.bouncycastle.asn1.x509.AttributeCertificate attributeCertificate = org.bouncycastle.asn1.x509.AttributeCertificate.getInstance(objectInputStream.readObject());
        this.getHighSpeedVideoFpsRangesFor = attributeCertificate;
        this.getHighResolutionOutputSizeshNQ4ISI = attributeCertificate.getAcinfo().getExtensions();
    }

    public org.bouncycastle.asn1.x509.AttributeCertificate toASN1Structure() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public boolean isValidOn(java.util.Date date) {
        org.bouncycastle.asn1.x509.AttCertValidityPeriod attrCertValidityPeriod = this.getHighSpeedVideoFpsRangesFor.getAcinfo().getAttrCertValidityPeriod();
        return (date.before(org.bouncycastle.cert.CertUtils.getHighSpeedVideoSizes(attrCertValidityPeriod.getNotBeforeTime())) || date.after(org.bouncycastle.cert.CertUtils.getHighSpeedVideoSizes(attrCertValidityPeriod.getNotAfterTime()))) ? false : true;
    }

    public boolean isSignatureValid(org.bouncycastle.operator.ContentVerifierProvider contentVerifierProvider) throws org.bouncycastle.cert.CertException {
        org.bouncycastle.asn1.x509.AttributeCertificateInfo acinfo = this.getHighSpeedVideoFpsRangesFor.getAcinfo();
        if (!org.bouncycastle.cert.CertUtils.getHighSpeedVideoSizes(acinfo.getSignature(), this.getHighSpeedVideoFpsRangesFor.getSignatureAlgorithm())) {
            throw new org.bouncycastle.cert.CertException("signature invalid - algorithm identifier mismatch");
        }
        try {
            org.bouncycastle.operator.ContentVerifier contentVerifier = contentVerifierProvider.get(acinfo.getSignature());
            java.io.OutputStream outputStream = contentVerifier.getOutputStream();
            acinfo.encodeTo(outputStream, org.bouncycastle.asn1.ASN1Encoding.DER);
            outputStream.close();
            return contentVerifier.verify(getSignature());
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

    public int getVersion() {
        return this.getHighSpeedVideoFpsRangesFor.getAcinfo().getVersion().intValueExact() + 1;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getSignatureAlgorithm() {
        return this.getHighSpeedVideoFpsRangesFor.getSignatureAlgorithm();
    }

    public byte[] getSignature() {
        return this.getHighSpeedVideoFpsRangesFor.getSignatureValue().getOctets();
    }

    public java.math.BigInteger getSerialNumber() {
        return this.getHighSpeedVideoFpsRangesFor.getAcinfo().getSerialNumber().getValue();
    }

    public java.util.Date getNotBefore() {
        return org.bouncycastle.cert.CertUtils.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRangesFor.getAcinfo().getAttrCertValidityPeriod().getNotBeforeTime());
    }

    public java.util.Date getNotAfter() {
        return org.bouncycastle.cert.CertUtils.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRangesFor.getAcinfo().getAttrCertValidityPeriod().getNotAfterTime());
    }

    public java.util.Set getNonCriticalExtensionOIDs() {
        return org.bouncycastle.cert.CertUtils.getHighSpeedVideoFpsRangesFor(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public boolean[] getIssuerUniqueID() {
        return org.bouncycastle.cert.CertUtils.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRangesFor.getAcinfo().getIssuerUniqueID());
    }

    public org.bouncycastle.cert.AttributeCertificateIssuer getIssuer() {
        return new org.bouncycastle.cert.AttributeCertificateIssuer(this.getHighSpeedVideoFpsRangesFor.getAcinfo().getIssuer());
    }

    public org.bouncycastle.cert.AttributeCertificateHolder getHolder() {
        return new org.bouncycastle.cert.AttributeCertificateHolder((org.bouncycastle.asn1.ASN1Sequence) this.getHighSpeedVideoFpsRangesFor.getAcinfo().getHolder().toASN1Primitive());
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

    public org.bouncycastle.asn1.x509.Attribute[] getAttributes(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        org.bouncycastle.asn1.ASN1Sequence attributes = this.getHighSpeedVideoFpsRangesFor.getAcinfo().getAttributes();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i != attributes.size(); i++) {
            org.bouncycastle.asn1.x509.Attribute attribute = org.bouncycastle.asn1.x509.Attribute.getInstance(attributes.getObjectAt(i));
            if (attribute.getAttrType().equals((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifier)) {
                arrayList.add(attribute);
            }
        }
        return arrayList.size() == 0 ? getHighSpeedVideoFpsRanges : (org.bouncycastle.asn1.x509.Attribute[]) arrayList.toArray(new org.bouncycastle.asn1.x509.Attribute[arrayList.size()]);
    }

    public org.bouncycastle.asn1.x509.Attribute[] getAttributes() {
        org.bouncycastle.asn1.ASN1Sequence attributes = this.getHighSpeedVideoFpsRangesFor.getAcinfo().getAttributes();
        org.bouncycastle.asn1.x509.Attribute[] attributeArr = new org.bouncycastle.asn1.x509.Attribute[attributes.size()];
        for (int i = 0; i != attributes.size(); i++) {
            attributeArr[i] = org.bouncycastle.asn1.x509.Attribute.getInstance(attributes.getObjectAt(i));
        }
        return attributeArr;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof org.bouncycastle.cert.X509AttributeCertificateHolder) {
            return this.getHighSpeedVideoFpsRangesFor.equals(((org.bouncycastle.cert.X509AttributeCertificateHolder) obj).getHighSpeedVideoFpsRangesFor);
        }
        return false;
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    private static org.bouncycastle.asn1.x509.AttributeCertificate getHighSpeedVideoFpsRangesFor(byte[] bArr) throws java.io.IOException {
        try {
            return org.bouncycastle.asn1.x509.AttributeCertificate.getInstance(org.bouncycastle.cert.CertUtils.getHighSpeedVideoSizes(bArr));
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

    public X509AttributeCertificateHolder(byte[] bArr) throws java.io.IOException {
        this(getHighSpeedVideoFpsRangesFor(bArr));
    }
}
