package com.google.firebase.messaging;

import B0.f;
import G0.y;
import K1.g;
import M2.C0097a;
import M2.L;
import U.e;
import V1.b;
import Y1.a;
import Z1.d;
import a1.C0178b;
import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import f2.A;
import f2.j;
import f2.k;
import f2.m;
import f2.o;
import f2.w;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k1.C1206b;
import k1.C1208d;
import k1.ExecutorC1212h;
import k1.n;
import n2.AbstractC1341c;
import o1.u;
import r.C1392b;
import u1.AbstractC1477a;

/* loaded from: classes.dex */
public class FirebaseMessaging {

    /* renamed from: k, reason: collision with root package name */
    public static e f5319k;

    /* renamed from: m, reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f5321m;

    /* renamed from: a, reason: collision with root package name */
    public final g f5322a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f5323b;

    /* renamed from: c, reason: collision with root package name */
    public final M0.e f5324c;

    /* renamed from: d, reason: collision with root package name */
    public final j f5325d;

    /* renamed from: e, reason: collision with root package name */
    public final L f5326e;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f5327f;

    /* renamed from: g, reason: collision with root package name */
    public final ThreadPoolExecutor f5328g;

    /* renamed from: h, reason: collision with root package name */
    public final o f5329h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f5330i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f5318j = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: l, reason: collision with root package name */
    public static a f5320l = new N1.e(6);

