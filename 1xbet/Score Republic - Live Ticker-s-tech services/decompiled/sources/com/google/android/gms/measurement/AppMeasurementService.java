package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import p000.b12;
import p000.b52;
import p000.c32;
import p000.f02;
import p000.f31;
import p000.ky1;
import p000.si1;
import p000.x62;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementService extends Service implements b52 {

    /* JADX INFO: renamed from: j */
    public c32 f1349j;

    @Override // p000.b52
    /* JADX INFO: renamed from: a */
    public final boolean mo593a(int i) {
        return stopSelfResult(i);
    }

    @Override // p000.b52
    /* JADX INFO: renamed from: b */
    public final void mo594b(Intent intent) {
        SparseArray sparseArray = si1.f7125a;
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return;
        }
        SparseArray sparseArray2 = si1.f7125a;
        synchronized (sparseArray2) {
            try {
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) sparseArray2.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray2.remove(intExtra);
                } else {
                    Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.b52
    /* JADX INFO: renamed from: c */
    public final void mo595c(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: d */
    public final c32 m992d() {
        if (this.f1349j == null) {
            this.f1349j = new c32(1, this);
        }
        return this.f1349j;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        c32 c32VarM992d = m992d();
        c32VarM992d.getClass();
        if (intent == null) {
            Log.e("FA", "onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new b12(x62.m5528C((Service) c32VarM992d.f1083k));
        }
        Log.w("FA", "onBind received unknown action: ".concat(String.valueOf(action)));
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Log.v("FA", ((Service) m992d().f1083k).getClass().getSimpleName().concat(" is starting up."));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        Log.v("FA", ((Service) m992d().f1083k).getClass().getSimpleName().concat(" is shutting down."));
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        m992d();
        if (intent == null) {
            Log.e("FA", "onRebind called with null intent");
        } else {
            Log.v("FA", "onRebind called. action: ".concat(String.valueOf(intent.getAction())));
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i, final int i2) {
        final c32 c32VarM992d = m992d();
        if (intent == null) {
            c32VarM992d.getClass();
            Log.w("FA", "AppMeasurementService started with null intent");
            return 2;
        }
        Service service = (Service) c32VarM992d.f1083k;
        final ky1 ky1Var = f02.m1561s(service, null, null, null).f2247o;
        f02.m1560m(ky1Var);
        String action = intent.getAction();
        ky1Var.f4608w.m5314c(Integer.valueOf(i2), action, "Local AppMeasurementService called. startId, action");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        Runnable runnable = new Runnable() { // from class: e52
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                Service service2 = (Service) c32VarM992d.f1083k;
                b52 b52Var = (b52) service2;
                int i3 = i2;
                if (b52Var.mo593a(i3)) {
                    ky1Var.f4608w.m5313b(Integer.valueOf(i3), "Local AppMeasurementService processed last upload request. StartId");
                    ky1 ky1Var2 = f02.m1561s(service2, null, null, null).f2247o;
                    f02.m1560m(ky1Var2);
                    ky1Var2.f4608w.m5312a("Completed wakeful intent.");
                    b52Var.mo594b(intent);
                }
            }
        };
        x62 x62VarM5528C = x62.m5528C(service);
        x62VarM5528C.mo1564c().m6J(new f31(c32VarM992d, x62VarM5528C, runnable));
        return 2;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        m992d();
        if (intent == null) {
            Log.e("FA", "onUnbind called with null intent");
            return true;
        }
        Log.v("FA", "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction())));
        return true;
    }
}
