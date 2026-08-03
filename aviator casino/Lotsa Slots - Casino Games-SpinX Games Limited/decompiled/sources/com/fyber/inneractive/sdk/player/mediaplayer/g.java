package com.fyber.inneractive.sdk.player.mediaplayer;

/* loaded from: classes3.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.player.mediaplayer.p f4148a;

    public g(com.fyber.inneractive.sdk.player.mediaplayer.p pVar) {
        this.f4148a = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.player.mediaplayer.p.b(this.f4148a);
        android.os.Handler handler = this.f4148a.o;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f4148a.o = null;
        }
        this.f4148a.n = null;
        android.os.Looper.myLooper().quit();
    }
}
