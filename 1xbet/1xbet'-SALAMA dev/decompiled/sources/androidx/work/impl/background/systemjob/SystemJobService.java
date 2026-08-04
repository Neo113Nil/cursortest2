package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import android.support.v4.media.session.t;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashMap;
import p023d1.n;
import p031e1.a;
import p031e1.b;
import p031e1.k;
import p031e1.l;
import p155w1.L;

/* JADX INFO: loaded from: classes.dex */
public class SystemJobService extends JobService implements a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f9883c = n.g("SystemJobService");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l f9884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f9885b = new HashMap();

    @Override // p031e1.a
    public final void b(String str, boolean z4) {
        JobParameters jobParameters;
        n.d().b(f9883c, k.e(str, " executed on JobScheduler"), new Throwable[0]);
        synchronized (this.f9885b) {
            jobParameters = (JobParameters) this.f9885b.remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z4);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            l lVarM0 = l.m0(getApplicationContext());
            this.f9884a = lVarM0;
            lVarM0.f12555z.a(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            n.d().i(f9883c, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        l lVar = this.f9884a;
        if (lVar != null) {
            lVar.f12555z.e(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string;
        if (this.f9884a == null) {
            n.d().b(f9883c, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        try {
            PersistableBundle extras = jobParameters.getExtras();
            string = (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) ? null : extras.getString("EXTRA_WORK_SPEC_ID");
        } catch (NullPointerException unused) {
        }
        if (TextUtils.isEmpty(string)) {
            n.d().c(f9883c, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        synchronized (this.f9885b) {
            try {
                if (this.f9885b.containsKey(string)) {
                    n.d().b(f9883c, "Job is already being executed by SystemJobService: " + string, new Throwable[0]);
                    return false;
                }
                n.d().b(f9883c, "onStartJob for " + string, new Throwable[0]);
                this.f9885b.put(string, jobParameters);
                int i7 = Build.VERSION.SDK_INT;
                t tVar = new t(18);
                if (jobParameters.getTriggeredContentUris() != null) {
                    tVar.f8077c = Arrays.asList(jobParameters.getTriggeredContentUris());
                }
                if (jobParameters.getTriggeredContentAuthorities() != null) {
                    tVar.f8076b = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
                }
                if (i7 >= 28) {
                    tVar.f8078d = jobParameters.getNetwork();
                }
                this.f9884a.q0(string, tVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        String string;
        boolean zContains;
        if (this.f9884a == null) {
            n.d().b(f9883c, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        try {
            PersistableBundle extras = jobParameters.getExtras();
            string = (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) ? null : extras.getString("EXTRA_WORK_SPEC_ID");
        } catch (NullPointerException unused) {
        }
        if (TextUtils.isEmpty(string)) {
            n.d().c(f9883c, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        n.d().b(f9883c, L.i("onStopJob for ", string), new Throwable[0]);
        synchronized (this.f9885b) {
            this.f9885b.remove(string);
        }
        this.f9884a.r0(string);
        b bVar = this.f9884a.f12555z;
        synchronized (bVar.f12516B) {
            zContains = bVar.f12525z.contains(string);
        }
        return !zContains;
    }
}
