package com.amazon.device.iap.internal.b.h;

/* compiled from: SubmitMetricCommand.java */
/* loaded from: classes2.dex */
public class a extends com.amazon.device.iap.internal.b.i {
    @Override // com.amazon.device.iap.internal.b.i
    protected boolean a(com.amazon.venezia.command.SuccessResult successResult) throws android.os.RemoteException, com.amazon.android.framework.exception.KiwiException {
        return true;
    }

    public a(com.amazon.device.iap.internal.b.e eVar, java.lang.String str, java.lang.String str2) {
        super(eVar, "submit_metric", "1.0");
        a("metricName", str);
        a("metricAttributes", str2);
        b(false);
    }
}
