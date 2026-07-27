package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class kk implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mk f3970a;

    public kk(mk mkVar, long j3) {
        this.f3970a = mkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f3970a.f4070b.compareAndSet(false, true)) {
            mk mkVar = this.f3970a;
            mkVar.f4074g.a(mkVar.f4071c);
            mk mkVar2 = this.f3970a;
            qi qiVar = mkVar2.f4072d;
            mkVar2.f4073e.get();
            qiVar.a();
        }
    }
}
