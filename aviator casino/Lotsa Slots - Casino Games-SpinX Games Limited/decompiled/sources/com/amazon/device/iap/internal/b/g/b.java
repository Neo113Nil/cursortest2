package com.amazon.device.iap.internal.b.g;

/* compiled from: NotifyFulfillmentRequest.java */
/* loaded from: classes2.dex */
public final class b extends com.amazon.device.iap.internal.b.e {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f3481a;
    private final com.amazon.device.iap.model.FulfillmentResult b;

    @Override // com.amazon.device.iap.internal.b.e
    public void a() {
    }

    public b(com.amazon.device.iap.model.RequestId requestId, java.lang.String str, com.amazon.device.iap.model.FulfillmentResult fulfillmentResult) {
        super(requestId);
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(str);
        this.f3481a = str;
        this.b = fulfillmentResult;
        a((com.amazon.device.iap.internal.b.i) new com.amazon.device.iap.internal.b.g.a(this, hashSet, fulfillmentResult.toString()));
    }

    @Override // com.amazon.device.iap.internal.b.e
    public void b() {
        java.lang.String c;
        if ((com.amazon.device.iap.model.FulfillmentResult.FULFILLED == this.b || com.amazon.device.iap.model.FulfillmentResult.UNAVAILABLE == this.b) && (c = com.amazon.device.iap.internal.c.a.a().c(this.f3481a)) != null) {
            new com.amazon.device.iap.internal.b.f.b(this, c).a_();
            com.amazon.device.iap.internal.c.a.a().a(this.f3481a);
        }
    }
}
