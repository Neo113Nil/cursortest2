package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class B6 extends android.os.ResultReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.A6 f4101a;

    public B6(android.os.Handler handler, io.appmetrica.analytics.impl.A6 a6) {
        super(handler);
        this.f4101a = a6;
    }

    public static void a(android.os.ResultReceiver resultReceiver, io.appmetrica.analytics.impl.S3 s3) {
        if (resultReceiver != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            s3.b(bundle);
            resultReceiver.send(1, bundle);
        }
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i2, android.os.Bundle bundle) {
        if (bundle == null) {
            bundle = new android.os.Bundle();
        }
        this.f4101a.a(i2, bundle);
    }

    public static void a(android.os.ResultReceiver resultReceiver, io.appmetrica.analytics.impl.Jl jl, io.appmetrica.analytics.impl.S3 s3) {
        if (resultReceiver != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("startup_error_key_code", jl.f4519a);
            s3.b(bundle);
            resultReceiver.send(2, bundle);
        }
    }
}
