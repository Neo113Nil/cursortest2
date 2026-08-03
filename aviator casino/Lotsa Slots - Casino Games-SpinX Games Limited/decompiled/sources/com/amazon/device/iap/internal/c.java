package com.amazon.device.iap.internal;

/* compiled from: RequestHandler.java */
/* loaded from: classes2.dex */
public interface c {
    void a(android.content.Context context, android.content.Intent intent);

    void a(com.amazon.device.iap.model.RequestId requestId);

    void a(com.amazon.device.iap.model.RequestId requestId, java.lang.String str);

    void a(com.amazon.device.iap.model.RequestId requestId, java.lang.String str, com.amazon.device.iap.model.FulfillmentResult fulfillmentResult);

    void a(com.amazon.device.iap.model.RequestId requestId, java.util.Set<java.lang.String> set);

    void a(com.amazon.device.iap.model.RequestId requestId, boolean z);
}
