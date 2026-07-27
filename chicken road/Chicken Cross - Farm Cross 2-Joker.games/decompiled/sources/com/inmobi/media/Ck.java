package com.inmobi.media;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.SupervisorKt;

/* loaded from: classes6.dex */
public final class Ck {

    /* renamed from: a, reason: collision with root package name */
    public final long f6497a;
    public final Y9 b;
    public final Function1 c;
    public final CoroutineScope d;
    public long e;
    public boolean f;
    public Ak g;
    public boolean h;
    public Job i;

    public Ck(long j, Y9 y9, Function1 onLoadingCompleted) {
        Intrinsics.checkNotNullParameter(onLoadingCompleted, "onLoadingCompleted");
        this.f6497a = j;
        this.b = y9;
        this.c = onLoadingCompleted;
        this.d = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain().getImmediate()));
        this.g = Ak.f6459a;
    }

    public final void a() {
        try {
            Job job = this.i;
            if (job != null) {
                JobKt.ensureActive(job);
            }
            Job job2 = this.i;
            if (job2 != null) {
                Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
            }
        } catch (Exception unused) {
            Y9 y9 = this.b;
            if (y9 != null) {
                ((Z9) y9).b("SessionTracker", "No pending commit completion job to cancel.");
            }
        }
        this.i = null;
    }

    public final void a(String str, String str2) {
        boolean z = this.f;
        if (z) {
            return;
        }
        long j = this.f6497a;
        if (j <= 0) {
            return;
        }
        if (!z && j > 0) {
            this.f = true;
            this.g = Ak.f;
            a();
        }
        Y9 y9 = this.b;
        if (y9 != null) {
            ((Z9) y9).a("SessionTracker", "onLoadingCompleted sessionId=" + this.e + " reason=" + str + " url=" + str2);
        }
        this.c.invoke(str);
    }
}
