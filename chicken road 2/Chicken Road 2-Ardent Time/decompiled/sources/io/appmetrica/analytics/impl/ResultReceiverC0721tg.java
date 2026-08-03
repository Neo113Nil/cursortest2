package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.tg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ResultReceiverC0721tg extends android.os.ResultReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.InterfaceC0359fg f6858a;

    public ResultReceiverC0721tg(android.os.Handler handler, io.appmetrica.analytics.impl.InterfaceC0359fg interfaceC0359fg) {
        super(handler);
        this.f6858a = interfaceC0359fg;
    }

    public static void a(android.os.ResultReceiver resultReceiver, io.appmetrica.analytics.impl.C0566ng c0566ng) {
        if (resultReceiver != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putByteArray("referrer", c0566ng == null ? null : c0566ng.a());
            resultReceiver.send(1, bundle);
        }
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i2, android.os.Bundle bundle) {
        if (i2 == 1) {
            io.appmetrica.analytics.impl.C0566ng c0566ng = null;
            try {
                byte[] byteArray = bundle.getByteArray("referrer");
                if (byteArray != null && byteArray.length != 0) {
                    c0566ng = new io.appmetrica.analytics.impl.C0566ng(byteArray);
                }
            } catch (java.lang.Throwable unused) {
            }
            this.f6858a.a(c0566ng);
        }
    }
}
