package com.vungle.ads.internal.task;

import android.os.Bundle;
import android.os.Process;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class f extends i {
    public static final String e = "f";

    /* renamed from: a, reason: collision with root package name */
    public final e f12135a;
    public final d b;
    public final g c;
    public final m d;

    public f(e jobinfo, d creator, g jobRunner, m mVar) {
        Intrinsics.checkNotNullParameter(jobinfo, "jobinfo");
        Intrinsics.checkNotNullParameter(creator, "creator");
        Intrinsics.checkNotNullParameter(jobRunner, "jobRunner");
        this.f12135a = jobinfo;
        this.b = creator;
        this.c = jobRunner;
        this.d = mVar;
    }

    @Override // com.vungle.ads.internal.task.i
    public final int a() {
        return this.f12135a.e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m mVar = this.d;
        if (mVar != null) {
            try {
                int a2 = ((h) mVar).a(this.f12135a);
                Process.setThreadPriority(a2);
                boolean z = u.f12190a;
                String TAG = e;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                t.a(TAG, "Setting process thread prio = " + a2 + " for " + this.f12135a.d());
            } catch (Throwable unused) {
                boolean z2 = u.f12190a;
                String TAG2 = e;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                t.b(TAG2, "Error on setting process thread priority");
            }
        }
        try {
            String d = this.f12135a.d();
            Bundle c = this.f12135a.c();
            boolean z3 = u.f12190a;
            String TAG3 = e;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            t.a(TAG3, "Start job " + d + "Thread " + Thread.currentThread().getName());
            int a3 = ((o) this.b).a(d).a(c, this.c);
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            t.a(TAG3, "On job finished " + d + " with result " + a3);
            if (a3 == 2) {
                this.f12135a.getClass();
            }
        } catch (Exception e2) {
            boolean z4 = u.f12190a;
            String TAG4 = e;
            Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
            t.b(TAG4, "Cannot create job" + e2.getLocalizedMessage());
        }
    }
}
