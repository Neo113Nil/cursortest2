package com.google.android.gms.tapandpay.issuer;

/* loaded from: classes8.dex */
public final class GeneratePaymentCredentialsService extends android.app.Service {
    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent intent) {
        return new android.os.Binder();
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }
}
