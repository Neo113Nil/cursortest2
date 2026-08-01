package com.fyber.inneractive.sdk.player.mediaplayer;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes4.dex */
public final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f5802a;

    public g(p pVar) {
        this.f5802a = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p.b(this.f5802a);
        Handler handler = this.f5802a.o;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f5802a.o = null;
        }
        this.f5802a.n = null;
        Looper.myLooper().quit();
    }
}
