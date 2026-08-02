package org.bouncycastle.cert.dane;

/* loaded from: classes17.dex */
public class DANEEntryStoreBuilder {
    private final org.bouncycastle.cert.dane.DANEEntryFetcherFactory getHighSpeedVideoFpsRangesFor;

    public org.bouncycastle.cert.dane.DANEEntryStore build(java.lang.String str) throws org.bouncycastle.cert.dane.DANEException {
        return new org.bouncycastle.cert.dane.DANEEntryStore(this.getHighSpeedVideoFpsRangesFor.build(str).getEntries());
    }

    public DANEEntryStoreBuilder(org.bouncycastle.cert.dane.DANEEntryFetcherFactory dANEEntryFetcherFactory) {
        this.getHighSpeedVideoFpsRangesFor = dANEEntryFetcherFactory;
    }
}
