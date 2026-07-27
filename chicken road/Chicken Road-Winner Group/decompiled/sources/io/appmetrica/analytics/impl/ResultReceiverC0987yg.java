package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* renamed from: io.appmetrica.analytics.impl.yg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ResultReceiverC0987yg extends ResultReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0625kg f8640a;

    public ResultReceiverC0987yg(Handler handler, InterfaceC0625kg interfaceC0625kg) {
        super(handler);
        this.f8640a = interfaceC0625kg;
    }

    public static void a(ResultReceiver resultReceiver, C0832sg c0832sg) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            bundle.putByteArray("referrer", c0832sg == null ? null : c0832sg.a());
            resultReceiver.send(1, bundle);
        }
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i3, Bundle bundle) {
        if (i3 == 1) {
            C0832sg c0832sg = null;
            try {
                byte[] byteArray = bundle.getByteArray("referrer");
                if (byteArray != null && byteArray.length != 0) {
                    c0832sg = new C0832sg(byteArray);
                }
            } catch (Throwable unused) {
            }
            this.f8640a.a(c0832sg);
        }
    }
}
