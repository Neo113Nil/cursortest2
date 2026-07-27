package com.iab.omid.library.bigosg.b;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static b f6095a = new b();
    private Context b;
    private BroadcastReceiver c;
    private boolean d;
    private boolean e;
    private a f;

    public interface a {
        void a(boolean z);
    }

    private b() {
    }

    public static b a() {
        return f6095a;
    }

    private void e() {
        this.c = new BroadcastReceiver() { // from class: com.iab.omid.library.bigosg.b.b.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                b bVar;
                boolean z;
                KeyguardManager keyguardManager;
                if (intent == null) {
                    return;
                }
                if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                    bVar = b.this;
                    z = true;
                } else {
                    if (!"android.intent.action.USER_PRESENT".equals(intent.getAction()) && (!"android.intent.action.SCREEN_ON".equals(intent.getAction()) || (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) == null || keyguardManager.inKeyguardRestrictedInputMode())) {
                        return;
                    }
                    bVar = b.this;
                    z = false;
                }
                bVar.a(z);
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        this.b.registerReceiver(this.c, intentFilter);
    }

    private void f() {
        BroadcastReceiver broadcastReceiver;
        Context context = this.b;
        if (context == null || (broadcastReceiver = this.c) == null) {
            return;
        }
        context.unregisterReceiver(broadcastReceiver);
        this.c = null;
    }

    private void g() {
        boolean z = !this.e;
        Iterator<com.iab.omid.library.bigosg.adsession.a> it = com.iab.omid.library.bigosg.b.a.a().b().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(z);
        }
    }

    public void b() {
        e();
        this.d = true;
        g();
    }

    public void c() {
        f();
        this.d = false;
        this.e = false;
        this.f = null;
    }

    public boolean d() {
        return !this.e;
    }

    public void a(Context context) {
        this.b = context.getApplicationContext();
    }

    public void a(a aVar) {
        this.f = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        if (this.e != z) {
            this.e = z;
            if (this.d) {
                g();
                a aVar = this.f;
                if (aVar != null) {
                    aVar.a(d());
                }
            }
        }
    }
}
