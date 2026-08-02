package com.adjust.sdk;

/* loaded from: classes7.dex */
public class GooglePlayInstallReferrerDetails {
    public java.lang.Boolean googlePlayInstant;
    public long installBeginTimestampSeconds;
    public long installBeginTimestampServerSeconds;
    public java.lang.String installReferrer;
    public java.lang.String installVersion;
    public long referrerClickTimestampSeconds;
    public long referrerClickTimestampServerSeconds;

    public GooglePlayInstallReferrerDetails(com.adjust.sdk.ReferrerDetails referrerDetails) {
        if (referrerDetails == null) {
            return;
        }
        this.installReferrer = referrerDetails.installReferrer;
        this.referrerClickTimestampSeconds = referrerDetails.referrerClickTimestampSeconds;
        this.installBeginTimestampSeconds = referrerDetails.installBeginTimestampSeconds;
        this.referrerClickTimestampServerSeconds = referrerDetails.referrerClickTimestampServerSeconds;
        this.installBeginTimestampServerSeconds = referrerDetails.installBeginTimestampServerSeconds;
        this.installVersion = referrerDetails.installVersion;
        this.googlePlayInstant = referrerDetails.googlePlayInstant;
    }

    public java.lang.String toString() {
        java.lang.String str = this.installReferrer;
        long j = this.referrerClickTimestampSeconds;
        long j2 = this.installBeginTimestampSeconds;
        long j3 = this.referrerClickTimestampServerSeconds;
        long j4 = this.installBeginTimestampServerSeconds;
        return com.adjust.sdk.Util.formatString(" installReferrer : %s referrerClickTimestampSeconds : %d installBeginTimestampSeconds : %d referrerClickTimestampServerSeconds : %d installBeginTimestampServerSeconds : %d installVersion : %s googlePlayInstant : %s", str, java.lang.Long.valueOf(j), java.lang.Long.valueOf(j2), java.lang.Long.valueOf(j3), java.lang.Long.valueOf(j4), this.installVersion, this.googlePlayInstant);
    }
}
