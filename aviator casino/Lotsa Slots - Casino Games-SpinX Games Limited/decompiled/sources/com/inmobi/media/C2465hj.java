package com.inmobi.media;

/* renamed from: com.inmobi.media.hj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2465hj {

    /* renamed from: a, reason: collision with root package name */
    public final long f5245a;
    public final com.inmobi.media.InterfaceC2772t9 b;
    public final kotlin.jvm.functions.Function1 c;
    public final kotlinx.coroutines.CoroutineScope d;
    public long e;
    public boolean f;
    public com.inmobi.media.EnumC2412fj g;
    public boolean h;
    public kotlinx.coroutines.Job i;

    public C2465hj(long j, com.inmobi.media.InterfaceC2772t9 interfaceC2772t9, kotlin.jvm.functions.Function1 onLoadingCompleted) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onLoadingCompleted, "onLoadingCompleted");
        this.f5245a = j;
        this.b = interfaceC2772t9;
        this.c = onLoadingCompleted;
        this.d = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null).plus(kotlinx.coroutines.Dispatchers.getMain().getImmediate()));
        this.g = com.inmobi.media.EnumC2412fj.f5204a;
    }

    public final void a() {
        try {
            kotlinx.coroutines.Job job = this.i;
            if (job != null) {
                kotlinx.coroutines.JobKt.ensureActive(job);
            }
            kotlinx.coroutines.Job job2 = this.i;
            if (job2 != null) {
                kotlinx.coroutines.Job.DefaultImpls.cancel$default(job2, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
            }
        } catch (java.lang.Exception unused) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.b;
            if (interfaceC2772t9 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t9).b("SessionTracker", "No pending commit completion job to cancel.");
            }
        }
        this.i = null;
    }

    public final void a(java.lang.String str, java.lang.String str2) {
        boolean z = this.f;
        if (z) {
            return;
        }
        long j = this.f5245a;
        if (j <= 0) {
            return;
        }
        if (!z && j > 0) {
            this.f = true;
            this.g = com.inmobi.media.EnumC2412fj.f;
            a();
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.b;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("SessionTracker", "onLoadingCompleted sessionId=" + this.e + " reason=" + str + " url=" + str2);
        }
        this.c.invoke(str);
    }
}
