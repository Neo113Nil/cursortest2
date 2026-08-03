package com.fyber.inneractive.sdk.player.exoplayer2.video;

/* loaded from: classes3.dex */
public final class g implements android.view.Choreographer.FrameCallback, android.os.Handler.Callback {
    public static final com.fyber.inneractive.sdk.player.exoplayer2.video.g e = new com.fyber.inneractive.sdk.player.exoplayer2.video.g();

    /* renamed from: a, reason: collision with root package name */
    public volatile long f4127a;
    public final android.os.Handler b;
    public android.view.Choreographer c;
    public int d;

    public g() {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("ChoreographerOwner:Handler");
        handlerThread.start();
        android.os.Handler handler = new android.os.Handler(handlerThread.getLooper(), this);
        this.b = handler;
        handler.sendEmptyMessage(0);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f4127a = j;
        this.c.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        int i = message.what;
        if (i == 0) {
            this.c = android.view.Choreographer.getInstance();
            return true;
        }
        if (i == 1) {
            int i2 = this.d + 1;
            this.d = i2;
            if (i2 == 1) {
                this.c.postFrameCallback(this);
            }
            return true;
        }
        if (i != 2) {
            return false;
        }
        int i3 = this.d - 1;
        this.d = i3;
        if (i3 == 0) {
            this.c.removeFrameCallback(this);
            this.f4127a = 0L;
        }
        return true;
    }
}
