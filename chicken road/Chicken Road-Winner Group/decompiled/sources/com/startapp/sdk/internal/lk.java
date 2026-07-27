package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class lk implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f4020a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mk f4021b;

    public lk(mk mkVar, String str) {
        this.f4021b = mkVar;
        this.f4020a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f4021b.f4070b.compareAndSet(false, true)) {
            mk mkVar = this.f4021b;
            mkVar.f4074g.a(mkVar.f4071c);
            this.f4021b.f4072d.a(String.valueOf(this.f4020a));
        }
    }
}
