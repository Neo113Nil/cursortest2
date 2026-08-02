package androidx.work.impl.background.systemjob;

import L1.a;
import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.Network;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import f2.m;
import g2.InterfaceC1977a;
import g2.l;
import java.util.Arrays;
import java.util.HashMap;
import v3.e;

/* loaded from: classes.dex */
public class SystemJobService extends JobService implements InterfaceC1977a {

    /* renamed from: m, reason: collision with root package name */
    public static final String f7113m = m.f("SystemJobService");

    /* renamed from: k, reason: collision with root package name */
    public l f7114k;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f7115l = new HashMap();

    @Override // g2.InterfaceC1977a
    public final void a(String str, boolean z3) {
        JobParameters jobParameters;
        m.d().a(f7113m, str + " executed on JobScheduler", new Throwable[0]);
        synchronized (this.f7115l) {
            jobParameters = (JobParameters) this.f7115l.remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z3);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            l Q5 = l.Q(getApplicationContext());
            this.f7114k = Q5;
            Q5.f17133p.b(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            m.d().h(f7113m, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        l lVar = this.f7114k;
        if (lVar != null) {
            lVar.f17133p.f(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    @Override // android.app.job.JobService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onStartJob(JobParameters jobParameters) {
        String str;
        Uri[] triggeredContentUris;
        String[] triggeredContentAuthorities;
        Network network;
        String[] triggeredContentAuthorities2;
        Uri[] triggeredContentUris2;
        PersistableBundle extras;
        if (this.f7114k == null) {
            m.d().a(f7113m, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        e eVar = null;
        try {
            extras = jobParameters.getExtras();
        } catch (NullPointerException unused) {
        }
        if (extras != null && extras.containsKey("EXTRA_WORK_SPEC_ID")) {
            str = extras.getString("EXTRA_WORK_SPEC_ID");
            if (!TextUtils.isEmpty(str)) {
                m.d().b(f7113m, "WorkSpec id not found!", new Throwable[0]);
                return false;
            }
            synchronized (this.f7115l) {
                try {
                    if (this.f7115l.containsKey(str)) {
                        m.d().a(f7113m, "Job is already being executed by SystemJobService: " + str, new Throwable[0]);
                        return false;
                    }
                    m.d().a(f7113m, "onStartJob for " + str, new Throwable[0]);
                    this.f7115l.put(str, jobParameters);
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 24) {
                        eVar = new e(17);
                        triggeredContentUris = jobParameters.getTriggeredContentUris();
                        if (triggeredContentUris != null) {
                            triggeredContentUris2 = jobParameters.getTriggeredContentUris();
                            eVar.f20433m = Arrays.asList(triggeredContentUris2);
                        }
                        triggeredContentAuthorities = jobParameters.getTriggeredContentAuthorities();
                        if (triggeredContentAuthorities != null) {
                            triggeredContentAuthorities2 = jobParameters.getTriggeredContentAuthorities();
                            eVar.f20432l = Arrays.asList(triggeredContentAuthorities2);
                        }
                        if (i >= 28) {
                            network = jobParameters.getNetwork();
                            eVar.f20434n = network;
                        }
                    }
                    this.f7114k.U(str, eVar);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        str = null;
        if (!TextUtils.isEmpty(str)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    @Override // android.app.job.JobService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onStopJob(JobParameters jobParameters) {
        String str;
        PersistableBundle extras;
        if (this.f7114k == null) {
            m.d().a(f7113m, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        try {
            extras = jobParameters.getExtras();
        } catch (NullPointerException unused) {
        }
        if (extras != null && extras.containsKey("EXTRA_WORK_SPEC_ID")) {
            str = extras.getString("EXTRA_WORK_SPEC_ID");
            if (!TextUtils.isEmpty(str)) {
                m.d().b(f7113m, "WorkSpec id not found!", new Throwable[0]);
                return false;
            }
            m.d().a(f7113m, a.m("onStopJob for ", str), new Throwable[0]);
            synchronized (this.f7115l) {
                this.f7115l.remove(str);
            }
            this.f7114k.V(str);
            return !this.f7114k.f17133p.d(str);
        }
        str = null;
        if (!TextUtils.isEmpty(str)) {
        }
    }
}
