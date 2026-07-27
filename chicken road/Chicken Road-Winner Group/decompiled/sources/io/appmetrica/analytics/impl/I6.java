package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* loaded from: classes.dex */
public final class I6 extends ResultReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final H6 f6088a;

    public I6(Handler handler, H6 h6) {
        super(handler);
        this.f6088a = h6;
    }

    public static void a(ResultReceiver resultReceiver, C0355a4 c0355a4) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            c0355a4.b(bundle);
            resultReceiver.send(1, bundle);
        }
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i3, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.f6088a.a(i3, bundle);
    }

    public static void a(ResultReceiver resultReceiver, Nl nl, C0355a4 c0355a4) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("startup_error_key_code", nl.f6341a);
            c0355a4.b(bundle);
            resultReceiver.send(2, bundle);
        }
    }
}
