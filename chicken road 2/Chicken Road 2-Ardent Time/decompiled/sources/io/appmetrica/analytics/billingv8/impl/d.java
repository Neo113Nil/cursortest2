package io.appmetrica.analytics.billingv8.impl;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final com.android.billingclient.api.BillingClient f3611a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedHashSet f3612b = new java.util.LinkedHashSet();

    public d(com.android.billingclient.api.BillingClient billingClient) {
        this.f3611a = billingClient;
    }

    public final void a(java.lang.Object obj) {
        this.f3612b.remove(obj);
        if (this.f3612b.size() == 0) {
            this.f3611a.endConnection();
        }
    }
}
