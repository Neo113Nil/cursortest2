package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class qj implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.ads.video.c f4278a;

    public qj(com.startapp.sdk.ads.video.c cVar) {
        this.f4278a = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.startapp.sdk.ads.video.c cVar = this.f4278a;
        si.a(cVar.f4595t, true, "videoApi.setCloseable", Boolean.TRUE);
    }
}
