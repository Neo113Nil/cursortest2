package com.fyber.inneractive.sdk.player.mediaplayer;

import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes4.dex */
public final class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f5807a;

    public l(p pVar) {
        this.f5807a = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p pVar = this.f5807a;
        String b = pVar.b();
        long currentTimeMillis = System.currentTimeMillis();
        pVar.setVolume(0.0f, 0.0f);
        IAlog.e(b + "timelog: mute took " + (System.currentTimeMillis() - currentTimeMillis) + " msec", new Object[0]);
    }
}
