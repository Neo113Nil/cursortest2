package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.util.Log;
import java.util.Objects;
import p000.RunnableC0702sr;
import p000.b52;
import p000.c32;
import p000.f31;
import p000.ky1;
import p000.mw1;
import p000.p80;
import p000.u90;
import p000.x62;
import p000.zv1;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementJobService extends JobService implements b52 {

    /* JADX INFO: renamed from: j */
    public c32 f1347j;

    @Override // p000.b52
    /* JADX INFO: renamed from: a */
    public final boolean mo593a(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.b52
    /* JADX INFO: renamed from: c */
    public final void mo595c(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    /* JADX INFO: renamed from: d */
    public final c32 m991d() {
        if (this.f1347j == null) {
            this.f1347j = new c32(1, this);
        }
        return this.f1347j;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Log.v("FA", ((Service) m991d().f1083k).getClass().getSimpleName().concat(" is starting up."));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        Log.v("FA", ((Service) m991d().f1083k).getClass().getSimpleName().concat(" is shutting down."));
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        m991d();
        if (intent == null) {
            Log.e("FA", "onRebind called with null intent");
        } else {
            Log.v("FA", "onRebind called. action: ".concat(String.valueOf(intent.getAction())));
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        JobParameters jobParameters2;
        c32 c32VarM991d = m991d();
        Service service = (Service) c32VarM991d.f1083k;
        String string = jobParameters.getExtras().getString("action");
        Log.v("FA", "onStartJob received action: ".concat(String.valueOf(string)));
        if (Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
            p80.m3863h(string);
            x62 x62VarM5528C = x62.m5528C(service);
            ky1 ky1VarMo1563b = x62VarM5528C.mo1563b();
            u90 u90Var = x62VarM5528C.f8832u.f2244l;
            ky1VarMo1563b.f4608w.m5313b(string, "Local AppMeasurementJobService called. action");
            jobParameters2 = jobParameters;
            x62VarM5528C.mo1564c().m6J(new f31(c32VarM991d, x62VarM5528C, new RunnableC0702sr(c32VarM991d, ky1VarMo1563b, jobParameters2, 17, false)));
        } else {
            jobParameters2 = jobParameters;
        }
        if (Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            p80.m3863h(string);
            mw1 mw1VarM3432d = mw1.m3432d(service, null);
            f31 f31Var = new f31(c32VarM991d, jobParameters2, 27, false);
            mw1VarM3432d.getClass();
            mw1VarM3432d.m3434b(new zv1(mw1VarM3432d, f31Var, 1));
        }
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        m991d();
        if (intent == null) {
            Log.e("FA", "onUnbind called with null intent");
            return true;
        }
        Log.v("FA", "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction())));
        return true;
    }

    @Override // p000.b52
    /* JADX INFO: renamed from: b */
    public final void mo594b(Intent intent) {
    }
}
