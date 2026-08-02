package org.bouncycastle.cert.selector;

/* loaded from: classes17.dex */
public class X509AttributeCertificateHolderSelector implements org.bouncycastle.util.Selector {
    private final java.util.Date Camera2StreamConfigurationMap;
    private final org.bouncycastle.cert.X509AttributeCertificateHolder getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.cert.AttributeCertificateHolder getHighSpeedVideoFpsRanges;
    private final java.math.BigInteger getHighSpeedVideoFpsRangesFor;
    private final org.bouncycastle.cert.AttributeCertificateIssuer getHighSpeedVideoSizes;
    private final java.util.Collection getInputFormats;
    private final java.util.Collection getOutputFormats;

    @Override // org.bouncycastle.util.Selector
    public boolean match(java.lang.Object obj) {
        org.bouncycastle.asn1.x509.Extension extension;
        org.bouncycastle.asn1.x509.Targets[] targetsObjects;
        if (!(obj instanceof org.bouncycastle.cert.X509AttributeCertificateHolder)) {
            return false;
        }
        org.bouncycastle.cert.X509AttributeCertificateHolder x509AttributeCertificateHolder = (org.bouncycastle.cert.X509AttributeCertificateHolder) obj;
        org.bouncycastle.cert.X509AttributeCertificateHolder x509AttributeCertificateHolder2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (x509AttributeCertificateHolder2 != null && !x509AttributeCertificateHolder2.equals(x509AttributeCertificateHolder)) {
            return false;
        }
        if (this.getHighSpeedVideoFpsRangesFor != null && !x509AttributeCertificateHolder.getSerialNumber().equals(this.getHighSpeedVideoFpsRangesFor)) {
            return false;
        }
        if (this.getHighSpeedVideoFpsRanges != null && !x509AttributeCertificateHolder.getHolder().equals(this.getHighSpeedVideoFpsRanges)) {
            return false;
        }
        if (this.getHighSpeedVideoSizes != null && !x509AttributeCertificateHolder.getIssuer().equals(this.getHighSpeedVideoSizes)) {
            return false;
        }
        java.util.Date date = this.Camera2StreamConfigurationMap;
        if (date != null && !x509AttributeCertificateHolder.isValidOn(date)) {
            return false;
        }
        if ((!this.getInputFormats.isEmpty() || !this.getOutputFormats.isEmpty()) && (extension = x509AttributeCertificateHolder.getExtension(org.bouncycastle.asn1.x509.Extension.targetInformation)) != null) {
            try {
                targetsObjects = org.bouncycastle.asn1.x509.TargetInformation.getInstance(extension.getParsedValue()).getTargetsObjects();
                if (!this.getInputFormats.isEmpty()) {
                    boolean z = false;
                    for (org.bouncycastle.asn1.x509.Targets targets : targetsObjects) {
                        org.bouncycastle.asn1.x509.Target[] targets2 = targets.getTargets();
                        int i = 0;
                        while (true) {
                            if (i >= targets2.length) {
                                break;
                            }
                            if (this.getInputFormats.contains(org.bouncycastle.asn1.x509.GeneralName.getInstance(targets2[i].getTargetName()))) {
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
            } catch (java.lang.IllegalArgumentException unused) {
            }
            if (!this.getOutputFormats.isEmpty()) {
                boolean z2 = false;
                for (org.bouncycastle.asn1.x509.Targets targets3 : targetsObjects) {
                    org.bouncycastle.asn1.x509.Target[] targets4 = targets3.getTargets();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= targets4.length) {
                            break;
                        }
                        if (this.getOutputFormats.contains(org.bouncycastle.asn1.x509.GeneralName.getInstance(targets4[i2].getTargetGroup()))) {
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
        return this.getInputFormats;
    }

    public java.util.Collection getTargetGroups() {
        return this.getOutputFormats;
    }

    public java.math.BigInteger getSerialNumber() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.cert.AttributeCertificateIssuer getIssuer() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.cert.AttributeCertificateHolder getHolder() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public java.util.Date getAttributeCertificateValid() {
        if (this.Camera2StreamConfigurationMap != null) {
            return new java.util.Date(this.Camera2StreamConfigurationMap.getTime());
        }
        return null;
    }

    public org.bouncycastle.cert.X509AttributeCertificateHolder getAttributeCert() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // org.bouncycastle.util.Selector
    public java.lang.Object clone() {
        return new org.bouncycastle.cert.selector.X509AttributeCertificateHolderSelector(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getInputFormats, this.getOutputFormats);
    }

    X509AttributeCertificateHolderSelector(org.bouncycastle.cert.AttributeCertificateHolder attributeCertificateHolder, org.bouncycastle.cert.AttributeCertificateIssuer attributeCertificateIssuer, java.math.BigInteger bigInteger, java.util.Date date, org.bouncycastle.cert.X509AttributeCertificateHolder x509AttributeCertificateHolder, java.util.Collection collection, java.util.Collection collection2) {
        this.getHighSpeedVideoFpsRanges = attributeCertificateHolder;
        this.getHighSpeedVideoSizes = attributeCertificateIssuer;
        this.getHighSpeedVideoFpsRangesFor = bigInteger;
        this.Camera2StreamConfigurationMap = date;
        this.getHighResolutionOutputSizeshNQ4ISI = x509AttributeCertificateHolder;
        this.getInputFormats = collection;
        this.getOutputFormats = collection2;
    }
}
