package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import p000.C0648ra;
import p000.RunnableC0195f1;
import p000.gx0;
import p000.jg1;
import p000.ng1;
import p000.qd0;
import p000.se1;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ int f1324j = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        se1.m4517b(getApplicationContext());
        qd0 qd0VarM4283a = C0648ra.m4283a();
        qd0VarM4283a.m4087y(string);
        qd0VarM4283a.f6473m = gx0.m2163b(i);
        if (string2 != null) {
            qd0VarM4283a.f6472l = Base64.decode(string2, 0);
        }
        ng1 ng1Var = se1.m4516a().f7108d;
        ng1Var.f5434e.execute(new jg1(ng1Var, qd0VarM4283a.m4073e(), i2, new RunnableC0195f1(11, this, jobParameters)));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
