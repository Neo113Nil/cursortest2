package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.RequiresApi;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.f;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;

@RequiresApi(api = 21)
/* loaded from: classes.dex */
public final class d implements q {
    public final Context a;
    public final com.google.android.datatransport.runtime.scheduling.persistence.d b;
    public final f c;

    public d(Context context, com.google.android.datatransport.runtime.scheduling.persistence.d dVar, f fVar) {
        this.a = context;
        this.b = dVar;
        this.c = fVar;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.q
    public final void a(com.google.android.datatransport.runtime.n nVar, int i) {
        b(nVar, i, false);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.q
    public final void b(com.google.android.datatransport.runtime.n nVar, int i, boolean z) {
        Context context = this.a;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(nVar.a().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(com.google.android.datatransport.runtime.util.a.a(nVar.c())).array());
        if (nVar.b() != null) {
            adler32.update(nVar.b());
        }
        int value = (int) adler32.getValue();
        if (!z) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i2 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i2 >= i) {
                        com.google.android.datatransport.runtime.logging.a.a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", nVar);
                        return;
                    }
                }
            }
        }
        long w = this.b.w(nVar);
        JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
        com.google.android.datatransport.e c = nVar.c();
        f fVar = this.c;
        builder.setMinimumLatency(fVar.b(c, w, i));
        Set<f.b> b = fVar.c().get(c).b();
        if (b.contains(f.b.a)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (b.contains(f.b.c)) {
            builder.setRequiresCharging(true);
        }
        if (b.contains(f.b.b)) {
            builder.setRequiresDeviceIdle(true);
        }
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i);
        persistableBundle.putString("backendName", nVar.a());
        persistableBundle.putInt("priority", com.google.android.datatransport.runtime.util.a.a(nVar.c()));
        if (nVar.b() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(nVar.b(), 0));
        }
        builder.setExtras(persistableBundle);
        Object[] objArr = {nVar, Integer.valueOf(value), Long.valueOf(fVar.b(nVar.c(), w, i)), Long.valueOf(w), Integer.valueOf(i)};
        if (Log.isLoggable(com.google.android.datatransport.runtime.logging.a.b("JobInfoScheduler"), 3)) {
            String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr);
        }
        jobScheduler.schedule(builder.build());
    }
}
