package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import androidx.annotation.RequiresApi;

@RequiresApi(api = 21)
/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    public static final /* synthetic */ int a = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        com.google.android.datatransport.runtime.q.b(getApplicationContext());
        if (string == null) {
            throw new NullPointerException("Null backendName");
        }
        com.google.android.datatransport.e b = com.google.android.datatransport.runtime.util.a.b(i);
        byte[] decode = string2 != null ? Base64.decode(string2, 0) : null;
        m mVar = com.google.android.datatransport.runtime.q.a().d;
        mVar.e.execute(new l(mVar, new com.google.android.datatransport.runtime.d(string, decode, b), i2, new e(0, this, jobParameters)));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
