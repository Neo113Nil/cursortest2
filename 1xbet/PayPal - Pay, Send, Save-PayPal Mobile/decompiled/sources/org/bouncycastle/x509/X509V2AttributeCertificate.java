package org.bouncycastle.x509;

/* loaded from: classes17.dex */
public class X509V2AttributeCertificate implements org.bouncycastle.x509.X509AttributeCertificate {
    private java.util.Date getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.x509.AttributeCertificate getHighSpeedVideoFpsRangesFor;
    private java.util.Date getHighSpeedVideoSizes;

    @Override // org.bouncycastle.x509.X509AttributeCertificate
    public final void verify(java.security.PublicKey publicKey, java.lang.String str) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.NoSuchProviderException, java.security.SignatureException {
        if (!this.getHighSpeedVideoFpsRangesFor.getSignatureAlgorithm().equals(this.getHighSpeedVideoFpsRangesFor.getAcinfo().getSignature())) {
            throw new java.security.cert.CertificateException("Signature algorithm in certificate info not same as outer certificate");
        }
        java.security.Signature signature = java.security.Signature.getInstance(this.getHighSpeedVideoFpsRangesFor.getSignatureAlgorithm().getAlgorithm().getId(), str);
        signature.initVerify(publicKey);
        try {
            signature.update(this.getHighSpeedVideoFpsRangesFor.getAcinfo().getEncoded());
            if (!signature.verify(getSignature())) {
                throw new java.security.InvalidKeyException("Public key presented not for certificate signature");
            }
        } catch (java.io.IOException unused) {
            throw new java.security.SignatureException("Exception encoding certificate info object");
        }
    }

    public int hashCode() {
        try {
            return org.bouncycastle.util.Arrays.hashCode(getEncoded());
        } catch (java.io.IOException unused) {
            return 0;
        }
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        java.util.Set criticalExtensionOIDs = getCriticalExtensionOIDs();
        return (criticalExtensionOIDs == null || criticalExtensionOIDs.isEmpty()) ? false : true;
    }

    @Override // org.bouncycastle.x509.X509AttributeCertificate
    public int getVersion() {
        return this.getHighSpeedVideoFpsRangesFor.getAcinfo().getVersion().intValueExact() + 1;
    }

    @Override // org.bouncycastle.x509.X509AttributeCertificate
    public byte[] getSignature() {
        return this.getHighSpeedVideoFpsRangesFor.getSignatureValue().getOctets();
    }

    @Override // org.bouncycastle.x509.X509AttributeCertificate
    public java.math.BigInteger getSerialNumber() {
        return this.getHighSpeedVideoFpsRangesFor.getAcinfo().getSerialNumber().getValue();
    }

    @Override // org.bouncycastle.x509.X509AttributeCertificate
    public java.util.Date getNotBefore() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // org.bouncycastle.x509.X509AttributeCertificate
    public java.util.Date getNotAfter() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // java.security.cert.X509Extension
    public java.util.Set getNonCriticalExtensionOIDs() {
        return getHighSpeedVideoSizes(false);
    }

    @Override // org.bouncycastle.x509.X509AttributeCertificate
    public boolean[] getIssuerUniqueID() {
        org.bouncycastle.asn1.ASN1BitString issuerUniqueID = this.getHighSpeedVideoFpsRangesFor.getAcinfo().getIssuerUniqueID();
        if (issuerUniqueID == null) {
            return null;
        }
        byte[] bytes = issuerUniqueID.getBytes();
        int length = (bytes.length * 8) - issuerUniqueID.getPadBits();
        boolean[] zArr = new boolean[length];
        for (int i = 0; i != length; i++) {
            zArr[i] = (bytes[i / 8] & (128 >>> (i % 8))) != 0;
        }
        return zArr;
    }

    @Override // org.bouncycastle.x509.X509AttributeCertificate
    public org.bouncycastle.x509.AttributeCertificateIssuer getIssuer() {
        return new org.bouncycastle.x509.AttributeCertificateIssuer(this.getHighSpeedVideoFpsRangesFor.getAcinfo().getIssuer());
    }

