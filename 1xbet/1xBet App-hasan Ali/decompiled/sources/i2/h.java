package i2;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import f2.m;
import g2.C1978b;
import g2.InterfaceC1977a;
import g2.l;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import p2.AbstractC2253k;
import p2.s;

/* loaded from: classes.dex */
public final class h implements InterfaceC1977a {

    /* renamed from: u, reason: collision with root package name */
    public static final String f17330u = m.f("SystemAlarmDispatcher");

    /* renamed from: k, reason: collision with root package name */
    public final Context f17331k;

    /* renamed from: l, reason: collision with root package name */
    public final v3.e f17332l;

    /* renamed from: m, reason: collision with root package name */
    public final s f17333m;

    /* renamed from: n, reason: collision with root package name */
    public final C1978b f17334n;

    /* renamed from: o, reason: collision with root package name */
    public final l f17335o;

    /* renamed from: p, reason: collision with root package name */
    public final C2011b f17336p;

    /* renamed from: q, reason: collision with root package name */
    public final Handler f17337q;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f17338r;

    /* renamed from: s, reason: collision with root package name */
    public Intent f17339s;

    /* renamed from: t, reason: collision with root package name */
    public SystemAlarmService f17340t;

    public h(SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.f17331k = applicationContext;
        this.f17336p = new C2011b(applicationContext);
        this.f17333m = new s();
        l Q5 = l.Q(systemAlarmService);
        this.f17335o = Q5;
        C1978b c1978b = Q5.f17133p;
        this.f17334n = c1978b;
        this.f17332l = Q5.f17131n;
        c1978b.b(this);
        this.f17338r = new ArrayList();
        this.f17339s = null;
        this.f17337q = new Handler(Looper.getMainLooper());
    }

    @Override // g2.InterfaceC1977a
    public final void a(String str, boolean z3) {
        String str2 = C2011b.f17305n;
        Intent intent = new Intent(this.f17331k, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z3);
        f(new g(0, 0, this, intent));
    }

    public final void b(int i, Intent intent) {
        m d5 = m.d();
        String str = f17330u;
        d5.a(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i)), new Throwable[0]);
        c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            m.d().h(str, "Unknown command. Ignoring", new Throwable[0]);
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && d()) {
            return;
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.f17338r) {
            try {
                boolean isEmpty = this.f17338r.isEmpty();
                this.f17338r.add(intent);
                if (isEmpty) {
                    g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        if (this.f17337q.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final boolean d() {
        c();
        synchronized (this.f17338r) {
            try {
                ArrayList arrayList = this.f17338r;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) obj).getAction())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        m.d().a(f17330u, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f17334n.f(this);
        ScheduledExecutorService scheduledExecutorService = this.f17333m.f18734a;
        if (!scheduledExecutorService.isShutdown()) {
            scheduledExecutorService.shutdownNow();
        }
        this.f17340t = null;
    }

    public final void f(Runnable runnable) {
        this.f17337q.post(runnable);
    }

    public final void g() {
        c();
        PowerManager.WakeLock a5 = AbstractC2253k.a(this.f17331k, "ProcessCommand");
        try {
            a5.acquire();
            this.f17335o.f17131n.t(new f(this, 0));
        } finally {
            a5.release();
        }
    }
}
