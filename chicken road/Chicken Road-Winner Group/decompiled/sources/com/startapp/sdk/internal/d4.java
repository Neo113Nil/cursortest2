package com.startapp.sdk.internal;

import android.content.Context;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class d4 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f3566a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ib f3567b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f3568c;

    public d4(com.startapp.sdk.components.a aVar, Context context, ib ibVar) {
        this.f3568c = aVar;
        this.f3566a = context;
        this.f3567b = ibVar;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 2, 5L, TimeUnit.SECONDS, new PriorityBlockingQueue(), new u5("info"));
        h9 h9Var = new h9(this.f3566a);
        k8 k8Var = (k8) this.f3567b.a();
        b4 b4Var = new b4(threadPoolExecutor);
        com.startapp.sdk.components.a aVar = this.f3568c;
        return new t9(h9Var, k8Var, threadPoolExecutor, b4Var, aVar.f3372t, new x9(this.f3566a, aVar.f3366n, aVar.f3361i), new c4());
    }
}
