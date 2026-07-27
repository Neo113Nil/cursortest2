package com.startapp.sdk.internal;

import com.startapp.sdk.ads.video.player.VideoPlayerInterface$VideoPlayerErrorType;

/* loaded from: classes.dex */
public final class oj implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pj f4173a;

    public oj(pj pjVar) {
        this.f4173a = pjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            com.startapp.sdk.ads.video.c cVar = this.f4173a.f4229a;
            int i3 = com.startapp.sdk.ads.video.c.f3046s0;
            cVar.I();
            com.startapp.sdk.ads.video.c cVar2 = this.f4173a.f4229a;
            cVar2.a(new ak(VideoPlayerInterface$VideoPlayerErrorType.BUFFERING_TIMEOUT, "Buffering timeout reached", cVar2.u()));
        } catch (Throwable th) {
            d9.a(th);
        }
    }
}
