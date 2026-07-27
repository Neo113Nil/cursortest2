package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* renamed from: io.appmetrica.analytics.impl.yg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ResultReceiverC1136yg extends ResultReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0774kg f9599a;

    public ResultReceiverC1136yg(Handler handler, InterfaceC0774kg interfaceC0774kg) {
        super(handler);
        this.f9599a = interfaceC0774kg;
    }

    public static void a(ResultReceiver resultReceiver, C0981sg c0981sg) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            bundle.putByteArray("referrer", c0981sg == null ? null : c0981sg.a());
            resultReceiver.send(1, bundle);
        }
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i2, Bundle bundle) {
        if (i2 == 1) {
            C0981sg c0981sg = null;
            try {
                byte[] byteArray = bundle.getByteArray("referrer");
                if (byteArray != null && byteArray.length != 0) {
                    c0981sg = new C0981sg(byteArray);
                }
            } catch (Throwable unused) {
            }
            this.f9599a.a(c0981sg);
        }
    }
}
