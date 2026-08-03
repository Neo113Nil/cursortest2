package com.amazon.device.iap.internal.b.g;

/* compiled from: PurchaseFulfilledCommandV2.java */
/* loaded from: classes2.dex */
public final class a extends com.amazon.device.iap.internal.b.i {

    /* renamed from: a, reason: collision with root package name */
    protected final java.util.Set<java.lang.String> f3480a;
    protected final java.lang.String b;

    @Override // com.amazon.device.iap.internal.b.i
    protected boolean a(com.amazon.venezia.command.SuccessResult successResult) throws android.os.RemoteException, com.amazon.android.framework.exception.KiwiException {
        return true;
    }

    public a(com.amazon.device.iap.internal.b.e eVar, java.util.Set<java.lang.String> set, java.lang.String str) {
        super(eVar, "purchase_fulfilled", com.ironsource.M6.k0);
        this.f3480a = set;
        this.b = str;
        b(false);
        a("receiptIds", set);
        a("fulfillmentStatus", str);
    }

    @Override // com.amazon.device.iap.internal.b.i
    public void a_() {
        java.lang.Object a2 = b().d().a("notifyListenerResult");
        if (a2 != null && java.lang.Boolean.FALSE.equals(a2)) {
            a("fulfillmentStatus", com.amazon.device.iap.internal.model.a.DELIVERY_ATTEMPTED.toString());
        }
        super.a_();
    }
}
