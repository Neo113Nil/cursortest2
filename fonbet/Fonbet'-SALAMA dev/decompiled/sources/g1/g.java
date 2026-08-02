package g1;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import d1.n;
import e1.C0995b;
import e1.InterfaceC0994a;
import e1.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import n1.AbstractC1455j;
import n1.C1463r;
import w1.C1759x1;

/* loaded from: classes.dex */
public final class g implements InterfaceC0994a {

    /* renamed from: B, reason: collision with root package name */
    public static final String f13088B = n.g("SystemAlarmDispatcher");

    /* renamed from: A, reason: collision with root package name */
    public SystemAlarmService f13089A;

    /* renamed from: a, reason: collision with root package name */
    public final Context f13090a;

    /* renamed from: b, reason: collision with root package name */
    public final C1759x1 f13091b;

    /* renamed from: c, reason: collision with root package name */
    public final C1463r f13092c;

    /* renamed from: d, reason: collision with root package name */
    public final C0995b f13093d;

    /* renamed from: e, reason: collision with root package name */
    public final l f13094e;

    /* renamed from: f, reason: collision with root package name */
    public final b f13095f;

    /* renamed from: x, reason: collision with root package name */
    public final Handler f13096x;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f13097y;

    /* renamed from: z, reason: collision with root package name */
    public Intent f13098z;

    public g(SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.f13090a = applicationContext;
        this.f13095f = new b(applicationContext);
        this.f13092c = new C1463r();
        l m02 = l.m0(systemAlarmService);
        this.f13094e = m02;
        C0995b c0995b = m02.f12549z;
        this.f13093d = c0995b;
        this.f13091b = m02.f12547x;
        c0995b.a(this);
        this.f13097y = new ArrayList();
        this.f13098z = null;
        this.f13096x = new Handler(Looper.getMainLooper());
    }

    public final void a(Intent intent, int i7) {
        n d7 = n.d();
        String str = f13088B;
        d7.b(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i7)), new Throwable[0]);
        c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            n.d().i(str, "Unknown command. Ignoring", new Throwable[0]);
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            c();
            synchronized (this.f13097y) {
                try {
                    Iterator it = this.f13097y.iterator();
                    while (it.hasNext()) {
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                            return;
                        }
                    }
                } finally {
                }
            }
        }
        intent.putExtra("KEY_START_ID", i7);
        synchronized (this.f13097y) {
            try {
                boolean isEmpty = this.f13097y.isEmpty();
                this.f13097y.add(intent);
                if (isEmpty) {
                    f();
                }
            } finally {
            }
        }
    }

    @Override // e1.InterfaceC0994a
    public final void b(String str, boolean z4) {
        String str2 = b.f13067d;
        Intent intent = new Intent(this.f13090a, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z4);
        e(new androidx.activity.g(this, intent, 0, 3));
    }

    public final void c() {
        if (this.f13096x.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final void d() {
        n.d().b(f13088B, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f13093d.e(this);
        ScheduledExecutorService scheduledExecutorService = this.f13092c.f15342a;
        if (!scheduledExecutorService.isShutdown()) {
            scheduledExecutorService.shutdownNow();
        }
        this.f13089A = null;
    }

    public final void e(Runnable runnable) {
        this.f13096x.post(runnable);
    }

    public final void f() {
        c();
        PowerManager.WakeLock a2 = AbstractC1455j.a(this.f13090a, "ProcessCommand");
        try {
            a2.acquire();
            this.f13094e.f12547x.G(new f(this, 0));
        } finally {
            a2.release();
        }
    }
}
