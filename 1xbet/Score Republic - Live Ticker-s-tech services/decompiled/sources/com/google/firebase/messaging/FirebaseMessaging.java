package com.google.firebase.messaging;

import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p000.C0089c8;
import p000.C0414kz;
import p000.C0473mk;
import p000.C0475mm;
import p000.C0615qe;
import p000.C0809vn;
import p000.C0902y5;
import p000.C0923yq;
import p000.InterfaceC0826w3;
import p000.a82;
import p000.an0;
import p000.d71;
import p000.dc1;
import p000.f50;
import p000.g92;
import p000.hb1;
import p000.hn0;
import p000.hr0;
import p000.iw1;
import p000.m10;
import p000.my0;
import p000.o31;
import p000.p80;
import p000.q10;
import p000.qa1;
import p000.v92;
import p000.w00;
import p000.w31;
import p000.xe1;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class FirebaseMessaging {

    /* JADX INFO: renamed from: j */
    public static an0 f1383j;

    /* JADX INFO: renamed from: k */
    public static my0 f1384k = new C0473mk(5);

    /* JADX INFO: renamed from: l */
    public static ScheduledThreadPoolExecutor f1385l;

    /* JADX INFO: renamed from: a */
    public final w00 f1386a;

    /* JADX INFO: renamed from: b */
    public final Context f1387b;

    /* JADX INFO: renamed from: c */
    public final C0902y5 f1388c;

    /* JADX INFO: renamed from: d */
    public final f50 f1389d;

    /* JADX INFO: renamed from: e */
    public final C0809vn f1390e;

    /* JADX INFO: renamed from: f */
    public final ScheduledThreadPoolExecutor f1391f;

    /* JADX INFO: renamed from: g */
    public final ThreadPoolExecutor f1392g;

    /* JADX INFO: renamed from: h */
    public final C0475mm f1393h;

    /* JADX INFO: renamed from: i */
    public boolean f1394i;

    public FirebaseMessaging(w00 w00Var, my0 my0Var, my0 my0Var2, m10 m10Var, my0 my0Var3, hb1 hb1Var) {
        w00Var.m5224a();
        Context context = w00Var.f8318a;
        final C0475mm c0475mm = new C0475mm(context);
        w00Var.m5224a();
        w31 w31Var = new w31(w00Var.f8318a);
        final C0902y5 c0902y5 = new C0902y5();
        c0902y5.f9154a = w00Var;
        c0902y5.f9155b = c0475mm;
        c0902y5.f9156c = w31Var;
        c0902y5.f9157d = my0Var;
        c0902y5.f9158e = my0Var2;
        c0902y5.f9159f = m10Var;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new hr0("Firebase-Messaging-Task"));
        final int i = 1;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new hr0("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new hr0("Firebase-Messaging-File-Io"));
        final int i2 = 0;
        this.f1394i = false;
        f1384k = my0Var3;
        this.f1386a = w00Var;
        this.f1390e = new C0809vn(this, hb1Var);
        w00Var.m5224a();
        final Context context2 = w00Var.f8318a;
        this.f1387b = context2;
        C0414kz c0414kz = new C0414kz();
        this.f1393h = c0475mm;
        this.f1388c = c0902y5;
        this.f1389d = new f50(executorServiceNewSingleThreadExecutor);
        this.f1391f = scheduledThreadPoolExecutor;
        this.f1392g = threadPoolExecutor;
        w00Var.m5224a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(c0414kz);
        } else {
            Log.w("FirebaseMessaging", "Context " + context + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: p10

            /* JADX INFO: renamed from: k */
            public final /* synthetic */ FirebaseMessaging f5960k;

            {
                this.f5960k = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                v92 v92VarM2008e;
                int i3;
                int i4 = i2;
                FirebaseMessaging firebaseMessaging = this.f5960k;
                switch (i4) {
                    case 0:
                        if (firebaseMessaging.f1390e.m5179j() && firebaseMessaging.m1013h(firebaseMessaging.m1009d())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.f1394i) {
                                    firebaseMessaging.m1012g(0L);
                                }
                                break;
                            }
                            return;
                        }
                        return;
                    default:
                        final Context context3 = firebaseMessaging.f1387b;
                        xe1.m5641j(context3);
                        C0902y5 c0902y6 = firebaseMessaging.f1388c;
                        final boolean zM1011f = firebaseMessaging.m1011f();
                        SharedPreferences sharedPreferencesM5168d = vk1.m5168d(context3);
                        if (!sharedPreferencesM5168d.contains("proxy_retention") || sharedPreferencesM5168d.getBoolean("proxy_retention", false) != zM1011f) {
                            w31 w31Var2 = (w31) c0902y6.f9156c;
                            if (w31Var2.f8361c.m3006a() >= 241100000) {
                                Bundle bundle = new Bundle();
                                bundle.putBoolean("proxy_retention", zM1011f);
                                g92 g92VarM2004d = g92.m2004d(w31Var2.f8360b);
                                synchronized (g92VarM2004d) {
                                    i3 = g92VarM2004d.f2671j;
                                    g92VarM2004d.f2671j = i3 + 1;
                                }
                                v92VarM2008e = g92VarM2004d.m2008e(new a82(i3, 4, bundle, 0));
                            } else {
                                IOException iOException = new IOException("SERVICE_NOT_AVAILABLE");
                                v92 v92Var = new v92();
                                v92Var.m5136l(iOException);
                                v92VarM2008e = v92Var;
                            }
                            v92VarM2008e.m5127c(new fn0(), new ou0() { // from class: uy0
                                @Override // p000.ou0
                                /* JADX INFO: renamed from: b */
                                public final void mo306b(Object obj) {
                                    SharedPreferences.Editor editorEdit = vk1.m5168d(context3).edit();
                                    editorEdit.putBoolean("proxy_retention", zM1011f);
                                    editorEdit.apply();
                                }
                            });
                        }
                        if (firebaseMessaging.m1011f()) {
                            firebaseMessaging.m1010e();
                            return;
                        }
                        return;
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new hr0("Firebase-Messaging-Topics-Io"));
        hn0.m2312c(scheduledThreadPoolExecutor2, new Callable() { // from class: be1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ae1 ae1Var;
                Context context3 = context2;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                C0475mm c0475mm2 = c0475mm;
                C0902y5 c0902y6 = c0902y5;
                synchronized (ae1.class) {
                    try {
                        WeakReference weakReference = ae1.f162b;
                        ae1 ae1Var2 = weakReference != null ? (ae1) weakReference.get() : null;
                        if (ae1Var2 == null) {
                            SharedPreferences sharedPreferences = context3.getSharedPreferences("com.google.android.gms.appid", 0);
                            ae1Var = new ae1();
                            synchronized (ae1Var) {
                                ae1Var.f163a = n71.m3489a(sharedPreferences, scheduledThreadPoolExecutor3);
                            }
                            ae1.f162b = new WeakReference(ae1Var);
                        } else {
                            ae1Var = ae1Var2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new ce1(firebaseMessaging, c0475mm2, ae1Var, c0902y6, context3, scheduledThreadPoolExecutor3);
            }
        }).m5127c(scheduledThreadPoolExecutor, new q10(this, i2));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: p10

            /* JADX INFO: renamed from: k */
            public final /* synthetic */ FirebaseMessaging f5960k;

            {
                this.f5960k = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                v92 v92VarM2008e;
                int i3;
                int i4 = i;
                FirebaseMessaging firebaseMessaging = this.f5960k;
                switch (i4) {
                    case 0:
                        if (firebaseMessaging.f1390e.m5179j() && firebaseMessaging.m1013h(firebaseMessaging.m1009d())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.f1394i) {
                                    firebaseMessaging.m1012g(0L);
                                }
                                break;
                            }
                            return;
                        }
                        return;
                    default:
                        final Context context3 = firebaseMessaging.f1387b;
                        xe1.m5641j(context3);
                        C0902y5 c0902y6 = firebaseMessaging.f1388c;
                        final boolean zM1011f = firebaseMessaging.m1011f();
                        SharedPreferences sharedPreferencesM5168d = vk1.m5168d(context3);
                        if (!sharedPreferencesM5168d.contains("proxy_retention") || sharedPreferencesM5168d.getBoolean("proxy_retention", false) != zM1011f) {
                            w31 w31Var2 = (w31) c0902y6.f9156c;
                            if (w31Var2.f8361c.m3006a() >= 241100000) {
                                Bundle bundle = new Bundle();
                                bundle.putBoolean("proxy_retention", zM1011f);
                                g92 g92VarM2004d = g92.m2004d(w31Var2.f8360b);
                                synchronized (g92VarM2004d) {
                                    i3 = g92VarM2004d.f2671j;
                                    g92VarM2004d.f2671j = i3 + 1;
                                }
                                v92VarM2008e = g92VarM2004d.m2008e(new a82(i3, 4, bundle, 0));
                            } else {
                                IOException iOException = new IOException("SERVICE_NOT_AVAILABLE");
                                v92 v92Var = new v92();
                                v92Var.m5136l(iOException);
                                v92VarM2008e = v92Var;
                            }
                            v92VarM2008e.m5127c(new fn0(), new ou0() { // from class: uy0
                                @Override // p000.ou0
                                /* JADX INFO: renamed from: b */
                                public final void mo306b(Object obj) {
                                    SharedPreferences.Editor editorEdit = vk1.m5168d(context3).edit();
                                    editorEdit.putBoolean("proxy_retention", zM1011f);
                                    editorEdit.apply();
                                }
                            });
                        }
                        if (firebaseMessaging.m1011f()) {
                            firebaseMessaging.m1010e();
                            return;
                        }
                        return;
                }
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static void m1006b(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f1385l == null) {
                    f1385l = new ScheduledThreadPoolExecutor(1, new hr0("TAG"));
                }
                f1385l.schedule(runnable, j, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static synchronized an0 m1007c(Context context) {
        try {
            if (f1383j == null) {
                f1383j = new an0(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f1383j;
    }

    public static synchronized FirebaseMessaging getInstance(w00 w00Var) {
        FirebaseMessaging firebaseMessaging;
        w00Var.m5224a();
        firebaseMessaging = (FirebaseMessaging) w00Var.f8321d.mo2281a(FirebaseMessaging.class);
        p80.m3864i(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    /* JADX INFO: renamed from: a */
    public final String m1008a() {
        v92 v92VarM5129e;
        qa1 qa1VarM1009d = m1009d();
        if (!m1013h(qa1VarM1009d)) {
            return qa1VarM1009d.f6443a;
        }
        String strM3400h = C0475mm.m3400h(this.f1386a);
        f50 f50Var = this.f1389d;
        synchronized (f50Var) {
            v92VarM5129e = (v92) ((C0089c8) f50Var.f2314l).get(strM3400h);
            if (v92VarM5129e == null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + strM3400h);
                }
                C0902y5 c0902y5 = this.f1388c;
                v92VarM5129e = c0902y5.m5732m(c0902y5.m5735r(C0475mm.m3400h((w00) c0902y5.f9154a), "*", new Bundle())).m5134j(this.f1392g, new C0923yq(this, strM3400h, qa1VarM1009d, 1)).m5129e((Executor) f50Var.f2313k, new C0615qe(16, f50Var, strM3400h));
                ((C0089c8) f50Var.f2314l).put(strM3400h, v92VarM5129e);
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + strM3400h);
            }
        }
        try {
            return (String) hn0.m2310a(v92VarM5129e);
        } catch (InterruptedException | ExecutionException e) {
            throw new IOException(e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final qa1 m1009d() {
        qa1 qa1VarM4044b;
        an0 an0VarM1007c = m1007c(this.f1387b);
        w00 w00Var = this.f1386a;
        w00Var.m5224a();
        String strM5225c = "[DEFAULT]".equals(w00Var.f8319b) ? "" : w00Var.m5225c();
        String strM3400h = C0475mm.m3400h(this.f1386a);
        synchronized (an0VarM1007c) {
            qa1VarM4044b = qa1.m4044b(((SharedPreferences) an0VarM1007c.f254k).getString(strM5225c + "|T|" + strM3400h + "|*", null));
        }
        return qa1VarM4044b;
    }

    /* JADX INFO: renamed from: e */
    public final void m1010e() {
        v92 v92VarM5128d;
        int i;
        w31 w31Var = (w31) this.f1388c.f9156c;
        int i2 = 1;
        if (w31Var.f8361c.m3006a() >= 241100000) {
            g92 g92VarM2004d = g92.m2004d(w31Var.f8360b);
            Bundle bundle = Bundle.EMPTY;
            synchronized (g92VarM2004d) {
                i = g92VarM2004d.f2671j;
                g92VarM2004d.f2671j = i + 1;
            }
            v92VarM5128d = g92VarM2004d.m2008e(new a82(i, 5, bundle, 1)).m5128d(iw1.f3685l, o31.f5611s);
        } else {
            IOException iOException = new IOException("SERVICE_NOT_AVAILABLE");
            v92 v92Var = new v92();
            v92Var.m5136l(iOException);
            v92VarM5128d = v92Var;
        }
        v92VarM5128d.m5127c(this.f1391f, new q10(this, i2));
    }

    /* JADX INFO: renamed from: f */
    public final boolean m1011f() {
        Context context = this.f1387b;
        xe1.m5641j(context);
        if (Binder.getCallingUid() != context.getApplicationInfo().uid) {
            Log.e("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
            return false;
        }
        if ("com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "GMS core is set for proxying");
            }
            w00 w00Var = this.f1386a;
            w00Var.m5224a();
            if (w00Var.f8321d.mo2281a(InterfaceC0826w3.class) != null) {
                return true;
            }
            if (d71.m1107b() && f1384k != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m1012g(long j) {
        m1006b(new dc1(this, Math.min(Math.max(30L, 2 * j), 28800L)), j);
        this.f1394i = true;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m1013h(qa1 qa1Var) {
        if (qa1Var != null) {
            return System.currentTimeMillis() > qa1Var.f6444b + 604800000 || !this.f1393h.m3401g().equals((String) qa1Var.f6445c);
        }
        return true;
    }
}
