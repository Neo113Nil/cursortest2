package io.appmetrica.analytics.billingv8.impl;

/* loaded from: classes.dex */
public final class m {
    public static void a(java.util.Map map, java.util.Map map2, java.lang.String str, io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager billingInfoManager) {
        long currentTimeMillis = new io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider().currentTimeMillis();
        for (io.appmetrica.analytics.billinginterface.internal.BillingInfo billingInfo : map.values()) {
            if (map2.containsKey(billingInfo.productId)) {
                billingInfo.sendTime = currentTimeMillis;
            } else {
                io.appmetrica.analytics.billinginterface.internal.BillingInfo billingInfo2 = billingInfoManager.get(billingInfo.productId);
                if (billingInfo2 != null) {
                    billingInfo.sendTime = billingInfo2.sendTime;
                }
            }
        }
        billingInfoManager.update(map);
        if (billingInfoManager.isFirstInappCheckOccurred() || !"inapp".equals(str)) {
            return;
        }
        billingInfoManager.markFirstInappCheckOccurred();
    }
}
