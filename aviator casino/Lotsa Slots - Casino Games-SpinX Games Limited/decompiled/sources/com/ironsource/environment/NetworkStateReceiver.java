package com.ironsource.environment;

/* loaded from: classes5.dex */
public class NetworkStateReceiver extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private android.net.ConnectivityManager f6222a;
    private com.ironsource.Bc b;
    private boolean c = false;

    class a implements java.lang.Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.environment.NetworkStateReceiver networkStateReceiver = com.ironsource.environment.NetworkStateReceiver.this;
            com.ironsource.Bc bc = networkStateReceiver.b;
            if (bc != null) {
                bc.a(networkStateReceiver.c);
            }
        }
    }

    public NetworkStateReceiver(android.content.Context context, com.ironsource.Bc bc) {
        this.b = bc;
        if (context != null) {
            this.f6222a = (android.net.ConnectivityManager) context.getSystemService("connectivity");
        }
        a();
    }

    private boolean a() {
        boolean z = this.c;
        android.net.ConnectivityManager connectivityManager = this.f6222a;
        if (connectivityManager != null) {
            try {
                android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                this.c = activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
            } catch (java.lang.Exception e) {
                com.ironsource.C3180n4.d().a(e);
                this.c = false;
            }
        } else {
            this.c = false;
        }
        return z != this.c;
    }

    private void b() {
        com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new com.ironsource.environment.NetworkStateReceiver.a());
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent == null || intent.getExtras() == null || !a()) {
            return;
        }
        b();
    }
}
