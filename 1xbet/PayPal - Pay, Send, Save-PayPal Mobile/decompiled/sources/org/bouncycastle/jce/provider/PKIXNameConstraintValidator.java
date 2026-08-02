package org.bouncycastle.jce.provider;

/* loaded from: classes17.dex */
public class PKIXNameConstraintValidator {
    org.bouncycastle.asn1.x509.PKIXNameConstraintValidator getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.x509.PKIXNameConstraintValidator();

    public java.lang.String toString() {
        return this.getHighSpeedVideoFpsRanges.toString();
    }

    public void intersectPermittedSubtree(org.bouncycastle.asn1.x509.GeneralSubtree[] generalSubtreeArr) {
        this.getHighSpeedVideoFpsRanges.intersectPermittedSubtree(generalSubtreeArr);
    }

    public void intersectPermittedSubtree(org.bouncycastle.asn1.x509.GeneralSubtree generalSubtree) {
        this.getHighSpeedVideoFpsRanges.intersectPermittedSubtree(generalSubtree);
    }

    public void intersectEmptyPermittedSubtree(int i) {
        this.getHighSpeedVideoFpsRanges.intersectEmptyPermittedSubtree(i);
    }

    public int hashCode() {
        return this.getHighSpeedVideoFpsRanges.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.jce.provider.PKIXNameConstraintValidator) {
            return this.getHighSpeedVideoFpsRanges.equals(((org.bouncycastle.jce.provider.PKIXNameConstraintValidator) obj).getHighSpeedVideoFpsRanges);
        }
        return false;
    }

    public void checkPermittedDN(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) throws org.bouncycastle.jce.provider.PKIXNameConstraintValidatorException {
        try {
            this.getHighSpeedVideoFpsRanges.checkPermittedDN(org.bouncycastle.asn1.x500.X500Name.getInstance(aSN1Sequence));
        } catch (org.bouncycastle.asn1.x509.NameConstraintValidatorException e) {
            throw new org.bouncycastle.jce.provider.PKIXNameConstraintValidatorException(e.getMessage(), e);
        }
    }

    public void checkPermitted(org.bouncycastle.asn1.x509.GeneralName generalName) throws org.bouncycastle.jce.provider.PKIXNameConstraintValidatorException {
        try {
            this.getHighSpeedVideoFpsRanges.checkPermitted(generalName);
        } catch (org.bouncycastle.asn1.x509.NameConstraintValidatorException e) {
            throw new org.bouncycastle.jce.provider.PKIXNameConstraintValidatorException(e.getMessage(), e);
        }
    }

    public void checkExcludedDN(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) throws org.bouncycastle.jce.provider.PKIXNameConstraintValidatorException {
        try {
            this.getHighSpeedVideoFpsRanges.checkExcludedDN(org.bouncycastle.asn1.x500.X500Name.getInstance(aSN1Sequence));
        } catch (org.bouncycastle.asn1.x509.NameConstraintValidatorException e) {
            throw new org.bouncycastle.jce.provider.PKIXNameConstraintValidatorException(e.getMessage(), e);
        }
    }

    public void checkExcluded(org.bouncycastle.asn1.x509.GeneralName generalName) throws org.bouncycastle.jce.provider.PKIXNameConstraintValidatorException {
        try {
            this.getHighSpeedVideoFpsRanges.checkExcluded(generalName);
        } catch (org.bouncycastle.asn1.x509.NameConstraintValidatorException e) {
            throw new org.bouncycastle.jce.provider.PKIXNameConstraintValidatorException(e.getMessage(), e);
        }
    }

    public void addExcludedSubtree(org.bouncycastle.asn1.x509.GeneralSubtree generalSubtree) {
        this.getHighSpeedVideoFpsRanges.addExcludedSubtree(generalSubtree);
    }
}
