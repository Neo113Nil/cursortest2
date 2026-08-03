package com.amazon.device.iap.internal.b.d;

/* compiled from: PurchaseUpdatesCommandBase.java */
/* loaded from: classes2.dex */
abstract class b extends com.amazon.device.iap.internal.b.i {

    /* renamed from: a, reason: collision with root package name */
    protected final boolean f3474a;

    b(com.amazon.device.iap.internal.b.e eVar, java.lang.String str, boolean z) {
        super(eVar, "purchase_updates", str);
        this.f3474a = z;
    }

    protected void preExecution() throws com.amazon.android.framework.exception.KiwiException {
        super.preExecution();
        a(com.helpshift.user.UserConstants.POLLING_CURSOR, this.f3474a ? null : com.amazon.device.iap.internal.util.b.a((java.lang.String) b().d().a("userId")));
    }
}
