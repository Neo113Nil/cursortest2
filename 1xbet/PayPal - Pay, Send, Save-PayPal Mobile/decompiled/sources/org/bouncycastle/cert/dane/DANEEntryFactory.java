package org.bouncycastle.cert.dane;

/* loaded from: classes17.dex */
public class DANEEntryFactory {
    private final org.bouncycastle.cert.dane.DANEEntrySelectorFactory getHighSpeedVideoFpsRangesFor;

    public org.bouncycastle.cert.dane.DANEEntry createEntry(java.lang.String str, org.bouncycastle.cert.X509CertificateHolder x509CertificateHolder) throws org.bouncycastle.cert.dane.DANEException {
        return createEntry(str, 3, x509CertificateHolder);
    }

    public org.bouncycastle.cert.dane.DANEEntry createEntry(java.lang.String str, int i, org.bouncycastle.cert.X509CertificateHolder x509CertificateHolder) throws org.bouncycastle.cert.dane.DANEException {
        if (i < 0 || i > 3) {
            throw new org.bouncycastle.cert.dane.DANEException("unknown certificate usage: ".concat(java.lang.String.valueOf(i)));
        }
        return new org.bouncycastle.cert.dane.DANEEntry(this.getHighSpeedVideoFpsRangesFor.createSelector(str).getDomainName(), new byte[]{(byte) i, 0, 0}, x509CertificateHolder);
    }

    public DANEEntryFactory(org.bouncycastle.operator.DigestCalculator digestCalculator) {
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.cert.dane.DANEEntrySelectorFactory(digestCalculator);
    }
}
