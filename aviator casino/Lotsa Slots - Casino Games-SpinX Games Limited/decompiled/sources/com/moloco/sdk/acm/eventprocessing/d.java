package com.moloco.sdk.acm.eventprocessing;

/* loaded from: classes5.dex */
public final class d implements com.moloco.sdk.acm.eventprocessing.c {

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.acm.a f6892a;
    public final android.content.Context b;

    public d(com.moloco.sdk.acm.a config, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.f6892a = config;
        this.b = context;
    }

    @Override // com.moloco.sdk.acm.eventprocessing.c
    public void a() {
        androidx.work.Constraints build = new androidx.work.Constraints.Builder().setRequiredNetworkType(androidx.work.NetworkType.CONNECTED).build();
        androidx.work.Data a2 = com.moloco.sdk.acm.eventprocessing.e.a(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", this.f6892a.g()), kotlin.TuplesKt.to(com.moloco.sdk.acm.b.e, this.f6892a.f().get(com.moloco.sdk.acm.b.e)), kotlin.TuplesKt.to(com.moloco.sdk.acm.b.f, this.f6892a.f().get(com.moloco.sdk.acm.b.f)), kotlin.TuplesKt.to(com.moloco.sdk.acm.b.g, this.f6892a.f().get(com.moloco.sdk.acm.b.g)), kotlin.TuplesKt.to(com.moloco.sdk.acm.b.d, this.f6892a.f().get(com.moloco.sdk.acm.b.d)), kotlin.TuplesKt.to("osv", this.f6892a.f().get("osv")), kotlin.TuplesKt.to(com.moloco.sdk.acm.b.h, this.f6892a.f().get(com.moloco.sdk.acm.b.h)), kotlin.TuplesKt.to(com.moloco.sdk.acm.b.b, this.f6892a.f().get(com.moloco.sdk.acm.b.b))));
        if (a2 == null) {
            return;
        }
        androidx.work.WorkManager.getInstance(this.b).enqueue(new androidx.work.OneTimeWorkRequest.Builder(com.moloco.sdk.acm.eventprocessing.DBRequestWorker.class).setConstraints(build).setInputData(a2).setBackoffCriteria(androidx.work.BackoffPolicy.EXPONENTIAL, 10000L, java.util.concurrent.TimeUnit.MILLISECONDS).build());
    }
}
