package com.adjust.sdk.meta;

/* loaded from: classes2.dex */
public class MetaReferrerClient {
    private static final java.lang.String COLUMN_ACTUAL_TIMESTAMP = "actual_timestamp";
    private static final java.lang.String COLUMN_INSTALL_REFERRER = "install_referrer";
    private static final java.lang.String COLUMN_IS_CT = "is_ct";
    private static final java.lang.String FACEBOOK_REFERRER_PROVIDER_AUTHORITY = "com.facebook.katana.provider.InstallReferrerProvider";
    private static final java.lang.String FBLITE_REFERRER_PROVIDER_AUTHORITY = "com.facebook.lite.provider.InstallReferrerProvider";
    private static final java.lang.String INSTAGRAM_REFERRER_PROVIDER_AUTHORITY = "com.instagram.contentprovider.InstallReferrerProvider";
    private static final java.util.concurrent.atomic.AtomicBoolean shouldTryToRead = new java.util.concurrent.atomic.AtomicBoolean(true);

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0101, code lost:
    
        if (r11 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0103, code lost:
    
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x014e, code lost:
    
        return new com.adjust.sdk.meta.MetaInstallReferrerResult(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0146, code lost:
    
        if (0 == 0) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.adjust.sdk.meta.MetaInstallReferrerResult getMetaInstallReferrer(android.content.Context context, java.lang.String str, com.adjust.sdk.ILogger iLogger, boolean z) {
        java.lang.String str2;
        android.net.Uri parse;
        if (z && !shouldTryToRead.get()) {
            iLogger.debug("Shouldn't try to read Meta Install referrer", new java.lang.Object[0]);
            return new com.adjust.sdk.meta.MetaInstallReferrerResult("Shouldn't try to read Meta Install referrer");
        }
        if (android.text.TextUtils.isEmpty(str)) {
            iLogger.debug("Can't read Meta Install referrer with null or empty FBAppId", new java.lang.Object[0]);
            return new com.adjust.sdk.meta.MetaInstallReferrerResult("Can't read Meta Install referrer with null or empty FBAppId");
        }
        android.database.Cursor cursor = null;
        try {
            try {
                if (resolveContentProvider(context, FACEBOOK_REFERRER_PROVIDER_AUTHORITY)) {
                    parse = android.net.Uri.parse("content://com.facebook.katana.provider.InstallReferrerProvider/" + str);
                } else if (resolveContentProvider(context, INSTAGRAM_REFERRER_PROVIDER_AUTHORITY)) {
                    parse = android.net.Uri.parse("content://com.instagram.contentprovider.InstallReferrerProvider/" + str);
                } else {
                    if (!resolveContentProvider(context, FBLITE_REFERRER_PROVIDER_AUTHORITY)) {
                        iLogger.debug("Failed to find Meta Install Referrer content provider", new java.lang.Object[0]);
                        return new com.adjust.sdk.meta.MetaInstallReferrerResult("Failed to find Meta Install Referrer content provider");
                    }
                    parse = android.net.Uri.parse("content://com.facebook.lite.provider.InstallReferrerProvider/" + str);
                }
                cursor = context.getContentResolver().query(parse, new java.lang.String[]{"install_referrer", COLUMN_IS_CT, COLUMN_ACTUAL_TIMESTAMP}, null, null, null);
                if (cursor != null && cursor.moveToFirst()) {
                    int columnIndex = cursor.getColumnIndex("install_referrer");
                    int columnIndex2 = cursor.getColumnIndex(COLUMN_ACTUAL_TIMESTAMP);
                    int columnIndex3 = cursor.getColumnIndex(COLUMN_IS_CT);
                    java.lang.String string = cursor.getString(columnIndex);
                    long j = cursor.getLong(columnIndex2);
                    boolean z2 = cursor.getInt(columnIndex3) == 1;
                    iLogger.debug("InstallReferrerMeta reads installReferrer[%s] actualTimestampInSec[%d] isClick[%b]", string, java.lang.Long.valueOf(j), java.lang.Boolean.valueOf(z2));
                    if (isValidReferrer(string)) {
                        shouldTryToRead.set(false);
                        return new com.adjust.sdk.meta.MetaInstallReferrerResult(new com.adjust.sdk.meta.MetaInstallReferrerDetails(string, j, z2));
                    }
                    str2 = "Invalid Meta Install Referrer";
                    iLogger.debug("Invalid Meta Install Referrer", new java.lang.Object[0]);
                }
                java.lang.String formatString = com.adjust.sdk.Util.formatString("Fail to read Meta Install Referrer for FB AppId [%s]", str);
                iLogger.debug(formatString, new java.lang.Object[0]);
                com.adjust.sdk.meta.MetaInstallReferrerResult metaInstallReferrerResult = new com.adjust.sdk.meta.MetaInstallReferrerResult(formatString);
                if (cursor != null) {
                    cursor.close();
                }
                return metaInstallReferrerResult;
            } catch (java.lang.Exception e) {
                str2 = "Meta Install Referrer error " + e.getMessage();
                iLogger.debug(str2, new java.lang.Object[0]);
            }
        } finally {
            if (0 != 0) {
                cursor.close();
            }
        }
    }

    private static boolean resolveContentProvider(android.content.Context context, java.lang.String str) {
        try {
            return context.getPackageManager().resolveContentProvider(str, 0) != null;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    private static boolean isValidReferrer(java.lang.String str) {
        return (str == null || str.isEmpty()) ? false : true;
    }
}
