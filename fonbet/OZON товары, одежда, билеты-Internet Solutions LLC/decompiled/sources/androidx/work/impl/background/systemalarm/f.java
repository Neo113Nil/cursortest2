package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.work.impl.C;
import androidx.work.impl.InterfaceC5476d;
import androidx.work.impl.p;
import androidx.work.o;
import g5.C6643p;
import h5.C6802C;
import h5.u;
import i5.C7009b;
import i5.InterfaceC7008a;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class f implements InterfaceC5476d {

    /* renamed from: j, reason: collision with root package name */
    static final String f45399j = o.i("SystemAlarmDispatcher");

    /* renamed from: a, reason: collision with root package name */
    final Context f45400a;

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC7008a f45401b;

    /* renamed from: c, reason: collision with root package name */
    private final C6802C f45402c;

    /* renamed from: d, reason: collision with root package name */
    private final p f45403d;

    /* renamed from: e, reason: collision with root package name */
    private final C f45404e;

    /* renamed from: f, reason: collision with root package name */
    final androidx.work.impl.background.systemalarm.b f45405f;

    /* renamed from: g, reason: collision with root package name */
    final ArrayList f45406g;

    /* renamed from: h, reason: collision with root package name */
    Intent f45407h;

    /* renamed from: i, reason: collision with root package name */
    private SystemAlarmService f45408i;

    final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (f.this.f45406g) {
                f fVar = f.this;
                fVar.f45407h = (Intent) fVar.f45406g.get(0);
            }
            Intent intent = f.this.f45407h;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = f.this.f45407h.getIntExtra("KEY_START_ID", 0);
                o e11 = o.e();
                String str = f.f45399j;
                e11.a(str, "Processing command " + f.this.f45407h + ", " + intExtra);
                PowerManager.WakeLock b11 = u.b(f.this.f45400a, action + " (" + intExtra + ")");
                try {
                    o.e().a(str, "Acquiring operation wake lock (" + action + ") " + b11);
                    b11.acquire();
                    f fVar2 = f.this;
                    fVar2.f45405f.g(intExtra, fVar2.f45407h, fVar2);
                    o.e().a(str, "Releasing operation wake lock (" + action + ") " + b11);
                    b11.release();
                    ((C7009b) f.this.f45401b).b().execute(new c(f.this));
                } catch (Throwable th2) {
                    try {
                        o e12 = o.e();
                        String str2 = f.f45399j;
                        e12.d(str2, "Unexpected error in onHandleIntent", th2);
                        o.e().a(str2, "Releasing operation wake lock (" + action + ") " + b11);
                        b11.release();
                        ((C7009b) f.this.f45401b).b().execute(new c(f.this));
                    } catch (Throwable th3) {
                        o.e().a(f.f45399j, "Releasing operation wake lock (" + action + ") " + b11);
                        b11.release();
                        ((C7009b) f.this.f45401b).b().execute(new c(f.this));
                        throw th3;
                    }
                }
            }
        }
    }

    static class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final f f45410a;

        /* renamed from: b, reason: collision with root package name */
        private final Intent f45411b;

        /* renamed from: c, reason: collision with root package name */
        private final int f45412c;

        b(int i11, @NonNull Intent intent, @NonNull f fVar) {
            this.f45410a = fVar;
            this.f45411b = intent;
            this.f45412c = i11;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Intent intent = this.f45411b;
            this.f45410a.a(this.f45412c, intent);
        }
    }

    static class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final f f45413a;

        c(@NonNull f fVar) {
            this.f45413a = fVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f45413a.d();
        }
    }

    f(@NonNull SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.f45400a = applicationContext;
        this.f45405f = new androidx.work.impl.background.systemalarm.b(applicationContext, new androidx.work.impl.u());
        C i11 = C.i(systemAlarmService);
        this.f45404e = i11;
        this.f45402c = new C6802C(i11.h().f());
        p k11 = i11.k();
        this.f45403d = k11;
        this.f45401b = i11.p();
        k11.c(this);
        this.f45406g = new ArrayList();
        this.f45407h = null;
    }

    private static void c() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    private void i() {
        c();
        PowerManager.WakeLock b11 = u.b(this.f45400a, "ProcessCommand");
        try {
            b11.acquire();
            this.f45404e.p().a(new a());
        } finally {
            b11.release();
        }
    }

    public final void a(int i11, @NonNull Intent intent) {
        o e11 = o.e();
        String str = f45399j;
        e11.a(str, "Adding command " + intent + " (" + i11 + ")");
        c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            o.e().k(str, "Unknown command. Ignoring");
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            c();
            synchronized (this.f45406g) {
                try {
                    Iterator it = this.f45406g.iterator();
                    while (it.hasNext()) {
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                            return;
                        }
                    }
                } finally {
                }
            }
        }
        intent.putExtra("KEY_START_ID", i11);
        synchronized (this.f45406g) {
            try {
                boolean isEmpty = this.f45406g.isEmpty();
                this.f45406g.add(intent);
                if (isEmpty) {
                    i();
                }
            } finally {
            }
        }
    }

    @Override // androidx.work.impl.InterfaceC5476d
    public final void b(@NonNull C6643p c6643p, boolean z11) {
        ((C7009b) this.f45401b).b().execute(new b(0, androidx.work.impl.background.systemalarm.b.c(this.f45400a, c6643p, z11), this));
    }

    final void d() {
        o e11 = o.e();
        String str = f45399j;
        e11.a(str, "Checking if commands are complete.");
        c();
        synchronized (this.f45406g) {
            try {
                if (this.f45407h != null) {
                    o.e().a(str, "Removing command " + this.f45407h);
                    if (!((Intent) this.f45406g.remove(0)).equals(this.f45407h)) {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                    this.f45407h = null;
                }
                h5.o c11 = ((C7009b) this.f45401b).c();
                if (!this.f45405f.f() && this.f45406g.isEmpty() && !c11.a()) {
                    o.e().a(str, "No more commands & intents.");
                    SystemAlarmService systemAlarmService = this.f45408i;
                    if (systemAlarmService != null) {
                        systemAlarmService.a();
                    }
                } else if (!this.f45406g.isEmpty()) {
                    i();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final p e() {
        return this.f45403d;
    }

    final C f() {
        return this.f45404e;
    }

    final C6802C g() {
        return this.f45402c;
    }

    final void h() {
        o.e().a(f45399j, "Destroying SystemAlarmDispatcher");
        this.f45403d.i(this);
        this.f45408i = null;
    }

    final void j(@NonNull SystemAlarmService systemAlarmService) {
        if (this.f45408i != null) {
            o.e().c(f45399j, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            this.f45408i = systemAlarmService;
        }
    }
}
