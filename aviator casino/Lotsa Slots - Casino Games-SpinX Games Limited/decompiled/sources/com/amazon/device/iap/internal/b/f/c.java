package com.amazon.device.iap.internal.b.f;

/* compiled from: ResponseReceivedCommandV2.java */
/* loaded from: classes2.dex */
public final class c extends com.amazon.device.iap.internal.b.f.a {
    public c(com.amazon.device.iap.internal.b.e eVar, boolean z) {
        super(eVar, com.ironsource.M6.k0);
        a("receiptDelivered", java.lang.Boolean.valueOf(z));
    }

    @Override // com.amazon.device.iap.internal.b.i
    public void a_() {
        java.lang.Object a2 = b().d().a("notifyListenerResult");
        if (a2 == null || !java.lang.Boolean.TRUE.equals(a2)) {
            a("notifyListenerSucceeded", false);
        } else {
            a("notifyListenerSucceeded", true);
        }
        super.a_();
    }
}
