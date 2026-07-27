package com.startapp.sdk.internal;

import android.widget.VideoView;

/* loaded from: classes.dex */
public final class sj implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.ads.video.c f4348a;

    public sj(com.startapp.sdk.ads.video.c cVar) {
        this.f4348a = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoView videoView;
        com.startapp.sdk.ads.video.c cVar = this.f4348a;
        if (cVar.L == null || (videoView = cVar.f3048M) == null) {
            return;
        }
        cVar.f4585A++;
        videoView.setVisibility(0);
        com.startapp.sdk.ads.video.c cVar2 = this.f4348a;
        cVar2.f0 = false;
        si.a(cVar2.f4595t, true, "videoApi.setVideoCurrentPosition", 0);
        si.a(cVar2.f4595t, true, "videoApi.setSkipTimer", 0);
        this.f4348a.G();
    }
}
