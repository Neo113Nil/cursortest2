package p047g1;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import p023d1.n;
import p031e1.a;
import p031e1.b;
import p031e1.l;
import p096n1.j;
import p096n1.r;
import p155w1.C1050x1;

/* JADX INFO: loaded from: classes.dex */
public final class g implements a {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final String f13094B = n.g("SystemAlarmDispatcher");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public SystemAlarmService f13095A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1050x1 f13097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f13098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f13099d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f13100e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f13101f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Handler f13102x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ArrayList f13103y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Intent f13104z;

    public g(SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.f13096a = applicationContext;
        this.f13101f = new b(applicationContext);
        this.f13098c = new r();
        l lVarM0 = l.m0(systemAlarmService);
        this.f13100e = lVarM0;
        b bVar = lVarM0.f12555z;
        this.f13099d = bVar;
        this.f13097b = lVarM0.f12553x;
        bVar.a(this);
        this.f13103y = new ArrayList();
        this.f13104z = null;
        this.f13102x = new Handler(Looper.getMainLooper());
    }

    public final void a(Intent intent, int i7) {
        n nVarD = n.d();
        String str = f13094B;
        nVarD.b(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i7)), new Throwable[0]);
        c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            n.d().i(str, "Unknown command. Ignoring", new Throwable[0]);
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            c();
            synchronized (this.f13103y) {
                try {
                    Iterator it = this.f13103y.iterator();
                    while (it.hasNext()) {
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                            return;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        intent.putExtra("KEY_START_ID", i7);
        synchronized (this.f13103y) {
            try {
                boolean zIsEmpty = this.f13103y.isEmpty();
                this.f13103y.add(intent);
                if (zIsEmpty) {
                    f();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p031e1.a
    public final void b(String str, boolean z4) {
        String str2 = b.f13073d;
        Intent intent = new Intent(this.f13096a, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z4);
        e(new androidx.activity.g(this, intent, 0, 3));
    }

    public final void c() {
        if (this.f13102x.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final void d() {
        n.d().b(f13094B, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f13099d.e(this);
        ScheduledExecutorService scheduledExecutorService = this.f13098c.f15348a;
        if (!scheduledExecutorService.isShutdown()) {
            scheduledExecutorService.shutdownNow();
        }
        this.f13095A = null;
    }

    public final void e(Runnable runnable) {
        this.f13102x.post(runnable);
    }

    public final void f() {
        c();
        PowerManager.WakeLock wakeLockA = j.a(this.f13096a, "ProcessCommand");
        try {
            wakeLockA.acquire();
            this.f13100e.f12553x.G(new f(this, 0));
        } finally {
            wakeLockA.release();
        }
    }
}
