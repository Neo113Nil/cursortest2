package com.amazon.device.iap.internal.b.f;

/* compiled from: ResponseReceivedCommandBase.java */
/* loaded from: classes2.dex */
abstract class a extends com.amazon.device.iap.internal.b.i {
    @Override // com.amazon.device.iap.internal.b.i
    protected boolean a(com.amazon.venezia.command.SuccessResult successResult) throws java.lang.Exception {
        return true;
    }

    a(com.amazon.device.iap.internal.b.e eVar, java.lang.String str) {
        super(eVar, "response_received", str);
        b(false);
    }
}
