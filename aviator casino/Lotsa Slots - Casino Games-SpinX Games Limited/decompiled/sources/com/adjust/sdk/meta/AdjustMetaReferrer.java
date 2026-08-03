package com.adjust.sdk.meta;

/* loaded from: classes2.dex */
public class AdjustMetaReferrer {
    static boolean shouldReadMetaReferrer = true;

    public static void getMetaInstallReferrer(final android.content.Context context, final java.lang.String str, final com.adjust.sdk.meta.OnMetaInstallReferrerReadListener onMetaInstallReferrerReadListener) {
        if (onMetaInstallReferrerReadListener == null) {
            com.adjust.sdk.AdjustFactory.getLogger().error("onMetaInstallReferrerReadListener can not be null", new java.lang.Object[0]);
        } else {
            new com.adjust.sdk.scheduler.AsyncTaskExecutor<android.content.Context, com.adjust.sdk.meta.MetaInstallReferrerResult>() { // from class: com.adjust.sdk.meta.AdjustMetaReferrer.1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.adjust.sdk.scheduler.AsyncTaskExecutor
                public com.adjust.sdk.meta.MetaInstallReferrerResult doInBackground(android.content.Context[] contextArr) {
                    try {
                        return com.adjust.sdk.meta.MetaReferrerClient.getMetaInstallReferrer(context, str, com.adjust.sdk.AdjustFactory.getLogger(), false);
                    } catch (java.lang.Exception e) {
                        return new com.adjust.sdk.meta.MetaInstallReferrerResult(e.getMessage());
                    }
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.adjust.sdk.scheduler.AsyncTaskExecutor
                public void onPostExecute(com.adjust.sdk.meta.MetaInstallReferrerResult metaInstallReferrerResult) {
                    if (metaInstallReferrerResult != null) {
                        if (metaInstallReferrerResult.metaInstallReferrerDetails != null) {
                            onMetaInstallReferrerReadListener.onInstallReferrerDetailsRead(metaInstallReferrerResult.metaInstallReferrerDetails);
                            return;
                        } else if (metaInstallReferrerResult.error != null) {
                            onMetaInstallReferrerReadListener.onFail(metaInstallReferrerResult.error);
                            return;
                        } else {
                            onMetaInstallReferrerReadListener.onFail("Meta Install Referrer details null");
                            return;
                        }
                    }
                    onMetaInstallReferrerReadListener.onFail("Meta Install Referrer result null");
                }
            }.execute(context);
        }
    }

    public static void readMetaReferrer(android.content.Context context) {
        shouldReadMetaReferrer = true;
    }

    public static void doNotReadMetaReferrer() {
        shouldReadMetaReferrer = false;
    }
}
