package com.amazon.device.iap.internal;

/* compiled from: PurchasingManager.java */
/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static java.lang.String f3489a = "d";
    private static java.lang.String b = "sku";
    private static com.amazon.device.iap.internal.d c = new com.amazon.device.iap.internal.d();
    private final com.amazon.device.iap.internal.c d = com.amazon.device.iap.internal.e.b();
    private android.content.Context e;
    private com.amazon.device.iap.PurchasingListener f;

    private d() {
    }

    public com.amazon.device.iap.PurchasingListener a() {
        return this.f;
    }

    public android.content.Context b() {
        return this.e;
    }

    private void e() {
        if (this.f == null) {
            throw new java.lang.IllegalStateException("You must register a PurchasingListener before invoking this operation");
        }
    }

    public void a(android.content.Context context, com.amazon.device.iap.PurchasingListener purchasingListener) {
        com.amazon.device.iap.internal.util.e.a(f3489a, "PurchasingListener registered: " + purchasingListener);
        com.amazon.device.iap.internal.util.e.a(f3489a, "PurchasingListener Context: " + context);
        if (purchasingListener == null || context == null) {
            throw new java.lang.IllegalArgumentException("Neither PurchasingListener or its Context can be null");
        }
        this.e = context.getApplicationContext();
        this.f = purchasingListener;
    }

    public com.amazon.device.iap.model.RequestId c() {
        e();
        com.amazon.device.iap.model.RequestId requestId = new com.amazon.device.iap.model.RequestId();
        this.d.a(requestId);
        return requestId;
    }

    public com.amazon.device.iap.model.RequestId a(java.lang.String str) {
        com.amazon.device.iap.internal.util.d.a((java.lang.Object) str, b);
        e();
        com.amazon.device.iap.model.RequestId requestId = new com.amazon.device.iap.model.RequestId();
        this.d.a(requestId, str);
        return requestId;
    }

    public com.amazon.device.iap.model.RequestId a(java.util.Set<java.lang.String> set) {
        com.amazon.device.iap.internal.util.d.a((java.lang.Object) set, "skus");
        com.amazon.device.iap.internal.util.d.a((java.util.Collection<? extends java.lang.Object>) set, "skus");
        java.util.Iterator<java.lang.String> it = set.iterator();
        while (it.hasNext()) {
            if (it.next().trim().length() == 0) {
                throw new java.lang.IllegalArgumentException("Empty SKU values are not allowed");
            }
        }
        if (set.size() > 100) {
            throw new java.lang.IllegalArgumentException(set.size() + " SKUs were provided, but no more than 100 SKUs are allowed");
        }
        e();
        com.amazon.device.iap.model.RequestId requestId = new com.amazon.device.iap.model.RequestId();
        this.d.a(requestId, new java.util.LinkedHashSet(set));
        return requestId;
    }

    public com.amazon.device.iap.model.RequestId a(boolean z) {
        e();
        com.amazon.device.iap.model.RequestId requestId = new com.amazon.device.iap.model.RequestId();
        this.d.a(requestId, z);
        return requestId;
    }

    public void a(java.lang.String str, com.amazon.device.iap.model.FulfillmentResult fulfillmentResult) {
        if (com.amazon.device.iap.internal.util.d.a(str)) {
            throw new java.lang.IllegalArgumentException("Empty receiptId is not allowed");
        }
        com.amazon.device.iap.internal.util.d.a(fulfillmentResult, "fulfillmentResult");
        e();
        this.d.a(new com.amazon.device.iap.model.RequestId(), str, fulfillmentResult);
    }

    public void a(android.content.Context context, android.content.Intent intent) {
        try {
            this.d.a(context, intent);
        } catch (java.lang.Exception e) {
            com.amazon.device.iap.internal.util.e.b(f3489a, "Error in onReceive: " + e);
        }
    }

    public static com.amazon.device.iap.internal.d d() {
        return c;
    }
}
