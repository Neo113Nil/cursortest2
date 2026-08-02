package org.bouncycastle.cert.selector;

/* loaded from: classes17.dex */
public class X509AttributeCertificateHolderSelectorBuilder {
    private org.bouncycastle.cert.AttributeCertificateIssuer Camera2StreamConfigurationMap;
    private java.math.BigInteger getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.cert.X509AttributeCertificateHolder getHighSpeedVideoFpsRanges;
    private org.bouncycastle.cert.AttributeCertificateHolder getHighSpeedVideoFpsRangesFor;
    private java.util.Date getHighSpeedVideoSizes;
    private java.util.Collection getOutputFormats = new java.util.HashSet();
    private java.util.Collection getHighSpeedVideoSizesFor = new java.util.HashSet();

    public void setTargetNames(java.util.Collection collection) throws java.io.IOException {
        this.getOutputFormats = getHighSpeedVideoSizes(collection);
    }

    public void setTargetGroups(java.util.Collection collection) throws java.io.IOException {
        this.getHighSpeedVideoSizesFor = getHighSpeedVideoSizes(collection);
    }

    public void setSerialNumber(java.math.BigInteger bigInteger) {
        this.getHighResolutionOutputSizeshNQ4ISI = bigInteger;
    }

    public void setIssuer(org.bouncycastle.cert.AttributeCertificateIssuer attributeCertificateIssuer) {
        this.Camera2StreamConfigurationMap = attributeCertificateIssuer;
    }

    public void setHolder(org.bouncycastle.cert.AttributeCertificateHolder attributeCertificateHolder) {
        this.getHighSpeedVideoFpsRangesFor = attributeCertificateHolder;
    }

    public void setAttributeCertificateValid(java.util.Date date) {
        if (date != null) {
            this.getHighSpeedVideoSizes = new java.util.Date(date.getTime());
        } else {
            this.getHighSpeedVideoSizes = null;
        }
    }

    public void setAttributeCert(org.bouncycastle.cert.X509AttributeCertificateHolder x509AttributeCertificateHolder) {
        this.getHighSpeedVideoFpsRanges = x509AttributeCertificateHolder;
    }

    public org.bouncycastle.cert.selector.X509AttributeCertificateHolderSelector build() {
        return new org.bouncycastle.cert.selector.X509AttributeCertificateHolderSelector(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, java.util.Collections.unmodifiableCollection(new java.util.HashSet(this.getOutputFormats)), java.util.Collections.unmodifiableCollection(new java.util.HashSet(this.getHighSpeedVideoSizesFor)));
    }

    public void addTargetName(org.bouncycastle.asn1.x509.GeneralName generalName) {
        this.getOutputFormats.add(generalName);
    }

    public void addTargetGroup(org.bouncycastle.asn1.x509.GeneralName generalName) {
        this.getHighSpeedVideoSizesFor.add(generalName);
    }

    private static java.util.Set getHighSpeedVideoSizes(java.util.Collection collection) throws java.io.IOException {
        if (collection == null || collection.isEmpty()) {
            return new java.util.HashSet();
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            hashSet.add(org.bouncycastle.asn1.x509.GeneralName.getInstance(it.next()));
        }
        return hashSet;
    }
}
