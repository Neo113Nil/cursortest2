package com.iab.omid.library.inmobi.internal;

/* loaded from: classes5.dex */
public class j {
    private static com.iab.omid.library.inmobi.internal.j d = new com.iab.omid.library.inmobi.internal.j();

    /* renamed from: a, reason: collision with root package name */
    private java.lang.ref.WeakReference<android.content.Context> f4434a;
    private boolean b = false;
    private boolean c = false;

    class a extends android.content.BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            com.iab.omid.library.inmobi.internal.j jVar;
            boolean z;
            boolean z2;
            if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                jVar = com.iab.omid.library.inmobi.internal.j.this;
                z = jVar.c;
                z2 = true;
            } else {
                if (!intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                    return;
                }
                jVar = com.iab.omid.library.inmobi.internal.j.this;
                z = jVar.c;
                z2 = false;
            }
            jVar.a(z2, z);
            com.iab.omid.library.inmobi.internal.j.this.b = z2;
        }
    }

    public static com.iab.omid.library.inmobi.internal.j b() {
        return d;
    }

    public void a() {
        android.app.KeyguardManager keyguardManager;
        android.content.Context context = this.f4434a.get();
        if (context == null || (keyguardManager = (android.app.KeyguardManager) context.getSystemService("keyguard")) == null) {
            return;
        }
        boolean isDeviceLocked = android.os.Build.VERSION.SDK_INT >= 22 ? keyguardManager.isDeviceLocked() : keyguardManager.inKeyguardRestrictedInputMode();
        a(this.b, isDeviceLocked);
        this.c = isDeviceLocked;
    }

    public void a(android.content.Context context) {
        if (context == null) {
            return;
        }
        this.f4434a = new java.lang.ref.WeakReference<>(context);
        android.content.IntentFilter intentFilter = new android.content.IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new com.iab.omid.library.inmobi.internal.j.a(), intentFilter);
    }

    public void a(boolean z, boolean z2) {
        if ((z2 || z) == (this.c || this.b)) {
            return;
        }
        java.util.Iterator<com.iab.omid.library.inmobi.adsession.a> it = com.iab.omid.library.inmobi.internal.c.c().b().iterator();
        while (it.hasNext()) {
            it.next().d().b(z2 || z);
        }
    }
}
