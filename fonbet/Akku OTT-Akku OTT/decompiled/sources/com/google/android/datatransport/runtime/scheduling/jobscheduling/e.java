package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.content.Context;
import com.razorpay.CoreInitializer;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                int i2 = JobInfoSchedulerService.a;
                ((JobInfoSchedulerService) obj2).jobFinished((JobParameters) obj, false);
                break;
            default:
                CoreInitializer.m1696create$lambda1$lambda0((CoreInitializer) obj2, (Context) obj);
                break;
        }
    }
}
