package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.Network;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.annotation.NonNull;
import androidx.work.WorkerParameters;
import androidx.work.impl.C;
import androidx.work.impl.InterfaceC5476d;
import androidx.work.impl.t;
import androidx.work.impl.u;
import androidx.work.o;
import g5.C6643p;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public class SystemJobService extends JobService implements InterfaceC5476d {

    /* renamed from: d, reason: collision with root package name */
    private static final String f45414d = o.i("SystemJobService");

    /* renamed from: a, reason: collision with root package name */
    private C f45415a;

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f45416b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final u f45417c = new u();

    /* loaded from: classes8.dex */
    static class a {
        static String[] a(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentAuthorities();
        }

        static Uri[] b(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentUris();
        }
    }

    /* loaded from: classes8.dex */
    static class b {
        static Network a(JobParameters jobParameters) {
            return jobParameters.getNetwork();
        }
    }

    private static C6643p a(@NonNull JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new C6643p(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // androidx.work.impl.InterfaceC5476d
    public final void b(@NonNull C6643p c6643p, boolean z11) {
        JobParameters jobParameters;
        o.e().a(f45414d, c6643p.b() + " executed on JobScheduler");
        synchronized (this.f45416b) {
            jobParameters = (JobParameters) this.f45416b.remove(c6643p);
        }
        this.f45417c.b(c6643p);
        if (jobParameters != null) {
            jobFinished(jobParameters, z11);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            C i11 = C.i(getApplicationContext());
            this.f45415a = i11;
            i11.k().c(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            o.e().k(f45414d, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        C c11 = this.f45415a;
        if (c11 != null) {
            c11.k().i(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(@NonNull JobParameters jobParameters) {
        if (this.f45415a == null) {
            o.e().a(f45414d, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        C6643p a11 = a(jobParameters);
        if (a11 == null) {
            o.e().c(f45414d, "WorkSpec id not found!");
            return false;
        }
        synchronized (this.f45416b) {
            try {
                if (this.f45416b.containsKey(a11)) {
                    o.e().a(f45414d, "Job is already being executed by SystemJobService: " + a11);
                    return false;
                }
                o.e().a(f45414d, "onStartJob for " + a11);
                this.f45416b.put(a11, jobParameters);
                int i11 = Build.VERSION.SDK_INT;
                WorkerParameters.a aVar = new WorkerParameters.a();
                if (a.b(jobParameters) != null) {
                    aVar.f45256b = Arrays.asList(a.b(jobParameters));
                }
                if (a.a(jobParameters) != null) {
                    aVar.f45255a = Arrays.asList(a.a(jobParameters));
                }
                if (i11 >= 28) {
                    aVar.f45257c = b.a(jobParameters);
                }
                this.f45415a.u(this.f45417c.d(a11), aVar);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(@NonNull JobParameters jobParameters) {
        if (this.f45415a == null) {
            o.e().a(f45414d, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        C6643p a11 = a(jobParameters);
        if (a11 == null) {
            o.e().c(f45414d, "WorkSpec id not found!");
            return false;
        }
        o.e().a(f45414d, "onStopJob for " + a11);
        synchronized (this.f45416b) {
            this.f45416b.remove(a11);
        }
        t b11 = this.f45417c.b(a11);
        if (b11 != null) {
            this.f45415a.w(b11);
        }
        return !this.f45415a.k().f(a11.b());
    }
}