    public FirebaseMessaging(g gVar, a aVar, a aVar2, d dVar, a aVar3, b bVar) {
        final int i2 = 1;
        final int i3 = 0;
        gVar.a();
        Context context = gVar.f1387a;
        final o oVar = new o(context);
        final M0.e eVar = new M0.e(gVar, oVar, aVar, aVar2, dVar);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new y("Firebase-Messaging-Task"));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new y("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new y("Firebase-Messaging-File-Io"));
        this.f5330i = false;
        f5320l = aVar3;
        this.f5322a = gVar;
        this.f5326e = new L(this, bVar);
        gVar.a();
        final Context context2 = gVar.f1387a;
        this.f5323b = context2;
        k kVar = new k();
        this.f5329h = oVar;
        this.f5324c = eVar;
        this.f5325d = new j(newSingleThreadExecutor);
        this.f5327f = scheduledThreadPoolExecutor;
        this.f5328g = threadPoolExecutor;
        gVar.a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(kVar);
        } else {
            Log.w("FirebaseMessaging", "Context " + context + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: f2.l

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f5617b;

            {
                this.f5617b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                I1.o q5;
                int i6;
                switch (i3) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.f5617b;
                        if (firebaseMessaging.f5326e.c() && firebaseMessaging.h(firebaseMessaging.d())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.f5330i) {
                                    firebaseMessaging.g(0L);
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.f5617b;
                        final Context context3 = firebaseMessaging2.f5323b;
                        AbstractC1477a.r(context3);
                        final boolean f3 = firebaseMessaging2.f();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences v4 = B0.f.v(context3);
                            if (!v4.contains("proxy_retention") || v4.getBoolean("proxy_retention", false) != f3) {
                                C1206b c1206b = (C1206b) firebaseMessaging2.f5324c.f1785e;
                                if (c1206b.f10676c.d() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", f3);
                                    k1.n c2 = k1.n.c(c1206b.f10675b);
                                    synchronized (c2) {
                                        i6 = c2.f10711a;
                                        c2.f10711a = i6 + 1;
                                    }
                                    q5 = c2.d(new k1.m(i6, 4, bundle, 0));
                                } else {
                                    q5 = B0.f.q(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                q5.a(new U.d(0), new I1.e() { // from class: f2.r
                                    @Override // I1.e
                                    public final void onSuccess(Object obj) {
                                        SharedPreferences.Editor edit = B0.f.v(context3).edit();
                                        edit.putBoolean("proxy_retention", f3);
                                        edit.apply();
                                    }
                                });
                            }
                        }
                        if (firebaseMessaging2.f()) {
                            firebaseMessaging2.e();
                            return;
                        }
                        return;
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new y("Firebase-Messaging-Topics-Io"));
        int i6 = A.f5547j;
        f.f(scheduledThreadPoolExecutor2, new Callable() { // from class: f2.z
            @Override // java.util.concurrent.Callable
            public final Object call() {
                y yVar;
                Context context3 = context2;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                o oVar2 = oVar;
                M0.e eVar2 = eVar;
                synchronized (y.class) {
                    try {
                        WeakReference weakReference = y.f5653b;
                        yVar = weakReference != null ? (y) weakReference.get() : null;
                        if (yVar == null) {
                            SharedPreferences sharedPreferences = context3.getSharedPreferences("com.google.android.gms.appid", 0);
                            y yVar2 = new y();
                            synchronized (yVar2) {
                                yVar2.f5654a = B.d.g(sharedPreferences, scheduledThreadPoolExecutor3);
                            }
                            y.f5653b = new WeakReference(yVar2);
                            yVar = yVar2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new A(firebaseMessaging, oVar2, yVar, eVar2, context3, scheduledThreadPoolExecutor3);
            }
        }).a(scheduledThreadPoolExecutor, new m(this, i3));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: f2.l

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f5617b;

            {
                this.f5617b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                I1.o q5;
                int i62;
                switch (i2) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.f5617b;
                        if (firebaseMessaging.f5326e.c() && firebaseMessaging.h(firebaseMessaging.d())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.f5330i) {
                                    firebaseMessaging.g(0L);
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.f5617b;
                        final Context context3 = firebaseMessaging2.f5323b;
                        AbstractC1477a.r(context3);
                        final boolean f3 = firebaseMessaging2.f();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences v4 = B0.f.v(context3);
                            if (!v4.contains("proxy_retention") || v4.getBoolean("proxy_retention", false) != f3) {
                                C1206b c1206b = (C1206b) firebaseMessaging2.f5324c.f1785e;
                                if (c1206b.f10676c.d() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", f3);
                                    k1.n c2 = k1.n.c(c1206b.f10675b);
                                    synchronized (c2) {
                                        i62 = c2.f10711a;
                                        c2.f10711a = i62 + 1;
                                    }
                                    q5 = c2.d(new k1.m(i62, 4, bundle, 0));
                                } else {
                                    q5 = B0.f.q(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                q5.a(new U.d(0), new I1.e() { // from class: f2.r
                                    @Override // I1.e
                                    public final void onSuccess(Object obj) {
                                        SharedPreferences.Editor edit = B0.f.v(context3).edit();
                                        edit.putBoolean("proxy_retention", f3);
                                        edit.apply();
                                    }
                                });
                            }
                        }
                        if (firebaseMessaging2.f()) {
                            firebaseMessaging2.e();
                            return;
                        }
                        return;
                }
            }
        });
    }

    public static void b(Runnable runnable, long j2) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f5321m == null) {
                    f5321m = new ScheduledThreadPoolExecutor(1, new y("TAG"));
                }
                f5321m.schedule(runnable, j2, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized e c(Context context) {
        e eVar;
        synchronized (FirebaseMessaging.class) {
            try {
                if (f5319k == null) {
                    f5319k = new e(context);
                }
                eVar = f5319k;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    public static synchronized FirebaseMessaging getInstance(g gVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) gVar.b(FirebaseMessaging.class);
            u.h(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public final String a() {
        Task task;
        f2.u d6 = d();
        if (!h(d6)) {
            return d6.f5641a;
        }
        String b6 = o.b(this.f5322a);
        j jVar = this.f5325d;
        synchronized (jVar) {
            task = (Task) ((C1392b) jVar.f5614b).getOrDefault(b6, null);
            if (task == null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + b6);
                }
                M0.e eVar = this.f5324c;
                task = eVar.f(eVar.q(o.b((g) eVar.f1783c), "*", new Bundle())).i(this.f5328g, new C0178b(this, b6, d6, 4)).h((ExecutorService) jVar.f5613a, new C0097a(jVar, 9, b6));
                ((C1392b) jVar.f5614b).put(b6, task);
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + b6);
            }
        }
        try {
            return (String) f.b(task);
        } catch (InterruptedException | ExecutionException e3) {
            throw new IOException(e3);
        }
    }

    public final f2.u d() {
        f2.u b6;
        e c2 = c(this.f5323b);
        g gVar = this.f5322a;
        gVar.a();
        String d6 = "[DEFAULT]".equals(gVar.f1388b) ? "" : gVar.d();
        String b7 = o.b(this.f5322a);
        synchronized (c2) {
            b6 = f2.u.b(((SharedPreferences) c2.f3053a).getString(d6 + "|T|" + b7 + "|*", null));
        }
        return b6;
    }

    public final void e() {
        I1.o q5;
        int i2;
        C1206b c1206b = (C1206b) this.f5324c.f1785e;
        if (c1206b.f10676c.d() >= 241100000) {
            n c2 = n.c(c1206b.f10675b);
            Bundle bundle = Bundle.EMPTY;
            synchronized (c2) {
                i2 = c2.f10711a;
                c2.f10711a = i2 + 1;
            }
            q5 = c2.d(new k1.m(i2, 5, bundle, 1)).g(ExecutorC1212h.f10689c, C1208d.f10683c);
        } else {
            q5 = f.q(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        q5.a(this.f5327f, new m(this, 1));
    }

    public final boolean f() {
        String notificationDelegate;
        Context context = this.f5323b;
        AbstractC1477a.r(context);
        if (!(Build.VERSION.SDK_INT >= 29)) {
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return false;
            }
            Log.d("FirebaseMessaging", "Platform doesn't support proxying.");
            return false;
        }
        if (!(Binder.getCallingUid() == context.getApplicationInfo().uid)) {
            Log.e("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
            return false;
        }
        notificationDelegate = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate();
        if (!"com.google.android.gms".equals(notificationDelegate)) {
            return false;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "GMS core is set for proxying");
        }
        if (this.f5322a.b(L1.a.class) != null) {
            return true;
        }
        return AbstractC1341c.g() && f5320l != null;
    }

    public final synchronized void g(long j2) {
        b(new w(this, Math.min(Math.max(30L, 2 * j2), f5318j)), j2);
        this.f5330i = true;
    }

    public final boolean h(f2.u uVar) {
        if (uVar != null) {
            String a6 = this.f5329h.a();
            if (System.currentTimeMillis() <= uVar.f5643c + f2.u.f5640d && a6.equals(uVar.f5642b)) {
                return false;
            }
        }
        return true;
    }
}
