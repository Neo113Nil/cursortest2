package com.adjust.sdk.oaid;

/* loaded from: classes2.dex */
public class AdjustOaid {
    static boolean isMsaSdkAvailable = false;
    static boolean isOaidToBeRead = false;

    public static void readOaid() {
        isOaidToBeRead = true;
    }

    public static void readOaid(android.content.Context context) {
        com.adjust.sdk.ILogger logger = com.adjust.sdk.AdjustFactory.getLogger();
        readOaid();
        try {
            java.lang.System.loadLibrary("msaoaidsec");
            isMsaSdkAvailable = com.bun.miitmdid.core.MdidSdkHelper.InitCert(context, com.adjust.sdk.oaid.Util.readCertFromAssetFile(context, logger));
        } catch (java.lang.Throwable th) {
            isMsaSdkAvailable = false;
            logger.debug(com.adjust.sdk.Constants.LOGTAG, "Error during msa sdk initialization " + th.getMessage());
        }
    }

    public static void getOaid(final android.content.Context context, final com.adjust.sdk.oaid.OnOaidReadListener onOaidReadListener) {
        final com.adjust.sdk.ILogger logger = com.adjust.sdk.AdjustFactory.getLogger();
        if (onOaidReadListener == null) {
            logger.error("onOaidReadListener cannot be null", new java.lang.Object[0]);
        } else if (context == null) {
            logger.error("context cannot be null", new java.lang.Object[0]);
        } else {
            new com.adjust.sdk.scheduler.AsyncTaskExecutor<android.content.Context, com.adjust.sdk.oaid.OaidResult>() { // from class: com.adjust.sdk.oaid.AdjustOaid.1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.adjust.sdk.scheduler.AsyncTaskExecutor
                public com.adjust.sdk.oaid.OaidResult doInBackground(android.content.Context[] contextArr) {
                    com.adjust.sdk.oaid.AdjustOaid.readOaid(context);
                    com.adjust.sdk.oaid.OaidResult oaidResult = new com.adjust.sdk.oaid.OaidResult();
                    java.util.Map<java.lang.String, java.lang.String> oaidParameters = com.adjust.sdk.oaid.Util.getOaidParameters(context, logger);
                    if (oaidParameters != null && oaidParameters.get("oaid") != null) {
                        oaidResult.oaid = oaidParameters.get("oaid");
                    } else {
                        oaidResult.error = "Failed to read OAID";
                    }
                    return oaidResult;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.adjust.sdk.scheduler.AsyncTaskExecutor
                public void onPostExecute(com.adjust.sdk.oaid.OaidResult oaidResult) {
                    if (oaidResult.oaid != null) {
                        onOaidReadListener.onOaidRead(oaidResult.oaid);
                    } else {
                        onOaidReadListener.onFail(oaidResult.error);
                    }
                }
            }.execute(context);
        }
    }

    public static void doNotReadOaid() {
        isOaidToBeRead = false;
    }
}
