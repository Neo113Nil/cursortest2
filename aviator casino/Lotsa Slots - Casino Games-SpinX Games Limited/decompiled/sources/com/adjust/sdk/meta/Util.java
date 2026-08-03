package com.adjust.sdk.meta;

/* loaded from: classes2.dex */
public class Util {
    public static synchronized com.adjust.sdk.ReferrerDetails getMetaInstallReferrerDetails(android.content.Context context, java.lang.String str, com.adjust.sdk.ILogger iLogger) {
        synchronized (com.adjust.sdk.meta.Util.class) {
            if (!com.adjust.sdk.meta.AdjustMetaReferrer.shouldReadMetaReferrer) {
                return null;
            }
            iLogger.info("getMetaInstallReferrerDetails invoked", new java.lang.Object[0]);
            com.adjust.sdk.meta.MetaInstallReferrerResult metaInstallReferrer = com.adjust.sdk.meta.MetaReferrerClient.getMetaInstallReferrer(context, str, iLogger, true);
            if (metaInstallReferrer == null) {
                return null;
            }
            if (metaInstallReferrer.metaInstallReferrerDetails == null) {
                return null;
            }
            com.adjust.sdk.meta.MetaInstallReferrerDetails metaInstallReferrerDetails = metaInstallReferrer.metaInstallReferrerDetails;
            return new com.adjust.sdk.ReferrerDetails(metaInstallReferrerDetails.installReferrer, metaInstallReferrerDetails.actualTimestampInSec, java.lang.Boolean.valueOf(metaInstallReferrerDetails.isClick));
        }
    }
}
