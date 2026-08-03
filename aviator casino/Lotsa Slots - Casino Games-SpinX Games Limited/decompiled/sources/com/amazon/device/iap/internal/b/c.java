package com.amazon.device.iap.internal.b;

/* compiled from: KiwiRequestHandler.java */
/* loaded from: classes2.dex */
public final class c implements com.amazon.device.iap.internal.c {

    /* renamed from: a, reason: collision with root package name */
    private static final java.lang.String f3471a = "c";

    @Override // com.amazon.device.iap.internal.c
    public void a(com.amazon.device.iap.model.RequestId requestId) {
        com.amazon.device.iap.internal.util.e.a(f3471a, "sendGetUserData");
        new com.amazon.device.iap.internal.b.e.a(requestId).e();
    }

    @Override // com.amazon.device.iap.internal.c
    public void a(com.amazon.device.iap.model.RequestId requestId, java.lang.String str) {
        com.amazon.device.iap.internal.util.e.a(f3471a, "sendPurchaseRequest");
        new com.amazon.device.iap.internal.b.b.d(requestId, str).e();
    }

    @Override // com.amazon.device.iap.internal.c
    public void a(com.amazon.device.iap.model.RequestId requestId, java.util.Set<java.lang.String> set) {
        com.amazon.device.iap.internal.util.e.a(f3471a, "sendGetProductDataRequest");
        new com.amazon.device.iap.internal.b.c.d(requestId, set).e();
    }

    @Override // com.amazon.device.iap.internal.c
    public void a(com.amazon.device.iap.model.RequestId requestId, boolean z) {
        com.amazon.device.iap.internal.util.e.a(f3471a, "sendGetPurchaseUpdates");
        new com.amazon.device.iap.internal.b.d.a(requestId, z).e();
    }

    @Override // com.amazon.device.iap.internal.c
    public void a(com.amazon.device.iap.model.RequestId requestId, java.lang.String str, com.amazon.device.iap.model.FulfillmentResult fulfillmentResult) {
        com.amazon.device.iap.internal.util.e.a(f3471a, "sendNotifyFulfillment");
        new com.amazon.device.iap.internal.b.g.b(requestId, str, fulfillmentResult).e();
    }

    @Override // com.amazon.device.iap.internal.c
    public void a(android.content.Context context, android.content.Intent intent) {
        java.lang.String str = f3471a;
        com.amazon.device.iap.internal.util.e.a(str, "handleResponse");
        java.lang.String stringExtra = intent.getStringExtra(com.facebook.internal.ServerProtocol.DIALOG_PARAM_RESPONSE_TYPE);
        if (stringExtra == null) {
            com.amazon.device.iap.internal.util.e.a(str, "Invalid response type: null");
            return;
        }
        com.amazon.device.iap.internal.util.e.a(str, "Found response type: " + stringExtra);
        if ("purchase_response".equals(stringExtra)) {
            new com.amazon.device.iap.internal.b.a.d(com.amazon.device.iap.model.RequestId.fromString(intent.getStringExtra("requestId"))).e();
        }
    }
}
