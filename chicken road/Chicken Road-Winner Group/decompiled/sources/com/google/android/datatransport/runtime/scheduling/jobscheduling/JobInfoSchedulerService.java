package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import A0.j;
import A0.k;
import A0.s;
import G0.f;
import G0.l;
import K0.a;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;

/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f2545a = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i3 = jobParameters.getExtras().getInt("priority");
        int i4 = jobParameters.getExtras().getInt("attemptNumber");
        s.b(getApplicationContext());
        j a3 = k.a();
        a3.O(string);
        a3.f68d = a.b(i3);
        if (string2 != null) {
            a3.f67c = Base64.decode(string2, 0);
        }
        l lVar = s.a().f89d;
        k t3 = a3.t();
        D1.a aVar = new D1.a(this, 3, jobParameters);
        lVar.getClass();
        lVar.f423e.execute(new f(lVar, t3, i4, aVar));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
