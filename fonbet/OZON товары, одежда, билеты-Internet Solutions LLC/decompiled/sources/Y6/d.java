package Y6;

import S6.r;
import Y6.e;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import c7.C5758a;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;

/* loaded from: classes9.dex */
public final class d implements q {

    /* renamed from: a, reason: collision with root package name */
    private final Context f34653a;

    /* renamed from: b, reason: collision with root package name */
    private final Z6.d f34654b;

    /* renamed from: c, reason: collision with root package name */
    private final e f34655c;

    public d(Context context, Z6.d dVar, e eVar) {
        this.f34653a = context;
        this.f34654b = dVar;
        this.f34655c = eVar;
    }

    @Override // Y6.q
    public final void a(r rVar, int i11) {
        b(rVar, i11, false);
    }

    @Override // Y6.q
    public final void b(r rVar, int i11, boolean z11) {
        Context context = this.f34653a;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(rVar.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(C5758a.a(rVar.d())).array());
        if (rVar.c() != null) {
            adler32.update(rVar.c());
        }
        int value = (int) adler32.getValue();
        if (!z11) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i12 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i12 >= i11) {
                        W6.a.a(rVar, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                        return;
                    }
                }
            }
        }
        long e12 = this.f34654b.e1(rVar);
        JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
        Q6.e d11 = rVar.d();
        e eVar = this.f34655c;
        builder.setMinimumLatency(eVar.b(d11, e12, i11));
        Set<e.c> c11 = eVar.c().get(d11).c();
        if (c11.contains(e.c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (c11.contains(e.c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (c11.contains(e.c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i11);
        persistableBundle.putString("backendName", rVar.b());
        persistableBundle.putInt("priority", C5758a.a(rVar.d()));
        if (rVar.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(rVar.c(), 0));
        }
        builder.setExtras(persistableBundle);
        W6.a.b("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", rVar, Integer.valueOf(value), Long.valueOf(eVar.b(rVar.d(), e12, i11)), Long.valueOf(e12), Integer.valueOf(i11));
        jobScheduler.schedule(builder.build());
    }
}
