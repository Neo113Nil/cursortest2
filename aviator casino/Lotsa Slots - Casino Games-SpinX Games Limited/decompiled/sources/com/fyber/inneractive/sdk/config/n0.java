package com.fyber.inneractive.sdk.config;

/* loaded from: classes3.dex */
public abstract class n0 {
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(android.content.Context context, com.fyber.inneractive.sdk.config.w wVar) {
        boolean z;
        java.lang.String str = null;
        try {
            com.google.android.gms.ads.identifier.AdvertisingIdClient.Info advertisingIdInfo = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(context);
            z = advertisingIdInfo.isLimitAdTrackingEnabled();
            try {
                com.fyber.inneractive.sdk.util.IAlog.e("limit ad tracking: %s", java.lang.Boolean.valueOf(z));
                if (z) {
                    com.fyber.inneractive.sdk.util.IAlog.e("user has opt out of Ads Personalization. not accessing Advertising ID.", new java.lang.Object[0]);
                } else {
                    str = advertisingIdInfo.getId();
                    com.fyber.inneractive.sdk.util.IAlog.e("advertising id: %s", str);
                }
            } catch (java.lang.Throwable th) {
                th = th;
                com.fyber.inneractive.sdk.util.IAlog.e("Handled Exception:", new java.lang.Object[0]);
                com.fyber.inneractive.sdk.util.IAlog.e(com.fyber.inneractive.sdk.util.v.b(th), new java.lang.Object[0]);
                com.fyber.inneractive.sdk.util.IAlog.c("Advertising ID is not available. Please add Google Play Services library to improve your ad targeting.", new java.lang.Object[0]);
                synchronized (wVar) {
                }
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            z = false;
        }
        synchronized (wVar) {
            com.fyber.inneractive.sdk.config.v vVar = wVar.b;
            vVar.f3641a = str;
            vVar.b = z;
            vVar.c = false;
        }
    }
}
