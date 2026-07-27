package com.fyber.inneractive.sdk.config;

import android.content.Context;

/* loaded from: classes4.dex */
public final class d0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e0 f5243a;

    public d0(e0 e0Var) {
        this.f5243a = e0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5243a.f5245a.M = new com.fyber.inneractive.sdk.measurement.e();
        e0 e0Var = this.f5243a;
        com.fyber.inneractive.sdk.measurement.e eVar = e0Var.f5245a.M;
        Context context = e0Var.b;
        if (eVar.f5440a) {
            return;
        }
        eVar.f5440a = true;
        com.fyber.inneractive.sdk.util.r.b.post(new com.fyber.inneractive.sdk.measurement.d(eVar, context));
    }
}
