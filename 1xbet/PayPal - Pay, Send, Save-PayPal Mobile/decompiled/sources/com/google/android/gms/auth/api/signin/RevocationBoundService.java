package com.google.android.gms.auth.api.signin;

@java.lang.Deprecated
/* loaded from: classes8.dex */
public final class RevocationBoundService extends android.app.Service {
    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent intent) {
        if (!"com.google.android.gms.auth.api.signin.RevocationBoundService.disconnect".equals(intent.getAction()) && !"com.google.android.gms.auth.api.signin.RevocationBoundService.clearClientState".equals(intent.getAction())) {
            intent.getAction();
            return null;
        }
        if (android.util.Log.isLoggable("RevocationService", 2)) {
            intent.getAction();
        }
        return new com.google.android.gms.auth.api.signin.internal.zbt(this);
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
