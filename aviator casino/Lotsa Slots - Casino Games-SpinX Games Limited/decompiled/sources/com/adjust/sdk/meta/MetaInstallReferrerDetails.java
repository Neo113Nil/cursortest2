package com.adjust.sdk.meta;

/* loaded from: classes2.dex */
public class MetaInstallReferrerDetails {
    public long actualTimestampInSec;
    public java.lang.String installReferrer;
    public boolean isClick;

    MetaInstallReferrerDetails(java.lang.String str, long j, boolean z) {
        this.installReferrer = str;
        this.actualTimestampInSec = j;
        this.isClick = z;
    }

    public java.lang.String toString() {
        return com.adjust.sdk.Util.formatString(" installReferrer : %s actualTimestampInSec : %d isClick : %b", this.installReferrer, java.lang.Long.valueOf(this.actualTimestampInSec), java.lang.Boolean.valueOf(this.isClick));
    }
}
