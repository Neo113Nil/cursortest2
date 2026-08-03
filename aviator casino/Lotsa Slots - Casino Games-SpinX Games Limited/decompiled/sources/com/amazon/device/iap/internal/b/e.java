package com.amazon.device.iap.internal.b;

/* compiled from: KiwiRequest.java */
/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static final java.lang.String f3475a = "e";
    private final com.amazon.device.iap.model.RequestId b;
    private final com.amazon.device.iap.internal.b.h c = new com.amazon.device.iap.internal.b.h();
    private com.amazon.device.iap.internal.b.i d = null;

    public void a() {
    }

    public void b() {
    }

    public e(com.amazon.device.iap.model.RequestId requestId) {
        this.b = requestId;
    }

    protected void a(com.amazon.device.iap.internal.b.i iVar) {
        this.d = iVar;
    }

    protected void a(java.lang.Object obj) {
        a(obj, null);
    }

    protected void a(final java.lang.Object obj, final com.amazon.device.iap.internal.b.i iVar) {
        com.amazon.device.iap.internal.util.d.a(obj, com.ironsource.Ve.n);
        android.content.Context b = com.amazon.device.iap.internal.d.d().b();
        final com.amazon.device.iap.PurchasingListener a2 = com.amazon.device.iap.internal.d.d().a();
        if (b == null || a2 == null) {
            com.amazon.device.iap.internal.util.e.a(f3475a, "PurchasingListener is not set. Dropping response: " + obj);
            return;
        }
        new android.os.Handler(b.getMainLooper()).post(new java.lang.Runnable() { // from class: com.amazon.device.iap.internal.b.e.1
            @Override // java.lang.Runnable
            public void run() {
                com.amazon.device.iap.internal.b.e.this.d().a("notifyListenerResult", java.lang.Boolean.FALSE);
                try {
                    java.lang.Object obj2 = obj;
                    if (obj2 instanceof com.amazon.device.iap.model.ProductDataResponse) {
                        a2.onProductDataResponse((com.amazon.device.iap.model.ProductDataResponse) obj2);
                    } else if (obj2 instanceof com.amazon.device.iap.model.UserDataResponse) {
                        a2.onUserDataResponse((com.amazon.device.iap.model.UserDataResponse) obj2);
                    } else if (obj2 instanceof com.amazon.device.iap.model.PurchaseUpdatesResponse) {
                        com.amazon.device.iap.model.PurchaseUpdatesResponse purchaseUpdatesResponse = (com.amazon.device.iap.model.PurchaseUpdatesResponse) obj2;
                        a2.onPurchaseUpdatesResponse(purchaseUpdatesResponse);
                        java.lang.Object a3 = com.amazon.device.iap.internal.b.e.this.d().a("newCursor");
                        if (a3 != null && (a3 instanceof java.lang.String)) {
                            com.amazon.device.iap.internal.util.b.a(purchaseUpdatesResponse.getUserData().getUserId(), a3.toString());
                        }
                    } else if (!(obj2 instanceof com.amazon.device.iap.model.PurchaseResponse)) {
                        com.amazon.device.iap.internal.util.e.b(com.amazon.device.iap.internal.b.e.f3475a, "Unknown response type:" + obj.getClass().getName());
                    } else {
                        a2.onPurchaseResponse((com.amazon.device.iap.model.PurchaseResponse) obj2);
                    }
                    com.amazon.device.iap.internal.b.e.this.d().a("notifyListenerResult", java.lang.Boolean.TRUE);
                } catch (java.lang.Throwable th) {
                    com.amazon.device.iap.internal.util.e.b(com.amazon.device.iap.internal.b.e.f3475a, "Error in sendResponse: " + th);
                }
                com.amazon.device.iap.internal.b.i iVar2 = iVar;
                if (iVar2 != null) {
                    iVar2.a(true);
                    iVar.a_();
                }
            }
        });
    }

    public com.amazon.device.iap.model.RequestId c() {
        return this.b;
    }

    public com.amazon.device.iap.internal.b.h d() {
        return this.c;
    }

    public void e() {
        com.amazon.device.iap.internal.b.i iVar = this.d;
        if (iVar != null) {
            iVar.a_();
        } else {
            a();
        }
    }
}
