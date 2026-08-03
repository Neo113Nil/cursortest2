package com.adjust.sdk.meta;

/* loaded from: classes2.dex */
public class MetaInstallReferrerResult {
    public java.lang.String error;
    public com.adjust.sdk.meta.MetaInstallReferrerDetails metaInstallReferrerDetails;

    MetaInstallReferrerResult(com.adjust.sdk.meta.MetaInstallReferrerDetails metaInstallReferrerDetails) {
        this.metaInstallReferrerDetails = metaInstallReferrerDetails;
    }

    public MetaInstallReferrerResult(java.lang.String str) {
        this.error = str;
    }
}
