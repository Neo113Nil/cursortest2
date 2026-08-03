package io.appmetrica.analytics.billingv6.impl;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final com.android.billingclient.api.BillingClient f3558a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedHashSet f3559b = new java.util.LinkedHashSet();

    public d(com.android.billingclient.api.BillingClient billingClient) {
        this.f3558a = billingClient;
    }

    public final void a(java.lang.Object obj) {
        this.f3559b.remove(obj);
        if (this.f3559b.size() == 0) {
            this.f3558a.endConnection();
        }
    }
}
