package org.bouncycastle.cert.dane;

/* loaded from: classes17.dex */
public class DANECertificateFetcher {
    private final org.bouncycastle.cert.dane.DANEEntryFetcherFactory Camera2StreamConfigurationMap;
    private final org.bouncycastle.cert.dane.DANEEntrySelectorFactory getHighResolutionOutputSizeshNQ4ISI;

    public java.util.List fetch(java.lang.String str) throws org.bouncycastle.cert.dane.DANEException {
        org.bouncycastle.cert.dane.DANEEntrySelector createSelector = this.getHighResolutionOutputSizeshNQ4ISI.createSelector(str);
        java.util.List<org.bouncycastle.cert.dane.DANEEntry> entries = this.Camera2StreamConfigurationMap.build(createSelector.getDomainName()).getEntries();
        java.util.ArrayList arrayList = new java.util.ArrayList(entries.size());
        for (org.bouncycastle.cert.dane.DANEEntry dANEEntry : entries) {
            if (createSelector.match(dANEEntry)) {
                arrayList.add(dANEEntry.getCertificate());
            }
        }
        return java.util.Collections.unmodifiableList(arrayList);
    }

    public DANECertificateFetcher(org.bouncycastle.cert.dane.DANEEntryFetcherFactory dANEEntryFetcherFactory, org.bouncycastle.operator.DigestCalculator digestCalculator) {
        this.Camera2StreamConfigurationMap = dANEEntryFetcherFactory;
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.cert.dane.DANEEntrySelectorFactory(digestCalculator);
    }
}
