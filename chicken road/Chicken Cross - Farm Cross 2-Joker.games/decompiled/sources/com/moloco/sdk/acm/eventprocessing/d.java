package com.moloco.sdk.acm.eventprocessing;

import android.content.Context;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import java.util.concurrent.TimeUnit;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.acm.a f10394a;
    public final Context b;

    public d(com.moloco.sdk.acm.a config, Context context) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f10394a = config;
        this.b = context;
    }

    @Override // com.moloco.sdk.acm.eventprocessing.c
    public void a() {
        Constraints build = new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build();
        Data a2 = e.a(MapsKt.mapOf(TuplesKt.to("url", this.f10394a.g()), TuplesKt.to(com.moloco.sdk.acm.b.e, this.f10394a.f().get(com.moloco.sdk.acm.b.e)), TuplesKt.to(com.moloco.sdk.acm.b.f, this.f10394a.f().get(com.moloco.sdk.acm.b.f)), TuplesKt.to(com.moloco.sdk.acm.b.g, this.f10394a.f().get(com.moloco.sdk.acm.b.g)), TuplesKt.to(com.moloco.sdk.acm.b.d, this.f10394a.f().get(com.moloco.sdk.acm.b.d)), TuplesKt.to("osv", this.f10394a.f().get("osv")), TuplesKt.to(com.moloco.sdk.acm.b.h, this.f10394a.f().get(com.moloco.sdk.acm.b.h)), TuplesKt.to(com.moloco.sdk.acm.b.b, this.f10394a.f().get(com.moloco.sdk.acm.b.b))));
        if (a2 == null) {
            return;
        }
        WorkManager.getInstance(this.b).enqueue(new OneTimeWorkRequest.Builder(DBRequestWorker.class).setConstraints(build).setInputData(a2).setBackoffCriteria(BackoffPolicy.EXPONENTIAL, 10000L, TimeUnit.MILLISECONDS).build());
    }
}
