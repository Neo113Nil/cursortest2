package org.bouncycastle.x509;

/* loaded from: classes17.dex */
public class X509AttributeCertStoreSelector implements org.bouncycastle.util.Selector {
    private java.util.Date Camera2StreamConfigurationMap;
    private org.bouncycastle.x509.X509AttributeCertificate getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.x509.AttributeCertificateHolder getHighSpeedVideoFpsRanges;
    private org.bouncycastle.x509.AttributeCertificateIssuer getHighSpeedVideoFpsRangesFor;
    private java.math.BigInteger getHighSpeedVideoSizes;
    private java.util.Collection getHighSpeedVideoSizesFor = new java.util.HashSet();
    private java.util.Collection getInputSizeshNQ4ISI = new java.util.HashSet();

    public void setTargetNames(java.util.Collection collection) throws java.io.IOException {
        this.getHighSpeedVideoSizesFor = getHighSpeedVideoFpsRanges(collection);
    }

    public void setTargetGroups(java.util.Collection collection) throws java.io.IOException {
        this.getInputSizeshNQ4ISI = getHighSpeedVideoFpsRanges(collection);
    }

    public void setSerialNumber(java.math.BigInteger bigInteger) {
        this.getHighSpeedVideoSizes = bigInteger;
    }

    public void setIssuer(org.bouncycastle.x509.AttributeCertificateIssuer attributeCertificateIssuer) {
        this.getHighSpeedVideoFpsRangesFor = attributeCertificateIssuer;
    }

    public void setHolder(org.bouncycastle.x509.AttributeCertificateHolder attributeCertificateHolder) {
        this.getHighSpeedVideoFpsRanges = attributeCertificateHolder;
    }

    public void setAttributeCertificateValid(java.util.Date date) {
        if (date != null) {
            this.Camera2StreamConfigurationMap = new java.util.Date(date.getTime());
        } else {
            this.Camera2StreamConfigurationMap = null;
        }
    }

    public void setAttributeCert(org.bouncycastle.x509.X509AttributeCertificate x509AttributeCertificate) {
        this.getHighResolutionOutputSizeshNQ4ISI = x509AttributeCertificate;
    }

