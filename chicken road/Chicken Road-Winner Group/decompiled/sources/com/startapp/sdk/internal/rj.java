package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class rj implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.ads.video.c f4306a;

    public rj(com.startapp.sdk.ads.video.c cVar) {
        this.f4306a = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.startapp.sdk.ads.video.c cVar = this.f4306a;
        if (cVar.L == null) {
            return;
        }
        cVar.f3053R = !cVar.f3053R;
        cVar.F();
        com.startapp.sdk.ads.video.c cVar2 = this.f4306a;
        cVar2.a(cVar2.f3053R);
    }
}
