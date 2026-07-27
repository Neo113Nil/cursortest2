package com.startapp.sdk.internal;

import android.app.Activity;

/* loaded from: classes.dex */
public final class lf implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f4011a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pf f4012b;

    public lf(pf pfVar, Activity activity) {
        this.f4012b = pfVar;
        this.f4011a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f4012b.b(this.f4011a);
        } catch (Throwable th) {
            d9.a(th);
        }
    }
}
