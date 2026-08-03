package com.adjust.sdk.oaid;

/* loaded from: classes2.dex */
public class MsaSdkClient {
    public static com.adjust.sdk.oaid.OaidInfo getOaidInfo(android.content.Context context, final com.adjust.sdk.ILogger iLogger, long j) {
        final java.util.concurrent.LinkedBlockingQueue linkedBlockingQueue = new java.util.concurrent.LinkedBlockingQueue(1);
        try {
            if (isError(com.bun.miitmdid.core.MdidSdkHelper.InitSdk(context, false, new com.bun.miitmdid.interfaces.IIdentifierListener() { // from class: com.adjust.sdk.oaid.MsaSdkClient.1
                public void onSupport(com.bun.miitmdid.interfaces.IdSupplier idSupplier) {
                    if (idSupplier != null) {
                        try {
                            if (idSupplier.getOAID() != null) {
                                linkedBlockingQueue.offer(new com.adjust.sdk.oaid.OaidInfo(idSupplier.getOAID(), !idSupplier.isLimited()));
                            }
                        } catch (java.lang.Exception e) {
                            iLogger.error("Fail to add %s", e.getMessage());
                            return;
                        }
                    }
                    linkedBlockingQueue.offer(new com.adjust.sdk.oaid.OaidInfo(null, false));
                }
            }), iLogger)) {
                return null;
            }
            return (com.adjust.sdk.oaid.OaidInfo) linkedBlockingQueue.poll(j, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.InterruptedException e) {
            iLogger.error("Waiting to read oaid from callback interrupted: %s", e.getMessage());
            return null;
        } catch (java.lang.NoClassDefFoundError e2) {
            iLogger.error("Couldn't find msa sdk " + e2.getMessage(), new java.lang.Object[0]);
            return null;
        } catch (java.lang.Throwable th) {
            iLogger.error("Oaid reading process failed %s", th.getMessage());
            return null;
        }
    }

    private static boolean isError(int i, com.adjust.sdk.ILogger iLogger) {
        switch (i) {
            case 1008611:
                iLogger.error("msa sdk error - INIT_ERROR_MANUFACTURER_NOSUPPORT", new java.lang.Object[0]);
                return true;
            case 1008612:
                iLogger.error("msa sdk error - INIT_ERROR_DEVICE_NOSUPPORT", new java.lang.Object[0]);
                return true;
            case 1008613:
                iLogger.error("msa sdk error - INIT_ERROR_LOAD_CONFIGFILE", new java.lang.Object[0]);
                return true;
            case 1008614:
            default:
                return false;
            case 1008615:
                iLogger.error("msa sdk error - INIT_ERROR_SDK_CALL_ERROR", new java.lang.Object[0]);
                return true;
            case 1008616:
                iLogger.error("msa sdk error - INIT_ERROR_CERT_ERROR", new java.lang.Object[0]);
                return true;
        }
    }
}
