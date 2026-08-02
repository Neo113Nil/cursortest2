package org.bouncycastle.cert.dane;

/* loaded from: classes17.dex */
public class DANEEntrySelector implements org.bouncycastle.util.Selector {
    private final java.lang.String getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.util.Selector
    public java.lang.Object clone() {
        return this;
    }

    @Override // org.bouncycastle.util.Selector
    public boolean match(java.lang.Object obj) {
        return ((org.bouncycastle.cert.dane.DANEEntry) obj).getDomainName().equals(this.getHighSpeedVideoFpsRangesFor);
    }

    public java.lang.String getDomainName() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    DANEEntrySelector(java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor = str;
    }
}
