package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import androidx.lifecycle.AbstractServiceC0727w;
import java.util.HashMap;
import java.util.WeakHashMap;
import p023d1.n;
import p047g1.g;
import p096n1.j;

/* JADX INFO: loaded from: classes.dex */
public class SystemAlarmService extends AbstractServiceC0727w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f9880d = n.g("SystemAlarmService");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f9881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9882c;

    public final void a() {
        this.f9882c = true;
        n.d().b(f9880d, "All commands completed in dispatcher", new Throwable[0]);
        String str = j.f15325a;
        HashMap map = new HashMap();
        WeakHashMap weakHashMap = j.f15326b;
        synchronized (weakHashMap) {
            map.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : map.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                n.d().i(j.f15325a, String.format("WakeLock held for %s", map.get(wakeLock)), new Throwable[0]);
            }
        }
        stopSelf();
    }

    @Override // androidx.lifecycle.AbstractServiceC0727w, android.app.Service
    public final void onCreate() {
        super.onCreate();
        g gVar = new g(this);
        this.f9881b = gVar;
        if (gVar.f13095A != null) {
            n.d().c(g.f13094B, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            gVar.f13095A = this;
        }
        this.f9882c = false;
    }

    @Override // androidx.lifecycle.AbstractServiceC0727w, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f9882c = true;
        this.f9881b.d();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i7, int i8) {
        super.onStartCommand(intent, i7, i8);
        if (this.f9882c) {
            n.d().e(f9880d, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f9881b.d();
            g gVar = new g(this);
            this.f9881b = gVar;
            if (gVar.f13095A != null) {
                n.d().c(g.f13094B, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
            } else {
                gVar.f13095A = this;
            }
            this.f9882c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f9881b.a(intent, i8);
        return 3;
    }
}
