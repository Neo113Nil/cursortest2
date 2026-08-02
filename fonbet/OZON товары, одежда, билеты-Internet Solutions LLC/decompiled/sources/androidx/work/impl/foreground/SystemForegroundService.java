package androidx.work.impl.foreground;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.lifecycle.N;
import androidx.work.o;

/* loaded from: classes8.dex */
public class SystemForegroundService extends N {

    /* renamed from: f, reason: collision with root package name */
    private static final String f45430f = o.i("SystemFgService");

    /* renamed from: b, reason: collision with root package name */
    private Handler f45431b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f45432c;

    /* renamed from: d, reason: collision with root package name */
    androidx.work.impl.foreground.b f45433d;

    /* renamed from: e, reason: collision with root package name */
    NotificationManager f45434e;

    final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f45435a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Notification f45436b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f45437c;

        a(int i11, Notification notification, int i12) {
            this.f45435a = i11;
            this.f45436b = notification;
            this.f45437c = i12;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i11 = Build.VERSION.SDK_INT;
            int i12 = this.f45437c;
            Notification notification = this.f45436b;
            int i13 = this.f45435a;
            SystemForegroundService systemForegroundService = SystemForegroundService.this;
            if (i11 >= 31) {
                e.a(systemForegroundService, i13, notification, i12);
            } else if (i11 >= 29) {
                d.a(systemForegroundService, i13, notification, i12);
            } else {
                systemForegroundService.startForeground(i13, notification);
            }
        }
    }

    final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f45439a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Notification f45440b;

        b(int i11, Notification notification) {
            this.f45439a = i11;
            this.f45440b = notification;
        }

        @Override // java.lang.Runnable
        public final void run() {
            SystemForegroundService.this.f45434e.notify(this.f45439a, this.f45440b);
        }
    }

    final class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f45442a;

        c(int i11) {
            this.f45442a = i11;
        }

        @Override // java.lang.Runnable
        public final void run() {
            SystemForegroundService.this.f45434e.cancel(this.f45442a);
        }
    }

    static class d {
        static void a(Service service, int i11, Notification notification, int i12) {
            service.startForeground(i11, notification, i12);
        }
    }

    static class e {
        static void a(Service service, int i11, Notification notification, int i12) {
            try {
                service.startForeground(i11, notification, i12);
            } catch (ForegroundServiceStartNotAllowedException e11) {
                o.e().l(SystemForegroundService.f45430f, "Unable to start foreground service", e11);
            }
        }
    }

    private void c() {
        this.f45431b = new Handler(Looper.getMainLooper());
        this.f45434e = (NotificationManager) getApplicationContext().getSystemService("notification");
        androidx.work.impl.foreground.b bVar = new androidx.work.impl.foreground.b(getApplicationContext());
        this.f45433d = bVar;
        bVar.k(this);
    }

    public final void b(int i11) {
        this.f45431b.post(new c(i11));
    }

    public final void d(int i11, @NonNull Notification notification) {
        this.f45431b.post(new b(i11, notification));
    }

    public final void e(int i11, int i12, @NonNull Notification notification) {
        this.f45431b.post(new a(i11, notification, i12));
    }

    public final void f() {
        this.f45432c = true;
        o.e().a(f45430f, "All commands completed.");
        stopForeground(true);
        stopSelf();
    }

    @Override // androidx.lifecycle.N, android.app.Service
    public final void onCreate() {
        super.onCreate();
        c();
    }

    @Override // androidx.lifecycle.N, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f45433d.i();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i11, int i12) {
        super.onStartCommand(intent, i11, i12);
        if (this.f45432c) {
            o.e().f(f45430f, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f45433d.i();
            c();
            this.f45432c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f45433d.j(intent);
        return 3;
    }
}
