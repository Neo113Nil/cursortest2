package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.u1;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public class a implements AppLovinBroadcastManager.Receiver {
    private static final long e = TimeUnit.SECONDS.toMillis(2);

    /* renamed from: a, reason: collision with root package name */
    private final l f4452a;
    private final p b;
    private final HashSet c = new HashSet();
    private final Object d = new Object();

    /* renamed from: com.applovin.impl.sdk.a$a, reason: collision with other inner class name */
    public interface InterfaceC0082a {
        void onAdExpired(u1 u1Var);
    }

    public a(l lVar) {
        this.f4452a = lVar;
        this.b = lVar.Q();
    }

    private b b(u1 u1Var) {
        synchronized (this.d) {
            if (u1Var == null) {
                return null;
            }
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (u1Var == bVar.b()) {
                    return bVar;
                }
            }
            return null;
        }
    }

    public boolean a(u1 u1Var, InterfaceC0082a interfaceC0082a) {
        synchronized (this.d) {
            if (b(u1Var) != null) {
                if (p.a()) {
                    this.b.a("AdExpirationManager", "Ad expiration already scheduled for ad: " + u1Var);
                }
                return true;
            }
            if (u1Var.getTimeToLiveMillis() <= e) {
                if (p.a()) {
                    this.b.a("AdExpirationManager", "Ad has already expired: " + u1Var);
                }
                u1Var.setExpired();
                return false;
            }
            if (p.a()) {
                this.b.a("AdExpirationManager", "Scheduling ad expiration " + TimeUnit.MILLISECONDS.toSeconds(u1Var.getTimeToLiveMillis()) + " seconds from now for " + u1Var + "...");
            }
            if (this.c.isEmpty()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
            }
            this.c.add(b.a(u1Var, interfaceC0082a, this.f4452a));
            return true;
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            a();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            b();
        }
    }

    private void b() {
        HashSet hashSet = new HashSet();
        synchronized (this.d) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                u1 b = bVar.b();
                if (b == null) {
                    hashSet.add(bVar);
                } else {
                    long timeToLiveMillis = b.getTimeToLiveMillis();
                    if (timeToLiveMillis <= 0) {
                        if (p.a()) {
                            this.b.a("AdExpirationManager", "Ad expired while app was paused. Preparing to notify listener for ad: " + b);
                        }
                        hashSet.add(bVar);
                    } else {
                        if (p.a()) {
                            this.b.a("AdExpirationManager", "Rescheduling expiration with remaining " + TimeUnit.MILLISECONDS.toSeconds(timeToLiveMillis) + " seconds for ad: " + b);
                        }
                        bVar.a(timeToLiveMillis);
                    }
                }
            }
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            b bVar2 = (b) it2.next();
            a(bVar2);
            bVar2.d();
        }
    }

    public void a(u1 u1Var) {
        synchronized (this.d) {
            b b = b(u1Var);
            if (b != null) {
                if (p.a()) {
                    this.b.a("AdExpirationManager", "Cancelling expiration timer for ad: " + u1Var);
                }
                b.a();
                a(b);
            }
        }
    }

    public void a(b bVar) {
        synchronized (this.d) {
            this.c.remove(bVar);
            if (this.c.isEmpty()) {
                AppLovinBroadcastManager.unregisterReceiver(this);
            }
        }
    }

    private void a() {
        synchronized (this.d) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((b) it.next()).a();
            }
        }
    }
}
