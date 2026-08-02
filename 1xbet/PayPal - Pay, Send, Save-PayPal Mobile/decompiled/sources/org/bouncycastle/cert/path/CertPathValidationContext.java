package org.bouncycastle.cert.path;

/* loaded from: classes17.dex */
public class CertPathValidationContext implements org.bouncycastle.util.Memoable {
    private boolean Camera2StreamConfigurationMap;
    private java.util.Set getHighResolutionOutputSizeshNQ4ISI = new java.util.HashSet();
    private java.util.Set getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.util.Memoable
    public org.bouncycastle.util.Memoable copy() {
        return null;
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(org.bouncycastle.util.Memoable memoable) {
    }

    public void setIsEndEntity(boolean z) {
        this.Camera2StreamConfigurationMap = z;
    }

    public boolean isEndEntity() {
        return this.Camera2StreamConfigurationMap;
    }

    public java.util.Set getUnhandledCriticalExtensionOIDs() {
        java.util.HashSet hashSet = new java.util.HashSet(this.getHighSpeedVideoFpsRangesFor);
        hashSet.removeAll(this.getHighResolutionOutputSizeshNQ4ISI);
        return hashSet;
    }

    public void addHandledExtension(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.getHighResolutionOutputSizeshNQ4ISI.add(aSN1ObjectIdentifier);
    }

    public CertPathValidationContext(java.util.Set set) {
        this.getHighSpeedVideoFpsRangesFor = set;
    }
}
