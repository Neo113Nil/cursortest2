package com.tiktok.iap.billing.client;

import com.tiktok.iap.billing.GPBillVersions;

/* loaded from: classes7.dex */
public class TTBillingFactory {
    public static IBillingProxy createBillingProxy() {
        if (GPBillVersions.getMajorVersion() == GPBillVersions.GPBillingVer.V5_V8) {
            return new V5_V8BillingProxy();
        }
        return new EmptyBillingProxy();
    }
}