    @Override // org.bouncycastle.util.Selector
    public boolean match(java.lang.Object obj) {
        byte[] extensionValue;
        org.bouncycastle.asn1.x509.Targets[] targetsObjects;
        if (!(obj instanceof org.bouncycastle.x509.X509AttributeCertificate)) {
            return false;
        }
        org.bouncycastle.x509.X509AttributeCertificate x509AttributeCertificate = (org.bouncycastle.x509.X509AttributeCertificate) obj;
        org.bouncycastle.x509.X509AttributeCertificate x509AttributeCertificate2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (x509AttributeCertificate2 != null && !x509AttributeCertificate2.equals(x509AttributeCertificate)) {
            return false;
        }
        if (this.getHighSpeedVideoSizes != null && !x509AttributeCertificate.getSerialNumber().equals(this.getHighSpeedVideoSizes)) {
            return false;
        }
        if (this.getHighSpeedVideoFpsRanges != null && !x509AttributeCertificate.getHolder().equals(this.getHighSpeedVideoFpsRanges)) {
            return false;
        }
        if (this.getHighSpeedVideoFpsRangesFor != null && !x509AttributeCertificate.getIssuer().equals(this.getHighSpeedVideoFpsRangesFor)) {
            return false;
        }
        java.util.Date date = this.Camera2StreamConfigurationMap;
        if (date != null) {
            try {
                x509AttributeCertificate.checkValidity(date);
            } catch (java.security.cert.CertificateExpiredException | java.security.cert.CertificateNotYetValidException unused) {
                return false;
            }
        }
        if ((!this.getHighSpeedVideoSizesFor.isEmpty() || !this.getInputSizeshNQ4ISI.isEmpty()) && (extensionValue = x509AttributeCertificate.getExtensionValue(org.bouncycastle.asn1.x509.Extension.targetInformation.getId())) != null) {
            try {
                targetsObjects = org.bouncycastle.asn1.x509.TargetInformation.getInstance(new org.bouncycastle.asn1.ASN1InputStream(((org.bouncycastle.asn1.DEROctetString) org.bouncycastle.asn1.DEROctetString.fromByteArray(extensionValue)).getOctets()).readObject()).getTargetsObjects();
                if (!this.getHighSpeedVideoSizesFor.isEmpty()) {
                    boolean z = false;
                    for (org.bouncycastle.asn1.x509.Targets targets : targetsObjects) {
                        org.bouncycastle.asn1.x509.Target[] targets2 = targets.getTargets();
                        int i = 0;
                        while (true) {
                            if (i >= targets2.length) {
                                break;
                            }
                            if (this.getHighSpeedVideoSizesFor.contains(org.bouncycastle.asn1.x509.GeneralName.getInstance(targets2[i].getTargetName()))) {
                                z = true;
                                break;
                            }
                            i++;
                        }
                    }
                    if (!z) {
                        return false;
                    }
                }
            } catch (java.io.IOException | java.lang.IllegalArgumentException unused2) {
            }
            if (!this.getInputSizeshNQ4ISI.isEmpty()) {
                boolean z2 = false;
                for (org.bouncycastle.asn1.x509.Targets targets3 : targetsObjects) {
                    org.bouncycastle.asn1.x509.Target[] targets4 = targets3.getTargets();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= targets4.length) {
                            break;
                        }
                        if (this.getInputSizeshNQ4ISI.contains(org.bouncycastle.asn1.x509.GeneralName.getInstance(targets4[i2].getTargetGroup()))) {
                            z2 = true;
                            break;
                        }
                        i2++;
                    }
                }
                if (!z2) {
                    return false;
                }
            }
        }
        return true;
    }

    public java.util.Collection getTargetNames() {
        return java.util.Collections.unmodifiableCollection(this.getHighSpeedVideoSizesFor);
    }

    public java.util.Collection getTargetGroups() {
        return java.util.Collections.unmodifiableCollection(this.getInputSizeshNQ4ISI);
    }

    public java.math.BigInteger getSerialNumber() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.x509.AttributeCertificateIssuer getIssuer() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.x509.AttributeCertificateHolder getHolder() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public java.util.Date getAttributeCertificateValid() {
        if (this.Camera2StreamConfigurationMap != null) {
            return new java.util.Date(this.Camera2StreamConfigurationMap.getTime());
        }
        return null;
    }

    public org.bouncycastle.x509.X509AttributeCertificate getAttributeCert() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // org.bouncycastle.util.Selector
    public java.lang.Object clone() {
        org.bouncycastle.x509.X509AttributeCertStoreSelector x509AttributeCertStoreSelector = new org.bouncycastle.x509.X509AttributeCertStoreSelector();
        x509AttributeCertStoreSelector.getHighResolutionOutputSizeshNQ4ISI = this.getHighResolutionOutputSizeshNQ4ISI;
        x509AttributeCertStoreSelector.Camera2StreamConfigurationMap = getAttributeCertificateValid();
        x509AttributeCertStoreSelector.getHighSpeedVideoFpsRanges = this.getHighSpeedVideoFpsRanges;
        x509AttributeCertStoreSelector.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRangesFor;
        x509AttributeCertStoreSelector.getHighSpeedVideoSizes = this.getHighSpeedVideoSizes;
        x509AttributeCertStoreSelector.getInputSizeshNQ4ISI = getTargetGroups();
        x509AttributeCertStoreSelector.getHighSpeedVideoSizesFor = getTargetNames();
        return x509AttributeCertStoreSelector;
    }

    public void addTargetName(byte[] bArr) throws java.io.IOException {
        addTargetName(org.bouncycastle.asn1.x509.GeneralName.getInstance(org.bouncycastle.asn1.ASN1Primitive.fromByteArray(bArr)));
    }

    public void addTargetName(org.bouncycastle.asn1.x509.GeneralName generalName) {
        this.getHighSpeedVideoSizesFor.add(generalName);
    }

    public void addTargetGroup(byte[] bArr) throws java.io.IOException {
        addTargetGroup(org.bouncycastle.asn1.x509.GeneralName.getInstance(org.bouncycastle.asn1.ASN1Primitive.fromByteArray(bArr)));
    }

    public void addTargetGroup(org.bouncycastle.asn1.x509.GeneralName generalName) {
        this.getInputSizeshNQ4ISI.add(generalName);
    }

    private static java.util.Set getHighSpeedVideoFpsRanges(java.util.Collection collection) throws java.io.IOException {
        if (collection == null || collection.isEmpty()) {
            return new java.util.HashSet();
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        for (java.lang.Object obj : collection) {
            if (!(obj instanceof org.bouncycastle.asn1.x509.GeneralName)) {
                obj = org.bouncycastle.asn1.x509.GeneralName.getInstance(org.bouncycastle.asn1.ASN1Primitive.fromByteArray((byte[]) obj));
            }
            hashSet.add(obj);
        }
        return hashSet;
    }
}
