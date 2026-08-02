package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.Network;
import android.os.Build;
import android.os.PersistableBundle;
import android.support.v4.media.session.t;
import android.text.TextUtils;
import d1.n;
import e1.C0995b;
import e1.InterfaceC0994a;
import e1.k;
import e1.l;
import java.util.Arrays;
import java.util.HashMap;
import w1.L;

/* loaded from: classes.dex */
public class SystemJobService extends JobService implements InterfaceC0994a {

    /* renamed from: c, reason: collision with root package name */
    public static final String f9883c = n.g("SystemJobService");

    /* renamed from: a, reason: collision with root package name */
    public l f9884a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f9885b = new HashMap();

    @Override // e1.InterfaceC0994a
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
            l m02 = l.m0(getApplicationContext());
            this.f9884a = m02;
            m02.f12549z.a(this);
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
            lVar.f12549z.e(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    @Override // android.app.job.JobService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onStartJob(JobParameters jobParameters) {
        String str;
        Network network;
        PersistableBundle extras;
        if (this.f9884a == null) {
            n.d().b(f9883c, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        try {
            extras = jobParameters.getExtras();
        } catch (NullPointerException unused) {
        }
        if (extras != null && extras.containsKey("EXTRA_WORK_SPEC_ID")) {
            str = extras.getString("EXTRA_WORK_SPEC_ID");
            if (!TextUtils.isEmpty(str)) {
                n.d().c(f9883c, "WorkSpec id not found!", new Throwable[0]);
                return false;
            }
            synchronized (this.f9885b) {
                try {
                    if (this.f9885b.containsKey(str)) {
                        n.d().b(f9883c, "Job is already being executed by SystemJobService: " + str, new Throwable[0]);
                        return false;
                    }
                    n.d().b(f9883c, "onStartJob for " + str, new Throwable[0]);
                    this.f9885b.put(str, jobParameters);
                    int i7 = Build.VERSION.SDK_INT;
                    t tVar = new t(18);
                    if (jobParameters.getTriggeredContentUris() != null) {
                        tVar.f8077c = Arrays.asList(jobParameters.getTriggeredContentUris());
                    }
                    if (jobParameters.getTriggeredContentAuthorities() != null) {
                        tVar.f8076b = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
                    }
                    if (i7 >= 28) {
                        network = jobParameters.getNetwork();
                        tVar.f8078d = network;
                    }
                    this.f9884a.q0(str, tVar);
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
        boolean contains;
        PersistableBundle extras;
        if (this.f9884a == null) {
            n.d().b(f9883c, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        try {
            extras = jobParameters.getExtras();
        } catch (NullPointerException unused) {
        }
        if (extras != null && extras.containsKey("EXTRA_WORK_SPEC_ID")) {
            str = extras.getString("EXTRA_WORK_SPEC_ID");
            if (!TextUtils.isEmpty(str)) {
                n.d().c(f9883c, "WorkSpec id not found!", new Throwable[0]);
                return false;
            }
            n.d().b(f9883c, L.i("onStopJob for ", str), new Throwable[0]);
            synchronized (this.f9885b) {
                this.f9885b.remove(str);
            }
            this.f9884a.r0(str);
            C0995b c0995b = this.f9884a.f12549z;
            synchronized (c0995b.f12510B) {
                contains = c0995b.f12519z.contains(str);
            }
            return !contains;
        }
        str = null;
        if (!TextUtils.isEmpty(str)) {
        }
    }
}
