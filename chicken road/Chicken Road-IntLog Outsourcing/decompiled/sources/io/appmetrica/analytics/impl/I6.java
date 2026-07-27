package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* loaded from: classes.dex */
public final class I6 extends ResultReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final H6 f6937a;

    public I6(Handler handler, H6 h6) {
        super(handler);
        this.f6937a = h6;
    }

    public static void a(ResultReceiver resultReceiver, C0504a4 c0504a4) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            c0504a4.b(bundle);
            resultReceiver.send(1, bundle);
        }
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.f6937a.a(i2, bundle);
    }

    public static void a(ResultReceiver resultReceiver, Nl nl, C0504a4 c0504a4) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("startup_error_key_code", nl.f7198a);
            c0504a4.b(bundle);
            resultReceiver.send(2, bundle);
        }
    }
}
