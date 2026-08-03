package com.adjust.sdk.oaid;

/* loaded from: classes2.dex */
public class HmsSdkClient {
    public static com.adjust.sdk.oaid.OaidInfo getOaidInfo(final android.content.Context context, final com.adjust.sdk.ILogger iLogger, long j) {
        try {
            java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(new java.util.concurrent.Callable<com.adjust.sdk.oaid.OaidInfo>() { // from class: com.adjust.sdk.oaid.HmsSdkClient.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public com.adjust.sdk.oaid.OaidInfo call() {
                    try {
                        com.huawei.hms.ads.identifier.AdvertisingIdClient.Info advertisingIdInfo = com.huawei.hms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(context);
                        if (advertisingIdInfo != null) {
                            return new com.adjust.sdk.oaid.OaidInfo(advertisingIdInfo.getId(), !advertisingIdInfo.isLimitAdTrackingEnabled());
                        }
                        return null;
                    } catch (java.lang.Exception e) {
                        iLogger.error("Exception while reading oaid using hms %s", e.getMessage());
                        return null;
                    }
                }
            });
            new java.lang.Thread(futureTask).start();
            return (com.adjust.sdk.oaid.OaidInfo) futureTask.get(j, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.Throwable th) {
            iLogger.error("Fail to read oaid info using hms, %s", th.getMessage());
            return null;
        }
    }
}
