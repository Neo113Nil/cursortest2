package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class id implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f3867a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ld f3868b;

    public id(ld ldVar, String str) {
        this.f3868b = ldVar;
        this.f3867a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ld ldVar = this.f3868b;
        String str = this.f3867a;
        ldVar.getClass();
        ldVar.f4004r = System.currentTimeMillis();
        ldVar.f4003q.put(ldVar.f3992e, Float.valueOf((r2 - ldVar.f4004r) / 1000.0f));
        ldVar.f4003q.put(str, Float.valueOf(-1.0f));
        ldVar.f3992e = str;
    }
}