    @Override // org.bouncycastle.x509.X509AttributeCertificate
    public org.bouncycastle.x509.AttributeCertificateHolder getHolder() {
        return new org.bouncycastle.x509.AttributeCertificateHolder((org.bouncycastle.asn1.ASN1Sequence) this.getHighSpeedVideoFpsRangesFor.getAcinfo().getHolder().toASN1Primitive());
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(java.lang.String str) {
        org.bouncycastle.asn1.x509.Extension extension;
        org.bouncycastle.asn1.x509.Extensions extensions = this.getHighSpeedVideoFpsRangesFor.getAcinfo().getExtensions();
        if (extensions == null || (extension = extensions.getExtension(new org.bouncycastle.asn1.ASN1ObjectIdentifier(str))) == null) {
            return null;
        }
        try {
            return extension.getExtnValue().getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("error encoding ");
            sb.append(e.toString());
            throw new java.lang.RuntimeException(sb.toString());
        }
    }

    @Override // org.bouncycastle.x509.X509AttributeCertificate
    public byte[] getEncoded() throws java.io.IOException {
        return this.getHighSpeedVideoFpsRangesFor.getEncoded();
    }

    @Override // java.security.cert.X509Extension
    public java.util.Set getCriticalExtensionOIDs() {
        return getHighSpeedVideoSizes(true);
    }

    @Override // org.bouncycastle.x509.X509AttributeCertificate
    public org.bouncycastle.x509.X509Attribute[] getAttributes(java.lang.String str) {
        org.bouncycastle.asn1.ASN1Sequence attributes = this.getHighSpeedVideoFpsRangesFor.getAcinfo().getAttributes();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i != attributes.size(); i++) {
            org.bouncycastle.x509.X509Attribute x509Attribute = new org.bouncycastle.x509.X509Attribute(attributes.getObjectAt(i));
            if (x509Attribute.getOID().equals(str)) {
                arrayList.add(x509Attribute);
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return (org.bouncycastle.x509.X509Attribute[]) arrayList.toArray(new org.bouncycastle.x509.X509Attribute[arrayList.size()]);
    }

    @Override // org.bouncycastle.x509.X509AttributeCertificate
    public org.bouncycastle.x509.X509Attribute[] getAttributes() {
        org.bouncycastle.asn1.ASN1Sequence attributes = this.getHighSpeedVideoFpsRangesFor.getAcinfo().getAttributes();
        org.bouncycastle.x509.X509Attribute[] x509AttributeArr = new org.bouncycastle.x509.X509Attribute[attributes.size()];
        for (int i = 0; i != attributes.size(); i++) {
            x509AttributeArr[i] = new org.bouncycastle.x509.X509Attribute(attributes.getObjectAt(i));
        }
        return x509AttributeArr;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof org.bouncycastle.x509.X509AttributeCertificate)) {
            return false;
        }
        try {
            return org.bouncycastle.util.Arrays.areEqual(getEncoded(), ((org.bouncycastle.x509.X509AttributeCertificate) obj).getEncoded());
        } catch (java.io.IOException unused) {
            return false;
        }
    }

    @Override // org.bouncycastle.x509.X509AttributeCertificate
    public void checkValidity(java.util.Date date) throws java.security.cert.CertificateExpiredException, java.security.cert.CertificateNotYetValidException {
        if (date.after(getNotAfter())) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("certificate expired on ");
            sb.append(getNotAfter());
            throw new java.security.cert.CertificateExpiredException(sb.toString());
        }
        if (date.before(getNotBefore())) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("certificate not valid till ");
            sb2.append(getNotBefore());
            throw new java.security.cert.CertificateNotYetValidException(sb2.toString());
        }
    }

    @Override // org.bouncycastle.x509.X509AttributeCertificate
    public void checkValidity() throws java.security.cert.CertificateExpiredException, java.security.cert.CertificateNotYetValidException {
        checkValidity(new java.util.Date());
    }

    private static org.bouncycastle.asn1.x509.AttributeCertificate getHighSpeedVideoFpsRangesFor(java.io.InputStream inputStream) throws java.io.IOException {
        try {
            return org.bouncycastle.asn1.x509.AttributeCertificate.getInstance(new org.bouncycastle.asn1.ASN1InputStream(inputStream).readObject());
        } catch (java.io.IOException e) {
            throw e;
        } catch (java.lang.Exception e2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("exception decoding certificate structure: ");
            sb.append(e2.toString());
            throw new java.io.IOException(sb.toString());
        }
    }

    private java.util.Set getHighSpeedVideoSizes(boolean z) {
        org.bouncycastle.asn1.x509.Extensions extensions = this.getHighSpeedVideoFpsRangesFor.getAcinfo().getExtensions();
        if (extensions == null) {
            return null;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Enumeration oids = extensions.oids();
        while (oids.hasMoreElements()) {
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = (org.bouncycastle.asn1.ASN1ObjectIdentifier) oids.nextElement();
            if (extensions.getExtension(aSN1ObjectIdentifier).isCritical() == z) {
                hashSet.add(aSN1ObjectIdentifier.getId());
            }
        }
        return hashSet;
    }

    public X509V2AttributeCertificate(byte[] bArr) throws java.io.IOException {
        this(new java.io.ByteArrayInputStream(bArr));
    }

    private X509V2AttributeCertificate(org.bouncycastle.asn1.x509.AttributeCertificate attributeCertificate) throws java.io.IOException {
        this.getHighSpeedVideoFpsRangesFor = attributeCertificate;
        try {
            this.getHighResolutionOutputSizeshNQ4ISI = attributeCertificate.getAcinfo().getAttrCertValidityPeriod().getNotAfterTime().getDate();
            this.getHighSpeedVideoSizes = attributeCertificate.getAcinfo().getAttrCertValidityPeriod().getNotBeforeTime().getDate();
        } catch (java.text.ParseException unused) {
            throw new java.io.IOException("invalid data structure in certificate!");
        }
    }

    public X509V2AttributeCertificate(java.io.InputStream inputStream) throws java.io.IOException {
        this(getHighSpeedVideoFpsRangesFor(inputStream));
    }
}
