package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import androidx.lifecycle.AbstractServiceC0494x;
import f2.m;
import i2.h;
import java.util.HashMap;
import java.util.WeakHashMap;
import p2.AbstractC2253k;

/* loaded from: classes.dex */
public class SystemAlarmService extends AbstractServiceC0494x {

    /* renamed from: n, reason: collision with root package name */
    public static final String f7110n = m.f("SystemAlarmService");

    /* renamed from: l, reason: collision with root package name */
    public h f7111l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7112m;

    public final void c() {
        this.f7112m = true;
        m.d().a(f7110n, "All commands completed in dispatcher", new Throwable[0]);
        String str = AbstractC2253k.f18712a;
        HashMap hashMap = new HashMap();
        WeakHashMap weakHashMap = AbstractC2253k.f18713b;
        synchronized (weakHashMap) {
            hashMap.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : hashMap.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                m.d().h(AbstractC2253k.f18712a, String.format("WakeLock held for %s", hashMap.get(wakeLock)), new Throwable[0]);
            }
        }
        stopSelf();
    }

    @Override // androidx.lifecycle.AbstractServiceC0494x, android.app.Service
    public final void onCreate() {
        super.onCreate();
        h hVar = new h(this);
        this.f7111l = hVar;
        if (hVar.f17340t != null) {
            m.d().b(h.f17330u, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            hVar.f17340t = this;
        }
        this.f7112m = false;
    }

    @Override // androidx.lifecycle.AbstractServiceC0494x, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f7112m = true;
        this.f7111l.e();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i5) {
        super.onStartCommand(intent, i, i5);
        if (this.f7112m) {
            m.d().e(f7110n, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f7111l.e();
            h hVar = new h(this);
            this.f7111l = hVar;
            if (hVar.f17340t != null) {
                m.d().b(h.f17330u, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
            } else {
                hVar.f17340t = this;
            }
            this.f7112m = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f7111l.b(i5, intent);
        return 3;
    }
}
