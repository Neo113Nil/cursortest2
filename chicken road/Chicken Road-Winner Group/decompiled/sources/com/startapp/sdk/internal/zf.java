package com.startapp.sdk.internal;

import android.app.job.JobParameters;
import com.startapp.sdk.jobs.SchedulerService;

/* loaded from: classes.dex */
public final class zf implements ya {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JobParameters f4804a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SchedulerService f4805b;

    public zf(SchedulerService schedulerService, JobParameters jobParameters) {
        this.f4805b = schedulerService;
        this.f4804a = jobParameters;
    }

    @Override // com.startapp.sdk.internal.ya
    public final void a() {
        this.f4805b.jobFinished(this.f4804a, false);
    }
}
