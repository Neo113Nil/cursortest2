package com.iab.omid.library.ironsrc.internal;

/* loaded from: classes5.dex */
public class j {
    private static com.iab.omid.library.ironsrc.internal.j d = new com.iab.omid.library.ironsrc.internal.j();

    /* renamed from: a, reason: collision with root package name */
    private java.lang.ref.WeakReference<android.content.Context> f4471a;
    private boolean b = false;
    private boolean c = false;

    class a extends android.content.BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            com.iab.omid.library.ironsrc.internal.j jVar;
            boolean z;
            boolean z2;
            if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                jVar = com.iab.omid.library.ironsrc.internal.j.this;
                z = jVar.c;
                z2 = true;
            } else {
                if (!intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                    return;
                }
                jVar = com.iab.omid.library.ironsrc.internal.j.this;
                z = jVar.c;
                z2 = false;
            }
            jVar.a(z2, z);
            com.iab.omid.library.ironsrc.internal.j.this.b = z2;
        }
    }

    public static com.iab.omid.library.ironsrc.internal.j b() {
        return d;
    }

    public void a() {
        android.content.Context context = this.f4471a.get();
        if (context == null) {
            return;
        }
        android.app.KeyguardManager keyguardManager = (android.app.KeyguardManager) context.getSystemService("keyguard");
        boolean isDeviceLocked = android.os.Build.VERSION.SDK_INT >= 22 ? keyguardManager.isDeviceLocked() : keyguardManager.inKeyguardRestrictedInputMode();
        a(this.b, isDeviceLocked);
        this.c = isDeviceLocked;
    }

    public void a(android.content.Context context) {
        if (context == null) {
            return;
        }
        this.f4471a = new java.lang.ref.WeakReference<>(context);
        android.content.IntentFilter intentFilter = new android.content.IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new com.iab.omid.library.ironsrc.internal.j.a(), intentFilter);
    }

    public void a(boolean z, boolean z2) {
        if ((z2 || z) == (this.c || this.b)) {
            return;
        }
        java.util.Iterator<com.iab.omid.library.ironsrc.adsession.a> it = com.iab.omid.library.ironsrc.internal.c.c().b().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().b(z2 || z);
        }
    }
}
